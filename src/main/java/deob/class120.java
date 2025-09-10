package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("el")
public abstract class class120 implements Runnable {

	@ObfuscatedName("el.af")
	public final Thread field1550 = new Thread(this);

	@ObfuscatedName("el.aw")
	public volatile boolean field1553;

	@ObfuscatedName("el.at")
	public Queue field1551 = new LinkedList();

	@ObfuscatedName("el.ac")
	public int field1552;

	public class120(int arg0) {
		this.field1550.setPriority(1);
		this.field1550.start();
		this.field1552 = arg0;
	}

	public void run() {
		while (!this.field1553) {
			try {
				class122 var2;
				synchronized (this) {
					var2 = (class122) this.field1551.poll();
					if (var2 == null) {
						try {
							this.wait();
						} catch (InterruptedException var6) {
						}
						continue;
					}
				}
				this.method3350(var2);
			} catch (Exception var8) {
				class617.method9413(null, var8);
			}
		}
	}

	@ObfuscatedName("el.aw(Ljava/net/URLConnection;B)I")
	public int method3365(URLConnection arg0) {
		int var2 = class122.field1559;
		if (arg0 != null) {
			try {
				if (arg0 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection) arg0).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}
		return var2;
	}

	@ObfuscatedName("el.at(Ljava/net/URLConnection;I)V")
	public void method3352(URLConnection arg0) {
		arg0.setConnectTimeout(5000);
		arg0.setReadTimeout(5000);
		arg0.setUseCaches(false);
		arg0.setRequestProperty("Connection", "close");
		arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1552);
	}

	@ObfuscatedName("el.ac(Ljava/net/URLConnection;Lea;I)V")
	public void method3353(URLConnection arg0, class122 arg1) {
		DataInputStream var3 = null;
		try {
			int var4 = arg0.getContentLength();
			var3 = new DataInputStream(arg0.getInputStream());
			byte[] var5;
			if (var4 >= 0) {
				var5 = new byte[var4];
				var3.readFully(var5);
			} else {
				var5 = new byte[0];
				byte[] var6 = class483.method3520(5000);
				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var5.length + var7];
					System.arraycopy(var5, 0, var8, 0, var5.length);
					System.arraycopy(var6, 0, var8, var5.length, var7);
					var5 = var8;
				}
				class483.method6335(var6);
			}
			arg1.field1561 = var5;
		} catch (IOException var16) {
			arg1.field1561 = null;
		} finally {
			arg1.field1558 = this.method3365(arg0);
		}
		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var15) {
			}
		}
	}

	@ObfuscatedName("el.ap(Ljava/net/URL;S)Lea;")
	public class122 method3354(URL arg0) {
		class122 var2 = new class122(arg0);
		synchronized (this) {
			this.field1551.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("el.aq(S)V")
	public void method3369() {
		this.field1553 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.field1550.join();
		} catch (InterruptedException var5) {
		}
	}

	@ObfuscatedName("el.af(Lea;I)V")
	public abstract void method3350(class122 arg0) throws IOException;
}
