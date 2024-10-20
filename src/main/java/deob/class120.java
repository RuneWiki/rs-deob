package deob;

@ObfuscatedName("de")
public class class120 {

    @ObfuscatedName("de.d")
    public int field1639;

    @ObfuscatedName("de.x")
    public int field1638;

    @ObfuscatedName("de.k")
    public int[] field1640;

    @ObfuscatedName("de.z")
    public int[] field1637;

    public class120() {
        class106.method1893(16);
        this.field1639 = class106.method1880() == 0 ? 1 : class106.method1893(4) + 1;
        if (class106.method1880() != 0) {
            class106.method1893(8);
        }
        class106.method1893(2);
        if (this.field1639 > 1) {
            this.field1638 = class106.method1893(4);
        }
        this.field1640 = new int[this.field1639];
        this.field1637 = new int[this.field1639];
        for (int var1 = 0; var1 < this.field1639; var1++) {
            class106.method1893(8);
            this.field1640[var1] = class106.method1893(8);
            this.field1637[var1] = class106.method1893(8);
        }
    }
}
