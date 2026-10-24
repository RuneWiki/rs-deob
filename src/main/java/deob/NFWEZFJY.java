package deob;

@ObfuscatedName("NFWEZFJY")
public class NFWEZFJY {

	@ObfuscatedName("NFWEZFJY.c")
	public int field1037;

	@ObfuscatedName("NFWEZFJY.e")
	public int field1039;

	@ObfuscatedName("NFWEZFJY.d")
	public MJPGHGEY field1038;

	@ObfuscatedName("NFWEZFJY.f")
	public int[] field1040;

	@ObfuscatedName("NFWEZFJY.g")
	public int[] field1041;

	@ObfuscatedName("NFWEZFJY.h")
	public int[] field1042;

	@ObfuscatedName("NFWEZFJY.i")
	public int[] field1043;

	@ObfuscatedName("NFWEZFJY.b")
	public static NFWEZFJY[] field1036;

	@ObfuscatedName("NFWEZFJY.j")
	public static boolean[] field1044;

	@ObfuscatedName("NFWEZFJY.a(I)V")
	public static void method298(int arg0) {
		field1036 = new NFWEZFJY[arg0 + 1];
		field1044 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1044[var1] = true;
		}
	}

	@ObfuscatedName("NFWEZFJY.a([BZ)V")
	public static void method299(byte[] arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0);
		var1.field1091 = arg0.length - 8;
		int var2 = var1.method342();
		int var3 = var1.method342();
		int var4 = var1.method342();
		int var5 = var1.method342();
		int var6 = 0;
		PQBRPYKE var7 = new PQBRPYKE(arg0);
		var7.field1091 = var6;
		var6 += var2 + 2;
		PQBRPYKE var8 = new PQBRPYKE(arg0);
		var8.field1091 = var6;
		var6 += var3;
		PQBRPYKE var9 = new PQBRPYKE(arg0);
		var9.field1091 = var6;
		var6 += var4;
		PQBRPYKE var10 = new PQBRPYKE(arg0);
		var10.field1091 = var6;
		var6 += var5;
		PQBRPYKE var11 = new PQBRPYKE(arg0);
		var11.field1091 = var6;
		MJPGHGEY var12 = new MJPGHGEY(var11);
		int var13 = var7.method342();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method342();
			NFWEZFJY var20 = field1036[var19] = new NFWEZFJY();
			var20.field1037 = var10.method340();
			var20.field1038 = var12;
			int var21 = var7.method340();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method340();
				if (var25 > 0) {
					if (var12.field1024[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1024[var26] == 0) {
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
					if (var12.field1024[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method353();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method353();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method353();
					}

					var22 = var24;
					var23++;

					if (var12.field1024[var24] == 5) {
						field1044[var19] = false;
					}
				}
			}

			var20.field1039 = var23;
			var20.field1040 = new int[var23];
			var20.field1041 = new int[var23];
			var20.field1042 = new int[var23];
			var20.field1043 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1040[var28] = var14[var28];
				var20.field1041[var28] = var15[var28];
				var20.field1042[var28] = var16[var28];
				var20.field1043[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("NFWEZFJY.a(Z)V")
	public static void method300() {
		field1036 = null;
	}

	@ObfuscatedName("NFWEZFJY.b(I)LNFWEZFJY;")
	public static NFWEZFJY method301(int arg0) {
		if (field1036 == null) {
			return null;
		}

		return field1036[arg0];
	}

	@ObfuscatedName("NFWEZFJY.a(ZI)Z")
	public static boolean method302(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
