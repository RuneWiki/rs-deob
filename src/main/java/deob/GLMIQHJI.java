package deob;

import java.math.BigInteger;

@ObfuscatedName("GLMIQHJI")
public final class GLMIQHJI extends KTAHMSMP {

	@ObfuscatedName("GLMIQHJI.B")
	public byte[] field708;

	@ObfuscatedName("GLMIQHJI.C")
	public int field709;

	@ObfuscatedName("GLMIQHJI.E")
	public static int[] field711 = new int[256];

	@ObfuscatedName("GLMIQHJI.F")
	public static final int[] field712 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("GLMIQHJI.K")
	public static VLLJSJTJ field717 = new VLLJSJTJ();

	@ObfuscatedName("GLMIQHJI.L")
	public static VLLJSJTJ field718 = new VLLJSJTJ();

	@ObfuscatedName("GLMIQHJI.M")
	public static VLLJSJTJ field719 = new VLLJSJTJ();

	@ObfuscatedName("GLMIQHJI.N")
	public static char[] field720 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("GLMIQHJI.D")
	public int field710;

	@ObfuscatedName("GLMIQHJI.H")
	public static int field714;

	@ObfuscatedName("GLMIQHJI.I")
	public static int field715;

	@ObfuscatedName("GLMIQHJI.J")
	public static int field716;

	@ObfuscatedName("GLMIQHJI.G")
	public BPJMPIUS field713;

	@ObfuscatedName("GLMIQHJI.a(BI)LGLMIQHJI;")
	public static GLMIQHJI method232(int arg0) {
		synchronized (field718) {
			GLMIQHJI var2 = null;
			if (arg0 == 0 && field714 > 0) {
				field714--;
				var2 = (GLMIQHJI) field717.method527();
			} else if (arg0 == 1 && field715 > 0) {
				field715--;
				var2 = (GLMIQHJI) field718.method527();
			} else if (arg0 == 2 && field716 > 0) {
				field716--;
				var2 = (GLMIQHJI) field719.method527();
			}

			if (var2 != null) {
				var2.field709 = 0;
				return var2;
			}
		}

		GLMIQHJI var4 = new GLMIQHJI();
		var4.field709 = 0;

		if (arg0 == 0) {
			var4.field708 = new byte[100];
		} else if (arg0 == 1) {
			var4.field708 = new byte[5000];
		} else {
			var4.field708 = new byte[30000];
		}

		return var4;
	}

	public GLMIQHJI() {
	}

	public GLMIQHJI(byte[] arg0) {
		field708 = arg0;
		field709 = 0;
	}

	@ObfuscatedName("GLMIQHJI.a(II)V")
	public void method233(int arg0) {
		field708[field709++] = (byte) (arg0 + field713.method29());
	}

	@ObfuscatedName("GLMIQHJI.a(I)V")
	public void method234(int arg0) {
		field708[field709++] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.b(I)V")
	public void method235(int arg0) {
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.b(BI)V")
	public void method236(int arg0) {
		field708[field709++] = (byte) arg0;
		field708[field709++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GLMIQHJI.c(I)V")
	public void method237(int arg0) {
		field708[field709++] = (byte) (arg0 >> 16);
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.d(I)V")
	public void method238(int arg0) {
		field708[field709++] = (byte) (arg0 >> 24);
		field708[field709++] = (byte) (arg0 >> 16);
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.a(IZ)V")
	public void method239(int arg0) {
		field708[field709++] = (byte) arg0;
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) (arg0 >> 16);
		field708[field709++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("GLMIQHJI.a(JI)V")
	public void method240(long arg0) {
		field708[field709++] = (byte) (arg0 >> 56);
		field708[field709++] = (byte) (arg0 >> 48);
		field708[field709++] = (byte) (arg0 >> 40);
		field708[field709++] = (byte) (arg0 >> 32);
		field708[field709++] = (byte) (arg0 >> 24);
		field708[field709++] = (byte) (arg0 >> 16);
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.a(Ljava/lang/String;)V")
	public void method241(String arg0) {
		arg0.getBytes(0, arg0.length(), field708, field709);
		field709 += arg0.length();
		field708[field709++] = 10;
	}

	@ObfuscatedName("GLMIQHJI.a(III[B)V")
	public void method242(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field708[field709++] = arg2[var4];
		}
	}

	@ObfuscatedName("GLMIQHJI.b(II)V")
	public void method243(int arg0) {
		field708[field709 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("GLMIQHJI.c()I")
	public int method244() {
		return field708[field709++] & 0xFF;
	}

	@ObfuscatedName("GLMIQHJI.d()B")
	public byte method245() {
		return field708[field709++];
	}

	@ObfuscatedName("GLMIQHJI.e()I")
	public int method246() {
		field709 += 2;
		return ((field708[field709 - 2] & 0xFF) << 8) + (field708[field709 - 1] & 0xFF);
	}

	@ObfuscatedName("GLMIQHJI.f()I")
	public int method247() {
		field709 += 2;
		int var1 = ((field708[field709 - 2] & 0xFF) << 8) + (field708[field709 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GLMIQHJI.g()I")
	public int method248() {
		field709 += 3;
		return (field708[field709 - 1] & 0xFF) + ((field708[field709 - 3] & 0xFF) << 16) + ((field708[field709 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("GLMIQHJI.h()I")
	public int method249() {
		field709 += 4;
		return (field708[field709 - 1] & 0xFF) + ((field708[field709 - 2] & 0xFF) << 8) + ((field708[field709 - 4] & 0xFF) << 24) + ((field708[field709 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("GLMIQHJI.a(Z)J")
	public long method250() {
		long var1 = method249() & 0xFFFFFFFFL;
		long var3 = method249() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("GLMIQHJI.i()Ljava/lang/String;")
	public String method251() {
		int var1 = field709;

		while (field708[field709++] != 10) {
		}

		return new String(field708, var1, field709 - var1 - 1);
	}

	@ObfuscatedName("GLMIQHJI.b(Z)[B")
	public byte[] method252() {
		int var1 = field709;

		while (field708[field709++] != 10) {
		}

		byte[] var2 = new byte[field709 - var1 - 1];
		for (int var3 = var1; var3 < field709 - 1; var3++) {
			var2[var3 - var1] = field708[var3];
		}

		return var2;
	}

	@ObfuscatedName("GLMIQHJI.a([BZII)V")
	public void method253(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field708[field709++];
		}
	}

	@ObfuscatedName("GLMIQHJI.a(B)V")
	public void method254() {
		field710 = field709 * 8;
	}

	@ObfuscatedName("GLMIQHJI.b(IZ)I")
	public int method255(int arg0) {
		int var2 = field710 >> 3;
		int var3 = 8 - (field710 & 0x7);
		int var4 = 0;
		field710 += arg0;

		while (arg0 > var3) {
			var4 += (field708[var2++] & field712[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field708[var2] & field712[var3];
		} else {
			var4 += field708[var2] >> var3 - arg0 & field712[arg0];
		}

		return var4;
	}

	@ObfuscatedName("GLMIQHJI.e(I)V")
	public void method256() {
		field709 = (field710 + 7) / 8;
	}

	@ObfuscatedName("GLMIQHJI.j()I")
	public int method257() {
		int var1 = field708[field709] & 0xFF;
		if (var1 < 128) {
			return method244() - 64;
		}

		return method246() - 49152;
	}

	@ObfuscatedName("GLMIQHJI.k()I")
	public int method258() {
		int var1 = field708[field709] & 0xFF;
		if (var1 < 128) {
			return method244();
		}

		return method246() - 32768;
	}

	@ObfuscatedName("GLMIQHJI.a(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method259(BigInteger arg0, BigInteger arg1) {
		int var3 = field709;
		field709 = 0;
		byte[] var4 = new byte[var3];
		method253(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field709 = 0;
		method234(var7.length);
		method242(0, var7.length, var7);
	}

	@ObfuscatedName("GLMIQHJI.c(II)V")
	public void method260(int arg0) {
		field708[field709++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("GLMIQHJI.a(ZI)V")
	public void method261(int arg0) {
		field708[field709++] = (byte) -arg0;
	}

	@ObfuscatedName("GLMIQHJI.d(II)V")
	public void method262(int arg0) {
		field708[field709++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("GLMIQHJI.f(I)I")
	public int method263() {
		return field708[field709++] - 128 & 0xFF;
	}

	@ObfuscatedName("GLMIQHJI.g(I)I")
	public int method264() {
		return -field708[field709++] & 0xFF;
	}

	@ObfuscatedName("GLMIQHJI.h(I)I")
	public int method265() {
		return 128 - field708[field709++] & 0xFF;
	}

	@ObfuscatedName("GLMIQHJI.i(I)B")
	public byte method266() {
		return (byte) (field708[field709++] - 128);
	}

	@ObfuscatedName("GLMIQHJI.j(I)B")
	public byte method267() {
		return (byte) -field708[field709++];
	}

	@ObfuscatedName("GLMIQHJI.k(I)B")
	public byte method268() {
		return (byte) (128 - field708[field709++]);
	}

	@ObfuscatedName("GLMIQHJI.e(II)V")
	public void method269(int arg0) {
		field708[field709++] = (byte) arg0;
		field708[field709++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GLMIQHJI.a(IB)V")
	public void method270(int arg0) {
		field708[field709++] = (byte) (arg0 >> 8);
		field708[field709++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("GLMIQHJI.f(II)V")
	public void method271(int arg0) {
		field708[field709++] = (byte) (arg0 + 128);
		field708[field709++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GLMIQHJI.b(B)I")
	public int method272() {
		field709 += 2;
		return ((field708[field709 - 1] & 0xFF) << 8) + (field708[field709 - 2] & 0xFF);
	}

	@ObfuscatedName("GLMIQHJI.l(I)I")
	public int method273() {
		field709 += 2;
		return ((field708[field709 - 2] & 0xFF) << 8) + (field708[field709 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("GLMIQHJI.c(B)I")
	public int method274() {
		field709 += 2;
		return ((field708[field709 - 1] & 0xFF) << 8) + (field708[field709 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("GLMIQHJI.c(Z)I")
	public int method275() {
		field709 += 2;
		int var1 = ((field708[field709 - 1] & 0xFF) << 8) + (field708[field709 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GLMIQHJI.m(I)I")
	public int method276() {
		field709 += 2;
		int var1 = ((field708[field709 - 1] & 0xFF) << 8) + (field708[field709 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GLMIQHJI.b(ZI)V")
	public void method277(int arg0) {
		field708[field709++] = (byte) (arg0 >> 16);
		field708[field709++] = (byte) (arg0 >> 24);
		field708[field709++] = (byte) arg0;
		field708[field709++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GLMIQHJI.n(I)I")
	public int method278() {
		field709 += 4;
		return (field708[field709 - 2] & 0xFF) + ((field708[field709 - 1] & 0xFF) << 8) + ((field708[field709 - 3] & 0xFF) << 24) + ((field708[field709 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("GLMIQHJI.a([BIII)V")
	public void method279(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field708[field709++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("GLMIQHJI.a(B[BII)V")
	public void method280(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = field708[field709++];
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

			field711[var0] = var1;
		}
	}
}
