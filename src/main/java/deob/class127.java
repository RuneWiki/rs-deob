package deob;

@ObfuscatedName("dq")
public class class127 extends class207 {

    @ObfuscatedName("dq.f")
    public int field1759;

    @ObfuscatedName("dq.l")
    public int field1760;

    @ObfuscatedName("dq.w")
    public int[] field1761;

    @ObfuscatedName("dq.s")
    public int[][] field1762;

    public class127(int arg0, byte[] arg1) {
        this.field1759 = arg0;
        class185 var3 = new class185(arg1);
        this.field1760 = var3.method3344();
        this.field1761 = new int[this.field1760];
        this.field1762 = new int[this.field1760][];
        for (int var4 = 0; var4 < this.field1760; var4++) {
            this.field1761[var4] = var3.method3344();
        }
        for (int var5 = 0; var5 < this.field1760; var5++) {
            this.field1762[var5] = new int[var3.method3344()];
        }
        for (int var6 = 0; var6 < this.field1760; var6++) {
            for (int var7 = 0; var7 < this.field1762[var6].length; var7++) {
                this.field1762[var6][var7] = var3.method3344();
            }
        }
    }
}
