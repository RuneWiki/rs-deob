package deob;

@ObfuscatedName("ISUBRNPG")
public class ISUBRNPG {

	@ObfuscatedName("ISUBRNPG.h")
	public int field791 = -1;

	@ObfuscatedName("ISUBRNPG.j")
	public boolean field793 = false;

	@ObfuscatedName("ISUBRNPG.k")
	public int field794 = 5;

	@ObfuscatedName("ISUBRNPG.l")
	public int field795 = -1;

	@ObfuscatedName("ISUBRNPG.m")
	public int field796 = -1;

	@ObfuscatedName("ISUBRNPG.n")
	public int field797 = 99;

	@ObfuscatedName("ISUBRNPG.o")
	public int field798 = -1;

	@ObfuscatedName("ISUBRNPG.p")
	public int field799 = -1;

	@ObfuscatedName("ISUBRNPG.q")
	public int field800 = 2;

	@ObfuscatedName("ISUBRNPG.b")
	public static int field785;

	@ObfuscatedName("ISUBRNPG.d")
	public int field787;

	@ObfuscatedName("ISUBRNPG.r")
	public int field801;

	@ObfuscatedName("ISUBRNPG.e")
	public int[] field788;

	@ObfuscatedName("ISUBRNPG.f")
	public int[] field789;

	@ObfuscatedName("ISUBRNPG.g")
	public int[] field790;

	@ObfuscatedName("ISUBRNPG.i")
	public int[] field792;

	@ObfuscatedName("ISUBRNPG.c")
	public static ISUBRNPG[] field786;

	@ObfuscatedName("ISUBRNPG.a(LLYZBHNJP;I)V")
	public static void method225(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("seq.dat", null));
		field785 = var1.method549();
		if (field786 == null) {
			field786 = new ISUBRNPG[field785];
		}

		for (int var2 = 0; var2 < field785; var2++) {
			if (field786[var2] == null) {
				field786[var2] = new ISUBRNPG();
			}

			field786[var2].method227(var1);
		}
	}

	@ObfuscatedName("ISUBRNPG.a(BI)I")
	public int method226(int arg0) {
		int var2 = field790[arg0];
		if (var2 == 0) {
			RKTGZGSS var3 = RKTGZGSS.method382(field788[arg0]);
			if (var3 != null) {
				var2 = field790[arg0] = var3.field1130;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("ISUBRNPG.a(LZOMNSJJM;B)V")
	public void method227(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				if (field787 == 0) {
					field787 = 1;
					field788 = new int[1];
					field788[0] = -1;
					field789 = new int[1];
					field789[0] = -1;
					field790 = new int[1];
					field790[0] = -1;
				}

				if (field798 == -1) {
					if (field792 == null) {
						field798 = 0;
					} else {
						field798 = 2;
					}
				}

				if (field799 == -1) {
					if (field792 != null) {
						field799 = 2;
						return;
					}

					field799 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field787 = arg0.method547();
				field788 = new int[field787];
				field789 = new int[field787];
				field790 = new int[field787];
				for (int var3 = 0; var3 < field787; var3++) {
					field788[var3] = arg0.method549();
					field789[var3] = arg0.method549();
					if (field789[var3] == 0xFFFF) {
						field789[var3] = -1;
					}

					field790[var3] = arg0.method549();
				}
			} else if (var2 == 2) {
				field791 = arg0.method549();
			} else if (var2 == 3) {
				int var4 = arg0.method547();
				field792 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field792[var5] = arg0.method547();
				}

				field792[var4] = 9999999;
			} else if (var2 == 4) {
				field793 = true;
			} else if (var2 == 5) {
				field794 = arg0.method547();
			} else if (var2 == 6) {
				field795 = arg0.method549();
			} else if (var2 == 7) {
				field796 = arg0.method549();
			} else if (var2 == 8) {
				field797 = arg0.method547();
			} else if (var2 == 9) {
				field798 = arg0.method547();
			} else if (var2 == 10) {
				field799 = arg0.method547();
			} else if (var2 == 11) {
				field800 = arg0.method547();
			} else if (var2 == 12) {
				field801 = arg0.method552();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
