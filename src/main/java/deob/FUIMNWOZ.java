package deob;

@ObfuscatedName("FUIMNWOZ")
public final class FUIMNWOZ {

	@ObfuscatedName("FUIMNWOZ.F")
	public String field797 = "null";

	@ObfuscatedName("FUIMNWOZ.H")
	public int field799 = -1;

	@ObfuscatedName("FUIMNWOZ.a")
	public static FCIDIKVY[] field768 = new FCIDIKVY[4];

	@ObfuscatedName("FUIMNWOZ.e")
	public static NQQFCAPC field772 = new NQQFCAPC(500);

	@ObfuscatedName("FUIMNWOZ.S")
	public static NQQFCAPC field809 = new NQQFCAPC(40);

	@ObfuscatedName("FUIMNWOZ.l")
	public byte field778;

	@ObfuscatedName("FUIMNWOZ.R")
	public byte field808;

	@ObfuscatedName("FUIMNWOZ.b")
	public int field769;

	@ObfuscatedName("FUIMNWOZ.o")
	public int field781;

	@ObfuscatedName("FUIMNWOZ.p")
	public int field782;

	@ObfuscatedName("FUIMNWOZ.q")
	public int field783;

	@ObfuscatedName("FUIMNWOZ.r")
	public int field784;

	@ObfuscatedName("FUIMNWOZ.s")
	public int field785;

	@ObfuscatedName("FUIMNWOZ.t")
	public int field786;

	@ObfuscatedName("FUIMNWOZ.x")
	public int field790;

	@ObfuscatedName("FUIMNWOZ.z")
	public int field792;

	@ObfuscatedName("FUIMNWOZ.D")
	public static int field795;

	@ObfuscatedName("FUIMNWOZ.E")
	public int field796;

	@ObfuscatedName("FUIMNWOZ.G")
	public int field798;

	@ObfuscatedName("FUIMNWOZ.I")
	public static int field800;

	@ObfuscatedName("FUIMNWOZ.M")
	public int field804;

	@ObfuscatedName("FUIMNWOZ.O")
	public int field806;

	@ObfuscatedName("FUIMNWOZ.U")
	public int field811;

	@ObfuscatedName("FUIMNWOZ.V")
	public int field812;

	@ObfuscatedName("FUIMNWOZ.X")
	public int field814;

	@ObfuscatedName("FUIMNWOZ.h")
	public static WBEWPIXO field775;

	@ObfuscatedName("FUIMNWOZ.C")
	public static client field794;

	@ObfuscatedName("FUIMNWOZ.c")
	public boolean field770;

	@ObfuscatedName("FUIMNWOZ.f")
	public boolean field773;

	@ObfuscatedName("FUIMNWOZ.i")
	public boolean field776;

	@ObfuscatedName("FUIMNWOZ.j")
	public boolean field777;

	@ObfuscatedName("FUIMNWOZ.m")
	public boolean field779;

	@ObfuscatedName("FUIMNWOZ.n")
	public boolean field780;

	@ObfuscatedName("FUIMNWOZ.u")
	public boolean field787;

	@ObfuscatedName("FUIMNWOZ.L")
	public boolean field803;

	@ObfuscatedName("FUIMNWOZ.Q")
	public boolean field807;

	@ObfuscatedName("FUIMNWOZ.T")
	public static boolean field810;

	@ObfuscatedName("FUIMNWOZ.W")
	public boolean field813;

	@ObfuscatedName("FUIMNWOZ.N")
	public byte[] field805;

	@ObfuscatedName("FUIMNWOZ.d")
	public int[] field771;

	@ObfuscatedName("FUIMNWOZ.g")
	public int[] field774;

	@ObfuscatedName("FUIMNWOZ.w")
	public int[] field789;

	@ObfuscatedName("FUIMNWOZ.y")
	public int[] field791;

	@ObfuscatedName("FUIMNWOZ.A")
	public static int[] field793;

	@ObfuscatedName("FUIMNWOZ.J")
	public int[] field801;

	@ObfuscatedName("FUIMNWOZ.v")
	public static FUIMNWOZ[] field788;

	@ObfuscatedName("FUIMNWOZ.K")
	public String[] field802;

	@ObfuscatedName("FUIMNWOZ.a(LLKPVZAQN;)V")
	public static final void method236(LKPVZAQN arg0) {
		field775 = new WBEWPIXO(arg0.method323("loc.dat", null));
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("loc.idx", null));
		field800 = var1.method517();
		field793 = new int[field800];
		int var2 = 2;
		for (int var3 = 0; var3 < field800; var3++) {
			field793[var3] = var2;
			var2 += var1.method517();
		}

		field788 = new FUIMNWOZ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field788[var4] = new FUIMNWOZ();
		}
	}

	@ObfuscatedName("FUIMNWOZ.a(I)V")
	public static final void method237() {
		field772 = null;
		field809 = null;
		field793 = null;
		field788 = null;
		field775 = null;
	}

	@ObfuscatedName("FUIMNWOZ.b(I)LFUIMNWOZ;")
	public final FUIMNWOZ method238() {
		int var1 = -1;
		if (field811 != -1) {
			UDOLPBTU var2 = UDOLPBTU.field1382[field811];
			int var3 = var2.field1384;
			int var4 = var2.field1385;
			int var5 = var2.field1386;
			int var6 = client.field264[var5 - var4];
			var1 = field794.field626[var3] >> var4 & var6;
		} else if (field798 != -1) {
			var1 = field794.field626[field798];
		}

		if (var1 >= 0 && var1 < field771.length && field771[var1] != -1) {
			return method246(field771[var1]);
		}

		return null;
	}

	@ObfuscatedName("FUIMNWOZ.a()V")
	public final void method239() {
		field791 = null;
		field774 = null;
		field797 = "null";
		field805 = null;
		field789 = null;
		field801 = null;
		field814 = 1;
		field804 = 1;
		field780 = true;
		field779 = true;
		field807 = false;
		field813 = false;
		field803 = false;
		field787 = false;
		field783 = -1;
		field782 = 16;
		field808 = 0;
		field778 = 0;
		field802 = null;
		field790 = -1;
		field792 = -1;
		field773 = false;
		field777 = true;
		field769 = 128;
		field785 = 128;
		field796 = 128;
		field786 = 0;
		field806 = 0;
		field781 = 0;
		field812 = 0;
		field776 = false;
		field770 = false;
		field784 = -1;
		field811 = -1;
		field798 = -1;
		field771 = null;
	}

	@ObfuscatedName("FUIMNWOZ.a(IIII)LFCIDIKVY;")
	public final FCIDIKVY method240(int arg0, int arg1, int arg2) {
		FCIDIKVY var4 = null;
		long var5;
		if (field774 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field799 << 6) + arg0);
			FCIDIKVY var7 = (FCIDIKVY) field809.method334(var5);
			if (var7 != null) {
				return var7;
			}

			if (field791 == null) {
				return null;
			}

			boolean var8 = field773 ^ arg0 > 3;
			int var9 = field791.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field791[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (FCIDIKVY) field772.method334(var11);
				if (var4 == null) {
					var4 = FCIDIKVY.method199(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method214();
					}

					field772.method335(var11, var4);
				}

				if (var9 > 1) {
					field768[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new FCIDIKVY(var9, field768);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field774.length; var13++) {
				if (field774[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field799 << 6) + (var12 << 3) + arg0);
			FCIDIKVY var14 = (FCIDIKVY) field809.method334(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field791[var12];
			boolean var16 = field773 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (FCIDIKVY) field772.method334(var15);
			if (var4 == null) {
				var4 = FCIDIKVY.method199(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method214();
				}

				field772.method335(var15, var4);
			}
		}

		boolean var17;
		if (field769 == 128 && field785 == 128 && field796 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field806 == 0 && field781 == 0 && field812 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		FCIDIKVY var19 = new FCIDIKVY(arg0 == 0 && arg2 == -1 && !var17 && !var18, FGGKJQKK.method235(arg2), var4, field789 == null);
		if (arg2 != -1) {
			var19.method206();
			var19.method207(arg2);
			var19.field716 = null;
			var19.field715 = null;
		}

		while (arg0-- > 0) {
			var19.method210();
		}

		if (field789 != null) {
			for (int var20 = 0; var20 < field789.length; var20++) {
				var19.method213(field789[var20], field801[var20]);
			}
		}

		if (var17) {
			var19.method215(field796, field769, field785);
		}

		if (var18) {
			var19.method212(field812, field781, field806);
		}

		var19.method216(field808 + 64, field778 * 5 + 768, -50, -10, -50, !field803);

		if (field784 == 1) {
			var19.field712 = var19.field660;
		}

		field809.method335(var5, var19);
		return var19;
	}

	@ObfuscatedName("FUIMNWOZ.a(LIBVXWOKK;I)V")
	public final void method241(IBVXWOKK arg0) {
		if (field791 != null) {
			for (int var2 = 0; var2 < field791.length; var2++) {
				arg0.method280(0, field791[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("FUIMNWOZ.a(LWBEWPIXO;I)V")
	public final void method242(WBEWPIXO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method515();
					if (var3 == 0) {
						if (var2 == -1) {
							field807 = false;
							if (field791 != null && (field774 == null || field774[0] == 10)) {
								field807 = true;
							}

							if (field802 != null) {
								field807 = true;
							}
						}

						if (field770) {
							field780 = false;
							field779 = false;
						}

						if (field784 == -1) {
							field784 = field780 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field797 = arg0.method522();
					} else if (var3 == 3) {
						field805 = arg0.method523();
					} else if (var3 == 5) {
						int var6 = arg0.method515();
						if (var6 > 0) {
							if (field791 == null || field810) {
								field774 = null;
								field791 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field791[var7] = arg0.method517();
								}
							} else {
								arg0.field1401 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field814 = arg0.method515();
					} else if (var3 == 15) {
						field804 = arg0.method515();
					} else if (var3 == 17) {
						field780 = false;
					} else if (var3 == 18) {
						field779 = false;
					} else if (var3 == 19) {
						var2 = arg0.method515();
						if (var2 == 1) {
							field807 = true;
						}
					} else if (var3 == 21) {
						field813 = true;
					} else if (var3 == 22) {
						field803 = true;
					} else if (var3 == 23) {
						field787 = true;
					} else if (var3 == 24) {
						field783 = arg0.method517();
						if (field783 == 0xFFFF) {
							field783 = -1;
						}
					} else if (var3 == 28) {
						field782 = arg0.method515();
					} else if (var3 == 29) {
						field808 = arg0.method516();
					} else if (var3 == 39) {
						field778 = arg0.method516();
					} else if (var3 >= 30 && var3 < 39) {
						if (field802 == null) {
							field802 = new String[5];
						}

						field802[var3 - 30] = arg0.method522();
						if (field802[var3 - 30].equalsIgnoreCase("hidden")) {
							field802[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method515();
						field789 = new int[var8];
						field801 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field789[var9] = arg0.method517();
							field801[var9] = arg0.method517();
						}
					} else if (var3 == 60) {
						field790 = arg0.method517();
					} else if (var3 == 62) {
						field773 = true;
					} else if (var3 == 64) {
						field777 = false;
					} else if (var3 == 65) {
						field769 = arg0.method517();
					} else if (var3 == 66) {
						field785 = arg0.method517();
					} else if (var3 == 67) {
						field796 = arg0.method517();
					} else if (var3 == 68) {
						field792 = arg0.method517();
					} else if (var3 == 69) {
						field786 = arg0.method515();
					} else if (var3 == 70) {
						field806 = arg0.method518();
					} else if (var3 == 71) {
						field781 = arg0.method518();
					} else if (var3 == 72) {
						field812 = arg0.method518();
					} else if (var3 == 73) {
						field776 = true;
					} else if (var3 == 74) {
						field770 = true;
					} else if (var3 == 75) {
						field784 = arg0.method515();
					} else if (var3 == 77) {
						field811 = arg0.method517();
						if (field811 == 0xFFFF) {
							field811 = -1;
						}

						field798 = arg0.method517();
						if (field798 == 0xFFFF) {
							field798 = -1;
						}

						int var10 = arg0.method515();
						field771 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field771[var11] = arg0.method517();
							if (field771[var11] == 0xFFFF) {
								field771[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method515();
			} while (var4 <= 0);

			if (field791 == null || field810) {
				field774 = new int[var4];
				field791 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field791[var5] = arg0.method517();
					field774[var5] = arg0.method515();
				}
			} else {
				arg0.field1401 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("FUIMNWOZ.a(BI)Z")
	public final boolean method243(int arg0) {
		if (field774 != null) {
			for (int var4 = 0; var4 < field774.length; var4++) {
				if (field774[var4] == arg0) {
					return FCIDIKVY.method200(field791[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field791 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field791.length; var3++) {
				var2 &= FCIDIKVY.method200(field791[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("FUIMNWOZ.a(IIIIIII)LFCIDIKVY;")
	public final FCIDIKVY method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		FCIDIKVY var8 = method240(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field813 || field803) {
			var8 = new FCIDIKVY(field803, var8, field813);
		}

		if (field813) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field685; var10++) {
				int var11 = var8.field686[var10];
				int var12 = var8.field688[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field687[var10] += var15 - var9;
			}

			var8.method204();
		}

		return var8;
	}

	@ObfuscatedName("FUIMNWOZ.a(Z)Z")
	public final boolean method245() {
		if (field791 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field791.length; var2++) {
			var1 &= FCIDIKVY.method200(field791[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("FUIMNWOZ.c(I)LFUIMNWOZ;")
	public static final FUIMNWOZ method246(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field788[var1].field799 == arg0) {
				return field788[var1];
			}
		}

		field795 = (field795 + 1) % 20;
		FUIMNWOZ var2 = field788[field795];
		field775.field1401 = field793[arg0];
		var2.field799 = arg0;
		var2.method239();
		var2.method242(field775);
		return var2;
	}
}
