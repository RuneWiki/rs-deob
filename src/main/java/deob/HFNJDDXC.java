package deob;

@ObfuscatedName("HFNJDDXC")
public class HFNJDDXC implements Runnable {

	@ObfuscatedName("HFNJDDXC.c")
	public boolean field768 = true;

	@ObfuscatedName("HFNJDDXC.d")
	public int[] field769 = new int[500];

	@ObfuscatedName("HFNJDDXC.e")
	public int[] field770 = new int[500];

	@ObfuscatedName("HFNJDDXC.f")
	public Object field771 = new Object();

	@ObfuscatedName("HFNJDDXC.b")
	public client field767;

	@ObfuscatedName("HFNJDDXC.a")
	public int field766;

	public void run() {
		while (field768) {
			synchronized (field771) {
				if (field766 < 500) {
					field770[field766] = field767.field825;
					field769[field766] = field767.field826;
					field766++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public HFNJDDXC(client arg0) {
		field767 = arg0;
	}
}
