package deob;

@ObfuscatedName("RUROEYEG")
public final class RUROEYEG {

	@ObfuscatedName("RUROEYEG.q")
	public String field1217 = "null";

	@ObfuscatedName("RUROEYEG.y")
	public int field1225 = -1;

	@ObfuscatedName("RUROEYEG.c")
	public static BMKJVFXV field1207 = new BMKJVFXV(500);

	@ObfuscatedName("RUROEYEG.e")
	public static RMLAXPMV[] field1209 = new RMLAXPMV[4];

	@ObfuscatedName("RUROEYEG.g")
	public static BMKJVFXV field1211 = new BMKJVFXV(40);

	@ObfuscatedName("RUROEYEG.z")
	public byte field1226;

	@ObfuscatedName("RUROEYEG.R")
	public byte field1242;

	@ObfuscatedName("RUROEYEG.b")
	public int field1206;

	@ObfuscatedName("RUROEYEG.d")
	public int field1208;

	@ObfuscatedName("RUROEYEG.f")
	public int field1210;

	@ObfuscatedName("RUROEYEG.j")
	public int field1214;

	@ObfuscatedName("RUROEYEG.s")
	public int field1219;

	@ObfuscatedName("RUROEYEG.t")
	public int field1220;

	@ObfuscatedName("RUROEYEG.u")
	public int field1221;

	@ObfuscatedName("RUROEYEG.A")
	public int field1227;

	@ObfuscatedName("RUROEYEG.F")
	public int field1231;

	@ObfuscatedName("RUROEYEG.I")
	public int field1234;

	@ObfuscatedName("RUROEYEG.K")
	public int field1236;

	@ObfuscatedName("RUROEYEG.L")
	public static int field1237;

	@ObfuscatedName("RUROEYEG.M")
	public int field1238;

	@ObfuscatedName("RUROEYEG.N")
	public int field1239;

	@ObfuscatedName("RUROEYEG.O")
	public int field1240;

	@ObfuscatedName("RUROEYEG.V")
	public int field1246;

	@ObfuscatedName("RUROEYEG.W")
	public int field1247;

	@ObfuscatedName("RUROEYEG.Z")
	public static int field1250;

	@ObfuscatedName("RUROEYEG.Q")
	public static BSNPYLEV field1241;

	@ObfuscatedName("RUROEYEG.x")
	public static client field1224;

	@ObfuscatedName("RUROEYEG.a")
	public boolean field1205;

	@ObfuscatedName("RUROEYEG.n")
	public boolean field1216;

	@ObfuscatedName("RUROEYEG.r")
	public boolean field1218;

	@ObfuscatedName("RUROEYEG.v")
	public boolean field1222;

	@ObfuscatedName("RUROEYEG.w")
	public boolean field1223;

	@ObfuscatedName("RUROEYEG.B")
	public boolean field1228;

	@ObfuscatedName("RUROEYEG.C")
	public boolean field1229;

	@ObfuscatedName("RUROEYEG.E")
	public boolean field1230;

	@ObfuscatedName("RUROEYEG.T")
	public boolean field1244;

	@ObfuscatedName("RUROEYEG.X")
	public static boolean field1248;

	@ObfuscatedName("RUROEYEG.Y")
	public boolean field1249;

	@ObfuscatedName("RUROEYEG.m")
	public byte[] field1215;

	@ObfuscatedName("RUROEYEG.h")
	public int[] field1212;

	@ObfuscatedName("RUROEYEG.i")
	public int[] field1213;

	@ObfuscatedName("RUROEYEG.G")
	public int[] field1232;

	@ObfuscatedName("RUROEYEG.H")
	public int[] field1233;

	@ObfuscatedName("RUROEYEG.S")
	public static int[] field1243;

	@ObfuscatedName("RUROEYEG.ab")
	public int[] field1251;

	@ObfuscatedName("RUROEYEG.U")
	public static RUROEYEG[] field1245;

	@ObfuscatedName("RUROEYEG.J")
	public String[] field1235;

	@ObfuscatedName("RUROEYEG.a(IIIIIII)LRMLAXPMV;")
	public final RMLAXPMV method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		RMLAXPMV var8 = method497(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1205 || field1230) {
			var8 = new RMLAXPMV(field1205, field1230, var8);
		}

		if (field1205) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1139; var10++) {
				int var11 = var8.field1140[var10];
				int var12 = var8.field1142[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1141[var10] += var15 - var9;
			}

			var8.method471();
		}

		return var8;
	}

	@ObfuscatedName("RUROEYEG.a(I)LRUROEYEG;")
	public final RUROEYEG method493() {
		int var1 = -1;
		if (field1236 != -1) {
			DUEJVLYB var2 = DUEJVLYB.field550[field1236];
			int var3 = var2.field552;
			int var4 = var2.field553;
			int var5 = var2.field554;
			int var6 = client.field238[var5 - var4];
			var1 = field1224.field148[var3] >> var4 & var6;
		} else if (field1231 != -1) {
			var1 = field1224.field148[field1231];
		}

		if (var1 >= 0 && var1 < field1233.length && field1233[var1] != -1) {
			return method494(field1233[var1]);
		}

		return null;
	}

	@ObfuscatedName("RUROEYEG.b(I)LRUROEYEG;")
	public static final RUROEYEG method494(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1245[var1].field1225 == arg0) {
				return field1245[var1];
			}
		}

		field1237 = (field1237 + 1) % 20;
		RUROEYEG var2 = field1245[field1237];
		field1241.field55 = field1243[arg0];
		var2.field1225 = arg0;
		var2.method500();
		var2.method496(field1241);
		return var2;
	}

	@ObfuscatedName("RUROEYEG.c(I)V")
	public static final void method495() {
		field1207 = null;
		field1211 = null;
		field1243 = null;
		field1245 = null;
		field1241 = null;
	}

	@ObfuscatedName("RUROEYEG.a(ILBSNPYLEV;)V")
	public final void method496(BSNPYLEV arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method47();
					if (var3 == 0) {
						if (var2 == -1) {
							field1222 = false;
							if (field1212 != null && (field1213 == null || field1213[0] == 10)) {
								field1222 = true;
							}

							if (field1235 != null) {
								field1222 = true;
							}
						}

						if (field1218) {
							field1228 = false;
							field1249 = false;
						}

						if (field1221 == -1) {
							field1221 = field1228 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1217 = arg0.method54();
					} else if (var3 == 3) {
						field1215 = arg0.method55();
					} else if (var3 == 5) {
						int var6 = arg0.method47();
						if (var6 > 0) {
							if (field1212 == null || field1248) {
								field1213 = null;
								field1212 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1212[var7] = arg0.method49();
								}
							} else {
								arg0.field55 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1227 = arg0.method47();
					} else if (var3 == 15) {
						field1240 = arg0.method47();
					} else if (var3 == 17) {
						field1228 = false;
					} else if (var3 == 18) {
						field1249 = false;
					} else if (var3 == 19) {
						var2 = arg0.method47();
						if (var2 == 1) {
							field1222 = true;
						}
					} else if (var3 == 21) {
						field1205 = true;
					} else if (var3 == 22) {
						field1230 = true;
					} else if (var3 == 23) {
						field1216 = true;
					} else if (var3 == 24) {
						field1238 = arg0.method49();
						if (field1238 == 0xFFFF) {
							field1238 = -1;
						}
					} else if (var3 == 28) {
						field1239 = arg0.method47();
					} else if (var3 == 29) {
						field1242 = arg0.method48();
					} else if (var3 == 39) {
						field1226 = arg0.method48();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1235 == null) {
							field1235 = new String[5];
						}

						field1235[var3 - 30] = arg0.method54();
						if (field1235[var3 - 30].equalsIgnoreCase("hidden")) {
							field1235[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method47();
						field1232 = new int[var8];
						field1251 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1232[var9] = arg0.method49();
							field1251[var9] = arg0.method49();
						}
					} else if (var3 == 60) {
						field1246 = arg0.method49();
					} else if (var3 == 62) {
						field1229 = true;
					} else if (var3 == 64) {
						field1223 = false;
					} else if (var3 == 65) {
						field1247 = arg0.method49();
					} else if (var3 == 66) {
						field1220 = arg0.method49();
					} else if (var3 == 67) {
						field1219 = arg0.method49();
					} else if (var3 == 68) {
						field1208 = arg0.method49();
					} else if (var3 == 69) {
						field1234 = arg0.method47();
					} else if (var3 == 70) {
						field1214 = arg0.method50();
					} else if (var3 == 71) {
						field1210 = arg0.method50();
					} else if (var3 == 72) {
						field1206 = arg0.method50();
					} else if (var3 == 73) {
						field1244 = true;
					} else if (var3 == 74) {
						field1218 = true;
					} else if (var3 == 75) {
						field1221 = arg0.method47();
					} else if (var3 == 77) {
						field1236 = arg0.method49();
						if (field1236 == 0xFFFF) {
							field1236 = -1;
						}

						field1231 = arg0.method49();
						if (field1231 == 0xFFFF) {
							field1231 = -1;
						}

						int var10 = arg0.method47();
						field1233 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1233[var11] = arg0.method49();
							if (field1233[var11] == 0xFFFF) {
								field1233[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method47();
			} while (var4 <= 0);

			if (field1212 == null || field1248) {
				field1213 = new int[var4];
				field1212 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1212[var5] = arg0.method49();
					field1213[var5] = arg0.method47();
				}
			} else {
				arg0.field55 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("RUROEYEG.a(IIII)LRMLAXPMV;")
	public final RMLAXPMV method497(int arg0, int arg1, int arg2) {
		RMLAXPMV var4 = null;
		long var5;
		if (field1213 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1225 << 6) + arg1);
			RMLAXPMV var7 = (RMLAXPMV) field1211.method32(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1212 == null) {
				return null;
			}

			boolean var8 = field1229 ^ arg1 > 3;
			int var9 = field1212.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1212[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (RMLAXPMV) field1207.method32(var11);
				if (var4 == null) {
					var4 = RMLAXPMV.method466(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method481();
					}

					field1207.method33(var11, var4);
				}

				if (var9 > 1) {
					field1209[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new RMLAXPMV(var9, field1209);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1213.length; var13++) {
				if (field1213[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1225 << 6) + (var12 << 3) + arg1);
			RMLAXPMV var14 = (RMLAXPMV) field1211.method32(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1212[var12];
			boolean var16 = field1229 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (RMLAXPMV) field1207.method32(var15);
			if (var4 == null) {
				var4 = RMLAXPMV.method466(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method481();
				}

				field1207.method33(var15, var4);
			}
		}

		boolean var17;
		if (field1247 == 128 && field1220 == 128 && field1219 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1214 == 0 && field1210 == 0 && field1206 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		RMLAXPMV var19 = new RMLAXPMV(var4, XMRZESBN.method586(arg2), field1232 == null, arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method473();
			var19.method474(arg2);
			var19.field1170 = null;
			var19.field1169 = null;
		}

		while (arg1-- > 0) {
			var19.method477();
		}

		if (field1232 != null) {
			for (int var20 = 0; var20 < field1232.length; var20++) {
				var19.method480(field1232[var20], field1251[var20]);
			}
		}

		if (var17) {
			var19.method482(field1220, field1247, field1219);
		}

		if (var18) {
			var19.method479(field1206, field1214, field1210);
		}

		var19.method483(field1242 + 64, field1226 * 5 + 768, -50, -10, -50, !field1230);

		if (field1221 == 1) {
			var19.field1166 = var19.field1060;
		}

		field1211.method33(var5, var19);
		return var19;
	}

	@ObfuscatedName("RUROEYEG.a(LSMIVAFST;)V")
	public static final void method498(SMIVAFST arg0) {
		field1241 = new BSNPYLEV(arg0.method512("loc.dat", null));
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("loc.idx", null));
		field1250 = var1.method49();
		field1243 = new int[field1250];
		int var2 = 2;
		for (int var3 = 0; var3 < field1250; var3++) {
			field1243[var3] = var2;
			var2 += var1.method49();
		}

		field1245 = new RUROEYEG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1245[var4] = new RUROEYEG();
		}
	}

	@ObfuscatedName("RUROEYEG.d(I)Z")
	public final boolean method499() {
		if (field1212 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1212.length; var2++) {
			var1 &= RMLAXPMV.method467(field1212[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("RUROEYEG.a()V")
	public final void method500() {
		field1212 = null;
		field1213 = null;
		field1217 = "null";
		field1215 = null;
		field1232 = null;
		field1251 = null;
		field1227 = 1;
		field1240 = 1;
		field1228 = true;
		field1249 = true;
		field1222 = false;
		field1205 = false;
		field1230 = false;
		field1216 = false;
		field1238 = -1;
		field1239 = 16;
		field1242 = 0;
		field1226 = 0;
		field1235 = null;
		field1246 = -1;
		field1208 = -1;
		field1229 = false;
		field1223 = true;
		field1247 = 128;
		field1220 = 128;
		field1219 = 128;
		field1234 = 0;
		field1214 = 0;
		field1210 = 0;
		field1206 = 0;
		field1244 = false;
		field1218 = false;
		field1221 = -1;
		field1236 = -1;
		field1231 = -1;
		field1233 = null;
	}

	@ObfuscatedName("RUROEYEG.a(II)Z")
	public final boolean method501(int arg0) {
		if (field1213 != null) {
			for (int var4 = 0; var4 < field1213.length; var4++) {
				if (field1213[var4] == arg0) {
					return RMLAXPMV.method467(field1212[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1212 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1212.length; var3++) {
				var2 &= RMLAXPMV.method467(field1212[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("RUROEYEG.a(ZLVYNRIVYZ;)V")
	public final void method502(VYNRIVYZ arg0) {
		if (field1212 != null) {
			for (int var2 = 0; var2 < field1212.length; var2++) {
				arg0.method549(0, field1212[var2] & 0xFFFF);
			}
		}
	}
}
