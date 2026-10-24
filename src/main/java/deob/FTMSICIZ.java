package deob;

import java.math.BigInteger;

@ObfuscatedName("FTMSICIZ")
public final class FTMSICIZ extends EDVKOEOK {

	@ObfuscatedName("FTMSICIZ.A")
	public byte[] field534;

	@ObfuscatedName("FTMSICIZ.B")
	public int field535;

	@ObfuscatedName("FTMSICIZ.D")
	public static int[] field537 = new int[256];

	@ObfuscatedName("FTMSICIZ.E")
	public static final int[] field538 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("FTMSICIZ.J")
	public static QGWIBVPG field543 = new QGWIBVPG();

	@ObfuscatedName("FTMSICIZ.K")
	public static QGWIBVPG field544 = new QGWIBVPG();

	@ObfuscatedName("FTMSICIZ.L")
	public static QGWIBVPG field545 = new QGWIBVPG();

	@ObfuscatedName("FTMSICIZ.M")
	public static char[] field546 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("FTMSICIZ.C")
	public int field536;

	@ObfuscatedName("FTMSICIZ.G")
	public static int field540;

	@ObfuscatedName("FTMSICIZ.H")
	public static int field541;

	@ObfuscatedName("FTMSICIZ.I")
	public static int field542;

	@ObfuscatedName("FTMSICIZ.F")
	public YEQNFKYU field539;

	@ObfuscatedName("FTMSICIZ.a(II)LFTMSICIZ;")
	public static FTMSICIZ method201(int arg0) {
		synchronized (field544) {
			FTMSICIZ var2 = null;
			if (arg0 == 0 && field540 > 0) {
				field540--;
				var2 = (FTMSICIZ) field543.method421();
			} else if (arg0 == 1 && field541 > 0) {
				field541--;
				var2 = (FTMSICIZ) field544.method421();
			} else if (arg0 == 2 && field542 > 0) {
				field542--;
				var2 = (FTMSICIZ) field545.method421();
			}

			if (var2 != null) {
				var2.field535 = 0;
				return var2;
			}
		}

		FTMSICIZ var4 = new FTMSICIZ();
		var4.field535 = 0;

		if (arg0 == 0) {
			var4.field534 = new byte[100];
		} else if (arg0 == 1) {
			var4.field534 = new byte[5000];
		} else {
			var4.field534 = new byte[30000];
		}

		return var4;
	}

	public FTMSICIZ() {
	}

	public FTMSICIZ(byte[] arg0) {
		field534 = arg0;
		field535 = 0;
	}

	@ObfuscatedName("FTMSICIZ.a(BI)V")
	public void method202(int arg0) {
		field534[field535++] = (byte) (arg0 + field539.method544());
	}

	@ObfuscatedName("FTMSICIZ.a(I)V")
	public void method203(int arg0) {
		field534[field535++] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.b(I)V")
	public void method204(int arg0) {
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.b(II)V")
	public void method205(int arg0) {
		field534[field535++] = (byte) arg0;
		field534[field535++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("FTMSICIZ.c(I)V")
	public void method206(int arg0) {
		field534[field535++] = (byte) (arg0 >> 16);
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.d(I)V")
	public void method207(int arg0) {
		field534[field535++] = (byte) (arg0 >> 24);
		field534[field535++] = (byte) (arg0 >> 16);
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.a(ZI)V")
	public void method208(int arg0) {
		field534[field535++] = (byte) arg0;
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) (arg0 >> 16);
		field534[field535++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("FTMSICIZ.a(JB)V")
	public void method209(long arg0) {
		field534[field535++] = (byte) (arg0 >> 56);
		field534[field535++] = (byte) (arg0 >> 48);
		field534[field535++] = (byte) (arg0 >> 40);
		field534[field535++] = (byte) (arg0 >> 32);
		field534[field535++] = (byte) (arg0 >> 24);
		field534[field535++] = (byte) (arg0 >> 16);
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.a(Ljava/lang/String;)V")
	public void method210(String arg0) {
		arg0.getBytes(0, arg0.length(), field534, field535);
		field535 += arg0.length();
		field534[field535++] = 10;
	}

	@ObfuscatedName("FTMSICIZ.a(II[BI)V")
	public void method211(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field534[field535++] = arg1[var4];
		}
	}

	@ObfuscatedName("FTMSICIZ.b(ZI)V")
	public void method212(int arg0) {
		field534[field535 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("FTMSICIZ.c()I")
	public int method213() {
		return field534[field535++] & 0xFF;
	}

	@ObfuscatedName("FTMSICIZ.d()B")
	public byte method214() {
		return field534[field535++];
	}

	@ObfuscatedName("FTMSICIZ.e()I")
	public int method215() {
		field535 += 2;
		return ((field534[field535 - 2] & 0xFF) << 8) + (field534[field535 - 1] & 0xFF);
	}

	@ObfuscatedName("FTMSICIZ.f()I")
	public int method216() {
		field535 += 2;
		int var1 = ((field534[field535 - 2] & 0xFF) << 8) + (field534[field535 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("FTMSICIZ.g()I")
	public int method217() {
		field535 += 3;
		return (field534[field535 - 1] & 0xFF) + ((field534[field535 - 3] & 0xFF) << 16) + ((field534[field535 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("FTMSICIZ.h()I")
	public int method218() {
		field535 += 4;
		return (field534[field535 - 1] & 0xFF) + ((field534[field535 - 2] & 0xFF) << 8) + ((field534[field535 - 4] & 0xFF) << 24) + ((field534[field535 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("FTMSICIZ.a(Z)J")
	public long method219() {
		long var1 = method218() & 0xFFFFFFFFL;
		long var3 = method218() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("FTMSICIZ.i()Ljava/lang/String;")
	public String method220() {
		int var1 = field535;

		while (field534[field535++] != 10) {
		}

		return new String(field534, var1, field535 - var1 - 1);
	}

	@ObfuscatedName("FTMSICIZ.e(I)[B")
	public byte[] method221() {
		int var1 = field535;

		while (field534[field535++] != 10) {
		}

		byte[] var2 = new byte[field535 - var1 - 1];
		for (int var3 = var1; var3 < field535 - 1; var3++) {
			var2[var3 - var1] = field534[var3];
		}

		return var2;
	}

	@ObfuscatedName("FTMSICIZ.a(I[BII)V")
	public void method222(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field534[field535++];
		}
	}

	@ObfuscatedName("FTMSICIZ.f(I)V")
	public void method223() {
		field536 = field535 * 8;
	}

	@ObfuscatedName("FTMSICIZ.c(II)I")
	public int method224(int arg0) {
		int var2 = field536 >> 3;
		int var3 = 8 - (field536 & 0x7);
		int var4 = 0;
		field536 += arg0;

		while (arg0 > var3) {
			var4 += (field534[var2++] & field538[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field534[var2] & field538[var3];
		} else {
			var4 += field534[var2] >> var3 - arg0 & field538[arg0];
		}

		return var4;
	}

	@ObfuscatedName("FTMSICIZ.g(I)V")
	public void method225() {
		field535 = (field536 + 7) / 8;
	}

	@ObfuscatedName("FTMSICIZ.j()I")
	public int method226() {
		int var1 = field534[field535] & 0xFF;
		if (var1 < 128) {
			return method213() - 64;
		}

		return method215() - 49152;
	}

	@ObfuscatedName("FTMSICIZ.k()I")
	public int method227() {
		int var1 = field534[field535] & 0xFF;
		if (var1 < 128) {
			return method213();
		}

		return method215() - 32768;
	}

	@ObfuscatedName("FTMSICIZ.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method228(BigInteger arg0, BigInteger arg1) {
		int var3 = field535;
		field535 = 0;
		byte[] var4 = new byte[var3];
		method222(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field535 = 0;
		method203(var7.length);
		method211(0, var7, var7.length);
	}

	@ObfuscatedName("FTMSICIZ.d(II)V")
	public void method229(int arg0) {
		field534[field535++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("FTMSICIZ.c(ZI)V")
	public void method230(int arg0) {
		field534[field535++] = (byte) -arg0;
	}

	@ObfuscatedName("FTMSICIZ.e(II)V")
	public void method231(int arg0) {
		field534[field535++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("FTMSICIZ.h(I)I")
	public int method232() {
		return field534[field535++] - 128 & 0xFF;
	}

	@ObfuscatedName("FTMSICIZ.i(I)I")
	public int method233() {
		return -field534[field535++] & 0xFF;
	}

	@ObfuscatedName("FTMSICIZ.b(Z)I")
	public int method234() {
		return 128 - field534[field535++] & 0xFF;
	}

	@ObfuscatedName("FTMSICIZ.c(Z)B")
	public byte method235() {
		return (byte) (field534[field535++] - 128);
	}

	@ObfuscatedName("FTMSICIZ.j(I)B")
	public byte method236() {
		return (byte) -field534[field535++];
	}

	@ObfuscatedName("FTMSICIZ.d(Z)B")
	public byte method237() {
		return (byte) (128 - field534[field535++]);
	}

	@ObfuscatedName("FTMSICIZ.a(IB)V")
	public void method238(int arg0) {
		field534[field535++] = (byte) arg0;
		field534[field535++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("FTMSICIZ.f(II)V")
	public void method239(int arg0) {
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("FTMSICIZ.g(II)V")
	public void method240(int arg0) {
		field534[field535++] = (byte) (arg0 + 128);
		field534[field535++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("FTMSICIZ.k(I)I")
	public int method241() {
		field535 += 2;
		return ((field534[field535 - 1] & 0xFF) << 8) + (field534[field535 - 2] & 0xFF);
	}

	@ObfuscatedName("FTMSICIZ.l(I)I")
	public int method242() {
		field535 += 2;
		return ((field534[field535 - 2] & 0xFF) << 8) + (field534[field535 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("FTMSICIZ.a(B)I")
	public int method243() {
		field535 += 2;
		return ((field534[field535 - 1] & 0xFF) << 8) + (field534[field535 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("FTMSICIZ.m(I)I")
	public int method244() {
		field535 += 2;
		int var1 = ((field534[field535 - 2] & 0xFF) << 8) + (field534[field535 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("FTMSICIZ.b(B)I")
	public int method245() {
		field535 += 2;
		int var1 = ((field534[field535 - 1] & 0xFF) << 8) + (field534[field535 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("FTMSICIZ.n(I)I")
	public int method246() {
		field535 += 3;
		return (field534[field535 - 3] & 0xFF) + ((field534[field535 - 1] & 0xFF) << 16) + ((field534[field535 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("FTMSICIZ.h(II)V")
	public void method247(int arg0) {
		field534[field535++] = (byte) (arg0 >> 8);
		field534[field535++] = (byte) arg0;
		field534[field535++] = (byte) (arg0 >> 24);
		field534[field535++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("FTMSICIZ.c(B)I")
	public int method248() {
		field535 += 4;
		return (field534[field535 - 4] & 0xFF) + ((field534[field535 - 3] & 0xFF) << 8) + ((field534[field535 - 1] & 0xFF) << 24) + ((field534[field535 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("FTMSICIZ.o(I)I")
	public int method249() {
		field535 += 4;
		return (field534[field535 - 3] & 0xFF) + ((field534[field535 - 4] & 0xFF) << 8) + ((field534[field535 - 2] & 0xFF) << 24) + ((field534[field535 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("FTMSICIZ.p(I)I")
	public int method250() {
		field535 += 4;
		return (field534[field535 - 2] & 0xFF) + ((field534[field535 - 1] & 0xFF) << 8) + ((field534[field535 - 3] & 0xFF) << 24) + ((field534[field535 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("FTMSICIZ.a(II[BB)V")
	public void method251(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			field534[field535++] = (byte) (arg2[var4] + 128);
		}
	}

	@ObfuscatedName("FTMSICIZ.b(II[BI)V")
	public void method252(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = field534[field535++];
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

			field537[var0] = var1;
		}
	}
}
