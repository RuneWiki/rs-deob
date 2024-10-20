package deob;

@ObfuscatedName("ch")
public class class104 extends class119 {

    @ObfuscatedName("ch.z")
    public int field1367;

    @ObfuscatedName("ch.n")
    public byte[] field1366;

    @ObfuscatedName("ch.v")
    public int field1368;

    @ObfuscatedName("ch.u")
    public int field1369;

    @ObfuscatedName("ch.r")
    public boolean field1370;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1367 = arg0;
        this.field1366 = arg1;
        this.field1368 = arg2;
        this.field1369 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1367 = arg0;
        this.field1366 = arg1;
        this.field1368 = arg2;
        this.field1369 = arg3;
        this.field1370 = arg4;
    }

    @ObfuscatedName("ch.z(Ldr;)Lch;")
    public class104 method2163(class113 arg0) {
        this.field1366 = arg0.method2283(this.field1366);
        this.field1367 = arg0.method2273(this.field1367);
        if (this.field1369 == this.field1368) {
            this.field1368 = this.field1369 = arg0.method2282(this.field1368);
        } else {
            this.field1368 = arg0.method2282(this.field1368);
            this.field1369 = arg0.method2282(this.field1369);
            if (this.field1369 == this.field1368) {
                this.field1368--;
            }
        }
        return this;
    }
}
