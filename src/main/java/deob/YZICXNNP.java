package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("YZICXNNP")
public final class YZICXNNP implements Runnable {

	@ObfuscatedName("YZICXNNP.f")
	public boolean field1476 = false;

	@ObfuscatedName("YZICXNNP.k")
	public boolean field1481 = false;

	@ObfuscatedName("YZICXNNP.l")
	public boolean field1482 = false;

	@ObfuscatedName("YZICXNNP.g")
	public FDVCDUHZ field1477;

	@ObfuscatedName("YZICXNNP.e")
	public Socket field1475;

	@ObfuscatedName("YZICXNNP.c")
	public InputStream field1473;

	@ObfuscatedName("YZICXNNP.d")
	public OutputStream field1474;

	@ObfuscatedName("YZICXNNP.i")
	public int field1479;

	@ObfuscatedName("YZICXNNP.j")
	public int field1480;

	@ObfuscatedName("YZICXNNP.h")
	public byte[] field1478;

	public YZICXNNP(Socket arg0, FDVCDUHZ arg1) throws IOException {
		field1477 = arg1;
		field1475 = arg0;
		field1475.setSoTimeout(30000);
		field1475.setTcpNoDelay(true);
		field1473 = field1475.getInputStream();
		field1474 = field1475.getOutputStream();
	}

	@ObfuscatedName("YZICXNNP.a()V")
	public void method583() {
		field1476 = true;

		try {
			if (field1473 != null) {
				field1473.close();
			}

			if (field1474 != null) {
				field1474.close();
			}

			if (field1475 != null) {
				field1475.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1481 = false;

		synchronized (this) {
			notify();
		}

		field1478 = null;
	}

	@ObfuscatedName("YZICXNNP.b()I")
	public int method584() throws IOException {
		if (field1476) {
			return 0;
		}

		return field1473.read();
	}

	@ObfuscatedName("YZICXNNP.c()I")
	public int method585() throws IOException {
		if (field1476) {
			return 0;
		}

		return field1473.available();
	}

	@ObfuscatedName("YZICXNNP.a([BII)V")
	public void method586(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1476) {
			while (arg2 > 0) {
				int var4 = field1473.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("YZICXNNP.a(II[BI)V")
	public void method587(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1476) {
			if (field1482) {
				field1482 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1478 == null) {
				field1478 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1478[field1480] = arg1[arg0 + var5];
					field1480 = (field1480 + 1) % 5000;
					if ((field1479 + 4900) % 5000 == field1480) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1481) {
					field1481 = true;
					field1477.method113(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1481) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1480 == field1479) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1481) {
					return;
				}

				var2 = field1479;

				if (field1480 >= field1479) {
					var3 = field1480 - field1479;
				} else {
					var3 = 5000 - field1479;
				}
			}

			if (var3 > 0) {
				try {
					field1474.write(field1478, var2, var3);
				} catch (IOException var7) {
					field1482 = true;
				}

				field1479 = (field1479 + var3) % 5000;
				try {
					if (field1480 == field1479) {
						field1474.flush();
					}
				} catch (IOException var6) {
					field1482 = true;
				}
			}
		}
	}

	@ObfuscatedName("YZICXNNP.a(I)V")
	public void method588() {
		System.out.println("dummy:" + field1476);
		System.out.println("tcycl:" + field1479);
		System.out.println("tnum:" + field1480);
		System.out.println("writer:" + field1481);
		System.out.println("ioerror:" + field1482);

		try {
			System.out.println("available:" + method585());
		} catch (IOException var1) {
		}
	}
}
