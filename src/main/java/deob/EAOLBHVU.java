package deob;

@ObfuscatedName("EAOLBHVU")
public class EAOLBHVU extends TDBSBQNI {

	@ObfuscatedName("EAOLBHVU.u")
	public int field650;

	@ObfuscatedName("EAOLBHVU.v")
	public int field651;

	@ObfuscatedName("EAOLBHVU.w")
	public int field652;

	@ObfuscatedName("EAOLBHVU.m")
	public int field644;

	@ObfuscatedName("EAOLBHVU.n")
	public int field645;

	@ObfuscatedName("EAOLBHVU.o")
	public int field646;

	@ObfuscatedName("EAOLBHVU.p")
	public int field647;

	@ObfuscatedName("EAOLBHVU.l")
	public EHYLCNJX field643;

	@ObfuscatedName("EAOLBHVU.t")
	public int field649;

	@ObfuscatedName("EAOLBHVU.r")
	public int field648;

	@ObfuscatedName("EAOLBHVU.x")
	public int field653;

	@ObfuscatedName("EAOLBHVU.y")
	public int field654;

	@ObfuscatedName("EAOLBHVU.z")
	public int[] field655;

	@ObfuscatedName("EAOLBHVU.k")
	public static client field642;

	public EAOLBHVU(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field650 = arg7;
		field651 = arg5;
		field652 = arg3;
		field644 = arg4;
		field645 = arg0;
		field646 = arg8;
		field647 = arg2;

		if (arg1 != -1) {
			field643 = EHYLCNJX.field744[arg1];
			field649 = 0;
			field648 = client.field155;
			if (arg6 && field643.field749 != -1) {
				field649 = (int) (Math.random() * field643.field745);
				field648 -= (int) (Math.random() * field643.method252(field649));
			}
		}

		LXNLNZCU var10 = LXNLNZCU.method409(field650);
		field653 = var10.field932;
		field654 = var10.field911;
		field655 = var10.field927;
	}

	@ObfuscatedName("EAOLBHVU.a(I)LLXNLNZCU;")
	public final LXNLNZCU method223() {
		int var1 = -1;
		if (field653 != -1) {
			GJIMXWNM var2 = GJIMXWNM.field832[field653];
			int var3 = var2.field834;
			int var4 = var2.field835;
			int var5 = var2.field836;
			int var6 = client.field485[var5 - var4];
			var1 = field642.field316[var3] >> var4 & var6;
		} else if (field654 != -1) {
			var1 = field642.field316[field654];
		}

		if (var1 >= 0 && var1 < field655.length && field655[var1] != -1) {
			return LXNLNZCU.method409(field655[var1]);
		}

		return null;
	}

	@ObfuscatedName("EAOLBHVU.a(B)LCYPZUKMB;")
	public final CYPZUKMB method2() {
		int var1 = -1;
		if (field643 != null) {
			int var2 = client.field155 - field648;
			if (var2 > 100 && field643.field749 > 0) {
				var2 = 100;
			}

			while (var2 > field643.method252(field649)) {
				var2 -= field643.method252(field649);
				field649++;
				if (field649 >= field643.field745) {
					field649 -= field643.field749;
					if (field649 < 0 || field649 >= field643.field745) {
						break;
					}
				}
			}

			field643 = null;
			field648 = client.field155 - var2;

			if (field643 != null) {
				var1 = field643.field746[field649];
			}
		}

		LXNLNZCU var3;
		if (field655 == null) {
			var3 = LXNLNZCU.method409(field650);
		} else {
			var3 = method223();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method419(field651, field652, field644, field645, field646, field647, var1);
	}
}
