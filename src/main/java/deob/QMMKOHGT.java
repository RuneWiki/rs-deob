package deob;

@ObfuscatedName("QMMKOHGT")
public class QMMKOHGT extends ESJLSSWI {

	@ObfuscatedName("QMMKOHGT.o")
	public int field1007;

	@ObfuscatedName("QMMKOHGT.p")
	public int field1008;

	@ObfuscatedName("QMMKOHGT.q")
	public int field1009;

	@ObfuscatedName("QMMKOHGT.w")
	public int field1014;

	@ObfuscatedName("QMMKOHGT.x")
	public int field1015;

	@ObfuscatedName("QMMKOHGT.y")
	public int field1016;

	@ObfuscatedName("QMMKOHGT.z")
	public int field1017;

	@ObfuscatedName("QMMKOHGT.l")
	public LZZHVUJR field1005;

	@ObfuscatedName("QMMKOHGT.m")
	public int field1006;

	@ObfuscatedName("QMMKOHGT.v")
	public int field1013;

	@ObfuscatedName("QMMKOHGT.s")
	public int field1011;

	@ObfuscatedName("QMMKOHGT.t")
	public int field1012;

	@ObfuscatedName("QMMKOHGT.A")
	public int[] field1018;

	@ObfuscatedName("QMMKOHGT.r")
	public static client field1010;

	@ObfuscatedName("QMMKOHGT.a(Z)LWRJMHIDY;")
	public final WRJMHIDY method174() {
		int var1 = -1;
		if (field1005 != null) {
			int var2 = client.field353 - field1013;
			if (var2 > 100 && field1005.field837 > 0) {
				var2 = 100;
			}

			while (var2 > field1005.method301(field1006)) {
				var2 -= field1005.method301(field1006);
				field1006++;
				if (field1006 >= field1005.field833) {
					field1006 -= field1005.field837;
					if (field1006 < 0 || field1006 >= field1005.field833) {
						break;
					}
				}
			}

			field1005 = null;
			field1013 = client.field353 - var2;

			if (field1005 != null) {
				var1 = field1005.field834[field1006];
			}
		}

		URZZBDTU var3;
		if (field1018 == null) {
			var3 = URZZBDTU.method450(field1007);
		} else {
			var3 = method375();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method457(field1008, field1009, field1014, field1015, field1016, field1017, var1);
	}

	@ObfuscatedName("QMMKOHGT.a(I)LURZZBDTU;")
	public final URZZBDTU method375() {
		int var1 = -1;
		if (field1011 != -1) {
			JFFNRVFW var2 = JFFNRVFW.field779[field1011];
			int var3 = var2.field781;
			int var4 = var2.field782;
			int var5 = var2.field783;
			int var6 = client.field325[var5 - var4];
			var1 = field1010.field194[var3] >> var4 & var6;
		} else if (field1012 != -1) {
			var1 = field1010.field194[field1012];
		}

		if (var1 >= 0 && var1 < field1018.length && field1018[var1] != -1) {
			return URZZBDTU.method450(field1018[var1]);
		}

		return null;
	}

	public QMMKOHGT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field1007 = arg1;
		field1008 = arg3;
		field1009 = arg2;
		field1014 = arg7;
		field1015 = arg5;
		field1016 = arg0;
		field1017 = arg4;

		if (arg6 != -1) {
			field1005 = LZZHVUJR.field832[arg6];
			field1006 = 0;
			field1013 = client.field353;
			if (arg8 && field1005.field837 != -1) {
				field1006 = (int) (Math.random() * field1005.field833);
				field1013 -= (int) (Math.random() * field1005.method301(field1006));
			}
		}

		URZZBDTU var10 = URZZBDTU.method450(field1007);
		field1011 = var10.field1200;
		field1012 = var10.field1183;
		field1018 = var10.field1168;
	}
}
