package deob;

@ObfuscatedName("dv")
public class class105 extends class179 {

    @ObfuscatedName("dv.g")
    public int field1769;

    @ObfuscatedName("dv.h")
    public int field1765;

    @ObfuscatedName("dv.s")
    public int[] field1768;

    @ObfuscatedName("dv.o")
    public int[][] field1771;

    public class105(int arg0, byte[] arg1) {
        this.field1769 = arg0;
        class127 var3 = new class127(arg1);
        this.field1765 = var3.method2499();
        this.field1768 = new int[this.field1765];
        this.field1771 = new int[this.field1765][];
        for (int var4 = 0; var4 < this.field1765; var4++) {
            this.field1768[var4] = var3.method2499();
        }
        for (int var5 = 0; var5 < this.field1765; var5++) {
            this.field1771[var5] = new int[var3.method2499()];
        }
        for (int var6 = 0; var6 < this.field1765; var6++) {
            for (int var7 = 0; var7 < this.field1771[var6].length; var7++) {
                this.field1771[var6][var7] = var3.method2499();
            }
        }
    }
}
