package deob;

@ObfuscatedName("dg")
public class class108 extends class123 {

    @ObfuscatedName("dg.e")
    public int field1608;

    @ObfuscatedName("dg.o")
    public byte[] field1609;

    @ObfuscatedName("dg.m")
    public int field1610;

    @ObfuscatedName("dg.g")
    public int field1611;

    @ObfuscatedName("dg.d")
    public boolean field1612;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1608 = arg0;
        this.field1609 = arg1;
        this.field1610 = arg2;
        this.field1611 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1608 = arg0;
        this.field1609 = arg1;
        this.field1610 = arg2;
        this.field1611 = arg3;
        this.field1612 = arg4;
    }

    @ObfuscatedName("dg.e(Ldw;)Ldg;")
    public class108 method1814(class117 arg0) {
        this.field1609 = arg0.method1926(this.field1609);
        this.field1608 = arg0.method1923(this.field1608);
        if (this.field1611 == this.field1610) {
            this.field1610 = this.field1611 = arg0.method1924(this.field1610);
        } else {
            this.field1610 = arg0.method1924(this.field1610);
            this.field1611 = arg0.method1924(this.field1611);
            if (this.field1611 == this.field1610) {
                this.field1610--;
            }
        }
        return this;
    }
}
