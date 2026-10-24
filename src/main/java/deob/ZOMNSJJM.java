package deob;

import java.math.BigInteger;

@ObfuscatedName("ZOMNSJJM")
public final class ZOMNSJJM extends CJDGAOKT {

	@ObfuscatedName("ZOMNSJJM.y")
	public byte[] field1456;

	@ObfuscatedName("ZOMNSJJM.z")
	public int field1457;

	@ObfuscatedName("ZOMNSJJM.B")
	public static int[] field1459 = new int[256];

	@ObfuscatedName("ZOMNSJJM.C")
	public static final int[] field1460 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ZOMNSJJM.H")
	public static YSGENUJE field1465 = new YSGENUJE();

	@ObfuscatedName("ZOMNSJJM.I")
	public static YSGENUJE field1466 = new YSGENUJE();

	@ObfuscatedName("ZOMNSJJM.J")
	public static YSGENUJE field1467 = new YSGENUJE();

	@ObfuscatedName("ZOMNSJJM.K")
	public static char[] field1468 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("ZOMNSJJM.A")
	public int field1458;

	@ObfuscatedName("ZOMNSJJM.E")
	public static int field1462;

	@ObfuscatedName("ZOMNSJJM.F")
	public static int field1463;

	@ObfuscatedName("ZOMNSJJM.G")
	public static int field1464;

	@ObfuscatedName("ZOMNSJJM.D")
	public ZQADNJCF field1461;

	@ObfuscatedName("ZOMNSJJM.a(II)LZOMNSJJM;")
	public static ZOMNSJJM method535(int arg0) {
		synchronized (field1466) {
			ZOMNSJJM var2 = null;
			if (arg0 == 0 && field1462 > 0) {
				field1462--;
				var2 = (ZOMNSJJM) field1465.method522();
			} else if (arg0 == 1 && field1463 > 0) {
				field1463--;
				var2 = (ZOMNSJJM) field1466.method522();
			} else if (arg0 == 2 && field1464 > 0) {
				field1464--;
				var2 = (ZOMNSJJM) field1467.method522();
			}

			if (var2 != null) {
				var2.field1457 = 0;
				return var2;
			}
		}

		ZOMNSJJM var4 = new ZOMNSJJM();
		var4.field1457 = 0;

		if (arg0 == 0) {
			var4.field1456 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1456 = new byte[5000];
		} else {
			var4.field1456 = new byte[30000];
		}

		return var4;
	}

	public ZOMNSJJM() {
	}

	public ZOMNSJJM(byte[] arg0) {
		field1456 = arg0;
		field1457 = 0;
	}

	@ObfuscatedName("ZOMNSJJM.a(IZ)V")
	public void method536(int arg0) {
		field1456[field1457++] = (byte) (arg0 + field1461.method585());
	}

	@ObfuscatedName("ZOMNSJJM.a(I)V")
	public void method537(int arg0) {
		field1456[field1457++] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.b(I)V")
	public void method538(int arg0) {
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.a(BI)V")
	public void method539(int arg0) {
		field1456[field1457++] = (byte) arg0;
		field1456[field1457++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ZOMNSJJM.c(I)V")
	public void method540(int arg0) {
		field1456[field1457++] = (byte) (arg0 >> 16);
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.d(I)V")
	public void method541(int arg0) {
		field1456[field1457++] = (byte) (arg0 >> 24);
		field1456[field1457++] = (byte) (arg0 >> 16);
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.b(II)V")
	public void method542(int arg0) {
		field1456[field1457++] = (byte) arg0;
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) (arg0 >> 16);
		field1456[field1457++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("ZOMNSJJM.a(JB)V")
	public void method543(long arg0) {
		field1456[field1457++] = (byte) (arg0 >> 56);
		field1456[field1457++] = (byte) (arg0 >> 48);
		field1456[field1457++] = (byte) (arg0 >> 40);
		field1456[field1457++] = (byte) (arg0 >> 32);
		field1456[field1457++] = (byte) (arg0 >> 24);
		field1456[field1457++] = (byte) (arg0 >> 16);
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.a(Ljava/lang/String;)V")
	public void method544(String arg0) {
		arg0.getBytes(0, arg0.length(), field1456, field1457);
		field1457 += arg0.length();
		field1456[field1457++] = 10;
	}

	@ObfuscatedName("ZOMNSJJM.a(III[B)V")
	public void method545(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1456[field1457++] = arg2[var4];
		}
	}

	@ObfuscatedName("ZOMNSJJM.a(ZI)V")
	public void method546(int arg0) {
		field1456[field1457 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ZOMNSJJM.c()I")
	public int method547() {
		return field1456[field1457++] & 0xFF;
	}

	@ObfuscatedName("ZOMNSJJM.d()B")
	public byte method548() {
		return field1456[field1457++];
	}

	@ObfuscatedName("ZOMNSJJM.e()I")
	public int method549() {
		field1457 += 2;
		return ((field1456[field1457 - 2] & 0xFF) << 8) + (field1456[field1457 - 1] & 0xFF);
	}

	@ObfuscatedName("ZOMNSJJM.f()I")
	public int method550() {
		field1457 += 2;
		int var1 = ((field1456[field1457 - 2] & 0xFF) << 8) + (field1456[field1457 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("ZOMNSJJM.g()I")
	public int method551() {
		field1457 += 3;
		return (field1456[field1457 - 1] & 0xFF) + ((field1456[field1457 - 3] & 0xFF) << 16) + ((field1456[field1457 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ZOMNSJJM.h()I")
	public int method552() {
		field1457 += 4;
		return (field1456[field1457 - 1] & 0xFF) + ((field1456[field1457 - 2] & 0xFF) << 8) + ((field1456[field1457 - 4] & 0xFF) << 24) + ((field1456[field1457 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("ZOMNSJJM.a(Z)J")
	public long method553() {
		long var1 = method552() & 0xFFFFFFFFL;
		long var3 = method552() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ZOMNSJJM.i()Ljava/lang/String;")
	public String method554() {
		int var1 = field1457;

		while (field1456[field1457++] != 10) {
		}

		return new String(field1456, var1, field1457 - var1 - 1);
	}

	@ObfuscatedName("ZOMNSJJM.a(B)[B")
	public byte[] method555() {
		int var1 = field1457;

		while (field1456[field1457++] != 10) {
		}

		byte[] var2 = new byte[field1457 - var1 - 1];
		for (int var3 = var1; var3 < field1457 - 1; var3++) {
			var2[var3 - var1] = field1456[var3];
		}

		return var2;
	}

	@ObfuscatedName("ZOMNSJJM.a(I[BII)V")
	public void method556(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1456[field1457++];
		}
	}

	@ObfuscatedName("ZOMNSJJM.b(B)V")
	public void method557() {
		field1458 = field1457 * 8;
	}

	@ObfuscatedName("ZOMNSJJM.b(IZ)I")
	public int method558(int arg0) {
		int var2 = field1458 >> 3;
		int var3 = 8 - (field1458 & 0x7);
		int var4 = 0;
		field1458 += arg0;

		while (arg0 > var3) {
			var4 += (field1456[var2++] & field1460[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1456[var2] & field1460[var3];
		} else {
			var4 += field1456[var2] >> var3 - arg0 & field1460[arg0];
		}

		return var4;
	}

	@ObfuscatedName("ZOMNSJJM.e(I)V")
	public void method559() {
		field1457 = (field1458 + 7) / 8;
	}

	@ObfuscatedName("ZOMNSJJM.j()I")
	public int method560() {
		int var1 = field1456[field1457] & 0xFF;
		if (var1 < 128) {
			return method547() - 64;
		}

		return method549() - 49152;
	}

	@ObfuscatedName("ZOMNSJJM.k()I")
	public int method561() {
		int var1 = field1456[field1457] & 0xFF;
		if (var1 < 128) {
			return method547();
		}

		return method549() - 32768;
	}

	@ObfuscatedName("ZOMNSJJM.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method562(BigInteger arg0, BigInteger arg1) {
		int var3 = field1457;
		field1457 = 0;
		byte[] var4 = new byte[var3];
		method556(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1457 = 0;
		method537(var7.length);
		method545(0, var7.length, var7);
	}

	@ObfuscatedName("ZOMNSJJM.b(ZI)V")
	public void method563(int arg0) {
		field1456[field1457++] = (byte) -arg0;
	}

	@ObfuscatedName("ZOMNSJJM.b(BI)V")
	public void method564(int arg0) {
		field1456[field1457++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("ZOMNSJJM.f(I)I")
	public int method565() {
		return field1456[field1457++] - 128 & 0xFF;
	}

	@ObfuscatedName("ZOMNSJJM.g(I)I")
	public int method566() {
		return -field1456[field1457++] & 0xFF;
	}

	@ObfuscatedName("ZOMNSJJM.h(I)I")
	public int method567() {
		return 128 - field1456[field1457++] & 0xFF;
	}

	@ObfuscatedName("ZOMNSJJM.b(Z)B")
	public byte method568() {
		return (byte) (field1456[field1457++] - 128);
	}

	@ObfuscatedName("ZOMNSJJM.c(Z)B")
	public byte method569() {
		return (byte) -field1456[field1457++];
	}

	@ObfuscatedName("ZOMNSJJM.c(II)V")
	public void method570(int arg0) {
		field1456[field1457++] = (byte) arg0;
		field1456[field1457++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ZOMNSJJM.c(IZ)V")
	public void method571(int arg0) {
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("ZOMNSJJM.d(II)V")
	public void method572(int arg0) {
		field1456[field1457++] = (byte) (arg0 + 128);
		field1456[field1457++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ZOMNSJJM.i(I)I")
	public int method573() {
		field1457 += 2;
		return ((field1456[field1457 - 1] & 0xFF) << 8) + (field1456[field1457 - 2] & 0xFF);
	}

	@ObfuscatedName("ZOMNSJJM.c(B)I")
	public int method574() {
		field1457 += 2;
		return ((field1456[field1457 - 2] & 0xFF) << 8) + (field1456[field1457 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("ZOMNSJJM.j(I)I")
	public int method575() {
		field1457 += 2;
		return ((field1456[field1457 - 1] & 0xFF) << 8) + (field1456[field1457 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("ZOMNSJJM.d(Z)I")
	public int method576() {
		field1457 += 2;
		int var1 = ((field1456[field1457 - 2] & 0xFF) << 8) + (field1456[field1457 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("ZOMNSJJM.k(I)I")
	public int method577() {
		field1457 += 2;
		int var1 = ((field1456[field1457 - 1] & 0xFF) << 8) + (field1456[field1457 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("ZOMNSJJM.e(Z)I")
	public int method578() {
		field1457 += 3;
		return (field1456[field1457 - 2] & 0xFF) + ((field1456[field1457 - 3] & 0xFF) << 16) + ((field1456[field1457 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("ZOMNSJJM.e(II)V")
	public void method579(int arg0) {
		field1456[field1457++] = (byte) (arg0 >> 8);
		field1456[field1457++] = (byte) arg0;
		field1456[field1457++] = (byte) (arg0 >> 24);
		field1456[field1457++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("ZOMNSJJM.l(I)I")
	public int method580() {
		field1457 += 4;
		return (field1456[field1457 - 4] & 0xFF) + ((field1456[field1457 - 3] & 0xFF) << 8) + ((field1456[field1457 - 1] & 0xFF) << 24) + ((field1456[field1457 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("ZOMNSJJM.m(I)I")
	public int method581() {
		field1457 += 4;
		return (field1456[field1457 - 3] & 0xFF) + ((field1456[field1457 - 4] & 0xFF) << 8) + ((field1456[field1457 - 2] & 0xFF) << 24) + ((field1456[field1457 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("ZOMNSJJM.f(Z)I")
	public int method582() {
		field1457 += 4;
		return (field1456[field1457 - 2] & 0xFF) + ((field1456[field1457 - 1] & 0xFF) << 8) + ((field1456[field1457 - 3] & 0xFF) << 24) + ((field1456[field1457 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("ZOMNSJJM.a([BIII)V")
	public void method583(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field1456[field1457++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("ZOMNSJJM.b(I[BII)V")
	public void method584(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field1456[field1457++] - 128);
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

			field1459[var0] = var1;
		}
	}
}
