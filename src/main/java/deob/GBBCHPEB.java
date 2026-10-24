package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("GBBCHPEB")
public final class GBBCHPEB implements Runnable {

	@ObfuscatedName("GBBCHPEB.e")
	public boolean field813 = false;

	@ObfuscatedName("GBBCHPEB.j")
	public boolean field818 = false;

	@ObfuscatedName("GBBCHPEB.k")
	public boolean field819 = false;

	@ObfuscatedName("GBBCHPEB.f")
	public EBSHSFRY field814;

	@ObfuscatedName("GBBCHPEB.d")
	public Socket field812;

	@ObfuscatedName("GBBCHPEB.b")
	public InputStream field810;

	@ObfuscatedName("GBBCHPEB.c")
	public OutputStream field811;

	@ObfuscatedName("GBBCHPEB.h")
	public int field816;

	@ObfuscatedName("GBBCHPEB.i")
	public int field817;

	@ObfuscatedName("GBBCHPEB.g")
	public byte[] field815;

	public GBBCHPEB(EBSHSFRY arg0, Socket arg1) throws IOException {
		field814 = arg0;
		field812 = arg1;
		field812.setSoTimeout(30000);
		field812.setTcpNoDelay(true);
		field810 = field812.getInputStream();
		field811 = field812.getOutputStream();
	}

	@ObfuscatedName("GBBCHPEB.a()V")
	public void method278() {
		field813 = true;

		try {
			if (field810 != null) {
				field810.close();
			}

			if (field811 != null) {
				field811.close();
			}

			if (field812 != null) {
				field812.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field818 = false;

		synchronized (this) {
			notify();
		}

		field815 = null;
	}

	@ObfuscatedName("GBBCHPEB.b()I")
	public int method279() throws IOException {
		if (field813) {
			return 0;
		}

		return field810.read();
	}

	@ObfuscatedName("GBBCHPEB.c()I")
	public int method280() throws IOException {
		if (field813) {
			return 0;
		}

		return field810.available();
	}

	@ObfuscatedName("GBBCHPEB.a([BII)V")
	public void method281(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field813) {
			while (arg2 > 0) {
				int var4 = field810.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("GBBCHPEB.a(IZ[BI)V")
	public void method282(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field813) {
			if (field819) {
				field819 = false;
				throw new IOException("Error in writer thread");
			}

			if (field815 == null) {
				field815 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field815[field817] = arg1[arg0 + var5];
					field817 = (field817 + 1) % 5000;
					if ((field816 + 4900) % 5000 == field817) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field818) {
					field818 = true;
					field814.method58(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field818) {
			int var2;
			int var3;
			synchronized (this) {
				if (field817 == field816) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field818) {
					return;
				}

				var2 = field816;

				if (field817 >= field816) {
					var3 = field817 - field816;
				} else {
					var3 = 5000 - field816;
				}
			}

			if (var3 > 0) {
				try {
					field811.write(field815, var2, var3);
				} catch (IOException var7) {
					field819 = true;
				}

				field816 = (field816 + var3) % 5000;
				try {
					if (field817 == field816) {
						field811.flush();
					}
				} catch (IOException var6) {
					field819 = true;
				}
			}
		}
	}

	@ObfuscatedName("GBBCHPEB.a(Z)V")
	public void method283() {
		System.out.println("dummy:" + field813);
		System.out.println("tcycl:" + field816);
		System.out.println("tnum:" + field817);
		System.out.println("writer:" + field818);
		System.out.println("ioerror:" + field819);

		try {
			System.out.println("available:" + method280());
		} catch (IOException var1) {
		}
	}
}
