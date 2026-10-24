package deob;

@ObfuscatedName("DFQOFKQS")
public class DFQOFKQS {

	@ObfuscatedName("DFQOFKQS.i")
	public YPPCWCLI[] field606 = new YPPCWCLI[10];

	@ObfuscatedName("DFQOFKQS.e")
	public static DFQOFKQS[] field602 = new DFQOFKQS[5000];

	@ObfuscatedName("DFQOFKQS.f")
	public static int[] field603 = new int[5000];

	@ObfuscatedName("DFQOFKQS.j")
	public int field607;

	@ObfuscatedName("DFQOFKQS.k")
	public int field608;

	@ObfuscatedName("DFQOFKQS.h")
	public static YOXDZEVD field605;

	@ObfuscatedName("DFQOFKQS.g")
	public static byte[] field604;

	@ObfuscatedName("DFQOFKQS.a(LYOXDZEVD;Z)V")
	public static final void method168(YOXDZEVD arg0) {
		field604 = new byte[441000];
		field605 = new YOXDZEVD(field604);
		YPPCWCLI.method585();

		while (true) {
			int var1 = arg0.method551();
			if (var1 == 0xFFFF) {
				return;
			}

			field602[var1] = new DFQOFKQS();
			field602[var1].method170(arg0);
			field603[var1] = field602[var1].method171();
		}
	}

	@ObfuscatedName("DFQOFKQS.a(III)LYOXDZEVD;")
	public static final YOXDZEVD method169(int arg0, int arg1) {
		if (field602[arg1] != null) {
			DFQOFKQS var2 = field602[arg1];
			return var2.method172(arg0);
		}

		return null;
	}

	@ObfuscatedName("DFQOFKQS.a(BLYOXDZEVD;)V")
	public final void method170(YOXDZEVD arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method549();
			if (var3 != 0) {
				arg0.field1393--;
				field606[var2] = new YPPCWCLI();
				field606[var2].method588(arg0);
			}
		}

		field607 = arg0.method551();
		field608 = arg0.method551();
	}

	@ObfuscatedName("DFQOFKQS.a(B)I")
	public final int method171() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field606[var2] != null && field606[var2].field1421 / 20 < var1) {
				var1 = field606[var2].field1421 / 20;
			}
		}

		if (field607 < field608 && field607 / 20 < var1) {
			var1 = field607 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field606[var3] != null) {
					field606[var3].field1421 -= var1 * 20;
				}
			}

			if (field607 < field608) {
				field607 -= var1 * 20;
				field608 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("DFQOFKQS.a(IB)LYOXDZEVD;")
	public final YOXDZEVD method172(int arg0) {
		int var2 = method173(arg0);
		field605.field1393 = 0;
		field605.method543(0x52494646);
		field605.method544(var2 + 36);
		field605.method543(0x57415645);
		field605.method543(0x666D7420);
		field605.method544(16);
		field605.method541(1);
		field605.method541(1);
		field605.method544(22050);
		field605.method544(22050);
		field605.method541(1);
		field605.method541(8);
		field605.method543(0x64617461);
		field605.method544(var2);
		field605.field1393 += var2;
		return field605;
	}

	@ObfuscatedName("DFQOFKQS.a(I)I")
	public final int method173(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field606[var3] != null && field606[var3].field1421 + field606[var3].field1420 > var2) {
				var2 = field606[var3].field1421 + field606[var3].field1420;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field607 * 22050 / 1000;
		int var6 = field608 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field604[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field606[var9] != null) {
				int var10 = field606[var9].field1420 * 22050 / 1000;
				int var11 = field606[var9].field1421 * 22050 / 1000;
				int[] var12 = field606[var9].method586(var10, field606[var9].field1420);
				for (int var13 = 0; var13 < var10; var13++) {
					field604[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field604[var14 + var15] = field604[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field604[var17 + var18] = field604[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
