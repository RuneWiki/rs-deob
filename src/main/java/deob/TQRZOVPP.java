package deob;

@ObfuscatedName("TQRZOVPP")
public final class TQRZOVPP {

	@ObfuscatedName("TQRZOVPP.d")
	public int field1229 = 32;

	@ObfuscatedName("TQRZOVPP.e")
	public int field1230 = 128;

	@ObfuscatedName("TQRZOVPP.i")
	public int field1233 = -1;

	@ObfuscatedName("TQRZOVPP.j")
	public int field1234 = -1;

	@ObfuscatedName("TQRZOVPP.l")
	public int field1236 = -1;

	@ObfuscatedName("TQRZOVPP.o")
	public String field1239 = "null";

	@ObfuscatedName("TQRZOVPP.p")
	public int field1240 = -1;

	@ObfuscatedName("TQRZOVPP.r")
	public boolean field1242 = true;

	@ObfuscatedName("TQRZOVPP.u")
	public int field1245 = -1;

	@ObfuscatedName("TQRZOVPP.w")
	public int field1247 = -1;

	@ObfuscatedName("TQRZOVPP.x")
	public int field1248 = -1;

	@ObfuscatedName("TQRZOVPP.z")
	public long field1250 = -1L;

	@ObfuscatedName("TQRZOVPP.A")
	public boolean field1251 = false;

	@ObfuscatedName("TQRZOVPP.B")
	public int field1252 = -1;

	@ObfuscatedName("TQRZOVPP.C")
	public int field1253 = -1;

	@ObfuscatedName("TQRZOVPP.E")
	public byte field1254 = 1;

	@ObfuscatedName("TQRZOVPP.H")
	public int field1256 = -1;

	@ObfuscatedName("TQRZOVPP.I")
	public int field1257 = -1;

	@ObfuscatedName("TQRZOVPP.J")
	public boolean field1258 = true;

	@ObfuscatedName("TQRZOVPP.N")
	public int field1261 = 128;

	@ObfuscatedName("TQRZOVPP.O")
	public int field1262 = -1;

	@ObfuscatedName("TQRZOVPP.y")
	public static HARAZQMH field1249 = new HARAZQMH(30);

	@ObfuscatedName("TQRZOVPP.a")
	public int field1226;

	@ObfuscatedName("TQRZOVPP.g")
	public int field1232;

	@ObfuscatedName("TQRZOVPP.m")
	public static int field1237;

	@ObfuscatedName("TQRZOVPP.t")
	public static int field1244;

	@ObfuscatedName("TQRZOVPP.c")
	public static CMGGUSPR field1228;

	@ObfuscatedName("TQRZOVPP.b")
	public static client field1227;

	@ObfuscatedName("TQRZOVPP.v")
	public byte[] field1246;

	@ObfuscatedName("TQRZOVPP.f")
	public int[] field1231;

	@ObfuscatedName("TQRZOVPP.k")
	public int[] field1235;

	@ObfuscatedName("TQRZOVPP.n")
	public int[] field1238;

	@ObfuscatedName("TQRZOVPP.s")
	public int[] field1243;

	@ObfuscatedName("TQRZOVPP.F")
	public int[] field1255;

	@ObfuscatedName("TQRZOVPP.M")
	public static int[] field1260;

	@ObfuscatedName("TQRZOVPP.K")
	public static TQRZOVPP[] field1259;

	@ObfuscatedName("TQRZOVPP.q")
	public String[] field1241;

	@ObfuscatedName("TQRZOVPP.a(B)LTQRZOVPP;")
	public final TQRZOVPP method515() {
		int var1 = -1;
		if (field1248 != -1) {
			RLLHHJLC var2 = RLLHHJLC.field1048[field1248];
			int var3 = var2.field1050;
			int var4 = var2.field1051;
			int var5 = var2.field1052;
			int var6 = client.field346[var5 - var4];
			var1 = field1227.field226[var3] >> var4 & var6;
		} else if (field1256 != -1) {
			var1 = field1227.field226[field1256];
		}

		if (var1 >= 0 && var1 < field1231.length && field1231[var1] != -1) {
			return method517(field1231[var1]);
		}

		return null;
	}

	@ObfuscatedName("TQRZOVPP.a(I)V")
	public static final void method516() {
		field1249 = null;
		field1260 = null;
		field1259 = null;
		field1228 = null;
	}

	@ObfuscatedName("TQRZOVPP.b(I)LTQRZOVPP;")
	public static final TQRZOVPP method517(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1259[var1].field1250) {
				return field1259[var1];
			}
		}

		field1237 = (field1237 + 1) % 20;
		TQRZOVPP var2 = field1259[field1237] = new TQRZOVPP();
		field1228.field540 = field1260[arg0];
		var2.field1250 = arg0;
		var2.method522(field1228);
		return var2;
	}

	@ObfuscatedName("TQRZOVPP.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method518() {
		if (field1231 != null) {
			TQRZOVPP var1 = method515();
			if (var1 == null) {
				return null;
			}

			return var1.method518();
		} else if (field1238 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1238.length; var3++) {
				if (!GCSAWSJV.method261(field1238[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			GCSAWSJV[] var4 = new GCSAWSJV[field1238.length];
			for (int var5 = 0; var5 < field1238.length; var5++) {
				var4[var5] = GCSAWSJV.method260(field1238[var5]);
			}

			GCSAWSJV var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new GCSAWSJV(var4, var4.length);
			}

			if (field1243 != null) {
				for (int var7 = 0; var7 < field1243.length; var7++) {
					var6.method274(field1243[var7], field1235[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("TQRZOVPP.b(Z)Z")
	public boolean method519() {
		if (field1231 == null) {
			return true;
		}

		int var1 = -1;
		if (field1248 != -1) {
			RLLHHJLC var2 = RLLHHJLC.field1048[field1248];
			int var3 = var2.field1050;
			int var4 = var2.field1051;
			int var5 = var2.field1052;
			int var6 = client.field346[var5 - var4];
			var1 = field1227.field226[var3] >> var4 & var6;
		} else if (field1256 != -1) {
			var1 = field1227.field226[field1256];
		}

		if (var1 >= 0 && var1 < field1231.length && field1231[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("TQRZOVPP.a(I[IIB)LGCSAWSJV;")
	public final GCSAWSJV method520(int arg0, int[] arg1, int arg2) {
		if (field1231 != null) {
			TQRZOVPP var4 = method515();
			if (var4 == null) {
				return null;
			}

			return var4.method520(arg0, arg1, arg2);
		}

		GCSAWSJV var5 = (GCSAWSJV) field1249.method299(field1250);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1255.length; var7++) {
				if (!GCSAWSJV.method261(field1255[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			GCSAWSJV[] var8 = new GCSAWSJV[field1255.length];
			for (int var9 = 0; var9 < field1255.length; var9++) {
				var8[var9] = GCSAWSJV.method260(field1255[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new GCSAWSJV(var8, var8.length);
			}

			if (field1243 != null) {
				for (int var10 = 0; var10 < field1243.length; var10++) {
					var5.method274(field1243[var10], field1235[var10]);
				}
			}

			var5.method267();
			var5.method277(field1226 + 64, field1232 + 850, -30, -50, -30, true);
			field1249.method300(field1250, var5);
		}

		GCSAWSJV var11 = GCSAWSJV.field588;
		var11.method262(RLONYBCF.method436(arg2) & RLONYBCF.method436(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method269(arg2, arg1, arg0);
		} else if (arg2 != -1) {
			var11.method268(arg2);
		}

		if (field1230 != 128 || field1261 != 128) {
			var11.method276(field1230, field1230, field1261);
		}

		var11.method264();
		var11.field624 = null;
		var11.field623 = null;

		if (field1254 == 1) {
			var11.field625 = true;
		}

		return var11;
	}

	@ObfuscatedName("TQRZOVPP.a(LUUIGNTAD;)V")
	public static final void method521(UUIGNTAD arg0) {
		field1228 = new CMGGUSPR(arg0.method545("npc.dat", null));
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("npc.idx", null));
		field1244 = var1.method196();
		field1260 = new int[field1244];
		int var2 = 2;
		for (int var3 = 0; var3 < field1244; var3++) {
			field1260[var3] = var2;
			var2 += var1.method196();
		}

		field1259 = new TQRZOVPP[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1259[var4] = new TQRZOVPP();
		}
	}

	@ObfuscatedName("TQRZOVPP.a(LCMGGUSPR;I)V")
	public final void method522(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method194();
				field1255 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1255[var4] = arg0.method196();
				}
			} else if (var2 == 2) {
				field1239 = arg0.method201();
			} else if (var2 == 3) {
				field1246 = arg0.method202();
			} else if (var2 == 12) {
				field1254 = arg0.method195();
			} else if (var2 == 13) {
				field1262 = arg0.method196();
			} else if (var2 == 14) {
				field1233 = arg0.method196();
			} else if (var2 == 17) {
				field1233 = arg0.method196();
				field1252 = arg0.method196();
				field1234 = arg0.method196();
				field1253 = arg0.method196();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1241 == null) {
					field1241 = new String[5];
				}

				field1241[var2 - 30] = arg0.method201();
				if (field1241[var2 - 30].equalsIgnoreCase("hidden")) {
					field1241[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method194();
				field1243 = new int[var5];
				field1235 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1243[var6] = arg0.method196();
					field1235[var6] = arg0.method196();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method194();
				field1238 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1238[var8] = arg0.method196();
				}
			} else if (var2 == 90) {
				field1247 = arg0.method196();
			} else if (var2 == 91) {
				field1240 = arg0.method196();
			} else if (var2 == 92) {
				field1245 = arg0.method196();
			} else if (var2 == 93) {
				field1258 = false;
			} else if (var2 == 95) {
				field1257 = arg0.method196();
			} else if (var2 == 97) {
				field1230 = arg0.method196();
			} else if (var2 == 98) {
				field1261 = arg0.method196();
			} else if (var2 == 99) {
				field1251 = true;
			} else if (var2 == 100) {
				field1226 = arg0.method195();
			} else if (var2 == 101) {
				field1232 = arg0.method195() * 5;
			} else if (var2 == 102) {
				field1236 = arg0.method196();
			} else if (var2 == 103) {
				field1229 = arg0.method196();
			} else if (var2 == 106) {
				field1248 = arg0.method196();
				if (field1248 == 0xFFFF) {
					field1248 = -1;
				}

				field1256 = arg0.method196();
				if (field1256 == 0xFFFF) {
					field1256 = -1;
				}

				int var9 = arg0.method194();
				field1231 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1231[var10] = arg0.method196();
					if (field1231[var10] == 0xFFFF) {
						field1231[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1242 = false;
			}
		}
	}
}
