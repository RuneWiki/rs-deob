package deob;

@ObfuscatedName("GWOEELWB")
public final class GWOEELWB {

	@ObfuscatedName("GWOEELWB.d")
	public int field768;

	@ObfuscatedName("GWOEELWB.i")
	public boolean field773;

	@ObfuscatedName("GWOEELWB.c")
	public byte[] field767;

	@ObfuscatedName("GWOEELWB.e")
	public int[] field769;

	@ObfuscatedName("GWOEELWB.f")
	public int[] field770;

	@ObfuscatedName("GWOEELWB.g")
	public int[] field771;

	@ObfuscatedName("GWOEELWB.h")
	public int[] field772;

	public GWOEELWB(byte[] arg0) {
		method248(arg0);
	}

	@ObfuscatedName("GWOEELWB.a([BI)V")
	public void method248(byte[] arg0) {
		MLYYHULT var2 = new MLYYHULT(arg0);
		int var3 = var2.method300();
		int var4 = var2.method300();
		if (var3 == var4) {
			field767 = arg0;
			field773 = false;
		} else {
			byte[] var5 = new byte[var3];
			USGWGPZO.method553(var5, var3, arg0, var4, 6);
			field767 = var5;
			var2 = new MLYYHULT(field767);
			field773 = true;
		}

		field768 = var2.method298();
		field769 = new int[field768];
		field770 = new int[field768];
		field771 = new int[field768];
		field772 = new int[field768];
		int var6 = field768 * 10 + var2.field963;
		for (int var7 = 0; var7 < field768; var7++) {
			field769[var7] = var2.method301();
			field770[var7] = var2.method300();
			field771[var7] = var2.method300();
			field772[var7] = var6;
			var6 += field771[var7];
		}
	}

	@ObfuscatedName("GWOEELWB.a(Ljava/lang/String;[B)[B")
	public byte[] method249(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field768; var5++) {
			if (field769[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field770[var5]];
				}

				if (field773) {
					for (int var6 = 0; var6 < field770[var5]; var6++) {
						arg1[var6] = field767[field772[var5] + var6];
					}
				} else {
					USGWGPZO.method553(arg1, field770[var5], field767, field771[var5], field772[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
