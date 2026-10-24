package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("THBLNINF")
public final class THBLNINF implements Runnable {

	@ObfuscatedName("THBLNINF.g")
	public boolean field1385 = false;

	@ObfuscatedName("THBLNINF.l")
	public boolean field1390 = false;

	@ObfuscatedName("THBLNINF.m")
	public boolean field1391 = false;

	@ObfuscatedName("THBLNINF.h")
	public NHAOTYHM field1386;

	@ObfuscatedName("THBLNINF.f")
	public Socket field1384;

	@ObfuscatedName("THBLNINF.d")
	public InputStream field1382;

	@ObfuscatedName("THBLNINF.e")
	public OutputStream field1383;

	@ObfuscatedName("THBLNINF.j")
	public int field1388;

	@ObfuscatedName("THBLNINF.k")
	public int field1389;

	@ObfuscatedName("THBLNINF.i")
	public byte[] field1387;

	public THBLNINF(NHAOTYHM arg0, Socket arg1) throws IOException {
		field1386 = arg0;
		field1384 = arg1;
		field1384.setSoTimeout(30000);
		field1384.setTcpNoDelay(true);
		field1382 = field1384.getInputStream();
		field1383 = field1384.getOutputStream();
	}

	@ObfuscatedName("THBLNINF.a()V")
	public void method506() {
		field1385 = true;

		try {
			if (field1382 != null) {
				field1382.close();
			}

			if (field1383 != null) {
				field1383.close();
			}

			if (field1384 != null) {
				field1384.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1390 = false;

		synchronized (this) {
			notify();
		}

		field1387 = null;
	}

	@ObfuscatedName("THBLNINF.b()I")
	public int method507() throws IOException {
		if (field1385) {
			return 0;
		}

		return field1382.read();
	}

	@ObfuscatedName("THBLNINF.c()I")
	public int method508() throws IOException {
		if (field1385) {
			return 0;
		}

		return field1382.available();
	}

	@ObfuscatedName("THBLNINF.a([BII)V")
	public void method509(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1385) {
			while (arg2 > 0) {
				int var4 = field1382.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("THBLNINF.a(BII[B)V")
	public void method510(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field1385) {
			if (field1391) {
				field1391 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1387 == null) {
				field1387 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1387[field1389] = arg2[arg0 + var5];
					field1389 = (field1389 + 1) % 5000;
					if ((field1388 + 4900) % 5000 == field1389) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1390) {
					field1390 = true;
					field1386.method123(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1390) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1389 == field1388) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1390) {
					return;
				}

				var2 = field1388;

				if (field1389 >= field1388) {
					var3 = field1389 - field1388;
				} else {
					var3 = 5000 - field1388;
				}
			}

			if (var3 > 0) {
				try {
					field1383.write(field1387, var2, var3);
				} catch (IOException var7) {
					field1391 = true;
				}

				field1388 = (field1388 + var3) % 5000;
				try {
					if (field1389 == field1388) {
						field1383.flush();
					}
				} catch (IOException var6) {
					field1391 = true;
				}
			}
		}
	}

	@ObfuscatedName("THBLNINF.a(I)V")
	public void method511() {
		System.out.println("dummy:" + field1385);
		System.out.println("tcycl:" + field1388);
		System.out.println("tnum:" + field1389);
		System.out.println("writer:" + field1390);
		System.out.println("ioerror:" + field1391);

		try {
			System.out.println("available:" + method508());
		} catch (IOException var1) {
		}
	}
}
