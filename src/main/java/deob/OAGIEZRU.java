package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("OAGIEZRU")
public final class OAGIEZRU implements Runnable {

	@ObfuscatedName("OAGIEZRU.e")
	public boolean field1065 = false;

	@ObfuscatedName("OAGIEZRU.j")
	public boolean field1070 = false;

	@ObfuscatedName("OAGIEZRU.k")
	public boolean field1071 = false;

	@ObfuscatedName("OAGIEZRU.f")
	public KISFBCOP field1066;

	@ObfuscatedName("OAGIEZRU.d")
	public Socket field1064;

	@ObfuscatedName("OAGIEZRU.b")
	public InputStream field1062;

	@ObfuscatedName("OAGIEZRU.c")
	public OutputStream field1063;

	@ObfuscatedName("OAGIEZRU.h")
	public int field1068;

	@ObfuscatedName("OAGIEZRU.i")
	public int field1069;

	@ObfuscatedName("OAGIEZRU.g")
	public byte[] field1067;

	public OAGIEZRU(KISFBCOP arg0, Socket arg1) throws IOException {
		field1066 = arg0;
		field1064 = arg1;
		field1064.setSoTimeout(30000);
		field1064.setTcpNoDelay(true);
		field1062 = field1064.getInputStream();
		field1063 = field1064.getOutputStream();
	}

	@ObfuscatedName("OAGIEZRU.a()V")
	public void method378() {
		field1065 = true;

		try {
			if (field1062 != null) {
				field1062.close();
			}

			if (field1063 != null) {
				field1063.close();
			}

			if (field1064 != null) {
				field1064.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field1070 = false;

		synchronized (this) {
			notify();
		}

		field1067 = null;
	}

	@ObfuscatedName("OAGIEZRU.b()I")
	public int method379() throws IOException {
		if (field1065) {
			return 0;
		}

		return field1062.read();
	}

	@ObfuscatedName("OAGIEZRU.c()I")
	public int method380() throws IOException {
		if (field1065) {
			return 0;
		}

		return field1062.available();
	}

	@ObfuscatedName("OAGIEZRU.a([BII)V")
	public void method381(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1065) {
			while (arg2 > 0) {
				int var4 = field1062.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("OAGIEZRU.a(B[BII)V")
	public void method382(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field1065) {
			if (field1071) {
				field1071 = false;
				throw new IOException("Error in writer thread");
			}

			if (field1067 == null) {
				field1067 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field1067[field1069] = arg0[arg1 + var5];
					field1069 = (field1069 + 1) % 5000;
					if ((field1068 + 4900) % 5000 == field1069) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field1070) {
					field1070 = true;
					field1066.method86(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field1070) {
			int var2;
			int var3;
			synchronized (this) {
				if (field1069 == field1068) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field1070) {
					return;
				}

				var2 = field1068;

				if (field1069 >= field1068) {
					var3 = field1069 - field1068;
				} else {
					var3 = 5000 - field1068;
				}
			}

			if (var3 > 0) {
				try {
					field1063.write(field1067, var2, var3);
				} catch (IOException var7) {
					field1071 = true;
				}

				field1068 = (field1068 + var3) % 5000;
				try {
					if (field1069 == field1068) {
						field1063.flush();
					}
				} catch (IOException var6) {
					field1071 = true;
				}
			}
		}
	}

	@ObfuscatedName("OAGIEZRU.a(Z)V")
	public void method383() {
		System.out.println("dummy:" + field1065);
		System.out.println("tcycl:" + field1068);
		System.out.println("tnum:" + field1069);
		System.out.println("writer:" + field1070);
		System.out.println("ioerror:" + field1071);

		try {
			System.out.println("available:" + method380());
		} catch (IOException var1) {
		}
	}
}
