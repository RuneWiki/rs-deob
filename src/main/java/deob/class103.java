package deob;

@ObfuscatedName("cb")
public class class103 extends class209 {

    @ObfuscatedName("cb.w")
    public int field1778;

    @ObfuscatedName("cb.x")
    public int field1774;

    @ObfuscatedName("cb.t")
    public int[] field1780;

    @ObfuscatedName("cb.p")
    public int[][] field1777;

    public class103(int arg0, byte[] arg1) {
        this.field1778 = arg0;
        class120 var3 = new class120(arg1);
        this.field1774 = var3.method2363();
        this.field1780 = new int[this.field1774];
        this.field1777 = new int[this.field1774][];
        for (int var4 = 0; var4 < this.field1774; var4++) {
            this.field1780[var4] = var3.method2363();
        }
        for (int var5 = 0; var5 < this.field1774; var5++) {
            this.field1777[var5] = new int[var3.method2363()];
        }
        for (int var6 = 0; var6 < this.field1774; var6++) {
            for (int var7 = 0; var7 < this.field1777[var6].length; var7++) {
                this.field1777[var6][var7] = var3.method2363();
            }
        }
    }
}
