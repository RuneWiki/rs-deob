package deob;

import java.math.BigInteger;

@ObfuscatedName("INLHDAGO")
public final class INLHDAGO extends MOVYLKVL {

	@ObfuscatedName("INLHDAGO.z")
	public byte[] field968;

	@ObfuscatedName("INLHDAGO.A")
	public int field969;

	@ObfuscatedName("INLHDAGO.C")
	public static int[] field971 = new int[256];

	@ObfuscatedName("INLHDAGO.D")
	public static final int[] field972 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("INLHDAGO.I")
	public static ROXEPOUC field977 = new ROXEPOUC();

	@ObfuscatedName("INLHDAGO.J")
	public static ROXEPOUC field978 = new ROXEPOUC();

	@ObfuscatedName("INLHDAGO.K")
	public static ROXEPOUC field979 = new ROXEPOUC();

	@ObfuscatedName("INLHDAGO.L")
	public static char[] field980 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("INLHDAGO.B")
	public int field970;

	@ObfuscatedName("INLHDAGO.F")
	public static int field974;

	@ObfuscatedName("INLHDAGO.G")
	public static int field975;

	@ObfuscatedName("INLHDAGO.H")
	public static int field976;

	@ObfuscatedName("INLHDAGO.E")
	public SKDZZMVP field973;

	@ObfuscatedName("INLHDAGO.a(II)LINLHDAGO;")
	public static INLHDAGO method296(int arg0) {
		synchronized (field978) {
			INLHDAGO var2 = null;
			if (arg0 == 0 && field974 > 0) {
				field974--;
				var2 = (INLHDAGO) field977.method426();
			} else if (arg0 == 1 && field975 > 0) {
				field975--;
				var2 = (INLHDAGO) field978.method426();
			} else if (arg0 == 2 && field976 > 0) {
				field976--;
				var2 = (INLHDAGO) field979.method426();
			}

			if (var2 != null) {
				var2.field969 = 0;
				return var2;
			}
		}

		INLHDAGO var4 = new INLHDAGO();
		var4.field969 = 0;

		if (arg0 == 0) {
			var4.field968 = new byte[100];
		} else if (arg0 == 1) {
			var4.field968 = new byte[5000];
		} else {
			var4.field968 = new byte[30000];
		}

		return var4;
	}

	public INLHDAGO() {
	}

	public INLHDAGO(byte[] arg0) {
		field968 = arg0;
		field969 = 0;
	}

	@ObfuscatedName("INLHDAGO.a(IZ)V")
	public void method297(int arg0) {
		field968[field969++] = (byte) (arg0 + field973.method481());
	}

	@ObfuscatedName("INLHDAGO.a(I)V")
	public void method298(int arg0) {
		field968[field969++] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.b(I)V")
	public void method299(int arg0) {
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.b(II)V")
	public void method300(int arg0) {
		field968[field969++] = (byte) arg0;
		field968[field969++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("INLHDAGO.c(I)V")
	public void method301(int arg0) {
		field968[field969++] = (byte) (arg0 >> 16);
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.d(I)V")
	public void method302(int arg0) {
		field968[field969++] = (byte) (arg0 >> 24);
		field968[field969++] = (byte) (arg0 >> 16);
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.c(II)V")
	public void method303(int arg0) {
		field968[field969++] = (byte) arg0;
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) (arg0 >> 16);
		field968[field969++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("INLHDAGO.a(IJ)V")
	public void method304(long arg0) {
		field968[field969++] = (byte) (arg0 >> 56);
		field968[field969++] = (byte) (arg0 >> 48);
		field968[field969++] = (byte) (arg0 >> 40);
		field968[field969++] = (byte) (arg0 >> 32);
		field968[field969++] = (byte) (arg0 >> 24);
		field968[field969++] = (byte) (arg0 >> 16);
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.a(Ljava/lang/String;)V")
	public void method305(String arg0) {
		arg0.getBytes(0, arg0.length(), field968, field969);
		field969 += arg0.length();
		field968[field969++] = 10;
	}

	@ObfuscatedName("INLHDAGO.a(III[B)V")
	public void method306(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			field968[field969++] = arg2[var4];
		}
	}

	@ObfuscatedName("INLHDAGO.a(IB)V")
	public void method307(int arg0) {
		field968[field969 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("INLHDAGO.c()I")
	public int method308() {
		return field968[field969++] & 0xFF;
	}

	@ObfuscatedName("INLHDAGO.d()B")
	public byte method309() {
		return field968[field969++];
	}

	@ObfuscatedName("INLHDAGO.e()I")
	public int method310() {
		field969 += 2;
		return ((field968[field969 - 2] & 0xFF) << 8) + (field968[field969 - 1] & 0xFF);
	}

	@ObfuscatedName("INLHDAGO.f()I")
	public int method311() {
		field969 += 2;
		int var1 = ((field968[field969 - 2] & 0xFF) << 8) + (field968[field969 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("INLHDAGO.g()I")
	public int method312() {
		field969 += 3;
		return (field968[field969 - 1] & 0xFF) + ((field968[field969 - 3] & 0xFF) << 16) + ((field968[field969 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("INLHDAGO.h()I")
	public int method313() {
		field969 += 4;
		return (field968[field969 - 1] & 0xFF) + ((field968[field969 - 2] & 0xFF) << 8) + ((field968[field969 - 4] & 0xFF) << 24) + ((field968[field969 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("INLHDAGO.a(B)J")
	public long method314() {
		long var1 = method313() & 0xFFFFFFFFL;
		long var3 = method313() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("INLHDAGO.i()Ljava/lang/String;")
	public String method315() {
		int var1 = field969;

		while (field968[field969++] != 10) {
		}

		return new String(field968, var1, field969 - var1 - 1);
	}

	@ObfuscatedName("INLHDAGO.e(I)[B")
	public byte[] method316() {
		int var1 = field969;

		while (field968[field969++] != 10) {
		}

		byte[] var2 = new byte[field969 - var1 - 1];
		for (int var3 = var1; var3 < field969 - 1; var3++) {
			var2[var3 - var1] = field968[var3];
		}

		return var2;
	}

	@ObfuscatedName("INLHDAGO.a(II[BI)V")
	public void method317(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field968[field969++];
		}
	}

	@ObfuscatedName("INLHDAGO.f(I)V")
	public void method318() {
		field970 = field969 * 8;
	}

	@ObfuscatedName("INLHDAGO.d(II)I")
	public int method319(int arg0) {
		int var2 = field970 >> 3;
		int var3 = 8 - (field970 & 0x7);
		int var4 = 0;
		field970 += arg0;

		while (arg0 > var3) {
			var4 += (field968[var2++] & field972[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field968[var2] & field972[var3];
		} else {
			var4 += field968[var2] >> var3 - arg0 & field972[arg0];
		}

		return var4;
	}

	@ObfuscatedName("INLHDAGO.a(Z)V")
	public void method320() {
		field969 = (field970 + 7) / 8;
	}

	@ObfuscatedName("INLHDAGO.j()I")
	public int method321() {
		int var1 = field968[field969] & 0xFF;
		if (var1 < 128) {
			return method308() - 64;
		}

		return method310() - 49152;
	}

	@ObfuscatedName("INLHDAGO.k()I")
	public int method322() {
		int var1 = field968[field969] & 0xFF;
		if (var1 < 128) {
			return method308();
		}

		return method310() - 32768;
	}

	@ObfuscatedName("INLHDAGO.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method323(BigInteger arg0, BigInteger arg1) {
		int var3 = field969;
		field969 = 0;
		byte[] var4 = new byte[var3];
		method317(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field969 = 0;
		method298(var7.length);
		method306(var7.length, 0, var7);
	}

	@ObfuscatedName("INLHDAGO.a(BI)V")
	public void method324(int arg0) {
		field968[field969++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("INLHDAGO.g(I)I")
	public int method325() {
		return field968[field969++] - 128 & 0xFF;
	}

	@ObfuscatedName("INLHDAGO.b(B)I")
	public int method326() {
		return -field968[field969++] & 0xFF;
	}

	@ObfuscatedName("INLHDAGO.h(I)I")
	public int method327() {
		return 128 - field968[field969++] & 0xFF;
	}

	@ObfuscatedName("INLHDAGO.i(I)B")
	public byte method328() {
		return (byte) (field968[field969++] - 128);
	}

	@ObfuscatedName("INLHDAGO.j(I)B")
	public byte method329() {
		return (byte) -field968[field969++];
	}

	@ObfuscatedName("INLHDAGO.e(II)V")
	public void method330(int arg0) {
		field968[field969++] = (byte) arg0;
		field968[field969++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("INLHDAGO.b(IB)V")
	public void method331(int arg0) {
		field968[field969++] = (byte) (arg0 >> 8);
		field968[field969++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("INLHDAGO.b(BI)V")
	public void method332(int arg0) {
		field968[field969++] = (byte) (arg0 + 128);
		field968[field969++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("INLHDAGO.k(I)I")
	public int method333() {
		field969 += 2;
		return ((field968[field969 - 1] & 0xFF) << 8) + (field968[field969 - 2] & 0xFF);
	}

	@ObfuscatedName("INLHDAGO.c(B)I")
	public int method334() {
		field969 += 2;
		return ((field968[field969 - 2] & 0xFF) << 8) + (field968[field969 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("INLHDAGO.l(I)I")
	public int method335() {
		field969 += 2;
		return ((field968[field969 - 1] & 0xFF) << 8) + (field968[field969 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("INLHDAGO.m(I)I")
	public int method336() {
		field969 += 2;
		int var1 = ((field968[field969 - 1] & 0xFF) << 8) + (field968[field969 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("INLHDAGO.n(I)I")
	public int method337() {
		field969 += 2;
		int var1 = ((field968[field969 - 2] & 0xFF) << 8) + (field968[field969 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("INLHDAGO.d(B)I")
	public int method338() {
		field969 += 4;
		return (field968[field969 - 4] & 0xFF) + ((field968[field969 - 3] & 0xFF) << 8) + ((field968[field969 - 1] & 0xFF) << 24) + ((field968[field969 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("INLHDAGO.b(Z)I")
	public int method339() {
		field969 += 4;
		return (field968[field969 - 2] & 0xFF) + ((field968[field969 - 1] & 0xFF) << 8) + ((field968[field969 - 3] & 0xFF) << 24) + ((field968[field969 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("INLHDAGO.b(III[B)V")
	public void method340(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			field968[field969++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("INLHDAGO.c(III[B)V")
	public void method341(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = field968[field969++];
		}
	}

	@ObfuscatedName("INLHDAGO.a([BIZI)V")
	public void method342(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = (byte) (field968[field969++] - 128);
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

			field971[var0] = var1;
		}
	}
}
