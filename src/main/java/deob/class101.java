package deob;

@ObfuscatedName("cq")
public class class101 extends class116 {

    @ObfuscatedName("cq.n")
    public int field1340;

    @ObfuscatedName("cq.h")
    public byte[] field1337;

    @ObfuscatedName("cq.l")
    public int field1339;

    @ObfuscatedName("cq.g")
    public int field1338;

    @ObfuscatedName("cq.b")
    public boolean field1341;

    public class101(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1340 = arg0;
        this.field1337 = arg1;
        this.field1339 = arg2;
        this.field1338 = arg3;
    }

    public class101(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1340 = arg0;
        this.field1337 = arg1;
        this.field1339 = arg2;
        this.field1338 = arg3;
        this.field1341 = arg4;
    }

    @ObfuscatedName("cq.n(Lds;)Lcq;")
    public class101 method2199(class110 arg0) {
        this.field1337 = arg0.method2321(this.field1337);
        this.field1340 = arg0.method2317(this.field1340);
        if (this.field1339 == this.field1338) {
            this.field1339 = this.field1338 = arg0.method2318(this.field1339);
        } else {
            this.field1339 = arg0.method2318(this.field1339);
            this.field1338 = arg0.method2318(this.field1338);
            if (this.field1339 == this.field1338) {
                this.field1339--;
            }
        }
        return this;
    }
}
