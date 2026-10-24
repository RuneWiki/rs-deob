package deob;

@ObfuscatedName("OOTLZHQB")
public final class OOTLZHQB {

	@ObfuscatedName("OOTLZHQB.f")
	public AGCGSOQI field914 = new AGCGSOQI();

	@ObfuscatedName("OOTLZHQB.j")
	public BOZWYCIO field918 = new BOZWYCIO();

	@ObfuscatedName("OOTLZHQB.g")
	public int field915;

	@ObfuscatedName("OOTLZHQB.h")
	public int field916;

	@ObfuscatedName("OOTLZHQB.i")
	public BVBAURNI field917;

	@ObfuscatedName("OOTLZHQB.d")
	public int field912;

	@ObfuscatedName("OOTLZHQB.e")
	public int field913;

	public OOTLZHQB(int arg0) {
		field915 = arg0;
		field916 = arg0;
		field917 = new BVBAURNI(1024);
	}

	@ObfuscatedName("OOTLZHQB.a(J)LAGCGSOQI;")
	public AGCGSOQI method386(long arg0) {
		AGCGSOQI var3 = (AGCGSOQI) field917.method60(arg0);
		if (var3 == null) {
			field912++;
		} else {
			field918.method42(var3);
			field913++;
		}

		return var3;
	}

	@ObfuscatedName("OOTLZHQB.a(JLAGCGSOQI;B)V")
	public void method387(long arg0, AGCGSOQI arg1) {
		if (field916 == 0) {
			AGCGSOQI var4 = field918.method43();
			var4.method290();
			var4.method1();

			if (field914 == var4) {
				AGCGSOQI var5 = field918.method43();
				var5.method290();
				var5.method1();
			}
		} else {
			field916--;
		}

		field917.method61(arg1, arg0);
		field918.method42(arg1);
	}

	@ObfuscatedName("OOTLZHQB.a()V")
	public void method388() {
		while (true) {
			AGCGSOQI var1 = field918.method43();
			if (var1 == null) {
				field916 = field915;
				return;
			}

			var1.method290();
			var1.method1();
		}
	}
}
