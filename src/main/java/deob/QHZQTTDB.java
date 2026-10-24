package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("QHZQTTDB")
public final class QHZQTTDB implements Runnable {

	@ObfuscatedName("QHZQTTDB.e")
	public boolean field1125 = false;

	@ObfuscatedName("QHZQTTDB.j")
	public boolean field1130 = false;

	@ObfuscatedName("QHZQTTDB.k")
	public boolean field1131 = false;

	@ObfuscatedName("QHZQTTDB.f")
	public XHFSQKPU field1126;

	@ObfuscatedName("QHZQTTDB.d")
	public Socket field1124;

	@ObfuscatedName("QHZQTTDB.b")
	public InputStream field1122;

	@ObfuscatedName("QHZQTTDB.c")
	public OutputStream field1123;

	@ObfuscatedName("QHZQTTDB.h")
	public int field1128;

	@ObfuscatedName("QHZQTTDB.i")
	public int field1129;

	@ObfuscatedName("QHZQTTDB.g")
	public byte[] field1127;

	public QHZQTTDB(Socket arg0, XHFSQKPU arg1) throws IOException {
		field1126 = arg1;
		field1124 = arg0;
		field1124.setSoTimeout(30000);
		field1124.setTcpNoDelay(true);
		field1122 = field1124.getInputStream();
		field1123 = field1124.getOutputStream();
	}

	@ObfuscatedName("QHZQTTDB.a()V")
	public void method469() {
		field1125 = true;

		try {
			if (field1122 != null) {
				field1122.close();
			}

			if (field1123 != null) {
				field1123.close();
			}

			if (field1124 != null) {
				field1124.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1130 = false;

		synchronized (this) {
			notify();
		}

		field1127 = null;
	}

	@ObfuscatedName("QHZQTTDB.b()I")
	public int method470() throws IOException {
		if (field1125) {
			return 0;
		}

		return field1122.read();
	}

	@ObfuscatedName("QHZQTTDB.c()I")
	public int method471() throws IOException {
		if (field1125) {
			return 0;
		}

		return field1122.available();
	}

	@ObfuscatedName("QHZQTTDB.a([BII)V")
	public void method472(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1125) {
			while (arg2 > 0) {
				int var4 = field1122.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("QHZQTTDB.a([BIII)V")
	public void method473(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1125) {
			if (field1131) {
				field1131 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1127 == null) {
				field1127 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1127[field1129] = arg0[arg1 + var5];
					field1129 = (field1129 + 1) % 5000;
					if ((field1128 + 4900) % 5000 == field1129) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1130) {
					field1130 = true;
					field1126.method129(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1130) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1129 == field1128) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1130) {
					return;
				}

				var2 = field1128;

				if (field1129 >= field1128) {
					var3 = field1129 - field1128;
				} else {
					var3 = 5000 - field1128;
				}
			}

			if (var3 > 0) {
				try {
					field1123.write(field1127, var2, var3);
				} catch (IOException var7) {
					field1131 = true;
				}

				field1128 = (field1128 + var3) % 5000;
				try {
					if (field1129 == field1128) {
						field1123.flush();
					}
				} catch (IOException var6) {
					field1131 = true;
				}
			}
		}
	}

	@ObfuscatedName("QHZQTTDB.a(Z)V")
	public void method474() {
		System.out.println("dummy:" + field1125);
		System.out.println("tcycl:" + field1128);
		System.out.println("tnum:" + field1129);
		System.out.println("writer:" + field1130);
		System.out.println("ioerror:" + field1131);

		try {
			System.out.println("available:" + method471());
		} catch (IOException var1) {
		}
	}
}
