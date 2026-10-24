package deob;

@ObfuscatedName("FEPBPONH")
public final class FEPBPONH {

	@ObfuscatedName("FEPBPONH.c")
	public CSUKQTYW field687 = new CSUKQTYW();

	@ObfuscatedName("FEPBPONH.d")
	public CSUKQTYW field688;

	public FEPBPONH() {
		field687.field537 = field687;
		field687.field538 = field687;
	}

	@ObfuscatedName("FEPBPONH.a(LCSUKQTYW;)V")
	public void method266(CSUKQTYW arg0) {
		if (arg0.field538 != null) {
			arg0.method221();
		}

		arg0.field538 = field687.field538;
		arg0.field537 = field687;
		arg0.field538.field537 = arg0;
		arg0.field537.field538 = arg0;
	}

	@ObfuscatedName("FEPBPONH.a(LCSUKQTYW;Z)V")
	public void method267(CSUKQTYW arg0) {
		if (arg0.field538 != null) {
			arg0.method221();
		}

		arg0.field538 = field687;
		arg0.field537 = field687.field537;
		arg0.field538.field537 = arg0;
		arg0.field537.field538 = arg0;
	}

	@ObfuscatedName("FEPBPONH.a()LCSUKQTYW;")
	public CSUKQTYW method268() {
		CSUKQTYW var1 = field687.field537;
		if (field687 == var1) {
			return null;
		} else {
			var1.method221();
			return var1;
		}
	}

	@ObfuscatedName("FEPBPONH.b()LCSUKQTYW;")
	public CSUKQTYW method269() {
		CSUKQTYW var1 = field687.field537;
		if (field687 == var1) {
			field688 = null;
			return null;
		} else {
			field688 = var1.field537;
			return var1;
		}
	}

	@ObfuscatedName("FEPBPONH.a(I)LCSUKQTYW;")
	public CSUKQTYW method270() {
		CSUKQTYW var1 = field687.field538;
		if (field687 == var1) {
			field688 = null;
			return null;
		} else {
			field688 = var1.field538;
			return var1;
		}
	}

	@ObfuscatedName("FEPBPONH.b(I)LCSUKQTYW;")
	public CSUKQTYW method271() {
		CSUKQTYW var1 = field688;
		if (field687 == var1) {
			field688 = null;
			return null;
		} else {
			field688 = var1.field537;
			return var1;
		}
	}

	@ObfuscatedName("FEPBPONH.a(B)LCSUKQTYW;")
	public CSUKQTYW method272() {
		CSUKQTYW var1 = field688;
		if (field687 == var1) {
			field688 = null;
			return null;
		} else {
			field688 = var1.field538;
			return var1;
		}
	}

	@ObfuscatedName("FEPBPONH.c()V")
	public void method273() {
		if (field687.field537 != field687) {
			while (true) {
				CSUKQTYW var1 = field687.field537;
				if (field687 == var1) {
					return;
				}

				var1.method221();
			}
		}
	}
}
