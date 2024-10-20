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

@ObfuscatedName("j")
public class class11 {

    @ObfuscatedName("j.h")
    public HttpsURLConnection field54;

    @ObfuscatedName("j.e")
    public final Map field50;

    @ObfuscatedName("j.v")
    public class422 field51;

    @ObfuscatedName("j.x")
    public Map field58;

    @ObfuscatedName("j.m")
    public final class10 field49;

    @ObfuscatedName("j.q")
    public boolean field52 = false;

    @ObfuscatedName("j.f")
    public boolean field55 = false;

    @ObfuscatedName("j.r")
    public int field56 = 300000;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        if (!arg1.method63()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method64());
        }
        this.field54 = (HttpsURLConnection) arg0.openConnection();
        if (!arg2) {
            HttpsURLConnection var4 = this.field54;
            if (Statics.field91 == null) {
                Statics.field91 = new class16();
            }
            class16 var5 = Statics.field91;
            var4.setSSLSocketFactory(var5);
        }
        this.field49 = arg1;
        this.field50 = new HashMap();
        this.field58 = new HashMap();
    }

    @ObfuscatedName("j.h(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method77(String arg0, String arg1) {
        if (!this.field52) {
            this.field50.put(arg0, arg1);
        }
    }

    @ObfuscatedName("j.e(I)Ljava/lang/String;")
    public String method75() {
        ArrayList var1 = new ArrayList(this.field58.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class421) var4.getKey()).method7196());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("j.v(I)V")
    public void method78() throws ProtocolException {
        if (this.field52) {
            return;
        }
        this.field54.setRequestMethod(this.field49.method64());
        if (!this.field58.isEmpty()) {
            this.field50.put("Accept", this.method75());
        }
        Iterator var1 = this.field50.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field54.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field49.method65() && this.field51 != null) {
            this.field54.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field51.method7203());
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
        this.field54.setConnectTimeout(this.field56);
        this.field54.setInstanceFollowRedirects(this.field55);
        this.field52 = true;
    }

    @ObfuscatedName("j.x(I)Z")
    public boolean method79() throws IOException, SocketTimeoutException {
        if (!this.field52) {
            this.method78();
        }
        this.field54.connect();
        return this.field54.getResponseCode() == -1;
    }

    @ObfuscatedName("j.m(B)Lp;")
    public class22 method80() {
        try {
            if (!this.field52 || this.field54.getResponseCode() == -1) {
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
