package deob;

@ObfuscatedName("RZUUVVSJ")
public final class RZUUVVSJ {

	@ObfuscatedName("RZUUVVSJ.c")
	public int field1189;

	@ObfuscatedName("RZUUVVSJ.d")
	public OEHUIBBM[] field1190;

	public RZUUVVSJ(int arg0) {
		field1189 = arg0;
		field1190 = new OEHUIBBM[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OEHUIBBM var3 = field1190[var2] = new OEHUIBBM();
			var3.field917 = var3;
			var3.field918 = var3;
		}
	}

	@ObfuscatedName("RZUUVVSJ.a(J)LOEHUIBBM;")
	public OEHUIBBM method453(long arg0) {
		OEHUIBBM var3 = field1190[(int) (arg0 & field1189 - 1)];
		for (OEHUIBBM var4 = var3.field917; var4 != var3; var4 = var4.field917) {
			if (var4.field916 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("RZUUVVSJ.a(LOEHUIBBM;JZ)V")
	public void method454(OEHUIBBM arg0, long arg1) {
		if (arg0.field918 != null) {
			arg0.method397();
		}

		OEHUIBBM var4 = field1190[(int) (arg1 & field1189 - 1)];
		arg0.field918 = var4.field918;
		arg0.field917 = var4;
		arg0.field918.field917 = arg0;
		arg0.field917.field918 = arg0;
		arg0.field916 = arg1;
	}
}
