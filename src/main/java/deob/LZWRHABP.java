package deob;

import java.math.BigInteger;

@ObfuscatedName("LZWRHABP")
public final class LZWRHABP extends NZLAJIAU {

	@ObfuscatedName("LZWRHABP.y")
	public byte[] field1138;

	@ObfuscatedName("LZWRHABP.z")
	public int field1139;

	@ObfuscatedName("LZWRHABP.B")
	public static int[] field1141 = new int[256];

	@ObfuscatedName("LZWRHABP.C")
	public static final int[] field1142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("LZWRHABP.H")
	public static JSAXNSIH field1147 = new JSAXNSIH();

	@ObfuscatedName("LZWRHABP.I")
	public static JSAXNSIH field1148 = new JSAXNSIH();

	@ObfuscatedName("LZWRHABP.J")
	public static JSAXNSIH field1149 = new JSAXNSIH();

	@ObfuscatedName("LZWRHABP.K")
	public static char[] field1150 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("LZWRHABP.A")
	public int field1140;

	@ObfuscatedName("LZWRHABP.E")
	public static int field1144;

	@ObfuscatedName("LZWRHABP.F")
	public static int field1145;

	@ObfuscatedName("LZWRHABP.G")
	public static int field1146;

	@ObfuscatedName("LZWRHABP.D")
	public INEPYSAC field1143;

	@ObfuscatedName("LZWRHABP.a(IB)LLZWRHABP;")
	public static LZWRHABP method451(int arg0) {
		synchronized (field1148) {
			LZWRHABP var2 = null;
			if (arg0 == 0 && field1144 > 0) {
				field1144--;
				var2 = (LZWRHABP) field1147.method401();
			} else if (arg0 == 1 && field1145 > 0) {
				field1145--;
				var2 = (LZWRHABP) field1148.method401();
			} else if (arg0 == 2 && field1146 > 0) {
				field1146--;
				var2 = (LZWRHABP) field1149.method401();
			}

			if (var2 != null) {
				var2.field1139 = 0;
				return var2;
			}
		}

		LZWRHABP var4 = new LZWRHABP();
		var4.field1139 = 0;

		if (arg0 == 0) {
			var4.field1138 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1138 = new byte[5000];
		} else {
			var4.field1138 = new byte[30000];
		}

		return var4;
	}

	public LZWRHABP() {
	}

	public LZWRHABP(byte[] arg0) {
		field1138 = arg0;
		field1139 = 0;
	}

	@ObfuscatedName("LZWRHABP.a(II)V")
	public void method452(int arg0) {
		field1138[field1139++] = (byte) (arg0 + field1143.method379());
	}

	@ObfuscatedName("LZWRHABP.a(I)V")
	public void method453(int arg0) {
		field1138[field1139++] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.b(I)V")
	public void method454(int arg0) {
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.a(BI)V")
	public void method455(int arg0) {
		field1138[field1139++] = (byte) arg0;
		field1138[field1139++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LZWRHABP.c(I)V")
	public void method456(int arg0) {
		field1138[field1139++] = (byte) (arg0 >> 16);
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.d(I)V")
	public void method457(int arg0) {
		field1138[field1139++] = (byte) (arg0 >> 24);
		field1138[field1139++] = (byte) (arg0 >> 16);
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.b(II)V")
	public void method458(int arg0) {
		field1138[field1139++] = (byte) arg0;
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) (arg0 >> 16);
		field1138[field1139++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("LZWRHABP.a(IJ)V")
	public void method459(long arg0) {
		field1138[field1139++] = (byte) (arg0 >> 56);
		field1138[field1139++] = (byte) (arg0 >> 48);
		field1138[field1139++] = (byte) (arg0 >> 40);
		field1138[field1139++] = (byte) (arg0 >> 32);
		field1138[field1139++] = (byte) (arg0 >> 24);
		field1138[field1139++] = (byte) (arg0 >> 16);
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.a(Ljava/lang/String;)V")
	public void method460(String arg0) {
		arg0.getBytes(0, arg0.length(), field1138, field1139);
		field1139 += arg0.length();
		field1138[field1139++] = 10;
	}

	@ObfuscatedName("LZWRHABP.a(II[BI)V")
	public void method461(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field1138[field1139++] = arg1[var4];
		}
	}

	@ObfuscatedName("LZWRHABP.b(BI)V")
	public void method462(int arg0) {
		field1138[field1139 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("LZWRHABP.c()I")
	public int method463() {
		return field1138[field1139++] & 0xFF;
	}

	@ObfuscatedName("LZWRHABP.d()B")
	public byte method464() {
		return field1138[field1139++];
	}

	@ObfuscatedName("LZWRHABP.e()I")
	public int method465() {
		field1139 += 2;
		return ((field1138[field1139 - 2] & 0xFF) << 8) + (field1138[field1139 - 1] & 0xFF);
	}

	@ObfuscatedName("LZWRHABP.f()I")
	public int method466() {
		field1139 += 2;
		int var1 = ((field1138[field1139 - 2] & 0xFF) << 8) + (field1138[field1139 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LZWRHABP.g()I")
	public int method467() {
		field1139 += 3;
		return (field1138[field1139 - 1] & 0xFF) + ((field1138[field1139 - 3] & 0xFF) << 16) + ((field1138[field1139 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("LZWRHABP.h()I")
	public int method468() {
		field1139 += 4;
		return (field1138[field1139 - 1] & 0xFF) + ((field1138[field1139 - 2] & 0xFF) << 8) + ((field1138[field1139 - 4] & 0xFF) << 24) + ((field1138[field1139 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("LZWRHABP.e(I)J")
	public long method469() {
		long var1 = method468() & 0xFFFFFFFFL;
		long var3 = method468() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("LZWRHABP.i()Ljava/lang/String;")
	public String method470() {
		int var1 = field1139;

		while (field1138[field1139++] != 10) {
		}

		return new String(field1138, var1, field1139 - var1 - 1);
	}

	@ObfuscatedName("LZWRHABP.f(I)[B")
	public byte[] method471() {
		int var1 = field1139;

		while (field1138[field1139++] != 10) {
		}

		byte[] var2 = new byte[field1139 - var1 - 1];
		for (int var3 = var1; var3 < field1139 - 1; var3++) {
			var2[var3 - var1] = field1138[var3];
		}

		return var2;
	}

	@ObfuscatedName("LZWRHABP.a(I[BIB)V")
	public void method472(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1138[field1139++];
		}
	}

	@ObfuscatedName("LZWRHABP.a(B)V")
	public void method473() {
		field1140 = field1139 * 8;
	}

	@ObfuscatedName("LZWRHABP.c(II)I")
	public int method474(int arg0) {
		int var2 = field1140 >> 3;
		int var3 = 8 - (field1140 & 0x7);
		int var4 = 0;
		field1140 += arg0;

		while (arg0 > var3) {
			var4 += (field1138[var2++] & field1142[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1138[var2] & field1142[var3];
		} else {
			var4 += field1138[var2] >> var3 - arg0 & field1142[arg0];
		}

		return var4;
	}

	@ObfuscatedName("LZWRHABP.g(I)V")
	public void method475() {
		field1139 = (field1140 + 7) / 8;
	}

	@ObfuscatedName("LZWRHABP.j()I")
	public int method476() {
		int var1 = field1138[field1139] & 0xFF;
		if (var1 < 128) {
			return method463() - 64;
		}

		return method465() - 49152;
	}

	@ObfuscatedName("LZWRHABP.k()I")
	public int method477() {
		int var1 = field1138[field1139] & 0xFF;
		if (var1 < 128) {
			return method463();
		}

		return method465() - 32768;
	}

	@ObfuscatedName("LZWRHABP.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method478(BigInteger arg0, BigInteger arg1) {
		int var3 = field1139;
		field1139 = 0;
		byte[] var4 = new byte[var3];
		method472(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field1139 = 0;
		method453(var7.length);
		method461(0, var7, var7.length);
	}

	@ObfuscatedName("LZWRHABP.d(II)V")
	public void method479(int arg0) {
		field1138[field1139++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("LZWRHABP.e(II)V")
	public void method480(int arg0) {
		field1138[field1139++] = (byte) -arg0;
	}

	@ObfuscatedName("LZWRHABP.a(ZI)V")
	public void method481(int arg0) {
		field1138[field1139++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("LZWRHABP.h(I)I")
	public int method482() {
		return field1138[field1139++] - 128 & 0xFF;
	}

	@ObfuscatedName("LZWRHABP.i(I)I")
	public int method483() {
		return -field1138[field1139++] & 0xFF;
	}

	@ObfuscatedName("LZWRHABP.a(Z)I")
	public int method484() {
		return 128 - field1138[field1139++] & 0xFF;
	}

	@ObfuscatedName("LZWRHABP.j(I)B")
	public byte method485() {
		return (byte) (field1138[field1139++] - 128);
	}

	@ObfuscatedName("LZWRHABP.b(Z)B")
	public byte method486() {
		return (byte) -field1138[field1139++];
	}

	@ObfuscatedName("LZWRHABP.c(Z)B")
	public byte method487() {
		return (byte) (128 - field1138[field1139++]);
	}

	@ObfuscatedName("LZWRHABP.a(IZ)V")
	public void method488(int arg0) {
		field1138[field1139++] = (byte) arg0;
		field1138[field1139++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LZWRHABP.c(BI)V")
	public void method489(int arg0) {
		field1138[field1139++] = (byte) (arg0 >> 8);
		field1138[field1139++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("LZWRHABP.b(IB)V")
	public void method490(int arg0) {
		field1138[field1139++] = (byte) (arg0 + 128);
		field1138[field1139++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LZWRHABP.k(I)I")
	public int method491() {
		field1139 += 2;
		return ((field1138[field1139 - 1] & 0xFF) << 8) + (field1138[field1139 - 2] & 0xFF);
	}

	@ObfuscatedName("LZWRHABP.l(I)I")
	public int method492() {
		field1139 += 2;
		return ((field1138[field1139 - 2] & 0xFF) << 8) + (field1138[field1139 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("LZWRHABP.d(Z)I")
	public int method493() {
		field1139 += 2;
		return ((field1138[field1139 - 1] & 0xFF) << 8) + (field1138[field1139 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("LZWRHABP.e(Z)I")
	public int method494() {
		field1139 += 2;
		int var1 = ((field1138[field1139 - 1] & 0xFF) << 8) + (field1138[field1139 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LZWRHABP.b(B)I")
	public int method495() {
		field1139 += 2;
		int var1 = ((field1138[field1139 - 1] & 0xFF) << 8) + (field1138[field1139 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("LZWRHABP.f(Z)I")
	public int method496() {
		field1139 += 3;
		return (field1138[field1139 - 3] & 0xFF) + ((field1138[field1139 - 1] & 0xFF) << 16) + ((field1138[field1139 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("LZWRHABP.f(II)V")
	public void method497(int arg0) {
		field1138[field1139++] = (byte) (arg0 >> 16);
		field1138[field1139++] = (byte) (arg0 >> 24);
		field1138[field1139++] = (byte) arg0;
		field1138[field1139++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("LZWRHABP.g(Z)I")
	public int method498() {
		field1139 += 4;
		return (field1138[field1139 - 4] & 0xFF) + ((field1138[field1139 - 3] & 0xFF) << 8) + ((field1138[field1139 - 1] & 0xFF) << 24) + ((field1138[field1139 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("LZWRHABP.c(B)I")
	public int method499() {
		field1139 += 4;
		return (field1138[field1139 - 3] & 0xFF) + ((field1138[field1139 - 4] & 0xFF) << 8) + ((field1138[field1139 - 2] & 0xFF) << 24) + ((field1138[field1139 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("LZWRHABP.m(I)I")
	public int method500() {
		field1139 += 4;
		return (field1138[field1139 - 2] & 0xFF) + ((field1138[field1139 - 1] & 0xFF) << 8) + ((field1138[field1139 - 3] & 0xFF) << 24) + ((field1138[field1139 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("LZWRHABP.a(I[BII)V")
	public void method501(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = field1138[field1139++];
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

			field1141[var0] = var1;
		}
	}
}
