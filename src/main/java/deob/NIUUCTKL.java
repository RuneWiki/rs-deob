package deob;

@ObfuscatedName("NIUUCTKL")
public final class NIUUCTKL {

	@ObfuscatedName("NIUUCTKL.d")
	public int[] field964 = new int[256];

	@ObfuscatedName("NIUUCTKL.c")
	public int[] field963 = new int[256];

	@ObfuscatedName("NIUUCTKL.b")
	public int field962;

	@ObfuscatedName("NIUUCTKL.e")
	public int field965;

	@ObfuscatedName("NIUUCTKL.f")
	public int field966;

	@ObfuscatedName("NIUUCTKL.g")
	public int field967;

	public NIUUCTKL(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field963[var2] = arg0[var2];
		}

		method426();
	}

	@ObfuscatedName("NIUUCTKL.a()I")
	public final int method424() {
		if (field962-- == 0) {
			method425();
			field962 = 255;
		}

		return field963[field962];
	}

	@ObfuscatedName("NIUUCTKL.b()V")
	public final void method425() {
		field966 += ++field967;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field964[var1];

			if ((var1 & 0x3) == 0) {
				field965 ^= field965 << 13;
			} else if ((var1 & 0x3) == 1) {
				field965 ^= field965 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field965 ^= field965 << 2;
			} else if ((var1 & 0x3) == 3) {
				field965 ^= field965 >>> 16;
			}

			field965 += field964[var1 + 128 & 0xFF];
			int var3;
			field964[var1] = var3 = field964[var2 >> 2 & 0xFF] + field965 + field966;
			field963[var1] = field966 = field964[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("NIUUCTKL.c()V")
	public final void method426() {
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
			var8 += field963[var10];
			var7 += field963[var10 + 1];
			var6 += field963[var10 + 2];
			var5 += field963[var10 + 3];
			var4 += field963[var10 + 4];
			var3 += field963[var10 + 5];
			var2 += field963[var10 + 6];
			var1 += field963[var10 + 7];
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
			field964[var10] = var8;
			field964[var10 + 1] = var7;
			field964[var10 + 2] = var6;
			field964[var10 + 3] = var5;
			field964[var10 + 4] = var4;
			field964[var10 + 5] = var3;
			field964[var10 + 6] = var2;
			field964[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field964[var11];
			var7 += field964[var11 + 1];
			var6 += field964[var11 + 2];
			var5 += field964[var11 + 3];
			var4 += field964[var11 + 4];
			var3 += field964[var11 + 5];
			var2 += field964[var11 + 6];
			var1 += field964[var11 + 7];
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
			field964[var11] = var8;
			field964[var11 + 1] = var7;
			field964[var11 + 2] = var6;
			field964[var11 + 3] = var5;
			field964[var11 + 4] = var4;
			field964[var11 + 5] = var3;
			field964[var11 + 6] = var2;
			field964[var11 + 7] = var1;
		}

		method425();
		field962 = 256;
	}
}
