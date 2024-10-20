package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("aq")
public class class11 {

    @ObfuscatedName("aq.aw")
    public final HttpsURLConnection field50;

    @ObfuscatedName("aq.ay")
    public final class421 field56;

    @ObfuscatedName("aq.ar")
    public final class10 field49;

    @ObfuscatedName("aq.am")
    public class463 field51;

    @ObfuscatedName("aq.as")
    public boolean field52;

    @ObfuscatedName("aq.aj")
    public boolean field48;

    @ObfuscatedName("aq.ag")
    public int field54;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class421(), arg2);
    }

    public class11(URL arg0, class10 arg1, class421 arg2, boolean arg3) throws IOException {
        this.field52 = false;
        this.field48 = false;
        this.field54 = 300000;
        if (!arg1.method66()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method69());
        }
        this.field50 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field50;
            if (Statics.field84 == null) {
                Statics.field84 = new class16();
            }
            class16 var6 = Statics.field84;
            var5.setSSLSocketFactory(var6);
        }
        this.field49 = arg1;
        this.field56 = arg2 == null ? new class421() : arg2;
    }

    @ObfuscatedName("aq.aw(I)Lqb;")
    public class421 method78() {
        return this.field56;
    }

    @ObfuscatedName("aq.ay(Lrq;I)V")
    public void method79(class463 arg0) {
        if (this.field52) {
            return;
        }
        if (arg0 == null) {
            this.field56.method7058("Content-Type");
            this.field51 = null;
            return;
        }
        this.field51 = arg0;
        if (this.field51.method7620() == null) {
            this.field56.method7063();
        } else {
            this.field56.method7062(this.field51.method7620());
        }
    }

    @ObfuscatedName("aq.ar(I)V")
    public void method95() throws ProtocolException {
        if (this.field52) {
            return;
        }
        this.field50.setRequestMethod(this.field49.method69());
        this.field56.method7055(this.field50);
        if (this.field49.method68() && this.field51 != null) {
            this.field50.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field51.method7619());
                var1.writeTo(this.field50.getOutputStream());
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
        this.field50.setConnectTimeout(this.field54);
        this.field50.setInstanceFollowRedirects(this.field48);
        this.field52 = true;
    }

    @ObfuscatedName("aq.am(I)Z")
    public boolean method81() throws IOException {
        if (!this.field52) {
            this.method95();
        }
        this.field50.connect();
        return this.field50.getResponseCode() == -1;
    }

    @ObfuscatedName("aq.as(I)Lac;")
    public class21 method82() {
        try {
            if (!this.field52 || this.field50.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field50.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field50);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field50.disconnect();
        }
        return var4;
    }
}
