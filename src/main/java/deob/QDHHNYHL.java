package deob;

@ObfuscatedName("QDHHNYHL")
public final class QDHHNYHL {

	@ObfuscatedName("QDHHNYHL.g")
	public int field1167;

	@ObfuscatedName("QDHHNYHL.l")
	public boolean field1172;

	@ObfuscatedName("QDHHNYHL.f")
	public byte[] field1166;

	@ObfuscatedName("QDHHNYHL.h")
	public int[] field1168;

	@ObfuscatedName("QDHHNYHL.i")
	public int[] field1169;

	@ObfuscatedName("QDHHNYHL.j")
	public int[] field1170;

	@ObfuscatedName("QDHHNYHL.k")
	public int[] field1171;

	public QDHHNYHL(byte[] arg0) {
		method487(arg0);
	}

	@ObfuscatedName("QDHHNYHL.a([BI)V")
	public void method487(byte[] arg0) {
		PGNBHFUF var2 = new PGNBHFUF(arg0);
		int var3 = var2.method424();
		int var4 = var2.method424();
		if (var3 == var4) {
			field1166 = arg0;
			field1172 = false;
		} else {
			byte[] var5 = new byte[var3];
			MZZCGDPC.method380(var5, var3, arg0, var4, 6);
			field1166 = var5;
			var2 = new PGNBHFUF(field1166);
			field1172 = true;
		}

		field1167 = var2.method422();
		field1168 = new int[field1167];
		field1169 = new int[field1167];
		field1170 = new int[field1167];
		field1171 = new int[field1167];
		int var6 = field1167 * 10 + var2.field1082;
		for (int var7 = 0; var7 < field1167; var7++) {
			field1168[var7] = var2.method425();
			field1169[var7] = var2.method424();
			field1170[var7] = var2.method424();
			field1171[var7] = var6;
			var6 += field1170[var7];
		}
	}

	@ObfuscatedName("QDHHNYHL.a(Ljava/lang/String;[B)[B")
	public byte[] method488(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1167; var5++) {
			if (field1168[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1169[var5]];
				}

				if (field1172) {
					for (int var6 = 0; var6 < field1169[var5]; var6++) {
						arg1[var6] = field1166[field1171[var5] + var6];
					}
				} else {
					MZZCGDPC.method380(arg1, field1169[var5], field1166, field1170[var5], field1171[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
