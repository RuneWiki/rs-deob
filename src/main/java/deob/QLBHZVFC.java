package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("QLBHZVFC")
public final class QLBHZVFC implements Runnable {

	@ObfuscatedName("QLBHZVFC.e")
	public boolean field984 = false;

	@ObfuscatedName("QLBHZVFC.j")
	public boolean field989 = false;

	@ObfuscatedName("QLBHZVFC.k")
	public boolean field990 = false;

	@ObfuscatedName("QLBHZVFC.f")
	public BTXFPMEV field985;

	@ObfuscatedName("QLBHZVFC.d")
	public Socket field983;

	@ObfuscatedName("QLBHZVFC.b")
	public InputStream field981;

	@ObfuscatedName("QLBHZVFC.c")
	public OutputStream field982;

	@ObfuscatedName("QLBHZVFC.h")
	public int field987;

	@ObfuscatedName("QLBHZVFC.i")
	public int field988;

	@ObfuscatedName("QLBHZVFC.g")
	public byte[] field986;

	public QLBHZVFC(BTXFPMEV arg0, Socket arg1) throws IOException {
		field985 = arg0;
		field983 = arg1;
		field983.setSoTimeout(30000);
		field983.setTcpNoDelay(true);
		field981 = field983.getInputStream();
		field982 = field983.getOutputStream();
	}

	@ObfuscatedName("QLBHZVFC.a()V")
	public void method433() {
		field984 = true;

		try {
			if (field981 != null) {
				field981.close();
			}

			if (field982 != null) {
				field982.close();
			}

			if (field983 != null) {
				field983.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field989 = false;

		synchronized (this) {
			notify();
		}

		field986 = null;
	}

	@ObfuscatedName("QLBHZVFC.b()I")
	public int method434() throws IOException {
		if (field984) {
			return 0;
		}

		return field981.read();
	}

	@ObfuscatedName("QLBHZVFC.c()I")
	public int method435() throws IOException {
		if (field984) {
			return 0;
		}

		return field981.available();
	}

	@ObfuscatedName("QLBHZVFC.a([BII)V")
	public void method436(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field984) {
			while (arg2 > 0) {
				int var4 = field981.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("QLBHZVFC.a([BIII)V")
	public void method437(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field984) {
			if (field990) {
				field990 = false;
				throw new IOException("Error in writer thread");
			}

			if (field986 == null) {
				field986 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field986[field988] = arg0[arg2 + var5];
					field988 = (field988 + 1) % 5000;
					if ((field987 + 4900) % 5000 == field988) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field989) {
					field989 = true;
					field985.method58(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field989) {
			int var2;
			int var3;
			synchronized (this) {
				if (field988 == field987) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field989) {
					return;
				}

				var2 = field987;

				if (field988 >= field987) {
					var3 = field988 - field987;
				} else {
					var3 = 5000 - field987;
				}
			}

			if (var3 > 0) {
				try {
					field982.write(field986, var2, var3);
				} catch (IOException var7) {
					field990 = true;
				}

				field987 = (field987 + var3) % 5000;
				try {
					if (field988 == field987) {
						field982.flush();
					}
				} catch (IOException var6) {
					field990 = true;
				}
			}
		}
	}

	@ObfuscatedName("QLBHZVFC.a(B)V")
	public void method438() {
		System.out.println("dummy:" + field984);
		System.out.println("tcycl:" + field987);
		System.out.println("tnum:" + field988);
		System.out.println("writer:" + field989);
		System.out.println("ioerror:" + field990);

		try {
			System.out.println("available:" + method435());
		} catch (IOException var1) {
		}
	}
}
