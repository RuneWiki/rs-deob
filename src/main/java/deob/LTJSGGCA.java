package deob;

@ObfuscatedName("LTJSGGCA")
public final class LTJSGGCA {

	@ObfuscatedName("LTJSGGCA.g")
	public int field836;

	@ObfuscatedName("LTJSGGCA.h")
	public TVKHSKYG[] field837;

	public LTJSGGCA(int arg0) {
		field836 = arg0;
		field837 = new TVKHSKYG[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			TVKHSKYG var3 = field837[var2] = new TVKHSKYG();
			var3.field1307 = var3;
			var3.field1308 = var3;
		}
	}

	@ObfuscatedName("LTJSGGCA.a(J)LTVKHSKYG;")
	public TVKHSKYG method363(long arg0) {
		TVKHSKYG var3 = field837[(int) (arg0 & field836 - 1)];
		for (TVKHSKYG var4 = var3.field1307; var4 != var3; var4 = var4.field1307) {
			if (var4.field1306 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("LTJSGGCA.a(ILTVKHSKYG;J)V")
	public void method364(TVKHSKYG arg0, long arg1) {
		if (arg0.field1308 != null) {
			arg0.method518();
		}

		TVKHSKYG var4 = field837[(int) (arg1 & field836 - 1)];
		arg0.field1308 = var4.field1308;
		arg0.field1307 = var4;
		arg0.field1308.field1307 = arg0;
		arg0.field1307.field1308 = arg0;
		arg0.field1306 = arg1;
	}
}
