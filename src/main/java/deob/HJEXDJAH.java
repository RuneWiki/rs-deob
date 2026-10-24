package deob;

@ObfuscatedName("HJEXDJAH")
public class HJEXDJAH {

	@ObfuscatedName("HJEXDJAH.b")
	public int field628;

	@ObfuscatedName("HJEXDJAH.d")
	public int field630;

	@ObfuscatedName("HJEXDJAH.c")
	public TMLYUVVT field629;

	@ObfuscatedName("HJEXDJAH.e")
	public int[] field631;

	@ObfuscatedName("HJEXDJAH.f")
	public int[] field632;

	@ObfuscatedName("HJEXDJAH.g")
	public int[] field633;

	@ObfuscatedName("HJEXDJAH.h")
	public int[] field634;

	@ObfuscatedName("HJEXDJAH.a")
	public static HJEXDJAH[] field627;

	@ObfuscatedName("HJEXDJAH.i")
	public static boolean[] field635;

	@ObfuscatedName("HJEXDJAH.a(I)V")
	public static void method214(int arg0) {
		field627 = new HJEXDJAH[arg0 + 1];
		field635 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field635[var1] = true;
		}
	}

	@ObfuscatedName("HJEXDJAH.a(I[B)V")
	public static void method215(byte[] arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0);
		var1.field1252 = arg0.length - 8;
		int var2 = var1.method457();
		int var3 = var1.method457();
		int var4 = var1.method457();
		int var5 = var1.method457();
		int var6 = 0;
		UAWAYCTK var7 = new UAWAYCTK(arg0);
		var7.field1252 = var6;
		var6 += var2 + 2;
		UAWAYCTK var8 = new UAWAYCTK(arg0);
		var8.field1252 = var6;
		var6 += var3;
		UAWAYCTK var9 = new UAWAYCTK(arg0);
		var9.field1252 = var6;
		var6 += var4;
		UAWAYCTK var10 = new UAWAYCTK(arg0);
		var10.field1252 = var6;
		var6 += var5;
		UAWAYCTK var11 = new UAWAYCTK(arg0);
		var11.field1252 = var6;
		TMLYUVVT var12 = new TMLYUVVT(var11);
		int var13 = var7.method457();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method457();
			HJEXDJAH var20 = field627[var19] = new HJEXDJAH();
			var20.field628 = var10.method455();
			var20.field629 = var12;
			int var21 = var7.method455();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method455();
				if (var25 > 0) {
					if (var12.field1184[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1184[var26] == 0) {
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
					if (var12.field1184[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method468();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method468();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method468();
					}

					var22 = var24;
					var23++;

					if (var12.field1184[var24] == 5) {
						field635[var19] = false;
					}
				}
			}

			var20.field630 = var23;
			var20.field631 = new int[var23];
			var20.field632 = new int[var23];
			var20.field633 = new int[var23];
			var20.field634 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field631[var28] = var14[var28];
				var20.field632[var28] = var15[var28];
				var20.field633[var28] = var16[var28];
				var20.field634[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("HJEXDJAH.a(Z)V")
	public static void method216() {
		field627 = null;
	}

	@ObfuscatedName("HJEXDJAH.a(II)LHJEXDJAH;")
	public static HJEXDJAH method217(int arg0) {
		if (field627 == null) {
			return null;
		}

		return field627[arg0];
	}

	@ObfuscatedName("HJEXDJAH.a(IZ)Z")
	public static boolean method218(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
