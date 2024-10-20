package deob;

@ObfuscatedName("dt")
public class class125 extends class205 {

    @ObfuscatedName("dt.z")
    public int field1705;

    @ObfuscatedName("dt.w")
    public int field1706;

    @ObfuscatedName("dt.s")
    public int[] field1707;

    @ObfuscatedName("dt.l")
    public int[][] field1708;

    public class125(int arg0, byte[] arg1) {
        this.field1705 = arg0;
        class183 var3 = new class183(arg1);
        this.field1706 = var3.method3247();
        this.field1707 = new int[this.field1706];
        this.field1708 = new int[this.field1706][];
        for (int var4 = 0; var4 < this.field1706; var4++) {
            this.field1707[var4] = var3.method3247();
        }
        for (int var5 = 0; var5 < this.field1706; var5++) {
            this.field1708[var5] = new int[var3.method3247()];
        }
        for (int var6 = 0; var6 < this.field1706; var6++) {
            for (int var7 = 0; var7 < this.field1708[var6].length; var7++) {
                this.field1708[var6][var7] = var3.method3247();
            }
        }
    }
}
