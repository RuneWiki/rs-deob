package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("dw")
public class class110 extends class109 {

    @ObfuscatedName("dw.m")
    public final boolean field1448;

    public class110(boolean arg0, int arg1) {
        super(arg1);
        this.field1448 = arg0;
    }

    @ObfuscatedName("dw.h(Ldm;I)V")
    public void method2605(class111 arg0) throws IOException {
        URLConnection var2 = null;
        try {
            try {
                String var3 = arg0.field1454.getProtocol();
                if (var3.equals("http")) {
                    var2 = this.method2634(arg0);
                } else if (var3.equals("https")) {
                    var2 = this.method2633(arg0);
                } else {
                    arg0.field1455 = true;
                    return;
                }
                this.method2613(var2, arg0);
            } catch (IOException var8) {
            }
        } finally {
            arg0.field1455 = true;
            if (var2 != null) {
                if (var2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) var2).disconnect();
                } else if (var2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) var2).disconnect();
                }
            }
        }
    }

    @ObfuscatedName("dw.c(Ldm;B)Ljava/net/URLConnection;")
    public URLConnection method2634(class111 arg0) throws IOException {
        URLConnection var2 = arg0.field1454.openConnection();
        this.method2606(var2);
        return var2;
    }

    @ObfuscatedName("dw.p(Ldm;B)Ljava/net/URLConnection;")
    public URLConnection method2633(class111 arg0) throws IOException {
        HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1454.openConnection();
        if (!this.field1448) {
            if (Statics.field91 == null) {
                Statics.field91 = new class16();
            }
            class16 var4 = Statics.field91;
            var2.setSSLSocketFactory(var4);
        }
        this.method2606(var2);
        return var2;
    }
}
