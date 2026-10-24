package deob;

@ObfuscatedName("LAFREBFM")
public final class LAFREBFM {

	@ObfuscatedName("LAFREBFM.c")
	public int[] field933 = new int[256];

	@ObfuscatedName("LAFREBFM.b")
	public int[] field932 = new int[256];

	@ObfuscatedName("LAFREBFM.a")
	public int field931;

	@ObfuscatedName("LAFREBFM.d")
	public int field934;

	@ObfuscatedName("LAFREBFM.e")
	public int field935;

	@ObfuscatedName("LAFREBFM.f")
	public int field936;

	public LAFREBFM(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field932[var2] = arg0[var2];
		}

		method407();
	}

	@ObfuscatedName("LAFREBFM.a()I")
	public final int method405() {
		if (field931-- == 0) {
			method406();
			field931 = 255;
		}

		return field932[field931];
	}

	@ObfuscatedName("LAFREBFM.b()V")
	public final void method406() {
		field935 += ++field936;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field933[var1];

			if ((var1 & 0x3) == 0) {
				field934 ^= field934 << 13;
			} else if ((var1 & 0x3) == 1) {
				field934 ^= field934 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field934 ^= field934 << 2;
			} else if ((var1 & 0x3) == 3) {
				field934 ^= field934 >>> 16;
			}

			field934 += field933[var1 + 128 & 0xFF];
			int var3;
			field933[var1] = var3 = field933[var2 >> 2 & 0xFF] + field934 + field935;
			field932[var1] = field935 = field933[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("LAFREBFM.c()V")
	public final void method407() {
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
			var8 += field932[var10];
			var7 += field932[var10 + 1];
			var6 += field932[var10 + 2];
			var5 += field932[var10 + 3];
			var4 += field932[var10 + 4];
			var3 += field932[var10 + 5];
			var2 += field932[var10 + 6];
			var1 += field932[var10 + 7];
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
			field933[var10] = var8;
			field933[var10 + 1] = var7;
			field933[var10 + 2] = var6;
			field933[var10 + 3] = var5;
			field933[var10 + 4] = var4;
			field933[var10 + 5] = var3;
			field933[var10 + 6] = var2;
			field933[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field933[var11];
			var7 += field933[var11 + 1];
			var6 += field933[var11 + 2];
			var5 += field933[var11 + 3];
			var4 += field933[var11 + 4];
			var3 += field933[var11 + 5];
			var2 += field933[var11 + 6];
			var1 += field933[var11 + 7];
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
			field933[var11] = var8;
			field933[var11 + 1] = var7;
			field933[var11 + 2] = var6;
			field933[var11 + 3] = var5;
			field933[var11 + 4] = var4;
			field933[var11 + 5] = var3;
			field933[var11 + 6] = var2;
			field933[var11 + 7] = var1;
		}

		method406();
		field931 = 256;
	}
}
