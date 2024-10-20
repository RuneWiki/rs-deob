package deob;

@ObfuscatedName("x")
public class class12 implements Runnable {

    @ObfuscatedName("x.c")
    public boolean field183 = true;

    @ObfuscatedName("x.j")
    public Object field177 = new Object();

    @ObfuscatedName("x.y")
    public int field179 = 0;

    @ObfuscatedName("x.r")
    public int[] field180 = new int[500];

    @ObfuscatedName("x.f")
    public int[] field181 = new int[500];

    public void run() {
        while (this.field183) {
            Object var1 = this.field177;
            synchronized (this.field177) {
                if (this.field179 < 500) {
                    this.field180[this.field179] = class129.field1987;
                    this.field181[this.field179] = class129.field1988;
                    this.field179++;
                }
            }
            class116.method2713(50L);
        }
    }
}
