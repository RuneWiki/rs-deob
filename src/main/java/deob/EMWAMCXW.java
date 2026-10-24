package deob;

import java.math.BigInteger;

@ObfuscatedName("EMWAMCXW")
public final class EMWAMCXW extends YPOWJZIQ {

	@ObfuscatedName("EMWAMCXW.w")
	public byte[] field616;

	@ObfuscatedName("EMWAMCXW.x")
	public int field617;

	@ObfuscatedName("EMWAMCXW.z")
	public static int[] field619 = new int[256];

	@ObfuscatedName("EMWAMCXW.A")
	public static final int[] field620 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("EMWAMCXW.F")
	public static WTGHTNMN field625 = new WTGHTNMN();

	@ObfuscatedName("EMWAMCXW.G")
	public static WTGHTNMN field626 = new WTGHTNMN();

	@ObfuscatedName("EMWAMCXW.H")
	public static WTGHTNMN field627 = new WTGHTNMN();

	@ObfuscatedName("EMWAMCXW.I")
	public static char[] field628 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("EMWAMCXW.y")
	public int field618;

	@ObfuscatedName("EMWAMCXW.C")
	public static int field622;

	@ObfuscatedName("EMWAMCXW.D")
	public static int field623;

	@ObfuscatedName("EMWAMCXW.E")
	public static int field624;

	@ObfuscatedName("EMWAMCXW.B")
	public YJYHBEIS field621;

	@ObfuscatedName("EMWAMCXW.a(IB)LEMWAMCXW;")
	public static EMWAMCXW method205(int arg0) {
		synchronized (field626) {
			EMWAMCXW var2 = null;
			if (arg0 == 0 && field622 > 0) {
				field622--;
				var2 = (EMWAMCXW) field625.method469();
			} else if (arg0 == 1 && field623 > 0) {
				field623--;
				var2 = (EMWAMCXW) field626.method469();
			} else if (arg0 == 2 && field624 > 0) {
				field624--;
				var2 = (EMWAMCXW) field627.method469();
			}

			if (var2 != null) {
				var2.field617 = 0;
				return var2;
			}
		}

		EMWAMCXW var4 = new EMWAMCXW();
		var4.field617 = 0;

		if (arg0 == 0) {
			var4.field616 = new byte[100];
		} else if (arg0 == 1) {
			var4.field616 = new byte[5000];
		} else {
			var4.field616 = new byte[30000];
		}

		return var4;
	}

	public EMWAMCXW() {
	}

	public EMWAMCXW(byte[] arg0) {
		field616 = arg0;
		field617 = 0;
	}

	@ObfuscatedName("EMWAMCXW.a(II)V")
	public void method206(int arg0) {
		field616[field617++] = (byte) (arg0 + field621.method496());
	}

	@ObfuscatedName("EMWAMCXW.a(I)V")
	public void method207(int arg0) {
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.b(I)V")
	public void method208(int arg0) {
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.b(II)V")
	public void method209(int arg0) {
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EMWAMCXW.c(I)V")
	public void method210(int arg0) {
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.d(I)V")
	public void method211(int arg0) {
		field616[field617++] = (byte) (arg0 >> 24);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.c(II)V")
	public void method212(int arg0) {
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EMWAMCXW.a(JZ)V")
	public void method213(long arg0) {
		field616[field617++] = (byte) (arg0 >> 56);
		field616[field617++] = (byte) (arg0 >> 48);
		field616[field617++] = (byte) (arg0 >> 40);
		field616[field617++] = (byte) (arg0 >> 32);
		field616[field617++] = (byte) (arg0 >> 24);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.a(Ljava/lang/String;)V")
	public void method214(String arg0) {
		arg0.getBytes(0, arg0.length(), field616, field617);
		field617 += arg0.length();
		field616[field617++] = 10;
	}

	@ObfuscatedName("EMWAMCXW.a([BBII)V")
	public void method215(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field616[field617++] = arg0[var4];
		}
	}

	@ObfuscatedName("EMWAMCXW.a(ZI)V")
	public void method216(int arg0) {
		field616[field617 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("EMWAMCXW.c()I")
	public int method217() {
		return field616[field617++] & 0xFF;
	}

	@ObfuscatedName("EMWAMCXW.d()B")
	public byte method218() {
		return field616[field617++];
	}

	@ObfuscatedName("EMWAMCXW.e()I")
	public int method219() {
		field617 += 2;
		return ((field616[field617 - 2] & 0xFF) << 8) + (field616[field617 - 1] & 0xFF);
	}

	@ObfuscatedName("EMWAMCXW.f()I")
	public int method220() {
		field617 += 2;
		int var1 = ((field616[field617 - 2] & 0xFF) << 8) + (field616[field617 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EMWAMCXW.g()I")
	public int method221() {
		field617 += 3;
		return (field616[field617 - 1] & 0xFF) + ((field616[field617 - 3] & 0xFF) << 16) + ((field616[field617 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EMWAMCXW.h()I")
	public int method222() {
		field617 += 4;
		return (field616[field617 - 1] & 0xFF) + ((field616[field617 - 2] & 0xFF) << 8) + ((field616[field617 - 4] & 0xFF) << 24) + ((field616[field617 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("EMWAMCXW.e(I)J")
	public long method223() {
		long var1 = method222() & 0xFFFFFFFFL;
		long var3 = method222() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("EMWAMCXW.i()Ljava/lang/String;")
	public String method224() {
		int var1 = field617;

		while (field616[field617++] != 10) {
		}

		return new String(field616, var1, field617 - var1 - 1);
	}

	@ObfuscatedName("EMWAMCXW.f(I)[B")
	public byte[] method225() {
		int var1 = field617;

		while (field616[field617++] != 10) {
		}

		byte[] var2 = new byte[field617 - var1 - 1];
		for (int var3 = var1; var3 < field617 - 1; var3++) {
			var2[var3 - var1] = field616[var3];
		}

		return var2;
	}

	@ObfuscatedName("EMWAMCXW.a([BIII)V")
	public void method226(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field616[field617++];
		}
	}

	@ObfuscatedName("EMWAMCXW.a(B)V")
	public void method227() {
		field618 = field617 * 8;
	}

	@ObfuscatedName("EMWAMCXW.d(II)I")
	public int method228(int arg0) {
		int var2 = field618 >> 3;
		int var3 = 8 - (field618 & 0x7);
		int var4 = 0;
		field618 += arg0;

		while (arg0 > var3) {
			var4 += (field616[var2++] & field620[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field616[var2] & field620[var3];
		} else {
			var4 += field616[var2] >> var3 - arg0 & field620[arg0];
		}

		return var4;
	}

	@ObfuscatedName("EMWAMCXW.b(B)V")
	public void method229() {
		field617 = (field618 + 7) / 8;
	}

	@ObfuscatedName("EMWAMCXW.j()I")
	public int method230() {
		int var1 = field616[field617] & 0xFF;
		if (var1 < 128) {
			return method217() - 64;
		}

		return method219() - 49152;
	}

	@ObfuscatedName("EMWAMCXW.k()I")
	public int method231() {
		int var1 = field616[field617] & 0xFF;
		if (var1 < 128) {
			return method217();
		}

		return method219() - 32768;
	}

	@ObfuscatedName("EMWAMCXW.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method232(BigInteger arg0, BigInteger arg1) {
		int var3 = field617;
		field617 = 0;
		byte[] var4 = new byte[var3];
		method226(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field617 = 0;
		method207(var7.length);
		method215(var7, var7.length, 0);
	}

	@ObfuscatedName("EMWAMCXW.e(II)V")
	public void method233(int arg0) {
		field616[field617++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EMWAMCXW.a(IZ)V")
	public void method234(int arg0) {
		field616[field617++] = (byte) -arg0;
	}

	@ObfuscatedName("EMWAMCXW.f(II)V")
	public void method235(int arg0) {
		field616[field617++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("EMWAMCXW.g(I)I")
	public int method236() {
		return field616[field617++] - 128 & 0xFF;
	}

	@ObfuscatedName("EMWAMCXW.a(Z)I")
	public int method237() {
		return -field616[field617++] & 0xFF;
	}

	@ObfuscatedName("EMWAMCXW.c(B)I")
	public int method238() {
		return 128 - field616[field617++] & 0xFF;
	}

	@ObfuscatedName("EMWAMCXW.h(I)B")
	public byte method239() {
		return (byte) (field616[field617++] - 128);
	}

	@ObfuscatedName("EMWAMCXW.b(Z)B")
	public byte method240() {
		return (byte) -field616[field617++];
	}

	@ObfuscatedName("EMWAMCXW.i(I)B")
	public byte method241() {
		return (byte) (128 - field616[field617++]);
	}

	@ObfuscatedName("EMWAMCXW.g(II)V")
	public void method242(int arg0) {
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EMWAMCXW.a(BI)V")
	public void method243(int arg0) {
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EMWAMCXW.b(ZI)V")
	public void method244(int arg0) {
		field616[field617++] = (byte) (arg0 + 128);
		field616[field617++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EMWAMCXW.j(I)I")
	public int method245() {
		field617 += 2;
		return ((field616[field617 - 1] & 0xFF) << 8) + (field616[field617 - 2] & 0xFF);
	}

	@ObfuscatedName("EMWAMCXW.k(I)I")
	public int method246() {
		field617 += 2;
		return ((field616[field617 - 2] & 0xFF) << 8) + (field616[field617 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("EMWAMCXW.l(I)I")
	public int method247() {
		field617 += 2;
		return ((field616[field617 - 1] & 0xFF) << 8) + (field616[field617 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("EMWAMCXW.d(B)I")
	public int method248() {
		field617 += 2;
		int var1 = ((field616[field617 - 1] & 0xFF) << 8) + (field616[field617 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EMWAMCXW.m(I)I")
	public int method249() {
		field617 += 2;
		int var1 = ((field616[field617 - 1] & 0xFF) << 8) + (field616[field617 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EMWAMCXW.e(B)I")
	public int method250() {
		field617 += 3;
		return (field616[field617 - 3] & 0xFF) + ((field616[field617 - 1] & 0xFF) << 16) + ((field616[field617 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EMWAMCXW.h(II)V")
	public void method251(int arg0) {
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 24);
		field616[field617++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("EMWAMCXW.c(Z)I")
	public int method252() {
		field617 += 4;
		return (field616[field617 - 3] & 0xFF) + ((field616[field617 - 4] & 0xFF) << 8) + ((field616[field617 - 2] & 0xFF) << 24) + ((field616[field617 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("EMWAMCXW.d(Z)I")
	public int method253() {
		field617 += 4;
		return (field616[field617 - 2] & 0xFF) + ((field616[field617 - 1] & 0xFF) << 8) + ((field616[field617 - 3] & 0xFF) << 24) + ((field616[field617 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("EMWAMCXW.a(IB[BI)V")
	public void method254(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field616[field617++] = arg1[var4];
		}
	}

	@ObfuscatedName("EMWAMCXW.a(I[BII)V")
	public void method255(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field616[field617++] - 128);
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

			field619[var0] = var1;
		}
	}
}
