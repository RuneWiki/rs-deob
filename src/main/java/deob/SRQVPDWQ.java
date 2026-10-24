package deob;

@ObfuscatedName("SRQVPDWQ")
public final class SRQVPDWQ {

	@ObfuscatedName("SRQVPDWQ.m")
	public int field1231 = -1;

	@ObfuscatedName("SRQVPDWQ.i")
	public static RPWOWYDL field1227 = new RPWOWYDL(500);

	@ObfuscatedName("SRQVPDWQ.u")
	public static SNMMQNPZ[] field1237 = new SNMMQNPZ[4];

	@ObfuscatedName("SRQVPDWQ.D")
	public static RPWOWYDL field1245 = new RPWOWYDL(40);

	@ObfuscatedName("SRQVPDWQ.o")
	public byte field1232;

	@ObfuscatedName("SRQVPDWQ.S")
	public byte field1260;

	@ObfuscatedName("SRQVPDWQ.a")
	public int field1220;

	@ObfuscatedName("SRQVPDWQ.c")
	public int field1221;

	@ObfuscatedName("SRQVPDWQ.d")
	public int field1222;

	@ObfuscatedName("SRQVPDWQ.g")
	public int field1225;

	@ObfuscatedName("SRQVPDWQ.v")
	public int field1238;

	@ObfuscatedName("SRQVPDWQ.w")
	public int field1239;

	@ObfuscatedName("SRQVPDWQ.x")
	public int field1240;

	@ObfuscatedName("SRQVPDWQ.y")
	public int field1241;

	@ObfuscatedName("SRQVPDWQ.G")
	public int field1248;

	@ObfuscatedName("SRQVPDWQ.I")
	public static int field1250;

	@ObfuscatedName("SRQVPDWQ.J")
	public int field1251;

	@ObfuscatedName("SRQVPDWQ.K")
	public int field1252;

	@ObfuscatedName("SRQVPDWQ.M")
	public static int field1254;

	@ObfuscatedName("SRQVPDWQ.O")
	public int field1256;

	@ObfuscatedName("SRQVPDWQ.P")
	public int field1257;

	@ObfuscatedName("SRQVPDWQ.W")
	public int field1264;

	@ObfuscatedName("SRQVPDWQ.X")
	public int field1265;

	@ObfuscatedName("SRQVPDWQ.Y")
	public int field1266;

	@ObfuscatedName("SRQVPDWQ.h")
	public static DNRIFKTO field1226;

	@ObfuscatedName("SRQVPDWQ.j")
	public static client field1228;

	@ObfuscatedName("SRQVPDWQ.V")
	public String field1263;

	@ObfuscatedName("SRQVPDWQ.k")
	public boolean field1229;

	@ObfuscatedName("SRQVPDWQ.l")
	public boolean field1230;

	@ObfuscatedName("SRQVPDWQ.p")
	public boolean field1233;

	@ObfuscatedName("SRQVPDWQ.q")
	public boolean field1234;

	@ObfuscatedName("SRQVPDWQ.s")
	public boolean field1236;

	@ObfuscatedName("SRQVPDWQ.A")
	public boolean field1242;

	@ObfuscatedName("SRQVPDWQ.B")
	public boolean field1243;

	@ObfuscatedName("SRQVPDWQ.H")
	public boolean field1249;

	@ObfuscatedName("SRQVPDWQ.Q")
	public static boolean field1258;

	@ObfuscatedName("SRQVPDWQ.R")
	public boolean field1259;

	@ObfuscatedName("SRQVPDWQ.U")
	public boolean field1262;

	@ObfuscatedName("SRQVPDWQ.f")
	public byte[] field1224;

	@ObfuscatedName("SRQVPDWQ.C")
	public int[] field1244;

	@ObfuscatedName("SRQVPDWQ.E")
	public int[] field1246;

	@ObfuscatedName("SRQVPDWQ.F")
	public int[] field1247;

	@ObfuscatedName("SRQVPDWQ.L")
	public static int[] field1253;

	@ObfuscatedName("SRQVPDWQ.N")
	public int[] field1255;

	@ObfuscatedName("SRQVPDWQ.T")
	public int[] field1261;

	@ObfuscatedName("SRQVPDWQ.r")
	public static SRQVPDWQ[] field1235;

	@ObfuscatedName("SRQVPDWQ.e")
	public String[] field1223;

	@ObfuscatedName("SRQVPDWQ.a(B)Z")
	public final boolean method444() {
		if (field1261 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1261.length; var2++) {
			var1 &= SNMMQNPZ.method419(field1261[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("SRQVPDWQ.a(I)LSRQVPDWQ;")
	public static final SRQVPDWQ method445(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1235[var1].field1231 == arg0) {
				return field1235[var1];
			}
		}

		field1250 = (field1250 + 1) % 20;
		SRQVPDWQ var2 = field1235[field1250];
		field1226.field563 = field1253[arg0];
		var2.field1231 = arg0;
		var2.method450();
		var2.method452(field1226);
		return var2;
	}

	@ObfuscatedName("SRQVPDWQ.a(IIIIIII)LSNMMQNPZ;")
	public final SNMMQNPZ method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		SNMMQNPZ var8 = method453(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1233 || field1262) {
			var8 = new SNMMQNPZ(field1262, field1233, var8);
		}

		if (field1233) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1153; var10++) {
				int var11 = var8.field1154[var10];
				int var12 = var8.field1156[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1155[var10] += var15 - var9;
			}

			var8.method423();
		}

		return var8;
	}

	@ObfuscatedName("SRQVPDWQ.a(LFNOQZAYQ;)V")
	public static final void method447(FNOQZAYQ arg0) {
		field1226 = new DNRIFKTO(arg0.method246("loc.dat", null));
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("loc.idx", null));
		field1254 = var1.method191();
		field1253 = new int[field1254];
		int var2 = 2;
		for (int var3 = 0; var3 < field1254; var3++) {
			field1253[var3] = var2;
			var2 += var1.method191();
		}

		field1235 = new SRQVPDWQ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1235[var4] = new SRQVPDWQ();
		}
	}

	@ObfuscatedName("SRQVPDWQ.a(BLMWSOISVX;)V")
	public final void method448(MWSOISVX arg0) {
		if (field1261 != null) {
			for (int var2 = 0; var2 < field1261.length; var2++) {
				arg0.method330(field1261[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("SRQVPDWQ.b(I)V")
	public static final void method449() {
		field1227 = null;
		field1245 = null;
		field1253 = null;
		field1235 = null;
		field1226 = null;
	}

	@ObfuscatedName("SRQVPDWQ.a()V")
	public final void method450() {
		field1261 = null;
		field1255 = null;
		field1263 = null;
		field1224 = null;
		field1246 = null;
		field1244 = null;
		field1239 = 1;
		field1238 = 1;
		field1242 = true;
		field1243 = true;
		field1249 = false;
		field1233 = false;
		field1262 = false;
		field1259 = false;
		field1264 = -1;
		field1221 = 16;
		field1260 = 0;
		field1232 = 0;
		field1223 = null;
		field1248 = -1;
		field1256 = -1;
		field1229 = false;
		field1230 = true;
		field1266 = 128;
		field1240 = 128;
		field1222 = 128;
		field1220 = 0;
		field1257 = 0;
		field1241 = 0;
		field1225 = 0;
		field1236 = false;
		field1234 = false;
		field1251 = -1;
		field1252 = -1;
		field1265 = -1;
		field1247 = null;
	}

	@ObfuscatedName("SRQVPDWQ.b(B)LSRQVPDWQ;")
	public final SRQVPDWQ method451() {
		int var1 = -1;
		if (field1252 != -1) {
			LVQCDTJA var2 = LVQCDTJA.field901[field1252];
			int var3 = var2.field903;
			int var4 = var2.field904;
			int var5 = var2.field905;
			int var6 = client.field501[var5 - var4];
			var1 = field1228.field532[var3] >> var4 & var6;
		} else if (field1265 != -1) {
			var1 = field1228.field532[field1265];
		}

		if (var1 >= 0 && var1 < field1247.length && field1247[var1] != -1) {
			return method445(field1247[var1]);
		}

		return null;
	}

	@ObfuscatedName("SRQVPDWQ.a(LDNRIFKTO;I)V")
	public final void method452(DNRIFKTO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method189();
					if (var3 == 0) {
						if (var2 == -1) {
							field1249 = false;
							if (field1261 != null && (field1255 == null || field1255[0] == 10)) {
								field1249 = true;
							}

							if (field1223 != null) {
								field1249 = true;
							}
						}

						if (field1234) {
							field1242 = false;
							field1243 = false;
						}

						if (field1251 == -1) {
							field1251 = field1242 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1263 = arg0.method196();
					} else if (var3 == 3) {
						field1224 = arg0.method197();
					} else if (var3 == 5) {
						int var6 = arg0.method189();
						if (var6 > 0) {
							if (field1261 == null || field1258) {
								field1255 = null;
								field1261 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1261[var7] = arg0.method191();
								}
							} else {
								arg0.field563 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1239 = arg0.method189();
					} else if (var3 == 15) {
						field1238 = arg0.method189();
					} else if (var3 == 17) {
						field1242 = false;
					} else if (var3 == 18) {
						field1243 = false;
					} else if (var3 == 19) {
						var2 = arg0.method189();
						if (var2 == 1) {
							field1249 = true;
						}
					} else if (var3 == 21) {
						field1233 = true;
					} else if (var3 == 22) {
						field1262 = true;
					} else if (var3 == 23) {
						field1259 = true;
					} else if (var3 == 24) {
						field1264 = arg0.method191();
						if (field1264 == 0xFFFF) {
							field1264 = -1;
						}
					} else if (var3 == 28) {
						field1221 = arg0.method189();
					} else if (var3 == 29) {
						field1260 = arg0.method190();
					} else if (var3 == 39) {
						field1232 = arg0.method190();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1223 == null) {
							field1223 = new String[5];
						}

						field1223[var3 - 30] = arg0.method196();
						if (field1223[var3 - 30].equalsIgnoreCase("hidden")) {
							field1223[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method189();
						field1246 = new int[var8];
						field1244 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1246[var9] = arg0.method191();
							field1244[var9] = arg0.method191();
						}
					} else if (var3 == 60) {
						field1248 = arg0.method191();
					} else if (var3 == 62) {
						field1229 = true;
					} else if (var3 == 64) {
						field1230 = false;
					} else if (var3 == 65) {
						field1266 = arg0.method191();
					} else if (var3 == 66) {
						field1240 = arg0.method191();
					} else if (var3 == 67) {
						field1222 = arg0.method191();
					} else if (var3 == 68) {
						field1256 = arg0.method191();
					} else if (var3 == 69) {
						field1220 = arg0.method189();
					} else if (var3 == 70) {
						field1257 = arg0.method192();
					} else if (var3 == 71) {
						field1241 = arg0.method192();
					} else if (var3 == 72) {
						field1225 = arg0.method192();
					} else if (var3 == 73) {
						field1236 = true;
					} else if (var3 == 74) {
						field1234 = true;
					} else if (var3 == 75) {
						field1251 = arg0.method189();
					} else if (var3 == 77) {
						field1252 = arg0.method191();
						if (field1252 == 0xFFFF) {
							field1252 = -1;
						}

						field1265 = arg0.method191();
						if (field1265 == 0xFFFF) {
							field1265 = -1;
						}

						int var10 = arg0.method189();
						field1247 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1247[var11] = arg0.method191();
							if (field1247[var11] == 0xFFFF) {
								field1247[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method189();
			} while (var4 <= 0);

			if (field1261 == null || field1258) {
				field1255 = new int[var4];
				field1261 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1261[var5] = arg0.method191();
					field1255[var5] = arg0.method189();
				}
			} else {
				arg0.field563 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SRQVPDWQ.a(IIII)LSNMMQNPZ;")
	public final SNMMQNPZ method453(int arg0, int arg1, int arg2) {
		SNMMQNPZ var4 = null;
		long var5;
		if (field1255 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1231 << 6) + arg1);
			SNMMQNPZ var7 = (SNMMQNPZ) field1245.method401(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1261 == null) {
				return null;
			}

			boolean var8 = field1229 ^ arg1 > 3;
			int var9 = field1261.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1261[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (SNMMQNPZ) field1227.method401(var11);
				if (var4 == null) {
					var4 = SNMMQNPZ.method418(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method433();
					}

					field1227.method402(var11, var4);
				}

				if (var9 > 1) {
					field1237[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new SNMMQNPZ(var9, field1237);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1255.length; var13++) {
				if (field1255[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1231 << 6) + (var12 << 3) + arg1);
			SNMMQNPZ var14 = (SNMMQNPZ) field1245.method401(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1261[var12];
			boolean var16 = field1229 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (SNMMQNPZ) field1227.method401(var15);
			if (var4 == null) {
				var4 = SNMMQNPZ.method418(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method433();
				}

				field1227.method402(var15, var4);
			}
		}

		boolean var17;
		if (field1266 == 128 && field1240 == 128 && field1222 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1257 == 0 && field1241 == 0 && field1225 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		SNMMQNPZ var19 = new SNMMQNPZ(var4, arg1 == 0 && arg0 == -1 && !var17 && !var18, field1246 == null, NLIOLBXV.method356(arg0));
		if (arg0 != -1) {
			var19.method425();
			var19.method426(arg0);
			var19.field1185 = null;
			var19.field1184 = null;
		}

		while (arg1-- > 0) {
			var19.method429();
		}

		if (field1246 != null) {
			for (int var20 = 0; var20 < field1246.length; var20++) {
				var19.method432(field1246[var20], field1244[var20]);
			}
		}

		if (var17) {
			var19.method434(field1266, field1222, field1240);
		}

		if (var18) {
			var19.method431(field1257, field1241, field1225);
		}

		var19.method435(field1260 + 64, field1232 * 5 + 768, -50, -10, -50, !field1262);

		if (field1251 == 1) {
			var19.field1181 = var19.field1400;
		}

		field1245.method402(var5, var19);
		return var19;
	}

	@ObfuscatedName("SRQVPDWQ.a(IZ)Z")
	public final boolean method454(int arg0) {
		if (field1255 != null) {
			for (int var4 = 0; var4 < field1255.length; var4++) {
				if (field1255[var4] == arg0) {
					return SNMMQNPZ.method419(field1261[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1261 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1261.length; var3++) {
				var2 &= SNMMQNPZ.method419(field1261[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}
}
