package deob;

@ObfuscatedName("OKJTNJLE")
public class OKJTNJLE {

	@ObfuscatedName("OKJTNJLE.e")
	public int field1049 = -1;

	@ObfuscatedName("OKJTNJLE.g")
	public int[] field1051 = new int[6];

	@ObfuscatedName("OKJTNJLE.h")
	public int[] field1052 = new int[6];

	@ObfuscatedName("OKJTNJLE.i")
	public int field1053 = 128;

	@ObfuscatedName("OKJTNJLE.j")
	public int field1054 = 128;

	@ObfuscatedName("OKJTNJLE.n")
	public static YITKGHWB field1058 = new YITKGHWB(30);

	@ObfuscatedName("OKJTNJLE.a")
	public static int field1045;

	@ObfuscatedName("OKJTNJLE.c")
	public int field1047;

	@ObfuscatedName("OKJTNJLE.d")
	public int field1048;

	@ObfuscatedName("OKJTNJLE.k")
	public int field1055;

	@ObfuscatedName("OKJTNJLE.l")
	public int field1056;

	@ObfuscatedName("OKJTNJLE.m")
	public int field1057;

	@ObfuscatedName("OKJTNJLE.f")
	public BKDXLPEF field1050;

	@ObfuscatedName("OKJTNJLE.b")
	public static OKJTNJLE[] field1046;

	@ObfuscatedName("OKJTNJLE.a(BLXOJZVVDK;)V")
	public static void method303(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("spotanim.dat", null));
		field1045 = var1.method342();
		if (field1046 == null) {
			field1046 = new OKJTNJLE[field1045];
		}

		for (int var2 = 0; var2 < field1045; var2++) {
			if (field1046[var2] == null) {
				field1046[var2] = new OKJTNJLE();
			}

			field1046[var2].field1047 = var2;
			field1046[var2].method304(var1);
		}
	}

	@ObfuscatedName("OKJTNJLE.a(LPQBRPYKE;Z)V")
	public void method304(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1048 = arg0.method342();
			} else if (var2 == 2) {
				field1049 = arg0.method342();
				if (BKDXLPEF.field75 != null) {
					field1050 = BKDXLPEF.field75[field1049];
				}
			} else if (var2 == 4) {
				field1053 = arg0.method342();
			} else if (var2 == 5) {
				field1054 = arg0.method342();
			} else if (var2 == 6) {
				field1055 = arg0.method342();
			} else if (var2 == 7) {
				field1056 = arg0.method340();
			} else if (var2 == 8) {
				field1057 = arg0.method340();
			} else if (var2 >= 40 && var2 < 50) {
				field1051[var2 - 40] = arg0.method342();
			} else if (var2 >= 50 && var2 < 60) {
				field1052[var2 - 50] = arg0.method342();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OKJTNJLE.a()LFLXAIVEA;")
	public FLXAIVEA method305() {
		FLXAIVEA var1 = (FLXAIVEA) field1058.method572(field1047);
		if (var1 != null) {
			return var1;
		}

		FLXAIVEA var2 = FLXAIVEA.method218(field1048);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1051[0] != 0) {
				var2.method232(field1051[var3], field1052[var3]);
			}
		}

		field1058.method573(var2, field1047);
		return var2;
	}
}
