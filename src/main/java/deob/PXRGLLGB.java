package deob;

@ObfuscatedName("PXRGLLGB")
public final class PXRGLLGB {

	@ObfuscatedName("PXRGLLGB.s")
	public int field1139 = -1;

	@ObfuscatedName("PXRGLLGB.P")
	public String field1160 = "null";

	@ObfuscatedName("PXRGLLGB.d")
	public static IYSWJGDE[] field1125 = new IYSWJGDE[4];

	@ObfuscatedName("PXRGLLGB.o")
	public static EQSIBNHW field1135 = new EQSIBNHW(500);

	@ObfuscatedName("PXRGLLGB.z")
	public static EQSIBNHW field1146 = new EQSIBNHW(40);

	@ObfuscatedName("PXRGLLGB.h")
	public byte field1129;

	@ObfuscatedName("PXRGLLGB.H")
	public byte field1152;

	@ObfuscatedName("PXRGLLGB.a")
	public static int field1122;

	@ObfuscatedName("PXRGLLGB.e")
	public int field1126;

	@ObfuscatedName("PXRGLLGB.f")
	public int field1127;

	@ObfuscatedName("PXRGLLGB.j")
	public static int field1131;

	@ObfuscatedName("PXRGLLGB.n")
	public int field1134;

	@ObfuscatedName("PXRGLLGB.u")
	public int field1141;

	@ObfuscatedName("PXRGLLGB.v")
	public int field1142;

	@ObfuscatedName("PXRGLLGB.y")
	public int field1145;

	@ObfuscatedName("PXRGLLGB.A")
	public int field1147;

	@ObfuscatedName("PXRGLLGB.D")
	public int field1149;

	@ObfuscatedName("PXRGLLGB.F")
	public int field1150;

	@ObfuscatedName("PXRGLLGB.I")
	public int field1153;

	@ObfuscatedName("PXRGLLGB.K")
	public int field1155;

	@ObfuscatedName("PXRGLLGB.T")
	public int field1164;

	@ObfuscatedName("PXRGLLGB.U")
	public int field1165;

	@ObfuscatedName("PXRGLLGB.V")
	public int field1166;

	@ObfuscatedName("PXRGLLGB.W")
	public int field1167;

	@ObfuscatedName("PXRGLLGB.X")
	public int field1168;

	@ObfuscatedName("PXRGLLGB.L")
	public static SVWJKJVI field1156;

	@ObfuscatedName("PXRGLLGB.p")
	public static client field1136;

	@ObfuscatedName("PXRGLLGB.b")
	public boolean field1123;

	@ObfuscatedName("PXRGLLGB.c")
	public boolean field1124;

	@ObfuscatedName("PXRGLLGB.i")
	public boolean field1130;

	@ObfuscatedName("PXRGLLGB.k")
	public boolean field1132;

	@ObfuscatedName("PXRGLLGB.q")
	public boolean field1137;

	@ObfuscatedName("PXRGLLGB.w")
	public boolean field1143;

	@ObfuscatedName("PXRGLLGB.x")
	public boolean field1144;

	@ObfuscatedName("PXRGLLGB.C")
	public boolean field1148;

	@ObfuscatedName("PXRGLLGB.G")
	public boolean field1151;

	@ObfuscatedName("PXRGLLGB.N")
	public static boolean field1158;

	@ObfuscatedName("PXRGLLGB.R")
	public boolean field1162;

	@ObfuscatedName("PXRGLLGB.O")
	public byte[] field1159;

	@ObfuscatedName("PXRGLLGB.g")
	public static int[] field1128;

	@ObfuscatedName("PXRGLLGB.l")
	public int[] field1133;

	@ObfuscatedName("PXRGLLGB.r")
	public int[] field1138;

	@ObfuscatedName("PXRGLLGB.t")
	public int[] field1140;

	@ObfuscatedName("PXRGLLGB.J")
	public int[] field1154;

	@ObfuscatedName("PXRGLLGB.Q")
	public int[] field1161;

	@ObfuscatedName("PXRGLLGB.M")
	public static PXRGLLGB[] field1157;

	@ObfuscatedName("PXRGLLGB.S")
	public String[] field1163;

	@ObfuscatedName("PXRGLLGB.a(IIII)LIYSWJGDE;")
	public final IYSWJGDE method413(int arg0, int arg1, int arg2) {
		IYSWJGDE var4 = null;
		long var5;
		if (field1140 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1139 << 6) + arg1);
			IYSWJGDE var7 = (IYSWJGDE) field1146.method175(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1161 == null) {
				return null;
			}

			boolean var8 = field1137 ^ arg1 > 3;
			int var9 = field1161.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1161[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (IYSWJGDE) field1135.method175(var11);
				if (var4 == null) {
					var4 = IYSWJGDE.method273(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method288();
					}

					field1135.method176(var11, var4);
				}

				if (var9 > 1) {
					field1125[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new IYSWJGDE(var9, field1125);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1140.length; var13++) {
				if (field1140[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1139 << 6) + (var12 << 3) + arg1);
			IYSWJGDE var14 = (IYSWJGDE) field1146.method175(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1161[var12];
			boolean var16 = field1137 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (IYSWJGDE) field1135.method175(var15);
			if (var4 == null) {
				var4 = IYSWJGDE.method273(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method288();
				}

				field1135.method176(var15, var4);
			}
		}

		boolean var17;
		if (field1134 == 128 && field1127 == 128 && field1126 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1147 == 0 && field1166 == 0 && field1153 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		IYSWJGDE var19 = new IYSWJGDE(PLSPTEPI.method406(arg2), var4, field1133 == null, arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method280();
			var19.method281(arg2);
			var19.field751 = null;
			var19.field750 = null;
		}

		while (arg1-- > 0) {
			var19.method284();
		}

		if (field1133 != null) {
			for (int var20 = 0; var20 < field1133.length; var20++) {
				var19.method287(field1133[var20], field1154[var20]);
			}
		}

		if (var17) {
			var19.method289(field1134, field1126, field1127);
		}

		if (var18) {
			var19.method286(field1166, field1153, field1147);
		}

		var19.method290(field1129 + 64, field1152 * 5 + 768, -50, -10, -50, !field1162);

		if (field1168 == 1) {
			var19.field747 = var19.field793;
		}

		field1146.method176(var5, var19);
		return var19;
	}

	@ObfuscatedName("PXRGLLGB.a(IIIIIII)LIYSWJGDE;")
	public final IYSWJGDE method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		IYSWJGDE var8 = method413(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1151 || field1162) {
			var8 = new IYSWJGDE(var8, field1151, field1162);
		}

		if (field1151) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field720; var10++) {
				int var11 = var8.field721[var10];
				int var12 = var8.field723[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field722[var10] += var15 - var9;
			}

			var8.method278();
		}

		return var8;
	}

	@ObfuscatedName("PXRGLLGB.a(ILIHBKBLZU;)V")
	public final void method415(IHBKBLZU arg0) {
		if (field1161 != null) {
			for (int var2 = 0; var2 < field1161.length; var2++) {
				arg0.method262(field1161[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("PXRGLLGB.a(LWEMOPWVJ;)V")
	public static final void method416(WEMOPWVJ arg0) {
		field1156 = new SVWJKJVI(arg0.method559("loc.dat", null));
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("loc.idx", null));
		field1131 = var1.method463();
		field1128 = new int[field1131];
		int var2 = 2;
		for (int var3 = 0; var3 < field1131; var3++) {
			field1128[var3] = var2;
			var2 += var1.method463();
		}

		field1157 = new PXRGLLGB[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1157[var4] = new PXRGLLGB();
		}
	}

	@ObfuscatedName("PXRGLLGB.a(I)LPXRGLLGB;")
	public static final PXRGLLGB method417(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1157[var1].field1139 == arg0) {
				return field1157[var1];
			}
		}

		field1122 = (field1122 + 1) % 20;
		PXRGLLGB var2 = field1157[field1122];
		field1156.field1263 = field1128[arg0];
		var2.field1139 = arg0;
		var2.method423();
		var2.method419(field1156);
		return var2;
	}

	@ObfuscatedName("PXRGLLGB.b(I)LPXRGLLGB;")
	public final PXRGLLGB method418() {
		int var1 = -1;
		if (field1145 != -1) {
			GQWQHTHS var2 = GQWQHTHS.field557[field1145];
			int var3 = var2.field559;
			int var4 = var2.field560;
			int var5 = var2.field561;
			int var6 = client.field191[var5 - var4];
			var1 = field1136.field178[var3] >> var4 & var6;
		} else if (field1141 != -1) {
			var1 = field1136.field178[field1141];
		}

		if (var1 >= 0 && var1 < field1138.length && field1138[var1] != -1) {
			return method417(field1138[var1]);
		}

		return null;
	}

	@ObfuscatedName("PXRGLLGB.a(ILSVWJKJVI;)V")
	public final void method419(SVWJKJVI arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method461();
					if (var3 == 0) {
						if (var2 == -1) {
							field1143 = false;
							if (field1161 != null && (field1140 == null || field1140[0] == 10)) {
								field1143 = true;
							}

							if (field1163 != null) {
								field1143 = true;
							}
						}

						if (field1144) {
							field1124 = false;
							field1132 = false;
						}

						if (field1168 == -1) {
							field1168 = field1124 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1160 = arg0.method468();
					} else if (var3 == 3) {
						field1159 = arg0.method469();
					} else if (var3 == 5) {
						int var6 = arg0.method461();
						if (var6 > 0) {
							if (field1161 == null || field1158) {
								field1140 = null;
								field1161 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1161[var7] = arg0.method463();
								}
							} else {
								arg0.field1263 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1142 = arg0.method461();
					} else if (var3 == 15) {
						field1149 = arg0.method461();
					} else if (var3 == 17) {
						field1124 = false;
					} else if (var3 == 18) {
						field1132 = false;
					} else if (var3 == 19) {
						var2 = arg0.method461();
						if (var2 == 1) {
							field1143 = true;
						}
					} else if (var3 == 21) {
						field1151 = true;
					} else if (var3 == 22) {
						field1162 = true;
					} else if (var3 == 23) {
						field1130 = true;
					} else if (var3 == 24) {
						field1165 = arg0.method463();
						if (field1165 == 0xFFFF) {
							field1165 = -1;
						}
					} else if (var3 == 28) {
						field1164 = arg0.method461();
					} else if (var3 == 29) {
						field1129 = arg0.method462();
					} else if (var3 == 39) {
						field1152 = arg0.method462();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1163 == null) {
							field1163 = new String[5];
						}

						field1163[var3 - 30] = arg0.method468();
						if (field1163[var3 - 30].equalsIgnoreCase("hidden")) {
							field1163[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method461();
						field1133 = new int[var8];
						field1154 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1133[var9] = arg0.method463();
							field1154[var9] = arg0.method463();
						}
					} else if (var3 == 60) {
						field1167 = arg0.method463();
					} else if (var3 == 62) {
						field1137 = true;
					} else if (var3 == 64) {
						field1148 = false;
					} else if (var3 == 65) {
						field1134 = arg0.method463();
					} else if (var3 == 66) {
						field1127 = arg0.method463();
					} else if (var3 == 67) {
						field1126 = arg0.method463();
					} else if (var3 == 68) {
						field1155 = arg0.method463();
					} else if (var3 == 69) {
						field1150 = arg0.method461();
					} else if (var3 == 70) {
						field1147 = arg0.method464();
					} else if (var3 == 71) {
						field1166 = arg0.method464();
					} else if (var3 == 72) {
						field1153 = arg0.method464();
					} else if (var3 == 73) {
						field1123 = true;
					} else if (var3 == 74) {
						field1144 = true;
					} else if (var3 == 75) {
						field1168 = arg0.method461();
					} else if (var3 == 77) {
						field1145 = arg0.method463();
						if (field1145 == 0xFFFF) {
							field1145 = -1;
						}

						field1141 = arg0.method463();
						if (field1141 == 0xFFFF) {
							field1141 = -1;
						}

						int var10 = arg0.method461();
						field1138 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1138[var11] = arg0.method463();
							if (field1138[var11] == 0xFFFF) {
								field1138[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method461();
			} while (var4 <= 0);

			if (field1161 == null || field1158) {
				field1140 = new int[var4];
				field1161 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1161[var5] = arg0.method463();
					field1140[var5] = arg0.method461();
				}
			} else {
				arg0.field1263 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("PXRGLLGB.c(I)V")
	public static final void method420() {
		field1135 = null;
		field1146 = null;
		field1128 = null;
		field1157 = null;
		field1156 = null;
	}

	@ObfuscatedName("PXRGLLGB.a(BI)Z")
	public final boolean method421(int arg0) {
		if (field1140 != null) {
			for (int var4 = 0; var4 < field1140.length; var4++) {
				if (field1140[var4] == arg0) {
					return IYSWJGDE.method274(field1161[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1161 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1161.length; var3++) {
				var2 &= IYSWJGDE.method274(field1161[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("PXRGLLGB.a(B)Z")
	public final boolean method422() {
		if (field1161 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1161.length; var2++) {
			var1 &= IYSWJGDE.method274(field1161[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("PXRGLLGB.a()V")
	public final void method423() {
		field1161 = null;
		field1140 = null;
		field1160 = "null";
		field1159 = null;
		field1133 = null;
		field1154 = null;
		field1142 = 1;
		field1149 = 1;
		field1124 = true;
		field1132 = true;
		field1143 = false;
		field1151 = false;
		field1162 = false;
		field1130 = false;
		field1165 = -1;
		field1164 = 16;
		field1129 = 0;
		field1152 = 0;
		field1163 = null;
		field1167 = -1;
		field1155 = -1;
		field1137 = false;
		field1148 = true;
		field1134 = 128;
		field1127 = 128;
		field1126 = 128;
		field1150 = 0;
		field1147 = 0;
		field1166 = 0;
		field1153 = 0;
		field1123 = false;
		field1144 = false;
		field1168 = -1;
		field1145 = -1;
		field1141 = -1;
		field1138 = null;
	}
}
