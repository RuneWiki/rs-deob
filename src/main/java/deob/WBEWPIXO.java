package deob;

import java.math.BigInteger;

@ObfuscatedName("WBEWPIXO")
public final class WBEWPIXO extends OZZFMONJ {

	@ObfuscatedName("WBEWPIXO.v")
	public byte[] field1400;

	@ObfuscatedName("WBEWPIXO.w")
	public int field1401;

	@ObfuscatedName("WBEWPIXO.y")
	public static int[] field1403 = new int[256];

	@ObfuscatedName("WBEWPIXO.z")
	public static final int[] field1404 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("WBEWPIXO.E")
	public static NYZQPNXB field1409 = new NYZQPNXB();

	@ObfuscatedName("WBEWPIXO.F")
	public static NYZQPNXB field1410 = new NYZQPNXB();

	@ObfuscatedName("WBEWPIXO.G")
	public static NYZQPNXB field1411 = new NYZQPNXB();

	@ObfuscatedName("WBEWPIXO.H")
	public static char[] field1412 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("WBEWPIXO.x")
	public int field1402;

	@ObfuscatedName("WBEWPIXO.B")
	public static int field1406;

	@ObfuscatedName("WBEWPIXO.C")
	public static int field1407;

	@ObfuscatedName("WBEWPIXO.D")
	public static int field1408;

	@ObfuscatedName("WBEWPIXO.A")
	public XAGUDWSZ field1405;

	@ObfuscatedName("WBEWPIXO.a(II)LWBEWPIXO;")
	public static WBEWPIXO method503(int arg0) {
		synchronized (field1410) {
			WBEWPIXO var2 = null;
			if (arg0 == 0 && field1406 > 0) {
				field1406--;
				var2 = (WBEWPIXO) field1409.method339();
			} else if (arg0 == 1 && field1407 > 0) {
				field1407--;
				var2 = (WBEWPIXO) field1410.method339();
			} else if (arg0 == 2 && field1408 > 0) {
				field1408--;
				var2 = (WBEWPIXO) field1411.method339();
			}

			if (var2 != null) {
				var2.field1401 = 0;
				return var2;
			}
		}

		WBEWPIXO var4 = new WBEWPIXO();
		var4.field1401 = 0;

		if (arg0 == 0) {
			var4.field1400 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1400 = new byte[5000];
		} else {
			var4.field1400 = new byte[30000];
		}

		return var4;
	}

	public WBEWPIXO() {
	}

	public WBEWPIXO(byte[] arg0) {
		field1400 = arg0;
		field1401 = 0;
	}

	@ObfuscatedName("WBEWPIXO.b(II)V")
	public void method504(int arg0) {
		field1400[field1401++] = (byte) (arg0 + field1405.method558());
	}

	@ObfuscatedName("WBEWPIXO.a(I)V")
	public void method505(int arg0) {
		field1400[field1401++] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.b(I)V")
	public void method506(int arg0) {
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.c(II)V")
	public void method507(int arg0) {
		field1400[field1401++] = (byte) arg0;
		field1400[field1401++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WBEWPIXO.c(I)V")
	public void method508(int arg0) {
		field1400[field1401++] = (byte) (arg0 >> 16);
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.d(I)V")
	public void method509(int arg0) {
		field1400[field1401++] = (byte) (arg0 >> 24);
		field1400[field1401++] = (byte) (arg0 >> 16);
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.d(II)V")
	public void method510(int arg0) {
		field1400[field1401++] = (byte) arg0;
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) (arg0 >> 16);
		field1400[field1401++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("WBEWPIXO.a(JI)V")
	public void method511(long arg0) {
		field1400[field1401++] = (byte) (arg0 >> 56);
		field1400[field1401++] = (byte) (arg0 >> 48);
		field1400[field1401++] = (byte) (arg0 >> 40);
		field1400[field1401++] = (byte) (arg0 >> 32);
		field1400[field1401++] = (byte) (arg0 >> 24);
		field1400[field1401++] = (byte) (arg0 >> 16);
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.a(Ljava/lang/String;)V")
	public void method512(String arg0) {
		arg0.getBytes(0, arg0.length(), field1400, field1401);
		field1401 += arg0.length();
		field1400[field1401++] = 10;
	}

	@ObfuscatedName("WBEWPIXO.a(III[B)V")
	public void method513(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1400[field1401++] = arg2[var4];
		}
	}

	@ObfuscatedName("WBEWPIXO.e(II)V")
	public void method514(int arg0) {
		field1400[field1401 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("WBEWPIXO.c()I")
	public int method515() {
		return field1400[field1401++] & 0xFF;
	}

	@ObfuscatedName("WBEWPIXO.d()B")
	public byte method516() {
		return field1400[field1401++];
	}

	@ObfuscatedName("WBEWPIXO.e()I")
	public int method517() {
		field1401 += 2;
		return ((field1400[field1401 - 2] & 0xFF) << 8) + (field1400[field1401 - 1] & 0xFF);
	}

	@ObfuscatedName("WBEWPIXO.f()I")
	public int method518() {
		field1401 += 2;
		int var1 = ((field1400[field1401 - 2] & 0xFF) << 8) + (field1400[field1401 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WBEWPIXO.g()I")
	public int method519() {
		field1401 += 3;
		return (field1400[field1401 - 1] & 0xFF) + ((field1400[field1401 - 3] & 0xFF) << 16) + ((field1400[field1401 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("WBEWPIXO.h()I")
	public int method520() {
		field1401 += 4;
		return (field1400[field1401 - 1] & 0xFF) + ((field1400[field1401 - 2] & 0xFF) << 8) + ((field1400[field1401 - 4] & 0xFF) << 24) + ((field1400[field1401 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("WBEWPIXO.e(I)J")
	public long method521() {
		long var1 = method520() & 0xFFFFFFFFL;
		long var3 = method520() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("WBEWPIXO.i()Ljava/lang/String;")
	public String method522() {
		int var1 = field1401;

		while (field1400[field1401++] != 10) {
		}

		return new String(field1400, var1, field1401 - var1 - 1);
	}

	@ObfuscatedName("WBEWPIXO.f(I)[B")
	public byte[] method523() {
		int var1 = field1401;

		while (field1400[field1401++] != 10) {
		}

		byte[] var2 = new byte[field1401 - var1 - 1];
		for (int var3 = var1; var3 < field1401 - 1; var3++) {
			var2[var3 - var1] = field1400[var3];
		}

		return var2;
	}

	@ObfuscatedName("WBEWPIXO.b(III[B)V")
	public void method524(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field1400[field1401++];
		}
	}

	@ObfuscatedName("WBEWPIXO.g(I)V")
	public void method525() {
		field1402 = field1401 * 8;
	}

	@ObfuscatedName("WBEWPIXO.a(ZI)I")
	public int method526(int arg0) {
		int var2 = field1402 >> 3;
		int var3 = 8 - (field1402 & 0x7);
		int var4 = 0;
		field1402 += arg0;

		while (arg0 > var3) {
			var4 += (field1400[var2++] & field1404[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1400[var2] & field1404[var3];
		} else {
			var4 += field1400[var2] >> var3 - arg0 & field1404[arg0];
		}

		return var4;
	}

	@ObfuscatedName("WBEWPIXO.a(B)V")
	public void method527() {
		field1401 = (field1402 + 7) / 8;
	}

	@ObfuscatedName("WBEWPIXO.j()I")
	public int method528() {
		int var1 = field1400[field1401] & 0xFF;
		if (var1 < 128) {
			return method515() - 64;
		}

		return method517() - 49152;
	}

	@ObfuscatedName("WBEWPIXO.k()I")
	public int method529() {
		int var1 = field1400[field1401] & 0xFF;
		if (var1 < 128) {
			return method515();
		}

		return method517() - 32768;
	}

	@ObfuscatedName("WBEWPIXO.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method530(BigInteger arg0, BigInteger arg1) {
		int var3 = field1401;
		field1401 = 0;
		byte[] var4 = new byte[var3];
		method524(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1401 = 0;
		method505(var7.length);
		method513(0, var7.length, var7);
	}

	@ObfuscatedName("WBEWPIXO.f(II)V")
	public void method531(int arg0) {
		field1400[field1401++] = (byte) -arg0;
	}

	@ObfuscatedName("WBEWPIXO.a(Z)I")
	public int method532() {
		return field1400[field1401++] - 128 & 0xFF;
	}

	@ObfuscatedName("WBEWPIXO.h(I)I")
	public int method533() {
		return -field1400[field1401++] & 0xFF;
	}

	@ObfuscatedName("WBEWPIXO.b(Z)I")
	public int method534() {
		return 128 - field1400[field1401++] & 0xFF;
	}

	@ObfuscatedName("WBEWPIXO.i(I)B")
	public byte method535() {
		return (byte) (field1400[field1401++] - 128);
	}

	@ObfuscatedName("WBEWPIXO.b(B)B")
	public byte method536() {
		return (byte) -field1400[field1401++];
	}

	@ObfuscatedName("WBEWPIXO.c(Z)B")
	public byte method537() {
		return (byte) (128 - field1400[field1401++]);
	}

	@ObfuscatedName("WBEWPIXO.a(IB)V")
	public void method538(int arg0) {
		field1400[field1401++] = (byte) arg0;
		field1400[field1401++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WBEWPIXO.g(II)V")
	public void method539(int arg0) {
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("WBEWPIXO.a(BI)V")
	public void method540(int arg0) {
		field1400[field1401++] = (byte) (arg0 + 128);
		field1400[field1401++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("WBEWPIXO.j(I)I")
	public int method541() {
		field1401 += 2;
		return ((field1400[field1401 - 1] & 0xFF) << 8) + (field1400[field1401 - 2] & 0xFF);
	}

	@ObfuscatedName("WBEWPIXO.k(I)I")
	public int method542() {
		field1401 += 2;
		return ((field1400[field1401 - 2] & 0xFF) << 8) + (field1400[field1401 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("WBEWPIXO.d(Z)I")
	public int method543() {
		field1401 += 2;
		return ((field1400[field1401 - 1] & 0xFF) << 8) + (field1400[field1401 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("WBEWPIXO.l(I)I")
	public int method544() {
		field1401 += 2;
		int var1 = ((field1400[field1401 - 1] & 0xFF) << 8) + (field1400[field1401 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WBEWPIXO.e(Z)I")
	public int method545() {
		field1401 += 2;
		int var1 = ((field1400[field1401 - 2] & 0xFF) << 8) + (field1400[field1401 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WBEWPIXO.f(Z)I")
	public int method546() {
		field1401 += 2;
		int var1 = ((field1400[field1401 - 1] & 0xFF) << 8) + (field1400[field1401 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("WBEWPIXO.b(BI)V")
	public void method547(int arg0) {
		field1400[field1401++] = (byte) (arg0 >> 8);
		field1400[field1401++] = (byte) arg0;
		field1400[field1401++] = (byte) (arg0 >> 24);
		field1400[field1401++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("WBEWPIXO.c(B)I")
	public int method548() {
		field1401 += 4;
		return (field1400[field1401 - 4] & 0xFF) + ((field1400[field1401 - 3] & 0xFF) << 8) + ((field1400[field1401 - 1] & 0xFF) << 24) + ((field1400[field1401 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("WBEWPIXO.m(I)I")
	public int method549() {
		field1401 += 4;
		return (field1400[field1401 - 3] & 0xFF) + ((field1400[field1401 - 4] & 0xFF) << 8) + ((field1400[field1401 - 2] & 0xFF) << 24) + ((field1400[field1401 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("WBEWPIXO.n(I)I")
	public int method550() {
		field1401 += 4;
		return (field1400[field1401 - 2] & 0xFF) + ((field1400[field1401 - 1] & 0xFF) << 8) + ((field1400[field1401 - 3] & 0xFF) << 24) + ((field1400[field1401 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("WBEWPIXO.a([BIII)V")
	public void method551(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			field1400[field1401++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("WBEWPIXO.a(II[BI)V")
	public void method552(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = field1400[field1401++];
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

			field1403[var0] = var1;
		}
	}
}
