package deob;

@ObfuscatedName("DYBMLHQM")
public final class DYBMLHQM {

	@ObfuscatedName("DYBMLHQM.e")
	public int field690;

	@ObfuscatedName("DYBMLHQM.j")
	public boolean field695;

	@ObfuscatedName("DYBMLHQM.d")
	public byte[] field689;

	@ObfuscatedName("DYBMLHQM.f")
	public int[] field691;

	@ObfuscatedName("DYBMLHQM.g")
	public int[] field692;

	@ObfuscatedName("DYBMLHQM.h")
	public int[] field693;

	@ObfuscatedName("DYBMLHQM.i")
	public int[] field694;

	public DYBMLHQM(byte[] arg0) {
		method247(arg0);
	}

	@ObfuscatedName("DYBMLHQM.a(Z[B)V")
	public void method247(byte[] arg0) {
		INLHDAGO var2 = new INLHDAGO(arg0);
		int var3 = var2.method312();
		int var4 = var2.method312();
		if (var3 == var4) {
			field689 = arg0;
			field695 = false;
		} else {
			byte[] var5 = new byte[var3];
			IPQOZCFR.method343(var5, var3, arg0, var4, 6);
			field689 = var5;
			var2 = new INLHDAGO(field689);
			field695 = true;
		}

		field690 = var2.method310();
		field691 = new int[field690];
		field692 = new int[field690];
		field693 = new int[field690];
		field694 = new int[field690];
		int var6 = field690 * 10 + var2.field969;
		for (int var7 = 0; var7 < field690; var7++) {
			field691[var7] = var2.method313();
			field692[var7] = var2.method312();
			field693[var7] = var2.method312();
			field694[var7] = var6;
			var6 += field693[var7];
		}
	}

	@ObfuscatedName("DYBMLHQM.a(Ljava/lang/String;[B)[B")
	public byte[] method248(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field690; var5++) {
			if (field691[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field692[var5]];
				}

				if (field695) {
					for (int var6 = 0; var6 < field692[var5]; var6++) {
						arg1[var6] = field689[field694[var5] + var6];
					}
				} else {
					IPQOZCFR.method343(arg1, field692[var5], field689, field693[var5], field694[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
