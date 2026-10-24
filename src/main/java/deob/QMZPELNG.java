package deob;

@ObfuscatedName("QMZPELNG")
public final class QMZPELNG {

	@ObfuscatedName("QMZPELNG.R")
	public int field1176 = -1;

	@ObfuscatedName("QMZPELNG.r")
	public static LSQNLJTA field1154 = new LSQNLJTA(40);

	@ObfuscatedName("QMZPELNG.B")
	public static LSQNLJTA field1162 = new LSQNLJTA(500);

	@ObfuscatedName("QMZPELNG.Z")
	public static LFTMDGKK[] field1183 = new LFTMDGKK[4];

	@ObfuscatedName("QMZPELNG.i")
	public byte field1146;

	@ObfuscatedName("QMZPELNG.U")
	public byte field1179;

	@ObfuscatedName("QMZPELNG.a")
	public int field1138;

	@ObfuscatedName("QMZPELNG.c")
	public int field1140;

	@ObfuscatedName("QMZPELNG.e")
	public int field1142;

	@ObfuscatedName("QMZPELNG.j")
	public int field1147;

	@ObfuscatedName("QMZPELNG.l")
	public static int field1149;

	@ObfuscatedName("QMZPELNG.m")
	public int field1150;

	@ObfuscatedName("QMZPELNG.u")
	public int field1157;

	@ObfuscatedName("QMZPELNG.v")
	public int field1158;

	@ObfuscatedName("QMZPELNG.C")
	public int field1163;

	@ObfuscatedName("QMZPELNG.D")
	public int field1164;

	@ObfuscatedName("QMZPELNG.F")
	public int field1166;

	@ObfuscatedName("QMZPELNG.J")
	public int field1169;

	@ObfuscatedName("QMZPELNG.L")
	public int field1171;

	@ObfuscatedName("QMZPELNG.M")
	public int field1172;

	@ObfuscatedName("QMZPELNG.O")
	public int field1174;

	@ObfuscatedName("QMZPELNG.T")
	public int field1178;

	@ObfuscatedName("QMZPELNG.X")
	public int field1182;

	@ObfuscatedName("QMZPELNG.ab")
	public static int field1184;

	@ObfuscatedName("QMZPELNG.n")
	public static CFARFRSG field1151;

	@ObfuscatedName("QMZPELNG.W")
	public static client field1181;

	@ObfuscatedName("QMZPELNG.Q")
	public String field1175;

	@ObfuscatedName("QMZPELNG.b")
	public boolean field1139;

	@ObfuscatedName("QMZPELNG.d")
	public boolean field1141;

	@ObfuscatedName("QMZPELNG.h")
	public boolean field1145;

	@ObfuscatedName("QMZPELNG.k")
	public static boolean field1148;

	@ObfuscatedName("QMZPELNG.s")
	public boolean field1155;

	@ObfuscatedName("QMZPELNG.t")
	public boolean field1156;

	@ObfuscatedName("QMZPELNG.E")
	public boolean field1165;

	@ObfuscatedName("QMZPELNG.G")
	public boolean field1167;

	@ObfuscatedName("QMZPELNG.H")
	public boolean field1168;

	@ObfuscatedName("QMZPELNG.K")
	public boolean field1170;

	@ObfuscatedName("QMZPELNG.S")
	public boolean field1177;

	@ObfuscatedName("QMZPELNG.V")
	public byte[] field1180;

	@ObfuscatedName("QMZPELNG.f")
	public int[] field1143;

	@ObfuscatedName("QMZPELNG.g")
	public int[] field1144;

	@ObfuscatedName("QMZPELNG.o")
	public static int[] field1152;

	@ObfuscatedName("QMZPELNG.p")
	public int[] field1153;

	@ObfuscatedName("QMZPELNG.w")
	public int[] field1159;

	@ObfuscatedName("QMZPELNG.y")
	public int[] field1161;

	@ObfuscatedName("QMZPELNG.x")
	public static QMZPELNG[] field1160;

	@ObfuscatedName("QMZPELNG.N")
	public String[] field1173;

	@ObfuscatedName("QMZPELNG.a(IIIIIII)LLFTMDGKK;")
	public final LFTMDGKK method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		LFTMDGKK var8 = method483(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1170 || field1167) {
			var8 = new LFTMDGKK(field1167, var8, field1170);
		}

		if (field1170) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field820; var10++) {
				int var11 = var8.field821[var10];
				int var12 = var8.field823[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field822[var10] += var15 - var9;
			}

			var8.method346();
		}

		return var8;
	}

	@ObfuscatedName("QMZPELNG.a(I)Z")
	public final boolean method479() {
		if (field1144 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1144.length; var2++) {
			var1 &= LFTMDGKK.method342(field1144[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("QMZPELNG.a(IZ)Z")
	public final boolean method480(int arg0) {
		if (field1161 != null) {
			for (int var4 = 0; var4 < field1161.length; var4++) {
				if (field1161[var4] == arg0) {
					return LFTMDGKK.method342(field1144[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1144 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1144.length; var3++) {
				var2 &= LFTMDGKK.method342(field1144[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("QMZPELNG.a()V")
	public final void method481() {
		field1144 = null;
		field1161 = null;
		field1175 = null;
		field1180 = null;
		field1153 = null;
		field1159 = null;
		field1178 = 1;
		field1142 = 1;
		field1165 = true;
		field1156 = true;
		field1155 = false;
		field1170 = false;
		field1167 = false;
		field1177 = false;
		field1169 = -1;
		field1171 = 16;
		field1179 = 0;
		field1146 = 0;
		field1173 = null;
		field1166 = -1;
		field1140 = -1;
		field1139 = false;
		field1145 = true;
		field1163 = 128;
		field1138 = 128;
		field1158 = 128;
		field1172 = 0;
		field1150 = 0;
		field1157 = 0;
		field1182 = 0;
		field1168 = false;
		field1141 = false;
		field1164 = -1;
		field1147 = -1;
		field1174 = -1;
		field1143 = null;
	}

	@ObfuscatedName("QMZPELNG.a(LCFARFRSG;I)V")
	public final void method482(CFARFRSG arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method30();
					if (var3 == 0) {
						if (var2 == -1) {
							field1155 = false;
							if (field1144 != null && (field1161 == null || field1161[0] == 10)) {
								field1155 = true;
							}

							if (field1173 != null) {
								field1155 = true;
							}
						}

						if (field1141) {
							field1165 = false;
							field1156 = false;
						}

						if (field1164 == -1) {
							field1164 = field1165 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1175 = arg0.method37();
					} else if (var3 == 3) {
						field1180 = arg0.method38();
					} else if (var3 == 5) {
						int var6 = arg0.method30();
						if (var6 > 0) {
							if (field1144 == null || field1148) {
								field1161 = null;
								field1144 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1144[var7] = arg0.method32();
								}
							} else {
								arg0.field44 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1178 = arg0.method30();
					} else if (var3 == 15) {
						field1142 = arg0.method30();
					} else if (var3 == 17) {
						field1165 = false;
					} else if (var3 == 18) {
						field1156 = false;
					} else if (var3 == 19) {
						var2 = arg0.method30();
						if (var2 == 1) {
							field1155 = true;
						}
					} else if (var3 == 21) {
						field1170 = true;
					} else if (var3 == 22) {
						field1167 = true;
					} else if (var3 == 23) {
						field1177 = true;
					} else if (var3 == 24) {
						field1169 = arg0.method32();
						if (field1169 == 0xFFFF) {
							field1169 = -1;
						}
					} else if (var3 == 28) {
						field1171 = arg0.method30();
					} else if (var3 == 29) {
						field1179 = arg0.method31();
					} else if (var3 == 39) {
						field1146 = arg0.method31();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1173 == null) {
							field1173 = new String[5];
						}

						field1173[var3 - 30] = arg0.method37();
						if (field1173[var3 - 30].equalsIgnoreCase("hidden")) {
							field1173[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method30();
						field1153 = new int[var8];
						field1159 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1153[var9] = arg0.method32();
							field1159[var9] = arg0.method32();
						}
					} else if (var3 == 60) {
						field1166 = arg0.method32();
					} else if (var3 == 62) {
						field1139 = true;
					} else if (var3 == 64) {
						field1145 = false;
					} else if (var3 == 65) {
						field1163 = arg0.method32();
					} else if (var3 == 66) {
						field1138 = arg0.method32();
					} else if (var3 == 67) {
						field1158 = arg0.method32();
					} else if (var3 == 68) {
						field1140 = arg0.method32();
					} else if (var3 == 69) {
						field1172 = arg0.method30();
					} else if (var3 == 70) {
						field1150 = arg0.method33();
					} else if (var3 == 71) {
						field1157 = arg0.method33();
					} else if (var3 == 72) {
						field1182 = arg0.method33();
					} else if (var3 == 73) {
						field1168 = true;
					} else if (var3 == 74) {
						field1141 = true;
					} else if (var3 == 75) {
						field1164 = arg0.method30();
					} else if (var3 == 77) {
						field1147 = arg0.method32();
						if (field1147 == 0xFFFF) {
							field1147 = -1;
						}

						field1174 = arg0.method32();
						if (field1174 == 0xFFFF) {
							field1174 = -1;
						}

						int var10 = arg0.method30();
						field1143 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1143[var11] = arg0.method32();
							if (field1143[var11] == 0xFFFF) {
								field1143[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method30();
			} while (var4 <= 0);

			if (field1144 == null || field1148) {
				field1161 = new int[var4];
				field1144 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1144[var5] = arg0.method32();
					field1161[var5] = arg0.method30();
				}
			} else {
				arg0.field44 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("QMZPELNG.a(ZIII)LLFTMDGKK;")
	public final LFTMDGKK method483(int arg0, int arg1, int arg2) {
		LFTMDGKK var4 = null;
		long var5;
		if (field1161 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1176 << 6) + arg1);
			LFTMDGKK var7 = (LFTMDGKK) field1154.method369(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1144 == null) {
				return null;
			}

			boolean var8 = field1139 ^ arg1 > 3;
			int var9 = field1144.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1144[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (LFTMDGKK) field1162.method369(var11);
				if (var4 == null) {
					var4 = LFTMDGKK.method341(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method356();
					}

					field1162.method370(var4, var11);
				}

				if (var9 > 1) {
					field1183[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new LFTMDGKK(var9, field1183);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1161.length; var13++) {
				if (field1161[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1176 << 6) + (var12 << 3) + arg1);
			LFTMDGKK var14 = (LFTMDGKK) field1154.method369(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1144[var12];
			boolean var16 = field1139 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (LFTMDGKK) field1162.method369(var15);
			if (var4 == null) {
				var4 = LFTMDGKK.method341(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method356();
				}

				field1162.method370(var4, var15);
			}
		}

		boolean var17;
		if (field1163 == 128 && field1138 == 128 && field1158 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1150 == 0 && field1157 == 0 && field1182 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		LFTMDGKK var19 = new LFTMDGKK(CANZHIOT.method17(arg0), field1153 == null, var4, arg1 == 0 && arg0 == -1 && !var17 && !var18);
		if (arg0 != -1) {
			var19.method348();
			var19.method349(arg0);
			var19.field852 = null;
			var19.field851 = null;
		}

		while (arg1-- > 0) {
			var19.method352();
		}

		if (field1153 != null) {
			for (int var20 = 0; var20 < field1153.length; var20++) {
				var19.method355(field1153[var20], field1159[var20]);
			}
		}

		if (var17) {
			var19.method357(field1138, field1158, field1163);
		}

		if (var18) {
			var19.method354(field1157, field1150, field1182);
		}

		var19.method358(field1179 + 64, field1146 * 5 + 768, -50, -10, -50, !field1167);

		if (field1164 == 1) {
			var19.field848 = var19.field494;
		}

		field1154.method370(var19, var5);
		return var19;
	}

	@ObfuscatedName("QMZPELNG.a(Z)V")
	public static final void method484() {
		field1162 = null;
		field1154 = null;
		field1152 = null;
		field1160 = null;
		field1151 = null;
	}

	@ObfuscatedName("QMZPELNG.a(LVSUYIIVA;)V")
	public static final void method485(VSUYIIVA arg0) {
		field1151 = new CFARFRSG(arg0.method570("loc.dat", null));
		CFARFRSG var1 = new CFARFRSG(arg0.method570("loc.idx", null));
		field1149 = var1.method32();
		field1152 = new int[field1149];
		int var2 = 2;
		for (int var3 = 0; var3 < field1149; var3++) {
			field1152[var3] = var2;
			var2 += var1.method32();
		}

		field1160 = new QMZPELNG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1160[var4] = new QMZPELNG();
		}
	}

	@ObfuscatedName("QMZPELNG.b(I)LQMZPELNG;")
	public static final QMZPELNG method486(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1160[var1].field1176 == arg0) {
				return field1160[var1];
			}
		}

		field1184 = (field1184 + 1) % 20;
		QMZPELNG var2 = field1160[field1184];
		field1151.field44 = field1152[arg0];
		var2.field1176 = arg0;
		var2.method481();
		var2.method482(field1151);
		return var2;
	}

	@ObfuscatedName("QMZPELNG.a(B)LQMZPELNG;")
	public final QMZPELNG method487() {
		int var1 = -1;
		if (field1147 != -1) {
			DDXRHBHP var2 = DDXRHBHP.field496[field1147];
			int var3 = var2.field498;
			int var4 = var2.field499;
			int var5 = var2.field500;
			int var6 = client.field461[var5 - var4];
			var1 = field1181.field351[var3] >> var4 & var6;
		} else if (field1174 != -1) {
			var1 = field1181.field351[field1174];
		}

		if (var1 >= 0 && var1 < field1143.length && field1143[var1] != -1) {
			return method486(field1143[var1]);
		}

		return null;
	}

	@ObfuscatedName("QMZPELNG.a(ILOBRIXRSB;)V")
	public final void method488(OBRIXRSB arg0) {
		if (field1144 != null) {
			for (int var2 = 0; var2 < field1144.length; var2++) {
				arg0.method421(field1144[var2] & 0xFFFF, 0);
			}
		}
	}
}
