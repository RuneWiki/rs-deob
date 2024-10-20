package deob;

@ObfuscatedName("df")
public class class105 extends class179 {

    @ObfuscatedName("df.i")
    public int field1789;

    @ObfuscatedName("df.w")
    public int field1791;

    @ObfuscatedName("df.f")
    public int[] field1790;

    @ObfuscatedName("df.e")
    public int[][] field1792;

    public class105(int arg0, byte[] arg1) {
        this.field1789 = arg0;
        class127 var3 = new class127(arg1);
        this.field1791 = var3.method2472();
        this.field1790 = new int[this.field1791];
        this.field1792 = new int[this.field1791][];
        for (int var4 = 0; var4 < this.field1791; var4++) {
            this.field1790[var4] = var3.method2472();
        }
        for (int var5 = 0; var5 < this.field1791; var5++) {
            this.field1792[var5] = new int[var3.method2472()];
        }
        for (int var6 = 0; var6 < this.field1791; var6++) {
            for (int var7 = 0; var7 < this.field1792[var6].length; var7++) {
                this.field1792[var6][var7] = var3.method2472();
            }
        }
    }
}
