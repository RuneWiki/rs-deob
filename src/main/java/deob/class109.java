package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("dy")
public class class109 extends class108 {

    @ObfuscatedName("dy.z")
    public final boolean field1415;

    public class109(boolean arg0, int arg1) {
        super(arg1);
        this.field1415 = arg0;
    }

    @ObfuscatedName("dy.f(Ldg;I)V")
    public void method2713(class110 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1420.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2739(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2738(arg0);
                } else {
                    arg0.field1419 = true;
                    return;
                }
                this.method2722(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1419 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("dy.x(Ldg;I)Ljava/net/URLConnection;")
    public URLConnection method2739(class110 arg0) throws IOException {
        URLConnection var2 = arg0.field1420.openConnection();
        this.method2718(var2);
        return var2;
    }

    @ObfuscatedName("dy.a(Ldg;I)Ljava/net/URLConnection;")
    public URLConnection method2738(class110 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1420.openConnection();
        if (!this.field1415) {
            var2.setSSLSocketFactory(class16.method183());
        }
        this.method2718(var2);
        return var2;
    }
}
