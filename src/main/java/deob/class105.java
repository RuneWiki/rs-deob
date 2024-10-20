package deob;

@ObfuscatedName("dy")
public class class105 extends class179 {

    @ObfuscatedName("dy.g")
    public int field1782;

    @ObfuscatedName("dy.m")
    public int field1781;

    @ObfuscatedName("dy.v")
    public int[] field1785;

    @ObfuscatedName("dy.r")
    public int[][] field1783;

    public class105(int arg0, byte[] arg1) {
        this.field1782 = arg0;
        class127 var3 = new class127(arg1);
        this.field1781 = var3.method2414();
        this.field1785 = new int[this.field1781];
        this.field1783 = new int[this.field1781][];
        for (int var4 = 0; var4 < this.field1781; var4++) {
            this.field1785[var4] = var3.method2414();
        }
        for (int var5 = 0; var5 < this.field1781; var5++) {
            this.field1783[var5] = new int[var3.method2414()];
        }
        for (int var6 = 0; var6 < this.field1781; var6++) {
            for (int var7 = 0; var7 < this.field1783[var6].length; var7++) {
                this.field1783[var6][var7] = var3.method2414();
            }
        }
    }
}
