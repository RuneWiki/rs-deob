package deob;

@ObfuscatedName("FGGKJQKK")
public class FGGKJQKK {

	@ObfuscatedName("FGGKJQKK.b")
	public int field760;

	@ObfuscatedName("FGGKJQKK.d")
	public int field762;

	@ObfuscatedName("FGGKJQKK.c")
	public XZSJUDQY field761;

	@ObfuscatedName("FGGKJQKK.e")
	public int[] field763;

	@ObfuscatedName("FGGKJQKK.f")
	public int[] field764;

	@ObfuscatedName("FGGKJQKK.g")
	public int[] field765;

	@ObfuscatedName("FGGKJQKK.h")
	public int[] field766;

	@ObfuscatedName("FGGKJQKK.a")
	public static FGGKJQKK[] field759;

	@ObfuscatedName("FGGKJQKK.i")
	public static boolean[] field767;

	@ObfuscatedName("FGGKJQKK.a(I)V")
	public static void method231(int arg0) {
		field759 = new FGGKJQKK[arg0 + 1];
		field767 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field767[var1] = true;
		}
	}

	@ObfuscatedName("FGGKJQKK.a([BI)V")
	public static void method232(byte[] arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0);
		var1.field1401 = arg0.length - 8;
		int var2 = var1.method517();
		int var3 = var1.method517();
		int var4 = var1.method517();
		int var5 = var1.method517();
		int var6 = 0;
		WBEWPIXO var7 = new WBEWPIXO(arg0);
		var7.field1401 = var6;
		var6 += var2 + 2;
		WBEWPIXO var8 = new WBEWPIXO(arg0);
		var8.field1401 = var6;
		var6 += var3;
		WBEWPIXO var9 = new WBEWPIXO(arg0);
		var9.field1401 = var6;
		var6 += var4;
		WBEWPIXO var10 = new WBEWPIXO(arg0);
		var10.field1401 = var6;
		var6 += var5;
		WBEWPIXO var11 = new WBEWPIXO(arg0);
		var11.field1401 = var6;
		XZSJUDQY var12 = new XZSJUDQY(var11);
		int var13 = var7.method517();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method517();
			FGGKJQKK var20 = field759[var19] = new FGGKJQKK();
			var20.field760 = var10.method515();
			var20.field761 = var12;
			int var21 = var7.method515();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method515();
				if (var25 > 0) {
					if (var12.field1507[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1507[var26] == 0) {
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
					if (var12.field1507[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method528();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method528();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method528();
					}

					var22 = var24;
					var23++;

					if (var12.field1507[var24] == 5) {
						field767[var19] = false;
					}
				}
			}

			var20.field762 = var23;
			var20.field763 = new int[var23];
			var20.field764 = new int[var23];
			var20.field765 = new int[var23];
			var20.field766 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field763[var28] = var14[var28];
				var20.field764[var28] = var15[var28];
				var20.field765[var28] = var16[var28];
				var20.field766[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("FGGKJQKK.b(I)V")
	public static void method233() {
		field759 = null;
	}

	@ObfuscatedName("FGGKJQKK.c(I)LFGGKJQKK;")
	public static FGGKJQKK method234(int arg0) {
		if (field759 == null) {
			return null;
		}

		return field759[arg0];
	}

	@ObfuscatedName("FGGKJQKK.a(II)Z")
	public static boolean method235(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
