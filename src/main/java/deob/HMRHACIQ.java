package deob;

@ObfuscatedName("HMRHACIQ")
public final class HMRHACIQ {

	@ObfuscatedName("HMRHACIQ.X")
	public int field756 = -1;

	@ObfuscatedName("HMRHACIQ.c")
	public static boolean field712 = true;

	@ObfuscatedName("HMRHACIQ.q")
	public static HPFNYARJ field725 = new HPFNYARJ(100);

	@ObfuscatedName("HMRHACIQ.O")
	public static HPFNYARJ field747 = new HPFNYARJ(50);

	@ObfuscatedName("HMRHACIQ.b")
	public byte field711;

	@ObfuscatedName("HMRHACIQ.t")
	public byte field728;

	@ObfuscatedName("HMRHACIQ.a")
	public int field710;

	@ObfuscatedName("HMRHACIQ.d")
	public int field713;

	@ObfuscatedName("HMRHACIQ.e")
	public int field714;

	@ObfuscatedName("HMRHACIQ.f")
	public int field715;

	@ObfuscatedName("HMRHACIQ.g")
	public int field716;

	@ObfuscatedName("HMRHACIQ.h")
	public int field717;

	@ObfuscatedName("HMRHACIQ.i")
	public int field718;

	@ObfuscatedName("HMRHACIQ.k")
	public int field719;

	@ObfuscatedName("HMRHACIQ.m")
	public int field721;

	@ObfuscatedName("HMRHACIQ.o")
	public int field723;

	@ObfuscatedName("HMRHACIQ.r")
	public int field726;

	@ObfuscatedName("HMRHACIQ.s")
	public int field727;

	@ObfuscatedName("HMRHACIQ.v")
	public int field730;

	@ObfuscatedName("HMRHACIQ.w")
	public static int field731;

	@ObfuscatedName("HMRHACIQ.B")
	public int field735;

	@ObfuscatedName("HMRHACIQ.C")
	public int field736;

	@ObfuscatedName("HMRHACIQ.F")
	public int field739;

	@ObfuscatedName("HMRHACIQ.G")
	public int field740;

	@ObfuscatedName("HMRHACIQ.H")
	public int field741;

	@ObfuscatedName("HMRHACIQ.K")
	public int field743;

	@ObfuscatedName("HMRHACIQ.L")
	public int field744;

	@ObfuscatedName("HMRHACIQ.M")
	public int field745;

	@ObfuscatedName("HMRHACIQ.N")
	public int field746;

	@ObfuscatedName("HMRHACIQ.P")
	public int field748;

	@ObfuscatedName("HMRHACIQ.Q")
	public int field749;

	@ObfuscatedName("HMRHACIQ.R")
	public int field750;

	@ObfuscatedName("HMRHACIQ.S")
	public int field751;

	@ObfuscatedName("HMRHACIQ.T")
	public int field752;

	@ObfuscatedName("HMRHACIQ.U")
	public static int field753;

	@ObfuscatedName("HMRHACIQ.J")
	public static XOUQUKZW field742;

	@ObfuscatedName("HMRHACIQ.Y")
	public String field757;

	@ObfuscatedName("HMRHACIQ.u")
	public boolean field729;

	@ObfuscatedName("HMRHACIQ.V")
	public boolean field754;

	@ObfuscatedName("HMRHACIQ.l")
	public byte[] field720;

	@ObfuscatedName("HMRHACIQ.p")
	public int[] field724;

	@ObfuscatedName("HMRHACIQ.x")
	public int[] field732;

	@ObfuscatedName("HMRHACIQ.y")
	public int[] field733;

	@ObfuscatedName("HMRHACIQ.D")
	public static int[] field737;

	@ObfuscatedName("HMRHACIQ.E")
	public int[] field738;

	@ObfuscatedName("HMRHACIQ.z")
	public static HMRHACIQ[] field734;

	@ObfuscatedName("HMRHACIQ.n")
	public String[] field722;

	@ObfuscatedName("HMRHACIQ.W")
	public String[] field755;

	@ObfuscatedName("HMRHACIQ.a(II)LKPUOCBCE;")
	public final KPUOCBCE method289(int arg0) {
		int var2 = field748;
		int var3 = field718;
		int var4 = field745;
		if (arg0 == 1) {
			var2 = field744;
			var3 = field714;
			var4 = field716;
		}

		if (var2 == -1) {
			return null;
		}

		KPUOCBCE var5 = KPUOCBCE.method379(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				KPUOCBCE var9 = KPUOCBCE.method379(var3);
				KPUOCBCE[] var10 = new KPUOCBCE[] { var5, var9 };
				var5 = new KPUOCBCE(2, var10);
			} else {
				KPUOCBCE var6 = KPUOCBCE.method379(var3);
				KPUOCBCE var7 = KPUOCBCE.method379(var4);
				KPUOCBCE[] var8 = new KPUOCBCE[] { var5, var6, var7 };
				var5 = new KPUOCBCE(3, var8);
			}
		}

		if (arg0 == 0 && field711 != 0) {
			var5.method392(0, 0, field711);
		}

		if (arg0 == 1 && field728 != 0) {
			var5.method392(0, 0, field728);
		}

		if (field732 != null) {
			for (int var11 = 0; var11 < field732.length; var11++) {
				var5.method393(field732[var11], field724[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("HMRHACIQ.b(II)LKPUOCBCE;")
	public final KPUOCBCE method290(int arg0) {
		if (field733 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field738[var3] && field738[var3] != 0) {
					var2 = field733[var3];
				}
			}

			if (var2 != -1) {
				return method293(var2).method290(1);
			}
		}

		KPUOCBCE var4 = KPUOCBCE.method379(field740);
		if (var4 == null) {
			return null;
		}

		if (field732 != null) {
			for (int var5 = 0; var5 < field732.length; var5++) {
				var4.method393(field732[var5], field724[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HMRHACIQ.c(II)Z")
	public final boolean method291(int arg0) {
		int var2 = field719;
		int var3 = field735;
		if (arg0 == 1) {
			var2 = field746;
			var3 = field730;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!KPUOCBCE.method380(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !KPUOCBCE.method380(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("HMRHACIQ.a(IIII)LVDSDFSIV;")
	public static final VDSDFSIV method292(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			VDSDFSIV var3 = (VDSDFSIV) field725.method302(arg2);
			if (var3 != null && var3.field1344 != arg0 && var3.field1344 != -1) {
				var3.method471();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		HMRHACIQ var4 = method293(arg2);
		if (var4.field733 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field738[var6] && var4.field738[var6] != 0) {
					var5 = var4.field733[var6];
				}
			}

			if (var5 != -1) {
				var4 = method293(var5);
			}
		}

		KPUOCBCE var7 = var4.method301(1);
		if (var7 == null) {
			return null;
		}

		VDSDFSIV var8 = null;
		if (var4.field749 != -1) {
			var8 = method292(10, -1, var4.field752);
			if (var8 == null) {
				return null;
			}
		}

		VDSDFSIV var9 = new VDSDFSIV(32, 32);
		int var10 = OIDJTTQC.field1054;
		int var11 = OIDJTTQC.field1055;
		int[] var12 = OIDJTTQC.field1060;
		int[] var13 = IIPNJDNO.field811;
		int var14 = IIPNJDNO.field812;
		int var15 = IIPNJDNO.field813;
		int var16 = IIPNJDNO.field816;
		int var17 = IIPNJDNO.field817;
		int var18 = IIPNJDNO.field814;
		int var19 = IIPNJDNO.field815;
		OIDJTTQC.field1052 = false;
		IIPNJDNO.method317(var9.field1338, 32, 32);
		IIPNJDNO.method322(0, 0, 0, 32, 32);
		OIDJTTQC.method432();
		int var20 = var4.field721;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = OIDJTTQC.field1058[var4.field723] * var20 >> 16;
		int var22 = OIDJTTQC.field1059[var4.field723] * var20 >> 16;
		var7.method399(0, var4.field713, var4.field715, var4.field723, var4.field741, var7.field1380 / 2 + var21 + var4.field739, var4.field739 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1338[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1338[var24 * 32 + var23 - 1] > 1) {
						var9.field1338[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1338[(var24 - 1) * 32 + var23] > 1) {
						var9.field1338[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1338[var24 * 32 + var23 + 1] > 1) {
						var9.field1338[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1338[(var24 + 1) * 32 + var23] > 1) {
						var9.field1338[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1338[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1338[var26 * 32 + var25 - 1] == 1) {
							var9.field1338[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1338[(var26 - 1) * 32 + var25] == 1) {
							var9.field1338[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1338[var26 * 32 + var25 + 1] == 1) {
							var9.field1338[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1338[(var26 + 1) * 32 + var25] == 1) {
							var9.field1338[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1338[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1338[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1338[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field749 != -1) {
			int var29 = var8.field1343;
			int var30 = var8.field1344;
			var8.field1343 = 32;
			var8.field1344 = 32;
			var8.method499(0, 0);
			var8.field1343 = var29;
			var8.field1344 = var30;
		}

		if (arg1 == 0) {
			field725.method303(arg2, var9);
		}

		IIPNJDNO.method317(var13, var15, var14);
		IIPNJDNO.method319(var17, var18, var16, var19);
		OIDJTTQC.field1054 = var10;
		OIDJTTQC.field1055 = var11;
		OIDJTTQC.field1060 = var12;
		OIDJTTQC.field1052 = true;

		if (var4.field729) {
			var9.field1343 = 33;
		} else {
			var9.field1343 = 32;
		}

		var9.field1344 = arg0;
		return var9;
	}

	@ObfuscatedName("HMRHACIQ.a(I)LHMRHACIQ;")
	public static final HMRHACIQ method293(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field734[var1].field756 == arg0) {
				return field734[var1];
			}
		}

		field753 = (field753 + 1) % 10;
		HMRHACIQ var2 = field734[field753];
		field742.field1367 = field737[arg0];
		var2.field756 = arg0;
		var2.method295();
		var2.method299(field742);

		if (var2.field749 != -1) {
			var2.method298();
		}

		if (!field712 && var2.field754) {
			var2.field757 = "Members Object";
			var2.field720 = "Login to a members' server to use this object.".getBytes();
			var2.field722 = null;
			var2.field755 = null;
			var2.field717 = 0;
		}

		return var2;
	}

	@ObfuscatedName("HMRHACIQ.a(BI)Z")
	public final boolean method294(int arg0) {
		int var2 = field748;
		int var3 = field718;
		int var4 = field745;
		if (arg0 == 1) {
			var2 = field744;
			var3 = field714;
			var4 = field716;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!KPUOCBCE.method380(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !KPUOCBCE.method380(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !KPUOCBCE.method380(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("HMRHACIQ.a()V")
	public final void method295() {
		field740 = 0;
		field757 = null;
		field720 = null;
		field732 = null;
		field724 = null;
		field721 = 2000;
		field723 = 0;
		field713 = 0;
		field715 = 0;
		field741 = 0;
		field739 = 0;
		field727 = -1;
		field729 = false;
		field750 = 1;
		field754 = false;
		field722 = null;
		field755 = null;
		field748 = -1;
		field718 = -1;
		field711 = 0;
		field744 = -1;
		field714 = -1;
		field728 = 0;
		field745 = -1;
		field716 = -1;
		field719 = -1;
		field735 = -1;
		field746 = -1;
		field730 = -1;
		field733 = null;
		field738 = null;
		field752 = -1;
		field749 = -1;
		field751 = 128;
		field743 = 128;
		field726 = 128;
		field710 = 0;
		field736 = 0;
		field717 = 0;
	}

	@ObfuscatedName("HMRHACIQ.b(I)V")
	public static final void method296() {
		field747 = null;
		field725 = null;
		field737 = null;
		field734 = null;
		field742 = null;
	}

	@ObfuscatedName("HMRHACIQ.a(IB)LKPUOCBCE;")
	public final KPUOCBCE method297(int arg0) {
		int var2 = field719;
		int var3 = field735;
		if (arg0 == 1) {
			var2 = field746;
			var3 = field730;
		}

		if (var2 == -1) {
			return null;
		}

		KPUOCBCE var4 = KPUOCBCE.method379(var2);
		if (var3 != -1) {
			KPUOCBCE var5 = KPUOCBCE.method379(var3);
			KPUOCBCE[] var6 = new KPUOCBCE[] { var4, var5 };
			var4 = new KPUOCBCE(2, var6);
		}

		if (field732 != null) {
			for (int var7 = 0; var7 < field732.length; var7++) {
				var4.method393(field732[var7], field724[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HMRHACIQ.c(I)V")
	public void method298() {
		HMRHACIQ var1 = method293(field749);
		field740 = var1.field740;
		field721 = var1.field721;
		field723 = var1.field723;
		field713 = var1.field713;
		field715 = var1.field715;
		field741 = var1.field741;
		field739 = var1.field739;
		field732 = var1.field732;
		field724 = var1.field724;
		HMRHACIQ var2 = method293(field752);
		field757 = var2.field757;
		field754 = var2.field754;
		field750 = var2.field750;
		String var3 = "a";
		char var4 = var2.field757.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field720 = ("Swap this note at any bank for " + var3 + " " + var2.field757 + ".").getBytes();
		field729 = true;
	}

	@ObfuscatedName("HMRHACIQ.a(BLXOUQUKZW;)V")
	public final void method299(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field740 = arg0.method523();
			} else if (var2 == 2) {
				field757 = arg0.method528();
			} else if (var2 == 3) {
				field720 = arg0.method529();
			} else if (var2 == 4) {
				field721 = arg0.method523();
			} else if (var2 == 5) {
				field723 = arg0.method523();
			} else if (var2 == 6) {
				field713 = arg0.method523();
			} else if (var2 == 7) {
				field741 = arg0.method523();
				if (field741 > 32767) {
					field741 -= 0x10000;
				}
			} else if (var2 == 8) {
				field739 = arg0.method523();
				if (field739 > 32767) {
					field739 -= 0x10000;
				}
			} else if (var2 == 10) {
				field727 = arg0.method523();
			} else if (var2 == 11) {
				field729 = true;
			} else if (var2 == 12) {
				field750 = arg0.method526();
			} else if (var2 == 16) {
				field754 = true;
			} else if (var2 == 23) {
				field748 = arg0.method523();
				field711 = arg0.method522();
			} else if (var2 == 24) {
				field718 = arg0.method523();
			} else if (var2 == 25) {
				field744 = arg0.method523();
				field728 = arg0.method522();
			} else if (var2 == 26) {
				field714 = arg0.method523();
			} else if (var2 >= 30 && var2 < 35) {
				if (field722 == null) {
					field722 = new String[5];
				}

				field722[var2 - 30] = arg0.method528();
				if (field722[var2 - 30].equalsIgnoreCase("hidden")) {
					field722[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field755 == null) {
					field755 = new String[5];
				}

				field755[var2 - 35] = arg0.method528();
			} else if (var2 == 40) {
				int var3 = arg0.method521();
				field732 = new int[var3];
				field724 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field732[var4] = arg0.method523();
					field724[var4] = arg0.method523();
				}
			} else if (var2 == 78) {
				field745 = arg0.method523();
			} else if (var2 == 79) {
				field716 = arg0.method523();
			} else if (var2 == 90) {
				field719 = arg0.method523();
			} else if (var2 == 91) {
				field746 = arg0.method523();
			} else if (var2 == 92) {
				field735 = arg0.method523();
			} else if (var2 == 93) {
				field730 = arg0.method523();
			} else if (var2 == 95) {
				field715 = arg0.method523();
			} else if (var2 == 97) {
				field752 = arg0.method523();
			} else if (var2 == 98) {
				field749 = arg0.method523();
			} else if (var2 >= 100 && var2 < 110) {
				if (field733 == null) {
					field733 = new int[10];
					field738 = new int[10];
				}

				field733[var2 - 100] = arg0.method523();
				field738[var2 - 100] = arg0.method523();
			} else if (var2 == 110) {
				field751 = arg0.method523();
			} else if (var2 == 111) {
				field743 = arg0.method523();
			} else if (var2 == 112) {
				field726 = arg0.method523();
			} else if (var2 == 113) {
				field710 = arg0.method522();
			} else if (var2 == 114) {
				field736 = arg0.method522() * 5;
			} else if (var2 == 115) {
				field717 = arg0.method521();
			}
		}
	}

	@ObfuscatedName("HMRHACIQ.a(LCVNWKEAW;)V")
	public static final void method300(CVNWKEAW arg0) {
		field742 = new XOUQUKZW(arg0.method180("obj.dat", null));
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("obj.idx", null));
		field731 = var1.method523();
		field737 = new int[field731];
		int var2 = 2;
		for (int var3 = 0; var3 < field731; var3++) {
			field737[var3] = var2;
			var2 += var1.method523();
		}

		field734 = new HMRHACIQ[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field734[var4] = new HMRHACIQ();
		}
	}

	@ObfuscatedName("HMRHACIQ.d(I)LKPUOCBCE;")
	public final KPUOCBCE method301(int arg0) {
		if (field733 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field738[var3] && field738[var3] != 0) {
					var2 = field733[var3];
				}
			}

			if (var2 != -1) {
				return method293(var2).method301(1);
			}
		}

		KPUOCBCE var4 = (KPUOCBCE) field747.method302(field756);
		if (var4 != null) {
			return var4;
		}

		KPUOCBCE var5 = KPUOCBCE.method379(field740);
		if (var5 == null) {
			return null;
		}

		if (field751 != 128 || field743 != 128 || field726 != 128) {
			var5.method395(field751, field743, field726);
		}

		if (field732 != null) {
			for (int var6 = 0; var6 < field732.length; var6++) {
				var5.method393(field732[var6], field724[var6]);
			}
		}

		var5.method396(field710 + 64, field736 + 768, -50, -10, -50, true);
		var5.field890 = true;
		field747.method303(field756, var5);
		return var5;
	}
}
