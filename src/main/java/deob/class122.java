package deob;

@ObfuscatedName("du")
public class class122 {

    @ObfuscatedName("du.j")
    public int field1732;

    @ObfuscatedName("du.h")
    public int field1733;

    @ObfuscatedName("du.f")
    public int[] field1734;

    @ObfuscatedName("du.p")
    public int[] field1731;

    public class122() {
        class108.method1808(16);
        this.field1732 = class108.method1807() == 0 ? 1 : class108.method1808(4) + 1;
        if (class108.method1807() != 0) {
            class108.method1808(8);
        }
        class108.method1808(2);
        if (this.field1732 > 1) {
            this.field1733 = class108.method1808(4);
        }
        this.field1734 = new int[this.field1732];
        this.field1731 = new int[this.field1732];
        for (int var1 = 0; var1 < this.field1732; var1++) {
            class108.method1808(8);
            this.field1734[var1] = class108.method1808(8);
            this.field1731[var1] = class108.method1808(8);
        }
    }
}
