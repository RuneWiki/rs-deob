package deob;

@ObfuscatedName("MWZVGOTL")
public class MWZVGOTL implements Runnable {

	@ObfuscatedName("MWZVGOTL.b")
	public int[] field871 = new int[500];

	@ObfuscatedName("MWZVGOTL.c")
	public Object field872 = new Object();

	@ObfuscatedName("MWZVGOTL.e")
	public boolean field874 = true;

	@ObfuscatedName("MWZVGOTL.f")
	public int[] field875 = new int[500];

	@ObfuscatedName("MWZVGOTL.d")
	public client field873;

	@ObfuscatedName("MWZVGOTL.a")
	public int field870;

	public MWZVGOTL(client arg0) {
		field873 = arg0;
	}

	public void run() {
		while (field874) {
			synchronized (field872) {
				if (field870 < 500) {
					field871[field870] = field873.field1207;
					field875[field870] = field873.field1208;
					field870++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
