package deob;

@ObfuscatedName("IDBAHLFM")
public class IDBAHLFM {

	@ObfuscatedName("IDBAHLFM.f")
	public int field808 = -1;

	@ObfuscatedName("IDBAHLFM.h")
	public int[] field810 = new int[6];

	@ObfuscatedName("IDBAHLFM.i")
	public int[] field811 = new int[6];

	@ObfuscatedName("IDBAHLFM.j")
	public int field812 = 128;

	@ObfuscatedName("IDBAHLFM.k")
	public int field813 = 128;

	@ObfuscatedName("IDBAHLFM.o")
	public static TUCAQTOR field817 = new TUCAQTOR(30);

	@ObfuscatedName("IDBAHLFM.b")
	public static int field804;

	@ObfuscatedName("IDBAHLFM.d")
	public int field806;

	@ObfuscatedName("IDBAHLFM.e")
	public int field807;

	@ObfuscatedName("IDBAHLFM.l")
	public int field814;

	@ObfuscatedName("IDBAHLFM.m")
	public int field815;

	@ObfuscatedName("IDBAHLFM.n")
	public int field816;

	@ObfuscatedName("IDBAHLFM.g")
	public EJHGNUGE field809;

	@ObfuscatedName("IDBAHLFM.c")
	public static IDBAHLFM[] field805;

	@ObfuscatedName("IDBAHLFM.a(ILSYUGXMZF;)V")
	public static void method321(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("spotanim.dat", null));
		field804 = var1.method351();
		if (field805 == null) {
			field805 = new IDBAHLFM[field804];
		}

		for (int var2 = 0; var2 < field804; var2++) {
			if (field805[var2] == null) {
				field805[var2] = new IDBAHLFM();
			}

			field805[var2].field806 = var2;
			field805[var2].method322(var1);
		}
	}

	@ObfuscatedName("IDBAHLFM.a(LKHOMSBHW;I)V")
	public void method322(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field807 = arg0.method351();
			} else if (var2 == 2) {
				field808 = arg0.method351();
				if (EJHGNUGE.field604 != null) {
					field809 = EJHGNUGE.field604[field808];
				}
			} else if (var2 == 4) {
				field812 = arg0.method351();
			} else if (var2 == 5) {
				field813 = arg0.method351();
			} else if (var2 == 6) {
				field814 = arg0.method351();
			} else if (var2 == 7) {
				field815 = arg0.method349();
			} else if (var2 == 8) {
				field816 = arg0.method349();
			} else if (var2 >= 40 && var2 < 50) {
				field810[var2 - 40] = arg0.method351();
			} else if (var2 >= 50 && var2 < 60) {
				field811[var2 - 50] = arg0.method351();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IDBAHLFM.a()LGEUHTGZJ;")
	public GEUHTGZJ method323() {
		GEUHTGZJ var1 = (GEUHTGZJ) field817.method566(field806);
		if (var1 != null) {
			return var1;
		}

		GEUHTGZJ var2 = GEUHTGZJ.method285(field807);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field810[0] != 0) {
				var2.method299(field810[var3], field811[var3]);
			}
		}

		field817.method567(var2, field806);
		return var2;
	}
}
