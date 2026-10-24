package deob;

import java.math.BigInteger;

@ObfuscatedName("RSWRPCHR")
public final class RSWRPCHR extends HZZJZIMV {

	@ObfuscatedName("RSWRPCHR.A")
	public byte[] field1037;

	@ObfuscatedName("RSWRPCHR.B")
	public int field1038;

	@ObfuscatedName("RSWRPCHR.D")
	public static int[] field1040 = new int[256];

	@ObfuscatedName("RSWRPCHR.E")
	public static final int[] field1041 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("RSWRPCHR.J")
	public static EZXKBAZY field1046 = new EZXKBAZY();

	@ObfuscatedName("RSWRPCHR.K")
	public static EZXKBAZY field1047 = new EZXKBAZY();

	@ObfuscatedName("RSWRPCHR.L")
	public static EZXKBAZY field1048 = new EZXKBAZY();

	@ObfuscatedName("RSWRPCHR.M")
	public static char[] field1049 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("RSWRPCHR.C")
	public int field1039;

	@ObfuscatedName("RSWRPCHR.G")
	public static int field1043;

	@ObfuscatedName("RSWRPCHR.H")
	public static int field1044;

	@ObfuscatedName("RSWRPCHR.I")
	public static int field1045;

	@ObfuscatedName("RSWRPCHR.F")
	public NERZSWTZ field1042;

	@ObfuscatedName("RSWRPCHR.a(II)LRSWRPCHR;")
	public static RSWRPCHR method376(int arg0) {
		synchronized (field1047) {
			RSWRPCHR var2 = null;
			if (arg0 == 0 && field1043 > 0) {
				field1043--;
				var2 = (RSWRPCHR) field1046.method205();
			} else if (arg0 == 1 && field1044 > 0) {
				field1044--;
				var2 = (RSWRPCHR) field1047.method205();
			} else if (arg0 == 2 && field1045 > 0) {
				field1045--;
				var2 = (RSWRPCHR) field1048.method205();
			}

			if (var2 != null) {
				var2.field1038 = 0;
				return var2;
			}
		}

		RSWRPCHR var4 = new RSWRPCHR();
		var4.field1038 = 0;

		if (arg0 == 0) {
			var4.field1037 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1037 = new byte[5000];
		} else {
			var4.field1037 = new byte[30000];
		}

		return var4;
	}

	public RSWRPCHR() {
	}

	public RSWRPCHR(byte[] arg0) {
		field1037 = arg0;
		field1038 = 0;
	}

	@ObfuscatedName("RSWRPCHR.b(II)V")
	public void method377(int arg0) {
		field1037[field1038++] = (byte) (arg0 + field1042.method312());
	}

	@ObfuscatedName("RSWRPCHR.a(I)V")
	public void method378(int arg0) {
		field1037[field1038++] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.b(I)V")
	public void method379(int arg0) {
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.c(II)V")
	public void method380(int arg0) {
		field1037[field1038++] = (byte) arg0;
		field1037[field1038++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RSWRPCHR.c(I)V")
	public void method381(int arg0) {
		field1037[field1038++] = (byte) (arg0 >> 16);
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.d(I)V")
	public void method382(int arg0) {
		field1037[field1038++] = (byte) (arg0 >> 24);
		field1037[field1038++] = (byte) (arg0 >> 16);
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.d(II)V")
	public void method383(int arg0) {
		field1037[field1038++] = (byte) arg0;
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) (arg0 >> 16);
		field1037[field1038++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("RSWRPCHR.a(JI)V")
	public void method384(long arg0) {
		field1037[field1038++] = (byte) (arg0 >> 56);
		field1037[field1038++] = (byte) (arg0 >> 48);
		field1037[field1038++] = (byte) (arg0 >> 40);
		field1037[field1038++] = (byte) (arg0 >> 32);
		field1037[field1038++] = (byte) (arg0 >> 24);
		field1037[field1038++] = (byte) (arg0 >> 16);
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.a(Ljava/lang/String;)V")
	public void method385(String arg0) {
		arg0.getBytes(0, arg0.length(), field1037, field1038);
		field1038 += arg0.length();
		field1037[field1038++] = 10;
	}

	@ObfuscatedName("RSWRPCHR.a(I[BBI)V")
	public void method386(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field1037[field1038++] = arg1[var4];
		}
	}

	@ObfuscatedName("RSWRPCHR.a(IZ)V")
	public void method387(int arg0) {
		field1037[field1038 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("RSWRPCHR.c()I")
	public int method388() {
		return field1037[field1038++] & 0xFF;
	}

	@ObfuscatedName("RSWRPCHR.d()B")
	public byte method389() {
		return field1037[field1038++];
	}

	@ObfuscatedName("RSWRPCHR.e()I")
	public int method390() {
		field1038 += 2;
		return ((field1037[field1038 - 2] & 0xFF) << 8) + (field1037[field1038 - 1] & 0xFF);
	}

	@ObfuscatedName("RSWRPCHR.f()I")
	public int method391() {
		field1038 += 2;
		int var1 = ((field1037[field1038 - 2] & 0xFF) << 8) + (field1037[field1038 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RSWRPCHR.g()I")
	public int method392() {
		field1038 += 3;
		return (field1037[field1038 - 1] & 0xFF) + ((field1037[field1038 - 3] & 0xFF) << 16) + ((field1037[field1038 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("RSWRPCHR.h()I")
	public int method393() {
		field1038 += 4;
		return (field1037[field1038 - 1] & 0xFF) + ((field1037[field1038 - 2] & 0xFF) << 8) + ((field1037[field1038 - 4] & 0xFF) << 24) + ((field1037[field1038 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("RSWRPCHR.a(Z)J")
	public long method394() {
		long var1 = method393() & 0xFFFFFFFFL;
		long var3 = method393() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("RSWRPCHR.i()Ljava/lang/String;")
	public String method395() {
		int var1 = field1038;

		while (field1037[field1038++] != 10) {
		}

		return new String(field1037, var1, field1038 - var1 - 1);
	}

	@ObfuscatedName("RSWRPCHR.b(Z)[B")
	public byte[] method396() {
		int var1 = field1038;

		while (field1037[field1038++] != 10) {
		}

		byte[] var2 = new byte[field1038 - var1 - 1];
		for (int var3 = var1; var3 < field1038 - 1; var3++) {
			var2[var3 - var1] = field1037[var3];
		}

		return var2;
	}

	@ObfuscatedName("RSWRPCHR.a(Z[BII)V")
	public void method397(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field1037[field1038++];
		}
	}

	@ObfuscatedName("RSWRPCHR.e(I)V")
	public void method398() {
		field1039 = field1038 * 8;
	}

	@ObfuscatedName("RSWRPCHR.e(II)I")
	public int method399(int arg0) {
		int var2 = field1039 >> 3;
		int var3 = 8 - (field1039 & 0x7);
		int var4 = 0;
		field1039 += arg0;

		while (arg0 > var3) {
			var4 += (field1037[var2++] & field1041[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1037[var2] & field1041[var3];
		} else {
			var4 += field1037[var2] >> var3 - arg0 & field1041[arg0];
		}

		return var4;
	}

	@ObfuscatedName("RSWRPCHR.a(B)V")
	public void method400() {
		field1038 = (field1039 + 7) / 8;
	}

	@ObfuscatedName("RSWRPCHR.j()I")
	public int method401() {
		int var1 = field1037[field1038] & 0xFF;
		if (var1 < 128) {
			return method388() - 64;
		}

		return method390() - 49152;
	}

	@ObfuscatedName("RSWRPCHR.k()I")
	public int method402() {
		int var1 = field1037[field1038] & 0xFF;
		if (var1 < 128) {
			return method388();
		}

		return method390() - 32768;
	}

	@ObfuscatedName("RSWRPCHR.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method403(BigInteger arg0, BigInteger arg1) {
		int var3 = field1038;
		field1038 = 0;
		byte[] var4 = new byte[var3];
		method397(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1038 = 0;
		method378(var7.length);
		method386(var7.length, var7, 0);
	}

	@ObfuscatedName("RSWRPCHR.b(IZ)V")
	public void method404(int arg0) {
		field1037[field1038++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("RSWRPCHR.f(II)V")
	public void method405(int arg0) {
		field1037[field1038++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("RSWRPCHR.f(I)I")
	public int method406() {
		return field1037[field1038++] - 128 & 0xFF;
	}

	@ObfuscatedName("RSWRPCHR.g(I)I")
	public int method407() {
		return -field1037[field1038++] & 0xFF;
	}

	@ObfuscatedName("RSWRPCHR.h(I)I")
	public int method408() {
		return 128 - field1037[field1038++] & 0xFF;
	}

	@ObfuscatedName("RSWRPCHR.i(I)B")
	public byte method409() {
		return (byte) (field1037[field1038++] - 128);
	}

	@ObfuscatedName("RSWRPCHR.j(I)B")
	public byte method410() {
		return (byte) -field1037[field1038++];
	}

	@ObfuscatedName("RSWRPCHR.g(II)V")
	public void method411(int arg0) {
		field1037[field1038++] = (byte) arg0;
		field1037[field1038++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RSWRPCHR.h(II)V")
	public void method412(int arg0) {
		field1037[field1038++] = (byte) (arg0 >> 8);
		field1037[field1038++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("RSWRPCHR.a(ZI)V")
	public void method413(int arg0) {
		field1037[field1038++] = (byte) (arg0 + 128);
		field1037[field1038++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RSWRPCHR.k(I)I")
	public int method414() {
		field1038 += 2;
		return ((field1037[field1038 - 1] & 0xFF) << 8) + (field1037[field1038 - 2] & 0xFF);
	}

	@ObfuscatedName("RSWRPCHR.l(I)I")
	public int method415() {
		field1038 += 2;
		return ((field1037[field1038 - 2] & 0xFF) << 8) + (field1037[field1038 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("RSWRPCHR.m(I)I")
	public int method416() {
		field1038 += 2;
		return ((field1037[field1038 - 1] & 0xFF) << 8) + (field1037[field1038 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("RSWRPCHR.n(I)I")
	public int method417() {
		field1038 += 2;
		int var1 = ((field1037[field1038 - 1] & 0xFF) << 8) + (field1037[field1038 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RSWRPCHR.o(I)I")
	public int method418() {
		field1038 += 2;
		int var1 = ((field1037[field1038 - 2] & 0xFF) << 8) + (field1037[field1038 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RSWRPCHR.c(Z)I")
	public int method419() {
		field1038 += 2;
		int var1 = ((field1037[field1038 - 1] & 0xFF) << 8) + (field1037[field1038 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("RSWRPCHR.b(B)I")
	public int method420() {
		field1038 += 3;
		return (field1037[field1038 - 1] & 0xFF) + ((field1037[field1038 - 2] & 0xFF) << 16) + ((field1037[field1038 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("RSWRPCHR.i(II)V")
	public void method421(int arg0) {
		field1037[field1038++] = (byte) (arg0 >> 16);
		field1037[field1038++] = (byte) (arg0 >> 24);
		field1037[field1038++] = (byte) arg0;
		field1037[field1038++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("RSWRPCHR.p(I)I")
	public int method422() {
		field1038 += 4;
		return (field1037[field1038 - 4] & 0xFF) + ((field1037[field1038 - 3] & 0xFF) << 8) + ((field1037[field1038 - 1] & 0xFF) << 24) + ((field1037[field1038 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("RSWRPCHR.c(B)I")
	public int method423() {
		field1038 += 4;
		return (field1037[field1038 - 3] & 0xFF) + ((field1037[field1038 - 4] & 0xFF) << 8) + ((field1037[field1038 - 2] & 0xFF) << 24) + ((field1037[field1038 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("RSWRPCHR.d(Z)I")
	public int method424() {
		field1038 += 4;
		return (field1037[field1038 - 2] & 0xFF) + ((field1037[field1038 - 1] & 0xFF) << 8) + ((field1037[field1038 - 3] & 0xFF) << 24) + ((field1037[field1038 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("RSWRPCHR.a(III[B)V")
	public void method425(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			field1037[field1038++] = arg2[var4];
		}
	}

	@ObfuscatedName("RSWRPCHR.a(II[BI)V")
	public void method426(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = (byte) (field1037[field1038++] - 128);
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

			field1040[var0] = var1;
		}
	}
}
