package deob;

@ObfuscatedName("NTLPGIRW")
public class NTLPGIRW extends HTDIJKWW {

	@ObfuscatedName("NTLPGIRW.q")
	public int field993;

	@ObfuscatedName("NTLPGIRW.r")
	public int field994;

	@ObfuscatedName("NTLPGIRW.s")
	public int field995;

	@ObfuscatedName("NTLPGIRW.k")
	public int field987;

	@ObfuscatedName("NTLPGIRW.l")
	public int field988;

	@ObfuscatedName("NTLPGIRW.m")
	public int field989;

	@ObfuscatedName("NTLPGIRW.n")
	public int field990;

	@ObfuscatedName("NTLPGIRW.w")
	public LMDSPIVT field998;

	@ObfuscatedName("NTLPGIRW.p")
	public int field992;

	@ObfuscatedName("NTLPGIRW.t")
	public int field996;

	@ObfuscatedName("NTLPGIRW.x")
	public int field999;

	@ObfuscatedName("NTLPGIRW.y")
	public int field1000;

	@ObfuscatedName("NTLPGIRW.u")
	public int[] field997;

	@ObfuscatedName("NTLPGIRW.o")
	public static client field991;

	public NTLPGIRW(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field993 = arg1;
		field994 = arg5;
		field995 = arg4;
		field987 = arg8;
		field988 = arg2;
		field989 = arg6;
		field990 = arg0;

		if (arg7 != -1) {
			field998 = LMDSPIVT.field867[arg7];
			field992 = 0;
			field996 = client.field258;
			if (arg3 && field998.field872 != -1) {
				field992 = (int) (Math.random() * field998.field868);
				field996 -= (int) (Math.random() * field998.method280(field992));
			}
		}

		WEWSMZTU var10 = WEWSMZTU.method555(field993);
		field999 = var10.field1356;
		field1000 = var10.field1351;
		field997 = var10.field1354;
	}

	@ObfuscatedName("NTLPGIRW.a(B)LWEWSMZTU;")
	public final WEWSMZTU method352() {
		int var1 = -1;
		if (field999 != -1) {
			ATLVWFDY var2 = ATLVWFDY.field69[field999];
			int var3 = var2.field71;
			int var4 = var2.field72;
			int var5 = var2.field73;
			int var6 = client.field271[var5 - var4];
			var1 = field991.field341[var3] >> var4 & var6;
		} else if (field1000 != -1) {
			var1 = field991.field341[field1000];
		}

		if (var1 >= 0 && var1 < field997.length && field997[var1] != -1) {
			return WEWSMZTU.method555(field997[var1]);
		}

		return null;
	}

	@ObfuscatedName("NTLPGIRW.a(I)LKDWDYCIL;")
	public final KDWDYCIL method185() {
		int var1 = -1;
		if (field998 != null) {
			int var2 = client.field258 - field996;
			if (var2 > 100 && field998.field872 > 0) {
				var2 = 100;
			}

			while (var2 > field998.method280(field992)) {
				var2 -= field998.method280(field992);
				field992++;
				if (field992 >= field998.field868) {
					field992 -= field998.field872;
					if (field992 < 0 || field992 >= field998.field868) {
						break;
					}
				}
			}

			field998 = null;
			field996 = client.field258 - var2;

			if (field998 != null) {
				var1 = field998.field869[field992];
			}
		}

		WEWSMZTU var3;
		if (field997 == null) {
			var3 = WEWSMZTU.method555(field993);
		} else {
			var3 = method352();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method556(field994, field995, field987, field988, field989, field990, var1);
	}
}
