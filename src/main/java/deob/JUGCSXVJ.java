package deob;

@ObfuscatedName("JUGCSXVJ")
public class JUGCSXVJ implements Runnable {

	@ObfuscatedName("JUGCSXVJ.a")
	public int[] field769 = new int[500];

	@ObfuscatedName("JUGCSXVJ.c")
	public boolean field771 = true;

	@ObfuscatedName("JUGCSXVJ.d")
	public int[] field772 = new int[500];

	@ObfuscatedName("JUGCSXVJ.e")
	public Object field773 = new Object();

	@ObfuscatedName("JUGCSXVJ.b")
	public client field770;

	@ObfuscatedName("JUGCSXVJ.f")
	public int field774;

	public JUGCSXVJ(client arg0) {
		field770 = arg0;
	}

	public void run() {
		while (field771) {
			synchronized (field773) {
				if (field774 < 500) {
					field769[field774] = field770.field1326;
					field772[field774] = field770.field1327;
					field774++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
