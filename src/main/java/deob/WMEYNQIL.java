package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("WMEYNQIL")
public final class WMEYNQIL implements Runnable {

	@ObfuscatedName("WMEYNQIL.f")
	public boolean field1224 = false;

	@ObfuscatedName("WMEYNQIL.k")
	public boolean field1229 = false;

	@ObfuscatedName("WMEYNQIL.l")
	public boolean field1230 = false;

	@ObfuscatedName("WMEYNQIL.g")
	public ZAMJOSBM field1225;

	@ObfuscatedName("WMEYNQIL.e")
	public Socket field1223;

	@ObfuscatedName("WMEYNQIL.c")
	public InputStream field1221;

	@ObfuscatedName("WMEYNQIL.d")
	public OutputStream field1222;

	@ObfuscatedName("WMEYNQIL.i")
	public int field1227;

	@ObfuscatedName("WMEYNQIL.j")
	public int field1228;

	@ObfuscatedName("WMEYNQIL.h")
	public byte[] field1226;

	public WMEYNQIL(Socket arg0, ZAMJOSBM arg1) throws IOException {
		field1225 = arg1;
		field1223 = arg0;
		field1223.setSoTimeout(30000);
		field1223.setTcpNoDelay(true);
		field1221 = field1223.getInputStream();
		field1222 = field1223.getOutputStream();
	}

	@ObfuscatedName("WMEYNQIL.a()V")
	public void method514() {
		field1224 = true;

		try {
			if (field1221 != null) {
				field1221.close();
			}

			if (field1222 != null) {
				field1222.close();
			}

			if (field1223 != null) {
				field1223.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1229 = false;

		synchronized (this) {
			notify();
		}

		field1226 = null;
	}

	@ObfuscatedName("WMEYNQIL.b()I")
	public int method515() throws IOException {
		if (field1224) {
			return 0;
		}

		return field1221.read();
	}

	@ObfuscatedName("WMEYNQIL.c()I")
	public int method516() throws IOException {
		if (field1224) {
			return 0;
		}

		return field1221.available();
	}

	@ObfuscatedName("WMEYNQIL.a([BII)V")
	public void method517(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1224) {
			while (arg2 > 0) {
				int var4 = field1221.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("WMEYNQIL.a([BIII)V")
	public void method518(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1224) {
			if (field1230) {
				field1230 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1226 == null) {
				field1226 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1226[field1228] = arg0[arg1 + var5];
					field1228 = (field1228 + 1) % 5000;
					if ((field1227 + 4900) % 5000 == field1228) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1229) {
					field1229 = true;
					field1225.method97(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1229) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1228 == field1227) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1229) {
					return;
				}

				var2 = field1227;

				if (field1228 >= field1227) {
					var3 = field1228 - field1227;
				} else {
					var3 = 5000 - field1227;
				}
			}

			if (var3 > 0) {
				try {
					field1222.write(field1226, var2, var3);
				} catch (IOException var7) {
					field1230 = true;
				}

				field1227 = (field1227 + var3) % 5000;
				try {
					if (field1228 == field1227) {
						field1222.flush();
					}
				} catch (IOException var6) {
					field1230 = true;
				}
			}
		}
	}

	@ObfuscatedName("WMEYNQIL.a(I)V")
	public void method519() {
		System.out.println("dummy:" + field1224);
		System.out.println("tcycl:" + field1227);
		System.out.println("tnum:" + field1228);
		System.out.println("writer:" + field1229);
		System.out.println("ioerror:" + field1230);

		try {
			System.out.println("available:" + method516());
		} catch (IOException var1) {
		}
	}
}
