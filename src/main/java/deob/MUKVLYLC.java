package deob;

import java.math.BigInteger;

@ObfuscatedName("MUKVLYLC")
public final class MUKVLYLC extends ORGNKIAP {

	@ObfuscatedName("MUKVLYLC.z")
	public byte[] field811;

	@ObfuscatedName("MUKVLYLC.A")
	public int field812;

	@ObfuscatedName("MUKVLYLC.C")
	public static int[] field814 = new int[256];

	@ObfuscatedName("MUKVLYLC.D")
	public static final int[] field815 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MUKVLYLC.I")
	public static SWVPDERM field820 = new SWVPDERM();

	@ObfuscatedName("MUKVLYLC.J")
	public static SWVPDERM field821 = new SWVPDERM();

	@ObfuscatedName("MUKVLYLC.K")
	public static SWVPDERM field822 = new SWVPDERM();

	@ObfuscatedName("MUKVLYLC.L")
	public static char[] field823 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MUKVLYLC.B")
	public int field813;

	@ObfuscatedName("MUKVLYLC.F")
	public static int field817;

	@ObfuscatedName("MUKVLYLC.G")
	public static int field818;

	@ObfuscatedName("MUKVLYLC.H")
	public static int field819;

	@ObfuscatedName("MUKVLYLC.E")
	public LUUCVUQY field816;

	@ObfuscatedName("MUKVLYLC.a(ZI)LMUKVLYLC;")
	public static MUKVLYLC method280(int arg0) {
		synchronized (field821) {
			MUKVLYLC var2 = null;
			if (arg0 == 0 && field817 > 0) {
				field817--;
				var2 = (MUKVLYLC) field820.method481();
			} else if (arg0 == 1 && field818 > 0) {
				field818--;
				var2 = (MUKVLYLC) field821.method481();
			} else if (arg0 == 2 && field819 > 0) {
				field819--;
				var2 = (MUKVLYLC) field822.method481();
			}

			if (var2 != null) {
				var2.field812 = 0;
				return var2;
			}
		}

		MUKVLYLC var4 = new MUKVLYLC();
		var4.field812 = 0;

		if (arg0 == 0) {
			var4.field811 = new byte[100];
		} else if (arg0 == 1) {
			var4.field811 = new byte[5000];
		} else {
			var4.field811 = new byte[30000];
		}

		return var4;
	}

	public MUKVLYLC() {
	}

	public MUKVLYLC(byte[] arg0) {
		field811 = arg0;
		field812 = 0;
	}

	@ObfuscatedName("MUKVLYLC.a(II)V")
	public void method281(int arg0) {
		field811[field812++] = (byte) (arg0 + field816.method265());
	}

	@ObfuscatedName("MUKVLYLC.a(I)V")
	public void method282(int arg0) {
		field811[field812++] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.b(I)V")
	public void method283(int arg0) {
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.b(II)V")
	public void method284(int arg0) {
		field811[field812++] = (byte) arg0;
		field811[field812++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MUKVLYLC.c(I)V")
	public void method285(int arg0) {
		field811[field812++] = (byte) (arg0 >> 16);
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.d(I)V")
	public void method286(int arg0) {
		field811[field812++] = (byte) (arg0 >> 24);
		field811[field812++] = (byte) (arg0 >> 16);
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.c(II)V")
	public void method287(int arg0) {
		field811[field812++] = (byte) arg0;
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) (arg0 >> 16);
		field811[field812++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MUKVLYLC.a(JB)V")
	public void method288(long arg0) {
		field811[field812++] = (byte) (arg0 >> 56);
		field811[field812++] = (byte) (arg0 >> 48);
		field811[field812++] = (byte) (arg0 >> 40);
		field811[field812++] = (byte) (arg0 >> 32);
		field811[field812++] = (byte) (arg0 >> 24);
		field811[field812++] = (byte) (arg0 >> 16);
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.a(Ljava/lang/String;)V")
	public void method289(String arg0) {
		arg0.getBytes(0, arg0.length(), field811, field812);
		field812 += arg0.length();
		field811[field812++] = 10;
	}

	@ObfuscatedName("MUKVLYLC.a(I[BII)V")
	public void method290(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field811[field812++] = arg0[var4];
		}
	}

	@ObfuscatedName("MUKVLYLC.d(II)V")
	public void method291(int arg0) {
		field811[field812 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MUKVLYLC.c()I")
	public int method292() {
		return field811[field812++] & 0xFF;
	}

	@ObfuscatedName("MUKVLYLC.d()B")
	public byte method293() {
		return field811[field812++];
	}

	@ObfuscatedName("MUKVLYLC.e()I")
	public int method294() {
		field812 += 2;
		return ((field811[field812 - 2] & 0xFF) << 8) + (field811[field812 - 1] & 0xFF);
	}

	@ObfuscatedName("MUKVLYLC.f()I")
	public int method295() {
		field812 += 2;
		int var1 = ((field811[field812 - 2] & 0xFF) << 8) + (field811[field812 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MUKVLYLC.g()I")
	public int method296() {
		field812 += 3;
		return (field811[field812 - 1] & 0xFF) + ((field811[field812 - 3] & 0xFF) << 16) + ((field811[field812 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MUKVLYLC.h()I")
	public int method297() {
		field812 += 4;
		return (field811[field812 - 1] & 0xFF) + ((field811[field812 - 2] & 0xFF) << 8) + ((field811[field812 - 4] & 0xFF) << 24) + ((field811[field812 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MUKVLYLC.e(I)J")
	public long method298() {
		long var1 = method297() & 0xFFFFFFFFL;
		long var3 = method297() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MUKVLYLC.i()Ljava/lang/String;")
	public String method299() {
		int var1 = field812;

		while (field811[field812++] != 10) {
		}

		return new String(field811, var1, field812 - var1 - 1);
	}

	@ObfuscatedName("MUKVLYLC.a(B)[B")
	public byte[] method300() {
		int var1 = field812;

		while (field811[field812++] != 10) {
		}

		byte[] var2 = new byte[field812 - var1 - 1];
		for (int var3 = var1; var3 < field812 - 1; var3++) {
			var2[var3 - var1] = field811[var3];
		}

		return var2;
	}

	@ObfuscatedName("MUKVLYLC.b(I[BII)V")
	public void method301(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field811[field812++];
		}
	}

	@ObfuscatedName("MUKVLYLC.a(Z)V")
	public void method302() {
		field813 = field812 * 8;
	}

	@ObfuscatedName("MUKVLYLC.a(BI)I")
	public int method303(int arg0) {
		int var2 = field813 >> 3;
		int var3 = 8 - (field813 & 0x7);
		int var4 = 0;
		field813 += arg0;

		while (arg0 > var3) {
			var4 += (field811[var2++] & field815[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field811[var2] & field815[var3];
		} else {
			var4 += field811[var2] >> var3 - arg0 & field815[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MUKVLYLC.f(I)V")
	public void method304() {
		field812 = (field813 + 7) / 8;
	}

	@ObfuscatedName("MUKVLYLC.j()I")
	public int method305() {
		int var1 = field811[field812] & 0xFF;
		if (var1 < 128) {
			return method292() - 64;
		}

		return method294() - 49152;
	}

	@ObfuscatedName("MUKVLYLC.k()I")
	public int method306() {
		int var1 = field811[field812] & 0xFF;
		if (var1 < 128) {
			return method292();
		}

		return method294() - 32768;
	}

	@ObfuscatedName("MUKVLYLC.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method307(BigInteger arg0, BigInteger arg1) {
		int var3 = field812;
		field812 = 0;
		byte[] var4 = new byte[var3];
		method301(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field812 = 0;
		method282(var7.length);
		method290(var7, 0, var7.length);
	}

	@ObfuscatedName("MUKVLYLC.e(II)V")
	public void method308(int arg0) {
		field811[field812++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MUKVLYLC.a(IB)V")
	public void method309(int arg0) {
		field811[field812++] = (byte) -arg0;
	}

	@ObfuscatedName("MUKVLYLC.g(I)I")
	public int method310() {
		return field811[field812++] - 128 & 0xFF;
	}

	@ObfuscatedName("MUKVLYLC.b(B)I")
	public int method311() {
		return -field811[field812++] & 0xFF;
	}

	@ObfuscatedName("MUKVLYLC.h(I)I")
	public int method312() {
		return 128 - field811[field812++] & 0xFF;
	}

	@ObfuscatedName("MUKVLYLC.b(Z)B")
	public byte method313() {
		return (byte) (field811[field812++] - 128);
	}

	@ObfuscatedName("MUKVLYLC.i(I)B")
	public byte method314() {
		return (byte) -field811[field812++];
	}

	@ObfuscatedName("MUKVLYLC.b(IB)V")
	public void method315(int arg0) {
		field811[field812++] = (byte) arg0;
		field811[field812++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MUKVLYLC.b(BI)V")
	public void method316(int arg0) {
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MUKVLYLC.c(IB)V")
	public void method317(int arg0) {
		field811[field812++] = (byte) (arg0 + 128);
		field811[field812++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MUKVLYLC.c(B)I")
	public int method318() {
		field812 += 2;
		return ((field811[field812 - 1] & 0xFF) << 8) + (field811[field812 - 2] & 0xFF);
	}

	@ObfuscatedName("MUKVLYLC.j(I)I")
	public int method319() {
		field812 += 2;
		return ((field811[field812 - 2] & 0xFF) << 8) + (field811[field812 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MUKVLYLC.d(B)I")
	public int method320() {
		field812 += 2;
		return ((field811[field812 - 1] & 0xFF) << 8) + (field811[field812 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MUKVLYLC.e(B)I")
	public int method321() {
		field812 += 2;
		int var1 = ((field811[field812 - 1] & 0xFF) << 8) + (field811[field812 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MUKVLYLC.f(B)I")
	public int method322() {
		field812 += 2;
		int var1 = ((field811[field812 - 2] & 0xFF) << 8) + (field811[field812 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MUKVLYLC.c(Z)I")
	public int method323() {
		field812 += 2;
		int var1 = ((field811[field812 - 1] & 0xFF) << 8) + (field811[field812 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MUKVLYLC.f(II)V")
	public void method324(int arg0) {
		field811[field812++] = (byte) (arg0 >> 8);
		field811[field812++] = (byte) arg0;
		field811[field812++] = (byte) (arg0 >> 24);
		field811[field812++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("MUKVLYLC.k(I)I")
	public int method325() {
		field812 += 4;
		return (field811[field812 - 3] & 0xFF) + ((field811[field812 - 4] & 0xFF) << 8) + ((field811[field812 - 2] & 0xFF) << 24) + ((field811[field812 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MUKVLYLC.l(I)I")
	public int method326() {
		field812 += 4;
		return (field811[field812 - 2] & 0xFF) + ((field811[field812 - 1] & 0xFF) << 8) + ((field811[field812 - 3] & 0xFF) << 24) + ((field811[field812 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MUKVLYLC.a(Z[BII)V")
	public void method327(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			field811[field812++] = arg0[var4];
		}
	}

	@ObfuscatedName("MUKVLYLC.a([BIII)V")
	public void method328(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = field811[field812++];
		}
	}

	@ObfuscatedName("MUKVLYLC.a(II[BB)V")
	public void method329(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = (byte) (field811[field812++] - 128);
		}
	}

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 1;
				}
			}

			field814[var0] = var1;
		}
	}
}
