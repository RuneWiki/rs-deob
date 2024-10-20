package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("el")
public class class118 extends class117 {

    @ObfuscatedName("el.ax")
    public final boolean field1470;

    public class118(boolean arg0, int arg1) {
        super(arg1);
        this.field1470 = arg0;
    }

    @ObfuscatedName("el.ab(Lee;I)V")
    public void method2853(class119 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1474.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2876(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2875(arg0);
                } else {
                    arg0.field1471 = class119.field1473;
                    return;
                }
                this.method2851(var2, arg0);
            } catch (IOException var12) {
                arg0.field1471 = class119.field1473;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("el.ar(Lee;I)Ljava/net/URLConnection;")
    public URLConnection method2876(class119 arg0) throws IOException {
        URLConnection var2 = arg0.field1474.openConnection();
        this.method2854(var2);
        return var2;
    }

    @ObfuscatedName("el.ap(Lee;I)Ljava/net/URLConnection;")
    public URLConnection method2875(class119 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1474.openConnection();
        if (!this.field1470) {
            if (Statics.field60 == null) {
                Statics.field60 = new class16();
            }
            class16 var4 = Statics.field60;
            var2.setSSLSocketFactory(var4);
        }
        this.method2854(var2);
        return var2;
    }
}
