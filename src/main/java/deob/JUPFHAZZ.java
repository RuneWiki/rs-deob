package deob;

@ObfuscatedName("JUPFHAZZ")
public final class JUPFHAZZ {

	@ObfuscatedName("JUPFHAZZ.e")
	public int field993;

	@ObfuscatedName("JUPFHAZZ.j")
	public boolean field998;

	@ObfuscatedName("JUPFHAZZ.d")
	public byte[] field992;

	@ObfuscatedName("JUPFHAZZ.f")
	public int[] field994;

	@ObfuscatedName("JUPFHAZZ.g")
	public int[] field995;

	@ObfuscatedName("JUPFHAZZ.h")
	public int[] field996;

	@ObfuscatedName("JUPFHAZZ.i")
	public int[] field997;

	public JUPFHAZZ(byte[] arg0) {
		method371(arg0);
	}

	@ObfuscatedName("JUPFHAZZ.a(Z[B)V")
	public void method371(byte[] arg0) {
		TKPFKOXP var2 = new TKPFKOXP(arg0);
		int var3 = var2.method533();
		int var4 = var2.method533();
		if (var3 == var4) {
			field992 = arg0;
			field998 = false;
		} else {
			byte[] var5 = new byte[var3];
			IGHOBUKI.method263(var5, var3, arg0, var4, 6);
			field992 = var5;
			var2 = new TKPFKOXP(field992);
			field998 = true;
		}

		field993 = var2.method531();
		field994 = new int[field993];
		field995 = new int[field993];
		field996 = new int[field993];
		field997 = new int[field993];
		int var6 = field993 * 10 + var2.field1382;
		for (int var7 = 0; var7 < field993; var7++) {
			field994[var7] = var2.method534();
			field995[var7] = var2.method533();
			field996[var7] = var2.method533();
			field997[var7] = var6;
			var6 += field996[var7];
		}
	}

	@ObfuscatedName("JUPFHAZZ.a(Ljava/lang/String;[B)[B")
	public byte[] method372(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field993; var5++) {
			if (field994[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field995[var5]];
				}

				if (field998) {
					for (int var6 = 0; var6 < field995[var5]; var6++) {
						arg1[var6] = field992[field997[var5] + var6];
					}
				} else {
					IGHOBUKI.method263(arg1, field995[var5], field992, field996[var5], field997[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
