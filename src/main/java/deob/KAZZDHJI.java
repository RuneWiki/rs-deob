package deob;

@ObfuscatedName("KAZZDHJI")
public final class KAZZDHJI {

	@ObfuscatedName("KAZZDHJI.d")
	public int[] field759 = new int[256];

	@ObfuscatedName("KAZZDHJI.c")
	public int[] field758 = new int[256];

	@ObfuscatedName("KAZZDHJI.b")
	public int field757;

	@ObfuscatedName("KAZZDHJI.e")
	public int field760;

	@ObfuscatedName("KAZZDHJI.f")
	public int field761;

	@ObfuscatedName("KAZZDHJI.g")
	public int field762;

	public KAZZDHJI(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field758[var2] = arg0[var2];
		}

		method243();
	}

	@ObfuscatedName("KAZZDHJI.a()I")
	public final int method241() {
		if (field757-- == 0) {
			method242();
			field757 = 255;
		}

		return field758[field757];
	}

	@ObfuscatedName("KAZZDHJI.b()V")
	public final void method242() {
		field761 += ++field762;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field759[var1];

			if ((var1 & 0x3) == 0) {
				field760 ^= field760 << 13;
			} else if ((var1 & 0x3) == 1) {
				field760 ^= field760 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field760 ^= field760 << 2;
			} else if ((var1 & 0x3) == 3) {
				field760 ^= field760 >>> 16;
			}

			field760 += field759[var1 + 128 & 0xFF];
			int var3;
			field759[var1] = var3 = field759[var2 >> 2 & 0xFF] + field760 + field761;
			field758[var1] = field761 = field759[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("KAZZDHJI.c()V")
	public final void method243() {
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
			var8 += field758[var10];
			var7 += field758[var10 + 1];
			var6 += field758[var10 + 2];
			var5 += field758[var10 + 3];
			var4 += field758[var10 + 4];
			var3 += field758[var10 + 5];
			var2 += field758[var10 + 6];
			var1 += field758[var10 + 7];
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
			field759[var10] = var8;
			field759[var10 + 1] = var7;
			field759[var10 + 2] = var6;
			field759[var10 + 3] = var5;
			field759[var10 + 4] = var4;
			field759[var10 + 5] = var3;
			field759[var10 + 6] = var2;
			field759[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field759[var11];
			var7 += field759[var11 + 1];
			var6 += field759[var11 + 2];
			var5 += field759[var11 + 3];
			var4 += field759[var11 + 4];
			var3 += field759[var11 + 5];
			var2 += field759[var11 + 6];
			var1 += field759[var11 + 7];
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
			field759[var11] = var8;
			field759[var11 + 1] = var7;
			field759[var11 + 2] = var6;
			field759[var11 + 3] = var5;
			field759[var11 + 4] = var4;
			field759[var11 + 5] = var3;
			field759[var11 + 6] = var2;
			field759[var11 + 7] = var1;
		}

		method242();
		field757 = 256;
	}
}
