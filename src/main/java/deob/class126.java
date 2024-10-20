package deob;

@ObfuscatedName("dz")
public class class126 {

    @ObfuscatedName("dz.m")
    public int field1523;

    @ObfuscatedName("dz.o")
    public int field1522;

    @ObfuscatedName("dz.q")
    public int[] field1524;

    @ObfuscatedName("dz.j")
    public int[] field1525;

    public class126() {
        class112.method2265(16);
        this.field1523 = class112.method2264() == 0 ? 1 : class112.method2265(4) + 1;
        if (class112.method2264() != 0) {
            class112.method2265(8);
        }
        class112.method2265(2);
        if (this.field1523 > 1) {
            this.field1522 = class112.method2265(4);
        }
        this.field1524 = new int[this.field1523];
        this.field1525 = new int[this.field1523];
        for (int var1 = 0; var1 < this.field1523; var1++) {
            class112.method2265(8);
            this.field1524[var1] = class112.method2265(8);
            this.field1525[var1] = class112.method2265(8);
        }
    }
}
