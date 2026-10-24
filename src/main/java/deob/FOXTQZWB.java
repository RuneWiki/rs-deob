package deob;

@ObfuscatedName("FOXTQZWB")
public class FOXTQZWB {

	@ObfuscatedName("FOXTQZWB.f")
	public int field606 = -1;

	@ObfuscatedName("FOXTQZWB.h")
	public int[] field608 = new int[6];

	@ObfuscatedName("FOXTQZWB.i")
	public int[] field609 = new int[6];

	@ObfuscatedName("FOXTQZWB.j")
	public int field610 = 128;

	@ObfuscatedName("FOXTQZWB.k")
	public int field611 = 128;

	@ObfuscatedName("FOXTQZWB.o")
	public static QXKQGEKL field615 = new QXKQGEKL(30);

	@ObfuscatedName("FOXTQZWB.b")
	public static int field602;

	@ObfuscatedName("FOXTQZWB.d")
	public int field604;

	@ObfuscatedName("FOXTQZWB.e")
	public int field605;

	@ObfuscatedName("FOXTQZWB.l")
	public int field612;

	@ObfuscatedName("FOXTQZWB.m")
	public int field613;

	@ObfuscatedName("FOXTQZWB.n")
	public int field614;

	@ObfuscatedName("FOXTQZWB.g")
	public KAIFCIAJ field607;

	@ObfuscatedName("FOXTQZWB.c")
	public static FOXTQZWB[] field603;

	@ObfuscatedName("FOXTQZWB.a(BLESUFCMYV;)V")
	public static void method208(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("spotanim.dat", null));
		field602 = var1.method457();
		if (field603 == null) {
			field603 = new FOXTQZWB[field602];
		}

		for (int var2 = 0; var2 < field602; var2++) {
			if (field603[var2] == null) {
				field603[var2] = new FOXTQZWB();
			}

			field603[var2].field604 = var2;
			field603[var2].method209(var1);
		}
	}

	@ObfuscatedName("FOXTQZWB.a(ILRGCGKKUR;)V")
	public void method209(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field605 = arg0.method457();
			} else if (var2 == 2) {
				field606 = arg0.method457();
				if (KAIFCIAJ.field742 != null) {
					field607 = KAIFCIAJ.field742[field606];
				}
			} else if (var2 == 4) {
				field610 = arg0.method457();
			} else if (var2 == 5) {
				field611 = arg0.method457();
			} else if (var2 == 6) {
				field612 = arg0.method457();
			} else if (var2 == 7) {
				field613 = arg0.method455();
			} else if (var2 == 8) {
				field614 = arg0.method455();
			} else if (var2 >= 40 && var2 < 50) {
				field608[var2 - 40] = arg0.method457();
			} else if (var2 >= 50 && var2 < 60) {
				field609[var2 - 50] = arg0.method457();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FOXTQZWB.a()LNGYJLUVS;")
	public NGYJLUVS method210() {
		NGYJLUVS var1 = (NGYJLUVS) field615.method440(field604);
		if (var1 != null) {
			return var1;
		}

		NGYJLUVS var2 = NGYJLUVS.method291(field605);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field608[0] != 0) {
				var2.method305(field608[var3], field609[var3]);
			}
		}

		field615.method441(field604, var2);
		return var2;
	}
}
