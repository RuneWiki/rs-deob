package deob;

@ObfuscatedName("dx")
public class class108 extends class123 {

    @ObfuscatedName("dx.i")
    public int field1634;

    @ObfuscatedName("dx.w")
    public byte[] field1631;

    @ObfuscatedName("dx.a")
    public int field1630;

    @ObfuscatedName("dx.t")
    public int field1632;

    @ObfuscatedName("dx.s")
    public boolean field1633;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1634 = arg0;
        this.field1631 = arg1;
        this.field1630 = arg2;
        this.field1632 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1634 = arg0;
        this.field1631 = arg1;
        this.field1630 = arg2;
        this.field1632 = arg3;
        this.field1633 = arg4;
    }

    @ObfuscatedName("dx.i(Lda;)Ldx;")
    public class108 method1830(class117 arg0) {
        this.field1631 = arg0.method1936(this.field1631);
        this.field1634 = arg0.method1934(this.field1634);
        if (this.field1632 == this.field1630) {
            this.field1630 = this.field1632 = arg0.method1932(this.field1630);
        } else {
            this.field1630 = arg0.method1932(this.field1630);
            this.field1632 = arg0.method1932(this.field1632);
            if (this.field1632 == this.field1630) {
                this.field1630--;
            }
        }
        return this;
    }
}
