package deob;

@ObfuscatedName("cd")
public class class104 extends class119 {

    @ObfuscatedName("cd.q")
    public int field1390;

    @ObfuscatedName("cd.w")
    public byte[] field1391;

    @ObfuscatedName("cd.e")
    public int field1392;

    @ObfuscatedName("cd.p")
    public int field1393;

    @ObfuscatedName("cd.k")
    public boolean field1394;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1390 = arg0;
        this.field1391 = arg1;
        this.field1392 = arg2;
        this.field1393 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1390 = arg0;
        this.field1391 = arg1;
        this.field1392 = arg2;
        this.field1393 = arg3;
        this.field1394 = arg4;
    }

    @ObfuscatedName("cd.q(Ldz;)Lcd;")
    public class104 method2177(class113 arg0) {
        this.field1391 = arg0.method2285(this.field1391);
        this.field1390 = arg0.method2286(this.field1390);
        if (this.field1393 == this.field1392) {
            this.field1392 = this.field1393 = arg0.method2297(this.field1392);
        } else {
            this.field1392 = arg0.method2297(this.field1392);
            this.field1393 = arg0.method2297(this.field1393);
            if (this.field1393 == this.field1392) {
                this.field1392--;
            }
        }
        return this;
    }
}
