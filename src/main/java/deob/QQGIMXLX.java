package deob;

@ObfuscatedName("QQGIMXLX")
public class QQGIMXLX {

	@ObfuscatedName("QQGIMXLX.i")
	public VSTUETUV[] field1070 = new VSTUETUV[10];

	@ObfuscatedName("QQGIMXLX.e")
	public static QQGIMXLX[] field1066 = new QQGIMXLX[5000];

	@ObfuscatedName("QQGIMXLX.f")
	public static int[] field1067 = new int[5000];

	@ObfuscatedName("QQGIMXLX.j")
	public int field1071;

	@ObfuscatedName("QQGIMXLX.k")
	public int field1072;

	@ObfuscatedName("QQGIMXLX.h")
	public static LDILQFVA field1069;

	@ObfuscatedName("QQGIMXLX.g")
	public static byte[] field1068;

	@ObfuscatedName("QQGIMXLX.a(ILLDILQFVA;)V")
	public static final void method502(LDILQFVA arg0) {
		field1068 = new byte[441000];
		field1069 = new LDILQFVA(field1068);
		VSTUETUV.method557();

		while (true) {
			int var1 = arg0.method404();
			if (var1 == 0xFFFF) {
				return;
			}

			field1066[var1] = new QQGIMXLX();
			field1066[var1].method504(arg0);
			field1067[var1] = field1066[var1].method505();
		}
	}

	@ObfuscatedName("QQGIMXLX.a(IIZ)LLDILQFVA;")
	public static final LDILQFVA method503(int arg0, int arg1) {
		if (field1066[arg0] != null) {
			QQGIMXLX var2 = field1066[arg0];
			return var2.method506(arg1);
		}

		return null;
	}

	@ObfuscatedName("QQGIMXLX.a(LLDILQFVA;I)V")
	public final void method504(LDILQFVA arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method402();
			if (var3 != 0) {
				arg0.field902--;
				field1070[var2] = new VSTUETUV();
				field1070[var2].method560(arg0);
			}
		}

		field1071 = arg0.method404();
		field1072 = arg0.method404();
	}

	@ObfuscatedName("QQGIMXLX.a(Z)I")
	public final int method505() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1070[var2] != null && field1070[var2].field1323 / 20 < var1) {
				var1 = field1070[var2].field1323 / 20;
			}
		}

		if (field1071 < field1072 && field1071 / 20 < var1) {
			var1 = field1071 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1070[var3] != null) {
					field1070[var3].field1323 -= var1 * 20;
				}
			}

			if (field1071 < field1072) {
				field1071 -= var1 * 20;
				field1072 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("QQGIMXLX.a(ZI)LLDILQFVA;")
	public final LDILQFVA method506(int arg0) {
		int var2 = method507(arg0);
		field1069.field902 = 0;
		field1069.method396(0x52494646);
		field1069.method397(var2 + 36);
		field1069.method396(0x57415645);
		field1069.method396(0x666D7420);
		field1069.method397(16);
		field1069.method394(1);
		field1069.method394(1);
		field1069.method397(22050);
		field1069.method397(22050);
		field1069.method394(1);
		field1069.method394(8);
		field1069.method396(0x64617461);
		field1069.method397(var2);
		field1069.field902 += var2;
		return field1069;
	}

	@ObfuscatedName("QQGIMXLX.a(I)I")
	public final int method507(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1070[var3] != null && field1070[var3].field1323 + field1070[var3].field1322 > var2) {
				var2 = field1070[var3].field1323 + field1070[var3].field1322;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1071 * 22050 / 1000;
		int var6 = field1072 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1068[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1070[var9] != null) {
				int var10 = field1070[var9].field1322 * 22050 / 1000;
				int var11 = field1070[var9].field1323 * 22050 / 1000;
				int[] var12 = field1070[var9].method558(var10, field1070[var9].field1322);
				for (int var13 = 0; var13 < var10; var13++) {
					field1068[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field1068[var14 + var15] = field1068[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1068[var17 + var18] = field1068[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
