package deob;

@ObfuscatedName("dm")
public class class108 extends class123 {

    @ObfuscatedName("dm.c")
    public int field1580;

    @ObfuscatedName("dm.o")
    public byte[] field1577;

    @ObfuscatedName("dm.i")
    public int field1578;

    @ObfuscatedName("dm.u")
    public int field1579;

    @ObfuscatedName("dm.g")
    public boolean field1576;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1580 = arg0;
        this.field1577 = arg1;
        this.field1578 = arg2;
        this.field1579 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1580 = arg0;
        this.field1577 = arg1;
        this.field1578 = arg2;
        this.field1579 = arg3;
        this.field1576 = arg4;
    }

    @ObfuscatedName("dm.c(Ldy;)Ldm;")
    public class108 method1774(class117 arg0) {
        this.field1577 = arg0.method1881(this.field1577);
        this.field1580 = arg0.method1882(this.field1580);
        if (this.field1579 == this.field1578) {
            this.field1578 = this.field1579 = arg0.method1884(this.field1578);
        } else {
            this.field1578 = arg0.method1884(this.field1578);
            this.field1579 = arg0.method1884(this.field1579);
            if (this.field1579 == this.field1578) {
                this.field1578--;
            }
        }
        return this;
    }
}
