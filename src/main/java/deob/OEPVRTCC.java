package deob;

@ObfuscatedName("OEPVRTCC")
public final class OEPVRTCC {

	@ObfuscatedName("OEPVRTCC.t")
	public int field1223 = -1;

	@ObfuscatedName("OEPVRTCC.g")
	public static LSUWSJDO field1210 = new LSUWSJDO(40);

	@ObfuscatedName("OEPVRTCC.o")
	public static LSSDQDBV[] field1218 = new LSSDQDBV[4];

	@ObfuscatedName("OEPVRTCC.F")
	public static LSUWSJDO field1235 = new LSUWSJDO(500);

	@ObfuscatedName("OEPVRTCC.N")
	public byte field1241;

	@ObfuscatedName("OEPVRTCC.V")
	public byte field1249;

	@ObfuscatedName("OEPVRTCC.a")
	public int field1204;

	@ObfuscatedName("OEPVRTCC.c")
	public int field1206;

	@ObfuscatedName("OEPVRTCC.d")
	public int field1207;

	@ObfuscatedName("OEPVRTCC.f")
	public int field1209;

	@ObfuscatedName("OEPVRTCC.j")
	public int field1213;

	@ObfuscatedName("OEPVRTCC.l")
	public int field1215;

	@ObfuscatedName("OEPVRTCC.p")
	public int field1219;

	@ObfuscatedName("OEPVRTCC.s")
	public static int field1222;

	@ObfuscatedName("OEPVRTCC.v")
	public static int field1225;

	@ObfuscatedName("OEPVRTCC.z")
	public int field1229;

	@ObfuscatedName("OEPVRTCC.A")
	public int field1230;

	@ObfuscatedName("OEPVRTCC.C")
	public int field1232;

	@ObfuscatedName("OEPVRTCC.D")
	public int field1233;

	@ObfuscatedName("OEPVRTCC.J")
	public int field1239;

	@ObfuscatedName("OEPVRTCC.P")
	public int field1243;

	@ObfuscatedName("OEPVRTCC.R")
	public int field1245;

	@ObfuscatedName("OEPVRTCC.S")
	public int field1246;

	@ObfuscatedName("OEPVRTCC.U")
	public int field1248;

	@ObfuscatedName("OEPVRTCC.x")
	public static LZWRHABP field1227;

	@ObfuscatedName("OEPVRTCC.u")
	public static client field1224;

	@ObfuscatedName("OEPVRTCC.O")
	public String field1242;

	@ObfuscatedName("OEPVRTCC.b")
	public boolean field1205;

	@ObfuscatedName("OEPVRTCC.e")
	public boolean field1208;

	@ObfuscatedName("OEPVRTCC.i")
	public boolean field1212;

	@ObfuscatedName("OEPVRTCC.k")
	public boolean field1214;

	@ObfuscatedName("OEPVRTCC.m")
	public boolean field1216;

	@ObfuscatedName("OEPVRTCC.n")
	public boolean field1217;

	@ObfuscatedName("OEPVRTCC.q")
	public boolean field1220;

	@ObfuscatedName("OEPVRTCC.r")
	public boolean field1221;

	@ObfuscatedName("OEPVRTCC.y")
	public boolean field1228;

	@ObfuscatedName("OEPVRTCC.G")
	public boolean field1236;

	@ObfuscatedName("OEPVRTCC.I")
	public static boolean field1238;

	@ObfuscatedName("OEPVRTCC.w")
	public byte[] field1226;

	@ObfuscatedName("OEPVRTCC.h")
	public int[] field1211;

	@ObfuscatedName("OEPVRTCC.E")
	public int[] field1234;

	@ObfuscatedName("OEPVRTCC.H")
	public int[] field1237;

	@ObfuscatedName("OEPVRTCC.M")
	public int[] field1240;

	@ObfuscatedName("OEPVRTCC.Q")
	public static int[] field1244;

	@ObfuscatedName("OEPVRTCC.W")
	public int[] field1250;

	@ObfuscatedName("OEPVRTCC.T")
	public static OEPVRTCC[] field1247;

	@ObfuscatedName("OEPVRTCC.B")
	public String[] field1231;

	@ObfuscatedName("OEPVRTCC.a(IIIIIII)LLSSDQDBV;")
	public final LSSDQDBV method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		LSSDQDBV var8 = method521(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1216 || field1212) {
			var8 = new LSSDQDBV(field1212, field1216, var8);
		}

		if (field1216) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1064; var10++) {
				int var11 = var8.field1065[var10];
				int var12 = var8.field1067[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1066[var10] += var15 - var9;
			}

			var8.method428();
		}

		return var8;
	}

	@ObfuscatedName("OEPVRTCC.a(B)Z")
	public final boolean method514() {
		if (field1234 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1234.length; var2++) {
			var1 &= LSSDQDBV.method424(field1234[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("OEPVRTCC.a(Z)LOEPVRTCC;")
	public final OEPVRTCC method515() {
		int var1 = -1;
		if (field1207 != -1) {
			RCLYPSZZ var2 = RCLYPSZZ.field1321[field1207];
			int var3 = var2.field1323;
			int var4 = var2.field1324;
			int var5 = var2.field1325;
			int var6 = client.field267[var5 - var4];
			var1 = field1224.field313[var3] >> var4 & var6;
		} else if (field1209 != -1) {
			var1 = field1224.field313[field1209];
		}

		if (var1 >= 0 && var1 < field1250.length && field1250[var1] != -1) {
			return method522(field1250[var1]);
		}

		return null;
	}

	@ObfuscatedName("OEPVRTCC.a(ZLLZWRHABP;)V")
	public final void method516(LZWRHABP arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method463();
					if (var3 == 0) {
						if (var2 == -1) {
							field1208 = false;
							if (field1234 != null && (field1237 == null || field1237[0] == 10)) {
								field1208 = true;
							}

							if (field1231 != null) {
								field1208 = true;
							}
						}

						if (field1217) {
							field1205 = false;
							field1228 = false;
						}

						if (field1229 == -1) {
							field1229 = field1205 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1242 = arg0.method470();
					} else if (var3 == 3) {
						field1226 = arg0.method471();
					} else if (var3 == 5) {
						int var6 = arg0.method463();
						if (var6 > 0) {
							if (field1234 == null || field1238) {
								field1237 = null;
								field1234 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1234[var7] = arg0.method465();
								}
							} else {
								arg0.field1139 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1246 = arg0.method463();
					} else if (var3 == 15) {
						field1230 = arg0.method463();
					} else if (var3 == 17) {
						field1205 = false;
					} else if (var3 == 18) {
						field1228 = false;
					} else if (var3 == 19) {
						var2 = arg0.method463();
						if (var2 == 1) {
							field1208 = true;
						}
					} else if (var3 == 21) {
						field1216 = true;
					} else if (var3 == 22) {
						field1212 = true;
					} else if (var3 == 23) {
						field1220 = true;
					} else if (var3 == 24) {
						field1248 = arg0.method465();
						if (field1248 == 0xFFFF) {
							field1248 = -1;
						}
					} else if (var3 == 28) {
						field1213 = arg0.method463();
					} else if (var3 == 29) {
						field1241 = arg0.method464();
					} else if (var3 == 39) {
						field1249 = arg0.method464();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1231 == null) {
							field1231 = new String[5];
						}

						field1231[var3 - 30] = arg0.method470();
						if (field1231[var3 - 30].equalsIgnoreCase("hidden")) {
							field1231[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method463();
						field1211 = new int[var8];
						field1240 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1211[var9] = arg0.method465();
							field1240[var9] = arg0.method465();
						}
					} else if (var3 == 60) {
						field1215 = arg0.method465();
					} else if (var3 == 62) {
						field1236 = true;
					} else if (var3 == 64) {
						field1214 = false;
					} else if (var3 == 65) {
						field1206 = arg0.method465();
					} else if (var3 == 66) {
						field1232 = arg0.method465();
					} else if (var3 == 67) {
						field1245 = arg0.method465();
					} else if (var3 == 68) {
						field1219 = arg0.method465();
					} else if (var3 == 69) {
						field1243 = arg0.method463();
					} else if (var3 == 70) {
						field1233 = arg0.method466();
					} else if (var3 == 71) {
						field1204 = arg0.method466();
					} else if (var3 == 72) {
						field1239 = arg0.method466();
					} else if (var3 == 73) {
						field1221 = true;
					} else if (var3 == 74) {
						field1217 = true;
					} else if (var3 == 75) {
						field1229 = arg0.method463();
					} else if (var3 == 77) {
						field1207 = arg0.method465();
						if (field1207 == 0xFFFF) {
							field1207 = -1;
						}

						field1209 = arg0.method465();
						if (field1209 == 0xFFFF) {
							field1209 = -1;
						}

						int var10 = arg0.method463();
						field1250 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1250[var11] = arg0.method465();
							if (field1250[var11] == 0xFFFF) {
								field1250[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method463();
			} while (var4 <= 0);

			if (field1234 == null || field1238) {
				field1237 = new int[var4];
				field1234 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1234[var5] = arg0.method465();
					field1237[var5] = arg0.method463();
				}
			} else {
				arg0.field1139 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("OEPVRTCC.a(LSRZUEVOD;)V")
	public static final void method517(SRZUEVOD arg0) {
		field1227 = new LZWRHABP(arg0.method566("loc.dat", null));
		LZWRHABP var1 = new LZWRHABP(arg0.method566("loc.idx", null));
		field1222 = var1.method465();
		field1244 = new int[field1222];
		int var2 = 2;
		for (int var3 = 0; var3 < field1222; var3++) {
			field1244[var3] = var2;
			var2 += var1.method465();
		}

		field1247 = new OEPVRTCC[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1247[var4] = new OEPVRTCC();
		}
	}

	@ObfuscatedName("OEPVRTCC.a(ZI)Z")
	public final boolean method518(int arg0) {
		if (field1237 != null) {
			for (int var4 = 0; var4 < field1237.length; var4++) {
				if (field1237[var4] == arg0) {
					return LSSDQDBV.method424(field1234[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1234 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1234.length; var3++) {
				var2 &= LSSDQDBV.method424(field1234[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("OEPVRTCC.a(LEWALAKUU;I)V")
	public final void method519(EWALAKUU arg0) {
		if (field1234 != null) {
			for (int var2 = 0; var2 < field1234.length; var2++) {
				arg0.method291(0, field1234[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("OEPVRTCC.b(B)V")
	public static final void method520() {
		field1235 = null;
		field1210 = null;
		field1244 = null;
		field1247 = null;
		field1227 = null;
	}

	@ObfuscatedName("OEPVRTCC.a(IIIZ)LLSSDQDBV;")
	public final LSSDQDBV method521(int arg0, int arg1, int arg2) {
		LSSDQDBV var4 = null;
		long var5;
		if (field1237 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1223 << 6) + arg1);
			LSSDQDBV var7 = (LSSDQDBV) field1210.method448(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1234 == null) {
				return null;
			}

			boolean var8 = field1236 ^ arg1 > 3;
			int var9 = field1234.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1234[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (LSSDQDBV) field1235.method448(var11);
				if (var4 == null) {
					var4 = LSSDQDBV.method423(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method438();
					}

					field1235.method449(var4, var11);
				}

				if (var9 > 1) {
					field1218[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new LSSDQDBV(field1218, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1237.length; var13++) {
				if (field1237[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1223 << 6) + (var12 << 3) + arg1);
			LSSDQDBV var14 = (LSSDQDBV) field1210.method448(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1234[var12];
			boolean var16 = field1236 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (LSSDQDBV) field1235.method448(var15);
			if (var4 == null) {
				var4 = LSSDQDBV.method423(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method438();
				}

				field1235.method449(var4, var15);
			}
		}

		boolean var17;
		if (field1206 == 128 && field1232 == 128 && field1245 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1233 == 0 && field1204 == 0 && field1239 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		LSSDQDBV var19 = new LSSDQDBV(arg1 == 0 && arg2 == -1 && !var17 && !var18, var4, YGZNOIUP.method599(arg2), field1211 == null);
		if (arg2 != -1) {
			var19.method430();
			var19.method431(arg2);
			var19.field1096 = null;
			var19.field1095 = null;
		}

		while (arg1-- > 0) {
			var19.method434();
		}

		if (field1211 != null) {
			for (int var20 = 0; var20 < field1211.length; var20++) {
				var19.method437(field1211[var20], field1240[var20]);
			}
		}

		if (var17) {
			var19.method439(field1232, field1245, field1206);
		}

		if (var18) {
			var19.method436(field1239, field1233, field1204);
		}

		var19.method440(field1241 + 64, field1249 * 5 + 768, -50, -10, -50, !field1212);

		if (field1229 == 1) {
			var19.field1092 = var19.field7;
		}

		field1210.method449(var19, var5);
		return var19;
	}

	@ObfuscatedName("OEPVRTCC.a(I)LOEPVRTCC;")
	public static final OEPVRTCC method522(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1247[var1].field1223 == arg0) {
				return field1247[var1];
			}
		}

		field1225 = (field1225 + 1) % 20;
		OEPVRTCC var2 = field1247[field1225];
		field1227.field1139 = field1244[arg0];
		var2.field1223 = arg0;
		var2.method523();
		var2.method516(field1227);
		return var2;
	}

	@ObfuscatedName("OEPVRTCC.a()V")
	public final void method523() {
		field1234 = null;
		field1237 = null;
		field1242 = null;
		field1226 = null;
		field1211 = null;
		field1240 = null;
		field1246 = 1;
		field1230 = 1;
		field1205 = true;
		field1228 = true;
		field1208 = false;
		field1216 = false;
		field1212 = false;
		field1220 = false;
		field1248 = -1;
		field1213 = 16;
		field1241 = 0;
		field1249 = 0;
		field1231 = null;
		field1215 = -1;
		field1219 = -1;
		field1236 = false;
		field1214 = true;
		field1206 = 128;
		field1232 = 128;
		field1245 = 128;
		field1243 = 0;
		field1233 = 0;
		field1204 = 0;
		field1239 = 0;
		field1221 = false;
		field1217 = false;
		field1229 = -1;
		field1207 = -1;
		field1209 = -1;
		field1250 = null;
	}
}
