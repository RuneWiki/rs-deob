package deob;

@ObfuscatedName("df")
public class class106 extends class212 {

    @ObfuscatedName("df.k")
    public int field1825;

    @ObfuscatedName("df.q")
    public int field1823;

    @ObfuscatedName("df.f")
    public int[] field1826;

    @ObfuscatedName("df.c")
    public int[][] field1827;

    public class106(int arg0, byte[] arg1) {
        this.field1825 = arg0;
        class123 var3 = new class123(arg1);
        this.field1823 = var3.method2427();
        this.field1826 = new int[this.field1823];
        this.field1827 = new int[this.field1823][];
        for (int var4 = 0; var4 < this.field1823; var4++) {
            this.field1826[var4] = var3.method2427();
        }
        for (int var5 = 0; var5 < this.field1823; var5++) {
            this.field1827[var5] = new int[var3.method2427()];
        }
        for (int var6 = 0; var6 < this.field1823; var6++) {
            for (int var7 = 0; var7 < this.field1827[var6].length; var7++) {
                this.field1827[var6][var7] = var3.method2427();
            }
        }
    }
}
