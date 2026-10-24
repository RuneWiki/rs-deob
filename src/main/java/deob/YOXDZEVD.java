package deob;

import java.math.BigInteger;

@ObfuscatedName("YOXDZEVD")
public final class YOXDZEVD extends JJFDBATQ {

	@ObfuscatedName("YOXDZEVD.C")
	public byte[] field1392;

	@ObfuscatedName("YOXDZEVD.D")
	public int field1393;

	@ObfuscatedName("YOXDZEVD.F")
	public static int[] field1395 = new int[256];

	@ObfuscatedName("YOXDZEVD.G")
	public static final int[] field1396 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("YOXDZEVD.L")
	public static YLURZVWU field1401 = new YLURZVWU();

	@ObfuscatedName("YOXDZEVD.M")
	public static YLURZVWU field1402 = new YLURZVWU();

	@ObfuscatedName("YOXDZEVD.N")
	public static YLURZVWU field1403 = new YLURZVWU();

	@ObfuscatedName("YOXDZEVD.O")
	public static char[] field1404 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("YOXDZEVD.E")
	public int field1394;

	@ObfuscatedName("YOXDZEVD.I")
	public static int field1398;

	@ObfuscatedName("YOXDZEVD.J")
	public static int field1399;

	@ObfuscatedName("YOXDZEVD.K")
	public static int field1400;

	@ObfuscatedName("YOXDZEVD.H")
	public POKVNZOV field1397;

	@ObfuscatedName("YOXDZEVD.a(II)LYOXDZEVD;")
	public static YOXDZEVD method537(int arg0) {
		synchronized (field1402) {
			YOXDZEVD var2 = null;
			if (arg0 == 0 && field1398 > 0) {
				field1398--;
				var2 = (YOXDZEVD) field1401.method527();
			} else if (arg0 == 1 && field1399 > 0) {
				field1399--;
				var2 = (YOXDZEVD) field1402.method527();
			} else if (arg0 == 2 && field1400 > 0) {
				field1400--;
				var2 = (YOXDZEVD) field1403.method527();
			}

			if (var2 != null) {
				var2.field1393 = 0;
				return var2;
			}
		}

		YOXDZEVD var4 = new YOXDZEVD();
		var4.field1393 = 0;

		if (arg0 == 0) {
			var4.field1392 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1392 = new byte[5000];
		} else {
			var4.field1392 = new byte[30000];
		}

		return var4;
	}

	public YOXDZEVD() {
	}

	public YOXDZEVD(byte[] arg0) {
		field1392 = arg0;
		field1393 = 0;
	}

	@ObfuscatedName("YOXDZEVD.a(IB)V")
	public void method538(int arg0) {
		field1392[field1393++] = (byte) (arg0 + field1397.method377());
	}

	@ObfuscatedName("YOXDZEVD.a(I)V")
	public void method539(int arg0) {
		field1392[field1393++] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.b(I)V")
	public void method540(int arg0) {
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.b(IB)V")
	public void method541(int arg0) {
		field1392[field1393++] = (byte) arg0;
		field1392[field1393++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("YOXDZEVD.c(I)V")
	public void method542(int arg0) {
		field1392[field1393++] = (byte) (arg0 >> 16);
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.d(I)V")
	public void method543(int arg0) {
		field1392[field1393++] = (byte) (arg0 >> 24);
		field1392[field1393++] = (byte) (arg0 >> 16);
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.c(IB)V")
	public void method544(int arg0) {
		field1392[field1393++] = (byte) arg0;
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) (arg0 >> 16);
		field1392[field1393++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("YOXDZEVD.a(ZJ)V")
	public void method545(long arg0) {
		field1392[field1393++] = (byte) (arg0 >> 56);
		field1392[field1393++] = (byte) (arg0 >> 48);
		field1392[field1393++] = (byte) (arg0 >> 40);
		field1392[field1393++] = (byte) (arg0 >> 32);
		field1392[field1393++] = (byte) (arg0 >> 24);
		field1392[field1393++] = (byte) (arg0 >> 16);
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.a(Ljava/lang/String;)V")
	public void method546(String arg0) {
		arg0.getBytes(0, arg0.length(), field1392, field1393);
		field1393 += arg0.length();
		field1392[field1393++] = 10;
	}

	@ObfuscatedName("YOXDZEVD.a(I[BII)V")
	public void method547(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field1392[field1393++] = arg1[var4];
		}
	}

	@ObfuscatedName("YOXDZEVD.a(IZ)V")
	public void method548(int arg0) {
		field1392[field1393 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("YOXDZEVD.c()I")
	public int method549() {
		return field1392[field1393++] & 0xFF;
	}

	@ObfuscatedName("YOXDZEVD.d()B")
	public byte method550() {
		return field1392[field1393++];
	}

	@ObfuscatedName("YOXDZEVD.e()I")
	public int method551() {
		field1393 += 2;
		return ((field1392[field1393 - 2] & 0xFF) << 8) + (field1392[field1393 - 1] & 0xFF);
	}

	@ObfuscatedName("YOXDZEVD.f()I")
	public int method552() {
		field1393 += 2;
		int var1 = ((field1392[field1393 - 2] & 0xFF) << 8) + (field1392[field1393 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("YOXDZEVD.g()I")
	public int method553() {
		field1393 += 3;
		return (field1392[field1393 - 1] & 0xFF) + ((field1392[field1393 - 3] & 0xFF) << 16) + ((field1392[field1393 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("YOXDZEVD.h()I")
	public int method554() {
		field1393 += 4;
		return (field1392[field1393 - 1] & 0xFF) + ((field1392[field1393 - 2] & 0xFF) << 8) + ((field1392[field1393 - 4] & 0xFF) << 24) + ((field1392[field1393 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("YOXDZEVD.a(Z)J")
	public long method555() {
		long var1 = method554() & 0xFFFFFFFFL;
		long var3 = method554() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("YOXDZEVD.i()Ljava/lang/String;")
	public String method556() {
		int var1 = field1393;

		while (field1392[field1393++] != 10) {
		}

		return new String(field1392, var1, field1393 - var1 - 1);
	}

	@ObfuscatedName("YOXDZEVD.e(I)[B")
	public byte[] method557() {
		int var1 = field1393;

		while (field1392[field1393++] != 10) {
		}

		byte[] var2 = new byte[field1393 - var1 - 1];
		for (int var3 = var1; var3 < field1393 - 1; var3++) {
			var2[var3 - var1] = field1392[var3];
		}

		return var2;
	}

	@ObfuscatedName("YOXDZEVD.a(I[BBI)V")
	public void method558(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1392[field1393++];
		}
	}

	@ObfuscatedName("YOXDZEVD.f(I)V")
	public void method559() {
		field1394 = field1393 * 8;
	}

	@ObfuscatedName("YOXDZEVD.a(ZI)I")
	public int method560(int arg0) {
		int var2 = field1394 >> 3;
		int var3 = 8 - (field1394 & 0x7);
		int var4 = 0;
		field1394 += arg0;

		while (arg0 > var3) {
			var4 += (field1392[var2++] & field1396[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1392[var2] & field1396[var3];
		} else {
			var4 += field1392[var2] >> var3 - arg0 & field1396[arg0];
		}

		return var4;
	}

	@ObfuscatedName("YOXDZEVD.a(B)V")
	public void method561() {
		field1393 = (field1394 + 7) / 8;
	}

	@ObfuscatedName("YOXDZEVD.j()I")
	public int method562() {
		int var1 = field1392[field1393] & 0xFF;
		if (var1 < 128) {
			return method549() - 64;
		}

		return method551() - 49152;
	}

	@ObfuscatedName("YOXDZEVD.k()I")
	public int method563() {
		int var1 = field1392[field1393] & 0xFF;
		if (var1 < 128) {
			return method549();
		}

		return method551() - 32768;
	}

	@ObfuscatedName("YOXDZEVD.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method564(BigInteger arg0, BigInteger arg1) {
		int var3 = field1393;
		field1393 = 0;
		byte[] var4 = new byte[var3];
		method558(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1393 = 0;
		method539(var7.length);
		method547(0, var7, var7.length);
	}

	@ObfuscatedName("YOXDZEVD.b(IZ)V")
	public void method565(int arg0) {
		field1392[field1393++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("YOXDZEVD.b(ZI)V")
	public void method566(int arg0) {
		field1392[field1393++] = (byte) -arg0;
	}

	@ObfuscatedName("YOXDZEVD.b(II)V")
	public void method567(int arg0) {
		field1392[field1393++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("YOXDZEVD.g(I)I")
	public int method568() {
		return field1392[field1393++] - 128 & 0xFF;
	}

	@ObfuscatedName("YOXDZEVD.h(I)I")
	public int method569() {
		return -field1392[field1393++] & 0xFF;
	}

	@ObfuscatedName("YOXDZEVD.b(B)I")
	public int method570() {
		return 128 - field1392[field1393++] & 0xFF;
	}

	@ObfuscatedName("YOXDZEVD.b(Z)B")
	public byte method571() {
		return (byte) -field1392[field1393++];
	}

	@ObfuscatedName("YOXDZEVD.i(I)B")
	public byte method572() {
		return (byte) (128 - field1392[field1393++]);
	}

	@ObfuscatedName("YOXDZEVD.c(IZ)V")
	public void method573(int arg0) {
		field1392[field1393++] = (byte) arg0;
		field1392[field1393++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("YOXDZEVD.c(II)V")
	public void method574(int arg0) {
		field1392[field1393++] = (byte) (arg0 >> 8);
		field1392[field1393++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("YOXDZEVD.d(IB)V")
	public void method575(int arg0) {
		field1392[field1393++] = (byte) (arg0 + 128);
		field1392[field1393++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("YOXDZEVD.j(I)I")
	public int method576() {
		field1393 += 2;
		return ((field1392[field1393 - 1] & 0xFF) << 8) + (field1392[field1393 - 2] & 0xFF);
	}

	@ObfuscatedName("YOXDZEVD.c(Z)I")
	public int method577() {
		field1393 += 2;
		return ((field1392[field1393 - 2] & 0xFF) << 8) + (field1392[field1393 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("YOXDZEVD.d(Z)I")
	public int method578() {
		field1393 += 2;
		return ((field1392[field1393 - 1] & 0xFF) << 8) + (field1392[field1393 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("YOXDZEVD.e(Z)I")
	public int method579() {
		field1393 += 2;
		int var1 = ((field1392[field1393 - 2] & 0xFF) << 8) + (field1392[field1393 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("YOXDZEVD.k(I)I")
	public int method580() {
		field1393 += 2;
		int var1 = ((field1392[field1393 - 1] & 0xFF) << 8) + (field1392[field1393 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("YOXDZEVD.f(Z)I")
	public int method581() {
		field1393 += 4;
		return (field1392[field1393 - 4] & 0xFF) + ((field1392[field1393 - 3] & 0xFF) << 8) + ((field1392[field1393 - 1] & 0xFF) << 24) + ((field1392[field1393 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("YOXDZEVD.g(Z)I")
	public int method582() {
		field1393 += 4;
		return (field1392[field1393 - 2] & 0xFF) + ((field1392[field1393 - 1] & 0xFF) << 8) + ((field1392[field1393 - 3] & 0xFF) << 24) + ((field1392[field1393 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("YOXDZEVD.a(III[B)V")
	public void method583(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1392[field1393++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("YOXDZEVD.a(IBI[B)V")
	public void method584(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = (byte) (field1392[field1393++] - 128);
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

			field1395[var0] = var1;
		}
	}
}
