package deob;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ai")
public class class11 {

	@ObfuscatedName("ai.af")
	public final HttpsURLConnection field49;

	@ObfuscatedName("ai.aw")
	public final class485 field42;

	@ObfuscatedName("ai.at")
	public final class10 field44;

	@ObfuscatedName("ai.ac")
	public class533 field43;

	@ObfuscatedName("ai.ap")
	public boolean field46;

	@ObfuscatedName("ai.aq")
	public boolean field50;

	@ObfuscatedName("ai.ao")
	public int field48;

	public class11(URL arg0, class10 arg1, boolean arg2) throws IOException {
		this(arg0, arg1, new class485(), arg2);
	}

	public class11(URL arg0, class10 arg1, class485 arg2, boolean arg3) throws IOException {
		this.field46 = false;
		this.field50 = false;
		this.field48 = 300000;
		if (!arg1.method75()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + arg1.method66());
		}
		this.field49 = (HttpsURLConnection) arg0.openConnection();
		if (!arg3) {
			this.field49.setSSLSocketFactory(class16.method196());
		}
		this.field44 = arg1;
		this.field42 = arg2 == null ? new class485() : arg2;
	}

	@ObfuscatedName("ai.af(B)Lsv;")
	public class485 method100() {
		return this.field42;
	}

	@ObfuscatedName("ai.aw(Luz;I)V")
	public void method82(class533 arg0) {
		if (this.field46) {
			return;
		}
		if (arg0 == null) {
			this.field42.method9059("Content-Type");
			this.field43 = null;
			return;
		}
		this.field43 = arg0;
		if (this.field43.method9706() == null) {
			this.field42.method9065();
		} else {
			this.field42.method9062(this.field43.method9706());
		}
	}

	@ObfuscatedName("ai.at(B)V")
	public void method83() throws ProtocolException {
		if (this.field46) {
			return;
		}
		this.field49.setRequestMethod(this.field44.method66());
		this.field42.method9056(this.field49);
		if (this.field44.method67() && this.field43 != null) {
			this.field49.setDoOutput(true);
			ByteArrayOutputStream var1 = new ByteArrayOutputStream();
			try {
				var1.write(this.field43.method9702());
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
		this.field49.setConnectTimeout(this.field48);
		this.field49.setInstanceFollowRedirects(this.field50);
		this.field46 = true;
	}

	@ObfuscatedName("ai.ac(I)Z")
	public boolean method101() throws IOException {
		if (!this.field46) {
			this.method83();
		}
		this.field49.connect();
		return this.field49.getResponseCode() == -1;
	}

	@ObfuscatedName("ai.ap(B)Lah;")
	public class21 method80() {
		try {
			if (!this.field46 || this.field49.getResponseCode() == -1) {
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
