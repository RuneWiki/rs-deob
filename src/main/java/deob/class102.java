package deob;

@ObfuscatedName("ch")
public class class102 extends class208 {

    @ObfuscatedName("ch.n")
    public int field1750;

    @ObfuscatedName("ch.d")
    public int field1747;

    @ObfuscatedName("ch.s")
    public int[] field1748;

    @ObfuscatedName("ch.q")
    public int[][] field1749;

    public class102(int arg0, byte[] arg1) {
        this.field1750 = arg0;
        class119 var3 = new class119(arg1);
        this.field1747 = var3.method2338();
        this.field1748 = new int[this.field1747];
        this.field1749 = new int[this.field1747][];
        for (int var4 = 0; var4 < this.field1747; var4++) {
            this.field1748[var4] = var3.method2338();
        }
        for (int var5 = 0; var5 < this.field1747; var5++) {
            this.field1749[var5] = new int[var3.method2338()];
        }
        for (int var6 = 0; var6 < this.field1747; var6++) {
            for (int var7 = 0; var7 < this.field1749[var6].length; var7++) {
                this.field1749[var6][var7] = var3.method2338();
            }
        }
    }
}
