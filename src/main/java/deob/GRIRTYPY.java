package deob;

@ObfuscatedName("GRIRTYPY")
public final class GRIRTYPY {

	@ObfuscatedName("GRIRTYPY.d")
	public int field685;

	@ObfuscatedName("GRIRTYPY.e")
	public XAQVXEIR[] field686;

	public GRIRTYPY(int arg0) {
		field685 = arg0;
		field686 = new XAQVXEIR[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			XAQVXEIR var3 = field686[var2] = new XAQVXEIR();
			var3.field1480 = var3;
			var3.field1481 = var3;
		}
	}

	@ObfuscatedName("GRIRTYPY.a(J)LXAQVXEIR;")
	public XAQVXEIR method222(long arg0) {
		XAQVXEIR var3 = field686[(int) (arg0 & field685 - 1)];
		for (XAQVXEIR var4 = var3.field1480; var4 != var3; var4 = var4.field1480) {
			if (var4.field1479 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("GRIRTYPY.a(ILXAQVXEIR;J)V")
	public void method223(XAQVXEIR arg0, long arg1) {
		if (arg0.field1481 != null) {
			arg0.method589();
		}

		XAQVXEIR var4 = field686[(int) (arg1 & field685 - 1)];
		arg0.field1481 = var4.field1481;
		arg0.field1480 = var4;
		arg0.field1481.field1480 = arg0;
		arg0.field1480.field1481 = arg0;
		arg0.field1479 = arg1;
	}
}
