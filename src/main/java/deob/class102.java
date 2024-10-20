package deob;

@ObfuscatedName("cm")
public class class102 extends class208 {

    @ObfuscatedName("cm.k")
    public int field1733;

    @ObfuscatedName("cm.h")
    public int field1726;

    @ObfuscatedName("cm.o")
    public int[] field1729;

    @ObfuscatedName("cm.z")
    public int[][] field1727;

    public class102(int arg0, byte[] arg1) {
        this.field1733 = arg0;
        class119 var3 = new class119(arg1);
        this.field1726 = var3.method2330();
        this.field1729 = new int[this.field1726];
        this.field1727 = new int[this.field1726][];
        for (int var4 = 0; var4 < this.field1726; var4++) {
            this.field1729[var4] = var3.method2330();
        }
        for (int var5 = 0; var5 < this.field1726; var5++) {
            this.field1727[var5] = new int[var3.method2330()];
        }
        for (int var6 = 0; var6 < this.field1726; var6++) {
            for (int var7 = 0; var7 < this.field1727[var6].length; var7++) {
                this.field1727[var6][var7] = var3.method2330();
            }
        }
    }
}
