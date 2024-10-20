package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ag")
public class class11 {

    @ObfuscatedName("ag.ac")
    public final HttpsURLConnection field55;

    @ObfuscatedName("ag.al")
    public final class435 field51;

    @ObfuscatedName("ag.ak")
    public final class10 field48;

    @ObfuscatedName("ag.ax")
    public class477 field47;

    @ObfuscatedName("ag.ao")
    public boolean field50;

    @ObfuscatedName("ag.ah")
    public boolean field46;

    @ObfuscatedName("ag.ar")
    public int field52;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class435(), arg2);
    }

    public class11(URL arg0, class10 arg1, class435 arg2, boolean arg3) throws IOException {
        this.field50 = false;
        this.field46 = false;
        this.field52 = 300000;
        if (!arg1.method66()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method67());
        }
        this.field55 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field55;
            if (Statics.field83 == null) {
                Statics.field83 = new class16();
            }
            class16 var6 = Statics.field83;
            var5.setSSLSocketFactory(var6);
        }
        this.field48 = arg1;
        this.field51 = arg2 == null ? new class435() : arg2;
    }

    @ObfuscatedName("ag.ac(I)Lqv;")
    public class435 method93() {
        return this.field51;
    }

    @ObfuscatedName("ag.al(Lsd;I)V")
    public void method77(class477 arg0) {
        if (this.field50) {
            return;
        }
        if (arg0 == null) {
            this.field51.method7164("Content-Type");
            this.field47 = null;
            return;
        }
        this.field47 = arg0;
        if (this.field47.method7722() == null) {
            this.field51.method7169();
        } else {
            this.field51.method7168(this.field47.method7722());
        }
    }

    @ObfuscatedName("ag.ak(I)V")
    public void method78() throws ProtocolException {
        if (this.field50) {
            return;
        }
        this.field55.setRequestMethod(this.field48.method67());
        this.field51.method7161(this.field55);
        if (this.field48.method65() && this.field47 != null) {
            this.field55.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field47.method7718());
                var1.writeTo(this.field55.getOutputStream());
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
        this.field55.setConnectTimeout(this.field52);
        this.field55.setInstanceFollowRedirects(this.field46);
        this.field50 = true;
    }

    @ObfuscatedName("ag.ax(I)Z")
    public boolean method79() throws IOException {
        if (!this.field50) {
            this.method78();
        }
        this.field55.connect();
        return this.field55.getResponseCode() == -1;
    }

    @ObfuscatedName("ag.ao(I)Law;")
    public class21 method80() {
        try {
            if (!this.field50 || this.field55.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field55.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field55);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field55.disconnect();
        }
        return var4;
    }
}
