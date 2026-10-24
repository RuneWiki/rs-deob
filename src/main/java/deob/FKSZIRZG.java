package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("FKSZIRZG")
public final class FKSZIRZG implements Runnable {

	@ObfuscatedName("FKSZIRZG.g")
	public boolean field720 = false;

	@ObfuscatedName("FKSZIRZG.l")
	public boolean field725 = false;

	@ObfuscatedName("FKSZIRZG.m")
	public boolean field726 = false;

	@ObfuscatedName("FKSZIRZG.h")
	public PXJVLLTT field721;

	@ObfuscatedName("FKSZIRZG.f")
	public Socket field719;

	@ObfuscatedName("FKSZIRZG.d")
	public InputStream field717;

	@ObfuscatedName("FKSZIRZG.e")
	public OutputStream field718;

	@ObfuscatedName("FKSZIRZG.j")
	public int field723;

	@ObfuscatedName("FKSZIRZG.k")
	public int field724;

	@ObfuscatedName("FKSZIRZG.i")
	public byte[] field722;

	public FKSZIRZG(Socket arg0, PXJVLLTT arg1) throws IOException {
		field721 = arg1;
		field719 = arg0;
		field719.setSoTimeout(30000);
		field719.setTcpNoDelay(true);
		field717 = field719.getInputStream();
		field718 = field719.getOutputStream();
	}

	@ObfuscatedName("FKSZIRZG.a()V")
	public void method225() {
		field720 = true;

		try {
			if (field717 != null) {
				field717.close();
			}

			if (field718 != null) {
				field718.close();
			}

			if (field719 != null) {
				field719.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field725 = false;

		synchronized (this) {
			notify();
		}

		field722 = null;
	}

	@ObfuscatedName("FKSZIRZG.b()I")
	public int method226() throws IOException {
		if (field720) {
			return 0;
		}

		return field717.read();
	}

	@ObfuscatedName("FKSZIRZG.c()I")
	public int method227() throws IOException {
		if (field720) {
			return 0;
		}

		return field717.available();
	}

	@ObfuscatedName("FKSZIRZG.a([BII)V")
	public void method228(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field720) {
			while (arg2 > 0) {
				int var4 = field717.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("FKSZIRZG.a(I[BII)V")
	public void method229(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field720) {
			if (field726) {
				field726 = false;
				throw new IOException("Error in writer thread");
			}

			if (field722 == null) {
				field722 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field722[field724] = arg1[arg0 + var5];
					field724 = (field724 + 1) % 5000;
					if ((field723 + 4900) % 5000 == field724) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field725) {
					field725 = true;
					field721.method135(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field725) {
			int var2;
			int var3;
			synchronized (this) {
				if (field724 == field723) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field725) {
					return;
				}

				var2 = field723;

				if (field724 >= field723) {
					var3 = field724 - field723;
				} else {
					var3 = 5000 - field723;
				}
			}

			if (var3 > 0) {
				try {
					field718.write(field722, var2, var3);
				} catch (IOException var7) {
					field726 = true;
				}

				field723 = (field723 + var3) % 5000;
				try {
					if (field724 == field723) {
						field718.flush();
					}
				} catch (IOException var6) {
					field726 = true;
				}
			}
		}
	}

	@ObfuscatedName("FKSZIRZG.a(I)V")
	public void method230() {
		System.out.println("dummy:" + field720);
		System.out.println("tcycl:" + field723);
		System.out.println("tnum:" + field724);
		System.out.println("writer:" + field725);
		System.out.println("ioerror:" + field726);

		try {
			System.out.println("available:" + method227());
		} catch (IOException var1) {
		}
	}
}
