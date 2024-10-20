package deob;

@ObfuscatedName("ch")
public class class104 extends class177 {

    @ObfuscatedName("ch.j")
    public int field1769;

    @ObfuscatedName("ch.y")
    public int field1767;

    @ObfuscatedName("ch.x")
    public int[] field1768;

    @ObfuscatedName("ch.z")
    public int[][] field1773;

    public class104(int arg0, byte[] arg1) {
        this.field1769 = arg0;
        class126 var3 = new class126(arg1);
        this.field1767 = var3.method2399();
        this.field1768 = new int[this.field1767];
        this.field1773 = new int[this.field1767][];
        for (int var4 = 0; var4 < this.field1767; var4++) {
            this.field1768[var4] = var3.method2399();
        }
        for (int var5 = 0; var5 < this.field1767; var5++) {
            this.field1773[var5] = new int[var3.method2399()];
        }
        for (int var6 = 0; var6 < this.field1767; var6++) {
            for (int var7 = 0; var7 < this.field1773[var6].length; var7++) {
                this.field1773[var6][var7] = var3.method2399();
            }
        }
    }
}
