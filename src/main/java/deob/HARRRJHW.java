package deob;

@ObfuscatedName("HARRRJHW")
public class HARRRJHW {

	@ObfuscatedName("HARRRJHW.i")
	public int field845 = -1;

	@ObfuscatedName("HARRRJHW.k")
	public boolean field847 = false;

	@ObfuscatedName("HARRRJHW.l")
	public int field848 = 5;

	@ObfuscatedName("HARRRJHW.m")
	public int field849 = -1;

	@ObfuscatedName("HARRRJHW.n")
	public int field850 = -1;

	@ObfuscatedName("HARRRJHW.o")
	public int field851 = 99;

	@ObfuscatedName("HARRRJHW.p")
	public int field852 = -1;

	@ObfuscatedName("HARRRJHW.q")
	public int field853 = -1;

	@ObfuscatedName("HARRRJHW.r")
	public int field854 = 2;

	@ObfuscatedName("HARRRJHW.c")
	public static int field839;

	@ObfuscatedName("HARRRJHW.e")
	public int field841;

	@ObfuscatedName("HARRRJHW.s")
	public int field855;

	@ObfuscatedName("HARRRJHW.f")
	public int[] field842;

	@ObfuscatedName("HARRRJHW.g")
	public int[] field843;

	@ObfuscatedName("HARRRJHW.h")
	public int[] field844;

	@ObfuscatedName("HARRRJHW.j")
	public int[] field846;

	@ObfuscatedName("HARRRJHW.d")
	public static HARRRJHW[] field840;

	@ObfuscatedName("HARRRJHW.a(LDYBMLHQM;Z)V")
	public static void method274(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("seq.dat", null));
		field839 = var1.method310();
		if (field840 == null) {
			field840 = new HARRRJHW[field839];
		}

		for (int var2 = 0; var2 < field839; var2++) {
			if (field840[var2] == null) {
				field840[var2] = new HARRRJHW();
			}

			field840[var2].method276(var1);
		}
	}

	@ObfuscatedName("HARRRJHW.a(II)I")
	public int method275(int arg0) {
		int var2 = field844[arg0];
		if (var2 == 0) {
			BWSGQYNU var3 = BWSGQYNU.method15(field842[arg0]);
			if (var3 != null) {
				var2 = field844[arg0] = var3.field36;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("HARRRJHW.a(ILINLHDAGO;)V")
	public void method276(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				if (field841 == 0) {
					field841 = 1;
					field842 = new int[1];
					field842[0] = -1;
					field843 = new int[1];
					field843[0] = -1;
					field844 = new int[1];
					field844[0] = -1;
				}

				if (field852 == -1) {
					if (field846 == null) {
						field852 = 0;
					} else {
						field852 = 2;
					}
				}

				if (field853 == -1) {
					if (field846 != null) {
						field853 = 2;
						return;
					}

					field853 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field841 = arg0.method308();
				field842 = new int[field841];
				field843 = new int[field841];
				field844 = new int[field841];
				for (int var3 = 0; var3 < field841; var3++) {
					field842[var3] = arg0.method310();
					field843[var3] = arg0.method310();
					if (field843[var3] == 0xFFFF) {
						field843[var3] = -1;
					}

					field844[var3] = arg0.method310();
				}
			} else if (var2 == 2) {
				field845 = arg0.method310();
			} else if (var2 == 3) {
				int var4 = arg0.method308();
				field846 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field846[var5] = arg0.method308();
				}

				field846[var4] = 9999999;
			} else if (var2 == 4) {
				field847 = true;
			} else if (var2 == 5) {
				field848 = arg0.method308();
			} else if (var2 == 6) {
				field849 = arg0.method310();
			} else if (var2 == 7) {
				field850 = arg0.method310();
			} else if (var2 == 8) {
				field851 = arg0.method308();
			} else if (var2 == 9) {
				field852 = arg0.method308();
			} else if (var2 == 10) {
				field853 = arg0.method308();
			} else if (var2 == 11) {
				field854 = arg0.method308();
			} else if (var2 == 12) {
				field855 = arg0.method313();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
