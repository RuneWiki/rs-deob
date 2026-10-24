package deob;

@ObfuscatedName("EJHGNUGE")
public class EJHGNUGE {

	@ObfuscatedName("EJHGNUGE.h")
	public int field609 = -1;

	@ObfuscatedName("EJHGNUGE.j")
	public boolean field611 = false;

	@ObfuscatedName("EJHGNUGE.k")
	public int field612 = 5;

	@ObfuscatedName("EJHGNUGE.l")
	public int field613 = -1;

	@ObfuscatedName("EJHGNUGE.m")
	public int field614 = -1;

	@ObfuscatedName("EJHGNUGE.n")
	public int field615 = 99;

	@ObfuscatedName("EJHGNUGE.o")
	public int field616 = -1;

	@ObfuscatedName("EJHGNUGE.p")
	public int field617 = -1;

	@ObfuscatedName("EJHGNUGE.q")
	public int field618 = 2;

	@ObfuscatedName("EJHGNUGE.b")
	public static int field603;

	@ObfuscatedName("EJHGNUGE.d")
	public int field605;

	@ObfuscatedName("EJHGNUGE.r")
	public int field619;

	@ObfuscatedName("EJHGNUGE.e")
	public int[] field606;

	@ObfuscatedName("EJHGNUGE.f")
	public int[] field607;

	@ObfuscatedName("EJHGNUGE.g")
	public int[] field608;

	@ObfuscatedName("EJHGNUGE.i")
	public int[] field610;

	@ObfuscatedName("EJHGNUGE.c")
	public static EJHGNUGE[] field604;

	@ObfuscatedName("EJHGNUGE.a(ILSYUGXMZF;)V")
	public static void method240(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("seq.dat", null));
		field603 = var1.method351();
		if (field604 == null) {
			field604 = new EJHGNUGE[field603];
		}

		for (int var2 = 0; var2 < field603; var2++) {
			if (field604[var2] == null) {
				field604[var2] = new EJHGNUGE();
			}

			field604[var2].method242(var1);
		}
	}

	@ObfuscatedName("EJHGNUGE.a(ZI)I")
	public int method241(int arg0) {
		int var2 = field608[arg0];
		if (var2 == 0) {
			QWCFKPFT var3 = QWCFKPFT.method503(field606[arg0]);
			if (var3 != null) {
				var2 = field608[arg0] = var3.field1126;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("EJHGNUGE.a(LKHOMSBHW;I)V")
	public void method242(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				if (field605 == 0) {
					field605 = 1;
					field606 = new int[1];
					field606[0] = -1;
					field607 = new int[1];
					field607[0] = -1;
					field608 = new int[1];
					field608[0] = -1;
				}

				if (field616 == -1) {
					if (field610 == null) {
						field616 = 0;
					} else {
						field616 = 2;
					}
				}

				if (field617 == -1) {
					if (field610 != null) {
						field617 = 2;
						return;
					}

					field617 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field605 = arg0.method349();
				field606 = new int[field605];
				field607 = new int[field605];
				field608 = new int[field605];
				for (int var3 = 0; var3 < field605; var3++) {
					field606[var3] = arg0.method351();
					field607[var3] = arg0.method351();
					if (field607[var3] == 0xFFFF) {
						field607[var3] = -1;
					}

					field608[var3] = arg0.method351();
				}
			} else if (var2 == 2) {
				field609 = arg0.method351();
			} else if (var2 == 3) {
				int var4 = arg0.method349();
				field610 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field610[var5] = arg0.method349();
				}

				field610[var4] = 9999999;
			} else if (var2 == 4) {
				field611 = true;
			} else if (var2 == 5) {
				field612 = arg0.method349();
			} else if (var2 == 6) {
				field613 = arg0.method351();
			} else if (var2 == 7) {
				field614 = arg0.method351();
			} else if (var2 == 8) {
				field615 = arg0.method349();
			} else if (var2 == 9) {
				field616 = arg0.method349();
			} else if (var2 == 10) {
				field617 = arg0.method349();
			} else if (var2 == 11) {
				field618 = arg0.method349();
			} else if (var2 == 12) {
				field619 = arg0.method354();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
