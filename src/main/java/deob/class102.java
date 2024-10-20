package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("cd")
public class class102 extends class101 {

    @ObfuscatedName("cd.v(Lcw;I)V")
    public void method2399(class103 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1340.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2421(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2423(arg0);
                } else {
                    arg0.field1341 = true;
                    return;
                }
                this.method2401(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1341 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("cd.y(Lcw;I)Ljava/net/URLConnection;")
    public URLConnection method2421(class103 arg0) throws IOException {
        URLConnection var2 = arg0.field1340.openConnection();
        this.method2400(var2);
        return var2;
    }

    @ObfuscatedName("cd.j(Lcw;B)Ljava/net/URLConnection;")
    public URLConnection method2423(class103 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1340.openConnection();
        var2.setSSLSocketFactory(new class16());
        this.method2400(var2);
        return var2;
    }
}
