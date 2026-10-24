package deob;

import java.math.BigInteger;

@ObfuscatedName("RGCGKKUR")
public final class RGCGKKUR extends PFQOGDTY {

	@ObfuscatedName("RGCGKKUR.r")
	public byte[] field1349;

	@ObfuscatedName("RGCGKKUR.s")
	public int field1350;

	@ObfuscatedName("RGCGKKUR.u")
	public static int[] field1352 = new int[256];

	@ObfuscatedName("RGCGKKUR.v")
	public static final int[] field1353 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("RGCGKKUR.A")
	public static CEEJCAVA field1358 = new CEEJCAVA();

	@ObfuscatedName("RGCGKKUR.B")
	public static CEEJCAVA field1359 = new CEEJCAVA();

	@ObfuscatedName("RGCGKKUR.C")
	public static CEEJCAVA field1360 = new CEEJCAVA();

	@ObfuscatedName("RGCGKKUR.D")
	public static char[] field1361 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("RGCGKKUR.t")
	public int field1351;

	@ObfuscatedName("RGCGKKUR.x")
	public static int field1355;

	@ObfuscatedName("RGCGKKUR.y")
	public static int field1356;

	@ObfuscatedName("RGCGKKUR.z")
	public static int field1357;

	@ObfuscatedName("RGCGKKUR.w")
	public JLGPBSNA field1354;

	@ObfuscatedName("RGCGKKUR.a(II)LRGCGKKUR;")
	public static RGCGKKUR method443(int arg0) {
		synchronized (field1359) {
			RGCGKKUR var2 = null;
			if (arg0 == 0 && field1355 > 0) {
				field1355--;
				var2 = (RGCGKKUR) field1358.method32();
			} else if (arg0 == 1 && field1356 > 0) {
				field1356--;
				var2 = (RGCGKKUR) field1359.method32();
			} else if (arg0 == 2 && field1357 > 0) {
				field1357--;
				var2 = (RGCGKKUR) field1360.method32();
			}

			if (var2 != null) {
				var2.field1350 = 0;
				return var2;
			}
		}

		RGCGKKUR var4 = new RGCGKKUR();
		var4.field1350 = 0;

		if (arg0 == 0) {
			var4.field1349 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1349 = new byte[5000];
		} else {
			var4.field1349 = new byte[30000];
		}

		return var4;
	}

	public RGCGKKUR() {
	}

	public RGCGKKUR(byte[] arg0) {
		field1349 = arg0;
		field1350 = 0;
	}

	@ObfuscatedName("RGCGKKUR.a(ZI)V")
	public void method444(int arg0) {
		field1349[field1350++] = (byte) (arg0 + field1354.method236());
	}

	@ObfuscatedName("RGCGKKUR.a(I)V")
	public void method445(int arg0) {
		field1349[field1350++] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.b(I)V")
	public void method446(int arg0) {
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.a(IB)V")
	public void method447(int arg0) {
		field1349[field1350++] = (byte) arg0;
		field1349[field1350++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RGCGKKUR.c(I)V")
	public void method448(int arg0) {
		field1349[field1350++] = (byte) (arg0 >> 16);
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.d(I)V")
	public void method449(int arg0) {
		field1349[field1350++] = (byte) (arg0 >> 24);
		field1349[field1350++] = (byte) (arg0 >> 16);
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.a(IZ)V")
	public void method450(int arg0) {
		field1349[field1350++] = (byte) arg0;
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) (arg0 >> 16);
		field1349[field1350++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("RGCGKKUR.a(JI)V")
	public void method451(long arg0) {
		field1349[field1350++] = (byte) (arg0 >> 56);
		field1349[field1350++] = (byte) (arg0 >> 48);
		field1349[field1350++] = (byte) (arg0 >> 40);
		field1349[field1350++] = (byte) (arg0 >> 32);
		field1349[field1350++] = (byte) (arg0 >> 24);
		field1349[field1350++] = (byte) (arg0 >> 16);
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.a(Ljava/lang/String;)V")
	public void method452(String arg0) {
		arg0.getBytes(0, arg0.length(), field1349, field1350);
		field1350 += arg0.length();
		field1349[field1350++] = 10;
	}

	@ObfuscatedName("RGCGKKUR.a([BIII)V")
	public void method453(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field1349[field1350++] = arg0[var4];
		}
	}

	@ObfuscatedName("RGCGKKUR.b(II)V")
	public void method454(int arg0) {
		field1349[field1350 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("RGCGKKUR.c()I")
	public int method455() {
		return field1349[field1350++] & 0xFF;
	}

	@ObfuscatedName("RGCGKKUR.d()B")
	public byte method456() {
		return field1349[field1350++];
	}

	@ObfuscatedName("RGCGKKUR.e()I")
	public int method457() {
		field1350 += 2;
		return ((field1349[field1350 - 2] & 0xFF) << 8) + (field1349[field1350 - 1] & 0xFF);
	}

	@ObfuscatedName("RGCGKKUR.f()I")
	public int method458() {
		field1350 += 2;
		int var1 = ((field1349[field1350 - 2] & 0xFF) << 8) + (field1349[field1350 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RGCGKKUR.g()I")
	public int method459() {
		field1350 += 3;
		return (field1349[field1350 - 1] & 0xFF) + ((field1349[field1350 - 3] & 0xFF) << 16) + ((field1349[field1350 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("RGCGKKUR.h()I")
	public int method460() {
		field1350 += 4;
		return (field1349[field1350 - 1] & 0xFF) + ((field1349[field1350 - 2] & 0xFF) << 8) + ((field1349[field1350 - 4] & 0xFF) << 24) + ((field1349[field1350 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("RGCGKKUR.a(Z)J")
	public long method461() {
		long var1 = method460() & 0xFFFFFFFFL;
		long var3 = method460() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("RGCGKKUR.i()Ljava/lang/String;")
	public String method462() {
		int var1 = field1350;

		while (field1349[field1350++] != 10) {
		}

		return new String(field1349, var1, field1350 - var1 - 1);
	}

	@ObfuscatedName("RGCGKKUR.a(B)[B")
	public byte[] method463() {
		int var1 = field1350;

		while (field1349[field1350++] != 10) {
		}

		byte[] var2 = new byte[field1350 - var1 - 1];
		for (int var3 = var1; var3 < field1350 - 1; var3++) {
			var2[var3 - var1] = field1349[var3];
		}

		return var2;
	}

	@ObfuscatedName("RGCGKKUR.a(III[B)V")
	public void method464(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1349[field1350++];
		}
	}

	@ObfuscatedName("RGCGKKUR.e(I)V")
	public void method465() {
		field1351 = field1350 * 8;
	}

	@ObfuscatedName("RGCGKKUR.b(IZ)I")
	public int method466(int arg0) {
		int var2 = field1351 >> 3;
		int var3 = 8 - (field1351 & 0x7);
		int var4 = 0;
		field1351 += arg0;

		while (arg0 > var3) {
			var4 += (field1349[var2++] & field1353[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1349[var2] & field1353[var3];
		} else {
			var4 += field1349[var2] >> var3 - arg0 & field1353[arg0];
		}

		return var4;
	}

	@ObfuscatedName("RGCGKKUR.f(I)V")
	public void method467() {
		field1350 = (field1351 + 7) / 8;
	}

	@ObfuscatedName("RGCGKKUR.j()I")
	public int method468() {
		int var1 = field1349[field1350] & 0xFF;
		if (var1 < 128) {
			return method455() - 64;
		}

		return method457() - 49152;
	}

	@ObfuscatedName("RGCGKKUR.k()I")
	public int method469() {
		int var1 = field1349[field1350] & 0xFF;
		if (var1 < 128) {
			return method455();
		}

		return method457() - 32768;
	}

	@ObfuscatedName("RGCGKKUR.a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method470(BigInteger arg0, BigInteger arg1) {
		int var3 = field1350;
		field1350 = 0;
		byte[] var4 = new byte[var3];
		method464(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1350 = 0;
		method445(var7.length);
		method453(var7, var7.length, 0);
	}

	@ObfuscatedName("RGCGKKUR.c(II)V")
	public void method471(int arg0) {
		field1349[field1350++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("RGCGKKUR.b(ZI)V")
	public void method472(int arg0) {
		field1349[field1350++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("RGCGKKUR.b(Z)I")
	public int method473() {
		return field1349[field1350++] - 128 & 0xFF;
	}

	@ObfuscatedName("RGCGKKUR.g(I)I")
	public int method474() {
		return -field1349[field1350++] & 0xFF;
	}

	@ObfuscatedName("RGCGKKUR.c(Z)I")
	public int method475() {
		return 128 - field1349[field1350++] & 0xFF;
	}

	@ObfuscatedName("RGCGKKUR.h(I)B")
	public byte method476() {
		return (byte) -field1349[field1350++];
	}

	@ObfuscatedName("RGCGKKUR.i(I)B")
	public byte method477() {
		return (byte) (128 - field1349[field1350++]);
	}

	@ObfuscatedName("RGCGKKUR.d(II)V")
	public void method478(int arg0) {
		field1349[field1350++] = (byte) arg0;
		field1349[field1350++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RGCGKKUR.e(II)V")
	public void method479(int arg0) {
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("RGCGKKUR.f(II)V")
	public void method480(int arg0) {
		field1349[field1350++] = (byte) (arg0 + 128);
		field1349[field1350++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RGCGKKUR.d(Z)I")
	public int method481() {
		field1350 += 2;
		return ((field1349[field1350 - 1] & 0xFF) << 8) + (field1349[field1350 - 2] & 0xFF);
	}

	@ObfuscatedName("RGCGKKUR.j(I)I")
	public int method482() {
		field1350 += 2;
		return ((field1349[field1350 - 2] & 0xFF) << 8) + (field1349[field1350 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("RGCGKKUR.k(I)I")
	public int method483() {
		field1350 += 2;
		return ((field1349[field1350 - 1] & 0xFF) << 8) + (field1349[field1350 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("RGCGKKUR.e(Z)I")
	public int method484() {
		field1350 += 2;
		int var1 = ((field1349[field1350 - 1] & 0xFF) << 8) + (field1349[field1350 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RGCGKKUR.l(I)I")
	public int method485() {
		field1350 += 2;
		int var1 = ((field1349[field1350 - 1] & 0xFF) << 8) + (field1349[field1350 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RGCGKKUR.m(I)I")
	public int method486() {
		field1350 += 3;
		return (field1349[field1350 - 2] & 0xFF) + ((field1349[field1350 - 3] & 0xFF) << 16) + ((field1349[field1350 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("RGCGKKUR.c(ZI)V")
	public void method487(int arg0) {
		field1349[field1350++] = (byte) (arg0 >> 8);
		field1349[field1350++] = (byte) arg0;
		field1349[field1350++] = (byte) (arg0 >> 24);
		field1349[field1350++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("RGCGKKUR.f(Z)I")
	public int method488() {
		field1350 += 4;
		return (field1349[field1350 - 4] & 0xFF) + ((field1349[field1350 - 3] & 0xFF) << 8) + ((field1349[field1350 - 1] & 0xFF) << 24) + ((field1349[field1350 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("RGCGKKUR.b(B)I")
	public int method489() {
		field1350 += 4;
		return (field1349[field1350 - 3] & 0xFF) + ((field1349[field1350 - 4] & 0xFF) << 8) + ((field1349[field1350 - 2] & 0xFF) << 24) + ((field1349[field1350 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("RGCGKKUR.c(B)I")
	public int method490() {
		field1350 += 4;
		return (field1349[field1350 - 2] & 0xFF) + ((field1349[field1350 - 1] & 0xFF) << 8) + ((field1349[field1350 - 3] & 0xFF) << 24) + ((field1349[field1350 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("RGCGKKUR.a(Z[BII)V")
	public void method491(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field1349[field1350++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("RGCGKKUR.b(Z[BII)V")
	public void method492(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = field1349[field1350++];
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

			field1352[var0] = var1;
		}
	}
}
