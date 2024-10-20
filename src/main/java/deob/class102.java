package deob;

@ObfuscatedName("cz")
public class class102 extends class208 {

    @ObfuscatedName("cz.n")
    public int field1744;

    @ObfuscatedName("cz.q")
    public int field1745;

    @ObfuscatedName("cz.c")
    public int[] field1746;

    @ObfuscatedName("cz.l")
    public int[][] field1747;

    public class102(int arg0, byte[] arg1) {
        this.field1744 = arg0;
        class119 var3 = new class119(arg1);
        this.field1745 = var3.method2360();
        this.field1746 = new int[this.field1745];
        this.field1747 = new int[this.field1745][];
        for (int var4 = 0; var4 < this.field1745; var4++) {
            this.field1746[var4] = var3.method2360();
        }
        for (int var5 = 0; var5 < this.field1745; var5++) {
            this.field1747[var5] = new int[var3.method2360()];
        }
        for (int var6 = 0; var6 < this.field1745; var6++) {
            for (int var7 = 0; var7 < this.field1747[var6].length; var7++) {
                this.field1747[var6][var7] = var3.method2360();
            }
        }
    }
}
