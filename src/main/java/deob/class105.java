package deob;

@ObfuscatedName("de")
public class class105 extends class179 {

    @ObfuscatedName("de.p")
    public int field1786;

    @ObfuscatedName("de.e")
    public int field1791;

    @ObfuscatedName("de.a")
    public int[] field1785;

    @ObfuscatedName("de.h")
    public int[][] field1788;

    public class105(int arg0, byte[] arg1) {
        this.field1786 = arg0;
        class127 var3 = new class127(arg1);
        this.field1791 = var3.method2494();
        this.field1785 = new int[this.field1791];
        this.field1788 = new int[this.field1791][];
        for (int var4 = 0; var4 < this.field1791; var4++) {
            this.field1785[var4] = var3.method2494();
        }
        for (int var5 = 0; var5 < this.field1791; var5++) {
            this.field1788[var5] = new int[var3.method2494()];
        }
        for (int var6 = 0; var6 < this.field1791; var6++) {
            for (int var7 = 0; var7 < this.field1788[var6].length; var7++) {
                this.field1788[var6][var7] = var3.method2494();
            }
        }
    }
}
