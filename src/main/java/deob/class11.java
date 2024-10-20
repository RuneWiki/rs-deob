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

    @ObfuscatedName("j.c")
    public HttpsURLConnection field49;

    @ObfuscatedName("j.p")
    public final Map field44;

    @ObfuscatedName("j.f")
    public class401 field45;

    @ObfuscatedName("j.n")
    public Map field51;

    @ObfuscatedName("j.k")
    public final class10 field47;

    @ObfuscatedName("j.w")
    public boolean field48 = false;

    @ObfuscatedName("j.s")
    public boolean field53 = false;

    @ObfuscatedName("j.q")
    public int field50 = 300000;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        if (!arg1.method81()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method72());
        }
        this.field49 = (HttpsURLConnection) arg0.openConnection();
        if (!arg2) {
            HttpsURLConnection var4 = this.field49;
            if (Statics.field87 == null) {
                Statics.field87 = new class16();
            }
            class16 var5 = Statics.field87;
            var4.setSSLSocketFactory(var5);
        }
        this.field47 = arg1;
        this.field44 = new HashMap();
        this.field51 = new HashMap();
    }

    @ObfuscatedName("j.c(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method86(String arg0, String arg1) {
        if (!this.field48) {
            this.field44.put(arg0, arg1);
        }
    }

    @ObfuscatedName("j.p(B)Ljava/lang/String;")
    public String method90() {
        ArrayList var1 = new ArrayList(this.field51.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class400) var4.getKey()).method6621());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("j.f(I)V")
    public void method85() throws ProtocolException {
        if (this.field48) {
            return;
        }
        this.field49.setRequestMethod(this.field47.method72());
        if (!this.field51.isEmpty()) {
            this.field44.put("Accept", this.method90());
        }
        Iterator var1 = this.field44.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field49.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field47.method73() && this.field45 != null) {
            this.field49.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field45.method6625());
                var3.writeTo(this.field49.getOutputStream());
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
        this.field49.setConnectTimeout(this.field50);
        this.field49.setInstanceFollowRedirects(this.field53);
        this.field48 = true;
    }

    @ObfuscatedName("j.n(B)Z")
    public boolean method89() throws IOException, SocketTimeoutException {
        if (!this.field48) {
            this.method85();
        }
        this.field49.connect();
        return this.field49.getResponseCode() == -1;
    }

    @ObfuscatedName("j.k(I)Ly;")
    public class22 method91() {
        try {
            if (!this.field48 || this.field49.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field49.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field49);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field49.disconnect();
        }
        return var5;
    }
}
