package deob;

import java.math.BigInteger;

@ObfuscatedName("LDILQFVA")
public final class LDILQFVA extends IYPTVTAD {

	@ObfuscatedName("LDILQFVA.w")
	public byte[] field901;

	@ObfuscatedName("LDILQFVA.x")
	public int field902;

	@ObfuscatedName("LDILQFVA.z")
	public static int[] field904 = new int[256];

	@ObfuscatedName("LDILQFVA.A")
	public static final int[] field905 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("LDILQFVA.F")
	public static LOISKKJJ field910 = new LOISKKJJ();

	@ObfuscatedName("LDILQFVA.G")
	public static LOISKKJJ field911 = new LOISKKJJ();

	@ObfuscatedName("LDILQFVA.H")
	public static LOISKKJJ field912 = new LOISKKJJ();

	@ObfuscatedName("LDILQFVA.I")
	public static char[] field913 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("LDILQFVA.y")
	public int field903;

	@ObfuscatedName("LDILQFVA.C")
	public static int field907;

	@ObfuscatedName("LDILQFVA.D")
	public static int field908;

	@ObfuscatedName("LDILQFVA.E")
	public static int field909;

	@ObfuscatedName("LDILQFVA.B")
	public KUQMNLGP field906;

	@ObfuscatedName("LDILQFVA.a(II)LLDILQFVA;")
	public static LDILQFVA method390(int arg0) {
		synchronized (field911) {
			LDILQFVA var2 = null;
			if (arg0 == 0 && field907 > 0) {
				field907--;
				var2 = (LDILQFVA) field910.method450();
			} else if (arg0 == 1 && field908 > 0) {
				field908--;
				var2 = (LDILQFVA) field911.method450();
			} else if (arg0 == 2 && field909 > 0) {
				field909--;
				var2 = (LDILQFVA) field912.method450();
			}

			if (var2 != null) {
				var2.field902 = 0;
				return var2;
			}
		}

		LDILQFVA var4 = new LDILQFVA();
		var4.field902 = 0;

		if (arg0 == 0) {
			var4.field901 = new byte[100];
		} else if (arg0 == 1) {
			var4.field901 = new byte[5000];
		} else {
			var4.field901 = new byte[30000];
		}

		return var4;
	}

	public LDILQFVA() {
	}

	public LDILQFVA(byte[] arg0) {
		field901 = arg0;
		field902 = 0;
	}

	@ObfuscatedName("LDILQFVA.b(II)V")
	public void method391(int arg0) {
		field901[field902++] = (byte) (arg0 + field906.method387());
	}

	@ObfuscatedName("LDILQFVA.a(I)V")
	public void method392(int arg0) {
		field901[field902++] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.b(I)V")
	public void method393(int arg0) {
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.c(II)V")
	public void method394(int arg0) {
		field901[field902++] = (byte) arg0;
		field901[field902++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LDILQFVA.c(I)V")
	public void method395(int arg0) {
		field901[field902++] = (byte) (arg0 >> 16);
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.d(I)V")
	public void method396(int arg0) {
		field901[field902++] = (byte) (arg0 >> 24);
		field901[field902++] = (byte) (arg0 >> 16);
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.d(II)V")
	public void method397(int arg0) {
		field901[field902++] = (byte) arg0;
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) (arg0 >> 16);
		field901[field902++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("LDILQFVA.a(ZJ)V")
	public void method398(long arg0) {
		field901[field902++] = (byte) (arg0 >> 56);
		field901[field902++] = (byte) (arg0 >> 48);
		field901[field902++] = (byte) (arg0 >> 40);
		field901[field902++] = (byte) (arg0 >> 32);
		field901[field902++] = (byte) (arg0 >> 24);
		field901[field902++] = (byte) (arg0 >> 16);
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.a(Ljava/lang/String;)V")
	public void method399(String arg0) {
		arg0.getBytes(0, arg0.length(), field901, field902);
		field902 += arg0.length();
		field901[field902++] = 10;
	}

	@ObfuscatedName("LDILQFVA.a(IB[BI)V")
	public void method400(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field901[field902++] = arg1[var4];
		}
	}

	@ObfuscatedName("LDILQFVA.a(ZI)V")
	public void method401(int arg0) {
		field901[field902 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("LDILQFVA.c()I")
	public int method402() {
		return field901[field902++] & 0xFF;
	}

	@ObfuscatedName("LDILQFVA.d()B")
	public byte method403() {
		return field901[field902++];
	}

	@ObfuscatedName("LDILQFVA.e()I")
	public int method404() {
		field902 += 2;
		return ((field901[field902 - 2] & 0xFF) << 8) + (field901[field902 - 1] & 0xFF);
	}

	@ObfuscatedName("LDILQFVA.f()I")
	public int method405() {
		field902 += 2;
		int var1 = ((field901[field902 - 2] & 0xFF) << 8) + (field901[field902 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LDILQFVA.g()I")
	public int method406() {
		field902 += 3;
		return (field901[field902 - 1] & 0xFF) + ((field901[field902 - 3] & 0xFF) << 16) + ((field901[field902 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("LDILQFVA.h()I")
	public int method407() {
		field902 += 4;
		return (field901[field902 - 1] & 0xFF) + ((field901[field902 - 2] & 0xFF) << 8) + ((field901[field902 - 4] & 0xFF) << 24) + ((field901[field902 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("LDILQFVA.e(I)J")
	public long method408() {
		long var1 = method407() & 0xFFFFFFFFL;
		long var3 = method407() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("LDILQFVA.i()Ljava/lang/String;")
	public String method409() {
		int var1 = field902;

		while (field901[field902++] != 10) {
		}

		return new String(field901, var1, field902 - var1 - 1);
	}

	@ObfuscatedName("LDILQFVA.f(I)[B")
	public byte[] method410() {
		int var1 = field902;

		while (field901[field902++] != 10) {
		}

		byte[] var2 = new byte[field902 - var1 - 1];
		for (int var3 = var1; var3 < field902 - 1; var3++) {
			var2[var3 - var1] = field901[var3];
		}

		return var2;
	}

	@ObfuscatedName("LDILQFVA.b(IB[BI)V")
	public void method411(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field901[field902++];
		}
	}

	@ObfuscatedName("LDILQFVA.a(Z)V")
	public void method412() {
		field903 = field902 * 8;
	}

	@ObfuscatedName("LDILQFVA.b(ZI)I")
	public int method413(int arg0) {
		int var2 = field903 >> 3;
		int var3 = 8 - (field903 & 0x7);
		int var4 = 0;
		field903 += arg0;

		while (arg0 > var3) {
			var4 += (field901[var2++] & field905[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field901[var2] & field905[var3];
		} else {
			var4 += field901[var2] >> var3 - arg0 & field905[arg0];
		}

		return var4;
	}

	@ObfuscatedName("LDILQFVA.b(Z)V")
	public void method414() {
		field902 = (field903 + 7) / 8;
	}

	@ObfuscatedName("LDILQFVA.j()I")
	public int method415() {
		int var1 = field901[field902] & 0xFF;
		if (var1 < 128) {
			return method402() - 64;
		}

		return method404() - 49152;
	}

	@ObfuscatedName("LDILQFVA.k()I")
	public int method416() {
		int var1 = field901[field902] & 0xFF;
		if (var1 < 128) {
			return method402();
		}

		return method404() - 32768;
	}

	@ObfuscatedName("LDILQFVA.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method417(BigInteger arg0, BigInteger arg1) {
		int var3 = field902;
		field902 = 0;
		byte[] var4 = new byte[var3];
		method411(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field902 = 0;
		method392(var7.length);
		method400(var7.length, var7, 0);
	}

	@ObfuscatedName("LDILQFVA.a(IZ)V")
	public void method418(int arg0) {
		field901[field902++] = (byte) -arg0;
	}

	@ObfuscatedName("LDILQFVA.e(II)V")
	public void method419(int arg0) {
		field901[field902++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("LDILQFVA.g(I)I")
	public int method420() {
		return field901[field902++] - 128 & 0xFF;
	}

	@ObfuscatedName("LDILQFVA.h(I)I")
	public int method421() {
		return -field901[field902++] & 0xFF;
	}

	@ObfuscatedName("LDILQFVA.i(I)I")
	public int method422() {
		return 128 - field901[field902++] & 0xFF;
	}

	@ObfuscatedName("LDILQFVA.j(I)B")
	public byte method423() {
		return (byte) (field901[field902++] - 128);
	}

	@ObfuscatedName("LDILQFVA.c(Z)B")
	public byte method424() {
		return (byte) -field901[field902++];
	}

	@ObfuscatedName("LDILQFVA.k(I)B")
	public byte method425() {
		return (byte) (128 - field901[field902++]);
	}

	@ObfuscatedName("LDILQFVA.f(II)V")
	public void method426(int arg0) {
		field901[field902++] = (byte) arg0;
		field901[field902++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LDILQFVA.g(II)V")
	public void method427(int arg0) {
		field901[field902++] = (byte) (arg0 >> 8);
		field901[field902++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("LDILQFVA.c(ZI)V")
	public void method428(int arg0) {
		field901[field902++] = (byte) (arg0 + 128);
		field901[field902++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LDILQFVA.d(Z)I")
	public int method429() {
		field902 += 2;
		return ((field901[field902 - 1] & 0xFF) << 8) + (field901[field902 - 2] & 0xFF);
	}

	@ObfuscatedName("LDILQFVA.e(Z)I")
	public int method430() {
		field902 += 2;
		return ((field901[field902 - 2] & 0xFF) << 8) + (field901[field902 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("LDILQFVA.f(Z)I")
	public int method431() {
		field902 += 2;
		return ((field901[field902 - 1] & 0xFF) << 8) + (field901[field902 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("LDILQFVA.l(I)I")
	public int method432() {
		field902 += 2;
		int var1 = ((field901[field902 - 1] & 0xFF) << 8) + (field901[field902 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LDILQFVA.m(I)I")
	public int method433() {
		field902 += 2;
		int var1 = ((field901[field902 - 2] & 0xFF) << 8) + (field901[field902 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LDILQFVA.g(Z)I")
	public int method434() {
		field902 += 2;
		int var1 = ((field901[field902 - 1] & 0xFF) << 8) + (field901[field902 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LDILQFVA.a(B)I")
	public int method435() {
		field902 += 3;
		return (field901[field902 - 1] & 0xFF) + ((field901[field902 - 2] & 0xFF) << 16) + ((field901[field902 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("LDILQFVA.b(B)I")
	public int method436() {
		field902 += 4;
		return (field901[field902 - 4] & 0xFF) + ((field901[field902 - 3] & 0xFF) << 8) + ((field901[field902 - 1] & 0xFF) << 24) + ((field901[field902 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("LDILQFVA.c(B)I")
	public int method437() {
		field902 += 4;
		return (field901[field902 - 2] & 0xFF) + ((field901[field902 - 1] & 0xFF) << 8) + ((field901[field902 - 3] & 0xFF) << 24) + ((field901[field902 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("LDILQFVA.a(IZ[BI)V")
	public void method438(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field901[field902++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("LDILQFVA.a(IIZ[B)V")
	public void method439(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = field901[field902++];
		}
	}

	@ObfuscatedName("LDILQFVA.a(I[BIZ)V")
	public void method440(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field901[field902++] - 128);
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

			field904[var0] = var1;
		}
	}
}
