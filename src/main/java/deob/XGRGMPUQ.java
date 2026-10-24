package deob;

import java.math.BigInteger;

@ObfuscatedName("XGRGMPUQ")
public final class XGRGMPUQ extends IZSDUVJF {

	@ObfuscatedName("XGRGMPUQ.G")
	public byte[] field1431;

	@ObfuscatedName("XGRGMPUQ.H")
	public int field1432;

	@ObfuscatedName("XGRGMPUQ.J")
	public static int[] field1434 = new int[256];

	@ObfuscatedName("XGRGMPUQ.K")
	public static final int[] field1435 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("XGRGMPUQ.P")
	public static VLUKUYNM field1440 = new VLUKUYNM();

	@ObfuscatedName("XGRGMPUQ.Q")
	public static VLUKUYNM field1441 = new VLUKUYNM();

	@ObfuscatedName("XGRGMPUQ.R")
	public static VLUKUYNM field1442 = new VLUKUYNM();

	@ObfuscatedName("XGRGMPUQ.S")
	public static char[] field1443 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("XGRGMPUQ.I")
	public int field1433;

	@ObfuscatedName("XGRGMPUQ.M")
	public static int field1437;

	@ObfuscatedName("XGRGMPUQ.N")
	public static int field1438;

	@ObfuscatedName("XGRGMPUQ.O")
	public static int field1439;

	@ObfuscatedName("XGRGMPUQ.L")
	public ENXSCLLS field1436;

	@ObfuscatedName("XGRGMPUQ.a(IB)LXGRGMPUQ;")
	public static XGRGMPUQ method453(int arg0) {
		synchronized (field1441) {
			XGRGMPUQ var2 = null;
			if (arg0 == 0 && field1437 > 0) {
				field1437--;
				var2 = (XGRGMPUQ) field1440.method360();
			} else if (arg0 == 1 && field1438 > 0) {
				field1438--;
				var2 = (XGRGMPUQ) field1441.method360();
			} else if (arg0 == 2 && field1439 > 0) {
				field1439--;
				var2 = (XGRGMPUQ) field1442.method360();
			}

			if (var2 != null) {
				var2.field1432 = 0;
				return var2;
			}
		}

		XGRGMPUQ var4 = new XGRGMPUQ();
		var4.field1432 = 0;

		if (arg0 == 0) {
			var4.field1431 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1431 = new byte[5000];
		} else {
			var4.field1431 = new byte[30000];
		}

		return var4;
	}

	public XGRGMPUQ() {
	}

	public XGRGMPUQ(byte[] arg0) {
		field1431 = arg0;
		field1432 = 0;
	}

	@ObfuscatedName("XGRGMPUQ.a(II)V")
	public void method454(int arg0) {
		field1431[field1432++] = (byte) (arg0 + field1436.method200());
	}

	@ObfuscatedName("XGRGMPUQ.a(I)V")
	public void method455(int arg0) {
		field1431[field1432++] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.b(I)V")
	public void method456(int arg0) {
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.b(II)V")
	public void method457(int arg0) {
		field1431[field1432++] = (byte) arg0;
		field1431[field1432++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XGRGMPUQ.c(I)V")
	public void method458(int arg0) {
		field1431[field1432++] = (byte) (arg0 >> 16);
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.d(I)V")
	public void method459(int arg0) {
		field1431[field1432++] = (byte) (arg0 >> 24);
		field1431[field1432++] = (byte) (arg0 >> 16);
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.c(II)V")
	public void method460(int arg0) {
		field1431[field1432++] = (byte) arg0;
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) (arg0 >> 16);
		field1431[field1432++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("XGRGMPUQ.a(BJ)V")
	public void method461(long arg0) {
		field1431[field1432++] = (byte) (arg0 >> 56);
		field1431[field1432++] = (byte) (arg0 >> 48);
		field1431[field1432++] = (byte) (arg0 >> 40);
		field1431[field1432++] = (byte) (arg0 >> 32);
		field1431[field1432++] = (byte) (arg0 >> 24);
		field1431[field1432++] = (byte) (arg0 >> 16);
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.a(Ljava/lang/String;)V")
	public void method462(String arg0) {
		arg0.getBytes(0, arg0.length(), field1431, field1432);
		field1432 += arg0.length();
		field1431[field1432++] = 10;
	}

	@ObfuscatedName("XGRGMPUQ.a([BIII)V")
	public void method463(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field1431[field1432++] = arg0[var4];
		}
	}

	@ObfuscatedName("XGRGMPUQ.a(ZI)V")
	public void method464(int arg0) {
		field1431[field1432 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("XGRGMPUQ.c()I")
	public int method465() {
		return field1431[field1432++] & 0xFF;
	}

	@ObfuscatedName("XGRGMPUQ.d()B")
	public byte method466() {
		return field1431[field1432++];
	}

	@ObfuscatedName("XGRGMPUQ.e()I")
	public int method467() {
		field1432 += 2;
		return ((field1431[field1432 - 2] & 0xFF) << 8) + (field1431[field1432 - 1] & 0xFF);
	}

	@ObfuscatedName("XGRGMPUQ.f()I")
	public int method468() {
		field1432 += 2;
		int var1 = ((field1431[field1432 - 2] & 0xFF) << 8) + (field1431[field1432 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XGRGMPUQ.g()I")
	public int method469() {
		field1432 += 3;
		return (field1431[field1432 - 1] & 0xFF) + ((field1431[field1432 - 3] & 0xFF) << 16) + ((field1431[field1432 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("XGRGMPUQ.h()I")
	public int method470() {
		field1432 += 4;
		return (field1431[field1432 - 1] & 0xFF) + ((field1431[field1432 - 2] & 0xFF) << 8) + ((field1431[field1432 - 4] & 0xFF) << 24) + ((field1431[field1432 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("XGRGMPUQ.e(I)J")
	public long method471() {
		long var1 = method470() & 0xFFFFFFFFL;
		long var3 = method470() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("XGRGMPUQ.i()Ljava/lang/String;")
	public String method472() {
		int var1 = field1432;

		while (field1431[field1432++] != 10) {
		}

		return new String(field1431, var1, field1432 - var1 - 1);
	}

	@ObfuscatedName("XGRGMPUQ.f(I)[B")
	public byte[] method473() {
		int var1 = field1432;

		while (field1431[field1432++] != 10) {
		}

		byte[] var2 = new byte[field1432 - var1 - 1];
		for (int var3 = var1; var3 < field1432 - 1; var3++) {
			var2[var3 - var1] = field1431[var3];
		}

		return var2;
	}

	@ObfuscatedName("XGRGMPUQ.b([BIII)V")
	public void method474(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field1431[field1432++];
		}
	}

	@ObfuscatedName("XGRGMPUQ.g(I)V")
	public void method475() {
		field1433 = field1432 * 8;
	}

	@ObfuscatedName("XGRGMPUQ.d(II)I")
	public int method476(int arg0) {
		int var2 = field1433 >> 3;
		int var3 = 8 - (field1433 & 0x7);
		int var4 = 0;
		field1433 += arg0;

		while (arg0 > var3) {
			var4 += (field1431[var2++] & field1435[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1431[var2] & field1435[var3];
		} else {
			var4 += field1431[var2] >> var3 - arg0 & field1435[arg0];
		}

		return var4;
	}

	@ObfuscatedName("XGRGMPUQ.h(I)V")
	public void method477() {
		field1432 = (field1433 + 7) / 8;
	}

	@ObfuscatedName("XGRGMPUQ.j()I")
	public int method478() {
		int var1 = field1431[field1432] & 0xFF;
		if (var1 < 128) {
			return method465() - 64;
		}

		return method467() - 49152;
	}

	@ObfuscatedName("XGRGMPUQ.k()I")
	public int method479() {
		int var1 = field1431[field1432] & 0xFF;
		if (var1 < 128) {
			return method465();
		}

		return method467() - 32768;
	}

	@ObfuscatedName("XGRGMPUQ.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method480(BigInteger arg0, BigInteger arg1) {
		int var3 = field1432;
		field1432 = 0;
		byte[] var4 = new byte[var3];
		method474(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1432 = 0;
		method455(var7.length);
		method463(var7, 0, var7.length);
	}

	@ObfuscatedName("XGRGMPUQ.a(BI)V")
	public void method481(int arg0) {
		field1431[field1432++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XGRGMPUQ.e(II)V")
	public void method482(int arg0) {
		field1431[field1432++] = (byte) -arg0;
	}

	@ObfuscatedName("XGRGMPUQ.i(I)I")
	public int method483() {
		return field1431[field1432++] - 128 & 0xFF;
	}

	@ObfuscatedName("XGRGMPUQ.j(I)I")
	public int method484() {
		return -field1431[field1432++] & 0xFF;
	}

	@ObfuscatedName("XGRGMPUQ.a(Z)I")
	public int method485() {
		return 128 - field1431[field1432++] & 0xFF;
	}

	@ObfuscatedName("XGRGMPUQ.b(Z)B")
	public byte method486() {
		return (byte) (field1431[field1432++] - 128);
	}

	@ObfuscatedName("XGRGMPUQ.k(I)B")
	public byte method487() {
		return (byte) -field1431[field1432++];
	}

	@ObfuscatedName("XGRGMPUQ.f(II)V")
	public void method488(int arg0) {
		field1431[field1432++] = (byte) arg0;
		field1431[field1432++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XGRGMPUQ.g(II)V")
	public void method489(int arg0) {
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XGRGMPUQ.h(II)V")
	public void method490(int arg0) {
		field1431[field1432++] = (byte) (arg0 + 128);
		field1431[field1432++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XGRGMPUQ.l(I)I")
	public int method491() {
		field1432 += 2;
		return ((field1431[field1432 - 1] & 0xFF) << 8) + (field1431[field1432 - 2] & 0xFF);
	}

	@ObfuscatedName("XGRGMPUQ.m(I)I")
	public int method492() {
		field1432 += 2;
		return ((field1431[field1432 - 2] & 0xFF) << 8) + (field1431[field1432 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("XGRGMPUQ.n(I)I")
	public int method493() {
		field1432 += 2;
		return ((field1431[field1432 - 1] & 0xFF) << 8) + (field1431[field1432 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("XGRGMPUQ.o(I)I")
	public int method494() {
		field1432 += 2;
		int var1 = ((field1431[field1432 - 1] & 0xFF) << 8) + (field1431[field1432 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XGRGMPUQ.p(I)I")
	public int method495() {
		field1432 += 2;
		int var1 = ((field1431[field1432 - 1] & 0xFF) << 8) + (field1431[field1432 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XGRGMPUQ.q(I)I")
	public int method496() {
		field1432 += 3;
		return (field1431[field1432 - 3] & 0xFF) + ((field1431[field1432 - 1] & 0xFF) << 16) + ((field1431[field1432 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("XGRGMPUQ.i(II)V")
	public void method497(int arg0) {
		field1431[field1432++] = (byte) (arg0 >> 8);
		field1431[field1432++] = (byte) arg0;
		field1431[field1432++] = (byte) (arg0 >> 24);
		field1431[field1432++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("XGRGMPUQ.r(I)I")
	public int method498() {
		field1432 += 4;
		return (field1431[field1432 - 4] & 0xFF) + ((field1431[field1432 - 3] & 0xFF) << 8) + ((field1431[field1432 - 1] & 0xFF) << 24) + ((field1431[field1432 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("XGRGMPUQ.s(I)I")
	public int method499() {
		field1432 += 4;
		return (field1431[field1432 - 3] & 0xFF) + ((field1431[field1432 - 4] & 0xFF) << 8) + ((field1431[field1432 - 2] & 0xFF) << 24) + ((field1431[field1432 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("XGRGMPUQ.a(IZI[B)V")
	public void method500(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			field1431[field1432++] = (byte) (arg2[var4] + 128);
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

			field1434[var0] = var1;
		}
	}
}
