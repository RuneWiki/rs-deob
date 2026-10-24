package deob;

@ObfuscatedName("GRRWPPAT")
public class GRRWPPAT {

	@ObfuscatedName("GRRWPPAT.f")
	public OZEEIHVG[] field620 = new OZEEIHVG[10];

	@ObfuscatedName("GRRWPPAT.b")
	public static GRRWPPAT[] field616 = new GRRWPPAT[5000];

	@ObfuscatedName("GRRWPPAT.c")
	public static int[] field617 = new int[5000];

	@ObfuscatedName("GRRWPPAT.g")
	public int field621;

	@ObfuscatedName("GRRWPPAT.h")
	public int field622;

	@ObfuscatedName("GRRWPPAT.e")
	public static RGCGKKUR field619;

	@ObfuscatedName("GRRWPPAT.d")
	public static byte[] field618;

	@ObfuscatedName("GRRWPPAT.a(BLRGCGKKUR;)V")
	public static final void method211(RGCGKKUR arg0) {
		field618 = new byte[441000];
		field619 = new RGCGKKUR(field618);
		OZEEIHVG.method415();

		while (true) {
			int var1 = arg0.method457();
			if (var1 == 0xFFFF) {
				return;
			}

			field616[var1] = new GRRWPPAT();
			field616[var1].method213(arg0);
			field617[var1] = field616[var1].method214();
		}
	}

	@ObfuscatedName("GRRWPPAT.a(III)LRGCGKKUR;")
	public static final RGCGKKUR method212(int arg0, int arg1) {
		if (field616[arg0] != null) {
			GRRWPPAT var2 = field616[arg0];
			return var2.method215(arg1);
		}

		return null;
	}

	@ObfuscatedName("GRRWPPAT.a(ILRGCGKKUR;)V")
	public final void method213(RGCGKKUR arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method455();
			if (var3 != 0) {
				arg0.field1350--;
				field620[var2] = new OZEEIHVG();
				field620[var2].method418(arg0);
			}
		}

		field621 = arg0.method457();
		field622 = arg0.method457();
	}

	@ObfuscatedName("GRRWPPAT.a(Z)I")
	public final int method214() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field620[var2] != null && field620[var2].field1180 / 20 < var1) {
				var1 = field620[var2].field1180 / 20;
			}
		}

		if (field621 < field622 && field621 / 20 < var1) {
			var1 = field621 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field620[var3] != null) {
					field620[var3].field1180 -= var1 * 20;
				}
			}

			if (field621 < field622) {
				field621 -= var1 * 20;
				field622 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("GRRWPPAT.a(BI)LRGCGKKUR;")
	public final RGCGKKUR method215(int arg0) {
		int var2 = method216(arg0);
		field619.field1350 = 0;
		field619.method449(0x52494646);
		field619.method450(var2 + 36);
		field619.method449(0x57415645);
		field619.method449(0x666D7420);
		field619.method450(16);
		field619.method447(1);
		field619.method447(1);
		field619.method450(22050);
		field619.method450(22050);
		field619.method447(1);
		field619.method447(8);
		field619.method449(0x64617461);
		field619.method450(var2);
		field619.field1350 += var2;
		return field619;
	}

	@ObfuscatedName("GRRWPPAT.a(I)I")
	public final int method216(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field620[var3] != null && field620[var3].field1180 + field620[var3].field1179 > var2) {
				var2 = field620[var3].field1180 + field620[var3].field1179;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field621 * 22050 / 1000;
		int var6 = field622 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field618[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field620[var9] != null) {
				int var10 = field620[var9].field1179 * 22050 / 1000;
				int var11 = field620[var9].field1180 * 22050 / 1000;
				int[] var12 = field620[var9].method416(var10, field620[var9].field1179);
				for (int var13 = 0; var13 < var10; var13++) {
					field618[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field618[var14 + var15] = field618[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field618[var17 + var18] = field618[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
