package deob;

import java.math.BigInteger;

@ObfuscatedName("PQBRPYKE")
public final class PQBRPYKE extends YBEHHNFF {

	@ObfuscatedName("PQBRPYKE.B")
	public byte[] field1090;

	@ObfuscatedName("PQBRPYKE.C")
	public int field1091;

	@ObfuscatedName("PQBRPYKE.E")
	public static int[] field1093 = new int[256];

	@ObfuscatedName("PQBRPYKE.F")
	public static final int[] field1094 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("PQBRPYKE.K")
	public static VGFLNLXH field1099 = new VGFLNLXH();

	@ObfuscatedName("PQBRPYKE.L")
	public static VGFLNLXH field1100 = new VGFLNLXH();

	@ObfuscatedName("PQBRPYKE.M")
	public static VGFLNLXH field1101 = new VGFLNLXH();

	@ObfuscatedName("PQBRPYKE.N")
	public static char[] field1102 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("PQBRPYKE.D")
	public int field1092;

	@ObfuscatedName("PQBRPYKE.H")
	public static int field1096;

	@ObfuscatedName("PQBRPYKE.I")
	public static int field1097;

	@ObfuscatedName("PQBRPYKE.J")
	public static int field1098;

	@ObfuscatedName("PQBRPYKE.G")
	public WUYFIEBK field1095;

	@ObfuscatedName("PQBRPYKE.a(II)LPQBRPYKE;")
	public static PQBRPYKE method328(int arg0) {
		synchronized (field1100) {
			PQBRPYKE var2 = null;
			if (arg0 == 0 && field1096 > 0) {
				field1096--;
				var2 = (PQBRPYKE) field1099.method531();
			} else if (arg0 == 1 && field1097 > 0) {
				field1097--;
				var2 = (PQBRPYKE) field1100.method531();
			} else if (arg0 == 2 && field1098 > 0) {
				field1098--;
				var2 = (PQBRPYKE) field1101.method531();
			}

			if (var2 != null) {
				var2.field1091 = 0;
				return var2;
			}
		}

		PQBRPYKE var4 = new PQBRPYKE();
		var4.field1091 = 0;

		if (arg0 == 0) {
			var4.field1090 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1090 = new byte[5000];
		} else {
			var4.field1090 = new byte[30000];
		}

		return var4;
	}

	public PQBRPYKE() {
	}

	public PQBRPYKE(byte[] arg0) {
		field1090 = arg0;
		field1091 = 0;
	}

	@ObfuscatedName("PQBRPYKE.a(IZ)V")
	public void method329(int arg0) {
		field1090[field1091++] = (byte) (arg0 + field1095.method556());
	}

	@ObfuscatedName("PQBRPYKE.a(I)V")
	public void method330(int arg0) {
		field1090[field1091++] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.b(I)V")
	public void method331(int arg0) {
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.b(II)V")
	public void method332(int arg0) {
		field1090[field1091++] = (byte) arg0;
		field1090[field1091++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PQBRPYKE.c(I)V")
	public void method333(int arg0) {
		field1090[field1091++] = (byte) (arg0 >> 16);
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.d(I)V")
	public void method334(int arg0) {
		field1090[field1091++] = (byte) (arg0 >> 24);
		field1090[field1091++] = (byte) (arg0 >> 16);
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.a(IB)V")
	public void method335(int arg0) {
		field1090[field1091++] = (byte) arg0;
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) (arg0 >> 16);
		field1090[field1091++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("PQBRPYKE.a(JI)V")
	public void method336(long arg0) {
		field1090[field1091++] = (byte) (arg0 >> 56);
		field1090[field1091++] = (byte) (arg0 >> 48);
		field1090[field1091++] = (byte) (arg0 >> 40);
		field1090[field1091++] = (byte) (arg0 >> 32);
		field1090[field1091++] = (byte) (arg0 >> 24);
		field1090[field1091++] = (byte) (arg0 >> 16);
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.a(Ljava/lang/String;)V")
	public void method337(String arg0) {
		arg0.getBytes(0, arg0.length(), field1090, field1091);
		field1091 += arg0.length();
		field1090[field1091++] = 10;
	}

	@ObfuscatedName("PQBRPYKE.a(III[B)V")
	public void method338(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1090[field1091++] = arg2[var4];
		}
	}

	@ObfuscatedName("PQBRPYKE.b(IB)V")
	public void method339(int arg0) {
		field1090[field1091 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("PQBRPYKE.c()I")
	public int method340() {
		return field1090[field1091++] & 0xFF;
	}

	@ObfuscatedName("PQBRPYKE.d()B")
	public byte method341() {
		return field1090[field1091++];
	}

	@ObfuscatedName("PQBRPYKE.e()I")
	public int method342() {
		field1091 += 2;
		return ((field1090[field1091 - 2] & 0xFF) << 8) + (field1090[field1091 - 1] & 0xFF);
	}

	@ObfuscatedName("PQBRPYKE.f()I")
	public int method343() {
		field1091 += 2;
		int var1 = ((field1090[field1091 - 2] & 0xFF) << 8) + (field1090[field1091 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PQBRPYKE.g()I")
	public int method344() {
		field1091 += 3;
		return (field1090[field1091 - 1] & 0xFF) + ((field1090[field1091 - 3] & 0xFF) << 16) + ((field1090[field1091 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("PQBRPYKE.h()I")
	public int method345() {
		field1091 += 4;
		return (field1090[field1091 - 1] & 0xFF) + ((field1090[field1091 - 2] & 0xFF) << 8) + ((field1090[field1091 - 4] & 0xFF) << 24) + ((field1090[field1091 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("PQBRPYKE.a(Z)J")
	public long method346() {
		long var1 = method345() & 0xFFFFFFFFL;
		long var3 = method345() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("PQBRPYKE.i()Ljava/lang/String;")
	public String method347() {
		int var1 = field1091;

		while (field1090[field1091++] != 10) {
		}

		return new String(field1090, var1, field1091 - var1 - 1);
	}

	@ObfuscatedName("PQBRPYKE.e(I)[B")
	public byte[] method348() {
		int var1 = field1091;

		while (field1090[field1091++] != 10) {
		}

		byte[] var2 = new byte[field1091 - var1 - 1];
		for (int var3 = var1; var3 < field1091 - 1; var3++) {
			var2[var3 - var1] = field1090[var3];
		}

		return var2;
	}

	@ObfuscatedName("PQBRPYKE.b(III[B)V")
	public void method349(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1090[field1091++];
		}
	}

	@ObfuscatedName("PQBRPYKE.f(I)V")
	public void method350() {
		field1092 = field1091 * 8;
	}

	@ObfuscatedName("PQBRPYKE.c(II)I")
	public int method351(int arg0) {
		int var2 = field1092 >> 3;
		int var3 = 8 - (field1092 & 0x7);
		int var4 = 0;
		field1092 += arg0;

		while (arg0 > var3) {
			var4 += (field1090[var2++] & field1094[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1090[var2] & field1094[var3];
		} else {
			var4 += field1090[var2] >> var3 - arg0 & field1094[arg0];
		}

		return var4;
	}

	@ObfuscatedName("PQBRPYKE.b(Z)V")
	public void method352() {
		field1091 = (field1092 + 7) / 8;
	}

	@ObfuscatedName("PQBRPYKE.j()I")
	public int method353() {
		int var1 = field1090[field1091] & 0xFF;
		if (var1 < 128) {
			return method340() - 64;
		}

		return method342() - 49152;
	}

	@ObfuscatedName("PQBRPYKE.k()I")
	public int method354() {
		int var1 = field1090[field1091] & 0xFF;
		if (var1 < 128) {
			return method340();
		}

		return method342() - 32768;
	}

	@ObfuscatedName("PQBRPYKE.a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method355(BigInteger arg0, BigInteger arg1) {
		int var3 = field1091;
		field1091 = 0;
		byte[] var4 = new byte[var3];
		method349(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1091 = 0;
		method330(var7.length);
		method338(0, var7.length, var7);
	}

	@ObfuscatedName("PQBRPYKE.c(IB)V")
	public void method356(int arg0) {
		field1090[field1091++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PQBRPYKE.d(II)V")
	public void method357(int arg0) {
		field1090[field1091++] = (byte) -arg0;
	}

	@ObfuscatedName("PQBRPYKE.a(BI)V")
	public void method358(int arg0) {
		field1090[field1091++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("PQBRPYKE.g(I)I")
	public int method359() {
		return field1090[field1091++] - 128 & 0xFF;
	}

	@ObfuscatedName("PQBRPYKE.h(I)I")
	public int method360() {
		return -field1090[field1091++] & 0xFF;
	}

	@ObfuscatedName("PQBRPYKE.i(I)I")
	public int method361() {
		return 128 - field1090[field1091++] & 0xFF;
	}

	@ObfuscatedName("PQBRPYKE.j(I)B")
	public byte method362() {
		return (byte) (field1090[field1091++] - 128);
	}

	@ObfuscatedName("PQBRPYKE.c(Z)B")
	public byte method363() {
		return (byte) -field1090[field1091++];
	}

	@ObfuscatedName("PQBRPYKE.k(I)B")
	public byte method364() {
		return (byte) (128 - field1090[field1091++]);
	}

	@ObfuscatedName("PQBRPYKE.d(IB)V")
	public void method365(int arg0) {
		field1090[field1091++] = (byte) arg0;
		field1090[field1091++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PQBRPYKE.a(ZI)V")
	public void method366(int arg0) {
		field1090[field1091++] = (byte) (arg0 >> 8);
		field1090[field1091++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PQBRPYKE.e(II)V")
	public void method367(int arg0) {
		field1090[field1091++] = (byte) (arg0 + 128);
		field1090[field1091++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PQBRPYKE.d(Z)I")
	public int method368() {
		field1091 += 2;
		return ((field1090[field1091 - 1] & 0xFF) << 8) + (field1090[field1091 - 2] & 0xFF);
	}

	@ObfuscatedName("PQBRPYKE.l(I)I")
	public int method369() {
		field1091 += 2;
		return ((field1090[field1091 - 2] & 0xFF) << 8) + (field1090[field1091 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("PQBRPYKE.a(B)I")
	public int method370() {
		field1091 += 2;
		return ((field1090[field1091 - 1] & 0xFF) << 8) + (field1090[field1091 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("PQBRPYKE.e(Z)I")
	public int method371() {
		field1091 += 2;
		int var1 = ((field1090[field1091 - 1] & 0xFF) << 8) + (field1090[field1091 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PQBRPYKE.b(B)I")
	public int method372() {
		field1091 += 2;
		int var1 = ((field1090[field1091 - 2] & 0xFF) << 8) + (field1090[field1091 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PQBRPYKE.m(I)I")
	public int method373() {
		field1091 += 3;
		return (field1090[field1091 - 2] & 0xFF) + ((field1090[field1091 - 3] & 0xFF) << 16) + ((field1090[field1091 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("PQBRPYKE.n(I)I")
	public int method374() {
		field1091 += 4;
		return (field1090[field1091 - 3] & 0xFF) + ((field1090[field1091 - 4] & 0xFF) << 8) + ((field1090[field1091 - 2] & 0xFF) << 24) + ((field1090[field1091 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("PQBRPYKE.c(B)I")
	public int method375() {
		field1091 += 4;
		return (field1090[field1091 - 2] & 0xFF) + ((field1090[field1091 - 1] & 0xFF) << 8) + ((field1090[field1091 - 3] & 0xFF) << 24) + ((field1090[field1091 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("PQBRPYKE.a(BI[BI)V")
	public void method376(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field1090[field1091++] - 128);
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

			field1093[var0] = var1;
		}
	}
}
