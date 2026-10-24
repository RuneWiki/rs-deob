package deob;

@ObfuscatedName("VXFBFZWJ")
public class VXFBFZWJ implements Runnable {

	@ObfuscatedName("VXFBFZWJ.a")
	public boolean field1345 = true;

	@ObfuscatedName("VXFBFZWJ.d")
	public int[] field1348 = new int[500];

	@ObfuscatedName("VXFBFZWJ.e")
	public Object field1349 = new Object();

	@ObfuscatedName("VXFBFZWJ.f")
	public int[] field1350 = new int[500];

	@ObfuscatedName("VXFBFZWJ.b")
	public client field1346;

	@ObfuscatedName("VXFBFZWJ.c")
	public int field1347;

	public void run() {
		while (field1345) {
			synchronized (field1349) {
				if (field1347 < 500) {
					field1348[field1347] = field1346.field17;
					field1350[field1347] = field1346.field18;
					field1347++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public VXFBFZWJ(client arg0) {
		field1346 = arg0;
	}
}
