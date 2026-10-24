package deob;

@ObfuscatedName("JPUETSNB")
public final class JPUETSNB {

	@ObfuscatedName("JPUETSNB.u")
	public int field765 = -1;

	@ObfuscatedName("JPUETSNB.z")
	public static boolean field770 = true;

	@ObfuscatedName("JPUETSNB.I")
	public static LSQNLJTA field777 = new LSQNLJTA(50);

	@ObfuscatedName("JPUETSNB.K")
	public static LSQNLJTA field779 = new LSQNLJTA(100);

	@ObfuscatedName("JPUETSNB.m")
	public byte field757;

	@ObfuscatedName("JPUETSNB.Z")
	public byte field792;

	@ObfuscatedName("JPUETSNB.a")
	public int field746;

	@ObfuscatedName("JPUETSNB.b")
	public int field747;

	@ObfuscatedName("JPUETSNB.d")
	public int field748;

	@ObfuscatedName("JPUETSNB.e")
	public int field749;

	@ObfuscatedName("JPUETSNB.f")
	public int field750;

	@ObfuscatedName("JPUETSNB.h")
	public int field752;

	@ObfuscatedName("JPUETSNB.i")
	public int field753;

	@ObfuscatedName("JPUETSNB.j")
	public int field754;

	@ObfuscatedName("JPUETSNB.k")
	public int field755;

	@ObfuscatedName("JPUETSNB.l")
	public int field756;

	@ObfuscatedName("JPUETSNB.n")
	public static int field758;

	@ObfuscatedName("JPUETSNB.o")
	public int field759;

	@ObfuscatedName("JPUETSNB.q")
	public int field761;

	@ObfuscatedName("JPUETSNB.r")
	public int field762;

	@ObfuscatedName("JPUETSNB.s")
	public int field763;

	@ObfuscatedName("JPUETSNB.A")
	public int field771;

	@ObfuscatedName("JPUETSNB.B")
	public static int field772;

	@ObfuscatedName("JPUETSNB.E")
	public int field774;

	@ObfuscatedName("JPUETSNB.G")
	public int field775;

	@ObfuscatedName("JPUETSNB.J")
	public int field778;

	@ObfuscatedName("JPUETSNB.M")
	public int field781;

	@ObfuscatedName("JPUETSNB.N")
	public int field782;

	@ObfuscatedName("JPUETSNB.P")
	public int field784;

	@ObfuscatedName("JPUETSNB.S")
	public int field785;

	@ObfuscatedName("JPUETSNB.T")
	public int field786;

	@ObfuscatedName("JPUETSNB.V")
	public int field788;

	@ObfuscatedName("JPUETSNB.W")
	public int field789;

	@ObfuscatedName("JPUETSNB.X")
	public int field790;

	@ObfuscatedName("JPUETSNB.Y")
	public int field791;

	@ObfuscatedName("JPUETSNB.t")
	public static CFARFRSG field764;

	@ObfuscatedName("JPUETSNB.x")
	public String field768;

	@ObfuscatedName("JPUETSNB.v")
	public boolean field766;

	@ObfuscatedName("JPUETSNB.ab")
	public boolean field793;

	@ObfuscatedName("JPUETSNB.U")
	public byte[] field787;

	@ObfuscatedName("JPUETSNB.g")
	public int[] field751;

	@ObfuscatedName("JPUETSNB.p")
	public int[] field760;

	@ObfuscatedName("JPUETSNB.C")
	public static int[] field773;

	@ObfuscatedName("JPUETSNB.H")
	public int[] field776;

	@ObfuscatedName("JPUETSNB.O")
	public int[] field783;

	@ObfuscatedName("JPUETSNB.L")
	public static JPUETSNB[] field780;

	@ObfuscatedName("JPUETSNB.w")
	public String[] field767;

	@ObfuscatedName("JPUETSNB.y")
	public String[] field769;

	@ObfuscatedName("JPUETSNB.a()V")
	public final void method324() {
		field774 = 0;
		field768 = null;
		field787 = null;
		field760 = null;
		field776 = null;
		field778 = 2000;
		field782 = 0;
		field759 = 0;
		field775 = 0;
		field762 = 0;
		field786 = 0;
		field784 = -1;
		field793 = false;
		field747 = 1;
		field766 = false;
		field767 = null;
		field769 = null;
		field756 = -1;
		field753 = -1;
		field757 = 0;
		field748 = -1;
		field761 = -1;
		field792 = 0;
		field750 = -1;
		field771 = -1;
		field763 = -1;
		field781 = -1;
		field749 = -1;
		field785 = -1;
		field751 = null;
		field783 = null;
		field746 = -1;
		field752 = -1;
		field754 = 128;
		field791 = 128;
		field789 = 128;
		field790 = 0;
		field788 = 0;
		field755 = 0;
	}

	@ObfuscatedName("JPUETSNB.a(II)LLFTMDGKK;")
	public final LFTMDGKK method325(int arg0) {
		int var2 = field763;
		int var3 = field781;
		if (arg0 == 1) {
			var2 = field749;
			var3 = field785;
		}

		if (var2 == -1) {
			return null;
		}

		LFTMDGKK var4 = LFTMDGKK.method341(var2);
		if (var3 != -1) {
			LFTMDGKK var5 = LFTMDGKK.method341(var3);
			LFTMDGKK[] var6 = new LFTMDGKK[] { var4, var5 };
			var4 = new LFTMDGKK(2, var6);
		}

		if (field760 != null) {
			for (int var7 = 0; var7 < field760.length; var7++) {
				var4.method355(field760[var7], field776[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("JPUETSNB.a(IZ)LLFTMDGKK;")
	public final LFTMDGKK method326(int arg0) {
		if (field751 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field783[var3] && field783[var3] != 0) {
					var2 = field751[var3];
				}
			}

			if (var2 != -1) {
				return method329(var2).method326(1);
			}
		}

		LFTMDGKK var4 = LFTMDGKK.method341(field774);
		if (var4 == null) {
			return null;
		}

		if (field760 != null) {
			for (int var5 = 0; var5 < field760.length; var5++) {
				var4.method355(field760[var5], field776[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("JPUETSNB.b(II)Z")
	public final boolean method327(int arg0) {
		int var2 = field763;
		int var3 = field781;
		if (arg0 == 1) {
			var2 = field749;
			var3 = field785;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!LFTMDGKK.method342(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !LFTMDGKK.method342(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("JPUETSNB.a(B)V")
	public void method328() {
		JPUETSNB var1 = method329(field752);
		field774 = var1.field774;
		field778 = var1.field778;
		field782 = var1.field782;
		field759 = var1.field759;
		field775 = var1.field775;
		field762 = var1.field762;
		field786 = var1.field786;
		field760 = var1.field760;
		field776 = var1.field776;
		JPUETSNB var2 = method329(field746);
		field768 = var2.field768;
		field766 = var2.field766;
		field747 = var2.field747;
		String var3 = "a";
		char var4 = var2.field768.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field787 = ("Swap this note at any bank for " + var3 + " " + var2.field768 + ".").getBytes();
		field793 = true;
	}

	@ObfuscatedName("JPUETSNB.a(I)LJPUETSNB;")
	public static final JPUETSNB method329(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field780[var1].field765 == arg0) {
				return field780[var1];
			}
		}

		field772 = (field772 + 1) % 10;
		JPUETSNB var2 = field780[field772];
		field764.field44 = field773[arg0];
		var2.field765 = arg0;
		var2.method324();
		var2.method330(field764);

		if (var2.field752 != -1) {
			var2.method328();
		}

		if (!field770 && var2.field766) {
			var2.field768 = "Members Object";
			var2.field787 = "Login to a members' server to use this object.".getBytes();
			var2.field767 = null;
			var2.field769 = null;
			var2.field755 = 0;
		}

		return var2;
	}

	@ObfuscatedName("JPUETSNB.a(LCFARFRSG;I)V")
	public final void method330(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field774 = arg0.method32();
			} else if (var2 == 2) {
				field768 = arg0.method37();
			} else if (var2 == 3) {
				field787 = arg0.method38();
			} else if (var2 == 4) {
				field778 = arg0.method32();
			} else if (var2 == 5) {
				field782 = arg0.method32();
			} else if (var2 == 6) {
				field759 = arg0.method32();
			} else if (var2 == 7) {
				field762 = arg0.method32();
				if (field762 > 32767) {
					field762 -= 0x10000;
				}
			} else if (var2 == 8) {
				field786 = arg0.method32();
				if (field786 > 32767) {
					field786 -= 0x10000;
				}
			} else if (var2 == 10) {
				field784 = arg0.method32();
			} else if (var2 == 11) {
				field793 = true;
			} else if (var2 == 12) {
				field747 = arg0.method35();
			} else if (var2 == 16) {
				field766 = true;
			} else if (var2 == 23) {
				field756 = arg0.method32();
				field757 = arg0.method31();
			} else if (var2 == 24) {
				field753 = arg0.method32();
			} else if (var2 == 25) {
				field748 = arg0.method32();
				field792 = arg0.method31();
			} else if (var2 == 26) {
				field761 = arg0.method32();
			} else if (var2 >= 30 && var2 < 35) {
				if (field767 == null) {
					field767 = new String[5];
				}

				field767[var2 - 30] = arg0.method37();
				if (field767[var2 - 30].equalsIgnoreCase("hidden")) {
					field767[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field769 == null) {
					field769 = new String[5];
				}

				field769[var2 - 35] = arg0.method37();
			} else if (var2 == 40) {
				int var3 = arg0.method30();
				field760 = new int[var3];
				field776 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field760[var4] = arg0.method32();
					field776[var4] = arg0.method32();
				}
			} else if (var2 == 78) {
				field750 = arg0.method32();
			} else if (var2 == 79) {
				field771 = arg0.method32();
			} else if (var2 == 90) {
				field763 = arg0.method32();
			} else if (var2 == 91) {
				field749 = arg0.method32();
			} else if (var2 == 92) {
				field781 = arg0.method32();
			} else if (var2 == 93) {
				field785 = arg0.method32();
			} else if (var2 == 95) {
				field775 = arg0.method32();
			} else if (var2 == 97) {
				field746 = arg0.method32();
			} else if (var2 == 98) {
				field752 = arg0.method32();
			} else if (var2 >= 100 && var2 < 110) {
				if (field751 == null) {
					field751 = new int[10];
					field783 = new int[10];
				}

				field751[var2 - 100] = arg0.method32();
				field783[var2 - 100] = arg0.method32();
			} else if (var2 == 110) {
				field754 = arg0.method32();
			} else if (var2 == 111) {
				field791 = arg0.method32();
			} else if (var2 == 112) {
				field789 = arg0.method32();
			} else if (var2 == 113) {
				field790 = arg0.method31();
			} else if (var2 == 114) {
				field788 = arg0.method31() * 5;
			} else if (var2 == 115) {
				field755 = arg0.method30();
			}
		}
	}

	@ObfuscatedName("JPUETSNB.a(IB)LLFTMDGKK;")
	public final LFTMDGKK method331(int arg0) {
		int var2 = field756;
		int var3 = field753;
		int var4 = field750;
		if (arg0 == 1) {
			var2 = field748;
			var3 = field761;
			var4 = field771;
		}

		if (var2 == -1) {
			return null;
		}

		LFTMDGKK var5 = LFTMDGKK.method341(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				LFTMDGKK var9 = LFTMDGKK.method341(var3);
				LFTMDGKK[] var10 = new LFTMDGKK[] { var5, var9 };
				var5 = new LFTMDGKK(2, var10);
			} else {
				LFTMDGKK var6 = LFTMDGKK.method341(var3);
				LFTMDGKK var7 = LFTMDGKK.method341(var4);
				LFTMDGKK[] var8 = new LFTMDGKK[] { var5, var6, var7 };
				var5 = new LFTMDGKK(3, var8);
			}
		}

		if (arg0 == 0 && field757 != 0) {
			var5.method354(field757, 0, 0);
		}

		if (arg0 == 1 && field792 != 0) {
			var5.method354(field792, 0, 0);
		}

		if (field760 != null) {
			for (int var11 = 0; var11 < field760.length; var11++) {
				var5.method355(field760[var11], field776[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("JPUETSNB.b(I)LLFTMDGKK;")
	public final LFTMDGKK method332(int arg0) {
		if (field751 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field783[var3] && field783[var3] != 0) {
					var2 = field751[var3];
				}
			}

			if (var2 != -1) {
				return method329(var2).method332(1);
			}
		}

		LFTMDGKK var4 = (LFTMDGKK) field777.method369(field765);
		if (var4 != null) {
			return var4;
		}

		LFTMDGKK var5 = LFTMDGKK.method341(field774);
		if (var5 == null) {
			return null;
		}

		if (field754 != 128 || field791 != 128 || field789 != 128) {
			var5.method357(field791, field789, field754);
		}

		if (field760 != null) {
			for (int var6 = 0; var6 < field760.length; var6++) {
				var5.method355(field760[var6], field776[var6]);
			}
		}

		var5.method358(field790 + 64, field788 + 768, -50, -10, -50, true);
		var5.field853 = true;
		field777.method370(var5, field765);
		return var5;
	}

	@ObfuscatedName("JPUETSNB.a(Z)V")
	public static final void method333() {
		field777 = null;
		field779 = null;
		field773 = null;
		field780 = null;
		field764 = null;
	}

	@ObfuscatedName("JPUETSNB.a(LVSUYIIVA;)V")
	public static final void method334(VSUYIIVA arg0) {
		field764 = new CFARFRSG(arg0.method570("obj.dat", null));
		CFARFRSG var1 = new CFARFRSG(arg0.method570("obj.idx", null));
		field758 = var1.method32();
		field773 = new int[field758];
		int var2 = 2;
		for (int var3 = 0; var3 < field758; var3++) {
			field773[var3] = var2;
			var2 += var1.method32();
		}

		field780 = new JPUETSNB[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field780[var4] = new JPUETSNB();
		}
	}

	@ObfuscatedName("JPUETSNB.b(IB)Z")
	public final boolean method335(int arg0) {
		int var2 = field756;
		int var3 = field753;
		int var4 = field750;
		if (arg0 == 1) {
			var2 = field748;
			var3 = field761;
			var4 = field771;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!LFTMDGKK.method342(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !LFTMDGKK.method342(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !LFTMDGKK.method342(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("JPUETSNB.a(IIIB)LCUKAGIIJ;")
	public static final CUKAGIIJ method336(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			CUKAGIIJ var3 = (CUKAGIIJ) field779.method369(arg1);
			if (var3 != null && var3.field490 != arg2 && var3.field490 != -1) {
				var3.method582();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		JPUETSNB var4 = method329(arg1);
		if (var4.field751 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field783[var6] && var4.field783[var6] != 0) {
					var5 = var4.field751[var6];
				}
			}

			if (var5 != -1) {
				var4 = method329(var5);
			}
		}

		LFTMDGKK var7 = var4.method332(1);
		if (var7 == null) {
			return null;
		}

		CUKAGIIJ var8 = null;
		if (var4.field752 != -1) {
			var8 = method336(-1, var4.field746, 10);
			if (var8 == null) {
				return null;
			}
		}

		CUKAGIIJ var9 = new CUKAGIIJ(32, 32);
		int var10 = UJNRJRYE.field1284;
		int var11 = UJNRJRYE.field1285;
		int[] var12 = UJNRJRYE.field1290;
		int[] var13 = OKWPDMPE.field979;
		int var14 = OKWPDMPE.field980;
		int var15 = OKWPDMPE.field981;
		int var16 = OKWPDMPE.field984;
		int var17 = OKWPDMPE.field985;
		int var18 = OKWPDMPE.field982;
		int var19 = OKWPDMPE.field983;
		UJNRJRYE.field1282 = false;
		OKWPDMPE.method431(32, 32, var9.field484);
		OKWPDMPE.method436(0, 0, 0, 32, 32);
		UJNRJRYE.method548();
		int var20 = var4.field778;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = UJNRJRYE.field1288[var4.field782] * var20 >> 16;
		int var22 = UJNRJRYE.field1289[var4.field782] * var20 >> 16;
		var7.method361(0, var4.field759, var4.field775, var4.field782, var4.field762, var7.field494 / 2 + var21 + var4.field786, var4.field786 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field484[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field484[var24 * 32 + var23 - 1] > 1) {
						var9.field484[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field484[(var24 - 1) * 32 + var23] > 1) {
						var9.field484[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field484[var24 * 32 + var23 + 1] > 1) {
						var9.field484[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field484[(var24 + 1) * 32 + var23] > 1) {
						var9.field484[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field484[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field484[var26 * 32 + var25 - 1] == 1) {
							var9.field484[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field484[(var26 - 1) * 32 + var25] == 1) {
							var9.field484[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field484[var26 * 32 + var25 + 1] == 1) {
							var9.field484[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field484[(var26 + 1) * 32 + var25] == 1) {
							var9.field484[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field484[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field484[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field484[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field752 != -1) {
			int var29 = var8.field489;
			int var30 = var8.field490;
			var8.field489 = 32;
			var8.field490 = 32;
			var8.method223(0, 0);
			var8.field489 = var29;
			var8.field490 = var30;
		}

		if (arg0 == 0) {
			field779.method370(var9, arg1);
		}

		OKWPDMPE.method431(var14, var15, var13);
		OKWPDMPE.method433(var17, var19, var16, var18);
		UJNRJRYE.field1284 = var10;
		UJNRJRYE.field1285 = var11;
		UJNRJRYE.field1290 = var12;
		UJNRJRYE.field1282 = true;

		if (var4.field793) {
			var9.field489 = 33;
		} else {
			var9.field489 = 32;
		}

		var9.field490 = arg2;
		return var9;
	}
}
