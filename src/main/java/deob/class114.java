package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ez")
public class class114 extends class113 {

    @ObfuscatedName("ez.ac")
    public final boolean field1452;

    public class114(boolean arg0, int arg1) {
        super(arg1);
        this.field1452 = arg0;
    }

    @ObfuscatedName("ez.au(Let;B)V")
    public void method2687(class115 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1454.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2712(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2713(arg0);
            } else {
                arg0.field1457 = class115.field1456;
                return;
            }
            this.method2690(var2, arg0);
        } catch (IOException var12) {
            arg0.field1457 = class115.field1456;
        } finally {
            if (var2 != null && var2 instanceof HttpURLConnection) {
                HttpURLConnection var9 = (HttpURLConnection) var2;
                var9.disconnect();
            }
        }
    }

    @ObfuscatedName("ez.ah(Let;B)Ljava/net/URLConnection;")
    public URLConnection method2712(class115 arg0) throws IOException {
        URLConnection var2 = arg0.field1454.openConnection();
        this.method2701(var2);
        return var2;
    }

    @ObfuscatedName("ez.as(Let;B)Ljava/net/URLConnection;")
    public URLConnection method2713(class115 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1454.openConnection();
        if (!this.field1452) {
            var2.setSSLSocketFactory(class16.method173());
        }
        this.method2701(var2);
        return var2;
    }
}
