package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ej")
public class class120 extends class119 {

    @ObfuscatedName("ej.ai")
    public final boolean field1494;

    public class120(boolean arg0, int arg1) {
        super(arg1);
        this.field1494 = arg0;
    }

    @ObfuscatedName("ej.ap(Lei;I)V")
    public void method3075(class121 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1501.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method3101(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method3105(arg0);
            } else {
                arg0.field1497 = class121.field1498;
                return;
            }
            this.method3077(var2, arg0);
        } catch (IOException var12) {
            arg0.field1497 = class121.field1498;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("ej.ax(Lei;I)Ljava/net/URLConnection;")
    public URLConnection method3101(class121 arg0) throws IOException {
        URLConnection var2 = arg0.field1501.openConnection();
        this.method3076(var2);
        return var2;
    }

    @ObfuscatedName("ej.aq(Lei;I)Ljava/net/URLConnection;")
    public URLConnection method3105(class121 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1501.openConnection();
        if (!this.field1494) {
            if (Statics.field59 == null) {
                Statics.field59 = new class16();
            }
            class16 var4 = Statics.field59;
            var2.setSSLSocketFactory(var4);
        }
        this.method3076(var2);
        return var2;
    }
}
