package deob;

@ObfuscatedName("HBJEXSJX")
public final class HBJEXSJX {

	@ObfuscatedName("HBJEXSJX.d")
	public int field816;

	@ObfuscatedName("HBJEXSJX.i")
	public boolean field821;

	@ObfuscatedName("HBJEXSJX.c")
	public byte[] field815;

	@ObfuscatedName("HBJEXSJX.e")
	public int[] field817;

	@ObfuscatedName("HBJEXSJX.f")
	public int[] field818;

	@ObfuscatedName("HBJEXSJX.g")
	public int[] field819;

	@ObfuscatedName("HBJEXSJX.h")
	public int[] field820;

	public HBJEXSJX(byte[] arg0) {
		method347(arg0);
	}

	@ObfuscatedName("HBJEXSJX.a(I[B)V")
	public void method347(byte[] arg0) {
		EYMNCFMK var2 = new EYMNCFMK(arg0);
		int var3 = var2.method243();
		int var4 = var2.method243();
		if (var3 == var4) {
			field815 = arg0;
			field821 = false;
		} else {
			byte[] var5 = new byte[var3];
			PEXQYRJC.method440(var5, var3, arg0, var4, 6);
			field815 = var5;
			var2 = new EYMNCFMK(field815);
			field821 = true;
		}

		field816 = var2.method241();
		field817 = new int[field816];
		field818 = new int[field816];
		field819 = new int[field816];
		field820 = new int[field816];
		int var6 = field816 * 10 + var2.field679;
		for (int var7 = 0; var7 < field816; var7++) {
			field817[var7] = var2.method244();
			field818[var7] = var2.method243();
			field819[var7] = var2.method243();
			field820[var7] = var6;
			var6 += field819[var7];
		}
	}

	@ObfuscatedName("HBJEXSJX.a(Ljava/lang/String;[B)[B")
	public byte[] method348(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field816; var5++) {
			if (field817[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field818[var5]];
				}

				if (field821) {
					for (int var6 = 0; var6 < field818[var5]; var6++) {
						arg1[var6] = field815[field820[var5] + var6];
					}
				} else {
					PEXQYRJC.method440(arg1, field818[var5], field815, field819[var5], field820[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
