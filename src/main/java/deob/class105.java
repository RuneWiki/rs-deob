package deob;

@ObfuscatedName("dr")
public class class105 extends class179 {

    @ObfuscatedName("dr.p")
    public int field1799;

    @ObfuscatedName("dr.i")
    public int field1793;

    @ObfuscatedName("dr.o")
    public int[] field1792;

    @ObfuscatedName("dr.n")
    public int[][] field1795;

    public class105(int arg0, byte[] arg1) {
        this.field1799 = arg0;
        class127 var3 = new class127(arg1);
        this.field1793 = var3.method2659();
        this.field1792 = new int[this.field1793];
        this.field1795 = new int[this.field1793][];
        for (int var4 = 0; var4 < this.field1793; var4++) {
            this.field1792[var4] = var3.method2659();
        }
        for (int var5 = 0; var5 < this.field1793; var5++) {
            this.field1795[var5] = new int[var3.method2659()];
        }
        for (int var6 = 0; var6 < this.field1793; var6++) {
            for (int var7 = 0; var7 < this.field1795[var6].length; var7++) {
                this.field1795[var6][var7] = var3.method2659();
            }
        }
    }
}
