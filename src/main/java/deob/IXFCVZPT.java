package deob;

@ObfuscatedName("IXFCVZPT")
public final class IXFCVZPT {

	@ObfuscatedName("IXFCVZPT.x")
	public int field768 = -1;

	@ObfuscatedName("IXFCVZPT.g")
	public static boolean field753 = true;

	@ObfuscatedName("IXFCVZPT.J")
	public static QASTZCLF field778 = new QASTZCLF(50);

	@ObfuscatedName("IXFCVZPT.K")
	public static QASTZCLF field779 = new QASTZCLF(100);

	@ObfuscatedName("IXFCVZPT.m")
	public byte field759;

	@ObfuscatedName("IXFCVZPT.Q")
	public byte field785;

	@ObfuscatedName("IXFCVZPT.c")
	public int field749;

	@ObfuscatedName("IXFCVZPT.i")
	public int field755;

	@ObfuscatedName("IXFCVZPT.j")
	public int field756;

	@ObfuscatedName("IXFCVZPT.k")
	public static int field757;

	@ObfuscatedName("IXFCVZPT.l")
	public int field758;

	@ObfuscatedName("IXFCVZPT.n")
	public int field760;

	@ObfuscatedName("IXFCVZPT.p")
	public int field762;

	@ObfuscatedName("IXFCVZPT.r")
	public int field763;

	@ObfuscatedName("IXFCVZPT.s")
	public int field764;

	@ObfuscatedName("IXFCVZPT.t")
	public int field765;

	@ObfuscatedName("IXFCVZPT.u")
	public int field766;

	@ObfuscatedName("IXFCVZPT.w")
	public int field767;

	@ObfuscatedName("IXFCVZPT.B")
	public int field771;

	@ObfuscatedName("IXFCVZPT.E")
	public int field773;

	@ObfuscatedName("IXFCVZPT.F")
	public int field774;

	@ObfuscatedName("IXFCVZPT.G")
	public int field775;

	@ObfuscatedName("IXFCVZPT.H")
	public int field776;

	@ObfuscatedName("IXFCVZPT.I")
	public int field777;

	@ObfuscatedName("IXFCVZPT.L")
	public int field780;

	@ObfuscatedName("IXFCVZPT.M")
	public int field781;

	@ObfuscatedName("IXFCVZPT.N")
	public int field782;

	@ObfuscatedName("IXFCVZPT.P")
	public static int field784;

	@ObfuscatedName("IXFCVZPT.R")
	public int field786;

	@ObfuscatedName("IXFCVZPT.S")
	public int field787;

	@ObfuscatedName("IXFCVZPT.T")
	public int field788;

	@ObfuscatedName("IXFCVZPT.U")
	public int field789;

	@ObfuscatedName("IXFCVZPT.V")
	public int field790;

	@ObfuscatedName("IXFCVZPT.X")
	public int field792;

	@ObfuscatedName("IXFCVZPT.Y")
	public int field793;

	@ObfuscatedName("IXFCVZPT.e")
	public static IUVBENCV field751;

	@ObfuscatedName("IXFCVZPT.O")
	public String field783;

	@ObfuscatedName("IXFCVZPT.a")
	public boolean field747;

	@ObfuscatedName("IXFCVZPT.f")
	public boolean field752;

	@ObfuscatedName("IXFCVZPT.d")
	public byte[] field750;

	@ObfuscatedName("IXFCVZPT.b")
	public int[] field748;

	@ObfuscatedName("IXFCVZPT.h")
	public static int[] field754;

	@ObfuscatedName("IXFCVZPT.o")
	public int[] field761;

	@ObfuscatedName("IXFCVZPT.C")
	public int[] field772;

	@ObfuscatedName("IXFCVZPT.W")
	public int[] field791;

	@ObfuscatedName("IXFCVZPT.Z")
	public static IXFCVZPT[] field794;

	@ObfuscatedName("IXFCVZPT.z")
	public String[] field769;

	@ObfuscatedName("IXFCVZPT.A")
	public String[] field770;

	@ObfuscatedName("IXFCVZPT.a(IB)LJJMVUSJJ;")
	public final JJMVUSJJ method283(int arg0) {
		if (field772 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field748[var3] && field748[var3] != 0) {
					var2 = field772[var3];
				}
			}

			if (var2 != -1) {
				return method285(var2).method283(1);
			}
		}

		JJMVUSJJ var4 = JJMVUSJJ.method300(field788);
		if (var4 == null) {
			return null;
		}

		if (field791 != null) {
			for (int var5 = 0; var5 < field791.length; var5++) {
				var4.method314(field791[var5], field761[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("IXFCVZPT.a(I)V")
	public void method284() {
		IXFCVZPT var1 = method285(field793);
		field788 = var1.field788;
		field782 = var1.field782;
		field790 = var1.field790;
		field762 = var1.field762;
		field786 = var1.field786;
		field773 = var1.field773;
		field756 = var1.field756;
		field791 = var1.field791;
		field761 = var1.field761;
		IXFCVZPT var2 = method285(field749);
		field783 = var2.field783;
		field747 = var2.field747;
		field755 = var2.field755;
		String var3 = "a";
		char var4 = var2.field783.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field750 = ("Swap this note at any bank for " + var3 + " " + var2.field783 + ".").getBytes();
		field752 = true;
	}

	@ObfuscatedName("IXFCVZPT.b(I)LIXFCVZPT;")
	public static final IXFCVZPT method285(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field794[var1].field768 == arg0) {
				return field794[var1];
			}
		}

		field784 = (field784 + 1) % 10;
		IXFCVZPT var2 = field794[field784];
		field751.field733 = field754[arg0];
		var2.field768 = arg0;
		var2.method292();
		var2.method293(field751);

		if (var2.field793 != -1) {
			var2.method284();
		}

		if (!field753 && var2.field747) {
			var2.field783 = "Members Object";
			var2.field750 = "Login to a members' server to use this object.".getBytes();
			var2.field769 = null;
			var2.field770 = null;
			var2.field775 = 0;
		}

		return var2;
	}

	@ObfuscatedName("IXFCVZPT.a(II)Z")
	public final boolean method286(int arg0) {
		int var2 = field789;
		int var3 = field765;
		int var4 = field766;
		if (arg0 == 1) {
			var2 = field777;
			var3 = field787;
			var4 = field760;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!JJMVUSJJ.method301(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !JJMVUSJJ.method301(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !JJMVUSJJ.method301(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("IXFCVZPT.a(IZII)LGPLGZASP;")
	public static final GPLGZASP method287(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			GPLGZASP var3 = (GPLGZASP) field779.method438(arg1);
			if (var3 != null && var3.field699 != arg0 && var3.field699 != -1) {
				var3.method602();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		IXFCVZPT var4 = method285(arg1);
		if (var4.field772 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field748[var6] && var4.field748[var6] != 0) {
					var5 = var4.field772[var6];
				}
			}

			if (var5 != -1) {
				var4 = method285(var5);
			}
		}

		JJMVUSJJ var7 = var4.method291(1);
		if (var7 == null) {
			return null;
		}

		GPLGZASP var8 = null;
		if (var4.field793 != -1) {
			var8 = method287(10, var4.field749, -1);
			if (var8 == null) {
				return null;
			}
		}

		GPLGZASP var9 = new GPLGZASP(32, 32);
		int var10 = ZGIYLEBF.field1489;
		int var11 = ZGIYLEBF.field1490;
		int[] var12 = ZGIYLEBF.field1495;
		int[] var13 = TIJYBGAE.field1344;
		int var14 = TIJYBGAE.field1345;
		int var15 = TIJYBGAE.field1346;
		int var16 = TIJYBGAE.field1349;
		int var17 = TIJYBGAE.field1350;
		int var18 = TIJYBGAE.field1347;
		int var19 = TIJYBGAE.field1348;
		ZGIYLEBF.field1487 = false;
		TIJYBGAE.method487(32, 32, var9.field693);
		TIJYBGAE.method492(32, 0, 0, 32, 0);
		ZGIYLEBF.method586();
		int var20 = var4.field782;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = ZGIYLEBF.field1493[var4.field790] * var20 >> 16;
		int var22 = ZGIYLEBF.field1494[var4.field790] * var20 >> 16;
		var7.method321(0, var4.field762, var4.field786, var4.field790, var4.field773, var7.field1343 / 2 + var21 + var4.field756, var4.field756 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field693[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field693[var24 * 32 + var23 - 1] > 1) {
						var9.field693[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field693[(var24 - 1) * 32 + var23] > 1) {
						var9.field693[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field693[var24 * 32 + var23 + 1] > 1) {
						var9.field693[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field693[(var24 + 1) * 32 + var23] > 1) {
						var9.field693[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field693[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field693[var26 * 32 + var25 - 1] == 1) {
							var9.field693[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field693[(var26 - 1) * 32 + var25] == 1) {
							var9.field693[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field693[var26 * 32 + var25 + 1] == 1) {
							var9.field693[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field693[(var26 + 1) * 32 + var25] == 1) {
							var9.field693[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field693[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field693[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field693[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field793 != -1) {
			int var29 = var8.field698;
			int var30 = var8.field699;
			var8.field698 = 32;
			var8.field699 = 32;
			var8.method220(0, 0);
			var8.field698 = var29;
			var8.field699 = var30;
		}

		if (arg2 == 0) {
			field779.method439(var9, arg1);
		}

		TIJYBGAE.method487(var14, var15, var13);
		TIJYBGAE.method489(var19, var16, var18, var17);
		ZGIYLEBF.field1489 = var10;
		ZGIYLEBF.field1490 = var11;
		ZGIYLEBF.field1495 = var12;
		ZGIYLEBF.field1487 = true;

		if (var4.field752) {
			var9.field698 = 33;
		} else {
			var9.field698 = 32;
		}

		var9.field699 = arg0;
		return var9;
	}

	@ObfuscatedName("IXFCVZPT.a(LAWEEREDT;)V")
	public static final void method288(AWEEREDT arg0) {
		field751 = new IUVBENCV(arg0.method14("obj.dat", null));
		IUVBENCV var1 = new IUVBENCV(arg0.method14("obj.idx", null));
		field757 = var1.method247();
		field754 = new int[field757];
		int var2 = 2;
		for (int var3 = 0; var3 < field757; var3++) {
			field754[var3] = var2;
			var2 += var1.method247();
		}

		field794 = new IXFCVZPT[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field794[var4] = new IXFCVZPT();
		}
	}

	@ObfuscatedName("IXFCVZPT.b(II)LJJMVUSJJ;")
	public final JJMVUSJJ method289(int arg0) {
		int var2 = field789;
		int var3 = field765;
		int var4 = field766;
		if (arg0 == 1) {
			var2 = field777;
			var3 = field787;
			var4 = field760;
		}

		if (var2 == -1) {
			return null;
		}

		JJMVUSJJ var5 = JJMVUSJJ.method300(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				JJMVUSJJ var9 = JJMVUSJJ.method300(var3);
				JJMVUSJJ[] var10 = new JJMVUSJJ[] { var5, var9 };
				var5 = new JJMVUSJJ(var10, 2);
			} else {
				JJMVUSJJ var6 = JJMVUSJJ.method300(var3);
				JJMVUSJJ var7 = JJMVUSJJ.method300(var4);
				JJMVUSJJ[] var8 = new JJMVUSJJ[] { var5, var6, var7 };
				var5 = new JJMVUSJJ(var8, 3);
			}
		}

		if (arg0 == 0 && field759 != 0) {
			var5.method313(0, field759, 0);
		}

		if (arg0 == 1 && field785 != 0) {
			var5.method313(0, field785, 0);
		}

		if (field791 != null) {
			for (int var11 = 0; var11 < field791.length; var11++) {
				var5.method314(field791[var11], field761[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("IXFCVZPT.a(IZ)LJJMVUSJJ;")
	public final JJMVUSJJ method290(int arg0) {
		int var2 = field758;
		int var3 = field763;
		if (arg0 == 1) {
			var2 = field767;
			var3 = field781;
		}

		if (var2 == -1) {
			return null;
		}

		JJMVUSJJ var4 = JJMVUSJJ.method300(var2);
		if (var3 != -1) {
			JJMVUSJJ var5 = JJMVUSJJ.method300(var3);
			JJMVUSJJ[] var6 = new JJMVUSJJ[] { var4, var5 };
			var4 = new JJMVUSJJ(var6, 2);
		}

		if (field791 != null) {
			for (int var7 = 0; var7 < field791.length; var7++) {
				var4.method314(field791[var7], field761[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("IXFCVZPT.c(I)LJJMVUSJJ;")
	public final JJMVUSJJ method291(int arg0) {
		if (field772 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field748[var3] && field748[var3] != 0) {
					var2 = field772[var3];
				}
			}

			if (var2 != -1) {
				return method285(var2).method291(1);
			}
		}

		JJMVUSJJ var4 = (JJMVUSJJ) field778.method438(field768);
		if (var4 != null) {
			return var4;
		}

		JJMVUSJJ var5 = JJMVUSJJ.method300(field788);
		if (var5 == null) {
			return null;
		}

		if (field774 != 128 || field792 != 128 || field780 != 128) {
			var5.method316(field792, field780, field774);
		}

		if (field791 != null) {
			for (int var6 = 0; var6 < field791.length; var6++) {
				var5.method314(field791[var6], field761[var6]);
			}
		}

		var5.method317(field776 + 64, field764 + 768, -50, -10, -50, true);
		var5.field835 = true;
		field778.method439(var5, field768);
		return var5;
	}

	@ObfuscatedName("IXFCVZPT.a()V")
	public final void method292() {
		field788 = 0;
		field783 = null;
		field750 = null;
		field791 = null;
		field761 = null;
		field782 = 2000;
		field790 = 0;
		field762 = 0;
		field786 = 0;
		field773 = 0;
		field756 = 0;
		field771 = -1;
		field752 = false;
		field755 = 1;
		field747 = false;
		field769 = null;
		field770 = null;
		field789 = -1;
		field765 = -1;
		field759 = 0;
		field777 = -1;
		field787 = -1;
		field785 = 0;
		field766 = -1;
		field760 = -1;
		field758 = -1;
		field763 = -1;
		field767 = -1;
		field781 = -1;
		field772 = null;
		field748 = null;
		field749 = -1;
		field793 = -1;
		field774 = 128;
		field792 = 128;
		field780 = 128;
		field776 = 0;
		field764 = 0;
		field775 = 0;
	}

	@ObfuscatedName("IXFCVZPT.a(LIUVBENCV;B)V")
	public final void method293(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field788 = arg0.method247();
			} else if (var2 == 2) {
				field783 = arg0.method252();
			} else if (var2 == 3) {
				field750 = arg0.method253();
			} else if (var2 == 4) {
				field782 = arg0.method247();
			} else if (var2 == 5) {
				field790 = arg0.method247();
			} else if (var2 == 6) {
				field762 = arg0.method247();
			} else if (var2 == 7) {
				field773 = arg0.method247();
				if (field773 > 32767) {
					field773 -= 0x10000;
				}
			} else if (var2 == 8) {
				field756 = arg0.method247();
				if (field756 > 32767) {
					field756 -= 0x10000;
				}
			} else if (var2 == 10) {
				field771 = arg0.method247();
			} else if (var2 == 11) {
				field752 = true;
			} else if (var2 == 12) {
				field755 = arg0.method250();
			} else if (var2 == 16) {
				field747 = true;
			} else if (var2 == 23) {
				field789 = arg0.method247();
				field759 = arg0.method246();
			} else if (var2 == 24) {
				field765 = arg0.method247();
			} else if (var2 == 25) {
				field777 = arg0.method247();
				field785 = arg0.method246();
			} else if (var2 == 26) {
				field787 = arg0.method247();
			} else if (var2 >= 30 && var2 < 35) {
				if (field769 == null) {
					field769 = new String[5];
				}

				field769[var2 - 30] = arg0.method252();
				if (field769[var2 - 30].equalsIgnoreCase("hidden")) {
					field769[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field770 == null) {
					field770 = new String[5];
				}

				field770[var2 - 35] = arg0.method252();
			} else if (var2 == 40) {
				int var3 = arg0.method245();
				field791 = new int[var3];
				field761 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field791[var4] = arg0.method247();
					field761[var4] = arg0.method247();
				}
			} else if (var2 == 78) {
				field766 = arg0.method247();
			} else if (var2 == 79) {
				field760 = arg0.method247();
			} else if (var2 == 90) {
				field758 = arg0.method247();
			} else if (var2 == 91) {
				field767 = arg0.method247();
			} else if (var2 == 92) {
				field763 = arg0.method247();
			} else if (var2 == 93) {
				field781 = arg0.method247();
			} else if (var2 == 95) {
				field786 = arg0.method247();
			} else if (var2 == 97) {
				field749 = arg0.method247();
			} else if (var2 == 98) {
				field793 = arg0.method247();
			} else if (var2 >= 100 && var2 < 110) {
				if (field772 == null) {
					field772 = new int[10];
					field748 = new int[10];
				}

				field772[var2 - 100] = arg0.method247();
				field748[var2 - 100] = arg0.method247();
			} else if (var2 == 110) {
				field774 = arg0.method247();
			} else if (var2 == 111) {
				field792 = arg0.method247();
			} else if (var2 == 112) {
				field780 = arg0.method247();
			} else if (var2 == 113) {
				field776 = arg0.method246();
			} else if (var2 == 114) {
				field764 = arg0.method246() * 5;
			} else if (var2 == 115) {
				field775 = arg0.method245();
			}
		}
	}

	@ObfuscatedName("IXFCVZPT.a(ZI)Z")
	public final boolean method294(int arg0) {
		int var2 = field758;
		int var3 = field763;
		if (arg0 == 1) {
			var2 = field767;
			var3 = field781;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!JJMVUSJJ.method301(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !JJMVUSJJ.method301(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("IXFCVZPT.a(Z)V")
	public static final void method295() {
		field778 = null;
		field779 = null;
		field754 = null;
		field794 = null;
		field751 = null;
	}
}
