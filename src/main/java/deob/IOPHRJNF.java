package deob;

@ObfuscatedName("IOPHRJNF")
public final class IOPHRJNF extends HCCLTVPO {

	@ObfuscatedName("IOPHRJNF.ub")
	public int field799 = -1;

	@ObfuscatedName("IOPHRJNF.Cb")
	public int field805 = -1;

	@ObfuscatedName("IOPHRJNF.Db")
	public int[] field806 = new int[12];

	@ObfuscatedName("IOPHRJNF.Eb")
	public long field807 = -1L;

	@ObfuscatedName("IOPHRJNF.Lb")
	public boolean field814 = false;

	@ObfuscatedName("IOPHRJNF.Mb")
	public int[] field815 = new int[5];

	@ObfuscatedName("IOPHRJNF.Qb")
	public boolean field818 = false;

	@ObfuscatedName("IOPHRJNF.sb")
	public static RYXFUVWJ field797 = new RYXFUVWJ(260);

	@ObfuscatedName("IOPHRJNF.rb")
	public int field796;

	@ObfuscatedName("IOPHRJNF.tb")
	public int field798;

	@ObfuscatedName("IOPHRJNF.vb")
	public int field800;

	@ObfuscatedName("IOPHRJNF.xb")
	public int field801;

	@ObfuscatedName("IOPHRJNF.yb")
	public int field802;

	@ObfuscatedName("IOPHRJNF.zb")
	public int field803;

	@ObfuscatedName("IOPHRJNF.Hb")
	public int field810;

	@ObfuscatedName("IOPHRJNF.Ib")
	public int field811;

	@ObfuscatedName("IOPHRJNF.Jb")
	public int field812;

	@ObfuscatedName("IOPHRJNF.Kb")
	public int field813;

	@ObfuscatedName("IOPHRJNF.Ob")
	public int field816;

	@ObfuscatedName("IOPHRJNF.Pb")
	public int field817;

	@ObfuscatedName("IOPHRJNF.Sb")
	public int field820;

	@ObfuscatedName("IOPHRJNF.Ub")
	public int field821;

	@ObfuscatedName("IOPHRJNF.Gb")
	public long field809;

	@ObfuscatedName("IOPHRJNF.Fb")
	public SHKUIFHF field808;

	@ObfuscatedName("IOPHRJNF.Ab")
	public XBVYIDUH field804;

	@ObfuscatedName("IOPHRJNF.Rb")
	public String field819;

	@ObfuscatedName("IOPHRJNF.b(Z)LXBVYIDUH;")
	public final XBVYIDUH method319() {
		if (field808 != null) {
			int var1 = -1;
			if (field741 >= 0 && field744 == 0) {
				var1 = SPUHKLMC.field1176[field741].field1178[field742];
			} else if (field752 >= 0) {
				var1 = SPUHKLMC.field1176[field752].field1178[field753];
			}

			return field808.method502(-1, var1, null);
		}

		long var3 = field809;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field741 >= 0 && field744 == 0) {
			SPUHKLMC var9 = SPUHKLMC.field1176[field741];
			var5 = var9.field1178[field742];

			if (field752 >= 0 && field752 != field734) {
				var6 = SPUHKLMC.field1176[field752].field1178[field753];
			}

			if (var9.field1185 >= 0) {
				var7 = var9.field1185;
				var3 += var7 - field806[5] << 40;
			}

			if (var9.field1186 >= 0) {
				var8 = var9.field1186;
				var3 += var8 - field806[3] << 48;
			}
		} else if (field752 >= 0) {
			var5 = SPUHKLMC.field1176[field752].field1178[field753];
		}

		XBVYIDUH var10 = (XBVYIDUH) field797.method495(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field806[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !OQTNTOVY.field944[var13 - 256].method365()) {
					var11 = true;
				}

				if (var13 >= 512 && !RBNCRAAP.method456(var13 - 512).method460(field820)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field807 != -1L) {
					var10 = (XBVYIDUH) field797.method495(field807);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			XBVYIDUH[] var14 = new XBVYIDUH[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field806[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					XBVYIDUH var18 = OQTNTOVY.field944[var17 - 256].method366();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					XBVYIDUH var19 = RBNCRAAP.method456(var17 - 512).method450(field820);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new XBVYIDUH(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field815[var20] != 0) {
					var10.method555(client.field505[var20][0], client.field505[var20][field815[var20]]);

					if (var20 == 1) {
						var10.method555(client.field233[0], client.field233[field815[var20]]);
					}
				}
			}

			var10.method548();
			var10.method558(64, 850, -30, -50, -30, true);
			field797.method496(var10, var3);
			field807 = var3;
		}

		if (field814) {
			return var10;
		}

		XBVYIDUH var21 = XBVYIDUH.field1348;
		var21.method543(var10, BKYAWERN.method115(var5) & BKYAWERN.method115(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method550(var6, var5, SPUHKLMC.field1176[field741].field1182);
		} else if (var5 != -1) {
			var21.method549(var5);
		}

		var21.method545();
		var21.field1384 = null;
		var21.field1383 = null;
		return var21;
	}

	@ObfuscatedName("IOPHRJNF.a(B)LXBVYIDUH;")
	public final XBVYIDUH method39() {
		if (!field818) {
			return null;
		}

		XBVYIDUH var1 = method319();
		if (var1 == null) {
			return null;
		}

		field788 = var1.field878;
		var1.field1385 = true;

		if (field814) {
			return var1;
		}

		if (field760 != -1 && field761 != -1) {
			CRSWMDQF var2 = CRSWMDQF.field543[field760];
			XBVYIDUH var3 = var2.method299();
			if (var3 != null) {
				XBVYIDUH var4 = new XBVYIDUH(BKYAWERN.method115(field761), true, false, var3);
				var4.method554(0, 0, -field764);
				var4.method548();
				var4.method549(var2.field547.field1178[field761]);
				var4.field1384 = null;
				var4.field1383 = null;

				if (var2.field550 != 128 || var2.field551 != 128) {
					var4.method557(var2.field551, var2.field550, var2.field550);
				}

				var4.method558(var2.field553 + 64, var2.field554 + 850, -30, -50, -30, true);
				XBVYIDUH[] var5 = new XBVYIDUH[] { var1, var4 };
				var1 = new XBVYIDUH(true, 2, var5);
			}
		}

		if (field804 != null) {
			if (client.field459 >= field817) {
				field804 = null;
			}

			if (client.field459 >= field816 && client.field459 < field817) {
				XBVYIDUH var6 = field804;
				var6.method554(field803 - field757, field801 - field756, field802 - field798);

				if (field774 == 512) {
					var6.method552();
					var6.method552();
					var6.method552();
				} else if (field774 == 1024) {
					var6.method552();
					var6.method552();
				} else if (field774 == 1536) {
					var6.method552();
				}

				XBVYIDUH[] var7 = new XBVYIDUH[] { var1, var6 };
				var1 = new XBVYIDUH(true, 2, var7);

				if (field774 == 512) {
					var6.method552();
				} else if (field774 == 1024) {
					var6.method552();
					var6.method552();
				} else if (field774 == 1536) {
					var6.method552();
					var6.method552();
					var6.method552();
				}

				var6.method554(field757 - field803, field756 - field801, field798 - field802);
			}
		}

		var1.field1385 = true;
		return var1;
	}

	@ObfuscatedName("IOPHRJNF.c(Z)LXBVYIDUH;")
	public final XBVYIDUH method320() {
		if (!field818) {
			return null;
		}

		if (field808 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field806[var2];
				if (var3 >= 256 && var3 < 512 && !OQTNTOVY.field944[var3 - 256].method367()) {
					var1 = true;
				}

				if (var3 >= 512 && !RBNCRAAP.method456(var3 - 512).method455(field820)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			XBVYIDUH[] var4 = new XBVYIDUH[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field806[var6];
				if (var7 >= 256 && var7 < 512) {
					XBVYIDUH var8 = OQTNTOVY.field944[var7 - 256].method368();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					XBVYIDUH var9 = RBNCRAAP.method456(var7 - 512).method448(field820);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			XBVYIDUH var10 = new XBVYIDUH(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field815[var11] != 0) {
					var10.method555(client.field505[var11][0], client.field505[var11][field815[var11]]);

					if (var11 == 1) {
						var10.method555(client.field233[0], client.field233[field815[var11]]);
					}
				}
			}

			return var10;
		}

		return field808.method499();
	}

	@ObfuscatedName("IOPHRJNF.a(I)Z")
	public final boolean method41() {
		if (!field818) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("IOPHRJNF.a(BLBFQIDHPO;)V")
	public final void method321(BFQIDHPO arg0) {
		arg0.field10 = 0;
		field820 = arg0.method54();
		field799 = arg0.method55();
		field805 = arg0.method55();
		field808 = null;
		field796 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method54();
			if (var3 == 0) {
				field806[var2] = 0;
			} else {
				int var4 = arg0.method54();
				field806[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field806[0] == 0xFFFF) {
					field808 = SHKUIFHF.method501(arg0.method56());
					break;
				}

				if (field806[var2] >= 512 && field806[var2] - 512 < RBNCRAAP.field1094) {
					int var5 = RBNCRAAP.method456(field806[var2] - 512).field1079;
					if (var5 != 0) {
						field796 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method54();
			if (var7 < 0 || var7 >= client.field505[var6].length) {
				var7 = 0;
			}

			field815[var6] = var7;
		}

		field734 = arg0.method56();
		if (field734 == 0xFFFF) {
			field734 = -1;
		}

		field735 = arg0.method56();
		if (field735 == 0xFFFF) {
			field735 = -1;
		}

		field736 = arg0.method56();
		if (field736 == 0xFFFF) {
			field736 = -1;
		}

		field737 = arg0.method56();
		if (field737 == 0xFFFF) {
			field737 = -1;
		}

		field738 = arg0.method56();
		if (field738 == 0xFFFF) {
			field738 = -1;
		}

		field739 = arg0.method56();
		if (field739 == 0xFFFF) {
			field739 = -1;
		}

		field778 = arg0.method56();
		if (field778 == 0xFFFF) {
			field778 = -1;
		}

		field819 = JQPXVJFJ.method327(JQPXVJFJ.method324(arg0.method60()));
		field821 = arg0.method54();
		field800 = arg0.method56();
		field818 = true;
		field809 = 0L;
		int var8 = field806[5];
		int var9 = field806[9];
		field806[5] = var9;
		field806[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field809 <<= 4;
			if (field806[var10] >= 256) {
				field809 += field806[var10] - 256;
			}
		}

		if (field806[0] >= 256) {
			field809 += field806[0] - 256 >> 4;
		}

		if (field806[1] >= 256) {
			field809 += field806[1] - 256 >> 8;
		}

		field806[5] = var8;
		field806[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field809 <<= 3;
			field809 += field815[var11];
		}

		field809 <<= 1;
		field809 += field820;
	}
}
