package deob;

import java.math.BigInteger;

@ObfuscatedName("TKPFKOXP")
public final class TKPFKOXP extends KGLULAMW {

	@ObfuscatedName("TKPFKOXP.w")
	public byte[] field1381;

	@ObfuscatedName("TKPFKOXP.x")
	public int field1382;

	@ObfuscatedName("TKPFKOXP.z")
	public static int[] field1384 = new int[256];

	@ObfuscatedName("TKPFKOXP.A")
	public static final int[] field1385 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("TKPFKOXP.F")
	public static SXQMCHPP field1390 = new SXQMCHPP();

	@ObfuscatedName("TKPFKOXP.G")
	public static SXQMCHPP field1391 = new SXQMCHPP();

	@ObfuscatedName("TKPFKOXP.H")
	public static SXQMCHPP field1392 = new SXQMCHPP();

	@ObfuscatedName("TKPFKOXP.I")
	public static char[] field1393 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("TKPFKOXP.y")
	public int field1383;

	@ObfuscatedName("TKPFKOXP.C")
	public static int field1387;

	@ObfuscatedName("TKPFKOXP.D")
	public static int field1388;

	@ObfuscatedName("TKPFKOXP.E")
	public static int field1389;

	@ObfuscatedName("TKPFKOXP.B")
	public FKXPJREN field1386;

	@ObfuscatedName("TKPFKOXP.a(II)LTKPFKOXP;")
	public static TKPFKOXP method517(int arg0) {
		synchronized (field1391) {
			TKPFKOXP var2 = null;
			if (arg0 == 0 && field1387 > 0) {
				field1387--;
				var2 = (TKPFKOXP) field1390.method508();
			} else if (arg0 == 1 && field1388 > 0) {
				field1388--;
				var2 = (TKPFKOXP) field1391.method508();
			} else if (arg0 == 2 && field1389 > 0) {
				field1389--;
				var2 = (TKPFKOXP) field1392.method508();
			}

			if (var2 != null) {
				var2.field1382 = 0;
				return var2;
			}
		}

		TKPFKOXP var4 = new TKPFKOXP();
		var4.field1382 = 0;

		if (arg0 == 0) {
			var4.field1381 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1381 = new byte[5000];
		} else {
			var4.field1381 = new byte[30000];
		}

		return var4;
	}

	public TKPFKOXP() {
	}

	public TKPFKOXP(byte[] arg0) {
		field1381 = arg0;
		field1382 = 0;
	}

	@ObfuscatedName("TKPFKOXP.a(IZ)V")
	public void method518(int arg0) {
		field1381[field1382++] = (byte) (arg0 + field1386.method201());
	}

	@ObfuscatedName("TKPFKOXP.a(I)V")
	public void method519(int arg0) {
		field1381[field1382++] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.b(I)V")
	public void method520(int arg0) {
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.b(II)V")
	public void method521(int arg0) {
		field1381[field1382++] = (byte) arg0;
		field1381[field1382++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TKPFKOXP.c(I)V")
	public void method522(int arg0) {
		field1381[field1382++] = (byte) (arg0 >> 16);
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.d(I)V")
	public void method523(int arg0) {
		field1381[field1382++] = (byte) (arg0 >> 24);
		field1381[field1382++] = (byte) (arg0 >> 16);
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.a(IB)V")
	public void method524(int arg0) {
		field1381[field1382++] = (byte) arg0;
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) (arg0 >> 16);
		field1381[field1382++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("TKPFKOXP.a(JI)V")
	public void method525(long arg0) {
		field1381[field1382++] = (byte) (arg0 >> 56);
		field1381[field1382++] = (byte) (arg0 >> 48);
		field1381[field1382++] = (byte) (arg0 >> 40);
		field1381[field1382++] = (byte) (arg0 >> 32);
		field1381[field1382++] = (byte) (arg0 >> 24);
		field1381[field1382++] = (byte) (arg0 >> 16);
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.a(Ljava/lang/String;)V")
	public void method526(String arg0) {
		arg0.getBytes(0, arg0.length(), field1381, field1382);
		field1382 += arg0.length();
		field1381[field1382++] = 10;
	}

	@ObfuscatedName("TKPFKOXP.a(I[BII)V")
	public void method527(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field1381[field1382++] = arg1[var4];
		}
	}

	@ObfuscatedName("TKPFKOXP.c(II)V")
	public void method528(int arg0) {
		field1381[field1382 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("TKPFKOXP.c()I")
	public int method529() {
		return field1381[field1382++] & 0xFF;
	}

	@ObfuscatedName("TKPFKOXP.d()B")
	public byte method530() {
		return field1381[field1382++];
	}

	@ObfuscatedName("TKPFKOXP.e()I")
	public int method531() {
		field1382 += 2;
		return ((field1381[field1382 - 2] & 0xFF) << 8) + (field1381[field1382 - 1] & 0xFF);
	}

	@ObfuscatedName("TKPFKOXP.f()I")
	public int method532() {
		field1382 += 2;
		int var1 = ((field1381[field1382 - 2] & 0xFF) << 8) + (field1381[field1382 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TKPFKOXP.g()I")
	public int method533() {
		field1382 += 3;
		return (field1381[field1382 - 1] & 0xFF) + ((field1381[field1382 - 3] & 0xFF) << 16) + ((field1381[field1382 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("TKPFKOXP.h()I")
	public int method534() {
		field1382 += 4;
		return (field1381[field1382 - 1] & 0xFF) + ((field1381[field1382 - 2] & 0xFF) << 8) + ((field1381[field1382 - 4] & 0xFF) << 24) + ((field1381[field1382 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("TKPFKOXP.a(B)J")
	public long method535() {
		long var1 = method534() & 0xFFFFFFFFL;
		long var3 = method534() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("TKPFKOXP.i()Ljava/lang/String;")
	public String method536() {
		int var1 = field1382;

		while (field1381[field1382++] != 10) {
		}

		return new String(field1381, var1, field1382 - var1 - 1);
	}

	@ObfuscatedName("TKPFKOXP.e(I)[B")
	public byte[] method537() {
		int var1 = field1382;

		while (field1381[field1382++] != 10) {
		}

		byte[] var2 = new byte[field1382 - var1 - 1];
		for (int var3 = var1; var3 < field1382 - 1; var3++) {
			var2[var3 - var1] = field1381[var3];
		}

		return var2;
	}

	@ObfuscatedName("TKPFKOXP.a([BIII)V")
	public void method538(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field1381[field1382++];
		}
	}

	@ObfuscatedName("TKPFKOXP.b(B)V")
	public void method539() {
		field1383 = field1382 * 8;
	}

	@ObfuscatedName("TKPFKOXP.b(IZ)I")
	public int method540(int arg0) {
		int var2 = field1383 >> 3;
		int var3 = 8 - (field1383 & 0x7);
		int var4 = 0;
		field1383 += arg0;

		while (arg0 > var3) {
			var4 += (field1381[var2++] & field1385[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1381[var2] & field1385[var3];
		} else {
			var4 += field1381[var2] >> var3 - arg0 & field1385[arg0];
		}

		return var4;
	}

	@ObfuscatedName("TKPFKOXP.f(I)V")
	public void method541() {
		field1382 = (field1383 + 7) / 8;
	}

	@ObfuscatedName("TKPFKOXP.j()I")
	public int method542() {
		int var1 = field1381[field1382] & 0xFF;
		if (var1 < 128) {
			return method529() - 64;
		}

		return method531() - 49152;
	}

	@ObfuscatedName("TKPFKOXP.k()I")
	public int method543() {
		int var1 = field1381[field1382] & 0xFF;
		if (var1 < 128) {
			return method529();
		}

		return method531() - 32768;
	}

	@ObfuscatedName("TKPFKOXP.a(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method544(BigInteger arg0, BigInteger arg1) {
		int var3 = field1382;
		field1382 = 0;
		byte[] var4 = new byte[var3];
		method538(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1382 = 0;
		method519(var7.length);
		method527(0, var7, var7.length);
	}

	@ObfuscatedName("TKPFKOXP.a(BI)V")
	public void method545(int arg0) {
		field1381[field1382++] = (byte) -arg0;
	}

	@ObfuscatedName("TKPFKOXP.d(II)V")
	public void method546(int arg0) {
		field1381[field1382++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("TKPFKOXP.c(B)I")
	public int method547() {
		return field1381[field1382++] - 128 & 0xFF;
	}

	@ObfuscatedName("TKPFKOXP.g(I)I")
	public int method548() {
		return -field1381[field1382++] & 0xFF;
	}

	@ObfuscatedName("TKPFKOXP.h(I)I")
	public int method549() {
		return 128 - field1381[field1382++] & 0xFF;
	}

	@ObfuscatedName("TKPFKOXP.d(B)B")
	public byte method550() {
		return (byte) (field1381[field1382++] - 128);
	}

	@ObfuscatedName("TKPFKOXP.e(B)B")
	public byte method551() {
		return (byte) -field1381[field1382++];
	}

	@ObfuscatedName("TKPFKOXP.f(B)B")
	public byte method552() {
		return (byte) (128 - field1381[field1382++]);
	}

	@ObfuscatedName("TKPFKOXP.e(II)V")
	public void method553(int arg0) {
		field1381[field1382++] = (byte) arg0;
		field1381[field1382++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TKPFKOXP.b(BI)V")
	public void method554(int arg0) {
		field1381[field1382++] = (byte) (arg0 >> 8);
		field1381[field1382++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("TKPFKOXP.f(II)V")
	public void method555(int arg0) {
		field1381[field1382++] = (byte) (arg0 + 128);
		field1381[field1382++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TKPFKOXP.a(Z)I")
	public int method556() {
		field1382 += 2;
		return ((field1381[field1382 - 1] & 0xFF) << 8) + (field1381[field1382 - 2] & 0xFF);
	}

	@ObfuscatedName("TKPFKOXP.b(Z)I")
	public int method557() {
		field1382 += 2;
		return ((field1381[field1382 - 2] & 0xFF) << 8) + (field1381[field1382 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("TKPFKOXP.g(B)I")
	public int method558() {
		field1382 += 2;
		return ((field1381[field1382 - 1] & 0xFF) << 8) + (field1381[field1382 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("TKPFKOXP.c(Z)I")
	public int method559() {
		field1382 += 2;
		int var1 = ((field1381[field1382 - 1] & 0xFF) << 8) + (field1381[field1382 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TKPFKOXP.d(Z)I")
	public int method560() {
		field1382 += 2;
		int var1 = ((field1381[field1382 - 2] & 0xFF) << 8) + (field1381[field1382 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TKPFKOXP.i(I)I")
	public int method561() {
		field1382 += 2;
		int var1 = ((field1381[field1382 - 1] & 0xFF) << 8) + (field1381[field1382 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("TKPFKOXP.e(Z)I")
	public int method562() {
		field1382 += 3;
		return (field1381[field1382 - 1] & 0xFF) + ((field1381[field1382 - 2] & 0xFF) << 16) + ((field1381[field1382 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("TKPFKOXP.g(II)V")
	public void method563(int arg0) {
		field1381[field1382++] = (byte) (arg0 >> 16);
		field1381[field1382++] = (byte) (arg0 >> 24);
		field1381[field1382++] = (byte) arg0;
		field1381[field1382++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("TKPFKOXP.j(I)I")
	public int method564() {
		field1382 += 4;
		return (field1381[field1382 - 4] & 0xFF) + ((field1381[field1382 - 3] & 0xFF) << 8) + ((field1381[field1382 - 1] & 0xFF) << 24) + ((field1381[field1382 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("TKPFKOXP.f(Z)I")
	public int method565() {
		field1382 += 4;
		return (field1381[field1382 - 3] & 0xFF) + ((field1381[field1382 - 4] & 0xFF) << 8) + ((field1381[field1382 - 2] & 0xFF) << 24) + ((field1381[field1382 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("TKPFKOXP.h(B)I")
	public int method566() {
		field1382 += 4;
		return (field1381[field1382 - 2] & 0xFF) + ((field1381[field1382 - 1] & 0xFF) << 8) + ((field1381[field1382 - 3] & 0xFF) << 24) + ((field1381[field1382 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("TKPFKOXP.a(II[BI)V")
	public void method567(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = field1381[field1382++];
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

			field1384[var0] = var1;
		}
	}
}
