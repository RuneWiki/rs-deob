package deob;

@ObfuscatedName("ca")
public class class104 extends class177 {

    @ObfuscatedName("ca.z")
    public int field1766;

    @ObfuscatedName("ca.h")
    public int field1765;

    @ObfuscatedName("ca.c")
    public int[] field1771;

    @ObfuscatedName("ca.p")
    public int[][] field1767;

    public class104(int arg0, byte[] arg1) {
        this.field1766 = arg0;
        class126 var3 = new class126(arg1);
        this.field1765 = var3.method2450();
        this.field1771 = new int[this.field1765];
        this.field1767 = new int[this.field1765][];
        for (int var4 = 0; var4 < this.field1765; var4++) {
            this.field1771[var4] = var3.method2450();
        }
        for (int var5 = 0; var5 < this.field1765; var5++) {
            this.field1767[var5] = new int[var3.method2450()];
        }
        for (int var6 = 0; var6 < this.field1765; var6++) {
            for (int var7 = 0; var7 < this.field1767[var6].length; var7++) {
                this.field1767[var6][var7] = var3.method2450();
            }
        }
    }
}
