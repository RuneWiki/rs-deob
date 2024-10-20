package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("eg")
public class class115 extends class114 {

    @ObfuscatedName("eg.ar")
    public final boolean field1445;

    public class115(boolean arg0, int arg1) {
        super(arg1);
        this.field1445 = arg0;
    }

    @ObfuscatedName("eg.aq(Leb;I)V")
    public void method2757(class116 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1448.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2775(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2774(arg0);
                } else {
                    arg0.field1449 = class116.field1446;
                    return;
                }
                this.method2759(var2, arg0);
            } catch (IOException var12) {
                arg0.field1449 = class116.field1446;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("eg.am(Leb;I)Ljava/net/URLConnection;")
    public URLConnection method2775(class116 arg0) throws IOException {
        URLConnection var2 = arg0.field1448.openConnection();
        this.method2770(var2);
        return var2;
    }

    @ObfuscatedName("eg.ad(Leb;B)Ljava/net/URLConnection;")
    public URLConnection method2774(class116 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1448.openConnection();
        if (!this.field1445) {
            var2.setSSLSocketFactory(class16.method162());
        }
        this.method2770(var2);
        return var2;
    }
}
