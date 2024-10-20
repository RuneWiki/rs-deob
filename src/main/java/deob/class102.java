package deob;

@ObfuscatedName("ca")
public class class102 extends class208 {

    @ObfuscatedName("ca.y")
    public int field1752;

    @ObfuscatedName("ca.d")
    public int field1747;

    @ObfuscatedName("ca.g")
    public int[] field1748;

    @ObfuscatedName("ca.w")
    public int[][] field1753;

    public class102(int arg0, byte[] arg1) {
        this.field1752 = arg0;
        class119 var3 = new class119(arg1);
        this.field1747 = var3.method2326();
        this.field1748 = new int[this.field1747];
        this.field1753 = new int[this.field1747][];
        for (int var4 = 0; var4 < this.field1747; var4++) {
            this.field1748[var4] = var3.method2326();
        }
        for (int var5 = 0; var5 < this.field1747; var5++) {
            this.field1753[var5] = new int[var3.method2326()];
        }
        for (int var6 = 0; var6 < this.field1747; var6++) {
            for (int var7 = 0; var7 < this.field1753[var6].length; var7++) {
                this.field1753[var6][var7] = var3.method2326();
            }
        }
    }
}
