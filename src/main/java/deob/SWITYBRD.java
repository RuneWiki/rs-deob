package deob;

@ObfuscatedName("SWITYBRD")
public final class SWITYBRD {

	@ObfuscatedName("SWITYBRD.I")
	public int field1233 = -1;

	@ObfuscatedName("SWITYBRD.g")
	public static ISXEOURU field1206 = new ISXEOURU(100);

	@ObfuscatedName("SWITYBRD.p")
	public static boolean field1214 = true;

	@ObfuscatedName("SWITYBRD.L")
	public static ISXEOURU field1235 = new ISXEOURU(50);

	@ObfuscatedName("SWITYBRD.G")
	public byte field1231;

	@ObfuscatedName("SWITYBRD.Y")
	public byte field1246;

	@ObfuscatedName("SWITYBRD.b")
	public static int field1201;

	@ObfuscatedName("SWITYBRD.c")
	public int field1202;

	@ObfuscatedName("SWITYBRD.d")
	public int field1203;

	@ObfuscatedName("SWITYBRD.f")
	public int field1205;

	@ObfuscatedName("SWITYBRD.j")
	public int field1209;

	@ObfuscatedName("SWITYBRD.m")
	public int field1211;

	@ObfuscatedName("SWITYBRD.n")
	public int field1212;

	@ObfuscatedName("SWITYBRD.o")
	public int field1213;

	@ObfuscatedName("SWITYBRD.q")
	public int field1215;

	@ObfuscatedName("SWITYBRD.s")
	public static int field1217;

	@ObfuscatedName("SWITYBRD.u")
	public int field1219;

	@ObfuscatedName("SWITYBRD.w")
	public int field1221;

	@ObfuscatedName("SWITYBRD.A")
	public int field1225;

	@ObfuscatedName("SWITYBRD.B")
	public int field1226;

	@ObfuscatedName("SWITYBRD.C")
	public int field1227;

	@ObfuscatedName("SWITYBRD.D")
	public int field1228;

	@ObfuscatedName("SWITYBRD.E")
	public int field1229;

	@ObfuscatedName("SWITYBRD.F")
	public int field1230;

	@ObfuscatedName("SWITYBRD.H")
	public int field1232;

	@ObfuscatedName("SWITYBRD.M")
	public int field1236;

	@ObfuscatedName("SWITYBRD.N")
	public int field1237;

	@ObfuscatedName("SWITYBRD.P")
	public int field1238;

	@ObfuscatedName("SWITYBRD.S")
	public int field1240;

	@ObfuscatedName("SWITYBRD.T")
	public int field1241;

	@ObfuscatedName("SWITYBRD.U")
	public int field1242;

	@ObfuscatedName("SWITYBRD.V")
	public int field1243;

	@ObfuscatedName("SWITYBRD.W")
	public int field1244;

	@ObfuscatedName("SWITYBRD.X")
	public int field1245;

	@ObfuscatedName("SWITYBRD.Z")
	public int field1247;

	@ObfuscatedName("SWITYBRD.r")
	public static ZOMNSJJM field1216;

	@ObfuscatedName("SWITYBRD.h")
	public String field1207;

	@ObfuscatedName("SWITYBRD.i")
	public boolean field1208;

	@ObfuscatedName("SWITYBRD.Q")
	public boolean field1239;

	@ObfuscatedName("SWITYBRD.v")
	public byte[] field1220;

	@ObfuscatedName("SWITYBRD.a")
	public int[] field1200;

	@ObfuscatedName("SWITYBRD.e")
	public int[] field1204;

	@ObfuscatedName("SWITYBRD.k")
	public static int[] field1210;

	@ObfuscatedName("SWITYBRD.x")
	public int[] field1222;

	@ObfuscatedName("SWITYBRD.y")
	public int[] field1223;

	@ObfuscatedName("SWITYBRD.z")
	public static SWITYBRD[] field1224;

	@ObfuscatedName("SWITYBRD.t")
	public String[] field1218;

	@ObfuscatedName("SWITYBRD.J")
	public String[] field1234;

	@ObfuscatedName("SWITYBRD.a(LZOMNSJJM;B)V")
	public final void method410(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1213 = arg0.method549();
			} else if (var2 == 2) {
				field1207 = arg0.method554();
			} else if (var2 == 3) {
				field1220 = arg0.method555();
			} else if (var2 == 4) {
				field1237 = arg0.method549();
			} else if (var2 == 5) {
				field1219 = arg0.method549();
			} else if (var2 == 6) {
				field1205 = arg0.method549();
			} else if (var2 == 7) {
				field1245 = arg0.method549();
				if (field1245 > 32767) {
					field1245 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1232 = arg0.method549();
				if (field1232 > 32767) {
					field1232 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1243 = arg0.method549();
			} else if (var2 == 11) {
				field1239 = true;
			} else if (var2 == 12) {
				field1244 = arg0.method552();
			} else if (var2 == 16) {
				field1208 = true;
			} else if (var2 == 23) {
				field1227 = arg0.method549();
				field1246 = arg0.method548();
			} else if (var2 == 24) {
				field1230 = arg0.method549();
			} else if (var2 == 25) {
				field1215 = arg0.method549();
				field1231 = arg0.method548();
			} else if (var2 == 26) {
				field1212 = arg0.method549();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1218 == null) {
					field1218 = new String[5];
				}

				field1218[var2 - 30] = arg0.method554();
				if (field1218[var2 - 30].equalsIgnoreCase("hidden")) {
					field1218[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1234 == null) {
					field1234 = new String[5];
				}

				field1234[var2 - 35] = arg0.method554();
			} else if (var2 == 40) {
				int var3 = arg0.method547();
				field1200 = new int[var3];
				field1223 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1200[var4] = arg0.method549();
					field1223[var4] = arg0.method549();
				}
			} else if (var2 == 78) {
				field1209 = arg0.method549();
			} else if (var2 == 79) {
				field1240 = arg0.method549();
			} else if (var2 == 90) {
				field1242 = arg0.method549();
			} else if (var2 == 91) {
				field1229 = arg0.method549();
			} else if (var2 == 92) {
				field1225 = arg0.method549();
			} else if (var2 == 93) {
				field1226 = arg0.method549();
			} else if (var2 == 95) {
				field1203 = arg0.method549();
			} else if (var2 == 97) {
				field1228 = arg0.method549();
			} else if (var2 == 98) {
				field1211 = arg0.method549();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1222 == null) {
					field1222 = new int[10];
					field1204 = new int[10];
				}

				field1222[var2 - 100] = arg0.method549();
				field1204[var2 - 100] = arg0.method549();
			} else if (var2 == 110) {
				field1236 = arg0.method549();
			} else if (var2 == 111) {
				field1241 = arg0.method549();
			} else if (var2 == 112) {
				field1202 = arg0.method549();
			} else if (var2 == 113) {
				field1221 = arg0.method548();
			} else if (var2 == 114) {
				field1238 = arg0.method548() * 5;
			} else if (var2 == 115) {
				field1247 = arg0.method547();
			}
		}
	}

	@ObfuscatedName("SWITYBRD.a(II)Z")
	public final boolean method411(int arg0) {
		int var2 = field1242;
		int var3 = field1225;
		if (arg0 == 1) {
			var2 = field1229;
			var3 = field1226;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!CCYECDYX.method12(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !CCYECDYX.method12(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("SWITYBRD.a(BIII)LLXRBRCRX;")
	public static final LXRBRCRX method412(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			LXRBRCRX var3 = (LXRBRCRX) field1206.method228(arg2);
			if (var3 != null && var3.field895 != arg0 && var3.field895 != -1) {
				var3.method591();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		SWITYBRD var4 = method416(arg2);
		if (var4.field1222 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1204[var6] && var4.field1204[var6] != 0) {
					var5 = var4.field1222[var6];
				}
			}

			if (var5 != -1) {
				var4 = method416(var5);
			}
		}

		CCYECDYX var7 = var4.method418(1);
		if (var7 == null) {
			return null;
		}

		LXRBRCRX var8 = null;
		if (var4.field1211 != -1) {
			var8 = method412(10, -1, var4.field1228);
			if (var8 == null) {
				return null;
			}
		}

		LXRBRCRX var9 = new LXRBRCRX(32, 32);
		int var10 = CPGFUBUO.field552;
		int var11 = CPGFUBUO.field553;
		int[] var12 = CPGFUBUO.field558;
		int[] var13 = LRYUPGSZ.field879;
		int var14 = LRYUPGSZ.field880;
		int var15 = LRYUPGSZ.field881;
		int var16 = LRYUPGSZ.field884;
		int var17 = LRYUPGSZ.field885;
		int var18 = LRYUPGSZ.field882;
		int var19 = LRYUPGSZ.field883;
		CPGFUBUO.field550 = false;
		LRYUPGSZ.method264(32, var9.field889, 32);
		LRYUPGSZ.method269(0, 32, 32, 0, 0);
		CPGFUBUO.method184();
		int var20 = var4.field1237;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = CPGFUBUO.field556[var4.field1219] * var20 >> 16;
		int var22 = CPGFUBUO.field557[var4.field1219] * var20 >> 16;
		var7.method31(0, var4.field1205, var4.field1203, var4.field1219, var4.field1245, var7.field1289 / 2 + var21 + var4.field1232, var4.field1232 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field889[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field889[var24 * 32 + var23 - 1] > 1) {
						var9.field889[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field889[(var24 - 1) * 32 + var23] > 1) {
						var9.field889[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field889[var24 * 32 + var23 + 1] > 1) {
						var9.field889[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field889[(var24 + 1) * 32 + var23] > 1) {
						var9.field889[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field889[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field889[var26 * 32 + var25 - 1] == 1) {
							var9.field889[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field889[(var26 - 1) * 32 + var25] == 1) {
							var9.field889[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field889[var26 * 32 + var25 + 1] == 1) {
							var9.field889[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field889[(var26 + 1) * 32 + var25] == 1) {
							var9.field889[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field889[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field889[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field889[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1211 != -1) {
			int var29 = var8.field894;
			int var30 = var8.field895;
			var8.field894 = 32;
			var8.field895 = 32;
			var8.method281(0, 0);
			var8.field894 = var29;
			var8.field895 = var30;
		}

		if (arg1 == 0) {
			field1206.method229(arg2, var9);
		}

		LRYUPGSZ.method264(var14, var13, var15);
		LRYUPGSZ.method266(var18, var16, var17, var19);
		CPGFUBUO.field552 = var10;
		CPGFUBUO.field553 = var11;
		CPGFUBUO.field558 = var12;
		CPGFUBUO.field550 = true;

		if (var4.field1239) {
			var9.field894 = 33;
		} else {
			var9.field894 = 32;
		}

		var9.field895 = arg0;
		return var9;
	}

	@ObfuscatedName("SWITYBRD.a(B)V")
	public void method413() {
		SWITYBRD var1 = method416(field1211);
		field1213 = var1.field1213;
		field1237 = var1.field1237;
		field1219 = var1.field1219;
		field1205 = var1.field1205;
		field1203 = var1.field1203;
		field1245 = var1.field1245;
		field1232 = var1.field1232;
		field1200 = var1.field1200;
		field1223 = var1.field1223;
		SWITYBRD var2 = method416(field1228);
		field1207 = var2.field1207;
		field1208 = var2.field1208;
		field1244 = var2.field1244;
		String var3 = "a";
		char var4 = var2.field1207.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1220 = ("Swap this note at any bank for " + var3 + " " + var2.field1207 + ".").getBytes();
		field1239 = true;
	}

	@ObfuscatedName("SWITYBRD.a(IB)Z")
	public final boolean method414(int arg0) {
		int var2 = field1227;
		int var3 = field1230;
		int var4 = field1209;
		if (arg0 == 1) {
			var2 = field1215;
			var3 = field1212;
			var4 = field1240;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!CCYECDYX.method12(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !CCYECDYX.method12(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !CCYECDYX.method12(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("SWITYBRD.b(II)LCCYECDYX;")
	public final CCYECDYX method415(int arg0) {
		int var2 = field1242;
		int var3 = field1225;
		if (arg0 == 1) {
			var2 = field1229;
			var3 = field1226;
		}

		if (var2 == -1) {
			return null;
		}

		CCYECDYX var4 = CCYECDYX.method11(var2);
		if (var3 != -1) {
			CCYECDYX var5 = CCYECDYX.method11(var3);
			CCYECDYX[] var6 = new CCYECDYX[] { var4, var5 };
			var4 = new CCYECDYX(var6, 2);
		}

		if (field1200 != null) {
			for (int var7 = 0; var7 < field1200.length; var7++) {
				var4.method25(field1200[var7], field1223[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("SWITYBRD.a(I)LSWITYBRD;")
	public static final SWITYBRD method416(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1224[var1].field1233 == arg0) {
				return field1224[var1];
			}
		}

		field1217 = (field1217 + 1) % 10;
		SWITYBRD var2 = field1224[field1217];
		field1216.field1457 = field1210[arg0];
		var2.field1233 = arg0;
		var2.method420();
		var2.method410(field1216);

		if (var2.field1211 != -1) {
			var2.method413();
		}

		if (!field1214 && var2.field1208) {
			var2.field1207 = "Members Object";
			var2.field1220 = "Login to a members' server to use this object.".getBytes();
			var2.field1218 = null;
			var2.field1234 = null;
			var2.field1247 = 0;
		}

		return var2;
	}

	@ObfuscatedName("SWITYBRD.c(II)LCCYECDYX;")
	public final CCYECDYX method417(int arg0) {
		int var2 = field1227;
		int var3 = field1230;
		int var4 = field1209;
		if (arg0 == 1) {
			var2 = field1215;
			var3 = field1212;
			var4 = field1240;
		}

		if (var2 == -1) {
			return null;
		}

		CCYECDYX var5 = CCYECDYX.method11(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				CCYECDYX var9 = CCYECDYX.method11(var3);
				CCYECDYX[] var10 = new CCYECDYX[] { var5, var9 };
				var5 = new CCYECDYX(var10, 2);
			} else {
				CCYECDYX var6 = CCYECDYX.method11(var3);
				CCYECDYX var7 = CCYECDYX.method11(var4);
				CCYECDYX[] var8 = new CCYECDYX[] { var5, var6, var7 };
				var5 = new CCYECDYX(var8, 3);
			}
		}

		if (arg0 == 0 && field1246 != 0) {
			var5.method24(0, 0, field1246);
		}

		if (arg0 == 1 && field1231 != 0) {
			var5.method24(0, 0, field1231);
		}

		if (field1200 != null) {
			for (int var11 = 0; var11 < field1200.length; var11++) {
				var5.method25(field1200[var11], field1223[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("SWITYBRD.b(I)LCCYECDYX;")
	public final CCYECDYX method418(int arg0) {
		if (field1222 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1204[var3] && field1204[var3] != 0) {
					var2 = field1222[var3];
				}
			}

			if (var2 != -1) {
				return method416(var2).method418(1);
			}
		}

		CCYECDYX var4 = (CCYECDYX) field1235.method228(field1233);
		if (var4 != null) {
			return var4;
		}

		CCYECDYX var5 = CCYECDYX.method11(field1213);
		if (var5 == null) {
			return null;
		}

		if (field1236 != 128 || field1241 != 128 || field1202 != 128) {
			var5.method27(field1236, field1241, field1202);
		}

		if (field1200 != null) {
			for (int var6 = 0; var6 < field1200.length; var6++) {
				var5.method25(field1200[var6], field1223[var6]);
			}
		}

		var5.method28(field1221 + 64, field1238 + 768, -50, -10, -50, true);
		var5.field60 = true;
		field1235.method229(field1233, var5);
		return var5;
	}

	@ObfuscatedName("SWITYBRD.d(II)LCCYECDYX;")
	public final CCYECDYX method419(int arg0) {
		if (field1222 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1204[var3] && field1204[var3] != 0) {
					var2 = field1222[var3];
				}
			}

			if (var2 != -1) {
				return method416(var2).method419(1);
			}
		}

		CCYECDYX var4 = CCYECDYX.method11(field1213);
		if (var4 == null) {
			return null;
		}

		if (field1200 != null) {
			for (int var5 = 0; var5 < field1200.length; var5++) {
				var4.method25(field1200[var5], field1223[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("SWITYBRD.a()V")
	public final void method420() {
		field1213 = 0;
		field1207 = null;
		field1220 = null;
		field1200 = null;
		field1223 = null;
		field1237 = 2000;
		field1219 = 0;
		field1205 = 0;
		field1203 = 0;
		field1245 = 0;
		field1232 = 0;
		field1243 = -1;
		field1239 = false;
		field1244 = 1;
		field1208 = false;
		field1218 = null;
		field1234 = null;
		field1227 = -1;
		field1230 = -1;
		field1246 = 0;
		field1215 = -1;
		field1212 = -1;
		field1231 = 0;
		field1209 = -1;
		field1240 = -1;
		field1242 = -1;
		field1225 = -1;
		field1229 = -1;
		field1226 = -1;
		field1222 = null;
		field1204 = null;
		field1228 = -1;
		field1211 = -1;
		field1236 = 128;
		field1241 = 128;
		field1202 = 128;
		field1221 = 0;
		field1238 = 0;
		field1247 = 0;
	}

	@ObfuscatedName("SWITYBRD.a(LLYZBHNJP;)V")
	public static final void method421(LYZBHNJP arg0) {
		field1216 = new ZOMNSJJM(arg0.method290("obj.dat", null));
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("obj.idx", null));
		field1201 = var1.method549();
		field1210 = new int[field1201];
		int var2 = 2;
		for (int var3 = 0; var3 < field1201; var3++) {
			field1210[var3] = var2;
			var2 += var1.method549();
		}

		field1224 = new SWITYBRD[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1224[var4] = new SWITYBRD();
		}
	}

	@ObfuscatedName("SWITYBRD.b(B)V")
	public static final void method422() {
		field1235 = null;
		field1206 = null;
		field1210 = null;
		field1224 = null;
		field1216 = null;
	}
}
