package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("HGDLUQYC")
public final class HGDLUQYC implements Runnable {

	@ObfuscatedName("HGDLUQYC.f")
	public boolean field934 = false;

	@ObfuscatedName("HGDLUQYC.k")
	public boolean field939 = false;

	@ObfuscatedName("HGDLUQYC.l")
	public boolean field940 = false;

	@ObfuscatedName("HGDLUQYC.g")
	public ARNQXZCA field935;

	@ObfuscatedName("HGDLUQYC.e")
	public Socket field933;

	@ObfuscatedName("HGDLUQYC.c")
	public InputStream field931;

	@ObfuscatedName("HGDLUQYC.d")
	public OutputStream field932;

	@ObfuscatedName("HGDLUQYC.i")
	public int field937;

	@ObfuscatedName("HGDLUQYC.j")
	public int field938;

	@ObfuscatedName("HGDLUQYC.h")
	public byte[] field936;

	public HGDLUQYC(Socket arg0, ARNQXZCA arg1) throws IOException {
		field935 = arg1;
		field933 = arg0;
		field933.setSoTimeout(30000);
		field933.setTcpNoDelay(true);
		field931 = field933.getInputStream();
		field932 = field933.getOutputStream();
	}

	@ObfuscatedName("HGDLUQYC.a()V")
	public void method352() {
		field934 = true;

		try {
			if (field931 != null) {
				field931.close();
			}

			if (field932 != null) {
				field932.close();
			}

			if (field933 != null) {
				field933.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field939 = false;

		synchronized (this) {
			notify();
		}

		field936 = null;
	}

	@ObfuscatedName("HGDLUQYC.b()I")
	public int method353() throws IOException {
		if (field934) {
			return 0;
		}

		return field931.read();
	}

	@ObfuscatedName("HGDLUQYC.c()I")
	public int method354() throws IOException {
		if (field934) {
			return 0;
		}

		return field931.available();
	}

	@ObfuscatedName("HGDLUQYC.a([BII)V")
	public void method355(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field934) {
			while (arg2 > 0) {
				int var4 = field931.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("HGDLUQYC.a(I[BII)V")
	public void method356(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field934) {
			if (field940) {
				field940 = false;
				throw new IOException("Error in writer thread");
			}

			if (field936 == null) {
				field936 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field936[field938] = arg0[arg1 + var5];
					field938 = (field938 + 1) % 5000;
					if ((field937 + 4900) % 5000 == field938) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field939) {
					field939 = true;
					field935.method18(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field939) {
			int var2;
			int var3;
			synchronized (this) {
				if (field938 == field937) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field939) {
					return;
				}

				var2 = field937;

				if (field938 >= field937) {
					var3 = field938 - field937;
				} else {
					var3 = 5000 - field937;
				}
			}

			if (var3 > 0) {
				try {
					field932.write(field936, var2, var3);
				} catch (IOException var7) {
					field940 = true;
				}

				field937 = (field937 + var3) % 5000;
				try {
					if (field938 == field937) {
						field932.flush();
					}
				} catch (IOException var6) {
					field940 = true;
				}
			}
		}
	}

	@ObfuscatedName("HGDLUQYC.a(B)V")
	public void method357() {
		System.out.println("dummy:" + field934);
		System.out.println("tcycl:" + field937);
		System.out.println("tnum:" + field938);
		System.out.println("writer:" + field939);
		System.out.println("ioerror:" + field940);

		try {
			System.out.println("available:" + method354());
		} catch (IOException var1) {
		}
	}
}
