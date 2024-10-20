package deob;

@ObfuscatedName("dm")
public class class106 extends class181 {

    @ObfuscatedName("dm.i")
    public int field1799;

    @ObfuscatedName("dm.b")
    public int field1797;

    @ObfuscatedName("dm.r")
    public int[] field1798;

    @ObfuscatedName("dm.l")
    public int[][] field1796;

    public class106(int arg0, byte[] arg1) {
        this.field1799 = arg0;
        class128 var3 = new class128(arg1);
        this.field1797 = var3.method2531();
        this.field1798 = new int[this.field1797];
        this.field1796 = new int[this.field1797][];
        for (int var4 = 0; var4 < this.field1797; var4++) {
            this.field1798[var4] = var3.method2531();
        }
        for (int var5 = 0; var5 < this.field1797; var5++) {
            this.field1796[var5] = new int[var3.method2531()];
        }
        for (int var6 = 0; var6 < this.field1797; var6++) {
            for (int var7 = 0; var7 < this.field1796[var6].length; var7++) {
                this.field1796[var6][var7] = var3.method2531();
            }
        }
    }
}
