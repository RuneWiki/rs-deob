package deob;

@ObfuscatedName("BKYAWERN")
public class BKYAWERN {

	@ObfuscatedName("BKYAWERN.c")
	public int field43;

	@ObfuscatedName("BKYAWERN.e")
	public int field45;

	@ObfuscatedName("BKYAWERN.d")
	public GCTCRUHH field44;

	@ObfuscatedName("BKYAWERN.f")
	public int[] field46;

	@ObfuscatedName("BKYAWERN.g")
	public int[] field47;

	@ObfuscatedName("BKYAWERN.h")
	public int[] field48;

	@ObfuscatedName("BKYAWERN.i")
	public int[] field49;

	@ObfuscatedName("BKYAWERN.b")
	public static BKYAWERN[] field42;

	@ObfuscatedName("BKYAWERN.j")
	public static boolean[] field50;

	@ObfuscatedName("BKYAWERN.a(I)V")
	public static void method111(int arg0) {
		field42 = new BKYAWERN[arg0 + 1];
		field50 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field50[var1] = true;
		}
	}

	@ObfuscatedName("BKYAWERN.a([BI)V")
	public static void method112(byte[] arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0);
		var1.field10 = arg0.length - 8;
		int var2 = var1.method56();
		int var3 = var1.method56();
		int var4 = var1.method56();
		int var5 = var1.method56();
		int var6 = 0;
		BFQIDHPO var7 = new BFQIDHPO(arg0);
		var7.field10 = var6;
		var6 += var2 + 2;
		BFQIDHPO var8 = new BFQIDHPO(arg0);
		var8.field10 = var6;
		var6 += var3;
		BFQIDHPO var9 = new BFQIDHPO(arg0);
		var9.field10 = var6;
		var6 += var4;
		BFQIDHPO var10 = new BFQIDHPO(arg0);
		var10.field10 = var6;
		var6 += var5;
		BFQIDHPO var11 = new BFQIDHPO(arg0);
		var11.field10 = var6;
		GCTCRUHH var12 = new GCTCRUHH(var11);
		int var13 = var7.method56();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method56();
			BKYAWERN var20 = field42[var19] = new BKYAWERN();
			var20.field43 = var10.method54();
			var20.field44 = var12;
			int var21 = var7.method54();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method54();
				if (var25 > 0) {
					if (var12.field719[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field719[var26] == 0) {
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
					if (var12.field719[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method67();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method67();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method67();
					}

					var22 = var24;
					var23++;

					if (var12.field719[var24] == 5) {
						field50[var19] = false;
					}
				}
			}

			var20.field45 = var23;
			var20.field46 = new int[var23];
			var20.field47 = new int[var23];
			var20.field48 = new int[var23];
			var20.field49 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field46[var28] = var14[var28];
				var20.field47[var28] = var15[var28];
				var20.field48[var28] = var16[var28];
				var20.field49[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("BKYAWERN.b(I)V")
	public static void method113() {
		field42 = null;
	}

	@ObfuscatedName("BKYAWERN.c(I)LBKYAWERN;")
	public static BKYAWERN method114(int arg0) {
		if (field42 == null) {
			return null;
		}

		return field42[arg0];
	}

	@ObfuscatedName("BKYAWERN.a(BI)Z")
	public static boolean method115(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
