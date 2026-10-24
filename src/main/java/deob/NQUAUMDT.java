package deob;

import java.math.BigInteger;

@ObfuscatedName("NQUAUMDT")
public final class NQUAUMDT extends UCIRENXU {

	@ObfuscatedName("NQUAUMDT.G")
	public byte[] field928;

	@ObfuscatedName("NQUAUMDT.H")
	public int field929;

	@ObfuscatedName("NQUAUMDT.J")
	public static int[] field931 = new int[256];

	@ObfuscatedName("NQUAUMDT.K")
	public static final int[] field932 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("NQUAUMDT.P")
	public static FYVRCFGT field937 = new FYVRCFGT();

	@ObfuscatedName("NQUAUMDT.Q")
	public static FYVRCFGT field938 = new FYVRCFGT();

	@ObfuscatedName("NQUAUMDT.R")
	public static FYVRCFGT field939 = new FYVRCFGT();

	@ObfuscatedName("NQUAUMDT.S")
	public static char[] field940 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("NQUAUMDT.I")
	public int field930;

	@ObfuscatedName("NQUAUMDT.M")
	public static int field934;

	@ObfuscatedName("NQUAUMDT.N")
	public static int field935;

	@ObfuscatedName("NQUAUMDT.O")
	public static int field936;

	@ObfuscatedName("NQUAUMDT.L")
	public KAZZDHJI field933;

	@ObfuscatedName("NQUAUMDT.a(II)LNQUAUMDT;")
	public static NQUAUMDT method327(int arg0) {
		synchronized (field938) {
			NQUAUMDT var2 = null;
			if (arg0 == 0 && field934 > 0) {
				field934--;
				var2 = (NQUAUMDT) field937.method199();
			} else if (arg0 == 1 && field935 > 0) {
				field935--;
				var2 = (NQUAUMDT) field938.method199();
			} else if (arg0 == 2 && field936 > 0) {
				field936--;
				var2 = (NQUAUMDT) field939.method199();
			}

			if (var2 != null) {
				var2.field929 = 0;
				return var2;
			}
		}

		NQUAUMDT var4 = new NQUAUMDT();
		var4.field929 = 0;

		if (arg0 == 0) {
			var4.field928 = new byte[100];
		} else if (arg0 == 1) {
			var4.field928 = new byte[5000];
		} else {
			var4.field928 = new byte[30000];
		}

		return var4;
	}

	public NQUAUMDT() {
	}

	public NQUAUMDT(byte[] arg0) {
		field928 = arg0;
		field929 = 0;
	}

	@ObfuscatedName("NQUAUMDT.b(II)V")
	public void method328(int arg0) {
		field928[field929++] = (byte) (arg0 + field933.method241());
	}

	@ObfuscatedName("NQUAUMDT.a(I)V")
	public void method329(int arg0) {
		field928[field929++] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.b(I)V")
	public void method330(int arg0) {
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.a(IZ)V")
	public void method331(int arg0) {
		field928[field929++] = (byte) arg0;
		field928[field929++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NQUAUMDT.c(I)V")
	public void method332(int arg0) {
		field928[field929++] = (byte) (arg0 >> 16);
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.d(I)V")
	public void method333(int arg0) {
		field928[field929++] = (byte) (arg0 >> 24);
		field928[field929++] = (byte) (arg0 >> 16);
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.a(IB)V")
	public void method334(int arg0) {
		field928[field929++] = (byte) arg0;
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) (arg0 >> 16);
		field928[field929++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("NQUAUMDT.a(JZ)V")
	public void method335(long arg0) {
		field928[field929++] = (byte) (arg0 >> 56);
		field928[field929++] = (byte) (arg0 >> 48);
		field928[field929++] = (byte) (arg0 >> 40);
		field928[field929++] = (byte) (arg0 >> 32);
		field928[field929++] = (byte) (arg0 >> 24);
		field928[field929++] = (byte) (arg0 >> 16);
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.a(Ljava/lang/String;)V")
	public void method336(String arg0) {
		arg0.getBytes(0, arg0.length(), field928, field929);
		field929 += arg0.length();
		field928[field929++] = 10;
	}

	@ObfuscatedName("NQUAUMDT.a([BIII)V")
	public void method337(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field928[field929++] = arg0[var4];
		}
	}

	@ObfuscatedName("NQUAUMDT.c(II)V")
	public void method338(int arg0) {
		field928[field929 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("NQUAUMDT.c()I")
	public int method339() {
		return field928[field929++] & 0xFF;
	}

	@ObfuscatedName("NQUAUMDT.d()B")
	public byte method340() {
		return field928[field929++];
	}

	@ObfuscatedName("NQUAUMDT.e()I")
	public int method341() {
		field929 += 2;
		return ((field928[field929 - 2] & 0xFF) << 8) + (field928[field929 - 1] & 0xFF);
	}

	@ObfuscatedName("NQUAUMDT.f()I")
	public int method342() {
		field929 += 2;
		int var1 = ((field928[field929 - 2] & 0xFF) << 8) + (field928[field929 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NQUAUMDT.g()I")
	public int method343() {
		field929 += 3;
		return (field928[field929 - 1] & 0xFF) + ((field928[field929 - 3] & 0xFF) << 16) + ((field928[field929 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("NQUAUMDT.h()I")
	public int method344() {
		field929 += 4;
		return (field928[field929 - 1] & 0xFF) + ((field928[field929 - 2] & 0xFF) << 8) + ((field928[field929 - 4] & 0xFF) << 24) + ((field928[field929 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("NQUAUMDT.a(Z)J")
	public long method345() {
		long var1 = method344() & 0xFFFFFFFFL;
		long var3 = method344() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("NQUAUMDT.i()Ljava/lang/String;")
	public String method346() {
		int var1 = field929;

		while (field928[field929++] != 10) {
		}

		return new String(field928, var1, field929 - var1 - 1);
	}

	@ObfuscatedName("NQUAUMDT.e(I)[B")
	public byte[] method347() {
		int var1 = field929;

		while (field928[field929++] != 10) {
		}

		byte[] var2 = new byte[field929 - var1 - 1];
		for (int var3 = var1; var3 < field929 - 1; var3++) {
			var2[var3 - var1] = field928[var3];
		}

		return var2;
	}

	@ObfuscatedName("NQUAUMDT.a(I[BII)V")
	public void method348(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field928[field929++];
		}
	}

	@ObfuscatedName("NQUAUMDT.f(I)V")
	public void method349() {
		field930 = field929 * 8;
	}

	@ObfuscatedName("NQUAUMDT.d(II)I")
	public int method350(int arg0) {
		int var2 = field930 >> 3;
		int var3 = 8 - (field930 & 0x7);
		int var4 = 0;
		field930 += arg0;

		while (arg0 > var3) {
			var4 += (field928[var2++] & field932[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field928[var2] & field932[var3];
		} else {
			var4 += field928[var2] >> var3 - arg0 & field932[arg0];
		}

		return var4;
	}

	@ObfuscatedName("NQUAUMDT.g(I)V")
	public void method351() {
		field929 = (field930 + 7) / 8;
	}

	@ObfuscatedName("NQUAUMDT.j()I")
	public int method352() {
		int var1 = field928[field929] & 0xFF;
		if (var1 < 128) {
			return method339() - 64;
		}

		return method341() - 49152;
	}

	@ObfuscatedName("NQUAUMDT.k()I")
	public int method353() {
		int var1 = field928[field929] & 0xFF;
		if (var1 < 128) {
			return method339();
		}

		return method341() - 32768;
	}

	@ObfuscatedName("NQUAUMDT.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method354(BigInteger arg0, BigInteger arg1) {
		int var3 = field929;
		field929 = 0;
		byte[] var4 = new byte[var3];
		method348(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field929 = 0;
		method329(var7.length);
		method337(var7, var7.length, 0);
	}

	@ObfuscatedName("NQUAUMDT.a(BI)V")
	public void method355(int arg0) {
		field928[field929++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("NQUAUMDT.e(II)V")
	public void method356(int arg0) {
		field928[field929++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("NQUAUMDT.a(B)I")
	public int method357() {
		return field928[field929++] - 128 & 0xFF;
	}

	@ObfuscatedName("NQUAUMDT.h(I)I")
	public int method358() {
		return -field928[field929++] & 0xFF;
	}

	@ObfuscatedName("NQUAUMDT.i(I)I")
	public int method359() {
		return 128 - field928[field929++] & 0xFF;
	}

	@ObfuscatedName("NQUAUMDT.j(I)B")
	public byte method360() {
		return (byte) (field928[field929++] - 128);
	}

	@ObfuscatedName("NQUAUMDT.b(B)B")
	public byte method361() {
		return (byte) -field928[field929++];
	}

	@ObfuscatedName("NQUAUMDT.b(Z)B")
	public byte method362() {
		return (byte) (128 - field928[field929++]);
	}

	@ObfuscatedName("NQUAUMDT.b(IZ)V")
	public void method363(int arg0) {
		field928[field929++] = (byte) arg0;
		field928[field929++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NQUAUMDT.c(IZ)V")
	public void method364(int arg0) {
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("NQUAUMDT.f(II)V")
	public void method365(int arg0) {
		field928[field929++] = (byte) (arg0 + 128);
		field928[field929++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NQUAUMDT.c(B)I")
	public int method366() {
		field929 += 2;
		return ((field928[field929 - 1] & 0xFF) << 8) + (field928[field929 - 2] & 0xFF);
	}

	@ObfuscatedName("NQUAUMDT.k(I)I")
	public int method367() {
		field929 += 2;
		return ((field928[field929 - 2] & 0xFF) << 8) + (field928[field929 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("NQUAUMDT.d(B)I")
	public int method368() {
		field929 += 2;
		return ((field928[field929 - 1] & 0xFF) << 8) + (field928[field929 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("NQUAUMDT.e(B)I")
	public int method369() {
		field929 += 2;
		int var1 = ((field928[field929 - 1] & 0xFF) << 8) + (field928[field929 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NQUAUMDT.l(I)I")
	public int method370() {
		field929 += 2;
		int var1 = ((field928[field929 - 1] & 0xFF) << 8) + (field928[field929 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NQUAUMDT.c(Z)I")
	public int method371() {
		field929 += 3;
		return (field928[field929 - 2] & 0xFF) + ((field928[field929 - 3] & 0xFF) << 16) + ((field928[field929 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("NQUAUMDT.g(II)V")
	public void method372(int arg0) {
		field928[field929++] = (byte) arg0;
		field928[field929++] = (byte) (arg0 >> 8);
		field928[field929++] = (byte) (arg0 >> 16);
		field928[field929++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("NQUAUMDT.f(B)I")
	public int method373() {
		field929 += 4;
		return (field928[field929 - 4] & 0xFF) + ((field928[field929 - 3] & 0xFF) << 8) + ((field928[field929 - 1] & 0xFF) << 24) + ((field928[field929 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("NQUAUMDT.m(I)I")
	public int method374() {
		field929 += 4;
		return (field928[field929 - 3] & 0xFF) + ((field928[field929 - 4] & 0xFF) << 8) + ((field928[field929 - 2] & 0xFF) << 24) + ((field928[field929 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("NQUAUMDT.n(I)I")
	public int method375() {
		field929 += 4;
		return (field928[field929 - 2] & 0xFF) + ((field928[field929 - 1] & 0xFF) << 8) + ((field928[field929 - 3] & 0xFF) << 24) + ((field928[field929 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("NQUAUMDT.a(BI[BI)V")
	public void method376(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field928[field929++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("NQUAUMDT.b([BIII)V")
	public void method377(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = field928[field929++];
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

			field931[var0] = var1;
		}
	}
}
