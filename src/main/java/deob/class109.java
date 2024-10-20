package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ef")
public class class109 extends class108 {

    @ObfuscatedName("ef.au")
    public final boolean field1402;

    public class109(boolean arg0, int arg1) {
        super(arg1);
        this.field1402 = arg0;
    }

    @ObfuscatedName("ef.af(Lez;B)V")
    public void method2671(class110 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1409.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2697(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2698(arg0);
            } else {
                arg0.field1406 = class110.field1407;
                return;
            }
            this.method2691(var2, arg0);
        } catch (IOException var12) {
            arg0.field1406 = class110.field1407;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("ef.ad(Lez;B)Ljava/net/URLConnection;")
    public URLConnection method2697(class110 arg0) throws IOException {
        URLConnection var2 = arg0.field1409.openConnection();
        this.method2688(var2);
        return var2;
    }

    @ObfuscatedName("ef.ae(Lez;I)Ljava/net/URLConnection;")
    public URLConnection method2698(class110 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1409.openConnection();
        if (!this.field1402) {
            if (Statics.field84 == null) {
                Statics.field84 = new class16();
            }
            class16 var4 = Statics.field84;
            var2.setSSLSocketFactory(var4);
        }
        this.method2688(var2);
        return var2;
    }
}
