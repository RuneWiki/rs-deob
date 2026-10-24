package deob;

@ObfuscatedName("XRWUKRPO")
public final class XRWUKRPO {

	@ObfuscatedName("XRWUKRPO.d")
	public int field1412;

	@ObfuscatedName("XRWUKRPO.i")
	public boolean field1417;

	@ObfuscatedName("XRWUKRPO.c")
	public byte[] field1411;

	@ObfuscatedName("XRWUKRPO.e")
	public int[] field1413;

	@ObfuscatedName("XRWUKRPO.f")
	public int[] field1414;

	@ObfuscatedName("XRWUKRPO.g")
	public int[] field1415;

	@ObfuscatedName("XRWUKRPO.h")
	public int[] field1416;

	public XRWUKRPO(byte[] arg0) {
		method580(arg0);
	}

	@ObfuscatedName("XRWUKRPO.a(B[B)V")
	public void method580(byte[] arg0) {
		GLMIQHJI var2 = new GLMIQHJI(arg0);
		int var3 = var2.method248();
		int var4 = var2.method248();
		if (var3 == var4) {
			field1411 = arg0;
			field1417 = false;
		} else {
			byte[] var5 = new byte[var3];
			ORIOOKBU.method396(var5, var3, arg0, var4, 6);
			field1411 = var5;
			var2 = new GLMIQHJI(field1411);
			field1417 = true;
		}

		field1412 = var2.method246();
		field1413 = new int[field1412];
		field1414 = new int[field1412];
		field1415 = new int[field1412];
		field1416 = new int[field1412];
		int var6 = field1412 * 10 + var2.field709;
		for (int var7 = 0; var7 < field1412; var7++) {
			field1413[var7] = var2.method249();
			field1414[var7] = var2.method248();
			field1415[var7] = var2.method248();
			field1416[var7] = var6;
			var6 += field1415[var7];
		}
	}

	@ObfuscatedName("XRWUKRPO.a(Ljava/lang/String;[B)[B")
	public byte[] method581(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1412; var5++) {
			if (field1413[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1414[var5]];
				}

				if (field1417) {
					for (int var6 = 0; var6 < field1414[var5]; var6++) {
						arg1[var6] = field1411[field1416[var5] + var6];
					}
				} else {
					ORIOOKBU.method396(arg1, field1414[var5], field1411, field1415[var5], field1416[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
