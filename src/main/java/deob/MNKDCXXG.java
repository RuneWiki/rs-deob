package deob;

import java.math.BigInteger;

@ObfuscatedName("MNKDCXXG")
public final class MNKDCXXG extends OHSXMHUZ {

	@ObfuscatedName("MNKDCXXG.u")
	public byte[] field1054;

	@ObfuscatedName("MNKDCXXG.v")
	public int field1055;

	@ObfuscatedName("MNKDCXXG.x")
	public static int[] field1057 = new int[256];

	@ObfuscatedName("MNKDCXXG.y")
	public static final int[] field1058 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MNKDCXXG.D")
	public static WOVRPCGT field1063 = new WOVRPCGT();

	@ObfuscatedName("MNKDCXXG.E")
	public static WOVRPCGT field1064 = new WOVRPCGT();

	@ObfuscatedName("MNKDCXXG.F")
	public static WOVRPCGT field1065 = new WOVRPCGT();

	@ObfuscatedName("MNKDCXXG.G")
	public static char[] field1066 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MNKDCXXG.w")
	public int field1056;

	@ObfuscatedName("MNKDCXXG.A")
	public static int field1060;

	@ObfuscatedName("MNKDCXXG.B")
	public static int field1061;

	@ObfuscatedName("MNKDCXXG.C")
	public static int field1062;

	@ObfuscatedName("MNKDCXXG.z")
	public UVSYUCDF field1059;

	@ObfuscatedName("MNKDCXXG.a(BI)LMNKDCXXG;")
	public static MNKDCXXG method374(int arg0) {
		synchronized (field1064) {
			MNKDCXXG var2 = null;
			if (arg0 == 0 && field1060 > 0) {
				field1060--;
				var2 = (MNKDCXXG) field1063.method542();
			} else if (arg0 == 1 && field1061 > 0) {
				field1061--;
				var2 = (MNKDCXXG) field1064.method542();
			} else if (arg0 == 2 && field1062 > 0) {
				field1062--;
				var2 = (MNKDCXXG) field1065.method542();
			}

			if (var2 != null) {
				var2.field1055 = 0;
				return var2;
			}
		}

		MNKDCXXG var4 = new MNKDCXXG();
		var4.field1055 = 0;

		if (arg0 == 0) {
			var4.field1054 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1054 = new byte[5000];
		} else {
			var4.field1054 = new byte[30000];
		}

		return var4;
	}

	public MNKDCXXG() {
	}

	public MNKDCXXG(byte[] arg0) {
		field1054 = arg0;
		field1055 = 0;
	}

	@ObfuscatedName("MNKDCXXG.a(II)V")
	public void method375(int arg0) {
		field1054[field1055++] = (byte) (arg0 + field1059.method514());
	}

	@ObfuscatedName("MNKDCXXG.a(I)V")
	public void method376(int arg0) {
		field1054[field1055++] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.b(I)V")
	public void method377(int arg0) {
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.b(II)V")
	public void method378(int arg0) {
		field1054[field1055++] = (byte) arg0;
		field1054[field1055++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MNKDCXXG.c(I)V")
	public void method379(int arg0) {
		field1054[field1055++] = (byte) (arg0 >> 16);
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.d(I)V")
	public void method380(int arg0) {
		field1054[field1055++] = (byte) (arg0 >> 24);
		field1054[field1055++] = (byte) (arg0 >> 16);
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.c(II)V")
	public void method381(int arg0) {
		field1054[field1055++] = (byte) arg0;
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) (arg0 >> 16);
		field1054[field1055++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MNKDCXXG.a(JI)V")
	public void method382(long arg0) {
		field1054[field1055++] = (byte) (arg0 >> 56);
		field1054[field1055++] = (byte) (arg0 >> 48);
		field1054[field1055++] = (byte) (arg0 >> 40);
		field1054[field1055++] = (byte) (arg0 >> 32);
		field1054[field1055++] = (byte) (arg0 >> 24);
		field1054[field1055++] = (byte) (arg0 >> 16);
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.a(Ljava/lang/String;)V")
	public void method383(String arg0) {
		arg0.getBytes(0, arg0.length(), field1054, field1055);
		field1055 += arg0.length();
		field1054[field1055++] = 10;
	}

	@ObfuscatedName("MNKDCXXG.a(III[B)V")
	public void method384(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field1054[field1055++] = arg2[var4];
		}
	}

	@ObfuscatedName("MNKDCXXG.a(ZI)V")
	public void method385(int arg0) {
		field1054[field1055 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MNKDCXXG.c()I")
	public int method386() {
		return field1054[field1055++] & 0xFF;
	}

	@ObfuscatedName("MNKDCXXG.d()B")
	public byte method387() {
		return field1054[field1055++];
	}

	@ObfuscatedName("MNKDCXXG.e()I")
	public int method388() {
		field1055 += 2;
		return ((field1054[field1055 - 2] & 0xFF) << 8) + (field1054[field1055 - 1] & 0xFF);
	}

	@ObfuscatedName("MNKDCXXG.f()I")
	public int method389() {
		field1055 += 2;
		int var1 = ((field1054[field1055 - 2] & 0xFF) << 8) + (field1054[field1055 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MNKDCXXG.g()I")
	public int method390() {
		field1055 += 3;
		return (field1054[field1055 - 1] & 0xFF) + ((field1054[field1055 - 3] & 0xFF) << 16) + ((field1054[field1055 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MNKDCXXG.h()I")
	public int method391() {
		field1055 += 4;
		return (field1054[field1055 - 1] & 0xFF) + ((field1054[field1055 - 2] & 0xFF) << 8) + ((field1054[field1055 - 4] & 0xFF) << 24) + ((field1054[field1055 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MNKDCXXG.a(B)J")
	public long method392() {
		long var1 = method391() & 0xFFFFFFFFL;
		long var3 = method391() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MNKDCXXG.i()Ljava/lang/String;")
	public String method393() {
		int var1 = field1055;

		while (field1054[field1055++] != 10) {
		}

		return new String(field1054, var1, field1055 - var1 - 1);
	}

	@ObfuscatedName("MNKDCXXG.e(I)[B")
	public byte[] method394() {
		int var1 = field1055;

		while (field1054[field1055++] != 10) {
		}

		byte[] var2 = new byte[field1055 - var1 - 1];
		for (int var3 = var1; var3 < field1055 - 1; var3++) {
			var2[var3 - var1] = field1054[var3];
		}

		return var2;
	}

	@ObfuscatedName("MNKDCXXG.a([BIII)V")
	public void method395(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field1054[field1055++];
		}
	}

	@ObfuscatedName("MNKDCXXG.b(B)V")
	public void method396() {
		field1056 = field1055 * 8;
	}

	@ObfuscatedName("MNKDCXXG.d(II)I")
	public int method397(int arg0) {
		int var2 = field1056 >> 3;
		int var3 = 8 - (field1056 & 0x7);
		int var4 = 0;
		field1056 += arg0;

		while (arg0 > var3) {
			var4 += (field1054[var2++] & field1058[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1054[var2] & field1058[var3];
		} else {
			var4 += field1054[var2] >> var3 - arg0 & field1058[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MNKDCXXG.f(I)V")
	public void method398() {
		field1055 = (field1056 + 7) / 8;
	}

	@ObfuscatedName("MNKDCXXG.j()I")
	public int method399() {
		int var1 = field1054[field1055] & 0xFF;
		if (var1 < 128) {
			return method386() - 64;
		}

		return method388() - 49152;
	}

	@ObfuscatedName("MNKDCXXG.k()I")
	public int method400() {
		int var1 = field1054[field1055] & 0xFF;
		if (var1 < 128) {
			return method386();
		}

		return method388() - 32768;
	}

	@ObfuscatedName("MNKDCXXG.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method401(BigInteger arg0, BigInteger arg1) {
		int var3 = field1055;
		field1055 = 0;
		byte[] var4 = new byte[var3];
		method395(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1055 = 0;
		method376(var7.length);
		method384(0, var7.length, var7);
	}

	@ObfuscatedName("MNKDCXXG.b(BI)V")
	public void method402(int arg0) {
		field1054[field1055++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MNKDCXXG.c(BI)V")
	public void method403(int arg0) {
		field1054[field1055++] = (byte) -arg0;
	}

	@ObfuscatedName("MNKDCXXG.b(ZI)V")
	public void method404(int arg0) {
		field1054[field1055++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MNKDCXXG.g(I)I")
	public int method405() {
		return field1054[field1055++] - 128 & 0xFF;
	}

	@ObfuscatedName("MNKDCXXG.h(I)I")
	public int method406() {
		return -field1054[field1055++] & 0xFF;
	}

	@ObfuscatedName("MNKDCXXG.c(B)I")
	public int method407() {
		return 128 - field1054[field1055++] & 0xFF;
	}

	@ObfuscatedName("MNKDCXXG.a(Z)B")
	public byte method408() {
		return (byte) (field1054[field1055++] - 128);
	}

	@ObfuscatedName("MNKDCXXG.d(B)B")
	public byte method409() {
		return (byte) (128 - field1054[field1055++]);
	}

	@ObfuscatedName("MNKDCXXG.a(IZ)V")
	public void method410(int arg0) {
		field1054[field1055++] = (byte) arg0;
		field1054[field1055++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MNKDCXXG.b(IZ)V")
	public void method411(int arg0) {
		field1054[field1055++] = (byte) (arg0 >> 8);
		field1054[field1055++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MNKDCXXG.e(II)V")
	public void method412(int arg0) {
		field1054[field1055++] = (byte) (arg0 + 128);
		field1054[field1055++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MNKDCXXG.i(I)I")
	public int method413() {
		field1055 += 2;
		return ((field1054[field1055 - 1] & 0xFF) << 8) + (field1054[field1055 - 2] & 0xFF);
	}

	@ObfuscatedName("MNKDCXXG.j(I)I")
	public int method414() {
		field1055 += 2;
		return ((field1054[field1055 - 2] & 0xFF) << 8) + (field1054[field1055 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MNKDCXXG.e(B)I")
	public int method415() {
		field1055 += 2;
		return ((field1054[field1055 - 1] & 0xFF) << 8) + (field1054[field1055 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MNKDCXXG.b(Z)I")
	public int method416() {
		field1055 += 2;
		int var1 = ((field1054[field1055 - 1] & 0xFF) << 8) + (field1054[field1055 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MNKDCXXG.k(I)I")
	public int method417() {
		field1055 += 2;
		int var1 = ((field1054[field1055 - 2] & 0xFF) << 8) + (field1054[field1055 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MNKDCXXG.l(I)I")
	public int method418() {
		field1055 += 2;
		int var1 = ((field1054[field1055 - 1] & 0xFF) << 8) + (field1054[field1055 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MNKDCXXG.m(I)I")
	public int method419() {
		field1055 += 3;
		return (field1054[field1055 - 2] & 0xFF) + ((field1054[field1055 - 3] & 0xFF) << 16) + ((field1054[field1055 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("MNKDCXXG.a(IB)V")
	public void method420(int arg0) {
		field1054[field1055++] = (byte) (arg0 >> 16);
		field1054[field1055++] = (byte) (arg0 >> 24);
		field1054[field1055++] = (byte) arg0;
		field1054[field1055++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MNKDCXXG.n(I)I")
	public int method421() {
		field1055 += 4;
		return (field1054[field1055 - 4] & 0xFF) + ((field1054[field1055 - 3] & 0xFF) << 8) + ((field1054[field1055 - 1] & 0xFF) << 24) + ((field1054[field1055 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MNKDCXXG.o(I)I")
	public int method422() {
		field1055 += 4;
		return (field1054[field1055 - 3] & 0xFF) + ((field1054[field1055 - 4] & 0xFF) << 8) + ((field1054[field1055 - 2] & 0xFF) << 24) + ((field1054[field1055 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MNKDCXXG.c(Z)I")
	public int method423() {
		field1055 += 4;
		return (field1054[field1055 - 2] & 0xFF) + ((field1054[field1055 - 1] & 0xFF) << 8) + ((field1054[field1055 - 3] & 0xFF) << 24) + ((field1054[field1055 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MNKDCXXG.b([BIII)V")
	public void method424(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (field1054[field1055++] - 128);
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

			field1057[var0] = var1;
		}
	}
}
