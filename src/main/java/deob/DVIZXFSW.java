package deob;

@ObfuscatedName("DVIZXFSW")
public class DVIZXFSW {

	@ObfuscatedName("DVIZXFSW.h")
	public int field641 = -1;

	@ObfuscatedName("DVIZXFSW.j")
	public boolean field643 = false;

	@ObfuscatedName("DVIZXFSW.k")
	public int field644 = 5;

	@ObfuscatedName("DVIZXFSW.l")
	public int field645 = -1;

	@ObfuscatedName("DVIZXFSW.m")
	public int field646 = -1;

	@ObfuscatedName("DVIZXFSW.n")
	public int field647 = 99;

	@ObfuscatedName("DVIZXFSW.o")
	public int field648 = -1;

	@ObfuscatedName("DVIZXFSW.p")
	public int field649 = -1;

	@ObfuscatedName("DVIZXFSW.q")
	public int field650 = 2;

	@ObfuscatedName("DVIZXFSW.b")
	public static int field635;

	@ObfuscatedName("DVIZXFSW.d")
	public int field637;

	@ObfuscatedName("DVIZXFSW.r")
	public int field651;

	@ObfuscatedName("DVIZXFSW.e")
	public int[] field638;

	@ObfuscatedName("DVIZXFSW.f")
	public int[] field639;

	@ObfuscatedName("DVIZXFSW.g")
	public int[] field640;

	@ObfuscatedName("DVIZXFSW.i")
	public int[] field642;

	@ObfuscatedName("DVIZXFSW.c")
	public static DVIZXFSW[] field636;

	@ObfuscatedName("DVIZXFSW.a(LHBJEXSJX;Z)V")
	public static void method206(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("seq.dat", null));
		field635 = var1.method241();
		if (field636 == null) {
			field636 = new DVIZXFSW[field635];
		}

		for (int var2 = 0; var2 < field635; var2++) {
			if (field636[var2] == null) {
				field636[var2] = new DVIZXFSW();
			}

			field636[var2].method208(var1);
		}
	}

	@ObfuscatedName("DVIZXFSW.a(BI)I")
	public int method207(int arg0) {
		int var2 = field640[arg0];
		if (var2 == 0) {
			MOOJSKCU var3 = MOOJSKCU.method394(field638[arg0]);
			if (var3 != null) {
				var2 = field640[arg0] = var3.field971;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("DVIZXFSW.a(BLEYMNCFMK;)V")
	public void method208(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				if (field637 == 0) {
					field637 = 1;
					field638 = new int[1];
					field638[0] = -1;
					field639 = new int[1];
					field639[0] = -1;
					field640 = new int[1];
					field640[0] = -1;
				}

				if (field648 == -1) {
					if (field642 == null) {
						field648 = 0;
					} else {
						field648 = 2;
					}
				}

				if (field649 == -1) {
					if (field642 != null) {
						field649 = 2;
						return;
					}

					field649 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field637 = arg0.method239();
				field638 = new int[field637];
				field639 = new int[field637];
				field640 = new int[field637];
				for (int var3 = 0; var3 < field637; var3++) {
					field638[var3] = arg0.method241();
					field639[var3] = arg0.method241();
					if (field639[var3] == 0xFFFF) {
						field639[var3] = -1;
					}

					field640[var3] = arg0.method241();
				}
			} else if (var2 == 2) {
				field641 = arg0.method241();
			} else if (var2 == 3) {
				int var4 = arg0.method239();
				field642 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field642[var5] = arg0.method239();
				}

				field642[var4] = 9999999;
			} else if (var2 == 4) {
				field643 = true;
			} else if (var2 == 5) {
				field644 = arg0.method239();
			} else if (var2 == 6) {
				field645 = arg0.method241();
			} else if (var2 == 7) {
				field646 = arg0.method241();
			} else if (var2 == 8) {
				field647 = arg0.method239();
			} else if (var2 == 9) {
				field648 = arg0.method239();
			} else if (var2 == 10) {
				field649 = arg0.method239();
			} else if (var2 == 11) {
				field650 = arg0.method239();
			} else if (var2 == 12) {
				field651 = arg0.method244();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
