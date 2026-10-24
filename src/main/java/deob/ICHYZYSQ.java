package deob;

@ObfuscatedName("ICHYZYSQ")
public final class ICHYZYSQ {

	@ObfuscatedName("ICHYZYSQ.c")
	public int[] field728 = new int[256];

	@ObfuscatedName("ICHYZYSQ.b")
	public int[] field727 = new int[256];

	@ObfuscatedName("ICHYZYSQ.a")
	public int field726;

	@ObfuscatedName("ICHYZYSQ.d")
	public int field729;

	@ObfuscatedName("ICHYZYSQ.e")
	public int field730;

	@ObfuscatedName("ICHYZYSQ.f")
	public int field731;

	public ICHYZYSQ(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field727[var2] = arg0[var2];
		}

		method232();
	}

	@ObfuscatedName("ICHYZYSQ.a()I")
	public final int method230() {
		if (field726-- == 0) {
			method231();
			field726 = 255;
		}

		return field727[field726];
	}

	@ObfuscatedName("ICHYZYSQ.b()V")
	public final void method231() {
		field730 += ++field731;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field728[var1];

			if ((var1 & 0x3) == 0) {
				field729 ^= field729 << 13;
			} else if ((var1 & 0x3) == 1) {
				field729 ^= field729 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field729 ^= field729 << 2;
			} else if ((var1 & 0x3) == 3) {
				field729 ^= field729 >>> 16;
			}

			field729 += field728[var1 + 128 & 0xFF];
			int var3;
			field728[var1] = var3 = field728[var2 >> 2 & 0xFF] + field729 + field730;
			field727[var1] = field730 = field728[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("ICHYZYSQ.c()V")
	public final void method232() {
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
			var8 += field727[var10];
			var7 += field727[var10 + 1];
			var6 += field727[var10 + 2];
			var5 += field727[var10 + 3];
			var4 += field727[var10 + 4];
			var3 += field727[var10 + 5];
			var2 += field727[var10 + 6];
			var1 += field727[var10 + 7];
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
			field728[var10] = var8;
			field728[var10 + 1] = var7;
			field728[var10 + 2] = var6;
			field728[var10 + 3] = var5;
			field728[var10 + 4] = var4;
			field728[var10 + 5] = var3;
			field728[var10 + 6] = var2;
			field728[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field728[var11];
			var7 += field728[var11 + 1];
			var6 += field728[var11 + 2];
			var5 += field728[var11 + 3];
			var4 += field728[var11 + 4];
			var3 += field728[var11 + 5];
			var2 += field728[var11 + 6];
			var1 += field728[var11 + 7];
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
			field728[var11] = var8;
			field728[var11 + 1] = var7;
			field728[var11 + 2] = var6;
			field728[var11 + 3] = var5;
			field728[var11 + 4] = var4;
			field728[var11 + 5] = var3;
			field728[var11 + 6] = var2;
			field728[var11 + 7] = var1;
		}

		method231();
		field726 = 256;
	}
}
