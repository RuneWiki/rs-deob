package deob;

import java.math.BigInteger;

@ObfuscatedName("MVHXDWGI")
public final class MVHXDWGI extends MUOTSYDS {

	@ObfuscatedName("MVHXDWGI.z")
	public byte[] field1013;

	@ObfuscatedName("MVHXDWGI.A")
	public int field1014;

	@ObfuscatedName("MVHXDWGI.C")
	public static int[] field1016 = new int[256];

	@ObfuscatedName("MVHXDWGI.D")
	public static final int[] field1017 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MVHXDWGI.I")
	public static IHMCQRZY field1022 = new IHMCQRZY();

	@ObfuscatedName("MVHXDWGI.J")
	public static IHMCQRZY field1023 = new IHMCQRZY();

	@ObfuscatedName("MVHXDWGI.K")
	public static IHMCQRZY field1024 = new IHMCQRZY();

	@ObfuscatedName("MVHXDWGI.L")
	public static char[] field1025 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MVHXDWGI.B")
	public int field1015;

	@ObfuscatedName("MVHXDWGI.F")
	public static int field1019;

	@ObfuscatedName("MVHXDWGI.G")
	public static int field1020;

	@ObfuscatedName("MVHXDWGI.H")
	public static int field1021;

	@ObfuscatedName("MVHXDWGI.E")
	public QIAMMSTQ field1018;

	@ObfuscatedName("MVHXDWGI.a(BI)LMVHXDWGI;")
	public static MVHXDWGI method345(int arg0) {
		synchronized (field1023) {
			MVHXDWGI var2 = null;
			if (arg0 == 0 && field1019 > 0) {
				field1019--;
				var2 = (MVHXDWGI) field1022.method245();
			} else if (arg0 == 1 && field1020 > 0) {
				field1020--;
				var2 = (MVHXDWGI) field1023.method245();
			} else if (arg0 == 2 && field1021 > 0) {
				field1021--;
				var2 = (MVHXDWGI) field1024.method245();
			}

			if (var2 != null) {
				var2.field1014 = 0;
				return var2;
			}
		}

		MVHXDWGI var4 = new MVHXDWGI();
		var4.field1014 = 0;

		if (arg0 == 0) {
			var4.field1013 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1013 = new byte[5000];
		} else {
			var4.field1013 = new byte[30000];
		}

		return var4;
	}

	public MVHXDWGI() {
	}

	public MVHXDWGI(byte[] arg0) {
		field1013 = arg0;
		field1014 = 0;
	}

	@ObfuscatedName("MVHXDWGI.a(IZ)V")
	public void method346(int arg0) {
		field1013[field1014++] = (byte) (arg0 + field1018.method483());
	}

	@ObfuscatedName("MVHXDWGI.a(I)V")
	public void method347(int arg0) {
		field1013[field1014++] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.b(I)V")
	public void method348(int arg0) {
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.b(BI)V")
	public void method349(int arg0) {
		field1013[field1014++] = (byte) arg0;
		field1013[field1014++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MVHXDWGI.c(I)V")
	public void method350(int arg0) {
		field1013[field1014++] = (byte) (arg0 >> 16);
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.d(I)V")
	public void method351(int arg0) {
		field1013[field1014++] = (byte) (arg0 >> 24);
		field1013[field1014++] = (byte) (arg0 >> 16);
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.a(IB)V")
	public void method352(int arg0) {
		field1013[field1014++] = (byte) arg0;
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) (arg0 >> 16);
		field1013[field1014++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MVHXDWGI.a(JI)V")
	public void method353(long arg0) {
		field1013[field1014++] = (byte) (arg0 >> 56);
		field1013[field1014++] = (byte) (arg0 >> 48);
		field1013[field1014++] = (byte) (arg0 >> 40);
		field1013[field1014++] = (byte) (arg0 >> 32);
		field1013[field1014++] = (byte) (arg0 >> 24);
		field1013[field1014++] = (byte) (arg0 >> 16);
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.a(Ljava/lang/String;)V")
	public void method354(String arg0) {
		arg0.getBytes(0, arg0.length(), field1013, field1014);
		field1014 += arg0.length();
		field1013[field1014++] = 10;
	}

	@ObfuscatedName("MVHXDWGI.a(I[BII)V")
	public void method355(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field1013[field1014++] = arg0[var4];
		}
	}

	@ObfuscatedName("MVHXDWGI.a(ZI)V")
	public void method356(int arg0) {
		field1013[field1014 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MVHXDWGI.c()I")
	public int method357() {
		return field1013[field1014++] & 0xFF;
	}

	@ObfuscatedName("MVHXDWGI.d()B")
	public byte method358() {
		return field1013[field1014++];
	}

	@ObfuscatedName("MVHXDWGI.e()I")
	public int method359() {
		field1014 += 2;
		return ((field1013[field1014 - 2] & 0xFF) << 8) + (field1013[field1014 - 1] & 0xFF);
	}

	@ObfuscatedName("MVHXDWGI.f()I")
	public int method360() {
		field1014 += 2;
		int var1 = ((field1013[field1014 - 2] & 0xFF) << 8) + (field1013[field1014 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MVHXDWGI.g()I")
	public int method361() {
		field1014 += 3;
		return (field1013[field1014 - 1] & 0xFF) + ((field1013[field1014 - 3] & 0xFF) << 16) + ((field1013[field1014 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MVHXDWGI.h()I")
	public int method362() {
		field1014 += 4;
		return (field1013[field1014 - 1] & 0xFF) + ((field1013[field1014 - 2] & 0xFF) << 8) + ((field1013[field1014 - 4] & 0xFF) << 24) + ((field1013[field1014 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MVHXDWGI.e(I)J")
	public long method363() {
		long var1 = method362() & 0xFFFFFFFFL;
		long var3 = method362() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MVHXDWGI.i()Ljava/lang/String;")
	public String method364() {
		int var1 = field1014;

		while (field1013[field1014++] != 10) {
		}

		return new String(field1013, var1, field1014 - var1 - 1);
	}

	@ObfuscatedName("MVHXDWGI.a(Z)[B")
	public byte[] method365() {
		int var1 = field1014;

		while (field1013[field1014++] != 10) {
		}

		byte[] var2 = new byte[field1014 - var1 - 1];
		for (int var3 = var1; var3 < field1014 - 1; var3++) {
			var2[var3 - var1] = field1013[var3];
		}

		return var2;
	}

	@ObfuscatedName("MVHXDWGI.b(I[BII)V")
	public void method366(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1013[field1014++];
		}
	}

	@ObfuscatedName("MVHXDWGI.f(I)V")
	public void method367() {
		field1015 = field1014 * 8;
	}

	@ObfuscatedName("MVHXDWGI.a(II)I")
	public int method368(int arg0) {
		int var2 = field1015 >> 3;
		int var3 = 8 - (field1015 & 0x7);
		int var4 = 0;
		field1015 += arg0;

		while (arg0 > var3) {
			var4 += (field1013[var2++] & field1017[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1013[var2] & field1017[var3];
		} else {
			var4 += field1013[var2] >> var3 - arg0 & field1017[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MVHXDWGI.g(I)V")
	public void method369() {
		field1014 = (field1015 + 7) / 8;
	}

	@ObfuscatedName("MVHXDWGI.j()I")
	public int method370() {
		int var1 = field1013[field1014] & 0xFF;
		if (var1 < 128) {
			return method357() - 64;
		}

		return method359() - 49152;
	}

	@ObfuscatedName("MVHXDWGI.k()I")
	public int method371() {
		int var1 = field1013[field1014] & 0xFF;
		if (var1 < 128) {
			return method357();
		}

		return method359() - 32768;
	}

	@ObfuscatedName("MVHXDWGI.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method372(BigInteger arg0, BigInteger arg1) {
		int var3 = field1014;
		field1014 = 0;
		byte[] var4 = new byte[var3];
		method366(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1014 = 0;
		method347(var7.length);
		method355(var7, var7.length, 0);
	}

	@ObfuscatedName("MVHXDWGI.c(BI)V")
	public void method373(int arg0) {
		field1013[field1014++] = (byte) -arg0;
	}

	@ObfuscatedName("MVHXDWGI.b(II)V")
	public void method374(int arg0) {
		field1013[field1014++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MVHXDWGI.h(I)I")
	public int method375() {
		return field1013[field1014++] - 128 & 0xFF;
	}

	@ObfuscatedName("MVHXDWGI.b(Z)I")
	public int method376() {
		return -field1013[field1014++] & 0xFF;
	}

	@ObfuscatedName("MVHXDWGI.a(B)I")
	public int method377() {
		return 128 - field1013[field1014++] & 0xFF;
	}

	@ObfuscatedName("MVHXDWGI.c(Z)B")
	public byte method378() {
		return (byte) -field1013[field1014++];
	}

	@ObfuscatedName("MVHXDWGI.b(B)B")
	public byte method379() {
		return (byte) (128 - field1013[field1014++]);
	}

	@ObfuscatedName("MVHXDWGI.d(BI)V")
	public void method380(int arg0) {
		field1013[field1014++] = (byte) arg0;
		field1013[field1014++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MVHXDWGI.b(ZI)V")
	public void method381(int arg0) {
		field1013[field1014++] = (byte) (arg0 >> 8);
		field1013[field1014++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MVHXDWGI.c(II)V")
	public void method382(int arg0) {
		field1013[field1014++] = (byte) (arg0 + 128);
		field1013[field1014++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MVHXDWGI.d(Z)I")
	public int method383() {
		field1014 += 2;
		return ((field1013[field1014 - 1] & 0xFF) << 8) + (field1013[field1014 - 2] & 0xFF);
	}

	@ObfuscatedName("MVHXDWGI.i(I)I")
	public int method384() {
		field1014 += 2;
		return ((field1013[field1014 - 2] & 0xFF) << 8) + (field1013[field1014 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MVHXDWGI.j(I)I")
	public int method385() {
		field1014 += 2;
		return ((field1013[field1014 - 1] & 0xFF) << 8) + (field1013[field1014 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MVHXDWGI.c(B)I")
	public int method386() {
		field1014 += 2;
		int var1 = ((field1013[field1014 - 1] & 0xFF) << 8) + (field1013[field1014 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MVHXDWGI.k(I)I")
	public int method387() {
		field1014 += 2;
		int var1 = ((field1013[field1014 - 2] & 0xFF) << 8) + (field1013[field1014 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MVHXDWGI.d(II)V")
	public void method388(int arg0) {
		field1013[field1014++] = (byte) (arg0 >> 16);
		field1013[field1014++] = (byte) (arg0 >> 24);
		field1013[field1014++] = (byte) arg0;
		field1013[field1014++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MVHXDWGI.l(I)I")
	public int method389() {
		field1014 += 4;
		return (field1013[field1014 - 4] & 0xFF) + ((field1013[field1014 - 3] & 0xFF) << 8) + ((field1013[field1014 - 1] & 0xFF) << 24) + ((field1013[field1014 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MVHXDWGI.m(I)I")
	public int method390() {
		field1014 += 4;
		return (field1013[field1014 - 3] & 0xFF) + ((field1013[field1014 - 4] & 0xFF) << 8) + ((field1013[field1014 - 2] & 0xFF) << 24) + ((field1013[field1014 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MVHXDWGI.e(Z)I")
	public int method391() {
		field1014 += 4;
		return (field1013[field1014 - 2] & 0xFF) + ((field1013[field1014 - 1] & 0xFF) << 8) + ((field1013[field1014 - 3] & 0xFF) << 24) + ((field1013[field1014 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MVHXDWGI.a(ZII[B)V")
	public void method392(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = field1013[field1014++];
		}
	}

	@ObfuscatedName("MVHXDWGI.c(I[BII)V")
	public void method393(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field1013[field1014++] - 128);
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

			field1016[var0] = var1;
		}
	}
}
