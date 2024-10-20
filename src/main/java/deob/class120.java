package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("eb")
public class class120 extends class119 {

    @ObfuscatedName("eb.ax")
    public final boolean field1501;

    public class120(boolean arg0, int arg1) {
        super(arg1);
        this.field1501 = arg0;
    }

    @ObfuscatedName("eb.ac(Lek;I)V")
    public void method2983(class121 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1503.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2992(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2993(arg0);
                } else {
                    arg0.field1505 = class121.field1504;
                    return;
                }
                this.method2970(var2, arg0);
            } catch (IOException var12) {
                arg0.field1505 = class121.field1504;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("eb.aw(Lek;I)Ljava/net/URLConnection;")
    public URLConnection method2992(class121 arg0) throws IOException {
        URLConnection var2 = arg0.field1503.openConnection();
        this.method2969(var2);
        return var2;
    }

    @ObfuscatedName("eb.an(Lek;I)Ljava/net/URLConnection;")
    public URLConnection method2993(class121 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1503.openConnection();
        if (!this.field1501) {
            if (Statics.field59 == null) {
                Statics.field59 = new class16();
            }
            class16 var4 = Statics.field59;
            var2.setSSLSocketFactory(var4);
        }
        this.method2969(var2);
        return var2;
    }
}
