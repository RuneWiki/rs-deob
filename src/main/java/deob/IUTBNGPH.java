package deob;

@ObfuscatedName("IUTBNGPH")
public class IUTBNGPH {

	@ObfuscatedName("IUTBNGPH.j")
	public int field687 = -1;

	@ObfuscatedName("IUTBNGPH.l")
	public boolean field689 = false;

	@ObfuscatedName("IUTBNGPH.m")
	public int field690 = 5;

	@ObfuscatedName("IUTBNGPH.n")
	public int field691 = -1;

	@ObfuscatedName("IUTBNGPH.o")
	public int field692 = -1;

	@ObfuscatedName("IUTBNGPH.p")
	public int field693 = 99;

	@ObfuscatedName("IUTBNGPH.q")
	public int field694 = -1;

	@ObfuscatedName("IUTBNGPH.r")
	public int field695 = -1;

	@ObfuscatedName("IUTBNGPH.s")
	public int field696 = 2;

	@ObfuscatedName("IUTBNGPH.d")
	public static int field681;

	@ObfuscatedName("IUTBNGPH.f")
	public int field683;

	@ObfuscatedName("IUTBNGPH.t")
	public int field697;

	@ObfuscatedName("IUTBNGPH.g")
	public int[] field684;

	@ObfuscatedName("IUTBNGPH.h")
	public int[] field685;

	@ObfuscatedName("IUTBNGPH.i")
	public int[] field686;

	@ObfuscatedName("IUTBNGPH.k")
	public int[] field688;

	@ObfuscatedName("IUTBNGPH.e")
	public static IUTBNGPH[] field682;

	@ObfuscatedName("IUTBNGPH.a(LVSUYIIVA;I)V")
	public static void method321(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("seq.dat", null));
		field681 = var1.method32();
		if (field682 == null) {
			field682 = new IUTBNGPH[field681];
		}

		for (int var2 = 0; var2 < field681; var2++) {
			if (field682[var2] == null) {
				field682[var2] = new IUTBNGPH();
			}

			field682[var2].method323(var1);
		}
	}

	@ObfuscatedName("IUTBNGPH.a(BI)I")
	public int method322(int arg0) {
		int var2 = field686[arg0];
		if (var2 == 0) {
			CANZHIOT var3 = CANZHIOT.method16(field684[arg0]);
			if (var3 != null) {
				var2 = field686[arg0] = var3.field35;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("IUTBNGPH.a(LCFARFRSG;I)V")
	public void method323(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				if (field683 == 0) {
					field683 = 1;
					field684 = new int[1];
					field684[0] = -1;
					field685 = new int[1];
					field685[0] = -1;
					field686 = new int[1];
					field686[0] = -1;
				}

				if (field694 == -1) {
					if (field688 == null) {
						field694 = 0;
					} else {
						field694 = 2;
					}
				}

				if (field695 == -1) {
					if (field688 != null) {
						field695 = 2;
						return;
					}

					field695 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field683 = arg0.method30();
				field684 = new int[field683];
				field685 = new int[field683];
				field686 = new int[field683];
				for (int var3 = 0; var3 < field683; var3++) {
					field684[var3] = arg0.method32();
					field685[var3] = arg0.method32();
					if (field685[var3] == 0xFFFF) {
						field685[var3] = -1;
					}

					field686[var3] = arg0.method32();
				}
			} else if (var2 == 2) {
				field687 = arg0.method32();
			} else if (var2 == 3) {
				int var4 = arg0.method30();
				field688 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field688[var5] = arg0.method30();
				}

				field688[var4] = 9999999;
			} else if (var2 == 4) {
				field689 = true;
			} else if (var2 == 5) {
				field690 = arg0.method30();
			} else if (var2 == 6) {
				field691 = arg0.method32();
			} else if (var2 == 7) {
				field692 = arg0.method32();
			} else if (var2 == 8) {
				field693 = arg0.method30();
			} else if (var2 == 9) {
				field694 = arg0.method30();
			} else if (var2 == 10) {
				field695 = arg0.method30();
			} else if (var2 == 11) {
				field696 = arg0.method30();
			} else if (var2 == 12) {
				field697 = arg0.method35();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
