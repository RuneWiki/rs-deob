package deob;

@ObfuscatedName("di")
public class class105 extends class179 {

    @ObfuscatedName("di.a")
    public int field1787;

    @ObfuscatedName("di.x")
    public int field1788;

    @ObfuscatedName("di.e")
    public int[] field1789;

    @ObfuscatedName("di.r")
    public int[][] field1790;

    public class105(int arg0, byte[] arg1) {
        this.field1787 = arg0;
        class127 var3 = new class127(arg1);
        this.field1788 = var3.method2411();
        this.field1789 = new int[this.field1788];
        this.field1790 = new int[this.field1788][];
        for (int var4 = 0; var4 < this.field1788; var4++) {
            this.field1789[var4] = var3.method2411();
        }
        for (int var5 = 0; var5 < this.field1788; var5++) {
            this.field1790[var5] = new int[var3.method2411()];
        }
        for (int var6 = 0; var6 < this.field1788; var6++) {
            for (int var7 = 0; var7 < this.field1790[var6].length; var7++) {
                this.field1790[var6][var7] = var3.method2411();
            }
        }
    }
}
