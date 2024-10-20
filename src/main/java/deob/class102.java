package deob;

@ObfuscatedName("cp")
public class class102 extends class208 {

    @ObfuscatedName("cp.v")
    public int field1745;

    @ObfuscatedName("cp.f")
    public int field1739;

    @ObfuscatedName("cp.i")
    public int[] field1747;

    @ObfuscatedName("cp.d")
    public int[][] field1741;

    public class102(int arg0, byte[] arg1) {
        this.field1745 = arg0;
        class119 var3 = new class119(arg1);
        this.field1739 = var3.method2400();
        this.field1747 = new int[this.field1739];
        this.field1741 = new int[this.field1739][];
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1747[var4] = var3.method2400();
        }
        for (int var5 = 0; var5 < this.field1739; var5++) {
            this.field1741[var5] = new int[var3.method2400()];
        }
        for (int var6 = 0; var6 < this.field1739; var6++) {
            for (int var7 = 0; var7 < this.field1741[var6].length; var7++) {
                this.field1741[var6][var7] = var3.method2400();
            }
        }
    }
}
