package deob;

@ObfuscatedName("JAGFVRIK")
public class JAGFVRIK implements Runnable {

	@ObfuscatedName("JAGFVRIK.b")
	public int[] field787 = new int[500];

	@ObfuscatedName("JAGFVRIK.c")
	public boolean field788 = true;

	@ObfuscatedName("JAGFVRIK.d")
	public int[] field789 = new int[500];

	@ObfuscatedName("JAGFVRIK.e")
	public Object field790 = new Object();

	@ObfuscatedName("JAGFVRIK.f")
	public client field791;

	@ObfuscatedName("JAGFVRIK.a")
	public int field786;

	public void run() {
		while (field788) {
			synchronized (field790) {
				if (field786 < 500) {
					field789[field786] = field791.field1381;
					field787[field786] = field791.field1382;
					field786++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public JAGFVRIK(client arg0) {
		field791 = arg0;
	}
}
