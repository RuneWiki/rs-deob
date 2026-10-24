package deob;

import java.math.BigInteger;

@ObfuscatedName("CFARFRSG")
public final class CFARFRSG extends UXRJCYSS {

	@ObfuscatedName("CFARFRSG.E")
	public byte[] field43;

	@ObfuscatedName("CFARFRSG.F")
	public int field44;

	@ObfuscatedName("CFARFRSG.H")
	public static int[] field46 = new int[256];

	@ObfuscatedName("CFARFRSG.I")
	public static final int[] field47 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("CFARFRSG.N")
	public static CLCMCMIN field52 = new CLCMCMIN();

	@ObfuscatedName("CFARFRSG.O")
	public static CLCMCMIN field53 = new CLCMCMIN();

	@ObfuscatedName("CFARFRSG.P")
	public static CLCMCMIN field54 = new CLCMCMIN();

	@ObfuscatedName("CFARFRSG.Q")
	public static char[] field55 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("CFARFRSG.G")
	public int field45;

	@ObfuscatedName("CFARFRSG.K")
	public static int field49;

	@ObfuscatedName("CFARFRSG.L")
	public static int field50;

	@ObfuscatedName("CFARFRSG.M")
	public static int field51;

	@ObfuscatedName("CFARFRSG.J")
	public QKKVGPGN field48;

	@ObfuscatedName("CFARFRSG.a(II)LCFARFRSG;")
	public static CFARFRSG method18(int arg0) {
		synchronized (field53) {
			CFARFRSG var2 = null;
			if (arg0 == 0 && field49 > 0) {
				field49--;
				var2 = (CFARFRSG) field52.method70();
			} else if (arg0 == 1 && field50 > 0) {
				field50--;
				var2 = (CFARFRSG) field53.method70();
			} else if (arg0 == 2 && field51 > 0) {
				field51--;
				var2 = (CFARFRSG) field54.method70();
			}

			if (var2 != null) {
				var2.field44 = 0;
				return var2;
			}
		}

		CFARFRSG var4 = new CFARFRSG();
		var4.field44 = 0;

		if (arg0 == 0) {
			var4.field43 = new byte[100];
		} else if (arg0 == 1) {
			var4.field43 = new byte[5000];
		} else {
			var4.field43 = new byte[30000];
		}

		return var4;
	}

	public CFARFRSG() {
	}

	public CFARFRSG(byte[] arg0) {
		field43 = arg0;
		field44 = 0;
	}

	@ObfuscatedName("CFARFRSG.b(II)V")
	public void method19(int arg0) {
		field43[field44++] = (byte) (arg0 + field48.method475());
	}

	@ObfuscatedName("CFARFRSG.a(I)V")
	public void method20(int arg0) {
		field43[field44++] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.b(I)V")
	public void method21(int arg0) {
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.a(IZ)V")
	public void method22(int arg0) {
		field43[field44++] = (byte) arg0;
		field43[field44++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CFARFRSG.c(I)V")
	public void method23(int arg0) {
		field43[field44++] = (byte) (arg0 >> 16);
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.d(I)V")
	public void method24(int arg0) {
		field43[field44++] = (byte) (arg0 >> 24);
		field43[field44++] = (byte) (arg0 >> 16);
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.c(II)V")
	public void method25(int arg0) {
		field43[field44++] = (byte) arg0;
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) (arg0 >> 16);
		field43[field44++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("CFARFRSG.a(BJ)V")
	public void method26(long arg0) {
		field43[field44++] = (byte) (arg0 >> 56);
		field43[field44++] = (byte) (arg0 >> 48);
		field43[field44++] = (byte) (arg0 >> 40);
		field43[field44++] = (byte) (arg0 >> 32);
		field43[field44++] = (byte) (arg0 >> 24);
		field43[field44++] = (byte) (arg0 >> 16);
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.a(Ljava/lang/String;)V")
	public void method27(String arg0) {
		arg0.getBytes(0, arg0.length(), field43, field44);
		field44 += arg0.length();
		field43[field44++] = 10;
	}

	@ObfuscatedName("CFARFRSG.a(III[B)V")
	public void method28(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field43[field44++] = arg2[var4];
		}
	}

	@ObfuscatedName("CFARFRSG.b(IZ)V")
	public void method29(int arg0) {
		field43[field44 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("CFARFRSG.c()I")
	public int method30() {
		return field43[field44++] & 0xFF;
	}

	@ObfuscatedName("CFARFRSG.d()B")
	public byte method31() {
		return field43[field44++];
	}

	@ObfuscatedName("CFARFRSG.e()I")
	public int method32() {
		field44 += 2;
		return ((field43[field44 - 2] & 0xFF) << 8) + (field43[field44 - 1] & 0xFF);
	}

	@ObfuscatedName("CFARFRSG.f()I")
	public int method33() {
		field44 += 2;
		int var1 = ((field43[field44 - 2] & 0xFF) << 8) + (field43[field44 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CFARFRSG.g()I")
	public int method34() {
		field44 += 3;
		return (field43[field44 - 1] & 0xFF) + ((field43[field44 - 3] & 0xFF) << 16) + ((field43[field44 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("CFARFRSG.h()I")
	public int method35() {
		field44 += 4;
		return (field43[field44 - 1] & 0xFF) + ((field43[field44 - 2] & 0xFF) << 8) + ((field43[field44 - 4] & 0xFF) << 24) + ((field43[field44 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("CFARFRSG.a(B)J")
	public long method36() {
		long var1 = method35() & 0xFFFFFFFFL;
		long var3 = method35() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("CFARFRSG.i()Ljava/lang/String;")
	public String method37() {
		int var1 = field44;

		while (field43[field44++] != 10) {
		}

		return new String(field43, var1, field44 - var1 - 1);
	}

	@ObfuscatedName("CFARFRSG.b(B)[B")
	public byte[] method38() {
		int var1 = field44;

		while (field43[field44++] != 10) {
		}

		byte[] var2 = new byte[field44 - var1 - 1];
		for (int var3 = var1; var3 < field44 - 1; var3++) {
			var2[var3 - var1] = field43[var3];
		}

		return var2;
	}

	@ObfuscatedName("CFARFRSG.b(III[B)V")
	public void method39(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field43[field44++];
		}
	}

	@ObfuscatedName("CFARFRSG.e(I)V")
	public void method40() {
		field45 = field44 * 8;
	}

	@ObfuscatedName("CFARFRSG.d(II)I")
	public int method41(int arg0) {
		int var2 = field45 >> 3;
		int var3 = 8 - (field45 & 0x7);
		int var4 = 0;
		field45 += arg0;

		while (arg0 > var3) {
			var4 += (field43[var2++] & field47[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field43[var2] & field47[var3];
		} else {
			var4 += field43[var2] >> var3 - arg0 & field47[arg0];
		}

		return var4;
	}

	@ObfuscatedName("CFARFRSG.f(I)V")
	public void method42() {
		field44 = (field45 + 7) / 8;
	}

	@ObfuscatedName("CFARFRSG.j()I")
	public int method43() {
		int var1 = field43[field44] & 0xFF;
		if (var1 < 128) {
			return method30() - 64;
		}

		return method32() - 49152;
	}

	@ObfuscatedName("CFARFRSG.k()I")
	public int method44() {
		int var1 = field43[field44] & 0xFF;
		if (var1 < 128) {
			return method30();
		}

		return method32() - 32768;
	}

	@ObfuscatedName("CFARFRSG.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method45(BigInteger arg0, BigInteger arg1) {
		int var3 = field44;
		field44 = 0;
		byte[] var4 = new byte[var3];
		method39(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field44 = 0;
		method20(var7.length);
		method28(0, var7.length, var7);
	}

	@ObfuscatedName("CFARFRSG.e(II)V")
	public void method46(int arg0) {
		field43[field44++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CFARFRSG.a(IB)V")
	public void method47(int arg0) {
		field43[field44++] = (byte) -arg0;
	}

	@ObfuscatedName("CFARFRSG.f(II)V")
	public void method48(int arg0) {
		field43[field44++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("CFARFRSG.g(I)I")
	public int method49() {
		return field43[field44++] - 128 & 0xFF;
	}

	@ObfuscatedName("CFARFRSG.c(B)I")
	public int method50() {
		return -field43[field44++] & 0xFF;
	}

	@ObfuscatedName("CFARFRSG.h(I)I")
	public int method51() {
		return 128 - field43[field44++] & 0xFF;
	}

	@ObfuscatedName("CFARFRSG.a(Z)B")
	public byte method52() {
		return (byte) (field43[field44++] - 128);
	}

	@ObfuscatedName("CFARFRSG.d(B)B")
	public byte method53() {
		return (byte) (128 - field43[field44++]);
	}

	@ObfuscatedName("CFARFRSG.c(IZ)V")
	public void method54(int arg0) {
		field43[field44++] = (byte) arg0;
		field43[field44++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CFARFRSG.g(II)V")
	public void method55(int arg0) {
		field43[field44++] = (byte) (arg0 >> 8);
		field43[field44++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("CFARFRSG.h(II)V")
	public void method56(int arg0) {
		field43[field44++] = (byte) (arg0 + 128);
		field43[field44++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CFARFRSG.e(B)I")
	public int method57() {
		field44 += 2;
		return ((field43[field44 - 1] & 0xFF) << 8) + (field43[field44 - 2] & 0xFF);
	}

	@ObfuscatedName("CFARFRSG.i(I)I")
	public int method58() {
		field44 += 2;
		return ((field43[field44 - 2] & 0xFF) << 8) + (field43[field44 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("CFARFRSG.j(I)I")
	public int method59() {
		field44 += 2;
		return ((field43[field44 - 1] & 0xFF) << 8) + (field43[field44 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("CFARFRSG.b(Z)I")
	public int method60() {
		field44 += 2;
		int var1 = ((field43[field44 - 1] & 0xFF) << 8) + (field43[field44 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CFARFRSG.k(I)I")
	public int method61() {
		field44 += 2;
		int var1 = ((field43[field44 - 2] & 0xFF) << 8) + (field43[field44 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("CFARFRSG.l(I)I")
	public int method62() {
		field44 += 3;
		return (field43[field44 - 2] & 0xFF) + ((field43[field44 - 3] & 0xFF) << 16) + ((field43[field44 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("CFARFRSG.i(II)V")
	public void method63(int arg0) {
		field43[field44++] = (byte) (arg0 >> 16);
		field43[field44++] = (byte) (arg0 >> 24);
		field43[field44++] = (byte) arg0;
		field43[field44++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("CFARFRSG.c(Z)I")
	public int method64() {
		field44 += 4;
		return (field43[field44 - 4] & 0xFF) + ((field43[field44 - 3] & 0xFF) << 8) + ((field43[field44 - 1] & 0xFF) << 24) + ((field43[field44 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("CFARFRSG.m(I)I")
	public int method65() {
		field44 += 4;
		return (field43[field44 - 2] & 0xFF) + ((field43[field44 - 1] & 0xFF) << 8) + ((field43[field44 - 3] & 0xFF) << 24) + ((field43[field44 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("CFARFRSG.a(I[BIZ)V")
	public void method66(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field43[field44++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("CFARFRSG.a([BIII)V")
	public void method67(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (field43[field44++] - 128);
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

			field46[var0] = var1;
		}
	}
}
