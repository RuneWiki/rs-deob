package deob;

@ObfuscatedName("YPRWORMV")
public class YPRWORMV {

	@ObfuscatedName("YPRWORMV.c")
	public int field1504;

	@ObfuscatedName("YPRWORMV.e")
	public int field1506;

	@ObfuscatedName("YPRWORMV.d")
	public RHIQJAPF field1505;

	@ObfuscatedName("YPRWORMV.f")
	public int[] field1507;

	@ObfuscatedName("YPRWORMV.g")
	public int[] field1508;

	@ObfuscatedName("YPRWORMV.h")
	public int[] field1509;

	@ObfuscatedName("YPRWORMV.i")
	public int[] field1510;

	@ObfuscatedName("YPRWORMV.b")
	public static YPRWORMV[] field1503;

	@ObfuscatedName("YPRWORMV.j")
	public static boolean[] field1511;

	@ObfuscatedName("YPRWORMV.a(I)V")
	public static void method598(int arg0) {
		field1503 = new YPRWORMV[arg0 + 1];
		field1511 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1511[var1] = true;
		}
	}

	@ObfuscatedName("YPRWORMV.a([BZ)V")
	public static void method599(byte[] arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0);
		var1.field1014 = arg0.length - 8;
		int var2 = var1.method359();
		int var3 = var1.method359();
		int var4 = var1.method359();
		int var5 = var1.method359();
		int var6 = 0;
		MVHXDWGI var7 = new MVHXDWGI(arg0);
		var7.field1014 = var6;
		var6 += var2 + 2;
		MVHXDWGI var8 = new MVHXDWGI(arg0);
		var8.field1014 = var6;
		var6 += var3;
		MVHXDWGI var9 = new MVHXDWGI(arg0);
		var9.field1014 = var6;
		var6 += var4;
		MVHXDWGI var10 = new MVHXDWGI(arg0);
		var10.field1014 = var6;
		var6 += var5;
		MVHXDWGI var11 = new MVHXDWGI(arg0);
		var11.field1014 = var6;
		RHIQJAPF var12 = new RHIQJAPF(var11);
		int var13 = var7.method359();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method359();
			YPRWORMV var20 = field1503[var19] = new YPRWORMV();
			var20.field1504 = var10.method357();
			var20.field1505 = var12;
			int var21 = var7.method357();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method357();
				if (var25 > 0) {
					if (var12.field1263[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1263[var26] == 0) {
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
					if (var12.field1263[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method370();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method370();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method370();
					}

					var22 = var24;
					var23++;

					if (var12.field1263[var24] == 5) {
						field1511[var19] = false;
					}
				}
			}

			var20.field1506 = var23;
			var20.field1507 = new int[var23];
			var20.field1508 = new int[var23];
			var20.field1509 = new int[var23];
			var20.field1510 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1507[var28] = var14[var28];
				var20.field1508[var28] = var15[var28];
				var20.field1509[var28] = var16[var28];
				var20.field1510[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("YPRWORMV.a(Z)V")
	public static void method600() {
		field1503 = null;
	}

	@ObfuscatedName("YPRWORMV.b(I)LYPRWORMV;")
	public static YPRWORMV method601(int arg0) {
		if (field1503 == null) {
			return null;
		}

		return field1503[arg0];
	}

	@ObfuscatedName("YPRWORMV.a(IZ)Z")
	public static boolean method602(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
