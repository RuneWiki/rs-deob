package deob;

@ObfuscatedName("dk")
public class class105 extends class179 {

    @ObfuscatedName("dk.b")
    public int field1806;

    @ObfuscatedName("dk.c")
    public int field1803;

    @ObfuscatedName("dk.j")
    public int[] field1804;

    @ObfuscatedName("dk.i")
    public int[][] field1805;

    public class105(int arg0, byte[] arg1) {
        this.field1806 = arg0;
        class127 var3 = new class127(arg1);
        this.field1803 = var3.method2416();
        this.field1804 = new int[this.field1803];
        this.field1805 = new int[this.field1803][];
        for (int var4 = 0; var4 < this.field1803; var4++) {
            this.field1804[var4] = var3.method2416();
        }
        for (int var5 = 0; var5 < this.field1803; var5++) {
            this.field1805[var5] = new int[var3.method2416()];
        }
        for (int var6 = 0; var6 < this.field1803; var6++) {
            for (int var7 = 0; var7 < this.field1805[var6].length; var7++) {
                this.field1805[var6][var7] = var3.method2416();
            }
        }
    }
}
