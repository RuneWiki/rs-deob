package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("en")
public class class113 extends class112 {

    @ObfuscatedName("en.ax")
    public final boolean field1403;

    public class113(boolean arg0, int arg1) {
        super(arg1);
        this.field1403 = arg0;
    }

    @ObfuscatedName("en.at(Let;I)V")
    public void method2659(class114 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1408.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2683(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2682(arg0);
                } else {
                    arg0.field1404 = class114.field1406;
                    return;
                }
                this.method2662(var2, arg0);
            } catch (IOException var12) {
                arg0.field1404 = class114.field1406;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("en.au(Let;B)Ljava/net/URLConnection;")
    public URLConnection method2683(class114 arg0) throws IOException {
        URLConnection var2 = arg0.field1408.openConnection();
        this.method2661(var2);
        return var2;
    }

    @ObfuscatedName("en.ai(Let;I)Ljava/net/URLConnection;")
    public URLConnection method2682(class114 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1408.openConnection();
        if (!this.field1403) {
            var2.setSSLSocketFactory(class16.method199());
        }
        this.method2661(var2);
        return var2;
    }
}
