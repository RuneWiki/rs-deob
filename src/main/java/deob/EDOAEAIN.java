package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("EDOAEAIN")
public final class EDOAEAIN implements Runnable {

	@ObfuscatedName("EDOAEAIN.g")
	public boolean field576 = false;

	@ObfuscatedName("EDOAEAIN.l")
	public boolean field581 = false;

	@ObfuscatedName("EDOAEAIN.m")
	public boolean field582 = false;

	@ObfuscatedName("EDOAEAIN.h")
	public HXQNMAEJ field577;

	@ObfuscatedName("EDOAEAIN.f")
	public Socket field575;

	@ObfuscatedName("EDOAEAIN.d")
	public InputStream field573;

	@ObfuscatedName("EDOAEAIN.e")
	public OutputStream field574;

	@ObfuscatedName("EDOAEAIN.j")
	public int field579;

	@ObfuscatedName("EDOAEAIN.k")
	public int field580;

	@ObfuscatedName("EDOAEAIN.i")
	public byte[] field578;

	public EDOAEAIN(Socket arg0, HXQNMAEJ arg1) throws IOException {
		field577 = arg1;
		field575 = arg0;
		field575.setSoTimeout(30000);
		field575.setTcpNoDelay(true);
		field573 = field575.getInputStream();
		field574 = field575.getOutputStream();
	}

	@ObfuscatedName("EDOAEAIN.a()V")
	public void method227() {
		field576 = true;

		try {
			if (field573 != null) {
				field573.close();
			}

			if (field574 != null) {
				field574.close();
			}

			if (field575 != null) {
				field575.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field581 = false;

		synchronized (this) {
			notify();
		}

		field578 = null;
	}

	@ObfuscatedName("EDOAEAIN.b()I")
	public int method228() throws IOException {
		if (field576) {
			return 0;
		}

		return field573.read();
	}

	@ObfuscatedName("EDOAEAIN.c()I")
	public int method229() throws IOException {
		if (field576) {
			return 0;
		}

		return field573.available();
	}

	@ObfuscatedName("EDOAEAIN.a([BII)V")
	public void method230(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field576) {
			while (arg2 > 0) {
				int var4 = field573.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("EDOAEAIN.a([BIZI)V")
	public void method231(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field576) {
			if (field582) {
				field582 = false;
				throw new IOException("Error in writer thread");
			}

			if (field578 == null) {
				field578 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field578[field580] = arg0[arg2 + var5];
					field580 = (field580 + 1) % 5000;
					if ((field579 + 4900) % 5000 == field580) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field581) {
					field581 = true;
					field577.method64(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field581) {
			int var2;
			int var3;
			synchronized (this) {
				if (field580 == field579) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field581) {
					return;
				}

				var2 = field579;

				if (field580 >= field579) {
					var3 = field580 - field579;
				} else {
					var3 = 5000 - field579;
				}
			}

			if (var3 > 0) {
				try {
					field574.write(field578, var2, var3);
				} catch (IOException var7) {
					field582 = true;
				}

				field579 = (field579 + var3) % 5000;
				try {
					if (field580 == field579) {
						field574.flush();
					}
				} catch (IOException var6) {
					field582 = true;
				}
			}
		}
	}

	@ObfuscatedName("EDOAEAIN.a(Z)V")
	public void method232() {
		System.out.println("dummy:" + field576);
		System.out.println("tcycl:" + field579);
		System.out.println("tnum:" + field580);
		System.out.println("writer:" + field581);
		System.out.println("ioerror:" + field582);

		try {
			System.out.println("available:" + method229());
		} catch (IOException var1) {
		}
	}
}
