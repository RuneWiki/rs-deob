package deob;

@ObfuscatedName("HZCWGKOF")
public class HZCWGKOF {

	@ObfuscatedName("HZCWGKOF.h")
	public int field717 = -1;

	@ObfuscatedName("HZCWGKOF.j")
	public boolean field719 = false;

	@ObfuscatedName("HZCWGKOF.k")
	public int field720 = 5;

	@ObfuscatedName("HZCWGKOF.l")
	public int field721 = -1;

	@ObfuscatedName("HZCWGKOF.m")
	public int field722 = -1;

	@ObfuscatedName("HZCWGKOF.n")
	public int field723 = 99;

	@ObfuscatedName("HZCWGKOF.o")
	public int field724 = -1;

	@ObfuscatedName("HZCWGKOF.p")
	public int field725 = -1;

	@ObfuscatedName("HZCWGKOF.q")
	public int field726 = 2;

	@ObfuscatedName("HZCWGKOF.b")
	public static int field711;

	@ObfuscatedName("HZCWGKOF.d")
	public int field713;

	@ObfuscatedName("HZCWGKOF.r")
	public int field727;

	@ObfuscatedName("HZCWGKOF.e")
	public int[] field714;

	@ObfuscatedName("HZCWGKOF.f")
	public int[] field715;

	@ObfuscatedName("HZCWGKOF.g")
	public int[] field716;

	@ObfuscatedName("HZCWGKOF.i")
	public int[] field718;

	@ObfuscatedName("HZCWGKOF.c")
	public static HZCWGKOF[] field712;

	@ObfuscatedName("HZCWGKOF.a(ZLXMRRKSSB;)V")
	public static void method226(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("seq.dat", null));
		field711 = var1.method480();
		if (field712 == null) {
			field712 = new HZCWGKOF[field711];
		}

		for (int var2 = 0; var2 < field711; var2++) {
			if (field712[var2] == null) {
				field712[var2] = new HZCWGKOF();
			}

			field712[var2].method228(var1);
		}
	}

	@ObfuscatedName("HZCWGKOF.a(II)I")
	public int method227(int arg0) {
		int var2 = field716[arg0];
		if (var2 == 0) {
			SCIASJXX var3 = SCIASJXX.method400(field714[arg0]);
			if (var3 != null) {
				var2 = field716[arg0] = var3.field1109;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("HZCWGKOF.a(LXQPFGONL;I)V")
	public void method228(XQPFGONL arg0) {
		while (true) {
			int var2 = arg0.method478();
			if (var2 == 0) {
				if (field713 == 0) {
					field713 = 1;
					field714 = new int[1];
					field714[0] = -1;
					field715 = new int[1];
					field715[0] = -1;
					field716 = new int[1];
					field716[0] = -1;
				}

				if (field724 == -1) {
					if (field718 == null) {
						field724 = 0;
					} else {
						field724 = 2;
					}
				}

				if (field725 == -1) {
					if (field718 != null) {
						field725 = 2;
						return;
					}

					field725 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field713 = arg0.method478();
				field714 = new int[field713];
				field715 = new int[field713];
				field716 = new int[field713];
				for (int var3 = 0; var3 < field713; var3++) {
					field714[var3] = arg0.method480();
					field715[var3] = arg0.method480();
					if (field715[var3] == 0xFFFF) {
						field715[var3] = -1;
					}

					field716[var3] = arg0.method480();
				}
			} else if (var2 == 2) {
				field717 = arg0.method480();
			} else if (var2 == 3) {
				int var4 = arg0.method478();
				field718 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field718[var5] = arg0.method478();
				}

				field718[var4] = 9999999;
			} else if (var2 == 4) {
				field719 = true;
			} else if (var2 == 5) {
				field720 = arg0.method478();
			} else if (var2 == 6) {
				field721 = arg0.method480();
			} else if (var2 == 7) {
				field722 = arg0.method480();
			} else if (var2 == 8) {
				field723 = arg0.method478();
			} else if (var2 == 9) {
				field724 = arg0.method478();
			} else if (var2 == 10) {
				field725 = arg0.method478();
			} else if (var2 == 11) {
				field726 = arg0.method478();
			} else if (var2 == 12) {
				field727 = arg0.method483();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
