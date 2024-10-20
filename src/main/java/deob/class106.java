package deob;

@ObfuscatedName("dr")
public class class106 extends class212 {

    @ObfuscatedName("dr.x")
    public int field1821;

    @ObfuscatedName("dr.r")
    public int field1818;

    @ObfuscatedName("dr.j")
    public int[] field1822;

    @ObfuscatedName("dr.z")
    public int[][] field1820;

    public class106(int arg0, byte[] arg1) {
        this.field1821 = arg0;
        class123 var3 = new class123(arg1);
        this.field1818 = var3.method2408();
        this.field1822 = new int[this.field1818];
        this.field1820 = new int[this.field1818][];
        for (int var4 = 0; var4 < this.field1818; var4++) {
            this.field1822[var4] = var3.method2408();
        }
        for (int var5 = 0; var5 < this.field1818; var5++) {
            this.field1820[var5] = new int[var3.method2408()];
        }
        for (int var6 = 0; var6 < this.field1818; var6++) {
            for (int var7 = 0; var7 < this.field1820[var6].length; var7++) {
                this.field1820[var6][var7] = var3.method2408();
            }
        }
    }
}
