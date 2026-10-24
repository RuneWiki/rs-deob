package deob;

@ObfuscatedName("WFTRMPWZ")
public class WFTRMPWZ {

	@ObfuscatedName("WFTRMPWZ.i")
	public EBTORROD[] field1294 = new EBTORROD[10];

	@ObfuscatedName("WFTRMPWZ.e")
	public static WFTRMPWZ[] field1290 = new WFTRMPWZ[5000];

	@ObfuscatedName("WFTRMPWZ.f")
	public static int[] field1291 = new int[5000];

	@ObfuscatedName("WFTRMPWZ.j")
	public int field1295;

	@ObfuscatedName("WFTRMPWZ.k")
	public int field1296;

	@ObfuscatedName("WFTRMPWZ.h")
	public static ZOMNSJJM field1293;

	@ObfuscatedName("WFTRMPWZ.g")
	public static byte[] field1292;

	@ObfuscatedName("WFTRMPWZ.a(LZOMNSJJM;I)V")
	public static final void method448(ZOMNSJJM arg0) {
		field1292 = new byte[441000];
		field1293 = new ZOMNSJJM(field1292);
		EBTORROD.method208();

		while (true) {
			int var1 = arg0.method549();
			if (var1 == 0xFFFF) {
				return;
			}

			field1290[var1] = new WFTRMPWZ();
			field1290[var1].method450(arg0);
			field1291[var1] = field1290[var1].method451();
		}
	}

	@ObfuscatedName("WFTRMPWZ.a(IBI)LZOMNSJJM;")
	public static final ZOMNSJJM method449(int arg0, int arg1) {
		if (field1290[arg1] != null) {
			WFTRMPWZ var2 = field1290[arg1];
			return var2.method452(arg0);
		}

		return null;
	}

	@ObfuscatedName("WFTRMPWZ.a(LZOMNSJJM;B)V")
	public final void method450(ZOMNSJJM arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method547();
			if (var3 != 0) {
				arg0.field1457--;
				field1294[var2] = new EBTORROD();
				field1294[var2].method211(arg0);
			}
		}

		field1295 = arg0.method549();
		field1296 = arg0.method549();
	}

	@ObfuscatedName("WFTRMPWZ.a(B)I")
	public final int method451() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1294[var2] != null && field1294[var2].field743 / 20 < var1) {
				var1 = field1294[var2].field743 / 20;
			}
		}

		if (field1295 < field1296 && field1295 / 20 < var1) {
			var1 = field1295 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1294[var3] != null) {
					field1294[var3].field743 -= var1 * 20;
				}
			}

			if (field1295 < field1296) {
				field1295 -= var1 * 20;
				field1296 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("WFTRMPWZ.a(II)LZOMNSJJM;")
	public final ZOMNSJJM method452(int arg0) {
		int var2 = method453(arg0);
		field1293.field1457 = 0;
		field1293.method541(0x52494646);
		field1293.method542(var2 + 36);
		field1293.method541(0x57415645);
		field1293.method541(0x666D7420);
		field1293.method542(16);
		field1293.method539(1);
		field1293.method539(1);
		field1293.method542(22050);
		field1293.method542(22050);
		field1293.method539(1);
		field1293.method539(8);
		field1293.method541(0x64617461);
		field1293.method542(var2);
		field1293.field1457 += var2;
		return field1293;
	}

	@ObfuscatedName("WFTRMPWZ.a(I)I")
	public final int method453(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1294[var3] != null && field1294[var3].field743 + field1294[var3].field742 > var2) {
				var2 = field1294[var3].field743 + field1294[var3].field742;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1295 * 22050 / 1000;
		int var6 = field1296 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1292[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1294[var9] != null) {
				int var10 = field1294[var9].field742 * 22050 / 1000;
				int var11 = field1294[var9].field743 * 22050 / 1000;
				int[] var12 = field1294[var9].method209(var10, field1294[var9].field742);
				for (int var13 = 0; var13 < var10; var13++) {
					field1292[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1292[var14 + var15] = field1292[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1292[var17 + var18] = field1292[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
