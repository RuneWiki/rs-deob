package deob;

@ObfuscatedName("SGSYCWFB")
public class SGSYCWFB {

	@ObfuscatedName("SGSYCWFB.c")
	public int field1199;

	@ObfuscatedName("SGSYCWFB.e")
	public int field1201;

	@ObfuscatedName("SGSYCWFB.d")
	public QICGPMWF field1200;

	@ObfuscatedName("SGSYCWFB.f")
	public int[] field1202;

	@ObfuscatedName("SGSYCWFB.g")
	public int[] field1203;

	@ObfuscatedName("SGSYCWFB.h")
	public int[] field1204;

	@ObfuscatedName("SGSYCWFB.i")
	public int[] field1205;

	@ObfuscatedName("SGSYCWFB.b")
	public static SGSYCWFB[] field1198;

	@ObfuscatedName("SGSYCWFB.j")
	public static boolean[] field1206;

	@ObfuscatedName("SGSYCWFB.a(I)V")
	public static void method419(int arg0) {
		field1198 = new SGSYCWFB[arg0 + 1];
		field1206 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1206[var1] = true;
		}
	}

	@ObfuscatedName("SGSYCWFB.a([BB)V")
	public static void method420(byte[] arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0);
		var1.field1263 = arg0.length - 8;
		int var2 = var1.method470();
		int var3 = var1.method470();
		int var4 = var1.method470();
		int var5 = var1.method470();
		int var6 = 0;
		TQYMAXSO var7 = new TQYMAXSO(arg0);
		var7.field1263 = var6;
		var6 += var2 + 2;
		TQYMAXSO var8 = new TQYMAXSO(arg0);
		var8.field1263 = var6;
		var6 += var3;
		TQYMAXSO var9 = new TQYMAXSO(arg0);
		var9.field1263 = var6;
		var6 += var4;
		TQYMAXSO var10 = new TQYMAXSO(arg0);
		var10.field1263 = var6;
		var6 += var5;
		TQYMAXSO var11 = new TQYMAXSO(arg0);
		var11.field1263 = var6;
		QICGPMWF var12 = new QICGPMWF(var11);
		int var13 = var7.method470();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method470();
			SGSYCWFB var20 = field1198[var19] = new SGSYCWFB();
			var20.field1199 = var10.method468();
			var20.field1200 = var12;
			int var21 = var7.method468();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method468();
				if (var25 > 0) {
					if (var12.field1137[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1137[var26] == 0) {
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
					if (var12.field1137[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method481();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method481();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method481();
					}

					var22 = var24;
					var23++;

					if (var12.field1137[var24] == 5) {
						field1206[var19] = false;
					}
				}
			}

			var20.field1201 = var23;
			var20.field1202 = new int[var23];
			var20.field1203 = new int[var23];
			var20.field1204 = new int[var23];
			var20.field1205 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1202[var28] = var14[var28];
				var20.field1203[var28] = var15[var28];
				var20.field1204[var28] = var16[var28];
				var20.field1205[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("SGSYCWFB.b(I)V")
	public static void method421() {
		field1198 = null;
	}

	@ObfuscatedName("SGSYCWFB.c(I)LSGSYCWFB;")
	public static SGSYCWFB method422(int arg0) {
		if (field1198 == null) {
			return null;
		}

		return field1198[arg0];
	}

	@ObfuscatedName("SGSYCWFB.a(II)Z")
	public static boolean method423(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
