package deob;

@ObfuscatedName("XXMIBCTG")
public final class XXMIBCTG {

	@ObfuscatedName("XXMIBCTG.d")
	public int[] field1440 = new int[256];

	@ObfuscatedName("XXMIBCTG.c")
	public int[] field1439 = new int[256];

	@ObfuscatedName("XXMIBCTG.b")
	public int field1438;

	@ObfuscatedName("XXMIBCTG.e")
	public int field1441;

	@ObfuscatedName("XXMIBCTG.f")
	public int field1442;

	@ObfuscatedName("XXMIBCTG.g")
	public int field1443;

	public XXMIBCTG(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1439[var2] = arg0[var2];
		}

		method589();
	}

	@ObfuscatedName("XXMIBCTG.a()I")
	public final int method587() {
		if (field1438-- == 0) {
			method588();
			field1438 = 255;
		}

		return field1439[field1438];
	}

	@ObfuscatedName("XXMIBCTG.b()V")
	public final void method588() {
		field1442 += ++field1443;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1440[var1];

			if ((var1 & 0x3) == 0) {
				field1441 ^= field1441 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1441 ^= field1441 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1441 ^= field1441 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1441 ^= field1441 >>> 16;
			}

			field1441 += field1440[var1 + 128 & 0xFF];
			int var3;
			field1440[var1] = var3 = field1440[var2 >> 2 & 0xFF] + field1441 + field1442;
			field1439[var1] = field1442 = field1440[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("XXMIBCTG.c()V")
	public final void method589() {
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
			var8 += field1439[var10];
			var7 += field1439[var10 + 1];
			var6 += field1439[var10 + 2];
			var5 += field1439[var10 + 3];
			var4 += field1439[var10 + 4];
			var3 += field1439[var10 + 5];
			var2 += field1439[var10 + 6];
			var1 += field1439[var10 + 7];
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
			field1440[var10] = var8;
			field1440[var10 + 1] = var7;
			field1440[var10 + 2] = var6;
			field1440[var10 + 3] = var5;
			field1440[var10 + 4] = var4;
			field1440[var10 + 5] = var3;
			field1440[var10 + 6] = var2;
			field1440[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1440[var11];
			var7 += field1440[var11 + 1];
			var6 += field1440[var11 + 2];
			var5 += field1440[var11 + 3];
			var4 += field1440[var11 + 4];
			var3 += field1440[var11 + 5];
			var2 += field1440[var11 + 6];
			var1 += field1440[var11 + 7];
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
			field1440[var11] = var8;
			field1440[var11 + 1] = var7;
			field1440[var11 + 2] = var6;
			field1440[var11 + 3] = var5;
			field1440[var11 + 4] = var4;
			field1440[var11 + 5] = var3;
			field1440[var11 + 6] = var2;
			field1440[var11 + 7] = var1;
		}

		method588();
		field1438 = 256;
	}
}
