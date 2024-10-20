package deob;

@ObfuscatedName("cl")
public class class104 extends class178 {

    @ObfuscatedName("cl.u")
    public int field1768;

    @ObfuscatedName("cl.k")
    public int field1763;

    @ObfuscatedName("cl.x")
    public int[] field1765;

    @ObfuscatedName("cl.m")
    public int[][] field1764;

    public class104(int arg0, byte[] arg1) {
        this.field1768 = arg0;
        class126 var3 = new class126(arg1);
        this.field1763 = var3.method2559();
        this.field1765 = new int[this.field1763];
        this.field1764 = new int[this.field1763][];
        for (int var4 = 0; var4 < this.field1763; var4++) {
            this.field1765[var4] = var3.method2559();
        }
        for (int var5 = 0; var5 < this.field1763; var5++) {
            this.field1764[var5] = new int[var3.method2559()];
        }
        for (int var6 = 0; var6 < this.field1763; var6++) {
            for (int var7 = 0; var7 < this.field1764[var6].length; var7++) {
                this.field1764[var6][var7] = var3.method2559();
            }
        }
    }
}
