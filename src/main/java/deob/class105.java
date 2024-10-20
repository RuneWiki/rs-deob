package deob;

@ObfuscatedName("di")
public class class105 extends class179 {

    @ObfuscatedName("di.d")
    public int field1784;

    @ObfuscatedName("di.g")
    public int field1779;

    @ObfuscatedName("di.a")
    public int[] field1780;

    @ObfuscatedName("di.t")
    public int[][] field1785;

    public class105(int arg0, byte[] arg1) {
        this.field1784 = arg0;
        class127 var3 = new class127(arg1);
        this.field1779 = var3.method2509();
        this.field1780 = new int[this.field1779];
        this.field1785 = new int[this.field1779][];
        for (int var4 = 0; var4 < this.field1779; var4++) {
            this.field1780[var4] = var3.method2509();
        }
        for (int var5 = 0; var5 < this.field1779; var5++) {
            this.field1785[var5] = new int[var3.method2509()];
        }
        for (int var6 = 0; var6 < this.field1779; var6++) {
            for (int var7 = 0; var7 < this.field1785[var6].length; var7++) {
                this.field1785[var6][var7] = var3.method2509();
            }
        }
    }
}
