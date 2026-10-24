package deob;

@ObfuscatedName("BKDXLPEF")
public class BKDXLPEF {

	@ObfuscatedName("BKDXLPEF.g")
	public int field80 = -1;

	@ObfuscatedName("BKDXLPEF.i")
	public boolean field82 = false;

	@ObfuscatedName("BKDXLPEF.j")
	public int field83 = 5;

	@ObfuscatedName("BKDXLPEF.k")
	public int field84 = -1;

	@ObfuscatedName("BKDXLPEF.l")
	public int field85 = -1;

	@ObfuscatedName("BKDXLPEF.m")
	public int field86 = 99;

	@ObfuscatedName("BKDXLPEF.n")
	public int field87 = -1;

	@ObfuscatedName("BKDXLPEF.o")
	public int field88 = -1;

	@ObfuscatedName("BKDXLPEF.p")
	public int field89 = 2;

	@ObfuscatedName("BKDXLPEF.a")
	public static int field74;

	@ObfuscatedName("BKDXLPEF.c")
	public int field76;

	@ObfuscatedName("BKDXLPEF.q")
	public int field90;

	@ObfuscatedName("BKDXLPEF.d")
	public int[] field77;

	@ObfuscatedName("BKDXLPEF.e")
	public int[] field78;

	@ObfuscatedName("BKDXLPEF.f")
	public int[] field79;

	@ObfuscatedName("BKDXLPEF.h")
	public int[] field81;

	@ObfuscatedName("BKDXLPEF.b")
	public static BKDXLPEF[] field75;

	@ObfuscatedName("BKDXLPEF.a(BLXOJZVVDK;)V")
	public static void method11(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("seq.dat", null));
		field74 = var1.method342();
		if (field75 == null) {
			field75 = new BKDXLPEF[field74];
		}

		for (int var2 = 0; var2 < field74; var2++) {
			if (field75[var2] == null) {
				field75[var2] = new BKDXLPEF();
			}

			field75[var2].method13(var1);
		}
	}

	@ObfuscatedName("BKDXLPEF.a(II)I")
	public int method12(int arg0) {
		int var2 = field79[arg0];
		if (var2 == 0) {
			NFWEZFJY var3 = NFWEZFJY.method301(field77[arg0]);
			if (var3 != null) {
				var2 = field79[arg0] = var3.field1037;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("BKDXLPEF.a(LPQBRPYKE;Z)V")
	public void method13(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				if (field76 == 0) {
					field76 = 1;
					field77 = new int[1];
					field77[0] = -1;
					field78 = new int[1];
					field78[0] = -1;
					field79 = new int[1];
					field79[0] = -1;
				}

				if (field87 == -1) {
					if (field81 == null) {
						field87 = 0;
					} else {
						field87 = 2;
					}
				}

				if (field88 == -1) {
					if (field81 != null) {
						field88 = 2;
						return;
					}

					field88 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field76 = arg0.method340();
				field77 = new int[field76];
				field78 = new int[field76];
				field79 = new int[field76];
				for (int var3 = 0; var3 < field76; var3++) {
					field77[var3] = arg0.method342();
					field78[var3] = arg0.method342();
					if (field78[var3] == 0xFFFF) {
						field78[var3] = -1;
					}

					field79[var3] = arg0.method342();
				}
			} else if (var2 == 2) {
				field80 = arg0.method342();
			} else if (var2 == 3) {
				int var4 = arg0.method340();
				field81 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field81[var5] = arg0.method340();
				}

				field81[var4] = 9999999;
			} else if (var2 == 4) {
				field82 = true;
			} else if (var2 == 5) {
				field83 = arg0.method340();
			} else if (var2 == 6) {
				field84 = arg0.method342();
			} else if (var2 == 7) {
				field85 = arg0.method342();
			} else if (var2 == 8) {
				field86 = arg0.method340();
			} else if (var2 == 9) {
				field87 = arg0.method340();
			} else if (var2 == 10) {
				field88 = arg0.method340();
			} else if (var2 == 11) {
				field89 = arg0.method340();
			} else if (var2 == 12) {
				field90 = arg0.method345();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
