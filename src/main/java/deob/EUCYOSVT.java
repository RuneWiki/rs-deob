package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("EUCYOSVT")
public final class EUCYOSVT implements Runnable {

	@ObfuscatedName("EUCYOSVT.g")
	public boolean field592 = false;

	@ObfuscatedName("EUCYOSVT.l")
	public boolean field597 = false;

	@ObfuscatedName("EUCYOSVT.m")
	public boolean field598 = false;

	@ObfuscatedName("EUCYOSVT.h")
	public UNXTKTRJ field593;

	@ObfuscatedName("EUCYOSVT.f")
	public Socket field591;

	@ObfuscatedName("EUCYOSVT.d")
	public InputStream field589;

	@ObfuscatedName("EUCYOSVT.e")
	public OutputStream field590;

	@ObfuscatedName("EUCYOSVT.j")
	public int field595;

	@ObfuscatedName("EUCYOSVT.k")
	public int field596;

	@ObfuscatedName("EUCYOSVT.i")
	public byte[] field594;

	public EUCYOSVT(Socket arg0, UNXTKTRJ arg1) throws IOException {
		field593 = arg1;
		field591 = arg0;
		field591.setSoTimeout(30000);
		field591.setTcpNoDelay(true);
		field589 = field591.getInputStream();
		field590 = field591.getOutputStream();
	}

	@ObfuscatedName("EUCYOSVT.a()V")
	public void method192() {
		field592 = true;

		try {
			if (field589 != null) {
				field589.close();
			}

			if (field590 != null) {
				field590.close();
			}

			if (field591 != null) {
				field591.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field597 = false;

		synchronized (this) {
			notify();
		}

		field594 = null;
	}

	@ObfuscatedName("EUCYOSVT.b()I")
	public int method193() throws IOException {
		if (field592) {
			return 0;
		}

		return field589.read();
	}

	@ObfuscatedName("EUCYOSVT.c()I")
	public int method194() throws IOException {
		if (field592) {
			return 0;
		}

		return field589.available();
	}

	@ObfuscatedName("EUCYOSVT.a([BII)V")
	public void method195(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field592) {
			while (arg2 > 0) {
				int var4 = field589.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("EUCYOSVT.a(III[B)V")
	public void method196(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field592) {
			if (field598) {
				field598 = false;
				throw new IOException("Error in writer thread");
			}

			if (field594 == null) {
				field594 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field594[field596] = arg2[arg1 + var5];
					field596 = (field596 + 1) % 5000;
					if ((field595 + 4900) % 5000 == field596) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field597) {
					field597 = true;
					field593.method106(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field597) {
			int var2;
			int var3;
			synchronized (this) {
				if (field596 == field595) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field597) {
					return;
				}

				var2 = field595;

				if (field596 >= field595) {
					var3 = field596 - field595;
				} else {
					var3 = 5000 - field595;
				}
			}

			if (var3 > 0) {
				try {
					field590.write(field594, var2, var3);
				} catch (IOException var7) {
					field598 = true;
				}

				field595 = (field595 + var3) % 5000;
				try {
					if (field596 == field595) {
						field590.flush();
					}
				} catch (IOException var6) {
					field598 = true;
				}
			}
		}
	}

	@ObfuscatedName("EUCYOSVT.a(I)V")
	public void method197() {
		System.out.println("dummy:" + field592);
		System.out.println("tcycl:" + field595);
		System.out.println("tnum:" + field596);
		System.out.println("writer:" + field597);
		System.out.println("ioerror:" + field598);

		try {
			System.out.println("available:" + method194());
		} catch (IOException var1) {
		}
	}
}
