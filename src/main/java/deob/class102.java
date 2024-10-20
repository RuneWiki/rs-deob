package deob;

@ObfuscatedName("ca")
public class class102 extends class208 {

    @ObfuscatedName("ca.h")
    public int field1767;

    @ObfuscatedName("ca.m")
    public int field1760;

    @ObfuscatedName("ca.i")
    public int[] field1761;

    @ObfuscatedName("ca.q")
    public int[][] field1762;

    public class102(int arg0, byte[] arg1) {
        this.field1767 = arg0;
        class119 var3 = new class119(arg1);
        this.field1760 = var3.method2320();
        this.field1761 = new int[this.field1760];
        this.field1762 = new int[this.field1760][];
        for (int var4 = 0; var4 < this.field1760; var4++) {
            this.field1761[var4] = var3.method2320();
        }
        for (int var5 = 0; var5 < this.field1760; var5++) {
            this.field1762[var5] = new int[var3.method2320()];
        }
        for (int var6 = 0; var6 < this.field1760; var6++) {
            for (int var7 = 0; var7 < this.field1762[var6].length; var7++) {
                this.field1762[var6][var7] = var3.method2320();
            }
        }
    }
}
