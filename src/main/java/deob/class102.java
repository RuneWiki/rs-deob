package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ca")
public class class102 extends class101 {

    @ObfuscatedName("ca.c")
    public final boolean field1351;

    public class102(boolean arg0, int arg1) {
        super(arg1);
        this.field1351 = arg0;
    }

    @ObfuscatedName("ca.s(Lcv;B)V")
    public void method2350(class103 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1354.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2372(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2375(arg0);
                } else {
                    arg0.field1357 = true;
                    return;
                }
                this.method2353(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1357 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("ca.p(Lcv;I)Ljava/net/URLConnection;")
    public URLConnection method2372(class103 arg0) throws IOException {
        URLConnection var2 = arg0.field1354.openConnection();
        this.method2352(var2);
        return var2;
    }

    @ObfuscatedName("ca.e(Lcv;I)Ljava/net/URLConnection;")
    public URLConnection method2375(class103 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1354.openConnection();
        if (!this.field1351) {
            var2.setSSLSocketFactory(class16.method180());
        }
        this.method2352(var2);
        return var2;
    }
}
