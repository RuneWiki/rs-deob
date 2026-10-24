package deob;

@ObfuscatedName("LOPREVUC")
public final class LOPREVUC {

	@ObfuscatedName("LOPREVUC.c")
	public CJDGAOKT field877 = new CJDGAOKT();

	@ObfuscatedName("LOPREVUC.d")
	public CJDGAOKT field878;

	public LOPREVUC() {
		field877.field95 = field877;
		field877.field96 = field877;
	}

	@ObfuscatedName("LOPREVUC.a(LCJDGAOKT;)V")
	public void method259(CJDGAOKT arg0) {
		if (arg0.field96 != null) {
			arg0.method37();
		}

		arg0.field96 = field877.field96;
		arg0.field95 = field877;
		arg0.field96.field95 = arg0;
		arg0.field95.field96 = arg0;
	}

	@ObfuscatedName("LOPREVUC.a()LCJDGAOKT;")
	public CJDGAOKT method260() {
		CJDGAOKT var1 = field877.field95;
		if (field877 == var1) {
			return null;
		} else {
			var1.method37();
			return var1;
		}
	}

	@ObfuscatedName("LOPREVUC.b()LCJDGAOKT;")
	public CJDGAOKT method261() {
		CJDGAOKT var1 = field877.field95;
		if (field877 == var1) {
			field878 = null;
			return null;
		} else {
			field878 = var1.field95;
			return var1;
		}
	}

	@ObfuscatedName("LOPREVUC.a(I)LCJDGAOKT;")
	public CJDGAOKT method262() {
		CJDGAOKT var1 = field878;
		if (field877 == var1) {
			field878 = null;
			return null;
		} else {
			field878 = var1.field95;
			return var1;
		}
	}

	@ObfuscatedName("LOPREVUC.c()I")
	public int method263() {
		int var1 = 0;
		for (CJDGAOKT var2 = field877.field95; var2 != field877; var2 = var2.field95) {
			var1++;
		}

		return var1;
	}
}
