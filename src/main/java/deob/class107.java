package deob;

@ObfuscatedName("dn")
public class class107 extends class122 {

    @ObfuscatedName("dn.b")
    public int field1523;

    @ObfuscatedName("dn.s")
    public byte[] field1520;

    @ObfuscatedName("dn.r")
    public int field1521;

    @ObfuscatedName("dn.g")
    public int field1522;

    @ObfuscatedName("dn.x")
    public boolean field1519;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1523 = arg0;
        this.field1520 = arg1;
        this.field1521 = arg2;
        this.field1522 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1523 = arg0;
        this.field1520 = arg1;
        this.field1521 = arg2;
        this.field1522 = arg3;
        this.field1519 = arg4;
    }

    @ObfuscatedName("dn.b(Ldu;)Ldn;")
    public class107 method1846(class116 arg0) {
        this.field1520 = arg0.method1956(this.field1520);
        this.field1523 = arg0.method1954(this.field1523);
        if (this.field1522 == this.field1521) {
            this.field1521 = this.field1522 = arg0.method1955(this.field1521);
        } else {
            this.field1521 = arg0.method1955(this.field1521);
            this.field1522 = arg0.method1955(this.field1522);
            if (this.field1522 == this.field1521) {
                this.field1521--;
            }
        }
        return this;
    }
}
