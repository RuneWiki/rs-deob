package deob;

@ObfuscatedName("CXFTMSCH")
public final class CXFTMSCH {

	@ObfuscatedName("CXFTMSCH.d")
	public int field546;

	@ObfuscatedName("CXFTMSCH.i")
	public boolean field551;

	@ObfuscatedName("CXFTMSCH.c")
	public byte[] field545;

	@ObfuscatedName("CXFTMSCH.e")
	public int[] field547;

	@ObfuscatedName("CXFTMSCH.f")
	public int[] field548;

	@ObfuscatedName("CXFTMSCH.g")
	public int[] field549;

	@ObfuscatedName("CXFTMSCH.h")
	public int[] field550;

	public CXFTMSCH(byte[] arg0) {
		method175(arg0);
	}

	@ObfuscatedName("CXFTMSCH.a(B[B)V")
	public void method175(byte[] arg0) {
		MQZHAILV var2 = new MQZHAILV(arg0);
		int var3 = var2.method329();
		int var4 = var2.method329();
		if (var3 == var4) {
			field545 = arg0;
			field551 = false;
		} else {
			byte[] var5 = new byte[var3];
			FSDRDBOS.method233(var5, var3, arg0, var4, 6);
			field545 = var5;
			var2 = new MQZHAILV(field545);
			field551 = true;
		}

		field546 = var2.method327();
		field547 = new int[field546];
		field548 = new int[field546];
		field549 = new int[field546];
		field550 = new int[field546];
		int var6 = field546 * 10 + var2.field797;
		for (int var7 = 0; var7 < field546; var7++) {
			field547[var7] = var2.method330();
			field548[var7] = var2.method329();
			field549[var7] = var2.method329();
			field550[var7] = var6;
			var6 += field549[var7];
		}
	}

	@ObfuscatedName("CXFTMSCH.a(Ljava/lang/String;[B)[B")
	public byte[] method176(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field546; var5++) {
			if (field547[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field548[var5]];
				}

				if (field551) {
					for (int var6 = 0; var6 < field548[var5]; var6++) {
						arg1[var6] = field545[field550[var5] + var6];
					}
				} else {
					FSDRDBOS.method233(arg1, field548[var5], field545, field549[var5], field550[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
