package deob;

@ObfuscatedName("LGNJKIJR")
public final class LGNJKIJR {

	@ObfuscatedName("LGNJKIJR.p")
	public int field1005 = -1;

	@ObfuscatedName("LGNJKIJR.z")
	public static JETHVCIV field1015 = new JETHVCIV(50);

	@ObfuscatedName("LGNJKIJR.M")
	public static boolean field1027 = true;

	@ObfuscatedName("LGNJKIJR.Q")
	public static JETHVCIV field1031 = new JETHVCIV(100);

	@ObfuscatedName("LGNJKIJR.B")
	public byte field1017;

	@ObfuscatedName("LGNJKIJR.T")
	public byte field1033;

	@ObfuscatedName("LGNJKIJR.j")
	public int field1000;

	@ObfuscatedName("LGNJKIJR.l")
	public int field1001;

	@ObfuscatedName("LGNJKIJR.m")
	public int field1002;

	@ObfuscatedName("LGNJKIJR.n")
	public static int field1003;

	@ObfuscatedName("LGNJKIJR.o")
	public int field1004;

	@ObfuscatedName("LGNJKIJR.r")
	public int field1007;

	@ObfuscatedName("LGNJKIJR.s")
	public int field1008;

	@ObfuscatedName("LGNJKIJR.u")
	public int field1010;

	@ObfuscatedName("LGNJKIJR.v")
	public int field1011;

	@ObfuscatedName("LGNJKIJR.x")
	public int field1013;

	@ObfuscatedName("LGNJKIJR.y")
	public int field1014;

	@ObfuscatedName("LGNJKIJR.A")
	public int field1016;

	@ObfuscatedName("LGNJKIJR.C")
	public int field1018;

	@ObfuscatedName("LGNJKIJR.D")
	public int field1019;

	@ObfuscatedName("LGNJKIJR.E")
	public int field1020;

	@ObfuscatedName("LGNJKIJR.F")
	public int field1021;

	@ObfuscatedName("LGNJKIJR.G")
	public int field1022;

	@ObfuscatedName("LGNJKIJR.I")
	public int field1024;

	@ObfuscatedName("LGNJKIJR.J")
	public int field1025;

	@ObfuscatedName("LGNJKIJR.N")
	public int field1028;

	@ObfuscatedName("LGNJKIJR.O")
	public int field1029;

	@ObfuscatedName("LGNJKIJR.S")
	public int field1032;

	@ObfuscatedName("LGNJKIJR.V")
	public int field1035;

	@ObfuscatedName("LGNJKIJR.X")
	public int field1037;

	@ObfuscatedName("LGNJKIJR.a")
	public int field992;

	@ObfuscatedName("LGNJKIJR.e")
	public static int field996;

	@ObfuscatedName("LGNJKIJR.f")
	public int field997;

	@ObfuscatedName("LGNJKIJR.g")
	public int field998;

	@ObfuscatedName("LGNJKIJR.h")
	public int field999;

	@ObfuscatedName("LGNJKIJR.q")
	public static BJPWOXRJ field1006;

	@ObfuscatedName("LGNJKIJR.w")
	public String field1012;

	@ObfuscatedName("LGNJKIJR.P")
	public boolean field1030;

	@ObfuscatedName("LGNJKIJR.W")
	public boolean field1036;

	@ObfuscatedName("LGNJKIJR.d")
	public byte[] field995;

	@ObfuscatedName("LGNJKIJR.t")
	public int[] field1009;

	@ObfuscatedName("LGNJKIJR.K")
	public int[] field1026;

	@ObfuscatedName("LGNJKIJR.U")
	public int[] field1034;

	@ObfuscatedName("LGNJKIJR.Z")
	public int[] field1038;

	@ObfuscatedName("LGNJKIJR.ab")
	public static int[] field1039;

	@ObfuscatedName("LGNJKIJR.c")
	public static LGNJKIJR[] field994;

	@ObfuscatedName("LGNJKIJR.H")
	public String[] field1023;

	@ObfuscatedName("LGNJKIJR.b")
	public String[] field993;

	@ObfuscatedName("LGNJKIJR.a(ILBJPWOXRJ;)V")
	public final void method408(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1014 = arg0.method17();
			} else if (var2 == 2) {
				field1012 = arg0.method22();
			} else if (var2 == 3) {
				field995 = arg0.method23();
			} else if (var2 == 4) {
				field1004 = arg0.method17();
			} else if (var2 == 5) {
				field1037 = arg0.method17();
			} else if (var2 == 6) {
				field1011 = arg0.method17();
			} else if (var2 == 7) {
				field992 = arg0.method17();
				if (field992 > 32767) {
					field992 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1008 = arg0.method17();
				if (field1008 > 32767) {
					field1008 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1007 = arg0.method17();
			} else if (var2 == 11) {
				field1036 = true;
			} else if (var2 == 12) {
				field997 = arg0.method20();
			} else if (var2 == 16) {
				field1030 = true;
			} else if (var2 == 23) {
				field1019 = arg0.method17();
				field1033 = arg0.method16();
			} else if (var2 == 24) {
				field1018 = arg0.method17();
			} else if (var2 == 25) {
				field1002 = arg0.method17();
				field1017 = arg0.method16();
			} else if (var2 == 26) {
				field1028 = arg0.method17();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1023 == null) {
					field1023 = new String[5];
				}

				field1023[var2 - 30] = arg0.method22();
				if (field1023[var2 - 30].equalsIgnoreCase("hidden")) {
					field1023[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field993 == null) {
					field993 = new String[5];
				}

				field993[var2 - 35] = arg0.method22();
			} else if (var2 == 40) {
				int var3 = arg0.method15();
				field1034 = new int[var3];
				field1026 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1034[var4] = arg0.method17();
					field1026[var4] = arg0.method17();
				}
			} else if (var2 == 78) {
				field1024 = arg0.method17();
			} else if (var2 == 79) {
				field1025 = arg0.method17();
			} else if (var2 == 90) {
				field1020 = arg0.method17();
			} else if (var2 == 91) {
				field1022 = arg0.method17();
			} else if (var2 == 92) {
				field1035 = arg0.method17();
			} else if (var2 == 93) {
				field1032 = arg0.method17();
			} else if (var2 == 95) {
				field1001 = arg0.method17();
			} else if (var2 == 97) {
				field1000 = arg0.method17();
			} else if (var2 == 98) {
				field998 = arg0.method17();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1009 == null) {
					field1009 = new int[10];
					field1038 = new int[10];
				}

				field1009[var2 - 100] = arg0.method17();
				field1038[var2 - 100] = arg0.method17();
			} else if (var2 == 110) {
				field1016 = arg0.method17();
			} else if (var2 == 111) {
				field1013 = arg0.method17();
			} else if (var2 == 112) {
				field1029 = arg0.method17();
			} else if (var2 == 113) {
				field999 = arg0.method16();
			} else if (var2 == 114) {
				field1021 = arg0.method16() * 5;
			} else if (var2 == 115) {
				field1010 = arg0.method15();
			}
		}
	}

	@ObfuscatedName("LGNJKIJR.a(I)LLGNJKIJR;")
	public static final LGNJKIJR method409(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field994[var1].field1005 == arg0) {
				return field994[var1];
			}
		}

		field996 = (field996 + 1) % 10;
		LGNJKIJR var2 = field994[field996];
		field1006.field5 = field1039[arg0];
		var2.field1005 = arg0;
		var2.method413();
		var2.method408(field1006);

		if (var2.field998 != -1) {
			var2.method417();
		}

		if (!field1027 && var2.field1030) {
			var2.field1012 = "Members Object";
			var2.field995 = "Login to a members' server to use this object.".getBytes();
			var2.field1023 = null;
			var2.field993 = null;
			var2.field1010 = 0;
		}

		return var2;
	}

	@ObfuscatedName("LGNJKIJR.a(ZI)LJLNSJQDR;")
	public final JLNSJQDR method410(int arg0) {
		int var2 = field1020;
		int var3 = field1035;
		if (arg0 == 1) {
			var2 = field1022;
			var3 = field1032;
		}

		if (var2 == -1) {
			return null;
		}

		JLNSJQDR var4 = JLNSJQDR.method328(var2);
		if (var3 != -1) {
			JLNSJQDR var5 = JLNSJQDR.method328(var3);
			JLNSJQDR[] var6 = new JLNSJQDR[] { var4, var5 };
			var4 = new JLNSJQDR(2, var6);
		}

		if (field1034 != null) {
			for (int var7 = 0; var7 < field1034.length; var7++) {
				var4.method342(field1034[var7], field1026[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("LGNJKIJR.a(BI)Z")
	public final boolean method411(int arg0) {
		int var2 = field1019;
		int var3 = field1018;
		int var4 = field1024;
		if (arg0 == 1) {
			var2 = field1002;
			var3 = field1028;
			var4 = field1025;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!JLNSJQDR.method329(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !JLNSJQDR.method329(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !JLNSJQDR.method329(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("LGNJKIJR.a(II)LJLNSJQDR;")
	public final JLNSJQDR method412(int arg0) {
		int var2 = field1019;
		int var3 = field1018;
		int var4 = field1024;
		if (arg0 == 1) {
			var2 = field1002;
			var3 = field1028;
			var4 = field1025;
		}

		if (var2 == -1) {
			return null;
		}

		JLNSJQDR var5 = JLNSJQDR.method328(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				JLNSJQDR var9 = JLNSJQDR.method328(var3);
				JLNSJQDR[] var10 = new JLNSJQDR[] { var5, var9 };
				var5 = new JLNSJQDR(2, var10);
			} else {
				JLNSJQDR var6 = JLNSJQDR.method328(var3);
				JLNSJQDR var7 = JLNSJQDR.method328(var4);
				JLNSJQDR[] var8 = new JLNSJQDR[] { var5, var6, var7 };
				var5 = new JLNSJQDR(3, var8);
			}
		}

		if (arg0 == 0 && field1033 != 0) {
			var5.method341(field1033, 0, 0);
		}

		if (arg0 == 1 && field1017 != 0) {
			var5.method341(field1017, 0, 0);
		}

		if (field1034 != null) {
			for (int var11 = 0; var11 < field1034.length; var11++) {
				var5.method342(field1034[var11], field1026[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("LGNJKIJR.a()V")
	public final void method413() {
		field1014 = 0;
		field1012 = null;
		field995 = null;
		field1034 = null;
		field1026 = null;
		field1004 = 2000;
		field1037 = 0;
		field1011 = 0;
		field1001 = 0;
		field992 = 0;
		field1008 = 0;
		field1007 = -1;
		field1036 = false;
		field997 = 1;
		field1030 = false;
		field1023 = null;
		field993 = null;
		field1019 = -1;
		field1018 = -1;
		field1033 = 0;
		field1002 = -1;
		field1028 = -1;
		field1017 = 0;
		field1024 = -1;
		field1025 = -1;
		field1020 = -1;
		field1035 = -1;
		field1022 = -1;
		field1032 = -1;
		field1009 = null;
		field1038 = null;
		field1000 = -1;
		field998 = -1;
		field1016 = 128;
		field1013 = 128;
		field1029 = 128;
		field999 = 0;
		field1021 = 0;
		field1010 = 0;
	}

	@ObfuscatedName("LGNJKIJR.b(BI)Z")
	public final boolean method414(int arg0) {
		int var2 = field1020;
		int var3 = field1035;
		if (arg0 == 1) {
			var2 = field1022;
			var3 = field1032;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!JLNSJQDR.method329(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !JLNSJQDR.method329(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("LGNJKIJR.a(B)V")
	public static final void method415() {
		field1015 = null;
		field1031 = null;
		field1039 = null;
		field994 = null;
		field1006 = null;
	}

	@ObfuscatedName("LGNJKIJR.a(LMNPBQFWE;)V")
	public static final void method416(MNPBQFWE arg0) {
		field1006 = new BJPWOXRJ(arg0.method429("obj.dat", null));
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("obj.idx", null));
		field1003 = var1.method17();
		field1039 = new int[field1003];
		int var2 = 2;
		for (int var3 = 0; var3 < field1003; var3++) {
			field1039[var3] = var2;
			var2 += var1.method17();
		}

		field994 = new LGNJKIJR[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field994[var4] = new LGNJKIJR();
		}
	}

	@ObfuscatedName("LGNJKIJR.b(I)V")
	public void method417() {
		LGNJKIJR var1 = method409(field998);
		field1014 = var1.field1014;
		field1004 = var1.field1004;
		field1037 = var1.field1037;
		field1011 = var1.field1011;
		field1001 = var1.field1001;
		field992 = var1.field992;
		field1008 = var1.field1008;
		field1034 = var1.field1034;
		field1026 = var1.field1026;
		LGNJKIJR var2 = method409(field1000);
		field1012 = var2.field1012;
		field1030 = var2.field1030;
		field997 = var2.field997;
		String var3 = "a";
		char var4 = var2.field1012.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field995 = ("Swap this note at any bank for " + var3 + " " + var2.field1012 + ".").getBytes();
		field1036 = true;
	}

	@ObfuscatedName("LGNJKIJR.b(II)LJLNSJQDR;")
	public final JLNSJQDR method418(int arg0) {
		if (field1009 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1038[var3] && field1038[var3] != 0) {
					var2 = field1009[var3];
				}
			}

			if (var2 != -1) {
				return method409(var2).method418(1);
			}
		}

		JLNSJQDR var4 = JLNSJQDR.method328(field1014);
		if (var4 == null) {
			return null;
		}

		if (field1034 != null) {
			for (int var5 = 0; var5 < field1034.length; var5++) {
				var4.method342(field1034[var5], field1026[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("LGNJKIJR.a(IIIB)LYZDAHXEQ;")
	public static final YZDAHXEQ method419(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			YZDAHXEQ var3 = (YZDAHXEQ) field1031.method315(arg2);
			if (var3 != null && var3.field1480 != arg1 && var3.field1480 != -1) {
				var3.method430();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		LGNJKIJR var4 = method409(arg2);
		if (var4.field1009 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1038[var6] && var4.field1038[var6] != 0) {
					var5 = var4.field1009[var6];
				}
			}

			if (var5 != -1) {
				var4 = method409(var5);
			}
		}

		JLNSJQDR var7 = var4.method420(1);
		if (var7 == null) {
			return null;
		}

		YZDAHXEQ var8 = null;
		if (var4.field998 != -1) {
			var8 = method419(-1, 10, var4.field1000);
			if (var8 == null) {
				return null;
			}
		}

		YZDAHXEQ var9 = new YZDAHXEQ(32, 32);
		int var10 = FWQLREOO.field604;
		int var11 = FWQLREOO.field605;
		int[] var12 = FWQLREOO.field610;
		int[] var13 = GEFFBGXP.field622;
		int var14 = GEFFBGXP.field623;
		int var15 = GEFFBGXP.field624;
		int var16 = GEFFBGXP.field627;
		int var17 = GEFFBGXP.field628;
		int var18 = GEFFBGXP.field625;
		int var19 = GEFFBGXP.field626;
		FWQLREOO.field602 = false;
		GEFFBGXP.method223(32, 32, var9.field1474);
		GEFFBGXP.method228(0, 32, 32, 0, 0);
		FWQLREOO.method207();
		int var20 = var4.field1004;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = FWQLREOO.field608[var4.field1037] * var20 >> 16;
		int var22 = FWQLREOO.field609[var4.field1037] * var20 >> 16;
		var7.method348(0, var4.field1011, var4.field1001, var4.field1037, var4.field992, var7.field3 / 2 + var21 + var4.field1008, var4.field1008 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1474[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1474[var24 * 32 + var23 - 1] > 1) {
						var9.field1474[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1474[(var24 - 1) * 32 + var23] > 1) {
						var9.field1474[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1474[var24 * 32 + var23 + 1] > 1) {
						var9.field1474[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1474[(var24 + 1) * 32 + var23] > 1) {
						var9.field1474[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1474[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1474[var26 * 32 + var25 - 1] == 1) {
							var9.field1474[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1474[(var26 - 1) * 32 + var25] == 1) {
							var9.field1474[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1474[var26 * 32 + var25 + 1] == 1) {
							var9.field1474[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1474[(var26 + 1) * 32 + var25] == 1) {
							var9.field1474[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1474[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1474[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1474[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field998 != -1) {
			int var29 = var8.field1479;
			int var30 = var8.field1480;
			var8.field1479 = 32;
			var8.field1480 = 32;
			var8.method553(0, 0);
			var8.field1479 = var29;
			var8.field1480 = var30;
		}

		if (arg0 == 0) {
			field1031.method316(var9, arg2);
		}

		GEFFBGXP.method223(var15, var14, var13);
		GEFFBGXP.method225(var19, var16, var17, var18);
		FWQLREOO.field604 = var10;
		FWQLREOO.field605 = var11;
		FWQLREOO.field610 = var12;
		FWQLREOO.field602 = true;

		if (var4.field1036) {
			var9.field1479 = 33;
		} else {
			var9.field1479 = 32;
		}

		var9.field1480 = arg1;
		return var9;
	}

	@ObfuscatedName("LGNJKIJR.c(I)LJLNSJQDR;")
	public final JLNSJQDR method420(int arg0) {
		if (field1009 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1038[var3] && field1038[var3] != 0) {
					var2 = field1009[var3];
				}
			}

			if (var2 != -1) {
				return method409(var2).method420(1);
			}
		}

		JLNSJQDR var4 = (JLNSJQDR) field1015.method315(field1005);
		if (var4 != null) {
			return var4;
		}

		JLNSJQDR var5 = JLNSJQDR.method328(field1014);
		if (var5 == null) {
			return null;
		}

		if (field1016 != 128 || field1013 != 128 || field1029 != 128) {
			var5.method344(field1029, field1013, field1016);
		}

		if (field1034 != null) {
			for (int var6 = 0; var6 < field1034.length; var6++) {
				var5.method342(field1034[var6], field1026[var6]);
			}
		}

		var5.method345(field999 + 64, field1021 + 768, -50, -10, -50, true);
		var5.field855 = true;
		field1015.method316(var5, field1005);
		return var5;
	}
}
