package deob;

@ObfuscatedName("MDBQGDOL")
public final class MDBQGDOL extends SDXDPBJK {

	@ObfuscatedName("MDBQGDOL.vb")
	public boolean field899 = false;

	@ObfuscatedName("MDBQGDOL.xb")
	public boolean field901 = false;

	@ObfuscatedName("MDBQGDOL.Eb")
	public long field908 = -1L;

	@ObfuscatedName("MDBQGDOL.Pb")
	public int field917 = -1;

	@ObfuscatedName("MDBQGDOL.Qb")
	public int field918 = -1;

	@ObfuscatedName("MDBQGDOL.Sb")
	public int[] field919 = new int[5];

	@ObfuscatedName("MDBQGDOL.Ub")
	public int[] field921 = new int[12];

	@ObfuscatedName("MDBQGDOL.Ib")
	public static HARAZQMH field911 = new HARAZQMH(260);

	@ObfuscatedName("MDBQGDOL.qb")
	public int field896;

	@ObfuscatedName("MDBQGDOL.rb")
	public int field897;

	@ObfuscatedName("MDBQGDOL.yb")
	public int field902;

	@ObfuscatedName("MDBQGDOL.zb")
	public int field903;

	@ObfuscatedName("MDBQGDOL.Ab")
	public int field904;

	@ObfuscatedName("MDBQGDOL.Bb")
	public int field905;

	@ObfuscatedName("MDBQGDOL.Cb")
	public int field906;

	@ObfuscatedName("MDBQGDOL.Db")
	public int field907;

	@ObfuscatedName("MDBQGDOL.Gb")
	public int field909;

	@ObfuscatedName("MDBQGDOL.Hb")
	public int field910;

	@ObfuscatedName("MDBQGDOL.Jb")
	public int field912;

	@ObfuscatedName("MDBQGDOL.Kb")
	public int field913;

	@ObfuscatedName("MDBQGDOL.Lb")
	public int field914;

	@ObfuscatedName("MDBQGDOL.Mb")
	public int field915;

	@ObfuscatedName("MDBQGDOL.wb")
	public long field900;

	@ObfuscatedName("MDBQGDOL.Nb")
	public GCSAWSJV field916;

	@ObfuscatedName("MDBQGDOL.tb")
	public TQRZOVPP field898;

	@ObfuscatedName("MDBQGDOL.Tb")
	public String field920;

	@ObfuscatedName("MDBQGDOL.b(I)LGCSAWSJV;")
	public final GCSAWSJV method356() {
		if (!field901) {
			return null;
		}

		if (field898 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field921[var2];
				if (var3 >= 256 && var3 < 512 && !CFPLMOQH.field91[var3 - 256].method33()) {
					var1 = true;
				}

				if (var3 >= 512 && !KIHBVNFV.method346(var3 - 512).method347(field902)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			GCSAWSJV[] var4 = new GCSAWSJV[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field921[var6];
				if (var7 >= 256 && var7 < 512) {
					GCSAWSJV var8 = CFPLMOQH.field91[var7 - 256].method34();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					GCSAWSJV var9 = KIHBVNFV.method346(var7 - 512).method353(field902);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			GCSAWSJV var10 = new GCSAWSJV(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field919[var11] != 0) {
					var10.method274(client.field169[var11][0], client.field169[var11][field919[var11]]);

					if (var11 == 1) {
						var10.method274(client.field486[0], client.field486[field919[var11]]);
					}
				}
			}

			return var10;
		}

		return field898.method518();
	}

	@ObfuscatedName("MDBQGDOL.b(B)LGCSAWSJV;")
	public final GCSAWSJV method357() {
		if (field898 != null) {
			int var1 = -1;
			if (field1105 >= 0 && field1108 == 0) {
				var1 = XRDQTWLL.field1418[field1105].field1420[field1106];
			} else if (field1102 >= 0) {
				var1 = XRDQTWLL.field1418[field1102].field1420[field1103];
			}

			return field898.method520(-1, null, var1);
		}

		long var3 = field900;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1105 >= 0 && field1108 == 0) {
			XRDQTWLL var9 = XRDQTWLL.field1418[field1105];
			var5 = var9.field1420[field1106];

			if (field1102 >= 0 && field1102 != field1091) {
				var6 = XRDQTWLL.field1418[field1102].field1420[field1103];
			}

			if (var9.field1427 >= 0) {
				var7 = var9.field1427;
				var3 += var7 - field921[5] << 40;
			}

			if (var9.field1428 >= 0) {
				var8 = var9.field1428;
				var3 += var8 - field921[3] << 48;
			}
		} else if (field1102 >= 0) {
			var5 = XRDQTWLL.field1418[field1102].field1420[field1103];
		}

		GCSAWSJV var10 = (GCSAWSJV) field911.method299(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field921[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !CFPLMOQH.field91[var13 - 256].method31()) {
					var11 = true;
				}

				if (var13 >= 512 && !KIHBVNFV.method346(var13 - 512).method345(field902)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field908 != -1L) {
					var10 = (GCSAWSJV) field911.method299(field908);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			GCSAWSJV[] var14 = new GCSAWSJV[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field921[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					GCSAWSJV var18 = CFPLMOQH.field91[var17 - 256].method32();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					GCSAWSJV var19 = KIHBVNFV.method346(var17 - 512).method343(field902);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new GCSAWSJV(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field919[var20] != 0) {
					var10.method274(client.field169[var20][0], client.field169[var20][field919[var20]]);

					if (var20 == 1) {
						var10.method274(client.field486[0], client.field486[field919[var20]]);
					}
				}
			}

			var10.method267();
			var10.method277(64, 850, -30, -50, -30, true);
			field911.method300(var3, var10);
			field908 = var3;
		}

		if (field899) {
			return var10;
		}

		GCSAWSJV var21 = GCSAWSJV.field588;
		var21.method262(RLONYBCF.method436(var5) & RLONYBCF.method436(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method269(var5, XRDQTWLL.field1418[field1105].field1424, var6);
		} else if (var5 != -1) {
			var21.method268(var5);
		}

		var21.method264();
		var21.field624 = null;
		var21.field623 = null;
		return var21;
	}

	@ObfuscatedName("MDBQGDOL.a(ILCMGGUSPR;)V")
	public final void method358(CMGGUSPR arg0) {
		arg0.field540 = 0;
		field902 = arg0.method194();
		field917 = arg0.method195();
		field918 = arg0.method195();
		field898 = null;
		field907 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method194();
			if (var3 == 0) {
				field921[var2] = 0;
			} else {
				int var4 = arg0.method194();
				field921[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field921[0] == 0xFFFF) {
					field898 = TQRZOVPP.method517(arg0.method196());
					break;
				}

				if (field921[var2] >= 512 && field921[var2] - 512 < KIHBVNFV.field856) {
					int var5 = KIHBVNFV.method346(field921[var2] - 512).field863;
					if (var5 != 0) {
						field907 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method194();
			if (var7 < 0 || var7 >= client.field169[var6].length) {
				var7 = 0;
			}

			field919[var6] = var7;
		}

		field1091 = arg0.method196();
		if (field1091 == 0xFFFF) {
			field1091 = -1;
		}

		field1092 = arg0.method196();
		if (field1092 == 0xFFFF) {
			field1092 = -1;
		}

		field1073 = arg0.method196();
		if (field1073 == 0xFFFF) {
			field1073 = -1;
		}

		field1074 = arg0.method196();
		if (field1074 == 0xFFFF) {
			field1074 = -1;
		}

		field1075 = arg0.method196();
		if (field1075 == 0xFFFF) {
			field1075 = -1;
		}

		field1076 = arg0.method196();
		if (field1076 == 0xFFFF) {
			field1076 = -1;
		}

		field1125 = arg0.method196();
		if (field1125 == 0xFFFF) {
			field1125 = -1;
		}

		field920 = ZLGGMMMS.method601(ZLGGMMMS.method598(arg0.method200()));
		field912 = arg0.method194();
		field909 = arg0.method196();
		field901 = true;
		field900 = 0L;
		int var8 = field921[5];
		int var9 = field921[9];
		field921[5] = var9;
		field921[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field900 <<= 4;
			if (field921[var10] >= 256) {
				field900 += field921[var10] - 256;
			}
		}

		if (field921[0] >= 256) {
			field900 += field921[0] - 256 >> 4;
		}

		if (field921[1] >= 256) {
			field900 += field921[1] - 256 >> 8;
		}

		field921[5] = var8;
		field921[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field900 <<= 3;
			field900 += field919[var11];
		}

		field900 <<= 1;
		field900 += field902;
	}

	@ObfuscatedName("MDBQGDOL.a(B)Z")
	public final boolean method302() {
		if (!field901) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("MDBQGDOL.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method8() {
		if (!field901) {
			return null;
		}

		GCSAWSJV var1 = method357();
		if (var1 == null) {
			return null;
		}

		field1117 = var1.field7;
		var1.field625 = true;

		if (field899) {
			return var1;
		}

		if (field1078 != -1 && field1079 != -1) {
			JEPDVFCL var2 = JEPDVFCL.field793[field1078];
			GCSAWSJV var3 = var2.method332();
			if (var3 != null) {
				GCSAWSJV var4 = new GCSAWSJV(var3, true, RLONYBCF.method436(field1079), false);
				var4.method273(-field1082, 0, 0);
				var4.method267();
				var4.method268(var2.field797.field1420[field1079]);
				var4.field624 = null;
				var4.field623 = null;

				if (var2.field800 != 128 || var2.field801 != 128) {
					var4.method276(var2.field800, var2.field800, var2.field801);
				}

				var4.method277(var2.field803 + 64, var2.field804 + 850, -30, -50, -30, true);
				GCSAWSJV[] var5 = new GCSAWSJV[] { var1, var4 };
				var1 = new GCSAWSJV(true, var5, 2);
			}
		}

		if (field916 != null) {
			if (client.field404 >= field897) {
				field916 = null;
			}

			if (client.field404 >= field896 && client.field404 < field897) {
				GCSAWSJV var6 = field916;
				var6.method273(field914 - field910, field913 - field1110, field915 - field1111);

				if (field1083 == 512) {
					var6.method271();
					var6.method271();
					var6.method271();
				} else if (field1083 == 1024) {
					var6.method271();
					var6.method271();
				} else if (field1083 == 1536) {
					var6.method271();
				}

				GCSAWSJV[] var7 = new GCSAWSJV[] { var1, var6 };
				var1 = new GCSAWSJV(true, var7, 2);

				if (field1083 == 512) {
					var6.method271();
				} else if (field1083 == 1024) {
					var6.method271();
					var6.method271();
				} else if (field1083 == 1536) {
					var6.method271();
					var6.method271();
					var6.method271();
				}

				var6.method273(field910 - field914, field1110 - field913, field1111 - field915);
			}
		}

		var1.field625 = true;
		return var1;
	}
}
