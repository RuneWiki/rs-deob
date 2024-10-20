package deob;

@ObfuscatedName("cn")
public class class102 extends class208 {

    @ObfuscatedName("cn.o")
    public int field1749;

    @ObfuscatedName("cn.e")
    public int field1748;

    @ObfuscatedName("cn.u")
    public int[] field1752;

    @ObfuscatedName("cn.b")
    public int[][] field1750;

    public class102(int arg0, byte[] arg1) {
        this.field1749 = arg0;
        class119 var3 = new class119(arg1);
        this.field1748 = var3.method2427();
        this.field1752 = new int[this.field1748];
        this.field1750 = new int[this.field1748][];
        for (int var4 = 0; var4 < this.field1748; var4++) {
            this.field1752[var4] = var3.method2427();
        }
        for (int var5 = 0; var5 < this.field1748; var5++) {
            this.field1750[var5] = new int[var3.method2427()];
        }
        for (int var6 = 0; var6 < this.field1748; var6++) {
            for (int var7 = 0; var7 < this.field1750[var6].length; var7++) {
                this.field1750[var6][var7] = var3.method2427();
            }
        }
    }
}
