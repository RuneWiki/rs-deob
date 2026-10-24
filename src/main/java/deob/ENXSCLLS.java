package deob;

@ObfuscatedName("ENXSCLLS")
public final class ENXSCLLS {

	@ObfuscatedName("ENXSCLLS.c")
	public int[] field664 = new int[256];

	@ObfuscatedName("ENXSCLLS.b")
	public int[] field663 = new int[256];

	@ObfuscatedName("ENXSCLLS.a")
	public int field662;

	@ObfuscatedName("ENXSCLLS.d")
	public int field665;

	@ObfuscatedName("ENXSCLLS.e")
	public int field666;

	@ObfuscatedName("ENXSCLLS.f")
	public int field667;

	public ENXSCLLS(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field663[var2] = arg0[var2];
		}

		method202();
	}

	@ObfuscatedName("ENXSCLLS.a()I")
	public final int method200() {
		if (field662-- == 0) {
			method201();
			field662 = 255;
		}

		return field663[field662];
	}

	@ObfuscatedName("ENXSCLLS.b()V")
	public final void method201() {
		field666 += ++field667;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field664[var1];

			if ((var1 & 0x3) == 0) {
				field665 ^= field665 << 13;
			} else if ((var1 & 0x3) == 1) {
				field665 ^= field665 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field665 ^= field665 << 2;
			} else if ((var1 & 0x3) == 3) {
				field665 ^= field665 >>> 16;
			}

			field665 += field664[var1 + 128 & 0xFF];
			int var3;
			field664[var1] = var3 = field664[var2 >> 2 & 0xFF] + field665 + field666;
			field663[var1] = field666 = field664[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("ENXSCLLS.c()V")
	public final void method202() {
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
			var8 += field663[var10];
			var7 += field663[var10 + 1];
			var6 += field663[var10 + 2];
			var5 += field663[var10 + 3];
			var4 += field663[var10 + 4];
			var3 += field663[var10 + 5];
			var2 += field663[var10 + 6];
			var1 += field663[var10 + 7];
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
			field664[var10] = var8;
			field664[var10 + 1] = var7;
			field664[var10 + 2] = var6;
			field664[var10 + 3] = var5;
			field664[var10 + 4] = var4;
			field664[var10 + 5] = var3;
			field664[var10 + 6] = var2;
			field664[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field664[var11];
			var7 += field664[var11 + 1];
			var6 += field664[var11 + 2];
			var5 += field664[var11 + 3];
			var4 += field664[var11 + 4];
			var3 += field664[var11 + 5];
			var2 += field664[var11 + 6];
			var1 += field664[var11 + 7];
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
			field664[var11] = var8;
			field664[var11 + 1] = var7;
			field664[var11 + 2] = var6;
			field664[var11 + 3] = var5;
			field664[var11 + 4] = var4;
			field664[var11 + 5] = var3;
			field664[var11 + 6] = var2;
			field664[var11 + 7] = var1;
		}

		method201();
		field662 = 256;
	}
}
