package deob;

@ObfuscatedName("KUQMNLGP")
public final class KUQMNLGP {

	@ObfuscatedName("KUQMNLGP.d")
	public int[] field897 = new int[256];

	@ObfuscatedName("KUQMNLGP.c")
	public int[] field896 = new int[256];

	@ObfuscatedName("KUQMNLGP.b")
	public int field895;

	@ObfuscatedName("KUQMNLGP.e")
	public int field898;

	@ObfuscatedName("KUQMNLGP.f")
	public int field899;

	@ObfuscatedName("KUQMNLGP.g")
	public int field900;

	public KUQMNLGP(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field896[var2] = arg0[var2];
		}

		method389();
	}

	@ObfuscatedName("KUQMNLGP.a()I")
	public final int method387() {
		if (field895-- == 0) {
			method388();
			field895 = 255;
		}

		return field896[field895];
	}

	@ObfuscatedName("KUQMNLGP.b()V")
	public final void method388() {
		field899 += ++field900;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field897[var1];

			if ((var1 & 0x3) == 0) {
				field898 ^= field898 << 13;
			} else if ((var1 & 0x3) == 1) {
				field898 ^= field898 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field898 ^= field898 << 2;
			} else if ((var1 & 0x3) == 3) {
				field898 ^= field898 >>> 16;
			}

			field898 += field897[var1 + 128 & 0xFF];
			int var3;
			field897[var1] = var3 = field897[var2 >> 2 & 0xFF] + field898 + field899;
			field896[var1] = field899 = field897[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("KUQMNLGP.c()V")
	public final void method389() {
		int var1 = 0x9E3779B9;
		int var2 = 0x9E3779B9;
		int var3 = 0x9E3779B9;
		int var4 = 0x9E3779B9;
		int var5 = 0x9E3779B9;
		int var6 = 0x9E3779B9;
		int var7 = 0x9E3779B9;
		int var8 = 0x9E3779B9;
		for (int var9 = 0; var9 < 4; var9++) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (int var10 = 0; var10 < 256; var10 += 8) {
			var8 += field896[var10];
			var7 += field896[var10 + 1];
			var6 += field896[var10 + 2];
			var5 += field896[var10 + 3];
			var4 += field896[var10 + 4];
			var3 += field896[var10 + 5];
			var2 += field896[var10 + 6];
			var1 += field896[var10 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field897[var10] = var8;
			field897[var10 + 1] = var7;
			field897[var10 + 2] = var6;
			field897[var10 + 3] = var5;
			field897[var10 + 4] = var4;
			field897[var10 + 5] = var3;
			field897[var10 + 6] = var2;
			field897[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field897[var11];
			var7 += field897[var11 + 1];
			var6 += field897[var11 + 2];
			var5 += field897[var11 + 3];
			var4 += field897[var11 + 4];
			var3 += field897[var11 + 5];
			var2 += field897[var11 + 6];
			var1 += field897[var11 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field897[var11] = var8;
			field897[var11 + 1] = var7;
			field897[var11 + 2] = var6;
			field897[var11 + 3] = var5;
			field897[var11 + 4] = var4;
			field897[var11 + 5] = var3;
			field897[var11 + 6] = var2;
			field897[var11 + 7] = var1;
		}

		method388();
		field895 = 256;
	}
}
