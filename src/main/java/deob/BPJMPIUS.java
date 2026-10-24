package deob;

@ObfuscatedName("BPJMPIUS")
public final class BPJMPIUS {

	@ObfuscatedName("BPJMPIUS.c")
	public int[] field113 = new int[256];

	@ObfuscatedName("BPJMPIUS.b")
	public int[] field112 = new int[256];

	@ObfuscatedName("BPJMPIUS.a")
	public int field111;

	@ObfuscatedName("BPJMPIUS.d")
	public int field114;

	@ObfuscatedName("BPJMPIUS.e")
	public int field115;

	@ObfuscatedName("BPJMPIUS.f")
	public int field116;

	public BPJMPIUS(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field112[var2] = arg0[var2];
		}

		method31();
	}

	@ObfuscatedName("BPJMPIUS.a()I")
	public final int method29() {
		if (field111-- == 0) {
			method30();
			field111 = 255;
		}

		return field112[field111];
	}

	@ObfuscatedName("BPJMPIUS.b()V")
	public final void method30() {
		field115 += ++field116;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field113[var1];

			if ((var1 & 0x3) == 0) {
				field114 ^= field114 << 13;
			} else if ((var1 & 0x3) == 1) {
				field114 ^= field114 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field114 ^= field114 << 2;
			} else if ((var1 & 0x3) == 3) {
				field114 ^= field114 >>> 16;
			}

			field114 += field113[var1 + 128 & 0xFF];
			int var3;
			field113[var1] = var3 = field113[var2 >> 2 & 0xFF] + field114 + field115;
			field112[var1] = field115 = field113[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("BPJMPIUS.c()V")
	public final void method31() {
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
			var8 += field112[var10];
			var7 += field112[var10 + 1];
			var6 += field112[var10 + 2];
			var5 += field112[var10 + 3];
			var4 += field112[var10 + 4];
			var3 += field112[var10 + 5];
			var2 += field112[var10 + 6];
			var1 += field112[var10 + 7];
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
			field113[var10] = var8;
			field113[var10 + 1] = var7;
			field113[var10 + 2] = var6;
			field113[var10 + 3] = var5;
			field113[var10 + 4] = var4;
			field113[var10 + 5] = var3;
			field113[var10 + 6] = var2;
			field113[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field113[var11];
			var7 += field113[var11 + 1];
			var6 += field113[var11 + 2];
			var5 += field113[var11 + 3];
			var4 += field113[var11 + 4];
			var3 += field113[var11 + 5];
			var2 += field113[var11 + 6];
			var1 += field113[var11 + 7];
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
			field113[var11] = var8;
			field113[var11 + 1] = var7;
			field113[var11 + 2] = var6;
			field113[var11 + 3] = var5;
			field113[var11 + 4] = var4;
			field113[var11 + 5] = var3;
			field113[var11 + 6] = var2;
			field113[var11 + 7] = var1;
		}

		method30();
		field111 = 256;
	}
}
