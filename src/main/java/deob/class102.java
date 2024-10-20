package deob;

@ObfuscatedName("cg")
public class class102 extends class208 {

    @ObfuscatedName("cg.a")
    public int field1753;

    @ObfuscatedName("cg.r")
    public int field1752;

    @ObfuscatedName("cg.f")
    public int[] field1757;

    @ObfuscatedName("cg.s")
    public int[][] field1754;

    public class102(int arg0, byte[] arg1) {
        this.field1753 = arg0;
        class119 var3 = new class119(arg1);
        this.field1752 = var3.method2412();
        this.field1757 = new int[this.field1752];
        this.field1754 = new int[this.field1752][];
        for (int var4 = 0; var4 < this.field1752; var4++) {
            this.field1757[var4] = var3.method2412();
        }
        for (int var5 = 0; var5 < this.field1752; var5++) {
            this.field1754[var5] = new int[var3.method2412()];
        }
        for (int var6 = 0; var6 < this.field1752; var6++) {
            for (int var7 = 0; var7 < this.field1754[var6].length; var7++) {
                this.field1754[var6][var7] = var3.method2412();
            }
        }
    }
}
