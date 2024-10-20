package deob;

@ObfuscatedName("e")
public class class13 implements Runnable {

    @ObfuscatedName("e.j")
    public boolean field203 = true;

    @ObfuscatedName("e.y")
    public Object field208 = new Object();

    @ObfuscatedName("e.z")
    public int field200 = 0;

    @ObfuscatedName("e.l")
    public int[] field202 = new int[500];

    @ObfuscatedName("e.w")
    public int[] field204 = new int[500];

    public void run() {
        while (this.field203) {
            Object var1 = this.field208;
            synchronized (this.field208) {
                if (this.field200 < 500) {
                    this.field202[this.field200] = class135.field2045;
                    this.field204[this.field200] = class135.field2046 * 200873089;
                    this.field200++;
                }
            }
            class122.method558(50L);
        }
    }
}
