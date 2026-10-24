package deob;

@ObfuscatedName("WOVRPCGT")
public final class WOVRPCGT {

	@ObfuscatedName("WOVRPCGT.d")
	public BLBQHZXT field1380 = new BLBQHZXT();

	@ObfuscatedName("WOVRPCGT.e")
	public BLBQHZXT field1381;

	public WOVRPCGT() {
		field1380.field44 = field1380;
		field1380.field45 = field1380;
	}

	@ObfuscatedName("WOVRPCGT.a(LBLBQHZXT;)V")
	public void method540(BLBQHZXT arg0) {
		if (arg0.field45 != null) {
			arg0.method14();
		}

		arg0.field45 = field1380.field45;
		arg0.field44 = field1380;
		arg0.field45.field44 = arg0;
		arg0.field44.field45 = arg0;
	}

	@ObfuscatedName("WOVRPCGT.a(ILBLBQHZXT;)V")
	public void method541(BLBQHZXT arg0) {
		if (arg0.field45 != null) {
			arg0.method14();
		}

		arg0.field45 = field1380;
		arg0.field44 = field1380.field44;
		arg0.field45.field44 = arg0;
		arg0.field44.field45 = arg0;
	}

	@ObfuscatedName("WOVRPCGT.a()LBLBQHZXT;")
	public BLBQHZXT method542() {
		BLBQHZXT var1 = field1380.field44;
		if (field1380 == var1) {
			return null;
		} else {
			var1.method14();
			return var1;
		}
	}

	@ObfuscatedName("WOVRPCGT.b()LBLBQHZXT;")
	public BLBQHZXT method543() {
		BLBQHZXT var1 = field1380.field44;
		if (field1380 == var1) {
			field1381 = null;
			return null;
		} else {
			field1381 = var1.field44;
			return var1;
		}
	}

	@ObfuscatedName("WOVRPCGT.a(Z)LBLBQHZXT;")
	public BLBQHZXT method544() {
		BLBQHZXT var1 = field1380.field45;
		if (field1380 == var1) {
			field1381 = null;
			return null;
		} else {
			field1381 = var1.field45;
			return var1;
		}
	}

	@ObfuscatedName("WOVRPCGT.a(I)LBLBQHZXT;")
	public BLBQHZXT method545() {
		BLBQHZXT var1 = field1381;
		if (field1380 == var1) {
			field1381 = null;
			return null;
		} else {
			field1381 = var1.field44;
			return var1;
		}
	}

	@ObfuscatedName("WOVRPCGT.b(I)LBLBQHZXT;")
	public BLBQHZXT method546() {
		BLBQHZXT var1 = field1381;
		if (field1380 == var1) {
			field1381 = null;
			return null;
		} else {
			field1381 = var1.field45;
			return var1;
		}
	}

	@ObfuscatedName("WOVRPCGT.c()V")
	public void method547() {
		if (field1380.field44 != field1380) {
			while (true) {
				BLBQHZXT var1 = field1380.field44;
				if (field1380 == var1) {
					return;
				}

				var1.method14();
			}
		}
	}
}
