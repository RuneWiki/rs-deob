package deob;

@ObfuscatedName("QSAFIBMX")
public final class QSAFIBMX {

	@ObfuscatedName("QSAFIBMX.w")
	public int field1079 = -1;

	@ObfuscatedName("QSAFIBMX.A")
	public static boolean field1081 = true;

	@ObfuscatedName("QSAFIBMX.E")
	public static BMKJVFXV field1085 = new BMKJVFXV(50);

	@ObfuscatedName("QSAFIBMX.I")
	public static BMKJVFXV field1089 = new BMKJVFXV(100);

	@ObfuscatedName("QSAFIBMX.e")
	public byte field1064;

	@ObfuscatedName("QSAFIBMX.K")
	public byte field1091;

	@ObfuscatedName("QSAFIBMX.b")
	public static int field1061;

	@ObfuscatedName("QSAFIBMX.c")
	public int field1062;

	@ObfuscatedName("QSAFIBMX.d")
	public int field1063;

	@ObfuscatedName("QSAFIBMX.h")
	public int field1066;

	@ObfuscatedName("QSAFIBMX.i")
	public int field1067;

	@ObfuscatedName("QSAFIBMX.l")
	public int field1070;

	@ObfuscatedName("QSAFIBMX.o")
	public int field1073;

	@ObfuscatedName("QSAFIBMX.p")
	public int field1074;

	@ObfuscatedName("QSAFIBMX.q")
	public int field1075;

	@ObfuscatedName("QSAFIBMX.r")
	public int field1076;

	@ObfuscatedName("QSAFIBMX.t")
	public int field1078;

	@ObfuscatedName("QSAFIBMX.x")
	public static int field1080;

	@ObfuscatedName("QSAFIBMX.B")
	public int field1082;

	@ObfuscatedName("QSAFIBMX.C")
	public int field1083;

	@ObfuscatedName("QSAFIBMX.G")
	public int field1087;

	@ObfuscatedName("QSAFIBMX.H")
	public int field1088;

	@ObfuscatedName("QSAFIBMX.J")
	public int field1090;

	@ObfuscatedName("QSAFIBMX.M")
	public int field1093;

	@ObfuscatedName("QSAFIBMX.N")
	public int field1094;

	@ObfuscatedName("QSAFIBMX.O")
	public int field1095;

	@ObfuscatedName("QSAFIBMX.R")
	public int field1097;

	@ObfuscatedName("QSAFIBMX.T")
	public int field1099;

	@ObfuscatedName("QSAFIBMX.U")
	public int field1100;

	@ObfuscatedName("QSAFIBMX.V")
	public int field1101;

	@ObfuscatedName("QSAFIBMX.W")
	public int field1102;

	@ObfuscatedName("QSAFIBMX.X")
	public int field1103;

	@ObfuscatedName("QSAFIBMX.Y")
	public int field1104;

	@ObfuscatedName("QSAFIBMX.Z")
	public int field1105;

	@ObfuscatedName("QSAFIBMX.cb")
	public int field1108;

	@ObfuscatedName("QSAFIBMX.S")
	public static BSNPYLEV field1098;

	@ObfuscatedName("QSAFIBMX.f")
	public String field1065;

	@ObfuscatedName("QSAFIBMX.D")
	public boolean field1084;

	@ObfuscatedName("QSAFIBMX.L")
	public boolean field1092;

	@ObfuscatedName("QSAFIBMX.n")
	public byte[] field1072;

	@ObfuscatedName("QSAFIBMX.j")
	public static int[] field1068;

	@ObfuscatedName("QSAFIBMX.k")
	public int[] field1069;

	@ObfuscatedName("QSAFIBMX.P")
	public int[] field1096;

	@ObfuscatedName("QSAFIBMX.ab")
	public int[] field1106;

	@ObfuscatedName("QSAFIBMX.bb")
	public int[] field1107;

	@ObfuscatedName("QSAFIBMX.s")
	public static QSAFIBMX[] field1077;

	@ObfuscatedName("QSAFIBMX.m")
	public String[] field1071;

	@ObfuscatedName("QSAFIBMX.F")
	public String[] field1086;

	@ObfuscatedName("QSAFIBMX.a(I)V")
	public void method447() {
		QSAFIBMX var1 = method455(field1102);
		field1082 = var1.field1082;
		field1076 = var1.field1076;
		field1066 = var1.field1066;
		field1087 = var1.field1087;
		field1074 = var1.field1074;
		field1095 = var1.field1095;
		field1083 = var1.field1083;
		field1096 = var1.field1096;
		field1069 = var1.field1069;
		QSAFIBMX var2 = method455(field1101);
		field1065 = var2.field1065;
		field1092 = var2.field1092;
		field1094 = var2.field1094;
		String var3 = "a";
		char var4 = var2.field1065.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1072 = ("Swap this note at any bank for " + var3 + " " + var2.field1065 + ".").getBytes();
		field1084 = true;
	}

	@ObfuscatedName("QSAFIBMX.a(LSMIVAFST;)V")
	public static final void method448(SMIVAFST arg0) {
		field1098 = new BSNPYLEV(arg0.method512("obj.dat", null));
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("obj.idx", null));
		field1061 = var1.method49();
		field1068 = new int[field1061];
		int var2 = 2;
		for (int var3 = 0; var3 < field1061; var3++) {
			field1068[var3] = var2;
			var2 += var1.method49();
		}

		field1077 = new QSAFIBMX[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1077[var4] = new QSAFIBMX();
		}
	}

	@ObfuscatedName("QSAFIBMX.a(IZ)Z")
	public final boolean method449(int arg0) {
		int var2 = field1062;
		int var3 = field1088;
		if (arg0 == 1) {
			var2 = field1090;
			var3 = field1070;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!RMLAXPMV.method467(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !RMLAXPMV.method467(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("QSAFIBMX.a(ILBSNPYLEV;)V")
	public final void method450(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1082 = arg0.method49();
			} else if (var2 == 2) {
				field1065 = arg0.method54();
			} else if (var2 == 3) {
				field1072 = arg0.method55();
			} else if (var2 == 4) {
				field1076 = arg0.method49();
			} else if (var2 == 5) {
				field1066 = arg0.method49();
			} else if (var2 == 6) {
				field1087 = arg0.method49();
			} else if (var2 == 7) {
				field1095 = arg0.method49();
				if (field1095 > 32767) {
					field1095 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1083 = arg0.method49();
				if (field1083 > 32767) {
					field1083 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1105 = arg0.method49();
			} else if (var2 == 11) {
				field1084 = true;
			} else if (var2 == 12) {
				field1094 = arg0.method52();
			} else if (var2 == 16) {
				field1092 = true;
			} else if (var2 == 23) {
				field1099 = arg0.method49();
				field1064 = arg0.method48();
			} else if (var2 == 24) {
				field1097 = arg0.method49();
			} else if (var2 == 25) {
				field1093 = arg0.method49();
				field1091 = arg0.method48();
			} else if (var2 == 26) {
				field1104 = arg0.method49();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1071 == null) {
					field1071 = new String[5];
				}

				field1071[var2 - 30] = arg0.method54();
				if (field1071[var2 - 30].equalsIgnoreCase("hidden")) {
					field1071[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1086 == null) {
					field1086 = new String[5];
				}

				field1086[var2 - 35] = arg0.method54();
			} else if (var2 == 40) {
				int var3 = arg0.method47();
				field1096 = new int[var3];
				field1069 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1096[var4] = arg0.method49();
					field1069[var4] = arg0.method49();
				}
			} else if (var2 == 78) {
				field1075 = arg0.method49();
			} else if (var2 == 79) {
				field1100 = arg0.method49();
			} else if (var2 == 90) {
				field1062 = arg0.method49();
			} else if (var2 == 91) {
				field1090 = arg0.method49();
			} else if (var2 == 92) {
				field1088 = arg0.method49();
			} else if (var2 == 93) {
				field1070 = arg0.method49();
			} else if (var2 == 95) {
				field1074 = arg0.method49();
			} else if (var2 == 97) {
				field1101 = arg0.method49();
			} else if (var2 == 98) {
				field1102 = arg0.method49();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1107 == null) {
					field1107 = new int[10];
					field1106 = new int[10];
				}

				field1107[var2 - 100] = arg0.method49();
				field1106[var2 - 100] = arg0.method49();
			} else if (var2 == 110) {
				field1108 = arg0.method49();
			} else if (var2 == 111) {
				field1103 = arg0.method49();
			} else if (var2 == 112) {
				field1063 = arg0.method49();
			} else if (var2 == 113) {
				field1073 = arg0.method48();
			} else if (var2 == 114) {
				field1078 = arg0.method48() * 5;
			} else if (var2 == 115) {
				field1067 = arg0.method47();
			}
		}
	}

	@ObfuscatedName("QSAFIBMX.b(I)V")
	public static final void method451() {
		field1085 = null;
		field1089 = null;
		field1068 = null;
		field1077 = null;
		field1098 = null;
	}

	@ObfuscatedName("QSAFIBMX.a(IBII)LBISLJVZR;")
	public static final BISLJVZR method452(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			BISLJVZR var3 = (BISLJVZR) field1089.method32(arg1);
			if (var3 != null && var3.field46 != arg0 && var3.field46 != -1) {
				var3.method518();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		QSAFIBMX var4 = method455(arg1);
		if (var4.field1107 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1106[var6] && var4.field1106[var6] != 0) {
					var5 = var4.field1107[var6];
				}
			}

			if (var5 != -1) {
				var4 = method455(var5);
			}
		}

		RMLAXPMV var7 = var4.method456(1);
		if (var7 == null) {
			return null;
		}

		BISLJVZR var8 = null;
		if (var4.field1102 != -1) {
			var8 = method452(10, var4.field1101, -1);
			if (var8 == null) {
				return null;
			}
		}

		BISLJVZR var9 = new BISLJVZR(32, 32);
		int var10 = IWBEAICJ.field735;
		int var11 = IWBEAICJ.field736;
		int[] var12 = IWBEAICJ.field741;
		int[] var13 = TYMHEFTS.field1309;
		int var14 = TYMHEFTS.field1310;
		int var15 = TYMHEFTS.field1311;
		int var16 = TYMHEFTS.field1314;
		int var17 = TYMHEFTS.field1315;
		int var18 = TYMHEFTS.field1312;
		int var19 = TYMHEFTS.field1313;
		IWBEAICJ.field733 = false;
		TYMHEFTS.method523(var9.field40, 32, 32);
		TYMHEFTS.method528(32, 0, 0, 32, 0);
		IWBEAICJ.method325();
		int var20 = var4.field1076;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = IWBEAICJ.field739[var4.field1066] * var20 >> 16;
		int var22 = IWBEAICJ.field740[var4.field1066] * var20 >> 16;
		var7.method487(0, var4.field1087, var4.field1074, var4.field1066, var4.field1095, var7.field1060 / 2 + var21 + var4.field1083, var4.field1083 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field40[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field40[var24 * 32 + var23 - 1] > 1) {
						var9.field40[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field40[(var24 - 1) * 32 + var23] > 1) {
						var9.field40[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field40[var24 * 32 + var23 + 1] > 1) {
						var9.field40[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field40[(var24 + 1) * 32 + var23] > 1) {
						var9.field40[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field40[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field40[var26 * 32 + var25 - 1] == 1) {
							var9.field40[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field40[(var26 - 1) * 32 + var25] == 1) {
							var9.field40[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field40[var26 * 32 + var25 + 1] == 1) {
							var9.field40[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field40[(var26 + 1) * 32 + var25] == 1) {
							var9.field40[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field40[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field40[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field40[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1102 != -1) {
			int var29 = var8.field45;
			int var30 = var8.field46;
			var8.field45 = 32;
			var8.field46 = 32;
			var8.method24(0, 0);
			var8.field45 = var29;
			var8.field46 = var30;
		}

		if (arg2 == 0) {
			field1089.method33(arg1, var9);
		}

		TYMHEFTS.method523(var13, var15, var14);
		TYMHEFTS.method525(var16, var18, var19, var17);
		IWBEAICJ.field735 = var10;
		IWBEAICJ.field736 = var11;
		IWBEAICJ.field741 = var12;
		IWBEAICJ.field733 = true;

		if (var4.field1084) {
			var9.field45 = 33;
		} else {
			var9.field45 = 32;
		}

		var9.field46 = arg0;
		return var9;
	}

	@ObfuscatedName("QSAFIBMX.a(II)LRMLAXPMV;")
	public final RMLAXPMV method453(int arg0) {
		int var2 = field1099;
		int var3 = field1097;
		int var4 = field1075;
		if (arg0 == 1) {
			var2 = field1093;
			var3 = field1104;
			var4 = field1100;
		}

		if (var2 == -1) {
			return null;
		}

		RMLAXPMV var5 = RMLAXPMV.method466(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				RMLAXPMV var9 = RMLAXPMV.method466(var3);
				RMLAXPMV[] var10 = new RMLAXPMV[] { var5, var9 };
				var5 = new RMLAXPMV(2, var10);
			} else {
				RMLAXPMV var6 = RMLAXPMV.method466(var3);
				RMLAXPMV var7 = RMLAXPMV.method466(var4);
				RMLAXPMV[] var8 = new RMLAXPMV[] { var5, var6, var7 };
				var5 = new RMLAXPMV(3, var8);
			}
		}

		if (arg0 == 0 && field1064 != 0) {
			var5.method479(0, 0, field1064);
		}

		if (arg0 == 1 && field1091 != 0) {
			var5.method479(0, 0, field1091);
		}

		if (field1096 != null) {
			for (int var11 = 0; var11 < field1096.length; var11++) {
				var5.method480(field1096[var11], field1069[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("QSAFIBMX.b(II)Z")
	public final boolean method454(int arg0) {
		int var2 = field1099;
		int var3 = field1097;
		int var4 = field1075;
		if (arg0 == 1) {
			var2 = field1093;
			var3 = field1104;
			var4 = field1100;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!RMLAXPMV.method467(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !RMLAXPMV.method467(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !RMLAXPMV.method467(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("QSAFIBMX.c(I)LQSAFIBMX;")
	public static final QSAFIBMX method455(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1077[var1].field1079 == arg0) {
				return field1077[var1];
			}
		}

		field1080 = (field1080 + 1) % 10;
		QSAFIBMX var2 = field1077[field1080];
		field1098.field55 = field1068[arg0];
		var2.field1079 = arg0;
		var2.method458();
		var2.method450(field1098);

		if (var2.field1102 != -1) {
			var2.method447();
		}

		if (!field1081 && var2.field1092) {
			var2.field1065 = "Members Object";
			var2.field1072 = "Login to a members' server to use this object.".getBytes();
			var2.field1071 = null;
			var2.field1086 = null;
			var2.field1067 = 0;
		}

		return var2;
	}

	@ObfuscatedName("QSAFIBMX.d(I)LRMLAXPMV;")
	public final RMLAXPMV method456(int arg0) {
		if (field1107 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1106[var3] && field1106[var3] != 0) {
					var2 = field1107[var3];
				}
			}

			if (var2 != -1) {
				return method455(var2).method456(1);
			}
		}

		RMLAXPMV var4 = (RMLAXPMV) field1085.method32(field1079);
		if (var4 != null) {
			return var4;
		}

		RMLAXPMV var5 = RMLAXPMV.method466(field1082);
		if (var5 == null) {
			return null;
		}

		if (field1108 != 128 || field1103 != 128 || field1063 != 128) {
			var5.method482(field1103, field1108, field1063);
		}

		if (field1096 != null) {
			for (int var6 = 0; var6 < field1096.length; var6++) {
				var5.method480(field1096[var6], field1069[var6]);
			}
		}

		var5.method483(field1073 + 64, field1078 + 768, -50, -10, -50, true);
		var5.field1171 = true;
		field1085.method33(field1079, var5);
		return var5;
	}

	@ObfuscatedName("QSAFIBMX.a(IB)LRMLAXPMV;")
	public final RMLAXPMV method457(int arg0) {
		int var2 = field1062;
		int var3 = field1088;
		if (arg0 == 1) {
			var2 = field1090;
			var3 = field1070;
		}

		if (var2 == -1) {
			return null;
		}

		RMLAXPMV var4 = RMLAXPMV.method466(var2);
		if (var3 != -1) {
			RMLAXPMV var5 = RMLAXPMV.method466(var3);
			RMLAXPMV[] var6 = new RMLAXPMV[] { var4, var5 };
			var4 = new RMLAXPMV(2, var6);
		}

		if (field1096 != null) {
			for (int var7 = 0; var7 < field1096.length; var7++) {
				var4.method480(field1096[var7], field1069[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("QSAFIBMX.a()V")
	public final void method458() {
		field1082 = 0;
		field1065 = null;
		field1072 = null;
		field1096 = null;
		field1069 = null;
		field1076 = 2000;
		field1066 = 0;
		field1087 = 0;
		field1074 = 0;
		field1095 = 0;
		field1083 = 0;
		field1105 = -1;
		field1084 = false;
		field1094 = 1;
		field1092 = false;
		field1071 = null;
		field1086 = null;
		field1099 = -1;
		field1097 = -1;
		field1064 = 0;
		field1093 = -1;
		field1104 = -1;
		field1091 = 0;
		field1075 = -1;
		field1100 = -1;
		field1062 = -1;
		field1088 = -1;
		field1090 = -1;
		field1070 = -1;
		field1107 = null;
		field1106 = null;
		field1101 = -1;
		field1102 = -1;
		field1108 = 128;
		field1103 = 128;
		field1063 = 128;
		field1073 = 0;
		field1078 = 0;
		field1067 = 0;
	}

	@ObfuscatedName("QSAFIBMX.c(II)LRMLAXPMV;")
	public final RMLAXPMV method459(int arg0) {
		if (field1107 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1106[var3] && field1106[var3] != 0) {
					var2 = field1107[var3];
				}
			}

			if (var2 != -1) {
				return method455(var2).method459(1);
			}
		}

		RMLAXPMV var4 = RMLAXPMV.method466(field1082);
		if (var4 == null) {
			return null;
		}

		if (field1096 != null) {
			for (int var5 = 0; var5 < field1096.length; var5++) {
				var4.method480(field1096[var5], field1069[var5]);
			}
		}

		return var4;
	}
}
