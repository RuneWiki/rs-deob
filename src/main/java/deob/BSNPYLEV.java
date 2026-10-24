package deob;

import java.math.BigInteger;

@ObfuscatedName("BSNPYLEV")
public final class BSNPYLEV extends ICYNFRTV {

	@ObfuscatedName("BSNPYLEV.A")
	public byte[] field54;

	@ObfuscatedName("BSNPYLEV.B")
	public int field55;

	@ObfuscatedName("BSNPYLEV.D")
	public static int[] field57 = new int[256];

	@ObfuscatedName("BSNPYLEV.E")
	public static final int[] field58 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("BSNPYLEV.J")
	public static FEIPMYNH field63 = new FEIPMYNH();

	@ObfuscatedName("BSNPYLEV.K")
	public static FEIPMYNH field64 = new FEIPMYNH();

	@ObfuscatedName("BSNPYLEV.L")
	public static FEIPMYNH field65 = new FEIPMYNH();

	@ObfuscatedName("BSNPYLEV.M")
	public static char[] field66 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("BSNPYLEV.C")
	public int field56;

	@ObfuscatedName("BSNPYLEV.G")
	public static int field60;

	@ObfuscatedName("BSNPYLEV.H")
	public static int field61;

	@ObfuscatedName("BSNPYLEV.I")
	public static int field62;

	@ObfuscatedName("BSNPYLEV.F")
	public XXMIBCTG field59;

	@ObfuscatedName("BSNPYLEV.a(II)LBSNPYLEV;")
	public static BSNPYLEV method35(int arg0) {
		synchronized (field64) {
			BSNPYLEV var2 = null;
			if (arg0 == 0 && field60 > 0) {
				field60--;
				var2 = (BSNPYLEV) field63.method299();
			} else if (arg0 == 1 && field61 > 0) {
				field61--;
				var2 = (BSNPYLEV) field64.method299();
			} else if (arg0 == 2 && field62 > 0) {
				field62--;
				var2 = (BSNPYLEV) field65.method299();
			}

			if (var2 != null) {
				var2.field55 = 0;
				return var2;
			}
		}

		BSNPYLEV var4 = new BSNPYLEV();
		var4.field55 = 0;

		if (arg0 == 0) {
			var4.field54 = new byte[100];
		} else if (arg0 == 1) {
			var4.field54 = new byte[5000];
		} else {
			var4.field54 = new byte[30000];
		}

		return var4;
	}

	public BSNPYLEV() {
	}

	public BSNPYLEV(byte[] arg0) {
		field54 = arg0;
		field55 = 0;
	}

	@ObfuscatedName("BSNPYLEV.a(ZI)V")
	public void method36(int arg0) {
		field54[field55++] = (byte) (arg0 + field59.method587());
	}

	@ObfuscatedName("BSNPYLEV.a(I)V")
	public void method37(int arg0) {
		field54[field55++] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.b(I)V")
	public void method38(int arg0) {
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.b(II)V")
	public void method39(int arg0) {
		field54[field55++] = (byte) arg0;
		field54[field55++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BSNPYLEV.c(I)V")
	public void method40(int arg0) {
		field54[field55++] = (byte) (arg0 >> 16);
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.d(I)V")
	public void method41(int arg0) {
		field54[field55++] = (byte) (arg0 >> 24);
		field54[field55++] = (byte) (arg0 >> 16);
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.c(II)V")
	public void method42(int arg0) {
		field54[field55++] = (byte) arg0;
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) (arg0 >> 16);
		field54[field55++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("BSNPYLEV.a(JI)V")
	public void method43(long arg0) {
		field54[field55++] = (byte) (arg0 >> 56);
		field54[field55++] = (byte) (arg0 >> 48);
		field54[field55++] = (byte) (arg0 >> 40);
		field54[field55++] = (byte) (arg0 >> 32);
		field54[field55++] = (byte) (arg0 >> 24);
		field54[field55++] = (byte) (arg0 >> 16);
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.a(Ljava/lang/String;)V")
	public void method44(String arg0) {
		arg0.getBytes(0, arg0.length(), field54, field55);
		field55 += arg0.length();
		field54[field55++] = 10;
	}

	@ObfuscatedName("BSNPYLEV.a(III[B)V")
	public void method45(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field54[field55++] = arg2[var4];
		}
	}

	@ObfuscatedName("BSNPYLEV.d(II)V")
	public void method46(int arg0) {
		field54[field55 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("BSNPYLEV.c()I")
	public int method47() {
		return field54[field55++] & 0xFF;
	}

	@ObfuscatedName("BSNPYLEV.d()B")
	public byte method48() {
		return field54[field55++];
	}

	@ObfuscatedName("BSNPYLEV.e()I")
	public int method49() {
		field55 += 2;
		return ((field54[field55 - 2] & 0xFF) << 8) + (field54[field55 - 1] & 0xFF);
	}

	@ObfuscatedName("BSNPYLEV.f()I")
	public int method50() {
		field55 += 2;
		int var1 = ((field54[field55 - 2] & 0xFF) << 8) + (field54[field55 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BSNPYLEV.g()I")
	public int method51() {
		field55 += 3;
		return (field54[field55 - 1] & 0xFF) + ((field54[field55 - 3] & 0xFF) << 16) + ((field54[field55 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("BSNPYLEV.h()I")
	public int method52() {
		field55 += 4;
		return (field54[field55 - 1] & 0xFF) + ((field54[field55 - 2] & 0xFF) << 8) + ((field54[field55 - 4] & 0xFF) << 24) + ((field54[field55 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("BSNPYLEV.a(B)J")
	public long method53() {
		long var1 = method52() & 0xFFFFFFFFL;
		long var3 = method52() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("BSNPYLEV.i()Ljava/lang/String;")
	public String method54() {
		int var1 = field55;

		while (field54[field55++] != 10) {
		}

		return new String(field54, var1, field55 - var1 - 1);
	}

	@ObfuscatedName("BSNPYLEV.b(B)[B")
	public byte[] method55() {
		int var1 = field55;

		while (field54[field55++] != 10) {
		}

		byte[] var2 = new byte[field55 - var1 - 1];
		for (int var3 = var1; var3 < field55 - 1; var3++) {
			var2[var3 - var1] = field54[var3];
		}

		return var2;
	}

	@ObfuscatedName("BSNPYLEV.a(I[BII)V")
	public void method56(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field54[field55++];
		}
	}

	@ObfuscatedName("BSNPYLEV.e(I)V")
	public void method57() {
		field56 = field55 * 8;
	}

	@ObfuscatedName("BSNPYLEV.e(II)I")
	public int method58(int arg0) {
		int var2 = field56 >> 3;
		int var3 = 8 - (field56 & 0x7);
		int var4 = 0;
		field56 += arg0;

		while (arg0 > var3) {
			var4 += (field54[var2++] & field58[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field54[var2] & field58[var3];
		} else {
			var4 += field54[var2] >> var3 - arg0 & field58[arg0];
		}

		return var4;
	}

	@ObfuscatedName("BSNPYLEV.f(I)V")
	public void method59() {
		field55 = (field56 + 7) / 8;
	}

	@ObfuscatedName("BSNPYLEV.j()I")
	public int method60() {
		int var1 = field54[field55] & 0xFF;
		if (var1 < 128) {
			return method47() - 64;
		}

		return method49() - 49152;
	}

	@ObfuscatedName("BSNPYLEV.k()I")
	public int method61() {
		int var1 = field54[field55] & 0xFF;
		if (var1 < 128) {
			return method47();
		}

		return method49() - 32768;
	}

	@ObfuscatedName("BSNPYLEV.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method62(BigInteger arg0, BigInteger arg1) {
		int var3 = field55;
		field55 = 0;
		byte[] var4 = new byte[var3];
		method56(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field55 = 0;
		method37(var7.length);
		method45(0, var7.length, var7);
	}

	@ObfuscatedName("BSNPYLEV.f(II)V")
	public void method63(int arg0) {
		field54[field55++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("BSNPYLEV.a(IZ)V")
	public void method64(int arg0) {
		field54[field55++] = (byte) -arg0;
	}

	@ObfuscatedName("BSNPYLEV.g(I)I")
	public int method65() {
		return field54[field55++] - 128 & 0xFF;
	}

	@ObfuscatedName("BSNPYLEV.h(I)I")
	public int method66() {
		return -field54[field55++] & 0xFF;
	}

	@ObfuscatedName("BSNPYLEV.i(I)I")
	public int method67() {
		return 128 - field54[field55++] & 0xFF;
	}

	@ObfuscatedName("BSNPYLEV.c(B)B")
	public byte method68() {
		return (byte) (field54[field55++] - 128);
	}

	@ObfuscatedName("BSNPYLEV.j(I)B")
	public byte method69() {
		return (byte) (128 - field54[field55++]);
	}

	@ObfuscatedName("BSNPYLEV.g(II)V")
	public void method70(int arg0) {
		field54[field55++] = (byte) arg0;
		field54[field55++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BSNPYLEV.h(II)V")
	public void method71(int arg0) {
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("BSNPYLEV.a(IB)V")
	public void method72(int arg0) {
		field54[field55++] = (byte) (arg0 + 128);
		field54[field55++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("BSNPYLEV.k(I)I")
	public int method73() {
		field55 += 2;
		return ((field54[field55 - 1] & 0xFF) << 8) + (field54[field55 - 2] & 0xFF);
	}

	@ObfuscatedName("BSNPYLEV.d(B)I")
	public int method74() {
		field55 += 2;
		return ((field54[field55 - 2] & 0xFF) << 8) + (field54[field55 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("BSNPYLEV.a(Z)I")
	public int method75() {
		field55 += 2;
		return ((field54[field55 - 1] & 0xFF) << 8) + (field54[field55 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("BSNPYLEV.l(I)I")
	public int method76() {
		field55 += 2;
		int var1 = ((field54[field55 - 1] & 0xFF) << 8) + (field54[field55 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BSNPYLEV.e(B)I")
	public int method77() {
		field55 += 2;
		int var1 = ((field54[field55 - 2] & 0xFF) << 8) + (field54[field55 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("BSNPYLEV.b(Z)I")
	public int method78() {
		field55 += 3;
		return (field54[field55 - 3] & 0xFF) + ((field54[field55 - 1] & 0xFF) << 16) + ((field54[field55 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("BSNPYLEV.i(II)V")
	public void method79(int arg0) {
		field54[field55++] = (byte) arg0;
		field54[field55++] = (byte) (arg0 >> 8);
		field54[field55++] = (byte) (arg0 >> 16);
		field54[field55++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("BSNPYLEV.f(B)I")
	public int method80() {
		field55 += 4;
		return (field54[field55 - 4] & 0xFF) + ((field54[field55 - 3] & 0xFF) << 8) + ((field54[field55 - 1] & 0xFF) << 24) + ((field54[field55 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("BSNPYLEV.g(B)I")
	public int method81() {
		field55 += 4;
		return (field54[field55 - 3] & 0xFF) + ((field54[field55 - 4] & 0xFF) << 8) + ((field54[field55 - 2] & 0xFF) << 24) + ((field54[field55 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("BSNPYLEV.m(I)I")
	public int method82() {
		field55 += 4;
		return (field54[field55 - 2] & 0xFF) + ((field54[field55 - 1] & 0xFF) << 8) + ((field54[field55 - 3] & 0xFF) << 24) + ((field54[field55 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("BSNPYLEV.a(IIZ[B)V")
	public void method83(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			field54[field55++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("BSNPYLEV.a(II[BI)V")
	public void method84(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field54[field55++];
		}
	}

	@ObfuscatedName("BSNPYLEV.a([BIBI)V")
	public void method85(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = (byte) (field54[field55++] - 128);
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

			field57[var0] = var1;
		}
	}
}
