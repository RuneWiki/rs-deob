package deob;

@ObfuscatedName("NHTDEVDA")
public final class NHTDEVDA {

	@ObfuscatedName("NHTDEVDA.a")
	public int field934 = -1;

	@ObfuscatedName("NHTDEVDA.b")
	public int field935 = 128;

	@ObfuscatedName("NHTDEVDA.c")
	public long field936 = -1L;

	@ObfuscatedName("NHTDEVDA.d")
	public boolean field937 = true;

	@ObfuscatedName("NHTDEVDA.g")
	public int field940 = -1;

	@ObfuscatedName("NHTDEVDA.h")
	public int field941 = -1;

	@ObfuscatedName("NHTDEVDA.i")
	public boolean field942 = false;

	@ObfuscatedName("NHTDEVDA.l")
	public int field945 = 32;

	@ObfuscatedName("NHTDEVDA.m")
	public int field946 = -1;

	@ObfuscatedName("NHTDEVDA.r")
	public int field950 = -1;

	@ObfuscatedName("NHTDEVDA.w")
	public byte field953 = 1;

	@ObfuscatedName("NHTDEVDA.x")
	public int field954 = -1;

	@ObfuscatedName("NHTDEVDA.A")
	public int field957 = -1;

	@ObfuscatedName("NHTDEVDA.B")
	public boolean field958 = true;

	@ObfuscatedName("NHTDEVDA.F")
	public int field961 = -1;

	@ObfuscatedName("NHTDEVDA.G")
	public int field962 = -1;

	@ObfuscatedName("NHTDEVDA.I")
	public int field964 = -1;

	@ObfuscatedName("NHTDEVDA.M")
	public int field967 = -1;

	@ObfuscatedName("NHTDEVDA.N")
	public int field968 = 128;

	@ObfuscatedName("NHTDEVDA.O")
	public int field969 = -1;

	@ObfuscatedName("NHTDEVDA.H")
	public static JLTMYUOM field963 = new JLTMYUOM(30);

	@ObfuscatedName("NHTDEVDA.k")
	public static int field944;

	@ObfuscatedName("NHTDEVDA.s")
	public static int field951;

	@ObfuscatedName("NHTDEVDA.z")
	public int field956;

	@ObfuscatedName("NHTDEVDA.J")
	public int field965;

	@ObfuscatedName("NHTDEVDA.K")
	public static XJCNBMKS field966;

	@ObfuscatedName("NHTDEVDA.n")
	public static client field947;

	@ObfuscatedName("NHTDEVDA.P")
	public String field970;

	@ObfuscatedName("NHTDEVDA.f")
	public byte[] field939;

	@ObfuscatedName("NHTDEVDA.e")
	public int[] field938;

	@ObfuscatedName("NHTDEVDA.j")
	public static int[] field943;

	@ObfuscatedName("NHTDEVDA.o")
	public int[] field948;

	@ObfuscatedName("NHTDEVDA.q")
	public int[] field949;

	@ObfuscatedName("NHTDEVDA.u")
	public int[] field952;

	@ObfuscatedName("NHTDEVDA.C")
	public int[] field959;

	@ObfuscatedName("NHTDEVDA.y")
	public static NHTDEVDA[] field955;

	@ObfuscatedName("NHTDEVDA.D")
	public String[] field960;

	@ObfuscatedName("NHTDEVDA.a(BLXJCNBMKS;)V")
	public final void method362(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method534();
				field959 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field959[var4] = arg0.method536();
				}
			} else if (var2 == 2) {
				field970 = arg0.method541();
			} else if (var2 == 3) {
				field939 = arg0.method542();
			} else if (var2 == 12) {
				field953 = arg0.method535();
			} else if (var2 == 13) {
				field954 = arg0.method536();
			} else if (var2 == 14) {
				field941 = arg0.method536();
			} else if (var2 == 17) {
				field941 = arg0.method536();
				field946 = arg0.method536();
				field940 = arg0.method536();
				field961 = arg0.method536();
			} else if (var2 >= 30 && var2 < 40) {
				if (field960 == null) {
					field960 = new String[5];
				}

				field960[var2 - 30] = arg0.method541();
				if (field960[var2 - 30].equalsIgnoreCase("hidden")) {
					field960[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method534();
				field952 = new int[var5];
				field949 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field952[var6] = arg0.method536();
					field949[var6] = arg0.method536();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method534();
				field938 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field938[var8] = arg0.method536();
				}
			} else if (var2 == 90) {
				field950 = arg0.method536();
			} else if (var2 == 91) {
				field957 = arg0.method536();
			} else if (var2 == 92) {
				field964 = arg0.method536();
			} else if (var2 == 93) {
				field937 = false;
			} else if (var2 == 95) {
				field934 = arg0.method536();
			} else if (var2 == 97) {
				field968 = arg0.method536();
			} else if (var2 == 98) {
				field935 = arg0.method536();
			} else if (var2 == 99) {
				field942 = true;
			} else if (var2 == 100) {
				field965 = arg0.method535();
			} else if (var2 == 101) {
				field956 = arg0.method535() * 5;
			} else if (var2 == 102) {
				field967 = arg0.method536();
			} else if (var2 == 103) {
				field945 = arg0.method536();
			} else if (var2 == 106) {
				field962 = arg0.method536();
				if (field962 == 0xFFFF) {
					field962 = -1;
				}

				field969 = arg0.method536();
				if (field969 == 0xFFFF) {
					field969 = -1;
				}

				int var9 = arg0.method534();
				field948 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field948[var10] = arg0.method536();
					if (field948[var10] == 0xFFFF) {
						field948[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field958 = false;
			}
		}
	}

	@ObfuscatedName("NHTDEVDA.a(I)V")
	public static final void method363() {
		field963 = null;
		field943 = null;
		field955 = null;
		field966 = null;
	}

	@ObfuscatedName("NHTDEVDA.b(I)LNHTDEVDA;")
	public final NHTDEVDA method364() {
		int var1 = -1;
		if (field962 != -1) {
			VSLUEINI var2 = VSLUEINI.field1394[field962];
			int var3 = var2.field1396;
			int var4 = var2.field1397;
			int var5 = var2.field1398;
			int var6 = client.field232[var5 - var4];
			var1 = field947.field524[var3] >> var4 & var6;
		} else if (field969 != -1) {
			var1 = field947.field524[field969];
		}

		if (var1 >= 0 && var1 < field948.length && field948[var1] != -1) {
			return method368(field948[var1]);
		}

		return null;
	}

	@ObfuscatedName("NHTDEVDA.a(LQKFGLETG;)V")
	public static final void method365(QKFGLETG arg0) {
		field966 = new XJCNBMKS(arg0.method402("npc.dat", null));
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("npc.idx", null));
		field951 = var1.method536();
		field943 = new int[field951];
		int var2 = 2;
		for (int var3 = 0; var3 < field951; var3++) {
			field943[var3] = var2;
			var2 += var1.method536();
		}

		field955 = new NHTDEVDA[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field955[var4] = new NHTDEVDA();
		}
	}

	@ObfuscatedName("NHTDEVDA.a(B)LFUTAQMCE;")
	public final FUTAQMCE method366() {
		if (field948 != null) {
			NHTDEVDA var1 = method364();
			if (var1 == null) {
				return null;
			}

			return var1.method366();
		} else if (field938 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field938.length; var3++) {
				if (!FUTAQMCE.method251(field938[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			FUTAQMCE[] var4 = new FUTAQMCE[field938.length];
			for (int var5 = 0; var5 < field938.length; var5++) {
				var4[var5] = FUTAQMCE.method250(field938[var5]);
			}

			FUTAQMCE var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new FUTAQMCE(var4.length, var4);
			}

			if (field952 != null) {
				for (int var7 = 0; var7 < field952.length; var7++) {
					var6.method264(field952[var7], field949[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("NHTDEVDA.a([IIII)LFUTAQMCE;")
	public final FUTAQMCE method367(int[] arg0, int arg1, int arg2) {
		if (field948 != null) {
			NHTDEVDA var4 = method364();
			if (var4 == null) {
				return null;
			}

			return var4.method367(arg0, arg1, arg2);
		}

		FUTAQMCE var5 = (FUTAQMCE) field963.method297(field936);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field959.length; var7++) {
				if (!FUTAQMCE.method251(field959[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			FUTAQMCE[] var8 = new FUTAQMCE[field959.length];
			for (int var9 = 0; var9 < field959.length; var9++) {
				var8[var9] = FUTAQMCE.method250(field959[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new FUTAQMCE(var8.length, var8);
			}

			if (field952 != null) {
				for (int var10 = 0; var10 < field952.length; var10++) {
					var5.method264(field952[var10], field949[var10]);
				}
			}

			var5.method257();
			var5.method267(field965 + 64, field956 + 850, -30, -50, -30, true);
			field963.method298(field936, var5);
		}

		FUTAQMCE var11 = FUTAQMCE.field633;
		var11.method252(RYVJCVCB.method428(arg2) & RYVJCVCB.method428(arg1), var5);

		if (arg2 != -1 && arg1 != -1) {
			var11.method259(arg0, arg2, arg1);
		} else if (arg2 != -1) {
			var11.method258(arg2);
		}

		if (field968 != 128 || field935 != 128) {
			var11.method266(field968, field935, field968);
		}

		var11.method254();
		var11.field670 = null;
		var11.field669 = null;

		if (field953 == 1) {
			var11.field671 = true;
		}

		return var11;
	}

	@ObfuscatedName("NHTDEVDA.c(I)LNHTDEVDA;")
	public static final NHTDEVDA method368(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field955[var1].field936) {
				return field955[var1];
			}
		}

		field944 = (field944 + 1) % 20;
		NHTDEVDA var2 = field955[field944] = new NHTDEVDA();
		field966.field1403 = field943[arg0];
		var2.field936 = arg0;
		var2.method362(field966);
		return var2;
	}
}
