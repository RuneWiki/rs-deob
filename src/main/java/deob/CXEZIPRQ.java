package deob;

@ObfuscatedName("CXEZIPRQ")
public final class CXEZIPRQ extends FWNRUNYO {

	@ObfuscatedName("CXEZIPRQ.vb")
	public int[] field479 = new int[5];

	@ObfuscatedName("CXEZIPRQ.zb")
	public int[] field482 = new int[12];

	@ObfuscatedName("CXEZIPRQ.Fb")
	public boolean field487 = false;

	@ObfuscatedName("CXEZIPRQ.Gb")
	public boolean field488 = false;

	@ObfuscatedName("CXEZIPRQ.Jb")
	public long field490 = -1L;

	@ObfuscatedName("CXEZIPRQ.xb")
	public static QQBOAQZB field480 = new QQBOAQZB(260);

	@ObfuscatedName("CXEZIPRQ.tb")
	public int field477;

	@ObfuscatedName("CXEZIPRQ.ub")
	public int field478;

	@ObfuscatedName("CXEZIPRQ.yb")
	public int field481;

	@ObfuscatedName("CXEZIPRQ.Ab")
	public int field483;

	@ObfuscatedName("CXEZIPRQ.Cb")
	public int field484;

	@ObfuscatedName("CXEZIPRQ.Db")
	public int field485;

	@ObfuscatedName("CXEZIPRQ.Eb")
	public int field486;

	@ObfuscatedName("CXEZIPRQ.Hb")
	public int field489;

	@ObfuscatedName("CXEZIPRQ.Kb")
	public int field491;

	@ObfuscatedName("CXEZIPRQ.Lb")
	public int field492;

	@ObfuscatedName("CXEZIPRQ.Mb")
	public int field493;

	@ObfuscatedName("CXEZIPRQ.Nb")
	public int field494;

	@ObfuscatedName("CXEZIPRQ.Ob")
	public int field495;

	@ObfuscatedName("CXEZIPRQ.Pb")
	public int field496;

	@ObfuscatedName("CXEZIPRQ.Qb")
	public int field497;

	@ObfuscatedName("CXEZIPRQ.sb")
	public long field476;

	@ObfuscatedName("CXEZIPRQ.Rb")
	public DHUPIIUL field498;

	@ObfuscatedName("CXEZIPRQ.rb")
	public DOBKXCMM field475;

	@ObfuscatedName("CXEZIPRQ.qb")
	public String field474;

	@ObfuscatedName("CXEZIPRQ.b(B)Z")
	public final boolean method161() {
		if (!field487) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("CXEZIPRQ.a(I)LDHUPIIUL;")
	public final DHUPIIUL method162() {
		if (!field487) {
			return null;
		}

		if (field475 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field482[var2];
				if (var3 >= 256 && var3 < 512 && !FIQZIGZB.field742[var3 - 256].method261()) {
					var1 = true;
				}

				if (var3 >= 512 && !HFWXROSJ.method286(var3 - 512).method289(field486)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			DHUPIIUL[] var4 = new DHUPIIUL[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field482[var6];
				if (var7 >= 256 && var7 < 512) {
					DHUPIIUL var8 = FIQZIGZB.field742[var7 - 256].method262();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					DHUPIIUL var9 = HFWXROSJ.method286(var7 - 512).method279(field486);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			DHUPIIUL var10 = new DHUPIIUL(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field479[var11] != 0) {
					var10.method205(client.field382[var11][0], client.field382[var11][field479[var11]]);

					if (var11 == 1) {
						var10.method205(client.field305[0], client.field305[field479[var11]]);
					}
				}
			}

			return var10;
		}

		return field475.method236();
	}

	@ObfuscatedName("CXEZIPRQ.a(LINLHDAGO;Z)V")
	public final void method163(INLHDAGO arg0) {
		arg0.field969 = 0;
		field486 = arg0.method308();
		field483 = arg0.method308();
		field475 = null;
		field489 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method308();
			if (var3 == 0) {
				field482[var2] = 0;
			} else {
				int var4 = arg0.method308();
				field482[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field482[0] == 0xFFFF) {
					field475 = DOBKXCMM.method239(arg0.method310());
					break;
				}

				if (field482[var2] >= 512 && field482[var2] - 512 < HFWXROSJ.field895) {
					int var5 = HFWXROSJ.method286(field482[var2] - 512).field893;
					if (var5 != 0) {
						field489 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method308();
			if (var7 < 0 || var7 >= client.field382[var6].length) {
				var7 = 0;
			}

			field479[var6] = var7;
		}

		field756 = arg0.method310();
		if (field756 == 0xFFFF) {
			field756 = -1;
		}

		field757 = arg0.method310();
		if (field757 == 0xFFFF) {
			field757 = -1;
		}

		field787 = arg0.method310();
		if (field787 == 0xFFFF) {
			field787 = -1;
		}

		field788 = arg0.method310();
		if (field788 == 0xFFFF) {
			field788 = -1;
		}

		field789 = arg0.method310();
		if (field789 == 0xFFFF) {
			field789 = -1;
		}

		field790 = arg0.method310();
		if (field790 == 0xFFFF) {
			field790 = -1;
		}

		field763 = arg0.method310();
		if (field763 == 0xFFFF) {
			field763 = -1;
		}

		field474 = RTZFXINE.method473(RTZFXINE.method470(arg0.method314()));
		field478 = arg0.method308();
		field477 = arg0.method310();
		field487 = true;
		field476 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field476 <<= 4;
			if (field482[var8] >= 256) {
				field476 += field482[var8] - 256;
			}
		}

		if (field482[0] >= 256) {
			field476 += field482[0] - 256 >> 4;
		}

		if (field482[1] >= 256) {
			field476 += field482[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field476 <<= 3;
			field476 += field479[var9];
		}

		field476 <<= 1;
		field476 += field486;
	}

	@ObfuscatedName("CXEZIPRQ.b(I)LDHUPIIUL;")
	public final DHUPIIUL method164() {
		if (field475 != null) {
			int var1 = -1;
			if (field794 >= 0 && field797 == 0) {
				var1 = HARRRJHW.field840[field794].field842[field795];
			} else if (field774 >= 0) {
				var1 = HARRRJHW.field840[field774].field842[field775];
			}

			return field475.method237(-1, null, var1);
		}

		long var3 = field476;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field794 >= 0 && field797 == 0) {
			HARRRJHW var9 = HARRRJHW.field840[field794];
			var5 = var9.field842[field795];

			if (field774 >= 0 && field774 != field756) {
				var6 = HARRRJHW.field840[field774].field842[field775];
			}

			if (var9.field849 >= 0) {
				var7 = var9.field849;
				var3 += var7 - field482[5] << 40;
			}

			if (var9.field850 >= 0) {
				var8 = var9.field850;
				var3 += var8 - field482[3] << 48;
			}
		} else if (field774 >= 0) {
			var5 = HARRRJHW.field840[field774].field842[field775];
		}

		DHUPIIUL var10 = (DHUPIIUL) field480.method421(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field482[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !FIQZIGZB.field742[var13 - 256].method259()) {
					var11 = true;
				}

				if (var13 >= 512 && !HFWXROSJ.method286(var13 - 512).method283(field486)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field490 != -1L) {
					var10 = (DHUPIIUL) field480.method421(field490);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			DHUPIIUL[] var14 = new DHUPIIUL[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field482[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					DHUPIIUL var18 = FIQZIGZB.field742[var17 - 256].method260();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					DHUPIIUL var19 = HFWXROSJ.method286(var17 - 512).method287(field486);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new DHUPIIUL(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field479[var20] != 0) {
					var10.method205(client.field382[var20][0], client.field382[var20][field479[var20]]);

					if (var20 == 1) {
						var10.method205(client.field305[0], client.field305[field479[var20]]);
					}
				}
			}

			var10.method198();
			var10.method208(64, 850, -30, -50, -30, true);
			field480.method422(var10, var3);
			field490 = var3;
		}

		if (field488) {
			return var10;
		}

		DHUPIIUL var21 = DHUPIIUL.field539;
		var21.method193(var10, BWSGQYNU.method16(var5) & BWSGQYNU.method16(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method200(HARRRJHW.field840[field794].field846, var5, var6);
		} else if (var5 != -1) {
			var21.method199(var5);
		}

		var21.method195();
		var21.field576 = null;
		var21.field575 = null;
		return var21;
	}

	@ObfuscatedName("CXEZIPRQ.a(B)LDHUPIIUL;")
	public final DHUPIIUL method159() {
		if (!field487) {
			return null;
		}

		DHUPIIUL var1 = method164();
		if (var1 == null) {
			return null;
		}

		field806 = var1.field700;
		var1.field577 = true;

		if (field488) {
			return var1;
		}

		if (field800 != -1 && field801 != -1) {
			YTBPTACV var2 = YTBPTACV.field1460[field800];
			DHUPIIUL var3 = var2.method582();
			if (var3 != null) {
				DHUPIIUL var4 = new DHUPIIUL(var3, false, BWSGQYNU.method16(field801), true);
				var4.method204(0, 0, -field804);
				var4.method198();
				var4.method199(var2.field1464.field842[field801]);
				var4.field576 = null;
				var4.field575 = null;

				if (var2.field1467 != 128 || var2.field1468 != 128) {
					var4.method207(var2.field1467, var2.field1468, var2.field1467);
				}

				var4.method208(var2.field1470 + 64, var2.field1471 + 850, -30, -50, -30, true);
				DHUPIIUL[] var5 = new DHUPIIUL[] { var1, var4 };
				var1 = new DHUPIIUL(true, 2, var5);
			}
		}

		if (field498 != null) {
			if (client.field301 >= field485) {
				field498 = null;
			}

			if (client.field301 >= field484 && client.field301 < field485) {
				DHUPIIUL var6 = field498;
				var6.method204(field495 - field781, field497 - field782, field496 - field481);

				if (field779 == 512) {
					var6.method202();
					var6.method202();
					var6.method202();
				} else if (field779 == 1024) {
					var6.method202();
					var6.method202();
				} else if (field779 == 1536) {
					var6.method202();
				}

				DHUPIIUL[] var7 = new DHUPIIUL[] { var1, var6 };
				var1 = new DHUPIIUL(true, 2, var7);

				if (field779 == 512) {
					var6.method202();
				} else if (field779 == 1024) {
					var6.method202();
					var6.method202();
				} else if (field779 == 1536) {
					var6.method202();
					var6.method202();
					var6.method202();
				}

				var6.method204(field781 - field495, field782 - field497, field481 - field496);
			}
		}

		var1.field577 = true;
		return var1;
	}
}
