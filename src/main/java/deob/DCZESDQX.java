package deob;

@ObfuscatedName("DCZESDQX")
public class DCZESDQX {

	@ObfuscatedName("DCZESDQX.j")
	public ZJWNEIBQ[] field546 = new ZJWNEIBQ[10];

	@ObfuscatedName("DCZESDQX.f")
	public static DCZESDQX[] field542 = new DCZESDQX[5000];

	@ObfuscatedName("DCZESDQX.g")
	public static int[] field543 = new int[5000];

	@ObfuscatedName("DCZESDQX.k")
	public int field547;

	@ObfuscatedName("DCZESDQX.l")
	public int field548;

	@ObfuscatedName("DCZESDQX.i")
	public static BSNPYLEV field545;

	@ObfuscatedName("DCZESDQX.h")
	public static byte[] field544;

	@ObfuscatedName("DCZESDQX.a(LBSNPYLEV;I)V")
	public static final void method271(BSNPYLEV arg0) {
		field544 = new byte[441000];
		field545 = new BSNPYLEV(field544);
		ZJWNEIBQ.method601();

		while (true) {
			int var1 = arg0.method49();
			if (var1 == 0xFFFF) {
				return;
			}

			field542[var1] = new DCZESDQX();
			field542[var1].method273(arg0);
			field543[var1] = field542[var1].method274();
		}
	}

	@ObfuscatedName("DCZESDQX.a(IZI)LBSNPYLEV;")
	public static final BSNPYLEV method272(int arg0, int arg1) {
		if (field542[arg0] != null) {
			DCZESDQX var2 = field542[arg0];
			return var2.method275(arg1);
		}

		return null;
	}

	@ObfuscatedName("DCZESDQX.a(ILBSNPYLEV;)V")
	public final void method273(BSNPYLEV arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method47();
			if (var3 != 0) {
				arg0.field55--;
				field546[var2] = new ZJWNEIBQ();
				field546[var2].method604(arg0);
			}
		}

		field547 = arg0.method49();
		field548 = arg0.method49();
	}

	@ObfuscatedName("DCZESDQX.a(I)I")
	public final int method274() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field546[var2] != null && field546[var2].field1508 / 20 < var1) {
				var1 = field546[var2].field1508 / 20;
			}
		}

		if (field547 < field548 && field547 / 20 < var1) {
			var1 = field547 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field546[var3] != null) {
					field546[var3].field1508 -= var1 * 20;
				}
			}

			if (field547 < field548) {
				field547 -= var1 * 20;
				field548 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("DCZESDQX.a(II)LBSNPYLEV;")
	public final BSNPYLEV method275(int arg0) {
		int var2 = method276(arg0);
		field545.field55 = 0;
		field545.method41(0x52494646);
		field545.method42(var2 + 36);
		field545.method41(0x57415645);
		field545.method41(0x666D7420);
		field545.method42(16);
		field545.method39(1);
		field545.method39(1);
		field545.method42(22050);
		field545.method42(22050);
		field545.method39(1);
		field545.method39(8);
		field545.method41(0x64617461);
		field545.method42(var2);
		field545.field55 += var2;
		return field545;
	}

	@ObfuscatedName("DCZESDQX.b(I)I")
	public final int method276(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field546[var3] != null && field546[var3].field1508 + field546[var3].field1507 > var2) {
				var2 = field546[var3].field1508 + field546[var3].field1507;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field547 * 22050 / 1000;
		int var6 = field548 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field544[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field546[var9] != null) {
				int var10 = field546[var9].field1507 * 22050 / 1000;
				int var11 = field546[var9].field1508 * 22050 / 1000;
				int[] var12 = field546[var9].method602(var10, field546[var9].field1507);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field544[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field544[var11 + var13 + 44] = (byte) var14;
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var15 = var7 - var4;
			for (int var16 = var4 - 1; var16 >= var6; var16--) {
				field544[var15 + var16] = field544[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field544[var18 + var19] = field544[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
