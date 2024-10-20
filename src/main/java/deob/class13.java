package deob;

@ObfuscatedName("q")
public class class13 implements Runnable {

    @ObfuscatedName("q.n")
    public boolean field181 = true;

    @ObfuscatedName("q.d")
    public Object field174 = new Object();

    @ObfuscatedName("q.z")
    public int field175 = 0;

    @ObfuscatedName("q.y")
    public int[] field179 = new int[500];

    @ObfuscatedName("q.e")
    public int[] field177 = new int[500];

    public void run() {
        while (this.field181) {
            Object var1 = this.field174;
            synchronized (this.field174) {
                if (this.field175 < 500) {
                    this.field179[this.field175] = class132.field2061;
                    this.field177[this.field175] = class132.field2062 * 130670055;
                    this.field175++;
                }
            }
            class119.method3147(50L);
        }
    }
}
