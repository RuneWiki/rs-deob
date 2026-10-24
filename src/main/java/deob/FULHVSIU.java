package deob;

@ObfuscatedName("FULHVSIU")
public class FULHVSIU {

	@ObfuscatedName("FULHVSIU.f")
	public int field607 = -1;

	@ObfuscatedName("FULHVSIU.h")
	public int[] field609 = new int[6];

	@ObfuscatedName("FULHVSIU.i")
	public int[] field610 = new int[6];

	@ObfuscatedName("FULHVSIU.j")
	public int field611 = 128;

	@ObfuscatedName("FULHVSIU.k")
	public int field612 = 128;

	@ObfuscatedName("FULHVSIU.o")
	public static HPFNYARJ field616 = new HPFNYARJ(30);

	@ObfuscatedName("FULHVSIU.b")
	public static int field603;

	@ObfuscatedName("FULHVSIU.d")
	public int field605;

	@ObfuscatedName("FULHVSIU.e")
	public int field606;

	@ObfuscatedName("FULHVSIU.l")
	public int field613;

	@ObfuscatedName("FULHVSIU.m")
	public int field614;

	@ObfuscatedName("FULHVSIU.n")
	public int field615;

	@ObfuscatedName("FULHVSIU.g")
	public NMXKUYSC field608;

	@ObfuscatedName("FULHVSIU.c")
	public static FULHVSIU[] field604;

	@ObfuscatedName("FULHVSIU.a(ILCVNWKEAW;)V")
	public static void method229(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("spotanim.dat", null));
		field603 = var1.method523();
		if (field604 == null) {
			field604 = new FULHVSIU[field603];
		}

		for (int var2 = 0; var2 < field603; var2++) {
			if (field604[var2] == null) {
				field604[var2] = new FULHVSIU();
			}

			field604[var2].field605 = var2;
			field604[var2].method230(var1);
		}
	}

	@ObfuscatedName("FULHVSIU.a(BLXOUQUKZW;)V")
	public void method230(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field606 = arg0.method523();
			} else if (var2 == 2) {
				field607 = arg0.method523();
				if (NMXKUYSC.field998 != null) {
					field608 = NMXKUYSC.field998[field607];
				}
			} else if (var2 == 4) {
				field611 = arg0.method523();
			} else if (var2 == 5) {
				field612 = arg0.method523();
			} else if (var2 == 6) {
				field613 = arg0.method523();
			} else if (var2 == 7) {
				field614 = arg0.method521();
			} else if (var2 == 8) {
				field615 = arg0.method521();
			} else if (var2 >= 40 && var2 < 50) {
				field609[var2 - 40] = arg0.method523();
			} else if (var2 >= 50 && var2 < 60) {
				field610[var2 - 50] = arg0.method523();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FULHVSIU.a()LKPUOCBCE;")
	public KPUOCBCE method231() {
		KPUOCBCE var1 = (KPUOCBCE) field616.method302(field605);
		if (var1 != null) {
			return var1;
		}

		KPUOCBCE var2 = KPUOCBCE.method379(field606);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field609[0] != 0) {
				var2.method393(field609[var3], field610[var3]);
			}
		}

		field616.method303(field605, var2);
		return var2;
	}
}
