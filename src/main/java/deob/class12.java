package deob;

@ObfuscatedName("q")
public class class12 implements Runnable {

    @ObfuscatedName("q.b")
    public boolean field187 = true;

    @ObfuscatedName("q.u")
    public Object field183 = new Object();

    @ObfuscatedName("q.x")
    public int field190 = 0;

    @ObfuscatedName("q.j")
    public int[] field186 = new int[500];

    @ObfuscatedName("q.o")
    public int[] field185 = new int[500];

    public void run() {
        while (this.field187) {
            Object var1 = this.field183;
            synchronized (this.field183) {
                if (this.field190 < 500) {
                    this.field186[this.field190] = class127.field2004;
                    this.field185[this.field190] = class127.field2005;
                    this.field190++;
                }
            }
            class114.method2914(50L);
        }
    }
}
