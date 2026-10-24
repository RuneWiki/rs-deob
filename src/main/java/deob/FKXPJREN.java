package deob;

@ObfuscatedName("FKXPJREN")
public final class FKXPJREN {

	@ObfuscatedName("FKXPJREN.d")
	public int[] field697 = new int[256];

	@ObfuscatedName("FKXPJREN.c")
	public int[] field696 = new int[256];

	@ObfuscatedName("FKXPJREN.b")
	public int field695;

	@ObfuscatedName("FKXPJREN.e")
	public int field698;

	@ObfuscatedName("FKXPJREN.f")
	public int field699;

	@ObfuscatedName("FKXPJREN.g")
	public int field700;

	public FKXPJREN(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field696[var2] = arg0[var2];
		}

		method203();
	}

	@ObfuscatedName("FKXPJREN.a()I")
	public final int method201() {
		if (field695-- == 0) {
			method202();
			field695 = 255;
		}

		return field696[field695];
	}

	@ObfuscatedName("FKXPJREN.b()V")
	public final void method202() {
		field699 += ++field700;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field697[var1];

			if ((var1 & 0x3) == 0) {
				field698 ^= field698 << 13;
			} else if ((var1 & 0x3) == 1) {
				field698 ^= field698 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field698 ^= field698 << 2;
			} else if ((var1 & 0x3) == 3) {
				field698 ^= field698 >>> 16;
			}

			field698 += field697[var1 + 128 & 0xFF];
			int var3;
			field697[var1] = var3 = field697[var2 >> 2 & 0xFF] + field698 + field699;
			field696[var1] = field699 = field697[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("FKXPJREN.c()V")
	public final void method203() {
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
			var8 += field696[var10];
			var7 += field696[var10 + 1];
			var6 += field696[var10 + 2];
			var5 += field696[var10 + 3];
			var4 += field696[var10 + 4];
			var3 += field696[var10 + 5];
			var2 += field696[var10 + 6];
			var1 += field696[var10 + 7];
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
			field697[var10] = var8;
			field697[var10 + 1] = var7;
			field697[var10 + 2] = var6;
			field697[var10 + 3] = var5;
			field697[var10 + 4] = var4;
			field697[var10 + 5] = var3;
			field697[var10 + 6] = var2;
			field697[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field697[var11];
			var7 += field697[var11 + 1];
			var6 += field697[var11 + 2];
			var5 += field697[var11 + 3];
			var4 += field697[var11 + 4];
			var3 += field697[var11 + 5];
			var2 += field697[var11 + 6];
			var1 += field697[var11 + 7];
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
			field697[var11] = var8;
			field697[var11 + 1] = var7;
			field697[var11 + 2] = var6;
			field697[var11 + 3] = var5;
			field697[var11 + 4] = var4;
			field697[var11 + 5] = var3;
			field697[var11 + 6] = var2;
			field697[var11 + 7] = var1;
		}

		method202();
		field695 = 256;
	}
}
