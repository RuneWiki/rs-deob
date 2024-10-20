package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("em")
public class class114 extends class113 {

    @ObfuscatedName("em.aq")
    public final boolean field1432;

    public class114(boolean arg0, int arg1) {
        super(arg1);
        this.field1432 = arg0;
    }

    @ObfuscatedName("em.am(Lee;I)V")
    public void method2756(class115 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1441.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2792(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2785(arg0);
                } else {
                    arg0.field1437 = class115.field1436;
                    return;
                }
                this.method2759(var2, arg0);
            } catch (IOException var12) {
                arg0.field1437 = class115.field1436;
            }
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("em.ai(Lee;I)Ljava/net/URLConnection;")
    public URLConnection method2792(class115 arg0) throws IOException {
        URLConnection var2 = arg0.field1441.openConnection();
        this.method2758(var2);
        return var2;
    }

    @ObfuscatedName("em.ac(Lee;I)Ljava/net/URLConnection;")
    public URLConnection method2785(class115 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1441.openConnection();
        if (!this.field1432) {
            var2.setSSLSocketFactory(class16.method203());
        }
        this.method2758(var2);
        return var2;
    }
}
