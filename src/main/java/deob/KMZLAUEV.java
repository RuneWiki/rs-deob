package deob;

@ObfuscatedName("KMZLAUEV")
public class KMZLAUEV {

	@ObfuscatedName("KMZLAUEV.b")
	public int field971;

	@ObfuscatedName("KMZLAUEV.e")
	public int field974;

	@ObfuscatedName("KMZLAUEV.f")
	public int field975;

	@ObfuscatedName("KMZLAUEV.g")
	public int field976;

	@ObfuscatedName("KMZLAUEV.h")
	public int field977;

	@ObfuscatedName("KMZLAUEV.i")
	public int field978;

	@ObfuscatedName("KMZLAUEV.j")
	public int field979;

	@ObfuscatedName("KMZLAUEV.k")
	public int field980;

	@ObfuscatedName("KMZLAUEV.l")
	public int field981;

	@ObfuscatedName("KMZLAUEV.c")
	public int[] field972;

	@ObfuscatedName("KMZLAUEV.d")
	public int[] field973;

	@ObfuscatedName("KMZLAUEV.a(LKHOMSBHW;I)V")
	public final void method394(KHOMSBHW arg0) {
		field976 = arg0.method349();
		field974 = arg0.method354();
		field975 = arg0.method354();
		method395(arg0);
	}

	@ObfuscatedName("KMZLAUEV.b(LKHOMSBHW;I)V")
	public final void method395(KHOMSBHW arg0) {
		field971 = arg0.method349();
		field972 = new int[field971];
		field973 = new int[field971];
		for (int var2 = 0; var2 < field971; var2++) {
			field972[var2] = arg0.method351();
			field973[var2] = arg0.method351();
		}
	}

	@ObfuscatedName("KMZLAUEV.a(Z)V")
	public final void method396() {
		field977 = 0;
		field978 = 0;
		field979 = 0;
		field980 = 0;
		field981 = 0;
	}

	@ObfuscatedName("KMZLAUEV.a(BI)I")
	public final int method397(int arg0) {
		if (field981 >= field977) {
			field980 = field973[field978++] << 15;

			if (field978 >= field971) {
				field978 = field971 - 1;
			}

			field977 = (int) (field972[field978] / 65536.0D * arg0);
			if (field977 > field981) {
				field979 = ((field973[field978] << 15) - field980) / (field977 - field981);
			}
		}

		field980 += field979;
		field981++;
		return field980 - field979 >> 15;
	}
}
