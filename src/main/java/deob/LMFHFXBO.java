package deob;

@ObfuscatedName("LMFHFXBO")
public class LMFHFXBO {

	@ObfuscatedName("LMFHFXBO.l")
	public int field1000;

	@ObfuscatedName("LMFHFXBO.b")
	public int field990;

	@ObfuscatedName("LMFHFXBO.e")
	public int field993;

	@ObfuscatedName("LMFHFXBO.f")
	public int field994;

	@ObfuscatedName("LMFHFXBO.g")
	public int field995;

	@ObfuscatedName("LMFHFXBO.h")
	public int field996;

	@ObfuscatedName("LMFHFXBO.i")
	public int field997;

	@ObfuscatedName("LMFHFXBO.j")
	public int field998;

	@ObfuscatedName("LMFHFXBO.k")
	public int field999;

	@ObfuscatedName("LMFHFXBO.c")
	public int[] field991;

	@ObfuscatedName("LMFHFXBO.d")
	public int[] field992;

	@ObfuscatedName("LMFHFXBO.a(LMNKDCXXG;I)V")
	public final void method356(MNKDCXXG arg0) {
		field995 = arg0.method386();
		field993 = arg0.method391();
		field994 = arg0.method391();
		method357(arg0);
	}

	@ObfuscatedName("LMFHFXBO.a(ILMNKDCXXG;)V")
	public final void method357(MNKDCXXG arg0) {
		field990 = arg0.method386();
		field991 = new int[field990];
		field992 = new int[field990];
		for (int var2 = 0; var2 < field990; var2++) {
			field991[var2] = arg0.method388();
			field992[var2] = arg0.method388();
		}
	}

	@ObfuscatedName("LMFHFXBO.a(B)V")
	public final void method358() {
		field996 = 0;
		field997 = 0;
		field998 = 0;
		field999 = 0;
		field1000 = 0;
	}

	@ObfuscatedName("LMFHFXBO.a(II)I")
	public final int method359(int arg0) {
		if (field1000 >= field996) {
			field999 = field992[field997++] << 15;

			if (field997 >= field990) {
				field997 = field990 - 1;
			}

			field996 = (int) (field991[field997] / 65536.0D * arg0);
			if (field996 > field1000) {
				field998 = ((field992[field997] << 15) - field999) / (field996 - field1000);
			}
		}

		field999 += field998;
		field1000++;
		return field999 - field998 >> 15;
	}
}
