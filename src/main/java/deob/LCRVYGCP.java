package deob;

@ObfuscatedName("LCRVYGCP")
public class LCRVYGCP {

	@ObfuscatedName("LCRVYGCP.h")
	public int field800 = -1;

	@ObfuscatedName("LCRVYGCP.j")
	public boolean field802 = false;

	@ObfuscatedName("LCRVYGCP.k")
	public int field803 = 5;

	@ObfuscatedName("LCRVYGCP.l")
	public int field804 = -1;

	@ObfuscatedName("LCRVYGCP.m")
	public int field805 = -1;

	@ObfuscatedName("LCRVYGCP.n")
	public int field806 = 99;

	@ObfuscatedName("LCRVYGCP.o")
	public int field807 = -1;

	@ObfuscatedName("LCRVYGCP.p")
	public int field808 = -1;

	@ObfuscatedName("LCRVYGCP.q")
	public int field809 = 2;

	@ObfuscatedName("LCRVYGCP.b")
	public static int field794;

	@ObfuscatedName("LCRVYGCP.d")
	public int field796;

	@ObfuscatedName("LCRVYGCP.r")
	public int field810;

	@ObfuscatedName("LCRVYGCP.e")
	public int[] field797;

	@ObfuscatedName("LCRVYGCP.f")
	public int[] field798;

	@ObfuscatedName("LCRVYGCP.g")
	public int[] field799;

	@ObfuscatedName("LCRVYGCP.i")
	public int[] field801;

	@ObfuscatedName("LCRVYGCP.c")
	public static LCRVYGCP[] field795;

	@ObfuscatedName("LCRVYGCP.a(ILHRXSNEYZ;)V")
	public static void method360(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("seq.dat", null));
		field794 = var1.method308();
		if (field795 == null) {
			field795 = new LCRVYGCP[field794];
		}

		for (int var2 = 0; var2 < field794; var2++) {
			if (field795[var2] == null) {
				field795[var2] = new LCRVYGCP();
			}

			field795[var2].method362(var1);
		}
	}

	@ObfuscatedName("LCRVYGCP.a(II)I")
	public int method361(int arg0) {
		int var2 = field799[arg0];
		if (var2 == 0) {
			EMBMBPSC var3 = EMBMBPSC.method228(field797[arg0]);
			if (var3 != null) {
				var2 = field799[arg0] = var3.field583;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("LCRVYGCP.a(LJHKSAGUC;I)V")
	public void method362(JHKSAGUC arg0) {
		while (true) {
			int var2 = arg0.method306();
			if (var2 == 0) {
				if (field796 == 0) {
					field796 = 1;
					field797 = new int[1];
					field797[0] = -1;
					field798 = new int[1];
					field798[0] = -1;
					field799 = new int[1];
					field799[0] = -1;
				}

				if (field807 == -1) {
					if (field801 == null) {
						field807 = 0;
					} else {
						field807 = 2;
					}
				}

				if (field808 == -1) {
					if (field801 != null) {
						field808 = 2;
						return;
					}

					field808 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field796 = arg0.method306();
				field797 = new int[field796];
				field798 = new int[field796];
				field799 = new int[field796];
				for (int var3 = 0; var3 < field796; var3++) {
					field797[var3] = arg0.method308();
					field798[var3] = arg0.method308();
					if (field798[var3] == 0xFFFF) {
						field798[var3] = -1;
					}

					field799[var3] = arg0.method308();
				}
			} else if (var2 == 2) {
				field800 = arg0.method308();
			} else if (var2 == 3) {
				int var4 = arg0.method306();
				field801 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field801[var5] = arg0.method306();
				}

				field801[var4] = 9999999;
			} else if (var2 == 4) {
				field802 = true;
			} else if (var2 == 5) {
				field803 = arg0.method306();
			} else if (var2 == 6) {
				field804 = arg0.method308();
			} else if (var2 == 7) {
				field805 = arg0.method308();
			} else if (var2 == 8) {
				field806 = arg0.method306();
			} else if (var2 == 9) {
				field807 = arg0.method306();
			} else if (var2 == 10) {
				field808 = arg0.method306();
			} else if (var2 == 11) {
				field809 = arg0.method306();
			} else if (var2 == 12) {
				field810 = arg0.method311();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
