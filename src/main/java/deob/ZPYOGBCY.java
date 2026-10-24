package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ZPYOGBCY")
public final class ZPYOGBCY implements Runnable {

	@ObfuscatedName("ZPYOGBCY.e")
	public boolean field1495 = false;

	@ObfuscatedName("ZPYOGBCY.j")
	public boolean field1500 = false;

	@ObfuscatedName("ZPYOGBCY.k")
	public boolean field1501 = false;

	@ObfuscatedName("ZPYOGBCY.f")
	public SXKUAOFD field1496;

	@ObfuscatedName("ZPYOGBCY.d")
	public Socket field1494;

	@ObfuscatedName("ZPYOGBCY.b")
	public InputStream field1492;

	@ObfuscatedName("ZPYOGBCY.c")
	public OutputStream field1493;

	@ObfuscatedName("ZPYOGBCY.h")
	public int field1498;

	@ObfuscatedName("ZPYOGBCY.i")
	public int field1499;

	@ObfuscatedName("ZPYOGBCY.g")
	public byte[] field1497;

	public ZPYOGBCY(Socket arg0, SXKUAOFD arg1) throws IOException {
		field1496 = arg1;
		field1494 = arg0;
		field1494.setSoTimeout(30000);
		field1494.setTcpNoDelay(true);
		field1492 = field1494.getInputStream();
		field1493 = field1494.getOutputStream();
	}

	@ObfuscatedName("ZPYOGBCY.a()V")
	public void method586() {
		field1495 = true;

		try {
			if (field1492 != null) {
				field1492.close();
			}

			if (field1493 != null) {
				field1493.close();
			}

			if (field1494 != null) {
				field1494.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1500 = false;

		synchronized (this) {
			notify();
		}

		field1497 = null;
	}

	@ObfuscatedName("ZPYOGBCY.b()I")
	public int method587() throws IOException {
		if (field1495) {
			return 0;
		}

		return field1492.read();
	}

	@ObfuscatedName("ZPYOGBCY.c()I")
	public int method588() throws IOException {
		if (field1495) {
			return 0;
		}

		return field1492.available();
	}

	@ObfuscatedName("ZPYOGBCY.a([BII)V")
	public void method589(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1495) {
			while (arg2 > 0) {
				int var4 = field1492.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("ZPYOGBCY.a(I[BII)V")
	public void method590(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1495) {
			if (field1501) {
				field1501 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1497 == null) {
				field1497 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field1497[field1499] = arg1[arg2 + var5];
					field1499 = (field1499 + 1) % 5000;
					if ((field1498 + 4900) % 5000 == field1499) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1500) {
					field1500 = true;
					field1496.method180(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1500) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1499 == field1498) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1500) {
					return;
				}

				var2 = field1498;

				if (field1499 >= field1498) {
					var3 = field1499 - field1498;
				} else {
					var3 = 5000 - field1498;
				}
			}

			if (var3 > 0) {
				try {
					field1493.write(field1497, var2, var3);
				} catch (IOException var7) {
					field1501 = true;
				}

				field1498 = (field1498 + var3) % 5000;
				try {
					if (field1499 == field1498) {
						field1493.flush();
					}
				} catch (IOException var6) {
					field1501 = true;
				}
			}
		}
	}

	@ObfuscatedName("ZPYOGBCY.a(I)V")
	public void method591() {
		System.out.println("dummy:" + field1495);
		System.out.println("tcycl:" + field1498);
		System.out.println("tnum:" + field1499);
		System.out.println("writer:" + field1500);
		System.out.println("ioerror:" + field1501);

		try {
			System.out.println("available:" + method588());
		} catch (IOException var1) {
		}
	}
}
