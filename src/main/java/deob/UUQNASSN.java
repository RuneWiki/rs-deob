package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("UUQNASSN")
public final class UUQNASSN implements Runnable {

	@ObfuscatedName("UUQNASSN.e")
	public boolean field1312 = false;

	@ObfuscatedName("UUQNASSN.j")
	public boolean field1317 = false;

	@ObfuscatedName("UUQNASSN.k")
	public boolean field1318 = false;

	@ObfuscatedName("UUQNASSN.f")
	public NCIKLCII field1313;

	@ObfuscatedName("UUQNASSN.d")
	public Socket field1311;

	@ObfuscatedName("UUQNASSN.b")
	public InputStream field1309;

	@ObfuscatedName("UUQNASSN.c")
	public OutputStream field1310;

	@ObfuscatedName("UUQNASSN.h")
	public int field1315;

	@ObfuscatedName("UUQNASSN.i")
	public int field1316;

	@ObfuscatedName("UUQNASSN.g")
	public byte[] field1314;

	public UUQNASSN(NCIKLCII arg0, Socket arg1) throws IOException {
		field1313 = arg0;
		field1311 = arg1;
		field1311.setSoTimeout(30000);
		field1311.setTcpNoDelay(true);
		field1309 = field1311.getInputStream();
		field1310 = field1311.getOutputStream();
	}

	@ObfuscatedName("UUQNASSN.a()V")
	public void method546() {
		field1312 = true;

		try {
			if (field1309 != null) {
				field1309.close();
			}

			if (field1310 != null) {
				field1310.close();
			}

			if (field1311 != null) {
				field1311.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1317 = false;

		synchronized (this) {
			notify();
		}

		field1314 = null;
	}

	@ObfuscatedName("UUQNASSN.b()I")
	public int method547() throws IOException {
		if (field1312) {
			return 0;
		}

		return field1309.read();
	}

	@ObfuscatedName("UUQNASSN.c()I")
	public int method548() throws IOException {
		if (field1312) {
			return 0;
		}

		return field1309.available();
	}

	@ObfuscatedName("UUQNASSN.a([BII)V")
	public void method549(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1312) {
			while (arg2 > 0) {
				int var4 = field1309.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("UUQNASSN.a(IZ[BI)V")
	public void method550(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1312) {
			if (field1318) {
				field1318 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1314 == null) {
				field1314 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1314[field1316] = arg1[arg0 + var5];
					field1316 = (field1316 + 1) % 5000;
					if ((field1315 + 4900) % 5000 == field1316) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1317) {
					field1317 = true;
					field1313.method97(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1317) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1316 == field1315) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1317) {
					return;
				}

				var2 = field1315;

				if (field1316 >= field1315) {
					var3 = field1316 - field1315;
				} else {
					var3 = 5000 - field1315;
				}
			}

			if (var3 > 0) {
				try {
					field1310.write(field1314, var2, var3);
				} catch (IOException var7) {
					field1318 = true;
				}

				field1315 = (field1315 + var3) % 5000;
				try {
					if (field1316 == field1315) {
						field1310.flush();
					}
				} catch (IOException var6) {
					field1318 = true;
				}
			}
		}
	}

	@ObfuscatedName("UUQNASSN.a(I)V")
	public void method551() {
		System.out.println("dummy:" + field1312);
		System.out.println("tcycl:" + field1315);
		System.out.println("tnum:" + field1316);
		System.out.println("writer:" + field1317);
		System.out.println("ioerror:" + field1318);

		try {
			System.out.println("available:" + method548());
		} catch (IOException var1) {
		}
	}
}
