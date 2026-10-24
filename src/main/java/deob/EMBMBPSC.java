package deob;

@ObfuscatedName("EMBMBPSC")
public class EMBMBPSC {

	@ObfuscatedName("EMBMBPSC.e")
	public int field583;

	@ObfuscatedName("EMBMBPSC.g")
	public int field585;

	@ObfuscatedName("EMBMBPSC.f")
	public NSCXCZCZ field584;

	@ObfuscatedName("EMBMBPSC.h")
	public int[] field586;

	@ObfuscatedName("EMBMBPSC.i")
	public int[] field587;

	@ObfuscatedName("EMBMBPSC.j")
	public int[] field588;

	@ObfuscatedName("EMBMBPSC.k")
	public int[] field589;

	@ObfuscatedName("EMBMBPSC.d")
	public static EMBMBPSC[] field582;

	@ObfuscatedName("EMBMBPSC.l")
	public static boolean[] field590;

	@ObfuscatedName("EMBMBPSC.a(I)V")
	public static void method225(int arg0) {
		field582 = new EMBMBPSC[arg0 + 1];
		field590 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field590[var1] = true;
		}
	}

	@ObfuscatedName("EMBMBPSC.a([BI)V")
	public static void method226(byte[] arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0);
		var1.field752 = arg0.length - 8;
		int var2 = var1.method308();
		int var3 = var1.method308();
		int var4 = var1.method308();
		int var5 = var1.method308();
		int var6 = 0;
		JHKSAGUC var7 = new JHKSAGUC(arg0);
		var7.field752 = var6;
		var6 += var2 + 2;
		JHKSAGUC var8 = new JHKSAGUC(arg0);
		var8.field752 = var6;
		var6 += var3;
		JHKSAGUC var9 = new JHKSAGUC(arg0);
		var9.field752 = var6;
		var6 += var4;
		JHKSAGUC var10 = new JHKSAGUC(arg0);
		var10.field752 = var6;
		var6 += var5;
		JHKSAGUC var11 = new JHKSAGUC(arg0);
		var11.field752 = var6;
		NSCXCZCZ var12 = new NSCXCZCZ(var11);
		int var13 = var7.method308();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method308();
			EMBMBPSC var20 = field582[var19] = new EMBMBPSC();
			var20.field583 = var10.method306();
			var20.field584 = var12;
			int var21 = var7.method306();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method306();
				if (var25 > 0) {
					if (var12.field910[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field910[var26] == 0) {
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
					if (var12.field910[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method319();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method319();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method319();
					}

					var22 = var24;
					var23++;

					if (var12.field910[var24] == 5) {
						field590[var19] = false;
					}
				}
			}

			var20.field585 = var23;
			var20.field586 = new int[var23];
			var20.field587 = new int[var23];
			var20.field588 = new int[var23];
			var20.field589 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field586[var28] = var14[var28];
				var20.field587[var28] = var15[var28];
				var20.field588[var28] = var16[var28];
				var20.field589[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("EMBMBPSC.b(I)V")
	public static void method227() {
		field582 = null;
	}

	@ObfuscatedName("EMBMBPSC.a(ZI)LEMBMBPSC;")
	public static EMBMBPSC method228(int arg0) {
		if (field582 == null) {
			return null;
		}

		return field582[arg0];
	}

	@ObfuscatedName("EMBMBPSC.a(II)Z")
	public static boolean method229(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
