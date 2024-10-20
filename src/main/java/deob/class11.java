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

@ObfuscatedName("s")
public class class11 {

    @ObfuscatedName("s.c")
    public HttpsURLConnection field56;

    @ObfuscatedName("s.v")
    public final Map field44;

    @ObfuscatedName("s.q")
    public class399 field46;

    @ObfuscatedName("s.f")
    public Map field45;

    @ObfuscatedName("s.j")
    public final class10 field47;

    @ObfuscatedName("s.e")
    public boolean field42 = false;

    @ObfuscatedName("s.g")
    public boolean field48 = false;

    @ObfuscatedName("s.w")
    public int field49 = 300000;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        if (!arg1.method59()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method61());
        }
        this.field56 = (HttpsURLConnection) arg0.openConnection();
        if (!arg2) {
            HttpsURLConnection var4 = this.field56;
            if (Statics.field86 == null) {
                Statics.field86 = new class16();
            }
            class16 var5 = Statics.field86;
            var4.setSSLSocketFactory(var5);
        }
        this.field47 = arg1;
        this.field44 = new HashMap();
        this.field45 = new HashMap();
    }

    @ObfuscatedName("s.c(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method74(String arg0, String arg1) {
        if (!this.field42) {
            this.field44.put(arg0, arg1);
        }
    }

    @ObfuscatedName("s.v(B)Ljava/lang/String;")
    public String method71() {
        ArrayList var1 = new ArrayList(this.field45.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class398) var4.getKey()).method6452());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("s.q(I)V")
    public void method72() throws ProtocolException {
        if (this.field42) {
            return;
        }
        this.field56.setRequestMethod(this.field47.method61());
        if (!this.field45.isEmpty()) {
            this.field44.put("Accept", this.method71());
        }
        Iterator var1 = this.field44.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field56.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field47.method60() && this.field46 != null) {
            this.field56.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field46.method6461());
                var3.writeTo(this.field56.getOutputStream());
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
        this.field56.setConnectTimeout(this.field49);
        this.field56.setInstanceFollowRedirects(this.field48);
        this.field42 = true;
    }

    @ObfuscatedName("s.f(I)Z")
    public boolean method73() throws IOException, SocketTimeoutException {
        if (!this.field42) {
            this.method72();
        }
        this.field56.connect();
        return this.field56.getResponseCode() == -1;
    }

    @ObfuscatedName("s.j(I)Lb;")
    public class22 method85() {
        try {
            if (!this.field42 || this.field56.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field56.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field56);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field56.disconnect();
        }
        return var5;
    }
}
