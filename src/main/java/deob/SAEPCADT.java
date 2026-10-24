package deob;

@ObfuscatedName("SAEPCADT")
public final class SAEPCADT {

	@ObfuscatedName("SAEPCADT.d")
	public int field983;

	@ObfuscatedName("SAEPCADT.e")
	public WYQNTERC[] field984;

	public SAEPCADT(int arg0) {
		field983 = arg0;
		field984 = new WYQNTERC[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			WYQNTERC var3 = field984[var2] = new WYQNTERC();
			var3.field1363 = var3;
			var3.field1364 = var3;
		}
	}

	@ObfuscatedName("SAEPCADT.a(J)LWYQNTERC;")
	public WYQNTERC method431(long arg0) {
		WYQNTERC var3 = field984[(int) (arg0 & field983 - 1)];
		for (WYQNTERC var4 = var3.field1363; var4 != var3; var4 = var4.field1363) {
			if (var4.field1362 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("SAEPCADT.a(IJLWYQNTERC;)V")
	public void method432(long arg0, WYQNTERC arg1) {
		if (arg1.field1364 != null) {
			arg1.method540();
		}

		WYQNTERC var4 = field984[(int) (arg0 & field983 - 1)];
		arg1.field1364 = var4.field1364;
		arg1.field1363 = var4;
		arg1.field1364.field1363 = arg1;
		arg1.field1363.field1364 = arg1;
		arg1.field1362 = arg0;
	}
}
