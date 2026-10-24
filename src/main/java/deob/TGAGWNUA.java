package deob;

@ObfuscatedName("TGAGWNUA")
public final class TGAGWNUA {

	@ObfuscatedName("TGAGWNUA.P")
	public int field1227 = -1;

	@ObfuscatedName("TGAGWNUA.i")
	public static YITKGHWB field1196 = new YITKGHWB(50);

	@ObfuscatedName("TGAGWNUA.I")
	public static YITKGHWB field1221 = new YITKGHWB(100);

	@ObfuscatedName("TGAGWNUA.Q")
	public static boolean field1228 = true;

	@ObfuscatedName("TGAGWNUA.g")
	public byte field1194;

	@ObfuscatedName("TGAGWNUA.T")
	public byte field1230;

	@ObfuscatedName("TGAGWNUA.a")
	public int field1188;

	@ObfuscatedName("TGAGWNUA.b")
	public int field1189;

	@ObfuscatedName("TGAGWNUA.c")
	public int field1190;

	@ObfuscatedName("TGAGWNUA.d")
	public int field1191;

	@ObfuscatedName("TGAGWNUA.e")
	public int field1192;

	@ObfuscatedName("TGAGWNUA.f")
	public int field1193;

	@ObfuscatedName("TGAGWNUA.h")
	public int field1195;

	@ObfuscatedName("TGAGWNUA.l")
	public int field1199;

	@ObfuscatedName("TGAGWNUA.m")
	public int field1200;

	@ObfuscatedName("TGAGWNUA.n")
	public int field1201;

	@ObfuscatedName("TGAGWNUA.o")
	public int field1202;

	@ObfuscatedName("TGAGWNUA.q")
	public int field1204;

	@ObfuscatedName("TGAGWNUA.s")
	public int field1206;

	@ObfuscatedName("TGAGWNUA.u")
	public int field1208;

	@ObfuscatedName("TGAGWNUA.v")
	public int field1209;

	@ObfuscatedName("TGAGWNUA.w")
	public int field1210;

	@ObfuscatedName("TGAGWNUA.x")
	public int field1211;

	@ObfuscatedName("TGAGWNUA.y")
	public int field1212;

	@ObfuscatedName("TGAGWNUA.z")
	public int field1213;

	@ObfuscatedName("TGAGWNUA.C")
	public static int field1216;

	@ObfuscatedName("TGAGWNUA.D")
	public int field1217;

	@ObfuscatedName("TGAGWNUA.H")
	public int field1220;

	@ObfuscatedName("TGAGWNUA.J")
	public int field1222;

	@ObfuscatedName("TGAGWNUA.M")
	public static int field1224;

	@ObfuscatedName("TGAGWNUA.O")
	public int field1226;

	@ObfuscatedName("TGAGWNUA.R")
	public int field1229;

	@ObfuscatedName("TGAGWNUA.V")
	public int field1232;

	@ObfuscatedName("TGAGWNUA.X")
	public int field1233;

	@ObfuscatedName("TGAGWNUA.Z")
	public int field1235;

	@ObfuscatedName("TGAGWNUA.U")
	public static PQBRPYKE field1231;

	@ObfuscatedName("TGAGWNUA.j")
	public String field1197;

	@ObfuscatedName("TGAGWNUA.k")
	public boolean field1198;

	@ObfuscatedName("TGAGWNUA.Y")
	public boolean field1234;

	@ObfuscatedName("TGAGWNUA.t")
	public byte[] field1207;

	@ObfuscatedName("TGAGWNUA.r")
	public int[] field1205;

	@ObfuscatedName("TGAGWNUA.A")
	public static int[] field1214;

	@ObfuscatedName("TGAGWNUA.B")
	public int[] field1215;

	@ObfuscatedName("TGAGWNUA.G")
	public int[] field1219;

	@ObfuscatedName("TGAGWNUA.K")
	public int[] field1223;

	@ObfuscatedName("TGAGWNUA.N")
	public static TGAGWNUA[] field1225;

	@ObfuscatedName("TGAGWNUA.p")
	public String[] field1203;

	@ObfuscatedName("TGAGWNUA.F")
	public String[] field1218;

	@ObfuscatedName("TGAGWNUA.a(II)LFLXAIVEA;")
	public final FLXAIVEA method443(int arg0) {
		if (field1223 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1215[var3] && field1215[var3] != 0) {
					var2 = field1223[var3];
				}
			}

			if (var2 != -1) {
				return method453(var2).method443(1);
			}
		}

		FLXAIVEA var4 = FLXAIVEA.method218(field1195);
		if (var4 == null) {
			return null;
		}

		if (field1219 != null) {
			for (int var5 = 0; var5 < field1219.length; var5++) {
				var4.method232(field1219[var5], field1205[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("TGAGWNUA.b(II)LFLXAIVEA;")
	public final FLXAIVEA method444(int arg0) {
		int var2 = field1200;
		int var3 = field1192;
		if (arg0 == 1) {
			var2 = field1232;
			var3 = field1209;
		}

		if (var2 == -1) {
			return null;
		}

		FLXAIVEA var4 = FLXAIVEA.method218(var2);
		if (var3 != -1) {
			FLXAIVEA var5 = FLXAIVEA.method218(var3);
			FLXAIVEA[] var6 = new FLXAIVEA[] { var4, var5 };
			var4 = new FLXAIVEA(2, var6);
		}

		if (field1219 != null) {
			for (int var7 = 0; var7 < field1219.length; var7++) {
				var4.method232(field1219[var7], field1205[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("TGAGWNUA.a(LXOJZVVDK;)V")
	public static final void method445(XOJZVVDK arg0) {
		field1231 = new PQBRPYKE(arg0.method560("obj.dat", null));
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("obj.idx", null));
		field1216 = var1.method342();
		field1214 = new int[field1216];
		int var2 = 2;
		for (int var3 = 0; var3 < field1216; var3++) {
			field1214[var3] = var2;
			var2 += var1.method342();
		}

		field1225 = new TGAGWNUA[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1225[var4] = new TGAGWNUA();
		}
	}

	@ObfuscatedName("TGAGWNUA.a(BIII)LWQACZBNG;")
	public static final WQACZBNG method446(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			WQACZBNG var3 = (WQACZBNG) field1221.method572(arg0);
			if (var3 != null && var3.field1362 != arg2 && var3.field1362 != -1) {
				var3.method163();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		TGAGWNUA var4 = method453(arg0);
		if (var4.field1223 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field1215[var6] && var4.field1215[var6] != 0) {
					var5 = var4.field1223[var6];
				}
			}

			if (var5 != -1) {
				var4 = method453(var5);
			}
		}

		FLXAIVEA var7 = var4.method455(1);
		if (var7 == null) {
			return null;
		}

		WQACZBNG var8 = null;
		if (var4.field1217 != -1) {
			var8 = method446(var4.field1211, -1, 10);
			if (var8 == null) {
				return null;
			}
		}

		WQACZBNG var9 = new WQACZBNG(32, 32);
		int var10 = ORCVJTAI.field1064;
		int var11 = ORCVJTAI.field1065;
		int[] var12 = ORCVJTAI.field1070;
		int[] var13 = NBXZFIDS.field1026;
		int var14 = NBXZFIDS.field1027;
		int var15 = NBXZFIDS.field1028;
		int var16 = NBXZFIDS.field1031;
		int var17 = NBXZFIDS.field1032;
		int var18 = NBXZFIDS.field1029;
		int var19 = NBXZFIDS.field1030;
		ORCVJTAI.field1062 = false;
		NBXZFIDS.method286(32, 32, var9.field1356);
		NBXZFIDS.method291(0, 32, 0, 0, 32);
		ORCVJTAI.method307();
		int var20 = var4.field1201;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = ORCVJTAI.field1068[var4.field1189] * var20 >> 16;
		int var22 = ORCVJTAI.field1069[var4.field1189] * var20 >> 16;
		var7.method239(0, var4.field1190, var4.field1220, var4.field1189, var4.field1191, var7.field770 / 2 + var21 + var4.field1213, var4.field1213 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1356[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1356[var24 * 32 + var23 - 1] > 1) {
						var9.field1356[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1356[(var24 - 1) * 32 + var23] > 1) {
						var9.field1356[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1356[var24 * 32 + var23 + 1] > 1) {
						var9.field1356[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1356[(var24 + 1) * 32 + var23] > 1) {
						var9.field1356[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1356[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1356[var26 * 32 + var25 - 1] == 1) {
							var9.field1356[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1356[(var26 - 1) * 32 + var25] == 1) {
							var9.field1356[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1356[var26 * 32 + var25 + 1] == 1) {
							var9.field1356[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1356[(var26 + 1) * 32 + var25] == 1) {
							var9.field1356[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1356[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1356[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1356[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1217 != -1) {
			int var29 = var8.field1361;
			int var30 = var8.field1362;
			var8.field1361 = 32;
			var8.field1362 = 32;
			var8.method548(0, 0);
			var8.field1361 = var29;
			var8.field1362 = var30;
		}

		if (arg1 == 0) {
			field1221.method573(var9, arg0);
		}

		NBXZFIDS.method286(var15, var14, var13);
		NBXZFIDS.method288(var16, var19, var18, var17);
		ORCVJTAI.field1064 = var10;
		ORCVJTAI.field1065 = var11;
		ORCVJTAI.field1070 = var12;
		ORCVJTAI.field1062 = true;

		if (var4.field1234) {
			var9.field1361 = 33;
		} else {
			var9.field1361 = 32;
		}

		var9.field1362 = arg2;
		return var9;
	}

	@ObfuscatedName("TGAGWNUA.c(II)LFLXAIVEA;")
	public final FLXAIVEA method447(int arg0) {
		int var2 = field1199;
		int var3 = field1206;
		int var4 = field1222;
		if (arg0 == 1) {
			var2 = field1208;
			var3 = field1193;
			var4 = field1229;
		}

		if (var2 == -1) {
			return null;
		}

		FLXAIVEA var5 = FLXAIVEA.method218(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				FLXAIVEA var9 = FLXAIVEA.method218(var3);
				FLXAIVEA[] var10 = new FLXAIVEA[] { var5, var9 };
				var5 = new FLXAIVEA(2, var10);
			} else {
				FLXAIVEA var6 = FLXAIVEA.method218(var3);
				FLXAIVEA var7 = FLXAIVEA.method218(var4);
				FLXAIVEA[] var8 = new FLXAIVEA[] { var5, var6, var7 };
				var5 = new FLXAIVEA(3, var8);
			}
		}

		if (arg0 == 0 && field1194 != 0) {
			var5.method231(0, field1194, 0);
		}

		if (arg0 == 1 && field1230 != 0) {
			var5.method231(0, field1230, 0);
		}

		if (field1219 != null) {
			for (int var11 = 0; var11 < field1219.length; var11++) {
				var5.method232(field1219[var11], field1205[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("TGAGWNUA.a(Z)V")
	public static final void method448() {
		field1196 = null;
		field1221 = null;
		field1214 = null;
		field1225 = null;
		field1231 = null;
	}

	@ObfuscatedName("TGAGWNUA.a()V")
	public final void method449() {
		field1195 = 0;
		field1197 = null;
		field1207 = null;
		field1219 = null;
		field1205 = null;
		field1201 = 2000;
		field1189 = 0;
		field1190 = 0;
		field1220 = 0;
		field1191 = 0;
		field1213 = 0;
		field1202 = -1;
		field1234 = false;
		field1210 = 1;
		field1198 = false;
		field1218 = null;
		field1203 = null;
		field1199 = -1;
		field1206 = -1;
		field1194 = 0;
		field1208 = -1;
		field1193 = -1;
		field1230 = 0;
		field1222 = -1;
		field1229 = -1;
		field1200 = -1;
		field1192 = -1;
		field1232 = -1;
		field1209 = -1;
		field1223 = null;
		field1215 = null;
		field1211 = -1;
		field1217 = -1;
		field1235 = 128;
		field1204 = 128;
		field1212 = 128;
		field1188 = 0;
		field1226 = 0;
		field1233 = 0;
	}

	@ObfuscatedName("TGAGWNUA.a(IZ)Z")
	public final boolean method450(int arg0) {
		int var2 = field1200;
		int var3 = field1192;
		if (arg0 == 1) {
			var2 = field1232;
			var3 = field1209;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!FLXAIVEA.method219(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !FLXAIVEA.method219(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("TGAGWNUA.a(LPQBRPYKE;Z)V")
	public final void method451(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1195 = arg0.method342();
			} else if (var2 == 2) {
				field1197 = arg0.method347();
			} else if (var2 == 3) {
				field1207 = arg0.method348();
			} else if (var2 == 4) {
				field1201 = arg0.method342();
			} else if (var2 == 5) {
				field1189 = arg0.method342();
			} else if (var2 == 6) {
				field1190 = arg0.method342();
			} else if (var2 == 7) {
				field1191 = arg0.method342();
				if (field1191 > 32767) {
					field1191 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1213 = arg0.method342();
				if (field1213 > 32767) {
					field1213 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1202 = arg0.method342();
			} else if (var2 == 11) {
				field1234 = true;
			} else if (var2 == 12) {
				field1210 = arg0.method345();
			} else if (var2 == 16) {
				field1198 = true;
			} else if (var2 == 23) {
				field1199 = arg0.method342();
				field1194 = arg0.method341();
			} else if (var2 == 24) {
				field1206 = arg0.method342();
			} else if (var2 == 25) {
				field1208 = arg0.method342();
				field1230 = arg0.method341();
			} else if (var2 == 26) {
				field1193 = arg0.method342();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1218 == null) {
					field1218 = new String[5];
				}

				field1218[var2 - 30] = arg0.method347();
				if (field1218[var2 - 30].equalsIgnoreCase("hidden")) {
					field1218[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1203 == null) {
					field1203 = new String[5];
				}

				field1203[var2 - 35] = arg0.method347();
			} else if (var2 == 40) {
				int var3 = arg0.method340();
				field1219 = new int[var3];
				field1205 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1219[var4] = arg0.method342();
					field1205[var4] = arg0.method342();
				}
			} else if (var2 == 78) {
				field1222 = arg0.method342();
			} else if (var2 == 79) {
				field1229 = arg0.method342();
			} else if (var2 == 90) {
				field1200 = arg0.method342();
			} else if (var2 == 91) {
				field1232 = arg0.method342();
			} else if (var2 == 92) {
				field1192 = arg0.method342();
			} else if (var2 == 93) {
				field1209 = arg0.method342();
			} else if (var2 == 95) {
				field1220 = arg0.method342();
			} else if (var2 == 97) {
				field1211 = arg0.method342();
			} else if (var2 == 98) {
				field1217 = arg0.method342();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1223 == null) {
					field1223 = new int[10];
					field1215 = new int[10];
				}

				field1223[var2 - 100] = arg0.method342();
				field1215[var2 - 100] = arg0.method342();
			} else if (var2 == 110) {
				field1235 = arg0.method342();
			} else if (var2 == 111) {
				field1204 = arg0.method342();
			} else if (var2 == 112) {
				field1212 = arg0.method342();
			} else if (var2 == 113) {
				field1188 = arg0.method341();
			} else if (var2 == 114) {
				field1226 = arg0.method341() * 5;
			} else if (var2 == 115) {
				field1233 = arg0.method340();
			}
		}
	}

	@ObfuscatedName("TGAGWNUA.d(II)Z")
	public final boolean method452(int arg0) {
		int var2 = field1199;
		int var3 = field1206;
		int var4 = field1222;
		if (arg0 == 1) {
			var2 = field1208;
			var3 = field1193;
			var4 = field1229;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!FLXAIVEA.method219(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !FLXAIVEA.method219(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !FLXAIVEA.method219(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("TGAGWNUA.a(I)LTGAGWNUA;")
	public static final TGAGWNUA method453(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1225[var1].field1227 == arg0) {
				return field1225[var1];
			}
		}

		field1224 = (field1224 + 1) % 10;
		TGAGWNUA var2 = field1225[field1224];
		field1231.field1091 = field1214[arg0];
		var2.field1227 = arg0;
		var2.method449();
		var2.method451(field1231);

		if (var2.field1217 != -1) {
			var2.method454();
		}

		if (!field1228 && var2.field1198) {
			var2.field1197 = "Members Object";
			var2.field1207 = "Login to a members' server to use this object.".getBytes();
			var2.field1218 = null;
			var2.field1203 = null;
			var2.field1233 = 0;
		}

		return var2;
	}

	@ObfuscatedName("TGAGWNUA.b(I)V")
	public void method454() {
		TGAGWNUA var1 = method453(field1217);
		field1195 = var1.field1195;
		field1201 = var1.field1201;
		field1189 = var1.field1189;
		field1190 = var1.field1190;
		field1220 = var1.field1220;
		field1191 = var1.field1191;
		field1213 = var1.field1213;
		field1219 = var1.field1219;
		field1205 = var1.field1205;
		TGAGWNUA var2 = method453(field1211);
		field1197 = var2.field1197;
		field1198 = var2.field1198;
		field1210 = var2.field1210;
		String var3 = "a";
		char var4 = var2.field1197.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1207 = ("Swap this note at any bank for " + var3 + " " + var2.field1197 + ".").getBytes();
		field1234 = true;
	}

	@ObfuscatedName("TGAGWNUA.c(I)LFLXAIVEA;")
	public final FLXAIVEA method455(int arg0) {
		if (field1223 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1215[var3] && field1215[var3] != 0) {
					var2 = field1223[var3];
				}
			}

			if (var2 != -1) {
				return method453(var2).method455(1);
			}
		}

		FLXAIVEA var4 = (FLXAIVEA) field1196.method572(field1227);
		if (var4 != null) {
			return var4;
		}

		FLXAIVEA var5 = FLXAIVEA.method218(field1195);
		if (var5 == null) {
			return null;
		}

		if (field1235 != 128 || field1204 != 128 || field1212 != 128) {
			var5.method234(field1212, field1235, field1204);
		}

		if (field1219 != null) {
			for (int var6 = 0; var6 < field1219.length; var6++) {
				var5.method232(field1219[var6], field1205[var6]);
			}
		}

		var5.method235(field1188 + 64, field1226 + 768, -50, -10, -50, true);
		var5.field717 = true;
		field1196.method573(var5, field1227);
		return var5;
	}
}
