package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ah")
public class class11 {

    @ObfuscatedName("ah.ak")
    public final HttpsURLConnection field47;

    @ObfuscatedName("ah.al")
    public final class457 field45;

    @ObfuscatedName("ah.aj")
    public final class10 field46;

    @ObfuscatedName("ah.az")
    public class493 field52;

    @ObfuscatedName("ah.af")
    public boolean field49;

    @ObfuscatedName("ah.aa")
    public boolean field50;

    @ObfuscatedName("ah.at")
    public int field51;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class457(), arg2);
    }

    public class11(URL arg0, class10 arg1, class457 arg2, boolean arg3) throws IOException {
        this.field49 = false;
        this.field50 = false;
        this.field51 = 300000;
        if (!arg1.method67()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method66());
        }
        this.field47 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field47.setSSLSocketFactory(class16.method178());
        }
        this.field46 = arg1;
        this.field45 = arg2 == null ? new class457() : arg2;
    }

    @ObfuscatedName("ah.ak(B)Lrt;")
    public class457 method78() {
        return this.field45;
    }

    @ObfuscatedName("ah.al(Lsh;I)V")
    public void method91(class493 arg0) {
        if (this.field49) {
            return;
        }
        if (arg0 == null) {
            this.field45.method7706("Content-Type");
            this.field52 = null;
            return;
        }
        this.field52 = arg0;
        if (this.field52.method8141() == null) {
            this.field45.method7711();
        } else {
            this.field45.method7710(this.field52.method8141());
        }
    }

    @ObfuscatedName("ah.aj(B)V")
    public void method79() throws ProtocolException {
        if (this.field49) {
            return;
        }
        this.field47.setRequestMethod(this.field46.method66());
        this.field45.method7703(this.field47);
        if (this.field46.method73() && this.field52 != null) {
            this.field47.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field52.method8140());
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
        this.field47.setConnectTimeout(this.field51);
        this.field47.setInstanceFollowRedirects(this.field50);
        this.field49 = true;
    }

    @ObfuscatedName("ah.az(I)Z")
    public boolean method94() throws IOException {
        if (!this.field49) {
            this.method79();
        }
        this.field47.connect();
        return this.field47.getResponseCode() == -1;
    }

    @ObfuscatedName("ah.af(B)Lad;")
    public class21 method81() {
        try {
            if (!this.field49 || this.field47.getResponseCode() == -1) {
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
