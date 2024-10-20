package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("c")
public class class11 {

    @ObfuscatedName("c.f")
    public final HttpsURLConnection field49;

    @ObfuscatedName("c.w")
    public final class388 field50;

    @ObfuscatedName("c.v")
    public final class10 field48;

    @ObfuscatedName("c.s")
    public class429 field58;

    @ObfuscatedName("c.z")
    public boolean field51;

    @ObfuscatedName("c.j")
    public boolean field52;

    @ObfuscatedName("c.i")
    public int field53;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class388(), arg2);
    }

    public class11(URL arg0, class10 arg1, class388 arg2, boolean arg3) throws IOException {
        this.field51 = false;
        this.field52 = false;
        this.field53 = 300000;
        if (!arg1.method85()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method75());
        }
        this.field49 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field49.setSSLSocketFactory(class16.method183());
        }
        this.field48 = arg1;
        this.field50 = arg2 == null ? new class388() : arg2;
    }

    @ObfuscatedName("c.f(I)Lnx;")
    public class388 method93() {
        return this.field50;
    }

    @ObfuscatedName("c.w(Lpm;I)V")
    public void method89(class429 arg0) {
        if (this.field51) {
            return;
        }
        if (arg0 == null) {
            this.field50.method6847("Content-Type");
            this.field58 = null;
            return;
        }
        this.field58 = arg0;
        if (this.field58.method7402() == null) {
            this.field50.method6852();
        } else {
            this.field50.method6851(this.field58.method7402());
        }
    }

    @ObfuscatedName("c.v(I)V")
    public void method90() throws ProtocolException {
        if (this.field51) {
            return;
        }
        this.field49.setRequestMethod(this.field48.method75());
        this.field50.method6844(this.field49);
        if (this.field48.method78() && this.field58 != null) {
            this.field49.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field58.method7401());
                var1.writeTo(this.field49.getOutputStream());
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
        this.field49.setConnectTimeout(this.field53);
        this.field49.setInstanceFollowRedirects(this.field52);
        this.field51 = true;
    }

    @ObfuscatedName("c.s(I)Z")
    public boolean method96() throws IOException {
        if (!this.field51) {
            this.method90();
        }
        this.field49.connect();
        return this.field49.getResponseCode() == -1;
    }

    @ObfuscatedName("c.z(I)La;")
    public class21 method92() {
        try {
            if (!this.field51 || this.field49.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field49.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field49);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field49.disconnect();
        }
        return var4;
    }
}
