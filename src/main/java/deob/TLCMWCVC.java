package deob;

@ObfuscatedName("TLCMWCVC")
public class TLCMWCVC implements Runnable {

	@ObfuscatedName("TLCMWCVC.a")
	public int[] field1296 = new int[500];

	@ObfuscatedName("TLCMWCVC.c")
	public boolean field1298 = true;

	@ObfuscatedName("TLCMWCVC.e")
	public int[] field1300 = new int[500];

	@ObfuscatedName("TLCMWCVC.f")
	public Object field1301 = new Object();

	@ObfuscatedName("TLCMWCVC.d")
	public client field1299;

	@ObfuscatedName("TLCMWCVC.b")
	public int field1297;

	public void run() {
		while (field1298) {
			synchronized (field1301) {
				if (field1297 < 500) {
					field1296[field1297] = field1299.field1087;
					field1300[field1297] = field1299.field1088;
					field1297++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public TLCMWCVC(client arg0) {
		field1299 = arg0;
	}
}
