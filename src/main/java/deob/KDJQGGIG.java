package deob;

@ObfuscatedName("KDJQGGIG")
public class KDJQGGIG {

	@ObfuscatedName("KDJQGGIG.c")
	public int field892;

	@ObfuscatedName("KDJQGGIG.e")
	public int field894;

	@ObfuscatedName("KDJQGGIG.d")
	public USEDATIW field893;

	@ObfuscatedName("KDJQGGIG.f")
	public int[] field895;

	@ObfuscatedName("KDJQGGIG.g")
	public int[] field896;

	@ObfuscatedName("KDJQGGIG.h")
	public int[] field897;

	@ObfuscatedName("KDJQGGIG.i")
	public int[] field898;

	@ObfuscatedName("KDJQGGIG.b")
	public static KDJQGGIG[] field891;

	@ObfuscatedName("KDJQGGIG.j")
	public static boolean[] field899;

	@ObfuscatedName("KDJQGGIG.a(I)V")
	public static void method281(int arg0) {
		field891 = new KDJQGGIG[arg0 + 1];
		field899 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field899[var1] = true;
		}
	}

	@ObfuscatedName("KDJQGGIG.a([BZ)V")
	public static void method282(byte[] arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0);
		var1.field965 = arg0.length - 8;
		int var2 = var1.method351();
		int var3 = var1.method351();
		int var4 = var1.method351();
		int var5 = var1.method351();
		int var6 = 0;
		NHEPCMLW var7 = new NHEPCMLW(arg0);
		var7.field965 = var6;
		var6 += var2 + 2;
		NHEPCMLW var8 = new NHEPCMLW(arg0);
		var8.field965 = var6;
		var6 += var3;
		NHEPCMLW var9 = new NHEPCMLW(arg0);
		var9.field965 = var6;
		var6 += var4;
		NHEPCMLW var10 = new NHEPCMLW(arg0);
		var10.field965 = var6;
		var6 += var5;
		NHEPCMLW var11 = new NHEPCMLW(arg0);
		var11.field965 = var6;
		USEDATIW var12 = new USEDATIW(var11);
		int var13 = var7.method351();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method351();
			KDJQGGIG var20 = field891[var19] = new KDJQGGIG();
			var20.field892 = var10.method349();
			var20.field893 = var12;
			int var21 = var7.method349();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method349();
				if (var25 > 0) {
					if (var12.field1290[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1290[var26] == 0) {
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
					if (var12.field1290[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method362();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method362();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method362();
					}

					var22 = var24;
					var23++;

					if (var12.field1290[var24] == 5) {
						field899[var19] = false;
					}
				}
			}

			var20.field894 = var23;
			var20.field895 = new int[var23];
			var20.field896 = new int[var23];
			var20.field897 = new int[var23];
			var20.field898 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field895[var28] = var14[var28];
				var20.field896[var28] = var15[var28];
				var20.field897[var28] = var16[var28];
				var20.field898[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("KDJQGGIG.a(Z)V")
	public static void method283() {
		field891 = null;
	}

	@ObfuscatedName("KDJQGGIG.b(I)LKDJQGGIG;")
	public static KDJQGGIG method284(int arg0) {
		if (field891 == null) {
			return null;
		}

		return field891[arg0];
	}

	@ObfuscatedName("KDJQGGIG.a(II)Z")
	public static boolean method285(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
