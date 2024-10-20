package deob;

@ObfuscatedName("df")
public class class105 extends class179 {

    @ObfuscatedName("df.j")
    public int field1772;

    @ObfuscatedName("df.r")
    public int field1767;

    @ObfuscatedName("df.v")
    public int[] field1771;

    @ObfuscatedName("df.p")
    public int[][] field1769;

    public class105(int arg0, byte[] arg1) {
        this.field1772 = arg0;
        class127 var3 = new class127(arg1);
        this.field1767 = var3.method2441();
        this.field1771 = new int[this.field1767];
        this.field1769 = new int[this.field1767][];
        for (int var4 = 0; var4 < this.field1767; var4++) {
            this.field1771[var4] = var3.method2441();
        }
        for (int var5 = 0; var5 < this.field1767; var5++) {
            this.field1769[var5] = new int[var3.method2441()];
        }
        for (int var6 = 0; var6 < this.field1767; var6++) {
            for (int var7 = 0; var7 < this.field1769[var6].length; var7++) {
                this.field1769[var6][var7] = var3.method2441();
            }
        }
    }
}
