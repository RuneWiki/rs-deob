package deob;

@ObfuscatedName("dd")
public class class105 extends class179 {

    @ObfuscatedName("dd.b")
    public int field1773;

    @ObfuscatedName("dd.e")
    public int field1777;

    @ObfuscatedName("dd.g")
    public int[] field1778;

    @ObfuscatedName("dd.o")
    public int[][] field1774;

    public class105(int arg0, byte[] arg1) {
        this.field1773 = arg0;
        class126 var3 = new class126(arg1);
        this.field1777 = var3.method2436();
        this.field1778 = new int[this.field1777];
        this.field1774 = new int[this.field1777][];
        for (int var4 = 0; var4 < this.field1777; var4++) {
            this.field1778[var4] = var3.method2436();
        }
        for (int var5 = 0; var5 < this.field1777; var5++) {
            this.field1774[var5] = new int[var3.method2436()];
        }
        for (int var6 = 0; var6 < this.field1777; var6++) {
            for (int var7 = 0; var7 < this.field1774[var6].length; var7++) {
                this.field1774[var6][var7] = var3.method2436();
            }
        }
    }
}
