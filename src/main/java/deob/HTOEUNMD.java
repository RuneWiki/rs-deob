package deob;

@ObfuscatedName("HTOEUNMD")
public class HTOEUNMD {

	@ObfuscatedName("HTOEUNMD.e")
	public int field775 = -1;

	@ObfuscatedName("HTOEUNMD.g")
	public int[] field777 = new int[6];

	@ObfuscatedName("HTOEUNMD.h")
	public int[] field778 = new int[6];

	@ObfuscatedName("HTOEUNMD.i")
	public int field779 = 128;

	@ObfuscatedName("HTOEUNMD.j")
	public int field780 = 128;

	@ObfuscatedName("HTOEUNMD.n")
	public static LXKBDSHJ field784 = new LXKBDSHJ(30);

	@ObfuscatedName("HTOEUNMD.a")
	public static int field771;

	@ObfuscatedName("HTOEUNMD.c")
	public int field773;

	@ObfuscatedName("HTOEUNMD.d")
	public int field774;

	@ObfuscatedName("HTOEUNMD.k")
	public int field781;

	@ObfuscatedName("HTOEUNMD.l")
	public int field782;

	@ObfuscatedName("HTOEUNMD.m")
	public int field783;

	@ObfuscatedName("HTOEUNMD.f")
	public KSVXFIAD field776;

	@ObfuscatedName("HTOEUNMD.b")
	public static HTOEUNMD[] field772;

	@ObfuscatedName("HTOEUNMD.a(BLJUPFHAZZ;)V")
	public static void method243(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("spotanim.dat", null));
		field771 = var1.method531();
		if (field772 == null) {
			field772 = new HTOEUNMD[field771];
		}

		for (int var2 = 0; var2 < field771; var2++) {
			if (field772[var2] == null) {
				field772[var2] = new HTOEUNMD();
			}

			field772[var2].field773 = var2;
			field772[var2].method244(var1);
		}
	}

	@ObfuscatedName("HTOEUNMD.a(LTKPFKOXP;B)V")
	public void method244(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field774 = arg0.method531();
			} else if (var2 == 2) {
				field775 = arg0.method531();
				if (KSVXFIAD.field1002 != null) {
					field776 = KSVXFIAD.field1002[field775];
				}
			} else if (var2 == 4) {
				field779 = arg0.method531();
			} else if (var2 == 5) {
				field780 = arg0.method531();
			} else if (var2 == 6) {
				field781 = arg0.method531();
			} else if (var2 == 7) {
				field782 = arg0.method529();
			} else if (var2 == 8) {
				field783 = arg0.method529();
			} else if (var2 >= 40 && var2 < 50) {
				field777[var2 - 40] = arg0.method531();
			} else if (var2 >= 50 && var2 < 60) {
				field778[var2 - 50] = arg0.method531();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("HTOEUNMD.a()LOGORHYVW;")
	public OGORHYVW method245() {
		OGORHYVW var1 = (OGORHYVW) field784.method413(field773);
		if (var1 != null) {
			return var1;
		}

		OGORHYVW var2 = OGORHYVW.method433(field774);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field777[0] != 0) {
				var2.method447(field777[var3], field778[var3]);
			}
		}

		field784.method414(var2, field773);
		return var2;
	}
}
