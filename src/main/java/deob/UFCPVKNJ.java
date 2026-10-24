package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("UFCPVKNJ")
public final class UFCPVKNJ implements Runnable {

	@ObfuscatedName("UFCPVKNJ.g")
	public boolean field1329 = false;

	@ObfuscatedName("UFCPVKNJ.l")
	public boolean field1334 = false;

	@ObfuscatedName("UFCPVKNJ.m")
	public boolean field1335 = false;

	@ObfuscatedName("UFCPVKNJ.h")
	public KWRIFYWM field1330;

	@ObfuscatedName("UFCPVKNJ.f")
	public Socket field1328;

	@ObfuscatedName("UFCPVKNJ.d")
	public InputStream field1326;

	@ObfuscatedName("UFCPVKNJ.e")
	public OutputStream field1327;

	@ObfuscatedName("UFCPVKNJ.j")
	public int field1332;

	@ObfuscatedName("UFCPVKNJ.k")
	public int field1333;

	@ObfuscatedName("UFCPVKNJ.i")
	public byte[] field1331;

	public UFCPVKNJ(Socket arg0, KWRIFYWM arg1) throws IOException {
		field1330 = arg1;
		field1328 = arg0;
		field1328.setSoTimeout(30000);
		field1328.setTcpNoDelay(true);
		field1326 = field1328.getInputStream();
		field1327 = field1328.getOutputStream();
	}

	@ObfuscatedName("UFCPVKNJ.a()V")
	public void method543() {
		field1329 = true;

		try {
			if (field1326 != null) {
				field1326.close();
			}

			if (field1327 != null) {
				field1327.close();
			}

			if (field1328 != null) {
				field1328.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1334 = false;

		synchronized (this) {
			notify();
		}

		field1331 = null;
	}

	@ObfuscatedName("UFCPVKNJ.b()I")
	public int method544() throws IOException {
		if (field1329) {
			return 0;
		}

		return field1326.read();
	}

	@ObfuscatedName("UFCPVKNJ.c()I")
	public int method545() throws IOException {
		if (field1329) {
			return 0;
		}

		return field1326.available();
	}

	@ObfuscatedName("UFCPVKNJ.a([BII)V")
	public void method546(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1329) {
			while (arg2 > 0) {
				int var4 = field1326.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("UFCPVKNJ.a(B[BII)V")
	public void method547(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1329) {
			if (field1335) {
				field1335 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1331 == null) {
				field1331 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1331[field1333] = arg0[arg2 + var5];
					field1333 = (field1333 + 1) % 5000;
					if ((field1332 + 4900) % 5000 == field1333) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1334) {
					field1334 = true;
					field1330.method51(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1334) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1333 == field1332) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1334) {
					return;
				}

				var2 = field1332;

				if (field1333 >= field1332) {
					var3 = field1333 - field1332;
				} else {
					var3 = 5000 - field1332;
				}
			}

			if (var3 > 0) {
				try {
					field1327.write(field1331, var2, var3);
				} catch (IOException var7) {
					field1335 = true;
				}

				field1332 = (field1332 + var3) % 5000;
				try {
					if (field1333 == field1332) {
						field1327.flush();
					}
				} catch (IOException var6) {
					field1335 = true;
				}
			}
		}
	}

	@ObfuscatedName("UFCPVKNJ.a(I)V")
	public void method548() {
		System.out.println("dummy:" + field1329);
		System.out.println("tcycl:" + field1332);
		System.out.println("tnum:" + field1333);
		System.out.println("writer:" + field1334);
		System.out.println("ioerror:" + field1335);

		try {
			System.out.println("available:" + method545());
		} catch (IOException var1) {
		}
	}
}
