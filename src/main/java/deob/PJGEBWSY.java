package deob;

@ObfuscatedName("PJGEBWSY")
public final class PJGEBWSY {

	@ObfuscatedName("PJGEBWSY.c")
	public int field1210 = -1;

	@ObfuscatedName("PJGEBWSY.d")
	public int field1211 = -1;

	@ObfuscatedName("PJGEBWSY.e")
	public long field1212 = -1L;

	@ObfuscatedName("PJGEBWSY.f")
	public boolean field1213 = true;

	@ObfuscatedName("PJGEBWSY.g")
	public int field1214 = -1;

	@ObfuscatedName("PJGEBWSY.k")
	public int field1217 = -1;

	@ObfuscatedName("PJGEBWSY.m")
	public int field1219 = -1;

	@ObfuscatedName("PJGEBWSY.n")
	public int field1220 = -1;

	@ObfuscatedName("PJGEBWSY.o")
	public int field1221 = -1;

	@ObfuscatedName("PJGEBWSY.q")
	public int field1223 = 128;

	@ObfuscatedName("PJGEBWSY.u")
	public boolean field1227 = false;

	@ObfuscatedName("PJGEBWSY.w")
	public byte field1229 = 1;

	@ObfuscatedName("PJGEBWSY.y")
	public int field1231 = -1;

	@ObfuscatedName("PJGEBWSY.z")
	public int field1232 = 32;

	@ObfuscatedName("PJGEBWSY.A")
	public int field1233 = -1;

	@ObfuscatedName("PJGEBWSY.C")
	public int field1235 = -1;

	@ObfuscatedName("PJGEBWSY.E")
	public int field1237 = -1;

	@ObfuscatedName("PJGEBWSY.G")
	public String field1239 = "null";

	@ObfuscatedName("PJGEBWSY.J")
	public boolean field1241 = true;

	@ObfuscatedName("PJGEBWSY.K")
	public int field1242 = -1;

	@ObfuscatedName("PJGEBWSY.L")
	public int field1243 = 128;

	@ObfuscatedName("PJGEBWSY.i")
	public static NQQFCAPC field1216 = new NQQFCAPC(30);

	@ObfuscatedName("PJGEBWSY.b")
	public static int field1209;

	@ObfuscatedName("PJGEBWSY.h")
	public int field1215;

	@ObfuscatedName("PJGEBWSY.l")
	public int field1218;

	@ObfuscatedName("PJGEBWSY.r")
	public static int field1224;

	@ObfuscatedName("PJGEBWSY.p")
	public static WBEWPIXO field1222;

	@ObfuscatedName("PJGEBWSY.x")
	public static client field1230;

	@ObfuscatedName("PJGEBWSY.I")
	public byte[] field1240;

	@ObfuscatedName("PJGEBWSY.a")
	public int[] field1208;

	@ObfuscatedName("PJGEBWSY.s")
	public int[] field1225;

	@ObfuscatedName("PJGEBWSY.v")
	public int[] field1228;

	@ObfuscatedName("PJGEBWSY.B")
	public int[] field1234;

	@ObfuscatedName("PJGEBWSY.D")
	public static int[] field1236;

	@ObfuscatedName("PJGEBWSY.M")
	public int[] field1244;

	@ObfuscatedName("PJGEBWSY.t")
	public static PJGEBWSY[] field1226;

	@ObfuscatedName("PJGEBWSY.F")
	public String[] field1238;

	@ObfuscatedName("PJGEBWSY.a(I)Z")
	public boolean method389() {
		if (field1228 == null) {
			return true;
		}

		int var1 = -1;
		if (field1233 != -1) {
			UDOLPBTU var2 = UDOLPBTU.field1382[field1233];
			int var3 = var2.field1384;
			int var4 = var2.field1385;
			int var5 = var2.field1386;
			int var6 = client.field264[var5 - var4];
			var1 = field1230.field626[var3] >> var4 & var6;
		} else if (field1210 != -1) {
			var1 = field1230.field626[field1210];
		}

		if (var1 >= 0 && var1 < field1228.length && field1228[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("PJGEBWSY.b(I)V")
	public static final void method390() {
		field1216 = null;
		field1236 = null;
		field1226 = null;
		field1222 = null;
	}

	@ObfuscatedName("PJGEBWSY.a(LWBEWPIXO;I)V")
	public final void method391(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method515();
				field1244 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1244[var4] = arg0.method517();
				}
			} else if (var2 == 2) {
				field1239 = arg0.method522();
			} else if (var2 == 3) {
				field1240 = arg0.method523();
			} else if (var2 == 12) {
				field1229 = arg0.method516();
			} else if (var2 == 13) {
				field1237 = arg0.method517();
			} else if (var2 == 14) {
				field1242 = arg0.method517();
			} else if (var2 == 17) {
				field1242 = arg0.method517();
				field1211 = arg0.method517();
				field1219 = arg0.method517();
				field1221 = arg0.method517();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1238 == null) {
					field1238 = new String[5];
				}

				field1238[var2 - 30] = arg0.method522();
				if (field1238[var2 - 30].equalsIgnoreCase("hidden")) {
					field1238[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method515();
				field1234 = new int[var5];
				field1225 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1234[var6] = arg0.method517();
					field1225[var6] = arg0.method517();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method515();
				field1208 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1208[var8] = arg0.method517();
				}
			} else if (var2 == 90) {
				field1217 = arg0.method517();
			} else if (var2 == 91) {
				field1214 = arg0.method517();
			} else if (var2 == 92) {
				field1231 = arg0.method517();
			} else if (var2 == 93) {
				field1241 = false;
			} else if (var2 == 95) {
				field1220 = arg0.method517();
			} else if (var2 == 97) {
				field1223 = arg0.method517();
			} else if (var2 == 98) {
				field1243 = arg0.method517();
			} else if (var2 == 99) {
				field1227 = true;
			} else if (var2 == 100) {
				field1215 = arg0.method516();
			} else if (var2 == 101) {
				field1218 = arg0.method516() * 5;
			} else if (var2 == 102) {
				field1235 = arg0.method517();
			} else if (var2 == 103) {
				field1232 = arg0.method517();
			} else if (var2 == 106) {
				field1233 = arg0.method517();
				if (field1233 == 0xFFFF) {
					field1233 = -1;
				}

				field1210 = arg0.method517();
				if (field1210 == 0xFFFF) {
					field1210 = -1;
				}

				int var9 = arg0.method515();
				field1228 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1228[var10] = arg0.method517();
					if (field1228[var10] == 0xFFFF) {
						field1228[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1213 = false;
			}
		}
	}

	@ObfuscatedName("PJGEBWSY.a(Z)LPJGEBWSY;")
	public final PJGEBWSY method392() {
		int var1 = -1;
		if (field1233 != -1) {
			UDOLPBTU var2 = UDOLPBTU.field1382[field1233];
			int var3 = var2.field1384;
			int var4 = var2.field1385;
			int var5 = var2.field1386;
			int var6 = client.field264[var5 - var4];
			var1 = field1230.field626[var3] >> var4 & var6;
		} else if (field1210 != -1) {
			var1 = field1230.field626[field1210];
		}

		if (var1 >= 0 && var1 < field1228.length && field1228[var1] != -1) {
			return method393(field1228[var1]);
		}

		return null;
	}

	@ObfuscatedName("PJGEBWSY.c(I)LPJGEBWSY;")
	public static final PJGEBWSY method393(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1226[var1].field1212) {
				return field1226[var1];
			}
		}

		field1224 = (field1224 + 1) % 20;
		PJGEBWSY var2 = field1226[field1224] = new PJGEBWSY();
		field1222.field1401 = field1236[arg0];
		var2.field1212 = arg0;
		var2.method391(field1222);
		return var2;
	}

	@ObfuscatedName("PJGEBWSY.a(LLKPVZAQN;)V")
	public static final void method394(LKPVZAQN arg0) {
		field1222 = new WBEWPIXO(arg0.method323("npc.dat", null));
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("npc.idx", null));
		field1209 = var1.method517();
		field1236 = new int[field1209];
		int var2 = 2;
		for (int var3 = 0; var3 < field1209; var3++) {
			field1236[var3] = var2;
			var2 += var1.method517();
		}

		field1226 = new PJGEBWSY[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1226[var4] = new PJGEBWSY();
		}
	}

	@ObfuscatedName("PJGEBWSY.d(I)LFCIDIKVY;")
	public final FCIDIKVY method395() {
		if (field1228 != null) {
			PJGEBWSY var1 = method392();
			if (var1 == null) {
				return null;
			}

			return var1.method395();
		} else if (field1208 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1208.length; var3++) {
				if (!FCIDIKVY.method200(field1208[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			FCIDIKVY[] var4 = new FCIDIKVY[field1208.length];
			for (int var5 = 0; var5 < field1208.length; var5++) {
				var4[var5] = FCIDIKVY.method199(field1208[var5]);
			}

			FCIDIKVY var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new FCIDIKVY(var4.length, var4);
			}

			if (field1234 != null) {
				for (int var7 = 0; var7 < field1234.length; var7++) {
					var6.method213(field1234[var7], field1225[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("PJGEBWSY.a([IIII)LFCIDIKVY;")
	public final FCIDIKVY method396(int[] arg0, int arg1, int arg2) {
		if (field1228 != null) {
			PJGEBWSY var4 = method392();
			if (var4 == null) {
				return null;
			}

			return var4.method396(arg0, arg1, arg2);
		}

		FCIDIKVY var5 = (FCIDIKVY) field1216.method334(field1212);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1244.length; var7++) {
				if (!FCIDIKVY.method200(field1244[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			FCIDIKVY[] var8 = new FCIDIKVY[field1244.length];
			for (int var9 = 0; var9 < field1244.length; var9++) {
				var8[var9] = FCIDIKVY.method199(field1244[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new FCIDIKVY(var8.length, var8);
			}

			if (field1234 != null) {
				for (int var10 = 0; var10 < field1234.length; var10++) {
					var5.method213(field1234[var10], field1225[var10]);
				}
			}

			var5.method206();
			var5.method216(field1215 + 64, field1218 + 850, -30, -50, -30, true);
			field1216.method335(field1212, var5);
		}

		FCIDIKVY var11 = FCIDIKVY.field680;
		var11.method201(FGGKJQKK.method235(arg1) & FGGKJQKK.method235(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method208(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method207(arg1);
		}

		if (field1223 != 128 || field1243 != 128) {
			var11.method215(field1223, field1223, field1243);
		}

		var11.method203();
		var11.field716 = null;
		var11.field715 = null;

		if (field1229 == 1) {
			var11.field717 = true;
		}

		return var11;
	}
}
