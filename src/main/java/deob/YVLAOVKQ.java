package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("YVLAOVKQ")
public final class YVLAOVKQ implements Runnable {

	@ObfuscatedName("YVLAOVKQ.f")
	public boolean field1457 = false;

	@ObfuscatedName("YVLAOVKQ.k")
	public boolean field1462 = false;

	@ObfuscatedName("YVLAOVKQ.l")
	public boolean field1463 = false;

	@ObfuscatedName("YVLAOVKQ.g")
	public CMOCHGYM field1458;

	@ObfuscatedName("YVLAOVKQ.e")
	public Socket field1456;

	@ObfuscatedName("YVLAOVKQ.c")
	public InputStream field1454;

	@ObfuscatedName("YVLAOVKQ.d")
	public OutputStream field1455;

	@ObfuscatedName("YVLAOVKQ.i")
	public int field1460;

	@ObfuscatedName("YVLAOVKQ.j")
	public int field1461;

	@ObfuscatedName("YVLAOVKQ.h")
	public byte[] field1459;

	public YVLAOVKQ(CMOCHGYM arg0, Socket arg1) throws IOException {
		field1458 = arg0;
		field1456 = arg1;
		field1456.setSoTimeout(30000);
		field1456.setTcpNoDelay(true);
		field1454 = field1456.getInputStream();
		field1455 = field1456.getOutputStream();
	}

	@ObfuscatedName("YVLAOVKQ.a()V")
	public void method578() {
		field1457 = true;

		try {
			if (field1454 != null) {
				field1454.close();
			}

			if (field1455 != null) {
				field1455.close();
			}

			if (field1456 != null) {
				field1456.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1462 = false;

		synchronized (this) {
			notify();
		}

		field1459 = null;
	}

	@ObfuscatedName("YVLAOVKQ.b()I")
	public int method579() throws IOException {
		if (field1457) {
			return 0;
		}

		return field1454.read();
	}

	@ObfuscatedName("YVLAOVKQ.c()I")
	public int method580() throws IOException {
		if (field1457) {
			return 0;
		}

		return field1454.available();
	}

	@ObfuscatedName("YVLAOVKQ.a([BII)V")
	public void method581(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1457) {
			while (arg2 > 0) {
				int var4 = field1454.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("YVLAOVKQ.a([BIII)V")
	public void method582(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1457) {
			if (field1463) {
				field1463 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1459 == null) {
				field1459 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1459[field1461] = arg0[arg2 + var5];
					field1461 = (field1461 + 1) % 5000;
					if ((field1460 + 4900) % 5000 == field1461) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1462) {
					field1462 = true;
					field1458.method74(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1462) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1461 == field1460) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1462) {
					return;
				}

				var2 = field1460;

				if (field1461 >= field1460) {
					var3 = field1461 - field1460;
				} else {
					var3 = 5000 - field1460;
				}
			}

			if (var3 > 0) {
				try {
					field1455.write(field1459, var2, var3);
				} catch (IOException var7) {
					field1463 = true;
				}

				field1460 = (field1460 + var3) % 5000;
				try {
					if (field1461 == field1460) {
						field1455.flush();
					}
				} catch (IOException var6) {
					field1463 = true;
				}
			}
		}
	}

	@ObfuscatedName("YVLAOVKQ.a(Z)V")
	public void method583() {
		System.out.println("dummy:" + field1457);
		System.out.println("tcycl:" + field1460);
		System.out.println("tnum:" + field1461);
		System.out.println("writer:" + field1462);
		System.out.println("ioerror:" + field1463);

		try {
			System.out.println("available:" + method580());
		} catch (IOException var1) {
		}
	}
}
