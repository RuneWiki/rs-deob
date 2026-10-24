package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("OLIDOILN")
public final class OLIDOILN implements Runnable {

	@ObfuscatedName("OLIDOILN.e")
	public boolean field920 = false;

	@ObfuscatedName("OLIDOILN.j")
	public boolean field925 = false;

	@ObfuscatedName("OLIDOILN.k")
	public boolean field926 = false;

	@ObfuscatedName("OLIDOILN.f")
	public LJUNUWBY field921;

	@ObfuscatedName("OLIDOILN.d")
	public Socket field919;

	@ObfuscatedName("OLIDOILN.b")
	public InputStream field917;

	@ObfuscatedName("OLIDOILN.c")
	public OutputStream field918;

	@ObfuscatedName("OLIDOILN.h")
	public int field923;

	@ObfuscatedName("OLIDOILN.i")
	public int field924;

	@ObfuscatedName("OLIDOILN.g")
	public byte[] field922;

	public OLIDOILN(LJUNUWBY arg0, Socket arg1) throws IOException {
		field921 = arg0;
		field919 = arg1;
		field919.setSoTimeout(30000);
		field919.setTcpNoDelay(true);
		field917 = field919.getInputStream();
		field918 = field919.getOutputStream();
	}

	@ObfuscatedName("OLIDOILN.a()V")
	public void method322() {
		field920 = true;

		try {
			if (field917 != null) {
				field917.close();
			}

			if (field918 != null) {
				field918.close();
			}

			if (field919 != null) {
				field919.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field925 = false;

		synchronized (this) {
			notify();
		}

		field922 = null;
	}

	@ObfuscatedName("OLIDOILN.b()I")
	public int method323() throws IOException {
		if (field920) {
			return 0;
		}

		return field917.read();
	}

	@ObfuscatedName("OLIDOILN.c()I")
	public int method324() throws IOException {
		if (field920) {
			return 0;
		}

		return field917.available();
	}

	@ObfuscatedName("OLIDOILN.a([BII)V")
	public void method325(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field920) {
			while (arg2 > 0) {
				int var4 = field917.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("OLIDOILN.a(II[BI)V")
	public void method326(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field920) {
			if (field926) {
				field926 = false;
				throw new IOException("Error in writer thread");
			}

			if (field922 == null) {
				field922 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field922[field924] = arg2[arg0 + var5];
					field924 = (field924 + 1) % 5000;
					if ((field923 + 4900) % 5000 == field924) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field925) {
					field925 = true;
					field921.method54(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field925) {
			int var2;
			int var3;
			synchronized (this) {
				if (field924 == field923) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field925) {
					return;
				}

				var2 = field923;

				if (field924 >= field923) {
					var3 = field924 - field923;
				} else {
					var3 = 5000 - field923;
				}
			}

			if (var3 > 0) {
				try {
					field918.write(field922, var2, var3);
				} catch (IOException var7) {
					field926 = true;
				}

				field923 = (field923 + var3) % 5000;
				try {
					if (field924 == field923) {
						field918.flush();
					}
				} catch (IOException var6) {
					field926 = true;
				}
			}
		}
	}

	@ObfuscatedName("OLIDOILN.a(Z)V")
	public void method327() {
		System.out.println("dummy:" + field920);
		System.out.println("tcycl:" + field923);
		System.out.println("tnum:" + field924);
		System.out.println("writer:" + field925);
		System.out.println("ioerror:" + field926);

		try {
			System.out.println("available:" + method324());
		} catch (IOException var1) {
		}
	}
}
