package deob;

@ObfuscatedName("HGYXNEJH")
public class HGYXNEJH {

	@ObfuscatedName("HGYXNEJH.g")
	public boolean field823 = false;

	@ObfuscatedName("HGYXNEJH.h")
	public int field824 = -1;

	@ObfuscatedName("HGYXNEJH.j")
	public boolean field826 = true;

	@ObfuscatedName("HGYXNEJH.a")
	public static int field817;

	@ObfuscatedName("HGYXNEJH.d")
	public int field820;

	@ObfuscatedName("HGYXNEJH.e")
	public int field821;

	@ObfuscatedName("HGYXNEJH.f")
	public int field822;

	@ObfuscatedName("HGYXNEJH.i")
	public int field825;

	@ObfuscatedName("HGYXNEJH.c")
	public String field819;

	@ObfuscatedName("HGYXNEJH.b")
	public static HGYXNEJH[] field818;

	@ObfuscatedName("HGYXNEJH.a(BLXOJZVVDK;)V")
	public static void method257(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("varbit.dat", null));
		field817 = var1.method342();
		if (field818 == null) {
			field818 = new HGYXNEJH[field817];
		}

		for (int var2 = 0; var2 < field817; var2++) {
			if (field818[var2] == null) {
				field818[var2] = new HGYXNEJH();
			}

			field818[var2].method258(var1, var2);

			if (field818[var2].field823) {
				CJICJSIY.field100[field818[var2].field820].field112 = true;
			}
		}

		if (var1.field1090.length != var1.field1091) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("HGYXNEJH.a(ILPQBRPYKE;I)V")
	public void method258(PQBRPYKE arg0, int arg1) {
		while (true) {
			int var3 = arg0.method340();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field820 = arg0.method342();
				field821 = arg0.method340();
				field822 = arg0.method340();
			} else if (var3 == 10) {
				field819 = arg0.method347();
			} else if (var3 == 2) {
				field823 = true;
			} else if (var3 == 3) {
				field824 = arg0.method345();
			} else if (var3 == 4) {
				field825 = arg0.method345();
			} else if (var3 == 5) {
				field826 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
