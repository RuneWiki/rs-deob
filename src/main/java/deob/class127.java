package deob;

@ObfuscatedName("dx")
public class class127 extends class207 {

    @ObfuscatedName("dx.f")
    public int field1760;

    @ObfuscatedName("dx.h")
    public int field1761;

    @ObfuscatedName("dx.e")
    public int[] field1758;

    @ObfuscatedName("dx.b")
    public int[][] field1759;

    public class127(int arg0, byte[] arg1) {
        this.field1760 = arg0;
        class185 var3 = new class185(arg1);
        this.field1761 = var3.method3323();
        this.field1758 = new int[this.field1761];
        this.field1759 = new int[this.field1761][];
        for (int var4 = 0; var4 < this.field1761; var4++) {
            this.field1758[var4] = var3.method3323();
        }
        for (int var5 = 0; var5 < this.field1761; var5++) {
            this.field1759[var5] = new int[var3.method3323()];
        }
        for (int var6 = 0; var6 < this.field1761; var6++) {
            for (int var7 = 0; var7 < this.field1759[var6].length; var7++) {
                this.field1759[var6][var7] = var3.method3323();
            }
        }
    }
}
