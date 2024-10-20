package deob;

@ObfuscatedName("f")
public class class12 implements Runnable {

    @ObfuscatedName("f.a")
    public boolean field181 = true;

    @ObfuscatedName("f.v")
    public Object field184 = new Object();

    @ObfuscatedName("f.i")
    public int field180 = 0;

    @ObfuscatedName("f.b")
    public int[] field182 = new int[500];

    @ObfuscatedName("f.l")
    public int[] field183 = new int[500];

    public void run() {
        while (this.field181) {
            Object var1 = this.field184;
            synchronized (this.field184) {
                if (this.field180 < 500) {
                    this.field182[this.field180] = class131.field2030;
                    this.field183[this.field180] = class131.field2031 * -778357537;
                    this.field180++;
                }
            }
            class118.method2072(50L);
        }
    }
}
