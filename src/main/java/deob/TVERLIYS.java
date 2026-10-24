package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("TVERLIYS")
public final class TVERLIYS implements Runnable {

	@ObfuscatedName("TVERLIYS.e")
	public boolean field1267 = false;

	@ObfuscatedName("TVERLIYS.j")
	public boolean field1272 = false;

	@ObfuscatedName("TVERLIYS.k")
	public boolean field1273 = false;

	@ObfuscatedName("TVERLIYS.f")
	public HJHAUOBE field1268;

	@ObfuscatedName("TVERLIYS.d")
	public Socket field1266;

	@ObfuscatedName("TVERLIYS.b")
	public InputStream field1264;

	@ObfuscatedName("TVERLIYS.c")
	public OutputStream field1265;

	@ObfuscatedName("TVERLIYS.h")
	public int field1270;

	@ObfuscatedName("TVERLIYS.i")
	public int field1271;

	@ObfuscatedName("TVERLIYS.g")
	public byte[] field1269;

	public TVERLIYS(Socket arg0, HJHAUOBE arg1) throws IOException {
		field1268 = arg1;
		field1266 = arg0;
		field1266.setSoTimeout(30000);
		field1266.setTcpNoDelay(true);
		field1264 = field1266.getInputStream();
		field1265 = field1266.getOutputStream();
	}

	@ObfuscatedName("TVERLIYS.a()V")
	public void method464() {
		field1267 = true;

		try {
			if (field1264 != null) {
				field1264.close();
			}

			if (field1265 != null) {
				field1265.close();
			}

			if (field1266 != null) {
				field1266.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1272 = false;

		synchronized (this) {
			notify();
		}

		field1269 = null;
	}

	@ObfuscatedName("TVERLIYS.b()I")
	public int method465() throws IOException {
		if (field1267) {
			return 0;
		}

		return field1264.read();
	}

	@ObfuscatedName("TVERLIYS.c()I")
	public int method466() throws IOException {
		if (field1267) {
			return 0;
		}

		return field1264.available();
	}

	@ObfuscatedName("TVERLIYS.a([BII)V")
	public void method467(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1267) {
			while (arg2 > 0) {
				int var4 = field1264.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("TVERLIYS.a(II[BI)V")
	public void method468(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1267) {
			if (field1273) {
				field1273 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1269 == null) {
				field1269 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1269[field1271] = arg1[arg0 + var5];
					field1271 = (field1271 + 1) % 5000;
					if ((field1270 + 4900) % 5000 == field1271) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1272) {
					field1272 = true;
					field1268.method139(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1272) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1271 == field1270) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1272) {
					return;
				}

				var2 = field1270;

				if (field1271 >= field1270) {
					var3 = field1271 - field1270;
				} else {
					var3 = 5000 - field1270;
				}
			}

			if (var3 > 0) {
				try {
					field1265.write(field1269, var2, var3);
				} catch (IOException var7) {
					field1273 = true;
				}

				field1270 = (field1270 + var3) % 5000;
				try {
					if (field1271 == field1270) {
						field1265.flush();
					}
				} catch (IOException var6) {
					field1273 = true;
				}
			}
		}
	}

	@ObfuscatedName("TVERLIYS.a(I)V")
	public void method469() {
		System.out.println("dummy:" + field1267);
		System.out.println("tcycl:" + field1270);
		System.out.println("tnum:" + field1271);
		System.out.println("writer:" + field1272);
		System.out.println("ioerror:" + field1273);

		try {
			System.out.println("available:" + method466());
		} catch (IOException var1) {
		}
	}
}
