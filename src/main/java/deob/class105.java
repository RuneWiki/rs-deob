package deob;

@ObfuscatedName("dp")
public class class105 extends class179 {

    @ObfuscatedName("dp.j")
    public int field1793;

    @ObfuscatedName("dp.f")
    public int field1792;

    @ObfuscatedName("dp.o")
    public int[] field1794;

    @ObfuscatedName("dp.h")
    public int[][] field1795;

    public class105(int arg0, byte[] arg1) {
        this.field1793 = arg0;
        class127 var3 = new class127(arg1);
        this.field1792 = var3.method2464();
        this.field1794 = new int[this.field1792];
        this.field1795 = new int[this.field1792][];
        for (int var4 = 0; var4 < this.field1792; var4++) {
            this.field1794[var4] = var3.method2464();
        }
        for (int var5 = 0; var5 < this.field1792; var5++) {
            this.field1795[var5] = new int[var3.method2464()];
        }
        for (int var6 = 0; var6 < this.field1792; var6++) {
            for (int var7 = 0; var7 < this.field1795[var6].length; var7++) {
                this.field1795[var6][var7] = var3.method2464();
            }
        }
    }
}
