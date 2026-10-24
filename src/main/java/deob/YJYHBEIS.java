package deob;

@ObfuscatedName("YJYHBEIS")
public final class YJYHBEIS {

	@ObfuscatedName("YJYHBEIS.c")
	public int[] field1362 = new int[256];

	@ObfuscatedName("YJYHBEIS.b")
	public int[] field1361 = new int[256];

	@ObfuscatedName("YJYHBEIS.a")
	public int field1360;

	@ObfuscatedName("YJYHBEIS.d")
	public int field1363;

	@ObfuscatedName("YJYHBEIS.e")
	public int field1364;

	@ObfuscatedName("YJYHBEIS.f")
	public int field1365;

	public YJYHBEIS(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1361[var2] = arg0[var2];
		}

		method498();
	}

	@ObfuscatedName("YJYHBEIS.a()I")
	public final int method496() {
		if (field1360-- == 0) {
			method497();
			field1360 = 255;
		}

		return field1361[field1360];
	}

	@ObfuscatedName("YJYHBEIS.b()V")
	public final void method497() {
		field1364 += ++field1365;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1362[var1];

			if ((var1 & 0x3) == 0) {
				field1363 ^= field1363 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1363 ^= field1363 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1363 ^= field1363 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1363 ^= field1363 >>> 16;
			}

			field1363 += field1362[var1 + 128 & 0xFF];
			int var3;
			field1362[var1] = var3 = field1362[var2 >> 2 & 0xFF] + field1363 + field1364;
			field1361[var1] = field1364 = field1362[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("YJYHBEIS.c()V")
	public final void method498() {
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
			var8 += field1361[var10];
			var7 += field1361[var10 + 1];
			var6 += field1361[var10 + 2];
			var5 += field1361[var10 + 3];
			var4 += field1361[var10 + 4];
			var3 += field1361[var10 + 5];
			var2 += field1361[var10 + 6];
			var1 += field1361[var10 + 7];
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
			field1362[var10] = var8;
			field1362[var10 + 1] = var7;
			field1362[var10 + 2] = var6;
			field1362[var10 + 3] = var5;
			field1362[var10 + 4] = var4;
			field1362[var10 + 5] = var3;
			field1362[var10 + 6] = var2;
			field1362[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1362[var11];
			var7 += field1362[var11 + 1];
			var6 += field1362[var11 + 2];
			var5 += field1362[var11 + 3];
			var4 += field1362[var11 + 4];
			var3 += field1362[var11 + 5];
			var2 += field1362[var11 + 6];
			var1 += field1362[var11 + 7];
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
			field1362[var11] = var8;
			field1362[var11 + 1] = var7;
			field1362[var11 + 2] = var6;
			field1362[var11 + 3] = var5;
			field1362[var11 + 4] = var4;
			field1362[var11 + 5] = var3;
			field1362[var11 + 6] = var2;
			field1362[var11 + 7] = var1;
		}

		method497();
		field1360 = 256;
	}
}
