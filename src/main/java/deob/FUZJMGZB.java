package deob;

@ObfuscatedName("FUZJMGZB")
public final class FUZJMGZB {

	@ObfuscatedName("FUZJMGZB.e")
	public int field804;

	@ObfuscatedName("FUZJMGZB.j")
	public boolean field809;

	@ObfuscatedName("FUZJMGZB.d")
	public byte[] field803;

	@ObfuscatedName("FUZJMGZB.f")
	public int[] field805;

	@ObfuscatedName("FUZJMGZB.g")
	public int[] field806;

	@ObfuscatedName("FUZJMGZB.h")
	public int[] field807;

	@ObfuscatedName("FUZJMGZB.i")
	public int[] field808;

	public FUZJMGZB(byte[] arg0) {
		method276(arg0);
	}

	@ObfuscatedName("FUZJMGZB.a([BB)V")
	public void method276(byte[] arg0) {
		LBBVYYXO var2 = new LBBVYYXO(arg0);
		int var3 = var2.method373();
		int var4 = var2.method373();
		if (var3 == var4) {
			field803 = arg0;
			field809 = false;
		} else {
			byte[] var5 = new byte[var3];
			KBKOJYZV.method339(var5, var3, arg0, var4, 6);
			field803 = var5;
			var2 = new LBBVYYXO(field803);
			field809 = true;
		}

		field804 = var2.method371();
		field805 = new int[field804];
		field806 = new int[field804];
		field807 = new int[field804];
		field808 = new int[field804];
		int var6 = field804 * 10 + var2.field882;
		for (int var7 = 0; var7 < field804; var7++) {
			field805[var7] = var2.method374();
			field806[var7] = var2.method373();
			field807[var7] = var2.method373();
			field808[var7] = var6;
			var6 += field807[var7];
		}
	}

	@ObfuscatedName("FUZJMGZB.a(Ljava/lang/String;[B)[B")
	public byte[] method277(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field804; var5++) {
			if (field805[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field806[var5]];
				}

				if (field809) {
					for (int var6 = 0; var6 < field806[var5]; var6++) {
						arg1[var6] = field803[field808[var5] + var6];
					}
				} else {
					KBKOJYZV.method339(arg1, field806[var5], field803, field807[var5], field808[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
