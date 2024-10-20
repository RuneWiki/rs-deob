package deob;

@ObfuscatedName("cs")
public class class102 extends class208 {

    @ObfuscatedName("cs.j")
    public int field1747;

    @ObfuscatedName("cs.m")
    public int field1746;

    @ObfuscatedName("cs.f")
    public int[] field1743;

    @ObfuscatedName("cs.l")
    public int[][] field1744;

    public class102(int arg0, byte[] arg1) {
        this.field1747 = arg0;
        class119 var3 = new class119(arg1);
        this.field1746 = var3.method2372();
        this.field1743 = new int[this.field1746];
        this.field1744 = new int[this.field1746][];
        for (int var4 = 0; var4 < this.field1746; var4++) {
            this.field1743[var4] = var3.method2372();
        }
        for (int var5 = 0; var5 < this.field1746; var5++) {
            this.field1744[var5] = new int[var3.method2372()];
        }
        for (int var6 = 0; var6 < this.field1746; var6++) {
            for (int var7 = 0; var7 < this.field1744[var6].length; var7++) {
                this.field1744[var6][var7] = var3.method2372();
            }
        }
    }
}
