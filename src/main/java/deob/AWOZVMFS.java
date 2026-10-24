package deob;

@ObfuscatedName("AWOZVMFS")
public final class AWOZVMFS extends APSQOGBV {

	@ObfuscatedName("AWOZVMFS.sb")
	public int field99 = -1;

	@ObfuscatedName("AWOZVMFS.vb")
	public int[] field101 = new int[5];

	@ObfuscatedName("AWOZVMFS.wb")
	public boolean field102 = false;

	@ObfuscatedName("AWOZVMFS.Fb")
	public int[] field111 = new int[12];

	@ObfuscatedName("AWOZVMFS.Ob")
	public long field119 = -1L;

	@ObfuscatedName("AWOZVMFS.Pb")
	public boolean field120 = false;

	@ObfuscatedName("AWOZVMFS.Rb")
	public int field122 = -1;

	@ObfuscatedName("AWOZVMFS.Qb")
	public static DSMCVRKW field121 = new DSMCVRKW(260);

	@ObfuscatedName("AWOZVMFS.xb")
	public int field103;

	@ObfuscatedName("AWOZVMFS.yb")
	public int field104;

	@ObfuscatedName("AWOZVMFS.zb")
	public int field105;

	@ObfuscatedName("AWOZVMFS.Ab")
	public int field106;

	@ObfuscatedName("AWOZVMFS.Bb")
	public int field107;

	@ObfuscatedName("AWOZVMFS.Cb")
	public int field108;

	@ObfuscatedName("AWOZVMFS.Db")
	public int field109;

	@ObfuscatedName("AWOZVMFS.Eb")
	public int field110;

	@ObfuscatedName("AWOZVMFS.Gb")
	public int field112;

	@ObfuscatedName("AWOZVMFS.Hb")
	public int field113;

	@ObfuscatedName("AWOZVMFS.Ib")
	public int field114;

	@ObfuscatedName("AWOZVMFS.Nb")
	public int field118;

	@ObfuscatedName("AWOZVMFS.qb")
	public int field97;

	@ObfuscatedName("AWOZVMFS.rb")
	public int field98;

	@ObfuscatedName("AWOZVMFS.tb")
	public long field100;

	@ObfuscatedName("AWOZVMFS.Jb")
	public KBEXSZSN field115;

	@ObfuscatedName("AWOZVMFS.Kb")
	public NPWLDXJE field116;

	@ObfuscatedName("AWOZVMFS.Mb")
	public String field117;

	@ObfuscatedName("AWOZVMFS.a(Z)Z")
	public final boolean method10() {
		if (!field120) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("AWOZVMFS.b(B)LKBEXSZSN;")
	public final KBEXSZSN method25() {
		if (field116 != null) {
			int var1 = -1;
			if (field44 >= 0 && field47 == 0) {
				var1 = ODMBIHRM.field1035[field44].field1037[field45];
			} else if (field40 >= 0) {
				var1 = ODMBIHRM.field1035[field40].field1037[field41];
			}

			return field116.method388(var1, -1, null);
		}

		long var3 = field100;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field44 >= 0 && field47 == 0) {
			ODMBIHRM var9 = ODMBIHRM.field1035[field44];
			var5 = var9.field1037[field45];

			if (field40 >= 0 && field65 != field40) {
				var6 = ODMBIHRM.field1035[field40].field1037[field41];
			}

			if (var9.field1044 >= 0) {
				var7 = var9.field1044;
				var3 += var7 - field111[5] << 40;
			}

			if (var9.field1045 >= 0) {
				var8 = var9.field1045;
				var3 += var8 - field111[3] << 48;
			}
		} else if (field40 >= 0) {
			var5 = ODMBIHRM.field1035[field40].field1037[field41];
		}

		KBEXSZSN var10 = (KBEXSZSN) field121.method197(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field111[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !TFKCMRVE.field1186[var13 - 256].method455()) {
					var11 = true;
				}

				if (var13 >= 512 && !XLZQSPZS.method526(var13 - 512).method517(field108)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field119 != -1L) {
					var10 = (KBEXSZSN) field121.method197(field119);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			KBEXSZSN[] var14 = new KBEXSZSN[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field111[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					KBEXSZSN var18 = TFKCMRVE.field1186[var17 - 256].method456();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					KBEXSZSN var19 = XLZQSPZS.method526(var17 - 512).method522(field108);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new KBEXSZSN(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field101[var20] != 0) {
					var10.method353(client.field409[var20][0], client.field409[var20][field101[var20]]);

					if (var20 == 1) {
						var10.method353(client.field544[0], client.field544[field101[var20]]);
					}
				}
			}

			var10.method346();
			var10.method356(64, 850, -30, -50, -30, true);
			field121.method198(var3, var10);
			field119 = var3;
		}

		if (field102) {
			return var10;
		}

		KBEXSZSN var21 = KBEXSZSN.field868;
		var21.method341(var10, IBCKUTPD.method309(var5) & IBCKUTPD.method309(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method348(ODMBIHRM.field1035[field44].field1041, var6, var5);
		} else if (var5 != -1) {
			var21.method347(var5);
		}

		var21.method343();
		var21.field904 = null;
		var21.field903 = null;
		return var21;
	}

	@ObfuscatedName("AWOZVMFS.b(I)LKBEXSZSN;")
	public final KBEXSZSN method26() {
		if (!field120) {
			return null;
		}

		if (field116 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field111[var2];
				if (var3 >= 256 && var3 < 512 && !TFKCMRVE.field1186[var3 - 256].method457()) {
					var1 = true;
				}

				if (var3 >= 512 && !XLZQSPZS.method526(var3 - 512).method515(field108)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			KBEXSZSN[] var4 = new KBEXSZSN[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field111[var6];
				if (var7 >= 256 && var7 < 512) {
					KBEXSZSN var8 = TFKCMRVE.field1186[var7 - 256].method458();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					KBEXSZSN var9 = XLZQSPZS.method526(var7 - 512).method525(field108);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			KBEXSZSN var10 = new KBEXSZSN(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field101[var11] != 0) {
					var10.method353(client.field409[var11][0], client.field409[var11][field101[var11]]);

					if (var11 == 1) {
						var10.method353(client.field544[0], client.field544[field101[var11]]);
					}
				}
			}

			return var10;
		}

		return field116.method390();
	}

	@ObfuscatedName("AWOZVMFS.a(LEILHLJCE;I)V")
	public final void method27(EILHLJCE arg0) {
		arg0.field684 = 0;
		field108 = arg0.method224();
		field122 = arg0.method225();
		field99 = arg0.method225();
		field116 = null;
		field118 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method224();
			if (var3 == 0) {
				field111[var2] = 0;
			} else {
				int var4 = arg0.method224();
				field111[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field111[0] == 0xFFFF) {
					field116 = NPWLDXJE.method393(arg0.method226());
					break;
				}

				if (field111[var2] >= 512 && field111[var2] - 512 < XLZQSPZS.field1339) {
					int var5 = XLZQSPZS.method526(field111[var2] - 512).field1308;
					if (var5 != 0) {
						field118 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method224();
			if (var7 < 0 || var7 >= client.field409[var6].length) {
				var7 = 0;
			}

			field101[var6] = var7;
		}

		field65 = arg0.method226();
		if (field65 == 0xFFFF) {
			field65 = -1;
		}

		field66 = arg0.method226();
		if (field66 == 0xFFFF) {
			field66 = -1;
		}

		field18 = arg0.method226();
		if (field18 == 0xFFFF) {
			field18 = -1;
		}

		field19 = arg0.method226();
		if (field19 == 0xFFFF) {
			field19 = -1;
		}

		field20 = arg0.method226();
		if (field20 == 0xFFFF) {
			field20 = -1;
		}

		field21 = arg0.method226();
		if (field21 == 0xFFFF) {
			field21 = -1;
		}

		field16 = arg0.method226();
		if (field16 == 0xFFFF) {
			field16 = -1;
		}

		field117 = LGOZNEAG.method370(LGOZNEAG.method367(arg0.method230()));
		field110 = arg0.method224();
		field103 = arg0.method226();
		field120 = true;
		field100 = 0L;
		int var8 = field111[5];
		int var9 = field111[9];
		field111[5] = var9;
		field111[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field100 <<= 4;
			if (field111[var10] >= 256) {
				field100 += field111[var10] - 256;
			}
		}

		if (field111[0] >= 256) {
			field100 += field111[0] - 256 >> 4;
		}

		if (field111[1] >= 256) {
			field100 += field111[1] - 256 >> 8;
		}

		field111[5] = var8;
		field111[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field100 <<= 3;
			field100 += field101[var11];
		}

		field100 <<= 1;
		field100 += field108;
	}

	@ObfuscatedName("AWOZVMFS.a(I)LKBEXSZSN;")
	public final KBEXSZSN method28() {
		if (!field120) {
			return null;
		}

		KBEXSZSN var1 = method25();
		if (var1 == null) {
			return null;
		}

		field33 = var1.field1299;
		var1.field905 = true;

		if (field102) {
			return var1;
		}

		if (field24 != -1 && field25 != -1) {
			TGIKVGNH var2 = TGIKVGNH.field1194[field24];
			KBEXSZSN var3 = var2.method461();
			if (var3 != null) {
				KBEXSZSN var4 = new KBEXSZSN(false, IBCKUTPD.method309(field25), var3, true);
				var4.method352(-field28, 0, 0);
				var4.method346();
				var4.method347(var2.field1198.field1037[field25]);
				var4.field904 = null;
				var4.field903 = null;

				if (var2.field1201 != 128 || var2.field1202 != 128) {
					var4.method355(var2.field1201, var2.field1202, var2.field1201);
				}

				var4.method356(var2.field1204 + 64, var2.field1205 + 850, -30, -50, -30, true);
				KBEXSZSN[] var5 = new KBEXSZSN[] { var1, var4 };
				var1 = new KBEXSZSN(var5, 2, true);
			}
		}

		if (field115 != null) {
			if (client.field499 >= field98) {
				field115 = null;
			}

			if (client.field499 >= field97 && client.field499 < field98) {
				KBEXSZSN var6 = field115;
				var6.method352(field113 - field109, field112 - field62, field114 - field63);

				if (field61 == 512) {
					var6.method350();
					var6.method350();
					var6.method350();
				} else if (field61 == 1024) {
					var6.method350();
					var6.method350();
				} else if (field61 == 1536) {
					var6.method350();
				}

				KBEXSZSN[] var7 = new KBEXSZSN[] { var1, var6 };
				var1 = new KBEXSZSN(var7, 2, true);

				if (field61 == 512) {
					var6.method350();
				} else if (field61 == 1024) {
					var6.method350();
					var6.method350();
				} else if (field61 == 1536) {
					var6.method350();
					var6.method350();
					var6.method350();
				}

				var6.method352(field109 - field113, field62 - field112, field63 - field114);
			}
		}

		var1.field905 = true;
		return var1;
	}
}
