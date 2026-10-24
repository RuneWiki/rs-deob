package deob;

import java.math.BigInteger;

@ObfuscatedName("XOUQUKZW")
public final class XOUQUKZW extends EEYSIGWL {

	@ObfuscatedName("XOUQUKZW.D")
	public byte[] field1366;

	@ObfuscatedName("XOUQUKZW.E")
	public int field1367;

	@ObfuscatedName("XOUQUKZW.G")
	public static int[] field1369 = new int[256];

	@ObfuscatedName("XOUQUKZW.H")
	public static final int[] field1370 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("XOUQUKZW.M")
	public static ILVDIPQT field1375 = new ILVDIPQT();

	@ObfuscatedName("XOUQUKZW.N")
	public static ILVDIPQT field1376 = new ILVDIPQT();

	@ObfuscatedName("XOUQUKZW.O")
	public static ILVDIPQT field1377 = new ILVDIPQT();

	@ObfuscatedName("XOUQUKZW.P")
	public static char[] field1378 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("XOUQUKZW.F")
	public int field1368;

	@ObfuscatedName("XOUQUKZW.J")
	public static int field1372;

	@ObfuscatedName("XOUQUKZW.K")
	public static int field1373;

	@ObfuscatedName("XOUQUKZW.L")
	public static int field1374;

	@ObfuscatedName("XOUQUKZW.I")
	public LAFREBFM field1371;

	@ObfuscatedName("XOUQUKZW.a(II)LXOUQUKZW;")
	public static XOUQUKZW method509(int arg0) {
		synchronized (field1376) {
			XOUQUKZW var2 = null;
			if (arg0 == 0 && field1372 > 0) {
				field1372--;
				var2 = (XOUQUKZW) field1375.method331();
			} else if (arg0 == 1 && field1373 > 0) {
				field1373--;
				var2 = (XOUQUKZW) field1376.method331();
			} else if (arg0 == 2 && field1374 > 0) {
				field1374--;
				var2 = (XOUQUKZW) field1377.method331();
			}

			if (var2 != null) {
				var2.field1367 = 0;
				return var2;
			}
		}

		XOUQUKZW var4 = new XOUQUKZW();
		var4.field1367 = 0;

		if (arg0 == 0) {
			var4.field1366 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1366 = new byte[5000];
		} else {
			var4.field1366 = new byte[30000];
		}

		return var4;
	}

	public XOUQUKZW() {
	}

	public XOUQUKZW(byte[] arg0) {
		field1366 = arg0;
		field1367 = 0;
	}

	@ObfuscatedName("XOUQUKZW.b(II)V")
	public void method510(int arg0) {
		field1366[field1367++] = (byte) (arg0 + field1371.method405());
	}

	@ObfuscatedName("XOUQUKZW.a(I)V")
	public void method511(int arg0) {
		field1366[field1367++] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.b(I)V")
	public void method512(int arg0) {
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.a(IZ)V")
	public void method513(int arg0) {
		field1366[field1367++] = (byte) arg0;
		field1366[field1367++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XOUQUKZW.c(I)V")
	public void method514(int arg0) {
		field1366[field1367++] = (byte) (arg0 >> 16);
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.d(I)V")
	public void method515(int arg0) {
		field1366[field1367++] = (byte) (arg0 >> 24);
		field1366[field1367++] = (byte) (arg0 >> 16);
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.a(IB)V")
	public void method516(int arg0) {
		field1366[field1367++] = (byte) arg0;
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) (arg0 >> 16);
		field1366[field1367++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("XOUQUKZW.a(JI)V")
	public void method517(long arg0) {
		field1366[field1367++] = (byte) (arg0 >> 56);
		field1366[field1367++] = (byte) (arg0 >> 48);
		field1366[field1367++] = (byte) (arg0 >> 40);
		field1366[field1367++] = (byte) (arg0 >> 32);
		field1366[field1367++] = (byte) (arg0 >> 24);
		field1366[field1367++] = (byte) (arg0 >> 16);
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.a(Ljava/lang/String;)V")
	public void method518(String arg0) {
		arg0.getBytes(0, arg0.length(), field1366, field1367);
		field1367 += arg0.length();
		field1366[field1367++] = 10;
	}

	@ObfuscatedName("XOUQUKZW.a(I[BZI)V")
	public void method519(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field1366[field1367++] = arg1[var4];
		}
	}

	@ObfuscatedName("XOUQUKZW.c(II)V")
	public void method520(int arg0) {
		field1366[field1367 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("XOUQUKZW.c()I")
	public int method521() {
		return field1366[field1367++] & 0xFF;
	}

	@ObfuscatedName("XOUQUKZW.d()B")
	public byte method522() {
		return field1366[field1367++];
	}

	@ObfuscatedName("XOUQUKZW.e()I")
	public int method523() {
		field1367 += 2;
		return ((field1366[field1367 - 2] & 0xFF) << 8) + (field1366[field1367 - 1] & 0xFF);
	}

	@ObfuscatedName("XOUQUKZW.f()I")
	public int method524() {
		field1367 += 2;
		int var1 = ((field1366[field1367 - 2] & 0xFF) << 8) + (field1366[field1367 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XOUQUKZW.g()I")
	public int method525() {
		field1367 += 3;
		return (field1366[field1367 - 1] & 0xFF) + ((field1366[field1367 - 3] & 0xFF) << 16) + ((field1366[field1367 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("XOUQUKZW.h()I")
	public int method526() {
		field1367 += 4;
		return (field1366[field1367 - 1] & 0xFF) + ((field1366[field1367 - 2] & 0xFF) << 8) + ((field1366[field1367 - 4] & 0xFF) << 24) + ((field1366[field1367 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("XOUQUKZW.e(I)J")
	public long method527() {
		long var1 = method526() & 0xFFFFFFFFL;
		long var3 = method526() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("XOUQUKZW.i()Ljava/lang/String;")
	public String method528() {
		int var1 = field1367;

		while (field1366[field1367++] != 10) {
		}

		return new String(field1366, var1, field1367 - var1 - 1);
	}

	@ObfuscatedName("XOUQUKZW.a(B)[B")
	public byte[] method529() {
		int var1 = field1367;

		while (field1366[field1367++] != 10) {
		}

		byte[] var2 = new byte[field1367 - var1 - 1];
		for (int var3 = var1; var3 < field1367 - 1; var3++) {
			var2[var3 - var1] = field1366[var3];
		}

		return var2;
	}

	@ObfuscatedName("XOUQUKZW.a(II[BB)V")
	public void method530(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1366[field1367++];
		}
	}

	@ObfuscatedName("XOUQUKZW.f(I)V")
	public void method531() {
		field1368 = field1367 * 8;
	}

	@ObfuscatedName("XOUQUKZW.d(II)I")
	public int method532(int arg0) {
		int var2 = field1368 >> 3;
		int var3 = 8 - (field1368 & 0x7);
		int var4 = 0;
		field1368 += arg0;

		while (arg0 > var3) {
			var4 += (field1366[var2++] & field1370[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1366[var2] & field1370[var3];
		} else {
			var4 += field1366[var2] >> var3 - arg0 & field1370[arg0];
		}

		return var4;
	}

	@ObfuscatedName("XOUQUKZW.b(B)V")
	public void method533() {
		field1367 = (field1368 + 7) / 8;
	}

	@ObfuscatedName("XOUQUKZW.j()I")
	public int method534() {
		int var1 = field1366[field1367] & 0xFF;
		if (var1 < 128) {
			return method521() - 64;
		}

		return method523() - 49152;
	}

	@ObfuscatedName("XOUQUKZW.k()I")
	public int method535() {
		int var1 = field1366[field1367] & 0xFF;
		if (var1 < 128) {
			return method521();
		}

		return method523() - 32768;
	}

	@ObfuscatedName("XOUQUKZW.a(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method536(BigInteger arg0, BigInteger arg1) {
		int var3 = field1367;
		field1367 = 0;
		byte[] var4 = new byte[var3];
		method530(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1367 = 0;
		method511(var7.length);
		method519(var7.length, var7, 0);
	}

	@ObfuscatedName("XOUQUKZW.a(ZI)V")
	public void method537(int arg0) {
		field1366[field1367++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XOUQUKZW.e(II)V")
	public void method538(int arg0) {
		field1366[field1367++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("XOUQUKZW.g(I)I")
	public int method539() {
		return field1366[field1367++] - 128 & 0xFF;
	}

	@ObfuscatedName("XOUQUKZW.h(I)I")
	public int method540() {
		return -field1366[field1367++] & 0xFF;
	}

	@ObfuscatedName("XOUQUKZW.c(B)I")
	public int method541() {
		return 128 - field1366[field1367++] & 0xFF;
	}

	@ObfuscatedName("XOUQUKZW.i(I)B")
	public byte method542() {
		return (byte) (field1366[field1367++] - 128);
	}

	@ObfuscatedName("XOUQUKZW.d(B)B")
	public byte method543() {
		return (byte) -field1366[field1367++];
	}

	@ObfuscatedName("XOUQUKZW.a(Z)B")
	public byte method544() {
		return (byte) (128 - field1366[field1367++]);
	}

	@ObfuscatedName("XOUQUKZW.b(IZ)V")
	public void method545(int arg0) {
		field1366[field1367++] = (byte) arg0;
		field1366[field1367++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XOUQUKZW.f(II)V")
	public void method546(int arg0) {
		field1366[field1367++] = (byte) (arg0 >> 8);
		field1366[field1367++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("XOUQUKZW.c(IZ)V")
	public void method547(int arg0) {
		field1366[field1367++] = (byte) (arg0 + 128);
		field1366[field1367++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XOUQUKZW.b(Z)I")
	public int method548() {
		field1367 += 2;
		return ((field1366[field1367 - 1] & 0xFF) << 8) + (field1366[field1367 - 2] & 0xFF);
	}

	@ObfuscatedName("XOUQUKZW.j(I)I")
	public int method549() {
		field1367 += 2;
		return ((field1366[field1367 - 2] & 0xFF) << 8) + (field1366[field1367 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("XOUQUKZW.k(I)I")
	public int method550() {
		field1367 += 2;
		return ((field1366[field1367 - 1] & 0xFF) << 8) + (field1366[field1367 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("XOUQUKZW.e(B)I")
	public int method551() {
		field1367 += 2;
		int var1 = ((field1366[field1367 - 2] & 0xFF) << 8) + (field1366[field1367 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XOUQUKZW.f(B)I")
	public int method552() {
		field1367 += 2;
		int var1 = ((field1366[field1367 - 1] & 0xFF) << 8) + (field1366[field1367 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("XOUQUKZW.d(IZ)V")
	public void method553(int arg0) {
		field1366[field1367++] = (byte) (arg0 >> 16);
		field1366[field1367++] = (byte) (arg0 >> 24);
		field1366[field1367++] = (byte) arg0;
		field1366[field1367++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("XOUQUKZW.l(I)I")
	public int method554() {
		field1367 += 4;
		return (field1366[field1367 - 4] & 0xFF) + ((field1366[field1367 - 3] & 0xFF) << 8) + ((field1366[field1367 - 1] & 0xFF) << 24) + ((field1366[field1367 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("XOUQUKZW.c(Z)I")
	public int method555() {
		field1367 += 4;
		return (field1366[field1367 - 3] & 0xFF) + ((field1366[field1367 - 4] & 0xFF) << 8) + ((field1366[field1367 - 2] & 0xFF) << 24) + ((field1366[field1367 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("XOUQUKZW.m(I)I")
	public int method556() {
		field1367 += 4;
		return (field1366[field1367 - 2] & 0xFF) + ((field1366[field1367 - 1] & 0xFF) << 8) + ((field1366[field1367 - 3] & 0xFF) << 24) + ((field1366[field1367 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("XOUQUKZW.a(IIZ[B)V")
	public void method557(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1366[field1367++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("XOUQUKZW.a(II[BZ)V")
	public void method558(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = (byte) (field1366[field1367++] - 128);
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

			field1369[var0] = var1;
		}
	}
}
