package deob;

@ObfuscatedName("QFKXENAK")
public final class QFKXENAK extends XEUTUWWF {

	@ObfuscatedName("QFKXENAK.m")
	public boolean field1103 = false;

	@ObfuscatedName("QFKXENAK.l")
	public NGIGHQOG field1102;

	@ObfuscatedName("QFKXENAK.r")
	public int field1107;

	@ObfuscatedName("QFKXENAK.s")
	public int field1108;

	@ObfuscatedName("QFKXENAK.t")
	public int field1109;

	@ObfuscatedName("QFKXENAK.u")
	public int field1110;

	@ObfuscatedName("QFKXENAK.o")
	public int field1104;

	@ObfuscatedName("QFKXENAK.p")
	public int field1105;

	@ObfuscatedName("QFKXENAK.q")
	public int field1106;

	public QFKXENAK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1102 = NGIGHQOG.field986[arg0];
		field1107 = arg4;
		field1108 = arg5;
		field1109 = arg3;
		field1110 = arg2;
		field1104 = arg1 + arg6;
		field1103 = false;
	}

	@ObfuscatedName("QFKXENAK.a(IZ)V")
	public final void method392(int arg0) {
		field1106 += arg0;
		while (field1106 > field1102.field990.method598(field1105)) {
			field1106 -= field1102.field990.method598(field1105) + 1;
			field1105++;
			if (field1105 >= field1102.field990.field1482 && (field1105 < 0 || field1105 >= field1102.field990.field1482)) {
				field1105 = 0;
				field1103 = true;
			}
		}
	}

	@ObfuscatedName("QFKXENAK.a(B)LSNMMQNPZ;")
	public final SNMMQNPZ method175() {
		SNMMQNPZ var1 = field1102.method351();
		if (var1 == null) {
			return null;
		}

		int var2 = field1102.field990.field1483[field1105];
		SNMMQNPZ var3 = new SNMMQNPZ(var1, false, true, NLIOLBXV.method356(var2));
		if (!field1103) {
			var3.method425();
			var3.method426(var2);
			var3.field1185 = null;
			var3.field1184 = null;
		}

		if (field1102.field993 != 128 || field1102.field994 != 128) {
			var3.method434(field1102.field993, field1102.field993, field1102.field994);
		}

		if (field1102.field995 != 0) {
			if (field1102.field995 == 90) {
				var3.method429();
			}

			if (field1102.field995 == 180) {
				var3.method429();
				var3.method429();
			}

			if (field1102.field995 == 270) {
				var3.method429();
				var3.method429();
				var3.method429();
			}
		}

		var3.method435(field1102.field996 + 64, field1102.field997 + 850, -30, -50, -30, true);
		return var3;
	}
}
