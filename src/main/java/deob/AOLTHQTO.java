package deob;

@ObfuscatedName("AOLTHQTO")
public final class AOLTHQTO {

	@ObfuscatedName("AOLTHQTO.X")
	public int field78 = -1;

	@ObfuscatedName("AOLTHQTO.u")
	public static boolean field51 = true;

	@ObfuscatedName("AOLTHQTO.S")
	public static JLTMYUOM field73 = new JLTMYUOM(50);

	@ObfuscatedName("AOLTHQTO.Y")
	public static JLTMYUOM field79 = new JLTMYUOM(100);

	@ObfuscatedName("AOLTHQTO.t")
	public byte field50;

	@ObfuscatedName("AOLTHQTO.N")
	public byte field68;

	@ObfuscatedName("AOLTHQTO.b")
	public int field34;

	@ObfuscatedName("AOLTHQTO.c")
	public int field35;

	@ObfuscatedName("AOLTHQTO.d")
	public int field36;

	@ObfuscatedName("AOLTHQTO.e")
	public int field37;

	@ObfuscatedName("AOLTHQTO.h")
	public int field40;

	@ObfuscatedName("AOLTHQTO.i")
	public int field41;

	@ObfuscatedName("AOLTHQTO.j")
	public int field42;

	@ObfuscatedName("AOLTHQTO.m")
	public static int field44;

	@ObfuscatedName("AOLTHQTO.o")
	public int field46;

	@ObfuscatedName("AOLTHQTO.p")
	public int field47;

	@ObfuscatedName("AOLTHQTO.q")
	public int field48;

	@ObfuscatedName("AOLTHQTO.v")
	public int field52;

	@ObfuscatedName("AOLTHQTO.w")
	public int field53;

	@ObfuscatedName("AOLTHQTO.x")
	public int field54;

	@ObfuscatedName("AOLTHQTO.y")
	public int field55;

	@ObfuscatedName("AOLTHQTO.z")
	public int field56;

	@ObfuscatedName("AOLTHQTO.B")
	public int field58;

	@ObfuscatedName("AOLTHQTO.D")
	public int field59;

	@ObfuscatedName("AOLTHQTO.G")
	public int field61;

	@ObfuscatedName("AOLTHQTO.H")
	public int field62;

	@ObfuscatedName("AOLTHQTO.I")
	public static int field63;

	@ObfuscatedName("AOLTHQTO.M")
	public int field67;

	@ObfuscatedName("AOLTHQTO.O")
	public int field69;

	@ObfuscatedName("AOLTHQTO.P")
	public int field70;

	@ObfuscatedName("AOLTHQTO.Q")
	public int field71;

	@ObfuscatedName("AOLTHQTO.R")
	public int field72;

	@ObfuscatedName("AOLTHQTO.T")
	public int field74;

	@ObfuscatedName("AOLTHQTO.V")
	public int field76;

	@ObfuscatedName("AOLTHQTO.ab")
	public int field81;

	@ObfuscatedName("AOLTHQTO.n")
	public static XJCNBMKS field45;

	@ObfuscatedName("AOLTHQTO.l")
	public String field43;

	@ObfuscatedName("AOLTHQTO.J")
	public boolean field64;

	@ObfuscatedName("AOLTHQTO.K")
	public boolean field65;

	@ObfuscatedName("AOLTHQTO.L")
	public byte[] field66;

	@ObfuscatedName("AOLTHQTO.g")
	public int[] field39;

	@ObfuscatedName("AOLTHQTO.r")
	public int[] field49;

	@ObfuscatedName("AOLTHQTO.A")
	public int[] field57;

	@ObfuscatedName("AOLTHQTO.U")
	public static int[] field75;

	@ObfuscatedName("AOLTHQTO.W")
	public int[] field77;

	@ObfuscatedName("AOLTHQTO.f")
	public static AOLTHQTO[] field38;

	@ObfuscatedName("AOLTHQTO.E")
	public String[] field60;

	@ObfuscatedName("AOLTHQTO.Z")
	public String[] field80;

	@ObfuscatedName("AOLTHQTO.a(LQKFGLETG;)V")
	public static final void method6(QKFGLETG arg0) {
		field45 = new XJCNBMKS(arg0.method402("obj.dat", null));
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("obj.idx", null));
		field44 = var1.method536();
		field75 = new int[field44];
		int var2 = 2;
		for (int var3 = 0; var3 < field44; var3++) {
			field75[var3] = var2;
			var2 += var1.method536();
		}

		field38 = new AOLTHQTO[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field38[var4] = new AOLTHQTO();
		}
	}

	@ObfuscatedName("AOLTHQTO.a(ZI)LFUTAQMCE;")
	public final FUTAQMCE method7(int arg0) {
		int var2 = field47;
		int var3 = field34;
		int var4 = field55;
		if (arg0 == 1) {
			var2 = field74;
			var3 = field46;
			var4 = field76;
		}

		if (var2 == -1) {
			return null;
		}

		FUTAQMCE var5 = FUTAQMCE.method250(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				FUTAQMCE var9 = FUTAQMCE.method250(var3);
				FUTAQMCE[] var10 = new FUTAQMCE[] { var5, var9 };
				var5 = new FUTAQMCE(2, var10);
			} else {
				FUTAQMCE var6 = FUTAQMCE.method250(var3);
				FUTAQMCE var7 = FUTAQMCE.method250(var4);
				FUTAQMCE[] var8 = new FUTAQMCE[] { var5, var6, var7 };
				var5 = new FUTAQMCE(3, var8);
			}
		}

		if (arg0 == 0 && field50 != 0) {
			var5.method263(0, field50, 0);
		}

		if (arg0 == 1 && field68 != 0) {
			var5.method263(0, field68, 0);
		}

		if (field49 != null) {
			for (int var11 = 0; var11 < field49.length; var11++) {
				var5.method264(field49[var11], field57[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("AOLTHQTO.a(BIII)LYGMSKJOQ;")
	public static final YGMSKJOQ method8(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			YGMSKJOQ var3 = (YGMSKJOQ) field79.method297(arg0);
			if (var3 != null && var3.field1421 != arg1 && var3.field1421 != -1) {
				var3.method396();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		AOLTHQTO var4 = method13(arg0);
		if (var4.field77 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field39[var6] && var4.field39[var6] != 0) {
					var5 = var4.field77[var6];
				}
			}

			if (var5 != -1) {
				var4 = method13(var5);
			}
		}

		FUTAQMCE var7 = var4.method15(1);
		if (var7 == null) {
			return null;
		}

		YGMSKJOQ var8 = null;
		if (var4.field52 != -1) {
			var8 = method8(var4.field41, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		YGMSKJOQ var9 = new YGMSKJOQ(32, 32);
		int var10 = DQOLNIHT.field563;
		int var11 = DQOLNIHT.field564;
		int[] var12 = DQOLNIHT.field569;
		int[] var13 = HQRNTLRZ.field736;
		int var14 = HQRNTLRZ.field737;
		int var15 = HQRNTLRZ.field738;
		int var16 = HQRNTLRZ.field741;
		int var17 = HQRNTLRZ.field742;
		int var18 = HQRNTLRZ.field739;
		int var19 = HQRNTLRZ.field740;
		DQOLNIHT.field561 = false;
		HQRNTLRZ.method279(32, var9.field1415, 32);
		HQRNTLRZ.method284(0, 0, 0, 32, 32);
		DQOLNIHT.method171();
		int var20 = var4.field37;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = DQOLNIHT.field567[var4.field69] * var20 >> 16;
		int var22 = DQOLNIHT.field568[var4.field69] * var20 >> 16;
		var7.method270(0, var4.field58, var4.field59, var4.field69, var4.field53, var7.field976 / 2 + var21 + var4.field35, var4.field35 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1415[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1415[var24 * 32 + var23 - 1] > 1) {
						var9.field1415[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1415[(var24 - 1) * 32 + var23] > 1) {
						var9.field1415[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1415[var24 * 32 + var23 + 1] > 1) {
						var9.field1415[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1415[(var24 + 1) * 32 + var23] > 1) {
						var9.field1415[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1415[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1415[var26 * 32 + var25 - 1] == 1) {
							var9.field1415[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1415[(var26 - 1) * 32 + var25] == 1) {
							var9.field1415[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1415[var26 * 32 + var25 + 1] == 1) {
							var9.field1415[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1415[(var26 + 1) * 32 + var25] == 1) {
							var9.field1415[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1415[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1415[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1415[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field52 != -1) {
			int var29 = var8.field1420;
			int var30 = var8.field1421;
			var8.field1420 = 32;
			var8.field1421 = 32;
			var8.method576(0, 0);
			var8.field1420 = var29;
			var8.field1421 = var30;
		}

		if (arg2 == 0) {
			field79.method298(arg0, var9);
		}

		HQRNTLRZ.method279(var14, var13, var15);
		HQRNTLRZ.method281(var16, var18, var17, var19);
		DQOLNIHT.field563 = var10;
		DQOLNIHT.field564 = var11;
		DQOLNIHT.field569 = var12;
		DQOLNIHT.field561 = true;

		if (var4.field65) {
			var9.field1420 = 33;
		} else {
			var9.field1420 = 32;
		}

		var9.field1421 = arg1;
		return var9;
	}

	@ObfuscatedName("AOLTHQTO.a(BI)Z")
	public final boolean method9(int arg0) {
		int var2 = field47;
		int var3 = field34;
		int var4 = field55;
		if (arg0 == 1) {
			var2 = field74;
			var3 = field46;
			var4 = field76;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!FUTAQMCE.method251(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !FUTAQMCE.method251(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !FUTAQMCE.method251(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("AOLTHQTO.a(BLXJCNBMKS;)V")
	public final void method10(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field62 = arg0.method536();
			} else if (var2 == 2) {
				field43 = arg0.method541();
			} else if (var2 == 3) {
				field66 = arg0.method542();
			} else if (var2 == 4) {
				field37 = arg0.method536();
			} else if (var2 == 5) {
				field69 = arg0.method536();
			} else if (var2 == 6) {
				field58 = arg0.method536();
			} else if (var2 == 7) {
				field53 = arg0.method536();
				if (field53 > 32767) {
					field53 -= 0x10000;
				}
			} else if (var2 == 8) {
				field35 = arg0.method536();
				if (field35 > 32767) {
					field35 -= 0x10000;
				}
			} else if (var2 == 10) {
				field56 = arg0.method536();
			} else if (var2 == 11) {
				field65 = true;
			} else if (var2 == 12) {
				field81 = arg0.method539();
			} else if (var2 == 16) {
				field64 = true;
			} else if (var2 == 23) {
				field47 = arg0.method536();
				field50 = arg0.method535();
			} else if (var2 == 24) {
				field34 = arg0.method536();
			} else if (var2 == 25) {
				field74 = arg0.method536();
				field68 = arg0.method535();
			} else if (var2 == 26) {
				field46 = arg0.method536();
			} else if (var2 >= 30 && var2 < 35) {
				if (field60 == null) {
					field60 = new String[5];
				}

				field60[var2 - 30] = arg0.method541();
				if (field60[var2 - 30].equalsIgnoreCase("hidden")) {
					field60[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field80 == null) {
					field80 = new String[5];
				}

				field80[var2 - 35] = arg0.method541();
			} else if (var2 == 40) {
				int var3 = arg0.method534();
				field49 = new int[var3];
				field57 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field49[var4] = arg0.method536();
					field57[var4] = arg0.method536();
				}
			} else if (var2 == 78) {
				field55 = arg0.method536();
			} else if (var2 == 79) {
				field76 = arg0.method536();
			} else if (var2 == 90) {
				field36 = arg0.method536();
			} else if (var2 == 91) {
				field61 = arg0.method536();
			} else if (var2 == 92) {
				field72 = arg0.method536();
			} else if (var2 == 93) {
				field71 = arg0.method536();
			} else if (var2 == 95) {
				field59 = arg0.method536();
			} else if (var2 == 97) {
				field41 = arg0.method536();
			} else if (var2 == 98) {
				field52 = arg0.method536();
			} else if (var2 >= 100 && var2 < 110) {
				if (field77 == null) {
					field77 = new int[10];
					field39 = new int[10];
				}

				field77[var2 - 100] = arg0.method536();
				field39[var2 - 100] = arg0.method536();
			} else if (var2 == 110) {
				field54 = arg0.method536();
			} else if (var2 == 111) {
				field48 = arg0.method536();
			} else if (var2 == 112) {
				field42 = arg0.method536();
			} else if (var2 == 113) {
				field40 = arg0.method535();
			} else if (var2 == 114) {
				field67 = arg0.method535() * 5;
			} else if (var2 == 115) {
				field70 = arg0.method534();
			}
		}
	}

	@ObfuscatedName("AOLTHQTO.a(II)LFUTAQMCE;")
	public final FUTAQMCE method11(int arg0) {
		int var2 = field36;
		int var3 = field72;
		if (arg0 == 1) {
			var2 = field61;
			var3 = field71;
		}

		if (var2 == -1) {
			return null;
		}

		FUTAQMCE var4 = FUTAQMCE.method250(var2);
		if (var3 != -1) {
			FUTAQMCE var5 = FUTAQMCE.method250(var3);
			FUTAQMCE[] var6 = new FUTAQMCE[] { var4, var5 };
			var4 = new FUTAQMCE(2, var6);
		}

		if (field49 != null) {
			for (int var7 = 0; var7 < field49.length; var7++) {
				var4.method264(field49[var7], field57[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AOLTHQTO.a(I)V")
	public static final void method12() {
		field73 = null;
		field79 = null;
		field75 = null;
		field38 = null;
		field45 = null;
	}

	@ObfuscatedName("AOLTHQTO.b(I)LAOLTHQTO;")
	public static final AOLTHQTO method13(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field38[var1].field78 == arg0) {
				return field38[var1];
			}
		}

		field63 = (field63 + 1) % 10;
		AOLTHQTO var2 = field38[field63];
		field45.field1403 = field75[arg0];
		var2.field78 = arg0;
		var2.method14();
		var2.method10(field45);

		if (var2.field52 != -1) {
			var2.method18();
		}

		if (!field51 && var2.field64) {
			var2.field43 = "Members Object";
			var2.field66 = "Login to a members' server to use this object.".getBytes();
			var2.field60 = null;
			var2.field80 = null;
			var2.field70 = 0;
		}

		return var2;
	}

	@ObfuscatedName("AOLTHQTO.a()V")
	public final void method14() {
		field62 = 0;
		field43 = null;
		field66 = null;
		field49 = null;
		field57 = null;
		field37 = 2000;
		field69 = 0;
		field58 = 0;
		field59 = 0;
		field53 = 0;
		field35 = 0;
		field56 = -1;
		field65 = false;
		field81 = 1;
		field64 = false;
		field60 = null;
		field80 = null;
		field47 = -1;
		field34 = -1;
		field50 = 0;
		field74 = -1;
		field46 = -1;
		field68 = 0;
		field55 = -1;
		field76 = -1;
		field36 = -1;
		field72 = -1;
		field61 = -1;
		field71 = -1;
		field77 = null;
		field39 = null;
		field41 = -1;
		field52 = -1;
		field54 = 128;
		field48 = 128;
		field42 = 128;
		field40 = 0;
		field67 = 0;
		field70 = 0;
	}

	@ObfuscatedName("AOLTHQTO.c(I)LFUTAQMCE;")
	public final FUTAQMCE method15(int arg0) {
		if (field77 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field39[var3] && field39[var3] != 0) {
					var2 = field77[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method15(1);
			}
		}

		FUTAQMCE var4 = (FUTAQMCE) field73.method297(field78);
		if (var4 != null) {
			return var4;
		}

		FUTAQMCE var5 = FUTAQMCE.method250(field62);
		if (var5 == null) {
			return null;
		}

		if (field54 != 128 || field48 != 128 || field42 != 128) {
			var5.method266(field42, field48, field54);
		}

		if (field49 != null) {
			for (int var6 = 0; var6 < field49.length; var6++) {
				var5.method264(field49[var6], field57[var6]);
			}
		}

		var5.method267(field40 + 64, field67 + 768, -50, -10, -50, true);
		var5.field671 = true;
		field73.method298(field78, var5);
		return var5;
	}

	@ObfuscatedName("AOLTHQTO.b(II)Z")
	public final boolean method16(int arg0) {
		int var2 = field36;
		int var3 = field72;
		if (arg0 == 1) {
			var2 = field61;
			var3 = field71;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!FUTAQMCE.method251(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !FUTAQMCE.method251(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("AOLTHQTO.c(II)LFUTAQMCE;")
	public final FUTAQMCE method17(int arg0) {
		if (field77 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field39[var3] && field39[var3] != 0) {
					var2 = field77[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method17(1);
			}
		}

		FUTAQMCE var4 = FUTAQMCE.method250(field62);
		if (var4 == null) {
			return null;
		}

		if (field49 != null) {
			for (int var5 = 0; var5 < field49.length; var5++) {
				var4.method264(field49[var5], field57[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AOLTHQTO.a(B)V")
	public void method18() {
		AOLTHQTO var1 = method13(field52);
		field62 = var1.field62;
		field37 = var1.field37;
		field69 = var1.field69;
		field58 = var1.field58;
		field59 = var1.field59;
		field53 = var1.field53;
		field35 = var1.field35;
		field49 = var1.field49;
		field57 = var1.field57;
		AOLTHQTO var2 = method13(field41);
		field43 = var2.field43;
		field64 = var2.field64;
		field81 = var2.field81;
		String var3 = "a";
		char var4 = var2.field43.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field66 = ("Swap this note at any bank for " + var3 + " " + var2.field43 + ".").getBytes();
		field65 = true;
	}
}
