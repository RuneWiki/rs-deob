package deob;

@ObfuscatedName("AVSLDGMK")
public final class AVSLDGMK {

	@ObfuscatedName("AVSLDGMK.D")
	public int field30 = -1;

	@ObfuscatedName("AVSLDGMK.k")
	public static boolean field13 = true;

	@ObfuscatedName("AVSLDGMK.t")
	public static HGKRJZKS field22 = new HGKRJZKS(50);

	@ObfuscatedName("AVSLDGMK.H")
	public static HGKRJZKS field34 = new HGKRJZKS(100);

	@ObfuscatedName("AVSLDGMK.S")
	public byte field43;

	@ObfuscatedName("AVSLDGMK.T")
	public byte field44;

	@ObfuscatedName("AVSLDGMK.h")
	public int field10;

	@ObfuscatedName("AVSLDGMK.i")
	public int field11;

	@ObfuscatedName("AVSLDGMK.n")
	public int field16;

	@ObfuscatedName("AVSLDGMK.o")
	public int field17;

	@ObfuscatedName("AVSLDGMK.p")
	public int field18;

	@ObfuscatedName("AVSLDGMK.s")
	public static int field21;

	@ObfuscatedName("AVSLDGMK.w")
	public int field25;

	@ObfuscatedName("AVSLDGMK.x")
	public int field26;

	@ObfuscatedName("AVSLDGMK.E")
	public int field31;

	@ObfuscatedName("AVSLDGMK.F")
	public int field32;

	@ObfuscatedName("AVSLDGMK.J")
	public int field35;

	@ObfuscatedName("AVSLDGMK.K")
	public int field36;

	@ObfuscatedName("AVSLDGMK.M")
	public int field37;

	@ObfuscatedName("AVSLDGMK.N")
	public int field38;

	@ObfuscatedName("AVSLDGMK.O")
	public int field39;

	@ObfuscatedName("AVSLDGMK.a")
	public int field4;

	@ObfuscatedName("AVSLDGMK.P")
	public int field40;

	@ObfuscatedName("AVSLDGMK.Q")
	public int field41;

	@ObfuscatedName("AVSLDGMK.R")
	public int field42;

	@ObfuscatedName("AVSLDGMK.V")
	public int field46;

	@ObfuscatedName("AVSLDGMK.W")
	public int field47;

	@ObfuscatedName("AVSLDGMK.X")
	public int field48;

	@ObfuscatedName("AVSLDGMK.b")
	public static int field5;

	@ObfuscatedName("AVSLDGMK.Z")
	public int field50;

	@ObfuscatedName("AVSLDGMK.ab")
	public int field51;

	@ObfuscatedName("AVSLDGMK.c")
	public int field6;

	@ObfuscatedName("AVSLDGMK.d")
	public int field7;

	@ObfuscatedName("AVSLDGMK.e")
	public int field8;

	@ObfuscatedName("AVSLDGMK.g")
	public int field9;

	@ObfuscatedName("AVSLDGMK.l")
	public static GLMIQHJI field14;

	@ObfuscatedName("AVSLDGMK.G")
	public String field33;

	@ObfuscatedName("AVSLDGMK.A")
	public boolean field28;

	@ObfuscatedName("AVSLDGMK.Y")
	public boolean field49;

	@ObfuscatedName("AVSLDGMK.U")
	public byte[] field45;

	@ObfuscatedName("AVSLDGMK.j")
	public static int[] field12;

	@ObfuscatedName("AVSLDGMK.m")
	public int[] field15;

	@ObfuscatedName("AVSLDGMK.q")
	public int[] field19;

	@ObfuscatedName("AVSLDGMK.u")
	public int[] field23;

	@ObfuscatedName("AVSLDGMK.v")
	public int[] field24;

	@ObfuscatedName("AVSLDGMK.z")
	public static AVSLDGMK[] field27;

	@ObfuscatedName("AVSLDGMK.r")
	public String[] field20;

	@ObfuscatedName("AVSLDGMK.C")
	public String[] field29;

	@ObfuscatedName("AVSLDGMK.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method1(int arg0) {
		if (field24 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field23[var3] && field23[var3] != 0) {
					var2 = field24[var3];
				}
			}

			if (var2 != -1) {
				return method4(var2).method1(1);
			}
		}

		VHYCWIPJ var4 = (VHYCWIPJ) field22.method285(field30);
		if (var4 != null) {
			return var4;
		}

		VHYCWIPJ var5 = VHYCWIPJ.method500(field16);
		if (var5 == null) {
			return null;
		}

		if (field17 != 128 || field25 != 128 || field36 != 128) {
			var5.method516(field17, field36, field25);
		}

		if (field19 != null) {
			for (int var6 = 0; var6 < field19.length; var6++) {
				var5.method514(field19[var6], field15[var6]);
			}
		}

		var5.method517(field35 + 64, field50 + 768, -50, -10, -50, true);
		var5.field1211 = true;
		field22.method286(field30, var5);
		return var5;
	}

	@ObfuscatedName("AVSLDGMK.a(ZI)LVHYCWIPJ;")
	public final VHYCWIPJ method2(int arg0) {
		int var2 = field18;
		int var3 = field7;
		int var4 = field11;
		if (arg0 == 1) {
			var2 = field47;
			var3 = field38;
			var4 = field32;
		}

		if (var2 == -1) {
			return null;
		}

		VHYCWIPJ var5 = VHYCWIPJ.method500(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				VHYCWIPJ var9 = VHYCWIPJ.method500(var3);
				VHYCWIPJ[] var10 = new VHYCWIPJ[] { var5, var9 };
				var5 = new VHYCWIPJ(2, var10);
			} else {
				VHYCWIPJ var6 = VHYCWIPJ.method500(var3);
				VHYCWIPJ var7 = VHYCWIPJ.method500(var4);
				VHYCWIPJ[] var8 = new VHYCWIPJ[] { var5, var6, var7 };
				var5 = new VHYCWIPJ(3, var8);
			}
		}

		if (arg0 == 0 && field43 != 0) {
			var5.method513(0, 0, field43);
		}

		if (arg0 == 1 && field44 != 0) {
			var5.method513(0, 0, field44);
		}

		if (field19 != null) {
			for (int var11 = 0; var11 < field19.length; var11++) {
				var5.method514(field19[var11], field15[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("AVSLDGMK.b(I)V")
	public static final void method3() {
		field22 = null;
		field34 = null;
		field12 = null;
		field27 = null;
		field14 = null;
	}

	@ObfuscatedName("AVSLDGMK.c(I)LAVSLDGMK;")
	public static final AVSLDGMK method4(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field27[var1].field30 == arg0) {
				return field27[var1];
			}
		}

		field21 = (field21 + 1) % 10;
		AVSLDGMK var2 = field27[field21];
		field14.field709 = field12[arg0];
		var2.field30 = arg0;
		var2.method7();
		var2.method6(field14);

		if (var2.field40 != -1) {
			var2.method13();
		}

		if (!field13 && var2.field49) {
			var2.field33 = "Members Object";
			var2.field45 = "Login to a members' server to use this object.".getBytes();
			var2.field20 = null;
			var2.field29 = null;
			var2.field42 = 0;
		}

		return var2;
	}

	@ObfuscatedName("AVSLDGMK.a(BIII)LINVDQNJU;")
	public static final INVDQNJU method5(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			INVDQNJU var3 = (INVDQNJU) field34.method285(arg1);
			if (var3 != null && var3.field764 != arg2 && var3.field764 != -1) {
				var3.method555();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		AVSLDGMK var4 = method4(arg1);
		if (var4.field24 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field23[var6] && var4.field23[var6] != 0) {
					var5 = var4.field24[var6];
				}
			}

			if (var5 != -1) {
				var4 = method4(var5);
			}
		}

		VHYCWIPJ var7 = var4.method1(1);
		if (var7 == null) {
			return null;
		}

		INVDQNJU var8 = null;
		if (var4.field40 != -1) {
			var8 = method5(-1, var4.field26, 10);
			if (var8 == null) {
				return null;
			}
		}

		INVDQNJU var9 = new INVDQNJU(32, 32);
		int var10 = CUVGZBEX.field603;
		int var11 = CUVGZBEX.field604;
		int[] var12 = CUVGZBEX.field609;
		int[] var13 = TQHEKXXC.field1089;
		int var14 = TQHEKXXC.field1090;
		int var15 = TQHEKXXC.field1091;
		int var16 = TQHEKXXC.field1094;
		int var17 = TQHEKXXC.field1095;
		int var18 = TQHEKXXC.field1092;
		int var19 = TQHEKXXC.field1093;
		CUVGZBEX.field601 = false;
		TQHEKXXC.method473(32, 32, var9.field758);
		TQHEKXXC.method478(32, 0, 0, 0, 32);
		CUVGZBEX.method173();
		int var20 = var4.field4;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = CUVGZBEX.field607[var4.field9] * var20 >> 16;
		int var22 = CUVGZBEX.field608[var4.field9] * var20 >> 16;
		var7.method520(0, var4.field48, var4.field10, var4.field9, var4.field8, var7.field962 / 2 + var21 + var4.field6, var4.field6 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field758[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field758[var24 * 32 + var23 - 1] > 1) {
						var9.field758[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field758[(var24 - 1) * 32 + var23] > 1) {
						var9.field758[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field758[var24 * 32 + var23 + 1] > 1) {
						var9.field758[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field758[(var24 + 1) * 32 + var23] > 1) {
						var9.field758[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field758[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field758[var26 * 32 + var25 - 1] == 1) {
							var9.field758[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field758[(var26 - 1) * 32 + var25] == 1) {
							var9.field758[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field758[var26 * 32 + var25 + 1] == 1) {
							var9.field758[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field758[(var26 + 1) * 32 + var25] == 1) {
							var9.field758[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field758[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field758[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field758[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field40 != -1) {
			int var29 = var8.field763;
			int var30 = var8.field764;
			var8.field763 = 32;
			var8.field764 = 32;
			var8.method331(0, 0);
			var8.field763 = var29;
			var8.field764 = var30;
		}

		if (arg0 == 0) {
			field34.method286(arg1, var9);
		}

		TQHEKXXC.method473(var15, var14, var13);
		TQHEKXXC.method475(var16, var17, var19, var18);
		CUVGZBEX.field603 = var10;
		CUVGZBEX.field604 = var11;
		CUVGZBEX.field609 = var12;
		CUVGZBEX.field601 = true;

		if (var4.field28) {
			var9.field763 = 33;
		} else {
			var9.field763 = 32;
		}

		var9.field764 = arg2;
		return var9;
	}

	@ObfuscatedName("AVSLDGMK.a(BLGLMIQHJI;)V")
	public final void method6(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field16 = arg0.method246();
			} else if (var2 == 2) {
				field33 = arg0.method251();
			} else if (var2 == 3) {
				field45 = arg0.method252();
			} else if (var2 == 4) {
				field4 = arg0.method246();
			} else if (var2 == 5) {
				field9 = arg0.method246();
			} else if (var2 == 6) {
				field48 = arg0.method246();
			} else if (var2 == 7) {
				field8 = arg0.method246();
				if (field8 > 32767) {
					field8 -= 0x10000;
				}
			} else if (var2 == 8) {
				field6 = arg0.method246();
				if (field6 > 32767) {
					field6 -= 0x10000;
				}
			} else if (var2 == 10) {
				field41 = arg0.method246();
			} else if (var2 == 11) {
				field28 = true;
			} else if (var2 == 12) {
				field51 = arg0.method249();
			} else if (var2 == 16) {
				field49 = true;
			} else if (var2 == 23) {
				field18 = arg0.method246();
				field43 = arg0.method245();
			} else if (var2 == 24) {
				field7 = arg0.method246();
			} else if (var2 == 25) {
				field47 = arg0.method246();
				field44 = arg0.method245();
			} else if (var2 == 26) {
				field38 = arg0.method246();
			} else if (var2 >= 30 && var2 < 35) {
				if (field20 == null) {
					field20 = new String[5];
				}

				field20[var2 - 30] = arg0.method251();
				if (field20[var2 - 30].equalsIgnoreCase("hidden")) {
					field20[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field29 == null) {
					field29 = new String[5];
				}

				field29[var2 - 35] = arg0.method251();
			} else if (var2 == 40) {
				int var3 = arg0.method244();
				field19 = new int[var3];
				field15 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field19[var4] = arg0.method246();
					field15[var4] = arg0.method246();
				}
			} else if (var2 == 78) {
				field11 = arg0.method246();
			} else if (var2 == 79) {
				field32 = arg0.method246();
			} else if (var2 == 90) {
				field37 = arg0.method246();
			} else if (var2 == 91) {
				field31 = arg0.method246();
			} else if (var2 == 92) {
				field46 = arg0.method246();
			} else if (var2 == 93) {
				field39 = arg0.method246();
			} else if (var2 == 95) {
				field10 = arg0.method246();
			} else if (var2 == 97) {
				field26 = arg0.method246();
			} else if (var2 == 98) {
				field40 = arg0.method246();
			} else if (var2 >= 100 && var2 < 110) {
				if (field24 == null) {
					field24 = new int[10];
					field23 = new int[10];
				}

				field24[var2 - 100] = arg0.method246();
				field23[var2 - 100] = arg0.method246();
			} else if (var2 == 110) {
				field17 = arg0.method246();
			} else if (var2 == 111) {
				field25 = arg0.method246();
			} else if (var2 == 112) {
				field36 = arg0.method246();
			} else if (var2 == 113) {
				field35 = arg0.method245();
			} else if (var2 == 114) {
				field50 = arg0.method245() * 5;
			} else if (var2 == 115) {
				field42 = arg0.method244();
			}
		}
	}

	@ObfuscatedName("AVSLDGMK.a()V")
	public final void method7() {
		field16 = 0;
		field33 = null;
		field45 = null;
		field19 = null;
		field15 = null;
		field4 = 2000;
		field9 = 0;
		field48 = 0;
		field10 = 0;
		field8 = 0;
		field6 = 0;
		field41 = -1;
		field28 = false;
		field51 = 1;
		field49 = false;
		field20 = null;
		field29 = null;
		field18 = -1;
		field7 = -1;
		field43 = 0;
		field47 = -1;
		field38 = -1;
		field44 = 0;
		field11 = -1;
		field32 = -1;
		field37 = -1;
		field46 = -1;
		field31 = -1;
		field39 = -1;
		field24 = null;
		field23 = null;
		field26 = -1;
		field40 = -1;
		field17 = 128;
		field25 = 128;
		field36 = 128;
		field35 = 0;
		field50 = 0;
		field42 = 0;
	}

	@ObfuscatedName("AVSLDGMK.b(ZI)Z")
	public final boolean method8(int arg0) {
		int var2 = field37;
		int var3 = field46;
		if (arg0 == 1) {
			var2 = field31;
			var3 = field39;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!VHYCWIPJ.method501(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !VHYCWIPJ.method501(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("AVSLDGMK.a(II)LVHYCWIPJ;")
	public final VHYCWIPJ method9(int arg0) {
		int var2 = field37;
		int var3 = field46;
		if (arg0 == 1) {
			var2 = field31;
			var3 = field39;
		}

		if (var2 == -1) {
			return null;
		}

		VHYCWIPJ var4 = VHYCWIPJ.method500(var2);
		if (var3 != -1) {
			VHYCWIPJ var5 = VHYCWIPJ.method500(var3);
			VHYCWIPJ[] var6 = new VHYCWIPJ[] { var4, var5 };
			var4 = new VHYCWIPJ(2, var6);
		}

		if (field19 != null) {
			for (int var7 = 0; var7 < field19.length; var7++) {
				var4.method514(field19[var7], field15[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AVSLDGMK.a(BI)Z")
	public final boolean method10(int arg0) {
		int var2 = field18;
		int var3 = field7;
		int var4 = field11;
		if (arg0 == 1) {
			var2 = field47;
			var3 = field38;
			var4 = field32;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!VHYCWIPJ.method501(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !VHYCWIPJ.method501(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !VHYCWIPJ.method501(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("AVSLDGMK.b(II)LVHYCWIPJ;")
	public final VHYCWIPJ method11(int arg0) {
		if (field24 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field23[var3] && field23[var3] != 0) {
					var2 = field24[var3];
				}
			}

			if (var2 != -1) {
				return method4(var2).method11(1);
			}
		}

		VHYCWIPJ var4 = VHYCWIPJ.method500(field16);
		if (var4 == null) {
			return null;
		}

		if (field19 != null) {
			for (int var5 = 0; var5 < field19.length; var5++) {
				var4.method514(field19[var5], field15[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AVSLDGMK.a(LXRWUKRPO;)V")
	public static final void method12(XRWUKRPO arg0) {
		field14 = new GLMIQHJI(arg0.method581("obj.dat", null));
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("obj.idx", null));
		field5 = var1.method246();
		field12 = new int[field5];
		int var2 = 2;
		for (int var3 = 0; var3 < field5; var3++) {
			field12[var3] = var2;
			var2 += var1.method246();
		}

		field27 = new AVSLDGMK[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field27[var4] = new AVSLDGMK();
		}
	}

	@ObfuscatedName("AVSLDGMK.a(Z)V")
	public void method13() {
		AVSLDGMK var1 = method4(field40);
		field16 = var1.field16;
		field4 = var1.field4;
		field9 = var1.field9;
		field48 = var1.field48;
		field10 = var1.field10;
		field8 = var1.field8;
		field6 = var1.field6;
		field19 = var1.field19;
		field15 = var1.field15;
		AVSLDGMK var2 = method4(field26);
		field33 = var2.field33;
		field49 = var2.field49;
		field51 = var2.field51;
		String var3 = "a";
		char var4 = var2.field33.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field45 = ("Swap this note at any bank for " + var3 + " " + var2.field33 + ".").getBytes();
		field28 = true;
	}
}
