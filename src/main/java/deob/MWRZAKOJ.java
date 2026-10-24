package deob;

@ObfuscatedName("MWRZAKOJ")
public class MWRZAKOJ {

	@ObfuscatedName("MWRZAKOJ.d")
	public int field1063;

	@ObfuscatedName("MWRZAKOJ.g")
	public int field1066;

	@ObfuscatedName("MWRZAKOJ.h")
	public int field1067;

	@ObfuscatedName("MWRZAKOJ.i")
	public int field1068;

	@ObfuscatedName("MWRZAKOJ.j")
	public int field1069;

	@ObfuscatedName("MWRZAKOJ.k")
	public int field1070;

	@ObfuscatedName("MWRZAKOJ.l")
	public int field1071;

	@ObfuscatedName("MWRZAKOJ.m")
	public int field1072;

	@ObfuscatedName("MWRZAKOJ.n")
	public int field1073;

	@ObfuscatedName("MWRZAKOJ.e")
	public int[] field1064;

	@ObfuscatedName("MWRZAKOJ.f")
	public int[] field1065;

	@ObfuscatedName("MWRZAKOJ.a(LIUVBENCV;B)V")
	public final void method358(IUVBENCV arg0) {
		field1068 = arg0.method245();
		field1066 = arg0.method250();
		field1067 = arg0.method250();
		method359(arg0);
	}

	@ObfuscatedName("MWRZAKOJ.b(LIUVBENCV;B)V")
	public final void method359(IUVBENCV arg0) {
		field1063 = arg0.method245();
		field1064 = new int[field1063];
		field1065 = new int[field1063];
		for (int var2 = 0; var2 < field1063; var2++) {
			field1064[var2] = arg0.method247();
			field1065[var2] = arg0.method247();
		}
	}

	@ObfuscatedName("MWRZAKOJ.a(Z)V")
	public final void method360() {
		field1069 = 0;
		field1070 = 0;
		field1071 = 0;
		field1072 = 0;
		field1073 = 0;
	}

	@ObfuscatedName("MWRZAKOJ.a(II)I")
	public final int method361(int arg0) {
		if (field1073 >= field1069) {
			field1072 = field1065[field1070++] << 15;

			if (field1070 >= field1063) {
				field1070 = field1063 - 1;
			}

			field1069 = (int) (field1064[field1070] / 65536.0D * arg0);
			if (field1069 > field1073) {
				field1071 = ((field1065[field1070] << 15) - field1072) / (field1069 - field1073);
			}
		}

		field1072 += field1071;
		field1073++;
		return field1072 - field1071 >> 15;
	}
}
