package deob;

@ObfuscatedName("MKJLFPRH")
public class MKJLFPRH {

	@ObfuscatedName("MKJLFPRH.e")
	public int field1054 = -1;

	@ObfuscatedName("MKJLFPRH.g")
	public int[] field1056 = new int[6];

	@ObfuscatedName("MKJLFPRH.h")
	public int[] field1057 = new int[6];

	@ObfuscatedName("MKJLFPRH.i")
	public int field1058 = 128;

	@ObfuscatedName("MKJLFPRH.j")
	public int field1059 = 128;

	@ObfuscatedName("MKJLFPRH.n")
	public static JETHVCIV field1063 = new JETHVCIV(30);

	@ObfuscatedName("MKJLFPRH.a")
	public static int field1050;

	@ObfuscatedName("MKJLFPRH.c")
	public int field1052;

	@ObfuscatedName("MKJLFPRH.d")
	public int field1053;

	@ObfuscatedName("MKJLFPRH.k")
	public int field1060;

	@ObfuscatedName("MKJLFPRH.l")
	public int field1061;

	@ObfuscatedName("MKJLFPRH.m")
	public int field1062;

	@ObfuscatedName("MKJLFPRH.f")
	public OXBPHQKK field1055;

	@ObfuscatedName("MKJLFPRH.b")
	public static MKJLFPRH[] field1051;

	@ObfuscatedName("MKJLFPRH.a(LMNPBQFWE;B)V")
	public static void method421(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("spotanim.dat", null));
		field1050 = var1.method17();
		if (field1051 == null) {
			field1051 = new MKJLFPRH[field1050];
		}

		for (int var2 = 0; var2 < field1050; var2++) {
			if (field1051[var2] == null) {
				field1051[var2] = new MKJLFPRH();
			}

			field1051[var2].field1052 = var2;
			field1051[var2].method422(var1);
		}
	}

	@ObfuscatedName("MKJLFPRH.a(ILBJPWOXRJ;)V")
	public void method422(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1053 = arg0.method17();
			} else if (var2 == 2) {
				field1054 = arg0.method17();
				if (OXBPHQKK.field1152 != null) {
					field1055 = OXBPHQKK.field1152[field1054];
				}
			} else if (var2 == 4) {
				field1058 = arg0.method17();
			} else if (var2 == 5) {
				field1059 = arg0.method17();
			} else if (var2 == 6) {
				field1060 = arg0.method17();
			} else if (var2 == 7) {
				field1061 = arg0.method15();
			} else if (var2 == 8) {
				field1062 = arg0.method15();
			} else if (var2 >= 40 && var2 < 50) {
				field1056[var2 - 40] = arg0.method17();
			} else if (var2 >= 50 && var2 < 60) {
				field1057[var2 - 50] = arg0.method17();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MKJLFPRH.a()LJLNSJQDR;")
	public JLNSJQDR method423() {
		JLNSJQDR var1 = (JLNSJQDR) field1063.method315(field1052);
		if (var1 != null) {
			return var1;
		}

		JLNSJQDR var2 = JLNSJQDR.method328(field1053);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1056[0] != 0) {
				var2.method342(field1056[var3], field1057[var3]);
			}
		}

		field1063.method316(var2, field1052);
		return var2;
	}
}
