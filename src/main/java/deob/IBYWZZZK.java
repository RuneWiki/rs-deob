package deob;

@ObfuscatedName("IBYWZZZK")
public final class IBYWZZZK {

	@ObfuscatedName("IBYWZZZK.F")
	public int field770 = -1;

	@ObfuscatedName("IBYWZZZK.z")
	public static ZYLCKQCD field765 = new ZYLCKQCD(100);

	@ObfuscatedName("IBYWZZZK.B")
	public static ZYLCKQCD field767 = new ZYLCKQCD(50);

	@ObfuscatedName("IBYWZZZK.P")
	public static boolean field780 = true;

	@ObfuscatedName("IBYWZZZK.M")
	public byte field777;

	@ObfuscatedName("IBYWZZZK.Q")
	public byte field781;

	@ObfuscatedName("IBYWZZZK.a")
	public int field743;

	@ObfuscatedName("IBYWZZZK.b")
	public int field744;

	@ObfuscatedName("IBYWZZZK.c")
	public int field745;

	@ObfuscatedName("IBYWZZZK.f")
	public int field748;

	@ObfuscatedName("IBYWZZZK.j")
	public int field751;

	@ObfuscatedName("IBYWZZZK.k")
	public int field752;

	@ObfuscatedName("IBYWZZZK.l")
	public int field753;

	@ObfuscatedName("IBYWZZZK.m")
	public int field754;

	@ObfuscatedName("IBYWZZZK.n")
	public int field755;

	@ObfuscatedName("IBYWZZZK.o")
	public int field756;

	@ObfuscatedName("IBYWZZZK.r")
	public int field759;

	@ObfuscatedName("IBYWZZZK.t")
	public static int field760;

	@ObfuscatedName("IBYWZZZK.u")
	public int field761;

	@ObfuscatedName("IBYWZZZK.v")
	public int field762;

	@ObfuscatedName("IBYWZZZK.w")
	public int field763;

	@ObfuscatedName("IBYWZZZK.y")
	public int field764;

	@ObfuscatedName("IBYWZZZK.A")
	public int field766;

	@ObfuscatedName("IBYWZZZK.G")
	public int field771;

	@ObfuscatedName("IBYWZZZK.H")
	public int field772;

	@ObfuscatedName("IBYWZZZK.J")
	public int field774;

	@ObfuscatedName("IBYWZZZK.K")
	public int field775;

	@ObfuscatedName("IBYWZZZK.O")
	public int field779;

	@ObfuscatedName("IBYWZZZK.S")
	public int field783;

	@ObfuscatedName("IBYWZZZK.T")
	public int field784;

	@ObfuscatedName("IBYWZZZK.V")
	public static int field785;

	@ObfuscatedName("IBYWZZZK.W")
	public int field786;

	@ObfuscatedName("IBYWZZZK.X")
	public int field787;

	@ObfuscatedName("IBYWZZZK.ab")
	public int field789;

	@ObfuscatedName("IBYWZZZK.bb")
	public int field790;

	@ObfuscatedName("IBYWZZZK.p")
	public static PGNBHFUF field757;

	@ObfuscatedName("IBYWZZZK.e")
	public String field747;

	@ObfuscatedName("IBYWZZZK.d")
	public boolean field746;

	@ObfuscatedName("IBYWZZZK.C")
	public boolean field768;

	@ObfuscatedName("IBYWZZZK.R")
	public byte[] field782;

	@ObfuscatedName("IBYWZZZK.i")
	public int[] field750;

	@ObfuscatedName("IBYWZZZK.q")
	public static int[] field758;

	@ObfuscatedName("IBYWZZZK.I")
	public int[] field773;

	@ObfuscatedName("IBYWZZZK.L")
	public int[] field776;

	@ObfuscatedName("IBYWZZZK.N")
	public int[] field778;

	@ObfuscatedName("IBYWZZZK.Z")
	public static IBYWZZZK[] field788;

	@ObfuscatedName("IBYWZZZK.g")
	public String[] field749;

	@ObfuscatedName("IBYWZZZK.E")
	public String[] field769;

	@ObfuscatedName("IBYWZZZK.a(I)V")
	public static final void method288() {
		field767 = null;
		field765 = null;
		field758 = null;
		field788 = null;
		field757 = null;
	}

	@ObfuscatedName("IBYWZZZK.a(II)Z")
	public final boolean method289(int arg0) {
		int var2 = field745;
		int var3 = field790;
		int var4 = field786;
		if (arg0 == 1) {
			var2 = field775;
			var3 = field766;
			var4 = field772;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!POJFANDE.method461(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !POJFANDE.method461(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !POJFANDE.method461(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("IBYWZZZK.b(I)LIBYWZZZK;")
	public static final IBYWZZZK method290(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field788[var1].field770 == arg0) {
				return field788[var1];
			}
		}

		field785 = (field785 + 1) % 10;
		IBYWZZZK var2 = field788[field785];
		field757.field1082 = field758[arg0];
		var2.field770 = arg0;
		var2.method291();
		var2.method295(field757);

		if (var2.field755 != -1) {
			var2.method294();
		}

		if (!field780 && var2.field746) {
			var2.field747 = "Members Object";
			var2.field782 = "Login to a members' server to use this object.".getBytes();
			var2.field749 = null;
			var2.field769 = null;
			var2.field761 = 0;
		}

		return var2;
	}

	@ObfuscatedName("IBYWZZZK.a()V")
	public final void method291() {
		field743 = 0;
		field747 = null;
		field782 = null;
		field778 = null;
		field773 = null;
		field771 = 2000;
		field784 = 0;
		field763 = 0;
		field752 = 0;
		field789 = 0;
		field764 = 0;
		field787 = -1;
		field768 = false;
		field753 = 1;
		field746 = false;
		field749 = null;
		field769 = null;
		field745 = -1;
		field790 = -1;
		field777 = 0;
		field775 = -1;
		field766 = -1;
		field781 = 0;
		field786 = -1;
		field772 = -1;
		field756 = -1;
		field754 = -1;
		field779 = -1;
		field783 = -1;
		field776 = null;
		field750 = null;
		field759 = -1;
		field755 = -1;
		field762 = 128;
		field748 = 128;
		field774 = 128;
		field751 = 0;
		field744 = 0;
		field761 = 0;
	}

	@ObfuscatedName("IBYWZZZK.b(II)LPOJFANDE;")
	public final POJFANDE method292(int arg0) {
		int var2 = field745;
		int var3 = field790;
		int var4 = field786;
		if (arg0 == 1) {
			var2 = field775;
			var3 = field766;
			var4 = field772;
		}

		if (var2 == -1) {
			return null;
		}

		POJFANDE var5 = POJFANDE.method460(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				POJFANDE var9 = POJFANDE.method460(var3);
				POJFANDE[] var10 = new POJFANDE[] { var5, var9 };
				var5 = new POJFANDE(2, var10);
			} else {
				POJFANDE var6 = POJFANDE.method460(var3);
				POJFANDE var7 = POJFANDE.method460(var4);
				POJFANDE[] var8 = new POJFANDE[] { var5, var6, var7 };
				var5 = new POJFANDE(3, var8);
			}
		}

		if (arg0 == 0 && field777 != 0) {
			var5.method473(field777, 0, 0);
		}

		if (arg0 == 1 && field781 != 0) {
			var5.method473(field781, 0, 0);
		}

		if (field778 != null) {
			for (int var11 = 0; var11 < field778.length; var11++) {
				var5.method474(field778[var11], field773[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("IBYWZZZK.a(LQDHHNYHL;)V")
	public static final void method293(QDHHNYHL arg0) {
		field757 = new PGNBHFUF(arg0.method488("obj.dat", null));
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("obj.idx", null));
		field760 = var1.method422();
		field758 = new int[field760];
		int var2 = 2;
		for (int var3 = 0; var3 < field760; var3++) {
			field758[var3] = var2;
			var2 += var1.method422();
		}

		field788 = new IBYWZZZK[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field788[var4] = new IBYWZZZK();
		}
	}

	@ObfuscatedName("IBYWZZZK.a(Z)V")
	public void method294() {
		IBYWZZZK var1 = method290(field755);
		field743 = var1.field743;
		field771 = var1.field771;
		field784 = var1.field784;
		field763 = var1.field763;
		field752 = var1.field752;
		field789 = var1.field789;
		field764 = var1.field764;
		field778 = var1.field778;
		field773 = var1.field773;
		IBYWZZZK var2 = method290(field759);
		field747 = var2.field747;
		field746 = var2.field746;
		field753 = var2.field753;
		String var3 = "a";
		char var4 = var2.field747.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field782 = ("Swap this note at any bank for " + var3 + " " + var2.field747 + ".").getBytes();
		field768 = true;
	}

	@ObfuscatedName("IBYWZZZK.a(LPGNBHFUF;I)V")
	public final void method295(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field743 = arg0.method422();
			} else if (var2 == 2) {
				field747 = arg0.method427();
			} else if (var2 == 3) {
				field782 = arg0.method428();
			} else if (var2 == 4) {
				field771 = arg0.method422();
			} else if (var2 == 5) {
				field784 = arg0.method422();
			} else if (var2 == 6) {
				field763 = arg0.method422();
			} else if (var2 == 7) {
				field789 = arg0.method422();
				if (field789 > 32767) {
					field789 -= 0x10000;
				}
			} else if (var2 == 8) {
				field764 = arg0.method422();
				if (field764 > 32767) {
					field764 -= 0x10000;
				}
			} else if (var2 == 10) {
				field787 = arg0.method422();
			} else if (var2 == 11) {
				field768 = true;
			} else if (var2 == 12) {
				field753 = arg0.method425();
			} else if (var2 == 16) {
				field746 = true;
			} else if (var2 == 23) {
				field745 = arg0.method422();
				field777 = arg0.method421();
			} else if (var2 == 24) {
				field790 = arg0.method422();
			} else if (var2 == 25) {
				field775 = arg0.method422();
				field781 = arg0.method421();
			} else if (var2 == 26) {
				field766 = arg0.method422();
			} else if (var2 >= 30 && var2 < 35) {
				if (field749 == null) {
					field749 = new String[5];
				}

				field749[var2 - 30] = arg0.method427();
				if (field749[var2 - 30].equalsIgnoreCase("hidden")) {
					field749[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field769 == null) {
					field769 = new String[5];
				}

				field769[var2 - 35] = arg0.method427();
			} else if (var2 == 40) {
				int var3 = arg0.method420();
				field778 = new int[var3];
				field773 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field778[var4] = arg0.method422();
					field773[var4] = arg0.method422();
				}
			} else if (var2 == 78) {
				field786 = arg0.method422();
			} else if (var2 == 79) {
				field772 = arg0.method422();
			} else if (var2 == 90) {
				field756 = arg0.method422();
			} else if (var2 == 91) {
				field779 = arg0.method422();
			} else if (var2 == 92) {
				field754 = arg0.method422();
			} else if (var2 == 93) {
				field783 = arg0.method422();
			} else if (var2 == 95) {
				field752 = arg0.method422();
			} else if (var2 == 97) {
				field759 = arg0.method422();
			} else if (var2 == 98) {
				field755 = arg0.method422();
			} else if (var2 >= 100 && var2 < 110) {
				if (field776 == null) {
					field776 = new int[10];
					field750 = new int[10];
				}

				field776[var2 - 100] = arg0.method422();
				field750[var2 - 100] = arg0.method422();
			} else if (var2 == 110) {
				field762 = arg0.method422();
			} else if (var2 == 111) {
				field748 = arg0.method422();
			} else if (var2 == 112) {
				field774 = arg0.method422();
			} else if (var2 == 113) {
				field751 = arg0.method421();
			} else if (var2 == 114) {
				field744 = arg0.method421() * 5;
			} else if (var2 == 115) {
				field761 = arg0.method420();
			}
		}
	}

	@ObfuscatedName("IBYWZZZK.c(II)Z")
	public final boolean method296(int arg0) {
		int var2 = field756;
		int var3 = field754;
		if (arg0 == 1) {
			var2 = field779;
			var3 = field783;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!POJFANDE.method461(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !POJFANDE.method461(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("IBYWZZZK.c(I)LPOJFANDE;")
	public final POJFANDE method297(int arg0) {
		if (field776 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field750[var3] && field750[var3] != 0) {
					var2 = field776[var3];
				}
			}

			if (var2 != -1) {
				return method290(var2).method297(1);
			}
		}

		POJFANDE var4 = (POJFANDE) field767.method599(field770);
		if (var4 != null) {
			return var4;
		}

		POJFANDE var5 = POJFANDE.method460(field743);
		if (var5 == null) {
			return null;
		}

		if (field762 != 128 || field748 != 128 || field774 != 128) {
			var5.method476(field748, field774, field762);
		}

		if (field778 != null) {
			for (int var6 = 0; var6 < field778.length; var6++) {
				var5.method474(field778[var6], field773[var6]);
			}
		}

		var5.method477(field751 + 64, field744 + 768, -50, -10, -50, true);
		var5.field1132 = true;
		field767.method600(var5, field770);
		return var5;
	}

	@ObfuscatedName("IBYWZZZK.a(IIII)LTTWFVYGB;")
	public static final TTWFVYGB method298(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			TTWFVYGB var3 = (TTWFVYGB) field765.method599(arg0);
			if (var3 != null && var3.field1237 != arg1 && var3.field1237 != -1) {
				var3.method221();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		IBYWZZZK var4 = method290(arg0);
		if (var4.field776 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field750[var6] && var4.field750[var6] != 0) {
					var5 = var4.field776[var6];
				}
			}

			if (var5 != -1) {
				var4 = method290(var5);
			}
		}

		POJFANDE var7 = var4.method297(1);
		if (var7 == null) {
			return null;
		}

		TTWFVYGB var8 = null;
		if (var4.field755 != -1) {
			var8 = method298(var4.field759, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		TTWFVYGB var9 = new TTWFVYGB(32, 32);
		int var10 = DJQPOKKS.field583;
		int var11 = DJQPOKKS.field584;
		int[] var12 = DJQPOKKS.field589;
		int[] var13 = YYTDUXDR.field1435;
		int var14 = YYTDUXDR.field1436;
		int var15 = YYTDUXDR.field1437;
		int var16 = YYTDUXDR.field1440;
		int var17 = YYTDUXDR.field1441;
		int var18 = YYTDUXDR.field1438;
		int var19 = YYTDUXDR.field1439;
		DJQPOKKS.field581 = false;
		YYTDUXDR.method576(var9.field1231, 32, 32);
		YYTDUXDR.method581(0, 0, 32, 32, 0);
		DJQPOKKS.method245();
		int var20 = var4.field771;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = DJQPOKKS.field587[var4.field784] * var20 >> 16;
		int var22 = DJQPOKKS.field588[var4.field784] * var20 >> 16;
		var7.method481(0, var4.field763, var4.field752, var4.field784, var4.field789, var7.field1277 / 2 + var21 + var4.field764, var4.field764 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1231[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1231[var24 * 32 + var23 - 1] > 1) {
						var9.field1231[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1231[(var24 - 1) * 32 + var23] > 1) {
						var9.field1231[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1231[var24 * 32 + var23 + 1] > 1) {
						var9.field1231[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1231[(var24 + 1) * 32 + var23] > 1) {
						var9.field1231[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1231[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1231[var26 * 32 + var25 - 1] == 1) {
							var9.field1231[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1231[(var26 - 1) * 32 + var25] == 1) {
							var9.field1231[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1231[var26 * 32 + var25 + 1] == 1) {
							var9.field1231[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1231[(var26 + 1) * 32 + var25] == 1) {
							var9.field1231[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1231[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1231[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1231[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field755 != -1) {
			int var29 = var8.field1236;
			int var30 = var8.field1237;
			var8.field1236 = 32;
			var8.field1237 = 32;
			var8.method511(0, 0);
			var8.field1236 = var29;
			var8.field1237 = var30;
		}

		if (arg2 == 0) {
			field765.method600(var9, arg0);
		}

		YYTDUXDR.method576(var13, var15, var14);
		YYTDUXDR.method578(var17, var18, var16, var19);
		DJQPOKKS.field583 = var10;
		DJQPOKKS.field584 = var11;
		DJQPOKKS.field589 = var12;
		DJQPOKKS.field581 = true;

		if (var4.field768) {
			var9.field1236 = 33;
		} else {
			var9.field1236 = 32;
		}

		var9.field1237 = arg1;
		return var9;
	}

	@ObfuscatedName("IBYWZZZK.d(II)LPOJFANDE;")
	public final POJFANDE method299(int arg0) {
		if (field776 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field750[var3] && field750[var3] != 0) {
					var2 = field776[var3];
				}
			}

			if (var2 != -1) {
				return method290(var2).method299(1);
			}
		}

		POJFANDE var4 = POJFANDE.method460(field743);
		if (var4 == null) {
			return null;
		}

		if (field778 != null) {
			for (int var5 = 0; var5 < field778.length; var5++) {
				var4.method474(field778[var5], field773[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("IBYWZZZK.a(BI)LPOJFANDE;")
	public final POJFANDE method300(int arg0) {
		int var2 = field756;
		int var3 = field754;
		if (arg0 == 1) {
			var2 = field779;
			var3 = field783;
		}

		if (var2 == -1) {
			return null;
		}

		POJFANDE var4 = POJFANDE.method460(var2);
		if (var3 != -1) {
			POJFANDE var5 = POJFANDE.method460(var3);
			POJFANDE[] var6 = new POJFANDE[] { var4, var5 };
			var4 = new POJFANDE(2, var6);
		}

		if (field778 != null) {
			for (int var7 = 0; var7 < field778.length; var7++) {
				var4.method474(field778[var7], field773[var7]);
			}
		}

		return var4;
	}
}
