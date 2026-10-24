package deob;

@ObfuscatedName("HIGYXWXY")
public final class HIGYXWXY {

	@ObfuscatedName("HIGYXWXY.a")
	public OBKNBIRU field775 = new OBKNBIRU();

	@ObfuscatedName("HIGYXWXY.b")
	public OBKNBIRU field776;

	public HIGYXWXY() {
		field775.field964 = field775;
		field775.field965 = field775;
	}

	@ObfuscatedName("HIGYXWXY.a(LOBKNBIRU;)V")
	public void method244(OBKNBIRU arg0) {
		if (arg0.field965 != null) {
			arg0.method312();
		}

		arg0.field965 = field775.field965;
		arg0.field964 = field775;
		arg0.field965.field964 = arg0;
		arg0.field964.field965 = arg0;
	}

	@ObfuscatedName("HIGYXWXY.a()LOBKNBIRU;")
	public OBKNBIRU method245() {
		OBKNBIRU var1 = field775.field964;
		if (field775 == var1) {
			return null;
		} else {
			var1.method312();
			return var1;
		}
	}

	@ObfuscatedName("HIGYXWXY.b()LOBKNBIRU;")
	public OBKNBIRU method246() {
		OBKNBIRU var1 = field775.field964;
		if (field775 == var1) {
			field776 = null;
			return null;
		} else {
			field776 = var1.field964;
			return var1;
		}
	}

	@ObfuscatedName("HIGYXWXY.a(Z)LOBKNBIRU;")
	public OBKNBIRU method247() {
		OBKNBIRU var1 = field776;
		if (field775 == var1) {
			field776 = null;
			return null;
		} else {
			field776 = var1.field964;
			return var1;
		}
	}

	@ObfuscatedName("HIGYXWXY.c()I")
	public int method248() {
		int var1 = 0;
		for (OBKNBIRU var2 = field775.field964; var2 != field775; var2 = var2.field964) {
			var1++;
		}

		return var1;
	}
}
