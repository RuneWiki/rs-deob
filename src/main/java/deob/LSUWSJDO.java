package deob;

@ObfuscatedName("LSUWSJDO")
public final class LSUWSJDO {

	@ObfuscatedName("LSUWSJDO.c")
	public NZLAJIAU field1133 = new NZLAJIAU();

	@ObfuscatedName("LSUWSJDO.g")
	public HMYWYVEI field1137 = new HMYWYVEI();

	@ObfuscatedName("LSUWSJDO.d")
	public int field1134;

	@ObfuscatedName("LSUWSJDO.e")
	public int field1135;

	@ObfuscatedName("LSUWSJDO.f")
	public YRNGVJHE field1136;

	@ObfuscatedName("LSUWSJDO.a")
	public int field1131;

	@ObfuscatedName("LSUWSJDO.b")
	public int field1132;

	public LSUWSJDO(int arg0) {
		field1134 = arg0;
		field1135 = arg0;
		field1136 = new YRNGVJHE(1024);
	}

	@ObfuscatedName("LSUWSJDO.a(J)LNZLAJIAU;")
	public NZLAJIAU method448(long arg0) {
		NZLAJIAU var3 = (NZLAJIAU) field1136.method600(arg0);
		if (var3 == null) {
			field1131++;
		} else {
			field1137.method371(var3);
			field1132++;
		}

		return var3;
	}

	@ObfuscatedName("LSUWSJDO.a(LNZLAJIAU;IJ)V")
	public void method449(NZLAJIAU arg0, long arg1) {
		if (field1135 == 0) {
			NZLAJIAU var4 = field1137.method372();
			var4.method579();
			var4.method512();

			if (field1133 == var4) {
				NZLAJIAU var5 = field1137.method372();
				var5.method579();
				var5.method512();
			}
		} else {
			field1135--;
		}

		field1136.method601(arg1, arg0);
		field1137.method371(arg0);
	}

	@ObfuscatedName("LSUWSJDO.a()V")
	public void method450() {
		while (true) {
			NZLAJIAU var1 = field1137.method372();
			if (var1 == null) {
				field1135 = field1134;
				return;
			}

			var1.method579();
			var1.method512();
		}
	}
}
