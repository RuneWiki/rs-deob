package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("du")
public class class109 extends class108 {

    @ObfuscatedName("du.h")
    public final boolean field1395;

    public class109(boolean arg0, int arg1) {
        super(arg1);
        this.field1395 = arg0;
    }

    @ObfuscatedName("du.a(Lde;I)V")
    public void method2581(class110 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1400.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2588(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2585(arg0);
                } else {
                    arg0.field1397 = true;
                    return;
                }
                this.method2567(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1397 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("du.w(Lde;I)Ljava/net/URLConnection;")
    public URLConnection method2588(class110 arg0) throws IOException {
        URLConnection var2 = arg0.field1400.openConnection();
        this.method2566(var2);
        return var2;
    }

    @ObfuscatedName("du.m(Lde;I)Ljava/net/URLConnection;")
    public URLConnection method2585(class110 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1400.openConnection();
        if (!this.field1395) {
            if (Statics.field82 == null) {
                Statics.field82 = new class16();
            }
            class16 var4 = Statics.field82;
            var2.setSSLSocketFactory(var4);
        }
        this.method2566(var2);
        return var2;
    }
}
