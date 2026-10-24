package deob;

import java.math.BigInteger;

@ObfuscatedName("BJPWOXRJ")
public final class BJPWOXRJ extends HSUOZGYX {

	@ObfuscatedName("BJPWOXRJ.s")
	public byte[] field4;

	@ObfuscatedName("BJPWOXRJ.t")
	public int field5;

	@ObfuscatedName("BJPWOXRJ.v")
	public static int[] field7 = new int[256];

	@ObfuscatedName("BJPWOXRJ.w")
	public static final int[] field8 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("BJPWOXRJ.B")
	public static RGZIHLRP field13 = new RGZIHLRP();

	@ObfuscatedName("BJPWOXRJ.C")
	public static RGZIHLRP field14 = new RGZIHLRP();

	@ObfuscatedName("BJPWOXRJ.D")
	public static RGZIHLRP field15 = new RGZIHLRP();

	@ObfuscatedName("BJPWOXRJ.E")
	public static char[] field16 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("BJPWOXRJ.y")
	public static int field10;

	@ObfuscatedName("BJPWOXRJ.z")
	public static int field11;

	@ObfuscatedName("BJPWOXRJ.A")
	public static int field12;

	@ObfuscatedName("BJPWOXRJ.u")
	public int field6;

	@ObfuscatedName("BJPWOXRJ.x")
	public FMTLAPCJ field9;

	@ObfuscatedName("BJPWOXRJ.a(IB)LBJPWOXRJ;")
	public static BJPWOXRJ method3(int arg0) {
		synchronized (field14) {
			BJPWOXRJ var2 = null;
			if (arg0 == 0 && field10 > 0) {
				field10--;
				var2 = (BJPWOXRJ) field13.method470();
			} else if (arg0 == 1 && field11 > 0) {
				field11--;
				var2 = (BJPWOXRJ) field14.method470();
			} else if (arg0 == 2 && field12 > 0) {
				field12--;
				var2 = (BJPWOXRJ) field15.method470();
			}

			if (var2 != null) {
				var2.field5 = 0;
				return var2;
			}
		}

		BJPWOXRJ var4 = new BJPWOXRJ();
		var4.field5 = 0;

		if (arg0 == 0) {
			var4.field4 = new byte[100];
		} else if (arg0 == 1) {
			var4.field4 = new byte[5000];
		} else {
			var4.field4 = new byte[30000];
		}

		return var4;
	}

	public BJPWOXRJ() {
	}

	public BJPWOXRJ(byte[] arg0) {
		field4 = arg0;
		field5 = 0;
	}

	@ObfuscatedName("BJPWOXRJ.a(II)V")
	public void method4(int arg0) {
		field4[field5++] = (byte) (arg0 + field9.method203());
	}

	@ObfuscatedName("BJPWOXRJ.a(I)V")
	public void method5(int arg0) {
		field4[field5++] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.b(I)V")
	public void method6(int arg0) {
		field4[field5++] = (byte) (arg0 >> 8);
		field4[field5++] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.b(II)V")
	public void method7(int arg0) {
		field4[field5++] = (byte) arg0;
		field4[field5++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BJPWOXRJ.c(I)V")
	public void method8(int arg0) {
		field4[field5++] = (byte) (arg0 >> 16);
		field4[field5++] = (byte) (arg0 >> 8);
		field4[field5++] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.d(I)V")
	public void method9(int arg0) {
		field4[field5++] = (byte) (arg0 >> 24);
		field4[field5++] = (byte) (arg0 >> 16);
		field4[field5++] = (byte) (arg0 >> 8);
		field4[field5++] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.c(II)V")
	public void method10(int arg0) {
		field4[field5++] = (byte) arg0;
		field4[field5++] = (byte) (arg0 >> 8);
		field4[field5++] = (byte) (arg0 >> 16);
		field4[field5++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("BJPWOXRJ.a(JI)V")
	public void method11(long arg0) {
		field4[field5++] = (byte) (arg0 >> 56);
		field4[field5++] = (byte) (arg0 >> 48);
		field4[field5++] = (byte) (arg0 >> 40);
		field4[field5++] = (byte) (arg0 >> 32);
		field4[field5++] = (byte) (arg0 >> 24);
		field4[field5++] = (byte) (arg0 >> 16);
		field4[field5++] = (byte) (arg0 >> 8);
		field4[field5++] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.a(Ljava/lang/String;)V")
	public void method12(String arg0) {
		arg0.getBytes(0, arg0.length(), field4, field5);
		field5 += arg0.length();
		field4[field5++] = 10;
	}

	@ObfuscatedName("BJPWOXRJ.a(I[BII)V")
	public void method13(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field4[field5++] = arg1[var4];
		}
	}

	@ObfuscatedName("BJPWOXRJ.a(ZI)V")
	public void method14(int arg0) {
		field4[field5 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("BJPWOXRJ.c()I")
	public int method15() {
		return field4[field5++] & 0xFF;
	}

	@ObfuscatedName("BJPWOXRJ.d()B")
	public byte method16() {
		return field4[field5++];
	}

	@ObfuscatedName("BJPWOXRJ.e()I")
	public int method17() {
		field5 += 2;
		return ((field4[field5 - 2] & 0xFF) << 8) + (field4[field5 - 1] & 0xFF);
	}

	@ObfuscatedName("BJPWOXRJ.f()I")
	public int method18() {
		field5 += 2;
		int var1 = ((field4[field5 - 2] & 0xFF) << 8) + (field4[field5 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BJPWOXRJ.g()I")
	public int method19() {
		field5 += 3;
		return (field4[field5 - 1] & 0xFF) + ((field4[field5 - 3] & 0xFF) << 16) + ((field4[field5 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("BJPWOXRJ.h()I")
	public int method20() {
		field5 += 4;
		return (field4[field5 - 1] & 0xFF) + ((field4[field5 - 2] & 0xFF) << 8) + ((field4[field5 - 4] & 0xFF) << 24) + ((field4[field5 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("BJPWOXRJ.a(B)J")
	public long method21() {
		long var1 = method20() & 0xFFFFFFFFL;
		long var3 = method20() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("BJPWOXRJ.i()Ljava/lang/String;")
	public String method22() {
		int var1 = field5;

		while (field4[field5++] != 10) {
		}

		return new String(field4, var1, field5 - var1 - 1);
	}

	@ObfuscatedName("BJPWOXRJ.e(I)[B")
	public byte[] method23() {
		int var1 = field5;

		while (field4[field5++] != 10) {
		}

		byte[] var2 = new byte[field5 - var1 - 1];
		for (int var3 = var1; var3 < field5 - 1; var3++) {
			var2[var3 - var1] = field4[var3];
		}

		return var2;
	}

	@ObfuscatedName("BJPWOXRJ.b(I[BII)V")
	public void method24(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field4[field5++];
		}
	}

	@ObfuscatedName("BJPWOXRJ.b(B)V")
	public void method25() {
		field6 = field5 * 8;
	}

	@ObfuscatedName("BJPWOXRJ.b(ZI)I")
	public int method26(int arg0) {
		int var2 = field6 >> 3;
		int var3 = 8 - (field6 & 0x7);
		int var4 = 0;
		field6 += arg0;

		while (arg0 > var3) {
			var4 += (field4[var2++] & field8[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field4[var2] & field8[var3];
		} else {
			var4 += field4[var2] >> var3 - arg0 & field8[arg0];
		}

		return var4;
	}

	@ObfuscatedName("BJPWOXRJ.f(I)V")
	public void method27() {
		field5 = (field6 + 7) / 8;
	}

	@ObfuscatedName("BJPWOXRJ.j()I")
	public int method28() {
		int var1 = field4[field5] & 0xFF;
		if (var1 < 128) {
			return method15() - 64;
		}

		return method17() - 49152;
	}

	@ObfuscatedName("BJPWOXRJ.k()I")
	public int method29() {
		int var1 = field4[field5] & 0xFF;
		if (var1 < 128) {
			return method15();
		}

		return method17() - 32768;
	}

	@ObfuscatedName("BJPWOXRJ.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method30(BigInteger arg0, BigInteger arg1) {
		int var3 = field5;
		field5 = 0;
		byte[] var4 = new byte[var3];
		method24(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field5 = 0;
		method5(var7.length);
		method13(var7.length, var7, 0);
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

			field7[var0] = var1;
		}
	}
}
