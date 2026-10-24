package deob;

@ObfuscatedName("QKFGLETG")
public final class QKFGLETG {

	@ObfuscatedName("QKFGLETG.e")
	public int field1060;

	@ObfuscatedName("QKFGLETG.j")
	public boolean field1065;

	@ObfuscatedName("QKFGLETG.d")
	public byte[] field1059;

	@ObfuscatedName("QKFGLETG.f")
	public int[] field1061;

	@ObfuscatedName("QKFGLETG.g")
	public int[] field1062;

	@ObfuscatedName("QKFGLETG.h")
	public int[] field1063;

	@ObfuscatedName("QKFGLETG.i")
	public int[] field1064;

	public QKFGLETG(byte[] arg0) {
		method401(arg0);
	}

	@ObfuscatedName("QKFGLETG.a([BZ)V")
	public void method401(byte[] arg0) {
		XJCNBMKS var2 = new XJCNBMKS(arg0);
		int var3 = var2.method538();
		int var4 = var2.method538();
		if (var3 == var4) {
			field1059 = arg0;
			field1065 = false;
		} else {
			byte[] var5 = new byte[var3];
			RXJDATED.method416(var5, var3, arg0, var4, 6);
			field1059 = var5;
			var2 = new XJCNBMKS(field1059);
			field1065 = true;
		}

		field1060 = var2.method536();
		field1061 = new int[field1060];
		field1062 = new int[field1060];
		field1063 = new int[field1060];
		field1064 = new int[field1060];
		int var6 = field1060 * 10 + var2.field1403;
		for (int var7 = 0; var7 < field1060; var7++) {
			field1061[var7] = var2.method539();
			field1062[var7] = var2.method538();
			field1063[var7] = var2.method538();
			field1064[var7] = var6;
			var6 += field1063[var7];
		}
	}

	@ObfuscatedName("QKFGLETG.a(Ljava/lang/String;[B)[B")
	public byte[] method402(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1060; var5++) {
			if (field1061[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1062[var5]];
				}

				if (field1065) {
					for (int var6 = 0; var6 < field1062[var5]; var6++) {
						arg1[var6] = field1059[field1064[var5] + var6];
					}
				} else {
					RXJDATED.method416(arg1, field1062[var5], field1059, field1063[var5], field1064[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
