package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("BJGZFSFX")
public final class BJGZFSFX implements Runnable {

	@ObfuscatedName("BJGZFSFX.e")
	public boolean field14 = false;

	@ObfuscatedName("BJGZFSFX.j")
	public boolean field19 = false;

	@ObfuscatedName("BJGZFSFX.k")
	public boolean field20 = false;

	@ObfuscatedName("BJGZFSFX.f")
	public ITJBTECW field15;

	@ObfuscatedName("BJGZFSFX.d")
	public Socket field13;

	@ObfuscatedName("BJGZFSFX.b")
	public InputStream field11;

	@ObfuscatedName("BJGZFSFX.c")
	public OutputStream field12;

	@ObfuscatedName("BJGZFSFX.h")
	public int field17;

	@ObfuscatedName("BJGZFSFX.i")
	public int field18;

	@ObfuscatedName("BJGZFSFX.g")
	public byte[] field16;

	public BJGZFSFX(ITJBTECW arg0, Socket arg1) throws IOException {
		field15 = arg0;
		field13 = arg1;
		field13.setSoTimeout(30000);
		field13.setTcpNoDelay(true);
		field11 = field13.getInputStream();
		field12 = field13.getOutputStream();
	}

	@ObfuscatedName("BJGZFSFX.a()V")
	public void method1() {
		field14 = true;

		try {
			if (field11 != null) {
				field11.close();
			}

			if (field12 != null) {
				field12.close();
			}

			if (field13 != null) {
				field13.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field19 = false;

		synchronized (this) {
			notify();
		}

		field16 = null;
	}

	@ObfuscatedName("BJGZFSFX.b()I")
	public int method2() throws IOException {
		if (field14) {
			return 0;
		}

		return field11.read();
	}

	@ObfuscatedName("BJGZFSFX.c()I")
	public int method3() throws IOException {
		if (field14) {
			return 0;
		}

		return field11.available();
	}

	@ObfuscatedName("BJGZFSFX.a([BII)V")
	public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field14) {
			while (arg2 > 0) {
				int var4 = field11.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("BJGZFSFX.a([BIIZ)V")
	public void method5(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field14) {
			if (field20) {
				field20 = false;
				throw new IOException("Error in writer thread");
			}

			if (field16 == null) {
				field16 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field16[field18] = arg0[arg1 + var5];
					field18 = (field18 + 1) % 5000;
					if ((field17 + 4900) % 5000 == field18) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field19) {
					field19 = true;
					field15.method124(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field19) {
			int var2;
			int var3;
			synchronized (this) {
				if (field18 == field17) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field19) {
					return;
				}

				var2 = field17;

				if (field18 >= field17) {
					var3 = field18 - field17;
				} else {
					var3 = 5000 - field17;
				}
			}

			if (var3 > 0) {
				try {
					field12.write(field16, var2, var3);
				} catch (IOException var7) {
					field20 = true;
				}

				field17 = (field17 + var3) % 5000;
				try {
					if (field18 == field17) {
						field12.flush();
					}
				} catch (IOException var6) {
					field20 = true;
				}
			}
		}
	}

	@ObfuscatedName("BJGZFSFX.a(B)V")
	public void method6() {
		System.out.println("dummy:" + field14);
		System.out.println("tcycl:" + field17);
		System.out.println("tnum:" + field18);
		System.out.println("writer:" + field19);
		System.out.println("ioerror:" + field20);

		try {
			System.out.println("available:" + method3());
		} catch (IOException var1) {
		}
	}
}
