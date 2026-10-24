package deob;

@ObfuscatedName("EFJXCNIG")
public class EFJXCNIG extends UCNHLGIK {

	@ObfuscatedName("EFJXCNIG.m")
	public int field652;

	@ObfuscatedName("EFJXCNIG.n")
	public int field653;

	@ObfuscatedName("EFJXCNIG.o")
	public int field654;

	@ObfuscatedName("EFJXCNIG.w")
	public int field661;

	@ObfuscatedName("EFJXCNIG.x")
	public int field662;

	@ObfuscatedName("EFJXCNIG.y")
	public int field663;

	@ObfuscatedName("EFJXCNIG.z")
	public int field664;

	@ObfuscatedName("EFJXCNIG.v")
	public DVIZXFSW field660;

	@ObfuscatedName("EFJXCNIG.A")
	public int field665;

	@ObfuscatedName("EFJXCNIG.p")
	public int field655;

	@ObfuscatedName("EFJXCNIG.s")
	public int field657;

	@ObfuscatedName("EFJXCNIG.t")
	public int field658;

	@ObfuscatedName("EFJXCNIG.r")
	public int[] field656;

	@ObfuscatedName("EFJXCNIG.u")
	public static client field659;

	public EFJXCNIG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field652 = arg6;
		field653 = arg8;
		field654 = arg5;
		field661 = arg4;
		field662 = arg3;
		field663 = arg1;
		field664 = arg0;

		if (arg2 != -1) {
			field660 = DVIZXFSW.field636[arg2];
			field665 = 0;
			field655 = client.field531 - 1;
			if (arg7 && field660.field641 != -1) {
				field665 = (int) (Math.random() * field660.field637);
				field655 -= (int) (Math.random() * field660.method207(field665));
			}
		}

		WEJSKHXC var10 = WEJSKHXC.method548(field652);
		field657 = var10.field1409;
		field658 = var10.field1407;
		field656 = var10.field1389;
	}

	@ObfuscatedName("EFJXCNIG.a(B)LWEJSKHXC;")
	public final WEJSKHXC method209() {
		int var1 = -1;
		if (field657 != -1) {
			BVXCTZVJ var2 = BVXCTZVJ.field109[field657];
			int var3 = var2.field111;
			int var4 = var2.field112;
			int var5 = var2.field113;
			int var6 = client.field131[var5 - var4];
			var1 = field659.field307[var3] >> var4 & var6;
		} else if (field658 != -1) {
			var1 = field659.field307[field658];
		}

		if (var1 >= 0 && var1 < field656.length && field656[var1] != -1) {
			return WEJSKHXC.method548(field656[var1]);
		}

		return null;
	}

	@ObfuscatedName("EFJXCNIG.a(I)LOJGAHFXC;")
	public final OJGAHFXC method1() {
		int var1 = -1;
		if (field660 != null) {
			int var2 = client.field531 - field655;
			if (var2 > 100 && field660.field641 > 0) {
				var2 = 100;
			}

			while (var2 > field660.method207(field665)) {
				var2 -= field660.method207(field665);
				field665++;
				if (field665 >= field660.field637) {
					field665 -= field660.field641;
					if (field665 < 0 || field665 >= field660.field637) {
						break;
					}
				}
			}

			field660 = null;
			field655 = client.field531 - var2;

			if (field660 != null) {
				var1 = field660.field638[field665];
			}
		}

		WEJSKHXC var3;
		if (field656 == null) {
			var3 = WEJSKHXC.method548(field652);
		} else {
			var3 = method209();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method549(field653, field654, field661, field662, field663, field664, var1);
	}
}
