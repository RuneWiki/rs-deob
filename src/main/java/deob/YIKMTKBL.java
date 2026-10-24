package deob;

@ObfuscatedName("YIKMTKBL")
public class YIKMTKBL implements Runnable {

	@ObfuscatedName("YIKMTKBL.a")
	public Object field1443 = new Object();

	@ObfuscatedName("YIKMTKBL.b")
	public int[] field1444 = new int[500];

	@ObfuscatedName("YIKMTKBL.c")
	public boolean field1445 = true;

	@ObfuscatedName("YIKMTKBL.e")
	public int[] field1447 = new int[500];

	@ObfuscatedName("YIKMTKBL.d")
	public client field1446;

	@ObfuscatedName("YIKMTKBL.f")
	public int field1448;

	public YIKMTKBL(client arg0) {
		field1446 = arg0;
	}

	public void run() {
		while (field1445) {
			synchronized (field1443) {
				if (field1448 < 500) {
					field1447[field1448] = field1446.field945;
					field1444[field1448] = field1446.field946;
					field1448++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
