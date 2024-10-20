package deob;

@ObfuscatedName("ci")
public class class102 extends class208 {

    @ObfuscatedName("ci.o")
    public int field1763;

    @ObfuscatedName("ci.f")
    public int field1760;

    @ObfuscatedName("ci.i")
    public int[] field1761;

    @ObfuscatedName("ci.h")
    public int[][] field1759;

    public class102(int arg0, byte[] arg1) {
        this.field1763 = arg0;
        class119 var3 = new class119(arg1);
        this.field1760 = var3.method2290();
        this.field1761 = new int[this.field1760];
        this.field1759 = new int[this.field1760][];
        for (int var4 = 0; var4 < this.field1760; var4++) {
            this.field1761[var4] = var3.method2290();
        }
        for (int var5 = 0; var5 < this.field1760; var5++) {
            this.field1759[var5] = new int[var3.method2290()];
        }
        for (int var6 = 0; var6 < this.field1760; var6++) {
            for (int var7 = 0; var7 < this.field1759[var6].length; var7++) {
                this.field1759[var6][var7] = var3.method2290();
            }
        }
    }
}
