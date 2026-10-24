package deob;

@ObfuscatedName("DIFURFJI")
public final class DIFURFJI {

	@ObfuscatedName("DIFURFJI.c")
	public int field595;

	@ObfuscatedName("DIFURFJI.d")
	public OJTWJXEY[] field596;

	public DIFURFJI(int arg0) {
		field595 = arg0;
		field596 = new OJTWJXEY[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OJTWJXEY var3 = field596[var2] = new OJTWJXEY();
			var3.field905 = var3;
			var3.field906 = var3;
		}
	}

	@ObfuscatedName("DIFURFJI.a(J)LOJTWJXEY;")
	public OJTWJXEY method200(long arg0) {
		OJTWJXEY var3 = field596[(int) (arg0 & field595 - 1)];
		for (OJTWJXEY var4 = var3.field905; var4 != var3; var4 = var4.field905) {
			if (var4.field904 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("DIFURFJI.a(JLOJTWJXEY;Z)V")
	public void method201(long arg0, OJTWJXEY arg1) {
		if (arg1.field906 != null) {
			arg1.method338();
		}

		OJTWJXEY var4 = field596[(int) (arg0 & field595 - 1)];
		arg1.field906 = var4.field906;
		arg1.field905 = var4;
		arg1.field906.field905 = arg1;
		arg1.field905.field906 = arg1;
		arg1.field904 = arg0;
	}
}
