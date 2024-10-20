package deob;

@ObfuscatedName("f")
public class class12 implements Runnable {

    @ObfuscatedName("f.e")
    public boolean field184 = true;

    @ObfuscatedName("f.v")
    public Object field191 = new Object();

    @ObfuscatedName("f.i")
    public int field185 = 0;

    @ObfuscatedName("f.g")
    public int[] field192 = new int[500];

    @ObfuscatedName("f.x")
    public int[] field188 = new int[500];

    public void run() {
        while (this.field184) {
            Object var1 = this.field191;
            synchronized (this.field191) {
                if (this.field185 < 500) {
                    this.field192[this.field185] = class127.field2007;
                    this.field188[this.field185] = class127.field1997;
                    this.field185++;
                }
            }
            class114.method2357(50L);
        }
    }
}
