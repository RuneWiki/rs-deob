package deob;

@ObfuscatedName("FDKYSOCX")
public class FDKYSOCX implements Runnable {

	@ObfuscatedName("FDKYSOCX.a")
	public int[] field785 = new int[500];

	@ObfuscatedName("FDKYSOCX.d")
	public boolean field788 = true;

	@ObfuscatedName("FDKYSOCX.e")
	public int[] field789 = new int[500];

	@ObfuscatedName("FDKYSOCX.f")
	public Object field790 = new Object();

	@ObfuscatedName("FDKYSOCX.b")
	public client field786;

	@ObfuscatedName("FDKYSOCX.c")
	public int field787;

	public FDKYSOCX(client arg0) {
		field786 = arg0;
	}

	public void run() {
		while (field788) {
			synchronized (field790) {
				if (field787 < 500) {
					field789[field787] = field786.field711;
					field785[field787] = field786.field712;
					field787++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
