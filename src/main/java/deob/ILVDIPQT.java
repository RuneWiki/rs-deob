package deob;

@ObfuscatedName("ILVDIPQT")
public final class ILVDIPQT {

	@ObfuscatedName("ILVDIPQT.d")
	public TLIWLEHU field824 = new TLIWLEHU();

	@ObfuscatedName("ILVDIPQT.e")
	public TLIWLEHU field825;

	public ILVDIPQT() {
		field824.field1294 = field824;
		field824.field1295 = field824;
	}

	@ObfuscatedName("ILVDIPQT.a(LTLIWLEHU;)V")
	public void method329(TLIWLEHU arg0) {
		if (arg0.field1295 != null) {
			arg0.method471();
		}

		arg0.field1295 = field824.field1295;
		arg0.field1294 = field824;
		arg0.field1295.field1294 = arg0;
		arg0.field1294.field1295 = arg0;
	}

	@ObfuscatedName("ILVDIPQT.a(LTLIWLEHU;I)V")
	public void method330(TLIWLEHU arg0) {
		if (arg0.field1295 != null) {
			arg0.method471();
		}

		arg0.field1295 = field824;
		arg0.field1294 = field824.field1294;
		arg0.field1295.field1294 = arg0;
		arg0.field1294.field1295 = arg0;
	}

	@ObfuscatedName("ILVDIPQT.a()LTLIWLEHU;")
	public TLIWLEHU method331() {
		TLIWLEHU var1 = field824.field1294;
		if (field824 == var1) {
			return null;
		} else {
			var1.method471();
			return var1;
		}
	}

	@ObfuscatedName("ILVDIPQT.b()LTLIWLEHU;")
	public TLIWLEHU method332() {
		TLIWLEHU var1 = field824.field1294;
		if (field824 == var1) {
			field825 = null;
			return null;
		} else {
			field825 = var1.field1294;
			return var1;
		}
	}

	@ObfuscatedName("ILVDIPQT.a(Z)LTLIWLEHU;")
	public TLIWLEHU method333() {
		TLIWLEHU var1 = field824.field1295;
		if (field824 == var1) {
			field825 = null;
			return null;
		} else {
			field825 = var1.field1295;
			return var1;
		}
	}

	@ObfuscatedName("ILVDIPQT.a(I)LTLIWLEHU;")
	public TLIWLEHU method334() {
		TLIWLEHU var1 = field825;
		if (field824 == var1) {
			field825 = null;
			return null;
		} else {
			field825 = var1.field1294;
			return var1;
		}
	}

	@ObfuscatedName("ILVDIPQT.b(I)LTLIWLEHU;")
	public TLIWLEHU method335() {
		TLIWLEHU var1 = field825;
		if (field824 == var1) {
			field825 = null;
			return null;
		} else {
			field825 = var1.field1295;
			return var1;
		}
	}

	@ObfuscatedName("ILVDIPQT.c()V")
	public void method336() {
		if (field824.field1294 != field824) {
			while (true) {
				TLIWLEHU var1 = field824.field1294;
				if (field824 == var1) {
					return;
				}

				var1.method471();
			}
		}
	}
}
