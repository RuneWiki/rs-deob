package com.jagex.oldscape.pub;

public interface OAuthApi {

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);

    boolean isOnLoginScreen();

    void setClient(int arg0);

    long getAccountHash();

    void setOtlTokenRequester(OtlTokenRequester arg0);
}
