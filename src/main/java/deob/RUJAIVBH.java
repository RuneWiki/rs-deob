package deob;

@ObfuscatedName("RUJAIVBH")
public final class RUJAIVBH {

	@ObfuscatedName("RUJAIVBH.l")
	public int field1145 = -1;

	@ObfuscatedName("RUJAIVBH.c")
	public static GEUHTGZJ[] field1138 = new GEUHTGZJ[4];

	@ObfuscatedName("RUJAIVBH.r")
	public static TUCAQTOR field1151 = new TUCAQTOR(500);

	@ObfuscatedName("RUJAIVBH.O")
	public static TUCAQTOR field1170 = new TUCAQTOR(30);

	@ObfuscatedName("RUJAIVBH.A")
	public byte field1158;

	@ObfuscatedName("RUJAIVBH.D")
	public byte field1160;

	@ObfuscatedName("RUJAIVBH.a")
	public int field1136;

	@ObfuscatedName("RUJAIVBH.i")
	public int field1142;

	@ObfuscatedName("RUJAIVBH.n")
	public int field1147;

	@ObfuscatedName("RUJAIVBH.o")
	public int field1148;

	@ObfuscatedName("RUJAIVBH.p")
	public int field1149;

	@ObfuscatedName("RUJAIVBH.q")
	public int field1150;

	@ObfuscatedName("RUJAIVBH.t")
	public int field1152;

	@ObfuscatedName("RUJAIVBH.v")
	public static int field1154;

	@ObfuscatedName("RUJAIVBH.w")
	public static int field1155;

	@ObfuscatedName("RUJAIVBH.x")
	public int field1156;

	@ObfuscatedName("RUJAIVBH.E")
	public int field1161;

	@ObfuscatedName("RUJAIVBH.G")
	public int field1163;

	@ObfuscatedName("RUJAIVBH.K")
	public int field1166;

	@ObfuscatedName("RUJAIVBH.L")
	public int field1167;

	@ObfuscatedName("RUJAIVBH.N")
	public int field1169;

	@ObfuscatedName("RUJAIVBH.S")
	public int field1174;

	@ObfuscatedName("RUJAIVBH.T")
	public int field1175;

	@ObfuscatedName("RUJAIVBH.Z")
	public int field1180;

	@ObfuscatedName("RUJAIVBH.g")
	public static KHOMSBHW field1141;

	@ObfuscatedName("RUJAIVBH.V")
	public static client field1176;

	@ObfuscatedName("RUJAIVBH.z")
	public String field1157;

	@ObfuscatedName("RUJAIVBH.f")
	public boolean field1140;

	@ObfuscatedName("RUJAIVBH.k")
	public boolean field1144;

	@ObfuscatedName("RUJAIVBH.H")
	public boolean field1164;

	@ObfuscatedName("RUJAIVBH.I")
	public boolean field1165;

	@ObfuscatedName("RUJAIVBH.P")
	public boolean field1171;

	@ObfuscatedName("RUJAIVBH.R")
	public static boolean field1173;

	@ObfuscatedName("RUJAIVBH.W")
	public boolean field1177;

	@ObfuscatedName("RUJAIVBH.X")
	public boolean field1178;

	@ObfuscatedName("RUJAIVBH.Y")
	public boolean field1179;

	@ObfuscatedName("RUJAIVBH.ab")
	public boolean field1181;

	@ObfuscatedName("RUJAIVBH.bb")
	public boolean field1182;

	@ObfuscatedName("RUJAIVBH.C")
	public byte[] field1159;

	@ObfuscatedName("RUJAIVBH.b")
	public static int[] field1137;

	@ObfuscatedName("RUJAIVBH.d")
	public int[] field1139;

	@ObfuscatedName("RUJAIVBH.j")
	public int[] field1143;

	@ObfuscatedName("RUJAIVBH.m")
	public int[] field1146;

	@ObfuscatedName("RUJAIVBH.M")
	public int[] field1168;

	@ObfuscatedName("RUJAIVBH.Q")
	public int[] field1172;

	@ObfuscatedName("RUJAIVBH.F")
	public static RUJAIVBH[] field1162;

	@ObfuscatedName("RUJAIVBH.u")
	public String[] field1153;

	@ObfuscatedName("RUJAIVBH.a(IIIIIII)LGEUHTGZJ;")
	public final GEUHTGZJ method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		GEUHTGZJ var8 = method511(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field1181 || field1144) {
			var8 = new GEUHTGZJ(var8, field1181, field1144);
		}

		if (field1181) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field714; var10++) {
				int var11 = var8.field715[var10];
				int var12 = var8.field717[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field716[var10] += var15 - var9;
			}

			var8.method290();
		}

		return var8;
	}

	@ObfuscatedName("RUJAIVBH.a(LSYUGXMZF;)V")
	public static final void method506(SYUGXMZF arg0) {
		field1141 = new KHOMSBHW(arg0.method551("loc.dat", null));
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("loc.idx", null));
		field1154 = var1.method351();
		field1137 = new int[field1154];
		int var2 = 2;
		for (int var3 = 0; var3 < field1154; var3++) {
			field1137[var3] = var2;
			var2 += var1.method351();
		}

		field1162 = new RUJAIVBH[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1162[var4] = new RUJAIVBH();
		}
	}

	@ObfuscatedName("RUJAIVBH.a(LKHOMSBHW;I)V")
	public final void method507(KHOMSBHW arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method349();
					if (var3 == 0) {
						if (var2 == -1) {
							field1164 = false;
							if (field1139 != null && (field1172 == null || field1172[0] == 10)) {
								field1164 = true;
							}

							if (field1153 != null) {
								field1164 = true;
							}
						}

						if (field1178) {
							field1179 = false;
							field1165 = false;
						}

						if (field1175 == -1) {
							field1175 = field1179 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1157 = arg0.method356();
					} else if (var3 == 3) {
						field1159 = arg0.method357();
					} else if (var3 == 5) {
						int var6 = arg0.method349();
						if (var6 > 0) {
							if (field1139 == null || field1173) {
								field1172 = null;
								field1139 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1139[var7] = arg0.method351();
								}
							} else {
								arg0.field934 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1174 = arg0.method349();
					} else if (var3 == 15) {
						field1180 = arg0.method349();
					} else if (var3 == 17) {
						field1179 = false;
					} else if (var3 == 18) {
						field1165 = false;
					} else if (var3 == 19) {
						var2 = arg0.method349();
						if (var2 == 1) {
							field1164 = true;
						}
					} else if (var3 == 21) {
						field1181 = true;
					} else if (var3 == 22) {
						field1144 = true;
					} else if (var3 == 23) {
						field1171 = true;
					} else if (var3 == 24) {
						field1163 = arg0.method351();
						if (field1163 == 0xFFFF) {
							field1163 = -1;
						}
					} else if (var3 == 28) {
						field1136 = arg0.method349();
					} else if (var3 == 29) {
						field1158 = arg0.method350();
					} else if (var3 == 39) {
						field1160 = arg0.method350();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1153 == null) {
							field1153 = new String[5];
						}

						field1153[var3 - 30] = arg0.method356();
						if (field1153[var3 - 30].equalsIgnoreCase("hidden")) {
							field1153[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method349();
						field1143 = new int[var8];
						field1146 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1143[var9] = arg0.method351();
							field1146[var9] = arg0.method351();
						}
					} else if (var3 == 60) {
						field1169 = arg0.method351();
					} else if (var3 == 62) {
						field1140 = true;
					} else if (var3 == 64) {
						field1182 = false;
					} else if (var3 == 65) {
						field1166 = arg0.method351();
					} else if (var3 == 66) {
						field1147 = arg0.method351();
					} else if (var3 == 67) {
						field1149 = arg0.method351();
					} else if (var3 == 68) {
						field1150 = arg0.method351();
					} else if (var3 == 69) {
						field1142 = arg0.method349();
					} else if (var3 == 70) {
						field1167 = arg0.method352();
					} else if (var3 == 71) {
						field1152 = arg0.method352();
					} else if (var3 == 72) {
						field1161 = arg0.method352();
					} else if (var3 == 73) {
						field1177 = true;
					} else if (var3 == 74) {
						field1178 = true;
					} else if (var3 == 75) {
						field1175 = arg0.method349();
					} else if (var3 == 77) {
						field1148 = arg0.method351();
						if (field1148 == 0xFFFF) {
							field1148 = -1;
						}

						field1156 = arg0.method351();
						if (field1156 == 0xFFFF) {
							field1156 = -1;
						}

						int var10 = arg0.method349();
						field1168 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1168[var11] = arg0.method351();
							if (field1168[var11] == 0xFFFF) {
								field1168[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method349();
			} while (var4 <= 0);

			if (field1139 == null || field1173) {
				field1172 = new int[var4];
				field1139 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1139[var5] = arg0.method351();
					field1172[var5] = arg0.method349();
				}
			} else {
				arg0.field934 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("RUJAIVBH.a(B)Z")
	public final boolean method508() {
		if (field1139 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1139.length; var2++) {
			var1 &= GEUHTGZJ.method286(field1139[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("RUJAIVBH.a(I)V")
	public static final void method509() {
		field1151 = null;
		field1170 = null;
		field1137 = null;
		field1162 = null;
		field1141 = null;
	}

	@ObfuscatedName("RUJAIVBH.b(I)LRUJAIVBH;")
	public final RUJAIVBH method510() {
		int var1 = -1;
		if (field1148 != -1) {
			GAQBLBTP var2 = GAQBLBTP.field700[field1148];
			int var3 = var2.field702;
			int var4 = var2.field703;
			int var5 = var2.field704;
			int var6 = client.field480[var5 - var4];
			var1 = field1176.field257[var3] >> var4 & var6;
		} else if (field1156 != -1) {
			var1 = field1176.field257[field1156];
		}

		if (var1 >= 0 && var1 < field1168.length && field1168[var1] != -1) {
			return method512(field1168[var1]);
		}

		return null;
	}

	@ObfuscatedName("RUJAIVBH.a(IIII)LGEUHTGZJ;")
	public final GEUHTGZJ method511(int arg0, int arg1, int arg2) {
		GEUHTGZJ var4 = null;
		long var5;
		if (field1172 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1145 << 6) + arg2);
			GEUHTGZJ var7 = (GEUHTGZJ) field1170.method566(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1139 == null) {
				return null;
			}

			boolean var8 = field1140 ^ arg2 > 3;
			int var9 = field1139.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1139[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (GEUHTGZJ) field1151.method566(var11);
				if (var4 == null) {
					var4 = GEUHTGZJ.method285(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method300();
					}

					field1151.method567(var4, var11);
				}

				if (var9 > 1) {
					field1138[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new GEUHTGZJ(field1138, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1172.length; var13++) {
				if (field1172[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1145 << 6) + (var12 << 3) + arg2);
			GEUHTGZJ var14 = (GEUHTGZJ) field1170.method566(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1139[var12];
			boolean var16 = field1140 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (GEUHTGZJ) field1151.method566(var15);
			if (var4 == null) {
				var4 = GEUHTGZJ.method285(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method300();
				}

				field1151.method567(var4, var15);
			}
		}

		boolean var17;
		if (field1166 == 128 && field1147 == 128 && field1149 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1167 == 0 && field1152 == 0 && field1161 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		GEUHTGZJ var19 = new GEUHTGZJ(QWCFKPFT.method504(arg0), var4, arg2 == 0 && arg0 == -1 && !var17 && !var18, field1143 == null);
		if (arg0 != -1) {
			var19.method292();
			var19.method293(arg0);
			var19.field746 = null;
			var19.field745 = null;
		}

		while (arg2-- > 0) {
			var19.method296();
		}

		if (field1143 != null) {
			for (int var20 = 0; var20 < field1143.length; var20++) {
				var19.method299(field1143[var20], field1146[var20]);
			}
		}

		if (var17) {
			var19.method301(field1147, field1166, field1149);
		}

		if (var18) {
			var19.method298(field1167, field1152, field1161);
		}

		var19.method302(field1158 + 64, field1160 * 5 + 768, -50, -10, -50, !field1144);

		if (field1175 == 1) {
			var19.field742 = var19.field570;
		}

		field1170.method567(var19, var5);
		return var19;
	}

	@ObfuscatedName("RUJAIVBH.c(I)LRUJAIVBH;")
	public static final RUJAIVBH method512(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1162[var1].field1145 == arg0) {
				return field1162[var1];
			}
		}

		field1155 = (field1155 + 1) % 20;
		RUJAIVBH var2 = field1162[field1155];
		field1141.field934 = field1137[arg0];
		var2.field1145 = arg0;
		var2.method514();
		var2.method507(field1141);
		return var2;
	}

	@ObfuscatedName("RUJAIVBH.a(LSSXXGGTR;Z)V")
	public final void method513(SSXXGGTR arg0) {
		if (field1139 != null) {
			for (int var2 = 0; var2 < field1139.length; var2++) {
				arg0.method543(field1139[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("RUJAIVBH.a()V")
	public final void method514() {
		field1139 = null;
		field1172 = null;
		field1157 = null;
		field1159 = null;
		field1143 = null;
		field1146 = null;
		field1174 = 1;
		field1180 = 1;
		field1179 = true;
		field1165 = true;
		field1164 = false;
		field1181 = false;
		field1144 = false;
		field1171 = false;
		field1163 = -1;
		field1136 = 16;
		field1158 = 0;
		field1160 = 0;
		field1153 = null;
		field1169 = -1;
		field1150 = -1;
		field1140 = false;
		field1182 = true;
		field1166 = 128;
		field1147 = 128;
		field1149 = 128;
		field1142 = 0;
		field1167 = 0;
		field1152 = 0;
		field1161 = 0;
		field1177 = false;
		field1178 = false;
		field1175 = -1;
		field1148 = -1;
		field1156 = -1;
		field1168 = null;
	}

	@ObfuscatedName("RUJAIVBH.a(BI)Z")
	public final boolean method515(int arg0) {
		if (field1172 != null) {
			for (int var4 = 0; var4 < field1172.length; var4++) {
				if (field1172[var4] == arg0) {
					return GEUHTGZJ.method286(field1139[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1139 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1139.length; var3++) {
				var2 &= GEUHTGZJ.method286(field1139[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}
}
