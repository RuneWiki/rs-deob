package deob;

@ObfuscatedName("PZNZFKPU")
public final class PZNZFKPU {

	@ObfuscatedName("PZNZFKPU.i")
	public int field1013 = -1;

	@ObfuscatedName("PZNZFKPU.j")
	public static boolean field1014 = true;

	@ObfuscatedName("PZNZFKPU.y")
	public static RUNMBJUO field1029 = new RUNMBJUO(100);

	@ObfuscatedName("PZNZFKPU.J")
	public static RUNMBJUO field1039 = new RUNMBJUO(50);

	@ObfuscatedName("PZNZFKPU.c")
	public byte field1007;

	@ObfuscatedName("PZNZFKPU.f")
	public byte field1010;

	@ObfuscatedName("PZNZFKPU.b")
	public int field1006;

	@ObfuscatedName("PZNZFKPU.d")
	public int field1008;

	@ObfuscatedName("PZNZFKPU.e")
	public int field1009;

	@ObfuscatedName("PZNZFKPU.g")
	public int field1011;

	@ObfuscatedName("PZNZFKPU.h")
	public int field1012;

	@ObfuscatedName("PZNZFKPU.k")
	public int field1015;

	@ObfuscatedName("PZNZFKPU.m")
	public int field1017;

	@ObfuscatedName("PZNZFKPU.n")
	public int field1018;

	@ObfuscatedName("PZNZFKPU.p")
	public int field1020;

	@ObfuscatedName("PZNZFKPU.q")
	public int field1021;

	@ObfuscatedName("PZNZFKPU.r")
	public int field1022;

	@ObfuscatedName("PZNZFKPU.s")
	public int field1023;

	@ObfuscatedName("PZNZFKPU.w")
	public int field1027;

	@ObfuscatedName("PZNZFKPU.x")
	public int field1028;

	@ObfuscatedName("PZNZFKPU.z")
	public int field1030;

	@ObfuscatedName("PZNZFKPU.B")
	public int field1032;

	@ObfuscatedName("PZNZFKPU.C")
	public static int field1033;

	@ObfuscatedName("PZNZFKPU.E")
	public int field1035;

	@ObfuscatedName("PZNZFKPU.G")
	public static int field1037;

	@ObfuscatedName("PZNZFKPU.I")
	public int field1038;

	@ObfuscatedName("PZNZFKPU.L")
	public int field1040;

	@ObfuscatedName("PZNZFKPU.M")
	public int field1041;

	@ObfuscatedName("PZNZFKPU.N")
	public int field1042;

	@ObfuscatedName("PZNZFKPU.P")
	public int field1044;

	@ObfuscatedName("PZNZFKPU.R")
	public int field1046;

	@ObfuscatedName("PZNZFKPU.T")
	public int field1047;

	@ObfuscatedName("PZNZFKPU.U")
	public int field1048;

	@ObfuscatedName("PZNZFKPU.W")
	public int field1050;

	@ObfuscatedName("PZNZFKPU.X")
	public int field1051;

	@ObfuscatedName("PZNZFKPU.u")
	public static MUKVLYLC field1025;

	@ObfuscatedName("PZNZFKPU.O")
	public String field1043;

	@ObfuscatedName("PZNZFKPU.A")
	public boolean field1031;

	@ObfuscatedName("PZNZFKPU.F")
	public boolean field1036;

	@ObfuscatedName("PZNZFKPU.D")
	public byte[] field1034;

	@ObfuscatedName("PZNZFKPU.l")
	public int[] field1016;

	@ObfuscatedName("PZNZFKPU.o")
	public int[] field1019;

	@ObfuscatedName("PZNZFKPU.t")
	public int[] field1024;

	@ObfuscatedName("PZNZFKPU.Q")
	public static int[] field1045;

	@ObfuscatedName("PZNZFKPU.Y")
	public int[] field1052;

	@ObfuscatedName("PZNZFKPU.a")
	public static PZNZFKPU[] field1005;

	@ObfuscatedName("PZNZFKPU.v")
	public String[] field1026;

	@ObfuscatedName("PZNZFKPU.V")
	public String[] field1049;

	@ObfuscatedName("PZNZFKPU.a(II)Z")
	public final boolean method419(int arg0) {
		int var2 = field1011;
		int var3 = field1021;
		if (arg0 == 1) {
			var2 = field1023;
			var3 = field1022;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!NJPATAFL.method335(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !NJPATAFL.method335(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("PZNZFKPU.a(LFIGUVTWB;)V")
	public static final void method420(FIGUVTWB arg0) {
		field1025 = new MUKVLYLC(arg0.method209("obj.dat", null));
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("obj.idx", null));
		field1037 = var1.method294();
		field1045 = new int[field1037];
		int var2 = 2;
		for (int var3 = 0; var3 < field1037; var3++) {
			field1045[var3] = var2;
			var2 += var1.method294();
		}

		field1005 = new PZNZFKPU[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1005[var4] = new PZNZFKPU();
		}
	}

	@ObfuscatedName("PZNZFKPU.b(II)LNJPATAFL;")
	public final NJPATAFL method421(int arg0) {
		if (field1016 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1052[var3] && field1052[var3] != 0) {
					var2 = field1016[var3];
				}
			}

			if (var2 != -1) {
				return method428(var2).method421(1);
			}
		}

		NJPATAFL var4 = NJPATAFL.method334(field1038);
		if (var4 == null) {
			return null;
		}

		if (field1019 != null) {
			for (int var5 = 0; var5 < field1019.length; var5++) {
				var4.method348(field1019[var5], field1024[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PZNZFKPU.a(I)V")
	public static final void method422() {
		field1039 = null;
		field1029 = null;
		field1045 = null;
		field1005 = null;
		field1025 = null;
	}

	@ObfuscatedName("PZNZFKPU.a()V")
	public final void method423() {
		field1038 = 0;
		field1043 = null;
		field1034 = null;
		field1019 = null;
		field1024 = null;
		field1048 = 2000;
		field1030 = 0;
		field1009 = 0;
		field1044 = 0;
		field1035 = 0;
		field1046 = 0;
		field1008 = -1;
		field1036 = false;
		field1032 = 1;
		field1031 = false;
		field1026 = null;
		field1049 = null;
		field1017 = -1;
		field1027 = -1;
		field1010 = 0;
		field1042 = -1;
		field1015 = -1;
		field1007 = 0;
		field1020 = -1;
		field1047 = -1;
		field1011 = -1;
		field1021 = -1;
		field1023 = -1;
		field1022 = -1;
		field1016 = null;
		field1052 = null;
		field1028 = -1;
		field1050 = -1;
		field1040 = 128;
		field1018 = 128;
		field1051 = 128;
		field1041 = 0;
		field1012 = 0;
		field1006 = 0;
	}

	@ObfuscatedName("PZNZFKPU.a(IIII)LEYTQJNEM;")
	public static final EYTQJNEM method424(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			EYTQJNEM var3 = (EYTQJNEM) field1029.method450(arg2);
			if (var3 != null && var3.field558 != arg0 && var3.field558 != -1) {
				var3.method397();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		PZNZFKPU var4 = method428(arg2);
		if (var4.field1016 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1052[var6] && var4.field1052[var6] != 0) {
					var5 = var4.field1016[var6];
				}
			}

			if (var5 != -1) {
				var4 = method428(var5);
			}
		}

		NJPATAFL var7 = var4.method426(1);
		if (var7 == null) {
			return null;
		}

		EYTQJNEM var8 = null;
		if (var4.field1050 != -1) {
			var8 = method424(10, -1, var4.field1028);
			if (var8 == null) {
				return null;
			}
		}

		EYTQJNEM var9 = new EYTQJNEM(32, 32);
		int var10 = QVVCPQSC.field1090;
		int var11 = QVVCPQSC.field1091;
		int[] var12 = QVVCPQSC.field1096;
		int[] var13 = ACKHPAZA.field1;
		int var14 = ACKHPAZA.field2;
		int var15 = ACKHPAZA.field3;
		int var16 = ACKHPAZA.field6;
		int var17 = ACKHPAZA.field7;
		int var18 = ACKHPAZA.field4;
		int var19 = ACKHPAZA.field5;
		QVVCPQSC.field1088 = false;
		ACKHPAZA.method1(32, var9.field552, 32);
		ACKHPAZA.method6(32, 32, 0, 0, 0);
		QVVCPQSC.method434();
		int var20 = var4.field1048;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = QVVCPQSC.field1094[var4.field1030] * var20 >> 16;
		int var22 = QVVCPQSC.field1095[var4.field1030] * var20 >> 16;
		var7.method354(0, var4.field1009, var4.field1044, var4.field1030, var4.field1035, var7.field771 / 2 + var21 + var4.field1046, var4.field1046 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field552[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field552[var24 * 32 + var23 - 1] > 1) {
						var9.field552[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field552[(var24 - 1) * 32 + var23] > 1) {
						var9.field552[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field552[var24 * 32 + var23 + 1] > 1) {
						var9.field552[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field552[(var24 + 1) * 32 + var23] > 1) {
						var9.field552[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field552[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field552[var26 * 32 + var25 - 1] == 1) {
							var9.field552[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field552[(var26 - 1) * 32 + var25] == 1) {
							var9.field552[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field552[var26 * 32 + var25 + 1] == 1) {
							var9.field552[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field552[(var26 + 1) * 32 + var25] == 1) {
							var9.field552[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field552[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field552[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field552[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1050 != -1) {
			int var29 = var8.field557;
			int var30 = var8.field558;
			var8.field557 = 32;
			var8.field558 = 32;
			var8.method193(0, 0);
			var8.field557 = var29;
			var8.field558 = var30;
		}

		if (arg1 == 0) {
			field1029.method451(arg2, var9);
		}

		ACKHPAZA.method1(var15, var13, var14);
		ACKHPAZA.method3(var18, var17, var16, var19);
		QVVCPQSC.field1090 = var10;
		QVVCPQSC.field1091 = var11;
		QVVCPQSC.field1096 = var12;
		QVVCPQSC.field1088 = true;

		if (var4.field1036) {
			var9.field557 = 33;
		} else {
			var9.field557 = 32;
		}

		var9.field558 = arg0;
		return var9;
	}

	@ObfuscatedName("PZNZFKPU.c(II)LNJPATAFL;")
	public final NJPATAFL method425(int arg0) {
		int var2 = field1017;
		int var3 = field1027;
		int var4 = field1020;
		if (arg0 == 1) {
			var2 = field1042;
			var3 = field1015;
			var4 = field1047;
		}

		if (var2 == -1) {
			return null;
		}

		NJPATAFL var5 = NJPATAFL.method334(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				NJPATAFL var9 = NJPATAFL.method334(var3);
				NJPATAFL[] var10 = new NJPATAFL[] { var5, var9 };
				var5 = new NJPATAFL(var10, 2);
			} else {
				NJPATAFL var6 = NJPATAFL.method334(var3);
				NJPATAFL var7 = NJPATAFL.method334(var4);
				NJPATAFL[] var8 = new NJPATAFL[] { var5, var6, var7 };
				var5 = new NJPATAFL(var8, 3);
			}
		}

		if (arg0 == 0 && field1010 != 0) {
			var5.method347(0, 0, field1010);
		}

		if (arg0 == 1 && field1007 != 0) {
			var5.method347(0, 0, field1007);
		}

		if (field1019 != null) {
			for (int var11 = 0; var11 < field1019.length; var11++) {
				var5.method348(field1019[var11], field1024[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("PZNZFKPU.b(I)LNJPATAFL;")
	public final NJPATAFL method426(int arg0) {
		if (field1016 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1052[var3] && field1052[var3] != 0) {
					var2 = field1016[var3];
				}
			}

			if (var2 != -1) {
				return method428(var2).method426(1);
			}
		}

		NJPATAFL var4 = (NJPATAFL) field1039.method450(field1013);
		if (var4 != null) {
			return var4;
		}

		NJPATAFL var5 = NJPATAFL.method334(field1038);
		if (var5 == null) {
			return null;
		}

		if (field1040 != 128 || field1018 != 128 || field1051 != 128) {
			var5.method350(field1040, field1051, field1018);
		}

		if (field1019 != null) {
			for (int var6 = 0; var6 < field1019.length; var6++) {
				var5.method348(field1019[var6], field1024[var6]);
			}
		}

		var5.method351(field1041 + 64, field1012 + 768, -50, -10, -50, true);
		var5.field875 = true;
		field1039.method451(field1013, var5);
		return var5;
	}

	@ObfuscatedName("PZNZFKPU.d(II)Z")
	public final boolean method427(int arg0) {
		int var2 = field1017;
		int var3 = field1027;
		int var4 = field1020;
		if (arg0 == 1) {
			var2 = field1042;
			var3 = field1015;
			var4 = field1047;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!NJPATAFL.method335(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !NJPATAFL.method335(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !NJPATAFL.method335(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("PZNZFKPU.c(I)LPZNZFKPU;")
	public static final PZNZFKPU method428(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1005[var1].field1013 == arg0) {
				return field1005[var1];
			}
		}

		field1033 = (field1033 + 1) % 10;
		PZNZFKPU var2 = field1005[field1033];
		field1025.field812 = field1045[arg0];
		var2.field1013 = arg0;
		var2.method423();
		var2.method431(field1025);

		if (var2.field1050 != -1) {
			var2.method429();
		}

		if (!field1014 && var2.field1031) {
			var2.field1043 = "Members Object";
			var2.field1034 = "Login to a members' server to use this object.".getBytes();
			var2.field1026 = null;
			var2.field1049 = null;
			var2.field1006 = 0;
		}

		return var2;
	}

	@ObfuscatedName("PZNZFKPU.a(B)V")
	public void method429() {
		PZNZFKPU var1 = method428(field1050);
		field1038 = var1.field1038;
		field1048 = var1.field1048;
		field1030 = var1.field1030;
		field1009 = var1.field1009;
		field1044 = var1.field1044;
		field1035 = var1.field1035;
		field1046 = var1.field1046;
		field1019 = var1.field1019;
		field1024 = var1.field1024;
		PZNZFKPU var2 = method428(field1028);
		field1043 = var2.field1043;
		field1031 = var2.field1031;
		field1032 = var2.field1032;
		String var3 = "a";
		char var4 = var2.field1043.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1034 = ("Swap this note at any bank for " + var3 + " " + var2.field1043 + ".").getBytes();
		field1036 = true;
	}

	@ObfuscatedName("PZNZFKPU.a(BI)LNJPATAFL;")
	public final NJPATAFL method430(int arg0) {
		int var2 = field1011;
		int var3 = field1021;
		if (arg0 == 1) {
			var2 = field1023;
			var3 = field1022;
		}

		if (var2 == -1) {
			return null;
		}

		NJPATAFL var4 = NJPATAFL.method334(var2);
		if (var3 != -1) {
			NJPATAFL var5 = NJPATAFL.method334(var3);
			NJPATAFL[] var6 = new NJPATAFL[] { var4, var5 };
			var4 = new NJPATAFL(var6, 2);
		}

		if (field1019 != null) {
			for (int var7 = 0; var7 < field1019.length; var7++) {
				var4.method348(field1019[var7], field1024[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PZNZFKPU.a(LMUKVLYLC;Z)V")
	public final void method431(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1038 = arg0.method294();
			} else if (var2 == 2) {
				field1043 = arg0.method299();
			} else if (var2 == 3) {
				field1034 = arg0.method300();
			} else if (var2 == 4) {
				field1048 = arg0.method294();
			} else if (var2 == 5) {
				field1030 = arg0.method294();
			} else if (var2 == 6) {
				field1009 = arg0.method294();
			} else if (var2 == 7) {
				field1035 = arg0.method294();
				if (field1035 > 32767) {
					field1035 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1046 = arg0.method294();
				if (field1046 > 32767) {
					field1046 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1008 = arg0.method294();
			} else if (var2 == 11) {
				field1036 = true;
			} else if (var2 == 12) {
				field1032 = arg0.method297();
			} else if (var2 == 16) {
				field1031 = true;
			} else if (var2 == 23) {
				field1017 = arg0.method294();
				field1010 = arg0.method293();
			} else if (var2 == 24) {
				field1027 = arg0.method294();
			} else if (var2 == 25) {
				field1042 = arg0.method294();
				field1007 = arg0.method293();
			} else if (var2 == 26) {
				field1015 = arg0.method294();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1026 == null) {
					field1026 = new String[5];
				}

				field1026[var2 - 30] = arg0.method299();
				if (field1026[var2 - 30].equalsIgnoreCase("hidden")) {
					field1026[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1049 == null) {
					field1049 = new String[5];
				}

				field1049[var2 - 35] = arg0.method299();
			} else if (var2 == 40) {
				int var3 = arg0.method292();
				field1019 = new int[var3];
				field1024 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1019[var4] = arg0.method294();
					field1024[var4] = arg0.method294();
				}
			} else if (var2 == 78) {
				field1020 = arg0.method294();
			} else if (var2 == 79) {
				field1047 = arg0.method294();
			} else if (var2 == 90) {
				field1011 = arg0.method294();
			} else if (var2 == 91) {
				field1023 = arg0.method294();
			} else if (var2 == 92) {
				field1021 = arg0.method294();
			} else if (var2 == 93) {
				field1022 = arg0.method294();
			} else if (var2 == 95) {
				field1044 = arg0.method294();
			} else if (var2 == 97) {
				field1028 = arg0.method294();
			} else if (var2 == 98) {
				field1050 = arg0.method294();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1016 == null) {
					field1016 = new int[10];
					field1052 = new int[10];
				}

				field1016[var2 - 100] = arg0.method294();
				field1052[var2 - 100] = arg0.method294();
			} else if (var2 == 110) {
				field1040 = arg0.method294();
			} else if (var2 == 111) {
				field1018 = arg0.method294();
			} else if (var2 == 112) {
				field1051 = arg0.method294();
			} else if (var2 == 113) {
				field1041 = arg0.method293();
			} else if (var2 == 114) {
				field1012 = arg0.method293() * 5;
			} else if (var2 == 115) {
				field1006 = arg0.method292();
			}
		}
	}
}
