package deob;

@ObfuscatedName("QGWIBVPG")
public final class QGWIBVPG {

	@ObfuscatedName("QGWIBVPG.c")
	public QEPVMESX field1026 = new QEPVMESX();

	@ObfuscatedName("QGWIBVPG.d")
	public QEPVMESX field1027;

	public QGWIBVPG() {
		field1026.field1024 = field1026;
		field1026.field1025 = field1026;
	}

	@ObfuscatedName("QGWIBVPG.a(LQEPVMESX;)V")
	public void method419(QEPVMESX arg0) {
		if (arg0.field1025 != null) {
			arg0.method418();
		}

		arg0.field1025 = field1026.field1025;
		arg0.field1024 = field1026;
		arg0.field1025.field1024 = arg0;
		arg0.field1024.field1025 = arg0;
	}

	@ObfuscatedName("QGWIBVPG.a(ILQEPVMESX;)V")
	public void method420(QEPVMESX arg0) {
		if (arg0.field1025 != null) {
			arg0.method418();
		}

		arg0.field1025 = field1026;
		arg0.field1024 = field1026.field1024;
		arg0.field1025.field1024 = arg0;
		arg0.field1024.field1025 = arg0;
	}

	@ObfuscatedName("QGWIBVPG.a()LQEPVMESX;")
	public QEPVMESX method421() {
		QEPVMESX var1 = field1026.field1024;
		if (field1026 == var1) {
			return null;
		} else {
			var1.method418();
			return var1;
		}
	}

	@ObfuscatedName("QGWIBVPG.b()LQEPVMESX;")
	public QEPVMESX method422() {
		QEPVMESX var1 = field1026.field1024;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field1024;
			return var1;
		}
	}

	@ObfuscatedName("QGWIBVPG.a(Z)LQEPVMESX;")
	public QEPVMESX method423() {
		QEPVMESX var1 = field1026.field1025;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field1025;
			return var1;
		}
	}

	@ObfuscatedName("QGWIBVPG.b(Z)LQEPVMESX;")
	public QEPVMESX method424() {
		QEPVMESX var1 = field1027;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field1024;
			return var1;
		}
	}

	@ObfuscatedName("QGWIBVPG.c(Z)LQEPVMESX;")
	public QEPVMESX method425() {
		QEPVMESX var1 = field1027;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field1025;
			return var1;
		}
	}

	@ObfuscatedName("QGWIBVPG.c()V")
	public void method426() {
		if (field1026.field1024 != field1026) {
			while (true) {
				QEPVMESX var1 = field1026.field1024;
				if (field1026 == var1) {
					return;
				}

				var1.method418();
			}
		}
	}
}
