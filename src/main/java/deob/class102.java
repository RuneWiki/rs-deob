package deob;

@ObfuscatedName("cr")
public class class102 extends class208 {

    @ObfuscatedName("cr.m")
    public int field1716;

    @ObfuscatedName("cr.l")
    public int field1715;

    @ObfuscatedName("cr.y")
    public int[] field1714;

    @ObfuscatedName("cr.u")
    public int[][] field1717;

    public class102(int arg0, byte[] arg1) {
        this.field1716 = arg0;
        class119 var3 = new class119(arg1);
        this.field1715 = var3.method2562();
        this.field1714 = new int[this.field1715];
        this.field1717 = new int[this.field1715][];
        for (int var4 = 0; var4 < this.field1715; var4++) {
            this.field1714[var4] = var3.method2562();
        }
        for (int var5 = 0; var5 < this.field1715; var5++) {
            this.field1717[var5] = new int[var3.method2562()];
        }
        for (int var6 = 0; var6 < this.field1715; var6++) {
            for (int var7 = 0; var7 < this.field1717[var6].length; var7++) {
                this.field1717[var6][var7] = var3.method2562();
            }
        }
    }
}
