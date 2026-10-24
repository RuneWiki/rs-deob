package deob;

@ObfuscatedName("XAXJBOWU")
public class XAXJBOWU implements Runnable {

	@ObfuscatedName("XAXJBOWU.a")
	public Object field1365 = new Object();

	@ObfuscatedName("XAXJBOWU.b")
	public int[] field1366 = new int[500];

	@ObfuscatedName("XAXJBOWU.d")
	public int[] field1368 = new int[500];

	@ObfuscatedName("XAXJBOWU.f")
	public boolean field1370 = true;

	@ObfuscatedName("XAXJBOWU.e")
	public client field1369;

	@ObfuscatedName("XAXJBOWU.c")
	public int field1367;

	public XAXJBOWU(client arg0) {
		field1369 = arg0;
	}

	public void run() {
		while (field1370) {
			synchronized (field1365) {
				if (field1367 < 500) {
					field1368[field1367] = field1369.field1297;
					field1366[field1367] = field1369.field1298;
					field1367++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
