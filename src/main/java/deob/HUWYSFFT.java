package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("HUWYSFFT")
public final class HUWYSFFT implements Runnable {

	@ObfuscatedName("HUWYSFFT.e")
	public boolean field706 = false;

	@ObfuscatedName("HUWYSFFT.j")
	public boolean field711 = false;

	@ObfuscatedName("HUWYSFFT.k")
	public boolean field712 = false;

	@ObfuscatedName("HUWYSFFT.f")
	public VZUGTFOW field707;

	@ObfuscatedName("HUWYSFFT.d")
	public Socket field705;

	@ObfuscatedName("HUWYSFFT.b")
	public InputStream field703;

	@ObfuscatedName("HUWYSFFT.c")
	public OutputStream field704;

	@ObfuscatedName("HUWYSFFT.h")
	public int field709;

	@ObfuscatedName("HUWYSFFT.i")
	public int field710;

	@ObfuscatedName("HUWYSFFT.g")
	public byte[] field708;

	public HUWYSFFT(Socket arg0, VZUGTFOW arg1) throws IOException {
		field707 = arg1;
		field705 = arg0;
		field705.setSoTimeout(30000);
		field705.setTcpNoDelay(true);
		field703 = field705.getInputStream();
		field704 = field705.getOutputStream();
	}

	@ObfuscatedName("HUWYSFFT.a()V")
	public void method220() {
		field706 = true;

		try {
			if (field703 != null) {
				field703.close();
			}

			if (field704 != null) {
				field704.close();
			}

			if (field705 != null) {
				field705.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field711 = false;

		synchronized (this) {
			notify();
		}

		field708 = null;
	}

	@ObfuscatedName("HUWYSFFT.b()I")
	public int method221() throws IOException {
		if (field706) {
			return 0;
		}

		return field703.read();
	}

	@ObfuscatedName("HUWYSFFT.c()I")
	public int method222() throws IOException {
		if (field706) {
			return 0;
		}

		return field703.available();
	}

	@ObfuscatedName("HUWYSFFT.a([BII)V")
	public void method223(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field706) {
			while (arg2 > 0) {
				int var4 = field703.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("HUWYSFFT.a(IB[BI)V")
	public void method224(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field706) {
			if (field712) {
				field712 = false;
				throw new IOException("Error in writer thread");
			}

			if (field708 == null) {
				field708 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field708[field710] = arg1[arg0 + var5];
					field710 = (field710 + 1) % 5000;
					if ((field709 + 4900) % 5000 == field710) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field711) {
					field711 = true;
					field707.method36(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field711) {
			int var2;
			int var3;
			synchronized (this) {
				if (field710 == field709) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field711) {
					return;
				}

				var2 = field709;

				if (field710 >= field709) {
					var3 = field710 - field709;
				} else {
					var3 = 5000 - field709;
				}
			}

			if (var3 > 0) {
				try {
					field704.write(field708, var2, var3);
				} catch (IOException var7) {
					field712 = true;
				}

				field709 = (field709 + var3) % 5000;
				try {
					if (field710 == field709) {
						field704.flush();
					}
				} catch (IOException var6) {
					field712 = true;
				}
			}
		}
	}

	@ObfuscatedName("HUWYSFFT.a(Z)V")
	public void method225() {
		System.out.println("dummy:" + field706);
		System.out.println("tcycl:" + field709);
		System.out.println("tnum:" + field710);
		System.out.println("writer:" + field711);
		System.out.println("ioerror:" + field712);

		try {
			System.out.println("available:" + method222());
		} catch (IOException var1) {
		}
	}
}
