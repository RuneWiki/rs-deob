package deob;

@ObfuscatedName("do")
public class class113 extends class128 {

    @ObfuscatedName("do.f")
    public int field1420;

    @ObfuscatedName("do.b")
    public byte[] field1416;

    @ObfuscatedName("do.l")
    public int field1418;

    @ObfuscatedName("do.m")
    public int field1419;

    @ObfuscatedName("do.z")
    public boolean field1417;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1420 = arg0;
        this.field1416 = arg1;
        this.field1418 = arg2;
        this.field1419 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1420 = arg0;
        this.field1416 = arg1;
        this.field1418 = arg2;
        this.field1419 = arg3;
        this.field1417 = arg4;
    }

    @ObfuscatedName("do.f(Ldw;)Ldo;")
    public class113 method2317(class122 arg0) {
        this.field1416 = arg0.method2434(this.field1416);
        this.field1420 = arg0.method2435(this.field1420);
        if (this.field1419 == this.field1418) {
            this.field1418 = this.field1419 = arg0.method2437(this.field1418);
        } else {
            this.field1418 = arg0.method2437(this.field1418);
            this.field1419 = arg0.method2437(this.field1419);
            if (this.field1419 == this.field1418) {
                this.field1418--;
            }
        }
        return this;
    }
}
