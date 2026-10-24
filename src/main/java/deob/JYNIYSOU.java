package deob;

@ObfuscatedName("JYNIYSOU")
public class JYNIYSOU {

	@ObfuscatedName("JYNIYSOU.h")
	public boolean field753 = false;

	@ObfuscatedName("JYNIYSOU.i")
	public int field754 = -1;

	@ObfuscatedName("JYNIYSOU.k")
	public boolean field756 = true;

	@ObfuscatedName("JYNIYSOU.b")
	public static int field747;

	@ObfuscatedName("JYNIYSOU.e")
	public int field750;

	@ObfuscatedName("JYNIYSOU.f")
	public int field751;

	@ObfuscatedName("JYNIYSOU.g")
	public int field752;

	@ObfuscatedName("JYNIYSOU.j")
	public int field755;

	@ObfuscatedName("JYNIYSOU.d")
	public String field749;

	@ObfuscatedName("JYNIYSOU.c")
	public static JYNIYSOU[] field748;

	@ObfuscatedName("JYNIYSOU.a(LRSPRYUFS;I)V")
	public static void method239(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("varbit.dat", null));
		field747 = var1.method341();
		if (field748 == null) {
			field748 = new JYNIYSOU[field747];
		}

		for (int var2 = 0; var2 < field747; var2++) {
			if (field748[var2] == null) {
				field748[var2] = new JYNIYSOU();
			}

			field748[var2].method240(var1, var2);

			if (field748[var2].field753) {
				FZDJIIMM.field635[field748[var2].field750].field647 = true;
			}
		}

		if (var1.field928.length != var1.field929) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("JYNIYSOU.a(LNQUAUMDT;II)V")
	public void method240(NQUAUMDT arg0, int arg1) {
		while (true) {
			int var3 = arg0.method339();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field750 = arg0.method341();
				field751 = arg0.method339();
				field752 = arg0.method339();
			} else if (var3 == 10) {
				field749 = arg0.method346();
			} else if (var3 == 2) {
				field753 = true;
			} else if (var3 == 3) {
				field754 = arg0.method344();
			} else if (var3 == 4) {
				field755 = arg0.method344();
			} else if (var3 == 5) {
				field756 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
