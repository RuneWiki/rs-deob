package deob;

@ObfuscatedName("ZNUJPBQV")
public class ZNUJPBQV {

	@ObfuscatedName("ZNUJPBQV.b")
	public int field1468;

	@ObfuscatedName("ZNUJPBQV.d")
	public int field1470;

	@ObfuscatedName("ZNUJPBQV.c")
	public IJWJZMOM field1469;

	@ObfuscatedName("ZNUJPBQV.e")
	public int[] field1471;

	@ObfuscatedName("ZNUJPBQV.f")
	public int[] field1472;

	@ObfuscatedName("ZNUJPBQV.g")
	public int[] field1473;

	@ObfuscatedName("ZNUJPBQV.h")
	public int[] field1474;

	@ObfuscatedName("ZNUJPBQV.a")
	public static ZNUJPBQV[] field1467;

	@ObfuscatedName("ZNUJPBQV.i")
	public static boolean[] field1475;

	@ObfuscatedName("ZNUJPBQV.a(I)V")
	public static void method581(int arg0) {
		field1467 = new ZNUJPBQV[arg0 + 1];
		field1475 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1475[var1] = true;
		}
	}

	@ObfuscatedName("ZNUJPBQV.a([BI)V")
	public static void method582(byte[] arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0);
		var1.field1367 = arg0.length - 8;
		int var2 = var1.method523();
		int var3 = var1.method523();
		int var4 = var1.method523();
		int var5 = var1.method523();
		int var6 = 0;
		XOUQUKZW var7 = new XOUQUKZW(arg0);
		var7.field1367 = var6;
		var6 += var2 + 2;
		XOUQUKZW var8 = new XOUQUKZW(arg0);
		var8.field1367 = var6;
		var6 += var3;
		XOUQUKZW var9 = new XOUQUKZW(arg0);
		var9.field1367 = var6;
		var6 += var4;
		XOUQUKZW var10 = new XOUQUKZW(arg0);
		var10.field1367 = var6;
		var6 += var5;
		XOUQUKZW var11 = new XOUQUKZW(arg0);
		var11.field1367 = var6;
		IJWJZMOM var12 = new IJWJZMOM(var11);
		int var13 = var7.method523();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method523();
			ZNUJPBQV var20 = field1467[var19] = new ZNUJPBQV();
			var20.field1468 = var10.method521();
			var20.field1469 = var12;
			int var21 = var7.method521();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method521();
				if (var25 > 0) {
					if (var12.field822[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field822[var26] == 0) {
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
					if (var12.field822[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method534();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method534();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method534();
					}

					var22 = var24;
					var23++;

					if (var12.field822[var24] == 5) {
						field1475[var19] = false;
					}
				}
			}

			var20.field1470 = var23;
			var20.field1471 = new int[var23];
			var20.field1472 = new int[var23];
			var20.field1473 = new int[var23];
			var20.field1474 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1471[var28] = var14[var28];
				var20.field1472[var28] = var15[var28];
				var20.field1473[var28] = var16[var28];
				var20.field1474[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("ZNUJPBQV.b(I)V")
	public static void method583() {
		field1467 = null;
	}

	@ObfuscatedName("ZNUJPBQV.a(II)LZNUJPBQV;")
	public static ZNUJPBQV method584(int arg0) {
		if (field1467 == null) {
			return null;
		}

		return field1467[arg0];
	}

	@ObfuscatedName("ZNUJPBQV.b(II)Z")
	public static boolean method585(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
