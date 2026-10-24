package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("LBXRBQZX")
public final class LBXRBQZX implements Runnable {

	@ObfuscatedName("LBXRBQZX.f")
	public boolean field859 = false;

	@ObfuscatedName("LBXRBQZX.k")
	public boolean field864 = false;

	@ObfuscatedName("LBXRBQZX.l")
	public boolean field865 = false;

	@ObfuscatedName("LBXRBQZX.g")
	public RMDQJLZZ field860;

	@ObfuscatedName("LBXRBQZX.e")
	public Socket field858;

	@ObfuscatedName("LBXRBQZX.c")
	public InputStream field856;

	@ObfuscatedName("LBXRBQZX.d")
	public OutputStream field857;

	@ObfuscatedName("LBXRBQZX.i")
	public int field862;

	@ObfuscatedName("LBXRBQZX.j")
	public int field863;

	@ObfuscatedName("LBXRBQZX.h")
	public byte[] field861;

	public LBXRBQZX(Socket arg0, RMDQJLZZ arg1) throws IOException {
		field860 = arg1;
		field858 = arg0;
		field858.setSoTimeout(30000);
		field858.setTcpNoDelay(true);
		field856 = field858.getInputStream();
		field857 = field858.getOutputStream();
	}

	@ObfuscatedName("LBXRBQZX.a()V")
	public void method273() {
		field859 = true;

		try {
			if (field856 != null) {
				field856.close();
			}

			if (field857 != null) {
				field857.close();
			}

			if (field858 != null) {
				field858.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field864 = false;

		synchronized (this) {
			notify();
		}

		field861 = null;
	}

	@ObfuscatedName("LBXRBQZX.b()I")
	public int method274() throws IOException {
		if (field859) {
			return 0;
		}

		return field856.read();
	}

	@ObfuscatedName("LBXRBQZX.c()I")
	public int method275() throws IOException {
		if (field859) {
			return 0;
		}

		return field856.available();
	}

	@ObfuscatedName("LBXRBQZX.a([BII)V")
	public void method276(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field859) {
			while (arg2 > 0) {
				int var4 = field856.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("LBXRBQZX.a(IBI[B)V")
	public void method277(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field859) {
			if (field865) {
				field865 = false;
				throw new IOException("Error in writer thread");
			}

			if (field861 == null) {
				field861 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field861[field863] = arg2[arg1 + var5];
					field863 = (field863 + 1) % 5000;
					if ((field862 + 4900) % 5000 == field863) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field864) {
					field864 = true;
					field860.method108(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field864) {
			int var2;
			int var3;
			synchronized (this) {
				if (field863 == field862) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field864) {
					return;
				}

				var2 = field862;

				if (field863 >= field862) {
					var3 = field863 - field862;
				} else {
					var3 = 5000 - field862;
				}
			}

			if (var3 > 0) {
				try {
					field857.write(field861, var2, var3);
				} catch (IOException var7) {
					field865 = true;
				}

				field862 = (field862 + var3) % 5000;
				try {
					if (field863 == field862) {
						field857.flush();
					}
				} catch (IOException var6) {
					field865 = true;
				}
			}
		}
	}

	@ObfuscatedName("LBXRBQZX.a(I)V")
	public void method278() {
		System.out.println("dummy:" + field859);
		System.out.println("tcycl:" + field862);
		System.out.println("tnum:" + field863);
		System.out.println("writer:" + field864);
		System.out.println("ioerror:" + field865);

		try {
			System.out.println("available:" + method275());
		} catch (IOException var1) {
		}
	}
}
