package deob;

@ObfuscatedName("ca")
public class class103 extends class209 {

    @ObfuscatedName("ca.f")
    public int field1767;

    @ObfuscatedName("ca.u")
    public int field1766;

    @ObfuscatedName("ca.x")
    public int[] field1770;

    @ObfuscatedName("ca.b")
    public int[][] field1768;

    public class103(int arg0, byte[] arg1) {
        this.field1767 = arg0;
        class120 var3 = new class120(arg1);
        this.field1766 = var3.method2385();
        this.field1770 = new int[this.field1766];
        this.field1768 = new int[this.field1766][];
        for (int var4 = 0; var4 < this.field1766; var4++) {
            this.field1770[var4] = var3.method2385();
        }
        for (int var5 = 0; var5 < this.field1766; var5++) {
            this.field1768[var5] = new int[var3.method2385()];
        }
        for (int var6 = 0; var6 < this.field1766; var6++) {
            for (int var7 = 0; var7 < this.field1768[var6].length; var7++) {
                this.field1768[var6][var7] = var3.method2385();
            }
        }
    }
}
