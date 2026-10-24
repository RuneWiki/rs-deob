package deob;

@ObfuscatedName("KMWMLVIH")
public class KMWMLVIH {

	@ObfuscatedName("KMWMLVIH.g")
	public int field830 = -1;

	@ObfuscatedName("KMWMLVIH.i")
	public boolean field832 = false;

	@ObfuscatedName("KMWMLVIH.j")
	public int field833 = 5;

	@ObfuscatedName("KMWMLVIH.k")
	public int field834 = -1;

	@ObfuscatedName("KMWMLVIH.l")
	public int field835 = -1;

	@ObfuscatedName("KMWMLVIH.m")
	public int field836 = 99;

	@ObfuscatedName("KMWMLVIH.n")
	public int field837 = -1;

	@ObfuscatedName("KMWMLVIH.o")
	public int field838 = -1;

	@ObfuscatedName("KMWMLVIH.p")
	public int field839 = 2;

	@ObfuscatedName("KMWMLVIH.a")
	public static int field824;

	@ObfuscatedName("KMWMLVIH.c")
	public int field826;

	@ObfuscatedName("KMWMLVIH.q")
	public int field840;

	@ObfuscatedName("KMWMLVIH.d")
	public int[] field827;

	@ObfuscatedName("KMWMLVIH.e")
	public int[] field828;

	@ObfuscatedName("KMWMLVIH.f")
	public int[] field829;

	@ObfuscatedName("KMWMLVIH.h")
	public int[] field831;

	@ObfuscatedName("KMWMLVIH.b")
	public static KMWMLVIH[] field825;

	@ObfuscatedName("KMWMLVIH.a(LWEMOPWVJ;I)V")
	public static void method319(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("seq.dat", null));
		field824 = var1.method463();
		if (field825 == null) {
			field825 = new KMWMLVIH[field824];
		}

		for (int var2 = 0; var2 < field824; var2++) {
			if (field825[var2] == null) {
				field825[var2] = new KMWMLVIH();
			}

			field825[var2].method321(var1);
		}
	}

	@ObfuscatedName("KMWMLVIH.a(IB)I")
	public int method320(int arg0) {
		int var2 = field829[arg0];
		if (var2 == 0) {
			PLSPTEPI var3 = PLSPTEPI.method405(field827[arg0]);
			if (var3 != null) {
				var2 = field829[arg0] = var3.field1104;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KMWMLVIH.a(ILSVWJKJVI;)V")
	public void method321(SVWJKJVI arg0) {
		while (true) {
			int var2 = arg0.method461();
			if (var2 == 0) {
				if (field826 == 0) {
					field826 = 1;
					field827 = new int[1];
					field827[0] = -1;
					field828 = new int[1];
					field828[0] = -1;
					field829 = new int[1];
					field829[0] = -1;
				}

				if (field837 == -1) {
					if (field831 == null) {
						field837 = 0;
					} else {
						field837 = 2;
					}
				}

				if (field838 == -1) {
					if (field831 != null) {
						field838 = 2;
						return;
					}

					field838 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field826 = arg0.method461();
				field827 = new int[field826];
				field828 = new int[field826];
				field829 = new int[field826];
				for (int var3 = 0; var3 < field826; var3++) {
					field827[var3] = arg0.method463();
					field828[var3] = arg0.method463();
					if (field828[var3] == 0xFFFF) {
						field828[var3] = -1;
					}

					field829[var3] = arg0.method463();
				}
			} else if (var2 == 2) {
				field830 = arg0.method463();
			} else if (var2 == 3) {
				int var4 = arg0.method461();
				field831 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field831[var5] = arg0.method461();
				}

				field831[var4] = 9999999;
			} else if (var2 == 4) {
				field832 = true;
			} else if (var2 == 5) {
				field833 = arg0.method461();
			} else if (var2 == 6) {
				field834 = arg0.method463();
			} else if (var2 == 7) {
				field835 = arg0.method463();
			} else if (var2 == 8) {
				field836 = arg0.method461();
			} else if (var2 == 9) {
				field837 = arg0.method461();
			} else if (var2 == 10) {
				field838 = arg0.method461();
			} else if (var2 == 11) {
				field839 = arg0.method461();
			} else if (var2 == 12) {
				field840 = arg0.method466();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
