package deob;

import java.math.BigInteger;

@ObfuscatedName("PGNBHFUF")
public final class PGNBHFUF extends RZDMTEAZ {

	@ObfuscatedName("PGNBHFUF.C")
	public byte[] field1081;

	@ObfuscatedName("PGNBHFUF.D")
	public int field1082;

	@ObfuscatedName("PGNBHFUF.F")
	public static int[] field1084 = new int[256];

	@ObfuscatedName("PGNBHFUF.G")
	public static final int[] field1085 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("PGNBHFUF.L")
	public static FEPBPONH field1090 = new FEPBPONH();

	@ObfuscatedName("PGNBHFUF.M")
	public static FEPBPONH field1091 = new FEPBPONH();

	@ObfuscatedName("PGNBHFUF.N")
	public static FEPBPONH field1092 = new FEPBPONH();

	@ObfuscatedName("PGNBHFUF.O")
	public static char[] field1093 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("PGNBHFUF.E")
	public int field1083;

	@ObfuscatedName("PGNBHFUF.I")
	public static int field1087;

	@ObfuscatedName("PGNBHFUF.J")
	public static int field1088;

	@ObfuscatedName("PGNBHFUF.K")
	public static int field1089;

	@ObfuscatedName("PGNBHFUF.H")
	public BDQVRRZB field1086;

	@ObfuscatedName("PGNBHFUF.a(BI)LPGNBHFUF;")
	public static PGNBHFUF method408(int arg0) {
		synchronized (field1091) {
			PGNBHFUF var2 = null;
			if (arg0 == 0 && field1087 > 0) {
				field1087--;
				var2 = (PGNBHFUF) field1090.method268();
			} else if (arg0 == 1 && field1088 > 0) {
				field1088--;
				var2 = (PGNBHFUF) field1091.method268();
			} else if (arg0 == 2 && field1089 > 0) {
				field1089--;
				var2 = (PGNBHFUF) field1092.method268();
			}

			if (var2 != null) {
				var2.field1082 = 0;
				return var2;
			}
		}

		PGNBHFUF var4 = new PGNBHFUF();
		var4.field1082 = 0;

		if (arg0 == 0) {
			var4.field1081 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1081 = new byte[5000];
		} else {
			var4.field1081 = new byte[30000];
		}

		return var4;
	}

	public PGNBHFUF() {
	}

	public PGNBHFUF(byte[] arg0) {
		field1081 = arg0;
		field1082 = 0;
	}

	@ObfuscatedName("PGNBHFUF.b(BI)V")
	public void method409(int arg0) {
		field1081[field1082++] = (byte) (arg0 + field1086.method51());
	}

	@ObfuscatedName("PGNBHFUF.a(I)V")
	public void method410(int arg0) {
		field1081[field1082++] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.b(I)V")
	public void method411(int arg0) {
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.a(II)V")
	public void method412(int arg0) {
		field1081[field1082++] = (byte) arg0;
		field1081[field1082++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PGNBHFUF.c(I)V")
	public void method413(int arg0) {
		field1081[field1082++] = (byte) (arg0 >> 16);
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.d(I)V")
	public void method414(int arg0) {
		field1081[field1082++] = (byte) (arg0 >> 24);
		field1081[field1082++] = (byte) (arg0 >> 16);
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.b(II)V")
	public void method415(int arg0) {
		field1081[field1082++] = (byte) arg0;
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) (arg0 >> 16);
		field1081[field1082++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("PGNBHFUF.a(IJ)V")
	public void method416(long arg0) {
		field1081[field1082++] = (byte) (arg0 >> 56);
		field1081[field1082++] = (byte) (arg0 >> 48);
		field1081[field1082++] = (byte) (arg0 >> 40);
		field1081[field1082++] = (byte) (arg0 >> 32);
		field1081[field1082++] = (byte) (arg0 >> 24);
		field1081[field1082++] = (byte) (arg0 >> 16);
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.a(Ljava/lang/String;)V")
	public void method417(String arg0) {
		arg0.getBytes(0, arg0.length(), field1081, field1082);
		field1082 += arg0.length();
		field1081[field1082++] = 10;
	}

	@ObfuscatedName("PGNBHFUF.a([BIIB)V")
	public void method418(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field1081[field1082++] = arg0[var4];
		}
	}

	@ObfuscatedName("PGNBHFUF.c(BI)V")
	public void method419(int arg0) {
		field1081[field1082 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("PGNBHFUF.c()I")
	public int method420() {
		return field1081[field1082++] & 0xFF;
	}

	@ObfuscatedName("PGNBHFUF.d()B")
	public byte method421() {
		return field1081[field1082++];
	}

	@ObfuscatedName("PGNBHFUF.e()I")
	public int method422() {
		field1082 += 2;
		return ((field1081[field1082 - 2] & 0xFF) << 8) + (field1081[field1082 - 1] & 0xFF);
	}

	@ObfuscatedName("PGNBHFUF.f()I")
	public int method423() {
		field1082 += 2;
		int var1 = ((field1081[field1082 - 2] & 0xFF) << 8) + (field1081[field1082 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PGNBHFUF.g()I")
	public int method424() {
		field1082 += 3;
		return (field1081[field1082 - 1] & 0xFF) + ((field1081[field1082 - 3] & 0xFF) << 16) + ((field1081[field1082 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("PGNBHFUF.h()I")
	public int method425() {
		field1082 += 4;
		return (field1081[field1082 - 1] & 0xFF) + ((field1081[field1082 - 2] & 0xFF) << 8) + ((field1081[field1082 - 4] & 0xFF) << 24) + ((field1081[field1082 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("PGNBHFUF.a(Z)J")
	public long method426() {
		long var1 = method425() & 0xFFFFFFFFL;
		long var3 = method425() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("PGNBHFUF.i()Ljava/lang/String;")
	public String method427() {
		int var1 = field1082;

		while (field1081[field1082++] != 10) {
		}

		return new String(field1081, var1, field1082 - var1 - 1);
	}

	@ObfuscatedName("PGNBHFUF.a(B)[B")
	public byte[] method428() {
		int var1 = field1082;

		while (field1081[field1082++] != 10) {
		}

		byte[] var2 = new byte[field1082 - var1 - 1];
		for (int var3 = var1; var3 < field1082 - 1; var3++) {
			var2[var3 - var1] = field1081[var3];
		}

		return var2;
	}

	@ObfuscatedName("PGNBHFUF.a([BIII)V")
	public void method429(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field1081[field1082++];
		}
	}

	@ObfuscatedName("PGNBHFUF.b(Z)V")
	public void method430() {
		field1083 = field1082 * 8;
	}

	@ObfuscatedName("PGNBHFUF.a(IZ)I")
	public int method431(int arg0) {
		int var2 = field1083 >> 3;
		int var3 = 8 - (field1083 & 0x7);
		int var4 = 0;
		field1083 += arg0;

		while (arg0 > var3) {
			var4 += (field1081[var2++] & field1085[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1081[var2] & field1085[var3];
		} else {
			var4 += field1081[var2] >> var3 - arg0 & field1085[arg0];
		}

		return var4;
	}

	@ObfuscatedName("PGNBHFUF.c(Z)V")
	public void method432() {
		field1082 = (field1083 + 7) / 8;
	}

	@ObfuscatedName("PGNBHFUF.j()I")
	public int method433() {
		int var1 = field1081[field1082] & 0xFF;
		if (var1 < 128) {
			return method420() - 64;
		}

		return method422() - 49152;
	}

	@ObfuscatedName("PGNBHFUF.k()I")
	public int method434() {
		int var1 = field1081[field1082] & 0xFF;
		if (var1 < 128) {
			return method420();
		}

		return method422() - 32768;
	}

	@ObfuscatedName("PGNBHFUF.a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method435(BigInteger arg0, BigInteger arg1) {
		int var3 = field1082;
		field1082 = 0;
		byte[] var4 = new byte[var3];
		method429(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1082 = 0;
		method410(var7.length);
		method418(var7, var7.length, 0);
	}

	@ObfuscatedName("PGNBHFUF.c(II)V")
	public void method436(int arg0) {
		field1081[field1082++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PGNBHFUF.b(IZ)V")
	public void method437(int arg0) {
		field1081[field1082++] = (byte) -arg0;
	}

	@ObfuscatedName("PGNBHFUF.d(Z)I")
	public int method438() {
		return field1081[field1082++] - 128 & 0xFF;
	}

	@ObfuscatedName("PGNBHFUF.e(I)I")
	public int method439() {
		return -field1081[field1082++] & 0xFF;
	}

	@ObfuscatedName("PGNBHFUF.f(I)I")
	public int method440() {
		return 128 - field1081[field1082++] & 0xFF;
	}

	@ObfuscatedName("PGNBHFUF.e(Z)B")
	public byte method441() {
		return (byte) (field1081[field1082++] - 128);
	}

	@ObfuscatedName("PGNBHFUF.f(Z)B")
	public byte method442() {
		return (byte) -field1081[field1082++];
	}

	@ObfuscatedName("PGNBHFUF.d(II)V")
	public void method443(int arg0) {
		field1081[field1082++] = (byte) arg0;
		field1081[field1082++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PGNBHFUF.c(IZ)V")
	public void method444(int arg0) {
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("PGNBHFUF.a(ZI)V")
	public void method445(int arg0) {
		field1081[field1082++] = (byte) (arg0 + 128);
		field1081[field1082++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("PGNBHFUF.g(I)I")
	public int method446() {
		field1082 += 2;
		return ((field1081[field1082 - 1] & 0xFF) << 8) + (field1081[field1082 - 2] & 0xFF);
	}

	@ObfuscatedName("PGNBHFUF.b(B)I")
	public int method447() {
		field1082 += 2;
		return ((field1081[field1082 - 2] & 0xFF) << 8) + (field1081[field1082 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("PGNBHFUF.g(Z)I")
	public int method448() {
		field1082 += 2;
		return ((field1081[field1082 - 1] & 0xFF) << 8) + (field1081[field1082 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("PGNBHFUF.c(B)I")
	public int method449() {
		field1082 += 2;
		int var1 = ((field1081[field1082 - 2] & 0xFF) << 8) + (field1081[field1082 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PGNBHFUF.d(B)I")
	public int method450() {
		field1082 += 2;
		int var1 = ((field1081[field1082 - 1] & 0xFF) << 8) + (field1081[field1082 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("PGNBHFUF.a(IB)V")
	public void method451(int arg0) {
		field1081[field1082++] = (byte) (arg0 >> 8);
		field1081[field1082++] = (byte) arg0;
		field1081[field1082++] = (byte) (arg0 >> 24);
		field1081[field1082++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("PGNBHFUF.h(Z)I")
	public int method452() {
		field1082 += 4;
		return (field1081[field1082 - 2] & 0xFF) + ((field1081[field1082 - 1] & 0xFF) << 8) + ((field1081[field1082 - 3] & 0xFF) << 24) + ((field1081[field1082 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("PGNBHFUF.a(I[BII)V")
	public void method453(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			field1081[field1082++] = arg1[var4];
		}
	}

	@ObfuscatedName("PGNBHFUF.a(I[BIB)V")
	public void method454(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = field1081[field1082++];
		}
	}

	@ObfuscatedName("PGNBHFUF.a(IBI[B)V")
	public void method455(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			arg2[var4] = (byte) (field1081[field1082++] - 128);
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

			field1084[var0] = var1;
		}
	}
}
