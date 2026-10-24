package deob;

@ObfuscatedName("AAHIRSBF")
public final class AAHIRSBF {

	@ObfuscatedName("AAHIRSBF.k")
	public int field9 = -1;

	@ObfuscatedName("AAHIRSBF.q")
	public static NQQFCAPC field15 = new NQQFCAPC(50);

	@ObfuscatedName("AAHIRSBF.u")
	public static NQQFCAPC field18 = new NQQFCAPC(100);

	@ObfuscatedName("AAHIRSBF.U")
	public static boolean field43 = true;

	@ObfuscatedName("AAHIRSBF.m")
	public byte field11;

	@ObfuscatedName("AAHIRSBF.o")
	public byte field13;

	@ObfuscatedName("AAHIRSBF.a")
	public int field1;

	@ObfuscatedName("AAHIRSBF.l")
	public int field10;

	@ObfuscatedName("AAHIRSBF.r")
	public static int field16;

	@ObfuscatedName("AAHIRSBF.t")
	public int field17;

	@ObfuscatedName("AAHIRSBF.b")
	public int field2;

	@ObfuscatedName("AAHIRSBF.w")
	public int field20;

	@ObfuscatedName("AAHIRSBF.z")
	public int field22;

	@ObfuscatedName("AAHIRSBF.B")
	public int field24;

	@ObfuscatedName("AAHIRSBF.C")
	public int field25;

	@ObfuscatedName("AAHIRSBF.D")
	public int field26;

	@ObfuscatedName("AAHIRSBF.E")
	public int field27;

	@ObfuscatedName("AAHIRSBF.F")
	public int field28;

	@ObfuscatedName("AAHIRSBF.G")
	public static int field29;

	@ObfuscatedName("AAHIRSBF.H")
	public int field30;

	@ObfuscatedName("AAHIRSBF.I")
	public int field31;

	@ObfuscatedName("AAHIRSBF.J")
	public int field32;

	@ObfuscatedName("AAHIRSBF.L")
	public int field34;

	@ObfuscatedName("AAHIRSBF.N")
	public int field36;

	@ObfuscatedName("AAHIRSBF.P")
	public int field38;

	@ObfuscatedName("AAHIRSBF.e")
	public int field4;

	@ObfuscatedName("AAHIRSBF.R")
	public int field40;

	@ObfuscatedName("AAHIRSBF.T")
	public int field42;

	@ObfuscatedName("AAHIRSBF.V")
	public int field44;

	@ObfuscatedName("AAHIRSBF.W")
	public int field45;

	@ObfuscatedName("AAHIRSBF.X")
	public int field46;

	@ObfuscatedName("AAHIRSBF.Z")
	public int field48;

	@ObfuscatedName("AAHIRSBF.f")
	public int field5;

	@ObfuscatedName("AAHIRSBF.g")
	public int field6;

	@ObfuscatedName("AAHIRSBF.i")
	public int field8;

	@ObfuscatedName("AAHIRSBF.h")
	public static WBEWPIXO field7;

	@ObfuscatedName("AAHIRSBF.v")
	public String field19;

	@ObfuscatedName("AAHIRSBF.d")
	public boolean field3;

	@ObfuscatedName("AAHIRSBF.K")
	public boolean field33;

	@ObfuscatedName("AAHIRSBF.O")
	public byte[] field37;

	@ObfuscatedName("AAHIRSBF.x")
	public int[] field21;

	@ObfuscatedName("AAHIRSBF.A")
	public static int[] field23;

	@ObfuscatedName("AAHIRSBF.M")
	public int[] field35;

	@ObfuscatedName("AAHIRSBF.Q")
	public int[] field39;

	@ObfuscatedName("AAHIRSBF.Y")
	public int[] field47;

	@ObfuscatedName("AAHIRSBF.S")
	public static AAHIRSBF[] field41;

	@ObfuscatedName("AAHIRSBF.n")
	public String[] field12;

	@ObfuscatedName("AAHIRSBF.p")
	public String[] field14;

	@ObfuscatedName("AAHIRSBF.a(I)LFCIDIKVY;")
	public final FCIDIKVY method1(int arg0) {
		if (field21 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field47[var3] && field47[var3] != 0) {
					var2 = field21[var3];
				}
			}

			if (var2 != -1) {
				return method7(var2).method1(1);
			}
		}

		FCIDIKVY var4 = (FCIDIKVY) field15.method334(field9);
		if (var4 != null) {
			return var4;
		}

		FCIDIKVY var5 = FCIDIKVY.method199(field27);
		if (var5 == null) {
			return null;
		}

		if (field36 != 128 || field1 != 128 || field6 != 128) {
			var5.method215(field6, field36, field1);
		}

		if (field35 != null) {
			for (int var6 = 0; var6 < field35.length; var6++) {
				var5.method213(field35[var6], field39[var6]);
			}
		}

		var5.method216(field25 + 64, field30 + 768, -50, -10, -50, true);
		var5.field717 = true;
		field15.method335(field9, var5);
		return var5;
	}

	@ObfuscatedName("AAHIRSBF.a(II)Z")
	public final boolean method2(int arg0) {
		int var2 = field17;
		int var3 = field32;
		if (arg0 == 1) {
			var2 = field2;
			var3 = field34;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!FCIDIKVY.method200(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !FCIDIKVY.method200(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("AAHIRSBF.b(II)LFCIDIKVY;")
	public final FCIDIKVY method3(int arg0) {
		int var2 = field8;
		int var3 = field45;
		int var4 = field42;
		if (arg0 == 1) {
			var2 = field10;
			var3 = field24;
			var4 = field4;
		}

		if (var2 == -1) {
			return null;
		}

		FCIDIKVY var5 = FCIDIKVY.method199(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				FCIDIKVY var9 = FCIDIKVY.method199(var3);
				FCIDIKVY[] var10 = new FCIDIKVY[] { var5, var9 };
				var5 = new FCIDIKVY(2, var10);
			} else {
				FCIDIKVY var6 = FCIDIKVY.method199(var3);
				FCIDIKVY var7 = FCIDIKVY.method199(var4);
				FCIDIKVY[] var8 = new FCIDIKVY[] { var5, var6, var7 };
				var5 = new FCIDIKVY(3, var8);
			}
		}

		if (arg0 == 0 && field13 != 0) {
			var5.method212(0, field13, 0);
		}

		if (arg0 == 1 && field11 != 0) {
			var5.method212(0, field11, 0);
		}

		if (field35 != null) {
			for (int var11 = 0; var11 < field35.length; var11++) {
				var5.method213(field35[var11], field39[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("AAHIRSBF.a(IIIB)LOGPNACTP;")
	public static final OGPNACTP method4(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			OGPNACTP var3 = (OGPNACTP) field18.method334(arg1);
			if (var3 != null && var3.field1139 != arg2 && var3.field1139 != -1) {
				var3.method41();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		AAHIRSBF var4 = method7(arg1);
		if (var4.field21 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field47[var6] && var4.field47[var6] != 0) {
					var5 = var4.field21[var6];
				}
			}

			if (var5 != -1) {
				var4 = method7(var5);
			}
		}

		FCIDIKVY var7 = var4.method1(1);
		if (var7 == null) {
			return null;
		}

		OGPNACTP var8 = null;
		if (var4.field31 != -1) {
			var8 = method4(-1, var4.field22, 10);
			if (var8 == null) {
				return null;
			}
		}

		OGPNACTP var9 = new OGPNACTP(32, 32);
		int var10 = PIHSODZS.field1190;
		int var11 = PIHSODZS.field1191;
		int[] var12 = PIHSODZS.field1196;
		int[] var13 = KPYGFVMA.field968;
		int var14 = KPYGFVMA.field969;
		int var15 = KPYGFVMA.field970;
		int var16 = KPYGFVMA.field973;
		int var17 = KPYGFVMA.field974;
		int var18 = KPYGFVMA.field971;
		int var19 = KPYGFVMA.field972;
		PIHSODZS.field1188 = false;
		KPYGFVMA.method310(32, 32, var9.field1133);
		KPYGFVMA.method315(0, 0, 0, 32, 32);
		PIHSODZS.method373();
		int var20 = var4.field5;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = PIHSODZS.field1194[var4.field48] * var20 >> 16;
		int var22 = PIHSODZS.field1195[var4.field48] * var20 >> 16;
		var7.method220(0, var4.field40, var4.field20, var4.field48, var4.field26, var7.field660 / 2 + var21 + var4.field28, var4.field28 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1133[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1133[var24 * 32 + var23 - 1] > 1) {
						var9.field1133[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1133[(var24 - 1) * 32 + var23] > 1) {
						var9.field1133[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1133[var24 * 32 + var23 + 1] > 1) {
						var9.field1133[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1133[(var24 + 1) * 32 + var23] > 1) {
						var9.field1133[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1133[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1133[var26 * 32 + var25 - 1] == 1) {
							var9.field1133[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1133[(var26 - 1) * 32 + var25] == 1) {
							var9.field1133[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1133[var26 * 32 + var25 + 1] == 1) {
							var9.field1133[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1133[(var26 + 1) * 32 + var25] == 1) {
							var9.field1133[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1133[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1133[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1133[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field31 != -1) {
			int var29 = var8.field1138;
			int var30 = var8.field1139;
			var8.field1138 = 32;
			var8.field1139 = 32;
			var8.method356(0, 0);
			var8.field1138 = var29;
			var8.field1139 = var30;
		}

		if (arg0 == 0) {
			field18.method335(arg1, var9);
		}

		KPYGFVMA.method310(var14, var15, var13);
		KPYGFVMA.method312(var18, var19, var17, var16);
		PIHSODZS.field1190 = var10;
		PIHSODZS.field1191 = var11;
		PIHSODZS.field1196 = var12;
		PIHSODZS.field1188 = true;

		if (var4.field3) {
			var9.field1138 = 33;
		} else {
			var9.field1138 = 32;
		}

		var9.field1139 = arg2;
		return var9;
	}

	@ObfuscatedName("AAHIRSBF.b(I)V")
	public static final void method5() {
		field15 = null;
		field18 = null;
		field23 = null;
		field41 = null;
		field7 = null;
	}

	@ObfuscatedName("AAHIRSBF.c(II)LFCIDIKVY;")
	public final FCIDIKVY method6(int arg0) {
		int var2 = field17;
		int var3 = field32;
		if (arg0 == 1) {
			var2 = field2;
			var3 = field34;
		}

		if (var2 == -1) {
			return null;
		}

		FCIDIKVY var4 = FCIDIKVY.method199(var2);
		if (var3 != -1) {
			FCIDIKVY var5 = FCIDIKVY.method199(var3);
			FCIDIKVY[] var6 = new FCIDIKVY[] { var4, var5 };
			var4 = new FCIDIKVY(2, var6);
		}

		if (field35 != null) {
			for (int var7 = 0; var7 < field35.length; var7++) {
				var4.method213(field35[var7], field39[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AAHIRSBF.c(I)LAAHIRSBF;")
	public static final AAHIRSBF method7(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field41[var1].field9 == arg0) {
				return field41[var1];
			}
		}

		field29 = (field29 + 1) % 10;
		AAHIRSBF var2 = field41[field29];
		field7.field1401 = field23[arg0];
		var2.field9 = arg0;
		var2.method12();
		var2.method10(field7);

		if (var2.field31 != -1) {
			var2.method11();
		}

		if (!field43 && var2.field33) {
			var2.field19 = "Members Object";
			var2.field37 = "Login to a members' server to use this object.".getBytes();
			var2.field12 = null;
			var2.field14 = null;
			var2.field46 = 0;
		}

		return var2;
	}

	@ObfuscatedName("AAHIRSBF.a(LLKPVZAQN;)V")
	public static final void method8(LKPVZAQN arg0) {
		field7 = new WBEWPIXO(arg0.method323("obj.dat", null));
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("obj.idx", null));
		field16 = var1.method517();
		field23 = new int[field16];
		int var2 = 2;
		for (int var3 = 0; var3 < field16; var3++) {
			field23[var3] = var2;
			var2 += var1.method517();
		}

		field41 = new AAHIRSBF[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field41[var4] = new AAHIRSBF();
		}
	}

	@ObfuscatedName("AAHIRSBF.d(II)LFCIDIKVY;")
	public final FCIDIKVY method9(int arg0) {
		if (field21 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field47[var3] && field47[var3] != 0) {
					var2 = field21[var3];
				}
			}

			if (var2 != -1) {
				return method7(var2).method9(1);
			}
		}

		FCIDIKVY var4 = FCIDIKVY.method199(field27);
		if (var4 == null) {
			return null;
		}

		if (field35 != null) {
			for (int var5 = 0; var5 < field35.length; var5++) {
				var4.method213(field35[var5], field39[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AAHIRSBF.a(LWBEWPIXO;I)V")
	public final void method10(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field27 = arg0.method517();
			} else if (var2 == 2) {
				field19 = arg0.method522();
			} else if (var2 == 3) {
				field37 = arg0.method523();
			} else if (var2 == 4) {
				field5 = arg0.method517();
			} else if (var2 == 5) {
				field48 = arg0.method517();
			} else if (var2 == 6) {
				field40 = arg0.method517();
			} else if (var2 == 7) {
				field26 = arg0.method517();
				if (field26 > 32767) {
					field26 -= 0x10000;
				}
			} else if (var2 == 8) {
				field28 = arg0.method517();
				if (field28 > 32767) {
					field28 -= 0x10000;
				}
			} else if (var2 == 10) {
				field38 = arg0.method517();
			} else if (var2 == 11) {
				field3 = true;
			} else if (var2 == 12) {
				field44 = arg0.method520();
			} else if (var2 == 16) {
				field33 = true;
			} else if (var2 == 23) {
				field8 = arg0.method517();
				field13 = arg0.method516();
			} else if (var2 == 24) {
				field45 = arg0.method517();
			} else if (var2 == 25) {
				field10 = arg0.method517();
				field11 = arg0.method516();
			} else if (var2 == 26) {
				field24 = arg0.method517();
			} else if (var2 >= 30 && var2 < 35) {
				if (field12 == null) {
					field12 = new String[5];
				}

				field12[var2 - 30] = arg0.method522();
				if (field12[var2 - 30].equalsIgnoreCase("hidden")) {
					field12[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field14 == null) {
					field14 = new String[5];
				}

				field14[var2 - 35] = arg0.method522();
			} else if (var2 == 40) {
				int var3 = arg0.method515();
				field35 = new int[var3];
				field39 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field35[var4] = arg0.method517();
					field39[var4] = arg0.method517();
				}
			} else if (var2 == 78) {
				field42 = arg0.method517();
			} else if (var2 == 79) {
				field4 = arg0.method517();
			} else if (var2 == 90) {
				field17 = arg0.method517();
			} else if (var2 == 91) {
				field2 = arg0.method517();
			} else if (var2 == 92) {
				field32 = arg0.method517();
			} else if (var2 == 93) {
				field34 = arg0.method517();
			} else if (var2 == 95) {
				field20 = arg0.method517();
			} else if (var2 == 97) {
				field22 = arg0.method517();
			} else if (var2 == 98) {
				field31 = arg0.method517();
			} else if (var2 >= 100 && var2 < 110) {
				if (field21 == null) {
					field21 = new int[10];
					field47 = new int[10];
				}

				field21[var2 - 100] = arg0.method517();
				field47[var2 - 100] = arg0.method517();
			} else if (var2 == 110) {
				field36 = arg0.method517();
			} else if (var2 == 111) {
				field1 = arg0.method517();
			} else if (var2 == 112) {
				field6 = arg0.method517();
			} else if (var2 == 113) {
				field25 = arg0.method516();
			} else if (var2 == 114) {
				field30 = arg0.method516() * 5;
			} else if (var2 == 115) {
				field46 = arg0.method515();
			}
		}
	}

	@ObfuscatedName("AAHIRSBF.a(Z)V")
	public void method11() {
		AAHIRSBF var1 = method7(field31);
		field27 = var1.field27;
		field5 = var1.field5;
		field48 = var1.field48;
		field40 = var1.field40;
		field20 = var1.field20;
		field26 = var1.field26;
		field28 = var1.field28;
		field35 = var1.field35;
		field39 = var1.field39;
		AAHIRSBF var2 = method7(field22);
		field19 = var2.field19;
		field33 = var2.field33;
		field44 = var2.field44;
		String var3 = "a";
		char var4 = var2.field19.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field37 = ("Swap this note at any bank for " + var3 + " " + var2.field19 + ".").getBytes();
		field3 = true;
	}

	@ObfuscatedName("AAHIRSBF.a()V")
	public final void method12() {
		field27 = 0;
		field19 = null;
		field37 = null;
		field35 = null;
		field39 = null;
		field5 = 2000;
		field48 = 0;
		field40 = 0;
		field20 = 0;
		field26 = 0;
		field28 = 0;
		field38 = -1;
		field3 = false;
		field44 = 1;
		field33 = false;
		field12 = null;
		field14 = null;
		field8 = -1;
		field45 = -1;
		field13 = 0;
		field10 = -1;
		field24 = -1;
		field11 = 0;
		field42 = -1;
		field4 = -1;
		field17 = -1;
		field32 = -1;
		field2 = -1;
		field34 = -1;
		field21 = null;
		field47 = null;
		field22 = -1;
		field31 = -1;
		field36 = 128;
		field1 = 128;
		field6 = 128;
		field25 = 0;
		field30 = 0;
		field46 = 0;
	}

	@ObfuscatedName("AAHIRSBF.e(II)Z")
	public final boolean method13(int arg0) {
		int var2 = field8;
		int var3 = field45;
		int var4 = field42;
		if (arg0 == 1) {
			var2 = field10;
			var3 = field24;
			var4 = field4;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!FCIDIKVY.method200(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !FCIDIKVY.method200(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !FCIDIKVY.method200(var4)) {
			var5 = false;
		}

		return var5;
	}
}
