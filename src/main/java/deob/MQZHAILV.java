package deob;

import java.math.BigInteger;

@ObfuscatedName("MQZHAILV")
public final class MQZHAILV extends YLJOEYBF {

	@ObfuscatedName("MQZHAILV.y")
	public byte[] field796;

	@ObfuscatedName("MQZHAILV.z")
	public int field797;

	@ObfuscatedName("MQZHAILV.B")
	public static int[] field799 = new int[256];

	@ObfuscatedName("MQZHAILV.C")
	public static final int[] field800 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MQZHAILV.H")
	public static PUBJBHOK field805 = new PUBJBHOK();

	@ObfuscatedName("MQZHAILV.I")
	public static PUBJBHOK field806 = new PUBJBHOK();

	@ObfuscatedName("MQZHAILV.J")
	public static PUBJBHOK field807 = new PUBJBHOK();

	@ObfuscatedName("MQZHAILV.K")
	public static char[] field808 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MQZHAILV.A")
	public int field798;

	@ObfuscatedName("MQZHAILV.E")
	public static int field802;

	@ObfuscatedName("MQZHAILV.F")
	public static int field803;

	@ObfuscatedName("MQZHAILV.G")
	public static int field804;

	@ObfuscatedName("MQZHAILV.D")
	public RCWDZCCF field801;

	@ObfuscatedName("MQZHAILV.a(II)LMQZHAILV;")
	public static MQZHAILV method313(int arg0) {
		synchronized (field806) {
			MQZHAILV var2 = null;
			if (arg0 == 0 && field802 > 0) {
				field802--;
				var2 = (MQZHAILV) field805.method375();
			} else if (arg0 == 1 && field803 > 0) {
				field803--;
				var2 = (MQZHAILV) field806.method375();
			} else if (arg0 == 2 && field804 > 0) {
				field804--;
				var2 = (MQZHAILV) field807.method375();
			}

			if (var2 != null) {
				var2.field797 = 0;
				return var2;
			}
		}

		MQZHAILV var4 = new MQZHAILV();
		var4.field797 = 0;

		if (arg0 == 0) {
			var4.field796 = new byte[100];
		} else if (arg0 == 1) {
			var4.field796 = new byte[5000];
		} else {
			var4.field796 = new byte[30000];
		}

		return var4;
	}

	public MQZHAILV() {
	}

	public MQZHAILV(byte[] arg0) {
		field796 = arg0;
		field797 = 0;
	}

	@ObfuscatedName("MQZHAILV.b(II)V")
	public void method314(int arg0) {
		field796[field797++] = (byte) (arg0 + field801.method402());
	}

	@ObfuscatedName("MQZHAILV.a(I)V")
	public void method315(int arg0) {
		field796[field797++] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.b(I)V")
	public void method316(int arg0) {
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.a(IZ)V")
	public void method317(int arg0) {
		field796[field797++] = (byte) arg0;
		field796[field797++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MQZHAILV.c(I)V")
	public void method318(int arg0) {
		field796[field797++] = (byte) (arg0 >> 16);
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.d(I)V")
	public void method319(int arg0) {
		field796[field797++] = (byte) (arg0 >> 24);
		field796[field797++] = (byte) (arg0 >> 16);
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.a(IB)V")
	public void method320(int arg0) {
		field796[field797++] = (byte) arg0;
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) (arg0 >> 16);
		field796[field797++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MQZHAILV.a(BJ)V")
	public void method321(long arg0) {
		field796[field797++] = (byte) (arg0 >> 56);
		field796[field797++] = (byte) (arg0 >> 48);
		field796[field797++] = (byte) (arg0 >> 40);
		field796[field797++] = (byte) (arg0 >> 32);
		field796[field797++] = (byte) (arg0 >> 24);
		field796[field797++] = (byte) (arg0 >> 16);
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.a(Ljava/lang/String;)V")
	public void method322(String arg0) {
		arg0.getBytes(0, arg0.length(), field796, field797);
		field797 += arg0.length();
		field796[field797++] = 10;
	}

	@ObfuscatedName("MQZHAILV.a(II[BI)V")
	public void method323(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field796[field797++] = arg1[var4];
		}
	}

	@ObfuscatedName("MQZHAILV.b(IZ)V")
	public void method324(int arg0) {
		field796[field797 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MQZHAILV.c()I")
	public int method325() {
		return field796[field797++] & 0xFF;
	}

	@ObfuscatedName("MQZHAILV.d()B")
	public byte method326() {
		return field796[field797++];
	}

	@ObfuscatedName("MQZHAILV.e()I")
	public int method327() {
		field797 += 2;
		return ((field796[field797 - 2] & 0xFF) << 8) + (field796[field797 - 1] & 0xFF);
	}

	@ObfuscatedName("MQZHAILV.f()I")
	public int method328() {
		field797 += 2;
		int var1 = ((field796[field797 - 2] & 0xFF) << 8) + (field796[field797 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MQZHAILV.g()I")
	public int method329() {
		field797 += 3;
		return (field796[field797 - 1] & 0xFF) + ((field796[field797 - 3] & 0xFF) << 16) + ((field796[field797 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MQZHAILV.h()I")
	public int method330() {
		field797 += 4;
		return (field796[field797 - 1] & 0xFF) + ((field796[field797 - 2] & 0xFF) << 8) + ((field796[field797 - 4] & 0xFF) << 24) + ((field796[field797 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MQZHAILV.a(Z)J")
	public long method331() {
		long var1 = method330() & 0xFFFFFFFFL;
		long var3 = method330() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MQZHAILV.i()Ljava/lang/String;")
	public String method332() {
		int var1 = field797;

		while (field796[field797++] != 10) {
		}

		return new String(field796, var1, field797 - var1 - 1);
	}

	@ObfuscatedName("MQZHAILV.a(B)[B")
	public byte[] method333() {
		int var1 = field797;

		while (field796[field797++] != 10) {
		}

		byte[] var2 = new byte[field797 - var1 - 1];
		for (int var3 = var1; var3 < field797 - 1; var3++) {
			var2[var3 - var1] = field796[var3];
		}

		return var2;
	}

	@ObfuscatedName("MQZHAILV.b(II[BI)V")
	public void method334(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field796[field797++];
		}
	}

	@ObfuscatedName("MQZHAILV.e(I)V")
	public void method335() {
		field798 = field797 * 8;
	}

	@ObfuscatedName("MQZHAILV.c(II)I")
	public int method336(int arg0) {
		int var2 = field798 >> 3;
		int var3 = 8 - (field798 & 0x7);
		int var4 = 0;
		field798 += arg0;

		while (arg0 > var3) {
			var4 += (field796[var2++] & field800[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field796[var2] & field800[var3];
		} else {
			var4 += field796[var2] >> var3 - arg0 & field800[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MQZHAILV.b(B)V")
	public void method337() {
		field797 = (field798 + 7) / 8;
	}

	@ObfuscatedName("MQZHAILV.j()I")
	public int method338() {
		int var1 = field796[field797] & 0xFF;
		if (var1 < 128) {
			return method325() - 64;
		}

		return method327() - 49152;
	}

	@ObfuscatedName("MQZHAILV.k()I")
	public int method339() {
		int var1 = field796[field797] & 0xFF;
		if (var1 < 128) {
			return method325();
		}

		return method327() - 32768;
	}

	@ObfuscatedName("MQZHAILV.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method340(BigInteger arg0, BigInteger arg1) {
		int var3 = field797;
		field797 = 0;
		byte[] var4 = new byte[var3];
		method334(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field797 = 0;
		method315(var7.length);
		method323(0, var7, var7.length);
	}

	@ObfuscatedName("MQZHAILV.d(II)V")
	public void method341(int arg0) {
		field796[field797++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MQZHAILV.e(II)V")
	public void method342(int arg0) {
		field796[field797++] = (byte) -arg0;
	}

	@ObfuscatedName("MQZHAILV.a(BI)V")
	public void method343(int arg0) {
		field796[field797++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MQZHAILV.f(I)I")
	public int method344() {
		return field796[field797++] - 128 & 0xFF;
	}

	@ObfuscatedName("MQZHAILV.g(I)I")
	public int method345() {
		return -field796[field797++] & 0xFF;
	}

	@ObfuscatedName("MQZHAILV.b(Z)I")
	public int method346() {
		return 128 - field796[field797++] & 0xFF;
	}

	@ObfuscatedName("MQZHAILV.h(I)B")
	public byte method347() {
		return (byte) (field796[field797++] - 128);
	}

	@ObfuscatedName("MQZHAILV.i(I)B")
	public byte method348() {
		return (byte) (128 - field796[field797++]);
	}

	@ObfuscatedName("MQZHAILV.a(ZI)V")
	public void method349(int arg0) {
		field796[field797++] = (byte) arg0;
		field796[field797++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MQZHAILV.f(II)V")
	public void method350(int arg0) {
		field796[field797++] = (byte) (arg0 >> 8);
		field796[field797++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MQZHAILV.g(II)V")
	public void method351(int arg0) {
		field796[field797++] = (byte) (arg0 + 128);
		field796[field797++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MQZHAILV.c(B)I")
	public int method352() {
		field797 += 2;
		return ((field796[field797 - 1] & 0xFF) << 8) + (field796[field797 - 2] & 0xFF);
	}

	@ObfuscatedName("MQZHAILV.j(I)I")
	public int method353() {
		field797 += 2;
		return ((field796[field797 - 2] & 0xFF) << 8) + (field796[field797 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MQZHAILV.d(B)I")
	public int method354() {
		field797 += 2;
		return ((field796[field797 - 1] & 0xFF) << 8) + (field796[field797 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MQZHAILV.k(I)I")
	public int method355() {
		field797 += 2;
		int var1 = ((field796[field797 - 1] & 0xFF) << 8) + (field796[field797 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MQZHAILV.e(B)I")
	public int method356() {
		field797 += 2;
		int var1 = ((field796[field797 - 2] & 0xFF) << 8) + (field796[field797 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MQZHAILV.c(Z)I")
	public int method357() {
		field797 += 2;
		int var1 = ((field796[field797 - 1] & 0xFF) << 8) + (field796[field797 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MQZHAILV.l(I)I")
	public int method358() {
		field797 += 3;
		return (field796[field797 - 1] & 0xFF) + ((field796[field797 - 2] & 0xFF) << 16) + ((field796[field797 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("MQZHAILV.b(ZI)V")
	public void method359(int arg0) {
		field796[field797++] = (byte) (arg0 >> 16);
		field796[field797++] = (byte) (arg0 >> 24);
		field796[field797++] = (byte) arg0;
		field796[field797++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MQZHAILV.d(Z)I")
	public int method360() {
		field797 += 4;
		return (field796[field797 - 4] & 0xFF) + ((field796[field797 - 3] & 0xFF) << 8) + ((field796[field797 - 1] & 0xFF) << 24) + ((field796[field797 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MQZHAILV.f(B)I")
	public int method361() {
		field797 += 4;
		return (field796[field797 - 3] & 0xFF) + ((field796[field797 - 4] & 0xFF) << 8) + ((field796[field797 - 2] & 0xFF) << 24) + ((field796[field797 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MQZHAILV.a(I[BII)V")
	public void method362(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = field796[field797++];
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

			field799[var0] = var1;
		}
	}
}
