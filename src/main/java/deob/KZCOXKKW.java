package deob;

@ObfuscatedName("KZCOXKKW")
public final class KZCOXKKW extends FSZDVUBI {

	@ObfuscatedName("KZCOXKKW.rb")
	public boolean field783 = false;

	@ObfuscatedName("KZCOXKKW.sb")
	public int field784 = -1;

	@ObfuscatedName("KZCOXKKW.tb")
	public int[] field785 = new int[12];

	@ObfuscatedName("KZCOXKKW.xb")
	public int field789 = -1;

	@ObfuscatedName("KZCOXKKW.yb")
	public int[] field790 = new int[5];

	@ObfuscatedName("KZCOXKKW.Eb")
	public long field794 = -1L;

	@ObfuscatedName("KZCOXKKW.Wb")
	public boolean field808 = false;

	@ObfuscatedName("KZCOXKKW.wb")
	public static BMKJVFXV field788 = new BMKJVFXV(260);

	@ObfuscatedName("KZCOXKKW.vb")
	public int field787;

	@ObfuscatedName("KZCOXKKW.zb")
	public int field791;

	@ObfuscatedName("KZCOXKKW.Db")
	public int field793;

	@ObfuscatedName("KZCOXKKW.Fb")
	public int field795;

	@ObfuscatedName("KZCOXKKW.Jb")
	public int field796;

	@ObfuscatedName("KZCOXKKW.Kb")
	public int field797;

	@ObfuscatedName("KZCOXKKW.Lb")
	public int field798;

	@ObfuscatedName("KZCOXKKW.Mb")
	public int field799;

	@ObfuscatedName("KZCOXKKW.Nb")
	public int field800;

	@ObfuscatedName("KZCOXKKW.Qb")
	public int field802;

	@ObfuscatedName("KZCOXKKW.Rb")
	public int field803;

	@ObfuscatedName("KZCOXKKW.Sb")
	public int field804;

	@ObfuscatedName("KZCOXKKW.Tb")
	public int field805;

	@ObfuscatedName("KZCOXKKW.Ub")
	public int field806;

	@ObfuscatedName("KZCOXKKW.Pb")
	public long field801;

	@ObfuscatedName("KZCOXKKW.Vb")
	public RMLAXPMV field807;

	@ObfuscatedName("KZCOXKKW.Ab")
	public YSYPMZMO field792;

	@ObfuscatedName("KZCOXKKW.ub")
	public String field786;

	@ObfuscatedName("KZCOXKKW.b(I)LRMLAXPMV;")
	public final RMLAXPMV method352() {
		if (!field783) {
			return null;
		}

		if (field792 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field785[var2];
				if (var3 >= 256 && var3 < 512 && !GLRCYUHA.field625[var3 - 256].method314()) {
					var1 = true;
				}

				if (var3 >= 512 && !QSAFIBMX.method455(var3 - 512).method449(field793)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			RMLAXPMV[] var4 = new RMLAXPMV[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field785[var6];
				if (var7 >= 256 && var7 < 512) {
					RMLAXPMV var8 = GLRCYUHA.field625[var7 - 256].method315();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					RMLAXPMV var9 = QSAFIBMX.method455(var7 - 512).method457(field793);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			RMLAXPMV var10 = new RMLAXPMV(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field790[var11] != 0) {
					var10.method480(client.field336[var11][0], client.field336[var11][field790[var11]]);

					if (var11 == 1) {
						var10.method480(client.field420[0], client.field420[field790[var11]]);
					}
				}
			}

			return var10;
		}

		return field792.method600();
	}

	@ObfuscatedName("KZCOXKKW.a(I)Z")
	public final boolean method307() {
		if (!field783) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("KZCOXKKW.a(B)LRMLAXPMV;")
	public final RMLAXPMV method344() {
		if (!field783) {
			return null;
		}

		RMLAXPMV var1 = method353();
		if (var1 == null) {
			return null;
		}

		field599 = var1.field1060;
		var1.field1171 = true;

		if (field808) {
			return var1;
		}

		if (field614 != -1 && field615 != -1) {
			MHWTJCHJ var2 = MHWTJCHJ.field839[field614];
			RMLAXPMV var3 = var2.method367();
			if (var3 != null) {
				RMLAXPMV var4 = new RMLAXPMV(var3, XMRZESBN.method586(field615), true, false);
				var4.method479(0, 0, -field618);
				var4.method473();
				var4.method474(var2.field843.field759[field615]);
				var4.field1170 = null;
				var4.field1169 = null;

				if (var2.field846 != 128 || var2.field847 != 128) {
					var4.method482(var2.field847, var2.field846, var2.field846);
				}

				var4.method483(var2.field849 + 64, var2.field850 + 850, -30, -50, -30, true);
				RMLAXPMV[] var5 = new RMLAXPMV[] { var1, var4 };
				var1 = new RMLAXPMV(2, true, var5);
			}
		}

		if (field807 != null) {
			if (client.field322 >= field803) {
				field807 = null;
			}

			if (client.field322 >= field802 && client.field322 < field803) {
				RMLAXPMV var6 = field807;
				var6.method479(field806 - field594, field804 - field593, field805 - field787);

				if (field603 == 512) {
					var6.method477();
					var6.method477();
					var6.method477();
				} else if (field603 == 1024) {
					var6.method477();
					var6.method477();
				} else if (field603 == 1536) {
					var6.method477();
				}

				RMLAXPMV[] var7 = new RMLAXPMV[] { var1, var6 };
				var1 = new RMLAXPMV(2, true, var7);

				if (field603 == 512) {
					var6.method477();
				} else if (field603 == 1024) {
					var6.method477();
					var6.method477();
				} else if (field603 == 1536) {
					var6.method477();
					var6.method477();
					var6.method477();
				}

				var6.method479(field594 - field806, field593 - field804, field787 - field805);
			}
		}

		var1.field1171 = true;
		return var1;
	}

	@ObfuscatedName("KZCOXKKW.c(I)LRMLAXPMV;")
	public final RMLAXPMV method353() {
		if (field792 != null) {
			int var1 = -1;
			if (field585 >= 0 && field588 == 0) {
				var1 = JZQVOFSF.field757[field585].field759[field586];
			} else if (field609 >= 0) {
				var1 = JZQVOFSF.field757[field609].field759[field610];
			}

			return field792.method593(null, var1, -1);
		}

		long var3 = field801;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field585 >= 0 && field588 == 0) {
			JZQVOFSF var9 = JZQVOFSF.field757[field585];
			var5 = var9.field759[field586];

			if (field609 >= 0 && field609 != field583) {
				var6 = JZQVOFSF.field757[field609].field759[field610];
			}

			if (var9.field766 >= 0) {
				var7 = var9.field766;
				var3 += var7 - field785[5] << 40;
			}

			if (var9.field767 >= 0) {
				var8 = var9.field767;
				var3 += var8 - field785[3] << 48;
			}
		} else if (field609 >= 0) {
			var5 = JZQVOFSF.field757[field609].field759[field610];
		}

		RMLAXPMV var10 = (RMLAXPMV) field788.method32(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field785[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !GLRCYUHA.field625[var13 - 256].method312()) {
					var11 = true;
				}

				if (var13 >= 512 && !QSAFIBMX.method455(var13 - 512).method454(field793)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field794 != -1L) {
					var10 = (RMLAXPMV) field788.method32(field794);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			RMLAXPMV[] var14 = new RMLAXPMV[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field785[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					RMLAXPMV var18 = GLRCYUHA.field625[var17 - 256].method313();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					RMLAXPMV var19 = QSAFIBMX.method455(var17 - 512).method453(field793);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new RMLAXPMV(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field790[var20] != 0) {
					var10.method480(client.field336[var20][0], client.field336[var20][field790[var20]]);

					if (var20 == 1) {
						var10.method480(client.field420[0], client.field420[field790[var20]]);
					}
				}
			}

			var10.method473();
			var10.method483(64, 850, -30, -50, -30, true);
			field788.method33(var3, var10);
			field794 = var3;
		}

		if (field808) {
			return var10;
		}

		RMLAXPMV var21 = RMLAXPMV.field1134;
		var21.method468(XMRZESBN.method586(var5) & XMRZESBN.method586(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method475(var6, var5, JZQVOFSF.field757[field585].field763);
		} else if (var5 != -1) {
			var21.method474(var5);
		}

		var21.method470();
		var21.field1170 = null;
		var21.field1169 = null;
		return var21;
	}

	@ObfuscatedName("KZCOXKKW.a(ZLBSNPYLEV;)V")
	public final void method354(BSNPYLEV arg0) {
		arg0.field55 = 0;
		field793 = arg0.method47();
		field789 = arg0.method48();
		field784 = arg0.method48();
		field792 = null;
		field791 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method47();
			if (var3 == 0) {
				field785[var2] = 0;
			} else {
				int var4 = arg0.method47();
				field785[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field785[0] == 0xFFFF) {
					field792 = YSYPMZMO.method597(arg0.method49());
					break;
				}

				if (field785[var2] >= 512 && field785[var2] - 512 < QSAFIBMX.field1061) {
					int var5 = QSAFIBMX.method455(field785[var2] - 512).field1067;
					if (var5 != 0) {
						field791 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method47();
			if (var7 < 0 || var7 >= client.field336[var6].length) {
				var7 = 0;
			}

			field790[var6] = var7;
		}

		field583 = arg0.method49();
		if (field583 == 0xFFFF) {
			field583 = -1;
		}

		field584 = arg0.method49();
		if (field584 == 0xFFFF) {
			field584 = -1;
		}

		field570 = arg0.method49();
		if (field570 == 0xFFFF) {
			field570 = -1;
		}

		field571 = arg0.method49();
		if (field571 == 0xFFFF) {
			field571 = -1;
		}

		field572 = arg0.method49();
		if (field572 == 0xFFFF) {
			field572 = -1;
		}

		field573 = arg0.method49();
		if (field573 == 0xFFFF) {
			field573 = -1;
		}

		field613 = arg0.method49();
		if (field613 == 0xFFFF) {
			field613 = -1;
		}

		field786 = SFBUQEXP.method509(SFBUQEXP.method506(arg0.method53()));
		field795 = arg0.method47();
		field800 = arg0.method49();
		field783 = true;
		field801 = 0L;
		int var8 = field785[5];
		int var9 = field785[9];
		field785[5] = var9;
		field785[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field801 <<= 4;
			if (field785[var10] >= 256) {
				field801 += field785[var10] - 256;
			}
		}

		if (field785[0] >= 256) {
			field801 += field785[0] - 256 >> 4;
		}

		if (field785[1] >= 256) {
			field801 += field785[1] - 256 >> 8;
		}

		field785[5] = var8;
		field785[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field801 <<= 3;
			field801 += field790[var11];
		}

		field801 <<= 1;
		field801 += field793;
	}
}
