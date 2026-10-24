package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("JHRYTWFZ")
public final class JHRYTWFZ implements Runnable {

	@ObfuscatedName("JHRYTWFZ.f")
	public boolean field809 = false;

	@ObfuscatedName("JHRYTWFZ.k")
	public boolean field814 = false;

	@ObfuscatedName("JHRYTWFZ.l")
	public boolean field815 = false;

	@ObfuscatedName("JHRYTWFZ.g")
	public TFSZPSRF field810;

	@ObfuscatedName("JHRYTWFZ.e")
	public Socket field808;

	@ObfuscatedName("JHRYTWFZ.c")
	public InputStream field806;

	@ObfuscatedName("JHRYTWFZ.d")
	public OutputStream field807;

	@ObfuscatedName("JHRYTWFZ.i")
	public int field812;

	@ObfuscatedName("JHRYTWFZ.j")
	public int field813;

	@ObfuscatedName("JHRYTWFZ.h")
	public byte[] field811;

	public JHRYTWFZ(Socket arg0, TFSZPSRF arg1) throws IOException {
		field810 = arg1;
		field808 = arg0;
		field808.setSoTimeout(30000);
		field808.setTcpNoDelay(true);
		field806 = field808.getInputStream();
		field807 = field808.getOutputStream();
	}

	@ObfuscatedName("JHRYTWFZ.a()V")
	public void method318() {
		field809 = true;

		try {
			if (field806 != null) {
				field806.close();
			}

			if (field807 != null) {
				field807.close();
			}

			if (field808 != null) {
				field808.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field814 = false;

		synchronized (this) {
			notify();
		}

		field811 = null;
	}

	@ObfuscatedName("JHRYTWFZ.b()I")
	public int method319() throws IOException {
		if (field809) {
			return 0;
		}

		return field806.read();
	}

	@ObfuscatedName("JHRYTWFZ.c()I")
	public int method320() throws IOException {
		if (field809) {
			return 0;
		}

		return field806.available();
	}

	@ObfuscatedName("JHRYTWFZ.a([BII)V")
	public void method321(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field809) {
			while (arg2 > 0) {
				int var4 = field806.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("JHRYTWFZ.a([BIII)V")
	public void method322(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field809) {
			if (field815) {
				field815 = false;
				throw new IOException("Error in writer thread");
			}

			if (field811 == null) {
				field811 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field811[field813] = arg0[arg2 + var5];
					field813 = (field813 + 1) % 5000;
					if ((field812 + 4900) % 5000 == field813) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field814) {
					field814 = true;
					field810.method115(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field814) {
			int var2;
			int var3;
			synchronized (this) {
				if (field813 == field812) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field814) {
					return;
				}

				var2 = field812;

				if (field813 >= field812) {
					var3 = field813 - field812;
				} else {
					var3 = 5000 - field812;
				}
			}

			if (var3 > 0) {
				try {
					field807.write(field811, var2, var3);
				} catch (IOException var7) {
					field815 = true;
				}

				field812 = (field812 + var3) % 5000;
				try {
					if (field813 == field812) {
						field807.flush();
					}
				} catch (IOException var6) {
					field815 = true;
				}
			}
		}
	}

	@ObfuscatedName("JHRYTWFZ.a(Z)V")
	public void method323() {
		System.out.println("dummy:" + field809);
		System.out.println("tcycl:" + field812);
		System.out.println("tnum:" + field813);
		System.out.println("writer:" + field814);
		System.out.println("ioerror:" + field815);

		try {
			System.out.println("available:" + method320());
		} catch (IOException var1) {
		}
	}
}
