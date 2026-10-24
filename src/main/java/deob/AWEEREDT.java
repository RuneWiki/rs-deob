package deob;

@ObfuscatedName("AWEEREDT")
public final class AWEEREDT {

	@ObfuscatedName("AWEEREDT.d")
	public int field7;

	@ObfuscatedName("AWEEREDT.i")
	public boolean field12;

	@ObfuscatedName("AWEEREDT.c")
	public byte[] field6;

	@ObfuscatedName("AWEEREDT.g")
	public int[] field10;

	@ObfuscatedName("AWEEREDT.h")
	public int[] field11;

	@ObfuscatedName("AWEEREDT.e")
	public int[] field8;

	@ObfuscatedName("AWEEREDT.f")
	public int[] field9;

	public AWEEREDT(byte[] arg0) {
		method13(arg0);
	}

	@ObfuscatedName("AWEEREDT.a(B[B)V")
	public void method13(byte[] arg0) {
		IUVBENCV var2 = new IUVBENCV(arg0);
		int var3 = var2.method249();
		int var4 = var2.method249();
		if (var3 == var4) {
			field6 = arg0;
			field12 = false;
		} else {
			byte[] var5 = new byte[var3];
			OGTHSEHL.method370(var5, var3, arg0, var4, 6);
			field6 = var5;
			var2 = new IUVBENCV(field6);
			field12 = true;
		}

		field7 = var2.method247();
		field8 = new int[field7];
		field9 = new int[field7];
		field10 = new int[field7];
		field11 = new int[field7];
		int var6 = field7 * 10 + var2.field733;
		for (int var7 = 0; var7 < field7; var7++) {
			field8[var7] = var2.method250();
			field9[var7] = var2.method249();
			field10[var7] = var2.method249();
			field11[var7] = var6;
			var6 += field10[var7];
		}
	}

	@ObfuscatedName("AWEEREDT.a(Ljava/lang/String;[B)[B")
	public byte[] method14(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field7; var5++) {
			if (field8[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field9[var5]];
				}

				if (field12) {
					for (int var6 = 0; var6 < field9[var5]; var6++) {
						arg1[var6] = field6[field11[var5] + var6];
					}
				} else {
					OGTHSEHL.method370(arg1, field9[var5], field6, field10[var5], field11[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
