package deob;

@ObfuscatedName("ds")
public class class120 {

    @ObfuscatedName("ds.a")
    public int field1619;

    @ObfuscatedName("ds.w")
    public int field1617;

    @ObfuscatedName("ds.e")
    public int[] field1616;

    @ObfuscatedName("ds.k")
    public int[] field1618;

    public class120() {
        class106.method1795(16);
        this.field1619 = class106.method1789() == 0 ? 1 : class106.method1795(4) + 1;
        if (class106.method1789() != 0) {
            class106.method1795(8);
        }
        class106.method1795(2);
        if (this.field1619 > 1) {
            this.field1617 = class106.method1795(4);
        }
        this.field1616 = new int[this.field1619];
        this.field1618 = new int[this.field1619];
        for (int var1 = 0; var1 < this.field1619; var1++) {
            class106.method1795(8);
            this.field1616[var1] = class106.method1795(8);
            this.field1618[var1] = class106.method1795(8);
        }
    }
}
