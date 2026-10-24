package deob;

@ObfuscatedName("CBASPZKU")
public final class CBASPZKU {

	@ObfuscatedName("CBASPZKU.F")
	public int field43 = -1;

	@ObfuscatedName("CBASPZKU.d")
	public static boolean field18 = true;

	@ObfuscatedName("CBASPZKU.B")
	public static ECXUVDNP field40 = new ECXUVDNP(100);

	@ObfuscatedName("CBASPZKU.S")
	public static ECXUVDNP field54 = new ECXUVDNP(50);

	@ObfuscatedName("CBASPZKU.o")
	public byte field29;

	@ObfuscatedName("CBASPZKU.T")
	public byte field55;

	@ObfuscatedName("CBASPZKU.c")
	public int field17;

	@ObfuscatedName("CBASPZKU.e")
	public int field19;

	@ObfuscatedName("CBASPZKU.f")
	public int field20;

	@ObfuscatedName("CBASPZKU.g")
	public int field21;

	@ObfuscatedName("CBASPZKU.j")
	public int field24;

	@ObfuscatedName("CBASPZKU.k")
	public int field25;

	@ObfuscatedName("CBASPZKU.l")
	public int field26;

	@ObfuscatedName("CBASPZKU.n")
	public int field28;

	@ObfuscatedName("CBASPZKU.p")
	public int field30;

	@ObfuscatedName("CBASPZKU.q")
	public int field31;

	@ObfuscatedName("CBASPZKU.s")
	public int field32;

	@ObfuscatedName("CBASPZKU.t")
	public int field33;

	@ObfuscatedName("CBASPZKU.u")
	public int field34;

	@ObfuscatedName("CBASPZKU.w")
	public static int field36;

	@ObfuscatedName("CBASPZKU.A")
	public int field39;

	@ObfuscatedName("CBASPZKU.G")
	public int field44;

	@ObfuscatedName("CBASPZKU.H")
	public int field45;

	@ObfuscatedName("CBASPZKU.J")
	public int field46;

	@ObfuscatedName("CBASPZKU.K")
	public int field47;

	@ObfuscatedName("CBASPZKU.L")
	public int field48;

	@ObfuscatedName("CBASPZKU.N")
	public int field49;

	@ObfuscatedName("CBASPZKU.O")
	public int field50;

	@ObfuscatedName("CBASPZKU.Q")
	public int field52;

	@ObfuscatedName("CBASPZKU.R")
	public static int field53;

	@ObfuscatedName("CBASPZKU.U")
	public int field56;

	@ObfuscatedName("CBASPZKU.V")
	public int field57;

	@ObfuscatedName("CBASPZKU.W")
	public int field58;

	@ObfuscatedName("CBASPZKU.X")
	public int field59;

	@ObfuscatedName("CBASPZKU.cb")
	public int field63;

	@ObfuscatedName("CBASPZKU.D")
	public static MQZHAILV field41;

	@ObfuscatedName("CBASPZKU.y")
	public String field37;

	@ObfuscatedName("CBASPZKU.h")
	public boolean field22;

	@ObfuscatedName("CBASPZKU.E")
	public boolean field42;

	@ObfuscatedName("CBASPZKU.m")
	public byte[] field27;

	@ObfuscatedName("CBASPZKU.i")
	public int[] field23;

	@ObfuscatedName("CBASPZKU.z")
	public int[] field38;

	@ObfuscatedName("CBASPZKU.P")
	public static int[] field51;

	@ObfuscatedName("CBASPZKU.Y")
	public int[] field60;

	@ObfuscatedName("CBASPZKU.bb")
	public int[] field62;

	@ObfuscatedName("CBASPZKU.v")
	public static CBASPZKU[] field35;

	@ObfuscatedName("CBASPZKU.b")
	public String[] field16;

	@ObfuscatedName("CBASPZKU.Z")
	public String[] field61;

	@ObfuscatedName("CBASPZKU.a(LCXFTMSCH;)V")
	public static final void method7(CXFTMSCH arg0) {
		field41 = new MQZHAILV(arg0.method176("obj.dat", null));
		MQZHAILV var1 = new MQZHAILV(arg0.method176("obj.idx", null));
		field36 = var1.method327();
		field51 = new int[field36];
		int var2 = 2;
		for (int var3 = 0; var3 < field36; var3++) {
			field51[var3] = var2;
			var2 += var1.method327();
		}

		field35 = new CBASPZKU[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field35[var4] = new CBASPZKU();
		}
	}

	@ObfuscatedName("CBASPZKU.a(I)V")
	public void method8() {
		CBASPZKU var1 = method13(field39);
		field49 = var1.field49;
		field31 = var1.field31;
		field33 = var1.field33;
		field58 = var1.field58;
		field48 = var1.field48;
		field52 = var1.field52;
		field32 = var1.field32;
		field62 = var1.field62;
		field60 = var1.field60;
		CBASPZKU var2 = method13(field25);
		field37 = var2.field37;
		field42 = var2.field42;
		field46 = var2.field46;
		String var3 = "a";
		char var4 = var2.field37.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field27 = ("Swap this note at any bank for " + var3 + " " + var2.field37 + ".").getBytes();
		field22 = true;
	}

	@ObfuscatedName("CBASPZKU.a(B)V")
	public static final void method9() {
		field54 = null;
		field40 = null;
		field51 = null;
		field35 = null;
		field41 = null;
	}

	@ObfuscatedName("CBASPZKU.a(BI)LYYHPBDED;")
	public final YYHPBDED method10(int arg0) {
		int var2 = field47;
		int var3 = field63;
		if (arg0 == 1) {
			var2 = field56;
			var3 = field59;
		}

		if (var2 == -1) {
			return null;
		}

		YYHPBDED var4 = YYHPBDED.method551(var2);
		if (var3 != -1) {
			YYHPBDED var5 = YYHPBDED.method551(var3);
			YYHPBDED[] var6 = new YYHPBDED[] { var4, var5 };
			var4 = new YYHPBDED(var6, 2);
		}

		if (field62 != null) {
			for (int var7 = 0; var7 < field62.length; var7++) {
				var4.method565(field62[var7], field60[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("CBASPZKU.b(BI)LYYHPBDED;")
	public final YYHPBDED method11(int arg0) {
		int var2 = field45;
		int var3 = field28;
		int var4 = field50;
		if (arg0 == 1) {
			var2 = field30;
			var3 = field19;
			var4 = field21;
		}

		if (var2 == -1) {
			return null;
		}

		YYHPBDED var5 = YYHPBDED.method551(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				YYHPBDED var9 = YYHPBDED.method551(var3);
				YYHPBDED[] var10 = new YYHPBDED[] { var5, var9 };
				var5 = new YYHPBDED(var10, 2);
			} else {
				YYHPBDED var6 = YYHPBDED.method551(var3);
				YYHPBDED var7 = YYHPBDED.method551(var4);
				YYHPBDED[] var8 = new YYHPBDED[] { var5, var6, var7 };
				var5 = new YYHPBDED(var8, 3);
			}
		}

		if (arg0 == 0 && field55 != 0) {
			var5.method564(field55, 0, 0);
		}

		if (arg0 == 1 && field29 != 0) {
			var5.method564(field29, 0, 0);
		}

		if (field62 != null) {
			for (int var11 = 0; var11 < field62.length; var11++) {
				var5.method565(field62[var11], field60[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("CBASPZKU.a(IB)LYYHPBDED;")
	public final YYHPBDED method12(int arg0) {
		if (field23 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field38[var3] && field38[var3] != 0) {
					var2 = field23[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method12(1);
			}
		}

		YYHPBDED var4 = YYHPBDED.method551(field49);
		if (var4 == null) {
			return null;
		}

		if (field62 != null) {
			for (int var5 = 0; var5 < field62.length; var5++) {
				var4.method565(field62[var5], field60[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("CBASPZKU.b(I)LCBASPZKU;")
	public static final CBASPZKU method13(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field35[var1].field43 == arg0) {
				return field35[var1];
			}
		}

		field53 = (field53 + 1) % 10;
		CBASPZKU var2 = field35[field53];
		field41.field797 = field51[arg0];
		var2.field43 = arg0;
		var2.method15();
		var2.method18(field41);

		if (var2.field39 != -1) {
			var2.method8();
		}

		if (!field18 && var2.field42) {
			var2.field37 = "Members Object";
			var2.field27 = "Login to a members' server to use this object.".getBytes();
			var2.field16 = null;
			var2.field61 = null;
			var2.field17 = 0;
		}

		return var2;
	}

	@ObfuscatedName("CBASPZKU.a(ZIII)LUFHMHWIH;")
	public static final UFHMHWIH method14(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			UFHMHWIH var3 = (UFHMHWIH) field40.method221(arg2);
			if (var3 != null && var3.field1154 != arg1 && var3.field1154 != -1) {
				var3.method492();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		CBASPZKU var4 = method13(arg2);
		if (var4.field23 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field38[var6] && var4.field38[var6] != 0) {
					var5 = var4.field23[var6];
				}
			}

			if (var5 != -1) {
				var4 = method13(var5);
			}
		}

		YYHPBDED var7 = var4.method16(1);
		if (var7 == null) {
			return null;
		}

		UFHMHWIH var8 = null;
		if (var4.field39 != -1) {
			var8 = method14(-1, 10, var4.field25);
			if (var8 == null) {
				return null;
			}
		}

		UFHMHWIH var9 = new UFHMHWIH(32, 32);
		int var10 = QSZFQZON.field887;
		int var11 = QSZFQZON.field888;
		int[] var12 = QSZFQZON.field893;
		int[] var13 = JJCVVTJN.field675;
		int var14 = JJCVVTJN.field676;
		int var15 = JJCVVTJN.field677;
		int var16 = JJCVVTJN.field680;
		int var17 = JJCVVTJN.field681;
		int var18 = JJCVVTJN.field678;
		int var19 = JJCVVTJN.field679;
		QSZFQZON.field885 = false;
		JJCVVTJN.method253(32, 32, var9.field1148);
		JJCVVTJN.method258(32, 0, 0, 0, 32);
		QSZFQZON.method386();
		int var20 = var4.field31;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = QSZFQZON.field891[var4.field33] * var20 >> 16;
		int var22 = QSZFQZON.field892[var4.field33] * var20 >> 16;
		var7.method571(0, var4.field58, var4.field48, var4.field33, var4.field52, var7.field2 / 2 + var21 + var4.field32, var4.field32 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1148[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1148[var24 * 32 + var23 - 1] > 1) {
						var9.field1148[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1148[(var24 - 1) * 32 + var23] > 1) {
						var9.field1148[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1148[var24 * 32 + var23 + 1] > 1) {
						var9.field1148[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1148[(var24 + 1) * 32 + var23] > 1) {
						var9.field1148[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1148[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1148[var26 * 32 + var25 - 1] == 1) {
							var9.field1148[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1148[(var26 - 1) * 32 + var25] == 1) {
							var9.field1148[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1148[var26 * 32 + var25 + 1] == 1) {
							var9.field1148[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1148[(var26 + 1) * 32 + var25] == 1) {
							var9.field1148[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1148[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1148[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1148[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field39 != -1) {
			int var29 = var8.field1153;
			int var30 = var8.field1154;
			var8.field1153 = 32;
			var8.field1154 = 32;
			var8.method498(0, 0);
			var8.field1153 = var29;
			var8.field1154 = var30;
		}

		if (arg0 == 0) {
			field40.method222(arg2, var9);
		}

		JJCVVTJN.method253(var15, var14, var13);
		JJCVVTJN.method255(var19, var18, var17, var16);
		QSZFQZON.field887 = var10;
		QSZFQZON.field888 = var11;
		QSZFQZON.field893 = var12;
		QSZFQZON.field885 = true;

		if (var4.field22) {
			var9.field1153 = 33;
		} else {
			var9.field1153 = 32;
		}

		var9.field1154 = arg1;
		return var9;
	}

	@ObfuscatedName("CBASPZKU.a()V")
	public final void method15() {
		field49 = 0;
		field37 = null;
		field27 = null;
		field62 = null;
		field60 = null;
		field31 = 2000;
		field33 = 0;
		field58 = 0;
		field48 = 0;
		field52 = 0;
		field32 = 0;
		field34 = -1;
		field22 = false;
		field46 = 1;
		field42 = false;
		field16 = null;
		field61 = null;
		field45 = -1;
		field28 = -1;
		field55 = 0;
		field30 = -1;
		field19 = -1;
		field29 = 0;
		field50 = -1;
		field21 = -1;
		field47 = -1;
		field63 = -1;
		field56 = -1;
		field59 = -1;
		field23 = null;
		field38 = null;
		field25 = -1;
		field39 = -1;
		field44 = 128;
		field24 = 128;
		field26 = 128;
		field20 = 0;
		field57 = 0;
		field17 = 0;
	}

	@ObfuscatedName("CBASPZKU.c(I)LYYHPBDED;")
	public final YYHPBDED method16(int arg0) {
		if (field23 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field38[var3] && field38[var3] != 0) {
					var2 = field23[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method16(1);
			}
		}

		YYHPBDED var4 = (YYHPBDED) field54.method221(field43);
		if (var4 != null) {
			return var4;
		}

		YYHPBDED var5 = YYHPBDED.method551(field49);
		if (var5 == null) {
			return null;
		}

		if (field44 != 128 || field24 != 128 || field26 != 128) {
			var5.method567(field24, field26, field44);
		}

		if (field62 != null) {
			for (int var6 = 0; var6 < field62.length; var6++) {
				var5.method565(field62[var6], field60[var6]);
			}
		}

		var5.method568(field20 + 64, field57 + 768, -50, -10, -50, true);
		var5.field1378 = true;
		field54.method222(field43, var5);
		return var5;
	}

	@ObfuscatedName("CBASPZKU.a(IZ)Z")
	public final boolean method17(int arg0) {
		int var2 = field47;
		int var3 = field63;
		if (arg0 == 1) {
			var2 = field56;
			var3 = field59;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!YYHPBDED.method552(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !YYHPBDED.method552(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("CBASPZKU.a(LMQZHAILV;I)V")
	public final void method18(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field49 = arg0.method327();
			} else if (var2 == 2) {
				field37 = arg0.method332();
			} else if (var2 == 3) {
				field27 = arg0.method333();
			} else if (var2 == 4) {
				field31 = arg0.method327();
			} else if (var2 == 5) {
				field33 = arg0.method327();
			} else if (var2 == 6) {
				field58 = arg0.method327();
			} else if (var2 == 7) {
				field52 = arg0.method327();
				if (field52 > 32767) {
					field52 -= 0x10000;
				}
			} else if (var2 == 8) {
				field32 = arg0.method327();
				if (field32 > 32767) {
					field32 -= 0x10000;
				}
			} else if (var2 == 10) {
				field34 = arg0.method327();
			} else if (var2 == 11) {
				field22 = true;
			} else if (var2 == 12) {
				field46 = arg0.method330();
			} else if (var2 == 16) {
				field42 = true;
			} else if (var2 == 23) {
				field45 = arg0.method327();
				field55 = arg0.method326();
			} else if (var2 == 24) {
				field28 = arg0.method327();
			} else if (var2 == 25) {
				field30 = arg0.method327();
				field29 = arg0.method326();
			} else if (var2 == 26) {
				field19 = arg0.method327();
			} else if (var2 >= 30 && var2 < 35) {
				if (field16 == null) {
					field16 = new String[5];
				}

				field16[var2 - 30] = arg0.method332();
				if (field16[var2 - 30].equalsIgnoreCase("hidden")) {
					field16[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field61 == null) {
					field61 = new String[5];
				}

				field61[var2 - 35] = arg0.method332();
			} else if (var2 == 40) {
				int var3 = arg0.method325();
				field62 = new int[var3];
				field60 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field62[var4] = arg0.method327();
					field60[var4] = arg0.method327();
				}
			} else if (var2 == 78) {
				field50 = arg0.method327();
			} else if (var2 == 79) {
				field21 = arg0.method327();
			} else if (var2 == 90) {
				field47 = arg0.method327();
			} else if (var2 == 91) {
				field56 = arg0.method327();
			} else if (var2 == 92) {
				field63 = arg0.method327();
			} else if (var2 == 93) {
				field59 = arg0.method327();
			} else if (var2 == 95) {
				field48 = arg0.method327();
			} else if (var2 == 97) {
				field25 = arg0.method327();
			} else if (var2 == 98) {
				field39 = arg0.method327();
			} else if (var2 >= 100 && var2 < 110) {
				if (field23 == null) {
					field23 = new int[10];
					field38 = new int[10];
				}

				field23[var2 - 100] = arg0.method327();
				field38[var2 - 100] = arg0.method327();
			} else if (var2 == 110) {
				field44 = arg0.method327();
			} else if (var2 == 111) {
				field24 = arg0.method327();
			} else if (var2 == 112) {
				field26 = arg0.method327();
			} else if (var2 == 113) {
				field20 = arg0.method326();
			} else if (var2 == 114) {
				field57 = arg0.method326() * 5;
			} else if (var2 == 115) {
				field17 = arg0.method325();
			}
		}
	}

	@ObfuscatedName("CBASPZKU.a(II)Z")
	public final boolean method19(int arg0) {
		int var2 = field45;
		int var3 = field28;
		int var4 = field50;
		if (arg0 == 1) {
			var2 = field30;
			var3 = field19;
			var4 = field21;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!YYHPBDED.method552(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !YYHPBDED.method552(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !YYHPBDED.method552(var4)) {
			var5 = false;
		}

		return var5;
	}
}
