package deob;

@ObfuscatedName("m")
public class class12 implements Runnable {

    @ObfuscatedName("m.t")
    public boolean field183 = true;

    @ObfuscatedName("m.o")
    public Object field181 = new Object();

    @ObfuscatedName("m.i")
    public int field175 = 0;

    @ObfuscatedName("m.p")
    public int[] field179 = new int[500];

    @ObfuscatedName("m.c")
    public int[] field176 = new int[500];

    public void run() {
        while (this.field183) {
            Object var1 = this.field181;
            synchronized (this.field181) {
                if (this.field175 < 500) {
                    this.field179[this.field175] = class127.field1974;
                    this.field176[this.field175] = class127.field1981;
                    this.field175++;
                }
            }
            class114.method1854(50L);
        }
    }
}
