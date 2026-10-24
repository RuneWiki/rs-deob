package deob;

@ObfuscatedName("ODYOEFFK")
public final class ODYOEFFK {

	@ObfuscatedName("ODYOEFFK.c")
	public EWMBJETC field1026 = new EWMBJETC();

	@ObfuscatedName("ODYOEFFK.d")
	public EWMBJETC field1027;

	public ODYOEFFK() {
		field1026.field625 = field1026;
		field1026.field626 = field1026;
	}

	@ObfuscatedName("ODYOEFFK.a(LEWMBJETC;)V")
	public void method393(EWMBJETC arg0) {
		if (arg0.field626 != null) {
			arg0.method209();
		}

		arg0.field626 = field1026.field626;
		arg0.field625 = field1026;
		arg0.field626.field625 = arg0;
		arg0.field625.field626 = arg0;
	}

	@ObfuscatedName("ODYOEFFK.a()LEWMBJETC;")
	public EWMBJETC method394() {
		EWMBJETC var1 = field1026.field625;
		if (field1026 == var1) {
			return null;
		} else {
			var1.method209();
			return var1;
		}
	}

	@ObfuscatedName("ODYOEFFK.b()LEWMBJETC;")
	public EWMBJETC method395() {
		EWMBJETC var1 = field1026.field625;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field625;
			return var1;
		}
	}

	@ObfuscatedName("ODYOEFFK.a(Z)LEWMBJETC;")
	public EWMBJETC method396() {
		EWMBJETC var1 = field1027;
		if (field1026 == var1) {
			field1027 = null;
			return null;
		} else {
			field1027 = var1.field625;
			return var1;
		}
	}

	@ObfuscatedName("ODYOEFFK.c()I")
	public int method397() {
		int var1 = 0;
		for (EWMBJETC var2 = field1026.field625; var2 != field1026; var2 = var2.field625) {
			var1++;
		}

		return var1;
	}
}
