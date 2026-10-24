package deob;

import java.math.BigInteger;

@ObfuscatedName("JHKSAGUC")
public final class JHKSAGUC extends AGCGSOQI {

	@ObfuscatedName("JHKSAGUC.y")
	public byte[] field751;

	@ObfuscatedName("JHKSAGUC.z")
	public int field752;

	@ObfuscatedName("JHKSAGUC.B")
	public static int[] field754 = new int[256];

	@ObfuscatedName("JHKSAGUC.C")
	public static final int[] field755 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("JHKSAGUC.H")
	public static OUZUCGGU field760 = new OUZUCGGU();

	@ObfuscatedName("JHKSAGUC.I")
	public static OUZUCGGU field761 = new OUZUCGGU();

	@ObfuscatedName("JHKSAGUC.J")
	public static OUZUCGGU field762 = new OUZUCGGU();

	@ObfuscatedName("JHKSAGUC.K")
	public static char[] field763 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("JHKSAGUC.A")
	public int field753;

	@ObfuscatedName("JHKSAGUC.E")
	public static int field757;

	@ObfuscatedName("JHKSAGUC.F")
	public static int field758;

	@ObfuscatedName("JHKSAGUC.G")
	public static int field759;

	@ObfuscatedName("JHKSAGUC.D")
	public ZPIYFABJ field756;

	@ObfuscatedName("JHKSAGUC.a(II)LJHKSAGUC;")
	public static JHKSAGUC method294(int arg0) {
		synchronized (field761) {
			JHKSAGUC var2 = null;
			if (arg0 == 0 && field757 > 0) {
				field757--;
				var2 = (JHKSAGUC) field760.method392();
			} else if (arg0 == 1 && field758 > 0) {
				field758--;
				var2 = (JHKSAGUC) field761.method392();
			} else if (arg0 == 2 && field759 > 0) {
				field759--;
				var2 = (JHKSAGUC) field762.method392();
			}

			if (var2 != null) {
				var2.field752 = 0;
				return var2;
			}
		}

		JHKSAGUC var4 = new JHKSAGUC();
		var4.field752 = 0;

		if (arg0 == 0) {
			var4.field751 = new byte[100];
		} else if (arg0 == 1) {
			var4.field751 = new byte[5000];
		} else {
			var4.field751 = new byte[30000];
		}

		return var4;
	}

	public JHKSAGUC() {
	}

	public JHKSAGUC(byte[] arg0) {
		field751 = arg0;
		field752 = 0;
	}

	@ObfuscatedName("JHKSAGUC.b(II)V")
	public void method295(int arg0) {
		field751[field752++] = (byte) (arg0 + field756.method589());
	}

	@ObfuscatedName("JHKSAGUC.a(I)V")
	public void method296(int arg0) {
		field751[field752++] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.b(I)V")
	public void method297(int arg0) {
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.c(II)V")
	public void method298(int arg0) {
		field751[field752++] = (byte) arg0;
		field751[field752++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("JHKSAGUC.c(I)V")
	public void method299(int arg0) {
		field751[field752++] = (byte) (arg0 >> 16);
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.d(I)V")
	public void method300(int arg0) {
		field751[field752++] = (byte) (arg0 >> 24);
		field751[field752++] = (byte) (arg0 >> 16);
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.a(IZ)V")
	public void method301(int arg0) {
		field751[field752++] = (byte) arg0;
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) (arg0 >> 16);
		field751[field752++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("JHKSAGUC.a(JB)V")
	public void method302(long arg0) {
		field751[field752++] = (byte) (arg0 >> 56);
		field751[field752++] = (byte) (arg0 >> 48);
		field751[field752++] = (byte) (arg0 >> 40);
		field751[field752++] = (byte) (arg0 >> 32);
		field751[field752++] = (byte) (arg0 >> 24);
		field751[field752++] = (byte) (arg0 >> 16);
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.a(Ljava/lang/String;)V")
	public void method303(String arg0) {
		arg0.getBytes(0, arg0.length(), field751, field752);
		field752 += arg0.length();
		field751[field752++] = 10;
	}

	@ObfuscatedName("JHKSAGUC.a(II[BZ)V")
	public void method304(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field751[field752++] = arg2[var4];
		}
	}

	@ObfuscatedName("JHKSAGUC.a(BI)V")
	public void method305(int arg0) {
		field751[field752 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("JHKSAGUC.c()I")
	public int method306() {
		return field751[field752++] & 0xFF;
	}

	@ObfuscatedName("JHKSAGUC.d()B")
	public byte method307() {
		return field751[field752++];
	}

	@ObfuscatedName("JHKSAGUC.e()I")
	public int method308() {
		field752 += 2;
		return ((field751[field752 - 2] & 0xFF) << 8) + (field751[field752 - 1] & 0xFF);
	}

	@ObfuscatedName("JHKSAGUC.f()I")
	public int method309() {
		field752 += 2;
		int var1 = ((field751[field752 - 2] & 0xFF) << 8) + (field751[field752 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("JHKSAGUC.g()I")
	public int method310() {
		field752 += 3;
		return (field751[field752 - 1] & 0xFF) + ((field751[field752 - 3] & 0xFF) << 16) + ((field751[field752 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("JHKSAGUC.h()I")
	public int method311() {
		field752 += 4;
		return (field751[field752 - 1] & 0xFF) + ((field751[field752 - 2] & 0xFF) << 8) + ((field751[field752 - 4] & 0xFF) << 24) + ((field751[field752 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("JHKSAGUC.e(I)J")
	public long method312() {
		long var1 = method311() & 0xFFFFFFFFL;
		long var3 = method311() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("JHKSAGUC.i()Ljava/lang/String;")
	public String method313() {
		int var1 = field752;

		while (field751[field752++] != 10) {
		}

		return new String(field751, var1, field752 - var1 - 1);
	}

	@ObfuscatedName("JHKSAGUC.f(I)[B")
	public byte[] method314() {
		int var1 = field752;

		while (field751[field752++] != 10) {
		}

		byte[] var2 = new byte[field752 - var1 - 1];
		for (int var3 = var1; var3 < field752 - 1; var3++) {
			var2[var3 - var1] = field751[var3];
		}

		return var2;
	}

	@ObfuscatedName("JHKSAGUC.a(III[B)V")
	public void method315(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field751[field752++];
		}
	}

	@ObfuscatedName("JHKSAGUC.g(I)V")
	public void method316() {
		field753 = field752 * 8;
	}

	@ObfuscatedName("JHKSAGUC.b(BI)I")
	public int method317(int arg0) {
		int var2 = field753 >> 3;
		int var3 = 8 - (field753 & 0x7);
		int var4 = 0;
		field753 += arg0;

		while (arg0 > var3) {
			var4 += (field751[var2++] & field755[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field751[var2] & field755[var3];
		} else {
			var4 += field751[var2] >> var3 - arg0 & field755[arg0];
		}

		return var4;
	}

	@ObfuscatedName("JHKSAGUC.a(B)V")
	public void method318() {
		field752 = (field753 + 7) / 8;
	}

	@ObfuscatedName("JHKSAGUC.j()I")
	public int method319() {
		int var1 = field751[field752] & 0xFF;
		if (var1 < 128) {
			return method306() - 64;
		}

		return method308() - 49152;
	}

	@ObfuscatedName("JHKSAGUC.k()I")
	public int method320() {
		int var1 = field751[field752] & 0xFF;
		if (var1 < 128) {
			return method306();
		}

		return method308() - 32768;
	}

	@ObfuscatedName("JHKSAGUC.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method321(BigInteger arg0, BigInteger arg1) {
		int var3 = field752;
		field752 = 0;
		byte[] var4 = new byte[var3];
		method315(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field752 = 0;
		method296(var7.length);
		method304(0, var7.length, var7);
	}

	@ObfuscatedName("JHKSAGUC.c(BI)V")
	public void method322(int arg0) {
		field751[field752++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("JHKSAGUC.b(IZ)V")
	public void method323(int arg0) {
		field751[field752++] = (byte) -arg0;
	}

	@ObfuscatedName("JHKSAGUC.d(II)V")
	public void method324(int arg0) {
		field751[field752++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("JHKSAGUC.h(I)I")
	public int method325() {
		return field751[field752++] - 128 & 0xFF;
	}

	@ObfuscatedName("JHKSAGUC.b(B)I")
	public int method326() {
		return -field751[field752++] & 0xFF;
	}

	@ObfuscatedName("JHKSAGUC.i(I)I")
	public int method327() {
		return 128 - field751[field752++] & 0xFF;
	}

	@ObfuscatedName("JHKSAGUC.j(I)B")
	public byte method328() {
		return (byte) (field751[field752++] - 128);
	}

	@ObfuscatedName("JHKSAGUC.c(B)B")
	public byte method329() {
		return (byte) -field751[field752++];
	}

	@ObfuscatedName("JHKSAGUC.a(Z)B")
	public byte method330() {
		return (byte) (128 - field751[field752++]);
	}

	@ObfuscatedName("JHKSAGUC.a(IB)V")
	public void method331(int arg0) {
		field751[field752++] = (byte) arg0;
		field751[field752++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("JHKSAGUC.e(II)V")
	public void method332(int arg0) {
		field751[field752++] = (byte) (arg0 >> 8);
		field751[field752++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("JHKSAGUC.f(II)V")
	public void method333(int arg0) {
		field751[field752++] = (byte) (arg0 + 128);
		field751[field752++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("JHKSAGUC.d(B)I")
	public int method334() {
		field752 += 2;
		return ((field751[field752 - 1] & 0xFF) << 8) + (field751[field752 - 2] & 0xFF);
	}

	@ObfuscatedName("JHKSAGUC.b(Z)I")
	public int method335() {
		field752 += 2;
		return ((field751[field752 - 2] & 0xFF) << 8) + (field751[field752 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("JHKSAGUC.e(B)I")
	public int method336() {
		field752 += 2;
		return ((field751[field752 - 1] & 0xFF) << 8) + (field751[field752 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("JHKSAGUC.k(I)I")
	public int method337() {
		field752 += 2;
		int var1 = ((field751[field752 - 1] & 0xFF) << 8) + (field751[field752 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("JHKSAGUC.l(I)I")
	public int method338() {
		field752 += 2;
		int var1 = ((field751[field752 - 2] & 0xFF) << 8) + (field751[field752 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("JHKSAGUC.m(I)I")
	public int method339() {
		field752 += 3;
		return (field751[field752 - 3] & 0xFF) + ((field751[field752 - 1] & 0xFF) << 16) + ((field751[field752 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("JHKSAGUC.c(Z)I")
	public int method340() {
		field752 += 4;
		return (field751[field752 - 4] & 0xFF) + ((field751[field752 - 3] & 0xFF) << 8) + ((field751[field752 - 1] & 0xFF) << 24) + ((field751[field752 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("JHKSAGUC.d(Z)I")
	public int method341() {
		field752 += 4;
		return (field751[field752 - 3] & 0xFF) + ((field751[field752 - 4] & 0xFF) << 8) + ((field751[field752 - 2] & 0xFF) << 24) + ((field751[field752 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("JHKSAGUC.e(Z)I")
	public int method342() {
		field752 += 4;
		return (field751[field752 - 2] & 0xFF) + ((field751[field752 - 1] & 0xFF) << 8) + ((field751[field752 - 3] & 0xFF) << 24) + ((field751[field752 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("JHKSAGUC.a(BI[BI)V")
	public void method343(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field751[field752++];
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

			field754[var0] = var1;
		}
	}
}
