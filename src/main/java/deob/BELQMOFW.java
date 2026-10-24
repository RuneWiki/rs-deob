package deob;

@ObfuscatedName("BELQMOFW")
public final class BELQMOFW {

	@ObfuscatedName("BELQMOFW.b")
	public int field31;

	@ObfuscatedName("BELQMOFW.c")
	public CDEGFOQA[] field32;

	public BELQMOFW(int arg0) {
		field31 = arg0;
		field32 = new CDEGFOQA[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			CDEGFOQA var3 = field32[var2] = new CDEGFOQA();
			var3.field48 = var3;
			var3.field49 = var3;
		}
	}

	@ObfuscatedName("BELQMOFW.a(J)LCDEGFOQA;")
	public CDEGFOQA method14(long arg0) {
		CDEGFOQA var3 = field32[(int) (arg0 & field31 - 1)];
		for (CDEGFOQA var4 = var3.field48; var4 != var3; var4 = var4.field48) {
			if (var4.field47 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("BELQMOFW.a(JLCDEGFOQA;B)V")
	public void method15(long arg0, CDEGFOQA arg1) {
		if (arg1.field49 != null) {
			arg1.method19();
		}

		CDEGFOQA var4 = field32[(int) (arg0 & field31 - 1)];
		arg1.field49 = var4.field49;
		arg1.field48 = var4;
		arg1.field49.field48 = arg1;
		arg1.field48.field49 = arg1;
		arg1.field47 = arg0;
	}
}
