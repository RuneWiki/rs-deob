package deob;

@ObfuscatedName("GMRGYXFL")
public class GMRGYXFL {

	@ObfuscatedName("GMRGYXFL.i")
	public int field725 = -1;

	@ObfuscatedName("GMRGYXFL.k")
	public boolean field727 = false;

	@ObfuscatedName("GMRGYXFL.l")
	public int field728 = 5;

	@ObfuscatedName("GMRGYXFL.m")
	public int field729 = -1;

	@ObfuscatedName("GMRGYXFL.n")
	public int field730 = -1;

	@ObfuscatedName("GMRGYXFL.o")
	public int field731 = 99;

	@ObfuscatedName("GMRGYXFL.p")
	public int field732 = -1;

	@ObfuscatedName("GMRGYXFL.q")
	public int field733 = -1;

	@ObfuscatedName("GMRGYXFL.r")
	public int field734 = 2;

	@ObfuscatedName("GMRGYXFL.c")
	public static int field719;

	@ObfuscatedName("GMRGYXFL.e")
	public int field721;

	@ObfuscatedName("GMRGYXFL.s")
	public int field735;

	@ObfuscatedName("GMRGYXFL.f")
	public int[] field722;

	@ObfuscatedName("GMRGYXFL.g")
	public int[] field723;

	@ObfuscatedName("GMRGYXFL.h")
	public int[] field724;

	@ObfuscatedName("GMRGYXFL.j")
	public int[] field726;

	@ObfuscatedName("GMRGYXFL.d")
	public static GMRGYXFL[] field720;

	@ObfuscatedName("GMRGYXFL.a(ILQKFGLETG;)V")
	public static void method276(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("seq.dat", null));
		field719 = var1.method536();
		if (field720 == null) {
			field720 = new GMRGYXFL[field719];
		}

		for (int var2 = 0; var2 < field719; var2++) {
			if (field720[var2] == null) {
				field720[var2] = new GMRGYXFL();
			}

			field720[var2].method278(var1);
		}
	}

	@ObfuscatedName("GMRGYXFL.a(BI)I")
	public int method277(int arg0) {
		int var2 = field724[arg0];
		if (var2 == 0) {
			RYVJCVCB var3 = RYVJCVCB.method427(field722[arg0]);
			if (var3 != null) {
				var2 = field724[arg0] = var3.field1159;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("GMRGYXFL.a(BLXJCNBMKS;)V")
	public void method278(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				if (field721 == 0) {
					field721 = 1;
					field722 = new int[1];
					field722[0] = -1;
					field723 = new int[1];
					field723[0] = -1;
					field724 = new int[1];
					field724[0] = -1;
				}

				if (field732 == -1) {
					if (field726 == null) {
						field732 = 0;
					} else {
						field732 = 2;
					}
				}

				if (field733 == -1) {
					if (field726 != null) {
						field733 = 2;
						return;
					}

					field733 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field721 = arg0.method534();
				field722 = new int[field721];
				field723 = new int[field721];
				field724 = new int[field721];
				for (int var3 = 0; var3 < field721; var3++) {
					field722[var3] = arg0.method536();
					field723[var3] = arg0.method536();
					if (field723[var3] == 0xFFFF) {
						field723[var3] = -1;
					}

					field724[var3] = arg0.method536();
				}
			} else if (var2 == 2) {
				field725 = arg0.method536();
			} else if (var2 == 3) {
				int var4 = arg0.method534();
				field726 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field726[var5] = arg0.method534();
				}

				field726[var4] = 9999999;
			} else if (var2 == 4) {
				field727 = true;
			} else if (var2 == 5) {
				field728 = arg0.method534();
			} else if (var2 == 6) {
				field729 = arg0.method536();
			} else if (var2 == 7) {
				field730 = arg0.method536();
			} else if (var2 == 8) {
				field731 = arg0.method534();
			} else if (var2 == 9) {
				field732 = arg0.method534();
			} else if (var2 == 10) {
				field733 = arg0.method534();
			} else if (var2 == 11) {
				field734 = arg0.method534();
			} else if (var2 == 12) {
				field735 = arg0.method539();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
