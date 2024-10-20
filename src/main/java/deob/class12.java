package deob;

@ObfuscatedName("a")
public class class12 implements Runnable {

    @ObfuscatedName("a.e")
    public boolean field174 = true;

    @ObfuscatedName("a.o")
    public Object field181 = new Object();

    @ObfuscatedName("a.y")
    public int field175 = 0;

    @ObfuscatedName("a.b")
    public int[] field176 = new int[500];

    @ObfuscatedName("a.w")
    public int[] field177 = new int[500];

    public void run() {
        while (this.field174) {
            Object var1 = this.field181;
            synchronized (this.field181) {
                if (this.field175 < 500) {
                    this.field176[this.field175] = class127.field2003;
                    this.field177[this.field175] = class127.field2004;
                    this.field175++;
                }
            }
            class114.method134(50L);
        }
    }
}
