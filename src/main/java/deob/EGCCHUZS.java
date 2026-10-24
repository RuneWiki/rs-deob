package deob;

import java.math.BigInteger;

@ObfuscatedName("EGCCHUZS")
public final class EGCCHUZS extends CYIKEZWP {

	@ObfuscatedName("EGCCHUZS.A")
	public byte[] field588;

	@ObfuscatedName("EGCCHUZS.B")
	public int field589;

	@ObfuscatedName("EGCCHUZS.D")
	public static int[] field591 = new int[256];

	@ObfuscatedName("EGCCHUZS.E")
	public static final int[] field592 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("EGCCHUZS.J")
	public static JQSVNFRT field597 = new JQSVNFRT();

	@ObfuscatedName("EGCCHUZS.K")
	public static JQSVNFRT field598 = new JQSVNFRT();

	@ObfuscatedName("EGCCHUZS.L")
	public static JQSVNFRT field599 = new JQSVNFRT();

	@ObfuscatedName("EGCCHUZS.M")
	public static char[] field600 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("EGCCHUZS.C")
	public int field590;

	@ObfuscatedName("EGCCHUZS.G")
	public static int field594;

	@ObfuscatedName("EGCCHUZS.H")
	public static int field595;

	@ObfuscatedName("EGCCHUZS.I")
	public static int field596;

	@ObfuscatedName("EGCCHUZS.F")
	public QHNACLRF field593;

	@ObfuscatedName("EGCCHUZS.a(II)LEGCCHUZS;")
	public static EGCCHUZS method249(int arg0) {
		synchronized (field598) {
			EGCCHUZS var2 = null;
			if (arg0 == 0 && field594 > 0) {
				field594--;
				var2 = (EGCCHUZS) field597.method394();
			} else if (arg0 == 1 && field595 > 0) {
				field595--;
				var2 = (EGCCHUZS) field598.method394();
			} else if (arg0 == 2 && field596 > 0) {
				field596--;
				var2 = (EGCCHUZS) field599.method394();
			}

			if (var2 != null) {
				var2.field589 = 0;
				return var2;
			}
		}

		EGCCHUZS var4 = new EGCCHUZS();
		var4.field589 = 0;

		if (arg0 == 0) {
			var4.field588 = new byte[100];
		} else if (arg0 == 1) {
			var4.field588 = new byte[5000];
		} else {
			var4.field588 = new byte[30000];
		}

		return var4;
	}

	public EGCCHUZS() {
	}

	public EGCCHUZS(byte[] arg0) {
		field588 = arg0;
		field589 = 0;
	}

	@ObfuscatedName("EGCCHUZS.b(II)V")
	public void method250(int arg0) {
		field588[field589++] = (byte) (arg0 + field593.method522());
	}

	@ObfuscatedName("EGCCHUZS.a(I)V")
	public void method251(int arg0) {
		field588[field589++] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.b(I)V")
	public void method252(int arg0) {
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.a(IB)V")
	public void method253(int arg0) {
		field588[field589++] = (byte) arg0;
		field588[field589++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EGCCHUZS.c(I)V")
	public void method254(int arg0) {
		field588[field589++] = (byte) (arg0 >> 16);
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.d(I)V")
	public void method255(int arg0) {
		field588[field589++] = (byte) (arg0 >> 24);
		field588[field589++] = (byte) (arg0 >> 16);
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.c(II)V")
	public void method256(int arg0) {
		field588[field589++] = (byte) arg0;
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) (arg0 >> 16);
		field588[field589++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EGCCHUZS.a(IJ)V")
	public void method257(long arg0) {
		field588[field589++] = (byte) (arg0 >> 56);
		field588[field589++] = (byte) (arg0 >> 48);
		field588[field589++] = (byte) (arg0 >> 40);
		field588[field589++] = (byte) (arg0 >> 32);
		field588[field589++] = (byte) (arg0 >> 24);
		field588[field589++] = (byte) (arg0 >> 16);
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.a(Ljava/lang/String;)V")
	public void method258(String arg0) {
		arg0.getBytes(0, arg0.length(), field588, field589);
		field589 += arg0.length();
		field588[field589++] = 10;
	}

	@ObfuscatedName("EGCCHUZS.a([BIIZ)V")
	public void method259(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field588[field589++] = arg0[var4];
		}
	}

	@ObfuscatedName("EGCCHUZS.d(II)V")
	public void method260(int arg0) {
		field588[field589 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("EGCCHUZS.c()I")
	public int method261() {
		return field588[field589++] & 0xFF;
	}

	@ObfuscatedName("EGCCHUZS.d()B")
	public byte method262() {
		return field588[field589++];
	}

	@ObfuscatedName("EGCCHUZS.e()I")
	public int method263() {
		field589 += 2;
		return ((field588[field589 - 2] & 0xFF) << 8) + (field588[field589 - 1] & 0xFF);
	}

	@ObfuscatedName("EGCCHUZS.f()I")
	public int method264() {
		field589 += 2;
		int var1 = ((field588[field589 - 2] & 0xFF) << 8) + (field588[field589 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EGCCHUZS.g()I")
	public int method265() {
		field589 += 3;
		return (field588[field589 - 1] & 0xFF) + ((field588[field589 - 3] & 0xFF) << 16) + ((field588[field589 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EGCCHUZS.h()I")
	public int method266() {
		field589 += 4;
		return (field588[field589 - 1] & 0xFF) + ((field588[field589 - 2] & 0xFF) << 8) + ((field588[field589 - 4] & 0xFF) << 24) + ((field588[field589 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("EGCCHUZS.a(Z)J")
	public long method267() {
		long var1 = method266() & 0xFFFFFFFFL;
		long var3 = method266() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("EGCCHUZS.i()Ljava/lang/String;")
	public String method268() {
		int var1 = field589;

		while (field588[field589++] != 10) {
		}

		return new String(field588, var1, field589 - var1 - 1);
	}

	@ObfuscatedName("EGCCHUZS.b(Z)[B")
	public byte[] method269() {
		int var1 = field589;

		while (field588[field589++] != 10) {
		}

		byte[] var2 = new byte[field589 - var1 - 1];
		for (int var3 = var1; var3 < field589 - 1; var3++) {
			var2[var3 - var1] = field588[var3];
		}

		return var2;
	}

	@ObfuscatedName("EGCCHUZS.a(II[BI)V")
	public void method270(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field588[field589++];
		}
	}

	@ObfuscatedName("EGCCHUZS.c(Z)V")
	public void method271() {
		field590 = field589 * 8;
	}

	@ObfuscatedName("EGCCHUZS.b(IB)I")
	public int method272(int arg0) {
		int var2 = field590 >> 3;
		int var3 = 8 - (field590 & 0x7);
		int var4 = 0;
		field590 += arg0;

		while (arg0 > var3) {
			var4 += (field588[var2++] & field592[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field588[var2] & field592[var3];
		} else {
			var4 += field588[var2] >> var3 - arg0 & field592[arg0];
		}

		return var4;
	}

	@ObfuscatedName("EGCCHUZS.a(B)V")
	public void method273() {
		field589 = (field590 + 7) / 8;
	}

	@ObfuscatedName("EGCCHUZS.j()I")
	public int method274() {
		int var1 = field588[field589] & 0xFF;
		if (var1 < 128) {
			return method261() - 64;
		}

		return method263() - 49152;
	}

	@ObfuscatedName("EGCCHUZS.k()I")
	public int method275() {
		int var1 = field588[field589] & 0xFF;
		if (var1 < 128) {
			return method261();
		}

		return method263() - 32768;
	}

	@ObfuscatedName("EGCCHUZS.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method276(BigInteger arg0, BigInteger arg1) {
		int var3 = field589;
		field589 = 0;
		byte[] var4 = new byte[var3];
		method270(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field589 = 0;
		method251(var7.length);
		method259(var7, 0, var7.length);
	}

	@ObfuscatedName("EGCCHUZS.c(IB)V")
	public void method277(int arg0) {
		field588[field589++] = (byte) -arg0;
	}

	@ObfuscatedName("EGCCHUZS.a(BI)V")
	public void method278(int arg0) {
		field588[field589++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("EGCCHUZS.e(I)I")
	public int method279() {
		return field588[field589++] - 128 & 0xFF;
	}

	@ObfuscatedName("EGCCHUZS.d(Z)I")
	public int method280() {
		return -field588[field589++] & 0xFF;
	}

	@ObfuscatedName("EGCCHUZS.e(Z)I")
	public int method281() {
		return 128 - field588[field589++] & 0xFF;
	}

	@ObfuscatedName("EGCCHUZS.b(B)B")
	public byte method282() {
		return (byte) -field588[field589++];
	}

	@ObfuscatedName("EGCCHUZS.c(B)B")
	public byte method283() {
		return (byte) (128 - field588[field589++]);
	}

	@ObfuscatedName("EGCCHUZS.e(II)V")
	public void method284(int arg0) {
		field588[field589++] = (byte) arg0;
		field588[field589++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EGCCHUZS.a(ZI)V")
	public void method285(int arg0) {
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("EGCCHUZS.d(IB)V")
	public void method286(int arg0) {
		field588[field589++] = (byte) (arg0 + 128);
		field588[field589++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("EGCCHUZS.f(I)I")
	public int method287() {
		field589 += 2;
		return ((field588[field589 - 1] & 0xFF) << 8) + (field588[field589 - 2] & 0xFF);
	}

	@ObfuscatedName("EGCCHUZS.g(I)I")
	public int method288() {
		field589 += 2;
		return ((field588[field589 - 2] & 0xFF) << 8) + (field588[field589 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("EGCCHUZS.h(I)I")
	public int method289() {
		field589 += 2;
		return ((field588[field589 - 1] & 0xFF) << 8) + (field588[field589 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("EGCCHUZS.f(Z)I")
	public int method290() {
		field589 += 2;
		int var1 = ((field588[field589 - 1] & 0xFF) << 8) + (field588[field589 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EGCCHUZS.d(B)I")
	public int method291() {
		field589 += 2;
		int var1 = ((field588[field589 - 2] & 0xFF) << 8) + (field588[field589 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EGCCHUZS.i(I)I")
	public int method292() {
		field589 += 2;
		int var1 = ((field588[field589 - 1] & 0xFF) << 8) + (field588[field589 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("EGCCHUZS.j(I)I")
	public int method293() {
		field589 += 3;
		return (field588[field589 - 3] & 0xFF) + ((field588[field589 - 1] & 0xFF) << 16) + ((field588[field589 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("EGCCHUZS.a(IZ)V")
	public void method294(int arg0) {
		field588[field589++] = (byte) arg0;
		field588[field589++] = (byte) (arg0 >> 8);
		field588[field589++] = (byte) (arg0 >> 16);
		field588[field589++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("EGCCHUZS.g(Z)I")
	public int method295() {
		field589 += 4;
		return (field588[field589 - 4] & 0xFF) + ((field588[field589 - 3] & 0xFF) << 8) + ((field588[field589 - 1] & 0xFF) << 24) + ((field588[field589 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("EGCCHUZS.k(I)I")
	public int method296() {
		field589 += 4;
		return (field588[field589 - 3] & 0xFF) + ((field588[field589 - 4] & 0xFF) << 8) + ((field588[field589 - 2] & 0xFF) << 24) + ((field588[field589 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("EGCCHUZS.l(I)I")
	public int method297() {
		field589 += 4;
		return (field588[field589 - 2] & 0xFF) + ((field588[field589 - 1] & 0xFF) << 8) + ((field588[field589 - 3] & 0xFF) << 24) + ((field588[field589 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("EGCCHUZS.a(Z[BII)V")
	public void method298(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = (byte) (field588[field589++] - 128);
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

			field591[var0] = var1;
		}
	}
}
