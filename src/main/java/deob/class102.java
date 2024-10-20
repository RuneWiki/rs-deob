package deob;

@ObfuscatedName("ca")
public class class102 extends class208 {

    @ObfuscatedName("ca.l")
    public int field1750;

    @ObfuscatedName("ca.e")
    public int field1746;

    @ObfuscatedName("ca.q")
    public int[] field1756;

    @ObfuscatedName("ca.o")
    public int[][] field1745;

    public class102(int arg0, byte[] arg1) {
        this.field1750 = arg0;
        class119 var3 = new class119(arg1);
        this.field1746 = var3.method2388();
        this.field1756 = new int[this.field1746];
        this.field1745 = new int[this.field1746][];
        for (int var4 = 0; var4 < this.field1746; var4++) {
            this.field1756[var4] = var3.method2388();
        }
        for (int var5 = 0; var5 < this.field1746; var5++) {
            this.field1745[var5] = new int[var3.method2388()];
        }
        for (int var6 = 0; var6 < this.field1746; var6++) {
            for (int var7 = 0; var7 < this.field1745[var6].length; var7++) {
                this.field1745[var6][var7] = var3.method2388();
            }
        }
    }
}
