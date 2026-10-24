package deob;

@ObfuscatedName("USEDZXXV")
public class USEDZXXV {

	@ObfuscatedName("USEDZXXV.gb")
	public static HGKRJZKS field1165 = new HGKRJZKS(30);

	@ObfuscatedName("USEDZXXV.lb")
	public byte field1170;

	@ObfuscatedName("USEDZXXV.c")
	public int field1110;

	@ObfuscatedName("USEDZXXV.d")
	public int field1111;

	@ObfuscatedName("USEDZXXV.e")
	public int field1112;

	@ObfuscatedName("USEDZXXV.h")
	public int field1115;

	@ObfuscatedName("USEDZXXV.i")
	public int field1116;

	@ObfuscatedName("USEDZXXV.j")
	public int field1117;

	@ObfuscatedName("USEDZXXV.k")
	public int field1118;

	@ObfuscatedName("USEDZXXV.l")
	public int field1119;

	@ObfuscatedName("USEDZXXV.n")
	public int field1121;

	@ObfuscatedName("USEDZXXV.q")
	public int field1124;

	@ObfuscatedName("USEDZXXV.r")
	public int field1125;

	@ObfuscatedName("USEDZXXV.t")
	public int field1127;

	@ObfuscatedName("USEDZXXV.u")
	public int field1128;

	@ObfuscatedName("USEDZXXV.w")
	public int field1130;

	@ObfuscatedName("USEDZXXV.A")
	public int field1134;

	@ObfuscatedName("USEDZXXV.B")
	public int field1135;

	@ObfuscatedName("USEDZXXV.D")
	public int field1137;

	@ObfuscatedName("USEDZXXV.F")
	public int field1139;

	@ObfuscatedName("USEDZXXV.G")
	public int field1140;

	@ObfuscatedName("USEDZXXV.I")
	public int field1142;

	@ObfuscatedName("USEDZXXV.N")
	public int field1147;

	@ObfuscatedName("USEDZXXV.O")
	public int field1148;

	@ObfuscatedName("USEDZXXV.P")
	public int field1149;

	@ObfuscatedName("USEDZXXV.Q")
	public int field1150;

	@ObfuscatedName("USEDZXXV.S")
	public int field1152;

	@ObfuscatedName("USEDZXXV.T")
	public int field1153;

	@ObfuscatedName("USEDZXXV.X")
	public int field1157;

	@ObfuscatedName("USEDZXXV.Y")
	public int field1158;

	@ObfuscatedName("USEDZXXV.bb")
	public int field1161;

	@ObfuscatedName("USEDZXXV.fb")
	public int field1164;

	@ObfuscatedName("USEDZXXV.mb")
	public int field1171;

	@ObfuscatedName("USEDZXXV.o")
	public DBRMEPJQ field1122;

	@ObfuscatedName("USEDZXXV.ab")
	public static HGKRJZKS field1160;

	@ObfuscatedName("USEDZXXV.s")
	public INVDQNJU field1126;

	@ObfuscatedName("USEDZXXV.R")
	public INVDQNJU field1151;

	@ObfuscatedName("USEDZXXV.b")
	public String field1109;

	@ObfuscatedName("USEDZXXV.p")
	public String field1123;

	@ObfuscatedName("USEDZXXV.x")
	public String field1131;

	@ObfuscatedName("USEDZXXV.U")
	public String field1154;

	@ObfuscatedName("USEDZXXV.ib")
	public String field1167;

	@ObfuscatedName("USEDZXXV.g")
	public boolean field1114;

	@ObfuscatedName("USEDZXXV.m")
	public boolean field1120;

	@ObfuscatedName("USEDZXXV.v")
	public boolean field1129;

	@ObfuscatedName("USEDZXXV.z")
	public boolean field1133;

	@ObfuscatedName("USEDZXXV.C")
	public boolean field1136;

	@ObfuscatedName("USEDZXXV.E")
	public boolean field1138;

	@ObfuscatedName("USEDZXXV.J")
	public boolean field1143;

	@ObfuscatedName("USEDZXXV.W")
	public boolean field1156;

	@ObfuscatedName("USEDZXXV.db")
	public boolean field1163;

	@ObfuscatedName("USEDZXXV.a")
	public int[] field1108;

	@ObfuscatedName("USEDZXXV.y")
	public int[] field1132;

	@ObfuscatedName("USEDZXXV.M")
	public int[] field1146;

	@ObfuscatedName("USEDZXXV.V")
	public int[] field1155;

	@ObfuscatedName("USEDZXXV.Z")
	public int[] field1159;

	@ObfuscatedName("USEDZXXV.cb")
	public int[] field1162;

	@ObfuscatedName("USEDZXXV.hb")
	public int[] field1166;

	@ObfuscatedName("USEDZXXV.jb")
	public int[] field1168;

	@ObfuscatedName("USEDZXXV.kb")
	public int[] field1169;

	@ObfuscatedName("USEDZXXV.K")
	public INVDQNJU[] field1144;

	@ObfuscatedName("USEDZXXV.f")
	public static USEDZXXV[] field1113;

	@ObfuscatedName("USEDZXXV.H")
	public String[] field1141;

	@ObfuscatedName("USEDZXXV.L")
	public int[][] field1145;

	@ObfuscatedName("USEDZXXV.a(III)V")
	public void method490(int arg0, int arg1) {
		int var3 = field1155[arg0];
		field1155[arg0] = field1155[arg1];
		field1155[arg1] = var3;
		int var4 = field1169[arg0];
		field1169[arg0] = field1169[arg1];
		field1169[arg1] = var4;
	}

	@ObfuscatedName("USEDZXXV.a(Ljava/lang/String;ILXRWUKRPO;I)LINVDQNJU;")
	public static INVDQNJU method491(String arg0, int arg1, XRWUKRPO arg2) {
		long var3 = (YYRFHIVS.method585(arg0) << 8) + arg1;
		INVDQNJU var5 = (INVDQNJU) field1160.method285(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			INVDQNJU var6 = new INVDQNJU(arg2, arg0, arg1);
			field1160.method286(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("USEDZXXV.a(ZLXRWUKRPO;[LDBRMEPJQ;LXRWUKRPO;)V")
	public static void method492(XRWUKRPO arg0, DBRMEPJQ[] arg1, XRWUKRPO arg2) {
		field1160 = new HGKRJZKS(50000);
		GLMIQHJI var3 = new GLMIQHJI(arg2.method581("data", null));
		int var4 = -1;
		int var5 = var3.method246();
		field1113 = new USEDZXXV[var5];
		while (true) {
			USEDZXXV var7;
			do {
				if (var3.field709 >= var3.field708.length) {
					field1160 = null;
					return;
				}

				int var6 = var3.method246();
				if (var6 == 0xFFFF) {
					var4 = var3.method246();
					var6 = var3.method246();
				}

				var7 = field1113[var6] = new USEDZXXV();
				var7.field1164 = var6;
				var7.field1153 = var4;
				var7.field1134 = var3.method244();
				var7.field1147 = var3.method244();
				var7.field1157 = var3.method246();
				var7.field1158 = var3.method246();
				var7.field1152 = var3.method246();
				var7.field1170 = (byte) var3.method244();
				var7.field1139 = var3.method244();
				if (var7.field1139 == 0) {
					var7.field1139 = -1;
				} else {
					var7.field1139 = (var7.field1139 - 1 << 8) + var3.method244();
				}

				int var8 = var3.method244();
				if (var8 > 0) {
					var7.field1159 = new int[var8];
					var7.field1162 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field1159[var9] = var3.method244();
						var7.field1162[var9] = var3.method246();
					}
				}

				int var10 = var3.method244();
				if (var10 > 0) {
					var7.field1145 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method246();
						var7.field1145[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field1145[var11][var13] = var3.method246();
						}
					}
				}

				if (var7.field1134 == 0) {
					var7.field1124 = var3.method246();
					var7.field1120 = var3.method244() == 1;
					int var14 = var3.method246();
					var7.field1132 = new int[var14];
					var7.field1168 = new int[var14];
					var7.field1146 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field1132[var15] = var3.method246();
						var7.field1168[var15] = var3.method247();
						var7.field1146[var15] = var3.method247();
					}
				}

				if (var7.field1134 == 1) {
					var7.field1135 = var3.method246();
					var7.field1156 = var3.method244() == 1;
				}

				if (var7.field1134 == 2) {
					var7.field1155 = new int[var7.field1158 * var7.field1152];
					var7.field1169 = new int[var7.field1158 * var7.field1152];
					var7.field1138 = var3.method244() == 1;
					var7.field1114 = var3.method244() == 1;
					var7.field1163 = var3.method244() == 1;
					var7.field1129 = var3.method244() == 1;
					var7.field1121 = var3.method244();
					var7.field1115 = var3.method244();
					var7.field1166 = new int[20];
					var7.field1108 = new int[20];
					var7.field1144 = new INVDQNJU[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method244();
						if (var17 == 1) {
							var7.field1166[var16] = var3.method247();
							var7.field1108[var16] = var3.method247();
							String var18 = var3.method251();
							if (arg0 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field1144[var16] = method491(var18.substring(0, var19), Integer.parseInt(var18.substring(var19 + 1)), arg0);
							}
						}
					}

					var7.field1141 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field1141[var20] = var3.method251();
						if (var7.field1141[var20].length() == 0) {
							var7.field1141[var20] = null;
						}
					}
				}

				if (var7.field1134 == 3) {
					var7.field1136 = var3.method244() == 1;
				}

				if (var7.field1134 == 4 || var7.field1134 == 1) {
					var7.field1143 = var3.method244() == 1;
					int var21 = var3.method244();
					if (arg1 != null) {
						var7.field1122 = arg1[var21];
					}

					var7.field1133 = var3.method244() == 1;
				}

				if (var7.field1134 == 4) {
					var7.field1167 = var3.method251();
					var7.field1131 = var3.method251();
				}

				if (var7.field1134 == 1 || var7.field1134 == 3 || var7.field1134 == 4) {
					var7.field1137 = var3.method249();
				}

				if (var7.field1134 == 3 || var7.field1134 == 4) {
					var7.field1130 = var3.method249();
					var7.field1171 = var3.method249();
					var7.field1140 = var3.method249();
				}

				if (var7.field1134 == 5) {
					String var22 = var3.method251();
					if (arg0 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field1126 = method491(var22.substring(0, var23), Integer.parseInt(var22.substring(var23 + 1)), arg0);
					}

					String var24 = var3.method251();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field1151 = method491(var24.substring(0, var25), Integer.parseInt(var24.substring(var25 + 1)), arg0);
					}
				}

				if (var7.field1134 == 6) {
					int var26 = var3.method244();
					if (var26 != 0) {
						var7.field1127 = 1;
						var7.field1128 = (var26 - 1 << 8) + var3.method244();
					}

					int var27 = var3.method244();
					if (var27 != 0) {
						var7.field1118 = 1;
						var7.field1119 = (var27 - 1 << 8) + var3.method244();
					}

					int var28 = var3.method244();
					if (var28 == 0) {
						var7.field1149 = -1;
					} else {
						var7.field1149 = (var28 - 1 << 8) + var3.method244();
					}

					int var29 = var3.method244();
					if (var29 == 0) {
						var7.field1150 = -1;
					} else {
						var7.field1150 = (var29 - 1 << 8) + var3.method244();
					}

					var7.field1110 = var3.method246();
					var7.field1111 = var3.method246();
					var7.field1112 = var3.method246();
				}

				if (var7.field1134 == 7) {
					var7.field1155 = new int[var7.field1158 * var7.field1152];
					var7.field1169 = new int[var7.field1158 * var7.field1152];
					var7.field1143 = var3.method244() == 1;
					int var30 = var3.method244();
					if (arg1 != null) {
						var7.field1122 = arg1[var30];
					}

					var7.field1133 = var3.method244() == 1;
					var7.field1137 = var3.method249();
					var7.field1121 = var3.method247();
					var7.field1115 = var3.method247();
					var7.field1114 = var3.method244() == 1;
					var7.field1141 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field1141[var31] = var3.method251();
						if (var7.field1141[var31].length() == 0) {
							var7.field1141[var31] = null;
						}
					}
				}

				if (var7.field1147 == 2 || var7.field1134 == 2) {
					var7.field1109 = var3.method251();
					var7.field1123 = var3.method251();
					var7.field1148 = var3.method246();
				}
			} while (var7.field1147 != 1 && var7.field1147 != 4 && var7.field1147 != 5 && var7.field1147 != 6);

			var7.field1154 = var3.method251();
			if (var7.field1154.length() == 0) {
				if (var7.field1147 == 1) {
					var7.field1154 = "Ok";
				}

				if (var7.field1147 == 4) {
					var7.field1154 = "Select";
				}

				if (var7.field1147 == 5) {
					var7.field1154 = "Select";
				}

				if (var7.field1147 == 6) {
					var7.field1154 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("USEDZXXV.a(II)LVHYCWIPJ;")
	public VHYCWIPJ method493(int arg0, int arg1) {
		VHYCWIPJ var3 = (VHYCWIPJ) field1165.method285((arg0 << 16) + arg1);
		if (var3 != null) {
			return var3;
		}

		if (arg0 == 1) {
			var3 = VHYCWIPJ.method500(arg1);
		}

		if (arg0 == 2) {
			var3 = LPTCUHOU.method380(arg1).method378();
		}

		if (arg0 == 3) {
			var3 = client.field535.method406();
		}

		if (arg0 == 4) {
			var3 = AVSLDGMK.method4(arg1).method11(50);
		}

		if (arg0 == 5) {
			var3 = null;
		}

		if (var3 != null) {
			field1165.method286((arg0 << 16) + arg1, var3);
		}

		return var3;
	}

	@ObfuscatedName("USEDZXXV.a(ZIII)LVHYCWIPJ;")
	public VHYCWIPJ method494(boolean arg0, int arg1, int arg2) {
		VHYCWIPJ var4;
		if (arg0) {
			var4 = method493(field1118, field1119);
		} else {
			var4 = method493(field1127, field1128);
		}

		if (var4 == null) {
			return null;
		} else if (arg2 == -1 && arg1 == -1 && var4.field1192 == null) {
			return var4;
		} else {
			VHYCWIPJ var5 = new VHYCWIPJ(TTZHVWEG.method489(arg2) & TTZHVWEG.method489(arg1), true, false, var4);
			if (arg2 != -1 || arg1 != -1) {
				var5.method507();
			}

			if (arg2 != -1) {
				var5.method508(arg2);
			}

			if (arg1 != -1) {
				var5.method508(arg1);
			}

			var5.method517(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("USEDZXXV.a(BLVHYCWIPJ;II)V")
	public static void method495(VHYCWIPJ arg0, int arg1, int arg2) {
		field1165.method287();

		if (arg0 != null && arg1 != 4) {
			field1165.method286((arg1 << 16) + arg2, arg0);
		}
	}
}
