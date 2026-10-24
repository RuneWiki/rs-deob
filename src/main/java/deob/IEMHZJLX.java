package deob;

@ObfuscatedName("IEMHZJLX")
public final class IEMHZJLX {

	@ObfuscatedName("IEMHZJLX.b")
	public int field700;

	@ObfuscatedName("IEMHZJLX.g")
	public boolean field705;

	@ObfuscatedName("IEMHZJLX.a")
	public byte[] field699;

	@ObfuscatedName("IEMHZJLX.c")
	public int[] field701;

	@ObfuscatedName("IEMHZJLX.d")
	public int[] field702;

	@ObfuscatedName("IEMHZJLX.e")
	public int[] field703;

	@ObfuscatedName("IEMHZJLX.f")
	public int[] field704;

	public IEMHZJLX(byte[] arg0) {
		method241(arg0);
	}

	@ObfuscatedName("IEMHZJLX.a(Z[B)V")
	public void method241(byte[] arg0) {
		MVHXDWGI var2 = new MVHXDWGI(arg0);
		int var3 = var2.method361();
		int var4 = var2.method361();
		if (var3 == var4) {
			field699 = arg0;
			field705 = false;
		} else {
			byte[] var5 = new byte[var3];
			YLBCUPOY.method590(var5, var3, arg0, var4, 6);
			field699 = var5;
			var2 = new MVHXDWGI(field699);
			field705 = true;
		}

		field700 = var2.method359();
		field701 = new int[field700];
		field702 = new int[field700];
		field703 = new int[field700];
		field704 = new int[field700];
		int var6 = field700 * 10 + var2.field1014;
		for (int var7 = 0; var7 < field700; var7++) {
			field701[var7] = var2.method362();
			field702[var7] = var2.method361();
			field703[var7] = var2.method361();
			field704[var7] = var6;
			var6 += field703[var7];
		}
	}

	@ObfuscatedName("IEMHZJLX.a(Ljava/lang/String;[B)[B")
	public byte[] method242(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field700; var5++) {
			if (field701[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field702[var5]];
				}

				if (field705) {
					for (int var6 = 0; var6 < field702[var5]; var6++) {
						arg1[var6] = field699[field704[var5] + var6];
					}
				} else {
					YLBCUPOY.method590(arg1, field702[var5], field699, field703[var5], field704[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
