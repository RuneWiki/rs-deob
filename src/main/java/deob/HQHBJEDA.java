package deob;

@ObfuscatedName("HQHBJEDA")
public class HQHBJEDA {

	@ObfuscatedName("HQHBJEDA.c")
	public int field695;

	@ObfuscatedName("HQHBJEDA.e")
	public int field697;

	@ObfuscatedName("HQHBJEDA.d")
	public YPJRJNAP field696;

	@ObfuscatedName("HQHBJEDA.f")
	public int[] field698;

	@ObfuscatedName("HQHBJEDA.g")
	public int[] field699;

	@ObfuscatedName("HQHBJEDA.h")
	public int[] field700;

	@ObfuscatedName("HQHBJEDA.i")
	public int[] field701;

	@ObfuscatedName("HQHBJEDA.b")
	public static HQHBJEDA[] field694;

	@ObfuscatedName("HQHBJEDA.j")
	public static boolean[] field702;

	@ObfuscatedName("HQHBJEDA.a(I)V")
	public static void method215(int arg0) {
		field694 = new HQHBJEDA[arg0 + 1];
		field702 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field702[var1] = true;
		}
	}

	@ObfuscatedName("HQHBJEDA.a([BB)V")
	public static void method216(byte[] arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0);
		var1.field714 = arg0.length - 8;
		int var2 = var1.method240();
		int var3 = var1.method240();
		int var4 = var1.method240();
		int var5 = var1.method240();
		int var6 = 0;
		IMUIZRAF var7 = new IMUIZRAF(arg0);
		var7.field714 = var6;
		var6 += var2 + 2;
		IMUIZRAF var8 = new IMUIZRAF(arg0);
		var8.field714 = var6;
		var6 += var3;
		IMUIZRAF var9 = new IMUIZRAF(arg0);
		var9.field714 = var6;
		var6 += var4;
		IMUIZRAF var10 = new IMUIZRAF(arg0);
		var10.field714 = var6;
		var6 += var5;
		IMUIZRAF var11 = new IMUIZRAF(arg0);
		var11.field714 = var6;
		YPJRJNAP var12 = new YPJRJNAP(var11);
		int var13 = var7.method240();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method240();
			HQHBJEDA var20 = field694[var19] = new HQHBJEDA();
			var20.field695 = var10.method238();
			var20.field696 = var12;
			int var21 = var7.method238();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method238();
				if (var25 > 0) {
					if (var12.field1458[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1458[var26] == 0) {
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
					if (var12.field1458[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method251();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method251();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method251();
					}

					var22 = var24;
					var23++;

					if (var12.field1458[var24] == 5) {
						field702[var19] = false;
					}
				}
			}

			var20.field697 = var23;
			var20.field698 = new int[var23];
			var20.field699 = new int[var23];
			var20.field700 = new int[var23];
			var20.field701 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field698[var28] = var14[var28];
				var20.field699[var28] = var15[var28];
				var20.field700[var28] = var16[var28];
				var20.field701[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("HQHBJEDA.b(I)V")
	public static void method217() {
		field694 = null;
	}

	@ObfuscatedName("HQHBJEDA.a(IB)LHQHBJEDA;")
	public static HQHBJEDA method218(int arg0) {
		if (field694 == null) {
			return null;
		}

		return field694[arg0];
	}

	@ObfuscatedName("HQHBJEDA.a(IZ)Z")
	public static boolean method219(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
