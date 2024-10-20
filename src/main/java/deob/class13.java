package deob;

@ObfuscatedName("x")
public class class13 implements Runnable {

    @ObfuscatedName("x.n")
    public boolean field202 = true;

    @ObfuscatedName("x.g")
    public Object field199 = new Object();

    @ObfuscatedName("x.a")
    public int field200 = 0;

    @ObfuscatedName("x.m")
    public int[] field205 = new int[500];

    @ObfuscatedName("x.s")
    public int[] field201 = new int[500];

    public void run() {
        while (this.field202) {
            Object var1 = this.field199;
            synchronized (this.field199) {
                if (this.field200 < 500) {
                    this.field205[this.field200] = class132.field2070;
                    this.field201[this.field200] = class132.field2067;
                    this.field200++;
                }
            }
            class119.method2154(50L);
        }
    }
}
