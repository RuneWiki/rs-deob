package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("LJVKCVYD")
public final class LJVKCVYD implements Runnable {

	@ObfuscatedName("LJVKCVYD.d")
	public boolean field816 = false;

	@ObfuscatedName("LJVKCVYD.i")
	public boolean field821 = false;

	@ObfuscatedName("LJVKCVYD.j")
	public boolean field822 = false;

	@ObfuscatedName("LJVKCVYD.e")
	public AYIVJZQQ field817;

	@ObfuscatedName("LJVKCVYD.c")
	public Socket field815;

	@ObfuscatedName("LJVKCVYD.a")
	public InputStream field813;

	@ObfuscatedName("LJVKCVYD.b")
	public OutputStream field814;

	@ObfuscatedName("LJVKCVYD.g")
	public int field819;

	@ObfuscatedName("LJVKCVYD.h")
	public int field820;

	@ObfuscatedName("LJVKCVYD.f")
	public byte[] field818;

	public LJVKCVYD(AYIVJZQQ arg0, Socket arg1) throws IOException {
		field817 = arg0;
		field815 = arg1;
		field815.setSoTimeout(30000);
		field815.setTcpNoDelay(true);
		field813 = field815.getInputStream();
		field814 = field815.getOutputStream();
	}

	@ObfuscatedName("LJVKCVYD.a()V")
	public void method351() {
		field816 = true;

		try {
			if (field813 != null) {
				field813.close();
			}

			if (field814 != null) {
				field814.close();
			}

			if (field815 != null) {
				field815.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field821 = false;

		synchronized (this) {
			notify();
		}

		field818 = null;
	}

	@ObfuscatedName("LJVKCVYD.b()I")
	public int method352() throws IOException {
		if (field816) {
			return 0;
		}

		return field813.read();
	}

	@ObfuscatedName("LJVKCVYD.c()I")
	public int method353() throws IOException {
		if (field816) {
			return 0;
		}

		return field813.available();
	}

	@ObfuscatedName("LJVKCVYD.a([BII)V")
	public void method354(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field816) {
			while (arg2 > 0) {
				int var4 = field813.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("LJVKCVYD.a([BIII)V")
	public void method355(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field816) {
			if (field822) {
				field822 = false;
				throw new IOException("Error in writer thread");
			}

			if (field818 == null) {
				field818 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field818[field820] = arg0[arg2 + var5];
					field820 = (field820 + 1) % 5000;
					if ((field819 + 4900) % 5000 == field820) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field821) {
					field821 = true;
					field817.method25(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field821) {
			int var2;
			int var3;
			synchronized (this) {
				if (field820 == field819) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field821) {
					return;
				}

				var2 = field819;

				if (field820 >= field819) {
					var3 = field820 - field819;
				} else {
					var3 = 5000 - field819;
				}
			}

			if (var3 > 0) {
				try {
					field814.write(field818, var2, var3);
				} catch (IOException var7) {
					field822 = true;
				}

				field819 = (field819 + var3) % 5000;
				try {
					if (field820 == field819) {
						field814.flush();
					}
				} catch (IOException var6) {
					field822 = true;
				}
			}
		}
	}

	@ObfuscatedName("LJVKCVYD.a(I)V")
	public void method356() {
		System.out.println("dummy:" + field816);
		System.out.println("tcycl:" + field819);
		System.out.println("tnum:" + field820);
		System.out.println("writer:" + field821);
		System.out.println("ioerror:" + field822);

		try {
			System.out.println("available:" + method353());
		} catch (IOException var1) {
		}
	}
}
