package deob;

@ObfuscatedName("PFWIJTDA")
public final class PFWIJTDA {

	@ObfuscatedName("PFWIJTDA.b")
	public int field1120 = -1;

	@ObfuscatedName("PFWIJTDA.d")
	public long field1122 = -1L;

	@ObfuscatedName("PFWIJTDA.f")
	public int field1124 = -1;

	@ObfuscatedName("PFWIJTDA.h")
	public int field1126 = -1;

	@ObfuscatedName("PFWIJTDA.i")
	public boolean field1127 = true;

	@ObfuscatedName("PFWIJTDA.m")
	public boolean field1130 = false;

	@ObfuscatedName("PFWIJTDA.n")
	public boolean field1131 = true;

	@ObfuscatedName("PFWIJTDA.o")
	public int field1132 = -1;

	@ObfuscatedName("PFWIJTDA.s")
	public byte field1136 = 1;

	@ObfuscatedName("PFWIJTDA.v")
	public int field1138 = 128;

	@ObfuscatedName("PFWIJTDA.z")
	public int field1141 = 32;

	@ObfuscatedName("PFWIJTDA.A")
	public int field1142 = -1;

	@ObfuscatedName("PFWIJTDA.C")
	public int field1144 = -1;

	@ObfuscatedName("PFWIJTDA.D")
	public int field1145 = -1;

	@ObfuscatedName("PFWIJTDA.E")
	public int field1146 = -1;

	@ObfuscatedName("PFWIJTDA.F")
	public int field1147 = 128;

	@ObfuscatedName("PFWIJTDA.H")
	public int field1149 = -1;

	@ObfuscatedName("PFWIJTDA.I")
	public String field1150 = "null";

	@ObfuscatedName("PFWIJTDA.L")
	public int field1152 = -1;

	@ObfuscatedName("PFWIJTDA.M")
	public int field1153 = -1;

	@ObfuscatedName("PFWIJTDA.N")
	public int field1154 = -1;

	@ObfuscatedName("PFWIJTDA.w")
	public static NVDACYAH field1139 = new NVDACYAH(30);

	@ObfuscatedName("PFWIJTDA.c")
	public int field1121;

	@ObfuscatedName("PFWIJTDA.l")
	public static int field1129;

	@ObfuscatedName("PFWIJTDA.q")
	public static int field1134;

	@ObfuscatedName("PFWIJTDA.G")
	public int field1148;

	@ObfuscatedName("PFWIJTDA.r")
	public static MNKDCXXG field1135;

	@ObfuscatedName("PFWIJTDA.g")
	public static client field1125;

	@ObfuscatedName("PFWIJTDA.y")
	public byte[] field1140;

	@ObfuscatedName("PFWIJTDA.a")
	public static int[] field1119;

	@ObfuscatedName("PFWIJTDA.k")
	public int[] field1128;

	@ObfuscatedName("PFWIJTDA.p")
	public int[] field1133;

	@ObfuscatedName("PFWIJTDA.B")
	public int[] field1143;

	@ObfuscatedName("PFWIJTDA.J")
	public int[] field1151;

	@ObfuscatedName("PFWIJTDA.O")
	public int[] field1155;

	@ObfuscatedName("PFWIJTDA.e")
	public static PFWIJTDA[] field1123;

	@ObfuscatedName("PFWIJTDA.u")
	public String[] field1137;

	@ObfuscatedName("PFWIJTDA.a(I)LIRLTEWJP;")
	public final IRLTEWJP method436() {
		if (field1128 != null) {
			PFWIJTDA var1 = method437();
			if (var1 == null) {
				return null;
			}

			return var1.method436();
		} else if (field1151 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1151.length; var3++) {
				if (!IRLTEWJP.method282(field1151[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			IRLTEWJP[] var4 = new IRLTEWJP[field1151.length];
			for (int var5 = 0; var5 < field1151.length; var5++) {
				var4[var5] = IRLTEWJP.method281(field1151[var5]);
			}

			IRLTEWJP var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new IRLTEWJP(var4.length, var4);
			}

			if (field1155 != null) {
				for (int var7 = 0; var7 < field1155.length; var7++) {
					var6.method295(field1155[var7], field1133[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("PFWIJTDA.b(I)LPFWIJTDA;")
	public final PFWIJTDA method437() {
		int var1 = -1;
		if (field1146 != -1) {
			NPQMEWIH var2 = NPQMEWIH.field1074[field1146];
			int var3 = var2.field1076;
			int var4 = var2.field1077;
			int var5 = var2.field1078;
			int var6 = client.field393[var5 - var4];
			var1 = field1125.field439[var3] >> var4 & var6;
		} else if (field1132 != -1) {
			var1 = field1125.field439[field1132];
		}

		if (var1 >= 0 && var1 < field1128.length && field1128[var1] != -1) {
			return method442(field1128[var1]);
		}

		return null;
	}

	@ObfuscatedName("PFWIJTDA.a(LNXFIIFAD;)V")
	public static final void method438(NXFIIFAD arg0) {
		field1135 = new MNKDCXXG(arg0.method431("npc.dat", null));
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("npc.idx", null));
		field1129 = var1.method388();
		field1119 = new int[field1129];
		int var2 = 2;
		for (int var3 = 0; var3 < field1129; var3++) {
			field1119[var3] = var2;
			var2 += var1.method388();
		}

		field1123 = new PFWIJTDA[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1123[var4] = new PFWIJTDA();
		}
	}

	@ObfuscatedName("PFWIJTDA.a(LMNKDCXXG;I)V")
	public final void method439(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method386();
				field1143 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1143[var4] = arg0.method388();
				}
			} else if (var2 == 2) {
				field1150 = arg0.method393();
			} else if (var2 == 3) {
				field1140 = arg0.method394();
			} else if (var2 == 12) {
				field1136 = arg0.method387();
			} else if (var2 == 13) {
				field1152 = arg0.method388();
			} else if (var2 == 14) {
				field1126 = arg0.method388();
			} else if (var2 == 17) {
				field1126 = arg0.method388();
				field1120 = arg0.method388();
				field1142 = arg0.method388();
				field1144 = arg0.method388();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1137 == null) {
					field1137 = new String[5];
				}

				field1137[var2 - 30] = arg0.method393();
				if (field1137[var2 - 30].equalsIgnoreCase("hidden")) {
					field1137[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method386();
				field1155 = new int[var5];
				field1133 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1155[var6] = arg0.method388();
					field1133[var6] = arg0.method388();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method386();
				field1151 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1151[var8] = arg0.method388();
				}
			} else if (var2 == 90) {
				field1149 = arg0.method388();
			} else if (var2 == 91) {
				field1154 = arg0.method388();
			} else if (var2 == 92) {
				field1124 = arg0.method388();
			} else if (var2 == 93) {
				field1131 = false;
			} else if (var2 == 95) {
				field1145 = arg0.method388();
			} else if (var2 == 97) {
				field1147 = arg0.method388();
			} else if (var2 == 98) {
				field1138 = arg0.method388();
			} else if (var2 == 99) {
				field1130 = true;
			} else if (var2 == 100) {
				field1121 = arg0.method387();
			} else if (var2 == 101) {
				field1148 = arg0.method387() * 5;
			} else if (var2 == 102) {
				field1153 = arg0.method388();
			} else if (var2 == 103) {
				field1141 = arg0.method388();
			} else if (var2 == 106) {
				field1146 = arg0.method388();
				if (field1146 == 0xFFFF) {
					field1146 = -1;
				}

				field1132 = arg0.method388();
				if (field1132 == 0xFFFF) {
					field1132 = -1;
				}

				int var9 = arg0.method386();
				field1128 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1128[var10] = arg0.method388();
					if (field1128[var10] == 0xFFFF) {
						field1128[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1127 = false;
			}
		}
	}

	@ObfuscatedName("PFWIJTDA.a([IIII)LIRLTEWJP;")
	public final IRLTEWJP method440(int[] arg0, int arg1, int arg2) {
		if (field1128 != null) {
			PFWIJTDA var4 = method437();
			if (var4 == null) {
				return null;
			}

			return var4.method440(arg0, arg1, arg2);
		}

		IRLTEWJP var5 = (IRLTEWJP) field1139.method427(field1122);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1143.length; var7++) {
				if (!IRLTEWJP.method282(field1143[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			IRLTEWJP[] var8 = new IRLTEWJP[field1143.length];
			for (int var9 = 0; var9 < field1143.length; var9++) {
				var8[var9] = IRLTEWJP.method281(field1143[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new IRLTEWJP(var8.length, var8);
			}

			if (field1155 != null) {
				for (int var10 = 0; var10 < field1155.length; var10++) {
					var5.method295(field1155[var10], field1133[var10]);
				}
			}

			var5.method288();
			var5.method298(field1121 + 64, field1148 + 850, -30, -50, -30, true);
			field1139.method428(field1122, var5);
		}

		IRLTEWJP var11 = IRLTEWJP.field874;
		var11.method283(var5, FIYHSKKC.method211(arg2) & FIYHSKKC.method211(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method290(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method289(arg2);
		}

		if (field1147 != 128 || field1138 != 128) {
			var11.method297(field1147, field1138, field1147);
		}

		var11.method285();
		var11.field910 = null;
		var11.field909 = null;

		if (field1136 == 1) {
			var11.field911 = true;
		}

		return var11;
	}

	@ObfuscatedName("PFWIJTDA.c(I)Z")
	public boolean method441() {
		if (field1128 == null) {
			return true;
		}

		int var1 = -1;
		if (field1146 != -1) {
			NPQMEWIH var2 = NPQMEWIH.field1074[field1146];
			int var3 = var2.field1076;
			int var4 = var2.field1077;
			int var5 = var2.field1078;
			int var6 = client.field393[var5 - var4];
			var1 = field1125.field439[var3] >> var4 & var6;
		} else if (field1132 != -1) {
			var1 = field1125.field439[field1132];
		}

		if (var1 >= 0 && var1 < field1128.length && field1128[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("PFWIJTDA.d(I)LPFWIJTDA;")
	public static final PFWIJTDA method442(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1123[var1].field1122) {
				return field1123[var1];
			}
		}

		field1134 = (field1134 + 1) % 20;
		PFWIJTDA var2 = field1123[field1134] = new PFWIJTDA();
		field1135.field1055 = field1119[arg0];
		var2.field1122 = arg0;
		var2.method439(field1135);
		return var2;
	}

	@ObfuscatedName("PFWIJTDA.e(I)V")
	public static final void method443() {
		field1139 = null;
		field1119 = null;
		field1123 = null;
		field1135 = null;
	}
}
