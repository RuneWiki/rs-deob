package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("CWPTWZXW")
public final class CWPTWZXW implements Runnable {

	@ObfuscatedName("CWPTWZXW.e")
	public boolean field548 = false;

	@ObfuscatedName("CWPTWZXW.j")
	public boolean field553 = false;

	@ObfuscatedName("CWPTWZXW.k")
	public boolean field554 = false;

	@ObfuscatedName("CWPTWZXW.f")
	public IVVPRVRY field549;

	@ObfuscatedName("CWPTWZXW.d")
	public Socket field547;

	@ObfuscatedName("CWPTWZXW.b")
	public InputStream field545;

	@ObfuscatedName("CWPTWZXW.c")
	public OutputStream field546;

	@ObfuscatedName("CWPTWZXW.h")
	public int field551;

	@ObfuscatedName("CWPTWZXW.i")
	public int field552;

	@ObfuscatedName("CWPTWZXW.g")
	public byte[] field550;

	public CWPTWZXW(IVVPRVRY arg0, Socket arg1) throws IOException {
		field549 = arg0;
		field547 = arg1;
		field547.setSoTimeout(30000);
		field547.setTcpNoDelay(true);
		field545 = field547.getInputStream();
		field546 = field547.getOutputStream();
	}

	@ObfuscatedName("CWPTWZXW.a()V")
	public void method229() {
		field548 = true;

		try {
			if (field545 != null) {
				field545.close();
			}

			if (field546 != null) {
				field546.close();
			}

			if (field547 != null) {
				field547.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field553 = false;

		synchronized (this) {
			notify();
		}

		field550 = null;
	}

	@ObfuscatedName("CWPTWZXW.b()I")
	public int method230() throws IOException {
		if (field548) {
			return 0;
		}

		return field545.read();
	}

	@ObfuscatedName("CWPTWZXW.c()I")
	public int method231() throws IOException {
		if (field548) {
			return 0;
		}

		return field545.available();
	}

	@ObfuscatedName("CWPTWZXW.a([BII)V")
	public void method232(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field548) {
			while (arg2 > 0) {
				int var4 = field545.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("CWPTWZXW.a(I[BII)V")
	public void method233(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field548) {
			if (field554) {
				field554 = false;
				throw new IOException("Error in writer thread");
			}

			if (field550 == null) {
				field550 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field550[field552] = arg0[arg2 + var5];
					field552 = (field552 + 1) % 5000;
					if ((field551 + 4900) % 5000 == field552) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field553) {
					field553 = true;
					field549.method117(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field553) {
			int var2;
			int var3;
			synchronized (this) {
				if (field552 == field551) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field553) {
					return;
				}

				var2 = field551;

				if (field552 >= field551) {
					var3 = field552 - field551;
				} else {
					var3 = 5000 - field551;
				}
			}

			if (var3 > 0) {
				try {
					field546.write(field550, var2, var3);
				} catch (IOException var7) {
					field554 = true;
				}

				field551 = (field551 + var3) % 5000;
				try {
					if (field552 == field551) {
						field546.flush();
					}
				} catch (IOException var6) {
					field554 = true;
				}
			}
		}
	}

	@ObfuscatedName("CWPTWZXW.a(I)V")
	public void method234() {
		System.out.println("dummy:" + field548);
		System.out.println("tcycl:" + field551);
		System.out.println("tnum:" + field552);
		System.out.println("writer:" + field553);
		System.out.println("ioerror:" + field554);

		try {
			System.out.println("available:" + method231());
		} catch (IOException var1) {
		}
	}
}
