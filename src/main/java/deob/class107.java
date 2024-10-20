package deob;

@ObfuscatedName("da")
public class class107 {

    @ObfuscatedName("da.w")
    public int field1414;

    @ObfuscatedName("da.m")
    public int field1412;

    @ObfuscatedName("da.q")
    public int[] field1413;

    @ObfuscatedName("da.b")
    public int[] field1411;

    public class107() {
        class93.method1991(16);
        this.field1414 = class93.method1971() == 0 ? 1 : class93.method1991(4) + 1;
        if (class93.method1971() != 0) {
            class93.method1991(8);
        }
        class93.method1991(2);
        if (this.field1414 > 1) {
            this.field1412 = class93.method1991(4);
        }
        this.field1413 = new int[this.field1414];
        this.field1411 = new int[this.field1414];
        for (int var1 = 0; var1 < this.field1414; var1++) {
            class93.method1991(8);
            this.field1413[var1] = class93.method1991(8);
            this.field1411[var1] = class93.method1991(8);
        }
    }
}
