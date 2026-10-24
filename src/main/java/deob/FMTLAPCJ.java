package deob;

@ObfuscatedName("FMTLAPCJ")
public final class FMTLAPCJ {

	@ObfuscatedName("FMTLAPCJ.c")
	public int[] field595 = new int[256];

	@ObfuscatedName("FMTLAPCJ.b")
	public int[] field594 = new int[256];

	@ObfuscatedName("FMTLAPCJ.a")
	public int field593;

	@ObfuscatedName("FMTLAPCJ.d")
	public int field596;

	@ObfuscatedName("FMTLAPCJ.e")
	public int field597;

	@ObfuscatedName("FMTLAPCJ.f")
	public int field598;

	public FMTLAPCJ(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field594[var2] = arg0[var2];
		}

		method205();
	}

	@ObfuscatedName("FMTLAPCJ.a()I")
	public final int method203() {
		if (field593-- == 0) {
			method204();
			field593 = 255;
		}

		return field594[field593];
	}

	@ObfuscatedName("FMTLAPCJ.b()V")
	public final void method204() {
		field597 += ++field598;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field595[var1];

			if ((var1 & 0x3) == 0) {
				field596 ^= field596 << 13;
			} else if ((var1 & 0x3) == 1) {
				field596 ^= field596 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field596 ^= field596 << 2;
			} else if ((var1 & 0x3) == 3) {
				field596 ^= field596 >>> 16;
			}

			field596 += field595[var1 + 128 & 0xFF];
			int var3;
			field595[var1] = var3 = field595[var2 >> 2 & 0xFF] + field596 + field597;
			field594[var1] = field597 = field595[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("FMTLAPCJ.c()V")
	public final void method205() {
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
			var8 += field594[var10];
			var7 += field594[var10 + 1];
			var6 += field594[var10 + 2];
			var5 += field594[var10 + 3];
			var4 += field594[var10 + 4];
			var3 += field594[var10 + 5];
			var2 += field594[var10 + 6];
			var1 += field594[var10 + 7];
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
			field595[var10] = var8;
			field595[var10 + 1] = var7;
			field595[var10 + 2] = var6;
			field595[var10 + 3] = var5;
			field595[var10 + 4] = var4;
			field595[var10 + 5] = var3;
			field595[var10 + 6] = var2;
			field595[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field595[var11];
			var7 += field595[var11 + 1];
			var6 += field595[var11 + 2];
			var5 += field595[var11 + 3];
			var4 += field595[var11 + 4];
			var3 += field595[var11 + 5];
			var2 += field595[var11 + 6];
			var1 += field595[var11 + 7];
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
			field595[var11] = var8;
			field595[var11 + 1] = var7;
			field595[var11 + 2] = var6;
			field595[var11 + 3] = var5;
			field595[var11 + 4] = var4;
			field595[var11 + 5] = var3;
			field595[var11 + 6] = var2;
			field595[var11 + 7] = var1;
		}

		method204();
		field593 = 256;
	}
}
