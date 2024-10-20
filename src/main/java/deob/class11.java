package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ao")
public class class11 {

    @ObfuscatedName("ao.at")
    public final HttpsURLConnection field41;

    @ObfuscatedName("ao.an")
    public final class408 field43;

    @ObfuscatedName("ao.av")
    public final class10 field42;

    @ObfuscatedName("ao.as")
    public class450 field44;

    @ObfuscatedName("ao.ax")
    public boolean field45;

    @ObfuscatedName("ao.ap")
    public boolean field46;

    @ObfuscatedName("ao.ab")
    public int field47;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class408(), arg2);
    }

    public class11(URL arg0, class10 arg1, class408 arg2, boolean arg3) throws IOException {
        this.field45 = false;
        this.field46 = false;
        this.field47 = 300000;
        if (!arg1.method67()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method76());
        }
        this.field41 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field41.setSSLSocketFactory(class16.method199());
        }
        this.field42 = arg1;
        this.field43 = arg2 == null ? new class408() : arg2;
    }

    @ObfuscatedName("ao.at(B)Lpj;")
    public class408 method86() {
        return this.field43;
    }

    @ObfuscatedName("ao.an(Lrp;B)V")
    public void method84(class450 arg0) {
        if (this.field45) {
            return;
        }
        if (arg0 == null) {
            this.field43.method6988("Content-Type");
            this.field44 = null;
            return;
        }
        this.field44 = arg0;
        if (this.field44.method7523() == null) {
            this.field43.method6990();
        } else {
            this.field43.method6992(this.field44.method7523());
        }
    }

    @ObfuscatedName("ao.av(S)V")
    public void method80() throws ProtocolException {
        if (this.field45) {
            return;
        }
        this.field41.setRequestMethod(this.field42.method76());
        this.field43.method6985(this.field41);
        if (this.field42.method66() && this.field44 != null) {
            this.field41.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field44.method7522());
                var1.writeTo(this.field41.getOutputStream());
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
        this.field41.setConnectTimeout(this.field47);
        this.field41.setInstanceFollowRedirects(this.field46);
        this.field45 = true;
    }

    @ObfuscatedName("ao.as(I)Z")
    public boolean method94() throws IOException {
        if (!this.field45) {
            this.method80();
        }
        this.field41.connect();
        return this.field41.getResponseCode() == -1;
    }

    @ObfuscatedName("ao.ax(B)Lai;")
    public class21 method88() {
        try {
            if (!this.field45 || this.field41.getResponseCode() == -1) {
                return new class21("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field41.disconnect();
            return new class21("Error decoding REST response code: " + var11.getMessage());
        }
        class21 var4;
        try {
            class21 var2 = new class21(this.field41);
            return var2;
        } catch (IOException var9) {
            var4 = new class21("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field41.disconnect();
        }
        return var4;
    }
}
