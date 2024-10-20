package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ep")
public class class117 extends class116 {

    @ObfuscatedName("ep.af")
    public final boolean field1484;

    public class117(boolean arg0, int arg1) {
        super(arg1);
        this.field1484 = arg0;
    }

    @ObfuscatedName("ep.ak(Lea;B)V")
    public void method2785(class118 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1493.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2790(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2791(arg0);
                } else {
                    arg0.field1490 = class118.field1487;
                    return;
                }
                this.method2775(var2, arg0);
            } catch (IOException var12) {
                arg0.field1490 = class118.field1487;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("ep.as(Lea;I)Ljava/net/URLConnection;")
    public URLConnection method2790(class118 arg0) throws IOException {
        URLConnection var2 = arg0.field1493.openConnection();
        this.method2788(var2);
        return var2;
    }

    @ObfuscatedName("ep.aw(Lea;B)Ljava/net/URLConnection;")
    public URLConnection method2791(class118 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1493.openConnection();
        if (!this.field1484) {
            var2.setSSLSocketFactory(class16.method178());
        }
        this.method2788(var2);
        return var2;
    }
}
