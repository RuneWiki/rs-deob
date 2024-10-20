package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("es")
public class class114 extends class113 {

    @ObfuscatedName("es.ab")
    public final boolean field1424;

    public class114(boolean arg0, int arg1) {
        super(arg1);
        this.field1424 = arg0;
    }

    @ObfuscatedName("es.at(Lea;I)V")
    public void method2751(class115 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1430.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2762(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2765(arg0);
                } else {
                    arg0.field1428 = class115.field1433;
                    return;
                }
                this.method2742(var2, arg0);
            } catch (IOException var12) {
                arg0.field1428 = class115.field1433;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("es.aq(Lea;I)Ljava/net/URLConnection;")
    public URLConnection method2762(class115 arg0) throws IOException {
        URLConnection var2 = arg0.field1430.openConnection();
        this.method2757(var2);
        return var2;
    }

    @ObfuscatedName("es.ai(Lea;I)Ljava/net/URLConnection;")
    public URLConnection method2765(class115 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1430.openConnection();
        if (!this.field1424) {
            if (Statics.field70 == null) {
                Statics.field70 = new class16();
            }
            class16 var4 = Statics.field70;
            var2.setSSLSocketFactory(var4);
        }
        this.method2757(var2);
        return var2;
    }
}
