package deob;

@ObfuscatedName("HVIFHYEW")
public class HVIFHYEW {

	@ObfuscatedName("HVIFHYEW.e")
	public int field735;

	@ObfuscatedName("HVIFHYEW.g")
	public int field737;

	@ObfuscatedName("HVIFHYEW.f")
	public XEMMPKIX field736;

	@ObfuscatedName("HVIFHYEW.h")
	public int[] field738;

	@ObfuscatedName("HVIFHYEW.i")
	public int[] field739;

	@ObfuscatedName("HVIFHYEW.j")
	public int[] field740;

	@ObfuscatedName("HVIFHYEW.k")
	public int[] field741;

	@ObfuscatedName("HVIFHYEW.d")
	public static HVIFHYEW[] field734;

	@ObfuscatedName("HVIFHYEW.l")
	public static boolean[] field742;

	@ObfuscatedName("HVIFHYEW.a(I)V")
	public static void method283(int arg0) {
		field734 = new HVIFHYEW[arg0 + 1];
		field742 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field742[var1] = true;
		}
	}

	@ObfuscatedName("HVIFHYEW.a(Z[B)V")
	public static void method284(byte[] arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0);
		var1.field1082 = arg0.length - 8;
		int var2 = var1.method422();
		int var3 = var1.method422();
		int var4 = var1.method422();
		int var5 = var1.method422();
		int var6 = 0;
		PGNBHFUF var7 = new PGNBHFUF(arg0);
		var7.field1082 = var6;
		var6 += var2 + 2;
		PGNBHFUF var8 = new PGNBHFUF(arg0);
		var8.field1082 = var6;
		var6 += var3;
		PGNBHFUF var9 = new PGNBHFUF(arg0);
		var9.field1082 = var6;
		var6 += var4;
		PGNBHFUF var10 = new PGNBHFUF(arg0);
		var10.field1082 = var6;
		var6 += var5;
		PGNBHFUF var11 = new PGNBHFUF(arg0);
		var11.field1082 = var6;
		XEMMPKIX var12 = new XEMMPKIX(var11);
		int var13 = var7.method422();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method422();
			HVIFHYEW var20 = field734[var19] = new HVIFHYEW();
			var20.field735 = var10.method420();
			var20.field736 = var12;
			int var21 = var7.method420();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method420();
				if (var25 > 0) {
					if (var12.field1320[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1320[var26] == 0) {
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
					if (var12.field1320[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method433();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method433();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method433();
					}

					var22 = var24;
					var23++;

					if (var12.field1320[var24] == 5) {
						field742[var19] = false;
					}
				}
			}

			var20.field737 = var23;
			var20.field738 = new int[var23];
			var20.field739 = new int[var23];
			var20.field740 = new int[var23];
			var20.field741 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field738[var28] = var14[var28];
				var20.field739[var28] = var15[var28];
				var20.field740[var28] = var16[var28];
				var20.field741[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("HVIFHYEW.b(I)V")
	public static void method285() {
		field734 = null;
	}

	@ObfuscatedName("HVIFHYEW.c(I)LHVIFHYEW;")
	public static HVIFHYEW method286(int arg0) {
		if (field734 == null) {
			return null;
		}

		return field734[arg0];
	}

	@ObfuscatedName("HVIFHYEW.a(II)Z")
	public static boolean method287(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
