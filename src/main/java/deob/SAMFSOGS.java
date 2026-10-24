package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("SAMFSOGS")
public final class SAMFSOGS implements Runnable {

	@ObfuscatedName("SAMFSOGS.d")
	public boolean field1202 = false;

	@ObfuscatedName("SAMFSOGS.i")
	public boolean field1207 = false;

	@ObfuscatedName("SAMFSOGS.j")
	public boolean field1208 = false;

	@ObfuscatedName("SAMFSOGS.e")
	public MKNKYTZT field1203;

	@ObfuscatedName("SAMFSOGS.c")
	public Socket field1201;

	@ObfuscatedName("SAMFSOGS.a")
	public InputStream field1199;

	@ObfuscatedName("SAMFSOGS.b")
	public OutputStream field1200;

	@ObfuscatedName("SAMFSOGS.g")
	public int field1205;

	@ObfuscatedName("SAMFSOGS.h")
	public int field1206;

	@ObfuscatedName("SAMFSOGS.f")
	public byte[] field1204;

	public SAMFSOGS(MKNKYTZT arg0, Socket arg1) throws IOException {
		field1203 = arg0;
		field1201 = arg1;
		field1201.setSoTimeout(30000);
		field1201.setTcpNoDelay(true);
		field1199 = field1201.getInputStream();
		field1200 = field1201.getOutputStream();
	}

	@ObfuscatedName("SAMFSOGS.a()V")
	public void method516() {
		field1202 = true;

		try {
			if (field1199 != null) {
				field1199.close();
			}

			if (field1200 != null) {
				field1200.close();
			}

			if (field1201 != null) {
				field1201.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1207 = false;

		synchronized (this) {
			notify();
		}

		field1204 = null;
	}

	@ObfuscatedName("SAMFSOGS.b()I")
	public int method517() throws IOException {
		if (field1202) {
			return 0;
		}

		return field1199.read();
	}

	@ObfuscatedName("SAMFSOGS.c()I")
	public int method518() throws IOException {
		if (field1202) {
			return 0;
		}

		return field1199.available();
	}

	@ObfuscatedName("SAMFSOGS.a([BII)V")
	public void method519(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1202) {
			while (arg2 > 0) {
				int var4 = field1199.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("SAMFSOGS.a(IIB[B)V")
	public void method520(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field1202) {
			if (field1208) {
				field1208 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1204 == null) {
				field1204 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1204[field1206] = arg2[arg0 + var5];
					field1206 = (field1206 + 1) % 5000;
					if ((field1205 + 4900) % 5000 == field1206) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1207) {
					field1207 = true;
					field1203.method139(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1207) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1206 == field1205) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1207) {
					return;
				}

				var2 = field1205;

				if (field1206 >= field1205) {
					var3 = field1206 - field1205;
				} else {
					var3 = 5000 - field1205;
				}
			}

			if (var3 > 0) {
				try {
					field1200.write(field1204, var2, var3);
				} catch (IOException var7) {
					field1208 = true;
				}

				field1205 = (field1205 + var3) % 5000;
				try {
					if (field1206 == field1205) {
						field1200.flush();
					}
				} catch (IOException var6) {
					field1208 = true;
				}
			}
		}
	}

	@ObfuscatedName("SAMFSOGS.a(I)V")
	public void method521() {
		System.out.println("dummy:" + field1202);
		System.out.println("tcycl:" + field1205);
		System.out.println("tnum:" + field1206);
		System.out.println("writer:" + field1207);
		System.out.println("ioerror:" + field1208);

		try {
			System.out.println("available:" + method518());
		} catch (IOException var1) {
		}
	}
}
