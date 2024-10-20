package deob;

@ObfuscatedName("db")
public class class105 extends class120 {

    @ObfuscatedName("db.b")
    public int field1497;

    @ObfuscatedName("db.q")
    public byte[] field1495;

    @ObfuscatedName("db.o")
    public int field1496;

    @ObfuscatedName("db.p")
    public int field1494;

    @ObfuscatedName("db.a")
    public boolean field1498;

    public class105(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1497 = arg0;
        this.field1495 = arg1;
        this.field1496 = arg2;
        this.field1494 = arg3;
    }

    public class105(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1497 = arg0;
        this.field1495 = arg1;
        this.field1496 = arg2;
        this.field1494 = arg3;
        this.field1498 = arg4;
    }

    @ObfuscatedName("db.b(Ldl;)Ldb;")
    public class105 method2029(class114 arg0) {
        this.field1495 = arg0.method2125(this.field1495);
        this.field1497 = arg0.method2126(this.field1497);
        if (this.field1496 == this.field1494) {
            this.field1496 = this.field1494 = arg0.method2123(this.field1496);
        } else {
            this.field1496 = arg0.method2123(this.field1496);
            this.field1494 = arg0.method2123(this.field1494);
            if (this.field1496 == this.field1494) {
                this.field1496--;
            }
        }
        return this;
    }
}
