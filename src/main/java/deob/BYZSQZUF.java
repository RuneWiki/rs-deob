package deob;

@ObfuscatedName("BYZSQZUF")
public final class BYZSQZUF {

	@ObfuscatedName("BYZSQZUF.f")
	public int field93;

	@ObfuscatedName("BYZSQZUF.k")
	public boolean field98;

	@ObfuscatedName("BYZSQZUF.e")
	public byte[] field92;

	@ObfuscatedName("BYZSQZUF.g")
	public int[] field94;

	@ObfuscatedName("BYZSQZUF.h")
	public int[] field95;

	@ObfuscatedName("BYZSQZUF.i")
	public int[] field96;

	@ObfuscatedName("BYZSQZUF.j")
	public int[] field97;

	public BYZSQZUF(byte[] arg0) {
		method28(arg0);
	}

	@ObfuscatedName("BYZSQZUF.a([BI)V")
	public void method28(byte[] arg0) {
		IMUIZRAF var2 = new IMUIZRAF(arg0);
		int var3 = var2.method242();
		int var4 = var2.method242();
		if (var3 == var4) {
			field92 = arg0;
			field98 = false;
		} else {
			byte[] var5 = new byte[var3];
			PUAKDUFP.method387(var5, var3, arg0, var4, 6);
			field92 = var5;
			var2 = new IMUIZRAF(field92);
			field98 = true;
		}

		field93 = var2.method240();
		field94 = new int[field93];
		field95 = new int[field93];
		field96 = new int[field93];
		field97 = new int[field93];
		int var6 = field93 * 10 + var2.field714;
		for (int var7 = 0; var7 < field93; var7++) {
			field94[var7] = var2.method243();
			field95[var7] = var2.method242();
			field96[var7] = var2.method242();
			field97[var7] = var6;
			var6 += field96[var7];
		}
	}

	@ObfuscatedName("BYZSQZUF.a(Ljava/lang/String;[B)[B")
	public byte[] method29(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field93; var5++) {
			if (field94[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field95[var5]];
				}

				if (field98) {
					for (int var6 = 0; var6 < field95[var5]; var6++) {
						arg1[var6] = field92[field97[var5] + var6];
					}
				} else {
					PUAKDUFP.method387(arg1, field95[var5], field92, field96[var5], field97[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
