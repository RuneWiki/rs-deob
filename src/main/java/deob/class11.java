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

    @ObfuscatedName("l.n")
    public HttpsURLConnection field47;

    @ObfuscatedName("l.c")
    public final Map field43;

    @ObfuscatedName("l.m")
    public class360 field44;

    @ObfuscatedName("l.k")
    public Map field45;

    @ObfuscatedName("l.o")
    public final class10 field49;

    @ObfuscatedName("l.g")
    public boolean field42 = false;

    @ObfuscatedName("l.z")
    public boolean field51 = false;

    @ObfuscatedName("l.a")
    public int field48 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method70()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method71());
        }
        this.field47 = (HttpsURLConnection) arg0.openConnection();
        this.field47.setSSLSocketFactory(new class16());
        this.field49 = arg1;
        this.field43 = new HashMap();
        this.field45 = new HashMap();
    }

    @ObfuscatedName("l.n(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method99(String arg0, String arg1) {
        if (!this.field42) {
            this.field43.put(arg0, arg1);
        }
    }

    @ObfuscatedName("l.c(I)Ljava/lang/String;")
    public String method100() {
        ArrayList var1 = new ArrayList(this.field45.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class359) var4.getKey()).method5713());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("l.m(S)V")
    public void method95() throws ProtocolException {
        if (this.field42) {
            return;
        }
        this.field47.setRequestMethod(this.field49.method71());
        if (!this.field45.isEmpty()) {
            this.field43.put("Accept", this.method100());
        }
        Iterator var1 = this.field43.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field47.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field49.method72() && this.field44 != null) {
            this.field47.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field44.method5716(1403875276));
                var3.writeTo(this.field47.getOutputStream());
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
        this.field47.setConnectTimeout(this.field48);
        this.field47.setInstanceFollowRedirects(this.field51);
        this.field42 = true;
    }

    @ObfuscatedName("l.k(I)Z")
    public boolean method92() throws IOException, SocketTimeoutException {
        if (!this.field42) {
            this.method95();
        }
        this.field47.connect();
        return this.field47.getResponseCode() == -1;
    }

    @ObfuscatedName("l.o(I)Lt;")
    public class22 method106() {
        try {
            if (!this.field42 || this.field47.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field47.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field47);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field47.disconnect();
        }
        return var5;
    }
}
