package deob;

@ObfuscatedName("cg")
public class class104 extends class178 {

    @ObfuscatedName("cg.v")
    public int field1780;

    @ObfuscatedName("cg.f")
    public int field1773;

    @ObfuscatedName("cg.n")
    public int[] field1772;

    @ObfuscatedName("cg.c")
    public int[][] field1775;

    public class104(int arg0, byte[] arg1) {
        this.field1780 = arg0;
        class126 var3 = new class126(arg1);
        this.field1773 = var3.method2466();
        this.field1772 = new int[this.field1773];
        this.field1775 = new int[this.field1773][];
        for (int var4 = 0; var4 < this.field1773; var4++) {
            this.field1772[var4] = var3.method2466();
        }
        for (int var5 = 0; var5 < this.field1773; var5++) {
            this.field1775[var5] = new int[var3.method2466()];
        }
        for (int var6 = 0; var6 < this.field1773; var6++) {
            for (int var7 = 0; var7 < this.field1775[var6].length; var7++) {
                this.field1775[var6][var7] = var3.method2466();
            }
        }
    }
}
