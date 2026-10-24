package deob;

@ObfuscatedName("HPYXKOFA")
public final class HPYXKOFA extends ITPGSHXV {

	@ObfuscatedName("HPYXKOFA.sb")
	public int[] field657 = new int[5];

	@ObfuscatedName("HPYXKOFA.tb")
	public long field658 = -1L;

	@ObfuscatedName("HPYXKOFA.Fb")
	public boolean field667 = false;

	@ObfuscatedName("HPYXKOFA.Gb")
	public boolean field668 = false;

	@ObfuscatedName("HPYXKOFA.Tb")
	public int[] field680 = new int[12];

	@ObfuscatedName("HPYXKOFA.xb")
	public static RUNMBJUO field660 = new RUNMBJUO(260);

	@ObfuscatedName("HPYXKOFA.rb")
	public int field656;

	@ObfuscatedName("HPYXKOFA.yb")
	public int field661;

	@ObfuscatedName("HPYXKOFA.Ab")
	public int field662;

	@ObfuscatedName("HPYXKOFA.Bb")
	public int field663;

	@ObfuscatedName("HPYXKOFA.Cb")
	public int field664;

	@ObfuscatedName("HPYXKOFA.Eb")
	public int field666;

	@ObfuscatedName("HPYXKOFA.Ib")
	public int field670;

	@ObfuscatedName("HPYXKOFA.Jb")
	public int field671;

	@ObfuscatedName("HPYXKOFA.Kb")
	public int field672;

	@ObfuscatedName("HPYXKOFA.Lb")
	public int field673;

	@ObfuscatedName("HPYXKOFA.Mb")
	public int field674;

	@ObfuscatedName("HPYXKOFA.Pb")
	public int field676;

	@ObfuscatedName("HPYXKOFA.Qb")
	public int field677;

	@ObfuscatedName("HPYXKOFA.Rb")
	public int field678;

	@ObfuscatedName("HPYXKOFA.Sb")
	public int field679;

	@ObfuscatedName("HPYXKOFA.Ob")
	public long field675;

	@ObfuscatedName("HPYXKOFA.wb")
	public BYABUZFP field659;

	@ObfuscatedName("HPYXKOFA.Db")
	public NJPATAFL field665;

	@ObfuscatedName("HPYXKOFA.Hb")
	public String field669;

	@ObfuscatedName("HPYXKOFA.a(I)LNJPATAFL;")
	public final NJPATAFL method206() {
		if (!field667) {
			return null;
		}

		NJPATAFL var1 = method242();
		if (var1 == null) {
			return null;
		}

		field709 = var1.field771;
		var1.field875 = true;

		if (field668) {
			return var1;
		}

		if (field736 != -1 && field737 != -1) {
			SNGXEJOJ var2 = SNGXEJOJ.field1217[field736];
			NJPATAFL var3 = var2.method478();
			if (var3 != null) {
				NJPATAFL var4 = new NJPATAFL(TDFMBTLA.method491(field737), false, true, var3);
				var4.method347(0, 0, -field740);
				var4.method341();
				var4.method342(var2.field1221.field1244[field737]);
				var4.field874 = null;
				var4.field873 = null;

				if (var2.field1224 != 128 || var2.field1225 != 128) {
					var4.method350(var2.field1224, var2.field1224, var2.field1225);
				}

				var4.method351(var2.field1227 + 64, var2.field1228 + 850, -30, -50, -30, true);
				NJPATAFL[] var5 = new NJPATAFL[] { var1, var4 };
				var1 = new NJPATAFL(2, var5, true);
			}
		}

		if (field665 != null) {
			if (client.field203 >= field678) {
				field665 = null;
			}

			if (client.field203 >= field677 && client.field203 < field678) {
				NJPATAFL var6 = field665;
				var6.method347(field664 - field707, field662 - field706, field663 - field674);

				if (field699 == 512) {
					var6.method345();
					var6.method345();
					var6.method345();
				} else if (field699 == 1024) {
					var6.method345();
					var6.method345();
				} else if (field699 == 1536) {
					var6.method345();
				}

				NJPATAFL[] var7 = new NJPATAFL[] { var1, var6 };
				var1 = new NJPATAFL(2, var7, true);

				if (field699 == 512) {
					var6.method345();
				} else if (field699 == 1024) {
					var6.method345();
					var6.method345();
				} else if (field699 == 1536) {
					var6.method345();
					var6.method345();
					var6.method345();
				}

				var6.method347(field707 - field664, field706 - field662, field674 - field663);
			}
		}

		var1.field875 = true;
		return var1;
	}

	@ObfuscatedName("HPYXKOFA.c(I)LNJPATAFL;")
	public final NJPATAFL method240() {
		if (!field667) {
			return null;
		}

		if (field659 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field680[var2];
				if (var3 >= 256 && var3 < 512 && !CWWAFTAL.field491[var3 - 256].method177()) {
					var1 = true;
				}

				if (var3 >= 512 && !PZNZFKPU.method428(var3 - 512).method419(field656)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			NJPATAFL[] var4 = new NJPATAFL[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field680[var6];
				if (var7 >= 256 && var7 < 512) {
					NJPATAFL var8 = CWWAFTAL.field491[var7 - 256].method178();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					NJPATAFL var9 = PZNZFKPU.method428(var7 - 512).method430(field656);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			NJPATAFL var10 = new NJPATAFL(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field657[var11] != 0) {
					var10.method348(client.field254[var11][0], client.field254[var11][field657[var11]]);

					if (var11 == 1) {
						var10.method348(client.field183[0], client.field183[field657[var11]]);
					}
				}
			}

			return var10;
		}

		return field659.method30();
	}

	@ObfuscatedName("HPYXKOFA.b(I)Z")
	public final boolean method241() {
		if (!field667) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("HPYXKOFA.d(I)LNJPATAFL;")
	public final NJPATAFL method242() {
		if (field659 != null) {
			int var1 = -1;
			if (field700 >= 0 && field703 == 0) {
				var1 = TLXFHCOO.field1242[field700].field1244[field701];
			} else if (field712 >= 0) {
				var1 = TLXFHCOO.field1242[field712].field1244[field713];
			}

			return field659.method28(null, -1, var1);
		}

		long var3 = field675;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field700 >= 0 && field703 == 0) {
			TLXFHCOO var9 = TLXFHCOO.field1242[field700];
			var5 = var9.field1244[field701];

			if (field712 >= 0 && field726 != field712) {
				var6 = TLXFHCOO.field1242[field712].field1244[field713];
			}

			if (var9.field1251 >= 0) {
				var7 = var9.field1251;
				var3 += var7 - field680[5] << 40;
			}

			if (var9.field1252 >= 0) {
				var8 = var9.field1252;
				var3 += var8 - field680[3] << 48;
			}
		} else if (field712 >= 0) {
			var5 = TLXFHCOO.field1242[field712].field1244[field713];
		}

		NJPATAFL var10 = (NJPATAFL) field660.method450(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field680[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !CWWAFTAL.field491[var13 - 256].method175()) {
					var11 = true;
				}

				if (var13 >= 512 && !PZNZFKPU.method428(var13 - 512).method427(field656)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field658 != -1L) {
					var10 = (NJPATAFL) field660.method450(field658);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			NJPATAFL[] var14 = new NJPATAFL[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field680[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					NJPATAFL var18 = CWWAFTAL.field491[var17 - 256].method176();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					NJPATAFL var19 = PZNZFKPU.method428(var17 - 512).method425(field656);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new NJPATAFL(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field657[var20] != 0) {
					var10.method348(client.field254[var20][0], client.field254[var20][field657[var20]]);

					if (var20 == 1) {
						var10.method348(client.field183[0], client.field183[field657[var20]]);
					}
				}
			}

			var10.method341();
			var10.method351(64, 850, -30, -50, -30, true);
			field660.method451(var3, var10);
			field658 = var3;
		}

		if (field668) {
			return var10;
		}

		NJPATAFL var21 = NJPATAFL.field837;
		var21.method336(var10, TDFMBTLA.method491(var5) & TDFMBTLA.method491(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method343(TLXFHCOO.field1242[field700].field1248, var6, var5);
		} else if (var5 != -1) {
			var21.method342(var5);
		}

		var21.method338();
		var21.field874 = null;
		var21.field873 = null;
		return var21;
	}

	@ObfuscatedName("HPYXKOFA.a(ILMUKVLYLC;)V")
	public final void method243(MUKVLYLC arg0) {
		arg0.field812 = 0;
		field656 = arg0.method292();
		field676 = arg0.method292();
		field659 = null;
		field666 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method292();
			if (var3 == 0) {
				field680[var2] = 0;
			} else {
				int var4 = arg0.method292();
				field680[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field680[0] == 0xFFFF) {
					field659 = BYABUZFP.method24(arg0.method294());
					break;
				}

				if (field680[var2] >= 512 && field680[var2] - 512 < PZNZFKPU.field1037) {
					int var5 = PZNZFKPU.method428(field680[var2] - 512).field1006;
					if (var5 != 0) {
						field666 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method292();
			if (var7 < 0 || var7 >= client.field254[var6].length) {
				var7 = 0;
			}

			field657[var6] = var7;
		}

		field726 = arg0.method294();
		if (field726 == 0xFFFF) {
			field726 = -1;
		}

		field727 = arg0.method294();
		if (field727 == 0xFFFF) {
			field727 = -1;
		}

		field741 = arg0.method294();
		if (field741 == 0xFFFF) {
			field741 = -1;
		}

		field742 = arg0.method294();
		if (field742 == 0xFFFF) {
			field742 = -1;
		}

		field743 = arg0.method294();
		if (field743 == 0xFFFF) {
			field743 = -1;
		}

		field744 = arg0.method294();
		if (field744 == 0xFFFF) {
			field744 = -1;
		}

		field711 = arg0.method294();
		if (field711 == 0xFFFF) {
			field711 = -1;
		}

		field669 = POOZNYPH.method417(POOZNYPH.method414(arg0.method298()));
		field661 = arg0.method292();
		field679 = arg0.method294();
		field667 = true;
		field675 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field675 <<= 4;
			if (field680[var8] >= 256) {
				field675 += field680[var8] - 256;
			}
		}

		if (field680[0] >= 256) {
			field675 += field680[0] - 256 >> 4;
		}

		if (field680[1] >= 256) {
			field675 += field680[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field675 <<= 3;
			field675 += field657[var9];
		}

		field675 <<= 1;
		field675 += field656;
	}
}
