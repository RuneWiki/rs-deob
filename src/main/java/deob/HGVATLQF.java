package deob;

@ObfuscatedName("HGVATLQF")
public final class HGVATLQF extends NUUJCJXB {

	@ObfuscatedName("HGVATLQF.vb")
	public RRZTMHXJ field735;

	@ObfuscatedName("HGVATLQF.a(I)LJLNSJQDR;")
	public final JLNSJQDR method2() {
		if (field735 == null) {
			return null;
		}

		JLNSJQDR var1 = method296();
		if (var1 == null) {
			return null;
		}

		field1110 = var1.field3;

		if (field1099 != -1 && field1100 != -1) {
			MKJLFPRH var2 = MKJLFPRH.field1051[field1099];
			JLNSJQDR var3 = var2.method423();
			if (var3 != null) {
				int var4 = var2.field1055.field1154[field1100];
				JLNSJQDR var5 = new JLNSJQDR(UIZESDZR.method524(var4), false, true, var3);
				var5.method341(-field1103, 0, 0);
				var5.method335();
				var5.method336(var4);
				var5.field854 = null;
				var5.field853 = null;

				if (var2.field1058 != 128 || var2.field1059 != 128) {
					var5.method344(var2.field1058, var2.field1059, var2.field1058);
				}

				var5.method345(var2.field1061 + 64, var2.field1062 + 850, -30, -50, -30, true);
				JLNSJQDR[] var6 = new JLNSJQDR[] { var1, var5 };
				var1 = new JLNSJQDR(true, var6, 2);
			}
		}

		if (field735.field1290 == 1) {
			var1.field855 = true;
		}

		return var1;
	}

	@ObfuscatedName("HGVATLQF.a(B)LJLNSJQDR;")
	public final JLNSJQDR method296() {
		if (field1132 < 0 || field1135 != 0) {
			int var3 = -1;
			if (field1124 >= 0) {
				var3 = OXBPHQKK.field1152[field1124].field1154[field1125];
			}

			return field735.method485(null, var3, -1);
		}

		int var1 = OXBPHQKK.field1152[field1132].field1154[field1133];
		int var2 = -1;
		if (field1124 >= 0 && field1140 != field1124) {
			var2 = OXBPHQKK.field1152[field1124].field1154[field1125];
		}

		return field735.method485(OXBPHQKK.field1152[field1132].field1158, var1, var2);
	}

	@ObfuscatedName("HGVATLQF.a(Z)Z")
	public final boolean method297() {
		if (field735 == null) {
			return false;
		}

		return true;
	}
}
