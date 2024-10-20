package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ay")
public class class11 {

    @ObfuscatedName("ay.af")
    public final HttpsURLConnection field51;

    @ObfuscatedName("ay.an")
    public final class395 field48;

    @ObfuscatedName("ay.aw")
    public final class10 field54;

    @ObfuscatedName("ay.ac")
    public class437 field53;

    @ObfuscatedName("ay.au")
    public boolean field52;

    @ObfuscatedName("ay.ab")
    public boolean field50;

    @ObfuscatedName("ay.aq")
    public int field49;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class395(), arg2);
    }

    public class11(URL arg0, class10 arg1, class395 arg2, boolean arg3) throws IOException {
        this.field52 = false;
        this.field50 = false;
        this.field49 = 300000;
        if (!arg1.method71()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method67());
        }
        this.field51 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field51;
            if (Statics.field84 == null) {
                Statics.field84 = new class16();
            }
            class16 var6 = Statics.field84;
            var5.setSSLSocketFactory(var6);
        }
        this.field54 = arg1;
        this.field48 = arg2 == null ? new class395() : arg2;
    }

    @ObfuscatedName("ay.af(I)Lpc;")
    public class395 method77() {
        return this.field48;
    }

    @ObfuscatedName("ay.an(Lqq;B)V")
    public void method90(class437 arg0) {
        if (this.field52) {
            return;
        }
        if (arg0 == null) {
            this.field48.method7007("Content-Type");
            this.field53 = null;
            return;
        }
        this.field53 = arg0;
        if (this.field53.method7604() == null) {
            this.field48.method6983();
        } else {
            this.field48.method6982(this.field53.method7604());
        }
    }

    @ObfuscatedName("ay.aw(B)V")
    public void method83() throws ProtocolException {
        if (this.field52) {
            return;
        }
        this.field51.setRequestMethod(this.field54.method67());
        this.field48.method6975(this.field51);
        if (this.field54.method68() && this.field53 != null) {
            this.field51.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field53.method7602());
                var1.writeTo(this.field51.getOutputStream());
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
        this.field51.setConnectTimeout(this.field49);
        this.field51.setInstanceFollowRedirects(this.field50);
        this.field52 = true;
    }

    @ObfuscatedName("ay.ac(B)Z")
    public boolean method84() throws IOException {
        if (!this.field52) {
            this.method83();
        }
        this.field51.connect();
        return this.field51.getResponseCode() == -1;
    }

    @ObfuscatedName("ay.au(B)Laj;")
    public class21 method80() {
        try {
            if (!this.field52 || this.field51.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field51.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field51);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field51.disconnect();
        }
        return var4;
    }
}
