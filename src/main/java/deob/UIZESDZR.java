package deob;

@ObfuscatedName("UIZESDZR")
public class UIZESDZR {

	@ObfuscatedName("UIZESDZR.c")
	public int field1399;

	@ObfuscatedName("UIZESDZR.e")
	public int field1401;

	@ObfuscatedName("UIZESDZR.d")
	public KLNBCMBU field1400;

	@ObfuscatedName("UIZESDZR.f")
	public int[] field1402;

	@ObfuscatedName("UIZESDZR.g")
	public int[] field1403;

	@ObfuscatedName("UIZESDZR.h")
	public int[] field1404;

	@ObfuscatedName("UIZESDZR.i")
	public int[] field1405;

	@ObfuscatedName("UIZESDZR.b")
	public static UIZESDZR[] field1398;

	@ObfuscatedName("UIZESDZR.j")
	public static boolean[] field1406;

	@ObfuscatedName("UIZESDZR.a(I)V")
	public static void method520(int arg0) {
		field1398 = new UIZESDZR[arg0 + 1];
		field1406 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1406[var1] = true;
		}
	}

	@ObfuscatedName("UIZESDZR.a(I[B)V")
	public static void method521(byte[] arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0);
		var1.field5 = arg0.length - 8;
		int var2 = var1.method17();
		int var3 = var1.method17();
		int var4 = var1.method17();
		int var5 = var1.method17();
		int var6 = 0;
		BJPWOXRJ var7 = new BJPWOXRJ(arg0);
		var7.field5 = var6;
		var6 += var2 + 2;
		BJPWOXRJ var8 = new BJPWOXRJ(arg0);
		var8.field5 = var6;
		var6 += var3;
		BJPWOXRJ var9 = new BJPWOXRJ(arg0);
		var9.field5 = var6;
		var6 += var4;
		BJPWOXRJ var10 = new BJPWOXRJ(arg0);
		var10.field5 = var6;
		var6 += var5;
		BJPWOXRJ var11 = new BJPWOXRJ(arg0);
		var11.field5 = var6;
		KLNBCMBU var12 = new KLNBCMBU(var11);
		int var13 = var7.method17();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method17();
			UIZESDZR var20 = field1398[var19] = new UIZESDZR();
			var20.field1399 = var10.method15();
			var20.field1400 = var12;
			int var21 = var7.method15();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method15();
				if (var25 > 0) {
					if (var12.field918[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field918[var26] == 0) {
								var14[var23] = var26;
								var15[var23] = 0;
								var16[var23] = 0;
								var17[var23] = 0;
								var23++;
								break;
							}
						}
					}

					var14[var23] = var24;
					short var27 = 0;
					if (var12.field918[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method28();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method28();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method28();
					}

					var22 = var24;
					var23++;

					if (var12.field918[var24] == 5) {
						field1406[var19] = false;
					}
				}
			}

			var20.field1401 = var23;
			var20.field1402 = new int[var23];
			var20.field1403 = new int[var23];
			var20.field1404 = new int[var23];
			var20.field1405 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1402[var28] = var14[var28];
				var20.field1403[var28] = var15[var28];
				var20.field1404[var28] = var16[var28];
				var20.field1405[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("UIZESDZR.a(B)V")
	public static void method522() {
		field1398 = null;
	}

	@ObfuscatedName("UIZESDZR.a(II)LUIZESDZR;")
	public static UIZESDZR method523(int arg0) {
		if (field1398 == null) {
			return null;
		}

		return field1398[arg0];
	}

	@ObfuscatedName("UIZESDZR.a(BI)Z")
	public static boolean method524(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
