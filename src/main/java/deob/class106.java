package deob;

@ObfuscatedName("db")
public class class106 extends class212 {

    @ObfuscatedName("db.s")
    public int field1807;

    @ObfuscatedName("db.z")
    public int field1804;

    @ObfuscatedName("db.t")
    public int[] field1805;

    @ObfuscatedName("db.y")
    public int[][] field1806;

    public class106(int arg0, byte[] arg1) {
        this.field1807 = arg0;
        class123 var3 = new class123(arg1);
        this.field1804 = var3.method2363();
        this.field1805 = new int[this.field1804];
        this.field1806 = new int[this.field1804][];
        for (int var4 = 0; var4 < this.field1804; var4++) {
            this.field1805[var4] = var3.method2363();
        }
        for (int var5 = 0; var5 < this.field1804; var5++) {
            this.field1806[var5] = new int[var3.method2363()];
        }
        for (int var6 = 0; var6 < this.field1804; var6++) {
            for (int var7 = 0; var7 < this.field1806[var6].length; var7++) {
                this.field1806[var6][var7] = var3.method2363();
            }
        }
    }
}
