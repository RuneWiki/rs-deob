package deob;

@ObfuscatedName("MOOJSKCU")
public class MOOJSKCU {

	@ObfuscatedName("MOOJSKCU.b")
	public int field971;

	@ObfuscatedName("MOOJSKCU.d")
	public int field973;

	@ObfuscatedName("MOOJSKCU.c")
	public TULKBDIJ field972;

	@ObfuscatedName("MOOJSKCU.e")
	public int[] field974;

	@ObfuscatedName("MOOJSKCU.f")
	public int[] field975;

	@ObfuscatedName("MOOJSKCU.g")
	public int[] field976;

	@ObfuscatedName("MOOJSKCU.h")
	public int[] field977;

	@ObfuscatedName("MOOJSKCU.a")
	public static MOOJSKCU[] field970;

	@ObfuscatedName("MOOJSKCU.i")
	public static boolean[] field978;

	@ObfuscatedName("MOOJSKCU.a(I)V")
	public static void method391(int arg0) {
		field970 = new MOOJSKCU[arg0 + 1];
		field978 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field978[var1] = true;
		}
	}

	@ObfuscatedName("MOOJSKCU.a([BB)V")
	public static void method392(byte[] arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0);
		var1.field679 = arg0.length - 8;
		int var2 = var1.method241();
		int var3 = var1.method241();
		int var4 = var1.method241();
		int var5 = var1.method241();
		int var6 = 0;
		EYMNCFMK var7 = new EYMNCFMK(arg0);
		var7.field679 = var6;
		var6 += var2 + 2;
		EYMNCFMK var8 = new EYMNCFMK(arg0);
		var8.field679 = var6;
		var6 += var3;
		EYMNCFMK var9 = new EYMNCFMK(arg0);
		var9.field679 = var6;
		var6 += var4;
		EYMNCFMK var10 = new EYMNCFMK(arg0);
		var10.field679 = var6;
		var6 += var5;
		EYMNCFMK var11 = new EYMNCFMK(arg0);
		var11.field679 = var6;
		TULKBDIJ var12 = new TULKBDIJ(var11);
		int var13 = var7.method241();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method241();
			MOOJSKCU var20 = field970[var19] = new MOOJSKCU();
			var20.field971 = var10.method239();
			var20.field972 = var12;
			int var21 = var7.method239();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method239();
				if (var25 > 0) {
					if (var12.field1256[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1256[var26] == 0) {
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
					if (var12.field1256[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method252();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method252();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method252();
					}

					var22 = var24;
					var23++;

					if (var12.field1256[var24] == 5) {
						field978[var19] = false;
					}
				}
			}

			var20.field973 = var23;
			var20.field974 = new int[var23];
			var20.field975 = new int[var23];
			var20.field976 = new int[var23];
			var20.field977 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field974[var28] = var14[var28];
				var20.field975[var28] = var15[var28];
				var20.field976[var28] = var16[var28];
				var20.field977[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("MOOJSKCU.b(I)V")
	public static void method393() {
		field970 = null;
	}

	@ObfuscatedName("MOOJSKCU.c(I)LMOOJSKCU;")
	public static MOOJSKCU method394(int arg0) {
		if (field970 == null) {
			return null;
		}

		return field970[arg0];
	}

	@ObfuscatedName("MOOJSKCU.a(IB)Z")
	public static boolean method395(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
