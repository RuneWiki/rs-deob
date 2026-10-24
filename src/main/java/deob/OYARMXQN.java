package deob;

@ObfuscatedName("OYARMXQN")
public final class OYARMXQN {

	@ObfuscatedName("OYARMXQN.b")
	public int field1070;

	@ObfuscatedName("OYARMXQN.c")
	public OYTUMBCI[] field1071;

	public OYARMXQN(int arg0) {
		field1070 = arg0;
		field1071 = new OYTUMBCI[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OYTUMBCI var3 = field1071[var2] = new OYTUMBCI();
			var3.field1073 = var3;
			var3.field1074 = var3;
		}
	}

	@ObfuscatedName("OYARMXQN.a(J)LOYTUMBCI;")
	public OYTUMBCI method365(long arg0) {
		OYTUMBCI var3 = field1071[(int) (arg0 & field1070 - 1)];
		for (OYTUMBCI var4 = var3.field1073; var4 != var3; var4 = var4.field1073) {
			if (var4.field1072 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("OYARMXQN.a(LOYTUMBCI;JI)V")
	public void method366(OYTUMBCI arg0, long arg1) {
		if (arg0.field1074 != null) {
			arg0.method367();
		}

		OYTUMBCI var4 = field1071[(int) (arg1 & field1070 - 1)];
		arg0.field1074 = var4.field1074;
		arg0.field1073 = var4;
		arg0.field1074.field1073 = arg0;
		arg0.field1073.field1074 = arg0;
		arg0.field1072 = arg1;
	}
}
