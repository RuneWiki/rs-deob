package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ef")
public class class115 extends class114 {

    @ObfuscatedName("ef.an")
    public final boolean field1462;

    public class115(boolean arg0, int arg1) {
        super(arg1);
        this.field1462 = arg0;
    }

    @ObfuscatedName("ef.az(Lel;I)V")
    public void method2695(class116 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1470.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2705(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2710(arg0);
                } else {
                    arg0.field1466 = class116.field1465;
                    return;
                }
                this.method2676(var2, arg0);
            } catch (IOException var12) {
                arg0.field1466 = class116.field1465;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("ef.bz(Lel;I)Ljava/net/URLConnection;")
    public URLConnection method2705(class116 arg0) throws IOException {
        URLConnection var2 = arg0.field1470.openConnection();
        this.method2675(var2);
        return var2;
    }

    @ObfuscatedName("ef.bc(Lel;I)Ljava/net/URLConnection;")
    public URLConnection method2710(class116 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1470.openConnection();
        if (!this.field1462) {
            if (Statics.field69 == null) {
                Statics.field69 = new class16();
            }
            class16 var4 = Statics.field69;
            var2.setSSLSocketFactory(var4);
        }
        this.method2675(var2);
        return var2;
    }
}
