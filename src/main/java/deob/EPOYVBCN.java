package deob;

@ObfuscatedName("EPOYVBCN")
public final class EPOYVBCN extends AOBGXKOU {

	@ObfuscatedName("EPOYVBCN.v")
	public boolean field586 = false;

	@ObfuscatedName("EPOYVBCN.q")
	public CIVOPMKV field581;

	@ObfuscatedName("EPOYVBCN.r")
	public int field582;

	@ObfuscatedName("EPOYVBCN.s")
	public int field583;

	@ObfuscatedName("EPOYVBCN.t")
	public int field584;

	@ObfuscatedName("EPOYVBCN.u")
	public int field585;

	@ObfuscatedName("EPOYVBCN.w")
	public int field587;

	@ObfuscatedName("EPOYVBCN.n")
	public int field579;

	@ObfuscatedName("EPOYVBCN.o")
	public int field580;

	public EPOYVBCN(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field581 = CIVOPMKV.field114[arg6];
		field582 = arg3;
		field583 = arg0;
		field584 = arg1;
		field585 = arg4;
		field587 = arg2 + arg5;
		field586 = false;
	}

	@ObfuscatedName("EPOYVBCN.a(ZI)V")
	public final void method209(int arg0) {
		field580 += arg0;
		while (field580 > field581.field118.method591(field579)) {
			field580 -= field581.field118.method591(field579) + 1;
			field579++;
			if (field579 >= field581.field118.field1462 && (field579 < 0 || field579 >= field581.field118.field1462)) {
				field579 = 0;
				field586 = true;
			}
		}
	}

	@ObfuscatedName("EPOYVBCN.a(Z)LYABPKWWG;")
	public final YABPKWWG method16() {
		YABPKWWG var1 = field581.method32();
		if (var1 == null) {
			return null;
		}

		int var2 = field581.field118.field1463[field579];
		YABPKWWG var3 = new YABPKWWG(var1, HQHBJEDA.method219(var2), true, false);
		if (!field586) {
			var3.method555();
			var3.method556(var2);
			var3.field1415 = null;
			var3.field1414 = null;
		}

		if (field581.field121 != 128 || field581.field122 != 128) {
			var3.method564(field581.field122, field581.field121, field581.field121);
		}

		if (field581.field123 != 0) {
			if (field581.field123 == 90) {
				var3.method559();
			}

			if (field581.field123 == 180) {
				var3.method559();
				var3.method559();
			}

			if (field581.field123 == 270) {
				var3.method559();
				var3.method559();
				var3.method559();
			}
		}

		var3.method565(field581.field124 + 64, field581.field125 + 850, -30, -50, -30, true);
		return var3;
	}
}
