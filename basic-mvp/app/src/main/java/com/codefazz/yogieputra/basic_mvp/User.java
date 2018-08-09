package com.codefazz.yogieputra.basic_mvp;

/**
 * Created by nakama on 09/08/18.
 */

public class User {
    private String fullName = "";
    private String email = "";


    public User(){
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Email: " + email + "\n FullName: " + fullName;
    }

}
