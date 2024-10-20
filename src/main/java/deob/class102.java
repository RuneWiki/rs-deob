package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("cj")
public class class102 extends class101 {

    @ObfuscatedName("cj.o(Lcb;I)V")
    public void method2392(class103 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1367.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2407(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2409(arg0);
                } else {
                    arg0.field1368 = true;
                    return;
                }
                this.method2383(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1368 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("cj.n(Lcb;B)Ljava/net/URLConnection;")
    public URLConnection method2407(class103 arg0) throws IOException {
        URLConnection var2 = arg0.field1367.openConnection();
        this.method2382(var2);
        return var2;
    }

    @ObfuscatedName("cj.e(Lcb;I)Ljava/net/URLConnection;")
    public URLConnection method2409(class103 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1367.openConnection();
        var2.setSSLSocketFactory(new class16());
        this.method2382(var2);
        return var2;
    }
}
