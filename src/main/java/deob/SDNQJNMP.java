package deob;

@ObfuscatedName("SDNQJNMP")
public class SDNQJNMP {

	@ObfuscatedName("SDNQJNMP.f")
	public int field1130 = -1;

	@ObfuscatedName("SDNQJNMP.h")
	public int[] field1132 = new int[6];

	@ObfuscatedName("SDNQJNMP.i")
	public int[] field1133 = new int[6];

	@ObfuscatedName("SDNQJNMP.j")
	public int field1134 = 128;

	@ObfuscatedName("SDNQJNMP.k")
	public int field1135 = 128;

	@ObfuscatedName("SDNQJNMP.o")
	public static BVBRKPZH field1139 = new BVBRKPZH(30);

	@ObfuscatedName("SDNQJNMP.b")
	public static int field1126;

	@ObfuscatedName("SDNQJNMP.d")
	public int field1128;

	@ObfuscatedName("SDNQJNMP.e")
	public int field1129;

	@ObfuscatedName("SDNQJNMP.l")
	public int field1136;

	@ObfuscatedName("SDNQJNMP.m")
	public int field1137;

	@ObfuscatedName("SDNQJNMP.n")
	public int field1138;

	@ObfuscatedName("SDNQJNMP.g")
	public VYXELYSX field1131;

	@ObfuscatedName("SDNQJNMP.c")
	public static SDNQJNMP[] field1127;

	@ObfuscatedName("SDNQJNMP.a(ILMAARFNGV;)V")
	public static void method394(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("spotanim.dat", null));
		field1126 = var1.method219();
		if (field1127 == null) {
			field1127 = new SDNQJNMP[field1126];
		}

		for (int var2 = 0; var2 < field1126; var2++) {
			if (field1127[var2] == null) {
				field1127[var2] = new SDNQJNMP();
			}

			field1127[var2].field1128 = var2;
			field1127[var2].method395(var1);
		}
	}

	@ObfuscatedName("SDNQJNMP.a(ILEMWAMCXW;)V")
	public void method395(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1129 = arg0.method219();
			} else if (var2 == 2) {
				field1130 = arg0.method219();
				if (VYXELYSX.field1273 != null) {
					field1131 = VYXELYSX.field1273[field1130];
				}
			} else if (var2 == 4) {
				field1134 = arg0.method219();
			} else if (var2 == 5) {
				field1135 = arg0.method219();
			} else if (var2 == 6) {
				field1136 = arg0.method219();
			} else if (var2 == 7) {
				field1137 = arg0.method217();
			} else if (var2 == 8) {
				field1138 = arg0.method217();
			} else if (var2 >= 40 && var2 < 50) {
				field1132[var2 - 40] = arg0.method219();
			} else if (var2 >= 50 && var2 < 60) {
				field1133[var2 - 50] = arg0.method219();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SDNQJNMP.a()LIEHKDFMR;")
	public IEHKDFMR method396() {
		IEHKDFMR var1 = (IEHKDFMR) field1139.method25(field1128);
		if (var1 != null) {
			return var1;
		}

		IEHKDFMR var2 = IEHKDFMR.method267(field1129);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1132[0] != 0) {
				var2.method281(field1132[var3], field1133[var3]);
			}
		}

		field1139.method26(field1128, var2);
		return var2;
	}
}
