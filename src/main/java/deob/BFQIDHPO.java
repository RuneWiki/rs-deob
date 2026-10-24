package deob;

import java.math.BigInteger;

@ObfuscatedName("BFQIDHPO")
public final class BFQIDHPO extends FFAASUKE {

	@ObfuscatedName("BFQIDHPO.F")
	public byte[] field9;

	@ObfuscatedName("BFQIDHPO.G")
	public int field10;

	@ObfuscatedName("BFQIDHPO.I")
	public static int[] field12 = new int[256];

	@ObfuscatedName("BFQIDHPO.J")
	public static final int[] field13 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("BFQIDHPO.O")
	public static ZXKMWHPZ field18 = new ZXKMWHPZ();

	@ObfuscatedName("BFQIDHPO.P")
	public static ZXKMWHPZ field19 = new ZXKMWHPZ();

	@ObfuscatedName("BFQIDHPO.Q")
	public static ZXKMWHPZ field20 = new ZXKMWHPZ();

	@ObfuscatedName("BFQIDHPO.R")
	public static char[] field21 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("BFQIDHPO.H")
	public int field11;

	@ObfuscatedName("BFQIDHPO.L")
	public static int field15;

	@ObfuscatedName("BFQIDHPO.M")
	public static int field16;

	@ObfuscatedName("BFQIDHPO.N")
	public static int field17;

	@ObfuscatedName("BFQIDHPO.K")
	public WMQKHABS field14;

	@ObfuscatedName("BFQIDHPO.a(II)LBFQIDHPO;")
	public static BFQIDHPO method42(int arg0) {
		synchronized (field19) {
			BFQIDHPO var2 = null;
			if (arg0 == 0 && field15 > 0) {
				field15--;
				var2 = (BFQIDHPO) field18.method597();
			} else if (arg0 == 1 && field16 > 0) {
				field16--;
				var2 = (BFQIDHPO) field19.method597();
			} else if (arg0 == 2 && field17 > 0) {
				field17--;
				var2 = (BFQIDHPO) field20.method597();
			}

			if (var2 != null) {
				var2.field10 = 0;
				return var2;
			}
		}

		BFQIDHPO var4 = new BFQIDHPO();
		var4.field10 = 0;

		if (arg0 == 0) {
			var4.field9 = new byte[100];
		} else if (arg0 == 1) {
			var4.field9 = new byte[5000];
		} else {
			var4.field9 = new byte[30000];
		}

		return var4;
	}

	public BFQIDHPO() {
	}

	public BFQIDHPO(byte[] arg0) {
		field9 = arg0;
		field10 = 0;
	}

	@ObfuscatedName("BFQIDHPO.b(II)V")
	public void method43(int arg0) {
		field9[field10++] = (byte) (arg0 + field14.method534());
	}

	@ObfuscatedName("BFQIDHPO.a(I)V")
	public void method44(int arg0) {
		field9[field10++] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.b(I)V")
	public void method45(int arg0) {
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.c(II)V")
	public void method46(int arg0) {
		field9[field10++] = (byte) arg0;
		field9[field10++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BFQIDHPO.c(I)V")
	public void method47(int arg0) {
		field9[field10++] = (byte) (arg0 >> 16);
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.d(I)V")
	public void method48(int arg0) {
		field9[field10++] = (byte) (arg0 >> 24);
		field9[field10++] = (byte) (arg0 >> 16);
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.a(IB)V")
	public void method49(int arg0) {
		field9[field10++] = (byte) arg0;
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) (arg0 >> 16);
		field9[field10++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("BFQIDHPO.a(IJ)V")
	public void method50(long arg0) {
		field9[field10++] = (byte) (arg0 >> 56);
		field9[field10++] = (byte) (arg0 >> 48);
		field9[field10++] = (byte) (arg0 >> 40);
		field9[field10++] = (byte) (arg0 >> 32);
		field9[field10++] = (byte) (arg0 >> 24);
		field9[field10++] = (byte) (arg0 >> 16);
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.a(Ljava/lang/String;)V")
	public void method51(String arg0) {
		arg0.getBytes(0, arg0.length(), field9, field10);
		field10 += arg0.length();
		field9[field10++] = 10;
	}

	@ObfuscatedName("BFQIDHPO.a([BIBI)V")
	public void method52(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field9[field10++] = arg0[var4];
		}
	}

	@ObfuscatedName("BFQIDHPO.a(IZ)V")
	public void method53(int arg0) {
		field9[field10 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("BFQIDHPO.c()I")
	public int method54() {
		return field9[field10++] & 0xFF;
	}

	@ObfuscatedName("BFQIDHPO.d()B")
	public byte method55() {
		return field9[field10++];
	}

	@ObfuscatedName("BFQIDHPO.e()I")
	public int method56() {
		field10 += 2;
		return ((field9[field10 - 2] & 0xFF) << 8) + (field9[field10 - 1] & 0xFF);
	}

	@ObfuscatedName("BFQIDHPO.f()I")
	public int method57() {
		field10 += 2;
		int var1 = ((field9[field10 - 2] & 0xFF) << 8) + (field9[field10 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BFQIDHPO.g()I")
	public int method58() {
		field10 += 3;
		return (field9[field10 - 1] & 0xFF) + ((field9[field10 - 3] & 0xFF) << 16) + ((field9[field10 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("BFQIDHPO.h()I")
	public int method59() {
		field10 += 4;
		return (field9[field10 - 1] & 0xFF) + ((field9[field10 - 2] & 0xFF) << 8) + ((field9[field10 - 4] & 0xFF) << 24) + ((field9[field10 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("BFQIDHPO.a(Z)J")
	public long method60() {
		long var1 = method59() & 0xFFFFFFFFL;
		long var3 = method59() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("BFQIDHPO.i()Ljava/lang/String;")
	public String method61() {
		int var1 = field10;

		while (field9[field10++] != 10) {
		}

		return new String(field9, var1, field10 - var1 - 1);
	}

	@ObfuscatedName("BFQIDHPO.e(I)[B")
	public byte[] method62() {
		int var1 = field10;

		while (field9[field10++] != 10) {
		}

		byte[] var2 = new byte[field10 - var1 - 1];
		for (int var3 = var1; var3 < field10 - 1; var3++) {
			var2[var3 - var1] = field9[var3];
		}

		return var2;
	}

	@ObfuscatedName("BFQIDHPO.a(I[BIB)V")
	public void method63(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field9[field10++];
		}
	}

	@ObfuscatedName("BFQIDHPO.f(I)V")
	public void method64() {
		field11 = field10 * 8;
	}

	@ObfuscatedName("BFQIDHPO.a(BI)I")
	public int method65(int arg0) {
		int var2 = field11 >> 3;
		int var3 = 8 - (field11 & 0x7);
		int var4 = 0;
		field11 += arg0;

		while (arg0 > var3) {
			var4 += (field9[var2++] & field13[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field9[var2] & field13[var3];
		} else {
			var4 += field9[var2] >> var3 - arg0 & field13[arg0];
		}

		return var4;
	}

	@ObfuscatedName("BFQIDHPO.b(Z)V")
	public void method66() {
		field10 = (field11 + 7) / 8;
	}

	@ObfuscatedName("BFQIDHPO.j()I")
	public int method67() {
		int var1 = field9[field10] & 0xFF;
		if (var1 < 128) {
			return method54() - 64;
		}

		return method56() - 49152;
	}

	@ObfuscatedName("BFQIDHPO.k()I")
	public int method68() {
		int var1 = field9[field10] & 0xFF;
		if (var1 < 128) {
			return method54();
		}

		return method56() - 32768;
	}

	@ObfuscatedName("BFQIDHPO.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method69(BigInteger arg0, BigInteger arg1) {
		int var3 = field10;
		field10 = 0;
		byte[] var4 = new byte[var3];
		method63(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field10 = 0;
		method44(var7.length);
		method52(var7, var7.length, 0);
	}

	@ObfuscatedName("BFQIDHPO.d(II)V")
	public void method70(int arg0) {
		field9[field10++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("BFQIDHPO.b(IB)V")
	public void method71(int arg0) {
		field9[field10++] = (byte) -arg0;
	}

	@ObfuscatedName("BFQIDHPO.b(BI)V")
	public void method72(int arg0) {
		field9[field10++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("BFQIDHPO.g(I)I")
	public int method73() {
		return field9[field10++] - 128 & 0xFF;
	}

	@ObfuscatedName("BFQIDHPO.h(I)I")
	public int method74() {
		return -field9[field10++] & 0xFF;
	}

	@ObfuscatedName("BFQIDHPO.c(Z)I")
	public int method75() {
		return 128 - field9[field10++] & 0xFF;
	}

	@ObfuscatedName("BFQIDHPO.i(I)B")
	public byte method76() {
		return (byte) (field9[field10++] - 128);
	}

	@ObfuscatedName("BFQIDHPO.a(B)B")
	public byte method77() {
		return (byte) (128 - field9[field10++]);
	}

	@ObfuscatedName("BFQIDHPO.e(II)V")
	public void method78(int arg0) {
		field9[field10++] = (byte) arg0;
		field9[field10++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BFQIDHPO.a(ZI)V")
	public void method79(int arg0) {
		field9[field10++] = (byte) (arg0 >> 8);
		field9[field10++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("BFQIDHPO.b(ZI)V")
	public void method80(int arg0) {
		field9[field10++] = (byte) (arg0 + 128);
		field9[field10++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BFQIDHPO.d(Z)I")
	public int method81() {
		field10 += 2;
		return ((field9[field10 - 1] & 0xFF) << 8) + (field9[field10 - 2] & 0xFF);
	}

	@ObfuscatedName("BFQIDHPO.b(B)I")
	public int method82() {
		field10 += 2;
		return ((field9[field10 - 2] & 0xFF) << 8) + (field9[field10 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("BFQIDHPO.c(B)I")
	public int method83() {
		field10 += 2;
		return ((field9[field10 - 1] & 0xFF) << 8) + (field9[field10 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("BFQIDHPO.j(I)I")
	public int method84() {
		field10 += 2;
		int var1 = ((field9[field10 - 1] & 0xFF) << 8) + (field9[field10 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BFQIDHPO.k(I)I")
	public int method85() {
		field10 += 2;
		int var1 = ((field9[field10 - 2] & 0xFF) << 8) + (field9[field10 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BFQIDHPO.e(Z)I")
	public int method86() {
		field10 += 2;
		int var1 = ((field9[field10 - 1] & 0xFF) << 8) + (field9[field10 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BFQIDHPO.d(B)I")
	public int method87() {
		field10 += 3;
		return (field9[field10 - 1] & 0xFF) + ((field9[field10 - 2] & 0xFF) << 16) + ((field9[field10 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("BFQIDHPO.l(I)I")
	public int method88() {
		field10 += 4;
		return (field9[field10 - 4] & 0xFF) + ((field9[field10 - 3] & 0xFF) << 8) + ((field9[field10 - 1] & 0xFF) << 24) + ((field9[field10 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("BFQIDHPO.m(I)I")
	public int method89() {
		field10 += 4;
		return (field9[field10 - 2] & 0xFF) + ((field9[field10 - 1] & 0xFF) << 8) + ((field9[field10 - 3] & 0xFF) << 24) + ((field9[field10 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("BFQIDHPO.a(I[BZI)V")
	public void method90(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field9[field10++] = (byte) (arg1[var4] + 128);
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

			field12[var0] = var1;
		}
	}
}
