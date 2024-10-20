package deob;

@ObfuscatedName("dx")
public class class125 extends class205 {

    @ObfuscatedName("dx.w")
    public int field1739;

    @ObfuscatedName("dx.m")
    public int field1740;

    @ObfuscatedName("dx.q")
    public int[] field1738;

    @ObfuscatedName("dx.b")
    public int[][] field1736;

    public class125(int arg0, byte[] arg1) {
        this.field1739 = arg0;
        class183 var3 = new class183(arg1);
        this.field1740 = var3.method3436();
        this.field1738 = new int[this.field1740];
        this.field1736 = new int[this.field1740][];
        for (int var4 = 0; var4 < this.field1740; var4++) {
            this.field1738[var4] = var3.method3436();
        }
        for (int var5 = 0; var5 < this.field1740; var5++) {
            this.field1736[var5] = new int[var3.method3436()];
        }
        for (int var6 = 0; var6 < this.field1740; var6++) {
            for (int var7 = 0; var7 < this.field1736[var6].length; var7++) {
                this.field1736[var6][var7] = var3.method3436();
            }
        }
    }
}
