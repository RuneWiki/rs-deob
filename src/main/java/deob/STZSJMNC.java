package deob;

@ObfuscatedName("STZSJMNC")
public class STZSJMNC implements Runnable {

	@ObfuscatedName("STZSJMNC.b")
	public boolean field1264 = true;

	@ObfuscatedName("STZSJMNC.c")
	public Object field1265 = new Object();

	@ObfuscatedName("STZSJMNC.d")
	public int[] field1266 = new int[500];

	@ObfuscatedName("STZSJMNC.f")
	public int[] field1268 = new int[500];

	@ObfuscatedName("STZSJMNC.e")
	public client field1267;

	@ObfuscatedName("STZSJMNC.g")
	public int field1269;

	public STZSJMNC(client arg0) {
		field1267 = arg0;
	}

	public void run() {
		while (field1264) {
			synchronized (field1265) {
				if (field1269 < 500) {
					field1268[field1269] = field1267.field717;
					field1266[field1269] = field1267.field718;
					field1269++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
