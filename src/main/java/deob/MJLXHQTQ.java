package deob;

@ObfuscatedName("MJLXHQTQ")
public final class MJLXHQTQ {

	@ObfuscatedName("MJLXHQTQ.e")
	public int field1037;

	@ObfuscatedName("MJLXHQTQ.j")
	public boolean field1042;

	@ObfuscatedName("MJLXHQTQ.d")
	public byte[] field1036;

	@ObfuscatedName("MJLXHQTQ.f")
	public int[] field1038;

	@ObfuscatedName("MJLXHQTQ.g")
	public int[] field1039;

	@ObfuscatedName("MJLXHQTQ.h")
	public int[] field1040;

	@ObfuscatedName("MJLXHQTQ.i")
	public int[] field1041;

	public MJLXHQTQ(byte[] arg0) {
		method316(arg0);
	}

	@ObfuscatedName("MJLXHQTQ.a(Z[B)V")
	public void method316(byte[] arg0) {
		XGRGMPUQ var2 = new XGRGMPUQ(arg0);
		int var3 = var2.method469();
		int var4 = var2.method469();
		if (var3 == var4) {
			field1036 = arg0;
			field1042 = false;
		} else {
			byte[] var5 = new byte[var3];
			YSXYGZOK.method553(var5, var3, arg0, var4, 6);
			field1036 = var5;
			var2 = new XGRGMPUQ(field1036);
			field1042 = true;
		}

		field1037 = var2.method467();
		field1038 = new int[field1037];
		field1039 = new int[field1037];
		field1040 = new int[field1037];
		field1041 = new int[field1037];
		int var6 = field1037 * 10 + var2.field1432;
		for (int var7 = 0; var7 < field1037; var7++) {
			field1038[var7] = var2.method470();
			field1039[var7] = var2.method469();
			field1040[var7] = var2.method469();
			field1041[var7] = var6;
			var6 += field1040[var7];
		}
	}

	@ObfuscatedName("MJLXHQTQ.a(Ljava/lang/String;[B)[B")
	public byte[] method317(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1037; var5++) {
			if (field1038[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1039[var5]];
				}

				if (field1042) {
					for (int var6 = 0; var6 < field1039[var5]; var6++) {
						arg1[var6] = field1036[field1041[var5] + var6];
					}
				} else {
					YSXYGZOK.method553(arg1, field1039[var5], field1036, field1040[var5], field1041[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
