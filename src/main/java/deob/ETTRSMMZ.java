package deob;

@ObfuscatedName("ETTRSMMZ")
public class ETTRSMMZ {

	@ObfuscatedName("ETTRSMMZ.j")
	public QGBENKJV[] field579 = new QGBENKJV[10];

	@ObfuscatedName("ETTRSMMZ.f")
	public static ETTRSMMZ[] field575 = new ETTRSMMZ[5000];

	@ObfuscatedName("ETTRSMMZ.g")
	public static int[] field576 = new int[5000];

	@ObfuscatedName("ETTRSMMZ.k")
	public int field580;

	@ObfuscatedName("ETTRSMMZ.l")
	public int field581;

	@ObfuscatedName("ETTRSMMZ.i")
	public static MQZHAILV field578;

	@ObfuscatedName("ETTRSMMZ.h")
	public static byte[] field577;

	@ObfuscatedName("ETTRSMMZ.a(LMQZHAILV;B)V")
	public static final void method224(MQZHAILV arg0) {
		field577 = new byte[441000];
		field578 = new MQZHAILV(field577);
		QGBENKJV.method381();

		while (true) {
			int var1 = arg0.method327();
			if (var1 == 0xFFFF) {
				return;
			}

			field575[var1] = new ETTRSMMZ();
			field575[var1].method226(arg0);
			field576[var1] = field575[var1].method227();
		}
	}

	@ObfuscatedName("ETTRSMMZ.a(BII)LMQZHAILV;")
	public static final MQZHAILV method225(int arg0, int arg1) {
		if (field575[arg1] != null) {
			ETTRSMMZ var2 = field575[arg1];
			return var2.method228(arg0);
		}

		return null;
	}

	@ObfuscatedName("ETTRSMMZ.a(LMQZHAILV;I)V")
	public final void method226(MQZHAILV arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method325();
			if (var3 != 0) {
				arg0.field797--;
				field579[var2] = new QGBENKJV();
				field579[var2].method384(arg0);
			}
		}

		field580 = arg0.method327();
		field581 = arg0.method327();
	}

	@ObfuscatedName("ETTRSMMZ.a(B)I")
	public final int method227() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field579[var2] != null && field579[var2].field873 / 20 < var1) {
				var1 = field579[var2].field873 / 20;
			}
		}

		if (field580 < field581 && field580 / 20 < var1) {
			var1 = field580 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field579[var3] != null) {
					field579[var3].field873 -= var1 * 20;
				}
			}

			if (field580 < field581) {
				field580 -= var1 * 20;
				field581 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("ETTRSMMZ.a(II)LMQZHAILV;")
	public final MQZHAILV method228(int arg0) {
		int var2 = method229(arg0);
		field578.field797 = 0;
		field578.method319(0x52494646);
		field578.method320(var2 + 36);
		field578.method319(0x57415645);
		field578.method319(0x666D7420);
		field578.method320(16);
		field578.method317(1);
		field578.method317(1);
		field578.method320(22050);
		field578.method320(22050);
		field578.method317(1);
		field578.method317(8);
		field578.method319(0x64617461);
		field578.method320(var2);
		field578.field797 += var2;
		return field578;
	}

	@ObfuscatedName("ETTRSMMZ.a(I)I")
	public final int method229(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field579[var3] != null && field579[var3].field873 + field579[var3].field872 > var2) {
				var2 = field579[var3].field873 + field579[var3].field872;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field580 * 22050 / 1000;
		int var6 = field581 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field577[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field579[var9] != null) {
				int var10 = field579[var9].field872 * 22050 / 1000;
				int var11 = field579[var9].field873 * 22050 / 1000;
				int[] var12 = field579[var9].method382(var10, field579[var9].field872);
				for (int var13 = 0; var13 < var10; var13++) {
					field577[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field577[var14 + var15] = field577[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field577[var17 + var18] = field577[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
