package deob;

@ObfuscatedName("dj")
public class class121 {

    @ObfuscatedName("dj.p")
    public int field1721;

    @ObfuscatedName("dj.m")
    public int field1722;

    @ObfuscatedName("dj.e")
    public int[] field1723;

    @ObfuscatedName("dj.t")
    public int[] field1720;

    public class121() {
        class107.method1756(16);
        this.field1721 = class107.method1732() == 0 ? 1 : class107.method1756(4) + 1;
        if (class107.method1732() != 0) {
            class107.method1756(8);
        }
        class107.method1756(2);
        if (this.field1721 > 1) {
            this.field1722 = class107.method1756(4);
        }
        this.field1723 = new int[this.field1721];
        this.field1720 = new int[this.field1721];
        for (int var1 = 0; var1 < this.field1721; var1++) {
            class107.method1756(8);
            this.field1723[var1] = class107.method1756(8);
            this.field1720[var1] = class107.method1756(8);
        }
    }
}
