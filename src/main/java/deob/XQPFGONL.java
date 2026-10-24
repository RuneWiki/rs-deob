package deob;

import java.math.BigInteger;

@ObfuscatedName("XQPFGONL")
public final class XQPFGONL extends ZAQWNGNJ {

	@ObfuscatedName("XQPFGONL.z")
	public byte[] field1334;

	@ObfuscatedName("XQPFGONL.A")
	public int field1335;

	@ObfuscatedName("XQPFGONL.C")
	public static int[] field1337 = new int[256];

	@ObfuscatedName("XQPFGONL.D")
	public static final int[] field1338 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("XQPFGONL.I")
	public static FOKYUBQV field1343 = new FOKYUBQV();

	@ObfuscatedName("XQPFGONL.J")
	public static FOKYUBQV field1344 = new FOKYUBQV();

	@ObfuscatedName("XQPFGONL.K")
	public static FOKYUBQV field1345 = new FOKYUBQV();

	@ObfuscatedName("XQPFGONL.L")
	public static char[] field1346 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("XQPFGONL.B")
	public int field1336;

	@ObfuscatedName("XQPFGONL.F")
	public static int field1340;

	@ObfuscatedName("XQPFGONL.G")
	public static int field1341;

	@ObfuscatedName("XQPFGONL.H")
	public static int field1342;

	@ObfuscatedName("XQPFGONL.E")
	public XLANGUSV field1339;

	@ObfuscatedName("XQPFGONL.a(BI)LXQPFGONL;")
	public static XQPFGONL method466(int arg0) {
		synchronized (field1344) {
			XQPFGONL var2 = null;
			if (arg0 == 0 && field1340 > 0) {
				field1340--;
				var2 = (XQPFGONL) field1343.method198();
			} else if (arg0 == 1 && field1341 > 0) {
				field1341--;
				var2 = (XQPFGONL) field1344.method198();
			} else if (arg0 == 2 && field1342 > 0) {
				field1342--;
				var2 = (XQPFGONL) field1345.method198();
			}

			if (var2 != null) {
				var2.field1335 = 0;
				return var2;
			}
		}

		XQPFGONL var4 = new XQPFGONL();
		var4.field1335 = 0;

		if (arg0 == 0) {
			var4.field1334 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1334 = new byte[5000];
		} else {
			var4.field1334 = new byte[30000];
		}

		return var4;
	}

	public XQPFGONL() {
	}

	public XQPFGONL(byte[] arg0) {
		field1334 = arg0;
		field1335 = 0;
	}

	@ObfuscatedName("XQPFGONL.a(II)V")
	public void method467(int arg0) {
		field1334[field1335++] = (byte) (arg0 + field1339.method461());
	}

	@ObfuscatedName("XQPFGONL.a(I)V")
	public void method468(int arg0) {
		field1334[field1335++] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.b(I)V")
	public void method469(int arg0) {
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.b(BI)V")
	public void method470(int arg0) {
		field1334[field1335++] = (byte) arg0;
		field1334[field1335++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XQPFGONL.c(I)V")
	public void method471(int arg0) {
		field1334[field1335++] = (byte) (arg0 >> 16);
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.d(I)V")
	public void method472(int arg0) {
		field1334[field1335++] = (byte) (arg0 >> 24);
		field1334[field1335++] = (byte) (arg0 >> 16);
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.a(ZI)V")
	public void method473(int arg0) {
		field1334[field1335++] = (byte) arg0;
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) (arg0 >> 16);
		field1334[field1335++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("XQPFGONL.a(JB)V")
	public void method474(long arg0) {
		field1334[field1335++] = (byte) (arg0 >> 56);
		field1334[field1335++] = (byte) (arg0 >> 48);
		field1334[field1335++] = (byte) (arg0 >> 40);
		field1334[field1335++] = (byte) (arg0 >> 32);
		field1334[field1335++] = (byte) (arg0 >> 24);
		field1334[field1335++] = (byte) (arg0 >> 16);
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.a(Ljava/lang/String;)V")
	public void method475(String arg0) {
		arg0.getBytes(0, arg0.length(), field1334, field1335);
		field1335 += arg0.length();
		field1334[field1335++] = 10;
	}

	@ObfuscatedName("XQPFGONL.a(III[B)V")
	public void method476(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			field1334[field1335++] = arg2[var4];
		}
	}

	@ObfuscatedName("XQPFGONL.b(II)V")
	public void method477(int arg0) {
		field1334[field1335 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("XQPFGONL.c()I")
	public int method478() {
		return field1334[field1335++] & 0xFF;
	}

	@ObfuscatedName("XQPFGONL.d()B")
	public byte method479() {
		return field1334[field1335++];
	}

	@ObfuscatedName("XQPFGONL.e()I")
	public int method480() {
		field1335 += 2;
		return ((field1334[field1335 - 2] & 0xFF) << 8) + (field1334[field1335 - 1] & 0xFF);
	}

	@ObfuscatedName("XQPFGONL.f()I")
	public int method481() {
		field1335 += 2;
		int var1 = ((field1334[field1335 - 2] & 0xFF) << 8) + (field1334[field1335 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XQPFGONL.g()I")
	public int method482() {
		field1335 += 3;
		return (field1334[field1335 - 1] & 0xFF) + ((field1334[field1335 - 3] & 0xFF) << 16) + ((field1334[field1335 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("XQPFGONL.h()I")
	public int method483() {
		field1335 += 4;
		return (field1334[field1335 - 1] & 0xFF) + ((field1334[field1335 - 2] & 0xFF) << 8) + ((field1334[field1335 - 4] & 0xFF) << 24) + ((field1334[field1335 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("XQPFGONL.a(B)J")
	public long method484() {
		long var1 = method483() & 0xFFFFFFFFL;
		long var3 = method483() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("XQPFGONL.i()Ljava/lang/String;")
	public String method485() {
		int var1 = field1335;

		while (field1334[field1335++] != 10) {
		}

		return new String(field1334, var1, field1335 - var1 - 1);
	}

	@ObfuscatedName("XQPFGONL.e(I)[B")
	public byte[] method486() {
		int var1 = field1335;

		while (field1334[field1335++] != 10) {
		}

		byte[] var2 = new byte[field1335 - var1 - 1];
		for (int var3 = var1; var3 < field1335 - 1; var3++) {
			var2[var3 - var1] = field1334[var3];
		}

		return var2;
	}

	@ObfuscatedName("XQPFGONL.a(IIB[B)V")
	public void method487(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1334[field1335++];
		}
	}

	@ObfuscatedName("XQPFGONL.f(I)V")
	public void method488() {
		field1336 = field1335 * 8;
	}

	@ObfuscatedName("XQPFGONL.c(II)I")
	public int method489(int arg0) {
		int var2 = field1336 >> 3;
		int var3 = 8 - (field1336 & 0x7);
		int var4 = 0;
		field1336 += arg0;

		while (arg0 > var3) {
			var4 += (field1334[var2++] & field1338[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1334[var2] & field1338[var3];
		} else {
			var4 += field1334[var2] >> var3 - arg0 & field1338[arg0];
		}

		return var4;
	}

	@ObfuscatedName("XQPFGONL.b(B)V")
	public void method490() {
		field1335 = (field1336 + 7) / 8;
	}

	@ObfuscatedName("XQPFGONL.j()I")
	public int method491() {
		int var1 = field1334[field1335] & 0xFF;
		if (var1 < 128) {
			return method478() - 64;
		}

		return method480() - 49152;
	}

	@ObfuscatedName("XQPFGONL.k()I")
	public int method492() {
		int var1 = field1334[field1335] & 0xFF;
		if (var1 < 128) {
			return method478();
		}

		return method480() - 32768;
	}

	@ObfuscatedName("XQPFGONL.a(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void method493(BigInteger arg0, BigInteger arg1) {
		int var3 = field1335;
		field1335 = 0;
		byte[] var4 = new byte[var3];
		method487(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1335 = 0;
		method468(var7.length);
		method476(var7.length, 0, var7);
	}

	@ObfuscatedName("XQPFGONL.a(IB)V")
	public void method494(int arg0) {
		field1334[field1335++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XQPFGONL.d(II)V")
	public void method495(int arg0) {
		field1334[field1335++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("XQPFGONL.g(I)I")
	public int method496() {
		return field1334[field1335++] - 128 & 0xFF;
	}

	@ObfuscatedName("XQPFGONL.h(I)I")
	public int method497() {
		return -field1334[field1335++] & 0xFF;
	}

	@ObfuscatedName("XQPFGONL.a(Z)I")
	public int method498() {
		return 128 - field1334[field1335++] & 0xFF;
	}

	@ObfuscatedName("XQPFGONL.i(I)B")
	public byte method499() {
		return (byte) -field1334[field1335++];
	}

	@ObfuscatedName("XQPFGONL.j(I)B")
	public byte method500() {
		return (byte) (128 - field1334[field1335++]);
	}

	@ObfuscatedName("XQPFGONL.c(BI)V")
	public void method501(int arg0) {
		field1334[field1335++] = (byte) arg0;
		field1334[field1335++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XQPFGONL.a(IZ)V")
	public void method502(int arg0) {
		field1334[field1335++] = (byte) (arg0 >> 8);
		field1334[field1335++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XQPFGONL.b(ZI)V")
	public void method503(int arg0) {
		field1334[field1335++] = (byte) (arg0 + 128);
		field1334[field1335++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XQPFGONL.k(I)I")
	public int method504() {
		field1335 += 2;
		return ((field1334[field1335 - 1] & 0xFF) << 8) + (field1334[field1335 - 2] & 0xFF);
	}

	@ObfuscatedName("XQPFGONL.l(I)I")
	public int method505() {
		field1335 += 2;
		return ((field1334[field1335 - 2] & 0xFF) << 8) + (field1334[field1335 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("XQPFGONL.c(B)I")
	public int method506() {
		field1335 += 2;
		return ((field1334[field1335 - 1] & 0xFF) << 8) + (field1334[field1335 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("XQPFGONL.b(Z)I")
	public int method507() {
		field1335 += 2;
		int var1 = ((field1334[field1335 - 1] & 0xFF) << 8) + (field1334[field1335 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XQPFGONL.m(I)I")
	public int method508() {
		field1335 += 2;
		int var1 = ((field1334[field1335 - 1] & 0xFF) << 8) + (field1334[field1335 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XQPFGONL.e(II)V")
	public void method509(int arg0) {
		field1334[field1335++] = (byte) (arg0 >> 16);
		field1334[field1335++] = (byte) (arg0 >> 24);
		field1334[field1335++] = (byte) arg0;
		field1334[field1335++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XQPFGONL.c(Z)I")
	public int method510() {
		field1335 += 4;
		return (field1334[field1335 - 4] & 0xFF) + ((field1334[field1335 - 3] & 0xFF) << 8) + ((field1334[field1335 - 1] & 0xFF) << 24) + ((field1334[field1335 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("XQPFGONL.d(B)I")
	public int method511() {
		field1335 += 4;
		return (field1334[field1335 - 3] & 0xFF) + ((field1334[field1335 - 4] & 0xFF) << 8) + ((field1334[field1335 - 2] & 0xFF) << 24) + ((field1334[field1335 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("XQPFGONL.d(Z)I")
	public int method512() {
		field1335 += 4;
		return (field1334[field1335 - 2] & 0xFF) + ((field1334[field1335 - 1] & 0xFF) << 8) + ((field1334[field1335 - 3] & 0xFF) << 24) + ((field1334[field1335 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("XQPFGONL.a(I[BII)V")
	public void method513(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field1334[field1335++];
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

			field1337[var0] = var1;
		}
	}
}
