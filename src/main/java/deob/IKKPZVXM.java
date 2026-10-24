package deob;

@ObfuscatedName("IKKPZVXM")
public class IKKPZVXM implements Runnable {

	@ObfuscatedName("IKKPZVXM.a")
	public int[] field775 = new int[500];

	@ObfuscatedName("IKKPZVXM.b")
	public Object field776 = new Object();

	@ObfuscatedName("IKKPZVXM.c")
	public boolean field777 = true;

	@ObfuscatedName("IKKPZVXM.f")
	public int[] field780 = new int[500];

	@ObfuscatedName("IKKPZVXM.e")
	public client field779;

	@ObfuscatedName("IKKPZVXM.d")
	public int field778;

	public void run() {
		while (field777) {
			synchronized (field776) {
				if (field778 < 500) {
					field775[field778] = field779.field692;
					field780[field778] = field779.field693;
					field778++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public IKKPZVXM(client arg0) {
		field779 = arg0;
	}
}
