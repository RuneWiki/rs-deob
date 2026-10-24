package deob;

@ObfuscatedName("RVLWVPJQ")
public final class RVLWVPJQ {

	@ObfuscatedName("RVLWVPJQ.d")
	public int field1153;

	@ObfuscatedName("RVLWVPJQ.i")
	public boolean field1158;

	@ObfuscatedName("RVLWVPJQ.c")
	public byte[] field1152;

	@ObfuscatedName("RVLWVPJQ.e")
	public int[] field1154;

	@ObfuscatedName("RVLWVPJQ.f")
	public int[] field1155;

	@ObfuscatedName("RVLWVPJQ.g")
	public int[] field1156;

	@ObfuscatedName("RVLWVPJQ.h")
	public int[] field1157;

	public RVLWVPJQ(byte[] arg0) {
		method423(arg0);
	}

	@ObfuscatedName("RVLWVPJQ.a([BI)V")
	public void method423(byte[] arg0) {
		UAWAYCTK var2 = new UAWAYCTK(arg0);
		int var3 = var2.method459();
		int var4 = var2.method459();
		if (var3 == var4) {
			field1152 = arg0;
			field1158 = false;
		} else {
			byte[] var5 = new byte[var3];
			QWRINOGZ.method405(var5, var3, arg0, var4, 6);
			field1152 = var5;
			var2 = new UAWAYCTK(field1152);
			field1158 = true;
		}

		field1153 = var2.method457();
		field1154 = new int[field1153];
		field1155 = new int[field1153];
		field1156 = new int[field1153];
		field1157 = new int[field1153];
		int var6 = field1153 * 10 + var2.field1252;
		for (int var7 = 0; var7 < field1153; var7++) {
			field1154[var7] = var2.method460();
			field1155[var7] = var2.method459();
			field1156[var7] = var2.method459();
			field1157[var7] = var6;
			var6 += field1156[var7];
		}
	}

	@ObfuscatedName("RVLWVPJQ.a(Ljava/lang/String;[B)[B")
	public byte[] method424(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1153; var5++) {
			if (field1154[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1155[var5]];
				}

				if (field1158) {
					for (int var6 = 0; var6 < field1155[var5]; var6++) {
						arg1[var6] = field1152[field1157[var5] + var6];
					}
				} else {
					QWRINOGZ.method405(arg1, field1155[var5], field1152, field1156[var5], field1157[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
