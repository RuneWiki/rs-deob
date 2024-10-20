package deob;

@ObfuscatedName("cy")
public class class103 extends class209 {

    @ObfuscatedName("cy.e")
    public int field1740;

    @ObfuscatedName("cy.w")
    public int field1739;

    @ObfuscatedName("cy.f")
    public int[] field1743;

    @ObfuscatedName("cy.s")
    public int[][] field1741;

    public class103(int arg0, byte[] arg1) {
        this.field1740 = arg0;
        class120 var3 = new class120(arg1);
        this.field1739 = var3.method2355();
        this.field1743 = new int[this.field1739];
        this.field1741 = new int[this.field1739][];
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1743[var4] = var3.method2355();
        }
        for (int var5 = 0; var5 < this.field1739; var5++) {
            this.field1741[var5] = new int[var3.method2355()];
        }
        for (int var6 = 0; var6 < this.field1739; var6++) {
            for (int var7 = 0; var7 < this.field1741[var6].length; var7++) {
                this.field1741[var6][var7] = var3.method2355();
            }
        }
    }
}
