package deob;

@ObfuscatedName("da")
public class class120 {

    @ObfuscatedName("da.m")
    public int field1639;

    @ObfuscatedName("da.p")
    public int field1640;

    @ObfuscatedName("da.i")
    public int[] field1638;

    @ObfuscatedName("da.j")
    public int[] field1641;

    public class120() {
        class106.method1881(16);
        this.field1639 = class106.method1880() == 0 ? 1 : class106.method1881(4) + 1;
        if (class106.method1880() != 0) {
            class106.method1881(8);
        }
        class106.method1881(2);
        if (this.field1639 > 1) {
            this.field1640 = class106.method1881(4);
        }
        this.field1638 = new int[this.field1639];
        this.field1641 = new int[this.field1639];
        for (int var1 = 0; var1 < this.field1639; var1++) {
            class106.method1881(8);
            this.field1638[var1] = class106.method1881(8);
            this.field1641[var1] = class106.method1881(8);
        }
    }
}
