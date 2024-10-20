package deob;

@ObfuscatedName("dj")
public class class106 extends class212 {

    @ObfuscatedName("dj.l")
    public int field1839;

    @ObfuscatedName("dj.g")
    public int field1836;

    @ObfuscatedName("dj.r")
    public int[] field1837;

    @ObfuscatedName("dj.e")
    public int[][] field1838;

    public class106(int arg0, byte[] arg1) {
        this.field1839 = arg0;
        class123 var3 = new class123(arg1);
        this.field1836 = var3.method2490();
        this.field1837 = new int[this.field1836];
        this.field1838 = new int[this.field1836][];
        for (int var4 = 0; var4 < this.field1836; var4++) {
            this.field1837[var4] = var3.method2490();
        }
        for (int var5 = 0; var5 < this.field1836; var5++) {
            this.field1838[var5] = new int[var3.method2490()];
        }
        for (int var6 = 0; var6 < this.field1836; var6++) {
            for (int var7 = 0; var7 < this.field1838[var6].length; var7++) {
                this.field1838[var6][var7] = var3.method2490();
            }
        }
    }
}
