package deob;

@ObfuscatedName("COIHKGSL")
public final class COIHKGSL {

	@ObfuscatedName("COIHKGSL.a")
	public int field502 = -1;

	@ObfuscatedName("COIHKGSL.d")
	public int field505 = -1;

	@ObfuscatedName("COIHKGSL.h")
	public int field509 = -1;

	@ObfuscatedName("COIHKGSL.l")
	public int field512 = -1;

	@ObfuscatedName("COIHKGSL.n")
	public int field514 = -1;

	@ObfuscatedName("COIHKGSL.o")
	public boolean field515 = true;

	@ObfuscatedName("COIHKGSL.p")
	public int field516 = -1;

	@ObfuscatedName("COIHKGSL.q")
	public int field517 = -1;

	@ObfuscatedName("COIHKGSL.w")
	public int field522 = -1;

	@ObfuscatedName("COIHKGSL.B")
	public byte field526 = 1;

	@ObfuscatedName("COIHKGSL.C")
	public int field527 = 128;

	@ObfuscatedName("COIHKGSL.D")
	public boolean field528 = false;

	@ObfuscatedName("COIHKGSL.F")
	public int field530 = -1;

	@ObfuscatedName("COIHKGSL.G")
	public int field531 = -1;

	@ObfuscatedName("COIHKGSL.H")
	public int field532 = -1;

	@ObfuscatedName("COIHKGSL.I")
	public int field533 = -1;

	@ObfuscatedName("COIHKGSL.J")
	public int field534 = 32;

	@ObfuscatedName("COIHKGSL.L")
	public boolean field536 = true;

	@ObfuscatedName("COIHKGSL.M")
	public long field537 = -1L;

	@ObfuscatedName("COIHKGSL.N")
	public int field538 = 128;

	@ObfuscatedName("COIHKGSL.k")
	public static ECXUVDNP field511 = new ECXUVDNP(30);

	@ObfuscatedName("COIHKGSL.e")
	public int field506;

	@ObfuscatedName("COIHKGSL.j")
	public static int field510;

	@ObfuscatedName("COIHKGSL.A")
	public static int field525;

	@ObfuscatedName("COIHKGSL.K")
	public int field535;

	@ObfuscatedName("COIHKGSL.E")
	public static MQZHAILV field529;

	@ObfuscatedName("COIHKGSL.m")
	public static client field513;

	@ObfuscatedName("COIHKGSL.x")
	public String field523;

	@ObfuscatedName("COIHKGSL.c")
	public byte[] field504;

	@ObfuscatedName("COIHKGSL.b")
	public static int[] field503;

	@ObfuscatedName("COIHKGSL.g")
	public int[] field508;

	@ObfuscatedName("COIHKGSL.r")
	public int[] field518;

	@ObfuscatedName("COIHKGSL.s")
	public int[] field519;

	@ObfuscatedName("COIHKGSL.v")
	public int[] field521;

	@ObfuscatedName("COIHKGSL.z")
	public int[] field524;

	@ObfuscatedName("COIHKGSL.f")
	public static COIHKGSL[] field507;

	@ObfuscatedName("COIHKGSL.u")
	public String[] field520;

	@ObfuscatedName("COIHKGSL.a(LMQZHAILV;I)V")
	public final void method165(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method325();
				field508 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field508[var4] = arg0.method327();
				}
			} else if (var2 == 2) {
				field523 = arg0.method332();
			} else if (var2 == 3) {
				field504 = arg0.method333();
			} else if (var2 == 12) {
				field526 = arg0.method326();
			} else if (var2 == 13) {
				field530 = arg0.method327();
			} else if (var2 == 14) {
				field517 = arg0.method327();
			} else if (var2 == 17) {
				field517 = arg0.method327();
				field531 = arg0.method327();
				field532 = arg0.method327();
				field516 = arg0.method327();
			} else if (var2 >= 30 && var2 < 40) {
				if (field520 == null) {
					field520 = new String[5];
				}

				field520[var2 - 30] = arg0.method332();
				if (field520[var2 - 30].equalsIgnoreCase("hidden")) {
					field520[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method325();
				field524 = new int[var5];
				field519 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field524[var6] = arg0.method327();
					field519[var6] = arg0.method327();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method325();
				field521 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field521[var8] = arg0.method327();
				}
			} else if (var2 == 90) {
				field522 = arg0.method327();
			} else if (var2 == 91) {
				field514 = arg0.method327();
			} else if (var2 == 92) {
				field509 = arg0.method327();
			} else if (var2 == 93) {
				field536 = false;
			} else if (var2 == 95) {
				field502 = arg0.method327();
			} else if (var2 == 97) {
				field527 = arg0.method327();
			} else if (var2 == 98) {
				field538 = arg0.method327();
			} else if (var2 == 99) {
				field528 = true;
			} else if (var2 == 100) {
				field506 = arg0.method326();
			} else if (var2 == 101) {
				field535 = arg0.method326() * 5;
			} else if (var2 == 102) {
				field512 = arg0.method327();
			} else if (var2 == 103) {
				field534 = arg0.method327();
			} else if (var2 == 106) {
				field505 = arg0.method327();
				if (field505 == 0xFFFF) {
					field505 = -1;
				}

				field533 = arg0.method327();
				if (field533 == 0xFFFF) {
					field533 = -1;
				}

				int var9 = arg0.method325();
				field518 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field518[var10] = arg0.method327();
					if (field518[var10] == 0xFFFF) {
						field518[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field515 = false;
			}
		}
	}

	@ObfuscatedName("COIHKGSL.a(IZ[II)LYYHPBDED;")
	public final YYHPBDED method166(int arg0, int[] arg1, int arg2) {
		if (field518 != null) {
			COIHKGSL var4 = method167();
			if (var4 == null) {
				return null;
			}

			return var4.method166(arg0, arg1, arg2);
		}

		YYHPBDED var5 = (YYHPBDED) field511.method221(field537);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field508.length; var7++) {
				if (!YYHPBDED.method552(field508[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			YYHPBDED[] var8 = new YYHPBDED[field508.length];
			for (int var9 = 0; var9 < field508.length; var9++) {
				var8[var9] = YYHPBDED.method551(field508[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new YYHPBDED(var8, var8.length);
			}

			if (field524 != null) {
				for (int var10 = 0; var10 < field524.length; var10++) {
					var5.method565(field524[var10], field519[var10]);
				}
			}

			var5.method558();
			var5.method568(field506 + 64, field535 + 850, -30, -50, -30, true);
			field511.method222(field537, var5);
		}

		YYHPBDED var11 = YYHPBDED.field1340;
		var11.method553(VPISXBMB.method513(arg0) & VPISXBMB.method513(arg2), var5);

		if (arg0 != -1 && arg2 != -1) {
			var11.method560(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var11.method559(arg0);
		}

		if (field527 != 128 || field538 != 128) {
			var11.method567(field538, field527, field527);
		}

		var11.method555();
		var11.field1377 = null;
		var11.field1376 = null;

		if (field526 == 1) {
			var11.field1378 = true;
		}

		return var11;
	}

	@ObfuscatedName("COIHKGSL.a(I)LCOIHKGSL;")
	public final COIHKGSL method167() {
		int var1 = -1;
		if (field505 != -1) {
			CYAEJBRE var2 = CYAEJBRE.field553[field505];
			int var3 = var2.field555;
			int var4 = var2.field556;
			int var5 = var2.field557;
			int var6 = client.field253[var5 - var4];
			var1 = field513.field208[var3] >> var4 & var6;
		} else if (field533 != -1) {
			var1 = field513.field208[field533];
		}

		if (var1 >= 0 && var1 < field518.length && field518[var1] != -1) {
			return method171(field518[var1]);
		}

		return null;
	}

	@ObfuscatedName("COIHKGSL.a(LCXFTMSCH;)V")
	public static final void method168(CXFTMSCH arg0) {
		field529 = new MQZHAILV(arg0.method176("npc.dat", null));
		MQZHAILV var1 = new MQZHAILV(arg0.method176("npc.idx", null));
		field510 = var1.method327();
		field503 = new int[field510];
		int var2 = 2;
		for (int var3 = 0; var3 < field510; var3++) {
			field503[var3] = var2;
			var2 += var1.method327();
		}

		field507 = new COIHKGSL[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field507[var4] = new COIHKGSL();
		}
	}

	@ObfuscatedName("COIHKGSL.b(I)LYYHPBDED;")
	public final YYHPBDED method169() {
		if (field518 != null) {
			COIHKGSL var1 = method167();
			if (var1 == null) {
				return null;
			}

			return var1.method169();
		} else if (field521 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field521.length; var3++) {
				if (!YYHPBDED.method552(field521[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			YYHPBDED[] var4 = new YYHPBDED[field521.length];
			for (int var5 = 0; var5 < field521.length; var5++) {
				var4[var5] = YYHPBDED.method551(field521[var5]);
			}

			YYHPBDED var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new YYHPBDED(var4, var4.length);
			}

			if (field524 != null) {
				for (int var7 = 0; var7 < field524.length; var7++) {
					var6.method565(field524[var7], field519[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("COIHKGSL.a(B)V")
	public static final void method170() {
		field511 = null;
		field503 = null;
		field507 = null;
		field529 = null;
	}

	@ObfuscatedName("COIHKGSL.c(I)LCOIHKGSL;")
	public static final COIHKGSL method171(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field507[var1].field537) {
				return field507[var1];
			}
		}

		field525 = (field525 + 1) % 20;
		COIHKGSL var2 = field507[field525] = new COIHKGSL();
		field529.field797 = field503[arg0];
		var2.field537 = arg0;
		var2.method165(field529);
		return var2;
	}
}
