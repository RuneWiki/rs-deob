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

@ObfuscatedName("x")
public class class11 {

    @ObfuscatedName("x.i")
    public HttpsURLConnection field47;

    @ObfuscatedName("x.w")
    public final Map field41;

    @ObfuscatedName("x.s")
    public class361 field42;

    @ObfuscatedName("x.a")
    public Map field43;

    @ObfuscatedName("x.o")
    public final class10 field44;

    @ObfuscatedName("x.g")
    public boolean field45 = false;

    @ObfuscatedName("x.e")
    public boolean field46 = false;

    @ObfuscatedName("x.p")
    public int field48 = 300000;

    public class11(URL arg0, class10 arg1) throws IOException {
        if (!arg1.method69()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method71());
        }
        this.field47 = (HttpsURLConnection) arg0.openConnection();
        this.field47.setSSLSocketFactory(new class16());
        this.field44 = arg1;
        this.field41 = new HashMap();
        this.field43 = new HashMap();
    }

    @ObfuscatedName("x.i(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method78(String arg0, String arg1) {
        if (!this.field45) {
            this.field41.put(arg0, arg1);
        }
    }

    @ObfuscatedName("x.w(I)Ljava/lang/String;")
    public String method79() {
        ArrayList var1 = new ArrayList(this.field43.entrySet());
        Collections.sort(var1, new class19(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class360) var4.getKey()).method5730());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = Float.toString(var5).substring(0, 4);
                var2.append(";q=" + var6);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("x.s(I)V")
    public void method80() throws ProtocolException {
        if (this.field45) {
            return;
        }
        this.field47.setRequestMethod(this.field44.method71());
        if (!this.field43.isEmpty()) {
            this.field41.put("Accept", this.method79());
        }
        Iterator var1 = this.field41.entrySet().iterator();
        while (var1.hasNext()) {
            Entry var2 = (Entry) var1.next();
            this.field47.setRequestProperty((String) var2.getKey(), (String) var2.getValue());
        }
        if (this.field44.method66() && this.field42 != null) {
            this.field47.setDoOutput(true);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            try {
                var3.write(this.field42.method5735(1606591795));
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
        this.field47.setInstanceFollowRedirects(this.field46);
        this.field45 = true;
    }

    @ObfuscatedName("x.a(I)Z")
    public boolean method81() throws IOException, SocketTimeoutException {
        if (!this.field45) {
            this.method80();
        }
        this.field47.connect();
        return this.field47.getResponseCode() == -1;
    }

    @ObfuscatedName("x.o(I)Lm;")
    public class22 method92() {
        try {
            if (!this.field45 || this.field47.getResponseCode() == -1) {
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
