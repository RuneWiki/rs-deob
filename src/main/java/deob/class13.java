package deob;

@ObfuscatedName("v")
public class class13 implements Runnable {

    @ObfuscatedName("v.n")
    public boolean field195 = true;

    @ObfuscatedName("v.o")
    public Object field186 = new Object();

    @ObfuscatedName("v.a")
    public int field187 = 0;

    @ObfuscatedName("v.w")
    public int[] field196 = new int[500];

    @ObfuscatedName("v.m")
    public int[] field193 = new int[500];

    public void run() {
        while (this.field195) {
            Object var1 = this.field186;
            synchronized (this.field186) {
                if (this.field187 < 500) {
                    this.field196[this.field187] = class132.field2049;
                    this.field193[this.field187] = class132.field2050;
                    this.field187++;
                }
            }
            class119.method2156(50L);
        }
    }
}
