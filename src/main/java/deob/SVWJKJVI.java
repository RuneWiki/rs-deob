package deob;

import java.math.BigInteger;

@ObfuscatedName("SVWJKJVI")
public final class SVWJKJVI extends APQXVAYL {

	@ObfuscatedName("SVWJKJVI.z")
	public byte[] field1262;

	@ObfuscatedName("SVWJKJVI.A")
	public int field1263;

	@ObfuscatedName("SVWJKJVI.C")
	public static int[] field1265 = new int[256];

	@ObfuscatedName("SVWJKJVI.D")
	public static final int[] field1266 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("SVWJKJVI.I")
	public static ETMNPRAF field1271 = new ETMNPRAF();

	@ObfuscatedName("SVWJKJVI.J")
	public static ETMNPRAF field1272 = new ETMNPRAF();

	@ObfuscatedName("SVWJKJVI.K")
	public static ETMNPRAF field1273 = new ETMNPRAF();

	@ObfuscatedName("SVWJKJVI.L")
	public static char[] field1274 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("SVWJKJVI.B")
	public int field1264;

	@ObfuscatedName("SVWJKJVI.F")
	public static int field1268;

	@ObfuscatedName("SVWJKJVI.G")
	public static int field1269;

	@ObfuscatedName("SVWJKJVI.H")
	public static int field1270;

	@ObfuscatedName("SVWJKJVI.E")
	public OPLZBITI field1267;

	@ObfuscatedName("SVWJKJVI.a(ZI)LSVWJKJVI;")
	public static SVWJKJVI method449(int arg0) {
		synchronized (field1272) {
			SVWJKJVI var2 = null;
			if (arg0 == 0 && field1268 > 0) {
				field1268--;
				var2 = (SVWJKJVI) field1271.method180();
			} else if (arg0 == 1 && field1269 > 0) {
				field1269--;
				var2 = (SVWJKJVI) field1272.method180();
			} else if (arg0 == 2 && field1270 > 0) {
				field1270--;
				var2 = (SVWJKJVI) field1273.method180();
			}

			if (var2 != null) {
				var2.field1263 = 0;
				return var2;
			}
		}

		SVWJKJVI var4 = new SVWJKJVI();
		var4.field1263 = 0;

		if (arg0 == 0) {
			var4.field1262 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1262 = new byte[5000];
		} else {
			var4.field1262 = new byte[30000];
		}

		return var4;
	}

	public SVWJKJVI() {
	}

	public SVWJKJVI(byte[] arg0) {
		field1262 = arg0;
		field1263 = 0;
	}

	@ObfuscatedName("SVWJKJVI.a(II)V")
	public void method450(int arg0) {
		field1262[field1263++] = (byte) (arg0 + field1267.method375());
	}

	@ObfuscatedName("SVWJKJVI.a(I)V")
	public void method451(int arg0) {
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.b(I)V")
	public void method452(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.a(IB)V")
	public void method453(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("SVWJKJVI.c(I)V")
	public void method454(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.d(I)V")
	public void method455(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 24);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.b(II)V")
	public void method456(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("SVWJKJVI.a(JI)V")
	public void method457(long arg0) {
		field1262[field1263++] = (byte) (arg0 >> 56);
		field1262[field1263++] = (byte) (arg0 >> 48);
		field1262[field1263++] = (byte) (arg0 >> 40);
		field1262[field1263++] = (byte) (arg0 >> 32);
		field1262[field1263++] = (byte) (arg0 >> 24);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.a(Ljava/lang/String;)V")
	public void method458(String arg0) {
		arg0.getBytes(0, arg0.length(), field1262, field1263);
		field1263 += arg0.length();
		field1262[field1263++] = 10;
	}

	@ObfuscatedName("SVWJKJVI.a(I[BBI)V")
	public void method459(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field1262[field1263++] = arg1[var4];
		}
	}

	@ObfuscatedName("SVWJKJVI.b(ZI)V")
	public void method460(int arg0) {
		field1262[field1263 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("SVWJKJVI.c()I")
	public int method461() {
		return field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("SVWJKJVI.d()B")
	public byte method462() {
		return field1262[field1263++];
	}

	@ObfuscatedName("SVWJKJVI.e()I")
	public int method463() {
		field1263 += 2;
		return ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] & 0xFF);
	}

	@ObfuscatedName("SVWJKJVI.f()I")
	public int method464() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("SVWJKJVI.g()I")
	public int method465() {
		field1263 += 3;
		return (field1262[field1263 - 1] & 0xFF) + ((field1262[field1263 - 3] & 0xFF) << 16) + ((field1262[field1263 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("SVWJKJVI.h()I")
	public int method466() {
		field1263 += 4;
		return (field1262[field1263 - 1] & 0xFF) + ((field1262[field1263 - 2] & 0xFF) << 8) + ((field1262[field1263 - 4] & 0xFF) << 24) + ((field1262[field1263 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("SVWJKJVI.a(B)J")
	public long method467() {
		long var1 = method466() & 0xFFFFFFFFL;
		long var3 = method466() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("SVWJKJVI.i()Ljava/lang/String;")
	public String method468() {
		int var1 = field1263;

		while (field1262[field1263++] != 10) {
		}

		return new String(field1262, var1, field1263 - var1 - 1);
	}

	@ObfuscatedName("SVWJKJVI.e(I)[B")
	public byte[] method469() {
		int var1 = field1263;

		while (field1262[field1263++] != 10) {
		}

		byte[] var2 = new byte[field1263 - var1 - 1];
		for (int var3 = var1; var3 < field1263 - 1; var3++) {
			var2[var3 - var1] = field1262[var3];
		}

		return var2;
	}

	@ObfuscatedName("SVWJKJVI.a(II[BI)V")
	public void method470(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1262[field1263++];
		}
	}

	@ObfuscatedName("SVWJKJVI.f(I)V")
	public void method471() {
		field1264 = field1263 * 8;
	}

	@ObfuscatedName("SVWJKJVI.c(II)I")
	public int method472(int arg0) {
		int var2 = field1264 >> 3;
		int var3 = 8 - (field1264 & 0x7);
		int var4 = 0;
		field1264 += arg0;

		while (arg0 > var3) {
			var4 += (field1262[var2++] & field1266[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1262[var2] & field1266[var3];
		} else {
			var4 += field1262[var2] >> var3 - arg0 & field1266[arg0];
		}

		return var4;
	}

	@ObfuscatedName("SVWJKJVI.a(Z)V")
	public void method473() {
		field1263 = (field1264 + 7) / 8;
	}

	@ObfuscatedName("SVWJKJVI.j()I")
	public int method474() {
		int var1 = field1262[field1263] & 0xFF;
		if (var1 < 128) {
			return method461() - 64;
		}

		return method463() - 49152;
	}

	@ObfuscatedName("SVWJKJVI.k()I")
	public int method475() {
		int var1 = field1262[field1263] & 0xFF;
		if (var1 < 128) {
			return method461();
		}

		return method463() - 32768;
	}

	@ObfuscatedName("SVWJKJVI.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method476(BigInteger arg0, BigInteger arg1) {
		int var3 = field1263;
		field1263 = 0;
		byte[] var4 = new byte[var3];
		method470(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1263 = 0;
		method451(var7.length);
		method459(0, var7, var7.length);
	}

	@ObfuscatedName("SVWJKJVI.d(II)V")
	public void method477(int arg0) {
		field1262[field1263++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("SVWJKJVI.e(II)V")
	public void method478(int arg0) {
		field1262[field1263++] = (byte) -arg0;
	}

	@ObfuscatedName("SVWJKJVI.g(I)I")
	public int method479() {
		return field1262[field1263++] - 128 & 0xFF;
	}

	@ObfuscatedName("SVWJKJVI.h(I)I")
	public int method480() {
		return -field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("SVWJKJVI.i(I)I")
	public int method481() {
		return 128 - field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("SVWJKJVI.b(Z)B")
	public byte method482() {
		return (byte) (field1262[field1263++] - 128);
	}

	@ObfuscatedName("SVWJKJVI.j(I)B")
	public byte method483() {
		return (byte) -field1262[field1263++];
	}

	@ObfuscatedName("SVWJKJVI.k(I)B")
	public byte method484() {
		return (byte) (128 - field1262[field1263++]);
	}

	@ObfuscatedName("SVWJKJVI.c(ZI)V")
	public void method485(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("SVWJKJVI.a(IZ)V")
	public void method486(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("SVWJKJVI.b(IZ)V")
	public void method487(int arg0) {
		field1262[field1263++] = (byte) (arg0 + 128);
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("SVWJKJVI.c(Z)I")
	public int method488() {
		field1263 += 2;
		return ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] & 0xFF);
	}

	@ObfuscatedName("SVWJKJVI.b(B)I")
	public int method489() {
		field1263 += 2;
		return ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("SVWJKJVI.c(B)I")
	public int method490() {
		field1263 += 2;
		return ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("SVWJKJVI.l(I)I")
	public int method491() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("SVWJKJVI.m(I)I")
	public int method492() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("SVWJKJVI.n(I)I")
	public int method493() {
		field1263 += 4;
		return (field1262[field1263 - 3] & 0xFF) + ((field1262[field1263 - 4] & 0xFF) << 8) + ((field1262[field1263 - 2] & 0xFF) << 24) + ((field1262[field1263 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("SVWJKJVI.d(Z)I")
	public int method494() {
		field1263 += 4;
		return (field1262[field1263 - 2] & 0xFF) + ((field1262[field1263 - 1] & 0xFF) << 8) + ((field1262[field1263 - 3] & 0xFF) << 24) + ((field1262[field1263 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("SVWJKJVI.a(ZII[B)V")
	public void method495(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = field1262[field1263++];
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

			field1265[var0] = var1;
		}
	}
}
