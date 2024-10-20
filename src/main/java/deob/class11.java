package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ak")
public class class11 {

    @ObfuscatedName("ak.aq")
    public final HttpsURLConnection field41;

    @ObfuscatedName("ak.aw")
    public final class439 field38;

    @ObfuscatedName("ak.al")
    public final class10 field39;

    @ObfuscatedName("ak.ai")
    public class481 field40;

    @ObfuscatedName("ak.ar")
    public boolean field43;

    @ObfuscatedName("ak.as")
    public boolean field37;

    @ObfuscatedName("ak.aa")
    public int field42;

    public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
        this(arg0, arg1, new class439(), arg2);
    }

    public class11(URL arg0, class10 arg1, class439 arg2, boolean arg3) throws IOException {
        this.field43 = false;
        this.field37 = false;
        this.field42 = 300000;
        if (!arg1.method61()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method62());
        }
        this.field41 = (HttpsURLConnection) arg0.openConnection();
        if (!arg3) {
            this.field41.setSSLSocketFactory(class16.method162());
        }
        this.field39 = arg1;
        this.field38 = arg2 == null ? new class439() : arg2;
    }

    @ObfuscatedName("ak.aq(I)Lqw;")
    public class439 method80() {
        return this.field38;
    }

    @ObfuscatedName("ak.aw(Lsz;I)V")
    public void method81(class481 arg0) {
        if (this.field43) {
            return;
        }
        if (arg0 == null) {
            this.field38.method7393("Content-Type");
            this.field40 = null;
            return;
        }
        this.field40 = arg0;
        if (this.field40.method7947() == null) {
            this.field38.method7404();
        } else {
            this.field38.method7397(this.field40.method7947());
        }
    }

    @ObfuscatedName("ak.al(I)V")
    public void method82() throws ProtocolException {
        if (this.field43) {
            return;
        }
        this.field41.setRequestMethod(this.field39.method62());
        this.field38.method7390(this.field41);
        if (this.field39.method65() && this.field40 != null) {
            this.field41.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            try {
                var1.write(this.field40.method7944());
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
        this.field41.setConnectTimeout(this.field42);
        this.field41.setInstanceFollowRedirects(this.field37);
        this.field43 = true;
    }

    @ObfuscatedName("ak.ai(I)Z")
    public boolean method87() throws IOException {
        if (!this.field43) {
            this.method82();
        }
        this.field41.connect();
        return this.field41.getResponseCode() == -1;
    }

    @ObfuscatedName("ak.ar(B)Lay;")
    public class21 method84() {
        try {
            if (!this.field43 || this.field41.getResponseCode() == -1) {
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
