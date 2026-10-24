package deob;

import java.math.BigInteger;

@ObfuscatedName("UAWAYCTK")
public final class UAWAYCTK extends EWMBJETC {

	@ObfuscatedName("UAWAYCTK.z")
	public byte[] field1251;

	@ObfuscatedName("UAWAYCTK.A")
	public int field1252;

	@ObfuscatedName("UAWAYCTK.C")
	public static int[] field1254 = new int[256];

	@ObfuscatedName("UAWAYCTK.D")
	public static final int[] field1255 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("UAWAYCTK.I")
	public static URASIGRB field1260 = new URASIGRB();

	@ObfuscatedName("UAWAYCTK.J")
	public static URASIGRB field1261 = new URASIGRB();

	@ObfuscatedName("UAWAYCTK.K")
	public static URASIGRB field1262 = new URASIGRB();

	@ObfuscatedName("UAWAYCTK.L")
	public static char[] field1263 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("UAWAYCTK.B")
	public int field1253;

	@ObfuscatedName("UAWAYCTK.F")
	public static int field1257;

	@ObfuscatedName("UAWAYCTK.G")
	public static int field1258;

	@ObfuscatedName("UAWAYCTK.H")
	public static int field1259;

	@ObfuscatedName("UAWAYCTK.E")
	public VZIKSEDY field1256;

	@ObfuscatedName("UAWAYCTK.a(II)LUAWAYCTK;")
	public static UAWAYCTK method443(int arg0) {
		synchronized (field1261) {
			UAWAYCTK var2 = null;
			if (arg0 == 0 && field1257 > 0) {
				field1257--;
				var2 = (UAWAYCTK) field1260.method502();
			} else if (arg0 == 1 && field1258 > 0) {
				field1258--;
				var2 = (UAWAYCTK) field1261.method502();
			} else if (arg0 == 2 && field1259 > 0) {
				field1259--;
				var2 = (UAWAYCTK) field1262.method502();
			}

			if (var2 != null) {
				var2.field1252 = 0;
				return var2;
			}
		}

		UAWAYCTK var4 = new UAWAYCTK();
		var4.field1252 = 0;

		if (arg0 == 0) {
			var4.field1251 = new byte[100];
		} else if (arg0 == 1) {
			var4.field1251 = new byte[5000];
		} else {
			var4.field1251 = new byte[30000];
		}

		return var4;
	}

	public UAWAYCTK() {
	}

	public UAWAYCTK(byte[] arg0) {
		field1251 = arg0;
		field1252 = 0;
	}

	@ObfuscatedName("UAWAYCTK.a(ZI)V")
	public void method444(int arg0) {
		field1251[field1252++] = (byte) (arg0 + field1256.method518());
	}

	@ObfuscatedName("UAWAYCTK.a(I)V")
	public void method445(int arg0) {
		field1251[field1252++] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.b(I)V")
	public void method446(int arg0) {
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.b(II)V")
	public void method447(int arg0) {
		field1251[field1252++] = (byte) arg0;
		field1251[field1252++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("UAWAYCTK.c(I)V")
	public void method448(int arg0) {
		field1251[field1252++] = (byte) (arg0 >> 16);
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.d(I)V")
	public void method449(int arg0) {
		field1251[field1252++] = (byte) (arg0 >> 24);
		field1251[field1252++] = (byte) (arg0 >> 16);
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.c(II)V")
	public void method450(int arg0) {
		field1251[field1252++] = (byte) arg0;
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) (arg0 >> 16);
		field1251[field1252++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("UAWAYCTK.a(JZ)V")
	public void method451(long arg0) {
		field1251[field1252++] = (byte) (arg0 >> 56);
		field1251[field1252++] = (byte) (arg0 >> 48);
		field1251[field1252++] = (byte) (arg0 >> 40);
		field1251[field1252++] = (byte) (arg0 >> 32);
		field1251[field1252++] = (byte) (arg0 >> 24);
		field1251[field1252++] = (byte) (arg0 >> 16);
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.a(Ljava/lang/String;)V")
	public void method452(String arg0) {
		arg0.getBytes(0, arg0.length(), field1251, field1252);
		field1252 += arg0.length();
		field1251[field1252++] = 10;
	}

	@ObfuscatedName("UAWAYCTK.a([BZII)V")
	public void method453(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field1251[field1252++] = arg0[var4];
		}
	}

	@ObfuscatedName("UAWAYCTK.d(II)V")
	public void method454(int arg0) {
		field1251[field1252 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("UAWAYCTK.c()I")
	public int method455() {
		return field1251[field1252++] & 0xFF;
	}

	@ObfuscatedName("UAWAYCTK.d()B")
	public byte method456() {
		return field1251[field1252++];
	}

	@ObfuscatedName("UAWAYCTK.e()I")
	public int method457() {
		field1252 += 2;
		return ((field1251[field1252 - 2] & 0xFF) << 8) + (field1251[field1252 - 1] & 0xFF);
	}

	@ObfuscatedName("UAWAYCTK.f()I")
	public int method458() {
		field1252 += 2;
		int var1 = ((field1251[field1252 - 2] & 0xFF) << 8) + (field1251[field1252 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("UAWAYCTK.g()I")
	public int method459() {
		field1252 += 3;
		return (field1251[field1252 - 1] & 0xFF) + ((field1251[field1252 - 3] & 0xFF) << 16) + ((field1251[field1252 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("UAWAYCTK.h()I")
	public int method460() {
		field1252 += 4;
		return (field1251[field1252 - 1] & 0xFF) + ((field1251[field1252 - 2] & 0xFF) << 8) + ((field1251[field1252 - 4] & 0xFF) << 24) + ((field1251[field1252 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("UAWAYCTK.a(B)J")
	public long method461() {
		long var1 = method460() & 0xFFFFFFFFL;
		long var3 = method460() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("UAWAYCTK.i()Ljava/lang/String;")
	public String method462() {
		int var1 = field1252;

		while (field1251[field1252++] != 10) {
		}

		return new String(field1251, var1, field1252 - var1 - 1);
	}

	@ObfuscatedName("UAWAYCTK.e(I)[B")
	public byte[] method463() {
		int var1 = field1252;

		while (field1251[field1252++] != 10) {
		}

		byte[] var2 = new byte[field1252 - var1 - 1];
		for (int var3 = var1; var3 < field1252 - 1; var3++) {
			var2[var3 - var1] = field1251[var3];
		}

		return var2;
	}

	@ObfuscatedName("UAWAYCTK.a(I[BIZ)V")
	public void method464(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field1251[field1252++];
		}
	}

	@ObfuscatedName("UAWAYCTK.a(Z)V")
	public void method465() {
		field1253 = field1252 * 8;
	}

	@ObfuscatedName("UAWAYCTK.e(II)I")
	public int method466(int arg0) {
		int var2 = field1253 >> 3;
		int var3 = 8 - (field1253 & 0x7);
		int var4 = 0;
		field1253 += arg0;

		while (arg0 > var3) {
			var4 += (field1251[var2++] & field1255[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field1251[var2] & field1255[var3];
		} else {
			var4 += field1251[var2] >> var3 - arg0 & field1255[arg0];
		}

		return var4;
	}

	@ObfuscatedName("UAWAYCTK.b(Z)V")
	public void method467() {
		field1252 = (field1253 + 7) / 8;
	}

	@ObfuscatedName("UAWAYCTK.j()I")
	public int method468() {
		int var1 = field1251[field1252] & 0xFF;
		if (var1 < 128) {
			return method455() - 64;
		}

		return method457() - 49152;
	}

	@ObfuscatedName("UAWAYCTK.k()I")
	public int method469() {
		int var1 = field1251[field1252] & 0xFF;
		if (var1 < 128) {
			return method455();
		}

		return method457() - 32768;
	}

	@ObfuscatedName("UAWAYCTK.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method470(BigInteger arg0, BigInteger arg1) {
		int var3 = field1252;
		field1252 = 0;
		byte[] var4 = new byte[var3];
		method464(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field1252 = 0;
		method445(var7.length);
		method453(var7, 0, var7.length);
	}

	@ObfuscatedName("UAWAYCTK.f(II)V")
	public void method471(int arg0) {
		field1251[field1252++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("UAWAYCTK.a(IB)V")
	public void method472(int arg0) {
		field1251[field1252++] = (byte) -arg0;
	}

	@ObfuscatedName("UAWAYCTK.g(II)V")
	public void method473(int arg0) {
		field1251[field1252++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("UAWAYCTK.b(B)I")
	public int method474() {
		return field1251[field1252++] - 128 & 0xFF;
	}

	@ObfuscatedName("UAWAYCTK.c(B)I")
	public int method475() {
		return -field1251[field1252++] & 0xFF;
	}

	@ObfuscatedName("UAWAYCTK.d(B)I")
	public int method476() {
		return 128 - field1251[field1252++] & 0xFF;
	}

	@ObfuscatedName("UAWAYCTK.f(I)B")
	public byte method477() {
		return (byte) (field1251[field1252++] - 128);
	}

	@ObfuscatedName("UAWAYCTK.e(B)B")
	public byte method478() {
		return (byte) (128 - field1251[field1252++]);
	}

	@ObfuscatedName("UAWAYCTK.h(II)V")
	public void method479(int arg0) {
		field1251[field1252++] = (byte) arg0;
		field1251[field1252++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("UAWAYCTK.i(II)V")
	public void method480(int arg0) {
		field1251[field1252++] = (byte) (arg0 >> 8);
		field1251[field1252++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("UAWAYCTK.j(II)V")
	public void method481(int arg0) {
		field1251[field1252++] = (byte) (arg0 + 128);
		field1251[field1252++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("UAWAYCTK.g(I)I")
	public int method482() {
		field1252 += 2;
		return ((field1251[field1252 - 1] & 0xFF) << 8) + (field1251[field1252 - 2] & 0xFF);
	}

	@ObfuscatedName("UAWAYCTK.h(I)I")
	public int method483() {
		field1252 += 2;
		return ((field1251[field1252 - 2] & 0xFF) << 8) + (field1251[field1252 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("UAWAYCTK.c(Z)I")
	public int method484() {
		field1252 += 2;
		return ((field1251[field1252 - 1] & 0xFF) << 8) + (field1251[field1252 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("UAWAYCTK.f(B)I")
	public int method485() {
		field1252 += 2;
		int var1 = ((field1251[field1252 - 2] & 0xFF) << 8) + (field1251[field1252 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("UAWAYCTK.i(I)I")
	public int method486() {
		field1252 += 2;
		int var1 = ((field1251[field1252 - 1] & 0xFF) << 8) + (field1251[field1252 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("UAWAYCTK.g(B)I")
	public int method487() {
		field1252 += 3;
		return (field1251[field1252 - 2] & 0xFF) + ((field1251[field1252 - 3] & 0xFF) << 16) + ((field1251[field1252 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("UAWAYCTK.k(II)V")
	public void method488(int arg0) {
		field1251[field1252++] = (byte) (arg0 >> 16);
		field1251[field1252++] = (byte) (arg0 >> 24);
		field1251[field1252++] = (byte) arg0;
		field1251[field1252++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("UAWAYCTK.d(Z)I")
	public int method489() {
		field1252 += 4;
		return (field1251[field1252 - 4] & 0xFF) + ((field1251[field1252 - 3] & 0xFF) << 8) + ((field1251[field1252 - 1] & 0xFF) << 24) + ((field1251[field1252 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("UAWAYCTK.j(I)I")
	public int method490() {
		field1252 += 4;
		return (field1251[field1252 - 3] & 0xFF) + ((field1251[field1252 - 4] & 0xFF) << 8) + ((field1251[field1252 - 2] & 0xFF) << 24) + ((field1251[field1252 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("UAWAYCTK.h(B)I")
	public int method491() {
		field1252 += 4;
		return (field1251[field1252 - 2] & 0xFF) + ((field1251[field1252 - 1] & 0xFF) << 8) + ((field1251[field1252 - 3] & 0xFF) << 24) + ((field1251[field1252 - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("UAWAYCTK.b([BZII)V")
	public void method492(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field1251[field1252++] = (byte) (arg0[var4] + 128);
		}
	}

	@ObfuscatedName("UAWAYCTK.a(II[BI)V")
	public void method493(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg2; var4--) {
			arg1[var4] = field1251[field1252++];
		}
	}

	@ObfuscatedName("UAWAYCTK.a(I[BII)V")
	public void method494(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = (byte) (field1251[field1252++] - 128);
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

			field1254[var0] = var1;
		}
	}
}
