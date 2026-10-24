package deob;

@ObfuscatedName("HJAQAKAW")
public final class HJAQAKAW {

	@ObfuscatedName("HJAQAKAW.d")
	public int field740 = -1;

	@ObfuscatedName("HJAQAKAW.h")
	public static DMOAMUBS field744 = new DMOAMUBS(50);

	@ObfuscatedName("HJAQAKAW.i")
	public static boolean field745 = true;

	@ObfuscatedName("HJAQAKAW.q")
	public static DMOAMUBS field752 = new DMOAMUBS(100);

	@ObfuscatedName("HJAQAKAW.B")
	public byte field762;

	@ObfuscatedName("HJAQAKAW.I")
	public byte field768;

	@ObfuscatedName("HJAQAKAW.b")
	public int field738;

	@ObfuscatedName("HJAQAKAW.e")
	public int field741;

	@ObfuscatedName("HJAQAKAW.f")
	public int field742;

	@ObfuscatedName("HJAQAKAW.g")
	public int field743;

	@ObfuscatedName("HJAQAKAW.j")
	public int field746;

	@ObfuscatedName("HJAQAKAW.o")
	public int field750;

	@ObfuscatedName("HJAQAKAW.p")
	public int field751;

	@ObfuscatedName("HJAQAKAW.r")
	public int field753;

	@ObfuscatedName("HJAQAKAW.s")
	public int field754;

	@ObfuscatedName("HJAQAKAW.u")
	public int field756;

	@ObfuscatedName("HJAQAKAW.v")
	public int field757;

	@ObfuscatedName("HJAQAKAW.w")
	public int field758;

	@ObfuscatedName("HJAQAKAW.x")
	public int field759;

	@ObfuscatedName("HJAQAKAW.y")
	public int field760;

	@ObfuscatedName("HJAQAKAW.A")
	public static int field761;

	@ObfuscatedName("HJAQAKAW.C")
	public static int field763;

	@ObfuscatedName("HJAQAKAW.D")
	public int field764;

	@ObfuscatedName("HJAQAKAW.E")
	public int field765;

	@ObfuscatedName("HJAQAKAW.G")
	public int field766;

	@ObfuscatedName("HJAQAKAW.H")
	public int field767;

	@ObfuscatedName("HJAQAKAW.K")
	public int field770;

	@ObfuscatedName("HJAQAKAW.L")
	public int field771;

	@ObfuscatedName("HJAQAKAW.N")
	public int field773;

	@ObfuscatedName("HJAQAKAW.O")
	public int field774;

	@ObfuscatedName("HJAQAKAW.P")
	public int field775;

	@ObfuscatedName("HJAQAKAW.Q")
	public int field776;

	@ObfuscatedName("HJAQAKAW.R")
	public int field777;

	@ObfuscatedName("HJAQAKAW.X")
	public int field782;

	@ObfuscatedName("HJAQAKAW.Y")
	public int field783;

	@ObfuscatedName("HJAQAKAW.l")
	public static XGRGMPUQ field748;

	@ObfuscatedName("HJAQAKAW.t")
	public String field755;

	@ObfuscatedName("HJAQAKAW.n")
	public boolean field749;

	@ObfuscatedName("HJAQAKAW.Z")
	public boolean field784;

	@ObfuscatedName("HJAQAKAW.T")
	public byte[] field778;

	@ObfuscatedName("HJAQAKAW.c")
	public int[] field739;

	@ObfuscatedName("HJAQAKAW.M")
	public static int[] field772;

	@ObfuscatedName("HJAQAKAW.U")
	public int[] field779;

	@ObfuscatedName("HJAQAKAW.V")
	public int[] field780;

	@ObfuscatedName("HJAQAKAW.W")
	public int[] field781;

	@ObfuscatedName("HJAQAKAW.J")
	public static HJAQAKAW[] field769;

	@ObfuscatedName("HJAQAKAW.a")
	public String[] field737;

	@ObfuscatedName("HJAQAKAW.k")
	public String[] field747;

	@ObfuscatedName("HJAQAKAW.a(II)LVYUQHOMO;")
	public final VYUQHOMO method225(int arg0) {
		if (field739 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field779[var3] && field779[var3] != 0) {
					var2 = field739[var3];
				}
			}

			if (var2 != -1) {
				return method237(var2).method225(1);
			}
		}

		VYUQHOMO var4 = VYUQHOMO.method407(field750);
		if (var4 == null) {
			return null;
		}

		if (field780 != null) {
			for (int var5 = 0; var5 < field780.length; var5++) {
				var4.method421(field780[var5], field781[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HJAQAKAW.a()V")
	public final void method226() {
		field750 = 0;
		field755 = null;
		field778 = null;
		field780 = null;
		field781 = null;
		field765 = 2000;
		field746 = 0;
		field758 = 0;
		field770 = 0;
		field766 = 0;
		field751 = 0;
		field757 = -1;
		field749 = false;
		field742 = 1;
		field784 = false;
		field737 = null;
		field747 = null;
		field753 = -1;
		field782 = -1;
		field762 = 0;
		field754 = -1;
		field756 = -1;
		field768 = 0;
		field743 = -1;
		field760 = -1;
		field764 = -1;
		field767 = -1;
		field773 = -1;
		field774 = -1;
		field739 = null;
		field779 = null;
		field783 = -1;
		field776 = -1;
		field775 = 128;
		field741 = 128;
		field777 = 128;
		field738 = 0;
		field759 = 0;
		field771 = 0;
	}

	@ObfuscatedName("HJAQAKAW.a(LMJLXHQTQ;)V")
	public static final void method227(MJLXHQTQ arg0) {
		field748 = new XGRGMPUQ(arg0.method317("obj.dat", null));
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("obj.idx", null));
		field761 = var1.method467();
		field772 = new int[field761];
		int var2 = 2;
		for (int var3 = 0; var3 < field761; var3++) {
			field772[var3] = var2;
			var2 += var1.method467();
		}

		field769 = new HJAQAKAW[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field769[var4] = new HJAQAKAW();
		}
	}

	@ObfuscatedName("HJAQAKAW.b(II)Z")
	public final boolean method228(int arg0) {
		int var2 = field753;
		int var3 = field782;
		int var4 = field743;
		if (arg0 == 1) {
			var2 = field754;
			var3 = field756;
			var4 = field760;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!VYUQHOMO.method408(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !VYUQHOMO.method408(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !VYUQHOMO.method408(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("HJAQAKAW.a(IBII)LPDMJJHOP;")
	public static final PDMJJHOP method229(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			PDMJJHOP var3 = (PDMJJHOP) field752.method193(arg0);
			if (var3 != null && var3.field1151 != arg2 && var3.field1151 != -1) {
				var3.method334();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		HJAQAKAW var4 = method237(arg0);
		if (var4.field739 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field779[var6] && var4.field779[var6] != 0) {
					var5 = var4.field739[var6];
				}
			}

			if (var5 != -1) {
				var4 = method237(var5);
			}
		}

		VYUQHOMO var7 = var4.method236(1);
		if (var7 == null) {
			return null;
		}

		PDMJJHOP var8 = null;
		if (var4.field776 != -1) {
			var8 = method229(var4.field783, -1, 10);
			if (var8 == null) {
				return null;
			}
		}

		PDMJJHOP var9 = new PDMJJHOP(32, 32);
		int var10 = VWUXWWMW.field1194;
		int var11 = VWUXWWMW.field1195;
		int[] var12 = VWUXWWMW.field1200;
		int[] var13 = IGZZCJOU.field795;
		int var14 = IGZZCJOU.field796;
		int var15 = IGZZCJOU.field797;
		int var16 = IGZZCJOU.field800;
		int var17 = IGZZCJOU.field801;
		int var18 = IGZZCJOU.field798;
		int var19 = IGZZCJOU.field799;
		VWUXWWMW.field1192 = false;
		IGZZCJOU.method240(var9.field1145, 32, 32);
		IGZZCJOU.method245(0, 0, 0, 32, 32);
		VWUXWWMW.method377();
		int var20 = var4.field765;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = VWUXWWMW.field1198[var4.field746] * var20 >> 16;
		int var22 = VWUXWWMW.field1199[var4.field746] * var20 >> 16;
		var7.method427(0, var4.field758, var4.field770, var4.field746, var4.field766, var7.field827 / 2 + var21 + var4.field751, var4.field751 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1145[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1145[var24 * 32 + var23 - 1] > 1) {
						var9.field1145[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1145[(var24 - 1) * 32 + var23] > 1) {
						var9.field1145[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1145[var24 * 32 + var23 + 1] > 1) {
						var9.field1145[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1145[(var24 + 1) * 32 + var23] > 1) {
						var9.field1145[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1145[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1145[var26 * 32 + var25 - 1] == 1) {
							var9.field1145[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1145[(var26 - 1) * 32 + var25] == 1) {
							var9.field1145[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1145[var26 * 32 + var25 + 1] == 1) {
							var9.field1145[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1145[(var26 + 1) * 32 + var25] == 1) {
							var9.field1145[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1145[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1145[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1145[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field776 != -1) {
			int var29 = var8.field1150;
			int var30 = var8.field1151;
			var8.field1150 = 32;
			var8.field1151 = 32;
			var8.method340(0, 0);
			var8.field1150 = var29;
			var8.field1151 = var30;
		}

		if (arg1 == 0) {
			field752.method194(arg0, var9);
		}

		IGZZCJOU.method240(var13, var14, var15);
		IGZZCJOU.method242(var16, var19, var18, var17);
		VWUXWWMW.field1194 = var10;
		VWUXWWMW.field1195 = var11;
		VWUXWWMW.field1200 = var12;
		VWUXWWMW.field1192 = true;

		if (var4.field749) {
			var9.field1150 = 33;
		} else {
			var9.field1150 = 32;
		}

		var9.field1151 = arg2;
		return var9;
	}

	@ObfuscatedName("HJAQAKAW.a(B)V")
	public static final void method230() {
		field744 = null;
		field752 = null;
		field772 = null;
		field769 = null;
		field748 = null;
	}

	@ObfuscatedName("HJAQAKAW.a(ZI)Z")
	public final boolean method231(int arg0) {
		int var2 = field764;
		int var3 = field767;
		if (arg0 == 1) {
			var2 = field773;
			var3 = field774;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!VYUQHOMO.method408(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !VYUQHOMO.method408(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("HJAQAKAW.a(I)V")
	public void method232() {
		HJAQAKAW var1 = method237(field776);
		field750 = var1.field750;
		field765 = var1.field765;
		field746 = var1.field746;
		field758 = var1.field758;
		field770 = var1.field770;
		field766 = var1.field766;
		field751 = var1.field751;
		field780 = var1.field780;
		field781 = var1.field781;
		HJAQAKAW var2 = method237(field783);
		field755 = var2.field755;
		field784 = var2.field784;
		field742 = var2.field742;
		String var3 = "a";
		char var4 = var2.field755.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field778 = ("Swap this note at any bank for " + var3 + " " + var2.field755 + ".").getBytes();
		field749 = true;
	}

	@ObfuscatedName("HJAQAKAW.c(II)LVYUQHOMO;")
	public final VYUQHOMO method233(int arg0) {
		int var2 = field764;
		int var3 = field767;
		if (arg0 == 1) {
			var2 = field773;
			var3 = field774;
		}

		if (var2 == -1) {
			return null;
		}

		VYUQHOMO var4 = VYUQHOMO.method407(var2);
		if (var3 != -1) {
			VYUQHOMO var5 = VYUQHOMO.method407(var3);
			VYUQHOMO[] var6 = new VYUQHOMO[] { var4, var5 };
			var4 = new VYUQHOMO(var6, 2);
		}

		if (field780 != null) {
			for (int var7 = 0; var7 < field780.length; var7++) {
				var4.method421(field780[var7], field781[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HJAQAKAW.a(IB)LVYUQHOMO;")
	public final VYUQHOMO method234(int arg0) {
		int var2 = field753;
		int var3 = field782;
		int var4 = field743;
		if (arg0 == 1) {
			var2 = field754;
			var3 = field756;
			var4 = field760;
		}

		if (var2 == -1) {
			return null;
		}

		VYUQHOMO var5 = VYUQHOMO.method407(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				VYUQHOMO var9 = VYUQHOMO.method407(var3);
				VYUQHOMO[] var10 = new VYUQHOMO[] { var5, var9 };
				var5 = new VYUQHOMO(var10, 2);
			} else {
				VYUQHOMO var6 = VYUQHOMO.method407(var3);
				VYUQHOMO var7 = VYUQHOMO.method407(var4);
				VYUQHOMO[] var8 = new VYUQHOMO[] { var5, var6, var7 };
				var5 = new VYUQHOMO(var8, 3);
			}
		}

		if (arg0 == 0 && field762 != 0) {
			var5.method420(0, field762, 0);
		}

		if (arg0 == 1 && field768 != 0) {
			var5.method420(0, field768, 0);
		}

		if (field780 != null) {
			for (int var11 = 0; var11 < field780.length; var11++) {
				var5.method421(field780[var11], field781[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("HJAQAKAW.a(ZLXGRGMPUQ;)V")
	public final void method235(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field750 = arg0.method467();
			} else if (var2 == 2) {
				field755 = arg0.method472();
			} else if (var2 == 3) {
				field778 = arg0.method473();
			} else if (var2 == 4) {
				field765 = arg0.method467();
			} else if (var2 == 5) {
				field746 = arg0.method467();
			} else if (var2 == 6) {
				field758 = arg0.method467();
			} else if (var2 == 7) {
				field766 = arg0.method467();
				if (field766 > 32767) {
					field766 -= 0x10000;
				}
			} else if (var2 == 8) {
				field751 = arg0.method467();
				if (field751 > 32767) {
					field751 -= 0x10000;
				}
			} else if (var2 == 10) {
				field757 = arg0.method467();
			} else if (var2 == 11) {
				field749 = true;
			} else if (var2 == 12) {
				field742 = arg0.method470();
			} else if (var2 == 16) {
				field784 = true;
			} else if (var2 == 23) {
				field753 = arg0.method467();
				field762 = arg0.method466();
			} else if (var2 == 24) {
				field782 = arg0.method467();
			} else if (var2 == 25) {
				field754 = arg0.method467();
				field768 = arg0.method466();
			} else if (var2 == 26) {
				field756 = arg0.method467();
			} else if (var2 >= 30 && var2 < 35) {
				if (field737 == null) {
					field737 = new String[5];
				}

				field737[var2 - 30] = arg0.method472();
				if (field737[var2 - 30].equalsIgnoreCase("hidden")) {
					field737[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field747 == null) {
					field747 = new String[5];
				}

				field747[var2 - 35] = arg0.method472();
			} else if (var2 == 40) {
				int var3 = arg0.method465();
				field780 = new int[var3];
				field781 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field780[var4] = arg0.method467();
					field781[var4] = arg0.method467();
				}
			} else if (var2 == 78) {
				field743 = arg0.method467();
			} else if (var2 == 79) {
				field760 = arg0.method467();
			} else if (var2 == 90) {
				field764 = arg0.method467();
			} else if (var2 == 91) {
				field773 = arg0.method467();
			} else if (var2 == 92) {
				field767 = arg0.method467();
			} else if (var2 == 93) {
				field774 = arg0.method467();
			} else if (var2 == 95) {
				field770 = arg0.method467();
			} else if (var2 == 97) {
				field783 = arg0.method467();
			} else if (var2 == 98) {
				field776 = arg0.method467();
			} else if (var2 >= 100 && var2 < 110) {
				if (field739 == null) {
					field739 = new int[10];
					field779 = new int[10];
				}

				field739[var2 - 100] = arg0.method467();
				field779[var2 - 100] = arg0.method467();
			} else if (var2 == 110) {
				field775 = arg0.method467();
			} else if (var2 == 111) {
				field741 = arg0.method467();
			} else if (var2 == 112) {
				field777 = arg0.method467();
			} else if (var2 == 113) {
				field738 = arg0.method466();
			} else if (var2 == 114) {
				field759 = arg0.method466() * 5;
			} else if (var2 == 115) {
				field771 = arg0.method465();
			}
		}
	}

	@ObfuscatedName("HJAQAKAW.b(I)LVYUQHOMO;")
	public final VYUQHOMO method236(int arg0) {
		if (field739 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field779[var3] && field779[var3] != 0) {
					var2 = field739[var3];
				}
			}

			if (var2 != -1) {
				return method237(var2).method236(1);
			}
		}

		VYUQHOMO var4 = (VYUQHOMO) field744.method193(field740);
		if (var4 != null) {
			return var4;
		}

		VYUQHOMO var5 = VYUQHOMO.method407(field750);
		if (var5 == null) {
			return null;
		}

		if (field775 != 128 || field741 != 128 || field777 != 128) {
			var5.method423(field777, field741, field775);
		}

		if (field780 != null) {
			for (int var6 = 0; var6 < field780.length; var6++) {
				var5.method421(field780[var6], field781[var6]);
			}
		}

		var5.method424(field738 + 64, field759 + 768, -50, -10, -50, true);
		var5.field1324 = true;
		field744.method194(field740, var5);
		return var5;
	}

	@ObfuscatedName("HJAQAKAW.c(I)LHJAQAKAW;")
	public static final HJAQAKAW method237(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field769[var1].field740 == arg0) {
				return field769[var1];
			}
		}

		field763 = (field763 + 1) % 10;
		HJAQAKAW var2 = field769[field763];
		field748.field1432 = field772[arg0];
		var2.field740 = arg0;
		var2.method226();
		var2.method235(field748);

		if (var2.field776 != -1) {
			var2.method232();
		}

		if (!field745 && var2.field784) {
			var2.field755 = "Members Object";
			var2.field778 = "Login to a members' server to use this object.".getBytes();
			var2.field737 = null;
			var2.field747 = null;
			var2.field771 = 0;
		}

		return var2;
	}
}
