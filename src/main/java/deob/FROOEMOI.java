package deob;

@ObfuscatedName("FROOEMOI")
public final class FROOEMOI {

	@ObfuscatedName("FROOEMOI.G")
	public int field646 = -1;

	@ObfuscatedName("FROOEMOI.a")
	public static DSCQIAPU field615 = new DSCQIAPU(100);

	@ObfuscatedName("FROOEMOI.n")
	public static DSCQIAPU field628 = new DSCQIAPU(50);

	@ObfuscatedName("FROOEMOI.r")
	public static boolean field631 = true;

	@ObfuscatedName("FROOEMOI.u")
	public byte field634;

	@ObfuscatedName("FROOEMOI.B")
	public byte field641;

	@ObfuscatedName("FROOEMOI.e")
	public int field619;

	@ObfuscatedName("FROOEMOI.f")
	public int field620;

	@ObfuscatedName("FROOEMOI.g")
	public int field621;

	@ObfuscatedName("FROOEMOI.h")
	public int field622;

	@ObfuscatedName("FROOEMOI.i")
	public int field623;

	@ObfuscatedName("FROOEMOI.j")
	public static int field624;

	@ObfuscatedName("FROOEMOI.k")
	public int field625;

	@ObfuscatedName("FROOEMOI.m")
	public int field627;

	@ObfuscatedName("FROOEMOI.q")
	public int field630;

	@ObfuscatedName("FROOEMOI.t")
	public int field633;

	@ObfuscatedName("FROOEMOI.v")
	public int field635;

	@ObfuscatedName("FROOEMOI.w")
	public int field636;

	@ObfuscatedName("FROOEMOI.x")
	public int field637;

	@ObfuscatedName("FROOEMOI.z")
	public int field639;

	@ObfuscatedName("FROOEMOI.C")
	public int field642;

	@ObfuscatedName("FROOEMOI.D")
	public int field643;

	@ObfuscatedName("FROOEMOI.E")
	public int field644;

	@ObfuscatedName("FROOEMOI.F")
	public int field645;

	@ObfuscatedName("FROOEMOI.H")
	public int field647;

	@ObfuscatedName("FROOEMOI.I")
	public int field648;

	@ObfuscatedName("FROOEMOI.K")
	public int field650;

	@ObfuscatedName("FROOEMOI.L")
	public static int field651;

	@ObfuscatedName("FROOEMOI.M")
	public int field652;

	@ObfuscatedName("FROOEMOI.P")
	public int field654;

	@ObfuscatedName("FROOEMOI.R")
	public int field656;

	@ObfuscatedName("FROOEMOI.S")
	public int field657;

	@ObfuscatedName("FROOEMOI.U")
	public int field658;

	@ObfuscatedName("FROOEMOI.V")
	public int field659;

	@ObfuscatedName("FROOEMOI.X")
	public int field661;

	@ObfuscatedName("FROOEMOI.Y")
	public static WNCFPLWV field662;

	@ObfuscatedName("FROOEMOI.l")
	public String field626;

	@ObfuscatedName("FROOEMOI.c")
	public boolean field617;

	@ObfuscatedName("FROOEMOI.A")
	public boolean field640;

	@ObfuscatedName("FROOEMOI.W")
	public byte[] field660;

	@ObfuscatedName("FROOEMOI.b")
	public int[] field616;

	@ObfuscatedName("FROOEMOI.d")
	public int[] field618;

	@ObfuscatedName("FROOEMOI.s")
	public static int[] field632;

	@ObfuscatedName("FROOEMOI.N")
	public int[] field653;

	@ObfuscatedName("FROOEMOI.Q")
	public int[] field655;

	@ObfuscatedName("FROOEMOI.o")
	public static FROOEMOI[] field629;

	@ObfuscatedName("FROOEMOI.y")
	public String[] field638;

	@ObfuscatedName("FROOEMOI.J")
	public String[] field649;

	@ObfuscatedName("FROOEMOI.a(LRPFMUSNN;)V")
	public static final void method215(RPFMUSNN arg0) {
		field662 = new WNCFPLWV(arg0.method414("obj.dat", null));
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("obj.idx", null));
		field624 = var1.method504();
		field632 = new int[field624];
		int var2 = 2;
		for (int var3 = 0; var3 < field624; var3++) {
			field632[var3] = var2;
			var2 += var1.method504();
		}

		field629 = new FROOEMOI[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field629[var4] = new FROOEMOI();
		}
	}

	@ObfuscatedName("FROOEMOI.a(I)V")
	public static final void method216() {
		field628 = null;
		field615 = null;
		field632 = null;
		field629 = null;
		field662 = null;
	}

	@ObfuscatedName("FROOEMOI.b(I)V")
	public void method217() {
		FROOEMOI var1 = method218(field623);
		field636 = var1.field636;
		field633 = var1.field633;
		field639 = var1.field639;
		field648 = var1.field648;
		field652 = var1.field652;
		field642 = var1.field642;
		field644 = var1.field644;
		field616 = var1.field616;
		field618 = var1.field618;
		FROOEMOI var2 = method218(field627);
		field626 = var2.field626;
		field640 = var2.field640;
		field622 = var2.field622;
		String var3 = "a";
		char var4 = var2.field626.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field660 = ("Swap this note at any bank for " + var3 + " " + var2.field626 + ".").getBytes();
		field617 = true;
	}

	@ObfuscatedName("FROOEMOI.c(I)LFROOEMOI;")
	public static final FROOEMOI method218(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field629[var1].field646 == arg0) {
				return field629[var1];
			}
		}

		field651 = (field651 + 1) % 10;
		FROOEMOI var2 = field629[field651];
		field662.field1375 = field632[arg0];
		var2.field646 = arg0;
		var2.method220();
		var2.method226(field662);

		if (var2.field623 != -1) {
			var2.method217();
		}

		if (!field631 && var2.field640) {
			var2.field626 = "Members Object";
			var2.field660 = "Login to a members' server to use this object.".getBytes();
			var2.field638 = null;
			var2.field649 = null;
			var2.field658 = 0;
		}

		return var2;
	}

	@ObfuscatedName("FROOEMOI.a(II)LUNLYQRUD;")
	public final UNLYQRUD method219(int arg0) {
		int var2 = field619;
		int var3 = field621;
		if (arg0 == 1) {
			var2 = field647;
			var3 = field654;
		}

		if (var2 == -1) {
			return null;
		}

		UNLYQRUD var4 = UNLYQRUD.method442(var2);
		if (var3 != -1) {
			UNLYQRUD var5 = UNLYQRUD.method442(var3);
			UNLYQRUD[] var6 = new UNLYQRUD[] { var4, var5 };
			var4 = new UNLYQRUD(2, var6);
		}

		if (field616 != null) {
			for (int var7 = 0; var7 < field616.length; var7++) {
				var4.method456(field616[var7], field618[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("FROOEMOI.a()V")
	public final void method220() {
		field636 = 0;
		field626 = null;
		field660 = null;
		field616 = null;
		field618 = null;
		field633 = 2000;
		field639 = 0;
		field648 = 0;
		field652 = 0;
		field642 = 0;
		field644 = 0;
		field650 = -1;
		field617 = false;
		field622 = 1;
		field640 = false;
		field638 = null;
		field649 = null;
		field645 = -1;
		field625 = -1;
		field641 = 0;
		field637 = -1;
		field661 = -1;
		field634 = 0;
		field635 = -1;
		field657 = -1;
		field619 = -1;
		field621 = -1;
		field647 = -1;
		field654 = -1;
		field655 = null;
		field653 = null;
		field627 = -1;
		field623 = -1;
		field630 = 128;
		field659 = 128;
		field656 = 128;
		field620 = 0;
		field643 = 0;
		field658 = 0;
	}

	@ObfuscatedName("FROOEMOI.b(II)LUNLYQRUD;")
	public final UNLYQRUD method221(int arg0) {
		int var2 = field645;
		int var3 = field625;
		int var4 = field635;
		if (arg0 == 1) {
			var2 = field637;
			var3 = field661;
			var4 = field657;
		}

		if (var2 == -1) {
			return null;
		}

		UNLYQRUD var5 = UNLYQRUD.method442(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				UNLYQRUD var9 = UNLYQRUD.method442(var3);
				UNLYQRUD[] var10 = new UNLYQRUD[] { var5, var9 };
				var5 = new UNLYQRUD(2, var10);
			} else {
				UNLYQRUD var6 = UNLYQRUD.method442(var3);
				UNLYQRUD var7 = UNLYQRUD.method442(var4);
				UNLYQRUD[] var8 = new UNLYQRUD[] { var5, var6, var7 };
				var5 = new UNLYQRUD(3, var8);
			}
		}

		if (arg0 == 0 && field641 != 0) {
			var5.method455(field641, 0, 0);
		}

		if (arg0 == 1 && field634 != 0) {
			var5.method455(field634, 0, 0);
		}

		if (field616 != null) {
			for (int var11 = 0; var11 < field616.length; var11++) {
				var5.method456(field616[var11], field618[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("FROOEMOI.d(I)LUNLYQRUD;")
	public final UNLYQRUD method222(int arg0) {
		if (field655 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field653[var3] && field653[var3] != 0) {
					var2 = field655[var3];
				}
			}

			if (var2 != -1) {
				return method218(var2).method222(1);
			}
		}

		UNLYQRUD var4 = (UNLYQRUD) field628.method179(field646);
		if (var4 != null) {
			return var4;
		}

		UNLYQRUD var5 = UNLYQRUD.method442(field636);
		if (var5 == null) {
			return null;
		}

		if (field630 != 128 || field659 != 128 || field656 != 128) {
			var5.method458(field630, field659, field656);
		}

		if (field616 != null) {
			for (int var6 = 0; var6 < field616.length; var6++) {
				var5.method456(field616[var6], field618[var6]);
			}
		}

		var5.method459(field620 + 64, field643 + 768, -50, -10, -50, true);
		var5.field1300 = true;
		field628.method180(var5, field646);
		return var5;
	}

	@ObfuscatedName("FROOEMOI.c(II)LUNLYQRUD;")
	public final UNLYQRUD method223(int arg0) {
		if (field655 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field653[var3] && field653[var3] != 0) {
					var2 = field655[var3];
				}
			}

			if (var2 != -1) {
				return method218(var2).method223(1);
			}
		}

		UNLYQRUD var4 = UNLYQRUD.method442(field636);
		if (var4 == null) {
			return null;
		}

		if (field616 != null) {
			for (int var5 = 0; var5 < field616.length; var5++) {
				var4.method456(field616[var5], field618[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("FROOEMOI.a(IIII)LWSNKRVXZ;")
	public static final WSNKRVXZ method224(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			WSNKRVXZ var3 = (WSNKRVXZ) field615.method179(arg2);
			if (var3 != null && var3.field1443 != arg1 && var3.field1443 != -1) {
				var3.method327();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		FROOEMOI var4 = method218(arg2);
		if (var4.field655 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field653[var6] && var4.field653[var6] != 0) {
					var5 = var4.field655[var6];
				}
			}

			if (var5 != -1) {
				var4 = method218(var5);
			}
		}

		UNLYQRUD var7 = var4.method222(1);
		if (var7 == null) {
			return null;
		}

		WSNKRVXZ var8 = null;
		if (var4.field623 != -1) {
			var8 = method224(-1, 10, var4.field627);
			if (var8 == null) {
				return null;
			}
		}

		WSNKRVXZ var9 = new WSNKRVXZ(32, 32);
		int var10 = EHATXTET.field597;
		int var11 = EHATXTET.field598;
		int[] var12 = EHATXTET.field603;
		int[] var13 = ZLDPKUPX.field1505;
		int var14 = ZLDPKUPX.field1506;
		int var15 = ZLDPKUPX.field1507;
		int var16 = ZLDPKUPX.field1510;
		int var17 = ZLDPKUPX.field1511;
		int var18 = ZLDPKUPX.field1508;
		int var19 = ZLDPKUPX.field1509;
		EHATXTET.field595 = false;
		ZLDPKUPX.method592(var9.field1437, 32, 32);
		ZLDPKUPX.method597(32, 0, 32, 0, 0);
		EHATXTET.method199();
		int var20 = var4.field633;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = EHATXTET.field601[var4.field639] * var20 >> 16;
		int var22 = EHATXTET.field602[var4.field639] * var20 >> 16;
		var7.method463(0, var4.field648, var4.field652, var4.field639, var4.field642, var7.field53 / 2 + var21 + var4.field644, var4.field644 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1437[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1437[var24 * 32 + var23 - 1] > 1) {
						var9.field1437[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1437[(var24 - 1) * 32 + var23] > 1) {
						var9.field1437[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1437[var24 * 32 + var23 + 1] > 1) {
						var9.field1437[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1437[(var24 + 1) * 32 + var23] > 1) {
						var9.field1437[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1437[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1437[var26 * 32 + var25 - 1] == 1) {
							var9.field1437[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1437[(var26 - 1) * 32 + var25] == 1) {
							var9.field1437[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1437[var26 * 32 + var25 + 1] == 1) {
							var9.field1437[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1437[(var26 + 1) * 32 + var25] == 1) {
							var9.field1437[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1437[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1437[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1437[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field623 != -1) {
			int var29 = var8.field1442;
			int var30 = var8.field1443;
			var8.field1442 = 32;
			var8.field1443 = 32;
			var8.method550(0, 0);
			var8.field1442 = var29;
			var8.field1443 = var30;
		}

		if (arg0 == 0) {
			field615.method180(var9, arg2);
		}

		ZLDPKUPX.method592(var13, var14, var15);
		ZLDPKUPX.method594(var19, var16, var17, var18);
		EHATXTET.field597 = var10;
		EHATXTET.field598 = var11;
		EHATXTET.field603 = var12;
		EHATXTET.field595 = true;

		if (var4.field617) {
			var9.field1442 = 33;
		} else {
			var9.field1442 = 32;
		}

		var9.field1443 = arg1;
		return var9;
	}

	@ObfuscatedName("FROOEMOI.d(II)Z")
	public final boolean method225(int arg0) {
		int var2 = field619;
		int var3 = field621;
		if (arg0 == 1) {
			var2 = field647;
			var3 = field654;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!UNLYQRUD.method443(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !UNLYQRUD.method443(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("FROOEMOI.a(ILWNCFPLWV;)V")
	public final void method226(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field636 = arg0.method504();
			} else if (var2 == 2) {
				field626 = arg0.method509();
			} else if (var2 == 3) {
				field660 = arg0.method510();
			} else if (var2 == 4) {
				field633 = arg0.method504();
			} else if (var2 == 5) {
				field639 = arg0.method504();
			} else if (var2 == 6) {
				field648 = arg0.method504();
			} else if (var2 == 7) {
				field642 = arg0.method504();
				if (field642 > 32767) {
					field642 -= 0x10000;
				}
			} else if (var2 == 8) {
				field644 = arg0.method504();
				if (field644 > 32767) {
					field644 -= 0x10000;
				}
			} else if (var2 == 10) {
				field650 = arg0.method504();
			} else if (var2 == 11) {
				field617 = true;
			} else if (var2 == 12) {
				field622 = arg0.method507();
			} else if (var2 == 16) {
				field640 = true;
			} else if (var2 == 23) {
				field645 = arg0.method504();
				field641 = arg0.method503();
			} else if (var2 == 24) {
				field625 = arg0.method504();
			} else if (var2 == 25) {
				field637 = arg0.method504();
				field634 = arg0.method503();
			} else if (var2 == 26) {
				field661 = arg0.method504();
			} else if (var2 >= 30 && var2 < 35) {
				if (field638 == null) {
					field638 = new String[5];
				}

				field638[var2 - 30] = arg0.method509();
				if (field638[var2 - 30].equalsIgnoreCase("hidden")) {
					field638[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field649 == null) {
					field649 = new String[5];
				}

				field649[var2 - 35] = arg0.method509();
			} else if (var2 == 40) {
				int var3 = arg0.method502();
				field616 = new int[var3];
				field618 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field616[var4] = arg0.method504();
					field618[var4] = arg0.method504();
				}
			} else if (var2 == 78) {
				field635 = arg0.method504();
			} else if (var2 == 79) {
				field657 = arg0.method504();
			} else if (var2 == 90) {
				field619 = arg0.method504();
			} else if (var2 == 91) {
				field647 = arg0.method504();
			} else if (var2 == 92) {
				field621 = arg0.method504();
			} else if (var2 == 93) {
				field654 = arg0.method504();
			} else if (var2 == 95) {
				field652 = arg0.method504();
			} else if (var2 == 97) {
				field627 = arg0.method504();
			} else if (var2 == 98) {
				field623 = arg0.method504();
			} else if (var2 >= 100 && var2 < 110) {
				if (field655 == null) {
					field655 = new int[10];
					field653 = new int[10];
				}

				field655[var2 - 100] = arg0.method504();
				field653[var2 - 100] = arg0.method504();
			} else if (var2 == 110) {
				field630 = arg0.method504();
			} else if (var2 == 111) {
				field659 = arg0.method504();
			} else if (var2 == 112) {
				field656 = arg0.method504();
			} else if (var2 == 113) {
				field620 = arg0.method503();
			} else if (var2 == 114) {
				field643 = arg0.method503() * 5;
			} else if (var2 == 115) {
				field658 = arg0.method502();
			}
		}
	}

	@ObfuscatedName("FROOEMOI.a(BI)Z")
	public final boolean method227(int arg0) {
		int var2 = field645;
		int var3 = field625;
		int var4 = field635;
		if (arg0 == 1) {
			var2 = field637;
			var3 = field661;
			var4 = field657;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!UNLYQRUD.method443(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !UNLYQRUD.method443(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !UNLYQRUD.method443(var4)) {
			var5 = false;
		}

		return var5;
	}
}
