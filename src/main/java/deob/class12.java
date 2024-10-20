package deob;

@ObfuscatedName("y")
public class class12 implements Runnable {

    @ObfuscatedName("y.k")
    public boolean field185 = true;

    @ObfuscatedName("y.b")
    public Object field172 = new Object();

    @ObfuscatedName("y.e")
    public int field183 = 0;

    @ObfuscatedName("y.i")
    public int[] field174 = new int[500];

    @ObfuscatedName("y.t")
    public int[] field179 = new int[500];

    public void run() {
        while (this.field185) {
            Object var1 = this.field172;
            synchronized (this.field172) {
                if (this.field183 < 500) {
                    this.field174[this.field183] = class127.field2010;
                    this.field179[this.field183] = class127.field2017 * -991203695;
                    this.field183++;
                }
            }
            class114.method500(50L);
        }
    }
}
