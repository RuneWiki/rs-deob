package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ae")
public class class11 {

    @ObfuscatedName("ae.aq")
    public final HttpsURLConnection field52;

    @ObfuscatedName("ae.ad")
    public final class458 field55;

    @ObfuscatedName("ae.ag")
    public final class10 field54;

    @ObfuscatedName("ae.ak")
    public class494 field57;

    @ObfuscatedName("ae.ap")
    public boolean field53;

    @ObfuscatedName("ae.an")
    public boolean field56;

    @ObfuscatedName("ae.aj")
    public int field51;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class458(), arg2);
    }

    public class11(URL arg0, class10 arg1, class458 arg2, boolean arg3) throws IOException {
        this.field53 = false;
        this.field56 = false;
        this.field51 = 300000;
        if (!arg1.method64()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method67());
        }
        this.field52 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field52.setSSLSocketFactory(class16.method193());
        }
        this.field54 = arg1;
        this.field55 = arg2 == null ? new class458() : arg2;
    }

    @ObfuscatedName("ae.aq(B)Lrw;")
    public class458 method77() {
        return this.field55;
    }

    @ObfuscatedName("ae.ad(Lsr;I)V")
    public void method78(class494 arg0) {
        if (this.field53) {
            return;
        }
        if (arg0 == null) {
            this.field55.method7706("Content-Type");
            this.field57 = null;
            return;
        }
        this.field57 = arg0;
        if (this.field57.method8080() == null) {
            this.field55.method7704();
        } else {
            this.field55.method7671(this.field57.method8080());
        }
    }

    @ObfuscatedName("ae.ag(I)V")
    public void method86() throws ProtocolException {
        if (this.field53) {
            return;
        }
        this.field52.setRequestMethod(this.field54.method67());
        this.field55.method7672(this.field52);
        if (this.field54.method66() && this.field57 != null) {
            this.field52.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field57.method8076());
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
        this.field52.setConnectTimeout(this.field51);
        this.field52.setInstanceFollowRedirects(this.field56);
        this.field53 = true;
    }

    @ObfuscatedName("ae.ak(I)Z")
    public boolean method80() throws IOException {
        if (!this.field53) {
            this.method86();
        }
        this.field52.connect();
        return this.field52.getResponseCode() == -1;
    }

    @ObfuscatedName("ae.ap(B)Las;")
    public class21 method81() {
        try {
            if (!this.field53 || this.field52.getResponseCode() == -1) {
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
