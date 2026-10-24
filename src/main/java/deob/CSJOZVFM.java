package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("CSJOZVFM")
public final class CSJOZVFM implements Runnable {

	@ObfuscatedName("CSJOZVFM.f")
	public boolean field507 = false;

	@ObfuscatedName("CSJOZVFM.k")
	public boolean field512 = false;

	@ObfuscatedName("CSJOZVFM.l")
	public boolean field513 = false;

	@ObfuscatedName("CSJOZVFM.g")
	public MKANHSMC field508;

	@ObfuscatedName("CSJOZVFM.e")
	public Socket field506;

	@ObfuscatedName("CSJOZVFM.c")
	public InputStream field504;

	@ObfuscatedName("CSJOZVFM.d")
	public OutputStream field505;

	@ObfuscatedName("CSJOZVFM.i")
	public int field510;

	@ObfuscatedName("CSJOZVFM.j")
	public int field511;

	@ObfuscatedName("CSJOZVFM.h")
	public byte[] field509;

	public CSJOZVFM(Socket arg0, MKANHSMC arg1) throws IOException {
		field508 = arg1;
		field506 = arg0;
		field506.setSoTimeout(30000);
		field506.setTcpNoDelay(true);
		field504 = field506.getInputStream();
		field505 = field506.getOutputStream();
	}

	@ObfuscatedName("CSJOZVFM.a()V")
	public void method194() {
		field507 = true;

		try {
			if (field504 != null) {
				field504.close();
			}

			if (field505 != null) {
				field505.close();
			}

			if (field506 != null) {
				field506.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field512 = false;

		synchronized (this) {
			notify();
		}

		field509 = null;
	}

	@ObfuscatedName("CSJOZVFM.b()I")
	public int method195() throws IOException {
		if (field507) {
			return 0;
		}

		return field504.read();
	}

	@ObfuscatedName("CSJOZVFM.c()I")
	public int method196() throws IOException {
		if (field507) {
			return 0;
		}

		return field504.available();
	}

	@ObfuscatedName("CSJOZVFM.a([BII)V")
	public void method197(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field507) {
			while (arg2 > 0) {
				int var4 = field504.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("CSJOZVFM.a([BIII)V")
	public void method198(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field507) {
			if (field513) {
				field513 = false;
				throw new IOException("Error in writer thread");
			}

			if (field509 == null) {
				field509 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field509[field511] = arg0[arg2 + var5];
					field511 = (field511 + 1) % 5000;
					if ((field510 + 4900) % 5000 == field511) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field512) {
					field512 = true;
					field508.method90(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field512) {
			int var2;
			int var3;
			synchronized (this) {
				if (field511 == field510) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field512) {
					return;
				}

				var2 = field510;

				if (field511 >= field510) {
					var3 = field511 - field510;
				} else {
					var3 = 5000 - field510;
				}
			}

			if (var3 > 0) {
				try {
					field505.write(field509, var2, var3);
				} catch (IOException var7) {
					field513 = true;
				}

				field510 = (field510 + var3) % 5000;
				try {
					if (field511 == field510) {
						field505.flush();
					}
				} catch (IOException var6) {
					field513 = true;
				}
			}
		}
	}

	@ObfuscatedName("CSJOZVFM.a(I)V")
	public void method199() {
		System.out.println("dummy:" + field507);
		System.out.println("tcycl:" + field510);
		System.out.println("tnum:" + field511);
		System.out.println("writer:" + field512);
		System.out.println("ioerror:" + field513);

		try {
			System.out.println("available:" + method196());
		} catch (IOException var1) {
		}
	}
}
