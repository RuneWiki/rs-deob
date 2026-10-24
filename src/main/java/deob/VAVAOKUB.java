package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("VAVAOKUB")
public final class VAVAOKUB implements Runnable {

	@ObfuscatedName("VAVAOKUB.f")
	public boolean field1347 = false;

	@ObfuscatedName("VAVAOKUB.k")
	public boolean field1352 = false;

	@ObfuscatedName("VAVAOKUB.l")
	public boolean field1353 = false;

	@ObfuscatedName("VAVAOKUB.g")
	public GRXJFORE field1348;

	@ObfuscatedName("VAVAOKUB.e")
	public Socket field1346;

	@ObfuscatedName("VAVAOKUB.c")
	public InputStream field1344;

	@ObfuscatedName("VAVAOKUB.d")
	public OutputStream field1345;

	@ObfuscatedName("VAVAOKUB.i")
	public int field1350;

	@ObfuscatedName("VAVAOKUB.j")
	public int field1351;

	@ObfuscatedName("VAVAOKUB.h")
	public byte[] field1349;

	public VAVAOKUB(Socket arg0, GRXJFORE arg1) throws IOException {
		field1348 = arg1;
		field1346 = arg0;
		field1346.setSoTimeout(30000);
		field1346.setTcpNoDelay(true);
		field1344 = field1346.getInputStream();
		field1345 = field1346.getOutputStream();
	}

	@ObfuscatedName("VAVAOKUB.a()V")
	public void method474() {
		field1347 = true;

		try {
			if (field1344 != null) {
				field1344.close();
			}

			if (field1345 != null) {
				field1345.close();
			}

			if (field1346 != null) {
				field1346.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1352 = false;

		synchronized (this) {
			notify();
		}

		field1349 = null;
	}

	@ObfuscatedName("VAVAOKUB.b()I")
	public int method475() throws IOException {
		if (field1347) {
			return 0;
		}

		return field1344.read();
	}

	@ObfuscatedName("VAVAOKUB.c()I")
	public int method476() throws IOException {
		if (field1347) {
			return 0;
		}

		return field1344.available();
	}

	@ObfuscatedName("VAVAOKUB.a([BII)V")
	public void method477(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1347) {
			while (arg2 > 0) {
				int var4 = field1344.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("VAVAOKUB.a([BIII)V")
	public void method478(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1347) {
			if (field1353) {
				field1353 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1349 == null) {
				field1349 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1349[field1351] = arg0[arg1 + var5];
					field1351 = (field1351 + 1) % 5000;
					if ((field1350 + 4900) % 5000 == field1351) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1352) {
					field1352 = true;
					field1348.method31(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1352) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1351 == field1350) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1352) {
					return;
				}

				var2 = field1350;

				if (field1351 >= field1350) {
					var3 = field1351 - field1350;
				} else {
					var3 = 5000 - field1350;
				}
			}

			if (var3 > 0) {
				try {
					field1345.write(field1349, var2, var3);
				} catch (IOException var7) {
					field1353 = true;
				}

				field1350 = (field1350 + var3) % 5000;
				try {
					if (field1351 == field1350) {
						field1345.flush();
					}
				} catch (IOException var6) {
					field1353 = true;
				}
			}
		}
	}

	@ObfuscatedName("VAVAOKUB.a(Z)V")
	public void method479() {
		System.out.println("dummy:" + field1347);
		System.out.println("tcycl:" + field1350);
		System.out.println("tnum:" + field1351);
		System.out.println("writer:" + field1352);
		System.out.println("ioerror:" + field1353);

		try {
			System.out.println("available:" + method476());
		} catch (IOException var1) {
		}
	}
}
