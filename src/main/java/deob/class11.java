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

@ObfuscatedName("y")
public class class11 {

    @ObfuscatedName("y.o")
    public HttpsURLConnection field49;

    @ObfuscatedName("y.q")
    public final Map field48;

    @ObfuscatedName("y.l")
    public class400 field55;

    @ObfuscatedName("y.k")
    public Map field51;

    @ObfuscatedName("y.a")
    public final class10 field52;

    @ObfuscatedName("y.m")
    public boolean field53 = false;

    @ObfuscatedName("y.p")
    public boolean field54 = false;

    @ObfuscatedName("y.s")
    public int field50 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method69()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method63());
        }
        this.field49 = (HttpsURLConnection) arg0.openConnection();
        this.field49.setSSLSocketFactory(new class16());
        this.field52 = arg1;
        this.field48 = new HashMap();
        this.field51 = new HashMap();
    }

    @ObfuscatedName("y.o(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method71(String arg0, String arg1) {
        if (!this.field53) {
            this.field48.put(arg0, arg1);
        }
    }

    @ObfuscatedName("y.q(B)Ljava/lang/String;")
    public String method89() {
        ArrayList var1 = new ArrayList(this.field51.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class399) var4.getKey()).method6360());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("y.l(I)V")
    public void method73() throws ProtocolException {
        if (this.field53) {
            return;
        }
        this.field49.setRequestMethod(this.field52.method63());
        if (!this.field51.isEmpty()) {
            this.field48.put("Accept", this.method89());
        }
        Iterator var1 = this.field48.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field49.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field52.method64() && this.field55 != null) {
            this.field49.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field55.method6363());
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
        this.field49.setInstanceFollowRedirects(this.field54);
        this.field53 = true;
    }

    @ObfuscatedName("y.k(I)Z")
    public boolean method72() throws IOException, SocketTimeoutException {
        if (!this.field53) {
            this.method73();
        }
        this.field49.connect();
        return this.field49.getResponseCode() == -1;
    }

    @ObfuscatedName("y.a(B)Ld;")
    public class22 method75() {
        try {
            if (!this.field53 || this.field49.getResponseCode() == -1) {
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
