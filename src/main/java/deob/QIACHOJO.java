package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("QIACHOJO")
public final class QIACHOJO implements Runnable {

	@ObfuscatedName("QIACHOJO.f")
	public boolean field1017 = false;

	@ObfuscatedName("QIACHOJO.k")
	public boolean field1022 = false;

	@ObfuscatedName("QIACHOJO.l")
	public boolean field1023 = false;

	@ObfuscatedName("QIACHOJO.g")
	public EPVRYXOV field1018;

	@ObfuscatedName("QIACHOJO.e")
	public Socket field1016;

	@ObfuscatedName("QIACHOJO.c")
	public InputStream field1014;

	@ObfuscatedName("QIACHOJO.d")
	public OutputStream field1015;

	@ObfuscatedName("QIACHOJO.i")
	public int field1020;

	@ObfuscatedName("QIACHOJO.j")
	public int field1021;

	@ObfuscatedName("QIACHOJO.h")
	public byte[] field1019;

	public QIACHOJO(Socket arg0, EPVRYXOV arg1) throws IOException {
		field1018 = arg1;
		field1016 = arg0;
		field1016.setSoTimeout(30000);
		field1016.setTcpNoDelay(true);
		field1014 = field1016.getInputStream();
		field1015 = field1016.getOutputStream();
	}

	@ObfuscatedName("QIACHOJO.a()V")
	public void method420() {
		field1017 = true;

		try {
			if (field1014 != null) {
				field1014.close();
			}

			if (field1015 != null) {
				field1015.close();
			}

			if (field1016 != null) {
				field1016.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1022 = false;

		synchronized (this) {
			notify();
		}

		field1019 = null;
	}

	@ObfuscatedName("QIACHOJO.b()I")
	public int method421() throws IOException {
		if (field1017) {
			return 0;
		}

		return field1014.read();
	}

	@ObfuscatedName("QIACHOJO.c()I")
	public int method422() throws IOException {
		if (field1017) {
			return 0;
		}

		return field1014.available();
	}

	@ObfuscatedName("QIACHOJO.a([BII)V")
	public void method423(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1017) {
			while (arg2 > 0) {
				int var4 = field1014.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("QIACHOJO.a(II[BI)V")
	public void method424(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1017) {
			if (field1023) {
				field1023 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1019 == null) {
				field1019 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1019[field1021] = arg1[arg0 + var5];
					field1021 = (field1021 + 1) % 5000;
					if ((field1020 + 4900) % 5000 == field1021) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1022) {
					field1022 = true;
					field1018.method142(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1022) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1021 == field1020) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1022) {
					return;
				}

				var2 = field1020;

				if (field1021 >= field1020) {
					var3 = field1021 - field1020;
				} else {
					var3 = 5000 - field1020;
				}
			}

			if (var3 > 0) {
				try {
					field1015.write(field1019, var2, var3);
				} catch (IOException var7) {
					field1023 = true;
				}

				field1020 = (field1020 + var3) % 5000;
				try {
					if (field1021 == field1020) {
						field1015.flush();
					}
				} catch (IOException var6) {
					field1023 = true;
				}
			}
		}
	}

	@ObfuscatedName("QIACHOJO.a(I)V")
	public void method425() {
		System.out.println("dummy:" + field1017);
		System.out.println("tcycl:" + field1020);
		System.out.println("tnum:" + field1021);
		System.out.println("writer:" + field1022);
		System.out.println("ioerror:" + field1023);

		try {
			System.out.println("available:" + method422());
		} catch (IOException var1) {
		}
	}
}
