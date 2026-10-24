package deob;

@ObfuscatedName("DMMTBJKZ")
public final class DMMTBJKZ {

	@ObfuscatedName("DMMTBJKZ.b")
	public DOUWNVSH field630 = new DOUWNVSH();

	@ObfuscatedName("DMMTBJKZ.c")
	public DOUWNVSH field631;

	public DMMTBJKZ() {
		field630.field633 = field630;
		field630.field634 = field630;
	}

	@ObfuscatedName("DMMTBJKZ.a(LDOUWNVSH;)V")
	public void method197(DOUWNVSH arg0) {
		if (arg0.field634 != null) {
			arg0.method205();
		}

		arg0.field634 = field630.field634;
		arg0.field633 = field630;
		arg0.field634.field633 = arg0;
		arg0.field633.field634 = arg0;
	}

	@ObfuscatedName("DMMTBJKZ.a(LDOUWNVSH;Z)V")
	public void method198(DOUWNVSH arg0) {
		if (arg0.field634 != null) {
			arg0.method205();
		}

		arg0.field634 = field630;
		arg0.field633 = field630.field633;
		arg0.field634.field633 = arg0;
		arg0.field633.field634 = arg0;
	}

	@ObfuscatedName("DMMTBJKZ.a()LDOUWNVSH;")
	public DOUWNVSH method199() {
		DOUWNVSH var1 = field630.field633;
		if (field630 == var1) {
			return null;
		} else {
			var1.method205();
			return var1;
		}
	}

	@ObfuscatedName("DMMTBJKZ.b()LDOUWNVSH;")
	public DOUWNVSH method200() {
		DOUWNVSH var1 = field630.field633;
		if (field630 == var1) {
			field631 = null;
			return null;
		} else {
			field631 = var1.field633;
			return var1;
		}
	}

	@ObfuscatedName("DMMTBJKZ.a(I)LDOUWNVSH;")
	public DOUWNVSH method201() {
		DOUWNVSH var1 = field630.field634;
		if (field630 == var1) {
			field631 = null;
			return null;
		} else {
			field631 = var1.field634;
			return var1;
		}
	}

	@ObfuscatedName("DMMTBJKZ.b(I)LDOUWNVSH;")
	public DOUWNVSH method202() {
		DOUWNVSH var1 = field631;
		if (field630 == var1) {
			field631 = null;
			return null;
		} else {
			field631 = var1.field633;
			return var1;
		}
	}

	@ObfuscatedName("DMMTBJKZ.c(I)LDOUWNVSH;")
	public DOUWNVSH method203() {
		DOUWNVSH var1 = field631;
		if (field630 == var1) {
			field631 = null;
			return null;
		} else {
			field631 = var1.field634;
			return var1;
		}
	}

	@ObfuscatedName("DMMTBJKZ.c()V")
	public void method204() {
		if (field630.field633 != field630) {
			while (true) {
				DOUWNVSH var1 = field630.field633;
				if (field630 == var1) {
					return;
				}

				var1.method205();
			}
		}
	}
}
