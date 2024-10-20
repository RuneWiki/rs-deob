package deob;

@ObfuscatedName("cz")
public class class104 extends class177 {

    @ObfuscatedName("cz.c")
    public int field1767;

    @ObfuscatedName("cz.j")
    public int field1769;

    @ObfuscatedName("cz.f")
    public int[] field1765;

    @ObfuscatedName("cz.y")
    public int[][] field1766;

    public class104(int arg0, byte[] arg1) {
        this.field1767 = arg0;
        class125 var3 = new class125(arg1);
        this.field1769 = var3.method2326();
        this.field1765 = new int[this.field1769];
        this.field1766 = new int[this.field1769][];
        for (int var4 = 0; var4 < this.field1769; var4++) {
            this.field1765[var4] = var3.method2326();
        }
        for (int var5 = 0; var5 < this.field1769; var5++) {
            this.field1766[var5] = new int[var3.method2326()];
        }
        for (int var6 = 0; var6 < this.field1769; var6++) {
            for (int var7 = 0; var7 < this.field1766[var6].length; var7++) {
                this.field1766[var6][var7] = var3.method2326();
            }
        }
    }
}
