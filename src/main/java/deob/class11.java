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

    @ObfuscatedName("y.c")
    public HttpsURLConnection field69;

    @ObfuscatedName("y.l")
    public final Map field62;

    @ObfuscatedName("y.s")
    public class383 field67;

    @ObfuscatedName("y.e")
    public Map field64;

    @ObfuscatedName("y.r")
    public final class10 field68;

    @ObfuscatedName("y.o")
    public boolean field66 = false;

    @ObfuscatedName("y.i")
    public boolean field65 = false;

    @ObfuscatedName("y.w")
    public int field61 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method67()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method71());
        }
        this.field69 = (HttpsURLConnection) arg0.openConnection();
        this.field69.setSSLSocketFactory(new class16());
        this.field68 = arg1;
        this.field62 = new HashMap();
        this.field64 = new HashMap();
    }

    @ObfuscatedName("y.c(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method81(String arg0, String arg1) {
        if (!this.field66) {
            this.field62.put(arg0, arg1);
        }
    }

    @ObfuscatedName("y.l(I)Ljava/lang/String;")
    public String method94() {
        ArrayList var1 = new ArrayList(this.field64.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class382) var4.getKey()).method6146());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("y.s(I)V")
    public void method82() throws ProtocolException {
        if (this.field66) {
            return;
        }
        this.field69.setRequestMethod(this.field68.method71());
        if (!this.field64.isEmpty()) {
            this.field62.put("Accept", this.method94());
        }
        Iterator var1 = this.field62.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field69.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field68.method69() && this.field67 != null) {
            this.field69.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field67.method6151((byte) 32));
                var3.writeTo(this.field69.getOutputStream());
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
        this.field69.setConnectTimeout(this.field61);
        this.field69.setInstanceFollowRedirects(this.field65);
        this.field66 = true;
    }

    @ObfuscatedName("y.e(I)Z")
    public boolean method92() throws IOException, SocketTimeoutException {
        if (!this.field66) {
            this.method82();
        }
        this.field69.connect();
        return this.field69.getResponseCode() == -1;
    }

    @ObfuscatedName("y.r(I)Lg;")
    public class22 method95() {
        try {
            if (!this.field66 || this.field69.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field69.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field69);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field69.disconnect();
        }
        return var5;
    }
}
