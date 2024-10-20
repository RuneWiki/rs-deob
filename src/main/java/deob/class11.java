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

@ObfuscatedName("o")
public class class11 {

    @ObfuscatedName("o.c")
    public HttpsURLConnection field54;

    @ObfuscatedName("o.b")
    public final Map field49;

    @ObfuscatedName("o.p")
    public class378 field51;

    @ObfuscatedName("o.m")
    public Map field50;

    @ObfuscatedName("o.t")
    public final class10 field53;

    @ObfuscatedName("o.s")
    public boolean field52 = false;

    @ObfuscatedName("o.j")
    public boolean field58 = false;

    @ObfuscatedName("o.w")
    public int field56 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method81()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method92());
        }
        this.field54 = (HttpsURLConnection) arg0.openConnection();
        this.field54.setSSLSocketFactory(new class16());
        this.field53 = arg1;
        this.field49 = new HashMap();
        this.field50 = new HashMap();
    }

    @ObfuscatedName("o.c(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method113(String arg0, String arg1) {
        if (!this.field52) {
            this.field49.put(arg0, arg1);
        }
    }

    @ObfuscatedName("o.b(I)Ljava/lang/String;")
    public String method101() {
        ArrayList var1 = new ArrayList(this.field50.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class377) var4.getKey()).method6142());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("o.p(B)V")
    public void method96() throws ProtocolException {
        if (this.field52) {
            return;
        }
        this.field54.setRequestMethod(this.field53.method92());
        if (!this.field50.isEmpty()) {
            this.field49.put("Accept", this.method101());
        }
        Iterator var1 = this.field49.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field54.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field53.method82() && this.field51 != null) {
            this.field54.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field51.method6145(-1647266432));
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
        this.field54.setInstanceFollowRedirects(this.field58);
        this.field52 = true;
    }

    @ObfuscatedName("o.m(I)Z")
    public boolean method97() throws IOException, SocketTimeoutException {
        if (!this.field52) {
            this.method96();
        }
        this.field54.connect();
        return this.field54.getResponseCode() == -1;
    }

    @ObfuscatedName("o.t(I)Lq;")
    public class22 method98() {
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
