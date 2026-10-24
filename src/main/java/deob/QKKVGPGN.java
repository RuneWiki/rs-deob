package deob;

@ObfuscatedName("QKKVGPGN")
public final class QKKVGPGN {

	@ObfuscatedName("QKKVGPGN.c")
	public int[] field1134 = new int[256];

	@ObfuscatedName("QKKVGPGN.b")
	public int[] field1133 = new int[256];

	@ObfuscatedName("QKKVGPGN.a")
	public int field1132;

	@ObfuscatedName("QKKVGPGN.d")
	public int field1135;

	@ObfuscatedName("QKKVGPGN.e")
	public int field1136;

	@ObfuscatedName("QKKVGPGN.f")
	public int field1137;

	public QKKVGPGN(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1133[var2] = arg0[var2];
		}

		method477();
	}

	@ObfuscatedName("QKKVGPGN.a()I")
	public final int method475() {
		if (field1132-- == 0) {
			method476();
			field1132 = 255;
		}

		return field1133[field1132];
	}

	@ObfuscatedName("QKKVGPGN.b()V")
	public final void method476() {
		field1136 += ++field1137;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1134[var1];

			if ((var1 & 0x3) == 0) {
				field1135 ^= field1135 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1135 ^= field1135 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1135 ^= field1135 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1135 ^= field1135 >>> 16;
			}

			field1135 += field1134[var1 + 128 & 0xFF];
			int var3;
			field1134[var1] = var3 = field1134[var2 >> 2 & 0xFF] + field1135 + field1136;
			field1133[var1] = field1136 = field1134[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("QKKVGPGN.c()V")
	public final void method477() {
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
			var8 += field1133[var10];
			var7 += field1133[var10 + 1];
			var6 += field1133[var10 + 2];
			var5 += field1133[var10 + 3];
			var4 += field1133[var10 + 4];
			var3 += field1133[var10 + 5];
			var2 += field1133[var10 + 6];
			var1 += field1133[var10 + 7];
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
			field1134[var10] = var8;
			field1134[var10 + 1] = var7;
			field1134[var10 + 2] = var6;
			field1134[var10 + 3] = var5;
			field1134[var10 + 4] = var4;
			field1134[var10 + 5] = var3;
			field1134[var10 + 6] = var2;
			field1134[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1134[var11];
			var7 += field1134[var11 + 1];
			var6 += field1134[var11 + 2];
			var5 += field1134[var11 + 3];
			var4 += field1134[var11 + 4];
			var3 += field1134[var11 + 5];
			var2 += field1134[var11 + 6];
			var1 += field1134[var11 + 7];
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
			field1134[var11] = var8;
			field1134[var11 + 1] = var7;
			field1134[var11 + 2] = var6;
			field1134[var11 + 3] = var5;
			field1134[var11 + 4] = var4;
			field1134[var11 + 5] = var3;
			field1134[var11 + 6] = var2;
			field1134[var11 + 7] = var1;
		}

		method476();
		field1132 = 256;
	}
}
