package deob;

@ObfuscatedName("PLSPTEPI")
public class PLSPTEPI {

	@ObfuscatedName("PLSPTEPI.d")
	public int field1104;

	@ObfuscatedName("PLSPTEPI.f")
	public int field1106;

	@ObfuscatedName("PLSPTEPI.e")
	public MJXROMKT field1105;

	@ObfuscatedName("PLSPTEPI.g")
	public int[] field1107;

	@ObfuscatedName("PLSPTEPI.h")
	public int[] field1108;

	@ObfuscatedName("PLSPTEPI.i")
	public int[] field1109;

	@ObfuscatedName("PLSPTEPI.j")
	public int[] field1110;

	@ObfuscatedName("PLSPTEPI.c")
	public static PLSPTEPI[] field1103;

	@ObfuscatedName("PLSPTEPI.k")
	public static boolean[] field1111;

	@ObfuscatedName("PLSPTEPI.a(I)V")
	public static void method402(int arg0) {
		field1103 = new PLSPTEPI[arg0 + 1];
		field1111 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1111[var1] = true;
		}
	}

	@ObfuscatedName("PLSPTEPI.a(B[B)V")
	public static void method403(byte[] arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0);
		var1.field1263 = arg0.length - 8;
		int var2 = var1.method463();
		int var3 = var1.method463();
		int var4 = var1.method463();
		int var5 = var1.method463();
		int var6 = 0;
		SVWJKJVI var7 = new SVWJKJVI(arg0);
		var7.field1263 = var6;
		var6 += var2 + 2;
		SVWJKJVI var8 = new SVWJKJVI(arg0);
		var8.field1263 = var6;
		var6 += var3;
		SVWJKJVI var9 = new SVWJKJVI(arg0);
		var9.field1263 = var6;
		var6 += var4;
		SVWJKJVI var10 = new SVWJKJVI(arg0);
		var10.field1263 = var6;
		var6 += var5;
		SVWJKJVI var11 = new SVWJKJVI(arg0);
		var11.field1263 = var6;
		MJXROMKT var12 = new MJXROMKT(var11);
		int var13 = var7.method463();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method463();
			PLSPTEPI var20 = field1103[var19] = new PLSPTEPI();
			var20.field1104 = var10.method461();
			var20.field1105 = var12;
			int var21 = var7.method461();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method461();
				if (var25 > 0) {
					if (var12.field884[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field884[var26] == 0) {
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
					if (var12.field884[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method474();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method474();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method474();
					}

					var22 = var24;
					var23++;

					if (var12.field884[var24] == 5) {
						field1111[var19] = false;
					}
				}
			}

			var20.field1106 = var23;
			var20.field1107 = new int[var23];
			var20.field1108 = new int[var23];
			var20.field1109 = new int[var23];
			var20.field1110 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1107[var28] = var14[var28];
				var20.field1108[var28] = var15[var28];
				var20.field1109[var28] = var16[var28];
				var20.field1110[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("PLSPTEPI.b(I)V")
	public static void method404() {
		field1103 = null;
	}

	@ObfuscatedName("PLSPTEPI.c(I)LPLSPTEPI;")
	public static PLSPTEPI method405(int arg0) {
		if (field1103 == null) {
			return null;
		}

		return field1103[arg0];
	}

	@ObfuscatedName("PLSPTEPI.a(II)Z")
	public static boolean method406(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
