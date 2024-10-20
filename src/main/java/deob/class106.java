package deob;

@ObfuscatedName("dv")
public class class106 extends class212 {

    @ObfuscatedName("dv.f")
    public int field1831;

    @ObfuscatedName("dv.e")
    public int field1829;

    @ObfuscatedName("dv.n")
    public int[] field1824;

    @ObfuscatedName("dv.t")
    public int[][] field1830;

    public class106(int arg0, byte[] arg1) {
        this.field1831 = arg0;
        class123 var3 = new class123(arg1);
        this.field1829 = var3.method2522();
        this.field1824 = new int[this.field1829];
        this.field1830 = new int[this.field1829][];
        for (int var4 = 0; var4 < this.field1829; var4++) {
            this.field1824[var4] = var3.method2522();
        }
        for (int var5 = 0; var5 < this.field1829; var5++) {
            this.field1830[var5] = new int[var3.method2522()];
        }
        for (int var6 = 0; var6 < this.field1829; var6++) {
            for (int var7 = 0; var7 < this.field1830[var6].length; var7++) {
                this.field1830[var6][var7] = var3.method2522();
            }
        }
    }
}
