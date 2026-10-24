package deob;

@ObfuscatedName("KYGPROVJ")
public class KYGPROVJ {

	@ObfuscatedName("KYGPROVJ.h")
	public int field833 = -1;

	@ObfuscatedName("KYGPROVJ.j")
	public boolean field835 = false;

	@ObfuscatedName("KYGPROVJ.k")
	public int field836 = 5;

	@ObfuscatedName("KYGPROVJ.l")
	public int field837 = -1;

	@ObfuscatedName("KYGPROVJ.m")
	public int field838 = -1;

	@ObfuscatedName("KYGPROVJ.n")
	public int field839 = 99;

	@ObfuscatedName("KYGPROVJ.o")
	public int field840 = -1;

	@ObfuscatedName("KYGPROVJ.p")
	public int field841 = -1;

	@ObfuscatedName("KYGPROVJ.q")
	public int field842 = 2;

	@ObfuscatedName("KYGPROVJ.b")
	public static int field827;

	@ObfuscatedName("KYGPROVJ.d")
	public int field829;

	@ObfuscatedName("KYGPROVJ.r")
	public int field843;

	@ObfuscatedName("KYGPROVJ.e")
	public int[] field830;

	@ObfuscatedName("KYGPROVJ.f")
	public int[] field831;

	@ObfuscatedName("KYGPROVJ.g")
	public int[] field832;

	@ObfuscatedName("KYGPROVJ.i")
	public int[] field834;

	@ObfuscatedName("KYGPROVJ.c")
	public static KYGPROVJ[] field828;

	@ObfuscatedName("KYGPROVJ.a(LRSPRYUFS;I)V")
	public static void method255(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("seq.dat", null));
		field827 = var1.method341();
		if (field828 == null) {
			field828 = new KYGPROVJ[field827];
		}

		for (int var2 = 0; var2 < field827; var2++) {
			if (field828[var2] == null) {
				field828[var2] = new KYGPROVJ();
			}

			field828[var2].method257(var1);
		}
	}

	@ObfuscatedName("KYGPROVJ.a(II)I")
	public int method256(int arg0) {
		int var2 = field832[arg0];
		if (var2 == 0) {
			YYYUATIU var3 = YYYUATIU.method578(field830[arg0]);
			if (var3 != null) {
				var2 = field832[arg0] = var3.field1475;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KYGPROVJ.a(BLNQUAUMDT;)V")
	public void method257(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				if (field829 == 0) {
					field829 = 1;
					field830 = new int[1];
					field830[0] = -1;
					field831 = new int[1];
					field831[0] = -1;
					field832 = new int[1];
					field832[0] = -1;
				}

				if (field840 == -1) {
					if (field834 == null) {
						field840 = 0;
					} else {
						field840 = 2;
					}
				}

				if (field841 == -1) {
					if (field834 != null) {
						field841 = 2;
						return;
					}

					field841 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field829 = arg0.method339();
				field830 = new int[field829];
				field831 = new int[field829];
				field832 = new int[field829];
				for (int var3 = 0; var3 < field829; var3++) {
					field830[var3] = arg0.method341();
					field831[var3] = arg0.method341();
					if (field831[var3] == 0xFFFF) {
						field831[var3] = -1;
					}

					field832[var3] = arg0.method341();
				}
			} else if (var2 == 2) {
				field833 = arg0.method341();
			} else if (var2 == 3) {
				int var4 = arg0.method339();
				field834 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field834[var5] = arg0.method339();
				}

				field834[var4] = 9999999;
			} else if (var2 == 4) {
				field835 = true;
			} else if (var2 == 5) {
				field836 = arg0.method339();
			} else if (var2 == 6) {
				field837 = arg0.method341();
			} else if (var2 == 7) {
				field838 = arg0.method341();
			} else if (var2 == 8) {
				field839 = arg0.method339();
			} else if (var2 == 9) {
				field840 = arg0.method339();
			} else if (var2 == 10) {
				field841 = arg0.method339();
			} else if (var2 == 11) {
				field842 = arg0.method339();
			} else if (var2 == 12) {
				field843 = arg0.method344();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
