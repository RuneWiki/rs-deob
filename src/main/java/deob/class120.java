package deob;

@ObfuscatedName("db")
public class class120 {

    @ObfuscatedName("db.b")
    public int field1635;

    @ObfuscatedName("db.s")
    public int field1633;

    @ObfuscatedName("db.r")
    public int[] field1634;

    @ObfuscatedName("db.g")
    public int[] field1636;

    public class120() {
        class106.method1810(16);
        this.field1635 = class106.method1809() == 0 ? 1 : class106.method1810(4) + 1;
        if (class106.method1809() != 0) {
            class106.method1810(8);
        }
        class106.method1810(2);
        if (this.field1635 > 1) {
            this.field1633 = class106.method1810(4);
        }
        this.field1634 = new int[this.field1635];
        this.field1636 = new int[this.field1635];
        for (int var1 = 0; var1 < this.field1635; var1++) {
            class106.method1810(8);
            this.field1634[var1] = class106.method1810(8);
            this.field1636[var1] = class106.method1810(8);
        }
    }
}
