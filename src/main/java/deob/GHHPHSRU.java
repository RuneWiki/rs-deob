package deob;

import java.math.BigInteger;

@ObfuscatedName("GHHPHSRU")
public final class GHHPHSRU extends OGGHOMII {

	@ObfuscatedName("GHHPHSRU.A")
	public byte[] field666;

	@ObfuscatedName("GHHPHSRU.B")
	public int field667;

	@ObfuscatedName("GHHPHSRU.D")
	public static int[] field669 = new int[256];

	@ObfuscatedName("GHHPHSRU.E")
	public static final int[] field670 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("GHHPHSRU.J")
	public static VYBZTNTY field675 = new VYBZTNTY();

	@ObfuscatedName("GHHPHSRU.K")
	public static VYBZTNTY field676 = new VYBZTNTY();

	@ObfuscatedName("GHHPHSRU.L")
	public static VYBZTNTY field677 = new VYBZTNTY();

	@ObfuscatedName("GHHPHSRU.M")
	public static char[] field678 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("GHHPHSRU.C")
	public int field668;

	@ObfuscatedName("GHHPHSRU.G")
	public static int field672;

	@ObfuscatedName("GHHPHSRU.H")
	public static int field673;

	@ObfuscatedName("GHHPHSRU.I")
	public static int field674;

	@ObfuscatedName("GHHPHSRU.F")
	public WBHAMUQI field671;

	@ObfuscatedName("GHHPHSRU.a(II)LGHHPHSRU;")
	public static GHHPHSRU method190(int arg0) {
		synchronized (field676) {
			GHHPHSRU var2 = null;
			if (arg0 == 0 && field672 > 0) {
				field672--;
				var2 = (GHHPHSRU) field675.method518();
			} else if (arg0 == 1 && field673 > 0) {
				field673--;
				var2 = (GHHPHSRU) field676.method518();
			} else if (arg0 == 2 && field674 > 0) {
				field674--;
				var2 = (GHHPHSRU) field677.method518();
			}

			if (var2 != null) {
				var2.field667 = 0;
				return var2;
			}
		}

		GHHPHSRU var4 = new GHHPHSRU();
		var4.field667 = 0;

		if (arg0 == 0) {
			var4.field666 = new byte[100];
		} else if (arg0 == 1) {
			var4.field666 = new byte[5000];
		} else {
			var4.field666 = new byte[30000];
		}

		return var4;
	}

	public GHHPHSRU() {
	}

	public GHHPHSRU(byte[] arg0) {
		field666 = arg0;
		field667 = 0;
	}

	@ObfuscatedName("GHHPHSRU.a(ZI)V")
	public void method191(int arg0) {
		field666[field667++] = (byte) (arg0 + field671.method533());
	}

	@ObfuscatedName("GHHPHSRU.a(I)V")
	public void method192(int arg0) {
		field666[field667++] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.b(I)V")
	public void method193(int arg0) {
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.b(II)V")
	public void method194(int arg0) {
		field666[field667++] = (byte) arg0;
		field666[field667++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GHHPHSRU.c(I)V")
	public void method195(int arg0) {
		field666[field667++] = (byte) (arg0 >> 16);
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.d(I)V")
	public void method196(int arg0) {
		field666[field667++] = (byte) (arg0 >> 24);
		field666[field667++] = (byte) (arg0 >> 16);
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.a(BI)V")
	public void method197(int arg0) {
		field666[field667++] = (byte) arg0;
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) (arg0 >> 16);
		field666[field667++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("GHHPHSRU.a(JI)V")
	public void method198(long arg0) {
		field666[field667++] = (byte) (arg0 >> 56);
		field666[field667++] = (byte) (arg0 >> 48);
		field666[field667++] = (byte) (arg0 >> 40);
		field666[field667++] = (byte) (arg0 >> 32);
		field666[field667++] = (byte) (arg0 >> 24);
		field666[field667++] = (byte) (arg0 >> 16);
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.a(Ljava/lang/String;)V")
	public void method199(String arg0) {
		arg0.getBytes(0, arg0.length(), field666, field667);
		field667 += arg0.length();
		field666[field667++] = 10;
	}

	@ObfuscatedName("GHHPHSRU.a([BIII)V")
	public void method200(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field666[field667++] = arg0[var4];
		}
	}

	@ObfuscatedName("GHHPHSRU.c(II)V")
	public void method201(int arg0) {
		field666[field667 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("GHHPHSRU.c()I")
	public int method202() {
		return field666[field667++] & 0xFF;
	}

	@ObfuscatedName("GHHPHSRU.d()B")
	public byte method203() {
		return field666[field667++];
	}

	@ObfuscatedName("GHHPHSRU.e()I")
	public int method204() {
		field667 += 2;
		return ((field666[field667 - 2] & 0xFF) << 8) + (field666[field667 - 1] & 0xFF);
	}

	@ObfuscatedName("GHHPHSRU.f()I")
	public int method205() {
		field667 += 2;
		int var1 = ((field666[field667 - 2] & 0xFF) << 8) + (field666[field667 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GHHPHSRU.g()I")
	public int method206() {
		field667 += 3;
		return (field666[field667 - 1] & 0xFF) + ((field666[field667 - 3] & 0xFF) << 16) + ((field666[field667 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("GHHPHSRU.h()I")
	public int method207() {
		field667 += 4;
		return (field666[field667 - 1] & 0xFF) + ((field666[field667 - 2] & 0xFF) << 8) + ((field666[field667 - 4] & 0xFF) << 24) + ((field666[field667 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("GHHPHSRU.a(B)J")
	public long method208() {
		long var1 = method207() & 0xFFFFFFFFL;
		long var3 = method207() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("GHHPHSRU.i()Ljava/lang/String;")
	public String method209() {
		int var1 = field667;

		while (field666[field667++] != 10) {
		}

		return new String(field666, var1, field667 - var1 - 1);
	}

	@ObfuscatedName("GHHPHSRU.e(I)[B")
	public byte[] method210() {
		int var1 = field667;

		while (field666[field667++] != 10) {
		}

		byte[] var2 = new byte[field667 - var1 - 1];
		for (int var3 = var1; var3 < field667 - 1; var3++) {
			var2[var3 - var1] = field666[var3];
		}

		return var2;
	}

	@ObfuscatedName("GHHPHSRU.a(II[BI)V")
	public void method211(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field666[field667++];
		}
	}

	@ObfuscatedName("GHHPHSRU.a(Z)V")
	public void method212() {
		field668 = field667 * 8;
	}

	@ObfuscatedName("GHHPHSRU.d(II)I")
	public int method213(int arg0) {
		int var2 = field668 >> 3;
		int var3 = 8 - (field668 & 0x7);
		int var4 = 0;
		field668 += arg0;

		while (arg0 > var3) {
			var4 += (field666[var2++] & field670[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field666[var2] & field670[var3];
		} else {
			var4 += field666[var2] >> var3 - arg0 & field670[arg0];
		}

		return var4;
	}

	@ObfuscatedName("GHHPHSRU.f(I)V")
	public void method214() {
		field667 = (field668 + 7) / 8;
	}

	@ObfuscatedName("GHHPHSRU.j()I")
	public int method215() {
		int var1 = field666[field667] & 0xFF;
		if (var1 < 128) {
			return method202() - 64;
		}

		return method204() - 49152;
	}

	@ObfuscatedName("GHHPHSRU.k()I")
	public int method216() {
		int var1 = field666[field667] & 0xFF;
		if (var1 < 128) {
			return method202();
		}

		return method204() - 32768;
	}

	@ObfuscatedName("GHHPHSRU.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method217(BigInteger arg0, BigInteger arg1) {
		int var3 = field667;
		field667 = 0;
		byte[] var4 = new byte[var3];
		method211(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field667 = 0;
		method192(var7.length);
		method200(var7, 0, var7.length);
	}

	@ObfuscatedName("GHHPHSRU.e(II)V")
	public void method218(int arg0) {
		field666[field667++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("GHHPHSRU.f(II)V")
	public void method219(int arg0) {
		field666[field667++] = (byte) -arg0;
	}

	@ObfuscatedName("GHHPHSRU.a(IZ)V")
	public void method220(int arg0) {
		field666[field667++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("GHHPHSRU.b(B)I")
	public int method221() {
		return field666[field667++] - 128 & 0xFF;
	}

	@ObfuscatedName("GHHPHSRU.g(I)I")
	public int method222() {
		return -field666[field667++] & 0xFF;
	}

	@ObfuscatedName("GHHPHSRU.c(B)I")
	public int method223() {
		return 128 - field666[field667++] & 0xFF;
	}

	@ObfuscatedName("GHHPHSRU.h(I)B")
	public byte method224() {
		return (byte) -field666[field667++];
	}

	@ObfuscatedName("GHHPHSRU.d(B)B")
	public byte method225() {
		return (byte) (128 - field666[field667++]);
	}

	@ObfuscatedName("GHHPHSRU.g(II)V")
	public void method226(int arg0) {
		field666[field667++] = (byte) arg0;
		field666[field667++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GHHPHSRU.h(II)V")
	public void method227(int arg0) {
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("GHHPHSRU.i(II)V")
	public void method228(int arg0) {
		field666[field667++] = (byte) (arg0 + 128);
		field666[field667++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("GHHPHSRU.e(B)I")
	public int method229() {
		field667 += 2;
		return ((field666[field667 - 1] & 0xFF) << 8) + (field666[field667 - 2] & 0xFF);
	}

	@ObfuscatedName("GHHPHSRU.i(I)I")
	public int method230() {
		field667 += 2;
		return ((field666[field667 - 2] & 0xFF) << 8) + (field666[field667 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("GHHPHSRU.j(I)I")
	public int method231() {
		field667 += 2;
		return ((field666[field667 - 1] & 0xFF) << 8) + (field666[field667 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("GHHPHSRU.k(I)I")
	public int method232() {
		field667 += 2;
		int var1 = ((field666[field667 - 1] & 0xFF) << 8) + (field666[field667 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GHHPHSRU.b(Z)I")
	public int method233() {
		field667 += 2;
		int var1 = ((field666[field667 - 2] & 0xFF) << 8) + (field666[field667 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("GHHPHSRU.f(B)I")
	public int method234() {
		field667 += 3;
		return (field666[field667 - 3] & 0xFF) + ((field666[field667 - 1] & 0xFF) << 16) + ((field666[field667 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("GHHPHSRU.b(IZ)V")
	public void method235(int arg0) {
		field666[field667++] = (byte) (arg0 >> 8);
		field666[field667++] = (byte) arg0;
		field666[field667++] = (byte) (arg0 >> 24);
		field666[field667++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("GHHPHSRU.g(B)I")
	public int method236() {
		field667 += 4;
		return (field666[field667 - 4] & 0xFF) + ((field666[field667 - 3] & 0xFF) << 8) + ((field666[field667 - 1] & 0xFF) << 24) + ((field666[field667 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("GHHPHSRU.h(B)I")
	public int method237() {
		field667 += 4;
		return (field666[field667 - 2] & 0xFF) + ((field666[field667 - 1] & 0xFF) << 8) + ((field666[field667 - 3] & 0xFF) << 24) + ((field666[field667 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("GHHPHSRU.a([BIIB)V")
	public void method238(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field666[field667++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("GHHPHSRU.b(II[BI)V")
	public void method239(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field666[field667++];
		}
	}

	@ObfuscatedName("GHHPHSRU.a(IIZ[B)V")
	public void method240(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = (byte) (field666[field667++] - 128);
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

			field669[var0] = var1;
		}
	}
}
