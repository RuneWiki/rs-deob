package deob;

@ObfuscatedName("dx")
public class class105 extends class179 {

    @ObfuscatedName("dx.f")
    public int field1780;

    @ObfuscatedName("dx.t")
    public int field1777;

    @ObfuscatedName("dx.n")
    public int[] field1779;

    @ObfuscatedName("dx.e")
    public int[][] field1776;

    public class105(int arg0, byte[] arg1) {
        this.field1780 = arg0;
        class127 var3 = new class127(arg1);
        this.field1777 = var3.method2458();
        this.field1779 = new int[this.field1777];
        this.field1776 = new int[this.field1777][];
        for (int var4 = 0; var4 < this.field1777; var4++) {
            this.field1779[var4] = var3.method2458();
        }
        for (int var5 = 0; var5 < this.field1777; var5++) {
            this.field1776[var5] = new int[var3.method2458()];
        }
        for (int var6 = 0; var6 < this.field1777; var6++) {
            for (int var7 = 0; var7 < this.field1776[var6].length; var7++) {
                this.field1776[var6][var7] = var3.method2458();
            }
        }
    }
}
