package deob;

@ObfuscatedName("UVSYUCDF")
public final class UVSYUCDF {

	@ObfuscatedName("UVSYUCDF.c")
	public int[] field1284 = new int[256];

	@ObfuscatedName("UVSYUCDF.b")
	public int[] field1283 = new int[256];

	@ObfuscatedName("UVSYUCDF.a")
	public int field1282;

	@ObfuscatedName("UVSYUCDF.d")
	public int field1285;

	@ObfuscatedName("UVSYUCDF.e")
	public int field1286;

	@ObfuscatedName("UVSYUCDF.f")
	public int field1287;

	public UVSYUCDF(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1283[var2] = arg0[var2];
		}

		method516();
	}

	@ObfuscatedName("UVSYUCDF.a()I")
	public final int method514() {
		if (field1282-- == 0) {
			method515();
			field1282 = 255;
		}

		return field1283[field1282];
	}

	@ObfuscatedName("UVSYUCDF.b()V")
	public final void method515() {
		field1286 += ++field1287;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1284[var1];

			if ((var1 & 0x3) == 0) {
				field1285 ^= field1285 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1285 ^= field1285 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1285 ^= field1285 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1285 ^= field1285 >>> 16;
			}

			field1285 += field1284[var1 + 128 & 0xFF];
			int var3;
			field1284[var1] = var3 = field1284[var2 >> 2 & 0xFF] + field1285 + field1286;
			field1283[var1] = field1286 = field1284[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("UVSYUCDF.c()V")
	public final void method516() {
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
			var8 += field1283[var10];
			var7 += field1283[var10 + 1];
			var6 += field1283[var10 + 2];
			var5 += field1283[var10 + 3];
			var4 += field1283[var10 + 4];
			var3 += field1283[var10 + 5];
			var2 += field1283[var10 + 6];
			var1 += field1283[var10 + 7];
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
			field1284[var10] = var8;
			field1284[var10 + 1] = var7;
			field1284[var10 + 2] = var6;
			field1284[var10 + 3] = var5;
			field1284[var10 + 4] = var4;
			field1284[var10 + 5] = var3;
			field1284[var10 + 6] = var2;
			field1284[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1284[var11];
			var7 += field1284[var11 + 1];
			var6 += field1284[var11 + 2];
			var5 += field1284[var11 + 3];
			var4 += field1284[var11 + 4];
			var3 += field1284[var11 + 5];
			var2 += field1284[var11 + 6];
			var1 += field1284[var11 + 7];
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
			field1284[var11] = var8;
			field1284[var11 + 1] = var7;
			field1284[var11 + 2] = var6;
			field1284[var11 + 3] = var5;
			field1284[var11 + 4] = var4;
			field1284[var11 + 5] = var3;
			field1284[var11 + 6] = var2;
			field1284[var11 + 7] = var1;
		}

		method515();
		field1282 = 256;
	}
}
