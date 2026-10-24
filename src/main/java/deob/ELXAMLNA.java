package deob;

@ObfuscatedName("ELXAMLNA")
public final class ELXAMLNA {

	@ObfuscatedName("ELXAMLNA.z")
	public int field649 = -1;

	@ObfuscatedName("ELXAMLNA.B")
	public String field650 = "null";

	@ObfuscatedName("ELXAMLNA.q")
	public static YITKGHWB field640 = new YITKGHWB(40);

	@ObfuscatedName("ELXAMLNA.O")
	public static YITKGHWB field663 = new YITKGHWB(500);

	@ObfuscatedName("ELXAMLNA.Q")
	public static FLXAIVEA[] field665 = new FLXAIVEA[4];

	@ObfuscatedName("ELXAMLNA.w")
	public byte field646;

	@ObfuscatedName("ELXAMLNA.K")
	public byte field659;

	@ObfuscatedName("ELXAMLNA.a")
	public int field627;

	@ObfuscatedName("ELXAMLNA.c")
	public int field628;

	@ObfuscatedName("ELXAMLNA.f")
	public int field631;

	@ObfuscatedName("ELXAMLNA.g")
	public int field632;

	@ObfuscatedName("ELXAMLNA.k")
	public int field634;

	@ObfuscatedName("ELXAMLNA.m")
	public int field636;

	@ObfuscatedName("ELXAMLNA.o")
	public static int field638;

	@ObfuscatedName("ELXAMLNA.p")
	public int field639;

	@ObfuscatedName("ELXAMLNA.s")
	public int field642;

	@ObfuscatedName("ELXAMLNA.t")
	public int field643;

	@ObfuscatedName("ELXAMLNA.u")
	public int field644;

	@ObfuscatedName("ELXAMLNA.x")
	public int field647;

	@ObfuscatedName("ELXAMLNA.E")
	public int field653;

	@ObfuscatedName("ELXAMLNA.G")
	public int field655;

	@ObfuscatedName("ELXAMLNA.I")
	public static int field657;

	@ObfuscatedName("ELXAMLNA.L")
	public int field660;

	@ObfuscatedName("ELXAMLNA.M")
	public int field661;

	@ObfuscatedName("ELXAMLNA.S")
	public int field667;

	@ObfuscatedName("ELXAMLNA.T")
	public static PQBRPYKE field668;

	@ObfuscatedName("ELXAMLNA.D")
	public static client field652;

	@ObfuscatedName("ELXAMLNA.d")
	public boolean field629;

	@ObfuscatedName("ELXAMLNA.e")
	public boolean field630;

	@ObfuscatedName("ELXAMLNA.l")
	public boolean field635;

	@ObfuscatedName("ELXAMLNA.n")
	public boolean field637;

	@ObfuscatedName("ELXAMLNA.r")
	public boolean field641;

	@ObfuscatedName("ELXAMLNA.C")
	public boolean field651;

	@ObfuscatedName("ELXAMLNA.H")
	public boolean field656;

	@ObfuscatedName("ELXAMLNA.J")
	public boolean field658;

	@ObfuscatedName("ELXAMLNA.R")
	public boolean field666;

	@ObfuscatedName("ELXAMLNA.V")
	public static boolean field670;

	@ObfuscatedName("ELXAMLNA.X")
	public boolean field672;

	@ObfuscatedName("ELXAMLNA.v")
	public byte[] field645;

	@ObfuscatedName("ELXAMLNA.h")
	public static int[] field633;

	@ObfuscatedName("ELXAMLNA.F")
	public int[] field654;

	@ObfuscatedName("ELXAMLNA.N")
	public int[] field662;

	@ObfuscatedName("ELXAMLNA.P")
	public int[] field664;

	@ObfuscatedName("ELXAMLNA.W")
	public int[] field671;

	@ObfuscatedName("ELXAMLNA.Y")
	public int[] field673;

	@ObfuscatedName("ELXAMLNA.y")
	public static ELXAMLNA[] field648;

	@ObfuscatedName("ELXAMLNA.U")
	public String[] field669;

	@ObfuscatedName("ELXAMLNA.a(Z)V")
	public static final void method191() {
		field663 = null;
		field640 = null;
		field633 = null;
		field648 = null;
		field668 = null;
	}

	@ObfuscatedName("ELXAMLNA.a(ILQUPTMIEH;)V")
	public final void method192(QUPTMIEH arg0) {
		if (field671 != null) {
			for (int var2 = 0; var2 < field671.length; var2++) {
				arg0.method383(field671[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("ELXAMLNA.a(LPQBRPYKE;Z)V")
	public final void method193(PQBRPYKE arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method340();
					if (var3 == 0) {
						if (var2 == -1) {
							field672 = false;
							if (field671 != null && (field673 == null || field673[0] == 10)) {
								field672 = true;
							}

							if (field669 != null) {
								field672 = true;
							}
						}

						if (field629) {
							field637 = false;
							field635 = false;
						}

						if (field643 == -1) {
							field643 = field637 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field650 = arg0.method347();
					} else if (var3 == 3) {
						field645 = arg0.method348();
					} else if (var3 == 5) {
						int var6 = arg0.method340();
						if (var6 > 0) {
							if (field671 == null || field670) {
								field673 = null;
								field671 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field671[var7] = arg0.method342();
								}
							} else {
								arg0.field1091 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field631 = arg0.method340();
					} else if (var3 == 15) {
						field661 = arg0.method340();
					} else if (var3 == 17) {
						field637 = false;
					} else if (var3 == 18) {
						field635 = false;
					} else if (var3 == 19) {
						var2 = arg0.method340();
						if (var2 == 1) {
							field672 = true;
						}
					} else if (var3 == 21) {
						field658 = true;
					} else if (var3 == 22) {
						field651 = true;
					} else if (var3 == 23) {
						field641 = true;
					} else if (var3 == 24) {
						field636 = arg0.method342();
						if (field636 == 0xFFFF) {
							field636 = -1;
						}
					} else if (var3 == 28) {
						field639 = arg0.method340();
					} else if (var3 == 29) {
						field659 = arg0.method341();
					} else if (var3 == 39) {
						field646 = arg0.method341();
					} else if (var3 >= 30 && var3 < 39) {
						if (field669 == null) {
							field669 = new String[5];
						}

						field669[var3 - 30] = arg0.method347();
						if (field669[var3 - 30].equalsIgnoreCase("hidden")) {
							field669[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method340();
						field662 = new int[var8];
						field654 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field662[var9] = arg0.method342();
							field654[var9] = arg0.method342();
						}
					} else if (var3 == 60) {
						field627 = arg0.method342();
					} else if (var3 == 62) {
						field656 = true;
					} else if (var3 == 64) {
						field630 = false;
					} else if (var3 == 65) {
						field634 = arg0.method342();
					} else if (var3 == 66) {
						field642 = arg0.method342();
					} else if (var3 == 67) {
						field653 = arg0.method342();
					} else if (var3 == 68) {
						field628 = arg0.method342();
					} else if (var3 == 69) {
						field660 = arg0.method340();
					} else if (var3 == 70) {
						field644 = arg0.method343();
					} else if (var3 == 71) {
						field632 = arg0.method343();
					} else if (var3 == 72) {
						field655 = arg0.method343();
					} else if (var3 == 73) {
						field666 = true;
					} else if (var3 == 74) {
						field629 = true;
					} else if (var3 == 75) {
						field643 = arg0.method340();
					} else if (var3 == 77) {
						field667 = arg0.method342();
						if (field667 == 0xFFFF) {
							field667 = -1;
						}

						field647 = arg0.method342();
						if (field647 == 0xFFFF) {
							field647 = -1;
						}

						int var10 = arg0.method340();
						field664 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field664[var11] = arg0.method342();
							if (field664[var11] == 0xFFFF) {
								field664[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method340();
			} while (var4 <= 0);

			if (field671 == null || field670) {
				field673 = new int[var4];
				field671 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field671[var5] = arg0.method342();
					field673[var5] = arg0.method340();
				}
			} else {
				arg0.field1091 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("ELXAMLNA.a(LXOJZVVDK;)V")
	public static final void method194(XOJZVVDK arg0) {
		field668 = new PQBRPYKE(arg0.method560("loc.dat", null));
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("loc.idx", null));
		field657 = var1.method342();
		field633 = new int[field657];
		int var2 = 2;
		for (int var3 = 0; var3 < field657; var3++) {
			field633[var3] = var2;
			var2 += var1.method342();
		}

		field648 = new ELXAMLNA[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field648[var4] = new ELXAMLNA();
		}
	}

	@ObfuscatedName("ELXAMLNA.a(B)LELXAMLNA;")
	public final ELXAMLNA method195() {
		int var1 = -1;
		if (field667 != -1) {
			HGYXNEJH var2 = HGYXNEJH.field818[field667];
			int var3 = var2.field820;
			int var4 = var2.field821;
			int var5 = var2.field822;
			int var6 = client.field204[var5 - var4];
			var1 = field652.field356[var3] >> var4 & var6;
		} else if (field647 != -1) {
			var1 = field652.field356[field647];
		}

		if (var1 >= 0 && var1 < field664.length && field664[var1] != -1) {
			return method196(field664[var1]);
		}

		return null;
	}

	@ObfuscatedName("ELXAMLNA.a(I)LELXAMLNA;")
	public static final ELXAMLNA method196(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field648[var1].field649 == arg0) {
				return field648[var1];
			}
		}

		field638 = (field638 + 1) % 20;
		ELXAMLNA var2 = field648[field638];
		field668.field1091 = field633[arg0];
		var2.field649 = arg0;
		var2.method198();
		var2.method193(field668);
		return var2;
	}

	@ObfuscatedName("ELXAMLNA.a(IIZI)LFLXAIVEA;")
	public final FLXAIVEA method197(int arg0, int arg1, int arg2) {
		FLXAIVEA var4 = null;
		long var5;
		if (field673 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field649 << 6) + arg0);
			FLXAIVEA var7 = (FLXAIVEA) field640.method572(var5);
			if (var7 != null) {
				return var7;
			}

			if (field671 == null) {
				return null;
			}

			boolean var8 = field656 ^ arg0 > 3;
			int var9 = field671.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field671[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (FLXAIVEA) field663.method572(var11);
				if (var4 == null) {
					var4 = FLXAIVEA.method218(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method233();
					}

					field663.method573(var4, var11);
				}

				if (var9 > 1) {
					field665[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new FLXAIVEA(var9, field665);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field673.length; var13++) {
				if (field673[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field649 << 6) + (var12 << 3) + arg0);
			FLXAIVEA var14 = (FLXAIVEA) field640.method572(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field671[var12];
			boolean var16 = field656 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (FLXAIVEA) field663.method572(var15);
			if (var4 == null) {
				var4 = FLXAIVEA.method218(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method233();
				}

				field663.method573(var4, var15);
			}
		}

		boolean var17;
		if (field634 == 128 && field642 == 128 && field653 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field644 == 0 && field632 == 0 && field655 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		FLXAIVEA var19 = new FLXAIVEA(var4, NFWEZFJY.method302(arg1), field662 == null, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method225();
			var19.method226(arg1);
			var19.field716 = null;
			var19.field715 = null;
		}

		while (arg0-- > 0) {
			var19.method229();
		}

		if (field662 != null) {
			for (int var20 = 0; var20 < field662.length; var20++) {
				var19.method232(field662[var20], field654[var20]);
			}
		}

		if (var17) {
			var19.method234(field653, field634, field642);
		}

		if (var18) {
			var19.method231(field655, field632, field644);
		}

		var19.method235(field659 + 64, field646 * 5 + 768, -50, -10, -50, !field651);

		if (field643 == 1) {
			var19.field712 = var19.field770;
		}

		field640.method573(var19, var5);
		return var19;
	}

	@ObfuscatedName("ELXAMLNA.a()V")
	public final void method198() {
		field671 = null;
		field673 = null;
		field650 = "null";
		field645 = null;
		field662 = null;
		field654 = null;
		field631 = 1;
		field661 = 1;
		field637 = true;
		field635 = true;
		field672 = false;
		field658 = false;
		field651 = false;
		field641 = false;
		field636 = -1;
		field639 = 16;
		field659 = 0;
		field646 = 0;
		field669 = null;
		field627 = -1;
		field628 = -1;
		field656 = false;
		field630 = true;
		field634 = 128;
		field642 = 128;
		field653 = 128;
		field660 = 0;
		field644 = 0;
		field632 = 0;
		field655 = 0;
		field666 = false;
		field629 = false;
		field643 = -1;
		field667 = -1;
		field647 = -1;
		field664 = null;
	}

	@ObfuscatedName("ELXAMLNA.a(II)Z")
	public final boolean method199(int arg0) {
		if (field673 != null) {
			for (int var4 = 0; var4 < field673.length; var4++) {
				if (field673[var4] == arg0) {
					return FLXAIVEA.method219(field671[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field671 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field671.length; var3++) {
				var2 &= FLXAIVEA.method219(field671[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ELXAMLNA.b(I)Z")
	public final boolean method200() {
		if (field671 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field671.length; var2++) {
			var1 &= FLXAIVEA.method219(field671[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ELXAMLNA.a(IIIIIII)LFLXAIVEA;")
	public final FLXAIVEA method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		FLXAIVEA var8 = method197(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field658 || field651) {
			var8 = new FLXAIVEA(field658, field651, var8);
		}

		if (field658) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field685; var10++) {
				int var11 = var8.field686[var10];
				int var12 = var8.field688[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field687[var10] += var15 - var9;
			}

			var8.method223();
		}

		return var8;
	}
}
