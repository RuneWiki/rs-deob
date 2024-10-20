package deob;

@ObfuscatedName("cp")
public class class103 extends class209 {

    @ObfuscatedName("cp.t")
    public int field1774;

    @ObfuscatedName("cp.i")
    public int field1770;

    @ObfuscatedName("cp.g")
    public int[] field1772;

    @ObfuscatedName("cp.h")
    public int[][] field1773;

    public class103(int arg0, byte[] arg1) {
        this.field1774 = arg0;
        class120 var3 = new class120(arg1);
        this.field1770 = var3.method2334();
        this.field1772 = new int[this.field1770];
        this.field1773 = new int[this.field1770][];
        for (int var4 = 0; var4 < this.field1770; var4++) {
            this.field1772[var4] = var3.method2334();
        }
        for (int var5 = 0; var5 < this.field1770; var5++) {
            this.field1773[var5] = new int[var3.method2334()];
        }
        for (int var6 = 0; var6 < this.field1770; var6++) {
            for (int var7 = 0; var7 < this.field1773[var6].length; var7++) {
                this.field1773[var6][var7] = var3.method2334();
            }
        }
    }
}
