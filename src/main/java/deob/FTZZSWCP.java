package deob;

@ObfuscatedName("FTZZSWCP")
public class FTZZSWCP {

	@ObfuscatedName("FTZZSWCP.i")
	public boolean field645 = false;

	@ObfuscatedName("FTZZSWCP.j")
	public int field646 = -1;

	@ObfuscatedName("FTZZSWCP.c")
	public static int field639;

	@ObfuscatedName("FTZZSWCP.f")
	public int field642;

	@ObfuscatedName("FTZZSWCP.g")
	public int field643;

	@ObfuscatedName("FTZZSWCP.h")
	public int field644;

	@ObfuscatedName("FTZZSWCP.k")
	public int field647;

	@ObfuscatedName("FTZZSWCP.e")
	public String field641;

	@ObfuscatedName("FTZZSWCP.d")
	public static FTZZSWCP[] field640;

	@ObfuscatedName("FTZZSWCP.a(LFIGUVTWB;Z)V")
	public static void method238(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("varbit.dat", null));
		field639 = var1.method294();
		if (field640 == null) {
			field640 = new FTZZSWCP[field639];
		}

		for (int var2 = 0; var2 < field639; var2++) {
			if (field640[var2] == null) {
				field640[var2] = new FTZZSWCP();
			}

			field640[var2].method239(var1, var2);

			if (field640[var2].field645) {
				ONNQWBMW.field920[field640[var2].field642].field932 = true;
			}
		}

		if (var1.field811.length != var1.field812) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("FTZZSWCP.a(ILMUKVLYLC;I)V")
	public void method239(MUKVLYLC arg0, int arg1) {
		while (true) {
			int var3 = arg0.method292();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field642 = arg0.method294();
				field643 = arg0.method292();
				field644 = arg0.method292();
			} else if (var3 == 10) {
				field641 = arg0.method299();
			} else if (var3 == 2) {
				field645 = true;
			} else if (var3 == 3) {
				field646 = arg0.method297();
			} else if (var3 == 4) {
				field647 = arg0.method297();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
