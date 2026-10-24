package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("NTPVSATL")
public final class NTPVSATL implements Runnable {

	@ObfuscatedName("NTPVSATL.g")
	public boolean field855 = false;

	@ObfuscatedName("NTPVSATL.l")
	public boolean field860 = false;

	@ObfuscatedName("NTPVSATL.m")
	public boolean field861 = false;

	@ObfuscatedName("NTPVSATL.h")
	public PKBEYUWN field856;

	@ObfuscatedName("NTPVSATL.f")
	public Socket field854;

	@ObfuscatedName("NTPVSATL.d")
	public InputStream field852;

	@ObfuscatedName("NTPVSATL.e")
	public OutputStream field853;

	@ObfuscatedName("NTPVSATL.j")
	public int field858;

	@ObfuscatedName("NTPVSATL.k")
	public int field859;

	@ObfuscatedName("NTPVSATL.i")
	public byte[] field857;

	public NTPVSATL(PKBEYUWN arg0, Socket arg1) throws IOException {
		field856 = arg0;
		field854 = arg1;
		field854.setSoTimeout(30000);
		field854.setTcpNoDelay(true);
		field852 = field854.getInputStream();
		field853 = field854.getOutputStream();
	}

	@ObfuscatedName("NTPVSATL.a()V")
	public void method368() {
		field855 = true;

		try {
			if (field852 != null) {
				field852.close();
			}

			if (field853 != null) {
				field853.close();
			}

			if (field854 != null) {
				field854.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field860 = false;

		synchronized (this) {
			notify();
		}

		field857 = null;
	}

	@ObfuscatedName("NTPVSATL.b()I")
	public int method369() throws IOException {
		if (field855) {
			return 0;
		}

		return field852.read();
	}

	@ObfuscatedName("NTPVSATL.c()I")
	public int method370() throws IOException {
		if (field855) {
			return 0;
		}

		return field852.available();
	}

	@ObfuscatedName("NTPVSATL.a([BII)V")
	public void method371(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field855) {
			while (arg2 > 0) {
				int var4 = field852.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("NTPVSATL.a(I[BII)V")
	public void method372(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field855) {
			if (field861) {
				field861 = false;
				throw new IOException("Error in writer thread");
			}

			if (field857 == null) {
				field857 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field857[field859] = arg1[arg0 + var5];
					field859 = (field859 + 1) % 5000;
					if ((field858 + 4900) % 5000 == field859) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field860) {
					field860 = true;
					field856.method164(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field860) {
			int var2;
			int var3;
			synchronized (this) {
				if (field859 == field858) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field860) {
					return;
				}

				var2 = field858;

				if (field859 >= field858) {
					var3 = field859 - field858;
				} else {
					var3 = 5000 - field858;
				}
			}

			if (var3 > 0) {
				try {
					field853.write(field857, var2, var3);
				} catch (IOException var7) {
					field861 = true;
				}

				field858 = (field858 + var3) % 5000;
				try {
					if (field859 == field858) {
						field853.flush();
					}
				} catch (IOException var6) {
					field861 = true;
				}
			}
		}
	}

	@ObfuscatedName("NTPVSATL.a(I)V")
	public void method373() {
		System.out.println("dummy:" + field855);
		System.out.println("tcycl:" + field858);
		System.out.println("tnum:" + field859);
		System.out.println("writer:" + field860);
		System.out.println("ioerror:" + field861);

		try {
			System.out.println("available:" + method370());
		} catch (IOException var1) {
		}
	}
}
