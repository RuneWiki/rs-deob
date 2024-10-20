package deob;

@ObfuscatedName("dw")
public class class105 extends class179 {

    @ObfuscatedName("dw.i")
    public int field1798;

    @ObfuscatedName("dw.p")
    public int field1792;

    @ObfuscatedName("dw.a")
    public int[] field1797;

    @ObfuscatedName("dw.l")
    public int[][] field1791;

    public class105(int arg0, byte[] arg1) {
        this.field1798 = arg0;
        class127 var3 = new class127(arg1);
        this.field1792 = var3.method2411();
        this.field1797 = new int[this.field1792];
        this.field1791 = new int[this.field1792][];
        for (int var4 = 0; var4 < this.field1792; var4++) {
            this.field1797[var4] = var3.method2411();
        }
        for (int var5 = 0; var5 < this.field1792; var5++) {
            this.field1791[var5] = new int[var3.method2411()];
        }
        for (int var6 = 0; var6 < this.field1792; var6++) {
            for (int var7 = 0; var7 < this.field1791[var6].length; var7++) {
                this.field1791[var6][var7] = var3.method2411();
            }
        }
    }
}
