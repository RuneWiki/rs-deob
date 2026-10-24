package deob;

@ObfuscatedName("EDMDOBNM")
public final class EDMDOBNM {

	@ObfuscatedName("EDMDOBNM.b")
	public MCYIFIZT field590 = new MCYIFIZT();

	@ObfuscatedName("EDMDOBNM.c")
	public MCYIFIZT field591;

	public EDMDOBNM() {
		field590.field899 = field590;
		field590.field900 = field590;
	}

	@ObfuscatedName("EDMDOBNM.a(LMCYIFIZT;)V")
	public void method193(MCYIFIZT arg0) {
		if (arg0.field900 != null) {
			arg0.method380();
		}

		arg0.field900 = field590.field900;
		arg0.field899 = field590;
		arg0.field900.field899 = arg0;
		arg0.field899.field900 = arg0;
	}

	@ObfuscatedName("EDMDOBNM.a()LMCYIFIZT;")
	public MCYIFIZT method194() {
		MCYIFIZT var1 = field590.field899;
		if (field590 == var1) {
			return null;
		} else {
			var1.method380();
			return var1;
		}
	}

	@ObfuscatedName("EDMDOBNM.b()LMCYIFIZT;")
	public MCYIFIZT method195() {
		MCYIFIZT var1 = field590.field899;
		if (field590 == var1) {
			field591 = null;
			return null;
		} else {
			field591 = var1.field899;
			return var1;
		}
	}

	@ObfuscatedName("EDMDOBNM.a(I)LMCYIFIZT;")
	public MCYIFIZT method196() {
		MCYIFIZT var1 = field591;
		if (field590 == var1) {
			field591 = null;
			return null;
		} else {
			field591 = var1.field899;
			return var1;
		}
	}

	@ObfuscatedName("EDMDOBNM.c()I")
	public int method197() {
		int var1 = 0;
		for (MCYIFIZT var2 = field590.field899; var2 != field590; var2 = var2.field899) {
			var1++;
		}

		return var1;
	}
}
