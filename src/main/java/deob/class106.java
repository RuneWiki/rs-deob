package deob;

@ObfuscatedName("dt")
public class class106 extends class212 {

    @ObfuscatedName("dt.a")
    public int field1844;

    @ObfuscatedName("dt.d")
    public int field1845;

    @ObfuscatedName("dt.v")
    public int[] field1848;

    @ObfuscatedName("dt.r")
    public int[][] field1847;

    public class106(int arg0, byte[] arg1) {
        this.field1844 = arg0;
        class123 var3 = new class123(arg1);
        this.field1845 = var3.method2395();
        this.field1848 = new int[this.field1845];
        this.field1847 = new int[this.field1845][];
        for (int var4 = 0; var4 < this.field1845; var4++) {
            this.field1848[var4] = var3.method2395();
        }
        for (int var5 = 0; var5 < this.field1845; var5++) {
            this.field1847[var5] = new int[var3.method2395()];
        }
        for (int var6 = 0; var6 < this.field1845; var6++) {
            for (int var7 = 0; var7 < this.field1847[var6].length; var7++) {
                this.field1847[var6][var7] = var3.method2395();
            }
        }
    }
}
