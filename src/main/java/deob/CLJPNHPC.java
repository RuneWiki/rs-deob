package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("CLJPNHPC")
public final class CLJPNHPC implements Runnable {

	@ObfuscatedName("CLJPNHPC.f")
	public boolean field566 = false;

	@ObfuscatedName("CLJPNHPC.k")
	public boolean field571 = false;

	@ObfuscatedName("CLJPNHPC.l")
	public boolean field572 = false;

	@ObfuscatedName("CLJPNHPC.g")
	public UBLCAEEN field567;

	@ObfuscatedName("CLJPNHPC.e")
	public Socket field565;

	@ObfuscatedName("CLJPNHPC.c")
	public InputStream field563;

	@ObfuscatedName("CLJPNHPC.d")
	public OutputStream field564;

	@ObfuscatedName("CLJPNHPC.i")
	public int field569;

	@ObfuscatedName("CLJPNHPC.j")
	public int field570;

	@ObfuscatedName("CLJPNHPC.h")
	public byte[] field568;

	public CLJPNHPC(Socket arg0, UBLCAEEN arg1) throws IOException {
		field567 = arg1;
		field565 = arg0;
		field565.setSoTimeout(30000);
		field565.setTcpNoDelay(true);
		field563 = field565.getInputStream();
		field564 = field565.getOutputStream();
	}

	@ObfuscatedName("CLJPNHPC.a()V")
	public void method187() {
		field566 = true;

		try {
			if (field563 != null) {
				field563.close();
			}

			if (field564 != null) {
				field564.close();
			}

			if (field565 != null) {
				field565.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field571 = false;

		synchronized (this) {
			notify();
		}

		field568 = null;
	}

	@ObfuscatedName("CLJPNHPC.b()I")
	public int method188() throws IOException {
		if (field566) {
			return 0;
		}

		return field563.read();
	}

	@ObfuscatedName("CLJPNHPC.c()I")
	public int method189() throws IOException {
		if (field566) {
			return 0;
		}

		return field563.available();
	}

	@ObfuscatedName("CLJPNHPC.a([BII)V")
	public void method190(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field566) {
			while (arg2 > 0) {
				int var4 = field563.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("CLJPNHPC.a([BZII)V")
	public void method191(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field566) {
			if (field572) {
				field572 = false;
				throw new IOException("Error in writer thread");
			}

			if (field568 == null) {
				field568 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field568[field570] = arg0[arg1 + var5];
					field570 = (field570 + 1) % 5000;
					if ((field569 + 4900) % 5000 == field570) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field571) {
					field571 = true;
					field567.method185(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field571) {
			int var2;
			int var3;
			synchronized (this) {
				if (field570 == field569) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field571) {
					return;
				}

				var2 = field569;

				if (field570 >= field569) {
					var3 = field570 - field569;
				} else {
					var3 = 5000 - field569;
				}
			}

			if (var3 > 0) {
				try {
					field564.write(field568, var2, var3);
				} catch (IOException var7) {
					field572 = true;
				}

				field569 = (field569 + var3) % 5000;
				try {
					if (field570 == field569) {
						field564.flush();
					}
				} catch (IOException var6) {
					field572 = true;
				}
			}
		}
	}

	@ObfuscatedName("CLJPNHPC.a(Z)V")
	public void method192() {
		System.out.println("dummy:" + field566);
		System.out.println("tcycl:" + field569);
		System.out.println("tnum:" + field570);
		System.out.println("writer:" + field571);
		System.out.println("ioerror:" + field572);

		try {
			System.out.println("available:" + method189());
		} catch (IOException var1) {
		}
	}
}
