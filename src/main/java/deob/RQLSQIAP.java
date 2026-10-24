package deob;

@ObfuscatedName("RQLSQIAP")
public class RQLSQIAP implements Runnable {

	@ObfuscatedName("RQLSQIAP.a")
	public boolean field1035 = true;

	@ObfuscatedName("RQLSQIAP.b")
	public int[] field1036 = new int[500];

	@ObfuscatedName("RQLSQIAP.c")
	public int[] field1037 = new int[500];

	@ObfuscatedName("RQLSQIAP.d")
	public Object field1038 = new Object();

	@ObfuscatedName("RQLSQIAP.e")
	public client field1039;

	@ObfuscatedName("RQLSQIAP.f")
	public int field1040;

	public RQLSQIAP(client arg0) {
		field1039 = arg0;
	}

	public void run() {
		while (field1035) {
			synchronized (field1038) {
				if (field1040 < 500) {
					field1036[field1040] = field1039.field553;
					field1037[field1040] = field1039.field554;
					field1040++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
