package deob;

@ObfuscatedName("YSGENUJE")
public final class YSGENUJE {

	@ObfuscatedName("YSGENUJE.e")
	public ZZBPVHZB field1407 = new ZZBPVHZB();

	@ObfuscatedName("YSGENUJE.f")
	public ZZBPVHZB field1408;

	public YSGENUJE() {
		field1407.field1490 = field1407;
		field1407.field1491 = field1407;
	}

	@ObfuscatedName("YSGENUJE.a(LZZBPVHZB;)V")
	public void method520(ZZBPVHZB arg0) {
		if (arg0.field1491 != null) {
			arg0.method591();
		}

		arg0.field1491 = field1407.field1491;
		arg0.field1490 = field1407;
		arg0.field1491.field1490 = arg0;
		arg0.field1490.field1491 = arg0;
	}

	@ObfuscatedName("YSGENUJE.a(LZZBPVHZB;B)V")
	public void method521(ZZBPVHZB arg0) {
		if (arg0.field1491 != null) {
			arg0.method591();
		}

		arg0.field1491 = field1407;
		arg0.field1490 = field1407.field1490;
		arg0.field1491.field1490 = arg0;
		arg0.field1490.field1491 = arg0;
	}

	@ObfuscatedName("YSGENUJE.a()LZZBPVHZB;")
	public ZZBPVHZB method522() {
		ZZBPVHZB var1 = field1407.field1490;
		if (field1407 == var1) {
			return null;
		} else {
			var1.method591();
			return var1;
		}
	}

	@ObfuscatedName("YSGENUJE.b()LZZBPVHZB;")
	public ZZBPVHZB method523() {
		ZZBPVHZB var1 = field1407.field1490;
		if (field1407 == var1) {
			field1408 = null;
			return null;
		} else {
			field1408 = var1.field1490;
			return var1;
		}
	}

	@ObfuscatedName("YSGENUJE.a(I)LZZBPVHZB;")
	public ZZBPVHZB method524() {
		ZZBPVHZB var1 = field1407.field1491;
		if (field1407 == var1) {
			field1408 = null;
			return null;
		} else {
			field1408 = var1.field1491;
			return var1;
		}
	}

	@ObfuscatedName("YSGENUJE.b(I)LZZBPVHZB;")
	public ZZBPVHZB method525() {
		ZZBPVHZB var1 = field1408;
		if (field1407 == var1) {
			field1408 = null;
			return null;
		} else {
			field1408 = var1.field1490;
			return var1;
		}
	}

	@ObfuscatedName("YSGENUJE.c(I)LZZBPVHZB;")
	public ZZBPVHZB method526() {
		ZZBPVHZB var1 = field1408;
		if (field1407 == var1) {
			field1408 = null;
			return null;
		} else {
			field1408 = var1.field1491;
			return var1;
		}
	}

	@ObfuscatedName("YSGENUJE.c()V")
	public void method527() {
		if (field1407.field1490 != field1407) {
			while (true) {
				ZZBPVHZB var1 = field1407.field1490;
				if (field1407 == var1) {
					return;
				}

				var1.method591();
			}
		}
	}
}
