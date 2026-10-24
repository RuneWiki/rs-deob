package deob;

@ObfuscatedName("JHLQAAYP")
public class JHLQAAYP {

	@ObfuscatedName("JHLQAAYP.i")
	public boolean field845 = false;

	@ObfuscatedName("JHLQAAYP.j")
	public int field846 = -1;

	@ObfuscatedName("JHLQAAYP.c")
	public static int field839;

	@ObfuscatedName("JHLQAAYP.f")
	public int field842;

	@ObfuscatedName("JHLQAAYP.g")
	public int field843;

	@ObfuscatedName("JHLQAAYP.h")
	public int field844;

	@ObfuscatedName("JHLQAAYP.k")
	public int field847;

	@ObfuscatedName("JHLQAAYP.e")
	public String field841;

	@ObfuscatedName("JHLQAAYP.d")
	public static JHLQAAYP[] field840;

	@ObfuscatedName("JHLQAAYP.a(ZLXMRRKSSB;)V")
	public static void method268(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("varbit.dat", null));
		field839 = var1.method480();
		if (field840 == null) {
			field840 = new JHLQAAYP[field839];
		}

		for (int var2 = 0; var2 < field839; var2++) {
			if (field840[var2] == null) {
				field840[var2] = new JHLQAAYP();
			}

			field840[var2].method269(var1, var2);

			if (field840[var2].field845) {
				YBKVSPMW.field1360[field840[var2].field842].field1372 = true;
			}
		}

		if (var1.field1334.length != var1.field1335) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("JHLQAAYP.a(ZLXQPFGONL;I)V")
	public void method269(XQPFGONL arg0, int arg1) {
		while (true) {
			int var3 = arg0.method478();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field842 = arg0.method480();
				field843 = arg0.method478();
				field844 = arg0.method478();
			} else if (var3 == 10) {
				field841 = arg0.method485();
			} else if (var3 == 2) {
				field845 = true;
			} else if (var3 == 3) {
				field846 = arg0.method483();
			} else if (var3 == 4) {
				field847 = arg0.method483();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
