package deob;

@ObfuscatedName("URZZBDTU")
public final class URZZBDTU {

	@ObfuscatedName("URZZBDTU.R")
	public int field1198 = -1;

	@ObfuscatedName("URZZBDTU.bb")
	public String field1207 = "null";

	@ObfuscatedName("URZZBDTU.b")
	public static ACKKZISC field1161 = new ACKKZISC(40);

	@ObfuscatedName("URZZBDTU.h")
	public static WRJMHIDY[] field1166 = new WRJMHIDY[4];

	@ObfuscatedName("URZZBDTU.p")
	public static ACKKZISC field1173 = new ACKKZISC(500);

	@ObfuscatedName("URZZBDTU.o")
	public byte field1172;

	@ObfuscatedName("URZZBDTU.ab")
	public byte field1206;

	@ObfuscatedName("URZZBDTU.f")
	public int field1164;

	@ObfuscatedName("URZZBDTU.j")
	public int field1167;

	@ObfuscatedName("URZZBDTU.n")
	public static int field1171;

	@ObfuscatedName("URZZBDTU.q")
	public int field1174;

	@ObfuscatedName("URZZBDTU.r")
	public int field1175;

	@ObfuscatedName("URZZBDTU.v")
	public int field1178;

	@ObfuscatedName("URZZBDTU.x")
	public int field1179;

	@ObfuscatedName("URZZBDTU.A")
	public int field1182;

	@ObfuscatedName("URZZBDTU.B")
	public int field1183;

	@ObfuscatedName("URZZBDTU.C")
	public static int field1184;

	@ObfuscatedName("URZZBDTU.E")
	public int field1186;

	@ObfuscatedName("URZZBDTU.I")
	public int field1190;

	@ObfuscatedName("URZZBDTU.K")
	public int field1191;

	@ObfuscatedName("URZZBDTU.M")
	public int field1193;

	@ObfuscatedName("URZZBDTU.N")
	public int field1194;

	@ObfuscatedName("URZZBDTU.S")
	public int field1199;

	@ObfuscatedName("URZZBDTU.T")
	public int field1200;

	@ObfuscatedName("URZZBDTU.W")
	public int field1203;

	@ObfuscatedName("URZZBDTU.O")
	public static RSWRPCHR field1195;

	@ObfuscatedName("URZZBDTU.Q")
	public static client field1197;

	@ObfuscatedName("URZZBDTU.c")
	public boolean field1162;

	@ObfuscatedName("URZZBDTU.e")
	public boolean field1163;

	@ObfuscatedName("URZZBDTU.g")
	public boolean field1165;

	@ObfuscatedName("URZZBDTU.s")
	public boolean field1176;

	@ObfuscatedName("URZZBDTU.t")
	public boolean field1177;

	@ObfuscatedName("URZZBDTU.D")
	public boolean field1185;

	@ObfuscatedName("URZZBDTU.F")
	public boolean field1187;

	@ObfuscatedName("URZZBDTU.G")
	public boolean field1188;

	@ObfuscatedName("URZZBDTU.P")
	public boolean field1196;

	@ObfuscatedName("URZZBDTU.V")
	public boolean field1202;

	@ObfuscatedName("URZZBDTU.X")
	public static boolean field1204;

	@ObfuscatedName("URZZBDTU.z")
	public byte[] field1181;

	@ObfuscatedName("URZZBDTU.k")
	public int[] field1168;

	@ObfuscatedName("URZZBDTU.y")
	public int[] field1180;

	@ObfuscatedName("URZZBDTU.H")
	public int[] field1189;

	@ObfuscatedName("URZZBDTU.L")
	public int[] field1192;

	@ObfuscatedName("URZZBDTU.U")
	public static int[] field1201;

	@ObfuscatedName("URZZBDTU.Y")
	public int[] field1205;

	@ObfuscatedName("URZZBDTU.m")
	public static URZZBDTU[] field1170;

	@ObfuscatedName("URZZBDTU.l")
	public String[] field1169;

	@ObfuscatedName("URZZBDTU.a(II)Z")
	public final boolean method449(int arg0) {
		if (field1205 != null) {
			for (int var4 = 0; var4 < field1205.length; var4++) {
				if (field1205[var4] == arg0) {
					return WRJMHIDY.method467(field1192[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1192 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1192.length; var3++) {
				var2 &= WRJMHIDY.method467(field1192[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("URZZBDTU.a(I)LURZZBDTU;")
	public static final URZZBDTU method450(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1170[var1].field1198 == arg0) {
				return field1170[var1];
			}
		}

		field1184 = (field1184 + 1) % 20;
		URZZBDTU var2 = field1170[field1184];
		field1195.field1038 = field1201[arg0];
		var2.field1198 = arg0;
		var2.method458();
		var2.method456(field1195);
		return var2;
	}

	@ObfuscatedName("URZZBDTU.a(IIII)LWRJMHIDY;")
	public final WRJMHIDY method451(int arg0, int arg1, int arg2) {
		WRJMHIDY var4 = null;
		long var5;
		if (field1205 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1198 << 6) + arg0);
			WRJMHIDY var7 = (WRJMHIDY) field1161.method1(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1192 == null) {
				return null;
			}

			boolean var8 = field1196 ^ arg0 > 3;
			int var9 = field1192.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1192[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (WRJMHIDY) field1173.method1(var11);
				if (var4 == null) {
					var4 = WRJMHIDY.method466(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method481();
					}

					field1173.method2(var11, var4);
				}

				if (var9 > 1) {
					field1166[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new WRJMHIDY(field1166, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1205.length; var13++) {
				if (field1205[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1198 << 6) + (var12 << 3) + arg0);
			WRJMHIDY var14 = (WRJMHIDY) field1161.method1(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1192[var12];
			boolean var16 = field1196 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (WRJMHIDY) field1173.method1(var15);
			if (var4 == null) {
				var4 = WRJMHIDY.method466(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method481();
				}

				field1173.method2(var15, var4);
			}
		}

		boolean var17;
		if (field1164 == 128 && field1186 == 128 && field1190 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1193 == 0 && field1179 == 0 && field1199 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		WRJMHIDY var19 = new WRJMHIDY(var4, field1180 == null, arg0 == 0 && arg1 == -1 && !var17 && !var18, OZAHMTPS.method338(arg1));
		if (arg1 != -1) {
			var19.method473();
			var19.method474(arg1);
			var19.field1261 = null;
			var19.field1260 = null;
		}

		while (arg0-- > 0) {
			var19.method477();
		}

		if (field1180 != null) {
			for (int var20 = 0; var20 < field1180.length; var20++) {
				var19.method480(field1180[var20], field1189[var20]);
			}
		}

		if (var17) {
			var19.method482(field1190, field1164, field1186);
		}

		if (var18) {
			var19.method479(field1199, field1193, field1179);
		}

		var19.method483(field1206 + 64, field1172 * 5 + 768, -50, -10, -50, !field1185);

		if (field1182 == 1) {
			var19.field1257 = var19.field635;
		}

		field1161.method2(var5, var19);
		return var19;
	}

	@ObfuscatedName("URZZBDTU.a(LFXNTEMPE;)V")
	public static final void method452(FXNTEMPE arg0) {
		field1195 = new RSWRPCHR(arg0.method212("loc.dat", null));
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("loc.idx", null));
		field1171 = var1.method390();
		field1201 = new int[field1171];
		int var2 = 2;
		for (int var3 = 0; var3 < field1171; var3++) {
			field1201[var3] = var2;
			var2 += var1.method390();
		}

		field1170 = new URZZBDTU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1170[var4] = new URZZBDTU();
		}
	}

	@ObfuscatedName("URZZBDTU.b(I)Z")
	public final boolean method453() {
		if (field1192 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1192.length; var2++) {
			var1 &= WRJMHIDY.method467(field1192[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("URZZBDTU.a(LQJAHKUCY;Z)V")
	public final void method454(QJAHKUCY arg0) {
		if (field1192 != null) {
			for (int var2 = 0; var2 < field1192.length; var2++) {
				arg0.method373(field1192[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("URZZBDTU.c(I)LURZZBDTU;")
	public final URZZBDTU method455() {
		int var1 = -1;
		if (field1200 != -1) {
			JFFNRVFW var2 = JFFNRVFW.field779[field1200];
			int var3 = var2.field781;
			int var4 = var2.field782;
			int var5 = var2.field783;
			int var6 = client.field325[var5 - var4];
			var1 = field1197.field194[var3] >> var4 & var6;
		} else if (field1183 != -1) {
			var1 = field1197.field194[field1183];
		}

		if (var1 >= 0 && var1 < field1168.length && field1168[var1] != -1) {
			return method450(field1168[var1]);
		}

		return null;
	}

	@ObfuscatedName("URZZBDTU.a(LRSWRPCHR;B)V")
	public final void method456(RSWRPCHR arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method388();
					if (var3 == 0) {
						if (var2 == -1) {
							field1162 = false;
							if (field1192 != null && (field1205 == null || field1205[0] == 10)) {
								field1162 = true;
							}

							if (field1169 != null) {
								field1162 = true;
							}
						}

						if (field1176) {
							field1163 = false;
							field1202 = false;
						}

						if (field1182 == -1) {
							field1182 = field1163 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1207 = arg0.method395();
					} else if (var3 == 3) {
						field1181 = arg0.method396();
					} else if (var3 == 5) {
						int var6 = arg0.method388();
						if (var6 > 0) {
							if (field1192 == null || field1204) {
								field1205 = null;
								field1192 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1192[var7] = arg0.method390();
								}
							} else {
								arg0.field1038 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1203 = arg0.method388();
					} else if (var3 == 15) {
						field1174 = arg0.method388();
					} else if (var3 == 17) {
						field1163 = false;
					} else if (var3 == 18) {
						field1202 = false;
					} else if (var3 == 19) {
						var2 = arg0.method388();
						if (var2 == 1) {
							field1162 = true;
						}
					} else if (var3 == 21) {
						field1165 = true;
					} else if (var3 == 22) {
						field1185 = true;
					} else if (var3 == 23) {
						field1188 = true;
					} else if (var3 == 24) {
						field1194 = arg0.method390();
						if (field1194 == 0xFFFF) {
							field1194 = -1;
						}
					} else if (var3 == 28) {
						field1178 = arg0.method388();
					} else if (var3 == 29) {
						field1206 = arg0.method389();
					} else if (var3 == 39) {
						field1172 = arg0.method389();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1169 == null) {
							field1169 = new String[5];
						}

						field1169[var3 - 30] = arg0.method395();
						if (field1169[var3 - 30].equalsIgnoreCase("hidden")) {
							field1169[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method388();
						field1180 = new int[var8];
						field1189 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1180[var9] = arg0.method390();
							field1189[var9] = arg0.method390();
						}
					} else if (var3 == 60) {
						field1191 = arg0.method390();
					} else if (var3 == 62) {
						field1196 = true;
					} else if (var3 == 64) {
						field1177 = false;
					} else if (var3 == 65) {
						field1164 = arg0.method390();
					} else if (var3 == 66) {
						field1186 = arg0.method390();
					} else if (var3 == 67) {
						field1190 = arg0.method390();
					} else if (var3 == 68) {
						field1175 = arg0.method390();
					} else if (var3 == 69) {
						field1167 = arg0.method388();
					} else if (var3 == 70) {
						field1193 = arg0.method391();
					} else if (var3 == 71) {
						field1179 = arg0.method391();
					} else if (var3 == 72) {
						field1199 = arg0.method391();
					} else if (var3 == 73) {
						field1187 = true;
					} else if (var3 == 74) {
						field1176 = true;
					} else if (var3 == 75) {
						field1182 = arg0.method388();
					} else if (var3 == 77) {
						field1200 = arg0.method390();
						if (field1200 == 0xFFFF) {
							field1200 = -1;
						}

						field1183 = arg0.method390();
						if (field1183 == 0xFFFF) {
							field1183 = -1;
						}

						int var10 = arg0.method388();
						field1168 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1168[var11] = arg0.method390();
							if (field1168[var11] == 0xFFFF) {
								field1168[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method388();
			} while (var4 <= 0);

			if (field1192 == null || field1204) {
				field1205 = new int[var4];
				field1192 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1192[var5] = arg0.method390();
					field1205[var5] = arg0.method388();
				}
			} else {
				arg0.field1038 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("URZZBDTU.a(IIIIIII)LWRJMHIDY;")
	public final WRJMHIDY method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		WRJMHIDY var8 = method451(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1165 || field1185) {
			var8 = new WRJMHIDY(field1185, field1165, var8);
		}

		if (field1165) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1230; var10++) {
				int var11 = var8.field1231[var10];
				int var12 = var8.field1233[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1232[var10] += var15 - var9;
			}

			var8.method471();
		}

		return var8;
	}

	@ObfuscatedName("URZZBDTU.a()V")
	public final void method458() {
		field1192 = null;
		field1205 = null;
		field1207 = "null";
		field1181 = null;
		field1180 = null;
		field1189 = null;
		field1203 = 1;
		field1174 = 1;
		field1163 = true;
		field1202 = true;
		field1162 = false;
		field1165 = false;
		field1185 = false;
		field1188 = false;
		field1194 = -1;
		field1178 = 16;
		field1206 = 0;
		field1172 = 0;
		field1169 = null;
		field1191 = -1;
		field1175 = -1;
		field1196 = false;
		field1177 = true;
		field1164 = 128;
		field1186 = 128;
		field1190 = 128;
		field1167 = 0;
		field1193 = 0;
		field1179 = 0;
		field1199 = 0;
		field1187 = false;
		field1176 = false;
		field1182 = -1;
		field1200 = -1;
		field1183 = -1;
		field1168 = null;
	}

	@ObfuscatedName("URZZBDTU.d(I)V")
	public static final void method459() {
		field1173 = null;
		field1161 = null;
		field1201 = null;
		field1170 = null;
		field1195 = null;
	}
}
