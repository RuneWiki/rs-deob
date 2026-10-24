package deob;

@ObfuscatedName("FXNTEMPE")
public final class FXNTEMPE {

	@ObfuscatedName("FXNTEMPE.c")
	public int field639;

	@ObfuscatedName("FXNTEMPE.h")
	public boolean field644;

	@ObfuscatedName("FXNTEMPE.b")
	public byte[] field638;

	@ObfuscatedName("FXNTEMPE.d")
	public int[] field640;

	@ObfuscatedName("FXNTEMPE.e")
	public int[] field641;

	@ObfuscatedName("FXNTEMPE.f")
	public int[] field642;

	@ObfuscatedName("FXNTEMPE.g")
	public int[] field643;

	public FXNTEMPE(byte[] arg0) {
		method211(arg0);
	}

	@ObfuscatedName("FXNTEMPE.a([BI)V")
	public void method211(byte[] arg0) {
		RSWRPCHR var2 = new RSWRPCHR(arg0);
		int var3 = var2.method392();
		int var4 = var2.method392();
		if (var3 == var4) {
			field638 = arg0;
			field644 = false;
		} else {
			byte[] var5 = new byte[var3];
			KNTJWLVJ.method275(var5, var3, arg0, var4, 6);
			field638 = var5;
			var2 = new RSWRPCHR(field638);
			field644 = true;
		}

		field639 = var2.method390();
		field640 = new int[field639];
		field641 = new int[field639];
		field642 = new int[field639];
		field643 = new int[field639];
		int var6 = field639 * 10 + var2.field1038;
		for (int var7 = 0; var7 < field639; var7++) {
			field640[var7] = var2.method393();
			field641[var7] = var2.method392();
			field642[var7] = var2.method392();
			field643[var7] = var6;
			var6 += field642[var7];
		}
	}

	@ObfuscatedName("FXNTEMPE.a(Ljava/lang/String;[B)[B")
	public byte[] method212(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field639; var5++) {
			if (field640[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field641[var5]];
				}

				if (field644) {
					for (int var6 = 0; var6 < field641[var5]; var6++) {
						arg1[var6] = field638[field643[var5] + var6];
					}
				} else {
					KNTJWLVJ.method275(arg1, field641[var5], field638, field642[var5], field643[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
