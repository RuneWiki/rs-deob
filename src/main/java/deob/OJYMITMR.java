package deob;

@ObfuscatedName("OJYMITMR")
public class OJYMITMR {

	@ObfuscatedName("OJYMITMR.d")
	public int field1161;

	@ObfuscatedName("OJYMITMR.f")
	public int field1163;

	@ObfuscatedName("OJYMITMR.e")
	public EPQQXCGW field1162;

	@ObfuscatedName("OJYMITMR.g")
	public int[] field1164;

	@ObfuscatedName("OJYMITMR.h")
	public int[] field1165;

	@ObfuscatedName("OJYMITMR.i")
	public int[] field1166;

	@ObfuscatedName("OJYMITMR.j")
	public int[] field1167;

	@ObfuscatedName("OJYMITMR.c")
	public static OJYMITMR[] field1160;

	@ObfuscatedName("OJYMITMR.k")
	public static boolean[] field1168;

	@ObfuscatedName("OJYMITMR.a(I)V")
	public static void method378(int arg0) {
		field1160 = new OJYMITMR[arg0 + 1];
		field1168 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1168[var1] = true;
		}
	}

	@ObfuscatedName("OJYMITMR.a(B[B)V")
	public static void method379(byte[] arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0);
		var1.field733 = arg0.length - 8;
		int var2 = var1.method247();
		int var3 = var1.method247();
		int var4 = var1.method247();
		int var5 = var1.method247();
		int var6 = 0;
		IUVBENCV var7 = new IUVBENCV(arg0);
		var7.field733 = var6;
		var6 += var2 + 2;
		IUVBENCV var8 = new IUVBENCV(arg0);
		var8.field733 = var6;
		var6 += var3;
		IUVBENCV var9 = new IUVBENCV(arg0);
		var9.field733 = var6;
		var6 += var4;
		IUVBENCV var10 = new IUVBENCV(arg0);
		var10.field733 = var6;
		var6 += var5;
		IUVBENCV var11 = new IUVBENCV(arg0);
		var11.field733 = var6;
		EPQQXCGW var12 = new EPQQXCGW(var11);
		int var13 = var7.method247();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method247();
			OJYMITMR var20 = field1160[var19] = new OJYMITMR();
			var20.field1161 = var10.method245();
			var20.field1162 = var12;
			int var21 = var7.method245();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method245();
				if (var25 > 0) {
					if (var12.field655[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field655[var26] == 0) {
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
					if (var12.field655[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method258();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method258();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method258();
					}

					var22 = var24;
					var23++;

					if (var12.field655[var24] == 5) {
						field1168[var19] = false;
					}
				}
			}

			var20.field1163 = var23;
			var20.field1164 = new int[var23];
			var20.field1165 = new int[var23];
			var20.field1166 = new int[var23];
			var20.field1167 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1164[var28] = var14[var28];
				var20.field1165[var28] = var15[var28];
				var20.field1166[var28] = var16[var28];
				var20.field1167[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("OJYMITMR.a(Z)V")
	public static void method380() {
		field1160 = null;
	}

	@ObfuscatedName("OJYMITMR.b(I)LOJYMITMR;")
	public static OJYMITMR method381(int arg0) {
		if (field1160 == null) {
			return null;
		}

		return field1160[arg0];
	}

	@ObfuscatedName("OJYMITMR.a(II)Z")
	public static boolean method382(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
