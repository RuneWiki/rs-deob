package deob;

@ObfuscatedName("EOJHVRZF")
public final class EOJHVRZF {

	@ObfuscatedName("EOJHVRZF.f")
	public EWMBJETC field620 = new EWMBJETC();

	@ObfuscatedName("EOJHVRZF.j")
	public ODYOEFFK field624 = new ODYOEFFK();

	@ObfuscatedName("EOJHVRZF.g")
	public int field621;

	@ObfuscatedName("EOJHVRZF.h")
	public int field622;

	@ObfuscatedName("EOJHVRZF.i")
	public OAXQGLDV field623;

	@ObfuscatedName("EOJHVRZF.d")
	public int field618;

	@ObfuscatedName("EOJHVRZF.e")
	public int field619;

	public EOJHVRZF(int arg0) {
		field621 = arg0;
		field622 = arg0;
		field623 = new OAXQGLDV(1024);
	}

	@ObfuscatedName("EOJHVRZF.a(J)LEWMBJETC;")
	public EWMBJETC method206(long arg0) {
		EWMBJETC var3 = (EWMBJETC) field623.method339(arg0);
		if (var3 == null) {
			field618++;
		} else {
			field624.method393(var3);
			field619++;
		}

		return var3;
	}

	@ObfuscatedName("EOJHVRZF.a(JILEWMBJETC;)V")
	public void method207(long arg0, EWMBJETC arg1) {
		if (field622 == 0) {
			EWMBJETC var4 = field624.method394();
			var4.method398();
			var4.method209();

			if (field620 == var4) {
				EWMBJETC var5 = field624.method394();
				var5.method398();
				var5.method209();
			}
		} else {
			field622--;
		}

		field623.method340(arg0, arg1);
		field624.method393(arg1);
	}

	@ObfuscatedName("EOJHVRZF.a()V")
	public void method208() {
		while (true) {
			EWMBJETC var1 = field624.method394();
			if (var1 == null) {
				field622 = field621;
				return;
			}

			var1.method398();
			var1.method209();
		}
	}
}
