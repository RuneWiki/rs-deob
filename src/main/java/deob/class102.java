package deob;

@ObfuscatedName("cf")
public class class102 extends class208 {

    @ObfuscatedName("cf.c")
    public int field1736;

    @ObfuscatedName("cf.h")
    public int field1731;

    @ObfuscatedName("cf.k")
    public int[] field1732;

    @ObfuscatedName("cf.t")
    public int[][] field1733;

    public class102(int arg0, byte[] arg1) {
        this.field1736 = arg0;
        class119 var3 = new class119(arg1);
        this.field1731 = var3.method2291();
        this.field1732 = new int[this.field1731];
        this.field1733 = new int[this.field1731][];
        for (int var4 = 0; var4 < this.field1731; var4++) {
            this.field1732[var4] = var3.method2291();
        }
        for (int var5 = 0; var5 < this.field1731; var5++) {
            this.field1733[var5] = new int[var3.method2291()];
        }
        for (int var6 = 0; var6 < this.field1731; var6++) {
            for (int var7 = 0; var7 < this.field1733[var6].length; var7++) {
                this.field1733[var6][var7] = var3.method2291();
            }
        }
    }
}
