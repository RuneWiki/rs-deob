package deob;

import java.math.BigInteger;

@ObfuscatedName("LBBVYYXO")
public final class LBBVYYXO extends KIFEZIQJ {

	@ObfuscatedName("LBBVYYXO.y")
	public byte[] field881;

	@ObfuscatedName("LBBVYYXO.z")
	public int field882;

	@ObfuscatedName("LBBVYYXO.B")
	public static int[] field884 = new int[256];

	@ObfuscatedName("LBBVYYXO.C")
	public static final int[] field885 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("LBBVYYXO.H")
	public static PACANLMY field890 = new PACANLMY();

	@ObfuscatedName("LBBVYYXO.I")
	public static PACANLMY field891 = new PACANLMY();

	@ObfuscatedName("LBBVYYXO.J")
	public static PACANLMY field892 = new PACANLMY();

	@ObfuscatedName("LBBVYYXO.K")
	public static char[] field893 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("LBBVYYXO.A")
	public int field883;

	@ObfuscatedName("LBBVYYXO.E")
	public static int field887;

	@ObfuscatedName("LBBVYYXO.F")
	public static int field888;

	@ObfuscatedName("LBBVYYXO.G")
	public static int field889;

	@ObfuscatedName("LBBVYYXO.D")
	public NIUUCTKL field886;

	@ObfuscatedName("LBBVYYXO.a(II)LLBBVYYXO;")
	public static LBBVYYXO method357(int arg0) {
		synchronized (field891) {
			LBBVYYXO var2 = null;
			if (arg0 == 0 && field887 > 0) {
				field887--;
				var2 = (LBBVYYXO) field890.method448();
			} else if (arg0 == 1 && field888 > 0) {
				field888--;
				var2 = (LBBVYYXO) field891.method448();
			} else if (arg0 == 2 && field889 > 0) {
				field889--;
				var2 = (LBBVYYXO) field892.method448();
			}

			if (var2 != null) {
				var2.field882 = 0;
				return var2;
			}
		}

		LBBVYYXO var4 = new LBBVYYXO();
		var4.field882 = 0;

		if (arg0 == 0) {
			var4.field881 = new byte[100];
		} else if (arg0 == 1) {
			var4.field881 = new byte[5000];
		} else {
			var4.field881 = new byte[30000];
		}

		return var4;
	}

	public LBBVYYXO() {
	}

	public LBBVYYXO(byte[] arg0) {
		field881 = arg0;
		field882 = 0;
	}

	@ObfuscatedName("LBBVYYXO.b(II)V")
	public void method358(int arg0) {
		field881[field882++] = (byte) (arg0 + field886.method424());
	}

	@ObfuscatedName("LBBVYYXO.a(I)V")
	public void method359(int arg0) {
		field881[field882++] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.b(I)V")
	public void method360(int arg0) {
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.a(ZI)V")
	public void method361(int arg0) {
		field881[field882++] = (byte) arg0;
		field881[field882++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LBBVYYXO.c(I)V")
	public void method362(int arg0) {
		field881[field882++] = (byte) (arg0 >> 16);
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.d(I)V")
	public void method363(int arg0) {
		field881[field882++] = (byte) (arg0 >> 24);
		field881[field882++] = (byte) (arg0 >> 16);
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.c(II)V")
	public void method364(int arg0) {
		field881[field882++] = (byte) arg0;
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) (arg0 >> 16);
		field881[field882++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("LBBVYYXO.a(JB)V")
	public void method365(long arg0) {
		field881[field882++] = (byte) (arg0 >> 56);
		field881[field882++] = (byte) (arg0 >> 48);
		field881[field882++] = (byte) (arg0 >> 40);
		field881[field882++] = (byte) (arg0 >> 32);
		field881[field882++] = (byte) (arg0 >> 24);
		field881[field882++] = (byte) (arg0 >> 16);
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.a(Ljava/lang/String;)V")
	public void method366(String arg0) {
		arg0.getBytes(0, arg0.length(), field881, field882);
		field882 += arg0.length();
		field881[field882++] = 10;
	}

	@ObfuscatedName("LBBVYYXO.a(I[BII)V")
	public void method367(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field881[field882++] = arg1[var4];
		}
	}

	@ObfuscatedName("LBBVYYXO.d(II)V")
	public void method368(int arg0) {
		field881[field882 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("LBBVYYXO.c()I")
	public int method369() {
		return field881[field882++] & 0xFF;
	}

	@ObfuscatedName("LBBVYYXO.d()B")
	public byte method370() {
		return field881[field882++];
	}

	@ObfuscatedName("LBBVYYXO.e()I")
	public int method371() {
		field882 += 2;
		return ((field881[field882 - 2] & 0xFF) << 8) + (field881[field882 - 1] & 0xFF);
	}

	@ObfuscatedName("LBBVYYXO.f()I")
	public int method372() {
		field882 += 2;
		int var1 = ((field881[field882 - 2] & 0xFF) << 8) + (field881[field882 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LBBVYYXO.g()I")
	public int method373() {
		field882 += 3;
		return (field881[field882 - 1] & 0xFF) + ((field881[field882 - 3] & 0xFF) << 16) + ((field881[field882 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("LBBVYYXO.h()I")
	public int method374() {
		field882 += 4;
		return (field881[field882 - 1] & 0xFF) + ((field881[field882 - 2] & 0xFF) << 8) + ((field881[field882 - 4] & 0xFF) << 24) + ((field881[field882 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("LBBVYYXO.a(Z)J")
	public long method375() {
		long var1 = method374() & 0xFFFFFFFFL;
		long var3 = method374() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("LBBVYYXO.i()Ljava/lang/String;")
	public String method376() {
		int var1 = field882;

		while (field881[field882++] != 10) {
		}

		return new String(field881, var1, field882 - var1 - 1);
	}

	@ObfuscatedName("LBBVYYXO.a(B)[B")
	public byte[] method377() {
		int var1 = field882;

		while (field881[field882++] != 10) {
		}

		byte[] var2 = new byte[field882 - var1 - 1];
		for (int var3 = var1; var3 < field882 - 1; var3++) {
			var2[var3 - var1] = field881[var3];
		}

		return var2;
	}

	@ObfuscatedName("LBBVYYXO.a([BIII)V")
	public void method378(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field881[field882++];
		}
	}

	@ObfuscatedName("LBBVYYXO.e(I)V")
	public void method379() {
		field883 = field882 * 8;
	}

	@ObfuscatedName("LBBVYYXO.a(IB)I")
	public int method380(int arg0) {
		int var2 = field883 >> 3;
		int var3 = 8 - (field883 & 0x7);
		int var4 = 0;
		field883 += arg0;

		while (arg0 > var3) {
			var4 += (field881[var2++] & field885[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field881[var2] & field885[var3];
		} else {
			var4 += field881[var2] >> var3 - arg0 & field885[arg0];
		}

		return var4;
	}

	@ObfuscatedName("LBBVYYXO.b(Z)V")
	public void method381() {
		field882 = (field883 + 7) / 8;
	}

	@ObfuscatedName("LBBVYYXO.j()I")
	public int method382() {
		int var1 = field881[field882] & 0xFF;
		if (var1 < 128) {
			return method369() - 64;
		}

		return method371() - 49152;
	}

	@ObfuscatedName("LBBVYYXO.k()I")
	public int method383() {
		int var1 = field881[field882] & 0xFF;
		if (var1 < 128) {
			return method369();
		}

		return method371() - 32768;
	}

	@ObfuscatedName("LBBVYYXO.a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method384(BigInteger arg0, BigInteger arg1) {
		int var3 = field882;
		field882 = 0;
		byte[] var4 = new byte[var3];
		method378(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field882 = 0;
		method359(var7.length);
		method367(0, var7, var7.length);
	}

	@ObfuscatedName("LBBVYYXO.e(II)V")
	public void method385(int arg0) {
		field881[field882++] = (byte) -arg0;
	}

	@ObfuscatedName("LBBVYYXO.f(II)V")
	public void method386(int arg0) {
		field881[field882++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("LBBVYYXO.b(B)I")
	public int method387() {
		return field881[field882++] - 128 & 0xFF;
	}

	@ObfuscatedName("LBBVYYXO.c(Z)I")
	public int method388() {
		return -field881[field882++] & 0xFF;
	}

	@ObfuscatedName("LBBVYYXO.f(I)I")
	public int method389() {
		return 128 - field881[field882++] & 0xFF;
	}

	@ObfuscatedName("LBBVYYXO.d(Z)B")
	public byte method390() {
		return (byte) (field881[field882++] - 128);
	}

	@ObfuscatedName("LBBVYYXO.c(B)B")
	public byte method391() {
		return (byte) -field881[field882++];
	}

	@ObfuscatedName("LBBVYYXO.a(IZ)V")
	public void method392(int arg0) {
		field881[field882++] = (byte) arg0;
		field881[field882++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LBBVYYXO.b(IB)V")
	public void method393(int arg0) {
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("LBBVYYXO.g(II)V")
	public void method394(int arg0) {
		field881[field882++] = (byte) (arg0 + 128);
		field881[field882++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LBBVYYXO.d(B)I")
	public int method395() {
		field882 += 2;
		return ((field881[field882 - 1] & 0xFF) << 8) + (field881[field882 - 2] & 0xFF);
	}

	@ObfuscatedName("LBBVYYXO.g(I)I")
	public int method396() {
		field882 += 2;
		return ((field881[field882 - 2] & 0xFF) << 8) + (field881[field882 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("LBBVYYXO.e(Z)I")
	public int method397() {
		field882 += 2;
		return ((field881[field882 - 1] & 0xFF) << 8) + (field881[field882 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("LBBVYYXO.h(I)I")
	public int method398() {
		field882 += 2;
		int var1 = ((field881[field882 - 1] & 0xFF) << 8) + (field881[field882 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LBBVYYXO.e(B)I")
	public int method399() {
		field882 += 2;
		int var1 = ((field881[field882 - 2] & 0xFF) << 8) + (field881[field882 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LBBVYYXO.i(I)I")
	public int method400() {
		field882 += 2;
		int var1 = ((field881[field882 - 1] & 0xFF) << 8) + (field881[field882 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LBBVYYXO.c(IB)V")
	public void method401(int arg0) {
		field881[field882++] = (byte) arg0;
		field881[field882++] = (byte) (arg0 >> 8);
		field881[field882++] = (byte) (arg0 >> 16);
		field881[field882++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("LBBVYYXO.f(Z)I")
	public int method402() {
		field882 += 4;
		return (field881[field882 - 4] & 0xFF) + ((field881[field882 - 3] & 0xFF) << 8) + ((field881[field882 - 1] & 0xFF) << 24) + ((field881[field882 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("LBBVYYXO.j(I)I")
	public int method403() {
		field882 += 4;
		return (field881[field882 - 3] & 0xFF) + ((field881[field882 - 4] & 0xFF) << 8) + ((field881[field882 - 2] & 0xFF) << 24) + ((field881[field882 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("LBBVYYXO.k(I)I")
	public int method404() {
		field882 += 4;
		return (field881[field882 - 2] & 0xFF) + ((field881[field882 - 1] & 0xFF) << 8) + ((field881[field882 - 3] & 0xFF) << 24) + ((field881[field882 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("LBBVYYXO.a(ZI[BI)V")
	public void method405(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field881[field882++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("LBBVYYXO.a(II[BZ)V")
	public void method406(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = field881[field882++];
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

			field884[var0] = var1;
		}
	}
}
