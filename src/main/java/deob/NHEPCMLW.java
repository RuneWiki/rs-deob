package deob;

import java.math.BigInteger;

@ObfuscatedName("NHEPCMLW")
public final class NHEPCMLW extends KWULTEKW {

	@ObfuscatedName("NHEPCMLW.x")
	public byte[] field964;

	@ObfuscatedName("NHEPCMLW.y")
	public int field965;

	@ObfuscatedName("NHEPCMLW.A")
	public static int[] field967 = new int[256];

	@ObfuscatedName("NHEPCMLW.B")
	public static final int[] field968 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("NHEPCMLW.G")
	public static OCPYCLUF field973 = new OCPYCLUF();

	@ObfuscatedName("NHEPCMLW.H")
	public static OCPYCLUF field974 = new OCPYCLUF();

	@ObfuscatedName("NHEPCMLW.I")
	public static OCPYCLUF field975 = new OCPYCLUF();

	@ObfuscatedName("NHEPCMLW.J")
	public static char[] field976 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("NHEPCMLW.z")
	public int field966;

	@ObfuscatedName("NHEPCMLW.D")
	public static int field970;

	@ObfuscatedName("NHEPCMLW.E")
	public static int field971;

	@ObfuscatedName("NHEPCMLW.F")
	public static int field972;

	@ObfuscatedName("NHEPCMLW.C")
	public IPEHOOFG field969;

	@ObfuscatedName("NHEPCMLW.a(II)LNHEPCMLW;")
	public static NHEPCMLW method337(int arg0) {
		synchronized (field974) {
			NHEPCMLW var2 = null;
			if (arg0 == 0 && field970 > 0) {
				field970--;
				var2 = (NHEPCMLW) field973.method413();
			} else if (arg0 == 1 && field971 > 0) {
				field971--;
				var2 = (NHEPCMLW) field974.method413();
			} else if (arg0 == 2 && field972 > 0) {
				field972--;
				var2 = (NHEPCMLW) field975.method413();
			}

			if (var2 != null) {
				var2.field965 = 0;
				return var2;
			}
		}

		NHEPCMLW var4 = new NHEPCMLW();
		var4.field965 = 0;

		if (arg0 == 0) {
			var4.field964 = new byte[100];
		} else if (arg0 == 1) {
			var4.field964 = new byte[5000];
		} else {
			var4.field964 = new byte[30000];
		}

		return var4;
	}

	public NHEPCMLW() {
	}

	public NHEPCMLW(byte[] arg0) {
		field964 = arg0;
		field965 = 0;
	}

	@ObfuscatedName("NHEPCMLW.b(II)V")
	public void method338(int arg0) {
		field964[field965++] = (byte) (arg0 + field969.method278());
	}

	@ObfuscatedName("NHEPCMLW.a(I)V")
	public void method339(int arg0) {
		field964[field965++] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.b(I)V")
	public void method340(int arg0) {
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.c(II)V")
	public void method341(int arg0) {
		field964[field965++] = (byte) arg0;
		field964[field965++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NHEPCMLW.c(I)V")
	public void method342(int arg0) {
		field964[field965++] = (byte) (arg0 >> 16);
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.d(I)V")
	public void method343(int arg0) {
		field964[field965++] = (byte) (arg0 >> 24);
		field964[field965++] = (byte) (arg0 >> 16);
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.d(II)V")
	public void method344(int arg0) {
		field964[field965++] = (byte) arg0;
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) (arg0 >> 16);
		field964[field965++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("NHEPCMLW.a(JB)V")
	public void method345(long arg0) {
		field964[field965++] = (byte) (arg0 >> 56);
		field964[field965++] = (byte) (arg0 >> 48);
		field964[field965++] = (byte) (arg0 >> 40);
		field964[field965++] = (byte) (arg0 >> 32);
		field964[field965++] = (byte) (arg0 >> 24);
		field964[field965++] = (byte) (arg0 >> 16);
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.a(Ljava/lang/String;)V")
	public void method346(String arg0) {
		arg0.getBytes(0, arg0.length(), field964, field965);
		field965 += arg0.length();
		field964[field965++] = 10;
	}

	@ObfuscatedName("NHEPCMLW.a(I[BII)V")
	public void method347(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field964[field965++] = arg1[var4];
		}
	}

	@ObfuscatedName("NHEPCMLW.e(II)V")
	public void method348(int arg0) {
		field964[field965 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("NHEPCMLW.c()I")
	public int method349() {
		return field964[field965++] & 0xFF;
	}

	@ObfuscatedName("NHEPCMLW.d()B")
	public byte method350() {
		return field964[field965++];
	}

	@ObfuscatedName("NHEPCMLW.e()I")
	public int method351() {
		field965 += 2;
		return ((field964[field965 - 2] & 0xFF) << 8) + (field964[field965 - 1] & 0xFF);
	}

	@ObfuscatedName("NHEPCMLW.f()I")
	public int method352() {
		field965 += 2;
		int var1 = ((field964[field965 - 2] & 0xFF) << 8) + (field964[field965 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NHEPCMLW.g()I")
	public int method353() {
		field965 += 3;
		return (field964[field965 - 1] & 0xFF) + ((field964[field965 - 3] & 0xFF) << 16) + ((field964[field965 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("NHEPCMLW.h()I")
	public int method354() {
		field965 += 4;
		return (field964[field965 - 1] & 0xFF) + ((field964[field965 - 2] & 0xFF) << 8) + ((field964[field965 - 4] & 0xFF) << 24) + ((field964[field965 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("NHEPCMLW.e(I)J")
	public long method355() {
		long var1 = method354() & 0xFFFFFFFFL;
		long var3 = method354() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("NHEPCMLW.i()Ljava/lang/String;")
	public String method356() {
		int var1 = field965;

		while (field964[field965++] != 10) {
		}

		return new String(field964, var1, field965 - var1 - 1);
	}

	@ObfuscatedName("NHEPCMLW.f(I)[B")
	public byte[] method357() {
		int var1 = field965;

		while (field964[field965++] != 10) {
		}

		byte[] var2 = new byte[field965 - var1 - 1];
		for (int var3 = var1; var3 < field965 - 1; var3++) {
			var2[var3 - var1] = field964[var3];
		}

		return var2;
	}

	@ObfuscatedName("NHEPCMLW.a(III[B)V")
	public void method358(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field964[field965++];
		}
	}

	@ObfuscatedName("NHEPCMLW.a(Z)V")
	public void method359() {
		field966 = field965 * 8;
	}

	@ObfuscatedName("NHEPCMLW.f(II)I")
	public int method360(int arg0) {
		int var2 = field966 >> 3;
		int var3 = 8 - (field966 & 0x7);
		int var4 = 0;
		field966 += arg0;

		while (arg0 > var3) {
			var4 += (field964[var2++] & field968[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field964[var2] & field968[var3];
		} else {
			var4 += field964[var2] >> var3 - arg0 & field968[arg0];
		}

		return var4;
	}

	@ObfuscatedName("NHEPCMLW.g(I)V")
	public void method361() {
		field965 = (field966 + 7) / 8;
	}

	@ObfuscatedName("NHEPCMLW.j()I")
	public int method362() {
		int var1 = field964[field965] & 0xFF;
		if (var1 < 128) {
			return method349() - 64;
		}

		return method351() - 49152;
	}

	@ObfuscatedName("NHEPCMLW.k()I")
	public int method363() {
		int var1 = field964[field965] & 0xFF;
		if (var1 < 128) {
			return method349();
		}

		return method351() - 32768;
	}

	@ObfuscatedName("NHEPCMLW.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method364(BigInteger arg0, BigInteger arg1) {
		int var3 = field965;
		field965 = 0;
		byte[] var4 = new byte[var3];
		method358(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field965 = 0;
		method339(var7.length);
		method347(var7.length, var7, 0);
	}

	@ObfuscatedName("NHEPCMLW.a(IB)V")
	public void method365(int arg0) {
		field964[field965++] = (byte) -arg0;
	}

	@ObfuscatedName("NHEPCMLW.g(II)V")
	public void method366(int arg0) {
		field964[field965++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("NHEPCMLW.h(I)I")
	public int method367() {
		return field964[field965++] - 128 & 0xFF;
	}

	@ObfuscatedName("NHEPCMLW.i(I)I")
	public int method368() {
		return -field964[field965++] & 0xFF;
	}

	@ObfuscatedName("NHEPCMLW.j(I)I")
	public int method369() {
		return 128 - field964[field965++] & 0xFF;
	}

	@ObfuscatedName("NHEPCMLW.k(I)B")
	public byte method370() {
		return (byte) (field964[field965++] - 128);
	}

	@ObfuscatedName("NHEPCMLW.l(I)B")
	public byte method371() {
		return (byte) -field964[field965++];
	}

	@ObfuscatedName("NHEPCMLW.a(IZ)V")
	public void method372(int arg0) {
		field964[field965++] = (byte) arg0;
		field964[field965++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NHEPCMLW.h(II)V")
	public void method373(int arg0) {
		field964[field965++] = (byte) (arg0 >> 8);
		field964[field965++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("NHEPCMLW.b(IZ)V")
	public void method374(int arg0) {
		field964[field965++] = (byte) (arg0 + 128);
		field964[field965++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NHEPCMLW.m(I)I")
	public int method375() {
		field965 += 2;
		return ((field964[field965 - 1] & 0xFF) << 8) + (field964[field965 - 2] & 0xFF);
	}

	@ObfuscatedName("NHEPCMLW.n(I)I")
	public int method376() {
		field965 += 2;
		return ((field964[field965 - 2] & 0xFF) << 8) + (field964[field965 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("NHEPCMLW.b(Z)I")
	public int method377() {
		field965 += 2;
		return ((field964[field965 - 1] & 0xFF) << 8) + (field964[field965 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("NHEPCMLW.a(B)I")
	public int method378() {
		field965 += 2;
		int var1 = ((field964[field965 - 1] & 0xFF) << 8) + (field964[field965 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NHEPCMLW.o(I)I")
	public int method379() {
		field965 += 2;
		int var1 = ((field964[field965 - 2] & 0xFF) << 8) + (field964[field965 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NHEPCMLW.b(B)I")
	public int method380() {
		field965 += 2;
		int var1 = ((field964[field965 - 1] & 0xFF) << 8) + (field964[field965 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("NHEPCMLW.i(II)V")
	public void method381(int arg0) {
		field964[field965++] = (byte) (arg0 >> 16);
		field964[field965++] = (byte) (arg0 >> 24);
		field964[field965++] = (byte) arg0;
		field964[field965++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("NHEPCMLW.c(Z)I")
	public int method382() {
		field965 += 4;
		return (field964[field965 - 4] & 0xFF) + ((field964[field965 - 3] & 0xFF) << 8) + ((field964[field965 - 1] & 0xFF) << 24) + ((field964[field965 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("NHEPCMLW.p(I)I")
	public int method383() {
		field965 += 4;
		return (field964[field965 - 3] & 0xFF) + ((field964[field965 - 4] & 0xFF) << 8) + ((field964[field965 - 2] & 0xFF) << 24) + ((field964[field965 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("NHEPCMLW.d(Z)I")
	public int method384() {
		field965 += 4;
		return (field964[field965 - 2] & 0xFF) + ((field964[field965 - 1] & 0xFF) << 8) + ((field964[field965 - 3] & 0xFF) << 24) + ((field964[field965 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("NHEPCMLW.b(III[B)V")
	public void method385(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			field964[field965++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("NHEPCMLW.a(II[BI)V")
	public void method386(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = field964[field965++];
		}
	}

	@ObfuscatedName("NHEPCMLW.a(IB[BI)V")
	public void method387(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field964[field965++] - 128);
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

			field967[var0] = var1;
		}
	}
}
