package deob;

@ObfuscatedName("RDFTSKWD")
public final class RDFTSKWD extends BSABUCFC {

	@ObfuscatedName("RDFTSKWD.o")
	public boolean field1142 = false;

	@ObfuscatedName("RDFTSKWD.p")
	public TYXORIIC field1143;

	@ObfuscatedName("RDFTSKWD.r")
	public int field1144;

	@ObfuscatedName("RDFTSKWD.s")
	public int field1145;

	@ObfuscatedName("RDFTSKWD.t")
	public int field1146;

	@ObfuscatedName("RDFTSKWD.u")
	public int field1147;

	@ObfuscatedName("RDFTSKWD.m")
	public int field1141;

	@ObfuscatedName("RDFTSKWD.k")
	public int field1139;

	@ObfuscatedName("RDFTSKWD.l")
	public int field1140;

	public RDFTSKWD(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1143 = TYXORIIC.field1248[arg3];
		field1144 = arg0;
		field1145 = arg6;
		field1146 = arg1;
		field1147 = arg5;
		field1141 = arg2 + arg4;
		field1142 = false;
	}

	@ObfuscatedName("RDFTSKWD.a(II)V")
	public final void method407(int arg0) {
		field1140 += arg0;
		while (field1140 > field1143.field1252.method390(field1139)) {
			field1140 -= field1143.field1252.method390(field1139);
			field1139++;
			if (field1139 >= field1143.field1252.field1007 && (field1139 < 0 || field1139 >= field1143.field1252.field1007)) {
				field1139 = 0;
				field1142 = true;
			}
		}
	}

	@ObfuscatedName("RDFTSKWD.a(B)LUNLYQRUD;")
	public final UNLYQRUD method10() {
		UNLYQRUD var1 = field1143.method436();
		if (var1 == null) {
			return null;
		}

		int var2 = field1143.field1252.field1008[field1139];
		UNLYQRUD var3 = new UNLYQRUD(true, var1, false, DHMWVSMI.method178(var2));
		if (!field1142) {
			var3.method449();
			var3.method450(var2);
			var3.field1299 = null;
			var3.field1298 = null;
		}

		if (field1143.field1255 != 128 || field1143.field1256 != 128) {
			var3.method458(field1143.field1255, field1143.field1256, field1143.field1255);
		}

		if (field1143.field1257 != 0) {
			if (field1143.field1257 == 90) {
				var3.method453();
			}

			if (field1143.field1257 == 180) {
				var3.method453();
				var3.method453();
			}

			if (field1143.field1257 == 270) {
				var3.method453();
				var3.method453();
				var3.method453();
			}
		}

		var3.method459(field1143.field1258 + 64, field1143.field1259 + 850, -30, -50, -30, true);
		return var3;
	}
}
