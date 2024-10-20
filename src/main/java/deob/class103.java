package deob;

@ObfuscatedName("cg")
public class class103 extends class209 {

    @ObfuscatedName("cg.b")
    public int field1744;

    @ObfuscatedName("cg.g")
    public int field1748;

    @ObfuscatedName("cg.j")
    public int[] field1745;

    @ObfuscatedName("cg.d")
    public int[][] field1746;

    public class103(int arg0, byte[] arg1) {
        this.field1744 = arg0;
        class120 var3 = new class120(arg1);
        this.field1748 = var3.method2344();
        this.field1745 = new int[this.field1748];
        this.field1746 = new int[this.field1748][];
        for (int var4 = 0; var4 < this.field1748; var4++) {
            this.field1745[var4] = var3.method2344();
        }
        for (int var5 = 0; var5 < this.field1748; var5++) {
            this.field1746[var5] = new int[var3.method2344()];
        }
        for (int var6 = 0; var6 < this.field1748; var6++) {
            for (int var7 = 0; var7 < this.field1746[var6].length; var7++) {
                this.field1746[var6][var7] = var3.method2344();
            }
        }
    }
}
