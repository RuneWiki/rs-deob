package deob;

@ObfuscatedName("cy")
public class class104 extends class177 {

    @ObfuscatedName("cy.g")
    public int field1761;

    @ObfuscatedName("cy.e")
    public int field1759;

    @ObfuscatedName("cy.n")
    public int[] field1760;

    @ObfuscatedName("cy.j")
    public int[][] field1763;

    public class104(int arg0, byte[] arg1) {
        this.field1761 = arg0;
        class126 var3 = new class126(arg1);
        this.field1759 = var3.method2485();
        this.field1760 = new int[this.field1759];
        this.field1763 = new int[this.field1759][];
        for (int var4 = 0; var4 < this.field1759; var4++) {
            this.field1760[var4] = var3.method2485();
        }
        for (int var5 = 0; var5 < this.field1759; var5++) {
            this.field1763[var5] = new int[var3.method2485()];
        }
        for (int var6 = 0; var6 < this.field1759; var6++) {
            for (int var7 = 0; var7 < this.field1763[var6].length; var7++) {
                this.field1763[var6][var7] = var3.method2485();
            }
        }
    }
}
