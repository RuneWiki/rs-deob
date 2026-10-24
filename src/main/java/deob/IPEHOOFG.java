package deob;

@ObfuscatedName("IPEHOOFG")
public final class IPEHOOFG {

	@ObfuscatedName("IPEHOOFG.c")
	public int[] field872 = new int[256];

	@ObfuscatedName("IPEHOOFG.b")
	public int[] field871 = new int[256];

	@ObfuscatedName("IPEHOOFG.a")
	public int field870;

	@ObfuscatedName("IPEHOOFG.d")
	public int field873;

	@ObfuscatedName("IPEHOOFG.e")
	public int field874;

	@ObfuscatedName("IPEHOOFG.f")
	public int field875;

	public IPEHOOFG(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field871[var2] = arg0[var2];
		}

		method280();
	}

	@ObfuscatedName("IPEHOOFG.a()I")
	public final int method278() {
		if (field870-- == 0) {
			method279();
			field870 = 255;
		}

		return field871[field870];
	}

	@ObfuscatedName("IPEHOOFG.b()V")
	public final void method279() {
		field874 += ++field875;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field872[var1];

			if ((var1 & 0x3) == 0) {
				field873 ^= field873 << 13;
			} else if ((var1 & 0x3) == 1) {
				field873 ^= field873 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field873 ^= field873 << 2;
			} else if ((var1 & 0x3) == 3) {
				field873 ^= field873 >>> 16;
			}

			field873 += field872[var1 + 128 & 0xFF];
			int var3;
			field872[var1] = var3 = field872[var2 >> 2 & 0xFF] + field873 + field874;
			field871[var1] = field874 = field872[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("IPEHOOFG.c()V")
	public final void method280() {
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
			var8 += field871[var10];
			var7 += field871[var10 + 1];
			var6 += field871[var10 + 2];
			var5 += field871[var10 + 3];
			var4 += field871[var10 + 4];
			var3 += field871[var10 + 5];
			var2 += field871[var10 + 6];
			var1 += field871[var10 + 7];
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
			field872[var10] = var8;
			field872[var10 + 1] = var7;
			field872[var10 + 2] = var6;
			field872[var10 + 3] = var5;
			field872[var10 + 4] = var4;
			field872[var10 + 5] = var3;
			field872[var10 + 6] = var2;
			field872[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field872[var11];
			var7 += field872[var11 + 1];
			var6 += field872[var11 + 2];
			var5 += field872[var11 + 3];
			var4 += field872[var11 + 4];
			var3 += field872[var11 + 5];
			var2 += field872[var11 + 6];
			var1 += field872[var11 + 7];
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
			field872[var11] = var8;
			field872[var11 + 1] = var7;
			field872[var11 + 2] = var6;
			field872[var11 + 3] = var5;
			field872[var11 + 4] = var4;
			field872[var11 + 5] = var3;
			field872[var11 + 6] = var2;
			field872[var11 + 7] = var1;
		}

		method279();
		field870 = 256;
	}
}
