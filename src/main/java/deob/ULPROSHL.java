package deob;

@ObfuscatedName("ULPROSHL")
public class ULPROSHL implements Runnable {

	@ObfuscatedName("ULPROSHL.a")
	public Object field1231 = new Object();

	@ObfuscatedName("ULPROSHL.d")
	public int[] field1234 = new int[500];

	@ObfuscatedName("ULPROSHL.e")
	public boolean field1235 = true;

	@ObfuscatedName("ULPROSHL.f")
	public int[] field1236 = new int[500];

	@ObfuscatedName("ULPROSHL.b")
	public client field1232;

	@ObfuscatedName("ULPROSHL.c")
	public int field1233;

	public void run() {
		while (field1235) {
			synchronized (field1231) {
				if (field1233 < 500) {
					field1236[field1233] = field1232.field83;
					field1234[field1233] = field1232.field84;
					field1233++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public ULPROSHL(client arg0) {
		field1232 = arg0;
	}
}
