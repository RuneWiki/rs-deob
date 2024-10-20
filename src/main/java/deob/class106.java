package deob;

@ObfuscatedName("di")
public class class106 extends class212 {

    @ObfuscatedName("di.m")
    public int field1830;

    @ObfuscatedName("di.w")
    public int field1838;

    @ObfuscatedName("di.e")
    public int[] field1832;

    @ObfuscatedName("di.o")
    public int[][] field1833;

    public class106(int arg0, byte[] arg1) {
        this.field1830 = arg0;
        class123 var3 = new class123(arg1);
        this.field1838 = var3.method2398();
        this.field1832 = new int[this.field1838];
        this.field1833 = new int[this.field1838][];
        for (int var4 = 0; var4 < this.field1838; var4++) {
            this.field1832[var4] = var3.method2398();
        }
        for (int var5 = 0; var5 < this.field1838; var5++) {
            this.field1833[var5] = new int[var3.method2398()];
        }
        for (int var6 = 0; var6 < this.field1838; var6++) {
            for (int var7 = 0; var7 < this.field1833[var6].length; var7++) {
                this.field1833[var6][var7] = var3.method2398();
            }
        }
    }
}
