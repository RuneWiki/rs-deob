package deob;

@ObfuscatedName("OQEOESGS")
public class OQEOESGS implements Runnable {

	@ObfuscatedName("OQEOESGS.a")
	public Object field1129 = new Object();

	@ObfuscatedName("OQEOESGS.c")
	public int[] field1131 = new int[500];

	@ObfuscatedName("OQEOESGS.d")
	public boolean field1132 = true;

	@ObfuscatedName("OQEOESGS.e")
	public int[] field1133 = new int[500];

	@ObfuscatedName("OQEOESGS.f")
	public client field1134;

	@ObfuscatedName("OQEOESGS.b")
	public int field1130;

	public OQEOESGS(client arg0) {
		field1134 = arg0;
	}

	public void run() {
		while (field1132) {
			synchronized (field1129) {
				if (field1130 < 500) {
					field1131[field1130] = field1134.field684;
					field1133[field1130] = field1134.field685;
					field1130++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
