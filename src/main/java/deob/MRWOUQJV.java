package deob;

@ObfuscatedName("MRWOUQJV")
public final class MRWOUQJV {

	@ObfuscatedName("MRWOUQJV.d")
	public int[] field957 = new int[256];

	@ObfuscatedName("MRWOUQJV.c")
	public int[] field956 = new int[256];

	@ObfuscatedName("MRWOUQJV.b")
	public int field955;

	@ObfuscatedName("MRWOUQJV.e")
	public int field958;

	@ObfuscatedName("MRWOUQJV.f")
	public int field959;

	@ObfuscatedName("MRWOUQJV.g")
	public int field960;

	public MRWOUQJV(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field956[var2] = arg0[var2];
		}

		method337();
	}

	@ObfuscatedName("MRWOUQJV.a()I")
	public final int method335() {
		if (field955-- == 0) {
			method336();
			field955 = 255;
		}

		return field956[field955];
	}

	@ObfuscatedName("MRWOUQJV.b()V")
	public final void method336() {
		field959 += ++field960;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field957[var1];

			if ((var1 & 0x3) == 0) {
				field958 ^= field958 << 13;
			} else if ((var1 & 0x3) == 1) {
				field958 ^= field958 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field958 ^= field958 << 2;
			} else if ((var1 & 0x3) == 3) {
				field958 ^= field958 >>> 16;
			}

			field958 += field957[var1 + 128 & 0xFF];
			int var3;
			field957[var1] = var3 = field957[var2 >> 2 & 0xFF] + field958 + field959;
			field956[var1] = field959 = field957[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("MRWOUQJV.c()V")
	public final void method337() {
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
			var8 += field956[var10];
			var7 += field956[var10 + 1];
			var6 += field956[var10 + 2];
			var5 += field956[var10 + 3];
			var4 += field956[var10 + 4];
			var3 += field956[var10 + 5];
			var2 += field956[var10 + 6];
			var1 += field956[var10 + 7];
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
			field957[var10] = var8;
			field957[var10 + 1] = var7;
			field957[var10 + 2] = var6;
			field957[var10 + 3] = var5;
			field957[var10 + 4] = var4;
			field957[var10 + 5] = var3;
			field957[var10 + 6] = var2;
			field957[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field957[var11];
			var7 += field957[var11 + 1];
			var6 += field957[var11 + 2];
			var5 += field957[var11 + 3];
			var4 += field957[var11 + 4];
			var3 += field957[var11 + 5];
			var2 += field957[var11 + 6];
			var1 += field957[var11 + 7];
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
			field957[var11] = var8;
			field957[var11 + 1] = var7;
			field957[var11 + 2] = var6;
			field957[var11 + 3] = var5;
			field957[var11 + 4] = var4;
			field957[var11 + 5] = var3;
			field957[var11 + 6] = var2;
			field957[var11 + 7] = var1;
		}

		method336();
		field955 = 256;
	}
}
