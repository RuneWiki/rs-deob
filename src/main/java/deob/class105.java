package deob;

@ObfuscatedName("de")
public class class105 extends class179 {

    @ObfuscatedName("de.a")
    public int field1762;

    @ObfuscatedName("de.r")
    public int field1755;

    @ObfuscatedName("de.u")
    public int[] field1758;

    @ObfuscatedName("de.t")
    public int[][] field1760;

    public class105(int arg0, byte[] arg1) {
        this.field1762 = arg0;
        class126 var3 = new class126(arg1);
        this.field1755 = var3.method2481();
        this.field1758 = new int[this.field1755];
        this.field1760 = new int[this.field1755][];
        for (int var4 = 0; var4 < this.field1755; var4++) {
            this.field1758[var4] = var3.method2481();
        }
        for (int var5 = 0; var5 < this.field1755; var5++) {
            this.field1760[var5] = new int[var3.method2481()];
        }
        for (int var6 = 0; var6 < this.field1755; var6++) {
            for (int var7 = 0; var7 < this.field1760[var6].length; var7++) {
                this.field1760[var6][var7] = var3.method2481();
            }
        }
    }
}
