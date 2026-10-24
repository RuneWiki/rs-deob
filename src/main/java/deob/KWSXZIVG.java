package deob;

@ObfuscatedName("KWSXZIVG")
public final class KWSXZIVG extends SXZSKNOI {

	@ObfuscatedName("KWSXZIVG.qb")
	public long field735 = -1L;

	@ObfuscatedName("KWSXZIVG.rb")
	public boolean field736 = false;

	@ObfuscatedName("KWSXZIVG.ub")
	public boolean field739 = false;

	@ObfuscatedName("KWSXZIVG.Ab")
	public int[] field742 = new int[5];

	@ObfuscatedName("KWSXZIVG.Qb")
	public int[] field757 = new int[12];

	@ObfuscatedName("KWSXZIVG.zb")
	public static ECXUVDNP field741 = new ECXUVDNP(260);

	@ObfuscatedName("KWSXZIVG.ob")
	public int field733;

	@ObfuscatedName("KWSXZIVG.pb")
	public int field734;

	@ObfuscatedName("KWSXZIVG.yb")
	public int field740;

	@ObfuscatedName("KWSXZIVG.Db")
	public int field744;

	@ObfuscatedName("KWSXZIVG.Eb")
	public int field745;

	@ObfuscatedName("KWSXZIVG.Fb")
	public int field746;

	@ObfuscatedName("KWSXZIVG.Hb")
	public int field748;

	@ObfuscatedName("KWSXZIVG.Ib")
	public int field749;

	@ObfuscatedName("KWSXZIVG.Jb")
	public int field750;

	@ObfuscatedName("KWSXZIVG.Kb")
	public int field751;

	@ObfuscatedName("KWSXZIVG.Lb")
	public int field752;

	@ObfuscatedName("KWSXZIVG.Mb")
	public int field753;

	@ObfuscatedName("KWSXZIVG.Nb")
	public int field754;

	@ObfuscatedName("KWSXZIVG.Ob")
	public int field755;

	@ObfuscatedName("KWSXZIVG.Pb")
	public int field756;

	@ObfuscatedName("KWSXZIVG.tb")
	public long field738;

	@ObfuscatedName("KWSXZIVG.Bb")
	public COIHKGSL field743;

	@ObfuscatedName("KWSXZIVG.Gb")
	public YYHPBDED field747;

	@ObfuscatedName("KWSXZIVG.sb")
	public String field737;

	@ObfuscatedName("KWSXZIVG.a(BLMQZHAILV;)V")
	public final void method270(MQZHAILV arg0) {
		arg0.field797 = 0;
		field756 = arg0.method325();
		field754 = arg0.method325();
		field743 = null;
		field733 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method325();
			if (var3 == 0) {
				field757[var2] = 0;
			} else {
				int var4 = arg0.method325();
				field757[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field757[0] == 0xFFFF) {
					field743 = COIHKGSL.method171(arg0.method327());
					break;
				}

				if (field757[var2] >= 512 && field757[var2] - 512 < CBASPZKU.field36) {
					int var5 = CBASPZKU.method13(field757[var2] - 512).field17;
					if (var5 != 0) {
						field733 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method325();
			if (var7 < 0 || var7 >= client.field170[var6].length) {
				var7 = 0;
			}

			field742[var6] = var7;
		}

		field1052 = arg0.method327();
		if (field1052 == 0xFFFF) {
			field1052 = -1;
		}

		field1053 = arg0.method327();
		if (field1053 == 0xFFFF) {
			field1053 = -1;
		}

		field1036 = arg0.method327();
		if (field1036 == 0xFFFF) {
			field1036 = -1;
		}

		field1037 = arg0.method327();
		if (field1037 == 0xFFFF) {
			field1037 = -1;
		}

		field1038 = arg0.method327();
		if (field1038 == 0xFFFF) {
			field1038 = -1;
		}

		field1039 = arg0.method327();
		if (field1039 == 0xFFFF) {
			field1039 = -1;
		}

		field1040 = arg0.method327();
		if (field1040 == 0xFFFF) {
			field1040 = -1;
		}

		field737 = PMUEFTAP.method371(PMUEFTAP.method368(arg0.method331()));
		field755 = arg0.method325();
		field734 = arg0.method327();
		field739 = true;
		field738 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field738 <<= 4;
			if (field757[var8] >= 256) {
				field738 += field757[var8] - 256;
			}
		}

		if (field757[0] >= 256) {
			field738 += field757[0] - 256 >> 4;
		}

		if (field757[1] >= 256) {
			field738 += field757[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field738 <<= 3;
			field738 += field742[var9];
		}

		field738 <<= 1;
		field738 += field756;
	}

	@ObfuscatedName("KWSXZIVG.b(I)LYYHPBDED;")
	public final YYHPBDED method271() {
		if (field743 != null) {
			int var1 = -1;
			if (field1047 >= 0 && field1050 == 0) {
				var1 = JFYFSKVR.field659[field1047].field661[field1048];
			} else if (field1058 >= 0) {
				var1 = JFYFSKVR.field659[field1058].field661[field1059];
			}

			return field743.method166(var1, null, -1);
		}

		long var3 = field738;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1047 >= 0 && field1050 == 0) {
			JFYFSKVR var9 = JFYFSKVR.field659[field1047];
			var5 = var9.field661[field1048];

			if (field1058 >= 0 && field1058 != field1052) {
				var6 = JFYFSKVR.field659[field1058].field661[field1059];
			}

			if (var9.field668 >= 0) {
				var7 = var9.field668;
				var3 += var7 - field757[5] << 40;
			}

			if (var9.field669 >= 0) {
				var8 = var9.field669;
				var3 += var8 - field757[3] << 48;
			}
		} else if (field1058 >= 0) {
			var5 = JFYFSKVR.field659[field1058].field661[field1059];
		}

		YYHPBDED var10 = (YYHPBDED) field741.method221(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field757[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !LNSFKVMU.field759[var13 - 256].method276()) {
					var11 = true;
				}

				if (var13 >= 512 && !CBASPZKU.method13(var13 - 512).method19(field756)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field735 != -1L) {
					var10 = (YYHPBDED) field741.method221(field735);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			YYHPBDED[] var14 = new YYHPBDED[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field757[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					YYHPBDED var18 = LNSFKVMU.field759[var17 - 256].method277();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					YYHPBDED var19 = CBASPZKU.method13(var17 - 512).method11(field756);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new YYHPBDED(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field742[var20] != 0) {
					var10.method565(client.field170[var20][0], client.field170[var20][field742[var20]]);

					if (var20 == 1) {
						var10.method565(client.field112[0], client.field112[field742[var20]]);
					}
				}
			}

			var10.method558();
			var10.method568(64, 850, -30, -50, -30, true);
			field741.method222(var3, var10);
			field735 = var3;
		}

		if (field736) {
			return var10;
		}

		YYHPBDED var21 = YYHPBDED.field1340;
		var21.method553(VPISXBMB.method513(var5) & VPISXBMB.method513(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method560(var6, JFYFSKVR.field659[field1047].field665, var5);
		} else if (var5 != -1) {
			var21.method559(var5);
		}

		var21.method555();
		var21.field1377 = null;
		var21.field1376 = null;
		return var21;
	}

	@ObfuscatedName("KWSXZIVG.b(Z)LYYHPBDED;")
	public final YYHPBDED method272() {
		if (!field739) {
			return null;
		}

		if (field743 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field757[var2];
				if (var3 >= 256 && var3 < 512 && !LNSFKVMU.field759[var3 - 256].method278()) {
					var1 = true;
				}

				if (var3 >= 512 && !CBASPZKU.method13(var3 - 512).method17(field756)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			YYHPBDED[] var4 = new YYHPBDED[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field757[var6];
				if (var7 >= 256 && var7 < 512) {
					YYHPBDED var8 = LNSFKVMU.field759[var7 - 256].method279();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					YYHPBDED var9 = CBASPZKU.method13(var7 - 512).method10(field756);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			YYHPBDED var10 = new YYHPBDED(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field742[var11] != 0) {
					var10.method565(client.field170[var11][0], client.field170[var11][field742[var11]]);

					if (var11 == 1) {
						var10.method565(client.field112[0], client.field112[field742[var11]]);
					}
				}
			}

			return var10;
		}

		return field743.method169();
	}

	@ObfuscatedName("KWSXZIVG.a(I)Z")
	public final boolean method273() {
		if (!field739) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("KWSXZIVG.a(Z)LYYHPBDED;")
	public final YYHPBDED method2() {
		if (!field739) {
			return null;
		}

		YYHPBDED var1 = method271();
		if (var1 == null) {
			return null;
		}

		field1063 = var1.field2;
		var1.field1378 = true;

		if (field736) {
			return var1;
		}

		if (field1013 != -1 && field1014 != -1) {
			OQOGSGFM var2 = OQOGSGFM.field817[field1013];
			YYHPBDED var3 = var2.method366();
			if (var3 != null) {
				YYHPBDED var4 = new YYHPBDED(false, var3, true, VPISXBMB.method513(field1014));
				var4.method564(-field1017, 0, 0);
				var4.method558();
				var4.method559(var2.field821.field661[field1014]);
				var4.field1377 = null;
				var4.field1376 = null;

				if (var2.field824 != 128 || var2.field825 != 128) {
					var4.method567(var2.field825, var2.field824, var2.field824);
				}

				var4.method568(var2.field827 + 64, var2.field828 + 850, -30, -50, -30, true);
				YYHPBDED[] var5 = new YYHPBDED[] { var1, var4 };
				var1 = new YYHPBDED(var5, true, 2);
			}
		}

		if (field747 != null) {
			if (client.field336 >= field753) {
				field747 = null;
			}

			if (client.field336 >= field752 && client.field336 < field753) {
				YYHPBDED var6 = field747;
				var6.method564(field745 - field740, field744 - field1019, field746 - field1020);

				if (field1012 == 512) {
					var6.method562();
					var6.method562();
					var6.method562();
				} else if (field1012 == 1024) {
					var6.method562();
					var6.method562();
				} else if (field1012 == 1536) {
					var6.method562();
				}

				YYHPBDED[] var7 = new YYHPBDED[] { var1, var6 };
				var1 = new YYHPBDED(var7, true, 2);

				if (field1012 == 512) {
					var6.method562();
				} else if (field1012 == 1024) {
					var6.method562();
					var6.method562();
				} else if (field1012 == 1536) {
					var6.method562();
					var6.method562();
					var6.method562();
				}

				var6.method564(field740 - field745, field1019 - field744, field1020 - field746);
			}
		}

		var1.field1378 = true;
		return var1;
	}
}
