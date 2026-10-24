package deob;

@ObfuscatedName("GTYZUNUD")
public class GTYZUNUD {

	@ObfuscatedName("GTYZUNUD.i")
	public CYFJILLF[] field733 = new CYFJILLF[10];

	@ObfuscatedName("GTYZUNUD.e")
	public static GTYZUNUD[] field729 = new GTYZUNUD[5000];

	@ObfuscatedName("GTYZUNUD.f")
	public static int[] field730 = new int[5000];

	@ObfuscatedName("GTYZUNUD.j")
	public int field734;

	@ObfuscatedName("GTYZUNUD.k")
	public int field735;

	@ObfuscatedName("GTYZUNUD.h")
	public static EILHLJCE field732;

	@ObfuscatedName("GTYZUNUD.g")
	public static byte[] field731;

	@ObfuscatedName("GTYZUNUD.a(ILEILHLJCE;)V")
	public static final void method297(EILHLJCE arg0) {
		field731 = new byte[441000];
		field732 = new EILHLJCE(field731);
		CYFJILLF.method182();

		while (true) {
			int var1 = arg0.method226();
			if (var1 == 0xFFFF) {
				return;
			}

			field729[var1] = new GTYZUNUD();
			field729[var1].method299(arg0);
			field730[var1] = field729[var1].method300();
		}
	}

	@ObfuscatedName("GTYZUNUD.a(BII)LEILHLJCE;")
	public static final EILHLJCE method298(int arg0, int arg1) {
		if (field729[arg1] != null) {
			GTYZUNUD var2 = field729[arg1];
			return var2.method301(arg0);
		}

		return null;
	}

	@ObfuscatedName("GTYZUNUD.a(LEILHLJCE;B)V")
	public final void method299(EILHLJCE arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method224();
			if (var3 != 0) {
				arg0.field684--;
				field733[var2] = new CYFJILLF();
				field733[var2].method185(arg0);
			}
		}

		field734 = arg0.method226();
		field735 = arg0.method226();
	}

	@ObfuscatedName("GTYZUNUD.a(I)I")
	public final int method300() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field733[var2] != null && field733[var2].field603 / 20 < var1) {
				var1 = field733[var2].field603 / 20;
			}
		}

		if (field734 < field735 && field734 / 20 < var1) {
			var1 = field734 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field733[var3] != null) {
					field733[var3].field603 -= var1 * 20;
				}
			}

			if (field734 < field735) {
				field734 -= var1 * 20;
				field735 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("GTYZUNUD.a(II)LEILHLJCE;")
	public final EILHLJCE method301(int arg0) {
		int var2 = method302(arg0);
		field732.field684 = 0;
		field732.method218(0x52494646);
		field732.method219(var2 + 36);
		field732.method218(0x57415645);
		field732.method218(0x666D7420);
		field732.method219(16);
		field732.method216(1);
		field732.method216(1);
		field732.method219(22050);
		field732.method219(22050);
		field732.method216(1);
		field732.method216(8);
		field732.method218(0x64617461);
		field732.method219(var2);
		field732.field684 += var2;
		return field732;
	}

	@ObfuscatedName("GTYZUNUD.b(I)I")
	public final int method302(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field733[var3] != null && field733[var3].field603 + field733[var3].field602 > var2) {
				var2 = field733[var3].field603 + field733[var3].field602;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field734 * 22050 / 1000;
		int var6 = field735 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field731[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field733[var9] != null) {
				int var10 = field733[var9].field602 * 22050 / 1000;
				int var11 = field733[var9].field603 * 22050 / 1000;
				int[] var12 = field733[var9].method183(var10, field733[var9].field602);
				for (int var13 = 0; var13 < var10; var13++) {
					field731[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field731[var14 + var15] = field731[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field731[var17 + var18] = field731[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
