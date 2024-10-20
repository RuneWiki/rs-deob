package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ap")
public class class11 {

    @ObfuscatedName("ap.at")
    public final HttpsURLConnection field47;

    @ObfuscatedName("ap.ah")
    public final class432 field40;

    @ObfuscatedName("ap.ar")
    public final class10 field42;

    @ObfuscatedName("ap.ao")
    public class474 field43;

    @ObfuscatedName("ap.ab")
    public boolean field44;

    @ObfuscatedName("ap.au")
    public boolean field45;

    @ObfuscatedName("ap.aa")
    public int field46;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class432(), arg2);
    }

    public class11(URL arg0, class10 arg1, class432 arg2, boolean arg3) throws IOException {
        this.field44 = false;
        this.field45 = false;
        this.field46 = 300000;
        if (!arg1.method72()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method71());
        }
        this.field47 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field47;
            if (Statics.field70 == null) {
                Statics.field70 = new class16();
            }
            class16 var6 = Statics.field70;
            var5.setSSLSocketFactory(var6);
        }
        this.field42 = arg1;
        this.field40 = arg2 == null ? new class432() : arg2;
    }

    @ObfuscatedName("ap.at(I)Lqf;")
    public class432 method89() {
        return this.field40;
    }

    @ObfuscatedName("ap.ah(Lsd;I)V")
    public void method86(class474 arg0) {
        if (this.field44) {
            return;
        }
        if (arg0 == null) {
            this.field40.method7240("Content-Type");
            this.field43 = null;
            return;
        }
        this.field43 = arg0;
        if (this.field43.method7788() == null) {
            this.field40.method7245();
        } else {
            this.field40.method7266(this.field43.method7788());
        }
    }

    @ObfuscatedName("ap.ar(B)V")
    public void method97() throws ProtocolException {
        if (this.field44) {
            return;
        }
        this.field47.setRequestMethod(this.field42.method71());
        this.field40.method7243(this.field47);
        if (this.field42.method70() && this.field43 != null) {
            this.field47.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field43.method7789());
                var1.writeTo(this.field47.getOutputStream());
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
        this.field47.setConnectTimeout(this.field46);
        this.field47.setInstanceFollowRedirects(this.field45);
        this.field44 = true;
    }

    @ObfuscatedName("ap.ao(I)Z")
    public boolean method88() throws IOException {
        if (!this.field44) {
            this.method97();
        }
        this.field47.connect();
        return this.field47.getResponseCode() == -1;
    }

    @ObfuscatedName("ap.ab(I)Law;")
    public class21 method85() {
        try {
            if (!this.field44 || this.field47.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field47.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field47);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field47.disconnect();
        }
        return var4;
    }
}
