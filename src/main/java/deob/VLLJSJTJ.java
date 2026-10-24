package deob;

@ObfuscatedName("VLLJSJTJ")
public final class VLLJSJTJ {

	@ObfuscatedName("VLLJSJTJ.f")
	public WWONSPNF field1245 = new WWONSPNF();

	@ObfuscatedName("VLLJSJTJ.g")
	public WWONSPNF field1246;

	public VLLJSJTJ() {
		field1245.field1371 = field1245;
		field1245.field1372 = field1245;
	}

	@ObfuscatedName("VLLJSJTJ.a(LWWONSPNF;)V")
	public void method525(WWONSPNF arg0) {
		if (arg0.field1372 != null) {
			arg0.method555();
		}

		arg0.field1372 = field1245.field1372;
		arg0.field1371 = field1245;
		arg0.field1372.field1371 = arg0;
		arg0.field1371.field1372 = arg0;
	}

	@ObfuscatedName("VLLJSJTJ.a(ILWWONSPNF;)V")
	public void method526(WWONSPNF arg0) {
		if (arg0.field1372 != null) {
			arg0.method555();
		}

		arg0.field1372 = field1245;
		arg0.field1371 = field1245.field1371;
		arg0.field1372.field1371 = arg0;
		arg0.field1371.field1372 = arg0;
	}

	@ObfuscatedName("VLLJSJTJ.a()LWWONSPNF;")
	public WWONSPNF method527() {
		WWONSPNF var1 = field1245.field1371;
		if (field1245 == var1) {
			return null;
		} else {
			var1.method555();
			return var1;
		}
	}

	@ObfuscatedName("VLLJSJTJ.b()LWWONSPNF;")
	public WWONSPNF method528() {
		WWONSPNF var1 = field1245.field1371;
		if (field1245 == var1) {
			field1246 = null;
			return null;
		} else {
			field1246 = var1.field1371;
			return var1;
		}
	}

	@ObfuscatedName("VLLJSJTJ.a(I)LWWONSPNF;")
	public WWONSPNF method529() {
		WWONSPNF var1 = field1245.field1372;
		if (field1245 == var1) {
			field1246 = null;
			return null;
		} else {
			field1246 = var1.field1372;
			return var1;
		}
	}

	@ObfuscatedName("VLLJSJTJ.a(Z)LWWONSPNF;")
	public WWONSPNF method530() {
		WWONSPNF var1 = field1246;
		if (field1245 == var1) {
			field1246 = null;
			return null;
		} else {
			field1246 = var1.field1371;
			return var1;
		}
	}

	@ObfuscatedName("VLLJSJTJ.b(I)LWWONSPNF;")
	public WWONSPNF method531() {
		WWONSPNF var1 = field1246;
		if (field1245 == var1) {
			field1246 = null;
			return null;
		} else {
			field1246 = var1.field1372;
			return var1;
		}
	}

	@ObfuscatedName("VLLJSJTJ.c()V")
	public void method532() {
		if (field1245.field1371 != field1245) {
			while (true) {
				WWONSPNF var1 = field1245.field1371;
				if (field1245 == var1) {
					return;
				}

				var1.method555();
			}
		}
	}
}
