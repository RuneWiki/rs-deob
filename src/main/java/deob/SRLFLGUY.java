package deob;

@ObfuscatedName("SRLFLGUY")
public class SRLFLGUY {

	@ObfuscatedName("SRLFLGUY.h")
	public boolean field1165 = false;

	@ObfuscatedName("SRLFLGUY.i")
	public int field1166 = -1;

	@ObfuscatedName("SRLFLGUY.k")
	public boolean field1168 = true;

	@ObfuscatedName("SRLFLGUY.b")
	public static int field1159;

	@ObfuscatedName("SRLFLGUY.e")
	public int field1162;

	@ObfuscatedName("SRLFLGUY.f")
	public int field1163;

	@ObfuscatedName("SRLFLGUY.g")
	public int field1164;

	@ObfuscatedName("SRLFLGUY.j")
	public int field1167;

	@ObfuscatedName("SRLFLGUY.d")
	public String field1161;

	@ObfuscatedName("SRLFLGUY.c")
	public static SRLFLGUY[] field1160;

	@ObfuscatedName("SRLFLGUY.a(ILBBMKAXRK;)V")
	public static void method447(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("varbit.dat", null));
		field1159 = var1.method226();
		if (field1160 == null) {
			field1160 = new SRLFLGUY[field1159];
		}

		for (int var2 = 0; var2 < field1159; var2++) {
			if (field1160[var2] == null) {
				field1160[var2] = new SRLFLGUY();
			}

			field1160[var2].method448(var2, var1);

			if (field1160[var2].field1165) {
				ISZVQSTL.field843[field1160[var2].field1162].field855 = true;
			}
		}

		if (var1.field683.length != var1.field684) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("SRLFLGUY.a(ILEILHLJCE;I)V")
	public void method448(int arg0, EILHLJCE arg1) {
		while (true) {
			int var3 = arg1.method224();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1162 = arg1.method226();
				field1163 = arg1.method224();
				field1164 = arg1.method224();
			} else if (var3 == 10) {
				field1161 = arg1.method231();
			} else if (var3 == 2) {
				field1165 = true;
			} else if (var3 == 3) {
				field1166 = arg1.method229();
			} else if (var3 == 4) {
				field1167 = arg1.method229();
			} else if (var3 == 5) {
				field1168 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
