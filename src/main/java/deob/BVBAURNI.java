package deob;

@ObfuscatedName("BVBAURNI")
public final class BVBAURNI {

	@ObfuscatedName("BVBAURNI.a")
	public int field96;

	@ObfuscatedName("BVBAURNI.b")
	public ICYTWAKR[] field97;

	public BVBAURNI(int arg0) {
		field96 = arg0;
		field97 = new ICYTWAKR[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			ICYTWAKR var3 = field97[var2] = new ICYTWAKR();
			var3.field746 = var3;
			var3.field747 = var3;
		}
	}

	@ObfuscatedName("BVBAURNI.a(J)LICYTWAKR;")
	public ICYTWAKR method60(long arg0) {
		ICYTWAKR var3 = field97[(int) (arg0 & field96 - 1)];
		for (ICYTWAKR var4 = var3.field746; var4 != var3; var4 = var4.field746) {
			if (var4.field745 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("BVBAURNI.a(LICYTWAKR;JZ)V")
	public void method61(ICYTWAKR arg0, long arg1) {
		if (arg0.field747 != null) {
			arg0.method290();
		}

		ICYTWAKR var4 = field97[(int) (arg1 & field96 - 1)];
		arg0.field747 = var4.field747;
		arg0.field746 = var4;
		arg0.field747.field746 = arg0;
		arg0.field746.field747 = arg0;
		arg0.field745 = arg1;
	}
}
