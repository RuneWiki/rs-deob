package deob;

@ObfuscatedName("AKPFVPPG")
public final class AKPFVPPG {

	@ObfuscatedName("AKPFVPPG.d")
	public int field4;

	@ObfuscatedName("AKPFVPPG.i")
	public boolean field9;

	@ObfuscatedName("AKPFVPPG.c")
	public byte[] field3;

	@ObfuscatedName("AKPFVPPG.e")
	public int[] field5;

	@ObfuscatedName("AKPFVPPG.f")
	public int[] field6;

	@ObfuscatedName("AKPFVPPG.g")
	public int[] field7;

	@ObfuscatedName("AKPFVPPG.h")
	public int[] field8;

	public AKPFVPPG(byte[] arg0) {
		method6(arg0);
	}

	@ObfuscatedName("AKPFVPPG.a([BZ)V")
	public void method6(byte[] arg0) {
		FTMSICIZ var2 = new FTMSICIZ(arg0);
		int var3 = var2.method217();
		int var4 = var2.method217();
		if (var3 == var4) {
			field3 = arg0;
			field9 = false;
		} else {
			byte[] var5 = new byte[var3];
			TQCNPEMH.method472(var5, var3, arg0, var4, 6);
			field3 = var5;
			var2 = new FTMSICIZ(field3);
			field9 = true;
		}

		field4 = var2.method215();
		field5 = new int[field4];
		field6 = new int[field4];
		field7 = new int[field4];
		field8 = new int[field4];
		int var6 = field4 * 10 + var2.field535;
		for (int var7 = 0; var7 < field4; var7++) {
			field5[var7] = var2.method218();
			field6[var7] = var2.method217();
			field7[var7] = var2.method217();
			field8[var7] = var6;
			var6 += field7[var7];
		}
	}

	@ObfuscatedName("AKPFVPPG.a(Ljava/lang/String;[B)[B")
	public byte[] method7(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field4; var5++) {
			if (field5[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field6[var5]];
				}

				if (field9) {
					for (int var6 = 0; var6 < field6[var5]; var6++) {
						arg1[var6] = field3[field8[var5] + var6];
					}
				} else {
					TQCNPEMH.method472(arg1, field6[var5], field3, field7[var5], field8[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
