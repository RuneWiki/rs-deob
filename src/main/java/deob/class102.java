package deob;

@ObfuscatedName("cc")
public class class102 extends class208 {

    @ObfuscatedName("cc.j")
    public int field1777;

    @ObfuscatedName("cc.l")
    public int field1771;

    @ObfuscatedName("cc.a")
    public int[] field1772;

    @ObfuscatedName("cc.i")
    public int[][] field1773;

    public class102(int arg0, byte[] arg1) {
        this.field1777 = arg0;
        class119 var3 = new class119(arg1);
        this.field1771 = var3.method2316();
        this.field1772 = new int[this.field1771];
        this.field1773 = new int[this.field1771][];
        for (int var4 = 0; var4 < this.field1771; var4++) {
            this.field1772[var4] = var3.method2316();
        }
        for (int var5 = 0; var5 < this.field1771; var5++) {
            this.field1773[var5] = new int[var3.method2316()];
        }
        for (int var6 = 0; var6 < this.field1771; var6++) {
            for (int var7 = 0; var7 < this.field1773[var6].length; var7++) {
                this.field1773[var6][var7] = var3.method2316();
            }
        }
    }
}
