package deob;

@ObfuscatedName("LAXXBEFB")
public final class LAXXBEFB {

	@ObfuscatedName("LAXXBEFB.c")
	public int[] field873 = new int[256];

	@ObfuscatedName("LAXXBEFB.b")
	public int[] field872 = new int[256];

	@ObfuscatedName("LAXXBEFB.a")
	public int field871;

	@ObfuscatedName("LAXXBEFB.d")
	public int field874;

	@ObfuscatedName("LAXXBEFB.e")
	public int field875;

	@ObfuscatedName("LAXXBEFB.f")
	public int field876;

	public LAXXBEFB(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field872[var2] = arg0[var2];
		}

		method278();
	}

	@ObfuscatedName("LAXXBEFB.a()I")
	public final int method276() {
		if (field871-- == 0) {
			method277();
			field871 = 255;
		}

		return field872[field871];
	}

	@ObfuscatedName("LAXXBEFB.b()V")
	public final void method277() {
		field875 += ++field876;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field873[var1];

			if ((var1 & 0x3) == 0) {
				field874 ^= field874 << 13;
			} else if ((var1 & 0x3) == 1) {
				field874 ^= field874 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field874 ^= field874 << 2;
			} else if ((var1 & 0x3) == 3) {
				field874 ^= field874 >>> 16;
			}

			field874 += field873[var1 + 128 & 0xFF];
			int var3;
			field873[var1] = var3 = field873[var2 >> 2 & 0xFF] + field874 + field875;
			field872[var1] = field875 = field873[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("LAXXBEFB.c()V")
	public final void method278() {
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
			var8 += field872[var10];
			var7 += field872[var10 + 1];
			var6 += field872[var10 + 2];
			var5 += field872[var10 + 3];
			var4 += field872[var10 + 4];
			var3 += field872[var10 + 5];
			var2 += field872[var10 + 6];
			var1 += field872[var10 + 7];
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
			field873[var10] = var8;
			field873[var10 + 1] = var7;
			field873[var10 + 2] = var6;
			field873[var10 + 3] = var5;
			field873[var10 + 4] = var4;
			field873[var10 + 5] = var3;
			field873[var10 + 6] = var2;
			field873[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field873[var11];
			var7 += field873[var11 + 1];
			var6 += field873[var11 + 2];
			var5 += field873[var11 + 3];
			var4 += field873[var11 + 4];
			var3 += field873[var11 + 5];
			var2 += field873[var11 + 6];
			var1 += field873[var11 + 7];
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
			field873[var11] = var8;
			field873[var11 + 1] = var7;
			field873[var11 + 2] = var6;
			field873[var11 + 3] = var5;
			field873[var11 + 4] = var4;
			field873[var11 + 5] = var3;
			field873[var11 + 6] = var2;
			field873[var11 + 7] = var1;
		}

		method277();
		field871 = 256;
	}
}
