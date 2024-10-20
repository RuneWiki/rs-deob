package deob;

@ObfuscatedName("cw")
public class class103 extends class209 {

    @ObfuscatedName("cw.j")
    public int field1748;

    @ObfuscatedName("cw.h")
    public int field1744;

    @ObfuscatedName("cw.m")
    public int[] field1745;

    @ObfuscatedName("cw.z")
    public int[][] field1743;

    public class103(int arg0, byte[] arg1) {
        this.field1748 = arg0;
        class120 var3 = new class120(arg1);
        this.field1744 = var3.method2361();
        this.field1745 = new int[this.field1744];
        this.field1743 = new int[this.field1744][];
        for (int var4 = 0; var4 < this.field1744; var4++) {
            this.field1745[var4] = var3.method2361();
        }
        for (int var5 = 0; var5 < this.field1744; var5++) {
            this.field1743[var5] = new int[var3.method2361()];
        }
        for (int var6 = 0; var6 < this.field1744; var6++) {
            for (int var7 = 0; var7 < this.field1743[var6].length; var7++) {
                this.field1743[var6][var7] = var3.method2361();
            }
        }
    }
}
