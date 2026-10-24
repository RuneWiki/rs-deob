package deob;

@ObfuscatedName("DNFIVRJB")
public class DNFIVRJB {

	@ObfuscatedName("DNFIVRJB.b")
	public int field530;

	@ObfuscatedName("DNFIVRJB.e")
	public int field533;

	@ObfuscatedName("DNFIVRJB.f")
	public int field534;

	@ObfuscatedName("DNFIVRJB.g")
	public int field535;

	@ObfuscatedName("DNFIVRJB.h")
	public int field536;

	@ObfuscatedName("DNFIVRJB.i")
	public int field537;

	@ObfuscatedName("DNFIVRJB.j")
	public int field538;

	@ObfuscatedName("DNFIVRJB.k")
	public int field539;

	@ObfuscatedName("DNFIVRJB.l")
	public int field540;

	@ObfuscatedName("DNFIVRJB.c")
	public int[] field531;

	@ObfuscatedName("DNFIVRJB.d")
	public int[] field532;

	@ObfuscatedName("DNFIVRJB.a(LCFARFRSG;I)V")
	public final void method255(CFARFRSG arg0) {
		field535 = arg0.method30();
		field533 = arg0.method35();
		field534 = arg0.method35();
		method256(arg0);
	}

	@ObfuscatedName("DNFIVRJB.a(ILCFARFRSG;)V")
	public final void method256(CFARFRSG arg0) {
		field530 = arg0.method30();
		field531 = new int[field530];
		field532 = new int[field530];
		for (int var2 = 0; var2 < field530; var2++) {
			field531[var2] = arg0.method32();
			field532[var2] = arg0.method32();
		}
	}

	@ObfuscatedName("DNFIVRJB.a(I)V")
	public final void method257() {
		field536 = 0;
		field537 = 0;
		field538 = 0;
		field539 = 0;
		field540 = 0;
	}

	@ObfuscatedName("DNFIVRJB.a(II)I")
	public final int method258(int arg0) {
		if (field540 >= field536) {
			field539 = field532[field537++] << 15;

			if (field537 >= field530) {
				field537 = field530 - 1;
			}

			field536 = (int) (field531[field537] / 65536.0D * arg0);
			if (field536 > field540) {
				field538 = ((field532[field537] << 15) - field539) / (field536 - field540);
			}
		}

		field539 += field538;
		field540++;
		return field539 - field538 >> 15;
	}
}
