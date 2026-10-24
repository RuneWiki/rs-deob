package deob;

@ObfuscatedName("YYYUATIU")
public class YYYUATIU {

	@ObfuscatedName("YYYUATIU.d")
	public int field1475;

	@ObfuscatedName("YYYUATIU.f")
	public int field1477;

	@ObfuscatedName("YYYUATIU.e")
	public CKXVXQFJ field1476;

	@ObfuscatedName("YYYUATIU.g")
	public int[] field1478;

	@ObfuscatedName("YYYUATIU.h")
	public int[] field1479;

	@ObfuscatedName("YYYUATIU.i")
	public int[] field1480;

	@ObfuscatedName("YYYUATIU.j")
	public int[] field1481;

	@ObfuscatedName("YYYUATIU.c")
	public static YYYUATIU[] field1474;

	@ObfuscatedName("YYYUATIU.k")
	public static boolean[] field1482;

	@ObfuscatedName("YYYUATIU.a(I)V")
	public static void method575(int arg0) {
		field1474 = new YYYUATIU[arg0 + 1];
		field1482 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1482[var1] = true;
		}
	}

	@ObfuscatedName("YYYUATIU.a([BI)V")
	public static void method576(byte[] arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0);
		var1.field929 = arg0.length - 8;
		int var2 = var1.method341();
		int var3 = var1.method341();
		int var4 = var1.method341();
		int var5 = var1.method341();
		int var6 = 0;
		NQUAUMDT var7 = new NQUAUMDT(arg0);
		var7.field929 = var6;
		var6 += var2 + 2;
		NQUAUMDT var8 = new NQUAUMDT(arg0);
		var8.field929 = var6;
		var6 += var3;
		NQUAUMDT var9 = new NQUAUMDT(arg0);
		var9.field929 = var6;
		var6 += var4;
		NQUAUMDT var10 = new NQUAUMDT(arg0);
		var10.field929 = var6;
		var6 += var5;
		NQUAUMDT var11 = new NQUAUMDT(arg0);
		var11.field929 = var6;
		CKXVXQFJ var12 = new CKXVXQFJ(var11);
		int var13 = var7.method341();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method341();
			YYYUATIU var20 = field1474[var19] = new YYYUATIU();
			var20.field1475 = var10.method339();
			var20.field1476 = var12;
			int var21 = var7.method339();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method339();
				if (var25 > 0) {
					if (var12.field71[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field71[var26] == 0) {
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
					if (var12.field71[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method352();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method352();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method352();
					}

					var22 = var24;
					var23++;

					if (var12.field71[var24] == 5) {
						field1482[var19] = false;
					}
				}
			}

			var20.field1477 = var23;
			var20.field1478 = new int[var23];
			var20.field1479 = new int[var23];
			var20.field1480 = new int[var23];
			var20.field1481 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1478[var28] = var14[var28];
				var20.field1479[var28] = var15[var28];
				var20.field1480[var28] = var16[var28];
				var20.field1481[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("YYYUATIU.b(I)V")
	public static void method577() {
		field1474 = null;
	}

	@ObfuscatedName("YYYUATIU.c(I)LYYYUATIU;")
	public static YYYUATIU method578(int arg0) {
		if (field1474 == null) {
			return null;
		}

		return field1474[arg0];
	}

	@ObfuscatedName("YYYUATIU.a(ZI)Z")
	public static boolean method579(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
