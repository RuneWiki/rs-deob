package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("FLUCRVAS")
public final class FLUCRVAS implements Runnable {

	@ObfuscatedName("FLUCRVAS.f")
	public boolean field593 = false;

	@ObfuscatedName("FLUCRVAS.k")
	public boolean field598 = false;

	@ObfuscatedName("FLUCRVAS.l")
	public boolean field599 = false;

	@ObfuscatedName("FLUCRVAS.g")
	public DKKOWNCZ field594;

	@ObfuscatedName("FLUCRVAS.e")
	public Socket field592;

	@ObfuscatedName("FLUCRVAS.c")
	public InputStream field590;

	@ObfuscatedName("FLUCRVAS.d")
	public OutputStream field591;

	@ObfuscatedName("FLUCRVAS.i")
	public int field596;

	@ObfuscatedName("FLUCRVAS.j")
	public int field597;

	@ObfuscatedName("FLUCRVAS.h")
	public byte[] field595;

	public FLUCRVAS(DKKOWNCZ arg0, Socket arg1) throws IOException {
		field594 = arg0;
		field592 = arg1;
		field592.setSoTimeout(30000);
		field592.setTcpNoDelay(true);
		field590 = field592.getInputStream();
		field591 = field592.getOutputStream();
	}

	@ObfuscatedName("FLUCRVAS.a()V")
	public void method210() {
		field593 = true;

		try {
			if (field590 != null) {
				field590.close();
			}

			if (field591 != null) {
				field591.close();
			}

			if (field592 != null) {
				field592.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field598 = false;

		synchronized (this) {
			notify();
		}

		field595 = null;
	}

	@ObfuscatedName("FLUCRVAS.b()I")
	public int method211() throws IOException {
		if (field593) {
			return 0;
		}

		return field590.read();
	}

	@ObfuscatedName("FLUCRVAS.c()I")
	public int method212() throws IOException {
		if (field593) {
			return 0;
		}

		return field590.available();
	}

	@ObfuscatedName("FLUCRVAS.a([BII)V")
	public void method213(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field593) {
			while (arg2 > 0) {
				int var4 = field590.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("FLUCRVAS.a(II[BZ)V")
	public void method214(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field593) {
			if (field599) {
				field599 = false;
				throw new IOException("Error in writer thread");
			}

			if (field595 == null) {
				field595 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field595[field597] = arg2[arg0 + var5];
					field597 = (field597 + 1) % 5000;
					if ((field596 + 4900) % 5000 == field597) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field598) {
					field598 = true;
					field594.method101(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field598) {
			int var2;
			int var3;
			synchronized (this) {
				if (field597 == field596) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field598) {
					return;
				}

				var2 = field596;

				if (field597 >= field596) {
					var3 = field597 - field596;
				} else {
					var3 = 5000 - field596;
				}
			}

			if (var3 > 0) {
				try {
					field591.write(field595, var2, var3);
				} catch (IOException var7) {
					field599 = true;
				}

				field596 = (field596 + var3) % 5000;
				try {
					if (field597 == field596) {
						field591.flush();
					}
				} catch (IOException var6) {
					field599 = true;
				}
			}
		}
	}

	@ObfuscatedName("FLUCRVAS.a(I)V")
	public void method215() {
		System.out.println("dummy:" + field593);
		System.out.println("tcycl:" + field596);
		System.out.println("tnum:" + field597);
		System.out.println("writer:" + field598);
		System.out.println("ioerror:" + field599);

		try {
			System.out.println("available:" + method212());
		} catch (IOException var1) {
		}
	}
}
