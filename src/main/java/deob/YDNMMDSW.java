package deob;

@ObfuscatedName("YDNMMDSW")
public final class YDNMMDSW {

	@ObfuscatedName("YDNMMDSW.c")
	public int field1358;

	@ObfuscatedName("YDNMMDSW.d")
	public PXORWIXO[] field1359;

	public YDNMMDSW(int arg0) {
		field1358 = arg0;
		field1359 = new PXORWIXO[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			PXORWIXO var3 = field1359[var2] = new PXORWIXO();
			var3.field1137 = var3;
			var3.field1138 = var3;
		}
	}

	@ObfuscatedName("YDNMMDSW.a(J)LPXORWIXO;")
	public PXORWIXO method567(long arg0) {
		PXORWIXO var3 = field1359[(int) (arg0 & field1358 - 1)];
		for (PXORWIXO var4 = var3.field1137; var4 != var3; var4 = var4.field1137) {
			if (var4.field1136 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("YDNMMDSW.a(JLPXORWIXO;Z)V")
	public void method568(long arg0, PXORWIXO arg1) {
		if (arg1.field1138 != null) {
			arg1.method464();
		}

		PXORWIXO var4 = field1359[(int) (arg0 & field1358 - 1)];
		arg1.field1138 = var4.field1138;
		arg1.field1137 = var4;
		arg1.field1138.field1137 = arg1;
		arg1.field1137.field1138 = arg1;
		arg1.field1136 = arg0;
	}
}
