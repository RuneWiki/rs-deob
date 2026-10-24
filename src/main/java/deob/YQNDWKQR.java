package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("YQNDWKQR")
public final class YQNDWKQR implements Runnable {

	@ObfuscatedName("YQNDWKQR.f")
	public boolean field1453 = false;

	@ObfuscatedName("YQNDWKQR.k")
	public boolean field1458 = false;

	@ObfuscatedName("YQNDWKQR.l")
	public boolean field1459 = false;

	@ObfuscatedName("YQNDWKQR.g")
	public AMZQHNGA field1454;

	@ObfuscatedName("YQNDWKQR.e")
	public Socket field1452;

	@ObfuscatedName("YQNDWKQR.c")
	public InputStream field1450;

	@ObfuscatedName("YQNDWKQR.d")
	public OutputStream field1451;

	@ObfuscatedName("YQNDWKQR.i")
	public int field1456;

	@ObfuscatedName("YQNDWKQR.j")
	public int field1457;

	@ObfuscatedName("YQNDWKQR.h")
	public byte[] field1455;

	public YQNDWKQR(AMZQHNGA arg0, Socket arg1) throws IOException {
		field1454 = arg0;
		field1452 = arg1;
		field1452.setSoTimeout(30000);
		field1452.setTcpNoDelay(true);
		field1450 = field1452.getInputStream();
		field1451 = field1452.getOutputStream();
	}

	@ObfuscatedName("YQNDWKQR.a()V")
	public void method583() {
		field1453 = true;

		try {
			if (field1450 != null) {
				field1450.close();
			}

			if (field1451 != null) {
				field1451.close();
			}

			if (field1452 != null) {
				field1452.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1458 = false;

		synchronized (this) {
			notify();
		}

		field1455 = null;
	}

	@ObfuscatedName("YQNDWKQR.b()I")
	public int method584() throws IOException {
		if (field1453) {
			return 0;
		}

		return field1450.read();
	}

	@ObfuscatedName("YQNDWKQR.c()I")
	public int method585() throws IOException {
		if (field1453) {
			return 0;
		}

		return field1450.available();
	}

	@ObfuscatedName("YQNDWKQR.a([BII)V")
	public void method586(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1453) {
			while (arg2 > 0) {
				int var4 = field1450.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("YQNDWKQR.a(I[BII)V")
	public void method587(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1453) {
			if (field1459) {
				field1459 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1455 == null) {
				field1455 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1455[field1457] = arg0[arg1 + var5];
					field1457 = (field1457 + 1) % 5000;
					if ((field1456 + 4900) % 5000 == field1457) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1458) {
					field1458 = true;
					field1454.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1458) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1457 == field1456) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1458) {
					return;
				}

				var2 = field1456;

				if (field1457 >= field1456) {
					var3 = field1457 - field1456;
				} else {
					var3 = 5000 - field1456;
				}
			}

			if (var3 > 0) {
				try {
					field1451.write(field1455, var2, var3);
				} catch (IOException var7) {
					field1459 = true;
				}

				field1456 = (field1456 + var3) % 5000;
				try {
					if (field1457 == field1456) {
						field1451.flush();
					}
				} catch (IOException var6) {
					field1459 = true;
				}
			}
		}
	}

	@ObfuscatedName("YQNDWKQR.a(B)V")
	public void method588() {
		System.out.println("dummy:" + field1453);
		System.out.println("tcycl:" + field1456);
		System.out.println("tnum:" + field1457);
		System.out.println("writer:" + field1458);
		System.out.println("ioerror:" + field1459);

		try {
			System.out.println("available:" + method585());
		} catch (IOException var1) {
		}
	}
}
