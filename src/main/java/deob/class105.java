package deob;

@ObfuscatedName("dq")
public class class105 extends class179 {

    @ObfuscatedName("dq.y")
    public int field1772;

    @ObfuscatedName("dq.m")
    public int field1773;

    @ObfuscatedName("dq.d")
    public int[] field1774;

    @ObfuscatedName("dq.k")
    public int[][] field1778;

    public class105(int arg0, byte[] arg1) {
        this.field1772 = arg0;
        class127 var3 = new class127(arg1);
        this.field1773 = var3.method2534();
        this.field1774 = new int[this.field1773];
        this.field1778 = new int[this.field1773][];
        for (int var4 = 0; var4 < this.field1773; var4++) {
            this.field1774[var4] = var3.method2534();
        }
        for (int var5 = 0; var5 < this.field1773; var5++) {
            this.field1778[var5] = new int[var3.method2534()];
        }
        for (int var6 = 0; var6 < this.field1773; var6++) {
            for (int var7 = 0; var7 < this.field1778[var6].length; var7++) {
                this.field1778[var6][var7] = var3.method2534();
            }
        }
    }
}
