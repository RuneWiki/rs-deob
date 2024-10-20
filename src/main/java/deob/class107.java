package deob;

@ObfuscatedName("dp")
public class class107 extends class122 {

    @ObfuscatedName("dp.i")
    public int field1619;

    @ObfuscatedName("dp.j")
    public byte[] field1617;

    @ObfuscatedName("dp.a")
    public int field1618;

    @ObfuscatedName("dp.r")
    public int field1616;

    @ObfuscatedName("dp.o")
    public boolean field1620;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1619 = arg0;
        this.field1617 = arg1;
        this.field1618 = arg2;
        this.field1616 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1619 = arg0;
        this.field1617 = arg1;
        this.field1618 = arg2;
        this.field1616 = arg3;
        this.field1620 = arg4;
    }

    @ObfuscatedName("dp.i(Ldi;)Ldp;")
    public class107 method1828(class116 arg0) {
        this.field1617 = arg0.method1939(this.field1617);
        this.field1619 = arg0.method1949(this.field1619);
        if (this.field1618 == this.field1616) {
            this.field1618 = this.field1616 = arg0.method1941(this.field1618);
        } else {
            this.field1618 = arg0.method1941(this.field1618);
            this.field1616 = arg0.method1941(this.field1616);
            if (this.field1618 == this.field1616) {
                this.field1618--;
            }
        }
        return this;
    }
}
