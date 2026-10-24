package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("LLYASRTI")
public final class LLYASRTI implements Runnable {

	@ObfuscatedName("LLYASRTI.f")
	public boolean field964 = false;

	@ObfuscatedName("LLYASRTI.k")
	public boolean field969 = false;

	@ObfuscatedName("LLYASRTI.l")
	public boolean field970 = false;

	@ObfuscatedName("LLYASRTI.g")
	public QNTDRCTM field965;

	@ObfuscatedName("LLYASRTI.e")
	public Socket field963;

	@ObfuscatedName("LLYASRTI.c")
	public InputStream field961;

	@ObfuscatedName("LLYASRTI.d")
	public OutputStream field962;

	@ObfuscatedName("LLYASRTI.i")
	public int field967;

	@ObfuscatedName("LLYASRTI.j")
	public int field968;

	@ObfuscatedName("LLYASRTI.h")
	public byte[] field966;

	public LLYASRTI(Socket arg0, QNTDRCTM arg1) throws IOException {
		field965 = arg1;
		field963 = arg0;
		field963.setSoTimeout(30000);
		field963.setTcpNoDelay(true);
		field961 = field963.getInputStream();
		field962 = field963.getOutputStream();
	}

	@ObfuscatedName("LLYASRTI.a()V")
	public void method351() {
		field964 = true;

		try {
			if (field961 != null) {
				field961.close();
			}

			if (field962 != null) {
				field962.close();
			}

			if (field963 != null) {
				field963.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field969 = false;

		synchronized (this) {
			notify();
		}

		field966 = null;
	}

	@ObfuscatedName("LLYASRTI.b()I")
	public int method352() throws IOException {
		if (field964) {
			return 0;
		}

		return field961.read();
	}

	@ObfuscatedName("LLYASRTI.c()I")
	public int method353() throws IOException {
		if (field964) {
			return 0;
		}

		return field961.available();
	}

	@ObfuscatedName("LLYASRTI.a([BII)V")
	public void method354(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field964) {
			while (arg2 > 0) {
				int var4 = field961.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("LLYASRTI.a(III[B)V")
	public void method355(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field964) {
			if (field970) {
				field970 = false;
				throw new IOException("Error in writer thread");
			}

			if (field966 == null) {
				field966 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field966[field968] = arg2[arg0 + var5];
					field968 = (field968 + 1) % 5000;
					if ((field967 + 4900) % 5000 == field968) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field969) {
					field969 = true;
					field965.method102(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field969) {
			int var2;
			int var3;
			synchronized (this) {
				if (field968 == field967) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field969) {
					return;
				}

				var2 = field967;

				if (field968 >= field967) {
					var3 = field968 - field967;
				} else {
					var3 = 5000 - field967;
				}
			}

			if (var3 > 0) {
				try {
					field962.write(field966, var2, var3);
				} catch (IOException var7) {
					field970 = true;
				}

				field967 = (field967 + var3) % 5000;
				try {
					if (field968 == field967) {
						field962.flush();
					}
				} catch (IOException var6) {
					field970 = true;
				}
			}
		}
	}

	@ObfuscatedName("LLYASRTI.a(I)V")
	public void method356() {
		System.out.println("dummy:" + field964);
		System.out.println("tcycl:" + field967);
		System.out.println("tnum:" + field968);
		System.out.println("writer:" + field969);
		System.out.println("ioerror:" + field970);

		try {
			System.out.println("available:" + method353());
		} catch (IOException var1) {
		}
	}
}
