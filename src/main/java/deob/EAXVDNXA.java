package deob;

@ObfuscatedName("EAXVDNXA")
public final class EAXVDNXA {

	@ObfuscatedName("EAXVDNXA.b")
	public int field612;

	@ObfuscatedName("EAXVDNXA.g")
	public boolean field617;

	@ObfuscatedName("EAXVDNXA.a")
	public byte[] field611;

	@ObfuscatedName("EAXVDNXA.c")
	public int[] field613;

	@ObfuscatedName("EAXVDNXA.d")
	public int[] field614;

	@ObfuscatedName("EAXVDNXA.e")
	public int[] field615;

	@ObfuscatedName("EAXVDNXA.f")
	public int[] field616;

	public EAXVDNXA(byte[] arg0) {
		method254(arg0);
	}

	@ObfuscatedName("EAXVDNXA.a(I[B)V")
	public void method254(byte[] arg0) {
		CKBTFRZM var2 = new CKBTFRZM(arg0);
		int var3 = var2.method48();
		int var4 = var2.method48();
		if (var3 == var4) {
			field611 = arg0;
			field617 = false;
		} else {
			byte[] var5 = new byte[var3];
			JBNVYUNE.method404(var5, var3, arg0, var4, 6);
			field611 = var5;
			var2 = new CKBTFRZM(field611);
			field617 = true;
		}

		field612 = var2.method46();
		field613 = new int[field612];
		field614 = new int[field612];
		field615 = new int[field612];
		field616 = new int[field612];
		int var6 = field612 * 10 + var2.field92;
		for (int var7 = 0; var7 < field612; var7++) {
			field613[var7] = var2.method49();
			field614[var7] = var2.method48();
			field615[var7] = var2.method48();
			field616[var7] = var6;
			var6 += field615[var7];
		}
	}

	@ObfuscatedName("EAXVDNXA.a(Ljava/lang/String;[B)[B")
	public byte[] method255(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field612; var5++) {
			if (field613[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field614[var5]];
				}

				if (field617) {
					for (int var6 = 0; var6 < field614[var5]; var6++) {
						arg1[var6] = field611[field616[var5] + var6];
					}
				} else {
					JBNVYUNE.method404(arg1, field614[var5], field611, field615[var5], field616[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
