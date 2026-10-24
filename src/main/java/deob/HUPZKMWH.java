package deob;

@ObfuscatedName("HUPZKMWH")
public class HUPZKMWH {

	@ObfuscatedName("HUPZKMWH.i")
	public boolean field791 = false;

	@ObfuscatedName("HUPZKMWH.j")
	public int field792 = -1;

	@ObfuscatedName("HUPZKMWH.l")
	public boolean field794 = true;

	@ObfuscatedName("HUPZKMWH.c")
	public static int field785;

	@ObfuscatedName("HUPZKMWH.f")
	public int field788;

	@ObfuscatedName("HUPZKMWH.g")
	public int field789;

	@ObfuscatedName("HUPZKMWH.h")
	public int field790;

	@ObfuscatedName("HUPZKMWH.k")
	public int field793;

	@ObfuscatedName("HUPZKMWH.e")
	public String field787;

	@ObfuscatedName("HUPZKMWH.d")
	public static HUPZKMWH[] field786;

	@ObfuscatedName("HUPZKMWH.a(ZLMJLXHQTQ;)V")
	public static void method238(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("varbit.dat", null));
		field785 = var1.method467();
		if (field786 == null) {
			field786 = new HUPZKMWH[field785];
		}

		for (int var2 = 0; var2 < field785; var2++) {
			if (field786[var2] == null) {
				field786[var2] = new HUPZKMWH();
			}

			field786[var2].method239(var2, var1);

			if (field786[var2].field791) {
				KVOIHOSF.field919[field786[var2].field788].field931 = true;
			}
		}

		if (var1.field1431.length != var1.field1432) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("HUPZKMWH.a(IILXGRGMPUQ;)V")
	public void method239(int arg0, XGRGMPUQ arg1) {
		while (true) {
			int var3 = arg1.method465();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field788 = arg1.method467();
				field789 = arg1.method465();
				field790 = arg1.method465();
			} else if (var3 == 10) {
				field787 = arg1.method472();
			} else if (var3 == 2) {
				field791 = true;
			} else if (var3 == 3) {
				field792 = arg1.method470();
			} else if (var3 == 4) {
				field793 = arg1.method470();
			} else if (var3 == 5) {
				field794 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
