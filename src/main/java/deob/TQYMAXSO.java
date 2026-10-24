package deob;

import java.math.BigInteger;

@ObfuscatedName("TQYMAXSO")
public final class TQYMAXSO extends USMRNXZO {

	@ObfuscatedName("TQYMAXSO.z")
	public byte[] field1262;

	@ObfuscatedName("TQYMAXSO.A")
	public int field1263;

	@ObfuscatedName("TQYMAXSO.C")
	public static int[] field1265 = new int[256];

	@ObfuscatedName("TQYMAXSO.D")
	public static final int[] field1266 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("TQYMAXSO.I")
	public static CRZPTUPR field1271 = new CRZPTUPR();

	@ObfuscatedName("TQYMAXSO.J")
	public static CRZPTUPR field1272 = new CRZPTUPR();

	@ObfuscatedName("TQYMAXSO.K")
	public static CRZPTUPR field1273 = new CRZPTUPR();

	@ObfuscatedName("TQYMAXSO.L")
	public static char[] field1274 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("TQYMAXSO.B")
	public int field1264;

	@ObfuscatedName("TQYMAXSO.F")
	public static int field1268;

	@ObfuscatedName("TQYMAXSO.G")
	public static int field1269;

	@ObfuscatedName("TQYMAXSO.H")
	public static int field1270;

	@ObfuscatedName("TQYMAXSO.E")
	public MRWOUQJV field1267;

	@ObfuscatedName("TQYMAXSO.a(IB)LTQYMAXSO;")
	public static TQYMAXSO method456(int arg0) {
		synchronized (field1272) {
			TQYMAXSO var2 = null;
			if (arg0 == 0 && field1268 > 0) {
				field1268--;
				var2 = (TQYMAXSO) field1271.method178();
			} else if (arg0 == 1 && field1269 > 0) {
				field1269--;
				var2 = (TQYMAXSO) field1272.method178();
			} else if (arg0 == 2 && field1270 > 0) {
				field1270--;
				var2 = (TQYMAXSO) field1273.method178();
			}

			if (var2 != null) {
				var2.field1263 = 0;
				return var2;
			}
		}

		TQYMAXSO var4 = new TQYMAXSO();
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

	public TQYMAXSO() {
	}

	public TQYMAXSO(byte[] arg0) {
		field1262 = arg0;
		field1263 = 0;
	}

	@ObfuscatedName("TQYMAXSO.a(II)V")
	public void method457(int arg0) {
		field1262[field1263++] = (byte) (arg0 + field1267.method335());
	}

	@ObfuscatedName("TQYMAXSO.a(I)V")
	public void method458(int arg0) {
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.b(I)V")
	public void method459(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.b(II)V")
	public void method460(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TQYMAXSO.c(I)V")
	public void method461(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.d(I)V")
	public void method462(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 24);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.a(IZ)V")
	public void method463(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("TQYMAXSO.a(IJ)V")
	public void method464(long arg0) {
		field1262[field1263++] = (byte) (arg0 >> 56);
		field1262[field1263++] = (byte) (arg0 >> 48);
		field1262[field1263++] = (byte) (arg0 >> 40);
		field1262[field1263++] = (byte) (arg0 >> 32);
		field1262[field1263++] = (byte) (arg0 >> 24);
		field1262[field1263++] = (byte) (arg0 >> 16);
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.a(Ljava/lang/String;)V")
	public void method465(String arg0) {
		arg0.getBytes(0, arg0.length(), field1262, field1263);
		field1263 += arg0.length();
		field1262[field1263++] = 10;
	}

	@ObfuscatedName("TQYMAXSO.a(I[BIB)V")
	public void method466(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field1262[field1263++] = arg1[var4];
		}
	}

	@ObfuscatedName("TQYMAXSO.b(IB)V")
	public void method467(int arg0) {
		field1262[field1263 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("TQYMAXSO.c()I")
	public int method468() {
		return field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("TQYMAXSO.d()B")
	public byte method469() {
		return field1262[field1263++];
	}

	@ObfuscatedName("TQYMAXSO.e()I")
	public int method470() {
		field1263 += 2;
		return ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] & 0xFF);
	}

	@ObfuscatedName("TQYMAXSO.f()I")
	public int method471() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TQYMAXSO.g()I")
	public int method472() {
		field1263 += 3;
		return (field1262[field1263 - 1] & 0xFF) + ((field1262[field1263 - 3] & 0xFF) << 16) + ((field1262[field1263 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("TQYMAXSO.h()I")
	public int method473() {
		field1263 += 4;
		return (field1262[field1263 - 1] & 0xFF) + ((field1262[field1263 - 2] & 0xFF) << 8) + ((field1262[field1263 - 4] & 0xFF) << 24) + ((field1262[field1263 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("TQYMAXSO.e(I)J")
	public long method474() {
		long var1 = method473() & 0xFFFFFFFFL;
		long var3 = method473() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("TQYMAXSO.i()Ljava/lang/String;")
	public String method475() {
		int var1 = field1263;

		while (field1262[field1263++] != 10) {
		}

		return new String(field1262, var1, field1263 - var1 - 1);
	}

	@ObfuscatedName("TQYMAXSO.f(I)[B")
	public byte[] method476() {
		int var1 = field1263;

		while (field1262[field1263++] != 10) {
		}

		byte[] var2 = new byte[field1263 - var1 - 1];
		for (int var3 = var1; var3 < field1263 - 1; var3++) {
			var2[var3 - var1] = field1262[var3];
		}

		return var2;
	}

	@ObfuscatedName("TQYMAXSO.a(III[B)V")
	public void method477(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1262[field1263++];
		}
	}

	@ObfuscatedName("TQYMAXSO.a(B)V")
	public void method478() {
		field1264 = field1263 * 8;
	}

	@ObfuscatedName("TQYMAXSO.c(IB)I")
	public int method479(int arg0) {
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

	@ObfuscatedName("TQYMAXSO.g(I)V")
	public void method480() {
		field1263 = (field1264 + 7) / 8;
	}

	@ObfuscatedName("TQYMAXSO.j()I")
	public int method481() {
		int var1 = field1262[field1263] & 0xFF;
		if (var1 < 128) {
			return method468() - 64;
		}

		return method470() - 49152;
	}

	@ObfuscatedName("TQYMAXSO.k()I")
	public int method482() {
		int var1 = field1262[field1263] & 0xFF;
		if (var1 < 128) {
			return method468();
		}

		return method470() - 32768;
	}

	@ObfuscatedName("TQYMAXSO.a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method483(BigInteger arg0, BigInteger arg1) {
		int var3 = field1263;
		field1263 = 0;
		byte[] var4 = new byte[var3];
		method477(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1263 = 0;
		method458(var7.length);
		method466(var7.length, var7, 0);
	}

	@ObfuscatedName("TQYMAXSO.b(IZ)V")
	public void method484(int arg0) {
		field1262[field1263++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("TQYMAXSO.c(II)V")
	public void method485(int arg0) {
		field1262[field1263++] = (byte) -arg0;
	}

	@ObfuscatedName("TQYMAXSO.d(II)V")
	public void method486(int arg0) {
		field1262[field1263++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("TQYMAXSO.b(B)I")
	public int method487() {
		return field1262[field1263++] - 128 & 0xFF;
	}

	@ObfuscatedName("TQYMAXSO.h(I)I")
	public int method488() {
		return -field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("TQYMAXSO.i(I)I")
	public int method489() {
		return 128 - field1262[field1263++] & 0xFF;
	}

	@ObfuscatedName("TQYMAXSO.j(I)B")
	public byte method490() {
		return (byte) (field1262[field1263++] - 128);
	}

	@ObfuscatedName("TQYMAXSO.a(Z)B")
	public byte method491() {
		return (byte) -field1262[field1263++];
	}

	@ObfuscatedName("TQYMAXSO.c(B)B")
	public byte method492() {
		return (byte) (128 - field1262[field1263++]);
	}

	@ObfuscatedName("TQYMAXSO.e(II)V")
	public void method493(int arg0) {
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TQYMAXSO.f(II)V")
	public void method494(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("TQYMAXSO.g(II)V")
	public void method495(int arg0) {
		field1262[field1263++] = (byte) (arg0 + 128);
		field1262[field1263++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TQYMAXSO.d(B)I")
	public int method496() {
		field1263 += 2;
		return ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] & 0xFF);
	}

	@ObfuscatedName("TQYMAXSO.k(I)I")
	public int method497() {
		field1263 += 2;
		return ((field1262[field1263 - 2] & 0xFF) << 8) + (field1262[field1263 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("TQYMAXSO.e(B)I")
	public int method498() {
		field1263 += 2;
		return ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("TQYMAXSO.b(Z)I")
	public int method499() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TQYMAXSO.c(Z)I")
	public int method500() {
		field1263 += 2;
		int var1 = ((field1262[field1263 - 1] & 0xFF) << 8) + (field1262[field1263 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TQYMAXSO.c(IZ)V")
	public void method501(int arg0) {
		field1262[field1263++] = (byte) (arg0 >> 8);
		field1262[field1263++] = (byte) arg0;
		field1262[field1263++] = (byte) (arg0 >> 24);
		field1262[field1263++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("TQYMAXSO.f(B)I")
	public int method502() {
		field1263 += 4;
		return (field1262[field1263 - 4] & 0xFF) + ((field1262[field1263 - 3] & 0xFF) << 8) + ((field1262[field1263 - 1] & 0xFF) << 24) + ((field1262[field1263 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("TQYMAXSO.l(I)I")
	public int method503() {
		field1263 += 4;
		return (field1262[field1263 - 3] & 0xFF) + ((field1262[field1263 - 4] & 0xFF) << 8) + ((field1262[field1263 - 2] & 0xFF) << 24) + ((field1262[field1263 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("TQYMAXSO.m(I)I")
	public int method504() {
		field1263 += 4;
		return (field1262[field1263 - 2] & 0xFF) + ((field1262[field1263 - 1] & 0xFF) << 8) + ((field1262[field1263 - 3] & 0xFF) << 24) + ((field1262[field1263 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("TQYMAXSO.a([BIZI)V")
	public void method505(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field1262[field1263++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("TQYMAXSO.a([BIII)V")
	public void method506(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (field1262[field1263++] - 128);
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
