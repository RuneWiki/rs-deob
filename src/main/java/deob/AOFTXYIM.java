package deob;

@ObfuscatedName("AOFTXYIM")
public class AOFTXYIM {

	@ObfuscatedName("AOFTXYIM.b")
	public int field18;

	@ObfuscatedName("AOFTXYIM.d")
	public int field20;

	@ObfuscatedName("AOFTXYIM.c")
	public WPDTVMXY field19;

	@ObfuscatedName("AOFTXYIM.e")
	public int[] field21;

	@ObfuscatedName("AOFTXYIM.f")
	public int[] field22;

	@ObfuscatedName("AOFTXYIM.g")
	public int[] field23;

	@ObfuscatedName("AOFTXYIM.h")
	public int[] field24;

	@ObfuscatedName("AOFTXYIM.a")
	public static AOFTXYIM[] field17;

	@ObfuscatedName("AOFTXYIM.i")
	public static boolean[] field25;

	@ObfuscatedName("AOFTXYIM.a(I)V")
	public static void method1(int arg0) {
		field17 = new AOFTXYIM[arg0 + 1];
		field25 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field25[var1] = true;
		}
	}

	@ObfuscatedName("AOFTXYIM.a(I[B)V")
	public static void method2(byte[] arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0);
		var1.field971 = arg0.length - 8;
		int var2 = var1.method332();
		int var3 = var1.method332();
		int var4 = var1.method332();
		int var5 = var1.method332();
		int var6 = 0;
		PKHWFJLM var7 = new PKHWFJLM(arg0);
		var7.field971 = var6;
		var6 += var2 + 2;
		PKHWFJLM var8 = new PKHWFJLM(arg0);
		var8.field971 = var6;
		var6 += var3;
		PKHWFJLM var9 = new PKHWFJLM(arg0);
		var9.field971 = var6;
		var6 += var4;
		PKHWFJLM var10 = new PKHWFJLM(arg0);
		var10.field971 = var6;
		var6 += var5;
		PKHWFJLM var11 = new PKHWFJLM(arg0);
		var11.field971 = var6;
		WPDTVMXY var12 = new WPDTVMXY(var11);
		int var13 = var7.method332();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method332();
			AOFTXYIM var20 = field17[var19] = new AOFTXYIM();
			var20.field18 = var10.method330();
			var20.field19 = var12;
			int var21 = var7.method330();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method330();
				if (var25 > 0) {
					if (var12.field1421[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1421[var26] == 0) {
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
					if (var12.field1421[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method343();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method343();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method343();
					}

					var22 = var24;
					var23++;

					if (var12.field1421[var24] == 5) {
						field25[var19] = false;
					}
				}
			}

			var20.field20 = var23;
			var20.field21 = new int[var23];
			var20.field22 = new int[var23];
			var20.field23 = new int[var23];
			var20.field24 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field21[var28] = var14[var28];
				var20.field22[var28] = var15[var28];
				var20.field23[var28] = var16[var28];
				var20.field24[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("AOFTXYIM.a(B)V")
	public static void method3() {
		field17 = null;
	}

	@ObfuscatedName("AOFTXYIM.b(I)LAOFTXYIM;")
	public static AOFTXYIM method4(int arg0) {
		if (field17 == null) {
			return null;
		}

		return field17[arg0];
	}

	@ObfuscatedName("AOFTXYIM.a(BI)Z")
	public static boolean method5(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
