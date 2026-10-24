package deob;

@ObfuscatedName("DHMWVSMI")
public class DHMWVSMI {

	@ObfuscatedName("DHMWVSMI.e")
	public int field522;

	@ObfuscatedName("DHMWVSMI.g")
	public int field524;

	@ObfuscatedName("DHMWVSMI.f")
	public URJIIMJU field523;

	@ObfuscatedName("DHMWVSMI.h")
	public int[] field525;

	@ObfuscatedName("DHMWVSMI.i")
	public int[] field526;

	@ObfuscatedName("DHMWVSMI.j")
	public int[] field527;

	@ObfuscatedName("DHMWVSMI.k")
	public int[] field528;

	@ObfuscatedName("DHMWVSMI.d")
	public static DHMWVSMI[] field521;

	@ObfuscatedName("DHMWVSMI.l")
	public static boolean[] field529;

	@ObfuscatedName("DHMWVSMI.a(I)V")
	public static void method174(int arg0) {
		field521 = new DHMWVSMI[arg0 + 1];
		field529 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field529[var1] = true;
		}
	}

	@ObfuscatedName("DHMWVSMI.a(Z[B)V")
	public static void method175(byte[] arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0);
		var1.field1375 = arg0.length - 8;
		int var2 = var1.method504();
		int var3 = var1.method504();
		int var4 = var1.method504();
		int var5 = var1.method504();
		int var6 = 0;
		WNCFPLWV var7 = new WNCFPLWV(arg0);
		var7.field1375 = var6;
		var6 += var2 + 2;
		WNCFPLWV var8 = new WNCFPLWV(arg0);
		var8.field1375 = var6;
		var6 += var3;
		WNCFPLWV var9 = new WNCFPLWV(arg0);
		var9.field1375 = var6;
		var6 += var4;
		WNCFPLWV var10 = new WNCFPLWV(arg0);
		var10.field1375 = var6;
		var6 += var5;
		WNCFPLWV var11 = new WNCFPLWV(arg0);
		var11.field1375 = var6;
		URJIIMJU var12 = new URJIIMJU(var11);
		int var13 = var7.method504();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method504();
			DHMWVSMI var20 = field521[var19] = new DHMWVSMI();
			var20.field522 = var10.method502();
			var20.field523 = var12;
			int var21 = var7.method502();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method502();
				if (var25 > 0) {
					if (var12.field1335[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1335[var26] == 0) {
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
					if (var12.field1335[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method515();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method515();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method515();
					}

					var22 = var24;
					var23++;

					if (var12.field1335[var24] == 5) {
						field529[var19] = false;
					}
				}
			}

			var20.field524 = var23;
			var20.field525 = new int[var23];
			var20.field526 = new int[var23];
			var20.field527 = new int[var23];
			var20.field528 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field525[var28] = var14[var28];
				var20.field526[var28] = var15[var28];
				var20.field527[var28] = var16[var28];
				var20.field528[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("DHMWVSMI.b(I)V")
	public static void method176() {
		field521 = null;
	}

	@ObfuscatedName("DHMWVSMI.c(I)LDHMWVSMI;")
	public static DHMWVSMI method177(int arg0) {
		if (field521 == null) {
			return null;
		}

		return field521[arg0];
	}

	@ObfuscatedName("DHMWVSMI.a(II)Z")
	public static boolean method178(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
