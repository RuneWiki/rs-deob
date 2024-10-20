package deob;

@ObfuscatedName("g")
public class class11 implements Runnable {

    @ObfuscatedName("g.z")
    public boolean field174 = true;

    @ObfuscatedName("g.n")
    public Object field175 = new Object();

    @ObfuscatedName("g.u")
    public int field176 = 0;

    @ObfuscatedName("g.t")
    public int[] field177 = new int[500];

    @ObfuscatedName("g.e")
    public int[] field178 = new int[500];

    public void run() {
        while (this.field174) {
            Object var1 = this.field175;
            synchronized (this.field175) {
                if (this.field176 < 500) {
                    this.field177[this.field176] = class124.field1991;
                    this.field178[this.field176] = class124.field1986;
                    this.field176++;
                }
            }
            class111.method1306(50L);
        }
    }
}
