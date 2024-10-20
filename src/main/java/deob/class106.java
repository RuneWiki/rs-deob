package deob;

@ObfuscatedName("db")
public class class106 extends class212 {

    @ObfuscatedName("db.i")
    public int field1826;

    @ObfuscatedName("db.h")
    public int field1820;

    @ObfuscatedName("db.e")
    public int[] field1819;

    @ObfuscatedName("db.g")
    public int[][] field1821;

    public class106(int arg0, byte[] arg1) {
        this.field1826 = arg0;
        class123 var3 = new class123(arg1);
        this.field1820 = var3.method2404();
        this.field1819 = new int[this.field1820];
        this.field1821 = new int[this.field1820][];
        for (int var4 = 0; var4 < this.field1820; var4++) {
            this.field1819[var4] = var3.method2404();
        }
        for (int var5 = 0; var5 < this.field1820; var5++) {
            this.field1821[var5] = new int[var3.method2404()];
        }
        for (int var6 = 0; var6 < this.field1820; var6++) {
            for (int var7 = 0; var7 < this.field1821[var6].length; var7++) {
                this.field1821[var6][var7] = var3.method2404();
            }
        }
    }
}
