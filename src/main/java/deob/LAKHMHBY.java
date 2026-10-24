package deob;

@ObfuscatedName("LAKHMHBY")
public final class LAKHMHBY extends QMQRUGDN {

	@ObfuscatedName("LAKHMHBY.sb")
	public boolean field939 = false;

	@ObfuscatedName("LAKHMHBY.vb")
	public int[] field942 = new int[12];

	@ObfuscatedName("LAKHMHBY.yb")
	public long field945 = -1L;

	@ObfuscatedName("LAKHMHBY.Nb")
	public int[] field959 = new int[5];

	@ObfuscatedName("LAKHMHBY.Pb")
	public boolean field961 = false;

	@ObfuscatedName("LAKHMHBY.wb")
	public static HPFNYARJ field943 = new HPFNYARJ(260);

	@ObfuscatedName("LAKHMHBY.qb")
	public int field937;

	@ObfuscatedName("LAKHMHBY.rb")
	public int field938;

	@ObfuscatedName("LAKHMHBY.tb")
	public int field940;

	@ObfuscatedName("LAKHMHBY.ub")
	public int field941;

	@ObfuscatedName("LAKHMHBY.zb")
	public int field946;

	@ObfuscatedName("LAKHMHBY.Ab")
	public int field947;

	@ObfuscatedName("LAKHMHBY.Bb")
	public int field948;

	@ObfuscatedName("LAKHMHBY.Cb")
	public int field949;

	@ObfuscatedName("LAKHMHBY.Db")
	public int field950;

	@ObfuscatedName("LAKHMHBY.Eb")
	public int field951;

	@ObfuscatedName("LAKHMHBY.Fb")
	public int field952;

	@ObfuscatedName("LAKHMHBY.Gb")
	public int field953;

	@ObfuscatedName("LAKHMHBY.Ib")
	public int field955;

	@ObfuscatedName("LAKHMHBY.Kb")
	public int field956;

	@ObfuscatedName("LAKHMHBY.Lb")
	public int field957;

	@ObfuscatedName("LAKHMHBY.Mb")
	public long field958;

	@ObfuscatedName("LAKHMHBY.xb")
	public HQFMWUSH field944;

	@ObfuscatedName("LAKHMHBY.Hb")
	public KPUOCBCE field954;

	@ObfuscatedName("LAKHMHBY.Ob")
	public String field960;

	@ObfuscatedName("LAKHMHBY.b(I)Z")
	public final boolean method12() {
		if (!field939) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("LAKHMHBY.b(B)LKPUOCBCE;")
	public final KPUOCBCE method408() {
		if (!field939) {
			return null;
		}

		if (field944 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field942[var2];
				if (var3 >= 256 && var3 < 512 && !NRGHMRLX.field1015[var3 - 256].method421()) {
					var1 = true;
				}

				if (var3 >= 512 && !HMRHACIQ.method293(var3 - 512).method291(field950)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			KPUOCBCE[] var4 = new KPUOCBCE[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field942[var6];
				if (var7 >= 256 && var7 < 512) {
					KPUOCBCE var8 = NRGHMRLX.field1015[var7 - 256].method422();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					KPUOCBCE var9 = HMRHACIQ.method293(var7 - 512).method297(field950);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			KPUOCBCE var10 = new KPUOCBCE(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field959[var11] != 0) {
					var10.method393(client.field69[var11][0], client.field69[var11][field959[var11]]);

					if (var11 == 1) {
						var10.method393(client.field206[0], client.field206[field959[var11]]);
					}
				}
			}

			return var10;
		}

		return field944.method307();
	}

	@ObfuscatedName("LAKHMHBY.a(I)LKPUOCBCE;")
	public final KPUOCBCE method11() {
		if (!field939) {
			return null;
		}

		KPUOCBCE var1 = method409();
		if (var1 == null) {
			return null;
		}

		field1156 = var1.field1380;
		var1.field890 = true;

		if (field961) {
			return var1;
		}

		if (field1167 != -1 && field1168 != -1) {
			FULHVSIU var2 = FULHVSIU.field604[field1167];
			KPUOCBCE var3 = var2.method231();
			if (var3 != null) {
				KPUOCBCE var4 = new KPUOCBCE(ZNUJPBQV.method585(field1168), false, var3, true);
				var4.method392(0, 0, -field1171);
				var4.method386();
				var4.method387(var2.field608.field1000[field1168]);
				var4.field889 = null;
				var4.field888 = null;

				if (var2.field611 != 128 || var2.field612 != 128) {
					var4.method395(var2.field611, var2.field612, var2.field611);
				}

				var4.method396(var2.field614 + 64, var2.field615 + 850, -30, -50, -30, true);
				KPUOCBCE[] var5 = new KPUOCBCE[] { var1, var4 };
				var1 = new KPUOCBCE(true, var5, 2);
			}
		}

		if (field954 != null) {
			if (client.field425 >= field941) {
				field954 = null;
			}

			if (client.field425 >= field940 && client.field425 < field941) {
				KPUOCBCE var6 = field954;
				var6.method392(field953 - field1158, field951 - field1157, field952 - field957);

				if (field1200 == 512) {
					var6.method390();
					var6.method390();
					var6.method390();
				} else if (field1200 == 1024) {
					var6.method390();
					var6.method390();
				} else if (field1200 == 1536) {
					var6.method390();
				}

				KPUOCBCE[] var7 = new KPUOCBCE[] { var1, var6 };
				var1 = new KPUOCBCE(true, var7, 2);

				if (field1200 == 512) {
					var6.method390();
				} else if (field1200 == 1024) {
					var6.method390();
					var6.method390();
				} else if (field1200 == 1536) {
					var6.method390();
					var6.method390();
					var6.method390();
				}

				var6.method392(field1158 - field953, field1157 - field951, field957 - field952);
			}
		}

		var1.field890 = true;
		return var1;
	}

	@ObfuscatedName("LAKHMHBY.c(I)LKPUOCBCE;")
	public final KPUOCBCE method409() {
		if (field944 != null) {
			int var1 = -1;
			if (field1151 >= 0 && field1154 == 0) {
				var1 = NMXKUYSC.field998[field1151].field1000[field1152];
			} else if (field1163 >= 0) {
				var1 = NMXKUYSC.field998[field1163].field1000[field1164];
			}

			return field944.method305(-1, null, var1);
		}

		long var3 = field958;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1151 >= 0 && field1154 == 0) {
			NMXKUYSC var9 = NMXKUYSC.field998[field1151];
			var5 = var9.field1000[field1152];

			if (field1163 >= 0 && field1183 != field1163) {
				var6 = NMXKUYSC.field998[field1163].field1000[field1164];
			}

			if (var9.field1007 >= 0) {
				var7 = var9.field1007;
				var3 += var7 - field942[5] << 40;
			}

			if (var9.field1008 >= 0) {
				var8 = var9.field1008;
				var3 += var8 - field942[3] << 48;
			}
		} else if (field1163 >= 0) {
			var5 = NMXKUYSC.field998[field1163].field1000[field1164];
		}

		KPUOCBCE var10 = (KPUOCBCE) field943.method302(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field942[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !NRGHMRLX.field1015[var13 - 256].method419()) {
					var11 = true;
				}

				if (var13 >= 512 && !HMRHACIQ.method293(var13 - 512).method294(field950)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field945 != -1L) {
					var10 = (KPUOCBCE) field943.method302(field945);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			KPUOCBCE[] var14 = new KPUOCBCE[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field942[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					KPUOCBCE var18 = NRGHMRLX.field1015[var17 - 256].method420();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					KPUOCBCE var19 = HMRHACIQ.method293(var17 - 512).method289(field950);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new KPUOCBCE(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field959[var20] != 0) {
					var10.method393(client.field69[var20][0], client.field69[var20][field959[var20]]);

					if (var20 == 1) {
						var10.method393(client.field206[0], client.field206[field959[var20]]);
					}
				}
			}

			var10.method386();
			var10.method396(64, 850, -30, -50, -30, true);
			field943.method303(var3, var10);
			field945 = var3;
		}

		if (field961) {
			return var10;
		}

		KPUOCBCE var21 = KPUOCBCE.field852;
		var21.method381(ZNUJPBQV.method585(var5) & ZNUJPBQV.method585(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method388(NMXKUYSC.field998[field1151].field1004, var5, var6);
		} else if (var5 != -1) {
			var21.method387(var5);
		}

		var21.method383();
		var21.field889 = null;
		var21.field888 = null;
		return var21;
	}

	@ObfuscatedName("LAKHMHBY.a(BLXOUQUKZW;)V")
	public final void method410(XOUQUKZW arg0) {
		arg0.field1367 = 0;
		field950 = arg0.method521();
		field937 = arg0.method521();
		field944 = null;
		field938 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method521();
			if (var3 == 0) {
				field942[var2] = 0;
			} else {
				int var4 = arg0.method521();
				field942[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field942[0] == 0xFFFF) {
					field944 = HQFMWUSH.method309(arg0.method523());
					break;
				}

				if (field942[var2] >= 512 && field942[var2] - 512 < HMRHACIQ.field731) {
					int var5 = HMRHACIQ.method293(field942[var2] - 512).field717;
					if (var5 != 0) {
						field938 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method521();
			if (var7 < 0 || var7 >= client.field69[var6].length) {
				var7 = 0;
			}

			field959[var6] = var7;
		}

		field1183 = arg0.method523();
		if (field1183 == 0xFFFF) {
			field1183 = -1;
		}

		field1184 = arg0.method523();
		if (field1184 == 0xFFFF) {
			field1184 = -1;
		}

		field1194 = arg0.method523();
		if (field1194 == 0xFFFF) {
			field1194 = -1;
		}

		field1195 = arg0.method523();
		if (field1195 == 0xFFFF) {
			field1195 = -1;
		}

		field1196 = arg0.method523();
		if (field1196 == 0xFFFF) {
			field1196 = -1;
		}

		field1197 = arg0.method523();
		if (field1197 == 0xFFFF) {
			field1197 = -1;
		}

		field1174 = arg0.method523();
		if (field1174 == 0xFFFF) {
			field1174 = -1;
		}

		field960 = YBENSMAZ.method567(YBENSMAZ.method564(arg0.method527()));
		field955 = arg0.method521();
		field956 = arg0.method523();
		field939 = true;
		field958 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field958 <<= 4;
			if (field942[var8] >= 256) {
				field958 += field942[var8] - 256;
			}
		}

		if (field942[0] >= 256) {
			field958 += field942[0] - 256 >> 4;
		}

		if (field942[1] >= 256) {
			field958 += field942[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field958 <<= 3;
			field958 += field959[var9];
		}

		field958 <<= 1;
		field958 += field950;
	}
}
