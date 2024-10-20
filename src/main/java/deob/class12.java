package deob;

@ObfuscatedName("n")
public class class12 implements Runnable {

    @ObfuscatedName("n.k")
    public boolean field182 = true;

    @ObfuscatedName("n.r")
    public Object field188 = new Object();

    @ObfuscatedName("n.y")
    public int field180 = 0;

    @ObfuscatedName("n.w")
    public int[] field181 = new int[500];

    @ObfuscatedName("n.m")
    public int[] field183 = new int[500];

    public void run() {
        while (this.field182) {
            Object var1 = this.field188;
            synchronized (this.field188) {
                if (this.field180 < 500) {
                    this.field181[this.field180] = class127.field2011;
                    this.field183[this.field180] = class127.field2008 * -391950985;
                    this.field180++;
                }
            }
            class114.method2808(50L);
        }
    }
}
