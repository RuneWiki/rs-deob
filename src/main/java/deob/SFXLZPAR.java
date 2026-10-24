package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("SFXLZPAR")
public final class SFXLZPAR implements Runnable {

	@ObfuscatedName("SFXLZPAR.e")
	public boolean field1076 = false;

	@ObfuscatedName("SFXLZPAR.j")
	public boolean field1081 = false;

	@ObfuscatedName("SFXLZPAR.k")
	public boolean field1082 = false;

	@ObfuscatedName("SFXLZPAR.f")
	public MUZNSFEY field1077;

	@ObfuscatedName("SFXLZPAR.d")
	public Socket field1075;

	@ObfuscatedName("SFXLZPAR.b")
	public InputStream field1073;

	@ObfuscatedName("SFXLZPAR.c")
	public OutputStream field1074;

	@ObfuscatedName("SFXLZPAR.h")
	public int field1079;

	@ObfuscatedName("SFXLZPAR.i")
	public int field1080;

	@ObfuscatedName("SFXLZPAR.g")
	public byte[] field1078;

	public SFXLZPAR(MUZNSFEY arg0, Socket arg1) throws IOException {
		field1077 = arg0;
		field1075 = arg1;
		field1075.setSoTimeout(30000);
		field1075.setTcpNoDelay(true);
		field1073 = field1075.getInputStream();
		field1074 = field1075.getOutputStream();
	}

	@ObfuscatedName("SFXLZPAR.a()V")
	public void method397() {
		field1076 = true;

		try {
			if (field1073 != null) {
				field1073.close();
			}

			if (field1074 != null) {
				field1074.close();
			}

			if (field1075 != null) {
				field1075.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1081 = false;

		synchronized (this) {
			notify();
		}

		field1078 = null;
	}

	@ObfuscatedName("SFXLZPAR.b()I")
	public int method398() throws IOException {
		if (field1076) {
			return 0;
		}

		return field1073.read();
	}

	@ObfuscatedName("SFXLZPAR.c()I")
	public int method399() throws IOException {
		if (field1076) {
			return 0;
		}

		return field1073.available();
	}

	@ObfuscatedName("SFXLZPAR.a([BII)V")
	public void method400(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1076) {
			while (arg2 > 0) {
				int var4 = field1073.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("SFXLZPAR.a(III[B)V")
	public void method401(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field1076) {
			if (field1082) {
				field1082 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1078 == null) {
				field1078 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field1078[field1080] = arg2[arg1 + var5];
					field1080 = (field1080 + 1) % 5000;
					if ((field1079 + 4900) % 5000 == field1080) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1081) {
					field1081 = true;
					field1077.method141(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1081) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1080 == field1079) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1081) {
					return;
				}

				var2 = field1079;

				if (field1080 >= field1079) {
					var3 = field1080 - field1079;
				} else {
					var3 = 5000 - field1079;
				}
			}

			if (var3 > 0) {
				try {
					field1074.write(field1078, var2, var3);
				} catch (IOException var7) {
					field1082 = true;
				}

				field1079 = (field1079 + var3) % 5000;
				try {
					if (field1080 == field1079) {
						field1074.flush();
					}
				} catch (IOException var6) {
					field1082 = true;
				}
			}
		}
	}

	@ObfuscatedName("SFXLZPAR.a(I)V")
	public void method402() {
		System.out.println("dummy:" + field1076);
		System.out.println("tcycl:" + field1079);
		System.out.println("tnum:" + field1080);
		System.out.println("writer:" + field1081);
		System.out.println("ioerror:" + field1082);

		try {
			System.out.println("available:" + method399());
		} catch (IOException var1) {
		}
	}
}
