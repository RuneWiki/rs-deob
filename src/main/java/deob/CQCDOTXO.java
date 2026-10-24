package deob;

@ObfuscatedName("CQCDOTXO")
public final class CQCDOTXO extends FHOAYGUJ {

	@ObfuscatedName("CQCDOTXO.nb")
	public int field507 = -1;

	@ObfuscatedName("CQCDOTXO.ob")
	public int field508 = -1;

	@ObfuscatedName("CQCDOTXO.wb")
	public int[] field515 = new int[12];

	@ObfuscatedName("CQCDOTXO.zb")
	public boolean field516 = false;

	@ObfuscatedName("CQCDOTXO.Cb")
	public boolean field519 = false;

	@ObfuscatedName("CQCDOTXO.Lb")
	public long field528 = -1L;

	@ObfuscatedName("CQCDOTXO.Mb")
	public int[] field529 = new int[5];

	@ObfuscatedName("CQCDOTXO.vb")
	public static NVDACYAH field514 = new NVDACYAH(260);

	@ObfuscatedName("CQCDOTXO.qb")
	public int field509;

	@ObfuscatedName("CQCDOTXO.rb")
	public int field510;

	@ObfuscatedName("CQCDOTXO.sb")
	public int field511;

	@ObfuscatedName("CQCDOTXO.tb")
	public int field512;

	@ObfuscatedName("CQCDOTXO.ub")
	public int field513;

	@ObfuscatedName("CQCDOTXO.Ab")
	public int field517;

	@ObfuscatedName("CQCDOTXO.Bb")
	public int field518;

	@ObfuscatedName("CQCDOTXO.Db")
	public int field520;

	@ObfuscatedName("CQCDOTXO.Eb")
	public int field521;

	@ObfuscatedName("CQCDOTXO.Fb")
	public int field522;

	@ObfuscatedName("CQCDOTXO.Gb")
	public int field523;

	@ObfuscatedName("CQCDOTXO.Jb")
	public int field526;

	@ObfuscatedName("CQCDOTXO.Pb")
	public int field531;

	@ObfuscatedName("CQCDOTXO.Qb")
	public int field532;

	@ObfuscatedName("CQCDOTXO.Ib")
	public long field525;

	@ObfuscatedName("CQCDOTXO.Hb")
	public IRLTEWJP field524;

	@ObfuscatedName("CQCDOTXO.Ob")
	public PFWIJTDA field530;

	@ObfuscatedName("CQCDOTXO.Kb")
	public String field527;

	@ObfuscatedName("CQCDOTXO.b(I)Z")
	public final boolean method166() {
		if (!field516) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("CQCDOTXO.c(I)LIRLTEWJP;")
	public final IRLTEWJP method167() {
		if (field530 != null) {
			int var1 = -1;
			if (field602 >= 0 && field605 == 0) {
				var1 = QBINVEVU.field1165[field602].field1167[field603];
			} else if (field577 >= 0) {
				var1 = QBINVEVU.field1165[field577].field1167[field578];
			}

			return field530.method440(null, -1, var1);
		}

		long var3 = field525;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field602 >= 0 && field605 == 0) {
			QBINVEVU var9 = QBINVEVU.field1165[field602];
			var5 = var9.field1167[field603];

			if (field577 >= 0 && field625 != field577) {
				var6 = QBINVEVU.field1165[field577].field1167[field578];
			}

			if (var9.field1174 >= 0) {
				var7 = var9.field1174;
				var3 += var7 - field515[5] << 40;
			}

			if (var9.field1175 >= 0) {
				var8 = var9.field1175;
				var3 += var8 - field515[3] << 48;
			}
		} else if (field577 >= 0) {
			var5 = QBINVEVU.field1165[field577].field1167[field578];
		}

		IRLTEWJP var10 = (IRLTEWJP) field514.method427(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field515[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !PQTOFCBD.field1157[var13 - 256].method446()) {
					var11 = true;
				}

				if (var13 >= 512 && !RSPHUXRT.method475(var13 - 512).method467(field517)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field528 != -1L) {
					var10 = (IRLTEWJP) field514.method427(field528);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			IRLTEWJP[] var14 = new IRLTEWJP[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field515[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					IRLTEWJP var18 = PQTOFCBD.field1157[var17 - 256].method447();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					IRLTEWJP var19 = RSPHUXRT.method475(var17 - 512).method470(field517);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new IRLTEWJP(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field529[var20] != 0) {
					var10.method295(client.field307[var20][0], client.field307[var20][field529[var20]]);

					if (var20 == 1) {
						var10.method295(client.field181[0], client.field181[field529[var20]]);
					}
				}
			}

			var10.method288();
			var10.method298(64, 850, -30, -50, -30, true);
			field514.method428(var3, var10);
			field528 = var3;
		}

		if (field519) {
			return var10;
		}

		IRLTEWJP var21 = IRLTEWJP.field874;
		var21.method283(var10, FIYHSKKC.method211(var5) & FIYHSKKC.method211(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method290(var5, QBINVEVU.field1165[field602].field1171, var6);
		} else if (var5 != -1) {
			var21.method289(var5);
		}

		var21.method285();
		var21.field910 = null;
		var21.field909 = null;
		return var21;
	}

	@ObfuscatedName("CQCDOTXO.a(I)LIRLTEWJP;")
	public final IRLTEWJP method168() {
		if (!field516) {
			return null;
		}

		IRLTEWJP var1 = method167();
		if (var1 == null) {
			return null;
		}

		field589 = var1.field702;
		var1.field911 = true;

		if (field519) {
			return var1;
		}

		if (field619 != -1 && field620 != -1) {
			OPHZBIVR var2 = OPHZBIVR.field1106[field619];
			IRLTEWJP var3 = var2.method435();
			if (var3 != null) {
				IRLTEWJP var4 = new IRLTEWJP(var3, false, FIYHSKKC.method211(field620), true);
				var4.method294(0, 0, -field623);
				var4.method288();
				var4.method289(var2.field1110.field1167[field620]);
				var4.field910 = null;
				var4.field909 = null;

				if (var2.field1113 != 128 || var2.field1114 != 128) {
					var4.method297(var2.field1113, var2.field1114, var2.field1113);
				}

				var4.method298(var2.field1116 + 64, var2.field1117 + 850, -30, -50, -30, true);
				IRLTEWJP[] var5 = new IRLTEWJP[] { var1, var4 };
				var1 = new IRLTEWJP(true, 2, var5);
			}
		}

		if (field524 != null) {
			if (client.field476 >= field532) {
				field524 = null;
			}

			if (client.field476 >= field531 && client.field476 < field532) {
				IRLTEWJP var6 = field524;
				var6.method294(field521 - field615, field523 - field616, field522 - field520);

				if (field618 == 512) {
					var6.method292();
					var6.method292();
					var6.method292();
				} else if (field618 == 1024) {
					var6.method292();
					var6.method292();
				} else if (field618 == 1536) {
					var6.method292();
				}

				IRLTEWJP[] var7 = new IRLTEWJP[] { var1, var6 };
				var1 = new IRLTEWJP(true, 2, var7);

				if (field618 == 512) {
					var6.method292();
				} else if (field618 == 1024) {
					var6.method292();
					var6.method292();
				} else if (field618 == 1536) {
					var6.method292();
					var6.method292();
					var6.method292();
				}

				var6.method294(field615 - field521, field616 - field523, field520 - field522);
			}
		}

		var1.field911 = true;
		return var1;
	}

	@ObfuscatedName("CQCDOTXO.b(B)LIRLTEWJP;")
	public final IRLTEWJP method169() {
		if (!field516) {
			return null;
		}

		if (field530 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field515[var2];
				if (var3 >= 256 && var3 < 512 && !PQTOFCBD.field1157[var3 - 256].method448()) {
					var1 = true;
				}

				if (var3 >= 512 && !RSPHUXRT.method475(var3 - 512).method472(field517)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			IRLTEWJP[] var4 = new IRLTEWJP[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field515[var6];
				if (var7 >= 256 && var7 < 512) {
					IRLTEWJP var8 = PQTOFCBD.field1157[var7 - 256].method449();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					IRLTEWJP var9 = RSPHUXRT.method475(var7 - 512).method471(field517);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			IRLTEWJP var10 = new IRLTEWJP(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field529[var11] != 0) {
					var10.method295(client.field307[var11][0], client.field307[var11][field529[var11]]);

					if (var11 == 1) {
						var10.method295(client.field181[0], client.field181[field529[var11]]);
					}
				}
			}

			return var10;
		}

		return field530.method436();
	}

	@ObfuscatedName("CQCDOTXO.a(ILMNKDCXXG;)V")
	public final void method170(MNKDCXXG arg0) {
		arg0.field1055 = 0;
		field517 = arg0.method386();
		field507 = arg0.method387();
		field508 = arg0.method387();
		field530 = null;
		field513 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method386();
			if (var3 == 0) {
				field515[var2] = 0;
			} else {
				int var4 = arg0.method386();
				field515[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field515[0] == 0xFFFF) {
					field530 = PFWIJTDA.method442(arg0.method388());
					break;
				}

				if (field515[var2] >= 512 && field515[var2] - 512 < RSPHUXRT.field1195) {
					int var5 = RSPHUXRT.method475(field515[var2] - 512).field1210;
					if (var5 != 0) {
						field513 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method386();
			if (var7 < 0 || var7 >= client.field307[var6].length) {
				var7 = 0;
			}

			field529[var6] = var7;
		}

		field625 = arg0.method388();
		if (field625 == 0xFFFF) {
			field625 = -1;
		}

		field626 = arg0.method388();
		if (field626 == 0xFFFF) {
			field626 = -1;
		}

		field593 = arg0.method388();
		if (field593 == 0xFFFF) {
			field593 = -1;
		}

		field594 = arg0.method388();
		if (field594 == 0xFFFF) {
			field594 = -1;
		}

		field595 = arg0.method388();
		if (field595 == 0xFFFF) {
			field595 = -1;
		}

		field596 = arg0.method388();
		if (field596 == 0xFFFF) {
			field596 = -1;
		}

		field592 = arg0.method388();
		if (field592 == 0xFFFF) {
			field592 = -1;
		}

		field527 = UJXMBJLW.method495(UJXMBJLW.method492(arg0.method392()));
		field518 = arg0.method386();
		field526 = arg0.method388();
		field516 = true;
		field525 = 0L;
		int var8 = field515[5];
		int var9 = field515[9];
		field515[5] = var9;
		field515[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field525 <<= 4;
			if (field515[var10] >= 256) {
				field525 += field515[var10] - 256;
			}
		}

		if (field515[0] >= 256) {
			field525 += field515[0] - 256 >> 4;
		}

		if (field515[1] >= 256) {
			field525 += field515[1] - 256 >> 8;
		}

		field515[5] = var8;
		field515[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field525 <<= 3;
			field525 += field529[var11];
		}

		field525 <<= 1;
		field525 += field517;
	}
}
