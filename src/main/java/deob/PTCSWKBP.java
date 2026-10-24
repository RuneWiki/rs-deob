package deob;

@ObfuscatedName("PTCSWKBP")
public final class PTCSWKBP {

	@ObfuscatedName("PTCSWKBP.q")
	public int field1134 = -1;

	@ObfuscatedName("PTCSWKBP.i")
	public static ASORKPAH field1126 = new ASORKPAH(100);

	@ObfuscatedName("PTCSWKBP.n")
	public static ASORKPAH field1131 = new ASORKPAH(50);

	@ObfuscatedName("PTCSWKBP.t")
	public static boolean field1136 = true;

	@ObfuscatedName("PTCSWKBP.G")
	public byte field1149;

	@ObfuscatedName("PTCSWKBP.S")
	public byte field1160;

	@ObfuscatedName("PTCSWKBP.b")
	public int field1119;

	@ObfuscatedName("PTCSWKBP.c")
	public static int field1120;

	@ObfuscatedName("PTCSWKBP.d")
	public static int field1121;

	@ObfuscatedName("PTCSWKBP.e")
	public int field1122;

	@ObfuscatedName("PTCSWKBP.g")
	public int field1124;

	@ObfuscatedName("PTCSWKBP.j")
	public int field1127;

	@ObfuscatedName("PTCSWKBP.k")
	public int field1128;

	@ObfuscatedName("PTCSWKBP.l")
	public int field1129;

	@ObfuscatedName("PTCSWKBP.m")
	public int field1130;

	@ObfuscatedName("PTCSWKBP.o")
	public int field1132;

	@ObfuscatedName("PTCSWKBP.u")
	public int field1137;

	@ObfuscatedName("PTCSWKBP.w")
	public int field1139;

	@ObfuscatedName("PTCSWKBP.x")
	public int field1140;

	@ObfuscatedName("PTCSWKBP.y")
	public int field1141;

	@ObfuscatedName("PTCSWKBP.z")
	public int field1142;

	@ObfuscatedName("PTCSWKBP.B")
	public int field1144;

	@ObfuscatedName("PTCSWKBP.C")
	public int field1145;

	@ObfuscatedName("PTCSWKBP.D")
	public int field1146;

	@ObfuscatedName("PTCSWKBP.E")
	public int field1147;

	@ObfuscatedName("PTCSWKBP.F")
	public int field1148;

	@ObfuscatedName("PTCSWKBP.I")
	public int field1151;

	@ObfuscatedName("PTCSWKBP.K")
	public int field1153;

	@ObfuscatedName("PTCSWKBP.L")
	public int field1154;

	@ObfuscatedName("PTCSWKBP.N")
	public int field1155;

	@ObfuscatedName("PTCSWKBP.P")
	public int field1157;

	@ObfuscatedName("PTCSWKBP.Q")
	public int field1158;

	@ObfuscatedName("PTCSWKBP.U")
	public int field1161;

	@ObfuscatedName("PTCSWKBP.V")
	public int field1162;

	@ObfuscatedName("PTCSWKBP.W")
	public int field1163;

	@ObfuscatedName("PTCSWKBP.r")
	public static CKBTFRZM field1135;

	@ObfuscatedName("PTCSWKBP.a")
	public String field1118;

	@ObfuscatedName("PTCSWKBP.A")
	public boolean field1143;

	@ObfuscatedName("PTCSWKBP.Y")
	public boolean field1165;

	@ObfuscatedName("PTCSWKBP.f")
	public byte[] field1123;

	@ObfuscatedName("PTCSWKBP.h")
	public int[] field1125;

	@ObfuscatedName("PTCSWKBP.p")
	public static int[] field1133;

	@ObfuscatedName("PTCSWKBP.v")
	public int[] field1138;

	@ObfuscatedName("PTCSWKBP.O")
	public int[] field1156;

	@ObfuscatedName("PTCSWKBP.X")
	public int[] field1164;

	@ObfuscatedName("PTCSWKBP.R")
	public static PTCSWKBP[] field1159;

	@ObfuscatedName("PTCSWKBP.H")
	public String[] field1150;

	@ObfuscatedName("PTCSWKBP.J")
	public String[] field1152;

	@ObfuscatedName("PTCSWKBP.a(IB)Z")
	public final boolean method488(int arg0) {
		int var2 = field1155;
		int var3 = field1142;
		if (arg0 == 1) {
			var2 = field1122;
			var3 = field1119;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!GFYXEFQY.method342(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !GFYXEFQY.method342(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("PTCSWKBP.a(I)LPTCSWKBP;")
	public static final PTCSWKBP method489(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1159[var1].field1134 == arg0) {
				return field1159[var1];
			}
		}

		field1121 = (field1121 + 1) % 10;
		PTCSWKBP var2 = field1159[field1121];
		field1135.field92 = field1133[arg0];
		var2.field1134 = arg0;
		var2.method496();
		var2.method490(field1135);

		if (var2.field1140 != -1) {
			var2.method498();
		}

		if (!field1136 && var2.field1165) {
			var2.field1118 = "Members Object";
			var2.field1123 = "Login to a members' server to use this object.".getBytes();
			var2.field1150 = null;
			var2.field1152 = null;
			var2.field1124 = 0;
		}

		return var2;
	}

	@ObfuscatedName("PTCSWKBP.a(BLCKBTFRZM;)V")
	public final void method490(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1137 = arg0.method46();
			} else if (var2 == 2) {
				field1118 = arg0.method51();
			} else if (var2 == 3) {
				field1123 = arg0.method52();
			} else if (var2 == 4) {
				field1144 = arg0.method46();
			} else if (var2 == 5) {
				field1129 = arg0.method46();
			} else if (var2 == 6) {
				field1139 = arg0.method46();
			} else if (var2 == 7) {
				field1163 = arg0.method46();
				if (field1163 > 32767) {
					field1163 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1158 = arg0.method46();
				if (field1158 > 32767) {
					field1158 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1153 = arg0.method46();
			} else if (var2 == 11) {
				field1143 = true;
			} else if (var2 == 12) {
				field1128 = arg0.method49();
			} else if (var2 == 16) {
				field1165 = true;
			} else if (var2 == 23) {
				field1148 = arg0.method46();
				field1160 = arg0.method45();
			} else if (var2 == 24) {
				field1151 = arg0.method46();
			} else if (var2 == 25) {
				field1161 = arg0.method46();
				field1149 = arg0.method45();
			} else if (var2 == 26) {
				field1145 = arg0.method46();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1150 == null) {
					field1150 = new String[5];
				}

				field1150[var2 - 30] = arg0.method51();
				if (field1150[var2 - 30].equalsIgnoreCase("hidden")) {
					field1150[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1152 == null) {
					field1152 = new String[5];
				}

				field1152[var2 - 35] = arg0.method51();
			} else if (var2 == 40) {
				int var3 = arg0.method44();
				field1164 = new int[var3];
				field1125 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1164[var4] = arg0.method46();
					field1125[var4] = arg0.method46();
				}
			} else if (var2 == 78) {
				field1141 = arg0.method46();
			} else if (var2 == 79) {
				field1127 = arg0.method46();
			} else if (var2 == 90) {
				field1155 = arg0.method46();
			} else if (var2 == 91) {
				field1122 = arg0.method46();
			} else if (var2 == 92) {
				field1142 = arg0.method46();
			} else if (var2 == 93) {
				field1119 = arg0.method46();
			} else if (var2 == 95) {
				field1147 = arg0.method46();
			} else if (var2 == 97) {
				field1132 = arg0.method46();
			} else if (var2 == 98) {
				field1140 = arg0.method46();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1138 == null) {
					field1138 = new int[10];
					field1156 = new int[10];
				}

				field1138[var2 - 100] = arg0.method46();
				field1156[var2 - 100] = arg0.method46();
			} else if (var2 == 110) {
				field1130 = arg0.method46();
			} else if (var2 == 111) {
				field1157 = arg0.method46();
			} else if (var2 == 112) {
				field1154 = arg0.method46();
			} else if (var2 == 113) {
				field1146 = arg0.method45();
			} else if (var2 == 114) {
				field1162 = arg0.method45() * 5;
			} else if (var2 == 115) {
				field1124 = arg0.method44();
			}
		}
	}

	@ObfuscatedName("PTCSWKBP.a(II)LGFYXEFQY;")
	public final GFYXEFQY method491(int arg0) {
		if (field1138 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1156[var3] && field1156[var3] != 0) {
					var2 = field1138[var3];
				}
			}

			if (var2 != -1) {
				return method489(var2).method491(1);
			}
		}

		GFYXEFQY var4 = GFYXEFQY.method341(field1137);
		if (var4 == null) {
			return null;
		}

		if (field1164 != null) {
			for (int var5 = 0; var5 < field1164.length; var5++) {
				var4.method355(field1164[var5], field1125[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PTCSWKBP.a(IIZI)LJONKABPT;")
	public static final JONKABPT method492(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			JONKABPT var3 = (JONKABPT) field1126.method1(arg0);
			if (var3 != null && var3.field1005 != arg1 && var3.field1005 != -1) {
				var3.method450();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		PTCSWKBP var4 = method489(arg0);
		if (var4.field1138 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1156[var6] && var4.field1156[var6] != 0) {
					var5 = var4.field1138[var6];
				}
			}

			if (var5 != -1) {
				var4 = method489(var5);
			}
		}

		GFYXEFQY var7 = var4.method493(1);
		if (var7 == null) {
			return null;
		}

		JONKABPT var8 = null;
		if (var4.field1140 != -1) {
			var8 = method492(var4.field1132, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		JONKABPT var9 = new JONKABPT(32, 32);
		int var10 = DMXMSPET.field575;
		int var11 = DMXMSPET.field576;
		int[] var12 = DMXMSPET.field581;
		int[] var13 = JJXDTORW.field964;
		int var14 = JJXDTORW.field965;
		int var15 = JJXDTORW.field966;
		int var16 = JJXDTORW.field969;
		int var17 = JJXDTORW.field970;
		int var18 = JJXDTORW.field967;
		int var19 = JJXDTORW.field968;
		DMXMSPET.field573 = false;
		JJXDTORW.method412(32, 32, var9.field999);
		JJXDTORW.method417(0, 32, 0, 32, 0);
		DMXMSPET.method238();
		int var20 = var4.field1144;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = DMXMSPET.field579[var4.field1129] * var20 >> 16;
		int var22 = DMXMSPET.field580[var4.field1129] * var20 >> 16;
		var7.method361(0, var4.field1139, var4.field1147, var4.field1129, var4.field1163, var7.field739 / 2 + var21 + var4.field1158, var4.field1158 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field999[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field999[var24 * 32 + var23 - 1] > 1) {
						var9.field999[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field999[(var24 - 1) * 32 + var23] > 1) {
						var9.field999[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field999[var24 * 32 + var23 + 1] > 1) {
						var9.field999[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field999[(var24 + 1) * 32 + var23] > 1) {
						var9.field999[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field999[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field999[var26 * 32 + var25 - 1] == 1) {
							var9.field999[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field999[(var26 - 1) * 32 + var25] == 1) {
							var9.field999[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field999[var26 * 32 + var25 + 1] == 1) {
							var9.field999[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field999[(var26 + 1) * 32 + var25] == 1) {
							var9.field999[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field999[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field999[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field999[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1140 != -1) {
			int var29 = var8.field1004;
			int var30 = var8.field1005;
			var8.field1004 = 32;
			var8.field1005 = 32;
			var8.method429(0, 0);
			var8.field1004 = var29;
			var8.field1005 = var30;
		}

		if (arg2 == 0) {
			field1126.method2(arg0, var9);
		}

		JJXDTORW.method412(var15, var14, var13);
		JJXDTORW.method414(var16, var17, var18, var19);
		DMXMSPET.field575 = var10;
		DMXMSPET.field576 = var11;
		DMXMSPET.field581 = var12;
		DMXMSPET.field573 = true;

		if (var4.field1143) {
			var9.field1004 = 33;
		} else {
			var9.field1004 = 32;
		}

		var9.field1005 = arg1;
		return var9;
	}

	@ObfuscatedName("PTCSWKBP.b(I)LGFYXEFQY;")
	public final GFYXEFQY method493(int arg0) {
		if (field1138 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1156[var3] && field1156[var3] != 0) {
					var2 = field1138[var3];
				}
			}

			if (var2 != -1) {
				return method489(var2).method493(1);
			}
		}

		GFYXEFQY var4 = (GFYXEFQY) field1131.method1(field1134);
		if (var4 != null) {
			return var4;
		}

		GFYXEFQY var5 = GFYXEFQY.method341(field1137);
		if (var5 == null) {
			return null;
		}

		if (field1130 != 128 || field1157 != 128 || field1154 != 128) {
			var5.method357(field1154, field1130, field1157);
		}

		if (field1164 != null) {
			for (int var6 = 0; var6 < field1164.length; var6++) {
				var5.method355(field1164[var6], field1125[var6]);
			}
		}

		var5.method358(field1146 + 64, field1162 + 768, -50, -10, -50, true);
		var5.field786 = true;
		field1131.method2(field1134, var5);
		return var5;
	}

	@ObfuscatedName("PTCSWKBP.a(LEAXVDNXA;)V")
	public static final void method494(EAXVDNXA arg0) {
		field1135 = new CKBTFRZM(arg0.method255("obj.dat", null));
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("obj.idx", null));
		field1120 = var1.method46();
		field1133 = new int[field1120];
		int var2 = 2;
		for (int var3 = 0; var3 < field1120; var3++) {
			field1133[var3] = var2;
			var2 += var1.method46();
		}

		field1159 = new PTCSWKBP[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1159[var4] = new PTCSWKBP();
		}
	}

	@ObfuscatedName("PTCSWKBP.b(IB)LGFYXEFQY;")
	public final GFYXEFQY method495(int arg0) {
		int var2 = field1148;
		int var3 = field1151;
		int var4 = field1141;
		if (arg0 == 1) {
			var2 = field1161;
			var3 = field1145;
			var4 = field1127;
		}

		if (var2 == -1) {
			return null;
		}

		GFYXEFQY var5 = GFYXEFQY.method341(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				GFYXEFQY var9 = GFYXEFQY.method341(var3);
				GFYXEFQY[] var10 = new GFYXEFQY[] { var5, var9 };
				var5 = new GFYXEFQY(var10, 2);
			} else {
				GFYXEFQY var6 = GFYXEFQY.method341(var3);
				GFYXEFQY var7 = GFYXEFQY.method341(var4);
				GFYXEFQY[] var8 = new GFYXEFQY[] { var5, var6, var7 };
				var5 = new GFYXEFQY(var8, 3);
			}
		}

		if (arg0 == 0 && field1160 != 0) {
			var5.method354(0, field1160, 0);
		}

		if (arg0 == 1 && field1149 != 0) {
			var5.method354(0, field1149, 0);
		}

		if (field1164 != null) {
			for (int var11 = 0; var11 < field1164.length; var11++) {
				var5.method355(field1164[var11], field1125[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("PTCSWKBP.a()V")
	public final void method496() {
		field1137 = 0;
		field1118 = null;
		field1123 = null;
		field1164 = null;
		field1125 = null;
		field1144 = 2000;
		field1129 = 0;
		field1139 = 0;
		field1147 = 0;
		field1163 = 0;
		field1158 = 0;
		field1153 = -1;
		field1143 = false;
		field1128 = 1;
		field1165 = false;
		field1150 = null;
		field1152 = null;
		field1148 = -1;
		field1151 = -1;
		field1160 = 0;
		field1161 = -1;
		field1145 = -1;
		field1149 = 0;
		field1141 = -1;
		field1127 = -1;
		field1155 = -1;
		field1142 = -1;
		field1122 = -1;
		field1119 = -1;
		field1138 = null;
		field1156 = null;
		field1132 = -1;
		field1140 = -1;
		field1130 = 128;
		field1157 = 128;
		field1154 = 128;
		field1146 = 0;
		field1162 = 0;
		field1124 = 0;
	}

	@ObfuscatedName("PTCSWKBP.c(IB)LGFYXEFQY;")
	public final GFYXEFQY method497(int arg0) {
		int var2 = field1155;
		int var3 = field1142;
		if (arg0 == 1) {
			var2 = field1122;
			var3 = field1119;
		}

		if (var2 == -1) {
			return null;
		}

		GFYXEFQY var4 = GFYXEFQY.method341(var2);
		if (var3 != -1) {
			GFYXEFQY var5 = GFYXEFQY.method341(var3);
			GFYXEFQY[] var6 = new GFYXEFQY[] { var4, var5 };
			var4 = new GFYXEFQY(var6, 2);
		}

		if (field1164 != null) {
			for (int var7 = 0; var7 < field1164.length; var7++) {
				var4.method355(field1164[var7], field1125[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("PTCSWKBP.c(I)V")
	public void method498() {
		PTCSWKBP var1 = method489(field1140);
		field1137 = var1.field1137;
		field1144 = var1.field1144;
		field1129 = var1.field1129;
		field1139 = var1.field1139;
		field1147 = var1.field1147;
		field1163 = var1.field1163;
		field1158 = var1.field1158;
		field1164 = var1.field1164;
		field1125 = var1.field1125;
		PTCSWKBP var2 = method489(field1132);
		field1118 = var2.field1118;
		field1165 = var2.field1165;
		field1128 = var2.field1128;
		String var3 = "a";
		char var4 = var2.field1118.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1123 = ("Swap this note at any bank for " + var3 + " " + var2.field1118 + ".").getBytes();
		field1143 = true;
	}

	@ObfuscatedName("PTCSWKBP.d(I)V")
	public static final void method499() {
		field1131 = null;
		field1126 = null;
		field1133 = null;
		field1159 = null;
		field1135 = null;
	}

	@ObfuscatedName("PTCSWKBP.b(II)Z")
	public final boolean method500(int arg0) {
		int var2 = field1148;
		int var3 = field1151;
		int var4 = field1141;
		if (arg0 == 1) {
			var2 = field1161;
			var3 = field1145;
			var4 = field1127;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!GFYXEFQY.method342(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !GFYXEFQY.method342(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !GFYXEFQY.method342(var4)) {
			var5 = false;
		}

		return var5;
	}
}
