package deob;

import java.math.BigInteger;

@ObfuscatedName("CMGGUSPR")
public final class CMGGUSPR extends IOXDUYYH {

	@ObfuscatedName("CMGGUSPR.B")
	public byte[] field539;

	@ObfuscatedName("CMGGUSPR.C")
	public int field540;

	@ObfuscatedName("CMGGUSPR.E")
	public static int[] field542 = new int[256];

	@ObfuscatedName("CMGGUSPR.F")
	public static final int[] field543 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("CMGGUSPR.K")
	public static WCVCMGLX field548 = new WCVCMGLX();

	@ObfuscatedName("CMGGUSPR.L")
	public static WCVCMGLX field549 = new WCVCMGLX();

	@ObfuscatedName("CMGGUSPR.M")
	public static WCVCMGLX field550 = new WCVCMGLX();

	@ObfuscatedName("CMGGUSPR.N")
	public static char[] field551 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("CMGGUSPR.D")
	public int field541;

	@ObfuscatedName("CMGGUSPR.H")
	public static int field545;

	@ObfuscatedName("CMGGUSPR.I")
	public static int field546;

	@ObfuscatedName("CMGGUSPR.J")
	public static int field547;

	@ObfuscatedName("CMGGUSPR.G")
	public RYDUASDW field544;

	@ObfuscatedName("CMGGUSPR.a(II)LCMGGUSPR;")
	public static CMGGUSPR method182(int arg0) {
		synchronized (field549) {
			CMGGUSPR var2 = null;
			if (arg0 == 0 && field545 > 0) {
				field545--;
				var2 = (CMGGUSPR) field548.method566();
			} else if (arg0 == 1 && field546 > 0) {
				field546--;
				var2 = (CMGGUSPR) field549.method566();
			} else if (arg0 == 2 && field547 > 0) {
				field547--;
				var2 = (CMGGUSPR) field550.method566();
			}

			if (var2 != null) {
				var2.field540 = 0;
				return var2;
			}
		}

		CMGGUSPR var4 = new CMGGUSPR();
		var4.field540 = 0;

		if (arg0 == 0) {
			var4.field539 = new byte[100];
		} else if (arg0 == 1) {
			var4.field539 = new byte[5000];
		} else {
			var4.field539 = new byte[30000];
		}

		return var4;
	}

	public CMGGUSPR() {
	}

	public CMGGUSPR(byte[] arg0) {
		field539 = arg0;
		field540 = 0;
	}

	@ObfuscatedName("CMGGUSPR.b(II)V")
	public void method183(int arg0) {
		field539[field540++] = (byte) (arg0 + field544.method437());
	}

	@ObfuscatedName("CMGGUSPR.a(I)V")
	public void method184(int arg0) {
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.b(I)V")
	public void method185(int arg0) {
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.c(II)V")
	public void method186(int arg0) {
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CMGGUSPR.c(I)V")
	public void method187(int arg0) {
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.d(I)V")
	public void method188(int arg0) {
		field539[field540++] = (byte) (arg0 >> 24);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.a(IZ)V")
	public void method189(int arg0) {
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("CMGGUSPR.a(IJ)V")
	public void method190(long arg0) {
		field539[field540++] = (byte) (arg0 >> 56);
		field539[field540++] = (byte) (arg0 >> 48);
		field539[field540++] = (byte) (arg0 >> 40);
		field539[field540++] = (byte) (arg0 >> 32);
		field539[field540++] = (byte) (arg0 >> 24);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.a(Ljava/lang/String;)V")
	public void method191(String arg0) {
		arg0.getBytes(0, arg0.length(), field539, field540);
		field540 += arg0.length();
		field539[field540++] = 10;
	}

	@ObfuscatedName("CMGGUSPR.a(B[BII)V")
	public void method192(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field539[field540++] = arg0[var4];
		}
	}

	@ObfuscatedName("CMGGUSPR.b(IZ)V")
	public void method193(int arg0) {
		field539[field540 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("CMGGUSPR.c()I")
	public int method194() {
		return field539[field540++] & 0xFF;
	}

	@ObfuscatedName("CMGGUSPR.d()B")
	public byte method195() {
		return field539[field540++];
	}

	@ObfuscatedName("CMGGUSPR.e()I")
	public int method196() {
		field540 += 2;
		return ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] & 0xFF);
	}

	@ObfuscatedName("CMGGUSPR.f()I")
	public int method197() {
		field540 += 2;
		int var1 = ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CMGGUSPR.g()I")
	public int method198() {
		field540 += 3;
		return (field539[field540 - 1] & 0xFF) + ((field539[field540 - 3] & 0xFF) << 16) + ((field539[field540 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("CMGGUSPR.h()I")
	public int method199() {
		field540 += 4;
		return (field539[field540 - 1] & 0xFF) + ((field539[field540 - 2] & 0xFF) << 8) + ((field539[field540 - 4] & 0xFF) << 24) + ((field539[field540 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("CMGGUSPR.e(I)J")
	public long method200() {
		long var1 = method199() & 0xFFFFFFFFL;
		long var3 = method199() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("CMGGUSPR.i()Ljava/lang/String;")
	public String method201() {
		int var1 = field540;

		while (field539[field540++] != 10) {
		}

		return new String(field539, var1, field540 - var1 - 1);
	}

	@ObfuscatedName("CMGGUSPR.a(Z)[B")
	public byte[] method202() {
		int var1 = field540;

		while (field539[field540++] != 10) {
		}

		byte[] var2 = new byte[field540 - var1 - 1];
		for (int var3 = var1; var3 < field540 - 1; var3++) {
			var2[var3 - var1] = field539[var3];
		}

		return var2;
	}

	@ObfuscatedName("CMGGUSPR.a(II[BI)V")
	public void method203(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field539[field540++];
		}
	}

	@ObfuscatedName("CMGGUSPR.a(B)V")
	public void method204() {
		field541 = field540 * 8;
	}

	@ObfuscatedName("CMGGUSPR.d(II)I")
	public int method205(int arg0) {
		int var2 = field541 >> 3;
		int var3 = 8 - (field541 & 0x7);
		int var4 = 0;
		field541 += arg0;

		while (arg0 > var3) {
			var4 += (field539[var2++] & field543[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field539[var2] & field543[var3];
		} else {
			var4 += field539[var2] >> var3 - arg0 & field543[arg0];
		}

		return var4;
	}

	@ObfuscatedName("CMGGUSPR.f(I)V")
	public void method206() {
		field540 = (field541 + 7) / 8;
	}

	@ObfuscatedName("CMGGUSPR.j()I")
	public int method207() {
		int var1 = field539[field540] & 0xFF;
		if (var1 < 128) {
			return method194() - 64;
		}

		return method196() - 49152;
	}

	@ObfuscatedName("CMGGUSPR.k()I")
	public int method208() {
		int var1 = field539[field540] & 0xFF;
		if (var1 < 128) {
			return method194();
		}

		return method196() - 32768;
	}

	@ObfuscatedName("CMGGUSPR.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method209(BigInteger arg0, BigInteger arg1) {
		int var3 = field540;
		field540 = 0;
		byte[] var4 = new byte[var3];
		method203(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field540 = 0;
		method184(var7.length);
		method192(var7, var7.length, 0);
	}

	@ObfuscatedName("CMGGUSPR.a(IB)V")
	public void method210(int arg0) {
		field539[field540++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CMGGUSPR.b(IB)V")
	public void method211(int arg0) {
		field539[field540++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("CMGGUSPR.b(Z)I")
	public int method212() {
		return field539[field540++] - 128 & 0xFF;
	}

	@ObfuscatedName("CMGGUSPR.b(B)I")
	public int method213() {
		return -field539[field540++] & 0xFF;
	}

	@ObfuscatedName("CMGGUSPR.c(Z)I")
	public int method214() {
		return 128 - field539[field540++] & 0xFF;
	}

	@ObfuscatedName("CMGGUSPR.c(B)B")
	public byte method215() {
		return (byte) (field539[field540++] - 128);
	}

	@ObfuscatedName("CMGGUSPR.d(B)B")
	public byte method216() {
		return (byte) -field539[field540++];
	}

	@ObfuscatedName("CMGGUSPR.e(B)B")
	public byte method217() {
		return (byte) (128 - field539[field540++]);
	}

	@ObfuscatedName("CMGGUSPR.e(II)V")
	public void method218(int arg0) {
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CMGGUSPR.f(II)V")
	public void method219(int arg0) {
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CMGGUSPR.g(II)V")
	public void method220(int arg0) {
		field539[field540++] = (byte) (arg0 + 128);
		field539[field540++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CMGGUSPR.g(I)I")
	public int method221() {
		field540 += 2;
		return ((field539[field540 - 1] & 0xFF) << 8) + (field539[field540 - 2] & 0xFF);
	}

	@ObfuscatedName("CMGGUSPR.h(I)I")
	public int method222() {
		field540 += 2;
		return ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("CMGGUSPR.i(I)I")
	public int method223() {
		field540 += 2;
		return ((field539[field540 - 1] & 0xFF) << 8) + (field539[field540 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("CMGGUSPR.f(B)I")
	public int method224() {
		field540 += 2;
		int var1 = ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CMGGUSPR.j(I)I")
	public int method225() {
		field540 += 3;
		return (field539[field540 - 1] & 0xFF) + ((field539[field540 - 2] & 0xFF) << 16) + ((field539[field540 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("CMGGUSPR.c(IB)V")
	public void method226(int arg0) {
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 24);
		field539[field540++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("CMGGUSPR.d(Z)I")
	public int method227() {
		field540 += 4;
		return (field539[field540 - 4] & 0xFF) + ((field539[field540 - 3] & 0xFF) << 8) + ((field539[field540 - 1] & 0xFF) << 24) + ((field539[field540 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("CMGGUSPR.k(I)I")
	public int method228() {
		field540 += 4;
		return (field539[field540 - 2] & 0xFF) + ((field539[field540 - 1] & 0xFF) << 8) + ((field539[field540 - 3] & 0xFF) << 24) + ((field539[field540 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("CMGGUSPR.a(BI[BI)V")
	public void method229(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			field539[field540++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("CMGGUSPR.b(II[BI)V")
	public void method230(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = (byte) (field539[field540++] - 128);
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

			field542[var0] = var1;
		}
	}
}
