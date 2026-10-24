package deob;

@ObfuscatedName("XBHNZKGU")
public class XBHNZKGU {

	@ObfuscatedName("XBHNZKGU.e")
	public int field1438 = -1;

	@ObfuscatedName("XBHNZKGU.g")
	public int[] field1440 = new int[6];

	@ObfuscatedName("XBHNZKGU.h")
	public int[] field1441 = new int[6];

	@ObfuscatedName("XBHNZKGU.i")
	public int field1442 = 128;

	@ObfuscatedName("XBHNZKGU.j")
	public int field1443 = 128;

	@ObfuscatedName("XBHNZKGU.n")
	public static NQQFCAPC field1447 = new NQQFCAPC(30);

	@ObfuscatedName("XBHNZKGU.a")
	public static int field1434;

	@ObfuscatedName("XBHNZKGU.c")
	public int field1436;

	@ObfuscatedName("XBHNZKGU.d")
	public int field1437;

	@ObfuscatedName("XBHNZKGU.k")
	public int field1444;

	@ObfuscatedName("XBHNZKGU.l")
	public int field1445;

	@ObfuscatedName("XBHNZKGU.m")
	public int field1446;

	@ObfuscatedName("XBHNZKGU.f")
	public XETSOHUA field1439;

	@ObfuscatedName("XBHNZKGU.b")
	public static XBHNZKGU[] field1435;

	@ObfuscatedName("XBHNZKGU.a(LLKPVZAQN;I)V")
	public static void method561(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("spotanim.dat", null));
		field1434 = var1.method517();
		if (field1435 == null) {
			field1435 = new XBHNZKGU[field1434];
		}

		for (int var2 = 0; var2 < field1434; var2++) {
			if (field1435[var2] == null) {
				field1435[var2] = new XBHNZKGU();
			}

			field1435[var2].field1436 = var2;
			field1435[var2].method562(var1);
		}
	}

	@ObfuscatedName("XBHNZKGU.a(LWBEWPIXO;I)V")
	public void method562(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1437 = arg0.method517();
			} else if (var2 == 2) {
				field1438 = arg0.method517();
				if (XETSOHUA.field1474 != null) {
					field1439 = XETSOHUA.field1474[field1438];
				}
			} else if (var2 == 4) {
				field1442 = arg0.method517();
			} else if (var2 == 5) {
				field1443 = arg0.method517();
			} else if (var2 == 6) {
				field1444 = arg0.method517();
			} else if (var2 == 7) {
				field1445 = arg0.method515();
			} else if (var2 == 8) {
				field1446 = arg0.method515();
			} else if (var2 >= 40 && var2 < 50) {
				field1440[var2 - 40] = arg0.method517();
			} else if (var2 >= 50 && var2 < 60) {
				field1441[var2 - 50] = arg0.method517();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XBHNZKGU.a()LFCIDIKVY;")
	public FCIDIKVY method563() {
		FCIDIKVY var1 = (FCIDIKVY) field1447.method334(field1436);
		if (var1 != null) {
			return var1;
		}

		FCIDIKVY var2 = FCIDIKVY.method199(field1437);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1440[0] != 0) {
				var2.method213(field1440[var3], field1441[var3]);
			}
		}

		field1447.method335(field1436, var2);
		return var2;
	}
}
