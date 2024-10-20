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

@ObfuscatedName("r")
public class class11 {

    @ObfuscatedName("r.v")
    public HttpsURLConnection field41;

    @ObfuscatedName("r.c")
    public final Map field40;

    @ObfuscatedName("r.i")
    public class399 field42;

    @ObfuscatedName("r.f")
    public Map field43;

    @ObfuscatedName("r.b")
    public final class10 field51;

    @ObfuscatedName("r.n")
    public boolean field45 = false;

    @ObfuscatedName("r.s")
    public boolean field44 = false;

    @ObfuscatedName("r.l")
    public int field47 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method61()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method60());
        }
        this.field41 = (HttpsURLConnection) arg0.openConnection();
        this.field41.setSSLSocketFactory(new class16());
        this.field51 = arg1;
        this.field40 = new HashMap();
        this.field43 = new HashMap();
    }

    @ObfuscatedName("r.v(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method72(String arg0, String arg1) {
        if (!this.field45) {
            this.field40.put(arg0, arg1);
        }
    }

    @ObfuscatedName("r.c(I)Ljava/lang/String;")
    public String method73() {
        ArrayList var1 = new ArrayList(this.field43.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class398) var4.getKey()).method6476());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("r.i(I)V")
    public void method74() throws ProtocolException {
        if (this.field45) {
            return;
        }
        this.field41.setRequestMethod(this.field51.method60());
        if (!this.field43.isEmpty()) {
            this.field40.put("Accept", this.method73());
        }
        Iterator var1 = this.field40.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field41.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field51.method63() && this.field42 != null) {
            this.field41.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field42.method6480());
                var3.writeTo(this.field41.getOutputStream());
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
        this.field41.setConnectTimeout(this.field47);
        this.field41.setInstanceFollowRedirects(this.field44);
        this.field45 = true;
    }

    @ObfuscatedName("r.f(I)Z")
    public boolean method81() throws IOException, SocketTimeoutException {
        if (!this.field45) {
            this.method74();
        }
        this.field41.connect();
        return this.field41.getResponseCode() == -1;
    }

    @ObfuscatedName("r.b(B)Ly;")
    public class22 method76() {
        try {
            if (!this.field45 || this.field41.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field41.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field41);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field41.disconnect();
        }
        return var5;
    }
}
