package deob;

@ObfuscatedName("JXKRPXFX")
public class JXKRPXFX {

	@ObfuscatedName("JXKRPXFX.h")
	public int field635 = -1;

	@ObfuscatedName("JXKRPXFX.j")
	public int[] field637 = new int[6];

	@ObfuscatedName("JXKRPXFX.k")
	public int[] field638 = new int[6];

	@ObfuscatedName("JXKRPXFX.l")
	public int field639 = 128;

	@ObfuscatedName("JXKRPXFX.m")
	public int field640 = 128;

	@ObfuscatedName("JXKRPXFX.q")
	public static FFRFJBIR field644 = new FFRFJBIR(30);

	@ObfuscatedName("JXKRPXFX.d")
	public static int field631;

	@ObfuscatedName("JXKRPXFX.f")
	public int field633;

	@ObfuscatedName("JXKRPXFX.g")
	public int field634;

	@ObfuscatedName("JXKRPXFX.n")
	public int field641;

	@ObfuscatedName("JXKRPXFX.o")
	public int field642;

	@ObfuscatedName("JXKRPXFX.p")
	public int field643;

	@ObfuscatedName("JXKRPXFX.i")
	public PQTJDTHH field636;

	@ObfuscatedName("JXKRPXFX.e")
	public static JXKRPXFX[] field632;

	@ObfuscatedName("JXKRPXFX.a(ZLAKPFVPPG;)V")
	public static void method306(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("spotanim.dat", null));
		field631 = var1.method215();
		if (field632 == null) {
			field632 = new JXKRPXFX[field631];
		}

		for (int var2 = 0; var2 < field631; var2++) {
			if (field632[var2] == null) {
				field632[var2] = new JXKRPXFX();
			}

			field632[var2].field633 = var2;
			field632[var2].method307(var1);
		}
	}

	@ObfuscatedName("JXKRPXFX.a(LFTMSICIZ;I)V")
	public void method307(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field634 = arg0.method215();
			} else if (var2 == 2) {
				field635 = arg0.method215();
				if (PQTJDTHH.field951 != null) {
					field636 = PQTJDTHH.field951[field635];
				}
			} else if (var2 == 4) {
				field639 = arg0.method215();
			} else if (var2 == 5) {
				field640 = arg0.method215();
			} else if (var2 == 6) {
				field641 = arg0.method215();
			} else if (var2 == 7) {
				field642 = arg0.method213();
			} else if (var2 == 8) {
				field643 = arg0.method213();
			} else if (var2 >= 40 && var2 < 50) {
				field637[var2 - 40] = arg0.method215();
			} else if (var2 >= 50 && var2 < 60) {
				field638[var2 - 50] = arg0.method215();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("JXKRPXFX.a()LKUGNQTGL;")
	public KUGNQTGL method308() {
		KUGNQTGL var1 = (KUGNQTGL) field644.method198(field633);
		if (var1 != null) {
			return var1;
		}

		KUGNQTGL var2 = KUGNQTGL.method330(field634);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field637[0] != 0) {
				var2.method344(field637[var3], field638[var3]);
			}
		}

		field644.method199(field633, var2);
		return var2;
	}
}
