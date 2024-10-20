package deob;

@ObfuscatedName("dv")
public class class106 extends class212 {

    @ObfuscatedName("dv.e")
    public int field1838;

    @ObfuscatedName("dv.l")
    public int field1837;

    @ObfuscatedName("dv.c")
    public int[] field1844;

    @ObfuscatedName("dv.h")
    public int[][] field1839;

    public class106(int arg0, byte[] arg1) {
        this.field1838 = arg0;
        class123 var3 = new class123(arg1);
        this.field1837 = var3.method2464();
        this.field1844 = new int[this.field1837];
        this.field1839 = new int[this.field1837][];
        for (int var4 = 0; var4 < this.field1837; var4++) {
            this.field1844[var4] = var3.method2464();
        }
        for (int var5 = 0; var5 < this.field1837; var5++) {
            this.field1839[var5] = new int[var3.method2464()];
        }
        for (int var6 = 0; var6 < this.field1837; var6++) {
            for (int var7 = 0; var7 < this.field1839[var6].length; var7++) {
                this.field1839[var6][var7] = var3.method2464();
            }
        }
    }
}
