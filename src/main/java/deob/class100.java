package deob;

@ObfuscatedName("z")
public class class100 implements Runnable {

    @ObfuscatedName("z.b")
    public boolean field1382 = true;

    @ObfuscatedName("z.k")
    public int field1385 = 0;

    @ObfuscatedName("z.h")
    public Object field1384 = new Object();

    @ObfuscatedName("z.w")
    public int[] field1381 = new int[500];

    @ObfuscatedName("z.t")
    public int[] field1379 = new int[500];

    public void run() {
        while (this.field1382) {
            Object var1 = this.field1384;
            synchronized (this.field1384) {
                if (this.field1385 < 500) {
                    this.field1381[this.field1385] = class108.field1801;
                    this.field1379[this.field1385] = class108.field1802;
                    this.field1385++;
                }
            }
            class134.method600(50L);
        }
    }
}
