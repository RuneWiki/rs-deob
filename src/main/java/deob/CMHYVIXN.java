package deob;

@ObfuscatedName("CMHYVIXN")
public class CMHYVIXN {

	@ObfuscatedName("CMHYVIXN.i")
	public WLTAOGXS[] field595 = new WLTAOGXS[10];

	@ObfuscatedName("CMHYVIXN.e")
	public static CMHYVIXN[] field591 = new CMHYVIXN[5000];

	@ObfuscatedName("CMHYVIXN.f")
	public static int[] field592 = new int[5000];

	@ObfuscatedName("CMHYVIXN.j")
	public int field596;

	@ObfuscatedName("CMHYVIXN.k")
	public int field597;

	@ObfuscatedName("CMHYVIXN.h")
	public static GLMIQHJI field594;

	@ObfuscatedName("CMHYVIXN.g")
	public static byte[] field593;

	@ObfuscatedName("CMHYVIXN.a(ZLGLMIQHJI;)V")
	public static final void method166(GLMIQHJI arg0) {
		field593 = new byte[441000];
		field594 = new GLMIQHJI(field593);
		WLTAOGXS.method551();

		while (true) {
			int var1 = arg0.method246();
			if (var1 == 0xFFFF) {
				return;
			}

			field591[var1] = new CMHYVIXN();
			field591[var1].method168(arg0);
			field592[var1] = field591[var1].method169();
		}
	}

	@ObfuscatedName("CMHYVIXN.a(III)LGLMIQHJI;")
	public static final GLMIQHJI method167(int arg0, int arg1) {
		if (field591[arg1] != null) {
			CMHYVIXN var2 = field591[arg1];
			return var2.method170(arg0);
		}

		return null;
	}

	@ObfuscatedName("CMHYVIXN.a(BLGLMIQHJI;)V")
	public final void method168(GLMIQHJI arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method244();
			if (var3 != 0) {
				arg0.field709--;
				field595[var2] = new WLTAOGXS();
				field595[var2].method554(arg0);
			}
		}

		field596 = arg0.method246();
		field597 = arg0.method246();
	}

	@ObfuscatedName("CMHYVIXN.a(I)I")
	public final int method169() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field595[var2] != null && field595[var2].field1355 / 20 < var1) {
				var1 = field595[var2].field1355 / 20;
			}
		}

		if (field596 < field597 && field596 / 20 < var1) {
			var1 = field596 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field595[var3] != null) {
					field595[var3].field1355 -= var1 * 20;
				}
			}

			if (field596 < field597) {
				field596 -= var1 * 20;
				field597 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("CMHYVIXN.a(BI)LGLMIQHJI;")
	public final GLMIQHJI method170(int arg0) {
		int var2 = method171(arg0);
		field594.field709 = 0;
		field594.method238(0x52494646);
		field594.method239(var2 + 36);
		field594.method238(0x57415645);
		field594.method238(0x666D7420);
		field594.method239(16);
		field594.method236(1);
		field594.method236(1);
		field594.method239(22050);
		field594.method239(22050);
		field594.method236(1);
		field594.method236(8);
		field594.method238(0x64617461);
		field594.method239(var2);
		field594.field709 += var2;
		return field594;
	}

	@ObfuscatedName("CMHYVIXN.b(I)I")
	public final int method171(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field595[var3] != null && field595[var3].field1355 + field595[var3].field1354 > var2) {
				var2 = field595[var3].field1355 + field595[var3].field1354;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field596 * 22050 / 1000;
		int var6 = field597 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field593[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field595[var9] != null) {
				int var10 = field595[var9].field1354 * 22050 / 1000;
				int var11 = field595[var9].field1355 * 22050 / 1000;
				int[] var12 = field595[var9].method552(var10, field595[var9].field1354);
				for (int var13 = 0; var13 < var10; var13++) {
					field593[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field593[var14 + var15] = field593[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field593[var17 + var18] = field593[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
