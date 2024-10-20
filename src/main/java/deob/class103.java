package deob;

@ObfuscatedName("ca")
public class class103 extends class209 {

    @ObfuscatedName("ca.a")
    public int field1764;

    @ObfuscatedName("ca.w")
    public int field1761;

    @ObfuscatedName("ca.d")
    public int[] field1762;

    @ObfuscatedName("ca.c")
    public int[][] field1763;

    public class103(int arg0, byte[] arg1) {
        this.field1764 = arg0;
        class120 var3 = new class120(arg1);
        this.field1761 = var3.method2462();
        this.field1762 = new int[this.field1761];
        this.field1763 = new int[this.field1761][];
        for (int var4 = 0; var4 < this.field1761; var4++) {
            this.field1762[var4] = var3.method2462();
        }
        for (int var5 = 0; var5 < this.field1761; var5++) {
            this.field1763[var5] = new int[var3.method2462()];
        }
        for (int var6 = 0; var6 < this.field1761; var6++) {
            for (int var7 = 0; var7 < this.field1763[var6].length; var7++) {
                this.field1763[var6][var7] = var3.method2462();
            }
        }
    }
}
