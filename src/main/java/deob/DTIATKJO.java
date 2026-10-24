package deob;

@ObfuscatedName("DTIATKJO")
public final class DTIATKJO {

	@ObfuscatedName("DTIATKJO.f")
	public int field533;

	@ObfuscatedName("DTIATKJO.k")
	public boolean field538;

	@ObfuscatedName("DTIATKJO.e")
	public byte[] field532;

	@ObfuscatedName("DTIATKJO.g")
	public int[] field534;

	@ObfuscatedName("DTIATKJO.h")
	public int[] field535;

	@ObfuscatedName("DTIATKJO.i")
	public int[] field536;

	@ObfuscatedName("DTIATKJO.j")
	public int[] field537;

	public DTIATKJO(byte[] arg0) {
		method167(arg0);
	}

	@ObfuscatedName("DTIATKJO.a([BB)V")
	public void method167(byte[] arg0) {
		GHHPHSRU var2 = new GHHPHSRU(arg0);
		int var3 = var2.method206();
		int var4 = var2.method206();
		if (var3 == var4) {
			field532 = arg0;
			field538 = false;
		} else {
			byte[] var5 = new byte[var3];
			UHDZKWZT.method499(var5, var3, arg0, var4, 6);
			field532 = var5;
			var2 = new GHHPHSRU(field532);
			field538 = true;
		}

		field533 = var2.method204();
		field534 = new int[field533];
		field535 = new int[field533];
		field536 = new int[field533];
		field537 = new int[field533];
		int var6 = field533 * 10 + var2.field667;
		for (int var7 = 0; var7 < field533; var7++) {
			field534[var7] = var2.method207();
			field535[var7] = var2.method206();
			field536[var7] = var2.method206();
			field537[var7] = var6;
			var6 += field536[var7];
		}
	}

	@ObfuscatedName("DTIATKJO.a(Ljava/lang/String;[B)[B")
	public byte[] method168(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field533; var5++) {
			if (field534[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field535[var5]];
				}

				if (field538) {
					for (int var6 = 0; var6 < field535[var5]; var6++) {
						arg1[var6] = field532[field537[var5] + var6];
					}
				} else {
					UHDZKWZT.method499(arg1, field535[var5], field532, field536[var5], field537[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
