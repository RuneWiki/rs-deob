package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("l")
public class class11 {

    @ObfuscatedName("l.a")
    public HttpsURLConnection field54;

    @ObfuscatedName("l.f")
    public final Map field60;

    @ObfuscatedName("l.c")
    public class419 field53;

    @ObfuscatedName("l.x")
    public Map field52;

    @ObfuscatedName("l.h")
    public final class10 field55;

    @ObfuscatedName("l.j")
    public boolean field56 = false;

    @ObfuscatedName("l.y")
    public boolean field51 = false;

    @ObfuscatedName("l.d")
    public int field58 = 300000;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        if (!arg1.method68()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method65());
        }
        this.field54 = (HttpsURLConnection) arg0.openConnection();
        if (!arg2) {
            HttpsURLConnection var4 = this.field54;
            if (Statics.field82 == null) {
                Statics.field82 = new class16();
            }
            class16 var5 = Statics.field82;
            var4.setSSLSocketFactory(var5);
        }
        this.field55 = arg1;
        this.field60 = new HashMap();
        this.field52 = new HashMap();
    }

    @ObfuscatedName("l.a(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method74(String arg0, String arg1) {
        if (!this.field56) {
            this.field60.put(arg0, arg1);
        }
    }

    @ObfuscatedName("l.f(I)Ljava/lang/String;")
    public String method75() {
        ArrayList var1 = new ArrayList(this.field52.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class418) var4.getKey()).method7133());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("l.c(I)V")
    public void method73() throws ProtocolException {
        if (this.field56) {
            return;
        }
        this.field54.setRequestMethod(this.field55.method65());
        if (!this.field52.isEmpty()) {
            this.field60.put("Accept", this.method75());
        }
        Iterator var1 = this.field60.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field54.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field55.method59() && this.field53 != null) {
            this.field54.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field53.method7138());
                var3.writeTo(this.field54.getOutputStream());
            } catch (IOException var15) {
                var15.printStackTrace();
            } finally {
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException var14) {
                        var14.printStackTrace();
                    }
                }
            }
        }
        this.field54.setConnectTimeout(this.field58);
        this.field54.setInstanceFollowRedirects(this.field51);
        this.field56 = true;
    }

    @ObfuscatedName("l.x(I)Z")
    public boolean method79() throws IOException, SocketTimeoutException {
        if (!this.field56) {
            this.method73();
        }
        this.field54.connect();
        return this.field54.getResponseCode() == -1;
    }

    @ObfuscatedName("l.h(I)Li;")
    public class22 method78() {
        try {
            if (!this.field56 || this.field54.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field54.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field54);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field54.disconnect();
        }
        return var5;
    }
}
