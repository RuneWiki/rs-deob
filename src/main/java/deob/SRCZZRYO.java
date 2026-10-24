package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("SRCZZRYO")
public final class SRCZZRYO implements Runnable {

	@ObfuscatedName("SRCZZRYO.g")
	public boolean field1228 = false;

	@ObfuscatedName("SRCZZRYO.l")
	public boolean field1233 = false;

	@ObfuscatedName("SRCZZRYO.m")
	public boolean field1234 = false;

	@ObfuscatedName("SRCZZRYO.h")
	public EOQQYERM field1229;

	@ObfuscatedName("SRCZZRYO.f")
	public Socket field1227;

	@ObfuscatedName("SRCZZRYO.d")
	public InputStream field1225;

	@ObfuscatedName("SRCZZRYO.e")
	public OutputStream field1226;

	@ObfuscatedName("SRCZZRYO.j")
	public int field1231;

	@ObfuscatedName("SRCZZRYO.k")
	public int field1232;

	@ObfuscatedName("SRCZZRYO.i")
	public byte[] field1230;

	public SRCZZRYO(Socket arg0, EOQQYERM arg1) throws IOException {
		field1229 = arg1;
		field1227 = arg0;
		field1227.setSoTimeout(30000);
		field1227.setTcpNoDelay(true);
		field1225 = field1227.getInputStream();
		field1226 = field1227.getOutputStream();
	}

	@ObfuscatedName("SRCZZRYO.a()V")
	public void method456() {
		field1228 = true;

		try {
			if (field1225 != null) {
				field1225.close();
			}

			if (field1226 != null) {
				field1226.close();
			}

			if (field1227 != null) {
				field1227.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1233 = false;

		synchronized (this) {
			notify();
		}

		field1230 = null;
	}

	@ObfuscatedName("SRCZZRYO.b()I")
	public int method457() throws IOException {
		if (field1228) {
			return 0;
		}

		return field1225.read();
	}

	@ObfuscatedName("SRCZZRYO.c()I")
	public int method458() throws IOException {
		if (field1228) {
			return 0;
		}

		return field1225.available();
	}

	@ObfuscatedName("SRCZZRYO.a([BII)V")
	public void method459(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1228) {
			while (arg2 > 0) {
				int var4 = field1225.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("SRCZZRYO.a(II[BI)V")
	public void method460(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field1228) {
			if (field1234) {
				field1234 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1230 == null) {
				field1230 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field1230[field1232] = arg1[arg2 + var5];
					field1232 = (field1232 + 1) % 5000;
					if ((field1231 + 4900) % 5000 == field1232) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1233) {
					field1233 = true;
					field1229.method107(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1233) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1232 == field1231) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1233) {
					return;
				}

				var2 = field1231;

				if (field1232 >= field1231) {
					var3 = field1232 - field1231;
				} else {
					var3 = 5000 - field1231;
				}
			}

			if (var3 > 0) {
				try {
					field1226.write(field1230, var2, var3);
				} catch (IOException var7) {
					field1234 = true;
				}

				field1231 = (field1231 + var3) % 5000;
				try {
					if (field1232 == field1231) {
						field1226.flush();
					}
				} catch (IOException var6) {
					field1234 = true;
				}
			}
		}
	}

	@ObfuscatedName("SRCZZRYO.a(B)V")
	public void method461() {
		System.out.println("dummy:" + field1228);
		System.out.println("tcycl:" + field1231);
		System.out.println("tnum:" + field1232);
		System.out.println("writer:" + field1233);
		System.out.println("ioerror:" + field1234);

		try {
			System.out.println("available:" + method458());
		} catch (IOException var1) {
		}
	}
}
