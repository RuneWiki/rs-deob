package deob;

@ObfuscatedName("di")
public class class106 extends class181 {

    @ObfuscatedName("di.e")
    public int field1783;

    @ObfuscatedName("di.i")
    public int field1781;

    @ObfuscatedName("di.k")
    public int[] field1780;

    @ObfuscatedName("di.q")
    public int[][] field1782;

    public class106(int arg0, byte[] arg1) {
        this.field1783 = arg0;
        class128 var3 = new class128(arg1);
        this.field1781 = var3.method2548();
        this.field1780 = new int[this.field1781];
        this.field1782 = new int[this.field1781][];
        for (int var4 = 0; var4 < this.field1781; var4++) {
            this.field1780[var4] = var3.method2548();
        }
        for (int var5 = 0; var5 < this.field1781; var5++) {
            this.field1782[var5] = new int[var3.method2548()];
        }
        for (int var6 = 0; var6 < this.field1781; var6++) {
            for (int var7 = 0; var7 < this.field1782[var6].length; var7++) {
                this.field1782[var6][var7] = var3.method2548();
            }
        }
    }
}
