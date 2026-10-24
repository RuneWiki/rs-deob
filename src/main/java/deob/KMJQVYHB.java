package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("KMJQVYHB")
public final class KMJQVYHB implements Runnable {

	@ObfuscatedName("KMJQVYHB.f")
	public boolean field961 = false;

	@ObfuscatedName("KMJQVYHB.k")
	public boolean field966 = false;

	@ObfuscatedName("KMJQVYHB.l")
	public boolean field967 = false;

	@ObfuscatedName("KMJQVYHB.g")
	public AHZQVBFX field962;

	@ObfuscatedName("KMJQVYHB.e")
	public Socket field960;

	@ObfuscatedName("KMJQVYHB.c")
	public InputStream field958;

	@ObfuscatedName("KMJQVYHB.d")
	public OutputStream field959;

	@ObfuscatedName("KMJQVYHB.i")
	public int field964;

	@ObfuscatedName("KMJQVYHB.j")
	public int field965;

	@ObfuscatedName("KMJQVYHB.h")
	public byte[] field963;

	public KMJQVYHB(Socket arg0, AHZQVBFX arg1) throws IOException {
		field962 = arg1;
		field960 = arg0;
		field960.setSoTimeout(30000);
		field960.setTcpNoDelay(true);
		field958 = field960.getInputStream();
		field959 = field960.getOutputStream();
	}

	@ObfuscatedName("KMJQVYHB.a()V")
	public void method304() {
		field961 = true;

		try {
			if (field958 != null) {
				field958.close();
			}

			if (field959 != null) {
				field959.close();
			}

			if (field960 != null) {
				field960.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field966 = false;

		synchronized (this) {
			notify();
		}

		field963 = null;
	}

	@ObfuscatedName("KMJQVYHB.b()I")
	public int method305() throws IOException {
		if (field961) {
			return 0;
		}

		return field958.read();
	}

	@ObfuscatedName("KMJQVYHB.c()I")
	public int method306() throws IOException {
		if (field961) {
			return 0;
		}

		return field958.available();
	}

	@ObfuscatedName("KMJQVYHB.a([BII)V")
	public void method307(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field961) {
			while (arg2 > 0) {
				int var4 = field958.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("KMJQVYHB.a(IZ[BI)V")
	public void method308(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field961) {
			if (field967) {
				field967 = false;
				throw new IOException("Error in writer thread");
			}

			if (field963 == null) {
				field963 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field963[field965] = arg1[arg2 + var5];
					field965 = (field965 + 1) % 5000;
					if ((field964 + 4900) % 5000 == field965) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field966) {
					field966 = true;
					field962.method25(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field966) {
			int var2;
			int var3;
			synchronized (this) {
				if (field965 == field964) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field966) {
					return;
				}

				var2 = field964;

				if (field965 >= field964) {
					var3 = field965 - field964;
				} else {
					var3 = 5000 - field964;
				}
			}

			if (var3 > 0) {
				try {
					field959.write(field963, var2, var3);
				} catch (IOException var7) {
					field967 = true;
				}

				field964 = (field964 + var3) % 5000;
				try {
					if (field965 == field964) {
						field959.flush();
					}
				} catch (IOException var6) {
					field967 = true;
				}
			}
		}
	}

	@ObfuscatedName("KMJQVYHB.a(I)V")
	public void method309() {
		System.out.println("dummy:" + field961);
		System.out.println("tcycl:" + field964);
		System.out.println("tnum:" + field965);
		System.out.println("writer:" + field966);
		System.out.println("ioerror:" + field967);

		try {
			System.out.println("available:" + method306());
		} catch (IOException var1) {
		}
	}
}
