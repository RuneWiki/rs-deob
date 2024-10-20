package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("aq")
public class class11 {

    @ObfuscatedName("aq.ab")
    public final HttpsURLConnection field47;

    @ObfuscatedName("aq.ay")
    public final class459 field46;

    @ObfuscatedName("aq.an")
    public final class10 field43;

    @ObfuscatedName("aq.au")
    public class495 field44;

    @ObfuscatedName("aq.ax")
    public boolean field45;

    @ObfuscatedName("aq.ao")
    public boolean field41;

    @ObfuscatedName("aq.am")
    public int field42;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class459(), arg2);
    }

    public class11(URL arg0, class10 arg1, class459 arg2, boolean arg3) throws IOException {
        this.field45 = false;
        this.field41 = false;
        this.field42 = 300000;
        if (!arg1.method62()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method63());
        }
        this.field47 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            HttpsURLConnection var5 = this.field47;
            if (Statics.field60 == null) {
                Statics.field60 = new class16();
            }
            class16 var6 = Statics.field60;
            var5.setSSLSocketFactory(var6);
        }
        this.field43 = arg1;
        this.field46 = arg2 == null ? new class459() : arg2;
    }

    @ObfuscatedName("aq.ab(I)Lrf;")
    public class459 method76() {
        return this.field46;
    }

    @ObfuscatedName("aq.ay(Ltu;I)V")
    public void method77(class495 arg0) {
        if (this.field45) {
            return;
        }
        if (arg0 == null) {
            this.field46.method7806("Content-Type");
            this.field44 = null;
            return;
        }
        this.field44 = arg0;
        if (this.field44.method8173() == null) {
            this.field46.method7782();
        } else {
            this.field46.method7807(this.field44.method8173());
        }
    }

    @ObfuscatedName("aq.an(I)V")
    public void method85() throws ProtocolException {
        if (this.field45) {
            return;
        }
        this.field47.setRequestMethod(this.field43.method63());
        this.field46.method7774(this.field47);
        if (this.field43.method68() && this.field44 != null) {
            this.field47.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field44.method8177());
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
        this.field47.setConnectTimeout(this.field42);
        this.field47.setInstanceFollowRedirects(this.field41);
        this.field45 = true;
    }

    @ObfuscatedName("aq.au(I)Z")
    public boolean method95() throws IOException {
        if (!this.field45) {
            this.method85();
        }
        this.field47.connect();
        return this.field47.getResponseCode() == -1;
    }

    @ObfuscatedName("aq.ax(I)Lar;")
    public class21 method80() {
        try {
            if (!this.field45 || this.field47.getResponseCode() == -1) {
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
