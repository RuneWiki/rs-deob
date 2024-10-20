package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("er")
public class class111 extends class110 {

    @ObfuscatedName("er.an")
    public final boolean field1401;

    public class111(boolean arg0, int arg1) {
        super(arg1);
        this.field1401 = arg0;
    }

    @ObfuscatedName("er.aj(Leo;I)V")
    public void method2674(class112 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1406.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2678(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2677(arg0);
            } else {
                arg0.field1403 = class112.field1405;
                return;
            }
            this.method2671(var2, arg0);
        } catch (IOException var12) {
            arg0.field1403 = class112.field1405;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("er.ag(Leo;I)Ljava/net/URLConnection;")
    public URLConnection method2678(class112 arg0) throws IOException {
        URLConnection var2 = arg0.field1406.openConnection();
        this.method2660(var2);
        return var2;
    }

    @ObfuscatedName("er.at(Leo;I)Ljava/net/URLConnection;")
    public URLConnection method2677(class112 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1406.openConnection();
        if (!this.field1401) {
            if (Statics.field77 == null) {
                Statics.field77 = new class16();
            }
            class16 var4 = Statics.field77;
            var2.setSSLSocketFactory(var4);
        }
        this.method2660(var2);
        return var2;
    }
}
