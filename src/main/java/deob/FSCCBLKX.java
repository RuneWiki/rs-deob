package deob;

@ObfuscatedName("FSCCBLKX")
public class FSCCBLKX extends FGVBONDH {

	@ObfuscatedName("FSCCBLKX.w")
	public int field638;

	@ObfuscatedName("FSCCBLKX.x")
	public int field639;

	@ObfuscatedName("FSCCBLKX.y")
	public int field640;

	@ObfuscatedName("FSCCBLKX.p")
	public int field631;

	@ObfuscatedName("FSCCBLKX.q")
	public int field632;

	@ObfuscatedName("FSCCBLKX.r")
	public int field633;

	@ObfuscatedName("FSCCBLKX.s")
	public int field634;

	@ObfuscatedName("FSCCBLKX.o")
	public XKEHWKFH field630;

	@ObfuscatedName("FSCCBLKX.m")
	public int field628;

	@ObfuscatedName("FSCCBLKX.v")
	public int field637;

	@ObfuscatedName("FSCCBLKX.t")
	public int field635;

	@ObfuscatedName("FSCCBLKX.u")
	public int field636;

	@ObfuscatedName("FSCCBLKX.n")
	public int[] field629;

	@ObfuscatedName("FSCCBLKX.z")
	public static client field641;

	public FSCCBLKX(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field638 = arg4;
		field639 = arg5;
		field640 = arg0;
		field631 = arg6;
		field632 = arg1;
		field633 = arg7;
		field634 = arg8;

		if (arg3 != -1) {
			field630 = XKEHWKFH.field1362[arg3];
			field628 = 0;
			field637 = client.field221;
			if (arg2 && field630.field1367 != -1) {
				field628 = (int) (Math.random() * field630.field1363);
				field637 -= (int) (Math.random() * field630.method566(field628));
			}
		}

		USIJLMTP var10 = USIJLMTP.method555(field638);
		field635 = var10.field1230;
		field636 = var10.field1256;
		field629 = var10.field1265;
	}

	@ObfuscatedName("FSCCBLKX.a(B)LUSIJLMTP;")
	public final USIJLMTP method275() {
		int var1 = -1;
		if (field635 != -1) {
			LPMARHLZ var2 = LPMARHLZ.field925[field635];
			int var3 = var2.field927;
			int var4 = var2.field928;
			int var5 = var2.field929;
			int var6 = client.field160[var5 - var4];
			var1 = field641.field405[var3] >> var4 & var6;
		} else if (field636 != -1) {
			var1 = field641.field405[field636];
		}

		if (var1 >= 0 && var1 < field629.length && field629[var1] != -1) {
			return USIJLMTP.method555(field629[var1]);
		}

		return null;
	}

	@ObfuscatedName("FSCCBLKX.a(I)LHEQROJXW;")
	public final HEQROJXW method1() {
		int var1 = -1;
		if (field630 != null) {
			int var2 = client.field221 - field637;
			if (var2 > 100 && field630.field1367 > 0) {
				var2 = 100;
			}

			while (var2 > field630.method566(field628)) {
				var2 -= field630.method566(field628);
				field628++;
				if (field628 >= field630.field1363) {
					field628 -= field630.field1367;
					if (field628 < 0 || field628 >= field630.field1363) {
						break;
					}
				}
			}

			field630 = null;
			field637 = client.field221 - var2;

			if (field630 != null) {
				var1 = field630.field1364[field628];
			}
		}

		USIJLMTP var3;
		if (field629 == null) {
			var3 = USIJLMTP.method555(field638);
		} else {
			var3 = method275();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method548(field639, field640, field631, field632, field633, field634, var1);
	}
}
