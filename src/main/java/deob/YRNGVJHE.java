package deob;

@ObfuscatedName("YRNGVJHE")
public final class YRNGVJHE {

	@ObfuscatedName("YRNGVJHE.d")
	public int field1512;

	@ObfuscatedName("YRNGVJHE.e")
	public VHAERWBS[] field1513;

	public YRNGVJHE(int arg0) {
		field1512 = arg0;
		field1513 = new VHAERWBS[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			VHAERWBS var3 = field1513[var2] = new VHAERWBS();
			var3.field1432 = var3;
			var3.field1433 = var3;
		}
	}

	@ObfuscatedName("YRNGVJHE.a(J)LVHAERWBS;")
	public VHAERWBS method600(long arg0) {
		VHAERWBS var3 = field1513[(int) (arg0 & field1512 - 1)];
		for (VHAERWBS var4 = var3.field1432; var4 != var3; var4 = var4.field1432) {
			if (var4.field1431 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("YRNGVJHE.a(JBLVHAERWBS;)V")
	public void method601(long arg0, VHAERWBS arg1) {
		if (arg1.field1433 != null) {
			arg1.method579();
		}

		VHAERWBS var4 = field1513[(int) (arg0 & field1512 - 1)];
		arg1.field1433 = var4.field1433;
		arg1.field1432 = var4;
		arg1.field1433.field1432 = arg1;
		arg1.field1432.field1433 = arg1;
		arg1.field1431 = arg0;
	}
}
