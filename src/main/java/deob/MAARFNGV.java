package deob;

@ObfuscatedName("MAARFNGV")
public final class MAARFNGV {

	@ObfuscatedName("MAARFNGV.c")
	public int field864;

	@ObfuscatedName("MAARFNGV.h")
	public boolean field869;

	@ObfuscatedName("MAARFNGV.b")
	public byte[] field863;

	@ObfuscatedName("MAARFNGV.d")
	public int[] field865;

	@ObfuscatedName("MAARFNGV.e")
	public int[] field866;

	@ObfuscatedName("MAARFNGV.f")
	public int[] field867;

	@ObfuscatedName("MAARFNGV.g")
	public int[] field868;

	public MAARFNGV(byte[] arg0) {
		method331(arg0);
	}

	@ObfuscatedName("MAARFNGV.a([BZ)V")
	public void method331(byte[] arg0) {
		EMWAMCXW var2 = new EMWAMCXW(arg0);
		int var3 = var2.method221();
		int var4 = var2.method221();
		if (var3 == var4) {
			field863 = arg0;
			field869 = false;
		} else {
			byte[] var5 = new byte[var3];
			VNSUZZRM.method437(var5, var3, arg0, var4, 6);
			field863 = var5;
			var2 = new EMWAMCXW(field863);
			field869 = true;
		}

		field864 = var2.method219();
		field865 = new int[field864];
		field866 = new int[field864];
		field867 = new int[field864];
		field868 = new int[field864];
		int var6 = field864 * 10 + var2.field617;
		for (int var7 = 0; var7 < field864; var7++) {
			field865[var7] = var2.method222();
			field866[var7] = var2.method221();
			field867[var7] = var2.method221();
			field868[var7] = var6;
			var6 += field867[var7];
		}
	}

	@ObfuscatedName("MAARFNGV.a(Ljava/lang/String;[B)[B")
	public byte[] method332(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field864; var5++) {
			if (field865[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field866[var5]];
				}

				if (field869) {
					for (int var6 = 0; var6 < field866[var5]; var6++) {
						arg1[var6] = field863[field868[var5] + var6];
					}
				} else {
					VNSUZZRM.method437(arg1, field866[var5], field863, field867[var5], field868[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
