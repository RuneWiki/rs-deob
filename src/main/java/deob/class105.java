package deob;

@ObfuscatedName("dc")
public class class105 extends class179 {

    @ObfuscatedName("dc.i")
    public int field1793;

    @ObfuscatedName("dc.v")
    public int field1794;

    @ObfuscatedName("dc.m")
    public int[] field1791;

    @ObfuscatedName("dc.j")
    public int[][] field1792;

    public class105(int arg0, byte[] arg1) {
        this.field1793 = arg0;
        class127 var3 = new class127(arg1);
        this.field1794 = var3.method2491();
        this.field1791 = new int[this.field1794];
        this.field1792 = new int[this.field1794][];
        for (int var4 = 0; var4 < this.field1794; var4++) {
            this.field1791[var4] = var3.method2491();
        }
        for (int var5 = 0; var5 < this.field1794; var5++) {
            this.field1792[var5] = new int[var3.method2491()];
        }
        for (int var6 = 0; var6 < this.field1794; var6++) {
            for (int var7 = 0; var7 < this.field1792[var6].length; var7++) {
                this.field1792[var6][var7] = var3.method2491();
            }
        }
    }
}
