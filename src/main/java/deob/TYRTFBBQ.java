package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("TYRTFBBQ")
public final class TYRTFBBQ implements Runnable {

	@ObfuscatedName("TYRTFBBQ.f")
	public boolean field1439 = false;

	@ObfuscatedName("TYRTFBBQ.k")
	public boolean field1444 = false;

	@ObfuscatedName("TYRTFBBQ.l")
	public boolean field1445 = false;

	@ObfuscatedName("TYRTFBBQ.g")
	public NZBGSSTU field1440;

	@ObfuscatedName("TYRTFBBQ.e")
	public Socket field1438;

	@ObfuscatedName("TYRTFBBQ.c")
	public InputStream field1436;

	@ObfuscatedName("TYRTFBBQ.d")
	public OutputStream field1437;

	@ObfuscatedName("TYRTFBBQ.i")
	public int field1442;

	@ObfuscatedName("TYRTFBBQ.j")
	public int field1443;

	@ObfuscatedName("TYRTFBBQ.h")
	public byte[] field1441;

	public TYRTFBBQ(NZBGSSTU arg0, Socket arg1) throws IOException {
		field1440 = arg0;
		field1438 = arg1;
		field1438.setSoTimeout(30000);
		field1438.setTcpNoDelay(true);
		field1436 = field1438.getInputStream();
		field1437 = field1438.getOutputStream();
	}

	@ObfuscatedName("TYRTFBBQ.a()V")
	public void method574() {
		field1439 = true;

		try {
			if (field1436 != null) {
				field1436.close();
			}

			if (field1437 != null) {
				field1437.close();
			}

			if (field1438 != null) {
				field1438.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1444 = false;

		synchronized (this) {
			notify();
		}

		field1441 = null;
	}

	@ObfuscatedName("TYRTFBBQ.b()I")
	public int method575() throws IOException {
		if (field1439) {
			return 0;
		}

		return field1436.read();
	}

	@ObfuscatedName("TYRTFBBQ.c()I")
	public int method576() throws IOException {
		if (field1439) {
			return 0;
		}

		return field1436.available();
	}

	@ObfuscatedName("TYRTFBBQ.a([BII)V")
	public void method577(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1439) {
			while (arg2 > 0) {
				int var4 = field1436.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("TYRTFBBQ.a(III[B)V")
	public void method578(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field1439) {
			if (field1445) {
				field1445 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1441 == null) {
				field1441 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1441[field1443] = arg2[arg0 + var5];
					field1443 = (field1443 + 1) % 5000;
					if ((field1442 + 4900) % 5000 == field1443) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1444) {
					field1444 = true;
					field1440.method169(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1444) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1443 == field1442) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1444) {
					return;
				}

				var2 = field1442;

				if (field1443 >= field1442) {
					var3 = field1443 - field1442;
				} else {
					var3 = 5000 - field1442;
				}
			}

			if (var3 > 0) {
				try {
					field1437.write(field1441, var2, var3);
				} catch (IOException var7) {
					field1445 = true;
				}

				field1442 = (field1442 + var3) % 5000;
				try {
					if (field1443 == field1442) {
						field1437.flush();
					}
				} catch (IOException var6) {
					field1445 = true;
				}
			}
		}
	}

	@ObfuscatedName("TYRTFBBQ.a(I)V")
	public void method579() {
		System.out.println("dummy:" + field1439);
		System.out.println("tcycl:" + field1442);
		System.out.println("tnum:" + field1443);
		System.out.println("writer:" + field1444);
		System.out.println("ioerror:" + field1445);

		try {
			System.out.println("available:" + method576());
		} catch (IOException var1) {
		}
	}
}
