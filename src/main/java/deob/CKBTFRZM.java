package deob;

import java.math.BigInteger;

@ObfuscatedName("CKBTFRZM")
public final class CKBTFRZM extends FRLKXEIS {

	@ObfuscatedName("CKBTFRZM.A")
	public byte[] field91;

	@ObfuscatedName("CKBTFRZM.B")
	public int field92;

	@ObfuscatedName("CKBTFRZM.D")
	public static int[] field94 = new int[256];

	@ObfuscatedName("CKBTFRZM.E")
	public static final int[] field95 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("CKBTFRZM.J")
	public static WUVIEXOA field100 = new WUVIEXOA();

	@ObfuscatedName("CKBTFRZM.K")
	public static WUVIEXOA field101 = new WUVIEXOA();

	@ObfuscatedName("CKBTFRZM.L")
	public static WUVIEXOA field102 = new WUVIEXOA();

	@ObfuscatedName("CKBTFRZM.M")
	public static char[] field103 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("CKBTFRZM.C")
	public int field93;

	@ObfuscatedName("CKBTFRZM.G")
	public static int field97;

	@ObfuscatedName("CKBTFRZM.H")
	public static int field98;

	@ObfuscatedName("CKBTFRZM.I")
	public static int field99;

	@ObfuscatedName("CKBTFRZM.F")
	public PJNVYQWL field96;

	@ObfuscatedName("CKBTFRZM.a(II)LCKBTFRZM;")
	public static CKBTFRZM method32(int arg0) {
		synchronized (field101) {
			CKBTFRZM var2 = null;
			if (arg0 == 0 && field97 > 0) {
				field97--;
				var2 = (CKBTFRZM) field100.method584();
			} else if (arg0 == 1 && field98 > 0) {
				field98--;
				var2 = (CKBTFRZM) field101.method584();
			} else if (arg0 == 2 && field99 > 0) {
				field99--;
				var2 = (CKBTFRZM) field102.method584();
			}

			if (var2 != null) {
				var2.field92 = 0;
				return var2;
			}
		}

		CKBTFRZM var4 = new CKBTFRZM();
		var4.field92 = 0;

		if (arg0 == 0) {
			var4.field91 = new byte[100];
		} else if (arg0 == 1) {
			var4.field91 = new byte[5000];
		} else {
			var4.field91 = new byte[30000];
		}

		return var4;
	}

	public CKBTFRZM() {
	}

	public CKBTFRZM(byte[] arg0) {
		field91 = arg0;
		field92 = 0;
	}

	@ObfuscatedName("CKBTFRZM.a(BI)V")
	public void method33(int arg0) {
		field91[field92++] = (byte) (arg0 + field96.method479());
	}

	@ObfuscatedName("CKBTFRZM.a(I)V")
	public void method34(int arg0) {
		field91[field92++] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.b(I)V")
	public void method35(int arg0) {
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.b(II)V")
	public void method36(int arg0) {
		field91[field92++] = (byte) arg0;
		field91[field92++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CKBTFRZM.c(I)V")
	public void method37(int arg0) {
		field91[field92++] = (byte) (arg0 >> 16);
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.d(I)V")
	public void method38(int arg0) {
		field91[field92++] = (byte) (arg0 >> 24);
		field91[field92++] = (byte) (arg0 >> 16);
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.c(II)V")
	public void method39(int arg0) {
		field91[field92++] = (byte) arg0;
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) (arg0 >> 16);
		field91[field92++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("CKBTFRZM.a(IJ)V")
	public void method40(long arg0) {
		field91[field92++] = (byte) (arg0 >> 56);
		field91[field92++] = (byte) (arg0 >> 48);
		field91[field92++] = (byte) (arg0 >> 40);
		field91[field92++] = (byte) (arg0 >> 32);
		field91[field92++] = (byte) (arg0 >> 24);
		field91[field92++] = (byte) (arg0 >> 16);
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.a(Ljava/lang/String;)V")
	public void method41(String arg0) {
		arg0.getBytes(0, arg0.length(), field91, field92);
		field92 += arg0.length();
		field91[field92++] = 10;
	}

	@ObfuscatedName("CKBTFRZM.a(I[BII)V")
	public void method42(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field91[field92++] = arg0[var4];
		}
	}

	@ObfuscatedName("CKBTFRZM.d(II)V")
	public void method43(int arg0) {
		field91[field92 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("CKBTFRZM.c()I")
	public int method44() {
		return field91[field92++] & 0xFF;
	}

	@ObfuscatedName("CKBTFRZM.d()B")
	public byte method45() {
		return field91[field92++];
	}

	@ObfuscatedName("CKBTFRZM.e()I")
	public int method46() {
		field92 += 2;
		return ((field91[field92 - 2] & 0xFF) << 8) + (field91[field92 - 1] & 0xFF);
	}

	@ObfuscatedName("CKBTFRZM.f()I")
	public int method47() {
		field92 += 2;
		int var1 = ((field91[field92 - 2] & 0xFF) << 8) + (field91[field92 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CKBTFRZM.g()I")
	public int method48() {
		field92 += 3;
		return (field91[field92 - 1] & 0xFF) + ((field91[field92 - 3] & 0xFF) << 16) + ((field91[field92 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("CKBTFRZM.h()I")
	public int method49() {
		field92 += 4;
		return (field91[field92 - 1] & 0xFF) + ((field91[field92 - 2] & 0xFF) << 8) + ((field91[field92 - 4] & 0xFF) << 24) + ((field91[field92 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("CKBTFRZM.e(I)J")
	public long method50() {
		long var1 = method49() & 0xFFFFFFFFL;
		long var3 = method49() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("CKBTFRZM.i()Ljava/lang/String;")
	public String method51() {
		int var1 = field92;

		while (field91[field92++] != 10) {
		}

		return new String(field91, var1, field92 - var1 - 1);
	}

	@ObfuscatedName("CKBTFRZM.f(I)[B")
	public byte[] method52() {
		int var1 = field92;

		while (field91[field92++] != 10) {
		}

		byte[] var2 = new byte[field92 - var1 - 1];
		for (int var3 = var1; var3 < field92 - 1; var3++) {
			var2[var3 - var1] = field91[var3];
		}

		return var2;
	}

	@ObfuscatedName("CKBTFRZM.a(B[BII)V")
	public void method53(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field91[field92++];
		}
	}

	@ObfuscatedName("CKBTFRZM.g(I)V")
	public void method54() {
		field93 = field92 * 8;
	}

	@ObfuscatedName("CKBTFRZM.e(II)I")
	public int method55(int arg0) {
		int var2 = field93 >> 3;
		int var3 = 8 - (field93 & 0x7);
		int var4 = 0;
		field93 += arg0;

		while (arg0 > var3) {
			var4 += (field91[var2++] & field95[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field91[var2] & field95[var3];
		} else {
			var4 += field91[var2] >> var3 - arg0 & field95[arg0];
		}

		return var4;
	}

	@ObfuscatedName("CKBTFRZM.h(I)V")
	public void method56() {
		field92 = (field93 + 7) / 8;
	}

	@ObfuscatedName("CKBTFRZM.j()I")
	public int method57() {
		int var1 = field91[field92] & 0xFF;
		if (var1 < 128) {
			return method44() - 64;
		}

		return method46() - 49152;
	}

	@ObfuscatedName("CKBTFRZM.k()I")
	public int method58() {
		int var1 = field91[field92] & 0xFF;
		if (var1 < 128) {
			return method44();
		}

		return method46() - 32768;
	}

	@ObfuscatedName("CKBTFRZM.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method59(BigInteger arg0, BigInteger arg1) {
		int var3 = field92;
		field92 = 0;
		byte[] var4 = new byte[var3];
		method53(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field92 = 0;
		method34(var7.length);
		method42(var7, 0, var7.length);
	}

	@ObfuscatedName("CKBTFRZM.f(II)V")
	public void method60(int arg0) {
		field91[field92++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CKBTFRZM.b(BI)V")
	public void method61(int arg0) {
		field91[field92++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("CKBTFRZM.a(Z)I")
	public int method62() {
		return field91[field92++] - 128 & 0xFF;
	}

	@ObfuscatedName("CKBTFRZM.a(B)I")
	public int method63() {
		return -field91[field92++] & 0xFF;
	}

	@ObfuscatedName("CKBTFRZM.i(I)I")
	public int method64() {
		return 128 - field91[field92++] & 0xFF;
	}

	@ObfuscatedName("CKBTFRZM.b(Z)B")
	public byte method65() {
		return (byte) (field91[field92++] - 128);
	}

	@ObfuscatedName("CKBTFRZM.c(Z)B")
	public byte method66() {
		return (byte) -field91[field92++];
	}

	@ObfuscatedName("CKBTFRZM.d(Z)B")
	public byte method67() {
		return (byte) (128 - field91[field92++]);
	}

	@ObfuscatedName("CKBTFRZM.a(IB)V")
	public void method68(int arg0) {
		field91[field92++] = (byte) arg0;
		field91[field92++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CKBTFRZM.b(IB)V")
	public void method69(int arg0) {
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CKBTFRZM.g(II)V")
	public void method70(int arg0) {
		field91[field92++] = (byte) (arg0 + 128);
		field91[field92++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CKBTFRZM.j(I)I")
	public int method71() {
		field92 += 2;
		return ((field91[field92 - 1] & 0xFF) << 8) + (field91[field92 - 2] & 0xFF);
	}

	@ObfuscatedName("CKBTFRZM.k(I)I")
	public int method72() {
		field92 += 2;
		return ((field91[field92 - 2] & 0xFF) << 8) + (field91[field92 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("CKBTFRZM.b(B)I")
	public int method73() {
		field92 += 2;
		return ((field91[field92 - 1] & 0xFF) << 8) + (field91[field92 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("CKBTFRZM.l(I)I")
	public int method74() {
		field92 += 2;
		int var1 = ((field91[field92 - 1] & 0xFF) << 8) + (field91[field92 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CKBTFRZM.m(I)I")
	public int method75() {
		field92 += 2;
		int var1 = ((field91[field92 - 2] & 0xFF) << 8) + (field91[field92 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CKBTFRZM.e(Z)I")
	public int method76() {
		field92 += 2;
		int var1 = ((field91[field92 - 1] & 0xFF) << 8) + (field91[field92 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CKBTFRZM.h(II)V")
	public void method77(int arg0) {
		field91[field92++] = (byte) (arg0 >> 8);
		field91[field92++] = (byte) arg0;
		field91[field92++] = (byte) (arg0 >> 24);
		field91[field92++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("CKBTFRZM.c(B)I")
	public int method78() {
		field92 += 4;
		return (field91[field92 - 4] & 0xFF) + ((field91[field92 - 3] & 0xFF) << 8) + ((field91[field92 - 1] & 0xFF) << 24) + ((field91[field92 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("CKBTFRZM.n(I)I")
	public int method79() {
		field92 += 4;
		return (field91[field92 - 3] & 0xFF) + ((field91[field92 - 4] & 0xFF) << 8) + ((field91[field92 - 2] & 0xFF) << 24) + ((field91[field92 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("CKBTFRZM.o(I)I")
	public int method80() {
		field92 += 4;
		return (field91[field92 - 2] & 0xFF) + ((field91[field92 - 1] & 0xFF) << 8) + ((field91[field92 - 3] & 0xFF) << 24) + ((field91[field92 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("CKBTFRZM.a(IZ[BI)V")
	public void method81(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field91[field92++] = arg1[var4];
		}
	}

	@ObfuscatedName("CKBTFRZM.a(III[B)V")
	public void method82(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = field91[field92++];
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

			field94[var0] = var1;
		}
	}
}
