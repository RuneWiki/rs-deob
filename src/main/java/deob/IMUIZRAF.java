package deob;

import java.math.BigInteger;

@ObfuscatedName("IMUIZRAF")
public final class IMUIZRAF extends WLTWEDNK {

	@ObfuscatedName("IMUIZRAF.B")
	public byte[] field713;

	@ObfuscatedName("IMUIZRAF.C")
	public int field714;

	@ObfuscatedName("IMUIZRAF.E")
	public static int[] field716 = new int[256];

	@ObfuscatedName("IMUIZRAF.F")
	public static final int[] field717 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("IMUIZRAF.K")
	public static PILILDKN field722 = new PILILDKN();

	@ObfuscatedName("IMUIZRAF.L")
	public static PILILDKN field723 = new PILILDKN();

	@ObfuscatedName("IMUIZRAF.M")
	public static PILILDKN field724 = new PILILDKN();

	@ObfuscatedName("IMUIZRAF.N")
	public static char[] field725 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("IMUIZRAF.D")
	public int field715;

	@ObfuscatedName("IMUIZRAF.H")
	public static int field719;

	@ObfuscatedName("IMUIZRAF.I")
	public static int field720;

	@ObfuscatedName("IMUIZRAF.J")
	public static int field721;

	@ObfuscatedName("IMUIZRAF.G")
	public XXDUCPOC field718;

	@ObfuscatedName("IMUIZRAF.a(II)LIMUIZRAF;")
	public static IMUIZRAF method226(int arg0) {
		synchronized (field723) {
			IMUIZRAF var2 = null;
			if (arg0 == 0 && field719 > 0) {
				field719--;
				var2 = (IMUIZRAF) field722.method381();
			} else if (arg0 == 1 && field720 > 0) {
				field720--;
				var2 = (IMUIZRAF) field723.method381();
			} else if (arg0 == 2 && field721 > 0) {
				field721--;
				var2 = (IMUIZRAF) field724.method381();
			}

			if (var2 != null) {
				var2.field714 = 0;
				return var2;
			}
		}

		IMUIZRAF var4 = new IMUIZRAF();
		var4.field714 = 0;

		if (arg0 == 0) {
			var4.field713 = new byte[100];
		} else if (arg0 == 1) {
			var4.field713 = new byte[5000];
		} else {
			var4.field713 = new byte[30000];
		}

		return var4;
	}

	public IMUIZRAF() {
	}

	public IMUIZRAF(byte[] arg0) {
		field713 = arg0;
		field714 = 0;
	}

	@ObfuscatedName("IMUIZRAF.b(II)V")
	public void method227(int arg0) {
		field713[field714++] = (byte) (arg0 + field718.method541());
	}

	@ObfuscatedName("IMUIZRAF.a(I)V")
	public void method228(int arg0) {
		field713[field714++] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.b(I)V")
	public void method229(int arg0) {
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.c(II)V")
	public void method230(int arg0) {
		field713[field714++] = (byte) arg0;
		field713[field714++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IMUIZRAF.c(I)V")
	public void method231(int arg0) {
		field713[field714++] = (byte) (arg0 >> 16);
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.d(I)V")
	public void method232(int arg0) {
		field713[field714++] = (byte) (arg0 >> 24);
		field713[field714++] = (byte) (arg0 >> 16);
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.d(II)V")
	public void method233(int arg0) {
		field713[field714++] = (byte) arg0;
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) (arg0 >> 16);
		field713[field714++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("IMUIZRAF.a(IJ)V")
	public void method234(long arg0) {
		field713[field714++] = (byte) (arg0 >> 56);
		field713[field714++] = (byte) (arg0 >> 48);
		field713[field714++] = (byte) (arg0 >> 40);
		field713[field714++] = (byte) (arg0 >> 32);
		field713[field714++] = (byte) (arg0 >> 24);
		field713[field714++] = (byte) (arg0 >> 16);
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.a(Ljava/lang/String;)V")
	public void method235(String arg0) {
		arg0.getBytes(0, arg0.length(), field713, field714);
		field714 += arg0.length();
		field713[field714++] = 10;
	}

	@ObfuscatedName("IMUIZRAF.a(BI[BI)V")
	public void method236(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field713[field714++] = arg1[var4];
		}
	}

	@ObfuscatedName("IMUIZRAF.e(II)V")
	public void method237(int arg0) {
		field713[field714 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("IMUIZRAF.c()I")
	public int method238() {
		return field713[field714++] & 0xFF;
	}

	@ObfuscatedName("IMUIZRAF.d()B")
	public byte method239() {
		return field713[field714++];
	}

	@ObfuscatedName("IMUIZRAF.e()I")
	public int method240() {
		field714 += 2;
		return ((field713[field714 - 2] & 0xFF) << 8) + (field713[field714 - 1] & 0xFF);
	}

	@ObfuscatedName("IMUIZRAF.f()I")
	public int method241() {
		field714 += 2;
		int var1 = ((field713[field714 - 2] & 0xFF) << 8) + (field713[field714 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IMUIZRAF.g()I")
	public int method242() {
		field714 += 3;
		return (field713[field714 - 1] & 0xFF) + ((field713[field714 - 3] & 0xFF) << 16) + ((field713[field714 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("IMUIZRAF.h()I")
	public int method243() {
		field714 += 4;
		return (field713[field714 - 1] & 0xFF) + ((field713[field714 - 2] & 0xFF) << 8) + ((field713[field714 - 4] & 0xFF) << 24) + ((field713[field714 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("IMUIZRAF.a(B)J")
	public long method244() {
		long var1 = method243() & 0xFFFFFFFFL;
		long var3 = method243() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("IMUIZRAF.i()Ljava/lang/String;")
	public String method245() {
		int var1 = field714;

		while (field713[field714++] != 10) {
		}

		return new String(field713, var1, field714 - var1 - 1);
	}

	@ObfuscatedName("IMUIZRAF.e(I)[B")
	public byte[] method246() {
		int var1 = field714;

		while (field713[field714++] != 10) {
		}

		byte[] var2 = new byte[field714 - var1 - 1];
		for (int var3 = var1; var3 < field714 - 1; var3++) {
			var2[var3 - var1] = field713[var3];
		}

		return var2;
	}

	@ObfuscatedName("IMUIZRAF.a(I[BII)V")
	public void method247(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field713[field714++];
		}
	}

	@ObfuscatedName("IMUIZRAF.b(B)V")
	public void method248() {
		field715 = field714 * 8;
	}

	@ObfuscatedName("IMUIZRAF.a(IB)I")
	public int method249(int arg0) {
		int var2 = field715 >> 3;
		int var3 = 8 - (field715 & 0x7);
		int var4 = 0;
		field715 += arg0;

		while (arg0 > var3) {
			var4 += (field713[var2++] & field717[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field713[var2] & field717[var3];
		} else {
			var4 += field713[var2] >> var3 - arg0 & field717[arg0];
		}

		return var4;
	}

	@ObfuscatedName("IMUIZRAF.f(I)V")
	public void method250() {
		field714 = (field715 + 7) / 8;
	}

	@ObfuscatedName("IMUIZRAF.j()I")
	public int method251() {
		int var1 = field713[field714] & 0xFF;
		if (var1 < 128) {
			return method238() - 64;
		}

		return method240() - 49152;
	}

	@ObfuscatedName("IMUIZRAF.k()I")
	public int method252() {
		int var1 = field713[field714] & 0xFF;
		if (var1 < 128) {
			return method238();
		}

		return method240() - 32768;
	}

	@ObfuscatedName("IMUIZRAF.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method253(BigInteger arg0, BigInteger arg1) {
		int var3 = field714;
		field714 = 0;
		byte[] var4 = new byte[var3];
		method247(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field714 = 0;
		method228(var7.length);
		method236(0, var7, var7.length);
	}

	@ObfuscatedName("IMUIZRAF.f(II)V")
	public void method254(int arg0) {
		field713[field714++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("IMUIZRAF.g(II)V")
	public void method255(int arg0) {
		field713[field714++] = (byte) -arg0;
	}

	@ObfuscatedName("IMUIZRAF.h(II)V")
	public void method256(int arg0) {
		field713[field714++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("IMUIZRAF.a(Z)I")
	public int method257() {
		return field713[field714++] - 128 & 0xFF;
	}

	@ObfuscatedName("IMUIZRAF.g(I)I")
	public int method258() {
		return -field713[field714++] & 0xFF;
	}

	@ObfuscatedName("IMUIZRAF.b(Z)I")
	public int method259() {
		return 128 - field713[field714++] & 0xFF;
	}

	@ObfuscatedName("IMUIZRAF.h(I)B")
	public byte method260() {
		return (byte) -field713[field714++];
	}

	@ObfuscatedName("IMUIZRAF.i(I)B")
	public byte method261() {
		return (byte) (128 - field713[field714++]);
	}

	@ObfuscatedName("IMUIZRAF.i(II)V")
	public void method262(int arg0) {
		field713[field714++] = (byte) arg0;
		field713[field714++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IMUIZRAF.j(II)V")
	public void method263(int arg0) {
		field713[field714++] = (byte) (arg0 >> 8);
		field713[field714++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("IMUIZRAF.k(II)V")
	public void method264(int arg0) {
		field713[field714++] = (byte) (arg0 + 128);
		field713[field714++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IMUIZRAF.j(I)I")
	public int method265() {
		field714 += 2;
		return ((field713[field714 - 1] & 0xFF) << 8) + (field713[field714 - 2] & 0xFF);
	}

	@ObfuscatedName("IMUIZRAF.k(I)I")
	public int method266() {
		field714 += 2;
		return ((field713[field714 - 2] & 0xFF) << 8) + (field713[field714 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("IMUIZRAF.l(I)I")
	public int method267() {
		field714 += 2;
		return ((field713[field714 - 1] & 0xFF) << 8) + (field713[field714 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("IMUIZRAF.c(B)I")
	public int method268() {
		field714 += 2;
		int var1 = ((field713[field714 - 1] & 0xFF) << 8) + (field713[field714 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IMUIZRAF.m(I)I")
	public int method269() {
		field714 += 2;
		int var1 = ((field713[field714 - 2] & 0xFF) << 8) + (field713[field714 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IMUIZRAF.c(Z)I")
	public int method270() {
		field714 += 4;
		return (field713[field714 - 4] & 0xFF) + ((field713[field714 - 3] & 0xFF) << 8) + ((field713[field714 - 1] & 0xFF) << 24) + ((field713[field714 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("IMUIZRAF.n(I)I")
	public int method271() {
		field714 += 4;
		return (field713[field714 - 3] & 0xFF) + ((field713[field714 - 4] & 0xFF) << 8) + ((field713[field714 - 2] & 0xFF) << 24) + ((field713[field714 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("IMUIZRAF.d(B)I")
	public int method272() {
		field714 += 4;
		return (field713[field714 - 2] & 0xFF) + ((field713[field714 - 1] & 0xFF) << 8) + ((field713[field714 - 3] & 0xFF) << 24) + ((field713[field714 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("IMUIZRAF.a(Z[BII)V")
	public void method273(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field713[field714++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("IMUIZRAF.a(II[BI)V")
	public void method274(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = (byte) (field713[field714++] - 128);
		}
	}

	@ObfuscatedName("IMUIZRAF.a([BIII)V")
	public void method275(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = (byte) (field713[field714++] - 128);
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

			field716[var0] = var1;
		}
	}
}
