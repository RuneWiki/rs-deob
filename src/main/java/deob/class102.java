package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("cl")
public class class102 extends class101 {

    @ObfuscatedName("cl.j")
    public final boolean field1365;

    public class102(boolean arg0, int arg1) {
        super(arg1);
        this.field1365 = arg0;
    }

    @ObfuscatedName("cl.c(Lct;I)V")
    public void method2400(class103 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            String var3 = arg0.field1372.getProtocol();
            if (var3.equals("http")) {
                var2 = this.method2423(arg0);
            } else if (var3.equals("https")) {
                var2 = this.method2416(arg0);
            } else {
                arg0.field1369 = true;
                return;
            }
            this.method2401(var2, arg0);
        } catch (IOException var8) {
        } finally {
            arg0.field1369 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("cl.k(Lct;S)Ljava/net/URLConnection;")
    public URLConnection method2423(class103 arg0) throws IOException {
        URLConnection var2 = arg0.field1372.openConnection();
        this.method2399(var2);
        return var2;
    }

    @ObfuscatedName("cl.h(Lct;I)Ljava/net/URLConnection;")
    public URLConnection method2416(class103 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1372.openConnection();
        if (!this.field1365) {
            if (Statics.field86 == null) {
                Statics.field86 = new class16();
            }
            class16 var4 = Statics.field86;
            var2.setSSLSocketFactory(var4);
        }
        this.method2399(var2);
        return var2;
    }
}
