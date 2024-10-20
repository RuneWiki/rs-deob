package deob;

@ObfuscatedName("dw")
public class class105 extends class180 {

    @ObfuscatedName("dw.l")
    public int field1764;

    @ObfuscatedName("dw.b")
    public int field1760;

    @ObfuscatedName("dw.o")
    public int[] field1761;

    @ObfuscatedName("dw.w")
    public int[][] field1759;

    public class105(int arg0, byte[] arg1) {
        this.field1764 = arg0;
        class127 var3 = new class127(arg1);
        this.field1760 = var3.method2440();
        this.field1761 = new int[this.field1760];
        this.field1759 = new int[this.field1760][];
        for (int var4 = 0; var4 < this.field1760; var4++) {
            this.field1761[var4] = var3.method2440();
        }
        for (int var5 = 0; var5 < this.field1760; var5++) {
            this.field1759[var5] = new int[var3.method2440()];
        }
        for (int var6 = 0; var6 < this.field1760; var6++) {
            for (int var7 = 0; var7 < this.field1759[var6].length; var7++) {
                this.field1759[var6][var7] = var3.method2440();
            }
        }
    }
}
