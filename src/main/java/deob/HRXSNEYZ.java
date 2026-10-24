package deob;

@ObfuscatedName("HRXSNEYZ")
public final class HRXSNEYZ {

	@ObfuscatedName("HRXSNEYZ.d")
	public int field697;

	@ObfuscatedName("HRXSNEYZ.i")
	public boolean field702;

	@ObfuscatedName("HRXSNEYZ.c")
	public byte[] field696;

	@ObfuscatedName("HRXSNEYZ.e")
	public int[] field698;

	@ObfuscatedName("HRXSNEYZ.f")
	public int[] field699;

	@ObfuscatedName("HRXSNEYZ.g")
	public int[] field700;

	@ObfuscatedName("HRXSNEYZ.h")
	public int[] field701;

	public HRXSNEYZ(byte[] arg0) {
		method288(arg0);
	}

	@ObfuscatedName("HRXSNEYZ.a(I[B)V")
	public void method288(byte[] arg0) {
		JHKSAGUC var2 = new JHKSAGUC(arg0);
		int var3 = var2.method310();
		int var4 = var2.method310();
		if (var3 == var4) {
			field696 = arg0;
			field702 = false;
		} else {
			byte[] var5 = new byte[var3];
			QAZFHAFJ.method404(var5, var3, arg0, var4, 6);
			field696 = var5;
			var2 = new JHKSAGUC(field696);
			field702 = true;
		}

		field697 = var2.method308();
		field698 = new int[field697];
		field699 = new int[field697];
		field700 = new int[field697];
		field701 = new int[field697];
		int var6 = field697 * 10 + var2.field752;
		for (int var7 = 0; var7 < field697; var7++) {
			field698[var7] = var2.method311();
			field699[var7] = var2.method310();
			field700[var7] = var2.method310();
			field701[var7] = var6;
			var6 += field700[var7];
		}
	}

	@ObfuscatedName("HRXSNEYZ.a(Ljava/lang/String;[B)[B")
	public byte[] method289(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field697; var5++) {
			if (field698[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field699[var5]];
				}

				if (field702) {
					for (int var6 = 0; var6 < field699[var5]; var6++) {
						arg1[var6] = field696[field701[var5] + var6];
					}
				} else {
					QAZFHAFJ.method404(arg1, field699[var5], field696, field700[var5], field701[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
