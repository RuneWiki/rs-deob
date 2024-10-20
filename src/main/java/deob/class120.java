package deob;

@ObfuscatedName("du")
public class class120 {

    @ObfuscatedName("du.n")
    public int field1636;

    @ObfuscatedName("du.v")
    public int field1633;

    @ObfuscatedName("du.y")
    public int[] field1635;

    @ObfuscatedName("du.r")
    public int[] field1634;

    public class120() {
        class106.method1847(16);
        this.field1636 = class106.method1846() == 0 ? 1 : class106.method1847(4) + 1;
        if (class106.method1846() != 0) {
            class106.method1847(8);
        }
        class106.method1847(2);
        if (this.field1636 > 1) {
            this.field1633 = class106.method1847(4);
        }
        this.field1635 = new int[this.field1636];
        this.field1634 = new int[this.field1636];
        for (int var1 = 0; var1 < this.field1636; var1++) {
            class106.method1847(8);
            this.field1635[var1] = class106.method1847(8);
            this.field1634[var1] = class106.method1847(8);
        }
    }
}
