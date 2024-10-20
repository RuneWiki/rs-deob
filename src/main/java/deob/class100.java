package deob;

@ObfuscatedName("cy")
public class class100 extends class202 {

    @ObfuscatedName("cy.j")
    public int field1707;

    @ObfuscatedName("cy.y")
    public int field1708;

    @ObfuscatedName("cy.z")
    public int[] field1709;

    @ObfuscatedName("cy.l")
    public int[][] field1710;

    public class100(int arg0, byte[] arg1) {
        this.field1707 = arg0;
        class114 var3 = new class114(arg1);
        this.field1708 = var3.method2322();
        this.field1709 = new int[this.field1708];
        this.field1710 = new int[this.field1708][];
        for (int var4 = 0; var4 < this.field1708; var4++) {
            this.field1709[var4] = var3.method2322();
        }
        for (int var5 = 0; var5 < this.field1708; var5++) {
            this.field1710[var5] = new int[var3.method2322()];
        }
        for (int var6 = 0; var6 < this.field1708; var6++) {
            for (int var7 = 0; var7 < this.field1710[var6].length; var7++) {
                this.field1710[var6][var7] = var3.method2322();
            }
        }
    }
}
