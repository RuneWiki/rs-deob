package deob;

@ObfuscatedName("FZACNING")
public final class FZACNING {

	@ObfuscatedName("FZACNING.k")
	public int field661 = -1;

	@ObfuscatedName("FZACNING.u")
	public static TUCAQTOR field671 = new TUCAQTOR(50);

	@ObfuscatedName("FZACNING.P")
	public static boolean field688 = true;

	@ObfuscatedName("FZACNING.T")
	public static TUCAQTOR field692 = new TUCAQTOR(100);

	@ObfuscatedName("FZACNING.a")
	public byte field651;

	@ObfuscatedName("FZACNING.H")
	public byte field681;

	@ObfuscatedName("FZACNING.b")
	public int field652;

	@ObfuscatedName("FZACNING.d")
	public int field654;

	@ObfuscatedName("FZACNING.f")
	public int field656;

	@ObfuscatedName("FZACNING.g")
	public int field657;

	@ObfuscatedName("FZACNING.i")
	public int field659;

	@ObfuscatedName("FZACNING.j")
	public static int field660;

	@ObfuscatedName("FZACNING.l")
	public static int field662;

	@ObfuscatedName("FZACNING.m")
	public int field663;

	@ObfuscatedName("FZACNING.n")
	public int field664;

	@ObfuscatedName("FZACNING.o")
	public int field665;

	@ObfuscatedName("FZACNING.q")
	public int field667;

	@ObfuscatedName("FZACNING.s")
	public int field669;

	@ObfuscatedName("FZACNING.t")
	public int field670;

	@ObfuscatedName("FZACNING.v")
	public int field672;

	@ObfuscatedName("FZACNING.x")
	public int field674;

	@ObfuscatedName("FZACNING.y")
	public int field675;

	@ObfuscatedName("FZACNING.A")
	public int field676;

	@ObfuscatedName("FZACNING.C")
	public int field677;

	@ObfuscatedName("FZACNING.F")
	public int field680;

	@ObfuscatedName("FZACNING.M")
	public int field685;

	@ObfuscatedName("FZACNING.N")
	public int field686;

	@ObfuscatedName("FZACNING.O")
	public int field687;

	@ObfuscatedName("FZACNING.R")
	public int field690;

	@ObfuscatedName("FZACNING.U")
	public int field693;

	@ObfuscatedName("FZACNING.V")
	public int field694;

	@ObfuscatedName("FZACNING.W")
	public int field695;

	@ObfuscatedName("FZACNING.X")
	public int field696;

	@ObfuscatedName("FZACNING.Y")
	public int field697;

	@ObfuscatedName("FZACNING.Z")
	public int field698;

	@ObfuscatedName("FZACNING.r")
	public static KHOMSBHW field668;

	@ObfuscatedName("FZACNING.D")
	public String field678;

	@ObfuscatedName("FZACNING.p")
	public boolean field666;

	@ObfuscatedName("FZACNING.Q")
	public boolean field689;

	@ObfuscatedName("FZACNING.J")
	public byte[] field683;

	@ObfuscatedName("FZACNING.c")
	public int[] field653;

	@ObfuscatedName("FZACNING.e")
	public int[] field655;

	@ObfuscatedName("FZACNING.w")
	public int[] field673;

	@ObfuscatedName("FZACNING.L")
	public static int[] field684;

	@ObfuscatedName("FZACNING.S")
	public int[] field691;

	@ObfuscatedName("FZACNING.h")
	public static FZACNING[] field658;

	@ObfuscatedName("FZACNING.E")
	public String[] field679;

	@ObfuscatedName("FZACNING.I")
	public String[] field682;

	@ObfuscatedName("FZACNING.a(II)LGEUHTGZJ;")
	public final GEUHTGZJ method266(int arg0) {
		if (field673 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field691[var3] && field691[var3] != 0) {
					var2 = field673[var3];
				}
			}

			if (var2 != -1) {
				return method278(var2).method266(1);
			}
		}

		GEUHTGZJ var4 = GEUHTGZJ.method285(field656);
		if (var4 == null) {
			return null;
		}

		if (field653 != null) {
			for (int var5 = 0; var5 < field653.length; var5++) {
				var4.method299(field653[var5], field655[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("FZACNING.a(I)LGEUHTGZJ;")
	public final GEUHTGZJ method267(int arg0) {
		if (field673 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field691[var3] && field691[var3] != 0) {
					var2 = field673[var3];
				}
			}

			if (var2 != -1) {
				return method278(var2).method267(1);
			}
		}

		GEUHTGZJ var4 = (GEUHTGZJ) field671.method566(field661);
		if (var4 != null) {
			return var4;
		}

		GEUHTGZJ var5 = GEUHTGZJ.method285(field656);
		if (var5 == null) {
			return null;
		}

		if (field687 != 128 || field694 != 128 || field670 != 128) {
			var5.method301(field694, field687, field670);
		}

		if (field653 != null) {
			for (int var6 = 0; var6 < field653.length; var6++) {
				var5.method299(field653[var6], field655[var6]);
			}
		}

		var5.method302(field685 + 64, field693 + 768, -50, -10, -50, true);
		var5.field747 = true;
		field671.method567(var5, field661);
		return var5;
	}

	@ObfuscatedName("FZACNING.a(IZ)Z")
	public final boolean method268(int arg0) {
		int var2 = field669;
		int var3 = field652;
		if (arg0 == 1) {
			var2 = field676;
			var3 = field686;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!GEUHTGZJ.method286(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !GEUHTGZJ.method286(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("FZACNING.a(LSYUGXMZF;)V")
	public static final void method269(SYUGXMZF arg0) {
		field668 = new KHOMSBHW(arg0.method551("obj.dat", null));
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("obj.idx", null));
		field660 = var1.method351();
		field684 = new int[field660];
		int var2 = 2;
		for (int var3 = 0; var3 < field660; var3++) {
			field684[var3] = var2;
			var2 += var1.method351();
		}

		field658 = new FZACNING[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field658[var4] = new FZACNING();
		}
	}

	@ObfuscatedName("FZACNING.a(ZI)LGEUHTGZJ;")
	public final GEUHTGZJ method270(int arg0) {
		int var2 = field669;
		int var3 = field652;
		if (arg0 == 1) {
			var2 = field676;
			var3 = field686;
		}

		if (var2 == -1) {
			return null;
		}

		GEUHTGZJ var4 = GEUHTGZJ.method285(var2);
		if (var3 != -1) {
			GEUHTGZJ var5 = GEUHTGZJ.method285(var3);
			GEUHTGZJ[] var6 = new GEUHTGZJ[] { var4, var5 };
			var4 = new GEUHTGZJ(var6, 2);
		}

		if (field653 != null) {
			for (int var7 = 0; var7 < field653.length; var7++) {
				var4.method299(field653[var7], field655[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("FZACNING.a(B)V")
	public void method271() {
		FZACNING var1 = method278(field672);
		field656 = var1.field656;
		field663 = var1.field663;
		field696 = var1.field696;
		field698 = var1.field698;
		field697 = var1.field697;
		field657 = var1.field657;
		field675 = var1.field675;
		field653 = var1.field653;
		field655 = var1.field655;
		FZACNING var2 = method278(field665);
		field678 = var2.field678;
		field666 = var2.field666;
		field674 = var2.field674;
		String var3 = "a";
		char var4 = var2.field678.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field683 = ("Swap this note at any bank for " + var3 + " " + var2.field678 + ".").getBytes();
		field689 = true;
	}

	@ObfuscatedName("FZACNING.a(BI)Z")
	public final boolean method272(int arg0) {
		int var2 = field654;
		int var3 = field659;
		int var4 = field664;
		if (arg0 == 1) {
			var2 = field667;
			var3 = field690;
			var4 = field680;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!GEUHTGZJ.method286(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !GEUHTGZJ.method286(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !GEUHTGZJ.method286(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("FZACNING.a()V")
	public final void method273() {
		field656 = 0;
		field678 = null;
		field683 = null;
		field653 = null;
		field655 = null;
		field663 = 2000;
		field696 = 0;
		field698 = 0;
		field697 = 0;
		field657 = 0;
		field675 = 0;
		field695 = -1;
		field689 = false;
		field674 = 1;
		field666 = false;
		field679 = null;
		field682 = null;
		field654 = -1;
		field659 = -1;
		field681 = 0;
		field667 = -1;
		field690 = -1;
		field651 = 0;
		field664 = -1;
		field680 = -1;
		field669 = -1;
		field652 = -1;
		field676 = -1;
		field686 = -1;
		field673 = null;
		field691 = null;
		field665 = -1;
		field672 = -1;
		field687 = 128;
		field694 = 128;
		field670 = 128;
		field685 = 0;
		field693 = 0;
		field677 = 0;
	}

	@ObfuscatedName("FZACNING.b(II)LGEUHTGZJ;")
	public final GEUHTGZJ method274(int arg0) {
		int var2 = field654;
		int var3 = field659;
		int var4 = field664;
		if (arg0 == 1) {
			var2 = field667;
			var3 = field690;
			var4 = field680;
		}

		if (var2 == -1) {
			return null;
		}

		GEUHTGZJ var5 = GEUHTGZJ.method285(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				GEUHTGZJ var9 = GEUHTGZJ.method285(var3);
				GEUHTGZJ[] var10 = new GEUHTGZJ[] { var5, var9 };
				var5 = new GEUHTGZJ(var10, 2);
			} else {
				GEUHTGZJ var6 = GEUHTGZJ.method285(var3);
				GEUHTGZJ var7 = GEUHTGZJ.method285(var4);
				GEUHTGZJ[] var8 = new GEUHTGZJ[] { var5, var6, var7 };
				var5 = new GEUHTGZJ(var8, 3);
			}
		}

		if (arg0 == 0 && field681 != 0) {
			var5.method298(0, field681, 0);
		}

		if (arg0 == 1 && field651 != 0) {
			var5.method298(0, field651, 0);
		}

		if (field653 != null) {
			for (int var11 = 0; var11 < field653.length; var11++) {
				var5.method299(field653[var11], field655[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("FZACNING.a(IIBI)LTNNDDWAZ;")
	public static final TNNDDWAZ method275(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			TNNDDWAZ var3 = (TNNDDWAZ) field692.method566(arg0);
			if (var3 != null && var3.field1280 != arg1 && var3.field1280 != -1) {
				var3.method1();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		FZACNING var4 = method278(arg0);
		if (var4.field673 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field691[var6] && var4.field691[var6] != 0) {
					var5 = var4.field673[var6];
				}
			}

			if (var5 != -1) {
				var4 = method278(var5);
			}
		}

		GEUHTGZJ var7 = var4.method267(1);
		if (var7 == null) {
			return null;
		}

		TNNDDWAZ var8 = null;
		if (var4.field672 != -1) {
			var8 = method275(var4.field665, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		TNNDDWAZ var9 = new TNNDDWAZ(32, 32);
		int var10 = EDRGRMCC.field585;
		int var11 = EDRGRMCC.field586;
		int[] var12 = EDRGRMCC.field591;
		int[] var13 = OMVHXJFV.field1049;
		int var14 = OMVHXJFV.field1050;
		int var15 = OMVHXJFV.field1051;
		int var16 = OMVHXJFV.field1054;
		int var17 = OMVHXJFV.field1055;
		int var18 = OMVHXJFV.field1052;
		int var19 = OMVHXJFV.field1053;
		EDRGRMCC.field583 = false;
		OMVHXJFV.method415(var9.field1274, 32, 32);
		OMVHXJFV.method420(0, 0, 32, 32, 0);
		EDRGRMCC.method224();
		int var20 = var4.field663;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = EDRGRMCC.field589[var4.field696] * var20 >> 16;
		int var22 = EDRGRMCC.field590[var4.field696] * var20 >> 16;
		var7.method305(0, var4.field698, var4.field697, var4.field696, var4.field657, var7.field570 / 2 + var21 + var4.field675, var4.field675 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1274[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1274[var24 * 32 + var23 - 1] > 1) {
						var9.field1274[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1274[(var24 - 1) * 32 + var23] > 1) {
						var9.field1274[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1274[var24 * 32 + var23 + 1] > 1) {
						var9.field1274[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1274[(var24 + 1) * 32 + var23] > 1) {
						var9.field1274[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1274[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1274[var26 * 32 + var25 - 1] == 1) {
							var9.field1274[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1274[(var26 - 1) * 32 + var25] == 1) {
							var9.field1274[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1274[var26 * 32 + var25 + 1] == 1) {
							var9.field1274[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1274[(var26 + 1) * 32 + var25] == 1) {
							var9.field1274[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1274[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1274[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1274[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field672 != -1) {
			int var29 = var8.field1279;
			int var30 = var8.field1280;
			var8.field1279 = 32;
			var8.field1280 = 32;
			var8.method558(0, 0);
			var8.field1279 = var29;
			var8.field1280 = var30;
		}

		if (arg2 == 0) {
			field692.method567(var9, arg0);
		}

		OMVHXJFV.method415(var13, var15, var14);
		OMVHXJFV.method417(var17, var18, var19, var16);
		EDRGRMCC.field585 = var10;
		EDRGRMCC.field586 = var11;
		EDRGRMCC.field591 = var12;
		EDRGRMCC.field583 = true;

		if (var4.field689) {
			var9.field1279 = 33;
		} else {
			var9.field1279 = 32;
		}

		var9.field1280 = arg1;
		return var9;
	}

	@ObfuscatedName("FZACNING.b(I)V")
	public static final void method276() {
		field671 = null;
		field692 = null;
		field684 = null;
		field658 = null;
		field668 = null;
	}

	@ObfuscatedName("FZACNING.a(LKHOMSBHW;I)V")
	public final void method277(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field656 = arg0.method351();
			} else if (var2 == 2) {
				field678 = arg0.method356();
			} else if (var2 == 3) {
				field683 = arg0.method357();
			} else if (var2 == 4) {
				field663 = arg0.method351();
			} else if (var2 == 5) {
				field696 = arg0.method351();
			} else if (var2 == 6) {
				field698 = arg0.method351();
			} else if (var2 == 7) {
				field657 = arg0.method351();
				if (field657 > 32767) {
					field657 -= 0x10000;
				}
			} else if (var2 == 8) {
				field675 = arg0.method351();
				if (field675 > 32767) {
					field675 -= 0x10000;
				}
			} else if (var2 == 10) {
				field695 = arg0.method351();
			} else if (var2 == 11) {
				field689 = true;
			} else if (var2 == 12) {
				field674 = arg0.method354();
			} else if (var2 == 16) {
				field666 = true;
			} else if (var2 == 23) {
				field654 = arg0.method351();
				field681 = arg0.method350();
			} else if (var2 == 24) {
				field659 = arg0.method351();
			} else if (var2 == 25) {
				field667 = arg0.method351();
				field651 = arg0.method350();
			} else if (var2 == 26) {
				field690 = arg0.method351();
			} else if (var2 >= 30 && var2 < 35) {
				if (field679 == null) {
					field679 = new String[5];
				}

				field679[var2 - 30] = arg0.method356();
				if (field679[var2 - 30].equalsIgnoreCase("hidden")) {
					field679[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field682 == null) {
					field682 = new String[5];
				}

				field682[var2 - 35] = arg0.method356();
			} else if (var2 == 40) {
				int var3 = arg0.method349();
				field653 = new int[var3];
				field655 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field653[var4] = arg0.method351();
					field655[var4] = arg0.method351();
				}
			} else if (var2 == 78) {
				field664 = arg0.method351();
			} else if (var2 == 79) {
				field680 = arg0.method351();
			} else if (var2 == 90) {
				field669 = arg0.method351();
			} else if (var2 == 91) {
				field676 = arg0.method351();
			} else if (var2 == 92) {
				field652 = arg0.method351();
			} else if (var2 == 93) {
				field686 = arg0.method351();
			} else if (var2 == 95) {
				field697 = arg0.method351();
			} else if (var2 == 97) {
				field665 = arg0.method351();
			} else if (var2 == 98) {
				field672 = arg0.method351();
			} else if (var2 >= 100 && var2 < 110) {
				if (field673 == null) {
					field673 = new int[10];
					field691 = new int[10];
				}

				field673[var2 - 100] = arg0.method351();
				field691[var2 - 100] = arg0.method351();
			} else if (var2 == 110) {
				field687 = arg0.method351();
			} else if (var2 == 111) {
				field694 = arg0.method351();
			} else if (var2 == 112) {
				field670 = arg0.method351();
			} else if (var2 == 113) {
				field685 = arg0.method350();
			} else if (var2 == 114) {
				field693 = arg0.method350() * 5;
			} else if (var2 == 115) {
				field677 = arg0.method349();
			}
		}
	}

	@ObfuscatedName("FZACNING.c(I)LFZACNING;")
	public static final FZACNING method278(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field658[var1].field661 == arg0) {
				return field658[var1];
			}
		}

		field662 = (field662 + 1) % 10;
		FZACNING var2 = field658[field662];
		field668.field934 = field684[arg0];
		var2.field661 = arg0;
		var2.method273();
		var2.method277(field668);

		if (var2.field672 != -1) {
			var2.method271();
		}

		if (!field688 && var2.field666) {
			var2.field678 = "Members Object";
			var2.field683 = "Login to a members' server to use this object.".getBytes();
			var2.field679 = null;
			var2.field682 = null;
			var2.field677 = 0;
		}

		return var2;
	}
}
