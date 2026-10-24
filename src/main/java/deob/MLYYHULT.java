package deob;

import java.math.BigInteger;

@ObfuscatedName("MLYYHULT")
public final class MLYYHULT extends DRKSBDQX {

	@ObfuscatedName("MLYYHULT.C")
	public byte[] field962;

	@ObfuscatedName("MLYYHULT.D")
	public int field963;

	@ObfuscatedName("MLYYHULT.F")
	public static int[] field965 = new int[256];

	@ObfuscatedName("MLYYHULT.G")
	public static final int[] field966 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MLYYHULT.L")
	public static ZWZXPJNQ field971 = new ZWZXPJNQ();

	@ObfuscatedName("MLYYHULT.M")
	public static ZWZXPJNQ field972 = new ZWZXPJNQ();

	@ObfuscatedName("MLYYHULT.N")
	public static ZWZXPJNQ field973 = new ZWZXPJNQ();

	@ObfuscatedName("MLYYHULT.O")
	public static char[] field974 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MLYYHULT.E")
	public int field964;

	@ObfuscatedName("MLYYHULT.I")
	public static int field968;

	@ObfuscatedName("MLYYHULT.J")
	public static int field969;

	@ObfuscatedName("MLYYHULT.K")
	public static int field970;

	@ObfuscatedName("MLYYHULT.H")
	public SSCDCBAC field967;

	@ObfuscatedName("MLYYHULT.a(II)LMLYYHULT;")
	public static MLYYHULT method284(int arg0) {
		synchronized (field972) {
			MLYYHULT var2 = null;
			if (arg0 == 0 && field968 > 0) {
				field968--;
				var2 = (MLYYHULT) field971.method599();
			} else if (arg0 == 1 && field969 > 0) {
				field969--;
				var2 = (MLYYHULT) field972.method599();
			} else if (arg0 == 2 && field970 > 0) {
				field970--;
				var2 = (MLYYHULT) field973.method599();
			}

			if (var2 != null) {
				var2.field963 = 0;
				return var2;
			}
		}

		MLYYHULT var4 = new MLYYHULT();
		var4.field963 = 0;

		if (arg0 == 0) {
			var4.field962 = new byte[100];
		} else if (arg0 == 1) {
			var4.field962 = new byte[5000];
		} else {
			var4.field962 = new byte[30000];
		}

		return var4;
	}

	public MLYYHULT() {
	}

	public MLYYHULT(byte[] arg0) {
		field962 = arg0;
		field963 = 0;
	}

	@ObfuscatedName("MLYYHULT.b(II)V")
	public void method285(int arg0) {
		field962[field963++] = (byte) (arg0 + field967.method450());
	}

	@ObfuscatedName("MLYYHULT.a(I)V")
	public void method286(int arg0) {
		field962[field963++] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.b(I)V")
	public void method287(int arg0) {
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.a(BI)V")
	public void method288(int arg0) {
		field962[field963++] = (byte) arg0;
		field962[field963++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MLYYHULT.c(I)V")
	public void method289(int arg0) {
		field962[field963++] = (byte) (arg0 >> 16);
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.d(I)V")
	public void method290(int arg0) {
		field962[field963++] = (byte) (arg0 >> 24);
		field962[field963++] = (byte) (arg0 >> 16);
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.a(IB)V")
	public void method291(int arg0) {
		field962[field963++] = (byte) arg0;
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) (arg0 >> 16);
		field962[field963++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MLYYHULT.a(JB)V")
	public void method292(long arg0) {
		field962[field963++] = (byte) (arg0 >> 56);
		field962[field963++] = (byte) (arg0 >> 48);
		field962[field963++] = (byte) (arg0 >> 40);
		field962[field963++] = (byte) (arg0 >> 32);
		field962[field963++] = (byte) (arg0 >> 24);
		field962[field963++] = (byte) (arg0 >> 16);
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.a(Ljava/lang/String;)V")
	public void method293(String arg0) {
		arg0.getBytes(0, arg0.length(), field962, field963);
		field963 += arg0.length();
		field962[field963++] = 10;
	}

	@ObfuscatedName("MLYYHULT.a(II[BI)V")
	public void method294(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field962[field963++] = arg1[var4];
		}
	}

	@ObfuscatedName("MLYYHULT.c(II)V")
	public void method295(int arg0) {
		field962[field963 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MLYYHULT.c()I")
	public int method296() {
		return field962[field963++] & 0xFF;
	}

	@ObfuscatedName("MLYYHULT.d()B")
	public byte method297() {
		return field962[field963++];
	}

	@ObfuscatedName("MLYYHULT.e()I")
	public int method298() {
		field963 += 2;
		return ((field962[field963 - 2] & 0xFF) << 8) + (field962[field963 - 1] & 0xFF);
	}

	@ObfuscatedName("MLYYHULT.f()I")
	public int method299() {
		field963 += 2;
		int var1 = ((field962[field963 - 2] & 0xFF) << 8) + (field962[field963 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MLYYHULT.g()I")
	public int method300() {
		field963 += 3;
		return (field962[field963 - 1] & 0xFF) + ((field962[field963 - 3] & 0xFF) << 16) + ((field962[field963 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MLYYHULT.h()I")
	public int method301() {
		field963 += 4;
		return (field962[field963 - 1] & 0xFF) + ((field962[field963 - 2] & 0xFF) << 8) + ((field962[field963 - 4] & 0xFF) << 24) + ((field962[field963 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MLYYHULT.a(B)J")
	public long method302() {
		long var1 = method301() & 0xFFFFFFFFL;
		long var3 = method301() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MLYYHULT.i()Ljava/lang/String;")
	public String method303() {
		int var1 = field963;

		while (field962[field963++] != 10) {
		}

		return new String(field962, var1, field963 - var1 - 1);
	}

	@ObfuscatedName("MLYYHULT.e(I)[B")
	public byte[] method304() {
		int var1 = field963;

		while (field962[field963++] != 10) {
		}

		byte[] var2 = new byte[field963 - var1 - 1];
		for (int var3 = var1; var3 < field963 - 1; var3++) {
			var2[var3 - var1] = field962[var3];
		}

		return var2;
	}

	@ObfuscatedName("MLYYHULT.a(II[BB)V")
	public void method305(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field962[field963++];
		}
	}

	@ObfuscatedName("MLYYHULT.f(I)V")
	public void method306() {
		field964 = field963 * 8;
	}

	@ObfuscatedName("MLYYHULT.d(II)I")
	public int method307(int arg0) {
		int var2 = field964 >> 3;
		int var3 = 8 - (field964 & 0x7);
		int var4 = 0;
		field964 += arg0;

		while (arg0 > var3) {
			var4 += (field962[var2++] & field966[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field962[var2] & field966[var3];
		} else {
			var4 += field962[var2] >> var3 - arg0 & field966[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MLYYHULT.b(B)V")
	public void method308() {
		field963 = (field964 + 7) / 8;
	}

	@ObfuscatedName("MLYYHULT.j()I")
	public int method309() {
		int var1 = field962[field963] & 0xFF;
		if (var1 < 128) {
			return method296() - 64;
		}

		return method298() - 49152;
	}

	@ObfuscatedName("MLYYHULT.k()I")
	public int method310() {
		int var1 = field962[field963] & 0xFF;
		if (var1 < 128) {
			return method296();
		}

		return method298() - 32768;
	}

	@ObfuscatedName("MLYYHULT.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method311(BigInteger arg0, BigInteger arg1) {
		int var3 = field963;
		field963 = 0;
		byte[] var4 = new byte[var3];
		method305(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field963 = 0;
		method286(var7.length);
		method294(0, var7, var7.length);
	}

	@ObfuscatedName("MLYYHULT.a(ZI)V")
	public void method312(int arg0) {
		field962[field963++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MLYYHULT.e(II)V")
	public void method313(int arg0) {
		field962[field963++] = (byte) -arg0;
	}

	@ObfuscatedName("MLYYHULT.f(II)V")
	public void method314(int arg0) {
		field962[field963++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MLYYHULT.g(I)I")
	public int method315() {
		return field962[field963++] - 128 & 0xFF;
	}

	@ObfuscatedName("MLYYHULT.h(I)I")
	public int method316() {
		return -field962[field963++] & 0xFF;
	}

	@ObfuscatedName("MLYYHULT.a(Z)I")
	public int method317() {
		return 128 - field962[field963++] & 0xFF;
	}

	@ObfuscatedName("MLYYHULT.c(B)B")
	public byte method318() {
		return (byte) (field962[field963++] - 128);
	}

	@ObfuscatedName("MLYYHULT.b(Z)B")
	public byte method319() {
		return (byte) -field962[field963++];
	}

	@ObfuscatedName("MLYYHULT.c(Z)B")
	public byte method320() {
		return (byte) (128 - field962[field963++]);
	}

	@ObfuscatedName("MLYYHULT.b(IB)V")
	public void method321(int arg0) {
		field962[field963++] = (byte) arg0;
		field962[field963++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MLYYHULT.g(II)V")
	public void method322(int arg0) {
		field962[field963++] = (byte) (arg0 >> 8);
		field962[field963++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MLYYHULT.b(BI)V")
	public void method323(int arg0) {
		field962[field963++] = (byte) (arg0 + 128);
		field962[field963++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MLYYHULT.i(I)I")
	public int method324() {
		field963 += 2;
		return ((field962[field963 - 1] & 0xFF) << 8) + (field962[field963 - 2] & 0xFF);
	}

	@ObfuscatedName("MLYYHULT.j(I)I")
	public int method325() {
		field963 += 2;
		return ((field962[field963 - 2] & 0xFF) << 8) + (field962[field963 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MLYYHULT.k(I)I")
	public int method326() {
		field963 += 2;
		return ((field962[field963 - 1] & 0xFF) << 8) + (field962[field963 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MLYYHULT.l(I)I")
	public int method327() {
		field963 += 2;
		int var1 = ((field962[field963 - 1] & 0xFF) << 8) + (field962[field963 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MLYYHULT.d(B)I")
	public int method328() {
		field963 += 2;
		int var1 = ((field962[field963 - 2] & 0xFF) << 8) + (field962[field963 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MLYYHULT.m(I)I")
	public int method329() {
		field963 += 2;
		int var1 = ((field962[field963 - 1] & 0xFF) << 8) + (field962[field963 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MLYYHULT.n(I)I")
	public int method330() {
		field963 += 3;
		return (field962[field963 - 1] & 0xFF) + ((field962[field963 - 2] & 0xFF) << 16) + ((field962[field963 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("MLYYHULT.o(I)I")
	public int method331() {
		field963 += 4;
		return (field962[field963 - 4] & 0xFF) + ((field962[field963 - 3] & 0xFF) << 8) + ((field962[field963 - 1] & 0xFF) << 24) + ((field962[field963 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MLYYHULT.p(I)I")
	public int method332() {
		field963 += 4;
		return (field962[field963 - 3] & 0xFF) + ((field962[field963 - 4] & 0xFF) << 8) + ((field962[field963 - 2] & 0xFF) << 24) + ((field962[field963 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MLYYHULT.d(Z)I")
	public int method333() {
		field963 += 4;
		return (field962[field963 - 2] & 0xFF) + ((field962[field963 - 1] & 0xFF) << 8) + ((field962[field963 - 3] & 0xFF) << 24) + ((field962[field963 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MLYYHULT.a([BIII)V")
	public void method334(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field962[field963++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("MLYYHULT.a(IB[BI)V")
	public void method335(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			arg1[var4] = (byte) (field962[field963++] - 128);
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

			field965[var0] = var1;
		}
	}
}
