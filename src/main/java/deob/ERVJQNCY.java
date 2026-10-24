package deob;

@ObfuscatedName("ERVJQNCY")
public class ERVJQNCY {

	@ObfuscatedName("ERVJQNCY.b")
	public int field658;

	@ObfuscatedName("ERVJQNCY.d")
	public int field660;

	@ObfuscatedName("ERVJQNCY.c")
	public XVBRPTSM field659;

	@ObfuscatedName("ERVJQNCY.e")
	public int[] field661;

	@ObfuscatedName("ERVJQNCY.f")
	public int[] field662;

	@ObfuscatedName("ERVJQNCY.g")
	public int[] field663;

	@ObfuscatedName("ERVJQNCY.h")
	public int[] field664;

	@ObfuscatedName("ERVJQNCY.a")
	public static ERVJQNCY[] field657;

	@ObfuscatedName("ERVJQNCY.i")
	public static boolean[] field665;

	@ObfuscatedName("ERVJQNCY.a(I)V")
	public static void method278(int arg0) {
		field657 = new ERVJQNCY[arg0 + 1];
		field665 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field665[var1] = true;
		}
	}

	@ObfuscatedName("ERVJQNCY.a([BZ)V")
	public static void method279(byte[] arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0);
		var1.field92 = arg0.length - 8;
		int var2 = var1.method46();
		int var3 = var1.method46();
		int var4 = var1.method46();
		int var5 = var1.method46();
		int var6 = 0;
		CKBTFRZM var7 = new CKBTFRZM(arg0);
		var7.field92 = var6;
		var6 += var2 + 2;
		CKBTFRZM var8 = new CKBTFRZM(arg0);
		var8.field92 = var6;
		var6 += var3;
		CKBTFRZM var9 = new CKBTFRZM(arg0);
		var9.field92 = var6;
		var6 += var4;
		CKBTFRZM var10 = new CKBTFRZM(arg0);
		var10.field92 = var6;
		var6 += var5;
		CKBTFRZM var11 = new CKBTFRZM(arg0);
		var11.field92 = var6;
		XVBRPTSM var12 = new XVBRPTSM(var11);
		int var13 = var7.method46();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method46();
			ERVJQNCY var20 = field657[var19] = new ERVJQNCY();
			var20.field658 = var10.method44();
			var20.field659 = var12;
			int var21 = var7.method44();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method44();
				if (var25 > 0) {
					if (var12.field1476[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1476[var26] == 0) {
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
					if (var12.field1476[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method57();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method57();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method57();
					}

					var22 = var24;
					var23++;

					if (var12.field1476[var24] == 5) {
						field665[var19] = false;
					}
				}
			}

			var20.field660 = var23;
			var20.field661 = new int[var23];
			var20.field662 = new int[var23];
			var20.field663 = new int[var23];
			var20.field664 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field661[var28] = var14[var28];
				var20.field662[var28] = var15[var28];
				var20.field663[var28] = var16[var28];
				var20.field664[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("ERVJQNCY.b(I)V")
	public static void method280() {
		field657 = null;
	}

	@ObfuscatedName("ERVJQNCY.a(BI)LERVJQNCY;")
	public static ERVJQNCY method281(int arg0) {
		if (field657 == null) {
			return null;
		}

		return field657[arg0];
	}

	@ObfuscatedName("ERVJQNCY.a(IZ)Z")
	public static boolean method282(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
