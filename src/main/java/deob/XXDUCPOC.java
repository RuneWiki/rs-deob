package deob;

@ObfuscatedName("XXDUCPOC")
public final class XXDUCPOC {

	@ObfuscatedName("XXDUCPOC.c")
	public int[] field1373 = new int[256];

	@ObfuscatedName("XXDUCPOC.b")
	public int[] field1372 = new int[256];

	@ObfuscatedName("XXDUCPOC.a")
	public int field1371;

	@ObfuscatedName("XXDUCPOC.d")
	public int field1374;

	@ObfuscatedName("XXDUCPOC.e")
	public int field1375;

	@ObfuscatedName("XXDUCPOC.f")
	public int field1376;

	public XXDUCPOC(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1372[var2] = arg0[var2];
		}

		method543();
	}

	@ObfuscatedName("XXDUCPOC.a()I")
	public final int method541() {
		if (field1371-- == 0) {
			method542();
			field1371 = 255;
		}

		return field1372[field1371];
	}

	@ObfuscatedName("XXDUCPOC.b()V")
	public final void method542() {
		field1375 += ++field1376;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1373[var1];

			if ((var1 & 0x3) == 0) {
				field1374 ^= field1374 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1374 ^= field1374 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1374 ^= field1374 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1374 ^= field1374 >>> 16;
			}

			field1374 += field1373[var1 + 128 & 0xFF];
			int var3;
			field1373[var1] = var3 = field1373[var2 >> 2 & 0xFF] + field1374 + field1375;
			field1372[var1] = field1375 = field1373[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("XXDUCPOC.c()V")
	public final void method543() {
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
			var8 += field1372[var10];
			var7 += field1372[var10 + 1];
			var6 += field1372[var10 + 2];
			var5 += field1372[var10 + 3];
			var4 += field1372[var10 + 4];
			var3 += field1372[var10 + 5];
			var2 += field1372[var10 + 6];
			var1 += field1372[var10 + 7];
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
			field1373[var10] = var8;
			field1373[var10 + 1] = var7;
			field1373[var10 + 2] = var6;
			field1373[var10 + 3] = var5;
			field1373[var10 + 4] = var4;
			field1373[var10 + 5] = var3;
			field1373[var10 + 6] = var2;
			field1373[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1373[var11];
			var7 += field1373[var11 + 1];
			var6 += field1373[var11 + 2];
			var5 += field1373[var11 + 3];
			var4 += field1373[var11 + 4];
			var3 += field1373[var11 + 5];
			var2 += field1373[var11 + 6];
			var1 += field1373[var11 + 7];
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
			field1373[var11] = var8;
			field1373[var11 + 1] = var7;
			field1373[var11 + 2] = var6;
			field1373[var11 + 3] = var5;
			field1373[var11 + 4] = var4;
			field1373[var11 + 5] = var3;
			field1373[var11 + 6] = var2;
			field1373[var11 + 7] = var1;
		}

		method542();
		field1371 = 256;
	}
}
