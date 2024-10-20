package deob;

@ObfuscatedName("ev")
public class class132 extends class212 {

    @ObfuscatedName("ev.a")
    public int field1791;

    @ObfuscatedName("ev.s")
    public int field1790;

    @ObfuscatedName("ev.g")
    public int[] field1792;

    @ObfuscatedName("ev.x")
    public int[][] field1793;

    public class132(int arg0, byte[] arg1) {
        this.field1791 = arg0;
        class190 var3 = new class190(arg1);
        this.field1790 = var3.method3443();
        this.field1792 = new int[this.field1790];
        this.field1793 = new int[this.field1790][];
        for (int var4 = 0; var4 < this.field1790; var4++) {
            this.field1792[var4] = var3.method3443();
        }
        for (int var5 = 0; var5 < this.field1790; var5++) {
            this.field1793[var5] = new int[var3.method3443()];
        }
        for (int var6 = 0; var6 < this.field1790; var6++) {
            for (int var7 = 0; var7 < this.field1793[var6].length; var7++) {
                this.field1793[var6][var7] = var3.method3443();
            }
        }
    }
}
