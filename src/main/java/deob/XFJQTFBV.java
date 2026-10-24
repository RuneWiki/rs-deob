package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("XFJQTFBV")
public final class XFJQTFBV implements Runnable {

	@ObfuscatedName("XFJQTFBV.f")
	public boolean field1415 = false;

	@ObfuscatedName("XFJQTFBV.k")
	public boolean field1420 = false;

	@ObfuscatedName("XFJQTFBV.l")
	public boolean field1421 = false;

	@ObfuscatedName("XFJQTFBV.g")
	public BFZNZUKL field1416;

	@ObfuscatedName("XFJQTFBV.e")
	public Socket field1414;

	@ObfuscatedName("XFJQTFBV.c")
	public InputStream field1412;

	@ObfuscatedName("XFJQTFBV.d")
	public OutputStream field1413;

	@ObfuscatedName("XFJQTFBV.i")
	public int field1418;

	@ObfuscatedName("XFJQTFBV.j")
	public int field1419;

	@ObfuscatedName("XFJQTFBV.h")
	public byte[] field1417;

	public XFJQTFBV(Socket arg0, BFZNZUKL arg1) throws IOException {
		field1416 = arg1;
		field1414 = arg0;
		field1414.setSoTimeout(30000);
		field1414.setTcpNoDelay(true);
		field1412 = field1414.getInputStream();
		field1413 = field1414.getOutputStream();
	}

	@ObfuscatedName("XFJQTFBV.a()V")
	public void method556() {
		field1415 = true;

		try {
			if (field1412 != null) {
				field1412.close();
			}

			if (field1413 != null) {
				field1413.close();
			}

			if (field1414 != null) {
				field1414.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1420 = false;

		synchronized (this) {
			notify();
		}

		field1417 = null;
	}

	@ObfuscatedName("XFJQTFBV.b()I")
	public int method557() throws IOException {
		if (field1415) {
			return 0;
		}

		return field1412.read();
	}

	@ObfuscatedName("XFJQTFBV.c()I")
	public int method558() throws IOException {
		if (field1415) {
			return 0;
		}

		return field1412.available();
	}

	@ObfuscatedName("XFJQTFBV.a([BII)V")
	public void method559(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1415) {
			while (arg2 > 0) {
				int var4 = field1412.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("XFJQTFBV.a(IZ[BI)V")
	public void method560(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1415) {
			if (field1421) {
				field1421 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1417 == null) {
				field1417 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1417[field1419] = arg1[arg0 + var5];
					field1419 = (field1419 + 1) % 5000;
					if ((field1418 + 4900) % 5000 == field1419) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1420) {
					field1420 = true;
					field1416.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1420) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1419 == field1418) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1420) {
					return;
				}

				var2 = field1418;

				if (field1419 >= field1418) {
					var3 = field1419 - field1418;
				} else {
					var3 = 5000 - field1418;
				}
			}

			if (var3 > 0) {
				try {
					field1413.write(field1417, var2, var3);
				} catch (IOException var7) {
					field1421 = true;
				}

				field1418 = (field1418 + var3) % 5000;
				try {
					if (field1419 == field1418) {
						field1413.flush();
					}
				} catch (IOException var6) {
					field1421 = true;
				}
			}
		}
	}

	@ObfuscatedName("XFJQTFBV.a(I)V")
	public void method561() {
		System.out.println("dummy:" + field1415);
		System.out.println("tcycl:" + field1418);
		System.out.println("tnum:" + field1419);
		System.out.println("writer:" + field1420);
		System.out.println("ioerror:" + field1421);

		try {
			System.out.println("available:" + method558());
		} catch (IOException var1) {
		}
	}
}
