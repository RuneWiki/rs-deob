package deob;

import java.math.BigInteger;

@ObfuscatedName("PKHWFJLM")
public final class PKHWFJLM extends OBKNBIRU {

	@ObfuscatedName("PKHWFJLM.D")
	public byte[] field970;

	@ObfuscatedName("PKHWFJLM.E")
	public int field971;

	@ObfuscatedName("PKHWFJLM.G")
	public static int[] field973 = new int[256];

	@ObfuscatedName("PKHWFJLM.H")
	public static final int[] field974 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("PKHWFJLM.M")
	public static UEUHLQTT field979 = new UEUHLQTT();

	@ObfuscatedName("PKHWFJLM.N")
	public static UEUHLQTT field980 = new UEUHLQTT();

	@ObfuscatedName("PKHWFJLM.O")
	public static UEUHLQTT field981 = new UEUHLQTT();

	@ObfuscatedName("PKHWFJLM.P")
	public static char[] field982 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("PKHWFJLM.F")
	public int field972;

	@ObfuscatedName("PKHWFJLM.J")
	public static int field976;

	@ObfuscatedName("PKHWFJLM.K")
	public static int field977;

	@ObfuscatedName("PKHWFJLM.L")
	public static int field978;

	@ObfuscatedName("PKHWFJLM.I")
	public LAXXBEFB field975;

	@ObfuscatedName("PKHWFJLM.a(II)LPKHWFJLM;")
	public static PKHWFJLM method318(int arg0) {
		synchronized (field980) {
			PKHWFJLM var2 = null;
			if (arg0 == 0 && field976 > 0) {
				field976--;
				var2 = (PKHWFJLM) field979.method509();
			} else if (arg0 == 1 && field977 > 0) {
				field977--;
				var2 = (PKHWFJLM) field980.method509();
			} else if (arg0 == 2 && field978 > 0) {
				field978--;
				var2 = (PKHWFJLM) field981.method509();
			}

			if (var2 != null) {
				var2.field971 = 0;
				return var2;
			}
		}

		PKHWFJLM var4 = new PKHWFJLM();
		var4.field971 = 0;

		if (arg0 == 0) {
			var4.field970 = new byte[100];
		} else if (arg0 == 1) {
			var4.field970 = new byte[5000];
		} else {
			var4.field970 = new byte[30000];
		}

		return var4;
	}

	public PKHWFJLM() {
	}

	public PKHWFJLM(byte[] arg0) {
		field970 = arg0;
		field971 = 0;
	}

	@ObfuscatedName("PKHWFJLM.a(IZ)V")
	public void method319(int arg0) {
		field970[field971++] = (byte) (arg0 + field975.method276());
	}

	@ObfuscatedName("PKHWFJLM.a(I)V")
	public void method320(int arg0) {
		field970[field971++] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.b(I)V")
	public void method321(int arg0) {
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.a(IB)V")
	public void method322(int arg0) {
		field970[field971++] = (byte) arg0;
		field970[field971++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PKHWFJLM.c(I)V")
	public void method323(int arg0) {
		field970[field971++] = (byte) (arg0 >> 16);
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.d(I)V")
	public void method324(int arg0) {
		field970[field971++] = (byte) (arg0 >> 24);
		field970[field971++] = (byte) (arg0 >> 16);
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.b(II)V")
	public void method325(int arg0) {
		field970[field971++] = (byte) arg0;
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) (arg0 >> 16);
		field970[field971++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("PKHWFJLM.a(IJ)V")
	public void method326(long arg0) {
		field970[field971++] = (byte) (arg0 >> 56);
		field970[field971++] = (byte) (arg0 >> 48);
		field970[field971++] = (byte) (arg0 >> 40);
		field970[field971++] = (byte) (arg0 >> 32);
		field970[field971++] = (byte) (arg0 >> 24);
		field970[field971++] = (byte) (arg0 >> 16);
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.a(Ljava/lang/String;)V")
	public void method327(String arg0) {
		arg0.getBytes(0, arg0.length(), field970, field971);
		field971 += arg0.length();
		field970[field971++] = 10;
	}

	@ObfuscatedName("PKHWFJLM.a([BIIB)V")
	public void method328(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field970[field971++] = arg0[var4];
		}
	}

	@ObfuscatedName("PKHWFJLM.a(BI)V")
	public void method329(int arg0) {
		field970[field971 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("PKHWFJLM.c()I")
	public int method330() {
		return field970[field971++] & 0xFF;
	}

	@ObfuscatedName("PKHWFJLM.d()B")
	public byte method331() {
		return field970[field971++];
	}

	@ObfuscatedName("PKHWFJLM.e()I")
	public int method332() {
		field971 += 2;
		return ((field970[field971 - 2] & 0xFF) << 8) + (field970[field971 - 1] & 0xFF);
	}

	@ObfuscatedName("PKHWFJLM.f()I")
	public int method333() {
		field971 += 2;
		int var1 = ((field970[field971 - 2] & 0xFF) << 8) + (field970[field971 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PKHWFJLM.g()I")
	public int method334() {
		field971 += 3;
		return (field970[field971 - 1] & 0xFF) + ((field970[field971 - 3] & 0xFF) << 16) + ((field970[field971 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("PKHWFJLM.h()I")
	public int method335() {
		field971 += 4;
		return (field970[field971 - 1] & 0xFF) + ((field970[field971 - 2] & 0xFF) << 8) + ((field970[field971 - 4] & 0xFF) << 24) + ((field970[field971 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("PKHWFJLM.e(I)J")
	public long method336() {
		long var1 = method335() & 0xFFFFFFFFL;
		long var3 = method335() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("PKHWFJLM.i()Ljava/lang/String;")
	public String method337() {
		int var1 = field971;

		while (field970[field971++] != 10) {
		}

		return new String(field970, var1, field971 - var1 - 1);
	}

	@ObfuscatedName("PKHWFJLM.f(I)[B")
	public byte[] method338() {
		int var1 = field971;

		while (field970[field971++] != 10) {
		}

		byte[] var2 = new byte[field971 - var1 - 1];
		for (int var3 = var1; var3 < field971 - 1; var3++) {
			var2[var3 - var1] = field970[var3];
		}

		return var2;
	}

	@ObfuscatedName("PKHWFJLM.a(II[BI)V")
	public void method339(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field970[field971++];
		}
	}

	@ObfuscatedName("PKHWFJLM.g(I)V")
	public void method340() {
		field972 = field971 * 8;
	}

	@ObfuscatedName("PKHWFJLM.b(BI)I")
	public int method341(int arg0) {
		int var2 = field972 >> 3;
		int var3 = 8 - (field972 & 0x7);
		int var4 = 0;
		field972 += arg0;

		while (arg0 > var3) {
			var4 += (field970[var2++] & field974[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field970[var2] & field974[var3];
		} else {
			var4 += field970[var2] >> var3 - arg0 & field974[arg0];
		}

		return var4;
	}

	@ObfuscatedName("PKHWFJLM.h(I)V")
	public void method342() {
		field971 = (field972 + 7) / 8;
	}

	@ObfuscatedName("PKHWFJLM.j()I")
	public int method343() {
		int var1 = field970[field971] & 0xFF;
		if (var1 < 128) {
			return method330() - 64;
		}

		return method332() - 49152;
	}

	@ObfuscatedName("PKHWFJLM.k()I")
	public int method344() {
		int var1 = field970[field971] & 0xFF;
		if (var1 < 128) {
			return method330();
		}

		return method332() - 32768;
	}

	@ObfuscatedName("PKHWFJLM.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method345(BigInteger arg0, BigInteger arg1) {
		int var3 = field971;
		field971 = 0;
		byte[] var4 = new byte[var3];
		method339(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field971 = 0;
		method320(var7.length);
		method328(var7, var7.length, 0);
	}

	@ObfuscatedName("PKHWFJLM.c(II)V")
	public void method346(int arg0) {
		field970[field971++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PKHWFJLM.d(II)V")
	public void method347(int arg0) {
		field970[field971++] = (byte) -arg0;
	}

	@ObfuscatedName("PKHWFJLM.e(II)V")
	public void method348(int arg0) {
		field970[field971++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("PKHWFJLM.a(B)I")
	public int method349() {
		return field970[field971++] - 128 & 0xFF;
	}

	@ObfuscatedName("PKHWFJLM.b(B)I")
	public int method350() {
		return -field970[field971++] & 0xFF;
	}

	@ObfuscatedName("PKHWFJLM.i(I)I")
	public int method351() {
		return 128 - field970[field971++] & 0xFF;
	}

	@ObfuscatedName("PKHWFJLM.j(I)B")
	public byte method352() {
		return (byte) (field970[field971++] - 128);
	}

	@ObfuscatedName("PKHWFJLM.c(B)B")
	public byte method353() {
		return (byte) -field970[field971++];
	}

	@ObfuscatedName("PKHWFJLM.f(II)V")
	public void method354(int arg0) {
		field970[field971++] = (byte) arg0;
		field970[field971++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PKHWFJLM.c(BI)V")
	public void method355(int arg0) {
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PKHWFJLM.g(II)V")
	public void method356(int arg0) {
		field970[field971++] = (byte) (arg0 + 128);
		field970[field971++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PKHWFJLM.k(I)I")
	public int method357() {
		field971 += 2;
		return ((field970[field971 - 1] & 0xFF) << 8) + (field970[field971 - 2] & 0xFF);
	}

	@ObfuscatedName("PKHWFJLM.d(B)I")
	public int method358() {
		field971 += 2;
		return ((field970[field971 - 2] & 0xFF) << 8) + (field970[field971 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("PKHWFJLM.l(I)I")
	public int method359() {
		field971 += 2;
		return ((field970[field971 - 1] & 0xFF) << 8) + (field970[field971 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("PKHWFJLM.e(B)I")
	public int method360() {
		field971 += 2;
		int var1 = ((field970[field971 - 1] & 0xFF) << 8) + (field970[field971 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PKHWFJLM.m(I)I")
	public int method361() {
		field971 += 2;
		int var1 = ((field970[field971 - 2] & 0xFF) << 8) + (field970[field971 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PKHWFJLM.n(I)I")
	public int method362() {
		field971 += 3;
		return (field970[field971 - 1] & 0xFF) + ((field970[field971 - 2] & 0xFF) << 16) + ((field970[field971 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("PKHWFJLM.h(II)V")
	public void method363(int arg0) {
		field970[field971++] = (byte) arg0;
		field970[field971++] = (byte) (arg0 >> 8);
		field970[field971++] = (byte) (arg0 >> 16);
		field970[field971++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("PKHWFJLM.o(I)I")
	public int method364() {
		field971 += 4;
		return (field970[field971 - 4] & 0xFF) + ((field970[field971 - 3] & 0xFF) << 8) + ((field970[field971 - 1] & 0xFF) << 24) + ((field970[field971 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("PKHWFJLM.p(I)I")
	public int method365() {
		field971 += 4;
		return (field970[field971 - 3] & 0xFF) + ((field970[field971 - 4] & 0xFF) << 8) + ((field970[field971 - 2] & 0xFF) << 24) + ((field970[field971 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("PKHWFJLM.q(I)I")
	public int method366() {
		field971 += 4;
		return (field970[field971 - 2] & 0xFF) + ((field970[field971 - 1] & 0xFF) << 8) + ((field970[field971 - 3] & 0xFF) << 24) + ((field970[field971 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("PKHWFJLM.a(I[BII)V")
	public void method367(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			field970[field971++] = (byte) (arg0[var4] + 128);
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

			field973[var0] = var1;
		}
	}
}
