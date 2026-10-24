package deob;

@ObfuscatedName("RLONYBCF")
public class RLONYBCF {

	@ObfuscatedName("RLONYBCF.c")
	public int field1058;

	@ObfuscatedName("RLONYBCF.e")
	public int field1060;

	@ObfuscatedName("RLONYBCF.d")
	public WHXBCNTD field1059;

	@ObfuscatedName("RLONYBCF.f")
	public int[] field1061;

	@ObfuscatedName("RLONYBCF.g")
	public int[] field1062;

	@ObfuscatedName("RLONYBCF.h")
	public int[] field1063;

	@ObfuscatedName("RLONYBCF.i")
	public int[] field1064;

	@ObfuscatedName("RLONYBCF.b")
	public static RLONYBCF[] field1057;

	@ObfuscatedName("RLONYBCF.j")
	public static boolean[] field1065;

	@ObfuscatedName("RLONYBCF.a(I)V")
	public static void method432(int arg0) {
		field1057 = new RLONYBCF[arg0 + 1];
		field1065 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1065[var1] = true;
		}
	}

	@ObfuscatedName("RLONYBCF.a(I[B)V")
	public static void method433(byte[] arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0);
		var1.field540 = arg0.length - 8;
		int var2 = var1.method196();
		int var3 = var1.method196();
		int var4 = var1.method196();
		int var5 = var1.method196();
		int var6 = 0;
		CMGGUSPR var7 = new CMGGUSPR(arg0);
		var7.field540 = var6;
		var6 += var2 + 2;
		CMGGUSPR var8 = new CMGGUSPR(arg0);
		var8.field540 = var6;
		var6 += var3;
		CMGGUSPR var9 = new CMGGUSPR(arg0);
		var9.field540 = var6;
		var6 += var4;
		CMGGUSPR var10 = new CMGGUSPR(arg0);
		var10.field540 = var6;
		var6 += var5;
		CMGGUSPR var11 = new CMGGUSPR(arg0);
		var11.field540 = var6;
		WHXBCNTD var12 = new WHXBCNTD(var11);
		int var13 = var7.method196();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method196();
			RLONYBCF var20 = field1057[var19] = new RLONYBCF();
			var20.field1058 = var10.method194();
			var20.field1059 = var12;
			int var21 = var7.method194();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method194();
				if (var25 > 0) {
					if (var12.field1327[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1327[var26] == 0) {
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
					if (var12.field1327[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method207();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method207();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method207();
					}

					var22 = var24;
					var23++;

					if (var12.field1327[var24] == 5) {
						field1065[var19] = false;
					}
				}
			}

			var20.field1060 = var23;
			var20.field1061 = new int[var23];
			var20.field1062 = new int[var23];
			var20.field1063 = new int[var23];
			var20.field1064 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1061[var28] = var14[var28];
				var20.field1062[var28] = var15[var28];
				var20.field1063[var28] = var16[var28];
				var20.field1064[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("RLONYBCF.b(I)V")
	public static void method434() {
		field1057 = null;
	}

	@ObfuscatedName("RLONYBCF.c(I)LRLONYBCF;")
	public static RLONYBCF method435(int arg0) {
		if (field1057 == null) {
			return null;
		}

		return field1057[arg0];
	}

	@ObfuscatedName("RLONYBCF.a(ZI)Z")
	public static boolean method436(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
