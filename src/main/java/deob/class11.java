package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("au")
public class class11 {

    @ObfuscatedName("au.am")
    public final HttpsURLConnection field33;

    @ObfuscatedName("au.ap")
    public final class436 field32;

    @ObfuscatedName("au.af")
    public final class10 field37;

    @ObfuscatedName("au.aj")
    public class478 field34;

    @ObfuscatedName("au.aq")
    public boolean field35;

    @ObfuscatedName("au.ar")
    public boolean field36;

    @ObfuscatedName("au.ag")
    public int field40;

    public class11(URL arg0, class10 arg1) throws IOException {
        this(arg0, arg1, new class436(), false);
    }

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class436(), arg2);
    }

    public class11(URL arg0, class10 arg1, class436 arg2, boolean arg3) throws IOException {
        this.field35 = false;
        this.field36 = false;
        this.field40 = 300000;
        if (!arg1.method62()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method63());
        }
        this.field33 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field33.setSSLSocketFactory(class16.method203());
        }
        this.field37 = arg1;
        this.field32 = arg2 == null ? new class436() : arg2;
    }

    @ObfuscatedName("au.am(B)Lqp;")
    public class436 method83() {
        return this.field32;
    }

    @ObfuscatedName("au.ap(Lsq;I)V")
    public void method77(class478 arg0) {
        if (this.field35) {
            return;
        }
        if (arg0 == null) {
            this.field32.method7378("Content-Type");
            this.field34 = null;
            return;
        }
        this.field34 = arg0;
        if (this.field34.method7936() == null) {
            this.field32.method7397();
        } else {
            this.field32.method7381(this.field34.method7936());
        }
    }

    @ObfuscatedName("au.af(I)V")
    public void method75() throws ProtocolException {
        if (this.field35) {
            return;
        }
        this.field33.setRequestMethod(this.field37.method63());
        this.field32.method7374(this.field33);
        if (this.field37.method61() && this.field34 != null) {
            this.field33.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field34.method7935());
                var1.writeTo(this.field33.getOutputStream());
            } catch (IOException var13) {
                var13.printStackTrace();
            } finally {
                try {
                    var1.close();
                } catch (IOException var12) {
                    var12.printStackTrace();
                }
            }
        }
        this.field33.setConnectTimeout(this.field40);
        this.field33.setInstanceFollowRedirects(this.field36);
        this.field35 = true;
    }

    @ObfuscatedName("au.aj(B)Z")
    public boolean method79() throws IOException {
        if (!this.field35) {
            this.method75();
        }
        this.field33.connect();
        return this.field33.getResponseCode() == -1;
    }

    @ObfuscatedName("au.aq(I)Lab;")
    public class21 method80() {
        try {
            if (!this.field35 || this.field33.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field33.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field33);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field33.disconnect();
        }
        return var4;
    }
}
