package deob;

@ObfuscatedName("OUZUCGGU")
public final class OUZUCGGU {

	@ObfuscatedName("OUZUCGGU.a")
	public ICYTWAKR field919 = new ICYTWAKR();

	@ObfuscatedName("OUZUCGGU.b")
	public ICYTWAKR field920;

	public OUZUCGGU() {
		field919.field746 = field919;
		field919.field747 = field919;
	}

	@ObfuscatedName("OUZUCGGU.a(LICYTWAKR;)V")
	public void method390(ICYTWAKR arg0) {
		if (arg0.field747 != null) {
			arg0.method290();
		}

		arg0.field747 = field919.field747;
		arg0.field746 = field919;
		arg0.field747.field746 = arg0;
		arg0.field746.field747 = arg0;
	}

	@ObfuscatedName("OUZUCGGU.a(LICYTWAKR;I)V")
	public void method391(ICYTWAKR arg0) {
		if (arg0.field747 != null) {
			arg0.method290();
		}

		arg0.field747 = field919;
		arg0.field746 = field919.field746;
		arg0.field747.field746 = arg0;
		arg0.field746.field747 = arg0;
	}

	@ObfuscatedName("OUZUCGGU.a()LICYTWAKR;")
	public ICYTWAKR method392() {
		ICYTWAKR var1 = field919.field746;
		if (field919 == var1) {
			return null;
		} else {
			var1.method290();
			return var1;
		}
	}

	@ObfuscatedName("OUZUCGGU.b()LICYTWAKR;")
	public ICYTWAKR method393() {
		ICYTWAKR var1 = field919.field746;
		if (field919 == var1) {
			field920 = null;
			return null;
		} else {
			field920 = var1.field746;
			return var1;
		}
	}

	@ObfuscatedName("OUZUCGGU.a(Z)LICYTWAKR;")
	public ICYTWAKR method394() {
		ICYTWAKR var1 = field919.field747;
		if (field919 == var1) {
			field920 = null;
			return null;
		} else {
			field920 = var1.field747;
			return var1;
		}
	}

	@ObfuscatedName("OUZUCGGU.b(Z)LICYTWAKR;")
	public ICYTWAKR method395() {
		ICYTWAKR var1 = field920;
		if (field919 == var1) {
			field920 = null;
			return null;
		} else {
			field920 = var1.field746;
			return var1;
		}
	}

	@ObfuscatedName("OUZUCGGU.a(I)LICYTWAKR;")
	public ICYTWAKR method396() {
		ICYTWAKR var1 = field920;
		if (field919 == var1) {
			field920 = null;
			return null;
		} else {
			field920 = var1.field747;
			return var1;
		}
	}

	@ObfuscatedName("OUZUCGGU.c()V")
	public void method397() {
		if (field919.field746 != field919) {
			while (true) {
				ICYTWAKR var1 = field919.field746;
				if (field919 == var1) {
					return;
				}

				var1.method290();
			}
		}
	}
}
