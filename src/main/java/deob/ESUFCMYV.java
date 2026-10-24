package deob;

@ObfuscatedName("ESUFCMYV")
public final class ESUFCMYV {

	@ObfuscatedName("ESUFCMYV.c")
	public int field587;

	@ObfuscatedName("ESUFCMYV.h")
	public boolean field592;

	@ObfuscatedName("ESUFCMYV.b")
	public byte[] field586;

	@ObfuscatedName("ESUFCMYV.d")
	public int[] field588;

	@ObfuscatedName("ESUFCMYV.e")
	public int[] field589;

	@ObfuscatedName("ESUFCMYV.f")
	public int[] field590;

	@ObfuscatedName("ESUFCMYV.g")
	public int[] field591;

	public ESUFCMYV(byte[] arg0) {
		method204(arg0);
	}

	@ObfuscatedName("ESUFCMYV.a(I[B)V")
	public void method204(byte[] arg0) {
		RGCGKKUR var2 = new RGCGKKUR(arg0);
		int var3 = var2.method459();
		int var4 = var2.method459();
		if (var3 == var4) {
			field586 = arg0;
			field592 = false;
		} else {
			byte[] var5 = new byte[var3];
			OJYKKXRM.method355(var5, var3, arg0, var4, 6);
			field586 = var5;
			var2 = new RGCGKKUR(field586);
			field592 = true;
		}

		field587 = var2.method457();
		field588 = new int[field587];
		field589 = new int[field587];
		field590 = new int[field587];
		field591 = new int[field587];
		int var6 = field587 * 10 + var2.field1350;
		for (int var7 = 0; var7 < field587; var7++) {
			field588[var7] = var2.method460();
			field589[var7] = var2.method459();
			field590[var7] = var2.method459();
			field591[var7] = var6;
			var6 += field590[var7];
		}
	}

	@ObfuscatedName("ESUFCMYV.a(Ljava/lang/String;[B)[B")
	public byte[] method205(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field587; var5++) {
			if (field588[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field589[var5]];
				}

				if (field592) {
					for (int var6 = 0; var6 < field589[var5]; var6++) {
						arg1[var6] = field586[field591[var5] + var6];
					}
				} else {
					OJYKKXRM.method355(arg1, field589[var5], field586, field590[var5], field591[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
