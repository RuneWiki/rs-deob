package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("al")
public class class11 {

    @ObfuscatedName("al.ac")
    public final HttpsURLConnection field40;

    @ObfuscatedName("al.ae")
    public final class461 field43;

    @ObfuscatedName("al.ag")
    public final class10 field42;

    @ObfuscatedName("al.am")
    public class497 field44;

    @ObfuscatedName("al.ax")
    public boolean field41;

    @ObfuscatedName("al.aq")
    public boolean field45;

    @ObfuscatedName("al.af")
    public int field46;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class461(), arg2);
    }

    public class11(URL arg0, class10 arg1, class461 arg2, boolean arg3) throws IOException {
        this.field41 = false;
        this.field45 = false;
        this.field46 = 300000;
        if (!arg1.method67()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method66());
        }
        this.field40 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field40.setSSLSocketFactory(class16.method181());
        }
        this.field42 = arg1;
        this.field43 = arg2 == null ? new class461() : arg2;
    }

    @ObfuscatedName("al.ac(I)Lrf;")
    public class461 method78() {
        return this.field43;
    }

    @ObfuscatedName("al.ae(Ltz;I)V")
    public void method86(class497 arg0) {
        if (this.field41) {
            return;
        }
        if (arg0 == null) {
            this.field43.method7908("Content-Type");
            this.field44 = null;
            return;
        }
        this.field44 = arg0;
        if (this.field44.method8312() == null) {
            this.field43.method7912();
        } else {
            this.field43.method7929(this.field44.method8312());
        }
    }

    @ObfuscatedName("al.ag(I)V")
    public void method77() throws ProtocolException {
        if (this.field41) {
            return;
        }
        this.field40.setRequestMethod(this.field42.method66());
        this.field43.method7921(this.field40);
        if (this.field42.method69() && this.field44 != null) {
            this.field40.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field44.method8311());
                var1.writeTo(this.field40.getOutputStream());
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
        this.field40.setConnectTimeout(this.field46);
        this.field40.setInstanceFollowRedirects(this.field45);
        this.field41 = true;
    }

    @ObfuscatedName("al.am(I)Z")
    public boolean method80() throws IOException {
        if (!this.field41) {
            this.method77();
        }
        this.field40.connect();
        return this.field40.getResponseCode() == -1;
    }

    @ObfuscatedName("al.ax(B)Lay;")
    public class21 method79() {
        try {
            if (!this.field41 || this.field40.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field40.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field40);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field40.disconnect();
        }
        return var4;
    }
}
