package deob;

@ObfuscatedName("YDSZUOCR")
public final class YDSZUOCR {

	@ObfuscatedName("YDSZUOCR.b")
	public int field1388;

	@ObfuscatedName("YDSZUOCR.c")
	public ZZBPVHZB[] field1389;

	public YDSZUOCR(int arg0) {
		field1388 = arg0;
		field1389 = new ZZBPVHZB[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			ZZBPVHZB var3 = field1389[var2] = new ZZBPVHZB();
			var3.field1490 = var3;
			var3.field1491 = var3;
		}
	}

	@ObfuscatedName("YDSZUOCR.a(J)LZZBPVHZB;")
	public ZZBPVHZB method518(long arg0) {
		ZZBPVHZB var3 = field1389[(int) (arg0 & field1388 - 1)];
		for (ZZBPVHZB var4 = var3.field1490; var4 != var3; var4 = var4.field1490) {
			if (var4.field1489 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("YDSZUOCR.a(ZLZZBPVHZB;J)V")
	public void method519(ZZBPVHZB arg0, long arg1) {
		if (arg0.field1491 != null) {
			arg0.method591();
		}

		ZZBPVHZB var4 = field1389[(int) (arg1 & field1388 - 1)];
		arg0.field1491 = var4.field1491;
		arg0.field1490 = var4;
		arg0.field1491.field1490 = arg0;
		arg0.field1490.field1491 = arg0;
		arg0.field1489 = arg1;
	}
}
