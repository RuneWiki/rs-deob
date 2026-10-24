package deob;

import java.math.BigInteger;

@ObfuscatedName("KHOMSBHW")
public final class KHOMSBHW extends NTGUDCTQ {

	@ObfuscatedName("KHOMSBHW.w")
	public byte[] field933;

	@ObfuscatedName("KHOMSBHW.x")
	public int field934;

	@ObfuscatedName("KHOMSBHW.z")
	public static int[] field936 = new int[256];

	@ObfuscatedName("KHOMSBHW.A")
	public static final int[] field937 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("KHOMSBHW.F")
	public static JQOEJEDB field942 = new JQOEJEDB();

	@ObfuscatedName("KHOMSBHW.G")
	public static JQOEJEDB field943 = new JQOEJEDB();

	@ObfuscatedName("KHOMSBHW.H")
	public static JQOEJEDB field944 = new JQOEJEDB();

	@ObfuscatedName("KHOMSBHW.I")
	public static char[] field945 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("KHOMSBHW.y")
	public int field935;

	@ObfuscatedName("KHOMSBHW.C")
	public static int field939;

	@ObfuscatedName("KHOMSBHW.D")
	public static int field940;

	@ObfuscatedName("KHOMSBHW.E")
	public static int field941;

	@ObfuscatedName("KHOMSBHW.B")
	public SCSPFXGB field938;

	@ObfuscatedName("KHOMSBHW.a(II)LKHOMSBHW;")
	public static KHOMSBHW method337(int arg0) {
		synchronized (field943) {
			KHOMSBHW var2 = null;
			if (arg0 == 0 && field939 > 0) {
				field939--;
				var2 = (KHOMSBHW) field942.method328();
			} else if (arg0 == 1 && field940 > 0) {
				field940--;
				var2 = (KHOMSBHW) field943.method328();
			} else if (arg0 == 2 && field941 > 0) {
				field941--;
				var2 = (KHOMSBHW) field944.method328();
			}

			if (var2 != null) {
				var2.field934 = 0;
				return var2;
			}
		}

		KHOMSBHW var4 = new KHOMSBHW();
		var4.field934 = 0;

		if (arg0 == 0) {
			var4.field933 = new byte[100];
		} else if (arg0 == 1) {
			var4.field933 = new byte[5000];
		} else {
			var4.field933 = new byte[30000];
		}

		return var4;
	}

	public KHOMSBHW() {
	}

	public KHOMSBHW(byte[] arg0) {
		field933 = arg0;
		field934 = 0;
	}

	@ObfuscatedName("KHOMSBHW.b(II)V")
	public void method338(int arg0) {
		field933[field934++] = (byte) (arg0 + field938.method526());
	}

	@ObfuscatedName("KHOMSBHW.a(I)V")
	public void method339(int arg0) {
		field933[field934++] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.b(I)V")
	public void method340(int arg0) {
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.a(IB)V")
	public void method341(int arg0) {
		field933[field934++] = (byte) arg0;
		field933[field934++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("KHOMSBHW.c(I)V")
	public void method342(int arg0) {
		field933[field934++] = (byte) (arg0 >> 16);
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.d(I)V")
	public void method343(int arg0) {
		field933[field934++] = (byte) (arg0 >> 24);
		field933[field934++] = (byte) (arg0 >> 16);
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.c(II)V")
	public void method344(int arg0) {
		field933[field934++] = (byte) arg0;
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) (arg0 >> 16);
		field933[field934++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("KHOMSBHW.a(JB)V")
	public void method345(long arg0) {
		field933[field934++] = (byte) (arg0 >> 56);
		field933[field934++] = (byte) (arg0 >> 48);
		field933[field934++] = (byte) (arg0 >> 40);
		field933[field934++] = (byte) (arg0 >> 32);
		field933[field934++] = (byte) (arg0 >> 24);
		field933[field934++] = (byte) (arg0 >> 16);
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.a(Ljava/lang/String;)V")
	public void method346(String arg0) {
		arg0.getBytes(0, arg0.length(), field933, field934);
		field934 += arg0.length();
		field933[field934++] = 10;
	}

	@ObfuscatedName("KHOMSBHW.a(II[BB)V")
	public void method347(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			field933[field934++] = arg2[var4];
		}
	}

	@ObfuscatedName("KHOMSBHW.b(IB)V")
	public void method348(int arg0) {
		field933[field934 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("KHOMSBHW.c()I")
	public int method349() {
		return field933[field934++] & 0xFF;
	}

	@ObfuscatedName("KHOMSBHW.d()B")
	public byte method350() {
		return field933[field934++];
	}

	@ObfuscatedName("KHOMSBHW.e()I")
	public int method351() {
		field934 += 2;
		return ((field933[field934 - 2] & 0xFF) << 8) + (field933[field934 - 1] & 0xFF);
	}

	@ObfuscatedName("KHOMSBHW.f()I")
	public int method352() {
		field934 += 2;
		int var1 = ((field933[field934 - 2] & 0xFF) << 8) + (field933[field934 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("KHOMSBHW.g()I")
	public int method353() {
		field934 += 3;
		return (field933[field934 - 1] & 0xFF) + ((field933[field934 - 3] & 0xFF) << 16) + ((field933[field934 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("KHOMSBHW.h()I")
	public int method354() {
		field934 += 4;
		return (field933[field934 - 1] & 0xFF) + ((field933[field934 - 2] & 0xFF) << 8) + ((field933[field934 - 4] & 0xFF) << 24) + ((field933[field934 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("KHOMSBHW.a(Z)J")
	public long method355() {
		long var1 = method354() & 0xFFFFFFFFL;
		long var3 = method354() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("KHOMSBHW.i()Ljava/lang/String;")
	public String method356() {
		int var1 = field934;

		while (field933[field934++] != 10) {
		}

		return new String(field933, var1, field934 - var1 - 1);
	}

	@ObfuscatedName("KHOMSBHW.e(I)[B")
	public byte[] method357() {
		int var1 = field934;

		while (field933[field934++] != 10) {
		}

		byte[] var2 = new byte[field934 - var1 - 1];
		for (int var3 = var1; var3 < field934 - 1; var3++) {
			var2[var3 - var1] = field933[var3];
		}

		return var2;
	}

	@ObfuscatedName("KHOMSBHW.a(IZ[BI)V")
	public void method358(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field933[field934++];
		}
	}

	@ObfuscatedName("KHOMSBHW.a(B)V")
	public void method359() {
		field935 = field934 * 8;
	}

	@ObfuscatedName("KHOMSBHW.a(ZI)I")
	public int method360(int arg0) {
		int var2 = field935 >> 3;
		int var3 = 8 - (field935 & 0x7);
		int var4 = 0;
		field935 += arg0;

		while (arg0 > var3) {
			var4 += (field933[var2++] & field937[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field933[var2] & field937[var3];
		} else {
			var4 += field933[var2] >> var3 - arg0 & field937[arg0];
		}

		return var4;
	}

	@ObfuscatedName("KHOMSBHW.b(B)V")
	public void method361() {
		field934 = (field935 + 7) / 8;
	}

	@ObfuscatedName("KHOMSBHW.j()I")
	public int method362() {
		int var1 = field933[field934] & 0xFF;
		if (var1 < 128) {
			return method349() - 64;
		}

		return method351() - 49152;
	}

	@ObfuscatedName("KHOMSBHW.k()I")
	public int method363() {
		int var1 = field933[field934] & 0xFF;
		if (var1 < 128) {
			return method349();
		}

		return method351() - 32768;
	}

	@ObfuscatedName("KHOMSBHW.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method364(BigInteger arg0, BigInteger arg1) {
		int var3 = field934;
		field934 = 0;
		byte[] var4 = new byte[var3];
		method358(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field934 = 0;
		method339(var7.length);
		method347(var7.length, 0, var7);
	}

	@ObfuscatedName("KHOMSBHW.c(IB)V")
	public void method365(int arg0) {
		field933[field934++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("KHOMSBHW.a(IZ)V")
	public void method366(int arg0) {
		field933[field934++] = (byte) -arg0;
	}

	@ObfuscatedName("KHOMSBHW.d(II)V")
	public void method367(int arg0) {
		field933[field934++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("KHOMSBHW.b(Z)I")
	public int method368() {
		return field933[field934++] - 128 & 0xFF;
	}

	@ObfuscatedName("KHOMSBHW.f(I)I")
	public int method369() {
		return -field933[field934++] & 0xFF;
	}

	@ObfuscatedName("KHOMSBHW.g(I)I")
	public int method370() {
		return 128 - field933[field934++] & 0xFF;
	}

	@ObfuscatedName("KHOMSBHW.c(Z)B")
	public byte method371() {
		return (byte) (field933[field934++] - 128);
	}

	@ObfuscatedName("KHOMSBHW.d(Z)B")
	public byte method372() {
		return (byte) -field933[field934++];
	}

	@ObfuscatedName("KHOMSBHW.h(I)B")
	public byte method373() {
		return (byte) (128 - field933[field934++]);
	}

	@ObfuscatedName("KHOMSBHW.e(II)V")
	public void method374(int arg0) {
		field933[field934++] = (byte) arg0;
		field933[field934++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("KHOMSBHW.b(IZ)V")
	public void method375(int arg0) {
		field933[field934++] = (byte) (arg0 >> 8);
		field933[field934++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("KHOMSBHW.b(ZI)V")
	public void method376(int arg0) {
		field933[field934++] = (byte) (arg0 + 128);
		field933[field934++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("KHOMSBHW.c(B)I")
	public int method377() {
		field934 += 2;
		return ((field933[field934 - 1] & 0xFF) << 8) + (field933[field934 - 2] & 0xFF);
	}

	@ObfuscatedName("KHOMSBHW.d(B)I")
	public int method378() {
		field934 += 2;
		return ((field933[field934 - 2] & 0xFF) << 8) + (field933[field934 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("KHOMSBHW.e(B)I")
	public int method379() {
		field934 += 2;
		return ((field933[field934 - 1] & 0xFF) << 8) + (field933[field934 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("KHOMSBHW.i(I)I")
	public int method380() {
		field934 += 2;
		int var1 = ((field933[field934 - 1] & 0xFF) << 8) + (field933[field934 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("KHOMSBHW.j(I)I")
	public int method381() {
		field934 += 2;
		int var1 = ((field933[field934 - 2] & 0xFF) << 8) + (field933[field934 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("KHOMSBHW.k(I)I")
	public int method382() {
		field934 += 2;
		int var1 = ((field933[field934 - 1] & 0xFF) << 8) + (field933[field934 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("KHOMSBHW.f(II)V")
	public void method383(int arg0) {
		field933[field934++] = (byte) (arg0 >> 16);
		field933[field934++] = (byte) (arg0 >> 24);
		field933[field934++] = (byte) arg0;
		field933[field934++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("KHOMSBHW.e(Z)I")
	public int method384() {
		field934 += 4;
		return (field933[field934 - 4] & 0xFF) + ((field933[field934 - 3] & 0xFF) << 8) + ((field933[field934 - 1] & 0xFF) << 24) + ((field933[field934 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("KHOMSBHW.f(Z)I")
	public int method385() {
		field934 += 4;
		return (field933[field934 - 3] & 0xFF) + ((field933[field934 - 4] & 0xFF) << 8) + ((field933[field934 - 2] & 0xFF) << 24) + ((field933[field934 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("KHOMSBHW.l(I)I")
	public int method386() {
		field934 += 4;
		return (field933[field934 - 2] & 0xFF) + ((field933[field934 - 1] & 0xFF) << 8) + ((field933[field934 - 3] & 0xFF) << 24) + ((field933[field934 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("KHOMSBHW.a(I[BIZ)V")
	public void method387(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field933[field934++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("KHOMSBHW.a([BIZI)V")
	public void method388(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (field933[field934++] - 128);
		}
	}

	@ObfuscatedName("KHOMSBHW.a(III[B)V")
	public void method389(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = (byte) (field933[field934++] - 128);
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

			field936[var0] = var1;
		}
	}
}
