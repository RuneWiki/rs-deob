package deob;

@ObfuscatedName("OQOGSGFM")
public class OQOGSGFM {

	@ObfuscatedName("OQOGSGFM.g")
	public int field820 = -1;

	@ObfuscatedName("OQOGSGFM.i")
	public int[] field822 = new int[6];

	@ObfuscatedName("OQOGSGFM.j")
	public int[] field823 = new int[6];

	@ObfuscatedName("OQOGSGFM.k")
	public int field824 = 128;

	@ObfuscatedName("OQOGSGFM.l")
	public int field825 = 128;

	@ObfuscatedName("OQOGSGFM.p")
	public static ECXUVDNP field829 = new ECXUVDNP(30);

	@ObfuscatedName("OQOGSGFM.c")
	public static int field816;

	@ObfuscatedName("OQOGSGFM.e")
	public int field818;

	@ObfuscatedName("OQOGSGFM.f")
	public int field819;

	@ObfuscatedName("OQOGSGFM.m")
	public int field826;

	@ObfuscatedName("OQOGSGFM.n")
	public int field827;

	@ObfuscatedName("OQOGSGFM.o")
	public int field828;

	@ObfuscatedName("OQOGSGFM.h")
	public JFYFSKVR field821;

	@ObfuscatedName("OQOGSGFM.d")
	public static OQOGSGFM[] field817;

	@ObfuscatedName("OQOGSGFM.a(LCXFTMSCH;B)V")
	public static void method364(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("spotanim.dat", null));
		field816 = var1.method327();
		if (field817 == null) {
			field817 = new OQOGSGFM[field816];
		}

		for (int var2 = 0; var2 < field816; var2++) {
			if (field817[var2] == null) {
				field817[var2] = new OQOGSGFM();
			}

			field817[var2].field818 = var2;
			field817[var2].method365(var1);
		}
	}

	@ObfuscatedName("OQOGSGFM.a(LMQZHAILV;I)V")
	public void method365(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field819 = arg0.method327();
			} else if (var2 == 2) {
				field820 = arg0.method327();
				if (JFYFSKVR.field659 != null) {
					field821 = JFYFSKVR.field659[field820];
				}
			} else if (var2 == 4) {
				field824 = arg0.method327();
			} else if (var2 == 5) {
				field825 = arg0.method327();
			} else if (var2 == 6) {
				field826 = arg0.method327();
			} else if (var2 == 7) {
				field827 = arg0.method325();
			} else if (var2 == 8) {
				field828 = arg0.method325();
			} else if (var2 >= 40 && var2 < 50) {
				field822[var2 - 40] = arg0.method327();
			} else if (var2 >= 50 && var2 < 60) {
				field823[var2 - 50] = arg0.method327();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OQOGSGFM.a()LYYHPBDED;")
	public YYHPBDED method366() {
		YYHPBDED var1 = (YYHPBDED) field829.method221(field818);
		if (var1 != null) {
			return var1;
		}

		YYHPBDED var2 = YYHPBDED.method551(field819);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field822[0] != 0) {
				var2.method565(field822[var3], field823[var3]);
			}
		}

		field829.method222(field818, var2);
		return var2;
	}
}
