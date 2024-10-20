package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("eh")
public class class114 extends class113 {

    @ObfuscatedName("eh.as")
    public final boolean field1434;

    public class114(boolean arg0, int arg1) {
        super(arg1);
        this.field1434 = arg0;
    }

    @ObfuscatedName("eh.aw(Lei;I)V")
    public void method2676(class115 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1437.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2698(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2699(arg0);
            } else {
                arg0.field1438 = class115.field1442;
                return;
            }
            this.method2679(var2, arg0);
        } catch (IOException var12) {
            arg0.field1438 = class115.field1442;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("eh.ab(Lei;I)Ljava/net/URLConnection;")
    public URLConnection method2698(class115 arg0) throws IOException {
        URLConnection var2 = arg0.field1437.openConnection();
        this.method2678(var2);
        return var2;
    }

    @ObfuscatedName("eh.ad(Lei;I)Ljava/net/URLConnection;")
    public URLConnection method2699(class115 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1437.openConnection();
        if (!this.field1434) {
            if (Statics.field84 == null) {
                Statics.field84 = new class16();
            }
            class16 var4 = Statics.field84;
            var2.setSSLSocketFactory(var4);
        }
        this.method2678(var2);
        return var2;
    }
}
