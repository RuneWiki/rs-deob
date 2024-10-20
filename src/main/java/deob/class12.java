package deob;

@ObfuscatedName("v")
public class class12 implements Runnable {

    @ObfuscatedName("v.n")
    public boolean field191 = true;

    @ObfuscatedName("v.x")
    public Object field185 = new Object();

    @ObfuscatedName("v.k")
    public int field186 = 0;

    @ObfuscatedName("v.i")
    public int[] field187 = new int[500];

    @ObfuscatedName("v.d")
    public int[] field193 = new int[500];

    public void run() {
        while (this.field191) {
            Object var1 = this.field185;
            synchronized (this.field185) {
                if (this.field186 < 500) {
                    this.field187[this.field186] = class127.field1989;
                    this.field193[this.field186] = class127.field1990;
                    this.field186++;
                }
            }
            class114.method25(50L);
        }
    }
}
