package deob;

import java.math.BigInteger;

@ObfuscatedName("WNCFPLWV")
public final class WNCFPLWV extends MCYIFIZT {

	@ObfuscatedName("WNCFPLWV.x")
	public byte[] field1374;

	@ObfuscatedName("WNCFPLWV.y")
	public int field1375;

	@ObfuscatedName("WNCFPLWV.A")
	public static int[] field1377 = new int[256];

	@ObfuscatedName("WNCFPLWV.B")
	public static final int[] field1378 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("WNCFPLWV.G")
	public static WAPMJSJO field1383 = new WAPMJSJO();

	@ObfuscatedName("WNCFPLWV.H")
	public static WAPMJSJO field1384 = new WAPMJSJO();

	@ObfuscatedName("WNCFPLWV.I")
	public static WAPMJSJO field1385 = new WAPMJSJO();

	@ObfuscatedName("WNCFPLWV.J")
	public static char[] field1386 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("WNCFPLWV.z")
	public int field1376;

	@ObfuscatedName("WNCFPLWV.D")
	public static int field1380;

	@ObfuscatedName("WNCFPLWV.E")
	public static int field1381;

	@ObfuscatedName("WNCFPLWV.F")
	public static int field1382;

	@ObfuscatedName("WNCFPLWV.C")
	public KDQJDBED field1379;

	@ObfuscatedName("WNCFPLWV.a(II)LWNCFPLWV;")
	public static WNCFPLWV method490(int arg0) {
		synchronized (field1384) {
			WNCFPLWV var2 = null;
			if (arg0 == 0 && field1380 > 0) {
				field1380--;
				var2 = (WNCFPLWV) field1383.method484();
			} else if (arg0 == 1 && field1381 > 0) {
				field1381--;
				var2 = (WNCFPLWV) field1384.method484();
			} else if (arg0 == 2 && field1382 > 0) {
				field1382--;
				var2 = (WNCFPLWV) field1385.method484();
			}

			if (var2 != null) {
				var2.field1375 = 0;
				return var2;
			}
		}

		WNCFPLWV var4 = new WNCFPLWV();
		var4.field1375 = 0;

		if (arg0 == 0) {
			var4.field1374 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1374 = new byte[5000];
		} else {
			var4.field1374 = new byte[30000];
		}

		return var4;
	}

	public WNCFPLWV() {
	}

	public WNCFPLWV(byte[] arg0) {
		field1374 = arg0;
		field1375 = 0;
	}

	@ObfuscatedName("WNCFPLWV.a(IB)V")
	public void method491(int arg0) {
		field1374[field1375++] = (byte) (arg0 + field1379.method317());
	}

	@ObfuscatedName("WNCFPLWV.a(I)V")
	public void method492(int arg0) {
		field1374[field1375++] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.b(I)V")
	public void method493(int arg0) {
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.b(II)V")
	public void method494(int arg0) {
		field1374[field1375++] = (byte) arg0;
		field1374[field1375++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WNCFPLWV.c(I)V")
	public void method495(int arg0) {
		field1374[field1375++] = (byte) (arg0 >> 16);
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.d(I)V")
	public void method496(int arg0) {
		field1374[field1375++] = (byte) (arg0 >> 24);
		field1374[field1375++] = (byte) (arg0 >> 16);
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.c(II)V")
	public void method497(int arg0) {
		field1374[field1375++] = (byte) arg0;
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) (arg0 >> 16);
		field1374[field1375++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("WNCFPLWV.a(IJ)V")
	public void method498(long arg0) {
		field1374[field1375++] = (byte) (arg0 >> 56);
		field1374[field1375++] = (byte) (arg0 >> 48);
		field1374[field1375++] = (byte) (arg0 >> 40);
		field1374[field1375++] = (byte) (arg0 >> 32);
		field1374[field1375++] = (byte) (arg0 >> 24);
		field1374[field1375++] = (byte) (arg0 >> 16);
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.a(Ljava/lang/String;)V")
	public void method499(String arg0) {
		arg0.getBytes(0, arg0.length(), field1374, field1375);
		field1375 += arg0.length();
		field1374[field1375++] = 10;
	}

	@ObfuscatedName("WNCFPLWV.a(BI[BI)V")
	public void method500(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field1374[field1375++] = arg1[var4];
		}
	}

	@ObfuscatedName("WNCFPLWV.d(II)V")
	public void method501(int arg0) {
		field1374[field1375 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("WNCFPLWV.c()I")
	public int method502() {
		return field1374[field1375++] & 0xFF;
	}

	@ObfuscatedName("WNCFPLWV.d()B")
	public byte method503() {
		return field1374[field1375++];
	}

	@ObfuscatedName("WNCFPLWV.e()I")
	public int method504() {
		field1375 += 2;
		return ((field1374[field1375 - 2] & 0xFF) << 8) + (field1374[field1375 - 1] & 0xFF);
	}

	@ObfuscatedName("WNCFPLWV.f()I")
	public int method505() {
		field1375 += 2;
		int var1 = ((field1374[field1375 - 2] & 0xFF) << 8) + (field1374[field1375 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WNCFPLWV.g()I")
	public int method506() {
		field1375 += 3;
		return (field1374[field1375 - 1] & 0xFF) + ((field1374[field1375 - 3] & 0xFF) << 16) + ((field1374[field1375 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("WNCFPLWV.h()I")
	public int method507() {
		field1375 += 4;
		return (field1374[field1375 - 1] & 0xFF) + ((field1374[field1375 - 2] & 0xFF) << 8) + ((field1374[field1375 - 4] & 0xFF) << 24) + ((field1374[field1375 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("WNCFPLWV.a(B)J")
	public long method508() {
		long var1 = method507() & 0xFFFFFFFFL;
		long var3 = method507() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("WNCFPLWV.i()Ljava/lang/String;")
	public String method509() {
		int var1 = field1375;

		while (field1374[field1375++] != 10) {
		}

		return new String(field1374, var1, field1375 - var1 - 1);
	}

	@ObfuscatedName("WNCFPLWV.e(I)[B")
	public byte[] method510() {
		int var1 = field1375;

		while (field1374[field1375++] != 10) {
		}

		byte[] var2 = new byte[field1375 - var1 - 1];
		for (int var3 = var1; var3 < field1375 - 1; var3++) {
			var2[var3 - var1] = field1374[var3];
		}

		return var2;
	}

	@ObfuscatedName("WNCFPLWV.a(IIB[B)V")
	public void method511(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1374[field1375++];
		}
	}

	@ObfuscatedName("WNCFPLWV.f(I)V")
	public void method512() {
		field1376 = field1375 * 8;
	}

	@ObfuscatedName("WNCFPLWV.e(II)I")
	public int method513(int arg0) {
		int var2 = field1376 >> 3;
		int var3 = 8 - (field1376 & 0x7);
		int var4 = 0;
		field1376 += arg0;

		while (arg0 > var3) {
			var4 += (field1374[var2++] & field1378[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1374[var2] & field1378[var3];
		} else {
			var4 += field1374[var2] >> var3 - arg0 & field1378[arg0];
		}

		return var4;
	}

	@ObfuscatedName("WNCFPLWV.g(I)V")
	public void method514() {
		field1375 = (field1376 + 7) / 8;
	}

	@ObfuscatedName("WNCFPLWV.j()I")
	public int method515() {
		int var1 = field1374[field1375] & 0xFF;
		if (var1 < 128) {
			return method502() - 64;
		}

		return method504() - 49152;
	}

	@ObfuscatedName("WNCFPLWV.k()I")
	public int method516() {
		int var1 = field1374[field1375] & 0xFF;
		if (var1 < 128) {
			return method502();
		}

		return method504() - 32768;
	}

	@ObfuscatedName("WNCFPLWV.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method517(BigInteger arg0, BigInteger arg1) {
		int var3 = field1375;
		field1375 = 0;
		byte[] var4 = new byte[var3];
		method511(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1375 = 0;
		method492(var7.length);
		method500(0, var7, var7.length);
	}

	@ObfuscatedName("WNCFPLWV.a(ZI)V")
	public void method518(int arg0) {
		field1374[field1375++] = (byte) -arg0;
	}

	@ObfuscatedName("WNCFPLWV.f(II)V")
	public void method519(int arg0) {
		field1374[field1375++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("WNCFPLWV.h(I)I")
	public int method520() {
		return field1374[field1375++] - 128 & 0xFF;
	}

	@ObfuscatedName("WNCFPLWV.a(Z)I")
	public int method521() {
		return -field1374[field1375++] & 0xFF;
	}

	@ObfuscatedName("WNCFPLWV.i(I)I")
	public int method522() {
		return 128 - field1374[field1375++] & 0xFF;
	}

	@ObfuscatedName("WNCFPLWV.b(B)B")
	public byte method523() {
		return (byte) (field1374[field1375++] - 128);
	}

	@ObfuscatedName("WNCFPLWV.b(Z)B")
	public byte method524() {
		return (byte) -field1374[field1375++];
	}

	@ObfuscatedName("WNCFPLWV.j(I)B")
	public byte method525() {
		return (byte) (128 - field1374[field1375++]);
	}

	@ObfuscatedName("WNCFPLWV.g(II)V")
	public void method526(int arg0) {
		field1374[field1375++] = (byte) arg0;
		field1374[field1375++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WNCFPLWV.h(II)V")
	public void method527(int arg0) {
		field1374[field1375++] = (byte) (arg0 >> 8);
		field1374[field1375++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("WNCFPLWV.a(BI)V")
	public void method528(int arg0) {
		field1374[field1375++] = (byte) (arg0 + 128);
		field1374[field1375++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WNCFPLWV.c(B)I")
	public int method529() {
		field1375 += 2;
		return ((field1374[field1375 - 1] & 0xFF) << 8) + (field1374[field1375 - 2] & 0xFF);
	}

	@ObfuscatedName("WNCFPLWV.k(I)I")
	public int method530() {
		field1375 += 2;
		return ((field1374[field1375 - 2] & 0xFF) << 8) + (field1374[field1375 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("WNCFPLWV.l(I)I")
	public int method531() {
		field1375 += 2;
		return ((field1374[field1375 - 1] & 0xFF) << 8) + (field1374[field1375 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("WNCFPLWV.d(B)I")
	public int method532() {
		field1375 += 2;
		int var1 = ((field1374[field1375 - 2] & 0xFF) << 8) + (field1374[field1375 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WNCFPLWV.c(Z)I")
	public int method533() {
		field1375 += 2;
		int var1 = ((field1374[field1375 - 1] & 0xFF) << 8) + (field1374[field1375 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WNCFPLWV.d(Z)I")
	public int method534() {
		field1375 += 3;
		return (field1374[field1375 - 1] & 0xFF) + ((field1374[field1375 - 2] & 0xFF) << 16) + ((field1374[field1375 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("WNCFPLWV.b(IB)V")
	public void method535(int arg0) {
		field1374[field1375++] = (byte) (arg0 >> 16);
		field1374[field1375++] = (byte) (arg0 >> 24);
		field1374[field1375++] = (byte) arg0;
		field1374[field1375++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WNCFPLWV.m(I)I")
	public int method536() {
		field1375 += 4;
		return (field1374[field1375 - 4] & 0xFF) + ((field1374[field1375 - 3] & 0xFF) << 8) + ((field1374[field1375 - 1] & 0xFF) << 24) + ((field1374[field1375 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("WNCFPLWV.n(I)I")
	public int method537() {
		field1375 += 4;
		return (field1374[field1375 - 2] & 0xFF) + ((field1374[field1375 - 1] & 0xFF) << 8) + ((field1374[field1375 - 3] & 0xFF) << 24) + ((field1374[field1375 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("WNCFPLWV.a(IZI[B)V")
	public void method538(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = field1374[field1375++];
		}
	}

	@ObfuscatedName("WNCFPLWV.a(III[B)V")
	public void method539(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = (byte) (field1374[field1375++] - 128);
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

			field1377[var0] = var1;
		}
	}
}
