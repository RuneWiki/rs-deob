package deob;

@ObfuscatedName("dh")
public class class108 extends class123 {

    @ObfuscatedName("dh.n")
    public int field1616;

    @ObfuscatedName("dh.p")
    public byte[] field1614;

    @ObfuscatedName("dh.i")
    public int field1615;

    @ObfuscatedName("dh.j")
    public int field1613;

    @ObfuscatedName("dh.f")
    public boolean field1617;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1616 = arg0;
        this.field1614 = arg1;
        this.field1615 = arg2;
        this.field1613 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1616 = arg0;
        this.field1614 = arg1;
        this.field1615 = arg2;
        this.field1613 = arg3;
        this.field1617 = arg4;
    }

    @ObfuscatedName("dh.n(Lda;)Ldh;")
    public class108 method1824(class117 arg0) {
        this.field1614 = arg0.method1948(this.field1614);
        this.field1616 = arg0.method1949(this.field1616);
        if (this.field1615 == this.field1613) {
            this.field1615 = this.field1613 = arg0.method1950(this.field1615);
        } else {
            this.field1615 = arg0.method1950(this.field1615);
            this.field1613 = arg0.method1950(this.field1613);
            if (this.field1615 == this.field1613) {
                this.field1615--;
            }
        }
        return this;
    }
}
