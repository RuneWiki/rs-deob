package deob;

@ObfuscatedName("HVTLSJTR")
public final class HVTLSJTR {

	@ObfuscatedName("HVTLSJTR.E")
	public int field771 = -1;

	@ObfuscatedName("HVTLSJTR.g")
	public static ZPNSJLZE field748 = new ZPNSJLZE(50);

	@ObfuscatedName("HVTLSJTR.B")
	public static ZPNSJLZE field769 = new ZPNSJLZE(100);

	@ObfuscatedName("HVTLSJTR.X")
	public static boolean field786 = true;

	@ObfuscatedName("HVTLSJTR.c")
	public byte field744;

	@ObfuscatedName("HVTLSJTR.T")
	public byte field784;

	@ObfuscatedName("HVTLSJTR.b")
	public int field743;

	@ObfuscatedName("HVTLSJTR.d")
	public int field745;

	@ObfuscatedName("HVTLSJTR.e")
	public int field746;

	@ObfuscatedName("HVTLSJTR.f")
	public static int field747;

	@ObfuscatedName("HVTLSJTR.h")
	public int field749;

	@ObfuscatedName("HVTLSJTR.i")
	public int field750;

	@ObfuscatedName("HVTLSJTR.j")
	public int field751;

	@ObfuscatedName("HVTLSJTR.l")
	public int field753;

	@ObfuscatedName("HVTLSJTR.m")
	public int field754;

	@ObfuscatedName("HVTLSJTR.o")
	public int field756;

	@ObfuscatedName("HVTLSJTR.p")
	public int field757;

	@ObfuscatedName("HVTLSJTR.r")
	public int field759;

	@ObfuscatedName("HVTLSJTR.s")
	public int field760;

	@ObfuscatedName("HVTLSJTR.v")
	public int field763;

	@ObfuscatedName("HVTLSJTR.w")
	public int field764;

	@ObfuscatedName("HVTLSJTR.y")
	public int field766;

	@ObfuscatedName("HVTLSJTR.z")
	public int field767;

	@ObfuscatedName("HVTLSJTR.A")
	public int field768;

	@ObfuscatedName("HVTLSJTR.D")
	public int field770;

	@ObfuscatedName("HVTLSJTR.H")
	public int field773;

	@ObfuscatedName("HVTLSJTR.I")
	public static int field774;

	@ObfuscatedName("HVTLSJTR.J")
	public int field775;

	@ObfuscatedName("HVTLSJTR.M")
	public int field777;

	@ObfuscatedName("HVTLSJTR.O")
	public int field779;

	@ObfuscatedName("HVTLSJTR.P")
	public int field780;

	@ObfuscatedName("HVTLSJTR.Q")
	public int field781;

	@ObfuscatedName("HVTLSJTR.S")
	public int field783;

	@ObfuscatedName("HVTLSJTR.Z")
	public int field788;

	@ObfuscatedName("HVTLSJTR.ab")
	public int field789;

	@ObfuscatedName("HVTLSJTR.n")
	public static NHEPCMLW field755;

	@ObfuscatedName("HVTLSJTR.R")
	public String field782;

	@ObfuscatedName("HVTLSJTR.u")
	public boolean field762;

	@ObfuscatedName("HVTLSJTR.Y")
	public boolean field787;

	@ObfuscatedName("HVTLSJTR.N")
	public byte[] field778;

	@ObfuscatedName("HVTLSJTR.a")
	public int[] field742;

	@ObfuscatedName("HVTLSJTR.q")
	public int[] field758;

	@ObfuscatedName("HVTLSJTR.t")
	public static int[] field761;

	@ObfuscatedName("HVTLSJTR.x")
	public int[] field765;

	@ObfuscatedName("HVTLSJTR.U")
	public int[] field785;

	@ObfuscatedName("HVTLSJTR.k")
	public static HVTLSJTR[] field752;

	@ObfuscatedName("HVTLSJTR.G")
	public String[] field772;

	@ObfuscatedName("HVTLSJTR.L")
	public String[] field776;

	@ObfuscatedName("HVTLSJTR.a(B)V")
	public void method253() {
		HVTLSJTR var1 = method254(field750);
		field746 = var1.field746;
		field780 = var1.field780;
		field743 = var1.field743;
		field754 = var1.field754;
		field759 = var1.field759;
		field773 = var1.field773;
		field766 = var1.field766;
		field742 = var1.field742;
		field765 = var1.field765;
		HVTLSJTR var2 = method254(field783);
		field782 = var2.field782;
		field762 = var2.field762;
		field749 = var2.field749;
		String var3 = "a";
		char var4 = var2.field782.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field778 = ("Swap this note at any bank for " + var3 + " " + var2.field782 + ".").getBytes();
		field787 = true;
	}

	@ObfuscatedName("HVTLSJTR.a(I)LHVTLSJTR;")
	public static final HVTLSJTR method254(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field752[var1].field771 == arg0) {
				return field752[var1];
			}
		}

		field747 = (field747 + 1) % 10;
		HVTLSJTR var2 = field752[field747];
		field755.field965 = field761[arg0];
		var2.field771 = arg0;
		var2.method263();
		var2.method257(field755);

		if (var2.field750 != -1) {
			var2.method253();
		}

		if (!field786 && var2.field762) {
			var2.field782 = "Members Object";
			var2.field778 = "Login to a members' server to use this object.".getBytes();
			var2.field776 = null;
			var2.field772 = null;
			var2.field781 = 0;
		}

		return var2;
	}

	@ObfuscatedName("HVTLSJTR.a(LINOFEYKQ;)V")
	public static final void method255(INOFEYKQ arg0) {
		field755 = new NHEPCMLW(arg0.method277("obj.dat", null));
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("obj.idx", null));
		field774 = var1.method351();
		field761 = new int[field774];
		int var2 = 2;
		for (int var3 = 0; var3 < field774; var3++) {
			field761[var3] = var2;
			var2 += var1.method351();
		}

		field752 = new HVTLSJTR[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field752[var4] = new HVTLSJTR();
		}
	}

	@ObfuscatedName("HVTLSJTR.a(IIIZ)LZWUMKFUX;")
	public static final ZWUMKFUX method256(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			ZWUMKFUX var3 = (ZWUMKFUX) field769.method586(arg1);
			if (var3 != null && var3.field1511 != arg2 && var3.field1511 != -1) {
				var3.method336();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		HVTLSJTR var4 = method254(arg1);
		if (var4.field758 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field785[var6] && var4.field785[var6] != 0) {
					var5 = var4.field758[var6];
				}
			}

			if (var5 != -1) {
				var4 = method254(var5);
			}
		}

		CSGBDGDY var7 = var4.method258(1);
		if (var7 == null) {
			return null;
		}

		ZWUMKFUX var8 = null;
		if (var4.field750 != -1) {
			var8 = method256(-1, var4.field783, 10);
			if (var8 == null) {
				return null;
			}
		}

		ZWUMKFUX var9 = new ZWUMKFUX(32, 32);
		int var10 = YFTZFAFG.field1434;
		int var11 = YFTZFAFG.field1435;
		int[] var12 = YFTZFAFG.field1440;
		int[] var13 = NQLGXPRA.field977;
		int var14 = NQLGXPRA.field978;
		int var15 = NQLGXPRA.field979;
		int var16 = NQLGXPRA.field982;
		int var17 = NQLGXPRA.field983;
		int var18 = NQLGXPRA.field980;
		int var19 = NQLGXPRA.field981;
		YFTZFAFG.field1432 = false;
		NQLGXPRA.method388(32, var9.field1505, 32);
		NQLGXPRA.method393(0, 0, 32, 0, 32);
		YFTZFAFG.method557();
		int var20 = var4.field780;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = YFTZFAFG.field1438[var4.field743] * var20 >> 16;
		int var22 = YFTZFAFG.field1439[var4.field743] * var20 >> 16;
		var7.method180(0, var4.field754, var4.field759, var4.field743, var4.field773, var7.field1474 / 2 + var21 + var4.field766, var4.field766 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1505[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1505[var24 * 32 + var23 - 1] > 1) {
						var9.field1505[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1505[(var24 - 1) * 32 + var23] > 1) {
						var9.field1505[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1505[var24 * 32 + var23 + 1] > 1) {
						var9.field1505[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1505[(var24 + 1) * 32 + var23] > 1) {
						var9.field1505[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1505[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1505[var26 * 32 + var25 - 1] == 1) {
							var9.field1505[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1505[(var26 - 1) * 32 + var25] == 1) {
							var9.field1505[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1505[var26 * 32 + var25 + 1] == 1) {
							var9.field1505[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1505[(var26 + 1) * 32 + var25] == 1) {
							var9.field1505[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1505[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1505[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1505[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field750 != -1) {
			int var29 = var8.field1510;
			int var30 = var8.field1511;
			var8.field1510 = 32;
			var8.field1511 = 32;
			var8.method594(0, 0);
			var8.field1510 = var29;
			var8.field1511 = var30;
		}

		if (arg0 == 0) {
			field769.method587(var9, arg1);
		}

		NQLGXPRA.method388(var14, var13, var15);
		NQLGXPRA.method390(var16, var19, var18, var17);
		YFTZFAFG.field1434 = var10;
		YFTZFAFG.field1435 = var11;
		YFTZFAFG.field1440 = var12;
		YFTZFAFG.field1432 = true;

		if (var4.field787) {
			var9.field1510 = 33;
		} else {
			var9.field1510 = 32;
		}

		var9.field1511 = arg2;
		return var9;
	}

	@ObfuscatedName("HVTLSJTR.a(ZLNHEPCMLW;)V")
	public final void method257(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field746 = arg0.method351();
			} else if (var2 == 2) {
				field782 = arg0.method356();
			} else if (var2 == 3) {
				field778 = arg0.method357();
			} else if (var2 == 4) {
				field780 = arg0.method351();
			} else if (var2 == 5) {
				field743 = arg0.method351();
			} else if (var2 == 6) {
				field754 = arg0.method351();
			} else if (var2 == 7) {
				field773 = arg0.method351();
				if (field773 > 32767) {
					field773 -= 0x10000;
				}
			} else if (var2 == 8) {
				field766 = arg0.method351();
				if (field766 > 32767) {
					field766 -= 0x10000;
				}
			} else if (var2 == 10) {
				field789 = arg0.method351();
			} else if (var2 == 11) {
				field787 = true;
			} else if (var2 == 12) {
				field749 = arg0.method354();
			} else if (var2 == 16) {
				field762 = true;
			} else if (var2 == 23) {
				field767 = arg0.method351();
				field744 = arg0.method350();
			} else if (var2 == 24) {
				field753 = arg0.method351();
			} else if (var2 == 25) {
				field788 = arg0.method351();
				field784 = arg0.method350();
			} else if (var2 == 26) {
				field777 = arg0.method351();
			} else if (var2 >= 30 && var2 < 35) {
				if (field776 == null) {
					field776 = new String[5];
				}

				field776[var2 - 30] = arg0.method356();
				if (field776[var2 - 30].equalsIgnoreCase("hidden")) {
					field776[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field772 == null) {
					field772 = new String[5];
				}

				field772[var2 - 35] = arg0.method356();
			} else if (var2 == 40) {
				int var3 = arg0.method349();
				field742 = new int[var3];
				field765 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field742[var4] = arg0.method351();
					field765[var4] = arg0.method351();
				}
			} else if (var2 == 78) {
				field751 = arg0.method351();
			} else if (var2 == 79) {
				field779 = arg0.method351();
			} else if (var2 == 90) {
				field760 = arg0.method351();
			} else if (var2 == 91) {
				field757 = arg0.method351();
			} else if (var2 == 92) {
				field764 = arg0.method351();
			} else if (var2 == 93) {
				field756 = arg0.method351();
			} else if (var2 == 95) {
				field759 = arg0.method351();
			} else if (var2 == 97) {
				field783 = arg0.method351();
			} else if (var2 == 98) {
				field750 = arg0.method351();
			} else if (var2 >= 100 && var2 < 110) {
				if (field758 == null) {
					field758 = new int[10];
					field785 = new int[10];
				}

				field758[var2 - 100] = arg0.method351();
				field785[var2 - 100] = arg0.method351();
			} else if (var2 == 110) {
				field775 = arg0.method351();
			} else if (var2 == 111) {
				field768 = arg0.method351();
			} else if (var2 == 112) {
				field770 = arg0.method351();
			} else if (var2 == 113) {
				field763 = arg0.method350();
			} else if (var2 == 114) {
				field745 = arg0.method350() * 5;
			} else if (var2 == 115) {
				field781 = arg0.method349();
			}
		}
	}

	@ObfuscatedName("HVTLSJTR.b(I)LCSGBDGDY;")
	public final CSGBDGDY method258(int arg0) {
		if (field758 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field785[var3] && field785[var3] != 0) {
					var2 = field758[var3];
				}
			}

			if (var2 != -1) {
				return method254(var2).method258(1);
			}
		}

		CSGBDGDY var4 = (CSGBDGDY) field748.method586(field771);
		if (var4 != null) {
			return var4;
		}

		CSGBDGDY var5 = CSGBDGDY.method160(field746);
		if (var5 == null) {
			return null;
		}

		if (field775 != 128 || field768 != 128 || field770 != 128) {
			var5.method176(field770, field768, field775);
		}

		if (field742 != null) {
			for (int var6 = 0; var6 < field742.length; var6++) {
				var5.method174(field742[var6], field765[var6]);
			}
		}

		var5.method177(field763 + 64, field745 + 768, -50, -10, -50, true);
		var5.field536 = true;
		field748.method587(var5, field771);
		return var5;
	}

	@ObfuscatedName("HVTLSJTR.a(IB)Z")
	public final boolean method259(int arg0) {
		int var2 = field760;
		int var3 = field764;
		if (arg0 == 1) {
			var2 = field757;
			var3 = field756;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!CSGBDGDY.method161(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !CSGBDGDY.method161(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("HVTLSJTR.b(IB)LCSGBDGDY;")
	public final CSGBDGDY method260(int arg0) {
		int var2 = field760;
		int var3 = field764;
		if (arg0 == 1) {
			var2 = field757;
			var3 = field756;
		}

		if (var2 == -1) {
			return null;
		}

		CSGBDGDY var4 = CSGBDGDY.method160(var2);
		if (var3 != -1) {
			CSGBDGDY var5 = CSGBDGDY.method160(var3);
			CSGBDGDY[] var6 = new CSGBDGDY[] { var4, var5 };
			var4 = new CSGBDGDY(2, var6);
		}

		if (field742 != null) {
			for (int var7 = 0; var7 < field742.length; var7++) {
				var4.method174(field742[var7], field765[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HVTLSJTR.a(IZ)Z")
	public final boolean method261(int arg0) {
		int var2 = field767;
		int var3 = field753;
		int var4 = field751;
		if (arg0 == 1) {
			var2 = field788;
			var3 = field777;
			var4 = field779;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!CSGBDGDY.method161(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !CSGBDGDY.method161(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !CSGBDGDY.method161(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("HVTLSJTR.a(ZI)LCSGBDGDY;")
	public final CSGBDGDY method262(int arg0) {
		int var2 = field767;
		int var3 = field753;
		int var4 = field751;
		if (arg0 == 1) {
			var2 = field788;
			var3 = field777;
			var4 = field779;
		}

		if (var2 == -1) {
			return null;
		}

		CSGBDGDY var5 = CSGBDGDY.method160(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				CSGBDGDY var9 = CSGBDGDY.method160(var3);
				CSGBDGDY[] var10 = new CSGBDGDY[] { var5, var9 };
				var5 = new CSGBDGDY(2, var10);
			} else {
				CSGBDGDY var6 = CSGBDGDY.method160(var3);
				CSGBDGDY var7 = CSGBDGDY.method160(var4);
				CSGBDGDY[] var8 = new CSGBDGDY[] { var5, var6, var7 };
				var5 = new CSGBDGDY(3, var8);
			}
		}

		if (arg0 == 0 && field744 != 0) {
			var5.method173(field744, 0, 0);
		}

		if (arg0 == 1 && field784 != 0) {
			var5.method173(field784, 0, 0);
		}

		if (field742 != null) {
			for (int var11 = 0; var11 < field742.length; var11++) {
				var5.method174(field742[var11], field765[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("HVTLSJTR.a()V")
	public final void method263() {
		field746 = 0;
		field782 = null;
		field778 = null;
		field742 = null;
		field765 = null;
		field780 = 2000;
		field743 = 0;
		field754 = 0;
		field759 = 0;
		field773 = 0;
		field766 = 0;
		field789 = -1;
		field787 = false;
		field749 = 1;
		field762 = false;
		field776 = null;
		field772 = null;
		field767 = -1;
		field753 = -1;
		field744 = 0;
		field788 = -1;
		field777 = -1;
		field784 = 0;
		field751 = -1;
		field779 = -1;
		field760 = -1;
		field764 = -1;
		field757 = -1;
		field756 = -1;
		field758 = null;
		field785 = null;
		field783 = -1;
		field750 = -1;
		field775 = 128;
		field768 = 128;
		field770 = 128;
		field763 = 0;
		field745 = 0;
		field781 = 0;
	}

	@ObfuscatedName("HVTLSJTR.b(IZ)LCSGBDGDY;")
	public final CSGBDGDY method264(int arg0) {
		if (field758 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field785[var3] && field785[var3] != 0) {
					var2 = field758[var3];
				}
			}

			if (var2 != -1) {
				return method254(var2).method264(1);
			}
		}

		CSGBDGDY var4 = CSGBDGDY.method160(field746);
		if (var4 == null) {
			return null;
		}

		if (field742 != null) {
			for (int var5 = 0; var5 < field742.length; var5++) {
				var4.method174(field742[var5], field765[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HVTLSJTR.a(Z)V")
	public static final void method265() {
		field748 = null;
		field769 = null;
		field761 = null;
		field752 = null;
		field755 = null;
	}
}
