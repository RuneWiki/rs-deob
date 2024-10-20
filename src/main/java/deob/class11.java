package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("au")
public class class11 {

    @ObfuscatedName("au.ap")
    public final HttpsURLConnection field46;

    @ObfuscatedName("au.aw")
    public final class462 field39;

    @ObfuscatedName("au.ak")
    public final class10 field40;

    @ObfuscatedName("au.aj")
    public class504 field42;

    @ObfuscatedName("au.ai")
    public boolean field45;

    @ObfuscatedName("au.ay")
    public boolean field43;

    @ObfuscatedName("au.as")
    public int field44;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class462(), arg2);
    }

    public class11(URL arg0, class10 arg1, class462 arg2, boolean arg3) throws IOException {
        this.field45 = false;
        this.field43 = false;
        this.field44 = 300000;
        if (!arg1.method69()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method68());
        }
        this.field46 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field46;
            if (Statics.field59 == null) {
                Statics.field59 = new class16();
            }
            class16 var6 = Statics.field59;
            var5.setSSLSocketFactory(var6);
        }
        this.field40 = arg1;
        this.field39 = arg2 == null ? new class462() : arg2;
    }

    @ObfuscatedName("au.ap(I)Lrl;")
    public class462 method82() {
        return this.field39;
    }

    @ObfuscatedName("au.aw(Ltg;B)V")
    public void method83(class504 arg0) {
        if (this.field45) {
            return;
        }
        if (arg0 == null) {
            this.field39.method8160("Content-Type");
            this.field42 = null;
            return;
        }
        this.field42 = arg0;
        if (this.field42.method8610() == null) {
            this.field39.method8179();
        } else {
            this.field39.method8164(this.field42.method8610());
        }
    }

    @ObfuscatedName("au.ak(I)V")
    public void method99() throws ProtocolException {
        if (this.field45) {
            return;
        }
        this.field46.setRequestMethod(this.field40.method68());
        this.field39.method8157(this.field46);
        if (this.field40.method74() && this.field42 != null) {
            this.field46.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field42.method8609());
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
        this.field46.setConnectTimeout(this.field44);
        this.field46.setInstanceFollowRedirects(this.field43);
        this.field45 = true;
    }

    @ObfuscatedName("au.aj(I)Z")
    public boolean method85() throws IOException {
        if (!this.field45) {
            this.method99();
        }
        this.field46.connect();
        return this.field46.getResponseCode() == -1;
    }

    @ObfuscatedName("au.ai(B)Lav;")
    public class21 method86() {
        try {
            if (!this.field45 || this.field46.getResponseCode() == -1) {
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
