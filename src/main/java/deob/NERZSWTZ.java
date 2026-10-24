package deob;

@ObfuscatedName("NERZSWTZ")
public final class NERZSWTZ {

	@ObfuscatedName("NERZSWTZ.d")
	public int[] field885 = new int[256];

	@ObfuscatedName("NERZSWTZ.c")
	public int[] field884 = new int[256];

	@ObfuscatedName("NERZSWTZ.b")
	public int field883;

	@ObfuscatedName("NERZSWTZ.e")
	public int field886;

	@ObfuscatedName("NERZSWTZ.f")
	public int field887;

	@ObfuscatedName("NERZSWTZ.g")
	public int field888;

	public NERZSWTZ(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field884[var2] = arg0[var2];
		}

		method314();
	}

	@ObfuscatedName("NERZSWTZ.a()I")
	public final int method312() {
		if (field883-- == 0) {
			method313();
			field883 = 255;
		}

		return field884[field883];
	}

	@ObfuscatedName("NERZSWTZ.b()V")
	public final void method313() {
		field887 += ++field888;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field885[var1];

			if ((var1 & 0x3) == 0) {
				field886 ^= field886 << 13;
			} else if ((var1 & 0x3) == 1) {
				field886 ^= field886 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field886 ^= field886 << 2;
			} else if ((var1 & 0x3) == 3) {
				field886 ^= field886 >>> 16;
			}

			field886 += field885[var1 + 128 & 0xFF];
			int var3;
			field885[var1] = var3 = field885[var2 >> 2 & 0xFF] + field886 + field887;
			field884[var1] = field887 = field885[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("NERZSWTZ.c()V")
	public final void method314() {
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
			var8 += field884[var10];
			var7 += field884[var10 + 1];
			var6 += field884[var10 + 2];
			var5 += field884[var10 + 3];
			var4 += field884[var10 + 4];
			var3 += field884[var10 + 5];
			var2 += field884[var10 + 6];
			var1 += field884[var10 + 7];
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
			field885[var10] = var8;
			field885[var10 + 1] = var7;
			field885[var10 + 2] = var6;
			field885[var10 + 3] = var5;
			field885[var10 + 4] = var4;
			field885[var10 + 5] = var3;
			field885[var10 + 6] = var2;
			field885[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field885[var11];
			var7 += field885[var11 + 1];
			var6 += field885[var11 + 2];
			var5 += field885[var11 + 3];
			var4 += field885[var11 + 4];
			var3 += field885[var11 + 5];
			var2 += field885[var11 + 6];
			var1 += field885[var11 + 7];
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
			field885[var11] = var8;
			field885[var11 + 1] = var7;
			field885[var11 + 2] = var6;
			field885[var11 + 3] = var5;
			field885[var11 + 4] = var4;
			field885[var11 + 5] = var3;
			field885[var11 + 6] = var2;
			field885[var11 + 7] = var1;
		}

		method313();
		field883 = 256;
	}
}
