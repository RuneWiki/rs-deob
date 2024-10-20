package deob;

@ObfuscatedName("ew")
public class class132 extends class212 {

    @ObfuscatedName("ew.n")
    public int field1784;

    @ObfuscatedName("ew.h")
    public int field1781;

    @ObfuscatedName("ew.l")
    public int[] field1780;

    @ObfuscatedName("ew.g")
    public int[][] field1783;

    public class132(int arg0, byte[] arg1) {
        this.field1784 = arg0;
        class190 var3 = new class190(arg1);
        this.field1781 = var3.method3511();
        this.field1780 = new int[this.field1781];
        this.field1783 = new int[this.field1781][];
        for (int var4 = 0; var4 < this.field1781; var4++) {
            this.field1780[var4] = var3.method3511();
        }
        for (int var5 = 0; var5 < this.field1781; var5++) {
            this.field1783[var5] = new int[var3.method3511()];
        }
        for (int var6 = 0; var6 < this.field1781; var6++) {
            for (int var7 = 0; var7 < this.field1783[var6].length; var7++) {
                this.field1783[var6][var7] = var3.method3511();
            }
        }
    }
}
