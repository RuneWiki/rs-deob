package deob;

@ObfuscatedName("da")
public class class127 extends class207 {

    @ObfuscatedName("da.y")
    public int field1758;

    @ObfuscatedName("da.c")
    public int field1763;

    @ObfuscatedName("da.n")
    public int[] field1760;

    @ObfuscatedName("da.u")
    public int[][] field1761;

    public class127(int arg0, byte[] arg1) {
        this.field1758 = arg0;
        class185 var3 = new class185(arg1);
        this.field1763 = var3.method3299();
        this.field1760 = new int[this.field1763];
        this.field1761 = new int[this.field1763][];
        for (int var4 = 0; var4 < this.field1763; var4++) {
            this.field1760[var4] = var3.method3299();
        }
        for (int var5 = 0; var5 < this.field1763; var5++) {
            this.field1761[var5] = new int[var3.method3299()];
        }
        for (int var6 = 0; var6 < this.field1763; var6++) {
            for (int var7 = 0; var7 < this.field1761[var6].length; var7++) {
                this.field1761[var6][var7] = var3.method3299();
            }
        }
    }
}
