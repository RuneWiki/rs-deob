package deob;

@ObfuscatedName("dg")
public class class105 extends class179 {

    @ObfuscatedName("dg.t")
    public int field1817;

    @ObfuscatedName("dg.l")
    public int field1818;

    @ObfuscatedName("dg.c")
    public int[] field1819;

    @ObfuscatedName("dg.d")
    public int[][] field1816;

    public class105(int arg0, byte[] arg1) {
        this.field1817 = arg0;
        class127 var3 = new class127(arg1);
        this.field1818 = var3.method2438();
        this.field1819 = new int[this.field1818];
        this.field1816 = new int[this.field1818][];
        for (int var4 = 0; var4 < this.field1818; var4++) {
            this.field1819[var4] = var3.method2438();
        }
        for (int var5 = 0; var5 < this.field1818; var5++) {
            this.field1816[var5] = new int[var3.method2438()];
        }
        for (int var6 = 0; var6 < this.field1818; var6++) {
            for (int var7 = 0; var7 < this.field1816[var6].length; var7++) {
                this.field1816[var6][var7] = var3.method2438();
            }
        }
    }
}
