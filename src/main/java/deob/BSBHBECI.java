package deob;

@ObfuscatedName("BSBHBECI")
public final class BSBHBECI {

	@ObfuscatedName("BSBHBECI.D")
	public int field40 = -1;

	@ObfuscatedName("BSBHBECI.b")
	public static QXKQGEKL field15 = new QXKQGEKL(50);

	@ObfuscatedName("BSBHBECI.f")
	public static boolean field19 = true;

	@ObfuscatedName("BSBHBECI.k")
	public static QXKQGEKL field23 = new QXKQGEKL(100);

	@ObfuscatedName("BSBHBECI.q")
	public byte field29;

	@ObfuscatedName("BSBHBECI.C")
	public byte field39;

	@ObfuscatedName("BSBHBECI.a")
	public int field14;

	@ObfuscatedName("BSBHBECI.g")
	public int field20;

	@ObfuscatedName("BSBHBECI.h")
	public int field21;

	@ObfuscatedName("BSBHBECI.l")
	public int field24;

	@ObfuscatedName("BSBHBECI.m")
	public int field25;

	@ObfuscatedName("BSBHBECI.o")
	public int field27;

	@ObfuscatedName("BSBHBECI.p")
	public int field28;

	@ObfuscatedName("BSBHBECI.r")
	public int field30;

	@ObfuscatedName("BSBHBECI.s")
	public int field31;

	@ObfuscatedName("BSBHBECI.v")
	public int field32;

	@ObfuscatedName("BSBHBECI.w")
	public int field33;

	@ObfuscatedName("BSBHBECI.A")
	public int field37;

	@ObfuscatedName("BSBHBECI.B")
	public int field38;

	@ObfuscatedName("BSBHBECI.E")
	public int field41;

	@ObfuscatedName("BSBHBECI.G")
	public static int field43;

	@ObfuscatedName("BSBHBECI.H")
	public int field44;

	@ObfuscatedName("BSBHBECI.I")
	public int field45;

	@ObfuscatedName("BSBHBECI.K")
	public int field46;

	@ObfuscatedName("BSBHBECI.L")
	public int field47;

	@ObfuscatedName("BSBHBECI.M")
	public int field48;

	@ObfuscatedName("BSBHBECI.N")
	public int field49;

	@ObfuscatedName("BSBHBECI.O")
	public int field50;

	@ObfuscatedName("BSBHBECI.P")
	public int field51;

	@ObfuscatedName("BSBHBECI.Q")
	public int field52;

	@ObfuscatedName("BSBHBECI.R")
	public static int field53;

	@ObfuscatedName("BSBHBECI.V")
	public int field57;

	@ObfuscatedName("BSBHBECI.X")
	public int field59;

	@ObfuscatedName("BSBHBECI.Y")
	public int field60;

	@ObfuscatedName("BSBHBECI.ab")
	public int field61;

	@ObfuscatedName("BSBHBECI.c")
	public static RGCGKKUR field16;

	@ObfuscatedName("BSBHBECI.T")
	public String field55;

	@ObfuscatedName("BSBHBECI.d")
	public boolean field17;

	@ObfuscatedName("BSBHBECI.F")
	public boolean field42;

	@ObfuscatedName("BSBHBECI.z")
	public byte[] field36;

	@ObfuscatedName("BSBHBECI.e")
	public static int[] field18;

	@ObfuscatedName("BSBHBECI.n")
	public int[] field26;

	@ObfuscatedName("BSBHBECI.S")
	public int[] field54;

	@ObfuscatedName("BSBHBECI.U")
	public int[] field56;

	@ObfuscatedName("BSBHBECI.W")
	public int[] field58;

	@ObfuscatedName("BSBHBECI.i")
	public static BSBHBECI[] field22;

	@ObfuscatedName("BSBHBECI.x")
	public String[] field34;

	@ObfuscatedName("BSBHBECI.y")
	public String[] field35;

	@ObfuscatedName("BSBHBECI.a(II)LNGYJLUVS;")
	public final NGYJLUVS method17(int arg0) {
		if (field58 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field26[var3] && field26[var3] != 0) {
					var2 = field58[var3];
				}
			}

			if (var2 != -1) {
				return method22(var2).method17(1);
			}
		}

		NGYJLUVS var4 = NGYJLUVS.method291(field31);
		if (var4 == null) {
			return null;
		}

		if (field54 != null) {
			for (int var5 = 0; var5 < field54.length; var5++) {
				var4.method305(field54[var5], field56[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("BSBHBECI.b(II)Z")
	public final boolean method18(int arg0) {
		int var2 = field60;
		int var3 = field28;
		int var4 = field48;
		if (arg0 == 1) {
			var2 = field41;
			var3 = field24;
			var4 = field46;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!NGYJLUVS.method292(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !NGYJLUVS.method292(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !NGYJLUVS.method292(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("BSBHBECI.a()V")
	public final void method19() {
		field31 = 0;
		field55 = null;
		field36 = null;
		field54 = null;
		field56 = null;
		field32 = 2000;
		field47 = 0;
		field61 = 0;
		field27 = 0;
		field50 = 0;
		field45 = 0;
		field21 = -1;
		field42 = false;
		field57 = 1;
		field17 = false;
		field34 = null;
		field35 = null;
		field60 = -1;
		field28 = -1;
		field39 = 0;
		field41 = -1;
		field24 = -1;
		field29 = 0;
		field48 = -1;
		field46 = -1;
		field59 = -1;
		field37 = -1;
		field51 = -1;
		field52 = -1;
		field58 = null;
		field26 = null;
		field20 = -1;
		field30 = -1;
		field49 = 128;
		field25 = 128;
		field33 = 128;
		field14 = 0;
		field38 = 0;
		field44 = 0;
	}

	@ObfuscatedName("BSBHBECI.a(BI)LNGYJLUVS;")
	public final NGYJLUVS method20(int arg0) {
		int var2 = field60;
		int var3 = field28;
		int var4 = field48;
		if (arg0 == 1) {
			var2 = field41;
			var3 = field24;
			var4 = field46;
		}

		if (var2 == -1) {
			return null;
		}

		NGYJLUVS var5 = NGYJLUVS.method291(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				NGYJLUVS var9 = NGYJLUVS.method291(var3);
				NGYJLUVS[] var10 = new NGYJLUVS[] { var5, var9 };
				var5 = new NGYJLUVS(var10, 2);
			} else {
				NGYJLUVS var6 = NGYJLUVS.method291(var3);
				NGYJLUVS var7 = NGYJLUVS.method291(var4);
				NGYJLUVS[] var8 = new NGYJLUVS[] { var5, var6, var7 };
				var5 = new NGYJLUVS(var8, 3);
			}
		}

		if (arg0 == 0 && field39 != 0) {
			var5.method304(0, field39, 0);
		}

		if (arg0 == 1 && field29 != 0) {
			var5.method304(0, field29, 0);
		}

		if (field54 != null) {
			for (int var11 = 0; var11 < field54.length; var11++) {
				var5.method305(field54[var11], field56[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("BSBHBECI.a(IZ)Z")
	public final boolean method21(int arg0) {
		int var2 = field59;
		int var3 = field37;
		if (arg0 == 1) {
			var2 = field51;
			var3 = field52;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!NGYJLUVS.method292(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !NGYJLUVS.method292(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("BSBHBECI.a(I)LBSBHBECI;")
	public static final BSBHBECI method22(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field22[var1].field40 == arg0) {
				return field22[var1];
			}
		}

		field53 = (field53 + 1) % 10;
		BSBHBECI var2 = field22[field53];
		field16.field1350 = field18[arg0];
		var2.field40 = arg0;
		var2.method19();
		var2.method28(field16);

		if (var2.field30 != -1) {
			var2.method23();
		}

		if (!field19 && var2.field17) {
			var2.field55 = "Members Object";
			var2.field36 = "Login to a members' server to use this object.".getBytes();
			var2.field34 = null;
			var2.field35 = null;
			var2.field44 = 0;
		}

		return var2;
	}

	@ObfuscatedName("BSBHBECI.b(I)V")
	public void method23() {
		BSBHBECI var1 = method22(field30);
		field31 = var1.field31;
		field32 = var1.field32;
		field47 = var1.field47;
		field61 = var1.field61;
		field27 = var1.field27;
		field50 = var1.field50;
		field45 = var1.field45;
		field54 = var1.field54;
		field56 = var1.field56;
		BSBHBECI var2 = method22(field20);
		field55 = var2.field55;
		field17 = var2.field17;
		field57 = var2.field57;
		String var3 = "a";
		char var4 = var2.field55.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field36 = ("Swap this note at any bank for " + var3 + " " + var2.field55 + ".").getBytes();
		field42 = true;
	}

	@ObfuscatedName("BSBHBECI.c(II)LNGYJLUVS;")
	public final NGYJLUVS method24(int arg0) {
		int var2 = field59;
		int var3 = field37;
		if (arg0 == 1) {
			var2 = field51;
			var3 = field52;
		}

		if (var2 == -1) {
			return null;
		}

		NGYJLUVS var4 = NGYJLUVS.method291(var2);
		if (var3 != -1) {
			NGYJLUVS var5 = NGYJLUVS.method291(var3);
			NGYJLUVS[] var6 = new NGYJLUVS[] { var4, var5 };
			var4 = new NGYJLUVS(var6, 2);
		}

		if (field54 != null) {
			for (int var7 = 0; var7 < field54.length; var7++) {
				var4.method305(field54[var7], field56[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("BSBHBECI.a(LESUFCMYV;)V")
	public static final void method25(ESUFCMYV arg0) {
		field16 = new RGCGKKUR(arg0.method205("obj.dat", null));
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("obj.idx", null));
		field43 = var1.method457();
		field18 = new int[field43];
		int var2 = 2;
		for (int var3 = 0; var3 < field43; var3++) {
			field18[var3] = var2;
			var2 += var1.method457();
		}

		field22 = new BSBHBECI[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field22[var4] = new BSBHBECI();
		}
	}

	@ObfuscatedName("BSBHBECI.a(IZII)LZSWNSCUQ;")
	public static final ZSWNSCUQ method26(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			ZSWNSCUQ var3 = (ZSWNSCUQ) field23.method440(arg2);
			if (var3 != null && var3.field1517 != arg0 && var3.field1517 != -1) {
				var3.method505();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		BSBHBECI var4 = method22(arg2);
		if (var4.field58 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field26[var6] && var4.field26[var6] != 0) {
					var5 = var4.field58[var6];
				}
			}

			if (var5 != -1) {
				var4 = method22(var5);
			}
		}

		NGYJLUVS var7 = var4.method27(1);
		if (var7 == null) {
			return null;
		}

		ZSWNSCUQ var8 = null;
		if (var4.field30 != -1) {
			var8 = method26(10, -1, var4.field20);
			if (var8 == null) {
				return null;
			}
		}

		ZSWNSCUQ var9 = new ZSWNSCUQ(32, 32);
		int var10 = DABPNVTX.field513;
		int var11 = DABPNVTX.field514;
		int[] var12 = DABPNVTX.field519;
		int[] var13 = WNEQSCWL.field1452;
		int var14 = WNEQSCWL.field1453;
		int var15 = WNEQSCWL.field1454;
		int var16 = WNEQSCWL.field1457;
		int var17 = WNEQSCWL.field1458;
		int var18 = WNEQSCWL.field1455;
		int var19 = WNEQSCWL.field1456;
		DABPNVTX.field511 = false;
		WNEQSCWL.method568(var9.field1511, 32, 32);
		WNEQSCWL.method573(0, 0, 0, 32, 32);
		DABPNVTX.method186();
		int var20 = var4.field32;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = DABPNVTX.field517[var4.field47] * var20 >> 16;
		int var22 = DABPNVTX.field518[var4.field47] * var20 >> 16;
		var7.method312(0, var4.field61, var4.field27, var4.field47, var4.field50, var7.field845 / 2 + var21 + var4.field45, var4.field45 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1511[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1511[var24 * 32 + var23 - 1] > 1) {
						var9.field1511[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1511[(var24 - 1) * 32 + var23] > 1) {
						var9.field1511[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1511[var24 * 32 + var23 + 1] > 1) {
						var9.field1511[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1511[(var24 + 1) * 32 + var23] > 1) {
						var9.field1511[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1511[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1511[var26 * 32 + var25 - 1] == 1) {
							var9.field1511[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1511[(var26 - 1) * 32 + var25] == 1) {
							var9.field1511[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1511[var26 * 32 + var25 + 1] == 1) {
							var9.field1511[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1511[(var26 + 1) * 32 + var25] == 1) {
							var9.field1511[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1511[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1511[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1511[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field30 != -1) {
			int var29 = var8.field1516;
			int var30 = var8.field1517;
			var8.field1516 = 32;
			var8.field1517 = 32;
			var8.method596(0, 0);
			var8.field1516 = var29;
			var8.field1517 = var30;
		}

		if (arg1 == 0) {
			field23.method441(arg2, var9);
		}

		WNEQSCWL.method568(var13, var14, var15);
		WNEQSCWL.method570(var16, var19, var17, var18);
		DABPNVTX.field513 = var10;
		DABPNVTX.field514 = var11;
		DABPNVTX.field519 = var12;
		DABPNVTX.field511 = true;

		if (var4.field42) {
			var9.field1516 = 33;
		} else {
			var9.field1516 = 32;
		}

		var9.field1517 = arg0;
		return var9;
	}

	@ObfuscatedName("BSBHBECI.c(I)LNGYJLUVS;")
	public final NGYJLUVS method27(int arg0) {
		if (field58 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field26[var3] && field26[var3] != 0) {
					var2 = field58[var3];
				}
			}

			if (var2 != -1) {
				return method22(var2).method27(1);
			}
		}

		NGYJLUVS var4 = (NGYJLUVS) field15.method440(field40);
		if (var4 != null) {
			return var4;
		}

		NGYJLUVS var5 = NGYJLUVS.method291(field31);
		if (var5 == null) {
			return null;
		}

		if (field49 != 128 || field25 != 128 || field33 != 128) {
			var5.method307(field33, field49, field25);
		}

		if (field54 != null) {
			for (int var6 = 0; var6 < field54.length; var6++) {
				var5.method305(field54[var6], field56[var6]);
			}
		}

		var5.method308(field14 + 64, field38 + 768, -50, -10, -50, true);
		var5.field892 = true;
		field15.method441(field40, var5);
		return var5;
	}

	@ObfuscatedName("BSBHBECI.a(ILRGCGKKUR;)V")
	public final void method28(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field31 = arg0.method457();
			} else if (var2 == 2) {
				field55 = arg0.method462();
			} else if (var2 == 3) {
				field36 = arg0.method463();
			} else if (var2 == 4) {
				field32 = arg0.method457();
			} else if (var2 == 5) {
				field47 = arg0.method457();
			} else if (var2 == 6) {
				field61 = arg0.method457();
			} else if (var2 == 7) {
				field50 = arg0.method457();
				if (field50 > 32767) {
					field50 -= 0x10000;
				}
			} else if (var2 == 8) {
				field45 = arg0.method457();
				if (field45 > 32767) {
					field45 -= 0x10000;
				}
			} else if (var2 == 10) {
				field21 = arg0.method457();
			} else if (var2 == 11) {
				field42 = true;
			} else if (var2 == 12) {
				field57 = arg0.method460();
			} else if (var2 == 16) {
				field17 = true;
			} else if (var2 == 23) {
				field60 = arg0.method457();
				field39 = arg0.method456();
			} else if (var2 == 24) {
				field28 = arg0.method457();
			} else if (var2 == 25) {
				field41 = arg0.method457();
				field29 = arg0.method456();
			} else if (var2 == 26) {
				field24 = arg0.method457();
			} else if (var2 >= 30 && var2 < 35) {
				if (field34 == null) {
					field34 = new String[5];
				}

				field34[var2 - 30] = arg0.method462();
				if (field34[var2 - 30].equalsIgnoreCase("hidden")) {
					field34[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field35 == null) {
					field35 = new String[5];
				}

				field35[var2 - 35] = arg0.method462();
			} else if (var2 == 40) {
				int var3 = arg0.method455();
				field54 = new int[var3];
				field56 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field54[var4] = arg0.method457();
					field56[var4] = arg0.method457();
				}
			} else if (var2 == 78) {
				field48 = arg0.method457();
			} else if (var2 == 79) {
				field46 = arg0.method457();
			} else if (var2 == 90) {
				field59 = arg0.method457();
			} else if (var2 == 91) {
				field51 = arg0.method457();
			} else if (var2 == 92) {
				field37 = arg0.method457();
			} else if (var2 == 93) {
				field52 = arg0.method457();
			} else if (var2 == 95) {
				field27 = arg0.method457();
			} else if (var2 == 97) {
				field20 = arg0.method457();
			} else if (var2 == 98) {
				field30 = arg0.method457();
			} else if (var2 >= 100 && var2 < 110) {
				if (field58 == null) {
					field58 = new int[10];
					field26 = new int[10];
				}

				field58[var2 - 100] = arg0.method457();
				field26[var2 - 100] = arg0.method457();
			} else if (var2 == 110) {
				field49 = arg0.method457();
			} else if (var2 == 111) {
				field25 = arg0.method457();
			} else if (var2 == 112) {
				field33 = arg0.method457();
			} else if (var2 == 113) {
				field14 = arg0.method456();
			} else if (var2 == 114) {
				field38 = arg0.method456() * 5;
			} else if (var2 == 115) {
				field44 = arg0.method455();
			}
		}
	}

	@ObfuscatedName("BSBHBECI.d(I)V")
	public static final void method29() {
		field15 = null;
		field23 = null;
		field18 = null;
		field22 = null;
		field16 = null;
	}
}
