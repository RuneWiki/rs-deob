package deob;

@ObfuscatedName("PHDJZMLE")
public class PHDJZMLE {

	@ObfuscatedName("PHDJZMLE.c")
	public int field1247;

	@ObfuscatedName("PHDJZMLE.e")
	public int field1249;

	@ObfuscatedName("PHDJZMLE.d")
	public YMEZTXZW field1248;

	@ObfuscatedName("PHDJZMLE.f")
	public int[] field1250;

	@ObfuscatedName("PHDJZMLE.g")
	public int[] field1251;

	@ObfuscatedName("PHDJZMLE.h")
	public int[] field1252;

	@ObfuscatedName("PHDJZMLE.i")
	public int[] field1253;

	@ObfuscatedName("PHDJZMLE.b")
	public static PHDJZMLE[] field1246;

	@ObfuscatedName("PHDJZMLE.j")
	public static boolean[] field1254;

	@ObfuscatedName("PHDJZMLE.a(I)V")
	public static void method424(int arg0) {
		field1246 = new PHDJZMLE[arg0 + 1];
		field1254 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1254[var1] = true;
		}
	}

	@ObfuscatedName("PHDJZMLE.a(B[B)V")
	public static void method425(byte[] arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0);
		var1.field1350 = arg0.length - 8;
		int var2 = var1.method457();
		int var3 = var1.method457();
		int var4 = var1.method457();
		int var5 = var1.method457();
		int var6 = 0;
		RGCGKKUR var7 = new RGCGKKUR(arg0);
		var7.field1350 = var6;
		var6 += var2 + 2;
		RGCGKKUR var8 = new RGCGKKUR(arg0);
		var8.field1350 = var6;
		var6 += var3;
		RGCGKKUR var9 = new RGCGKKUR(arg0);
		var9.field1350 = var6;
		var6 += var4;
		RGCGKKUR var10 = new RGCGKKUR(arg0);
		var10.field1350 = var6;
		var6 += var5;
		RGCGKKUR var11 = new RGCGKKUR(arg0);
		var11.field1350 = var6;
		YMEZTXZW var12 = new YMEZTXZW(var11);
		int var13 = var7.method457();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method457();
			PHDJZMLE var20 = field1246[var19] = new PHDJZMLE();
			var20.field1247 = var10.method455();
			var20.field1248 = var12;
			int var21 = var7.method455();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method455();
				if (var25 > 0) {
					if (var12.field1506[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1506[var26] == 0) {
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
					if (var12.field1506[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method468();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method468();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method468();
					}

					var22 = var24;
					var23++;

					if (var12.field1506[var24] == 5) {
						field1254[var19] = false;
					}
				}
			}

			var20.field1249 = var23;
			var20.field1250 = new int[var23];
			var20.field1251 = new int[var23];
			var20.field1252 = new int[var23];
			var20.field1253 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1250[var28] = var14[var28];
				var20.field1251[var28] = var15[var28];
				var20.field1252[var28] = var16[var28];
				var20.field1253[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("PHDJZMLE.b(I)V")
	public static void method426() {
		field1246 = null;
	}

	@ObfuscatedName("PHDJZMLE.c(I)LPHDJZMLE;")
	public static PHDJZMLE method427(int arg0) {
		if (field1246 == null) {
			return null;
		}

		return field1246[arg0];
	}

	@ObfuscatedName("PHDJZMLE.a(BI)Z")
	public static boolean method428(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
