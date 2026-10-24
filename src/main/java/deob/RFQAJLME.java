package deob;

@ObfuscatedName("RFQAJLME")
public final class RFQAJLME extends ZHYAQRMA {

	@ObfuscatedName("RFQAJLME.t")
	public boolean field1200 = false;

	@ObfuscatedName("RFQAJLME.n")
	public BYUDODIR field1194;

	@ObfuscatedName("RFQAJLME.o")
	public int field1195;

	@ObfuscatedName("RFQAJLME.p")
	public int field1196;

	@ObfuscatedName("RFQAJLME.q")
	public int field1197;

	@ObfuscatedName("RFQAJLME.r")
	public int field1198;

	@ObfuscatedName("RFQAJLME.s")
	public int field1199;

	@ObfuscatedName("RFQAJLME.l")
	public int field1192;

	@ObfuscatedName("RFQAJLME.m")
	public int field1193;

	@ObfuscatedName("RFQAJLME.a(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method171() {
		OQIGXOFQ var1 = field1194.method18();
		if (var1 == null) {
			return null;
		}

		int var2 = field1194.field38.field1341[field1192];
		OQIGXOFQ var3 = new OQIGXOFQ(XZZTWOGF.method582(var2), var1, false, true);
		if (!field1200) {
			var3.method398();
			var3.method399(var2);
			var3.field1066 = null;
			var3.field1065 = null;
		}

		if (field1194.field41 != 128 || field1194.field42 != 128) {
			var3.method407(field1194.field42, field1194.field41, field1194.field41);
		}

		if (field1194.field43 != 0) {
			if (field1194.field43 == 90) {
				var3.method402();
			}

			if (field1194.field43 == 180) {
				var3.method402();
				var3.method402();
			}

			if (field1194.field43 == 270) {
				var3.method402();
				var3.method402();
				var3.method402();
			}
		}

		var3.method408(field1194.field44 + 64, field1194.field45 + 850, -30, -50, -30, true);
		return var3;
	}

	public RFQAJLME(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1194 = BYUDODIR.field34[arg5];
		field1195 = arg0;
		field1196 = arg6;
		field1197 = arg2;
		field1198 = arg3;
		field1199 = arg1 + arg4;
		field1200 = false;
	}

	@ObfuscatedName("RFQAJLME.a(IZ)V")
	public final void method469(int arg0) {
		field1193 += arg0;
		while (field1193 > field1194.field38.method525(field1192)) {
			field1193 -= field1194.field38.method525(field1192) + 1;
			field1192++;
			if (field1192 >= field1194.field38.field1340 && (field1192 < 0 || field1192 >= field1194.field38.field1340)) {
				field1192 = 0;
				field1200 = true;
			}
		}
	}
}
