package deob;

@ObfuscatedName("cz")
public class class104 extends class178 {

    @ObfuscatedName("cz.p")
    public int field1794;

    @ObfuscatedName("cz.j")
    public int field1792;

    @ObfuscatedName("cz.w")
    public int[] field1793;

    @ObfuscatedName("cz.h")
    public int[][] field1795;

    public class104(int arg0, byte[] arg1) {
        this.field1794 = arg0;
        class126 var3 = new class126(arg1);
        this.field1792 = var3.method2544();
        this.field1793 = new int[this.field1792];
        this.field1795 = new int[this.field1792][];
        for (int var4 = 0; var4 < this.field1792; var4++) {
            this.field1793[var4] = var3.method2544();
        }
        for (int var5 = 0; var5 < this.field1792; var5++) {
            this.field1795[var5] = new int[var3.method2544()];
        }
        for (int var6 = 0; var6 < this.field1792; var6++) {
            for (int var7 = 0; var7 < this.field1795[var6].length; var7++) {
                this.field1795[var6][var7] = var3.method2544();
            }
        }
    }
}
