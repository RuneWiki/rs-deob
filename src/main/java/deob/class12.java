package deob;

@ObfuscatedName("a")
public class class12 implements Runnable {

    @ObfuscatedName("a.p")
    public boolean field181 = true;

    @ObfuscatedName("a.g")
    public Object field179 = new Object();

    @ObfuscatedName("a.x")
    public int field187 = 0;

    @ObfuscatedName("a.c")
    public int[] field186 = new int[500];

    @ObfuscatedName("a.n")
    public int[] field182 = new int[500];

    public void run() {
        while (this.field181) {
            Object var1 = this.field179;
            synchronized (this.field179) {
                if (this.field187 < 500) {
                    this.field186[this.field187] = class127.field1990;
                    this.field182[this.field187] = class127.field1995;
                    this.field187++;
                }
            }
            class114.method1917(50L);
        }
    }
}
