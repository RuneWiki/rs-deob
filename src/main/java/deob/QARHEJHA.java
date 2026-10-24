package deob;

@ObfuscatedName("QARHEJHA")
public class QARHEJHA extends DVAULXJA {

	@ObfuscatedName("QARHEJHA.n")
	public int field1000;

	@ObfuscatedName("QARHEJHA.o")
	public int field1001;

	@ObfuscatedName("QARHEJHA.p")
	public int field1002;

	@ObfuscatedName("QARHEJHA.x")
	public int field1009;

	@ObfuscatedName("QARHEJHA.y")
	public int field1010;

	@ObfuscatedName("QARHEJHA.z")
	public int field1011;

	@ObfuscatedName("QARHEJHA.A")
	public int field1012;

	@ObfuscatedName("QARHEJHA.q")
	public VYXELYSX field1003;

	@ObfuscatedName("QARHEJHA.v")
	public int field1008;

	@ObfuscatedName("QARHEJHA.B")
	public int field1013;

	@ObfuscatedName("QARHEJHA.t")
	public int field1006;

	@ObfuscatedName("QARHEJHA.u")
	public int field1007;

	@ObfuscatedName("QARHEJHA.s")
	public int[] field1005;

	@ObfuscatedName("QARHEJHA.r")
	public static client field1004;

	@ObfuscatedName("QARHEJHA.a(I)LIEHKDFMR;")
	public final IEHKDFMR method24() {
		int var1 = -1;
		if (field1003 != null) {
			int var2 = client.field228 - field1013;
			if (var2 > 100 && field1003.field1278 > 0) {
				var2 = 100;
			}

			while (var2 > field1003.method459(field1008)) {
				var2 -= field1003.method459(field1008);
				field1008++;
				if (field1008 >= field1003.field1274) {
					field1008 -= field1003.field1278;
					if (field1008 < 0 || field1008 >= field1003.field1274) {
						break;
					}
				}
			}

			field1003 = null;
			field1013 = client.field228 - var2;

			if (field1003 != null) {
				var1 = field1003.field1275[field1008];
			}
		}

		AMVKCKZF var3;
		if (field1005 == null) {
			var3 = AMVKCKZF.method4(field1000);
		} else {
			var3 = method366();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method5(field1001, field1002, field1009, field1010, field1011, field1012, var1);
	}

	@ObfuscatedName("QARHEJHA.b(I)LAMVKCKZF;")
	public final AMVKCKZF method366() {
		int var1 = -1;
		if (field1006 != -1) {
			EFEPEUMF var2 = EFEPEUMF.field607[field1006];
			int var3 = var2.field609;
			int var4 = var2.field610;
			int var5 = var2.field611;
			int var6 = client.field323[var5 - var4];
			var1 = field1004.field286[var3] >> var4 & var6;
		} else if (field1007 != -1) {
			var1 = field1004.field286[field1007];
		}

		if (var1 >= 0 && var1 < field1005.length && field1005[var1] != -1) {
			return AMVKCKZF.method4(field1005[var1]);
		}

		return null;
	}

	public QARHEJHA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field1000 = arg5;
		field1001 = arg3;
		field1002 = arg2;
		field1009 = arg4;
		field1010 = arg6;
		field1011 = arg0;
		field1012 = arg1;

		if (arg7 != -1) {
			field1003 = VYXELYSX.field1273[arg7];
			field1008 = 0;
			field1013 = client.field228;
			if (arg8 && field1003.field1278 != -1) {
				field1008 = (int) (Math.random() * field1003.field1274);
				field1013 -= (int) (Math.random() * field1003.method459(field1008));
			}
		}

		AMVKCKZF var10 = AMVKCKZF.method4(field1000);
		field1006 = var10.field25;
		field1007 = var10.field12;
		field1005 = var10.field17;
	}
}
