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

@ObfuscatedName("d")
public class class11 {

    @ObfuscatedName("d.s")
    public HttpsURLConnection field58;

    @ObfuscatedName("d.h")
    public final Map field57;

    @ObfuscatedName("d.w")
    public class400 field50;

    @ObfuscatedName("d.v")
    public Map field51;

    @ObfuscatedName("d.c")
    public final class10 field52;

    @ObfuscatedName("d.q")
    public boolean field56 = false;

    @ObfuscatedName("d.i")
    public boolean field54 = false;

    @ObfuscatedName("d.k")
    public int field55 = 300000;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        if (!arg1.method61()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method71());
        }
        this.field58 = (HttpsURLConnection) arg0.openConnection();
        if (!arg2) {
            this.field58.setSSLSocketFactory(class16.method180());
        }
        this.field52 = arg1;
        this.field57 = new HashMap();
        this.field51 = new HashMap();
    }

    @ObfuscatedName("d.s(Ljava/lang/String;Ljava/lang/String;S)V")
    public void method77(String arg0, String arg1) {
        if (!this.field56) {
            this.field57.put(arg0, arg1);
        }
    }

    @ObfuscatedName("d.h(I)Ljava/lang/String;")
    public String method78() {
        ArrayList var1 = new ArrayList(this.field51.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class399) var4.getKey()).method6378());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("d.w(I)V")
    public void method79() throws ProtocolException {
        if (this.field56) {
            return;
        }
        this.field58.setRequestMethod(this.field52.method71());
        if (!this.field51.isEmpty()) {
            this.field57.put("Accept", this.method78());
        }
        Iterator var1 = this.field57.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field58.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field52.method63() && this.field50 != null) {
            this.field58.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field50.method6380());
                var3.writeTo(this.field58.getOutputStream());
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
        this.field58.setConnectTimeout(this.field55);
        this.field58.setInstanceFollowRedirects(this.field54);
        this.field56 = true;
    }

    @ObfuscatedName("d.v(I)Z")
    public boolean method80() throws IOException, SocketTimeoutException {
        if (!this.field56) {
            this.method79();
        }
        this.field58.connect();
        return this.field58.getResponseCode() == -1;
    }

    @ObfuscatedName("d.c(B)Lx;")
    public class22 method76() {
        try {
            if (!this.field56 || this.field58.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field58.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field58);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field58.disconnect();
        }
        return var5;
    }
}
