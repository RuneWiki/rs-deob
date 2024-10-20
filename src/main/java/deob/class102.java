package deob;

@ObfuscatedName("cj")
public class class102 extends class208 {

    @ObfuscatedName("cj.z")
    public int field1760;

    @ObfuscatedName("cj.q")
    public int field1751;

    @ObfuscatedName("cj.k")
    public int[] field1752;

    @ObfuscatedName("cj.f")
    public int[][] field1755;

    public class102(int arg0, byte[] arg1) {
        this.field1760 = arg0;
        class119 var3 = new class119(arg1);
        this.field1751 = var3.method2457();
        this.field1752 = new int[this.field1751];
        this.field1755 = new int[this.field1751][];
        for (int var4 = 0; var4 < this.field1751; var4++) {
            this.field1752[var4] = var3.method2457();
        }
        for (int var5 = 0; var5 < this.field1751; var5++) {
            this.field1755[var5] = new int[var3.method2457()];
        }
        for (int var6 = 0; var6 < this.field1751; var6++) {
            for (int var7 = 0; var7 < this.field1755[var6].length; var7++) {
                this.field1755[var6][var7] = var3.method2457();
            }
        }
    }
}
