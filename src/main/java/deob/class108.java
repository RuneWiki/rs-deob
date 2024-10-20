package deob;

@ObfuscatedName("dm")
public class class108 extends class123 {

    @ObfuscatedName("dm.a")
    public int field1604;

    @ObfuscatedName("dm.j")
    public byte[] field1608;

    @ObfuscatedName("dm.n")
    public int field1606;

    @ObfuscatedName("dm.r")
    public int field1607;

    @ObfuscatedName("dm.v")
    public boolean field1605;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1604 = arg0;
        this.field1608 = arg1;
        this.field1606 = arg2;
        this.field1607 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1604 = arg0;
        this.field1608 = arg1;
        this.field1606 = arg2;
        this.field1607 = arg3;
        this.field1605 = arg4;
    }

    @ObfuscatedName("dm.a(Ldo;)Ldm;")
    public class108 method1793(class117 arg0) {
        this.field1608 = arg0.method1907(this.field1608);
        this.field1604 = arg0.method1915(this.field1604);
        if (this.field1607 == this.field1606) {
            this.field1606 = this.field1607 = arg0.method1908(this.field1606);
        } else {
            this.field1606 = arg0.method1908(this.field1606);
            this.field1607 = arg0.method1908(this.field1607);
            if (this.field1607 == this.field1606) {
                this.field1606--;
            }
        }
        return this;
    }
}
