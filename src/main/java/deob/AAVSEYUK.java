package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("AAVSEYUK")
public final class AAVSEYUK implements Runnable {

	@ObfuscatedName("AAVSEYUK.e")
	public boolean field4 = false;

	@ObfuscatedName("AAVSEYUK.j")
	public boolean field9 = false;

	@ObfuscatedName("AAVSEYUK.k")
	public boolean field10 = false;

	@ObfuscatedName("AAVSEYUK.f")
	public EUDZGBGU field5;

	@ObfuscatedName("AAVSEYUK.d")
	public Socket field3;

	@ObfuscatedName("AAVSEYUK.b")
	public InputStream field1;

	@ObfuscatedName("AAVSEYUK.c")
	public OutputStream field2;

	@ObfuscatedName("AAVSEYUK.h")
	public int field7;

	@ObfuscatedName("AAVSEYUK.i")
	public int field8;

	@ObfuscatedName("AAVSEYUK.g")
	public byte[] field6;

	public AAVSEYUK(EUDZGBGU arg0, Socket arg1) throws IOException {
		field5 = arg0;
		field3 = arg1;
		field3.setSoTimeout(30000);
		field3.setTcpNoDelay(true);
		field1 = field3.getInputStream();
		field2 = field3.getOutputStream();
	}

	@ObfuscatedName("AAVSEYUK.a()V")
	public void method1() {
		field4 = true;

		try {
			if (field1 != null) {
				field1.close();
			}

			if (field2 != null) {
				field2.close();
			}

			if (field3 != null) {
				field3.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field9 = false;

		synchronized (this) {
			notify();
		}

		field6 = null;
	}

	@ObfuscatedName("AAVSEYUK.b()I")
	public int method2() throws IOException {
		if (field4) {
			return 0;
		}

		return field1.read();
	}

	@ObfuscatedName("AAVSEYUK.c()I")
	public int method3() throws IOException {
		if (field4) {
			return 0;
		}

		return field1.available();
	}

	@ObfuscatedName("AAVSEYUK.a([BII)V")
	public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field4) {
			while (arg2 > 0) {
				int var4 = field1.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("AAVSEYUK.a(I[BII)V")
	public void method5(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field4) {
			if (field10) {
				field10 = false;
				throw new IOException("Error in writer thread");
			}

			if (field6 == null) {
				field6 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field6[field8] = arg1[arg2 + var5];
					field8 = (field8 + 1) % 5000;
					if ((field7 + 4900) % 5000 == field8) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field9) {
					field9 = true;
					field5.method47(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field9) {
			int var2;
			int var3;
			synchronized (this) {
				if (field8 == field7) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field9) {
					return;
				}

				var2 = field7;

				if (field8 >= field7) {
					var3 = field8 - field7;
				} else {
					var3 = 5000 - field7;
				}
			}

			if (var3 > 0) {
				try {
					field2.write(field6, var2, var3);
				} catch (IOException var7) {
					field10 = true;
				}

				field7 = (field7 + var3) % 5000;
				try {
					if (field8 == field7) {
						field2.flush();
					}
				} catch (IOException var6) {
					field10 = true;
				}
			}
		}
	}

	@ObfuscatedName("AAVSEYUK.a(Z)V")
	public void method6() {
		System.out.println("dummy:" + field4);
		System.out.println("tcycl:" + field7);
		System.out.println("tnum:" + field8);
		System.out.println("writer:" + field9);
		System.out.println("ioerror:" + field10);

		try {
			System.out.println("available:" + method3());
		} catch (IOException var1) {
		}
	}
}
