package deob;

@ObfuscatedName("JLOKOMHZ")
public final class JLOKOMHZ {

	@ObfuscatedName("JLOKOMHZ.c")
	public USMRNXZO field745 = new USMRNXZO();

	@ObfuscatedName("JLOKOMHZ.d")
	public USMRNXZO field746;

	public JLOKOMHZ() {
		field745.field1286 = field745;
		field745.field1287 = field745;
	}

	@ObfuscatedName("JLOKOMHZ.a(LUSMRNXZO;)V")
	public void method233(USMRNXZO arg0) {
		if (arg0.field1287 != null) {
			arg0.method531();
		}

		arg0.field1287 = field745.field1287;
		arg0.field1286 = field745;
		arg0.field1287.field1286 = arg0;
		arg0.field1286.field1287 = arg0;
	}

	@ObfuscatedName("JLOKOMHZ.a()LUSMRNXZO;")
	public USMRNXZO method234() {
		USMRNXZO var1 = field745.field1286;
		if (field745 == var1) {
			return null;
		} else {
			var1.method531();
			return var1;
		}
	}

	@ObfuscatedName("JLOKOMHZ.b()LUSMRNXZO;")
	public USMRNXZO method235() {
		USMRNXZO var1 = field745.field1286;
		if (field745 == var1) {
			field746 = null;
			return null;
		} else {
			field746 = var1.field1286;
			return var1;
		}
	}

	@ObfuscatedName("JLOKOMHZ.a(B)LUSMRNXZO;")
	public USMRNXZO method236() {
		USMRNXZO var1 = field746;
		if (field745 == var1) {
			field746 = null;
			return null;
		} else {
			field746 = var1.field1286;
			return var1;
		}
	}

	@ObfuscatedName("JLOKOMHZ.c()I")
	public int method237() {
		int var1 = 0;
		for (USMRNXZO var2 = field745.field1286; var2 != field745; var2 = var2.field1286) {
			var1++;
		}

		return var1;
	}
}
