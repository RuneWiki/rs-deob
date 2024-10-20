package deob;

@ObfuscatedName("m")
public class class12 implements Runnable {

    @ObfuscatedName("m.p")
    public boolean field156 = true;

    @ObfuscatedName("m.y")
    public Object field162 = new Object();

    @ObfuscatedName("m.d")
    public int field163 = 0;

    @ObfuscatedName("m.c")
    public int[] field157 = new int[500];

    @ObfuscatedName("m.r")
    public int[] field158 = new int[500];

    public void run() {
        while (this.field156) {
            Object var1 = this.field162;
            synchronized (this.field162) {
                if (this.field163 < 500) {
                    this.field157[this.field163] = class131.field2009;
                    this.field158[this.field163] = class131.field2010;
                    this.field163++;
                }
            }
            class118.method1901(50L);
        }
    }
}
