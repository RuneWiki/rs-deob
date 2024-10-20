package deob;

@ObfuscatedName("ce")
public class class102 extends class208 {

    @ObfuscatedName("ce.d")
    public int field1749;

    @ObfuscatedName("ce.p")
    public int field1757;

    @ObfuscatedName("ce.v")
    public int[] field1748;

    @ObfuscatedName("ce.l")
    public int[][] field1751;

    public class102(int arg0, byte[] arg1) {
        this.field1749 = arg0;
        class119 var3 = new class119(arg1);
        this.field1757 = var3.method2357();
        this.field1748 = new int[this.field1757];
        this.field1751 = new int[this.field1757][];
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1748[var4] = var3.method2357();
        }
        for (int var5 = 0; var5 < this.field1757; var5++) {
            this.field1751[var5] = new int[var3.method2357()];
        }
        for (int var6 = 0; var6 < this.field1757; var6++) {
            for (int var7 = 0; var7 < this.field1751[var6].length; var7++) {
                this.field1751[var6][var7] = var3.method2357();
            }
        }
    }
}
