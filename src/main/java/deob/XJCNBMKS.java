package deob;

import java.math.BigInteger;

@ObfuscatedName("XJCNBMKS")
public final class XJCNBMKS extends LMGYBGQR {

	@ObfuscatedName("XJCNBMKS.x")
	public byte[] field1402;

	@ObfuscatedName("XJCNBMKS.y")
	public int field1403;

	@ObfuscatedName("XJCNBMKS.A")
	public static int[] field1405 = new int[256];

	@ObfuscatedName("XJCNBMKS.B")
	public static final int[] field1406 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("XJCNBMKS.G")
	public static EWLVMFRK field1411 = new EWLVMFRK();

	@ObfuscatedName("XJCNBMKS.H")
	public static EWLVMFRK field1412 = new EWLVMFRK();

	@ObfuscatedName("XJCNBMKS.I")
	public static EWLVMFRK field1413 = new EWLVMFRK();

	@ObfuscatedName("XJCNBMKS.J")
	public static char[] field1414 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("XJCNBMKS.z")
	public int field1404;

	@ObfuscatedName("XJCNBMKS.D")
	public static int field1408;

	@ObfuscatedName("XJCNBMKS.E")
	public static int field1409;

	@ObfuscatedName("XJCNBMKS.F")
	public static int field1410;

	@ObfuscatedName("XJCNBMKS.C")
	public ADZBQDSQ field1407;

	@ObfuscatedName("XJCNBMKS.a(II)LXJCNBMKS;")
	public static XJCNBMKS method522(int arg0) {
		synchronized (field1412) {
			XJCNBMKS var2 = null;
			if (arg0 == 0 && field1408 > 0) {
				field1408--;
				var2 = (XJCNBMKS) field1411.method200();
			} else if (arg0 == 1 && field1409 > 0) {
				field1409--;
				var2 = (XJCNBMKS) field1412.method200();
			} else if (arg0 == 2 && field1410 > 0) {
				field1410--;
				var2 = (XJCNBMKS) field1413.method200();
			}

			if (var2 != null) {
				var2.field1403 = 0;
				return var2;
			}
		}

		XJCNBMKS var4 = new XJCNBMKS();
		var4.field1403 = 0;

		if (arg0 == 0) {
			var4.field1402 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1402 = new byte[5000];
		} else {
			var4.field1402 = new byte[30000];
		}

		return var4;
	}

	public XJCNBMKS() {
	}

	public XJCNBMKS(byte[] arg0) {
		field1402 = arg0;
		field1403 = 0;
	}

	@ObfuscatedName("XJCNBMKS.b(II)V")
	public void method523(int arg0) {
		field1402[field1403++] = (byte) (arg0 + field1407.method3());
	}

	@ObfuscatedName("XJCNBMKS.a(I)V")
	public void method524(int arg0) {
		field1402[field1403++] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.b(I)V")
	public void method525(int arg0) {
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.a(IB)V")
	public void method526(int arg0) {
		field1402[field1403++] = (byte) arg0;
		field1402[field1403++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XJCNBMKS.c(I)V")
	public void method527(int arg0) {
		field1402[field1403++] = (byte) (arg0 >> 16);
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.d(I)V")
	public void method528(int arg0) {
		field1402[field1403++] = (byte) (arg0 >> 24);
		field1402[field1403++] = (byte) (arg0 >> 16);
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.c(II)V")
	public void method529(int arg0) {
		field1402[field1403++] = (byte) arg0;
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) (arg0 >> 16);
		field1402[field1403++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("XJCNBMKS.a(IJ)V")
	public void method530(long arg0) {
		field1402[field1403++] = (byte) (arg0 >> 56);
		field1402[field1403++] = (byte) (arg0 >> 48);
		field1402[field1403++] = (byte) (arg0 >> 40);
		field1402[field1403++] = (byte) (arg0 >> 32);
		field1402[field1403++] = (byte) (arg0 >> 24);
		field1402[field1403++] = (byte) (arg0 >> 16);
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.a(Ljava/lang/String;)V")
	public void method531(String arg0) {
		arg0.getBytes(0, arg0.length(), field1402, field1403);
		field1403 += arg0.length();
		field1402[field1403++] = 10;
	}

	@ObfuscatedName("XJCNBMKS.a([BIII)V")
	public void method532(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field1402[field1403++] = arg0[var4];
		}
	}

	@ObfuscatedName("XJCNBMKS.d(II)V")
	public void method533(int arg0) {
		field1402[field1403 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("XJCNBMKS.c()I")
	public int method534() {
		return field1402[field1403++] & 0xFF;
	}

	@ObfuscatedName("XJCNBMKS.d()B")
	public byte method535() {
		return field1402[field1403++];
	}

	@ObfuscatedName("XJCNBMKS.e()I")
	public int method536() {
		field1403 += 2;
		return ((field1402[field1403 - 2] & 0xFF) << 8) + (field1402[field1403 - 1] & 0xFF);
	}

	@ObfuscatedName("XJCNBMKS.f()I")
	public int method537() {
		field1403 += 2;
		int var1 = ((field1402[field1403 - 2] & 0xFF) << 8) + (field1402[field1403 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XJCNBMKS.g()I")
	public int method538() {
		field1403 += 3;
		return (field1402[field1403 - 1] & 0xFF) + ((field1402[field1403 - 3] & 0xFF) << 16) + ((field1402[field1403 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("XJCNBMKS.h()I")
	public int method539() {
		field1403 += 4;
		return (field1402[field1403 - 1] & 0xFF) + ((field1402[field1403 - 2] & 0xFF) << 8) + ((field1402[field1403 - 4] & 0xFF) << 24) + ((field1402[field1403 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("XJCNBMKS.a(Z)J")
	public long method540() {
		long var1 = method539() & 0xFFFFFFFFL;
		long var3 = method539() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("XJCNBMKS.i()Ljava/lang/String;")
	public String method541() {
		int var1 = field1403;

		while (field1402[field1403++] != 10) {
		}

		return new String(field1402, var1, field1403 - var1 - 1);
	}

	@ObfuscatedName("XJCNBMKS.a(B)[B")
	public byte[] method542() {
		int var1 = field1403;

		while (field1402[field1403++] != 10) {
		}

		byte[] var2 = new byte[field1403 - var1 - 1];
		for (int var3 = var1; var3 < field1403 - 1; var3++) {
			var2[var3 - var1] = field1402[var3];
		}

		return var2;
	}

	@ObfuscatedName("XJCNBMKS.a(I[BII)V")
	public void method543(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1402[field1403++];
		}
	}

	@ObfuscatedName("XJCNBMKS.b(B)V")
	public void method544() {
		field1404 = field1403 * 8;
	}

	@ObfuscatedName("XJCNBMKS.a(ZI)I")
	public int method545(int arg0) {
		int var2 = field1404 >> 3;
		int var3 = 8 - (field1404 & 0x7);
		int var4 = 0;
		field1404 += arg0;

		while (arg0 > var3) {
			var4 += (field1402[var2++] & field1406[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1402[var2] & field1406[var3];
		} else {
			var4 += field1402[var2] >> var3 - arg0 & field1406[arg0];
		}

		return var4;
	}

	@ObfuscatedName("XJCNBMKS.e(I)V")
	public void method546() {
		field1403 = (field1404 + 7) / 8;
	}

	@ObfuscatedName("XJCNBMKS.j()I")
	public int method547() {
		int var1 = field1402[field1403] & 0xFF;
		if (var1 < 128) {
			return method534() - 64;
		}

		return method536() - 49152;
	}

	@ObfuscatedName("XJCNBMKS.k()I")
	public int method548() {
		int var1 = field1402[field1403] & 0xFF;
		if (var1 < 128) {
			return method534();
		}

		return method536() - 32768;
	}

	@ObfuscatedName("XJCNBMKS.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method549(BigInteger arg0, BigInteger arg1) {
		int var3 = field1403;
		field1403 = 0;
		byte[] var4 = new byte[var3];
		method543(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1403 = 0;
		method524(var7.length);
		method532(var7, var7.length, 0);
	}

	@ObfuscatedName("XJCNBMKS.e(II)V")
	public void method550(int arg0) {
		field1402[field1403++] = (byte) -arg0;
	}

	@ObfuscatedName("XJCNBMKS.f(II)V")
	public void method551(int arg0) {
		field1402[field1403++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("XJCNBMKS.f(I)I")
	public int method552() {
		return field1402[field1403++] - 128 & 0xFF;
	}

	@ObfuscatedName("XJCNBMKS.g(I)I")
	public int method553() {
		return -field1402[field1403++] & 0xFF;
	}

	@ObfuscatedName("XJCNBMKS.c(B)I")
	public int method554() {
		return 128 - field1402[field1403++] & 0xFF;
	}

	@ObfuscatedName("XJCNBMKS.h(I)B")
	public byte method555() {
		return (byte) (128 - field1402[field1403++]);
	}

	@ObfuscatedName("XJCNBMKS.g(II)V")
	public void method556(int arg0) {
		field1402[field1403++] = (byte) arg0;
		field1402[field1403++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XJCNBMKS.b(IB)V")
	public void method557(int arg0) {
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XJCNBMKS.c(IB)V")
	public void method558(int arg0) {
		field1402[field1403++] = (byte) (arg0 + 128);
		field1402[field1403++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XJCNBMKS.i(I)I")
	public int method559() {
		field1403 += 2;
		return ((field1402[field1403 - 1] & 0xFF) << 8) + (field1402[field1403 - 2] & 0xFF);
	}

	@ObfuscatedName("XJCNBMKS.j(I)I")
	public int method560() {
		field1403 += 2;
		return ((field1402[field1403 - 2] & 0xFF) << 8) + (field1402[field1403 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("XJCNBMKS.k(I)I")
	public int method561() {
		field1403 += 2;
		return ((field1402[field1403 - 1] & 0xFF) << 8) + (field1402[field1403 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("XJCNBMKS.l(I)I")
	public int method562() {
		field1403 += 2;
		int var1 = ((field1402[field1403 - 1] & 0xFF) << 8) + (field1402[field1403 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XJCNBMKS.m(I)I")
	public int method563() {
		field1403 += 2;
		int var1 = ((field1402[field1403 - 2] & 0xFF) << 8) + (field1402[field1403 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XJCNBMKS.b(Z)I")
	public int method564() {
		field1403 += 2;
		int var1 = ((field1402[field1403 - 1] & 0xFF) << 8) + (field1402[field1403 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XJCNBMKS.h(II)V")
	public void method565(int arg0) {
		field1402[field1403++] = (byte) arg0;
		field1402[field1403++] = (byte) (arg0 >> 8);
		field1402[field1403++] = (byte) (arg0 >> 16);
		field1402[field1403++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("XJCNBMKS.d(B)I")
	public int method566() {
		field1403 += 4;
		return (field1402[field1403 - 3] & 0xFF) + ((field1402[field1403 - 4] & 0xFF) << 8) + ((field1402[field1403 - 2] & 0xFF) << 24) + ((field1402[field1403 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("XJCNBMKS.c(Z)I")
	public int method567() {
		field1403 += 4;
		return (field1402[field1403 - 2] & 0xFF) + ((field1402[field1403 - 1] & 0xFF) << 8) + ((field1402[field1403 - 3] & 0xFF) << 24) + ((field1402[field1403 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("XJCNBMKS.b([BIII)V")
	public void method568(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			field1402[field1403++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("XJCNBMKS.a(I[BZI)V")
	public void method569(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field1402[field1403++] - 128);
		}
	}

	@ObfuscatedName("XJCNBMKS.a(I[BBI)V")
	public void method570(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = (byte) (field1402[field1403++] - 128);
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

			field1405[var0] = var1;
		}
	}
}
