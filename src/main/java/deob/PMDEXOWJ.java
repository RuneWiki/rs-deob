package deob;

@ObfuscatedName("PMDEXOWJ")
public class PMDEXOWJ {

	@ObfuscatedName("PMDEXOWJ.g")
	public int field1089 = -1;

	@ObfuscatedName("PMDEXOWJ.i")
	public int[] field1091 = new int[6];

	@ObfuscatedName("PMDEXOWJ.j")
	public int[] field1092 = new int[6];

	@ObfuscatedName("PMDEXOWJ.k")
	public int field1093 = 128;

	@ObfuscatedName("PMDEXOWJ.l")
	public int field1094 = 128;

	@ObfuscatedName("PMDEXOWJ.p")
	public static EOJHVRZF field1098 = new EOJHVRZF(30);

	@ObfuscatedName("PMDEXOWJ.c")
	public static int field1085;

	@ObfuscatedName("PMDEXOWJ.e")
	public int field1087;

	@ObfuscatedName("PMDEXOWJ.f")
	public int field1088;

	@ObfuscatedName("PMDEXOWJ.m")
	public int field1095;

	@ObfuscatedName("PMDEXOWJ.n")
	public int field1096;

	@ObfuscatedName("PMDEXOWJ.o")
	public int field1097;

	@ObfuscatedName("PMDEXOWJ.h")
	public RIUJHZLL field1090;

	@ObfuscatedName("PMDEXOWJ.d")
	public static PMDEXOWJ[] field1086;

	@ObfuscatedName("PMDEXOWJ.a(ILRVLWVPJQ;)V")
	public static void method402(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("spotanim.dat", null));
		field1085 = var1.method457();
		if (field1086 == null) {
			field1086 = new PMDEXOWJ[field1085];
		}

		for (int var2 = 0; var2 < field1085; var2++) {
			if (field1086[var2] == null) {
				field1086[var2] = new PMDEXOWJ();
			}

			field1086[var2].field1087 = var2;
			field1086[var2].method403(var1);
		}
	}

	@ObfuscatedName("PMDEXOWJ.a(ILUAWAYCTK;)V")
	public void method403(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1088 = arg0.method457();
			} else if (var2 == 2) {
				field1089 = arg0.method457();
				if (RIUJHZLL.field1112 != null) {
					field1090 = RIUJHZLL.field1112[field1089];
				}
			} else if (var2 == 4) {
				field1093 = arg0.method457();
			} else if (var2 == 5) {
				field1094 = arg0.method457();
			} else if (var2 == 6) {
				field1095 = arg0.method457();
			} else if (var2 == 7) {
				field1096 = arg0.method455();
			} else if (var2 == 8) {
				field1097 = arg0.method455();
			} else if (var2 >= 40 && var2 < 50) {
				field1091[var2 - 40] = arg0.method457();
			} else if (var2 >= 50 && var2 < 60) {
				field1092[var2 - 50] = arg0.method457();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PMDEXOWJ.a()LWEVRTBOZ;")
	public WEVRTBOZ method404() {
		WEVRTBOZ var1 = (WEVRTBOZ) field1098.method206(field1087);
		if (var1 != null) {
			return var1;
		}

		WEVRTBOZ var2 = WEVRTBOZ.method525(field1088);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1091[0] != 0) {
				var2.method539(field1091[var3], field1092[var3]);
			}
		}

		field1098.method207(field1087, var2);
		return var2;
	}
}
