package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("DUZSRFJE")
public final class DUZSRFJE implements Runnable {

	@ObfuscatedName("DUZSRFJE.f")
	public boolean field559 = false;

	@ObfuscatedName("DUZSRFJE.k")
	public boolean field564 = false;

	@ObfuscatedName("DUZSRFJE.l")
	public boolean field565 = false;

	@ObfuscatedName("DUZSRFJE.g")
	public AMTYETOI field560;

	@ObfuscatedName("DUZSRFJE.e")
	public Socket field558;

	@ObfuscatedName("DUZSRFJE.c")
	public InputStream field556;

	@ObfuscatedName("DUZSRFJE.d")
	public OutputStream field557;

	@ObfuscatedName("DUZSRFJE.i")
	public int field562;

	@ObfuscatedName("DUZSRFJE.j")
	public int field563;

	@ObfuscatedName("DUZSRFJE.h")
	public byte[] field561;

	public DUZSRFJE(AMTYETOI arg0, Socket arg1) throws IOException {
		field560 = arg0;
		field558 = arg1;
		field558.setSoTimeout(30000);
		field558.setTcpNoDelay(true);
		field556 = field558.getInputStream();
		field557 = field558.getOutputStream();
	}

	@ObfuscatedName("DUZSRFJE.a()V")
	public void method174() {
		field559 = true;

		try {
			if (field556 != null) {
				field556.close();
			}

			if (field557 != null) {
				field557.close();
			}

			if (field558 != null) {
				field558.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field564 = false;

		synchronized (this) {
			notify();
		}

		field561 = null;
	}

	@ObfuscatedName("DUZSRFJE.b()I")
	public int method175() throws IOException {
		if (field559) {
			return 0;
		}

		return field556.read();
	}

	@ObfuscatedName("DUZSRFJE.c()I")
	public int method176() throws IOException {
		if (field559) {
			return 0;
		}

		return field556.available();
	}

	@ObfuscatedName("DUZSRFJE.a([BII)V")
	public void method177(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field559) {
			while (arg2 > 0) {
				int var4 = field556.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("DUZSRFJE.a(I[BII)V")
	public void method178(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field559) {
			if (field565) {
				field565 = false;
				throw new IOException("Error in writer thread");
			}

			if (field561 == null) {
				field561 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field561[field563] = arg1[arg0 + var5];
					field563 = (field563 + 1) % 5000;
					if ((field562 + 4900) % 5000 == field563) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field564) {
					field564 = true;
					field560.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field564) {
			int var2;
			int var3;
			synchronized (this) {
				if (field563 == field562) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field564) {
					return;
				}

				var2 = field562;

				if (field563 >= field562) {
					var3 = field563 - field562;
				} else {
					var3 = 5000 - field562;
				}
			}

			if (var3 > 0) {
				try {
					field557.write(field561, var2, var3);
				} catch (IOException var7) {
					field565 = true;
				}

				field562 = (field562 + var3) % 5000;
				try {
					if (field563 == field562) {
						field557.flush();
					}
				} catch (IOException var6) {
					field565 = true;
				}
			}
		}
	}

	@ObfuscatedName("DUZSRFJE.a(I)V")
	public void method179() {
		System.out.println("dummy:" + field559);
		System.out.println("tcycl:" + field562);
		System.out.println("tnum:" + field563);
		System.out.println("writer:" + field564);
		System.out.println("ioerror:" + field565);

		try {
			System.out.println("available:" + method176());
		} catch (IOException var1) {
		}
	}
}
