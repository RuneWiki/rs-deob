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

    @ObfuscatedName("y.l")
    public HttpsURLConnection field50;

    @ObfuscatedName("y.q")
    public final Map field52;

    @ObfuscatedName("y.f")
    public class361 field51;

    @ObfuscatedName("y.j")
    public Map field56;

    @ObfuscatedName("y.m")
    public final class10 field53;

    @ObfuscatedName("y.k")
    public boolean field54 = false;

    @ObfuscatedName("y.t")
    public boolean field55 = false;

    @ObfuscatedName("y.a")
    public int field58 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method71()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method79());
        }
        this.field50 = (HttpsURLConnection) arg0.openConnection();
        this.field50.setSSLSocketFactory(new class16());
        this.field53 = arg1;
        this.field52 = new HashMap();
        this.field56 = new HashMap();
    }

    @ObfuscatedName("y.l(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method84(String arg0, String arg1) {
        if (!this.field54) {
            this.field52.put(arg0, arg1);
        }
    }

    @ObfuscatedName("y.q(S)Ljava/lang/String;")
    public String method85() {
        ArrayList var1 = new ArrayList(this.field56.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class360) var4.getKey()).method5749());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("y.f(I)V")
    public void method95() throws ProtocolException {
        if (this.field54) {
            return;
        }
        this.field50.setRequestMethod(this.field53.method79());
        if (!this.field56.isEmpty()) {
            this.field52.put("Accept", this.method85());
        }
        Iterator var1 = this.field52.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field50.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field53.method73() && this.field51 != null) {
            this.field50.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field51.method5752((byte) 89));
                var3.writeTo(this.field50.getOutputStream());
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
        this.field50.setConnectTimeout(this.field58);
        this.field50.setInstanceFollowRedirects(this.field55);
        this.field54 = true;
    }

    @ObfuscatedName("y.j(I)Z")
    public boolean method87() throws IOException, SocketTimeoutException {
        if (!this.field54) {
            this.method95();
        }
        this.field50.connect();
        return this.field50.getResponseCode() == -1;
    }

    @ObfuscatedName("y.m(S)Lo;")
    public class22 method91() {
        try {
            if (!this.field54 || this.field50.getResponseCode() == -1) {
                return new class22("No REST response has been received yet.");
            }
        } catch (IOException var12) {
            this.field50.disconnect();
            return new class22("Error decoding REST response code: " + var12.getMessage());
        }
        Object var2 = null;
        class22 var5;
        try {
            class22 var3 = new class22(this.field50);
            return var3;
        } catch (IOException var10) {
            var5 = new class22("Error decoding REST response: " + var10.getMessage());
        } finally {
            this.field50.disconnect();
        }
        return var5;
    }
}
