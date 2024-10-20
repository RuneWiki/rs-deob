package deob;

@ObfuscatedName("cw")
public class class104 extends class119 {

    @ObfuscatedName("cw.u")
    public int field1378;

    @ObfuscatedName("cw.f")
    public byte[] field1376;

    @ObfuscatedName("cw.b")
    public int field1377;

    @ObfuscatedName("cw.g")
    public int field1375;

    @ObfuscatedName("cw.z")
    public boolean field1379;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1378 = arg0;
        this.field1376 = arg1;
        this.field1377 = arg2;
        this.field1375 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1378 = arg0;
        this.field1376 = arg1;
        this.field1377 = arg2;
        this.field1375 = arg3;
        this.field1379 = arg4;
    }

    @ObfuscatedName("cw.u(Ldn;)Lcw;")
    public class104 method2209(class113 arg0) {
        this.field1376 = arg0.method2331(this.field1376);
        this.field1378 = arg0.method2328(this.field1378);
        if (this.field1377 == this.field1375) {
            this.field1377 = this.field1375 = arg0.method2329(this.field1377);
        } else {
            this.field1377 = arg0.method2329(this.field1377);
            this.field1375 = arg0.method2329(this.field1375);
            if (this.field1377 == this.field1375) {
                this.field1377--;
            }
        }
        return this;
    }
}
