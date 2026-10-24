package deob;

@ObfuscatedName("DOBKXCMM")
public final class DOBKXCMM {

	@ObfuscatedName("DOBKXCMM.b")
	public int field645 = -1;

	@ObfuscatedName("DOBKXCMM.f")
	public int field649 = 32;

	@ObfuscatedName("DOBKXCMM.g")
	public int field650 = -1;

	@ObfuscatedName("DOBKXCMM.h")
	public int field651 = -1;

	@ObfuscatedName("DOBKXCMM.i")
	public int field652 = -1;

	@ObfuscatedName("DOBKXCMM.j")
	public boolean field653 = true;

	@ObfuscatedName("DOBKXCMM.m")
	public int field656 = -1;

	@ObfuscatedName("DOBKXCMM.o")
	public long field658 = -1L;

	@ObfuscatedName("DOBKXCMM.p")
	public int field659 = -1;

	@ObfuscatedName("DOBKXCMM.q")
	public int field660 = -1;

	@ObfuscatedName("DOBKXCMM.u")
	public int field663 = 128;

	@ObfuscatedName("DOBKXCMM.y")
	public boolean field667 = false;

	@ObfuscatedName("DOBKXCMM.z")
	public int field668 = -1;

	@ObfuscatedName("DOBKXCMM.D")
	public int field671 = -1;

	@ObfuscatedName("DOBKXCMM.G")
	public int field674 = 128;

	@ObfuscatedName("DOBKXCMM.J")
	public int field677 = -1;

	@ObfuscatedName("DOBKXCMM.K")
	public int field678 = -1;

	@ObfuscatedName("DOBKXCMM.L")
	public int field679 = -1;

	@ObfuscatedName("DOBKXCMM.M")
	public byte field680 = 1;

	@ObfuscatedName("DOBKXCMM.x")
	public static QQBOAQZB field666 = new QQBOAQZB(30);

	@ObfuscatedName("DOBKXCMM.n")
	public int field657;

	@ObfuscatedName("DOBKXCMM.s")
	public int field661;

	@ObfuscatedName("DOBKXCMM.t")
	public static int field662;

	@ObfuscatedName("DOBKXCMM.E")
	public static int field672;

	@ObfuscatedName("DOBKXCMM.C")
	public static INLHDAGO field670;

	@ObfuscatedName("DOBKXCMM.H")
	public static client field675;

	@ObfuscatedName("DOBKXCMM.A")
	public String field669;

	@ObfuscatedName("DOBKXCMM.e")
	public byte[] field648;

	@ObfuscatedName("DOBKXCMM.c")
	public int[] field646;

	@ObfuscatedName("DOBKXCMM.d")
	public int[] field647;

	@ObfuscatedName("DOBKXCMM.l")
	public static int[] field655;

	@ObfuscatedName("DOBKXCMM.v")
	public int[] field664;

	@ObfuscatedName("DOBKXCMM.F")
	public int[] field673;

	@ObfuscatedName("DOBKXCMM.I")
	public int[] field676;

	@ObfuscatedName("DOBKXCMM.k")
	public static DOBKXCMM[] field654;

	@ObfuscatedName("DOBKXCMM.w")
	public String[] field665;

	@ObfuscatedName("DOBKXCMM.a(ILINLHDAGO;)V")
	public final void method235(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method308();
				field676 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field676[var4] = arg0.method310();
				}
			} else if (var2 == 2) {
				field669 = arg0.method315();
			} else if (var2 == 3) {
				field648 = arg0.method316();
			} else if (var2 == 12) {
				field680 = arg0.method309();
			} else if (var2 == 13) {
				field645 = arg0.method310();
			} else if (var2 == 14) {
				field678 = arg0.method310();
			} else if (var2 == 17) {
				field678 = arg0.method310();
				field679 = arg0.method310();
				field656 = arg0.method310();
				field671 = arg0.method310();
			} else if (var2 >= 30 && var2 < 40) {
				if (field665 == null) {
					field665 = new String[5];
				}

				field665[var2 - 30] = arg0.method315();
				if (field665[var2 - 30].equalsIgnoreCase("hidden")) {
					field665[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method308();
				field673 = new int[var5];
				field646 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field673[var6] = arg0.method310();
					field646[var6] = arg0.method310();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method308();
				field647 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field647[var8] = arg0.method310();
				}
			} else if (var2 == 90) {
				field677 = arg0.method310();
			} else if (var2 == 91) {
				field650 = arg0.method310();
			} else if (var2 == 92) {
				field651 = arg0.method310();
			} else if (var2 == 93) {
				field653 = false;
			} else if (var2 == 95) {
				field668 = arg0.method310();
			} else if (var2 == 97) {
				field663 = arg0.method310();
			} else if (var2 == 98) {
				field674 = arg0.method310();
			} else if (var2 == 99) {
				field667 = true;
			} else if (var2 == 100) {
				field657 = arg0.method309();
			} else if (var2 == 101) {
				field661 = arg0.method309() * 5;
			} else if (var2 == 102) {
				field660 = arg0.method310();
			} else if (var2 == 103) {
				field649 = arg0.method310();
			} else if (var2 == 106) {
				field652 = arg0.method310();
				if (field652 == 0xFFFF) {
					field652 = -1;
				}

				field659 = arg0.method310();
				if (field659 == 0xFFFF) {
					field659 = -1;
				}

				int var9 = arg0.method308();
				field664 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field664[var10] = arg0.method310();
					if (field664[var10] == 0xFFFF) {
						field664[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("DOBKXCMM.a(I)LDHUPIIUL;")
	public final DHUPIIUL method236() {
		if (field664 != null) {
			DOBKXCMM var1 = method240();
			if (var1 == null) {
				return null;
			}

			return var1.method236();
		} else if (field647 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field647.length; var3++) {
				if (!DHUPIIUL.method192(field647[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			DHUPIIUL[] var4 = new DHUPIIUL[field647.length];
			for (int var5 = 0; var5 < field647.length; var5++) {
				var4[var5] = DHUPIIUL.method191(field647[var5]);
			}

			DHUPIIUL var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new DHUPIIUL(var4, var4.length);
			}

			if (field673 != null) {
				for (int var7 = 0; var7 < field673.length; var7++) {
					var6.method205(field673[var7], field646[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("DOBKXCMM.a(I[III)LDHUPIIUL;")
	public final DHUPIIUL method237(int arg0, int[] arg1, int arg2) {
		if (field664 != null) {
			DOBKXCMM var4 = method240();
			if (var4 == null) {
				return null;
			}

			return var4.method237(arg0, arg1, arg2);
		}

		DHUPIIUL var5 = (DHUPIIUL) field666.method421(field658);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field676.length; var7++) {
				if (!DHUPIIUL.method192(field676[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			DHUPIIUL[] var8 = new DHUPIIUL[field676.length];
			for (int var9 = 0; var9 < field676.length; var9++) {
				var8[var9] = DHUPIIUL.method191(field676[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new DHUPIIUL(var8, var8.length);
			}

			if (field673 != null) {
				for (int var10 = 0; var10 < field673.length; var10++) {
					var5.method205(field673[var10], field646[var10]);
				}
			}

			var5.method198();
			var5.method208(field657 + 64, field661 + 850, -30, -50, -30, true);
			field666.method422(var5, field658);
		}

		DHUPIIUL var11 = DHUPIIUL.field539;
		var11.method193(var5, BWSGQYNU.method16(arg2) & BWSGQYNU.method16(arg0));

		if (arg2 != -1 && arg0 != -1) {
			var11.method200(arg1, arg2, arg0);
		} else if (arg2 != -1) {
			var11.method199(arg2);
		}

		if (field663 != 128 || field674 != 128) {
			var11.method207(field663, field674, field663);
		}

		var11.method195();
		var11.field576 = null;
		var11.field575 = null;

		if (field680 == 1) {
			var11.field577 = true;
		}

		return var11;
	}

	@ObfuscatedName("DOBKXCMM.a(LDYBMLHQM;)V")
	public static final void method238(DYBMLHQM arg0) {
		field670 = new INLHDAGO(arg0.method248("npc.dat", null));
		INLHDAGO var1 = new INLHDAGO(arg0.method248("npc.idx", null));
		field662 = var1.method310();
		field655 = new int[field662];
		int var2 = 2;
		for (int var3 = 0; var3 < field662; var3++) {
			field655[var3] = var2;
			var2 += var1.method310();
		}

		field654 = new DOBKXCMM[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field654[var4] = new DOBKXCMM();
		}
	}

	@ObfuscatedName("DOBKXCMM.b(I)LDOBKXCMM;")
	public static final DOBKXCMM method239(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field654[var1].field658) {
				return field654[var1];
			}
		}

		field672 = (field672 + 1) % 20;
		DOBKXCMM var2 = field654[field672] = new DOBKXCMM();
		field670.field969 = field655[arg0];
		var2.field658 = arg0;
		var2.method235(field670);
		return var2;
	}

	@ObfuscatedName("DOBKXCMM.c(I)LDOBKXCMM;")
	public final DOBKXCMM method240() {
		int var1 = -1;
		if (field652 != -1) {
			MWRUKLPF var2 = MWRUKLPF.field1119[field652];
			int var3 = var2.field1121;
			int var4 = var2.field1122;
			int var5 = var2.field1123;
			int var6 = client.field276[var5 - var4];
			var1 = field675.field313[var3] >> var4 & var6;
		} else if (field659 != -1) {
			var1 = field675.field313[field659];
		}

		if (var1 >= 0 && var1 < field664.length && field664[var1] != -1) {
			return method239(field664[var1]);
		}

		return null;
	}

	@ObfuscatedName("DOBKXCMM.a(Z)V")
	public static final void method241() {
		field666 = null;
		field655 = null;
		field654 = null;
		field670 = null;
	}
}
