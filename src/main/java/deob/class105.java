package deob;

@ObfuscatedName("dk")
public class class105 extends class179 {

    @ObfuscatedName("dk.x")
    public int field1762;

    @ObfuscatedName("dk.p")
    public int field1755;

    @ObfuscatedName("dk.k")
    public int[] field1756;

    @ObfuscatedName("dk.a")
    public int[][] field1757;

    public class105(int arg0, byte[] arg1) {
        this.field1762 = arg0;
        class127 var3 = new class127(arg1);
        this.field1755 = var3.method2484();
        this.field1756 = new int[this.field1755];
        this.field1757 = new int[this.field1755][];
        for (int var4 = 0; var4 < this.field1755; var4++) {
            this.field1756[var4] = var3.method2484();
        }
        for (int var5 = 0; var5 < this.field1755; var5++) {
            this.field1757[var5] = new int[var3.method2484()];
        }
        for (int var6 = 0; var6 < this.field1755; var6++) {
            for (int var7 = 0; var7 < this.field1757[var6].length; var7++) {
                this.field1757[var6][var7] = var3.method2484();
            }
        }
    }
}
