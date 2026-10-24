package deob;

@ObfuscatedName("JRELGTVY")
public final class JRELGTVY {

	@ObfuscatedName("JRELGTVY.c")
	public int field930 = -1;

	@ObfuscatedName("JRELGTVY.e")
	public int field932 = -1;

	@ObfuscatedName("JRELGTVY.g")
	public int field934 = -1;

	@ObfuscatedName("JRELGTVY.h")
	public int field935 = 32;

	@ObfuscatedName("JRELGTVY.k")
	public int field938 = 128;

	@ObfuscatedName("JRELGTVY.l")
	public int field939 = -1;

	@ObfuscatedName("JRELGTVY.n")
	public boolean field941 = false;

	@ObfuscatedName("JRELGTVY.r")
	public long field943 = -1L;

	@ObfuscatedName("JRELGTVY.s")
	public int field944 = -1;

	@ObfuscatedName("JRELGTVY.t")
	public int field945 = 128;

	@ObfuscatedName("JRELGTVY.u")
	public int field946 = -1;

	@ObfuscatedName("JRELGTVY.w")
	public byte field948 = 1;

	@ObfuscatedName("JRELGTVY.x")
	public boolean field949 = true;

	@ObfuscatedName("JRELGTVY.y")
	public int field950 = -1;

	@ObfuscatedName("JRELGTVY.B")
	public int field952 = -1;

	@ObfuscatedName("JRELGTVY.D")
	public int field954 = -1;

	@ObfuscatedName("JRELGTVY.G")
	public String field957 = "null";

	@ObfuscatedName("JRELGTVY.I")
	public int field959 = -1;

	@ObfuscatedName("JRELGTVY.K")
	public int field961 = -1;

	@ObfuscatedName("JRELGTVY.L")
	public int field962 = -1;

	@ObfuscatedName("JRELGTVY.O")
	public boolean field964 = true;

	@ObfuscatedName("JRELGTVY.f")
	public static YITKGHWB field933 = new YITKGHWB(30);

	@ObfuscatedName("JRELGTVY.m")
	public static int field940;

	@ObfuscatedName("JRELGTVY.A")
	public static int field951;

	@ObfuscatedName("JRELGTVY.E")
	public int field955;

	@ObfuscatedName("JRELGTVY.H")
	public int field958;

	@ObfuscatedName("JRELGTVY.d")
	public static PQBRPYKE field931;

	@ObfuscatedName("JRELGTVY.v")
	public static client field947;

	@ObfuscatedName("JRELGTVY.j")
	public byte[] field937;

	@ObfuscatedName("JRELGTVY.a")
	public int[] field928;

	@ObfuscatedName("JRELGTVY.i")
	public int[] field936;

	@ObfuscatedName("JRELGTVY.o")
	public int[] field942;

	@ObfuscatedName("JRELGTVY.F")
	public int[] field956;

	@ObfuscatedName("JRELGTVY.J")
	public static int[] field960;

	@ObfuscatedName("JRELGTVY.M")
	public int[] field963;

	@ObfuscatedName("JRELGTVY.C")
	public static JRELGTVY[] field953;

	@ObfuscatedName("JRELGTVY.b")
	public String[] field929;

	@ObfuscatedName("JRELGTVY.a(LPQBRPYKE;Z)V")
	public final void method264(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method340();
				field936 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field936[var4] = arg0.method342();
				}
			} else if (var2 == 2) {
				field957 = arg0.method347();
			} else if (var2 == 3) {
				field937 = arg0.method348();
			} else if (var2 == 12) {
				field948 = arg0.method341();
			} else if (var2 == 13) {
				field930 = arg0.method342();
			} else if (var2 == 14) {
				field952 = arg0.method342();
			} else if (var2 == 17) {
				field952 = arg0.method342();
				field961 = arg0.method342();
				field932 = arg0.method342();
				field934 = arg0.method342();
			} else if (var2 >= 30 && var2 < 40) {
				if (field929 == null) {
					field929 = new String[5];
				}

				field929[var2 - 30] = arg0.method347();
				if (field929[var2 - 30].equalsIgnoreCase("hidden")) {
					field929[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method340();
				field942 = new int[var5];
				field956 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field942[var6] = arg0.method342();
					field956[var6] = arg0.method342();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method340();
				field963 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field963[var8] = arg0.method342();
				}
			} else if (var2 == 90) {
				field959 = arg0.method342();
			} else if (var2 == 91) {
				field954 = arg0.method342();
			} else if (var2 == 92) {
				field950 = arg0.method342();
			} else if (var2 == 93) {
				field949 = false;
			} else if (var2 == 95) {
				field946 = arg0.method342();
			} else if (var2 == 97) {
				field945 = arg0.method342();
			} else if (var2 == 98) {
				field938 = arg0.method342();
			} else if (var2 == 99) {
				field941 = true;
			} else if (var2 == 100) {
				field955 = arg0.method341();
			} else if (var2 == 101) {
				field958 = arg0.method341() * 5;
			} else if (var2 == 102) {
				field944 = arg0.method342();
			} else if (var2 == 103) {
				field935 = arg0.method342();
			} else if (var2 == 106) {
				field939 = arg0.method342();
				if (field939 == 0xFFFF) {
					field939 = -1;
				}

				field962 = arg0.method342();
				if (field962 == 0xFFFF) {
					field962 = -1;
				}

				int var9 = arg0.method340();
				field928 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field928[var10] = arg0.method342();
					if (field928[var10] == 0xFFFF) {
						field928[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field964 = false;
			}
		}
	}

	@ObfuscatedName("JRELGTVY.a(Z)Z")
	public boolean method265() {
		if (field928 == null) {
			return true;
		}

		int var1 = -1;
		if (field939 != -1) {
			HGYXNEJH var2 = HGYXNEJH.field818[field939];
			int var3 = var2.field820;
			int var4 = var2.field821;
			int var5 = var2.field822;
			int var6 = client.field204[var5 - var4];
			var1 = field947.field356[var3] >> var4 & var6;
		} else if (field962 != -1) {
			var1 = field947.field356[field962];
		}

		if (var1 >= 0 && var1 < field928.length && field928[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JRELGTVY.a(I)LJRELGTVY;")
	public final JRELGTVY method266() {
		int var1 = -1;
		if (field939 != -1) {
			HGYXNEJH var2 = HGYXNEJH.field818[field939];
			int var3 = var2.field820;
			int var4 = var2.field821;
			int var5 = var2.field822;
			int var6 = client.field204[var5 - var4];
			var1 = field947.field356[var3] >> var4 & var6;
		} else if (field962 != -1) {
			var1 = field947.field356[field962];
		}

		if (var1 >= 0 && var1 < field928.length && field928[var1] != -1) {
			return method269(field928[var1]);
		}

		return null;
	}

	@ObfuscatedName("JRELGTVY.b(Z)V")
	public static final void method267() {
		field933 = null;
		field960 = null;
		field953 = null;
		field931 = null;
	}

	@ObfuscatedName("JRELGTVY.a(LXOJZVVDK;)V")
	public static final void method268(XOJZVVDK arg0) {
		field931 = new PQBRPYKE(arg0.method560("npc.dat", null));
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("npc.idx", null));
		field951 = var1.method342();
		field960 = new int[field951];
		int var2 = 2;
		for (int var3 = 0; var3 < field951; var3++) {
			field960[var3] = var2;
			var2 += var1.method342();
		}

		field953 = new JRELGTVY[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field953[var4] = new JRELGTVY();
		}
	}

	@ObfuscatedName("JRELGTVY.b(I)LJRELGTVY;")
	public static final JRELGTVY method269(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field953[var1].field943) {
				return field953[var1];
			}
		}

		field940 = (field940 + 1) % 20;
		JRELGTVY var2 = field953[field940] = new JRELGTVY();
		field931.field1091 = field960[arg0];
		var2.field943 = arg0;
		var2.method264(field931);
		return var2;
	}

	@ObfuscatedName("JRELGTVY.a([IIIB)LFLXAIVEA;")
	public final FLXAIVEA method270(int[] arg0, int arg1, int arg2) {
		if (field928 != null) {
			JRELGTVY var4 = method266();
			if (var4 == null) {
				return null;
			}

			return var4.method270(arg0, arg1, arg2);
		}

		FLXAIVEA var5 = (FLXAIVEA) field933.method572(field943);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field936.length; var7++) {
				if (!FLXAIVEA.method219(field936[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			FLXAIVEA[] var8 = new FLXAIVEA[field936.length];
			for (int var9 = 0; var9 < field936.length; var9++) {
				var8[var9] = FLXAIVEA.method218(field936[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new FLXAIVEA(var8.length, var8);
			}

			if (field942 != null) {
				for (int var10 = 0; var10 < field942.length; var10++) {
					var5.method232(field942[var10], field956[var10]);
				}
			}

			var5.method225();
			var5.method235(field955 + 64, field958 + 850, -30, -50, -30, true);
			field933.method573(var5, field943);
		}

		FLXAIVEA var11 = FLXAIVEA.field680;
		var11.method220(NFWEZFJY.method302(arg2) & NFWEZFJY.method302(arg1), var5);

		if (arg2 != -1 && arg1 != -1) {
			var11.method227(arg1, arg2, arg0);
		} else if (arg2 != -1) {
			var11.method226(arg2);
		}

		if (field945 != 128 || field938 != 128) {
			var11.method234(field945, field945, field938);
		}

		var11.method222();
		var11.field716 = null;
		var11.field715 = null;

		if (field948 == 1) {
			var11.field717 = true;
		}

		return var11;
	}

	@ObfuscatedName("JRELGTVY.c(I)LFLXAIVEA;")
	public final FLXAIVEA method271() {
		if (field928 != null) {
			JRELGTVY var1 = method266();
			if (var1 == null) {
				return null;
			}

			return var1.method271();
		} else if (field963 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field963.length; var3++) {
				if (!FLXAIVEA.method219(field963[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			FLXAIVEA[] var4 = new FLXAIVEA[field963.length];
			for (int var5 = 0; var5 < field963.length; var5++) {
				var4[var5] = FLXAIVEA.method218(field963[var5]);
			}

			FLXAIVEA var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new FLXAIVEA(var4.length, var4);
			}

			if (field942 != null) {
				for (int var7 = 0; var7 < field942.length; var7++) {
					var6.method232(field942[var7], field956[var7]);
				}
			}

			return var6;
		}
	}
}
