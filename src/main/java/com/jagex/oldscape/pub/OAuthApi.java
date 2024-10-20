package com.jagex.oldscape.pub;

public interface OAuthApi {

    boolean isOnLoginScreen();

    long getAccountHash();

    void setClient(int arg0);

    void setOtlTokenRequester(OtlTokenRequester arg0);

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);
}
