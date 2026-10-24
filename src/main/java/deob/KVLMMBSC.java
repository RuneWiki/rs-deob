package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("KVLMMBSC")
public final class KVLMMBSC implements Runnable {

	@ObfuscatedName("KVLMMBSC.f")
	public boolean field985 = false;

	@ObfuscatedName("KVLMMBSC.k")
	public boolean field990 = false;

	@ObfuscatedName("KVLMMBSC.l")
	public boolean field991 = false;

	@ObfuscatedName("KVLMMBSC.g")
	public OGVKVTJB field986;

	@ObfuscatedName("KVLMMBSC.e")
	public Socket field984;

	@ObfuscatedName("KVLMMBSC.c")
	public InputStream field982;

	@ObfuscatedName("KVLMMBSC.d")
	public OutputStream field983;

	@ObfuscatedName("KVLMMBSC.i")
	public int field988;

	@ObfuscatedName("KVLMMBSC.j")
	public int field989;

	@ObfuscatedName("KVLMMBSC.h")
	public byte[] field987;

	public KVLMMBSC(Socket arg0, OGVKVTJB arg1) throws IOException {
		field986 = arg1;
		field984 = arg0;
		field984.setSoTimeout(30000);
		field984.setTcpNoDelay(true);
		field982 = field984.getInputStream();
		field983 = field984.getOutputStream();
	}

	@ObfuscatedName("KVLMMBSC.a()V")
	public void method398() {
		field985 = true;

		try {
			if (field982 != null) {
				field982.close();
			}

			if (field983 != null) {
				field983.close();
			}

			if (field984 != null) {
				field984.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field990 = false;

		synchronized (this) {
			notify();
		}

		field987 = null;
	}

	@ObfuscatedName("KVLMMBSC.b()I")
	public int method399() throws IOException {
		if (field985) {
			return 0;
		}

		return field982.read();
	}

	@ObfuscatedName("KVLMMBSC.c()I")
	public int method400() throws IOException {
		if (field985) {
			return 0;
		}

		return field982.available();
	}

	@ObfuscatedName("KVLMMBSC.a([BII)V")
	public void method401(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field985) {
			while (arg2 > 0) {
				int var4 = field982.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("KVLMMBSC.a(II[BI)V")
	public void method402(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field985) {
			if (field991) {
				field991 = false;
				throw new IOException("Error in writer thread");
			}

			if (field987 == null) {
				field987 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field987[field989] = arg2[arg0 + var5];
					field989 = (field989 + 1) % 5000;
					if ((field988 + 4900) % 5000 == field989) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field990) {
					field990 = true;
					field986.method102(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field990) {
			int var2;
			int var3;
			synchronized (this) {
				if (field989 == field988) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field990) {
					return;
				}

				var2 = field988;

				if (field989 >= field988) {
					var3 = field989 - field988;
				} else {
					var3 = 5000 - field988;
				}
			}

			if (var3 > 0) {
				try {
					field983.write(field987, var2, var3);
				} catch (IOException var7) {
					field991 = true;
				}

				field988 = (field988 + var3) % 5000;
				try {
					if (field989 == field988) {
						field983.flush();
					}
				} catch (IOException var6) {
					field991 = true;
				}
			}
		}
	}

	@ObfuscatedName("KVLMMBSC.a(I)V")
	public void method403() {
		System.out.println("dummy:" + field985);
		System.out.println("tcycl:" + field988);
		System.out.println("tnum:" + field989);
		System.out.println("writer:" + field990);
		System.out.println("ioerror:" + field991);

		try {
			System.out.println("available:" + method400());
		} catch (IOException var1) {
		}
	}
}
