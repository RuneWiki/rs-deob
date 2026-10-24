package deob;

@ObfuscatedName("TXPLZUUI")
public final class TXPLZUUI {

	@ObfuscatedName("TXPLZUUI.b")
	public int field1313;

	@ObfuscatedName("TXPLZUUI.g")
	public boolean field1318;

	@ObfuscatedName("TXPLZUUI.a")
	public byte[] field1312;

	@ObfuscatedName("TXPLZUUI.c")
	public int[] field1314;

	@ObfuscatedName("TXPLZUUI.d")
	public int[] field1315;

	@ObfuscatedName("TXPLZUUI.e")
	public int[] field1316;

	@ObfuscatedName("TXPLZUUI.f")
	public int[] field1317;

	public TXPLZUUI(byte[] arg0) {
		method505(arg0);
	}

	@ObfuscatedName("TXPLZUUI.a([BI)V")
	public void method505(byte[] arg0) {
		PKHWFJLM var2 = new PKHWFJLM(arg0);
		int var3 = var2.method334();
		int var4 = var2.method334();
		if (var3 == var4) {
			field1312 = arg0;
			field1318 = false;
		} else {
			byte[] var5 = new byte[var3];
			LTBTBUSF.method281(var5, var3, arg0, var4, 6);
			field1312 = var5;
			var2 = new PKHWFJLM(field1312);
			field1318 = true;
		}

		field1313 = var2.method332();
		field1314 = new int[field1313];
		field1315 = new int[field1313];
		field1316 = new int[field1313];
		field1317 = new int[field1313];
		int var6 = field1313 * 10 + var2.field971;
		for (int var7 = 0; var7 < field1313; var7++) {
			field1314[var7] = var2.method335();
			field1315[var7] = var2.method334();
			field1316[var7] = var2.method334();
			field1317[var7] = var6;
			var6 += field1316[var7];
		}
	}

	@ObfuscatedName("TXPLZUUI.a(Ljava/lang/String;[B)[B")
	public byte[] method506(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1313; var5++) {
			if (field1314[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1315[var5]];
				}

				if (field1318) {
					for (int var6 = 0; var6 < field1315[var5]; var6++) {
						arg1[var6] = field1312[field1317[var5] + var6];
					}
				} else {
					LTBTBUSF.method281(arg1, field1315[var5], field1312, field1316[var5], field1317[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
