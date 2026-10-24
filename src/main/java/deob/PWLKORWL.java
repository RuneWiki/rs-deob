package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("PWLKORWL")
public final class PWLKORWL implements Runnable {

	@ObfuscatedName("PWLKORWL.d")
	public boolean field1199 = false;

	@ObfuscatedName("PWLKORWL.i")
	public boolean field1204 = false;

	@ObfuscatedName("PWLKORWL.j")
	public boolean field1205 = false;

	@ObfuscatedName("PWLKORWL.e")
	public HXUVWQPY field1200;

	@ObfuscatedName("PWLKORWL.c")
	public Socket field1198;

	@ObfuscatedName("PWLKORWL.a")
	public InputStream field1196;

	@ObfuscatedName("PWLKORWL.b")
	public OutputStream field1197;

	@ObfuscatedName("PWLKORWL.g")
	public int field1202;

	@ObfuscatedName("PWLKORWL.h")
	public int field1203;

	@ObfuscatedName("PWLKORWL.f")
	public byte[] field1201;

	public PWLKORWL(HXUVWQPY arg0, Socket arg1) throws IOException {
		field1200 = arg0;
		field1198 = arg1;
		field1198.setSoTimeout(30000);
		field1198.setTcpNoDelay(true);
		field1196 = field1198.getInputStream();
		field1197 = field1198.getOutputStream();
	}

	@ObfuscatedName("PWLKORWL.a()V")
	public void method468() {
		field1199 = true;

		try {
			if (field1196 != null) {
				field1196.close();
			}

			if (field1197 != null) {
				field1197.close();
			}

			if (field1198 != null) {
				field1198.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1204 = false;

		synchronized (this) {
			notify();
		}

		field1201 = null;
	}

	@ObfuscatedName("PWLKORWL.b()I")
	public int method469() throws IOException {
		if (field1199) {
			return 0;
		}

		return field1196.read();
	}

	@ObfuscatedName("PWLKORWL.c()I")
	public int method470() throws IOException {
		if (field1199) {
			return 0;
		}

		return field1196.available();
	}

	@ObfuscatedName("PWLKORWL.a([BII)V")
	public void method471(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1199) {
			while (arg2 > 0) {
				int var4 = field1196.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("PWLKORWL.a([BIII)V")
	public void method472(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1199) {
			if (field1205) {
				field1205 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1201 == null) {
				field1201 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field1201[field1203] = arg0[arg2 + var5];
					field1203 = (field1203 + 1) % 5000;
					if ((field1202 + 4900) % 5000 == field1203) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1204) {
					field1204 = true;
					field1200.method154(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1204) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1203 == field1202) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1204) {
					return;
				}

				var2 = field1202;

				if (field1203 >= field1202) {
					var3 = field1203 - field1202;
				} else {
					var3 = 5000 - field1202;
				}
			}

			if (var3 > 0) {
				try {
					field1197.write(field1201, var2, var3);
				} catch (IOException var7) {
					field1205 = true;
				}

				field1202 = (field1202 + var3) % 5000;
				try {
					if (field1203 == field1202) {
						field1197.flush();
					}
				} catch (IOException var6) {
					field1205 = true;
				}
			}
		}
	}

	@ObfuscatedName("PWLKORWL.a(I)V")
	public void method473() {
		System.out.println("dummy:" + field1199);
		System.out.println("tcycl:" + field1202);
		System.out.println("tnum:" + field1203);
		System.out.println("writer:" + field1204);
		System.out.println("ioerror:" + field1205);

		try {
			System.out.println("available:" + method470());
		} catch (IOException var1) {
		}
	}
}
