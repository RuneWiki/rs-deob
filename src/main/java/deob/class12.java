package deob;

@ObfuscatedName("r")
public class class12 implements Runnable {

    @ObfuscatedName("r.g")
    public boolean field182 = true;

    @ObfuscatedName("r.i")
    public Object field186 = new Object();

    @ObfuscatedName("r.k")
    public int field183 = 0;

    @ObfuscatedName("r.e")
    public int[] field189 = new int[500];

    @ObfuscatedName("r.w")
    public int[] field185 = new int[500];

    public void run() {
        while (this.field182) {
            Object var1 = this.field186;
            synchronized (this.field186) {
                if (this.field183 < 500) {
                    this.field189[this.field183] = class127.field2008;
                    this.field185[this.field183] = class127.field2013;
                    this.field183++;
                }
            }
            class114.method1935(50L);
        }
    }
}
