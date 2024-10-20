package deob;

@ObfuscatedName("co")
public class class102 extends class208 {

    @ObfuscatedName("co.f")
    public int field1759;

    @ObfuscatedName("co.s")
    public int field1757;

    @ObfuscatedName("co.q")
    public int[] field1758;

    @ObfuscatedName("co.g")
    public int[][] field1756;

    public class102(int arg0, byte[] arg1) {
        this.field1759 = arg0;
        class119 var3 = new class119(arg1);
        this.field1757 = var3.method2363();
        this.field1758 = new int[this.field1757];
        this.field1756 = new int[this.field1757][];
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1758[var4] = var3.method2363();
        }
        for (int var5 = 0; var5 < this.field1757; var5++) {
            this.field1756[var5] = new int[var3.method2363()];
        }
        for (int var6 = 0; var6 < this.field1757; var6++) {
            for (int var7 = 0; var7 < this.field1756[var6].length; var7++) {
                this.field1756[var6][var7] = var3.method2363();
            }
        }
    }
}
