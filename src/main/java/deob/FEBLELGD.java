package deob;

@ObfuscatedName("FEBLELGD")
public final class FEBLELGD {

	@ObfuscatedName("FEBLELGD.c")
	public CYIKEZWP field620 = new CYIKEZWP();

	@ObfuscatedName("FEBLELGD.d")
	public CYIKEZWP field621;

	public FEBLELGD() {
		field620.field527 = field620;
		field620.field528 = field620;
	}

	@ObfuscatedName("FEBLELGD.a(LCYIKEZWP;)V")
	public void method302(CYIKEZWP arg0) {
		if (arg0.field528 != null) {
			arg0.method177();
		}

		arg0.field528 = field620.field528;
		arg0.field527 = field620;
		arg0.field528.field527 = arg0;
		arg0.field527.field528 = arg0;
	}

	@ObfuscatedName("FEBLELGD.a()LCYIKEZWP;")
	public CYIKEZWP method303() {
		CYIKEZWP var1 = field620.field527;
		if (field620 == var1) {
			return null;
		} else {
			var1.method177();
			return var1;
		}
	}

	@ObfuscatedName("FEBLELGD.b()LCYIKEZWP;")
	public CYIKEZWP method304() {
		CYIKEZWP var1 = field620.field527;
		if (field620 == var1) {
			field621 = null;
			return null;
		} else {
			field621 = var1.field527;
			return var1;
		}
	}

	@ObfuscatedName("FEBLELGD.a(I)LCYIKEZWP;")
	public CYIKEZWP method305() {
		CYIKEZWP var1 = field621;
		if (field620 == var1) {
			field621 = null;
			return null;
		} else {
			field621 = var1.field527;
			return var1;
		}
	}

	@ObfuscatedName("FEBLELGD.c()I")
	public int method306() {
		int var1 = 0;
		for (CYIKEZWP var2 = field620.field527; var2 != field620; var2 = var2.field527) {
			var1++;
		}

		return var1;
	}
}
