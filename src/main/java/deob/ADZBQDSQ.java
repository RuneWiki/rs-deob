package deob;

@ObfuscatedName("ADZBQDSQ")
public final class ADZBQDSQ {

	@ObfuscatedName("ADZBQDSQ.c")
	public int[] field17 = new int[256];

	@ObfuscatedName("ADZBQDSQ.b")
	public int[] field16 = new int[256];

	@ObfuscatedName("ADZBQDSQ.a")
	public int field15;

	@ObfuscatedName("ADZBQDSQ.d")
	public int field18;

	@ObfuscatedName("ADZBQDSQ.e")
	public int field19;

	@ObfuscatedName("ADZBQDSQ.f")
	public int field20;

	public ADZBQDSQ(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field16[var2] = arg0[var2];
		}

		method5();
	}

	@ObfuscatedName("ADZBQDSQ.a()I")
	public final int method3() {
		if (field15-- == 0) {
			method4();
			field15 = 255;
		}

		return field16[field15];
	}

	@ObfuscatedName("ADZBQDSQ.b()V")
	public final void method4() {
		field19 += ++field20;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field17[var1];

			if ((var1 & 0x3) == 0) {
				field18 ^= field18 << 13;
			} else if ((var1 & 0x3) == 1) {
				field18 ^= field18 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field18 ^= field18 << 2;
			} else if ((var1 & 0x3) == 3) {
				field18 ^= field18 >>> 16;
			}

			field18 += field17[var1 + 128 & 0xFF];
			int var3;
			field17[var1] = var3 = field17[var2 >> 2 & 0xFF] + field18 + field19;
			field16[var1] = field19 = field17[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("ADZBQDSQ.c()V")
	public final void method5() {
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
			var8 += field16[var10];
			var7 += field16[var10 + 1];
			var6 += field16[var10 + 2];
			var5 += field16[var10 + 3];
			var4 += field16[var10 + 4];
			var3 += field16[var10 + 5];
			var2 += field16[var10 + 6];
			var1 += field16[var10 + 7];
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
			field17[var10] = var8;
			field17[var10 + 1] = var7;
			field17[var10 + 2] = var6;
			field17[var10 + 3] = var5;
			field17[var10 + 4] = var4;
			field17[var10 + 5] = var3;
			field17[var10 + 6] = var2;
			field17[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field17[var11];
			var7 += field17[var11 + 1];
			var6 += field17[var11 + 2];
			var5 += field17[var11 + 3];
			var4 += field17[var11 + 4];
			var3 += field17[var11 + 5];
			var2 += field17[var11 + 6];
			var1 += field17[var11 + 7];
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
			field17[var11] = var8;
			field17[var11 + 1] = var7;
			field17[var11 + 2] = var6;
			field17[var11 + 3] = var5;
			field17[var11 + 4] = var4;
			field17[var11 + 5] = var3;
			field17[var11 + 6] = var2;
			field17[var11 + 7] = var1;
		}

		method4();
		field15 = 256;
	}
}
