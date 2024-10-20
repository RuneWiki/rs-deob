package deob;

@ObfuscatedName("dt")
public class class126 {

    @ObfuscatedName("dt.x")
    public int field1514;

    @ObfuscatedName("dt.m")
    public int field1513;

    @ObfuscatedName("dt.k")
    public int[] field1512;

    @ObfuscatedName("dt.d")
    public int[] field1515;

    public class126() {
        class112.method2268(16);
        this.field1514 = class112.method2292() == 0 ? 1 : class112.method2268(4) + 1;
        if (class112.method2292() != 0) {
            class112.method2268(8);
        }
        class112.method2268(2);
        if (this.field1514 > 1) {
            this.field1513 = class112.method2268(4);
        }
        this.field1512 = new int[this.field1514];
        this.field1515 = new int[this.field1514];
        for (int var1 = 0; var1 < this.field1514; var1++) {
            class112.method2268(8);
            this.field1512[var1] = class112.method2268(8);
            this.field1515[var1] = class112.method2268(8);
        }
    }
}
