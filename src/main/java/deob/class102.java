package deob;

@ObfuscatedName("ca")
public class class102 extends class208 {

    @ObfuscatedName("ca.i")
    public int field1758;

    @ObfuscatedName("ca.v")
    public int field1759;

    @ObfuscatedName("ca.f")
    public int[] field1756;

    @ObfuscatedName("ca.h")
    public int[][] field1757;

    public class102(int arg0, byte[] arg1) {
        this.field1758 = arg0;
        class119 var3 = new class119(arg1);
        this.field1759 = var3.method2310();
        this.field1756 = new int[this.field1759];
        this.field1757 = new int[this.field1759][];
        for (int var4 = 0; var4 < this.field1759; var4++) {
            this.field1756[var4] = var3.method2310();
        }
        for (int var5 = 0; var5 < this.field1759; var5++) {
            this.field1757[var5] = new int[var3.method2310()];
        }
        for (int var6 = 0; var6 < this.field1759; var6++) {
            for (int var7 = 0; var7 < this.field1757[var6].length; var7++) {
                this.field1757[var6][var7] = var3.method2310();
            }
        }
    }
}
