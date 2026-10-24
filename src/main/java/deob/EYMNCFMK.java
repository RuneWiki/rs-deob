package deob;

import java.math.BigInteger;

@ObfuscatedName("EYMNCFMK")
public final class EYMNCFMK extends YCAZQYJA {

	@ObfuscatedName("EYMNCFMK.D")
	public byte[] field678;

	@ObfuscatedName("EYMNCFMK.E")
	public int field679;

	@ObfuscatedName("EYMNCFMK.G")
	public static int[] field681 = new int[256];

	@ObfuscatedName("EYMNCFMK.H")
	public static final int[] field682 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("EYMNCFMK.M")
	public static DMMTBJKZ field687 = new DMMTBJKZ();

	@ObfuscatedName("EYMNCFMK.N")
	public static DMMTBJKZ field688 = new DMMTBJKZ();

	@ObfuscatedName("EYMNCFMK.O")
	public static DMMTBJKZ field689 = new DMMTBJKZ();

	@ObfuscatedName("EYMNCFMK.P")
	public static char[] field690 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("EYMNCFMK.F")
	public int field680;

	@ObfuscatedName("EYMNCFMK.J")
	public static int field684;

	@ObfuscatedName("EYMNCFMK.K")
	public static int field685;

	@ObfuscatedName("EYMNCFMK.L")
	public static int field686;

	@ObfuscatedName("EYMNCFMK.I")
	public TXNIKMNQ field683;

	@ObfuscatedName("EYMNCFMK.a(II)LEYMNCFMK;")
	public static EYMNCFMK method227(int arg0) {
		synchronized (field688) {
			EYMNCFMK var2 = null;
			if (arg0 == 0 && field684 > 0) {
				field684--;
				var2 = (EYMNCFMK) field687.method199();
			} else if (arg0 == 1 && field685 > 0) {
				field685--;
				var2 = (EYMNCFMK) field688.method199();
			} else if (arg0 == 2 && field686 > 0) {
				field686--;
				var2 = (EYMNCFMK) field689.method199();
			}

			if (var2 != null) {
				var2.field679 = 0;
				return var2;
			}
		}

		EYMNCFMK var4 = new EYMNCFMK();
		var4.field679 = 0;

		if (arg0 == 0) {
			var4.field678 = new byte[100];
		} else if (arg0 == 1) {
			var4.field678 = new byte[5000];
		} else {
			var4.field678 = new byte[30000];
		}

		return var4;
	}

	public EYMNCFMK() {
	}

	public EYMNCFMK(byte[] arg0) {
		field678 = arg0;
		field679 = 0;
	}

	@ObfuscatedName("EYMNCFMK.a(IZ)V")
	public void method228(int arg0) {
		field678[field679++] = (byte) (arg0 + field683.method524());
	}

	@ObfuscatedName("EYMNCFMK.a(I)V")
	public void method229(int arg0) {
		field678[field679++] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.b(I)V")
	public void method230(int arg0) {
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.b(II)V")
	public void method231(int arg0) {
		field678[field679++] = (byte) arg0;
		field678[field679++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EYMNCFMK.c(I)V")
	public void method232(int arg0) {
		field678[field679++] = (byte) (arg0 >> 16);
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.d(I)V")
	public void method233(int arg0) {
		field678[field679++] = (byte) (arg0 >> 24);
		field678[field679++] = (byte) (arg0 >> 16);
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.c(II)V")
	public void method234(int arg0) {
		field678[field679++] = (byte) arg0;
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) (arg0 >> 16);
		field678[field679++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EYMNCFMK.a(JI)V")
	public void method235(long arg0) {
		field678[field679++] = (byte) (arg0 >> 56);
		field678[field679++] = (byte) (arg0 >> 48);
		field678[field679++] = (byte) (arg0 >> 40);
		field678[field679++] = (byte) (arg0 >> 32);
		field678[field679++] = (byte) (arg0 >> 24);
		field678[field679++] = (byte) (arg0 >> 16);
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.a(Ljava/lang/String;)V")
	public void method236(String arg0) {
		arg0.getBytes(0, arg0.length(), field678, field679);
		field679 += arg0.length();
		field678[field679++] = 10;
	}

	@ObfuscatedName("EYMNCFMK.a([BIBI)V")
	public void method237(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field678[field679++] = arg0[var4];
		}
	}

	@ObfuscatedName("EYMNCFMK.d(II)V")
	public void method238(int arg0) {
		field678[field679 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("EYMNCFMK.c()I")
	public int method239() {
		return field678[field679++] & 0xFF;
	}

	@ObfuscatedName("EYMNCFMK.d()B")
	public byte method240() {
		return field678[field679++];
	}

	@ObfuscatedName("EYMNCFMK.e()I")
	public int method241() {
		field679 += 2;
		return ((field678[field679 - 2] & 0xFF) << 8) + (field678[field679 - 1] & 0xFF);
	}

	@ObfuscatedName("EYMNCFMK.f()I")
	public int method242() {
		field679 += 2;
		int var1 = ((field678[field679 - 2] & 0xFF) << 8) + (field678[field679 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EYMNCFMK.g()I")
	public int method243() {
		field679 += 3;
		return (field678[field679 - 1] & 0xFF) + ((field678[field679 - 3] & 0xFF) << 16) + ((field678[field679 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EYMNCFMK.h()I")
	public int method244() {
		field679 += 4;
		return (field678[field679 - 1] & 0xFF) + ((field678[field679 - 2] & 0xFF) << 8) + ((field678[field679 - 4] & 0xFF) << 24) + ((field678[field679 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("EYMNCFMK.e(I)J")
	public long method245() {
		long var1 = method244() & 0xFFFFFFFFL;
		long var3 = method244() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("EYMNCFMK.i()Ljava/lang/String;")
	public String method246() {
		int var1 = field679;

		while (field678[field679++] != 10) {
		}

		return new String(field678, var1, field679 - var1 - 1);
	}

	@ObfuscatedName("EYMNCFMK.a(B)[B")
	public byte[] method247() {
		int var1 = field679;

		while (field678[field679++] != 10) {
		}

		byte[] var2 = new byte[field679 - var1 - 1];
		for (int var3 = var1; var3 < field679 - 1; var3++) {
			var2[var3 - var1] = field678[var3];
		}

		return var2;
	}

	@ObfuscatedName("EYMNCFMK.a(I[BII)V")
	public void method248(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field678[field679++];
		}
	}

	@ObfuscatedName("EYMNCFMK.b(B)V")
	public void method249() {
		field680 = field679 * 8;
	}

	@ObfuscatedName("EYMNCFMK.a(BI)I")
	public int method250(int arg0) {
		int var2 = field680 >> 3;
		int var3 = 8 - (field680 & 0x7);
		int var4 = 0;
		field680 += arg0;

		while (arg0 > var3) {
			var4 += (field678[var2++] & field682[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field678[var2] & field682[var3];
		} else {
			var4 += field678[var2] >> var3 - arg0 & field682[arg0];
		}

		return var4;
	}

	@ObfuscatedName("EYMNCFMK.c(B)V")
	public void method251() {
		field679 = (field680 + 7) / 8;
	}

	@ObfuscatedName("EYMNCFMK.j()I")
	public int method252() {
		int var1 = field678[field679] & 0xFF;
		if (var1 < 128) {
			return method239() - 64;
		}

		return method241() - 49152;
	}

	@ObfuscatedName("EYMNCFMK.k()I")
	public int method253() {
		int var1 = field678[field679] & 0xFF;
		if (var1 < 128) {
			return method239();
		}

		return method241() - 32768;
	}

	@ObfuscatedName("EYMNCFMK.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method254(BigInteger arg0, BigInteger arg1) {
		int var3 = field679;
		field679 = 0;
		byte[] var4 = new byte[var3];
		method248(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field679 = 0;
		method229(var7.length);
		method237(var7, var7.length, 0);
	}

	@ObfuscatedName("EYMNCFMK.a(ZI)V")
	public void method255(int arg0) {
		field678[field679++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EYMNCFMK.b(IZ)V")
	public void method256(int arg0) {
		field678[field679++] = (byte) -arg0;
	}

	@ObfuscatedName("EYMNCFMK.e(II)V")
	public void method257(int arg0) {
		field678[field679++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("EYMNCFMK.f(I)I")
	public int method258() {
		return field678[field679++] - 128 & 0xFF;
	}

	@ObfuscatedName("EYMNCFMK.d(B)I")
	public int method259() {
		return -field678[field679++] & 0xFF;
	}

	@ObfuscatedName("EYMNCFMK.g(I)I")
	public int method260() {
		return 128 - field678[field679++] & 0xFF;
	}

	@ObfuscatedName("EYMNCFMK.h(I)B")
	public byte method261() {
		return (byte) (field678[field679++] - 128);
	}

	@ObfuscatedName("EYMNCFMK.e(B)B")
	public byte method262() {
		return (byte) -field678[field679++];
	}

	@ObfuscatedName("EYMNCFMK.i(I)B")
	public byte method263() {
		return (byte) (128 - field678[field679++]);
	}

	@ObfuscatedName("EYMNCFMK.b(BI)V")
	public void method264(int arg0) {
		field678[field679++] = (byte) arg0;
		field678[field679++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EYMNCFMK.f(II)V")
	public void method265(int arg0) {
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EYMNCFMK.b(ZI)V")
	public void method266(int arg0) {
		field678[field679++] = (byte) (arg0 + 128);
		field678[field679++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EYMNCFMK.f(B)I")
	public int method267() {
		field679 += 2;
		return ((field678[field679 - 1] & 0xFF) << 8) + (field678[field679 - 2] & 0xFF);
	}

	@ObfuscatedName("EYMNCFMK.g(B)I")
	public int method268() {
		field679 += 2;
		return ((field678[field679 - 2] & 0xFF) << 8) + (field678[field679 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("EYMNCFMK.a(Z)I")
	public int method269() {
		field679 += 2;
		return ((field678[field679 - 1] & 0xFF) << 8) + (field678[field679 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("EYMNCFMK.b(Z)I")
	public int method270() {
		field679 += 2;
		int var1 = ((field678[field679 - 1] & 0xFF) << 8) + (field678[field679 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EYMNCFMK.j(I)I")
	public int method271() {
		field679 += 2;
		int var1 = ((field678[field679 - 2] & 0xFF) << 8) + (field678[field679 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EYMNCFMK.c(Z)I")
	public int method272() {
		field679 += 2;
		int var1 = ((field678[field679 - 1] & 0xFF) << 8) + (field678[field679 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EYMNCFMK.c(BI)V")
	public void method273(int arg0) {
		field678[field679++] = (byte) arg0;
		field678[field679++] = (byte) (arg0 >> 8);
		field678[field679++] = (byte) (arg0 >> 16);
		field678[field679++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EYMNCFMK.k(I)I")
	public int method274() {
		field679 += 4;
		return (field678[field679 - 3] & 0xFF) + ((field678[field679 - 4] & 0xFF) << 8) + ((field678[field679 - 2] & 0xFF) << 24) + ((field678[field679 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("EYMNCFMK.l(I)I")
	public int method275() {
		field679 += 4;
		return (field678[field679 - 2] & 0xFF) + ((field678[field679 - 1] & 0xFF) << 8) + ((field678[field679 - 3] & 0xFF) << 24) + ((field678[field679 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("EYMNCFMK.a(II[BB)V")
	public void method276(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg0; var4--) {
			field678[field679++] = arg2[var4];
		}
	}

	@ObfuscatedName("EYMNCFMK.a([BIII)V")
	public void method277(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = (byte) (field678[field679++] - 128);
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

			field681[var0] = var1;
		}
	}
}
