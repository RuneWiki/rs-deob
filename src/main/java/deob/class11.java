package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ad")
public class class11 {

    @ObfuscatedName("ad.au")
    public final HttpsURLConnection field52;

    @ObfuscatedName("ad.ae")
    public final class420 field48;

    @ObfuscatedName("ad.ao")
    public final class10 field54;

    @ObfuscatedName("ad.at")
    public class462 field50;

    @ObfuscatedName("ad.ac")
    public boolean field51;

    @ObfuscatedName("ad.ai")
    public boolean field49;

    @ObfuscatedName("ad.az")
    public int field53;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class420(), arg2);
    }

    public class11(URL arg0, class10 arg1, class420 arg2, boolean arg3) throws IOException {
        this.field51 = false;
        this.field49 = false;
        this.field53 = 300000;
        if (!arg1.method60()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method58());
        }
        this.field52 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field52.setSSLSocketFactory(class16.method173());
        }
        this.field54 = arg1;
        this.field48 = arg2 == null ? new class420() : arg2;
    }

    @ObfuscatedName("ad.au(B)Lqf;")
    public class420 method79() {
        return this.field48;
    }

    @ObfuscatedName("ad.ae(Lrf;B)V")
    public void method72(class462 arg0) {
        if (this.field51) {
            return;
        }
        if (arg0 == null) {
            this.field48.method7131("Content-Type");
            this.field50 = null;
            return;
        }
        this.field50 = arg0;
        if (this.field50.method7647() == null) {
            this.field48.method7102();
        } else {
            this.field48.method7105(this.field50.method7647());
        }
    }

    @ObfuscatedName("ad.ao(I)V")
    public void method73() throws ProtocolException {
        if (this.field51) {
            return;
        }
        this.field52.setRequestMethod(this.field54.method58());
        this.field48.method7094(this.field52);
        if (this.field54.method59() && this.field50 != null) {
            this.field52.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field50.method7645());
                var1.writeTo(this.field52.getOutputStream());
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
        this.field52.setConnectTimeout(this.field53);
        this.field52.setInstanceFollowRedirects(this.field49);
        this.field51 = true;
    }

    @ObfuscatedName("ad.at(I)Z")
    public boolean method75() throws IOException {
        if (!this.field51) {
            this.method73();
        }
        this.field52.connect();
        return this.field52.getResponseCode() == -1;
    }

    @ObfuscatedName("ad.ac(I)Las;")
    public class21 method74() {
        try {
            if (!this.field51 || this.field52.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field52.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field52);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field52.disconnect();
        }
        return var4;
    }
}
