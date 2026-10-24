package deob;

import java.math.BigInteger;

@ObfuscatedName("EILHLJCE")
public final class EILHLJCE extends BIJRHVKA {

	@ObfuscatedName("EILHLJCE.x")
	public byte[] field683;

	@ObfuscatedName("EILHLJCE.y")
	public int field684;

	@ObfuscatedName("EILHLJCE.A")
	public static int[] field686 = new int[256];

	@ObfuscatedName("EILHLJCE.B")
	public static final int[] field687 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("EILHLJCE.G")
	public static FLJWGVEY field692 = new FLJWGVEY();

	@ObfuscatedName("EILHLJCE.H")
	public static FLJWGVEY field693 = new FLJWGVEY();

	@ObfuscatedName("EILHLJCE.I")
	public static FLJWGVEY field694 = new FLJWGVEY();

	@ObfuscatedName("EILHLJCE.J")
	public static char[] field695 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("EILHLJCE.z")
	public int field685;

	@ObfuscatedName("EILHLJCE.D")
	public static int field689;

	@ObfuscatedName("EILHLJCE.E")
	public static int field690;

	@ObfuscatedName("EILHLJCE.F")
	public static int field691;

	@ObfuscatedName("EILHLJCE.C")
	public YPXEHIVX field688;

	@ObfuscatedName("EILHLJCE.a(IB)LEILHLJCE;")
	public static EILHLJCE method212(int arg0) {
		synchronized (field693) {
			EILHLJCE var2 = null;
			if (arg0 == 0 && field689 > 0) {
				field689--;
				var2 = (EILHLJCE) field692.method274();
			} else if (arg0 == 1 && field690 > 0) {
				field690--;
				var2 = (EILHLJCE) field693.method274();
			} else if (arg0 == 2 && field691 > 0) {
				field691--;
				var2 = (EILHLJCE) field694.method274();
			}

			if (var2 != null) {
				var2.field684 = 0;
				return var2;
			}
		}

		EILHLJCE var4 = new EILHLJCE();
		var4.field684 = 0;

		if (arg0 == 0) {
			var4.field683 = new byte[100];
		} else if (arg0 == 1) {
			var4.field683 = new byte[5000];
		} else {
			var4.field683 = new byte[30000];
		}

		return var4;
	}

	public EILHLJCE() {
	}

	public EILHLJCE(byte[] arg0) {
		field683 = arg0;
		field684 = 0;
	}

	@ObfuscatedName("EILHLJCE.a(II)V")
	public void method213(int arg0) {
		field683[field684++] = (byte) (arg0 + field688.method580());
	}

	@ObfuscatedName("EILHLJCE.a(I)V")
	public void method214(int arg0) {
		field683[field684++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(I)V")
	public void method215(int arg0) {
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(IB)V")
	public void method216(int arg0) {
		field683[field684++] = (byte) arg0;
		field683[field684++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EILHLJCE.c(I)V")
	public void method217(int arg0) {
		field683[field684++] = (byte) (arg0 >> 16);
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.d(I)V")
	public void method218(int arg0) {
		field683[field684++] = (byte) (arg0 >> 24);
		field683[field684++] = (byte) (arg0 >> 16);
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(II)V")
	public void method219(int arg0) {
		field683[field684++] = (byte) arg0;
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) (arg0 >> 16);
		field683[field684++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EILHLJCE.a(JZ)V")
	public void method220(long arg0) {
		field683[field684++] = (byte) (arg0 >> 56);
		field683[field684++] = (byte) (arg0 >> 48);
		field683[field684++] = (byte) (arg0 >> 40);
		field683[field684++] = (byte) (arg0 >> 32);
		field683[field684++] = (byte) (arg0 >> 24);
		field683[field684++] = (byte) (arg0 >> 16);
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.a(Ljava/lang/String;)V")
	public void method221(String arg0) {
		arg0.getBytes(0, arg0.length(), field683, field684);
		field684 += arg0.length();
		field683[field684++] = 10;
	}

	@ObfuscatedName("EILHLJCE.a(I[BIB)V")
	public void method222(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field683[field684++] = arg1[var4];
		}
	}

	@ObfuscatedName("EILHLJCE.c(IB)V")
	public void method223(int arg0) {
		field683[field684 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.c()I")
	public int method224() {
		return field683[field684++] & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.d()B")
	public byte method225() {
		return field683[field684++];
	}

	@ObfuscatedName("EILHLJCE.e()I")
	public int method226() {
		field684 += 2;
		return ((field683[field684 - 2] & 0xFF) << 8) + (field683[field684 - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.f()I")
	public int method227() {
		field684 += 2;
		int var1 = ((field683[field684 - 2] & 0xFF) << 8) + (field683[field684 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EILHLJCE.g()I")
	public int method228() {
		field684 += 3;
		return (field683[field684 - 1] & 0xFF) + ((field683[field684 - 3] & 0xFF) << 16) + ((field683[field684 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EILHLJCE.h()I")
	public int method229() {
		field684 += 4;
		return (field683[field684 - 1] & 0xFF) + ((field683[field684 - 2] & 0xFF) << 8) + ((field683[field684 - 4] & 0xFF) << 24) + ((field683[field684 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("EILHLJCE.a(Z)J")
	public long method230() {
		long var1 = method229() & 0xFFFFFFFFL;
		long var3 = method229() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("EILHLJCE.i()Ljava/lang/String;")
	public String method231() {
		int var1 = field684;

		while (field683[field684++] != 10) {
		}

		return new String(field683, var1, field684 - var1 - 1);
	}

	@ObfuscatedName("EILHLJCE.e(I)[B")
	public byte[] method232() {
		int var1 = field684;

		while (field683[field684++] != 10) {
		}

		byte[] var2 = new byte[field684 - var1 - 1];
		for (int var3 = var1; var3 < field684 - 1; var3++) {
			var2[var3 - var1] = field683[var3];
		}

		return var2;
	}

	@ObfuscatedName("EILHLJCE.a([BIII)V")
	public void method233(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field683[field684++];
		}
	}

	@ObfuscatedName("EILHLJCE.b(Z)V")
	public void method234() {
		field685 = field684 * 8;
	}

	@ObfuscatedName("EILHLJCE.c(II)I")
	public int method235(int arg0) {
		int var2 = field685 >> 3;
		int var3 = 8 - (field685 & 0x7);
		int var4 = 0;
		field685 += arg0;

		while (arg0 > var3) {
			var4 += (field683[var2++] & field687[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field683[var2] & field687[var3];
		} else {
			var4 += field683[var2] >> var3 - arg0 & field687[arg0];
		}

		return var4;
	}

	@ObfuscatedName("EILHLJCE.c(Z)V")
	public void method236() {
		field684 = (field685 + 7) / 8;
	}

	@ObfuscatedName("EILHLJCE.j()I")
	public int method237() {
		int var1 = field683[field684] & 0xFF;
		if (var1 < 128) {
			return method224() - 64;
		}

		return method226() - 49152;
	}

	@ObfuscatedName("EILHLJCE.k()I")
	public int method238() {
		int var1 = field683[field684] & 0xFF;
		if (var1 < 128) {
			return method224();
		}

		return method226() - 32768;
	}

	@ObfuscatedName("EILHLJCE.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method239(BigInteger arg0, BigInteger arg1) {
		int var3 = field684;
		field684 = 0;
		byte[] var4 = new byte[var3];
		method233(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field684 = 0;
		method214(var7.length);
		method222(var7.length, var7, 0);
	}

	@ObfuscatedName("EILHLJCE.d(II)V")
	public void method240(int arg0) {
		field683[field684++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EILHLJCE.e(II)V")
	public void method241(int arg0) {
		field683[field684++] = (byte) -arg0;
	}

	@ObfuscatedName("EILHLJCE.a(ZI)V")
	public void method242(int arg0) {
		field683[field684++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("EILHLJCE.d(Z)I")
	public int method243() {
		return field683[field684++] - 128 & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.f(I)I")
	public int method244() {
		return -field683[field684++] & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.g(I)I")
	public int method245() {
		return 128 - field683[field684++] & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.a(B)B")
	public byte method246() {
		return (byte) (field683[field684++] - 128);
	}

	@ObfuscatedName("EILHLJCE.b(B)B")
	public byte method247() {
		return (byte) -field683[field684++];
	}

	@ObfuscatedName("EILHLJCE.h(I)B")
	public byte method248() {
		return (byte) (128 - field683[field684++]);
	}

	@ObfuscatedName("EILHLJCE.f(II)V")
	public void method249(int arg0) {
		field683[field684++] = (byte) arg0;
		field683[field684++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EILHLJCE.d(IB)V")
	public void method250(int arg0) {
		field683[field684++] = (byte) (arg0 >> 8);
		field683[field684++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EILHLJCE.g(II)V")
	public void method251(int arg0) {
		field683[field684++] = (byte) (arg0 + 128);
		field683[field684++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EILHLJCE.i(I)I")
	public int method252() {
		field684 += 2;
		return ((field683[field684 - 1] & 0xFF) << 8) + (field683[field684 - 2] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.j(I)I")
	public int method253() {
		field684 += 2;
		return ((field683[field684 - 2] & 0xFF) << 8) + (field683[field684 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.k(I)I")
	public int method254() {
		field684 += 2;
		return ((field683[field684 - 1] & 0xFF) << 8) + (field683[field684 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.l(I)I")
	public int method255() {
		field684 += 2;
		int var1 = ((field683[field684 - 1] & 0xFF) << 8) + (field683[field684 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EILHLJCE.c(B)I")
	public int method256() {
		field684 += 2;
		int var1 = ((field683[field684 - 2] & 0xFF) << 8) + (field683[field684 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EILHLJCE.e(Z)I")
	public int method257() {
		field684 += 2;
		int var1 = ((field683[field684 - 1] & 0xFF) << 8) + (field683[field684 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EILHLJCE.f(Z)I")
	public int method258() {
		field684 += 3;
		return (field683[field684 - 1] & 0xFF) + ((field683[field684 - 2] & 0xFF) << 16) + ((field683[field684 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("EILHLJCE.m(I)I")
	public int method259() {
		field684 += 4;
		return (field683[field684 - 4] & 0xFF) + ((field683[field684 - 3] & 0xFF) << 8) + ((field683[field684 - 1] & 0xFF) << 24) + ((field683[field684 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("EILHLJCE.d(B)I")
	public int method260() {
		field684 += 4;
		return (field683[field684 - 3] & 0xFF) + ((field683[field684 - 4] & 0xFF) << 8) + ((field683[field684 - 2] & 0xFF) << 24) + ((field683[field684 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("EILHLJCE.n(I)I")
	public int method261() {
		field684 += 4;
		return (field683[field684 - 2] & 0xFF) + ((field683[field684 - 1] & 0xFF) << 8) + ((field683[field684 - 3] & 0xFF) << 24) + ((field683[field684 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("EILHLJCE.b([BIII)V")
	public void method262(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field683[field684++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("EILHLJCE.a(III[B)V")
	public void method263(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = (byte) (field683[field684++] - 128);
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

			field686[var0] = var1;
		}
	}
}
