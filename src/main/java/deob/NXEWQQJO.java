package deob;

@ObfuscatedName("NXEWQQJO")
public class NXEWQQJO {

	@ObfuscatedName("NXEWQQJO.c")
	public int field896;

	@ObfuscatedName("NXEWQQJO.e")
	public int field898;

	@ObfuscatedName("NXEWQQJO.d")
	public IIXTARMC field897;

	@ObfuscatedName("NXEWQQJO.f")
	public int[] field899;

	@ObfuscatedName("NXEWQQJO.g")
	public int[] field900;

	@ObfuscatedName("NXEWQQJO.h")
	public int[] field901;

	@ObfuscatedName("NXEWQQJO.i")
	public int[] field902;

	@ObfuscatedName("NXEWQQJO.b")
	public static NXEWQQJO[] field895;

	@ObfuscatedName("NXEWQQJO.j")
	public static boolean[] field903;

	@ObfuscatedName("NXEWQQJO.a(I)V")
	public static void method333(int arg0) {
		field895 = new NXEWQQJO[arg0 + 1];
		field903 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field903[var1] = true;
		}
	}

	@ObfuscatedName("NXEWQQJO.a([BI)V")
	public static void method334(byte[] arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0);
		var1.field617 = arg0.length - 8;
		int var2 = var1.method219();
		int var3 = var1.method219();
		int var4 = var1.method219();
		int var5 = var1.method219();
		int var6 = 0;
		EMWAMCXW var7 = new EMWAMCXW(arg0);
		var7.field617 = var6;
		var6 += var2 + 2;
		EMWAMCXW var8 = new EMWAMCXW(arg0);
		var8.field617 = var6;
		var6 += var3;
		EMWAMCXW var9 = new EMWAMCXW(arg0);
		var9.field617 = var6;
		var6 += var4;
		EMWAMCXW var10 = new EMWAMCXW(arg0);
		var10.field617 = var6;
		var6 += var5;
		EMWAMCXW var11 = new EMWAMCXW(arg0);
		var11.field617 = var6;
		IIXTARMC var12 = new IIXTARMC(var11);
		int var13 = var7.method219();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method219();
			NXEWQQJO var20 = field895[var19] = new NXEWQQJO();
			var20.field896 = var10.method217();
			var20.field897 = var12;
			int var21 = var7.method217();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method217();
				if (var25 > 0) {
					if (var12.field730[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field730[var26] == 0) {
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
					if (var12.field730[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method230();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method230();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method230();
					}

					var22 = var24;
					var23++;

					if (var12.field730[var24] == 5) {
						field903[var19] = false;
					}
				}
			}

			var20.field898 = var23;
			var20.field899 = new int[var23];
			var20.field900 = new int[var23];
			var20.field901 = new int[var23];
			var20.field902 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field899[var28] = var14[var28];
				var20.field900[var28] = var15[var28];
				var20.field901[var28] = var16[var28];
				var20.field902[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("NXEWQQJO.a(Z)V")
	public static void method335() {
		field895 = null;
	}

	@ObfuscatedName("NXEWQQJO.b(I)LNXEWQQJO;")
	public static NXEWQQJO method336(int arg0) {
		if (field895 == null) {
			return null;
		}

		return field895[arg0];
	}

	@ObfuscatedName("NXEWQQJO.a(BI)Z")
	public static boolean method337(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
