package deob;

@ObfuscatedName("dg")
public class class105 extends class179 {

    @ObfuscatedName("dg.p")
    public int field1784;

    @ObfuscatedName("dg.l")
    public int field1782;

    @ObfuscatedName("dg.d")
    public int[] field1783;

    @ObfuscatedName("dg.x")
    public int[][] field1786;

    public class105(int arg0, byte[] arg1) {
        this.field1784 = arg0;
        class127 var3 = new class127(arg1);
        this.field1782 = var3.method2498();
        this.field1783 = new int[this.field1782];
        this.field1786 = new int[this.field1782][];
        for (int var4 = 0; var4 < this.field1782; var4++) {
            this.field1783[var4] = var3.method2498();
        }
        for (int var5 = 0; var5 < this.field1782; var5++) {
            this.field1786[var5] = new int[var3.method2498()];
        }
        for (int var6 = 0; var6 < this.field1782; var6++) {
            for (int var7 = 0; var7 < this.field1786[var6].length; var7++) {
                this.field1786[var6][var7] = var3.method2498();
            }
        }
    }
}
