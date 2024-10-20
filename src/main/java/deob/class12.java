package deob;

@ObfuscatedName("v")
public class class12 implements Runnable {

    @ObfuscatedName("v.f")
    public boolean field176 = true;

    @ObfuscatedName("v.k")
    public Object field172 = new Object();

    @ObfuscatedName("v.y")
    public int field168 = 0;

    @ObfuscatedName("v.e")
    public int[] field169 = new int[500];

    @ObfuscatedName("v.r")
    public int[] field170 = new int[500];

    public void run() {
        while (this.field176) {
            Object var1 = this.field172;
            synchronized (this.field172) {
                if (this.field168 < 500) {
                    this.field169[this.field168] = class129.field2017;
                    this.field170[this.field168] = class129.field2018;
                    this.field168++;
                }
            }
            class116.method557(50L);
        }
    }
}
