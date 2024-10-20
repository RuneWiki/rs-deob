package deob;

@ObfuscatedName("y")
public class class12 implements Runnable {

    @ObfuscatedName("y.g")
    public boolean field163 = true;

    @ObfuscatedName("y.j")
    public Object field161 = new Object();

    @ObfuscatedName("y.z")
    public int field162 = 0;

    @ObfuscatedName("y.b")
    public int[] field165 = new int[500];

    @ObfuscatedName("y.k")
    public int[] field160 = new int[500];

    public void run() {
        while (this.field163) {
            Object var1 = this.field161;
            synchronized (this.field161) {
                if (this.field162 < 500) {
                    this.field165[this.field162] = class129.field1996;
                    this.field160[this.field162] = class129.field1997 * -918864945;
                    this.field162++;
                }
            }
            class116.method154(50L);
        }
    }
}
