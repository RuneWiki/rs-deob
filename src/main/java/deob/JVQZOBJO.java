package deob;

@ObfuscatedName("JVQZOBJO")
public class JVQZOBJO extends VIVVOUFY {

	@ObfuscatedName("JVQZOBJO.r")
	public int field853;

	@ObfuscatedName("JVQZOBJO.s")
	public int field854;

	@ObfuscatedName("JVQZOBJO.t")
	public int field855;

	@ObfuscatedName("JVQZOBJO.m")
	public int field848;

	@ObfuscatedName("JVQZOBJO.n")
	public int field849;

	@ObfuscatedName("JVQZOBJO.o")
	public int field850;

	@ObfuscatedName("JVQZOBJO.p")
	public int field851;

	@ObfuscatedName("JVQZOBJO.z")
	public ISUBRNPG field860;

	@ObfuscatedName("JVQZOBJO.A")
	public int field861;

	@ObfuscatedName("JVQZOBJO.v")
	public int field856;

	@ObfuscatedName("JVQZOBJO.x")
	public int field858;

	@ObfuscatedName("JVQZOBJO.y")
	public int field859;

	@ObfuscatedName("JVQZOBJO.q")
	public int[] field852;

	@ObfuscatedName("JVQZOBJO.w")
	public static client field857;

	@ObfuscatedName("JVQZOBJO.a(B)LCCYECDYX;")
	public final CCYECDYX method181() {
		int var1 = -1;
		if (field860 != null) {
			int var2 = client.field399 - field856;
			if (var2 > 100 && field860.field791 > 0) {
				var2 = 100;
			}

			while (var2 > field860.method226(field861)) {
				var2 -= field860.method226(field861);
				field861++;
				if (field861 >= field860.field787) {
					field861 -= field860.field791;
					if (field861 < 0 || field861 >= field860.field787) {
						break;
					}
				}
			}

			field860 = null;
			field856 = client.field399 - var2;

			if (field860 != null) {
				var1 = field860.field788[field861];
			}
		}

		NNGZIOFO var3;
		if (field852 == null) {
			var3 = NNGZIOFO.method350(field853);
		} else {
			var3 = method252();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method344(field854, field855, field848, field849, field850, field851, var1);
	}

	public JVQZOBJO(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field853 = arg2;
		field854 = arg3;
		field855 = arg8;
		field848 = arg7;
		field849 = arg4;
		field850 = arg6;
		field851 = arg5;

		if (arg0 != -1) {
			field860 = ISUBRNPG.field786[arg0];
			field861 = 0;
			field856 = client.field399;
			if (arg1 && field860.field791 != -1) {
				field861 = (int) (Math.random() * field860.field787);
				field856 -= (int) (Math.random() * field860.method226(field861));
			}
		}

		NNGZIOFO var10 = NNGZIOFO.method350(field853);
		field858 = var10.field991;
		field859 = var10.field997;
		field852 = var10.field1000;
	}

	@ObfuscatedName("JVQZOBJO.a(I)LNNGZIOFO;")
	public final NNGZIOFO method252() {
		int var1 = -1;
		if (field858 != -1) {
			DUFZKGOK var2 = DUFZKGOK.field719[field858];
			int var3 = var2.field721;
			int var4 = var2.field722;
			int var5 = var2.field723;
			int var6 = client.field365[var5 - var4];
			var1 = field857.field476[var3] >> var4 & var6;
		} else if (field859 != -1) {
			var1 = field857.field476[field859];
		}

		if (var1 >= 0 && var1 < field852.length && field852[var1] != -1) {
			return NNGZIOFO.method350(field852[var1]);
		}

		return null;
	}
}
