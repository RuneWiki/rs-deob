package deob;

import java.math.BigInteger;

@ObfuscatedName("IUVBENCV")
public final class IUVBENCV extends IVMCUDWL {

	@ObfuscatedName("IUVBENCV.A")
	public byte[] field732;

	@ObfuscatedName("IUVBENCV.B")
	public int field733;

	@ObfuscatedName("IUVBENCV.D")
	public static int[] field735 = new int[256];

	@ObfuscatedName("IUVBENCV.E")
	public static final int[] field736 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("IUVBENCV.J")
	public static ZEEWTYXI field741 = new ZEEWTYXI();

	@ObfuscatedName("IUVBENCV.K")
	public static ZEEWTYXI field742 = new ZEEWTYXI();

	@ObfuscatedName("IUVBENCV.L")
	public static ZEEWTYXI field743 = new ZEEWTYXI();

	@ObfuscatedName("IUVBENCV.M")
	public static char[] field744 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("IUVBENCV.C")
	public int field734;

	@ObfuscatedName("IUVBENCV.G")
	public static int field738;

	@ObfuscatedName("IUVBENCV.H")
	public static int field739;

	@ObfuscatedName("IUVBENCV.I")
	public static int field740;

	@ObfuscatedName("IUVBENCV.F")
	public ICHYZYSQ field737;

	@ObfuscatedName("IUVBENCV.a(ZI)LIUVBENCV;")
	public static IUVBENCV method233(int arg0) {
		synchronized (field742) {
			IUVBENCV var2 = null;
			if (arg0 == 0 && field738 > 0) {
				field738--;
				var2 = (IUVBENCV) field741.method579();
			} else if (arg0 == 1 && field739 > 0) {
				field739--;
				var2 = (IUVBENCV) field742.method579();
			} else if (arg0 == 2 && field740 > 0) {
				field740--;
				var2 = (IUVBENCV) field743.method579();
			}

			if (var2 != null) {
				var2.field733 = 0;
				return var2;
			}
		}

		IUVBENCV var4 = new IUVBENCV();
		var4.field733 = 0;

		if (arg0 == 0) {
			var4.field732 = new byte[100];
		} else if (arg0 == 1) {
			var4.field732 = new byte[5000];
		} else {
			var4.field732 = new byte[30000];
		}

		return var4;
	}

	public IUVBENCV() {
	}

	public IUVBENCV(byte[] arg0) {
		field732 = arg0;
		field733 = 0;
	}

	@ObfuscatedName("IUVBENCV.a(II)V")
	public void method234(int arg0) {
		field732[field733++] = (byte) (arg0 + field737.method230());
	}

	@ObfuscatedName("IUVBENCV.a(I)V")
	public void method235(int arg0) {
		field732[field733++] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.b(I)V")
	public void method236(int arg0) {
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.b(II)V")
	public void method237(int arg0) {
		field732[field733++] = (byte) arg0;
		field732[field733++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IUVBENCV.c(I)V")
	public void method238(int arg0) {
		field732[field733++] = (byte) (arg0 >> 16);
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.d(I)V")
	public void method239(int arg0) {
		field732[field733++] = (byte) (arg0 >> 24);
		field732[field733++] = (byte) (arg0 >> 16);
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.c(II)V")
	public void method240(int arg0) {
		field732[field733++] = (byte) arg0;
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) (arg0 >> 16);
		field732[field733++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("IUVBENCV.a(JI)V")
	public void method241(long arg0) {
		field732[field733++] = (byte) (arg0 >> 56);
		field732[field733++] = (byte) (arg0 >> 48);
		field732[field733++] = (byte) (arg0 >> 40);
		field732[field733++] = (byte) (arg0 >> 32);
		field732[field733++] = (byte) (arg0 >> 24);
		field732[field733++] = (byte) (arg0 >> 16);
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.a(Ljava/lang/String;)V")
	public void method242(String arg0) {
		arg0.getBytes(0, arg0.length(), field732, field733);
		field733 += arg0.length();
		field732[field733++] = 10;
	}

	@ObfuscatedName("IUVBENCV.a(I[BII)V")
	public void method243(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field732[field733++] = arg1[var4];
		}
	}

	@ObfuscatedName("IUVBENCV.d(II)V")
	public void method244(int arg0) {
		field732[field733 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("IUVBENCV.c()I")
	public int method245() {
		return field732[field733++] & 0xFF;
	}

	@ObfuscatedName("IUVBENCV.d()B")
	public byte method246() {
		return field732[field733++];
	}

	@ObfuscatedName("IUVBENCV.e()I")
	public int method247() {
		field733 += 2;
		return ((field732[field733 - 2] & 0xFF) << 8) + (field732[field733 - 1] & 0xFF);
	}

	@ObfuscatedName("IUVBENCV.f()I")
	public int method248() {
		field733 += 2;
		int var1 = ((field732[field733 - 2] & 0xFF) << 8) + (field732[field733 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IUVBENCV.g()I")
	public int method249() {
		field733 += 3;
		return (field732[field733 - 1] & 0xFF) + ((field732[field733 - 3] & 0xFF) << 16) + ((field732[field733 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("IUVBENCV.h()I")
	public int method250() {
		field733 += 4;
		return (field732[field733 - 1] & 0xFF) + ((field732[field733 - 2] & 0xFF) << 8) + ((field732[field733 - 4] & 0xFF) << 24) + ((field732[field733 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("IUVBENCV.e(I)J")
	public long method251() {
		long var1 = method250() & 0xFFFFFFFFL;
		long var3 = method250() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("IUVBENCV.i()Ljava/lang/String;")
	public String method252() {
		int var1 = field733;

		while (field732[field733++] != 10) {
		}

		return new String(field732, var1, field733 - var1 - 1);
	}

	@ObfuscatedName("IUVBENCV.a(B)[B")
	public byte[] method253() {
		int var1 = field733;

		while (field732[field733++] != 10) {
		}

		byte[] var2 = new byte[field733 - var1 - 1];
		for (int var3 = var1; var3 < field733 - 1; var3++) {
			var2[var3 - var1] = field732[var3];
		}

		return var2;
	}

	@ObfuscatedName("IUVBENCV.a(IZI[B)V")
	public void method254(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field732[field733++];
		}
	}

	@ObfuscatedName("IUVBENCV.b(B)V")
	public void method255() {
		field734 = field733 * 8;
	}

	@ObfuscatedName("IUVBENCV.e(II)I")
	public int method256(int arg0) {
		int var2 = field734 >> 3;
		int var3 = 8 - (field734 & 0x7);
		int var4 = 0;
		field734 += arg0;

		while (arg0 > var3) {
			var4 += (field732[var2++] & field736[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field732[var2] & field736[var3];
		} else {
			var4 += field732[var2] >> var3 - arg0 & field736[arg0];
		}

		return var4;
	}

	@ObfuscatedName("IUVBENCV.f(I)V")
	public void method257() {
		field733 = (field734 + 7) / 8;
	}

	@ObfuscatedName("IUVBENCV.j()I")
	public int method258() {
		int var1 = field732[field733] & 0xFF;
		if (var1 < 128) {
			return method245() - 64;
		}

		return method247() - 49152;
	}

	@ObfuscatedName("IUVBENCV.k()I")
	public int method259() {
		int var1 = field732[field733] & 0xFF;
		if (var1 < 128) {
			return method245();
		}

		return method247() - 32768;
	}

	@ObfuscatedName("IUVBENCV.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method260(BigInteger arg0, BigInteger arg1) {
		int var3 = field733;
		field733 = 0;
		byte[] var4 = new byte[var3];
		method254(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field733 = 0;
		method235(var7.length);
		method243(0, var7, var7.length);
	}

	@ObfuscatedName("IUVBENCV.b(ZI)V")
	public void method261(int arg0) {
		field732[field733++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("IUVBENCV.g(I)I")
	public int method262() {
		return field732[field733++] - 128 & 0xFF;
	}

	@ObfuscatedName("IUVBENCV.a(Z)I")
	public int method263() {
		return -field732[field733++] & 0xFF;
	}

	@ObfuscatedName("IUVBENCV.h(I)I")
	public int method264() {
		return 128 - field732[field733++] & 0xFF;
	}

	@ObfuscatedName("IUVBENCV.c(B)B")
	public byte method265() {
		return (byte) (field732[field733++] - 128);
	}

	@ObfuscatedName("IUVBENCV.d(B)B")
	public byte method266() {
		return (byte) -field732[field733++];
	}

	@ObfuscatedName("IUVBENCV.e(B)B")
	public byte method267() {
		return (byte) (128 - field732[field733++]);
	}

	@ObfuscatedName("IUVBENCV.c(ZI)V")
	public void method268(int arg0) {
		field732[field733++] = (byte) arg0;
		field732[field733++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IUVBENCV.f(II)V")
	public void method269(int arg0) {
		field732[field733++] = (byte) (arg0 >> 8);
		field732[field733++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("IUVBENCV.g(II)V")
	public void method270(int arg0) {
		field732[field733++] = (byte) (arg0 + 128);
		field732[field733++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("IUVBENCV.i(I)I")
	public int method271() {
		field733 += 2;
		return ((field732[field733 - 1] & 0xFF) << 8) + (field732[field733 - 2] & 0xFF);
	}

	@ObfuscatedName("IUVBENCV.j(I)I")
	public int method272() {
		field733 += 2;
		return ((field732[field733 - 2] & 0xFF) << 8) + (field732[field733 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("IUVBENCV.k(I)I")
	public int method273() {
		field733 += 2;
		return ((field732[field733 - 1] & 0xFF) << 8) + (field732[field733 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("IUVBENCV.b(Z)I")
	public int method274() {
		field733 += 2;
		int var1 = ((field732[field733 - 1] & 0xFF) << 8) + (field732[field733 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IUVBENCV.l(I)I")
	public int method275() {
		field733 += 2;
		int var1 = ((field732[field733 - 2] & 0xFF) << 8) + (field732[field733 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("IUVBENCV.m(I)I")
	public int method276() {
		field733 += 3;
		return (field732[field733 - 1] & 0xFF) + ((field732[field733 - 2] & 0xFF) << 16) + ((field732[field733 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("IUVBENCV.c(Z)I")
	public int method277() {
		field733 += 4;
		return (field732[field733 - 4] & 0xFF) + ((field732[field733 - 3] & 0xFF) << 8) + ((field732[field733 - 1] & 0xFF) << 24) + ((field732[field733 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("IUVBENCV.n(I)I")
	public int method278() {
		field733 += 4;
		return (field732[field733 - 3] & 0xFF) + ((field732[field733 - 4] & 0xFF) << 8) + ((field732[field733 - 2] & 0xFF) << 24) + ((field732[field733 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("IUVBENCV.o(I)I")
	public int method279() {
		field733 += 4;
		return (field732[field733 - 2] & 0xFF) + ((field732[field733 - 1] & 0xFF) << 8) + ((field732[field733 - 3] & 0xFF) << 24) + ((field732[field733 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("IUVBENCV.a(III[B)V")
	public void method280(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field732[field733++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("IUVBENCV.a(I[BIB)V")
	public void method281(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field732[field733++];
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

			field735[var0] = var1;
		}
	}
}
