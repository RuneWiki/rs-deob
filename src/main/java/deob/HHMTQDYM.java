package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("HHMTQDYM")
public final class HHMTQDYM implements Runnable {

	@ObfuscatedName("HHMTQDYM.h")
	public boolean field727 = false;

	@ObfuscatedName("HHMTQDYM.m")
	public boolean field732 = false;

	@ObfuscatedName("HHMTQDYM.n")
	public boolean field733 = false;

	@ObfuscatedName("HHMTQDYM.i")
	public OFXQYNOM field728;

	@ObfuscatedName("HHMTQDYM.g")
	public Socket field726;

	@ObfuscatedName("HHMTQDYM.e")
	public InputStream field724;

	@ObfuscatedName("HHMTQDYM.f")
	public OutputStream field725;

	@ObfuscatedName("HHMTQDYM.k")
	public int field730;

	@ObfuscatedName("HHMTQDYM.l")
	public int field731;

	@ObfuscatedName("HHMTQDYM.j")
	public byte[] field729;

	public HHMTQDYM(OFXQYNOM arg0, Socket arg1) throws IOException {
		field728 = arg0;
		field726 = arg1;
		field726.setSoTimeout(30000);
		field726.setTcpNoDelay(true);
		field724 = field726.getInputStream();
		field725 = field726.getOutputStream();
	}

	@ObfuscatedName("HHMTQDYM.a()V")
	public void method277() {
		field727 = true;

		try {
			if (field724 != null) {
				field724.close();
			}

			if (field725 != null) {
				field725.close();
			}

			if (field726 != null) {
				field726.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field732 = false;

		synchronized (this) {
			notify();
		}

		field729 = null;
	}

	@ObfuscatedName("HHMTQDYM.b()I")
	public int method278() throws IOException {
		if (field727) {
			return 0;
		}

		return field724.read();
	}

	@ObfuscatedName("HHMTQDYM.c()I")
	public int method279() throws IOException {
		if (field727) {
			return 0;
		}

		return field724.available();
	}

	@ObfuscatedName("HHMTQDYM.a([BII)V")
	public void method280(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field727) {
			while (arg2 > 0) {
				int var4 = field724.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("HHMTQDYM.a(I[BII)V")
	public void method281(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field727) {
			if (field733) {
				field733 = false;
				throw new IOException("Error in writer thread");
			}

			if (field729 == null) {
				field729 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field729[field731] = arg1[arg0 + var5];
					field731 = (field731 + 1) % 5000;
					if ((field730 + 4900) % 5000 == field731) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field732) {
					field732 = true;
					field728.method164(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field732) {
			int var2;
			int var3;
			synchronized (this) {
				if (field731 == field730) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field732) {
					return;
				}

				var2 = field730;

				if (field731 >= field730) {
					var3 = field731 - field730;
				} else {
					var3 = 5000 - field730;
				}
			}

			if (var3 > 0) {
				try {
					field725.write(field729, var2, var3);
				} catch (IOException var7) {
					field733 = true;
				}

				field730 = (field730 + var3) % 5000;
				try {
					if (field731 == field730) {
						field725.flush();
					}
				} catch (IOException var6) {
					field733 = true;
				}
			}
		}
	}

	@ObfuscatedName("HHMTQDYM.a(Z)V")
	public void method282() {
		System.out.println("dummy:" + field727);
		System.out.println("tcycl:" + field730);
		System.out.println("tnum:" + field731);
		System.out.println("writer:" + field732);
		System.out.println("ioerror:" + field733);

		try {
			System.out.println("available:" + method279());
		} catch (IOException var1) {
		}
	}
}
