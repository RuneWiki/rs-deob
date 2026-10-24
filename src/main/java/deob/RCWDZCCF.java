package deob;

@ObfuscatedName("RCWDZCCF")
public final class RCWDZCCF {

	@ObfuscatedName("RCWDZCCF.c")
	public int[] field907 = new int[256];

	@ObfuscatedName("RCWDZCCF.b")
	public int[] field906 = new int[256];

	@ObfuscatedName("RCWDZCCF.a")
	public int field905;

	@ObfuscatedName("RCWDZCCF.d")
	public int field908;

	@ObfuscatedName("RCWDZCCF.e")
	public int field909;

	@ObfuscatedName("RCWDZCCF.f")
	public int field910;

	public RCWDZCCF(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field906[var2] = arg0[var2];
		}

		method404();
	}

	@ObfuscatedName("RCWDZCCF.a()I")
	public final int method402() {
		if (field905-- == 0) {
			method403();
			field905 = 255;
		}

		return field906[field905];
	}

	@ObfuscatedName("RCWDZCCF.b()V")
	public final void method403() {
		field909 += ++field910;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field907[var1];

			if ((var1 & 0x3) == 0) {
				field908 ^= field908 << 13;
			} else if ((var1 & 0x3) == 1) {
				field908 ^= field908 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field908 ^= field908 << 2;
			} else if ((var1 & 0x3) == 3) {
				field908 ^= field908 >>> 16;
			}

			field908 += field907[var1 + 128 & 0xFF];
			int var3;
			field907[var1] = var3 = field907[var2 >> 2 & 0xFF] + field908 + field909;
			field906[var1] = field909 = field907[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("RCWDZCCF.c()V")
	public final void method404() {
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
			var8 += field906[var10];
			var7 += field906[var10 + 1];
			var6 += field906[var10 + 2];
			var5 += field906[var10 + 3];
			var4 += field906[var10 + 4];
			var3 += field906[var10 + 5];
			var2 += field906[var10 + 6];
			var1 += field906[var10 + 7];
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
			field907[var10] = var8;
			field907[var10 + 1] = var7;
			field907[var10 + 2] = var6;
			field907[var10 + 3] = var5;
			field907[var10 + 4] = var4;
			field907[var10 + 5] = var3;
			field907[var10 + 6] = var2;
			field907[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field907[var11];
			var7 += field907[var11 + 1];
			var6 += field907[var11 + 2];
			var5 += field907[var11 + 3];
			var4 += field907[var11 + 4];
			var3 += field907[var11 + 5];
			var2 += field907[var11 + 6];
			var1 += field907[var11 + 7];
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
			field907[var11] = var8;
			field907[var11 + 1] = var7;
			field907[var11 + 2] = var6;
			field907[var11 + 3] = var5;
			field907[var11 + 4] = var4;
			field907[var11 + 5] = var3;
			field907[var11 + 6] = var2;
			field907[var11 + 7] = var1;
		}

		method403();
		field905 = 256;
	}
}
