package deob;

@ObfuscatedName("GJKLDIZT")
public class GJKLDIZT {

	@ObfuscatedName("GJKLDIZT.c")
	public int field593;

	@ObfuscatedName("GJKLDIZT.f")
	public int field596;

	@ObfuscatedName("GJKLDIZT.g")
	public int field597;

	@ObfuscatedName("GJKLDIZT.h")
	public int field598;

	@ObfuscatedName("GJKLDIZT.i")
	public int field599;

	@ObfuscatedName("GJKLDIZT.j")
	public int field600;

	@ObfuscatedName("GJKLDIZT.k")
	public int field601;

	@ObfuscatedName("GJKLDIZT.l")
	public int field602;

	@ObfuscatedName("GJKLDIZT.m")
	public int field603;

	@ObfuscatedName("GJKLDIZT.d")
	public int[] field594;

	@ObfuscatedName("GJKLDIZT.e")
	public int[] field595;

	@ObfuscatedName("GJKLDIZT.a(LDNRIFKTO;I)V")
	public final void method247(DNRIFKTO arg0) {
		field598 = arg0.method189();
		field596 = arg0.method194();
		field597 = arg0.method194();
		method248(arg0);
	}

	@ObfuscatedName("GJKLDIZT.a(BLDNRIFKTO;)V")
	public final void method248(DNRIFKTO arg0) {
		field593 = arg0.method189();
		field594 = new int[field593];
		field595 = new int[field593];
		for (int var2 = 0; var2 < field593; var2++) {
			field594[var2] = arg0.method191();
			field595[var2] = arg0.method191();
		}
	}

	@ObfuscatedName("GJKLDIZT.a(B)V")
	public final void method249() {
		field599 = 0;
		field600 = 0;
		field601 = 0;
		field602 = 0;
		field603 = 0;
	}

	@ObfuscatedName("GJKLDIZT.a(IB)I")
	public final int method250(int arg0) {
		if (field603 >= field599) {
			field602 = field595[field600++] << 15;

			if (field600 >= field593) {
				field600 = field593 - 1;
			}

			field599 = (int) (field594[field600] / 65536.0D * arg0);
			if (field599 > field603) {
				field601 = ((field595[field600] << 15) - field602) / (field599 - field603);
			}
		}

		field602 += field601;
		field603++;
		return field602 - field601 >> 15;
	}
}
