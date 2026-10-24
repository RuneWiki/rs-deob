package deob;

@ObfuscatedName("RSPHUXRT")
public final class RSPHUXRT {

	@ObfuscatedName("RSPHUXRT.E")
	public int field1222 = -1;

	@ObfuscatedName("RSPHUXRT.r")
	public static NVDACYAH field1209 = new NVDACYAH(50);

	@ObfuscatedName("RSPHUXRT.O")
	public static NVDACYAH field1231 = new NVDACYAH(100);

	@ObfuscatedName("RSPHUXRT.Y")
	public static boolean field1239 = true;

	@ObfuscatedName("RSPHUXRT.v")
	public byte field1213;

	@ObfuscatedName("RSPHUXRT.y")
	public byte field1216;

	@ObfuscatedName("RSPHUXRT.a")
	public int field1192;

	@ObfuscatedName("RSPHUXRT.b")
	public int field1193;

	@ObfuscatedName("RSPHUXRT.d")
	public static int field1195;

	@ObfuscatedName("RSPHUXRT.e")
	public int field1196;

	@ObfuscatedName("RSPHUXRT.f")
	public int field1197;

	@ObfuscatedName("RSPHUXRT.g")
	public int field1198;

	@ObfuscatedName("RSPHUXRT.h")
	public int field1199;

	@ObfuscatedName("RSPHUXRT.i")
	public int field1200;

	@ObfuscatedName("RSPHUXRT.j")
	public int field1201;

	@ObfuscatedName("RSPHUXRT.k")
	public int field1202;

	@ObfuscatedName("RSPHUXRT.l")
	public int field1203;

	@ObfuscatedName("RSPHUXRT.m")
	public int field1204;

	@ObfuscatedName("RSPHUXRT.q")
	public int field1208;

	@ObfuscatedName("RSPHUXRT.s")
	public int field1210;

	@ObfuscatedName("RSPHUXRT.t")
	public int field1211;

	@ObfuscatedName("RSPHUXRT.w")
	public int field1214;

	@ObfuscatedName("RSPHUXRT.B")
	public int field1219;

	@ObfuscatedName("RSPHUXRT.D")
	public int field1221;

	@ObfuscatedName("RSPHUXRT.G")
	public int field1224;

	@ObfuscatedName("RSPHUXRT.H")
	public int field1225;

	@ObfuscatedName("RSPHUXRT.I")
	public int field1226;

	@ObfuscatedName("RSPHUXRT.K")
	public static int field1227;

	@ObfuscatedName("RSPHUXRT.N")
	public int field1230;

	@ObfuscatedName("RSPHUXRT.P")
	public int field1232;

	@ObfuscatedName("RSPHUXRT.Q")
	public int field1233;

	@ObfuscatedName("RSPHUXRT.R")
	public int field1234;

	@ObfuscatedName("RSPHUXRT.T")
	public int field1235;

	@ObfuscatedName("RSPHUXRT.V")
	public int field1237;

	@ObfuscatedName("RSPHUXRT.W")
	public int field1238;

	@ObfuscatedName("RSPHUXRT.n")
	public static MNKDCXXG field1205;

	@ObfuscatedName("RSPHUXRT.M")
	public String field1229;

	@ObfuscatedName("RSPHUXRT.z")
	public boolean field1217;

	@ObfuscatedName("RSPHUXRT.F")
	public boolean field1223;

	@ObfuscatedName("RSPHUXRT.A")
	public byte[] field1218;

	@ObfuscatedName("RSPHUXRT.c")
	public int[] field1194;

	@ObfuscatedName("RSPHUXRT.u")
	public int[] field1212;

	@ObfuscatedName("RSPHUXRT.C")
	public int[] field1220;

	@ObfuscatedName("RSPHUXRT.L")
	public int[] field1228;

	@ObfuscatedName("RSPHUXRT.U")
	public static int[] field1236;

	@ObfuscatedName("RSPHUXRT.p")
	public static RSPHUXRT[] field1207;

	@ObfuscatedName("RSPHUXRT.o")
	public String[] field1206;

	@ObfuscatedName("RSPHUXRT.x")
	public String[] field1215;

	@ObfuscatedName("RSPHUXRT.a(LNXFIIFAD;)V")
	public static final void method466(NXFIIFAD arg0) {
		field1205 = new MNKDCXXG(arg0.method431("obj.dat", null));
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("obj.idx", null));
		field1195 = var1.method388();
		field1236 = new int[field1195];
		int var2 = 2;
		for (int var3 = 0; var3 < field1195; var3++) {
			field1236[var3] = var2;
			var2 += var1.method388();
		}

		field1207 = new RSPHUXRT[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1207[var4] = new RSPHUXRT();
		}
	}

	@ObfuscatedName("RSPHUXRT.a(BI)Z")
	public final boolean method467(int arg0) {
		int var2 = field1202;
		int var3 = field1204;
		int var4 = field1214;
		if (arg0 == 1) {
			var2 = field1234;
			var3 = field1219;
			var4 = field1235;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!IRLTEWJP.method282(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !IRLTEWJP.method282(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !IRLTEWJP.method282(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("RSPHUXRT.a(IIIZ)LQEHNWGKD;")
	public static final QEHNWGKD method468(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			QEHNWGKD var3 = (QEHNWGKD) field1231.method427(arg2);
			if (var3 != null && var3.field1187 != arg1 && var3.field1187 != -1) {
				var3.method14();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		RSPHUXRT var4 = method475(arg2);
		if (var4.field1228 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1194[var6] && var4.field1194[var6] != 0) {
					var5 = var4.field1228[var6];
				}
			}

			if (var5 != -1) {
				var4 = method475(var5);
			}
		}

		IRLTEWJP var7 = var4.method469(1);
		if (var7 == null) {
			return null;
		}

		QEHNWGKD var8 = null;
		if (var4.field1201 != -1) {
			var8 = method468(-1, 10, var4.field1193);
			if (var8 == null) {
				return null;
			}
		}

		QEHNWGKD var9 = new QEHNWGKD(32, 32);
		int var10 = UNBQQGBL.field1264;
		int var11 = UNBQQGBL.field1265;
		int[] var12 = UNBQQGBL.field1270;
		int[] var13 = UJSJLLWF.field1248;
		int var14 = UJSJLLWF.field1249;
		int var15 = UJSJLLWF.field1250;
		int var16 = UJSJLLWF.field1253;
		int var17 = UJSJLLWF.field1254;
		int var18 = UJSJLLWF.field1251;
		int var19 = UJSJLLWF.field1252;
		UNBQQGBL.field1262 = false;
		UJSJLLWF.method479(var9.field1181, 32, 32);
		UJSJLLWF.method484(0, 0, 0, 32, 32);
		UNBQQGBL.method498();
		int var20 = var4.field1203;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = UNBQQGBL.field1268[var4.field1232] * var20 >> 16;
		int var22 = UNBQQGBL.field1269[var4.field1232] * var20 >> 16;
		var7.method302(0, var4.field1221, var4.field1199, var4.field1232, var4.field1238, var7.field702 / 2 + var21 + var4.field1211, var4.field1211 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1181[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1181[var24 * 32 + var23 - 1] > 1) {
						var9.field1181[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1181[(var24 - 1) * 32 + var23] > 1) {
						var9.field1181[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1181[var24 * 32 + var23 + 1] > 1) {
						var9.field1181[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1181[(var24 + 1) * 32 + var23] > 1) {
						var9.field1181[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1181[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1181[var26 * 32 + var25 - 1] == 1) {
							var9.field1181[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1181[(var26 - 1) * 32 + var25] == 1) {
							var9.field1181[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1181[var26 * 32 + var25 + 1] == 1) {
							var9.field1181[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1181[(var26 + 1) * 32 + var25] == 1) {
							var9.field1181[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1181[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1181[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1181[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1201 != -1) {
			int var29 = var8.field1186;
			int var30 = var8.field1187;
			var8.field1186 = 32;
			var8.field1187 = 32;
			var8.method458(0, 0);
			var8.field1186 = var29;
			var8.field1187 = var30;
		}

		if (arg0 == 0) {
			field1231.method428(arg2, var9);
		}

		UJSJLLWF.method479(var13, var14, var15);
		UJSJLLWF.method481(var16, var18, var17, var19);
		UNBQQGBL.field1264 = var10;
		UNBQQGBL.field1265 = var11;
		UNBQQGBL.field1270 = var12;
		UNBQQGBL.field1262 = true;

		if (var4.field1223) {
			var9.field1186 = 33;
		} else {
			var9.field1186 = 32;
		}

		var9.field1187 = arg1;
		return var9;
	}

	@ObfuscatedName("RSPHUXRT.a(I)LIRLTEWJP;")
	public final IRLTEWJP method469(int arg0) {
		if (field1228 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1194[var3] && field1194[var3] != 0) {
					var2 = field1228[var3];
				}
			}

			if (var2 != -1) {
				return method475(var2).method469(1);
			}
		}

		IRLTEWJP var4 = (IRLTEWJP) field1209.method427(field1222);
		if (var4 != null) {
			return var4;
		}

		IRLTEWJP var5 = IRLTEWJP.method281(field1192);
		if (var5 == null) {
			return null;
		}

		if (field1230 != 128 || field1224 != 128 || field1237 != 128) {
			var5.method297(field1237, field1224, field1230);
		}

		if (field1212 != null) {
			for (int var6 = 0; var6 < field1212.length; var6++) {
				var5.method295(field1212[var6], field1220[var6]);
			}
		}

		var5.method298(field1225 + 64, field1226 + 768, -50, -10, -50, true);
		var5.field911 = true;
		field1209.method428(field1222, var5);
		return var5;
	}

	@ObfuscatedName("RSPHUXRT.a(II)LIRLTEWJP;")
	public final IRLTEWJP method470(int arg0) {
		int var2 = field1202;
		int var3 = field1204;
		int var4 = field1214;
		if (arg0 == 1) {
			var2 = field1234;
			var3 = field1219;
			var4 = field1235;
		}

		if (var2 == -1) {
			return null;
		}

		IRLTEWJP var5 = IRLTEWJP.method281(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				IRLTEWJP var9 = IRLTEWJP.method281(var3);
				IRLTEWJP[] var10 = new IRLTEWJP[] { var5, var9 };
				var5 = new IRLTEWJP(2, var10);
			} else {
				IRLTEWJP var6 = IRLTEWJP.method281(var3);
				IRLTEWJP var7 = IRLTEWJP.method281(var4);
				IRLTEWJP[] var8 = new IRLTEWJP[] { var5, var6, var7 };
				var5 = new IRLTEWJP(3, var8);
			}
		}

		if (arg0 == 0 && field1213 != 0) {
			var5.method294(0, 0, field1213);
		}

		if (arg0 == 1 && field1216 != 0) {
			var5.method294(0, 0, field1216);
		}

		if (field1212 != null) {
			for (int var11 = 0; var11 < field1212.length; var11++) {
				var5.method295(field1212[var11], field1220[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("RSPHUXRT.b(II)LIRLTEWJP;")
	public final IRLTEWJP method471(int arg0) {
		int var2 = field1198;
		int var3 = field1196;
		if (arg0 == 1) {
			var2 = field1197;
			var3 = field1233;
		}

		if (var2 == -1) {
			return null;
		}

		IRLTEWJP var4 = IRLTEWJP.method281(var2);
		if (var3 != -1) {
			IRLTEWJP var5 = IRLTEWJP.method281(var3);
			IRLTEWJP[] var6 = new IRLTEWJP[] { var4, var5 };
			var4 = new IRLTEWJP(2, var6);
		}

		if (field1212 != null) {
			for (int var7 = 0; var7 < field1212.length; var7++) {
				var4.method295(field1212[var7], field1220[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("RSPHUXRT.c(II)Z")
	public final boolean method472(int arg0) {
		int var2 = field1198;
		int var3 = field1196;
		if (arg0 == 1) {
			var2 = field1197;
			var3 = field1233;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!IRLTEWJP.method282(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !IRLTEWJP.method282(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("RSPHUXRT.a()V")
	public final void method473() {
		field1192 = 0;
		field1229 = null;
		field1218 = null;
		field1212 = null;
		field1220 = null;
		field1203 = 2000;
		field1232 = 0;
		field1221 = 0;
		field1199 = 0;
		field1238 = 0;
		field1211 = 0;
		field1208 = -1;
		field1223 = false;
		field1200 = 1;
		field1217 = false;
		field1215 = null;
		field1206 = null;
		field1202 = -1;
		field1204 = -1;
		field1213 = 0;
		field1234 = -1;
		field1219 = -1;
		field1216 = 0;
		field1214 = -1;
		field1235 = -1;
		field1198 = -1;
		field1196 = -1;
		field1197 = -1;
		field1233 = -1;
		field1228 = null;
		field1194 = null;
		field1193 = -1;
		field1201 = -1;
		field1230 = 128;
		field1224 = 128;
		field1237 = 128;
		field1225 = 0;
		field1226 = 0;
		field1210 = 0;
	}

	@ObfuscatedName("RSPHUXRT.a(Z)V")
	public void method474() {
		RSPHUXRT var1 = method475(field1201);
		field1192 = var1.field1192;
		field1203 = var1.field1203;
		field1232 = var1.field1232;
		field1221 = var1.field1221;
		field1199 = var1.field1199;
		field1238 = var1.field1238;
		field1211 = var1.field1211;
		field1212 = var1.field1212;
		field1220 = var1.field1220;
		RSPHUXRT var2 = method475(field1193);
		field1229 = var2.field1229;
		field1217 = var2.field1217;
		field1200 = var2.field1200;
		String var3 = "a";
		char var4 = var2.field1229.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1218 = ("Swap this note at any bank for " + var3 + " " + var2.field1229 + ".").getBytes();
		field1223 = true;
	}

	@ObfuscatedName("RSPHUXRT.b(I)LRSPHUXRT;")
	public static final RSPHUXRT method475(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1207[var1].field1222 == arg0) {
				return field1207[var1];
			}
		}

		field1227 = (field1227 + 1) % 10;
		RSPHUXRT var2 = field1207[field1227];
		field1205.field1055 = field1236[arg0];
		var2.field1222 = arg0;
		var2.method473();
		var2.method476(field1205);

		if (var2.field1201 != -1) {
			var2.method474();
		}

		if (!field1239 && var2.field1217) {
			var2.field1229 = "Members Object";
			var2.field1218 = "Login to a members' server to use this object.".getBytes();
			var2.field1215 = null;
			var2.field1206 = null;
			var2.field1210 = 0;
		}

		return var2;
	}

	@ObfuscatedName("RSPHUXRT.a(LMNKDCXXG;I)V")
	public final void method476(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1192 = arg0.method388();
			} else if (var2 == 2) {
				field1229 = arg0.method393();
			} else if (var2 == 3) {
				field1218 = arg0.method394();
			} else if (var2 == 4) {
				field1203 = arg0.method388();
			} else if (var2 == 5) {
				field1232 = arg0.method388();
			} else if (var2 == 6) {
				field1221 = arg0.method388();
			} else if (var2 == 7) {
				field1238 = arg0.method388();
				if (field1238 > 32767) {
					field1238 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1211 = arg0.method388();
				if (field1211 > 32767) {
					field1211 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1208 = arg0.method388();
			} else if (var2 == 11) {
				field1223 = true;
			} else if (var2 == 12) {
				field1200 = arg0.method391();
			} else if (var2 == 16) {
				field1217 = true;
			} else if (var2 == 23) {
				field1202 = arg0.method388();
				field1213 = arg0.method387();
			} else if (var2 == 24) {
				field1204 = arg0.method388();
			} else if (var2 == 25) {
				field1234 = arg0.method388();
				field1216 = arg0.method387();
			} else if (var2 == 26) {
				field1219 = arg0.method388();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1215 == null) {
					field1215 = new String[5];
				}

				field1215[var2 - 30] = arg0.method393();
				if (field1215[var2 - 30].equalsIgnoreCase("hidden")) {
					field1215[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1206 == null) {
					field1206 = new String[5];
				}

				field1206[var2 - 35] = arg0.method393();
			} else if (var2 == 40) {
				int var3 = arg0.method386();
				field1212 = new int[var3];
				field1220 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1212[var4] = arg0.method388();
					field1220[var4] = arg0.method388();
				}
			} else if (var2 == 78) {
				field1214 = arg0.method388();
			} else if (var2 == 79) {
				field1235 = arg0.method388();
			} else if (var2 == 90) {
				field1198 = arg0.method388();
			} else if (var2 == 91) {
				field1197 = arg0.method388();
			} else if (var2 == 92) {
				field1196 = arg0.method388();
			} else if (var2 == 93) {
				field1233 = arg0.method388();
			} else if (var2 == 95) {
				field1199 = arg0.method388();
			} else if (var2 == 97) {
				field1193 = arg0.method388();
			} else if (var2 == 98) {
				field1201 = arg0.method388();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1228 == null) {
					field1228 = new int[10];
					field1194 = new int[10];
				}

				field1228[var2 - 100] = arg0.method388();
				field1194[var2 - 100] = arg0.method388();
			} else if (var2 == 110) {
				field1230 = arg0.method388();
			} else if (var2 == 111) {
				field1224 = arg0.method388();
			} else if (var2 == 112) {
				field1237 = arg0.method388();
			} else if (var2 == 113) {
				field1225 = arg0.method387();
			} else if (var2 == 114) {
				field1226 = arg0.method387() * 5;
			} else if (var2 == 115) {
				field1210 = arg0.method386();
			}
		}
	}

	@ObfuscatedName("RSPHUXRT.b(BI)LIRLTEWJP;")
	public final IRLTEWJP method477(int arg0) {
		if (field1228 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1194[var3] && field1194[var3] != 0) {
					var2 = field1228[var3];
				}
			}

			if (var2 != -1) {
				return method475(var2).method477(1);
			}
		}

		IRLTEWJP var4 = IRLTEWJP.method281(field1192);
		if (var4 == null) {
			return null;
		}

		if (field1212 != null) {
			for (int var5 = 0; var5 < field1212.length; var5++) {
				var4.method295(field1212[var5], field1220[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("RSPHUXRT.c(I)V")
	public static final void method478() {
		field1209 = null;
		field1231 = null;
		field1236 = null;
		field1207 = null;
		field1205 = null;
	}
}
