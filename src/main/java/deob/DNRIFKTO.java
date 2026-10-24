package deob;

import java.math.BigInteger;

@ObfuscatedName("DNRIFKTO")
public final class DNRIFKTO extends NFNHZJTP {

	@ObfuscatedName("DNRIFKTO.x")
	public byte[] field562;

	@ObfuscatedName("DNRIFKTO.y")
	public int field563;

	@ObfuscatedName("DNRIFKTO.A")
	public static int[] field565 = new int[256];

	@ObfuscatedName("DNRIFKTO.B")
	public static final int[] field566 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("DNRIFKTO.G")
	public static ZCVCEQHJ field571 = new ZCVCEQHJ();

	@ObfuscatedName("DNRIFKTO.H")
	public static ZCVCEQHJ field572 = new ZCVCEQHJ();

	@ObfuscatedName("DNRIFKTO.I")
	public static ZCVCEQHJ field573 = new ZCVCEQHJ();

	@ObfuscatedName("DNRIFKTO.J")
	public static char[] field574 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("DNRIFKTO.z")
	public int field564;

	@ObfuscatedName("DNRIFKTO.D")
	public static int field568;

	@ObfuscatedName("DNRIFKTO.E")
	public static int field569;

	@ObfuscatedName("DNRIFKTO.F")
	public static int field570;

	@ObfuscatedName("DNRIFKTO.C")
	public GOLMSHHL field567;

	@ObfuscatedName("DNRIFKTO.a(II)LDNRIFKTO;")
	public static DNRIFKTO method177(int arg0) {
		synchronized (field572) {
			DNRIFKTO var2 = null;
			if (arg0 == 0 && field568 > 0) {
				field568--;
				var2 = (DNRIFKTO) field571.method591();
			} else if (arg0 == 1 && field569 > 0) {
				field569--;
				var2 = (DNRIFKTO) field572.method591();
			} else if (arg0 == 2 && field570 > 0) {
				field570--;
				var2 = (DNRIFKTO) field573.method591();
			}

			if (var2 != null) {
				var2.field563 = 0;
				return var2;
			}
		}

		DNRIFKTO var4 = new DNRIFKTO();
		var4.field563 = 0;

		if (arg0 == 0) {
			var4.field562 = new byte[100];
		} else if (arg0 == 1) {
			var4.field562 = new byte[5000];
		} else {
			var4.field562 = new byte[30000];
		}

		return var4;
	}

	public DNRIFKTO() {
	}

	public DNRIFKTO(byte[] arg0) {
		field562 = arg0;
		field563 = 0;
	}

	@ObfuscatedName("DNRIFKTO.a(ZI)V")
	public void method178(int arg0) {
		field562[field563++] = (byte) (arg0 + field567.method256());
	}

	@ObfuscatedName("DNRIFKTO.a(I)V")
	public void method179(int arg0) {
		field562[field563++] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.b(I)V")
	public void method180(int arg0) {
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.b(II)V")
	public void method181(int arg0) {
		field562[field563++] = (byte) arg0;
		field562[field563++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("DNRIFKTO.c(I)V")
	public void method182(int arg0) {
		field562[field563++] = (byte) (arg0 >> 16);
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.d(I)V")
	public void method183(int arg0) {
		field562[field563++] = (byte) (arg0 >> 24);
		field562[field563++] = (byte) (arg0 >> 16);
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.c(II)V")
	public void method184(int arg0) {
		field562[field563++] = (byte) arg0;
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) (arg0 >> 16);
		field562[field563++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("DNRIFKTO.a(BJ)V")
	public void method185(long arg0) {
		field562[field563++] = (byte) (arg0 >> 56);
		field562[field563++] = (byte) (arg0 >> 48);
		field562[field563++] = (byte) (arg0 >> 40);
		field562[field563++] = (byte) (arg0 >> 32);
		field562[field563++] = (byte) (arg0 >> 24);
		field562[field563++] = (byte) (arg0 >> 16);
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.a(Ljava/lang/String;)V")
	public void method186(String arg0) {
		arg0.getBytes(0, arg0.length(), field562, field563);
		field563 += arg0.length();
		field562[field563++] = 10;
	}

	@ObfuscatedName("DNRIFKTO.a(I[BII)V")
	public void method187(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field562[field563++] = arg1[var4];
		}
	}

	@ObfuscatedName("DNRIFKTO.d(II)V")
	public void method188(int arg0) {
		field562[field563 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("DNRIFKTO.c()I")
	public int method189() {
		return field562[field563++] & 0xFF;
	}

	@ObfuscatedName("DNRIFKTO.d()B")
	public byte method190() {
		return field562[field563++];
	}

	@ObfuscatedName("DNRIFKTO.e()I")
	public int method191() {
		field563 += 2;
		return ((field562[field563 - 2] & 0xFF) << 8) + (field562[field563 - 1] & 0xFF);
	}

	@ObfuscatedName("DNRIFKTO.f()I")
	public int method192() {
		field563 += 2;
		int var1 = ((field562[field563 - 2] & 0xFF) << 8) + (field562[field563 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("DNRIFKTO.g()I")
	public int method193() {
		field563 += 3;
		return (field562[field563 - 1] & 0xFF) + ((field562[field563 - 3] & 0xFF) << 16) + ((field562[field563 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("DNRIFKTO.h()I")
	public int method194() {
		field563 += 4;
		return (field562[field563 - 1] & 0xFF) + ((field562[field563 - 2] & 0xFF) << 8) + ((field562[field563 - 4] & 0xFF) << 24) + ((field562[field563 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("DNRIFKTO.e(I)J")
	public long method195() {
		long var1 = method194() & 0xFFFFFFFFL;
		long var3 = method194() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("DNRIFKTO.i()Ljava/lang/String;")
	public String method196() {
		int var1 = field563;

		while (field562[field563++] != 10) {
		}

		return new String(field562, var1, field563 - var1 - 1);
	}

	@ObfuscatedName("DNRIFKTO.f(I)[B")
	public byte[] method197() {
		int var1 = field563;

		while (field562[field563++] != 10) {
		}

		byte[] var2 = new byte[field563 - var1 - 1];
		for (int var3 = var1; var3 < field563 - 1; var3++) {
			var2[var3 - var1] = field562[var3];
		}

		return var2;
	}

	@ObfuscatedName("DNRIFKTO.a(III[B)V")
	public void method198(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field562[field563++];
		}
	}

	@ObfuscatedName("DNRIFKTO.a(B)V")
	public void method199() {
		field564 = field563 * 8;
	}

	@ObfuscatedName("DNRIFKTO.e(II)I")
	public int method200(int arg0) {
		int var2 = field564 >> 3;
		int var3 = 8 - (field564 & 0x7);
		int var4 = 0;
		field564 += arg0;

		while (arg0 > var3) {
			var4 += (field562[var2++] & field566[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field562[var2] & field566[var3];
		} else {
			var4 += field562[var2] >> var3 - arg0 & field566[arg0];
		}

		return var4;
	}

	@ObfuscatedName("DNRIFKTO.g(I)V")
	public void method201() {
		field563 = (field564 + 7) / 8;
	}

	@ObfuscatedName("DNRIFKTO.j()I")
	public int method202() {
		int var1 = field562[field563] & 0xFF;
		if (var1 < 128) {
			return method189() - 64;
		}

		return method191() - 49152;
	}

	@ObfuscatedName("DNRIFKTO.k()I")
	public int method203() {
		int var1 = field562[field563] & 0xFF;
		if (var1 < 128) {
			return method189();
		}

		return method191() - 32768;
	}

	@ObfuscatedName("DNRIFKTO.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method204(BigInteger arg0, BigInteger arg1) {
		int var3 = field563;
		field563 = 0;
		byte[] var4 = new byte[var3];
		method198(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field563 = 0;
		method179(var7.length);
		method187(var7.length, var7, 0);
	}

	@ObfuscatedName("DNRIFKTO.f(II)V")
	public void method205(int arg0) {
		field562[field563++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("DNRIFKTO.b(B)I")
	public int method206() {
		return field562[field563++] - 128 & 0xFF;
	}

	@ObfuscatedName("DNRIFKTO.c(B)I")
	public int method207() {
		return -field562[field563++] & 0xFF;
	}

	@ObfuscatedName("DNRIFKTO.d(B)I")
	public int method208() {
		return 128 - field562[field563++] & 0xFF;
	}

	@ObfuscatedName("DNRIFKTO.e(B)B")
	public byte method209() {
		return (byte) -field562[field563++];
	}

	@ObfuscatedName("DNRIFKTO.h(I)B")
	public byte method210() {
		return (byte) (128 - field562[field563++]);
	}

	@ObfuscatedName("DNRIFKTO.g(II)V")
	public void method211(int arg0) {
		field562[field563++] = (byte) arg0;
		field562[field563++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("DNRIFKTO.a(BI)V")
	public void method212(int arg0) {
		field562[field563++] = (byte) (arg0 >> 8);
		field562[field563++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("DNRIFKTO.a(IZ)V")
	public void method213(int arg0) {
		field562[field563++] = (byte) (arg0 + 128);
		field562[field563++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("DNRIFKTO.f(B)I")
	public int method214() {
		field563 += 2;
		return ((field562[field563 - 1] & 0xFF) << 8) + (field562[field563 - 2] & 0xFF);
	}

	@ObfuscatedName("DNRIFKTO.i(I)I")
	public int method215() {
		field563 += 2;
		return ((field562[field563 - 2] & 0xFF) << 8) + (field562[field563 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("DNRIFKTO.j(I)I")
	public int method216() {
		field563 += 2;
		return ((field562[field563 - 1] & 0xFF) << 8) + (field562[field563 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("DNRIFKTO.k(I)I")
	public int method217() {
		field563 += 2;
		int var1 = ((field562[field563 - 1] & 0xFF) << 8) + (field562[field563 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("DNRIFKTO.l(I)I")
	public int method218() {
		field563 += 2;
		int var1 = ((field562[field563 - 2] & 0xFF) << 8) + (field562[field563 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("DNRIFKTO.m(I)I")
	public int method219() {
		field563 += 2;
		int var1 = ((field562[field563 - 1] & 0xFF) << 8) + (field562[field563 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("DNRIFKTO.n(I)I")
	public int method220() {
		field563 += 3;
		return (field562[field563 - 2] & 0xFF) + ((field562[field563 - 3] & 0xFF) << 16) + ((field562[field563 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("DNRIFKTO.h(II)V")
	public void method221(int arg0) {
		field562[field563++] = (byte) (arg0 >> 16);
		field562[field563++] = (byte) (arg0 >> 24);
		field562[field563++] = (byte) arg0;
		field562[field563++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("DNRIFKTO.g(B)I")
	public int method222() {
		field563 += 4;
		return (field562[field563 - 4] & 0xFF) + ((field562[field563 - 3] & 0xFF) << 8) + ((field562[field563 - 1] & 0xFF) << 24) + ((field562[field563 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("DNRIFKTO.o(I)I")
	public int method223() {
		field563 += 4;
		return (field562[field563 - 3] & 0xFF) + ((field562[field563 - 4] & 0xFF) << 8) + ((field562[field563 - 2] & 0xFF) << 24) + ((field562[field563 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("DNRIFKTO.p(I)I")
	public int method224() {
		field563 += 4;
		return (field562[field563 - 2] & 0xFF) + ((field562[field563 - 1] & 0xFF) << 8) + ((field562[field563 - 3] & 0xFF) << 24) + ((field562[field563 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("DNRIFKTO.b(I[BII)V")
	public void method225(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			field562[field563++] = arg1[var4];
		}
	}

	@ObfuscatedName("DNRIFKTO.a(II[BI)V")
	public void method226(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = (byte) (field562[field563++] - 128);
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

			field565[var0] = var1;
		}
	}
}
