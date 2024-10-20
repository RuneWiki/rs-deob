package deob;

@ObfuscatedName("i")
public class class12 implements Runnable {

    @ObfuscatedName("i.e")
    public boolean field191 = true;

    @ObfuscatedName("i.p")
    public Object field184 = new Object();

    @ObfuscatedName("i.a")
    public int field187 = 0;

    @ObfuscatedName("i.g")
    public int[] field186 = new int[500];

    @ObfuscatedName("i.u")
    public int[] field188 = new int[500];

    public void run() {
        while (this.field191) {
            Object var1 = this.field184;
            synchronized (this.field184) {
                if (this.field187 < 500) {
                    this.field186[this.field187] = class127.field2004;
                    this.field188[this.field187] = class127.field2001;
                    this.field187++;
                }
            }
            class114.method658(50L);
        }
    }
}
