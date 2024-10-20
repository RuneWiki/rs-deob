package deob;

@ObfuscatedName("j")
public class class12 implements Runnable {

    @ObfuscatedName("j.g")
    public boolean field180 = true;

    @ObfuscatedName("j.s")
    public Object field179 = new Object();

    @ObfuscatedName("j.v")
    public int field181 = 0;

    @ObfuscatedName("j.o")
    public int[] field182 = new int[500];

    @ObfuscatedName("j.k")
    public int[] field183 = new int[500];

    public void run() {
        while (this.field180) {
            Object var1 = this.field179;
            synchronized (this.field179) {
                if (this.field181 < 500) {
                    this.field182[this.field181] = class127.field2035;
                    this.field183[this.field181] = class127.field2029;
                    this.field181++;
                }
            }
            class114.method26(50L);
        }
    }
}
