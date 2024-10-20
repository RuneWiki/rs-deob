package deob;

@ObfuscatedName("dw")
public class class119 {

    @ObfuscatedName("dw.t")
    public int field1632;

    @ObfuscatedName("dw.q")
    public int field1631;

    @ObfuscatedName("dw.i")
    public int[] field1630;

    @ObfuscatedName("dw.a")
    public int[] field1633;

    public class119() {
        class105.method1998(16);
        this.field1632 = class105.method1997() == 0 ? 1 : class105.method1998(4) + 1;
        if (class105.method1997() != 0) {
            class105.method1998(8);
        }
        class105.method1998(2);
        if (this.field1632 > 1) {
            this.field1631 = class105.method1998(4);
        }
        this.field1630 = new int[this.field1632];
        this.field1633 = new int[this.field1632];
        for (int var1 = 0; var1 < this.field1632; var1++) {
            class105.method1998(8);
            this.field1630[var1] = class105.method1998(8);
            this.field1633[var1] = class105.method1998(8);
        }
    }
}
