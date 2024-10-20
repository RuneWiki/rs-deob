package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ak")
public class class11 {

    @ObfuscatedName("ak.aj")
    public final HttpsURLConnection field49;

    @ObfuscatedName("ak.al")
    public final class391 field47;

    @ObfuscatedName("ak.ac")
    public final class10 field48;

    @ObfuscatedName("ak.ab")
    public class433 field46;

    @ObfuscatedName("ak.an")
    public boolean field53;

    @ObfuscatedName("ak.ao")
    public boolean field51;

    @ObfuscatedName("ak.av")
    public int field52;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class391(), arg2);
    }

    public class11(URL arg0, class10 arg1, class391 arg2, boolean arg3) throws IOException {
        this.field53 = false;
        this.field51 = false;
        this.field52 = 300000;
        if (!arg1.method58()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method59());
        }
        this.field49 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field49;
            if (Statics.field77 == null) {
                Statics.field77 = new class16();
            }
            class16 var6 = Statics.field77;
            var5.setSSLSocketFactory(var6);
        }
        this.field48 = arg1;
        this.field47 = arg2 == null ? new class391() : arg2;
    }

    @ObfuscatedName("ak.aj(S)Lpu;")
    public class391 method72() {
        return this.field47;
    }

    @ObfuscatedName("ak.al(Lqb;B)V")
    public void method73(class433 arg0) {
        if (this.field53) {
            return;
        }
        if (arg0 == null) {
            this.field47.method6757("Content-Type");
            this.field46 = null;
            return;
        }
        this.field46 = arg0;
        if (this.field46.method7306() == null) {
            this.field47.method6762();
        } else {
            this.field47.method6761(this.field46.method7306());
        }
    }

    @ObfuscatedName("ak.ac(I)V")
    public void method74() throws ProtocolException {
        if (this.field53) {
            return;
        }
        this.field49.setRequestMethod(this.field48.method59());
        this.field47.method6754(this.field49);
        if (this.field48.method60() && this.field46 != null) {
            this.field49.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field46.method7305());
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
        this.field49.setConnectTimeout(this.field52);
        this.field49.setInstanceFollowRedirects(this.field51);
        this.field53 = true;
    }

    @ObfuscatedName("ak.ab(B)Z")
    public boolean method75() throws IOException {
        if (!this.field53) {
            this.method74();
        }
        this.field49.connect();
        return this.field49.getResponseCode() == -1;
    }

    @ObfuscatedName("ak.an(I)Laf;")
    public class21 method83() {
        try {
            if (!this.field53 || this.field49.getResponseCode() == -1) {
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
