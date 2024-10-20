package deob;

@ObfuscatedName("db")
public class class127 extends class207 {

    @ObfuscatedName("db.g")
    public int field1764;

    @ObfuscatedName("db.r")
    public int field1768;

    @ObfuscatedName("db.e")
    public int[] field1765;

    @ObfuscatedName("db.q")
    public int[][] field1766;

    public class127(int arg0, byte[] arg1) {
        this.field1764 = arg0;
        class185 var3 = new class185(arg1);
        this.field1768 = var3.method3679();
        this.field1765 = new int[this.field1768];
        this.field1766 = new int[this.field1768][];
        for (int var4 = 0; var4 < this.field1768; var4++) {
            this.field1765[var4] = var3.method3679();
        }
        for (int var5 = 0; var5 < this.field1768; var5++) {
            this.field1766[var5] = new int[var3.method3679()];
        }
        for (int var6 = 0; var6 < this.field1768; var6++) {
            for (int var7 = 0; var7 < this.field1766[var6].length; var7++) {
                this.field1766[var6][var7] = var3.method3679();
            }
        }
    }
}
