package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("KPIQNZMJ")
public final class KPIQNZMJ implements Runnable {

	@ObfuscatedName("KPIQNZMJ.f")
	public boolean field857 = false;

	@ObfuscatedName("KPIQNZMJ.k")
	public boolean field862 = false;

	@ObfuscatedName("KPIQNZMJ.l")
	public boolean field863 = false;

	@ObfuscatedName("KPIQNZMJ.g")
	public DZXWUJSL field858;

	@ObfuscatedName("KPIQNZMJ.e")
	public Socket field856;

	@ObfuscatedName("KPIQNZMJ.c")
	public InputStream field854;

	@ObfuscatedName("KPIQNZMJ.d")
	public OutputStream field855;

	@ObfuscatedName("KPIQNZMJ.i")
	public int field860;

	@ObfuscatedName("KPIQNZMJ.j")
	public int field861;

	@ObfuscatedName("KPIQNZMJ.h")
	public byte[] field859;

	public KPIQNZMJ(Socket arg0, DZXWUJSL arg1) throws IOException {
		field858 = arg1;
		field856 = arg0;
		field856.setSoTimeout(30000);
		field856.setTcpNoDelay(true);
		field854 = field856.getInputStream();
		field855 = field856.getOutputStream();
	}

	@ObfuscatedName("KPIQNZMJ.a()V")
	public void method261() {
		field857 = true;

		try {
			if (field854 != null) {
				field854.close();
			}

			if (field855 != null) {
				field855.close();
			}

			if (field856 != null) {
				field856.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field862 = false;

		synchronized (this) {
			notify();
		}

		field859 = null;
	}

	@ObfuscatedName("KPIQNZMJ.b()I")
	public int method262() throws IOException {
		if (field857) {
			return 0;
		}

		return field854.read();
	}

	@ObfuscatedName("KPIQNZMJ.c()I")
	public int method263() throws IOException {
		if (field857) {
			return 0;
		}

		return field854.available();
	}

	@ObfuscatedName("KPIQNZMJ.a([BII)V")
	public void method264(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field857) {
			while (arg2 > 0) {
				int var4 = field854.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("KPIQNZMJ.a(II[BI)V")
	public void method265(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field857) {
			if (field863) {
				field863 = false;
				throw new IOException("Error in writer thread");
			}

			if (field859 == null) {
				field859 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field859[field861] = arg2[arg1 + var5];
					field861 = (field861 + 1) % 5000;
					if ((field860 + 4900) % 5000 == field861) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field862) {
					field862 = true;
					field858.method131(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field862) {
			int var2;
			int var3;
			synchronized (this) {
				if (field861 == field860) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field862) {
					return;
				}

				var2 = field860;

				if (field861 >= field860) {
					var3 = field861 - field860;
				} else {
					var3 = 5000 - field860;
				}
			}

			if (var3 > 0) {
				try {
					field855.write(field859, var2, var3);
				} catch (IOException var7) {
					field863 = true;
				}

				field860 = (field860 + var3) % 5000;
				try {
					if (field861 == field860) {
						field855.flush();
					}
				} catch (IOException var6) {
					field863 = true;
				}
			}
		}
	}

	@ObfuscatedName("KPIQNZMJ.a(I)V")
	public void method266() {
		System.out.println("dummy:" + field857);
		System.out.println("tcycl:" + field860);
		System.out.println("tnum:" + field861);
		System.out.println("writer:" + field862);
		System.out.println("ioerror:" + field863);

		try {
			System.out.println("available:" + method263());
		} catch (IOException var1) {
		}
	}
}
