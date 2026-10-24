package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("PTISUREQ")
public final class PTISUREQ implements Runnable {

	@ObfuscatedName("PTISUREQ.e")
	public boolean field1115 = false;

	@ObfuscatedName("PTISUREQ.j")
	public boolean field1120 = false;

	@ObfuscatedName("PTISUREQ.k")
	public boolean field1121 = false;

	@ObfuscatedName("PTISUREQ.f")
	public VTYHSWDE field1116;

	@ObfuscatedName("PTISUREQ.d")
	public Socket field1114;

	@ObfuscatedName("PTISUREQ.b")
	public InputStream field1112;

	@ObfuscatedName("PTISUREQ.c")
	public OutputStream field1113;

	@ObfuscatedName("PTISUREQ.h")
	public int field1118;

	@ObfuscatedName("PTISUREQ.i")
	public int field1119;

	@ObfuscatedName("PTISUREQ.g")
	public byte[] field1117;

	public PTISUREQ(VTYHSWDE arg0, Socket arg1) throws IOException {
		field1116 = arg0;
		field1114 = arg1;
		field1114.setSoTimeout(30000);
		field1114.setTcpNoDelay(true);
		field1112 = field1114.getInputStream();
		field1113 = field1114.getOutputStream();
	}

	@ObfuscatedName("PTISUREQ.a()V")
	public void method407() {
		field1115 = true;

		try {
			if (field1112 != null) {
				field1112.close();
			}

			if (field1113 != null) {
				field1113.close();
			}

			if (field1114 != null) {
				field1114.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1120 = false;

		synchronized (this) {
			notify();
		}

		field1117 = null;
	}

	@ObfuscatedName("PTISUREQ.b()I")
	public int method408() throws IOException {
		if (field1115) {
			return 0;
		}

		return field1112.read();
	}

	@ObfuscatedName("PTISUREQ.c()I")
	public int method409() throws IOException {
		if (field1115) {
			return 0;
		}

		return field1112.available();
	}

	@ObfuscatedName("PTISUREQ.a([BII)V")
	public void method410(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1115) {
			while (arg2 > 0) {
				int var4 = field1112.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("PTISUREQ.a(BII[B)V")
	public void method411(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field1115) {
			if (field1121) {
				field1121 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1117 == null) {
				field1117 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1117[field1119] = arg2[arg0 + var5];
					field1119 = (field1119 + 1) % 5000;
					if ((field1118 + 4900) % 5000 == field1119) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1120) {
					field1120 = true;
					field1116.method87(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1120) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1119 == field1118) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1120) {
					return;
				}

				var2 = field1118;

				if (field1119 >= field1118) {
					var3 = field1119 - field1118;
				} else {
					var3 = 5000 - field1118;
				}
			}

			if (var3 > 0) {
				try {
					field1113.write(field1117, var2, var3);
				} catch (IOException var7) {
					field1121 = true;
				}

				field1118 = (field1118 + var3) % 5000;
				try {
					if (field1119 == field1118) {
						field1113.flush();
					}
				} catch (IOException var6) {
					field1121 = true;
				}
			}
		}
	}

	@ObfuscatedName("PTISUREQ.a(B)V")
	public void method412() {
		System.out.println("dummy:" + field1115);
		System.out.println("tcycl:" + field1118);
		System.out.println("tnum:" + field1119);
		System.out.println("writer:" + field1120);
		System.out.println("ioerror:" + field1121);

		try {
			System.out.println("available:" + method409());
		} catch (IOException var1) {
		}
	}
}
