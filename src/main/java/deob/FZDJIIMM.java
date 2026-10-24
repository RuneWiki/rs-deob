package deob;

@ObfuscatedName("FZDJIIMM")
public class FZDJIIMM {

	@ObfuscatedName("FZDJIIMM.j")
	public boolean field641 = false;

	@ObfuscatedName("FZDJIIMM.k")
	public boolean field642 = true;

	@ObfuscatedName("FZDJIIMM.m")
	public boolean field644 = false;

	@ObfuscatedName("FZDJIIMM.p")
	public boolean field647 = false;

	@ObfuscatedName("FZDJIIMM.q")
	public int field648 = -1;

	@ObfuscatedName("FZDJIIMM.r")
	public boolean field649 = true;

	@ObfuscatedName("FZDJIIMM.c")
	public static int field634;

	@ObfuscatedName("FZDJIIMM.e")
	public static int field636;

	@ObfuscatedName("FZDJIIMM.h")
	public int field639;

	@ObfuscatedName("FZDJIIMM.i")
	public int field640;

	@ObfuscatedName("FZDJIIMM.l")
	public int field643;

	@ObfuscatedName("FZDJIIMM.n")
	public int field645;

	@ObfuscatedName("FZDJIIMM.o")
	public int field646;

	@ObfuscatedName("FZDJIIMM.g")
	public String field638;

	@ObfuscatedName("FZDJIIMM.f")
	public static int[] field637;

	@ObfuscatedName("FZDJIIMM.d")
	public static FZDJIIMM[] field635;

	@ObfuscatedName("FZDJIIMM.a(LRSPRYUFS;I)V")
	public static void method205(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("varp.dat", null));
		field636 = 0;
		field634 = var1.method341();
		if (field635 == null) {
			field635 = new FZDJIIMM[field634];
		}

		if (field637 == null) {
			field637 = new int[field634];
		}

		for (int var2 = 0; var2 < field634; var2++) {
			if (field635[var2] == null) {
				field635[var2] = new FZDJIIMM();
			}

			field635[var2].method206(var1, var2);
		}

		if (var1.field928.length != var1.field929) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("FZDJIIMM.a(LNQUAUMDT;II)V")
	public void method206(NQUAUMDT arg0, int arg1) {
		while (true) {
			int var3 = arg0.method339();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field639 = arg0.method339();
			} else if (var3 == 2) {
				field640 = arg0.method339();
			} else if (var3 == 3) {
				field641 = true;
				field637[field636++] = arg1;
			} else if (var3 == 4) {
				field642 = false;
			} else if (var3 == 5) {
				field643 = arg0.method341();
			} else if (var3 == 6) {
				field644 = true;
			} else if (var3 == 7) {
				field645 = arg0.method344();
			} else if (var3 == 8) {
				field646 = 1;
				field647 = true;
			} else if (var3 == 10) {
				field638 = arg0.method346();
			} else if (var3 == 11) {
				field647 = true;
			} else if (var3 == 12) {
				field648 = arg0.method344();
			} else if (var3 == 13) {
				field646 = 2;
				field647 = true;
			} else if (var3 == 14) {
				field649 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
