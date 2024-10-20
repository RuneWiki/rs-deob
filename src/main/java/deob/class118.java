package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("en")
public class class118 extends class117 {

    @ObfuscatedName("en.ap")
    public final boolean field1477;

    public class118(boolean arg0, int arg1) {
        super(arg1);
        this.field1477 = arg0;
    }

    @ObfuscatedName("en.aq(Lez;I)V")
    public void method2793(class119 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1484.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2816(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2815(arg0);
            } else {
                arg0.field1483 = class119.field1486;
                return;
            }
            this.method2794(var2, arg0);
        } catch (IOException var12) {
            arg0.field1483 = class119.field1486;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("en.aa(Lez;B)Ljava/net/URLConnection;")
    public URLConnection method2816(class119 arg0) throws IOException {
        URLConnection var2 = arg0.field1484.openConnection();
        this.method2792(var2);
        return var2;
    }

    @ObfuscatedName("en.as(Lez;B)Ljava/net/URLConnection;")
    public URLConnection method2815(class119 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1484.openConnection();
        if (!this.field1477) {
            var2.setSSLSocketFactory(class16.method193());
        }
        this.method2792(var2);
        return var2;
    }
}
