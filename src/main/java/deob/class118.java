package deob;

@ObfuscatedName("du")
public class class118 {

    @ObfuscatedName("du.b")
    public int field1608;

    @ObfuscatedName("du.q")
    public int field1606;

    @ObfuscatedName("du.o")
    public int[] field1607;

    @ObfuscatedName("du.p")
    public int[] field1605;

    public class118() {
        class104.method1992(16);
        this.field1608 = class104.method1991() == 0 ? 1 : class104.method1992(4) + 1;
        if (class104.method1991() != 0) {
            class104.method1992(8);
        }
        class104.method1992(2);
        if (this.field1608 > 1) {
            this.field1606 = class104.method1992(4);
        }
        this.field1607 = new int[this.field1608];
        this.field1605 = new int[this.field1608];
        for (int var1 = 0; var1 < this.field1608; var1++) {
            class104.method1992(8);
            this.field1607[var1] = class104.method1992(8);
            this.field1605[var1] = class104.method1992(8);
        }
    }
}
