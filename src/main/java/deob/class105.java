package deob;

@ObfuscatedName("dr")
public class class105 extends class179 {

    @ObfuscatedName("dr.q")
    public int field1788;

    @ObfuscatedName("dr.c")
    public int field1789;

    @ObfuscatedName("dr.p")
    public int[] field1791;

    @ObfuscatedName("dr.z")
    public int[][] field1790;

    public class105(int arg0, byte[] arg1) {
        this.field1788 = arg0;
        class127 var3 = new class127(arg1);
        this.field1789 = var3.method2534();
        this.field1791 = new int[this.field1789];
        this.field1790 = new int[this.field1789][];
        for (int var4 = 0; var4 < this.field1789; var4++) {
            this.field1791[var4] = var3.method2534();
        }
        for (int var5 = 0; var5 < this.field1789; var5++) {
            this.field1790[var5] = new int[var3.method2534()];
        }
        for (int var6 = 0; var6 < this.field1789; var6++) {
            for (int var7 = 0; var7 < this.field1790[var6].length; var7++) {
                this.field1790[var6][var7] = var3.method2534();
            }
        }
    }
}
