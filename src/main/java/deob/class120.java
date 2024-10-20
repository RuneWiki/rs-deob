package deob;

@ObfuscatedName("dh")
public class class120 {

    @ObfuscatedName("dh.i")
    public int field1733;

    @ObfuscatedName("dh.j")
    public int field1731;

    @ObfuscatedName("dh.a")
    public int[] field1732;

    @ObfuscatedName("dh.r")
    public int[] field1734;

    public class120() {
        class106.method1800(16);
        this.field1733 = class106.method1819() == 0 ? 1 : class106.method1800(4) + 1;
        if (class106.method1819() != 0) {
            class106.method1800(8);
        }
        class106.method1800(2);
        if (this.field1733 > 1) {
            this.field1731 = class106.method1800(4);
        }
        this.field1732 = new int[this.field1733];
        this.field1734 = new int[this.field1733];
        for (int var1 = 0; var1 < this.field1733; var1++) {
            class106.method1800(8);
            this.field1732[var1] = class106.method1800(8);
            this.field1734[var1] = class106.method1800(8);
        }
    }
}
