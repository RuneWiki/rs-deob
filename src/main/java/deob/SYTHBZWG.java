package deob;

@ObfuscatedName("SYTHBZWG")
public final class SYTHBZWG {

	@ObfuscatedName("SYTHBZWG.o")
	public int field1186 = -1;

	@ObfuscatedName("SYTHBZWG.r")
	public static OOTLZHQB field1189 = new OOTLZHQB(30);

	@ObfuscatedName("SYTHBZWG.U")
	public static RTQSBWRH[] field1213 = new RTQSBWRH[4];

	@ObfuscatedName("SYTHBZWG.Y")
	public static OOTLZHQB field1217 = new OOTLZHQB(500);

	@ObfuscatedName("SYTHBZWG.s")
	public byte field1190;

	@ObfuscatedName("SYTHBZWG.t")
	public byte field1191;

	@ObfuscatedName("SYTHBZWG.c")
	public static int field1174;

	@ObfuscatedName("SYTHBZWG.h")
	public int field1179;

	@ObfuscatedName("SYTHBZWG.j")
	public int field1181;

	@ObfuscatedName("SYTHBZWG.p")
	public int field1187;

	@ObfuscatedName("SYTHBZWG.u")
	public int field1192;

	@ObfuscatedName("SYTHBZWG.D")
	public int field1200;

	@ObfuscatedName("SYTHBZWG.E")
	public int field1201;

	@ObfuscatedName("SYTHBZWG.F")
	public int field1202;

	@ObfuscatedName("SYTHBZWG.H")
	public int field1203;

	@ObfuscatedName("SYTHBZWG.L")
	public int field1205;

	@ObfuscatedName("SYTHBZWG.O")
	public int field1208;

	@ObfuscatedName("SYTHBZWG.Q")
	public int field1209;

	@ObfuscatedName("SYTHBZWG.R")
	public int field1210;

	@ObfuscatedName("SYTHBZWG.S")
	public int field1211;

	@ObfuscatedName("SYTHBZWG.T")
	public static int field1212;

	@ObfuscatedName("SYTHBZWG.V")
	public int field1214;

	@ObfuscatedName("SYTHBZWG.W")
	public int field1215;

	@ObfuscatedName("SYTHBZWG.ab")
	public int field1219;

	@ObfuscatedName("SYTHBZWG.l")
	public static JHKSAGUC field1183;

	@ObfuscatedName("SYTHBZWG.f")
	public static client field1177;

	@ObfuscatedName("SYTHBZWG.N")
	public String field1207;

	@ObfuscatedName("SYTHBZWG.b")
	public boolean field1173;

	@ObfuscatedName("SYTHBZWG.e")
	public boolean field1176;

	@ObfuscatedName("SYTHBZWG.g")
	public boolean field1178;

	@ObfuscatedName("SYTHBZWG.i")
	public boolean field1180;

	@ObfuscatedName("SYTHBZWG.n")
	public boolean field1185;

	@ObfuscatedName("SYTHBZWG.q")
	public boolean field1188;

	@ObfuscatedName("SYTHBZWG.x")
	public boolean field1194;

	@ObfuscatedName("SYTHBZWG.z")
	public static boolean field1196;

	@ObfuscatedName("SYTHBZWG.B")
	public boolean field1198;

	@ObfuscatedName("SYTHBZWG.M")
	public boolean field1206;

	@ObfuscatedName("SYTHBZWG.X")
	public boolean field1216;

	@ObfuscatedName("SYTHBZWG.J")
	public byte[] field1204;

	@ObfuscatedName("SYTHBZWG.d")
	public int[] field1175;

	@ObfuscatedName("SYTHBZWG.k")
	public int[] field1182;

	@ObfuscatedName("SYTHBZWG.m")
	public int[] field1184;

	@ObfuscatedName("SYTHBZWG.v")
	public int[] field1193;

	@ObfuscatedName("SYTHBZWG.C")
	public int[] field1199;

	@ObfuscatedName("SYTHBZWG.Z")
	public static int[] field1218;

	@ObfuscatedName("SYTHBZWG.A")
	public static SYTHBZWG[] field1197;

	@ObfuscatedName("SYTHBZWG.y")
	public String[] field1195;

	@ObfuscatedName("SYTHBZWG.a(I)V")
	public static final void method483() {
		field1217 = null;
		field1189 = null;
		field1218 = null;
		field1197 = null;
		field1183 = null;
	}

	@ObfuscatedName("SYTHBZWG.a(LHRXSNEYZ;)V")
	public static final void method484(HRXSNEYZ arg0) {
		field1183 = new JHKSAGUC(arg0.method289("loc.dat", null));
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("loc.idx", null));
		field1174 = var1.method308();
		field1218 = new int[field1174];
		int var2 = 2;
		for (int var3 = 0; var3 < field1174; var3++) {
			field1218[var3] = var2;
			var2 += var1.method308();
		}

		field1197 = new SYTHBZWG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1197[var4] = new SYTHBZWG();
		}
	}

	@ObfuscatedName("SYTHBZWG.a(II)Z")
	public final boolean method485(int arg0) {
		if (field1184 != null) {
			for (int var4 = 0; var4 < field1184.length; var4++) {
				if (field1184[var4] == arg0) {
					return RTQSBWRH.method455(field1193[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1193 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1193.length; var3++) {
				var2 &= RTQSBWRH.method455(field1193[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("SYTHBZWG.a(IIIIIII)LRTQSBWRH;")
	public final RTQSBWRH method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		RTQSBWRH var8 = method493(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1188 || field1185) {
			var8 = new RTQSBWRH(var8, field1185, field1188);
		}

		if (field1188) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1095; var10++) {
				int var11 = var8.field1096[var10];
				int var12 = var8.field1098[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1097[var10] += var15 - var9;
			}

			var8.method459();
		}

		return var8;
	}

	@ObfuscatedName("SYTHBZWG.a(LJHKSAGUC;I)V")
	public final void method487(JHKSAGUC arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method306();
					if (var3 == 0) {
						if (var2 == -1) {
							field1198 = false;
							if (field1193 != null && (field1184 == null || field1184[0] == 10)) {
								field1198 = true;
							}

							if (field1195 != null) {
								field1198 = true;
							}
						}

						if (field1206) {
							field1216 = false;
							field1173 = false;
						}

						if (field1211 == -1) {
							field1211 = field1216 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1207 = arg0.method313();
					} else if (var3 == 3) {
						field1204 = arg0.method314();
					} else if (var3 == 5) {
						int var6 = arg0.method306();
						if (var6 > 0) {
							if (field1193 == null || field1196) {
								field1184 = null;
								field1193 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1193[var7] = arg0.method308();
								}
							} else {
								arg0.field752 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1203 = arg0.method306();
					} else if (var3 == 15) {
						field1181 = arg0.method306();
					} else if (var3 == 17) {
						field1216 = false;
					} else if (var3 == 18) {
						field1173 = false;
					} else if (var3 == 19) {
						var2 = arg0.method306();
						if (var2 == 1) {
							field1198 = true;
						}
					} else if (var3 == 21) {
						field1188 = true;
					} else if (var3 == 22) {
						field1185 = true;
					} else if (var3 == 23) {
						field1180 = true;
					} else if (var3 == 24) {
						field1205 = arg0.method308();
						if (field1205 == 0xFFFF) {
							field1205 = -1;
						}
					} else if (var3 == 28) {
						field1201 = arg0.method306();
					} else if (var3 == 29) {
						field1191 = arg0.method307();
					} else if (var3 == 39) {
						field1190 = arg0.method307();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1195 == null) {
							field1195 = new String[5];
						}

						field1195[var3 - 30] = arg0.method313();
						if (field1195[var3 - 30].equalsIgnoreCase("hidden")) {
							field1195[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method306();
						field1199 = new int[var8];
						field1175 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1199[var9] = arg0.method308();
							field1175[var9] = arg0.method308();
						}
					} else if (var3 == 60) {
						field1187 = arg0.method308();
					} else if (var3 == 62) {
						field1194 = true;
					} else if (var3 == 64) {
						field1176 = false;
					} else if (var3 == 65) {
						field1179 = arg0.method308();
					} else if (var3 == 66) {
						field1210 = arg0.method308();
					} else if (var3 == 67) {
						field1209 = arg0.method308();
					} else if (var3 == 68) {
						field1202 = arg0.method308();
					} else if (var3 == 69) {
						field1208 = arg0.method306();
					} else if (var3 == 70) {
						field1214 = arg0.method309();
					} else if (var3 == 71) {
						field1192 = arg0.method309();
					} else if (var3 == 72) {
						field1219 = arg0.method309();
					} else if (var3 == 73) {
						field1178 = true;
					} else if (var3 == 74) {
						field1206 = true;
					} else if (var3 == 75) {
						field1211 = arg0.method306();
					} else if (var3 == 77) {
						field1215 = arg0.method308();
						if (field1215 == 0xFFFF) {
							field1215 = -1;
						}

						field1200 = arg0.method308();
						if (field1200 == 0xFFFF) {
							field1200 = -1;
						}

						int var10 = arg0.method306();
						field1182 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1182[var11] = arg0.method308();
							if (field1182[var11] == 0xFFFF) {
								field1182[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method306();
			} while (var4 <= 0);

			if (field1193 == null || field1196) {
				field1184 = new int[var4];
				field1193 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1193[var5] = arg0.method308();
					field1184[var5] = arg0.method306();
				}
			} else {
				arg0.field752 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SYTHBZWG.b(I)Z")
	public final boolean method488() {
		if (field1193 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1193.length; var2++) {
			var1 &= RTQSBWRH.method455(field1193[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("SYTHBZWG.a()V")
	public final void method489() {
		field1193 = null;
		field1184 = null;
		field1207 = null;
		field1204 = null;
		field1199 = null;
		field1175 = null;
		field1203 = 1;
		field1181 = 1;
		field1216 = true;
		field1173 = true;
		field1198 = false;
		field1188 = false;
		field1185 = false;
		field1180 = false;
		field1205 = -1;
		field1201 = 16;
		field1191 = 0;
		field1190 = 0;
		field1195 = null;
		field1187 = -1;
		field1202 = -1;
		field1194 = false;
		field1176 = true;
		field1179 = 128;
		field1210 = 128;
		field1209 = 128;
		field1208 = 0;
		field1214 = 0;
		field1192 = 0;
		field1219 = 0;
		field1178 = false;
		field1206 = false;
		field1211 = -1;
		field1215 = -1;
		field1200 = -1;
		field1182 = null;
	}

	@ObfuscatedName("SYTHBZWG.a(Z)LSYTHBZWG;")
	public final SYTHBZWG method490() {
		int var1 = -1;
		if (field1215 != -1) {
			AIRUOZLB var2 = AIRUOZLB.field4[field1215];
			int var3 = var2.field6;
			int var4 = var2.field7;
			int var5 = var2.field8;
			int var6 = client.field500[var5 - var4];
			var1 = field1177.field418[var3] >> var4 & var6;
		} else if (field1200 != -1) {
			var1 = field1177.field418[field1200];
		}

		if (var1 >= 0 && var1 < field1182.length && field1182[var1] != -1) {
			return method491(field1182[var1]);
		}

		return null;
	}

	@ObfuscatedName("SYTHBZWG.c(I)LSYTHBZWG;")
	public static final SYTHBZWG method491(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1197[var1].field1186 == arg0) {
				return field1197[var1];
			}
		}

		field1212 = (field1212 + 1) % 20;
		SYTHBZWG var2 = field1197[field1212];
		field1183.field752 = field1218[arg0];
		var2.field1186 = arg0;
		var2.method489();
		var2.method487(field1183);
		return var2;
	}

	@ObfuscatedName("SYTHBZWG.a(LVCPXACGS;B)V")
	public final void method492(VCPXACGS arg0) {
		if (field1193 != null) {
			for (int var2 = 0; var2 < field1193.length; var2++) {
				arg0.method565(field1193[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("SYTHBZWG.a(IIII)LRTQSBWRH;")
	public final RTQSBWRH method493(int arg0, int arg1, int arg2) {
		RTQSBWRH var4 = null;
		long var5;
		if (field1184 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1186 << 6) + arg0);
			RTQSBWRH var7 = (RTQSBWRH) field1189.method386(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1193 == null) {
				return null;
			}

			boolean var8 = field1194 ^ arg0 > 3;
			int var9 = field1193.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1193[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (RTQSBWRH) field1217.method386(var11);
				if (var4 == null) {
					var4 = RTQSBWRH.method454(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method469();
					}

					field1217.method387(var11, var4);
				}

				if (var9 > 1) {
					field1213[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new RTQSBWRH(var9, field1213);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1184.length; var13++) {
				if (field1184[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1186 << 6) + (var12 << 3) + arg0);
			RTQSBWRH var14 = (RTQSBWRH) field1189.method386(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1193[var12];
			boolean var16 = field1194 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (RTQSBWRH) field1217.method386(var15);
			if (var4 == null) {
				var4 = RTQSBWRH.method454(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method469();
				}

				field1217.method387(var15, var4);
			}
		}

		boolean var17;
		if (field1179 == 128 && field1210 == 128 && field1209 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1214 == 0 && field1192 == 0 && field1219 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		RTQSBWRH var19 = new RTQSBWRH(field1199 == null, EMBMBPSC.method229(arg1), var4, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method461();
			var19.method462(arg1);
			var19.field1127 = null;
			var19.field1126 = null;
		}

		while (arg0-- > 0) {
			var19.method465();
		}

		if (field1199 != null) {
			for (int var20 = 0; var20 < field1199.length; var20++) {
				var19.method468(field1199[var20], field1175[var20]);
			}
		}

		if (var17) {
			var19.method470(field1210, field1179, field1209);
		}

		if (var18) {
			var19.method467(field1192, field1214, field1219);
		}

		var19.method471(field1191 + 64, field1190 * 5 + 768, -50, -10, -50, !field1185);

		if (field1211 == 1) {
			var19.field1123 = var19.field602;
		}

		field1189.method387(var5, var19);
		return var19;
	}
}
