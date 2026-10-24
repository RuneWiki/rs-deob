package deob;

@ObfuscatedName("MNPBQFWE")
public final class MNPBQFWE {

	@ObfuscatedName("MNPBQFWE.d")
	public int field1070;

	@ObfuscatedName("MNPBQFWE.i")
	public boolean field1075;

	@ObfuscatedName("MNPBQFWE.c")
	public byte[] field1069;

	@ObfuscatedName("MNPBQFWE.e")
	public int[] field1071;

	@ObfuscatedName("MNPBQFWE.f")
	public int[] field1072;

	@ObfuscatedName("MNPBQFWE.g")
	public int[] field1073;

	@ObfuscatedName("MNPBQFWE.h")
	public int[] field1074;

	public MNPBQFWE(byte[] arg0) {
		method428(arg0);
	}

	@ObfuscatedName("MNPBQFWE.a([BZ)V")
	public void method428(byte[] arg0) {
		BJPWOXRJ var2 = new BJPWOXRJ(arg0);
		int var3 = var2.method19();
		int var4 = var2.method19();
		if (var3 == var4) {
			field1069 = arg0;
			field1075 = false;
		} else {
			byte[] var5 = new byte[var3];
			UKVGEEAO.method525(var5, var3, arg0, var4, 6);
			field1069 = var5;
			var2 = new BJPWOXRJ(field1069);
			field1075 = true;
		}

		field1070 = var2.method17();
		field1071 = new int[field1070];
		field1072 = new int[field1070];
		field1073 = new int[field1070];
		field1074 = new int[field1070];
		int var6 = field1070 * 10 + var2.field5;
		for (int var7 = 0; var7 < field1070; var7++) {
			field1071[var7] = var2.method20();
			field1072[var7] = var2.method19();
			field1073[var7] = var2.method19();
			field1074[var7] = var6;
			var6 += field1073[var7];
		}
	}

	@ObfuscatedName("MNPBQFWE.a(Ljava/lang/String;[B)[B")
	public byte[] method429(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1070; var5++) {
			if (field1071[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1072[var5]];
				}

				if (field1075) {
					for (int var6 = 0; var6 < field1072[var5]; var6++) {
						arg1[var6] = field1069[field1074[var5] + var6];
					}
				} else {
					UKVGEEAO.method525(arg1, field1072[var5], field1069, field1073[var5], field1074[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
