package deob;

@ObfuscatedName("WTODRXXL")
public class WTODRXXL implements Runnable {

	@ObfuscatedName("WTODRXXL.a")
	public int[] field1364 = new int[500];

	@ObfuscatedName("WTODRXXL.b")
	public boolean field1365 = true;

	@ObfuscatedName("WTODRXXL.c")
	public Object field1366 = new Object();

	@ObfuscatedName("WTODRXXL.d")
	public int[] field1367 = new int[500];

	@ObfuscatedName("WTODRXXL.e")
	public client field1368;

	@ObfuscatedName("WTODRXXL.f")
	public int field1369;

	public void run() {
		while (field1365) {
			synchronized (field1366) {
				if (field1369 < 500) {
					field1364[field1369] = field1368.field68;
					field1367[field1369] = field1368.field69;
					field1369++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public WTODRXXL(client arg0) {
		field1368 = arg0;
	}
}
