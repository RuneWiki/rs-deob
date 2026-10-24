package deob;

@ObfuscatedName("FGSQUADF")
public class FGSQUADF {

	@ObfuscatedName("FGSQUADF.b")
	public int field579;

	@ObfuscatedName("FGSQUADF.e")
	public int field582;

	@ObfuscatedName("FGSQUADF.f")
	public int field583;

	@ObfuscatedName("FGSQUADF.g")
	public int field584;

	@ObfuscatedName("FGSQUADF.h")
	public int field585;

	@ObfuscatedName("FGSQUADF.i")
	public int field586;

	@ObfuscatedName("FGSQUADF.j")
	public int field587;

	@ObfuscatedName("FGSQUADF.k")
	public int field588;

	@ObfuscatedName("FGSQUADF.l")
	public int field589;

	@ObfuscatedName("FGSQUADF.c")
	public int[] field580;

	@ObfuscatedName("FGSQUADF.d")
	public int[] field581;

	@ObfuscatedName("FGSQUADF.a(BLNQUAUMDT;)V")
	public final void method176(NQUAUMDT arg0) {
		field584 = arg0.method339();
		field582 = arg0.method344();
		field583 = arg0.method344();
		method177(arg0);
	}

	@ObfuscatedName("FGSQUADF.a(ILNQUAUMDT;)V")
	public final void method177(NQUAUMDT arg0) {
		field579 = arg0.method339();
		field580 = new int[field579];
		field581 = new int[field579];
		for (int var2 = 0; var2 < field579; var2++) {
			field580[var2] = arg0.method341();
			field581[var2] = arg0.method341();
		}
	}

	@ObfuscatedName("FGSQUADF.a(Z)V")
	public final void method178() {
		field585 = 0;
		field586 = 0;
		field587 = 0;
		field588 = 0;
		field589 = 0;
	}

	@ObfuscatedName("FGSQUADF.a(IZ)I")
	public final int method179(int arg0) {
		if (field589 >= field585) {
			field588 = field581[field586++] << 15;

			if (field586 >= field579) {
				field586 = field579 - 1;
			}

			field585 = (int) (field580[field586] / 65536.0D * arg0);
			if (field585 > field589) {
				field587 = ((field581[field586] << 15) - field588) / (field585 - field589);
			}
		}

		field588 += field587;
		field589++;
		return field588 - field587 >> 15;
	}
}
