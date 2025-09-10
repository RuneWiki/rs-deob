package deob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("ey")
public class class121 extends class120 {

	@ObfuscatedName("ey.ap")
	public final boolean field1556;

	public class121(boolean arg0, int arg1) {
		super(arg1);
		this.field1556 = arg0;
	}

	@ObfuscatedName("ey.af(Lea;I)V")
	public void method3350(class122 arg0) throws IOException {
		URLConnection var2 = null;
		try {
			String var3 = arg0.field1560.getProtocol();
			if (var3.equals("http")) {
				var2 = this.method3371(arg0);
			} else if (var3.equals("https")) {
				var2 = this.method3372(arg0);
			} else {
				arg0.field1558 = class122.field1559;
				return;
			}
			this.method3353(var2, arg0);
		} catch (IOException var12) {
			arg0.field1558 = class122.field1559;
		} finally {
			if (var2 != null && var2 instanceof HttpURLConnection) {
				HttpURLConnection var9 = (HttpURLConnection) var2;
				var9.disconnect();
			}
		}
	}

	@ObfuscatedName("ey.ad(Lea;I)Ljava/net/URLConnection;")
	public URLConnection method3371(class122 arg0) throws IOException {
		URLConnection var2 = arg0.field1560.openConnection();
		this.method3352(var2);
		return var2;
	}

	@ObfuscatedName("ey.ag(Lea;B)Ljava/net/URLConnection;")
	public URLConnection method3372(class122 arg0) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection) arg0.field1560.openConnection();
		if (!this.field1556) {
			var2.setSSLSocketFactory(class16.method196());
		}
		this.method3352(var2);
		return var2;
	}
}
