package deob;

@ObfuscatedName("BDQVRRZB")
public final class BDQVRRZB {

	@ObfuscatedName("BDQVRRZB.c")
	public int[] field15 = new int[256];

	@ObfuscatedName("BDQVRRZB.b")
	public int[] field14 = new int[256];

	@ObfuscatedName("BDQVRRZB.a")
	public int field13;

	@ObfuscatedName("BDQVRRZB.d")
	public int field16;

	@ObfuscatedName("BDQVRRZB.e")
	public int field17;

	@ObfuscatedName("BDQVRRZB.f")
	public int field18;

	public BDQVRRZB(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field14[var2] = arg0[var2];
		}

		method53();
	}

	@ObfuscatedName("BDQVRRZB.a()I")
	public final int method51() {
		if (field13-- == 0) {
			method52();
			field13 = 255;
		}

		return field14[field13];
	}

	@ObfuscatedName("BDQVRRZB.b()V")
	public final void method52() {
		field17 += ++field18;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field15[var1];

			if ((var1 & 0x3) == 0) {
				field16 ^= field16 << 13;
			} else if ((var1 & 0x3) == 1) {
				field16 ^= field16 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field16 ^= field16 << 2;
			} else if ((var1 & 0x3) == 3) {
				field16 ^= field16 >>> 16;
			}

			field16 += field15[var1 + 128 & 0xFF];
			int var3;
			field15[var1] = var3 = field15[var2 >> 2 & 0xFF] + field16 + field17;
			field14[var1] = field17 = field15[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("BDQVRRZB.c()V")
	public final void method53() {
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
			var8 += field14[var10];
			var7 += field14[var10 + 1];
			var6 += field14[var10 + 2];
			var5 += field14[var10 + 3];
			var4 += field14[var10 + 4];
			var3 += field14[var10 + 5];
			var2 += field14[var10 + 6];
			var1 += field14[var10 + 7];
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
			field15[var10] = var8;
			field15[var10 + 1] = var7;
			field15[var10 + 2] = var6;
			field15[var10 + 3] = var5;
			field15[var10 + 4] = var4;
			field15[var10 + 5] = var3;
			field15[var10 + 6] = var2;
			field15[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field15[var11];
			var7 += field15[var11 + 1];
			var6 += field15[var11 + 2];
			var5 += field15[var11 + 3];
			var4 += field15[var11 + 4];
			var3 += field15[var11 + 5];
			var2 += field15[var11 + 6];
			var1 += field15[var11 + 7];
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
			field15[var11] = var8;
			field15[var11 + 1] = var7;
			field15[var11 + 2] = var6;
			field15[var11 + 3] = var5;
			field15[var11 + 4] = var4;
			field15[var11 + 5] = var3;
			field15[var11 + 6] = var2;
			field15[var11 + 7] = var1;
		}

		method52();
		field13 = 256;
	}
}
