package deob;

@ObfuscatedName("cv")
public class class102 extends class208 {

    @ObfuscatedName("cv.h")
    public int field1756;

    @ObfuscatedName("cv.q")
    public int field1757;

    @ObfuscatedName("cv.v")
    public int[] field1758;

    @ObfuscatedName("cv.n")
    public int[][] field1759;

    public class102(int arg0, byte[] arg1) {
        this.field1756 = arg0;
        class119 var3 = new class119(arg1);
        this.field1757 = var3.method2383();
        this.field1758 = new int[this.field1757];
        this.field1759 = new int[this.field1757][];
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1758[var4] = var3.method2383();
        }
        for (int var5 = 0; var5 < this.field1757; var5++) {
            this.field1759[var5] = new int[var3.method2383()];
        }
        for (int var6 = 0; var6 < this.field1757; var6++) {
            for (int var7 = 0; var7 < this.field1759[var6].length; var7++) {
                this.field1759[var6][var7] = var3.method2383();
            }
        }
    }
}
