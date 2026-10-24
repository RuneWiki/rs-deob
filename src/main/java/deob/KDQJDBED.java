package deob;

@ObfuscatedName("KDQJDBED")
public final class KDQJDBED {

	@ObfuscatedName("KDQJDBED.c")
	public int[] field807 = new int[256];

	@ObfuscatedName("KDQJDBED.b")
	public int[] field806 = new int[256];

	@ObfuscatedName("KDQJDBED.a")
	public int field805;

	@ObfuscatedName("KDQJDBED.d")
	public int field808;

	@ObfuscatedName("KDQJDBED.e")
	public int field809;

	@ObfuscatedName("KDQJDBED.f")
	public int field810;

	public KDQJDBED(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field806[var2] = arg0[var2];
		}

		method319();
	}

	@ObfuscatedName("KDQJDBED.a()I")
	public final int method317() {
		if (field805-- == 0) {
			method318();
			field805 = 255;
		}

		return field806[field805];
	}

	@ObfuscatedName("KDQJDBED.b()V")
	public final void method318() {
		field809 += ++field810;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field807[var1];

			if ((var1 & 0x3) == 0) {
				field808 ^= field808 << 13;
			} else if ((var1 & 0x3) == 1) {
				field808 ^= field808 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field808 ^= field808 << 2;
			} else if ((var1 & 0x3) == 3) {
				field808 ^= field808 >>> 16;
			}

			field808 += field807[var1 + 128 & 0xFF];
			int var3;
			field807[var1] = var3 = field807[var2 >> 2 & 0xFF] + field808 + field809;
			field806[var1] = field809 = field807[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("KDQJDBED.c()V")
	public final void method319() {
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
			var8 += field806[var10];
			var7 += field806[var10 + 1];
			var6 += field806[var10 + 2];
			var5 += field806[var10 + 3];
			var4 += field806[var10 + 4];
			var3 += field806[var10 + 5];
			var2 += field806[var10 + 6];
			var1 += field806[var10 + 7];
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
			field807[var10] = var8;
			field807[var10 + 1] = var7;
			field807[var10 + 2] = var6;
			field807[var10 + 3] = var5;
			field807[var10 + 4] = var4;
			field807[var10 + 5] = var3;
			field807[var10 + 6] = var2;
			field807[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field807[var11];
			var7 += field807[var11 + 1];
			var6 += field807[var11 + 2];
			var5 += field807[var11 + 3];
			var4 += field807[var11 + 4];
			var3 += field807[var11 + 5];
			var2 += field807[var11 + 6];
			var1 += field807[var11 + 7];
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
			field807[var11] = var8;
			field807[var11 + 1] = var7;
			field807[var11 + 2] = var6;
			field807[var11 + 3] = var5;
			field807[var11 + 4] = var4;
			field807[var11 + 5] = var3;
			field807[var11 + 6] = var2;
			field807[var11 + 7] = var1;
		}

		method318();
		field805 = 256;
	}
}
