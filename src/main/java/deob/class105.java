package deob;

@ObfuscatedName("du")
public class class105 extends class179 {

    @ObfuscatedName("du.c")
    public int field1798;

    @ObfuscatedName("du.q")
    public int field1792;

    @ObfuscatedName("du.y")
    public int[] field1791;

    @ObfuscatedName("du.v")
    public int[][] field1794;

    public class105(int arg0, byte[] arg1) {
        this.field1798 = arg0;
        class127 var3 = new class127(arg1);
        this.field1792 = var3.method2383();
        this.field1791 = new int[this.field1792];
        this.field1794 = new int[this.field1792][];
        for (int var4 = 0; var4 < this.field1792; var4++) {
            this.field1791[var4] = var3.method2383();
        }
        for (int var5 = 0; var5 < this.field1792; var5++) {
            this.field1794[var5] = new int[var3.method2383()];
        }
        for (int var6 = 0; var6 < this.field1792; var6++) {
            for (int var7 = 0; var7 < this.field1794[var6].length; var7++) {
                this.field1794[var6][var7] = var3.method2383();
            }
        }
    }
}
