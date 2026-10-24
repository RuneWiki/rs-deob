package deob;

@ObfuscatedName("XMRZESBN")
public class XMRZESBN {

	@ObfuscatedName("XMRZESBN.c")
	public int field1430;

	@ObfuscatedName("XMRZESBN.e")
	public int field1432;

	@ObfuscatedName("XMRZESBN.d")
	public JLLLGAIH field1431;

	@ObfuscatedName("XMRZESBN.f")
	public int[] field1433;

	@ObfuscatedName("XMRZESBN.g")
	public int[] field1434;

	@ObfuscatedName("XMRZESBN.h")
	public int[] field1435;

	@ObfuscatedName("XMRZESBN.i")
	public int[] field1436;

	@ObfuscatedName("XMRZESBN.b")
	public static XMRZESBN[] field1429;

	@ObfuscatedName("XMRZESBN.j")
	public static boolean[] field1437;

	@ObfuscatedName("XMRZESBN.a(I)V")
	public static void method582(int arg0) {
		field1429 = new XMRZESBN[arg0 + 1];
		field1437 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1437[var1] = true;
		}
	}

	@ObfuscatedName("XMRZESBN.a([BB)V")
	public static void method583(byte[] arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0);
		var1.field55 = arg0.length - 8;
		int var2 = var1.method49();
		int var3 = var1.method49();
		int var4 = var1.method49();
		int var5 = var1.method49();
		int var6 = 0;
		BSNPYLEV var7 = new BSNPYLEV(arg0);
		var7.field55 = var6;
		var6 += var2 + 2;
		BSNPYLEV var8 = new BSNPYLEV(arg0);
		var8.field55 = var6;
		var6 += var3;
		BSNPYLEV var9 = new BSNPYLEV(arg0);
		var9.field55 = var6;
		var6 += var4;
		BSNPYLEV var10 = new BSNPYLEV(arg0);
		var10.field55 = var6;
		var6 += var5;
		BSNPYLEV var11 = new BSNPYLEV(arg0);
		var11.field55 = var6;
		JLLLGAIH var12 = new JLLLGAIH(var11);
		int var13 = var7.method49();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method49();
			XMRZESBN var20 = field1429[var19] = new XMRZESBN();
			var20.field1430 = var10.method47();
			var20.field1431 = var12;
			int var21 = var7.method47();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method47();
				if (var25 > 0) {
					if (var12.field754[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field754[var26] == 0) {
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
					if (var12.field754[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method60();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method60();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method60();
					}

					var22 = var24;
					var23++;

					if (var12.field754[var24] == 5) {
						field1437[var19] = false;
					}
				}
			}

			var20.field1432 = var23;
			var20.field1433 = new int[var23];
			var20.field1434 = new int[var23];
			var20.field1435 = new int[var23];
			var20.field1436 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1433[var28] = var14[var28];
				var20.field1434[var28] = var15[var28];
				var20.field1435[var28] = var16[var28];
				var20.field1436[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("XMRZESBN.b(I)V")
	public static void method584() {
		field1429 = null;
	}

	@ObfuscatedName("XMRZESBN.c(I)LXMRZESBN;")
	public static XMRZESBN method585(int arg0) {
		if (field1429 == null) {
			return null;
		}

		return field1429[arg0];
	}

	@ObfuscatedName("XMRZESBN.a(ZI)Z")
	public static boolean method586(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
