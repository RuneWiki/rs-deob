package deob;

@ObfuscatedName("SCWTQUFK")
public class SCWTQUFK {

	@ObfuscatedName("SCWTQUFK.b")
	public int field1217;

	@ObfuscatedName("SCWTQUFK.d")
	public int field1219;

	@ObfuscatedName("SCWTQUFK.c")
	public GCSWWDCL field1218;

	@ObfuscatedName("SCWTQUFK.e")
	public int[] field1220;

	@ObfuscatedName("SCWTQUFK.f")
	public int[] field1221;

	@ObfuscatedName("SCWTQUFK.g")
	public int[] field1222;

	@ObfuscatedName("SCWTQUFK.h")
	public int[] field1223;

	@ObfuscatedName("SCWTQUFK.a")
	public static SCWTQUFK[] field1216;

	@ObfuscatedName("SCWTQUFK.i")
	public static boolean[] field1224;

	@ObfuscatedName("SCWTQUFK.a(I)V")
	public static void method451(int arg0) {
		field1216 = new SCWTQUFK[arg0 + 1];
		field1224 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1224[var1] = true;
		}
	}

	@ObfuscatedName("SCWTQUFK.a([BI)V")
	public static void method452(byte[] arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0);
		var1.field535 = arg0.length - 8;
		int var2 = var1.method215();
		int var3 = var1.method215();
		int var4 = var1.method215();
		int var5 = var1.method215();
		int var6 = 0;
		FTMSICIZ var7 = new FTMSICIZ(arg0);
		var7.field535 = var6;
		var6 += var2 + 2;
		FTMSICIZ var8 = new FTMSICIZ(arg0);
		var8.field535 = var6;
		var6 += var3;
		FTMSICIZ var9 = new FTMSICIZ(arg0);
		var9.field535 = var6;
		var6 += var4;
		FTMSICIZ var10 = new FTMSICIZ(arg0);
		var10.field535 = var6;
		var6 += var5;
		FTMSICIZ var11 = new FTMSICIZ(arg0);
		var11.field535 = var6;
		GCSWWDCL var12 = new GCSWWDCL(var11);
		int var13 = var7.method215();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method215();
			SCWTQUFK var20 = field1216[var19] = new SCWTQUFK();
			var20.field1217 = var10.method213();
			var20.field1218 = var12;
			int var21 = var7.method213();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method213();
				if (var25 > 0) {
					if (var12.field548[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field548[var26] == 0) {
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
					if (var12.field548[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method226();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method226();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method226();
					}

					var22 = var24;
					var23++;

					if (var12.field548[var24] == 5) {
						field1224[var19] = false;
					}
				}
			}

			var20.field1219 = var23;
			var20.field1220 = new int[var23];
			var20.field1221 = new int[var23];
			var20.field1222 = new int[var23];
			var20.field1223 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1220[var28] = var14[var28];
				var20.field1221[var28] = var15[var28];
				var20.field1222[var28] = var16[var28];
				var20.field1223[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("SCWTQUFK.b(I)V")
	public static void method453() {
		field1216 = null;
	}

	@ObfuscatedName("SCWTQUFK.c(I)LSCWTQUFK;")
	public static SCWTQUFK method454(int arg0) {
		if (field1216 == null) {
			return null;
		}

		return field1216[arg0];
	}

	@ObfuscatedName("SCWTQUFK.a(ZI)Z")
	public static boolean method455(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
