package deob;

@ObfuscatedName("DWUJPTWU")
public class DWUJPTWU {

	@ObfuscatedName("DWUJPTWU.h")
	public int field591 = -1;

	@ObfuscatedName("DWUJPTWU.j")
	public boolean field593 = false;

	@ObfuscatedName("DWUJPTWU.k")
	public int field594 = 5;

	@ObfuscatedName("DWUJPTWU.l")
	public int field595 = -1;

	@ObfuscatedName("DWUJPTWU.m")
	public int field596 = -1;

	@ObfuscatedName("DWUJPTWU.n")
	public int field597 = 99;

	@ObfuscatedName("DWUJPTWU.o")
	public int field598 = -1;

	@ObfuscatedName("DWUJPTWU.p")
	public int field599 = -1;

	@ObfuscatedName("DWUJPTWU.q")
	public int field600 = 2;

	@ObfuscatedName("DWUJPTWU.b")
	public static int field585;

	@ObfuscatedName("DWUJPTWU.d")
	public int field587;

	@ObfuscatedName("DWUJPTWU.r")
	public int field601;

	@ObfuscatedName("DWUJPTWU.e")
	public int[] field588;

	@ObfuscatedName("DWUJPTWU.f")
	public int[] field589;

	@ObfuscatedName("DWUJPTWU.g")
	public int[] field590;

	@ObfuscatedName("DWUJPTWU.i")
	public int[] field592;

	@ObfuscatedName("DWUJPTWU.c")
	public static DWUJPTWU[] field586;

	@ObfuscatedName("DWUJPTWU.a(ILTXPLZUUI;)V")
	public static void method214(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("seq.dat", null));
		field585 = var1.method332();
		if (field586 == null) {
			field586 = new DWUJPTWU[field585];
		}

		for (int var2 = 0; var2 < field585; var2++) {
			if (field586[var2] == null) {
				field586[var2] = new DWUJPTWU();
			}

			field586[var2].method216(var1);
		}
	}

	@ObfuscatedName("DWUJPTWU.a(II)I")
	public int method215(int arg0) {
		int var2 = field590[arg0];
		if (var2 == 0) {
			AOFTXYIM var3 = AOFTXYIM.method4(field588[arg0]);
			if (var3 != null) {
				var2 = field590[arg0] = var3.field18;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("DWUJPTWU.a(LPKHWFJLM;Z)V")
	public void method216(PKHWFJLM arg0) {
		while (true) {
			int var2 = arg0.method330();
			if (var2 == 0) {
				if (field587 == 0) {
					field587 = 1;
					field588 = new int[1];
					field588[0] = -1;
					field589 = new int[1];
					field589[0] = -1;
					field590 = new int[1];
					field590[0] = -1;
				}

				if (field598 == -1) {
					if (field592 == null) {
						field598 = 0;
					} else {
						field598 = 2;
					}
				}

				if (field599 == -1) {
					if (field592 != null) {
						field599 = 2;
						return;
					}

					field599 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field587 = arg0.method330();
				field588 = new int[field587];
				field589 = new int[field587];
				field590 = new int[field587];
				for (int var3 = 0; var3 < field587; var3++) {
					field588[var3] = arg0.method332();
					field589[var3] = arg0.method332();
					if (field589[var3] == 0xFFFF) {
						field589[var3] = -1;
					}

					field590[var3] = arg0.method332();
				}
			} else if (var2 == 2) {
				field591 = arg0.method332();
			} else if (var2 == 3) {
				int var4 = arg0.method330();
				field592 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field592[var5] = arg0.method330();
				}

				field592[var4] = 9999999;
			} else if (var2 == 4) {
				field593 = true;
			} else if (var2 == 5) {
				field594 = arg0.method330();
			} else if (var2 == 6) {
				field595 = arg0.method332();
			} else if (var2 == 7) {
				field596 = arg0.method332();
			} else if (var2 == 8) {
				field597 = arg0.method330();
			} else if (var2 == 9) {
				field598 = arg0.method330();
			} else if (var2 == 10) {
				field599 = arg0.method330();
			} else if (var2 == 11) {
				field600 = arg0.method330();
			} else if (var2 == 12) {
				field601 = arg0.method335();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
