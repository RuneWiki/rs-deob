package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("es")
public class class116 extends class115 {

    @ObfuscatedName("es.ao")
    public final boolean field1442;

    public class116(boolean arg0, int arg1) {
        super(arg1);
        this.field1442 = arg0;
    }

    @ObfuscatedName("es.ac(Leq;I)V")
    public void method2697(class117 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1445.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2718(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2717(arg0);
            } else {
                arg0.field1446 = class117.field1447;
                return;
            }
            this.method2709(var2, arg0);
        } catch (IOException var12) {
            arg0.field1446 = class117.field1447;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("es.ae(Leq;I)Ljava/net/URLConnection;")
    public URLConnection method2718(class117 arg0) throws IOException {
        URLConnection var2 = arg0.field1445.openConnection();
        this.method2716(var2);
        return var2;
    }

    @ObfuscatedName("es.aw(Leq;I)Ljava/net/URLConnection;")
    public URLConnection method2717(class117 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1445.openConnection();
        if (!this.field1442) {
            if (Statics.field83 == null) {
                Statics.field83 = new class16();
            }
            class16 var4 = Statics.field83;
            var2.setSSLSocketFactory(var4);
        }
        this.method2716(var2);
        return var2;
    }
}
