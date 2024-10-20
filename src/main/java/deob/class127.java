package deob;

@ObfuscatedName("dn")
public class class127 extends class207 {

    @ObfuscatedName("dn.v")
    public int field1759;

    @ObfuscatedName("dn.s")
    public int field1758;

    @ObfuscatedName("dn.o")
    public int[] field1757;

    @ObfuscatedName("dn.k")
    public int[][] field1760;

    public class127(int arg0, byte[] arg1) {
        this.field1759 = arg0;
        class185 var3 = new class185(arg1);
        this.field1758 = var3.method3274();
        this.field1757 = new int[this.field1758];
        this.field1760 = new int[this.field1758][];
        for (int var4 = 0; var4 < this.field1758; var4++) {
            this.field1757[var4] = var3.method3274();
        }
        for (int var5 = 0; var5 < this.field1758; var5++) {
            this.field1760[var5] = new int[var3.method3274()];
        }
        for (int var6 = 0; var6 < this.field1758; var6++) {
            for (int var7 = 0; var7 < this.field1760[var6].length; var7++) {
                this.field1760[var6][var7] = var3.method3274();
            }
        }
    }
}
