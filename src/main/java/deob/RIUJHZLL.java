package deob;

@ObfuscatedName("RIUJHZLL")
public class RIUJHZLL {

	@ObfuscatedName("RIUJHZLL.h")
	public int field1117 = -1;

	@ObfuscatedName("RIUJHZLL.j")
	public boolean field1119 = false;

	@ObfuscatedName("RIUJHZLL.k")
	public int field1120 = 5;

	@ObfuscatedName("RIUJHZLL.l")
	public int field1121 = -1;

	@ObfuscatedName("RIUJHZLL.m")
	public int field1122 = -1;

	@ObfuscatedName("RIUJHZLL.n")
	public int field1123 = 99;

	@ObfuscatedName("RIUJHZLL.o")
	public int field1124 = -1;

	@ObfuscatedName("RIUJHZLL.p")
	public int field1125 = -1;

	@ObfuscatedName("RIUJHZLL.q")
	public int field1126 = 2;

	@ObfuscatedName("RIUJHZLL.b")
	public static int field1111;

	@ObfuscatedName("RIUJHZLL.d")
	public int field1113;

	@ObfuscatedName("RIUJHZLL.r")
	public int field1127;

	@ObfuscatedName("RIUJHZLL.e")
	public int[] field1114;

	@ObfuscatedName("RIUJHZLL.f")
	public int[] field1115;

	@ObfuscatedName("RIUJHZLL.g")
	public int[] field1116;

	@ObfuscatedName("RIUJHZLL.i")
	public int[] field1118;

	@ObfuscatedName("RIUJHZLL.c")
	public static RIUJHZLL[] field1112;

	@ObfuscatedName("RIUJHZLL.a(ILRVLWVPJQ;)V")
	public static void method413(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("seq.dat", null));
		field1111 = var1.method457();
		if (field1112 == null) {
			field1112 = new RIUJHZLL[field1111];
		}

		for (int var2 = 0; var2 < field1111; var2++) {
			if (field1112[var2] == null) {
				field1112[var2] = new RIUJHZLL();
			}

			field1112[var2].method415(var1);
		}
	}

	@ObfuscatedName("RIUJHZLL.a(II)I")
	public int method414(int arg0) {
		int var2 = field1116[arg0];
		if (var2 == 0) {
			HJEXDJAH var3 = HJEXDJAH.method217(field1114[arg0]);
			if (var3 != null) {
				var2 = field1116[arg0] = var3.field628;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("RIUJHZLL.a(ILUAWAYCTK;)V")
	public void method415(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				if (field1113 == 0) {
					field1113 = 1;
					field1114 = new int[1];
					field1114[0] = -1;
					field1115 = new int[1];
					field1115[0] = -1;
					field1116 = new int[1];
					field1116[0] = -1;
				}

				if (field1124 == -1) {
					if (field1118 == null) {
						field1124 = 0;
					} else {
						field1124 = 2;
					}
				}

				if (field1125 == -1) {
					if (field1118 != null) {
						field1125 = 2;
						return;
					}

					field1125 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1113 = arg0.method455();
				field1114 = new int[field1113];
				field1115 = new int[field1113];
				field1116 = new int[field1113];
				for (int var3 = 0; var3 < field1113; var3++) {
					field1114[var3] = arg0.method457();
					field1115[var3] = arg0.method457();
					if (field1115[var3] == 0xFFFF) {
						field1115[var3] = -1;
					}

					field1116[var3] = arg0.method457();
				}
			} else if (var2 == 2) {
				field1117 = arg0.method457();
			} else if (var2 == 3) {
				int var4 = arg0.method455();
				field1118 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1118[var5] = arg0.method455();
				}

				field1118[var4] = 9999999;
			} else if (var2 == 4) {
				field1119 = true;
			} else if (var2 == 5) {
				field1120 = arg0.method455();
			} else if (var2 == 6) {
				field1121 = arg0.method457();
			} else if (var2 == 7) {
				field1122 = arg0.method457();
			} else if (var2 == 8) {
				field1123 = arg0.method455();
			} else if (var2 == 9) {
				field1124 = arg0.method455();
			} else if (var2 == 10) {
				field1125 = arg0.method455();
			} else if (var2 == 11) {
				field1126 = arg0.method455();
			} else if (var2 == 12) {
				field1127 = arg0.method460();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
