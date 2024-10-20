package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("as")
public class class11 {

    @ObfuscatedName("as.az")
    public final HttpsURLConnection field46;

    @ObfuscatedName("as.ah")
    public final class440 field42;

    @ObfuscatedName("as.af")
    public final class10 field44;

    @ObfuscatedName("as.at")
    public class482 field45;

    @ObfuscatedName("as.an")
    public boolean field43;

    @ObfuscatedName("as.ao")
    public boolean field47;

    @ObfuscatedName("as.ab")
    public int field49;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class440(), arg2);
    }

    public class11(URL arg0, class10 arg1, class440 arg2, boolean arg3) throws IOException {
        this.field43 = false;
        this.field47 = false;
        this.field49 = 300000;
        if (!arg1.method67()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method68());
        }
        this.field46 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field46;
            if (Statics.field69 == null) {
                Statics.field69 = new class16();
            }
            class16 var6 = Statics.field69;
            var5.setSSLSocketFactory(var6);
        }
        this.field44 = arg1;
        this.field42 = arg2 == null ? new class440() : arg2;
    }

    @ObfuscatedName("as.az(I)Lqy;")
    public class440 method80() {
        return this.field42;
    }

    @ObfuscatedName("as.ah(Lsg;B)V")
    public void method83(class482 arg0) {
        if (this.field43) {
            return;
        }
        if (arg0 == null) {
            this.field42.method7265("Content-Type");
            this.field45 = null;
            return;
        }
        this.field45 = arg0;
        if (this.field45.method7808() == null) {
            this.field42.method7303();
        } else {
            this.field42.method7270(this.field45.method7808());
        }
    }

    @ObfuscatedName("as.af(B)V")
    public void method84() throws ProtocolException {
        if (this.field43) {
            return;
        }
        this.field46.setRequestMethod(this.field44.method68());
        this.field42.method7262(this.field46);
        if (this.field44.method69() && this.field45 != null) {
            this.field46.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field45.method7807());
                var1.writeTo(this.field46.getOutputStream());
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
        this.field46.setConnectTimeout(this.field49);
        this.field46.setInstanceFollowRedirects(this.field47);
        this.field43 = true;
    }

    @ObfuscatedName("as.at(I)Z")
    public boolean method85() throws IOException {
        if (!this.field43) {
            this.method84();
        }
        this.field46.connect();
        return this.field46.getResponseCode() == -1;
    }

    @ObfuscatedName("as.an(B)Laa;")
    public class21 method86() {
        try {
            if (!this.field43 || this.field46.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field46.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field46);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field46.disconnect();
        }
        return var4;
    }
}
