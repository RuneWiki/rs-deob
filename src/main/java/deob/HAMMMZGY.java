package deob;

@ObfuscatedName("HAMMMZGY")
public class HAMMMZGY implements Runnable {

	@ObfuscatedName("HAMMMZGY.a")
	public int[] field794 = new int[500];

	@ObfuscatedName("HAMMMZGY.b")
	public boolean field795 = true;

	@ObfuscatedName("HAMMMZGY.c")
	public int[] field796 = new int[500];

	@ObfuscatedName("HAMMMZGY.e")
	public Object field798 = new Object();

	@ObfuscatedName("HAMMMZGY.f")
	public client field799;

	@ObfuscatedName("HAMMMZGY.d")
	public int field797;

	public HAMMMZGY(client arg0) {
		field799 = arg0;
	}

	public void run() {
		while (field795) {
			synchronized (field798) {
				if (field797 < 500) {
					field796[field797] = field799.field1035;
					field794[field797] = field799.field1036;
					field797++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
