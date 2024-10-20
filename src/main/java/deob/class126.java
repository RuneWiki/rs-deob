package deob;

@ObfuscatedName("do")
public class class126 {

    @ObfuscatedName("do.h")
    public int field1511;

    @ObfuscatedName("do.v")
    public int field1512;

    @ObfuscatedName("do.x")
    public int[] field1514;

    @ObfuscatedName("do.w")
    public int[] field1513;

    public class126() {
        class112.method2252(16);
        this.field1511 = class112.method2251() == 0 ? 1 : class112.method2252(4) + 1;
        if (class112.method2251() != 0) {
            class112.method2252(8);
        }
        class112.method2252(2);
        if (this.field1511 > 1) {
            this.field1512 = class112.method2252(4);
        }
        this.field1514 = new int[this.field1511];
        this.field1513 = new int[this.field1511];
        for (int var1 = 0; var1 < this.field1511; var1++) {
            class112.method2252(8);
            this.field1514[var1] = class112.method2252(8);
            this.field1513[var1] = class112.method2252(8);
        }
    }
}
