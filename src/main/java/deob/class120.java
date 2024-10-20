package deob;

@ObfuscatedName("dd")
public class class120 {

    @ObfuscatedName("dd.s")
    public int field1632;

    @ObfuscatedName("dd.g")
    public int field1631;

    @ObfuscatedName("dd.m")
    public int[] field1630;

    @ObfuscatedName("dd.h")
    public int[] field1633;

    public class120() {
        class106.method2057(16);
        this.field1632 = class106.method2056() == 0 ? 1 : class106.method2057(4) + 1;
        if (class106.method2056() != 0) {
            class106.method2057(8);
        }
        class106.method2057(2);
        if (this.field1632 > 1) {
            this.field1631 = class106.method2057(4);
        }
        this.field1630 = new int[this.field1632];
        this.field1633 = new int[this.field1632];
        for (int var1 = 0; var1 < this.field1632; var1++) {
            class106.method2057(8);
            this.field1630[var1] = class106.method2057(8);
            this.field1633[var1] = class106.method2057(8);
        }
    }
}
