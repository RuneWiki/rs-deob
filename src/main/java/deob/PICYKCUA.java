package deob;

@ObfuscatedName("PICYKCUA")
public final class PICYKCUA {

	@ObfuscatedName("PICYKCUA.z")
	public int field1106 = -1;

	@ObfuscatedName("PICYKCUA.c")
	public static UECXVCCS field1084 = new UECXVCCS(100);

	@ObfuscatedName("PICYKCUA.m")
	public static boolean field1093 = true;

	@ObfuscatedName("PICYKCUA.P")
	public static UECXVCCS field1121 = new UECXVCCS(50);

	@ObfuscatedName("PICYKCUA.D")
	public byte field1110;

	@ObfuscatedName("PICYKCUA.K")
	public byte field1117;

	@ObfuscatedName("PICYKCUA.a")
	public int field1082;

	@ObfuscatedName("PICYKCUA.b")
	public int field1083;

	@ObfuscatedName("PICYKCUA.e")
	public int field1086;

	@ObfuscatedName("PICYKCUA.f")
	public int field1087;

	@ObfuscatedName("PICYKCUA.h")
	public int field1089;

	@ObfuscatedName("PICYKCUA.k")
	public int field1091;

	@ObfuscatedName("PICYKCUA.o")
	public int field1095;

	@ObfuscatedName("PICYKCUA.p")
	public int field1096;

	@ObfuscatedName("PICYKCUA.q")
	public static int field1097;

	@ObfuscatedName("PICYKCUA.r")
	public int field1098;

	@ObfuscatedName("PICYKCUA.t")
	public int field1100;

	@ObfuscatedName("PICYKCUA.u")
	public int field1101;

	@ObfuscatedName("PICYKCUA.v")
	public int field1102;

	@ObfuscatedName("PICYKCUA.y")
	public int field1105;

	@ObfuscatedName("PICYKCUA.A")
	public int field1107;

	@ObfuscatedName("PICYKCUA.B")
	public int field1108;

	@ObfuscatedName("PICYKCUA.C")
	public int field1109;

	@ObfuscatedName("PICYKCUA.E")
	public int field1111;

	@ObfuscatedName("PICYKCUA.I")
	public int field1115;

	@ObfuscatedName("PICYKCUA.J")
	public static int field1116;

	@ObfuscatedName("PICYKCUA.M")
	public int field1118;

	@ObfuscatedName("PICYKCUA.N")
	public int field1119;

	@ObfuscatedName("PICYKCUA.O")
	public int field1120;

	@ObfuscatedName("PICYKCUA.Q")
	public int field1122;

	@ObfuscatedName("PICYKCUA.R")
	public int field1123;

	@ObfuscatedName("PICYKCUA.S")
	public int field1124;

	@ObfuscatedName("PICYKCUA.U")
	public int field1125;

	@ObfuscatedName("PICYKCUA.X")
	public int field1128;

	@ObfuscatedName("PICYKCUA.Y")
	public int field1129;

	@ObfuscatedName("PICYKCUA.G")
	public static MLYYHULT field1113;

	@ObfuscatedName("PICYKCUA.W")
	public String field1127;

	@ObfuscatedName("PICYKCUA.F")
	public boolean field1112;

	@ObfuscatedName("PICYKCUA.V")
	public boolean field1126;

	@ObfuscatedName("PICYKCUA.s")
	public byte[] field1099;

	@ObfuscatedName("PICYKCUA.d")
	public static int[] field1085;

	@ObfuscatedName("PICYKCUA.g")
	public int[] field1088;

	@ObfuscatedName("PICYKCUA.i")
	public int[] field1090;

	@ObfuscatedName("PICYKCUA.n")
	public int[] field1094;

	@ObfuscatedName("PICYKCUA.w")
	public int[] field1103;

	@ObfuscatedName("PICYKCUA.l")
	public static PICYKCUA[] field1092;

	@ObfuscatedName("PICYKCUA.x")
	public String[] field1104;

	@ObfuscatedName("PICYKCUA.H")
	public String[] field1114;

	@ObfuscatedName("PICYKCUA.a(B)V")
	public void method406() {
		PICYKCUA var1 = method418(field1115);
		field1086 = var1.field1086;
		field1096 = var1.field1096;
		field1082 = var1.field1082;
		field1107 = var1.field1107;
		field1111 = var1.field1111;
		field1105 = var1.field1105;
		field1120 = var1.field1120;
		field1103 = var1.field1103;
		field1090 = var1.field1090;
		PICYKCUA var2 = method418(field1089);
		field1127 = var2.field1127;
		field1126 = var2.field1126;
		field1087 = var2.field1087;
		String var3 = "a";
		char var4 = var2.field1127.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1099 = ("Swap this note at any bank for " + var3 + " " + var2.field1127 + ".").getBytes();
		field1112 = true;
	}

	@ObfuscatedName("PICYKCUA.a(II)LCADBNSXE;")
	public final CADBNSXE method407(int arg0) {
		if (field1088 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1094[var3] && field1094[var3] != 0) {
					var2 = field1088[var3];
				}
			}

			if (var2 != -1) {
				return method418(var2).method407(1);
			}
		}

		CADBNSXE var4 = CADBNSXE.method11(field1086);
		if (var4 == null) {
			return null;
		}

		if (field1103 != null) {
			for (int var5 = 0; var5 < field1103.length; var5++) {
				var4.method25(field1103[var5], field1090[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PICYKCUA.a()V")
	public final void method408() {
		field1086 = 0;
		field1127 = null;
		field1099 = null;
		field1103 = null;
		field1090 = null;
		field1096 = 2000;
		field1082 = 0;
		field1107 = 0;
		field1111 = 0;
		field1105 = 0;
		field1120 = 0;
		field1083 = -1;
		field1112 = false;
		field1087 = 1;
		field1126 = false;
		field1114 = null;
		field1104 = null;
		field1123 = -1;
		field1095 = -1;
		field1110 = 0;
		field1100 = -1;
		field1118 = -1;
		field1117 = 0;
		field1098 = -1;
		field1122 = -1;
		field1102 = -1;
		field1128 = -1;
		field1109 = -1;
		field1124 = -1;
		field1088 = null;
		field1094 = null;
		field1089 = -1;
		field1115 = -1;
		field1119 = 128;
		field1108 = 128;
		field1101 = 128;
		field1125 = 0;
		field1129 = 0;
		field1091 = 0;
	}

	@ObfuscatedName("PICYKCUA.a(BI)Z")
	public final boolean method409(int arg0) {
		int var2 = field1123;
		int var3 = field1095;
		int var4 = field1098;
		if (arg0 == 1) {
			var2 = field1100;
			var3 = field1118;
			var4 = field1122;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!CADBNSXE.method12(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !CADBNSXE.method12(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !CADBNSXE.method12(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("PICYKCUA.b(II)LCADBNSXE;")
	public final CADBNSXE method410(int arg0) {
		int var2 = field1102;
		int var3 = field1128;
		if (arg0 == 1) {
			var2 = field1109;
			var3 = field1124;
		}

		if (var2 == -1) {
			return null;
		}

		CADBNSXE var4 = CADBNSXE.method11(var2);
		if (var3 != -1) {
			CADBNSXE var5 = CADBNSXE.method11(var3);
			CADBNSXE[] var6 = new CADBNSXE[] { var4, var5 };
			var4 = new CADBNSXE(var6, 2);
		}

		if (field1103 != null) {
			for (int var7 = 0; var7 < field1103.length; var7++) {
				var4.method25(field1103[var7], field1090[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PICYKCUA.c(II)LCADBNSXE;")
	public final CADBNSXE method411(int arg0) {
		int var2 = field1123;
		int var3 = field1095;
		int var4 = field1098;
		if (arg0 == 1) {
			var2 = field1100;
			var3 = field1118;
			var4 = field1122;
		}

		if (var2 == -1) {
			return null;
		}

		CADBNSXE var5 = CADBNSXE.method11(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				CADBNSXE var9 = CADBNSXE.method11(var3);
				CADBNSXE[] var10 = new CADBNSXE[] { var5, var9 };
				var5 = new CADBNSXE(var10, 2);
			} else {
				CADBNSXE var6 = CADBNSXE.method11(var3);
				CADBNSXE var7 = CADBNSXE.method11(var4);
				CADBNSXE[] var8 = new CADBNSXE[] { var5, var6, var7 };
				var5 = new CADBNSXE(var8, 3);
			}
		}

		if (arg0 == 0 && field1110 != 0) {
			var5.method24(field1110, 0, 0);
		}

		if (arg0 == 1 && field1117 != 0) {
			var5.method24(field1117, 0, 0);
		}

		if (field1103 != null) {
			for (int var11 = 0; var11 < field1103.length; var11++) {
				var5.method25(field1103[var11], field1090[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("PICYKCUA.a(IIII)LSWNASVGQ;")
	public static final SWNASVGQ method412(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			SWNASVGQ var3 = (SWNASVGQ) field1084.method538(arg2);
			if (var3 != null && var3.field1251 != arg0 && var3.field1251 != -1) {
				var3.method367();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		PICYKCUA var4 = method418(arg2);
		if (var4.field1088 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1094[var6] && var4.field1094[var6] != 0) {
					var5 = var4.field1088[var6];
				}
			}

			if (var5 != -1) {
				var4 = method418(var5);
			}
		}

		CADBNSXE var7 = var4.method413(1);
		if (var7 == null) {
			return null;
		}

		SWNASVGQ var8 = null;
		if (var4.field1115 != -1) {
			var8 = method412(10, -1, var4.field1089);
			if (var8 == null) {
				return null;
			}
		}

		SWNASVGQ var9 = new SWNASVGQ(32, 32);
		int var10 = PNDCOEKM.field1135;
		int var11 = PNDCOEKM.field1136;
		int[] var12 = PNDCOEKM.field1141;
		int[] var13 = UKUXLUWP.field1345;
		int var14 = UKUXLUWP.field1346;
		int var15 = UKUXLUWP.field1347;
		int var16 = UKUXLUWP.field1350;
		int var17 = UKUXLUWP.field1351;
		int var18 = UKUXLUWP.field1348;
		int var19 = UKUXLUWP.field1349;
		PNDCOEKM.field1133 = false;
		UKUXLUWP.method541(32, var9.field1245, 32);
		UKUXLUWP.method546(0, 0, 0, 32, 32);
		PNDCOEKM.method420();
		int var20 = var4.field1096;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = PNDCOEKM.field1139[var4.field1082] * var20 >> 16;
		int var22 = PNDCOEKM.field1140[var4.field1082] * var20 >> 16;
		var7.method32(0, var4.field1107, var4.field1111, var4.field1082, var4.field1105, var7.field852 / 2 + var21 + var4.field1120, var4.field1120 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1245[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1245[var24 * 32 + var23 - 1] > 1) {
						var9.field1245[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1245[(var24 - 1) * 32 + var23] > 1) {
						var9.field1245[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1245[var24 * 32 + var23 + 1] > 1) {
						var9.field1245[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1245[(var24 + 1) * 32 + var23] > 1) {
						var9.field1245[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1245[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1245[var26 * 32 + var25 - 1] == 1) {
							var9.field1245[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1245[(var26 - 1) * 32 + var25] == 1) {
							var9.field1245[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1245[var26 * 32 + var25 + 1] == 1) {
							var9.field1245[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1245[(var26 + 1) * 32 + var25] == 1) {
							var9.field1245[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1245[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1245[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1245[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1115 != -1) {
			int var29 = var8.field1250;
			int var30 = var8.field1251;
			var8.field1250 = 32;
			var8.field1251 = 32;
			var8.method474(0, 0);
			var8.field1250 = var29;
			var8.field1251 = var30;
		}

		if (arg1 == 0) {
			field1084.method539(var9, arg2);
		}

		UKUXLUWP.method541(var14, var13, var15);
		UKUXLUWP.method543(var16, var18, var17, var19);
		PNDCOEKM.field1135 = var10;
		PNDCOEKM.field1136 = var11;
		PNDCOEKM.field1141 = var12;
		PNDCOEKM.field1133 = true;

		if (var4.field1112) {
			var9.field1250 = 33;
		} else {
			var9.field1250 = 32;
		}

		var9.field1251 = arg0;
		return var9;
	}

	@ObfuscatedName("PICYKCUA.a(I)LCADBNSXE;")
	public final CADBNSXE method413(int arg0) {
		if (field1088 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1094[var3] && field1094[var3] != 0) {
					var2 = field1088[var3];
				}
			}

			if (var2 != -1) {
				return method418(var2).method413(1);
			}
		}

		CADBNSXE var4 = (CADBNSXE) field1121.method538(field1106);
		if (var4 != null) {
			return var4;
		}

		CADBNSXE var5 = CADBNSXE.method11(field1086);
		if (var5 == null) {
			return null;
		}

		if (field1119 != 128 || field1108 != 128 || field1101 != 128) {
			var5.method27(field1101, field1108, field1119);
		}

		if (field1103 != null) {
			for (int var6 = 0; var6 < field1103.length; var6++) {
				var5.method25(field1103[var6], field1090[var6]);
			}
		}

		var5.method28(field1125 + 64, field1129 + 768, -50, -10, -50, true);
		var5.field49 = true;
		field1121.method539(var5, field1106);
		return var5;
	}

	@ObfuscatedName("PICYKCUA.b(I)V")
	public static final void method414() {
		field1121 = null;
		field1084 = null;
		field1085 = null;
		field1092 = null;
		field1113 = null;
	}

	@ObfuscatedName("PICYKCUA.d(II)Z")
	public final boolean method415(int arg0) {
		int var2 = field1102;
		int var3 = field1128;
		if (arg0 == 1) {
			var2 = field1109;
			var3 = field1124;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!CADBNSXE.method12(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !CADBNSXE.method12(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("PICYKCUA.a(LMLYYHULT;B)V")
	public final void method416(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1086 = arg0.method298();
			} else if (var2 == 2) {
				field1127 = arg0.method303();
			} else if (var2 == 3) {
				field1099 = arg0.method304();
			} else if (var2 == 4) {
				field1096 = arg0.method298();
			} else if (var2 == 5) {
				field1082 = arg0.method298();
			} else if (var2 == 6) {
				field1107 = arg0.method298();
			} else if (var2 == 7) {
				field1105 = arg0.method298();
				if (field1105 > 32767) {
					field1105 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1120 = arg0.method298();
				if (field1120 > 32767) {
					field1120 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1083 = arg0.method298();
			} else if (var2 == 11) {
				field1112 = true;
			} else if (var2 == 12) {
				field1087 = arg0.method301();
			} else if (var2 == 16) {
				field1126 = true;
			} else if (var2 == 23) {
				field1123 = arg0.method298();
				field1110 = arg0.method297();
			} else if (var2 == 24) {
				field1095 = arg0.method298();
			} else if (var2 == 25) {
				field1100 = arg0.method298();
				field1117 = arg0.method297();
			} else if (var2 == 26) {
				field1118 = arg0.method298();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1114 == null) {
					field1114 = new String[5];
				}

				field1114[var2 - 30] = arg0.method303();
				if (field1114[var2 - 30].equalsIgnoreCase("hidden")) {
					field1114[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1104 == null) {
					field1104 = new String[5];
				}

				field1104[var2 - 35] = arg0.method303();
			} else if (var2 == 40) {
				int var3 = arg0.method296();
				field1103 = new int[var3];
				field1090 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1103[var4] = arg0.method298();
					field1090[var4] = arg0.method298();
				}
			} else if (var2 == 78) {
				field1098 = arg0.method298();
			} else if (var2 == 79) {
				field1122 = arg0.method298();
			} else if (var2 == 90) {
				field1102 = arg0.method298();
			} else if (var2 == 91) {
				field1109 = arg0.method298();
			} else if (var2 == 92) {
				field1128 = arg0.method298();
			} else if (var2 == 93) {
				field1124 = arg0.method298();
			} else if (var2 == 95) {
				field1111 = arg0.method298();
			} else if (var2 == 97) {
				field1089 = arg0.method298();
			} else if (var2 == 98) {
				field1115 = arg0.method298();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1088 == null) {
					field1088 = new int[10];
					field1094 = new int[10];
				}

				field1088[var2 - 100] = arg0.method298();
				field1094[var2 - 100] = arg0.method298();
			} else if (var2 == 110) {
				field1119 = arg0.method298();
			} else if (var2 == 111) {
				field1108 = arg0.method298();
			} else if (var2 == 112) {
				field1101 = arg0.method298();
			} else if (var2 == 113) {
				field1125 = arg0.method297();
			} else if (var2 == 114) {
				field1129 = arg0.method297() * 5;
			} else if (var2 == 115) {
				field1091 = arg0.method296();
			}
		}
	}

	@ObfuscatedName("PICYKCUA.a(LGWOEELWB;)V")
	public static final void method417(GWOEELWB arg0) {
		field1113 = new MLYYHULT(arg0.method249("obj.dat", null));
		MLYYHULT var1 = new MLYYHULT(arg0.method249("obj.idx", null));
		field1097 = var1.method298();
		field1085 = new int[field1097];
		int var2 = 2;
		for (int var3 = 0; var3 < field1097; var3++) {
			field1085[var3] = var2;
			var2 += var1.method298();
		}

		field1092 = new PICYKCUA[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1092[var4] = new PICYKCUA();
		}
	}

	@ObfuscatedName("PICYKCUA.c(I)LPICYKCUA;")
	public static final PICYKCUA method418(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1092[var1].field1106 == arg0) {
				return field1092[var1];
			}
		}

		field1116 = (field1116 + 1) % 10;
		PICYKCUA var2 = field1092[field1116];
		field1113.field963 = field1085[arg0];
		var2.field1106 = arg0;
		var2.method408();
		var2.method416(field1113);

		if (var2.field1115 != -1) {
			var2.method406();
		}

		if (!field1093 && var2.field1126) {
			var2.field1127 = "Members Object";
			var2.field1099 = "Login to a members' server to use this object.".getBytes();
			var2.field1114 = null;
			var2.field1104 = null;
			var2.field1091 = 0;
		}

		return var2;
	}
}
