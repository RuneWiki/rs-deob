package deob;

@ObfuscatedName("IGCQCHAY")
public final class IGCQCHAY extends OZYWPVDM {

	@ObfuscatedName("IGCQCHAY.Cb")
	public int[] field681 = new int[5];

	@ObfuscatedName("IGCQCHAY.Lb")
	public boolean field689 = false;

	@ObfuscatedName("IGCQCHAY.Nb")
	public boolean field691 = false;

	@ObfuscatedName("IGCQCHAY.Qb")
	public int[] field694 = new int[12];

	@ObfuscatedName("IGCQCHAY.Tb")
	public long field697 = -1L;

	@ObfuscatedName("IGCQCHAY.Ub")
	public int field698 = -1;

	@ObfuscatedName("IGCQCHAY.Vb")
	public int field699 = -1;

	@ObfuscatedName("IGCQCHAY.Rb")
	public static QXKQGEKL field695 = new QXKQGEKL(260);

	@ObfuscatedName("IGCQCHAY.ub")
	public int field675;

	@ObfuscatedName("IGCQCHAY.vb")
	public int field676;

	@ObfuscatedName("IGCQCHAY.wb")
	public int field677;

	@ObfuscatedName("IGCQCHAY.xb")
	public int field678;

	@ObfuscatedName("IGCQCHAY.yb")
	public int field679;

	@ObfuscatedName("IGCQCHAY.Eb")
	public int field682;

	@ObfuscatedName("IGCQCHAY.Fb")
	public int field683;

	@ObfuscatedName("IGCQCHAY.Gb")
	public int field684;

	@ObfuscatedName("IGCQCHAY.Hb")
	public int field685;

	@ObfuscatedName("IGCQCHAY.Ib")
	public int field686;

	@ObfuscatedName("IGCQCHAY.Jb")
	public int field687;

	@ObfuscatedName("IGCQCHAY.Pb")
	public int field693;

	@ObfuscatedName("IGCQCHAY.Sb")
	public int field696;

	@ObfuscatedName("IGCQCHAY.Yb")
	public int field700;

	@ObfuscatedName("IGCQCHAY.Ob")
	public long field692;

	@ObfuscatedName("IGCQCHAY.zb")
	public NGYJLUVS field680;

	@ObfuscatedName("IGCQCHAY.Mb")
	public XDDMQHDR field690;

	@ObfuscatedName("IGCQCHAY.Kb")
	public String field688;

	@ObfuscatedName("IGCQCHAY.a(ZLRGCGKKUR;)V")
	public final void method226(RGCGKKUR arg0) {
		arg0.field1350 = 0;
		field682 = arg0.method455();
		field699 = arg0.method456();
		field698 = arg0.method456();
		field690 = null;
		field687 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				field694[var2] = 0;
			} else {
				int var4 = arg0.method455();
				field694[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field694[0] == 0xFFFF) {
					field690 = XDDMQHDR.method585(arg0.method457());
					break;
				}

				if (field694[var2] >= 512 && field694[var2] - 512 < BSBHBECI.field43) {
					int var5 = BSBHBECI.method22(field694[var2] - 512).field44;
					if (var5 != 0) {
						field687 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method455();
			if (var7 < 0 || var7 >= client.field220[var6].length) {
				var7 = 0;
			}

			field681[var6] = var7;
		}

		field1234 = arg0.method457();
		if (field1234 == 0xFFFF) {
			field1234 = -1;
		}

		field1235 = arg0.method457();
		if (field1235 == 0xFFFF) {
			field1235 = -1;
		}

		field1237 = arg0.method457();
		if (field1237 == 0xFFFF) {
			field1237 = -1;
		}

		field1238 = arg0.method457();
		if (field1238 == 0xFFFF) {
			field1238 = -1;
		}

		field1239 = arg0.method457();
		if (field1239 == 0xFFFF) {
			field1239 = -1;
		}

		field1240 = arg0.method457();
		if (field1240 == 0xFFFF) {
			field1240 = -1;
		}

		field1199 = arg0.method457();
		if (field1199 == 0xFFFF) {
			field1199 = -1;
		}

		field688 = SJGLGRTK.method501(SJGLGRTK.method498(arg0.method461()));
		field700 = arg0.method455();
		field693 = arg0.method457();
		field689 = true;
		field692 = 0L;
		int var8 = field694[5];
		int var9 = field694[9];
		field694[5] = var9;
		field694[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field692 <<= 4;
			if (field694[var10] >= 256) {
				field692 += field694[var10] - 256;
			}
		}

		if (field694[0] >= 256) {
			field692 += field694[0] - 256 >> 4;
		}

		if (field694[1] >= 256) {
			field692 += field694[1] - 256 >> 8;
		}

		field694[5] = var8;
		field694[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field692 <<= 3;
			field692 += field681[var11];
		}

		field692 <<= 1;
		field692 += field682;
	}

	@ObfuscatedName("IGCQCHAY.c(I)LNGYJLUVS;")
	public final NGYJLUVS method227() {
		if (field690 != null) {
			int var1 = -1;
			if (field1211 >= 0 && field1214 == 0) {
				var1 = KAIFCIAJ.field742[field1211].field744[field1212];
			} else if (field1220 >= 0) {
				var1 = KAIFCIAJ.field742[field1220].field744[field1221];
			}

			return field690.method584(-1, var1, null);
		}

		long var3 = field692;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1211 >= 0 && field1214 == 0) {
			KAIFCIAJ var9 = KAIFCIAJ.field742[field1211];
			var5 = var9.field744[field1212];

			if (field1220 >= 0 && field1234 != field1220) {
				var6 = KAIFCIAJ.field742[field1220].field744[field1221];
			}

			if (var9.field751 >= 0) {
				var7 = var9.field751;
				var3 += var7 - field694[5] << 40;
			}

			if (var9.field752 >= 0) {
				var8 = var9.field752;
				var3 += var8 - field694[3] << 48;
			}
		} else if (field1220 >= 0) {
			var5 = KAIFCIAJ.field742[field1220].field744[field1221];
		}

		NGYJLUVS var10 = (NGYJLUVS) field695.method440(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field694[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !IIATCLSX.field702[var13 - 256].method232()) {
					var11 = true;
				}

				if (var13 >= 512 && !BSBHBECI.method22(var13 - 512).method18(field682)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field697 != -1L) {
					var10 = (NGYJLUVS) field695.method440(field697);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			NGYJLUVS[] var14 = new NGYJLUVS[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field694[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					NGYJLUVS var18 = IIATCLSX.field702[var17 - 256].method233();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					NGYJLUVS var19 = BSBHBECI.method22(var17 - 512).method20(field682);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new NGYJLUVS(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field681[var20] != 0) {
					var10.method305(client.field220[var20][0], client.field220[var20][field681[var20]]);

					if (var20 == 1) {
						var10.method305(client.field492[0], client.field492[field681[var20]]);
					}
				}
			}

			var10.method298();
			var10.method308(64, 850, -30, -50, -30, true);
			field695.method441(var3, var10);
			field697 = var3;
		}

		if (field691) {
			return var10;
		}

		NGYJLUVS var21 = NGYJLUVS.field855;
		var21.method293(PHDJZMLE.method428(var5) & PHDJZMLE.method428(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method300(var6, var5, KAIFCIAJ.field742[field1211].field748);
		} else if (var5 != -1) {
			var21.method299(var5);
		}

		var21.method295();
		var21.field891 = null;
		var21.field890 = null;
		return var21;
	}

	@ObfuscatedName("IGCQCHAY.d(I)LNGYJLUVS;")
	public final NGYJLUVS method228() {
		if (!field689) {
			return null;
		}

		if (field690 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field694[var2];
				if (var3 >= 256 && var3 < 512 && !IIATCLSX.field702[var3 - 256].method234()) {
					var1 = true;
				}

				if (var3 >= 512 && !BSBHBECI.method22(var3 - 512).method21(field682)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			NGYJLUVS[] var4 = new NGYJLUVS[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field694[var6];
				if (var7 >= 256 && var7 < 512) {
					NGYJLUVS var8 = IIATCLSX.field702[var7 - 256].method235();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					NGYJLUVS var9 = BSBHBECI.method22(var7 - 512).method24(field682);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			NGYJLUVS var10 = new NGYJLUVS(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field681[var11] != 0) {
					var10.method305(client.field220[var11][0], client.field220[var11][field681[var11]]);

					if (var11 == 1) {
						var10.method305(client.field492[0], client.field492[field681[var11]]);
					}
				}
			}

			return var10;
		}

		return field690.method587();
	}

	@ObfuscatedName("IGCQCHAY.a(I)LNGYJLUVS;")
	public final NGYJLUVS method206() {
		if (!field689) {
			return null;
		}

		NGYJLUVS var1 = method227();
		if (var1 == null) {
			return null;
		}

		field1202 = var1.field845;
		var1.field892 = true;

		if (field691) {
			return var1;
		}

		if (field1193 != -1 && field1194 != -1) {
			FOXTQZWB var2 = FOXTQZWB.field603[field1193];
			NGYJLUVS var3 = var2.method210();
			if (var3 != null) {
				NGYJLUVS var4 = new NGYJLUVS(PHDJZMLE.method428(field1194), true, var3, false);
				var4.method304(0, -field1197, 0);
				var4.method298();
				var4.method299(var2.field607.field744[field1194]);
				var4.field891 = null;
				var4.field890 = null;

				if (var2.field610 != 128 || var2.field611 != 128) {
					var4.method307(var2.field610, var2.field610, var2.field611);
				}

				var4.method308(var2.field613 + 64, var2.field614 + 850, -30, -50, -30, true);
				NGYJLUVS[] var5 = new NGYJLUVS[] { var1, var4 };
				var1 = new NGYJLUVS(2, true, var5);
			}
		}

		if (field680 != null) {
			if (client.field205 >= field676) {
				field680 = null;
			}

			if (client.field205 >= field675 && client.field205 < field676) {
				NGYJLUVS var6 = field680;
				var6.method304(field677 - field1217, field678 - field696, field679 - field1218);

				if (field1223 == 512) {
					var6.method302();
					var6.method302();
					var6.method302();
				} else if (field1223 == 1024) {
					var6.method302();
					var6.method302();
				} else if (field1223 == 1536) {
					var6.method302();
				}

				NGYJLUVS[] var7 = new NGYJLUVS[] { var1, var6 };
				var1 = new NGYJLUVS(2, true, var7);

				if (field1223 == 512) {
					var6.method302();
				} else if (field1223 == 1024) {
					var6.method302();
					var6.method302();
				} else if (field1223 == 1536) {
					var6.method302();
					var6.method302();
					var6.method302();
				}

				var6.method304(field1217 - field677, field696 - field678, field1218 - field679);
			}
		}

		var1.field892 = true;
		return var1;
	}

	@ObfuscatedName("IGCQCHAY.a(Z)Z")
	public final boolean method229() {
		if (!field689) {
			return false;
		}

		return true;
	}
}
