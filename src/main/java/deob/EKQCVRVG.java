package deob;

@ObfuscatedName("EKQCVRVG")
public final class EKQCVRVG {

	@ObfuscatedName("EKQCVRVG.a")
	public int field593 = -1;

	@ObfuscatedName("EKQCVRVG.b")
	public String field594 = "null";

	@ObfuscatedName("EKQCVRVG.e")
	public long field597 = -1L;

	@ObfuscatedName("EKQCVRVG.f")
	public int field598 = -1;

	@ObfuscatedName("EKQCVRVG.g")
	public int field599 = -1;

	@ObfuscatedName("EKQCVRVG.h")
	public int field600 = -1;

	@ObfuscatedName("EKQCVRVG.j")
	public int field602 = 128;

	@ObfuscatedName("EKQCVRVG.k")
	public int field603 = -1;

	@ObfuscatedName("EKQCVRVG.p")
	public byte field608 = 1;

	@ObfuscatedName("EKQCVRVG.q")
	public boolean field609 = true;

	@ObfuscatedName("EKQCVRVG.s")
	public int field610 = 128;

	@ObfuscatedName("EKQCVRVG.w")
	public boolean field613 = false;

	@ObfuscatedName("EKQCVRVG.z")
	public int field615 = -1;

	@ObfuscatedName("EKQCVRVG.B")
	public int field616 = -1;

	@ObfuscatedName("EKQCVRVG.C")
	public int field617 = -1;

	@ObfuscatedName("EKQCVRVG.F")
	public int field619 = -1;

	@ObfuscatedName("EKQCVRVG.J")
	public boolean field623 = true;

	@ObfuscatedName("EKQCVRVG.L")
	public int field624 = 32;

	@ObfuscatedName("EKQCVRVG.M")
	public int field625 = -1;

	@ObfuscatedName("EKQCVRVG.O")
	public int field627 = -1;

	@ObfuscatedName("EKQCVRVG.Q")
	public int field629 = -1;

	@ObfuscatedName("EKQCVRVG.I")
	public static ACKKZISC field622 = new ACKKZISC(30);

	@ObfuscatedName("EKQCVRVG.n")
	public int field606;

	@ObfuscatedName("EKQCVRVG.o")
	public static int field607;

	@ObfuscatedName("EKQCVRVG.G")
	public int field620;

	@ObfuscatedName("EKQCVRVG.H")
	public static int field621;

	@ObfuscatedName("EKQCVRVG.t")
	public static RSWRPCHR field611;

	@ObfuscatedName("EKQCVRVG.E")
	public static client field618;

	@ObfuscatedName("EKQCVRVG.d")
	public byte[] field596;

	@ObfuscatedName("EKQCVRVG.i")
	public int[] field601;

	@ObfuscatedName("EKQCVRVG.l")
	public static int[] field604;

	@ObfuscatedName("EKQCVRVG.m")
	public int[] field605;

	@ObfuscatedName("EKQCVRVG.u")
	public int[] field612;

	@ObfuscatedName("EKQCVRVG.y")
	public int[] field614;

	@ObfuscatedName("EKQCVRVG.P")
	public int[] field628;

	@ObfuscatedName("EKQCVRVG.N")
	public static EKQCVRVG[] field626;

	@ObfuscatedName("EKQCVRVG.c")
	public String[] field595;

	@ObfuscatedName("EKQCVRVG.a(I)LEKQCVRVG;")
	public final EKQCVRVG method194() {
		int var1 = -1;
		if (field617 != -1) {
			JFFNRVFW var2 = JFFNRVFW.field779[field617];
			int var3 = var2.field781;
			int var4 = var2.field782;
			int var5 = var2.field783;
			int var6 = client.field325[var5 - var4];
			var1 = field618.field194[var3] >> var4 & var6;
		} else if (field593 != -1) {
			var1 = field618.field194[field593];
		}

		if (var1 >= 0 && var1 < field612.length && field612[var1] != -1) {
			return method199(field612[var1]);
		}

		return null;
	}

	@ObfuscatedName("EKQCVRVG.a(LRSWRPCHR;B)V")
	public final void method195(RSWRPCHR arg0) {
		while (true) {
			int var2 = arg0.method388();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method388();
				field605 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field605[var4] = arg0.method390();
				}
			} else if (var2 == 2) {
				field594 = arg0.method395();
			} else if (var2 == 3) {
				field596 = arg0.method396();
			} else if (var2 == 12) {
				field608 = arg0.method389();
			} else if (var2 == 13) {
				field627 = arg0.method390();
			} else if (var2 == 14) {
				field615 = arg0.method390();
			} else if (var2 == 17) {
				field615 = arg0.method390();
				field629 = arg0.method390();
				field600 = arg0.method390();
				field619 = arg0.method390();
			} else if (var2 >= 30 && var2 < 40) {
				if (field595 == null) {
					field595 = new String[5];
				}

				field595[var2 - 30] = arg0.method395();
				if (field595[var2 - 30].equalsIgnoreCase("hidden")) {
					field595[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method388();
				field601 = new int[var5];
				field628 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field601[var6] = arg0.method390();
					field628[var6] = arg0.method390();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method388();
				field614 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field614[var8] = arg0.method390();
				}
			} else if (var2 == 90) {
				field598 = arg0.method390();
			} else if (var2 == 91) {
				field599 = arg0.method390();
			} else if (var2 == 92) {
				field616 = arg0.method390();
			} else if (var2 == 93) {
				field623 = false;
			} else if (var2 == 95) {
				field625 = arg0.method390();
			} else if (var2 == 97) {
				field602 = arg0.method390();
			} else if (var2 == 98) {
				field610 = arg0.method390();
			} else if (var2 == 99) {
				field613 = true;
			} else if (var2 == 100) {
				field620 = arg0.method389();
			} else if (var2 == 101) {
				field606 = arg0.method389() * 5;
			} else if (var2 == 102) {
				field603 = arg0.method390();
			} else if (var2 == 103) {
				field624 = arg0.method390();
			} else if (var2 == 106) {
				field617 = arg0.method390();
				if (field617 == 0xFFFF) {
					field617 = -1;
				}

				field593 = arg0.method390();
				if (field593 == 0xFFFF) {
					field593 = -1;
				}

				int var9 = arg0.method388();
				field612 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field612[var10] = arg0.method390();
					if (field612[var10] == 0xFFFF) {
						field612[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field609 = false;
			}
		}
	}

	@ObfuscatedName("EKQCVRVG.a(LFXNTEMPE;)V")
	public static final void method196(FXNTEMPE arg0) {
		field611 = new RSWRPCHR(arg0.method212("npc.dat", null));
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("npc.idx", null));
		field607 = var1.method390();
		field604 = new int[field607];
		int var2 = 2;
		for (int var3 = 0; var3 < field607; var3++) {
			field604[var3] = var2;
			var2 += var1.method390();
		}

		field626 = new EKQCVRVG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field626[var4] = new EKQCVRVG();
		}
	}

	@ObfuscatedName("EKQCVRVG.b(I)Z")
	public boolean method197() {
		if (field612 == null) {
			return true;
		}

		int var1 = -1;
		if (field617 != -1) {
			JFFNRVFW var2 = JFFNRVFW.field779[field617];
			int var3 = var2.field781;
			int var4 = var2.field782;
			int var5 = var2.field783;
			int var6 = client.field325[var5 - var4];
			var1 = field618.field194[var3] >> var4 & var6;
		} else if (field593 != -1) {
			var1 = field618.field194[field593];
		}

		if (var1 >= 0 && var1 < field612.length && field612[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EKQCVRVG.a(ZII[I)LWRJMHIDY;")
	public final WRJMHIDY method198(int arg0, int arg1, int[] arg2) {
		if (field612 != null) {
			EKQCVRVG var4 = method194();
			if (var4 == null) {
				return null;
			}

			return var4.method198(arg0, arg1, arg2);
		}

		WRJMHIDY var5 = (WRJMHIDY) field622.method1(field597);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field605.length; var7++) {
				if (!WRJMHIDY.method467(field605[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			WRJMHIDY[] var8 = new WRJMHIDY[field605.length];
			for (int var9 = 0; var9 < field605.length; var9++) {
				var8[var9] = WRJMHIDY.method466(field605[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new WRJMHIDY(var8, var8.length);
			}

			if (field601 != null) {
				for (int var10 = 0; var10 < field601.length; var10++) {
					var5.method480(field601[var10], field628[var10]);
				}
			}

			var5.method473();
			var5.method483(field620 + 64, field606 + 850, -30, -50, -30, true);
			field622.method2(field597, var5);
		}

		WRJMHIDY var11 = WRJMHIDY.field1225;
		var11.method468(OZAHMTPS.method338(arg0) & OZAHMTPS.method338(arg1), var5);

		if (arg0 != -1 && arg1 != -1) {
			var11.method475(arg0, arg2, arg1);
		} else if (arg0 != -1) {
			var11.method474(arg0);
		}

		if (field602 != 128 || field610 != 128) {
			var11.method482(field602, field602, field610);
		}

		var11.method470();
		var11.field1261 = null;
		var11.field1260 = null;

		if (field608 == 1) {
			var11.field1262 = true;
		}

		return var11;
	}

	@ObfuscatedName("EKQCVRVG.c(I)LEKQCVRVG;")
	public static final EKQCVRVG method199(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field626[var1].field597) {
				return field626[var1];
			}
		}

		field621 = (field621 + 1) % 20;
		EKQCVRVG var2 = field626[field621] = new EKQCVRVG();
		field611.field1038 = field604[arg0];
		var2.field597 = arg0;
		var2.method195(field611);
		return var2;
	}

	@ObfuscatedName("EKQCVRVG.d(I)LWRJMHIDY;")
	public final WRJMHIDY method200() {
		if (field612 != null) {
			EKQCVRVG var1 = method194();
			if (var1 == null) {
				return null;
			}

			return var1.method200();
		} else if (field614 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field614.length; var3++) {
				if (!WRJMHIDY.method467(field614[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			WRJMHIDY[] var4 = new WRJMHIDY[field614.length];
			for (int var5 = 0; var5 < field614.length; var5++) {
				var4[var5] = WRJMHIDY.method466(field614[var5]);
			}

			WRJMHIDY var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new WRJMHIDY(var4, var4.length);
			}

			if (field601 != null) {
				for (int var7 = 0; var7 < field601.length; var7++) {
					var6.method480(field601[var7], field628[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("EKQCVRVG.e(I)V")
	public static final void method201() {
		field622 = null;
		field604 = null;
		field626 = null;
		field611 = null;
	}
}
