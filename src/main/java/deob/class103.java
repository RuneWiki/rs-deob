package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("cc")
public class class103 extends class102 {

    @ObfuscatedName("cc.k")
    public final boolean field1359;

    public class103(boolean arg0, int arg1) {
        super(arg1);
        this.field1359 = arg0;
    }

    @ObfuscatedName("cc.c(Lcm;B)V")
    public void method2568(class104 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1367.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2580(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2577(arg0);
            } else {
                arg0.field1362 = true;
                return;
            }
            this.method2557(var2, arg0);
        } catch (IOException var8) {
        } finally {
            arg0.field1362 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("cc.b(Lcm;S)Ljava/net/URLConnection;")
    public URLConnection method2580(class104 arg0) throws IOException {
        URLConnection var2 = arg0.field1367.openConnection();
        this.method2556(var2);
        return var2;
    }

    @ObfuscatedName("cc.a(Lcm;I)Ljava/net/URLConnection;")
    public URLConnection method2577(class104 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1367.openConnection();
        if (!this.field1359) {
            if (Statics.field87 == null) {
                Statics.field87 = new class16();
            }
            class16 var4 = Statics.field87;
            var2.setSSLSocketFactory(var4);
        }
        this.method2556(var2);
        return var2;
    }
}
