package deob;

@ObfuscatedName("ce")
public class class101 extends class116 {

    @ObfuscatedName("ce.a")
    public int field1373;

    @ObfuscatedName("ce.s")
    public byte[] field1371;

    @ObfuscatedName("ce.g")
    public int field1370;

    @ObfuscatedName("ce.x")
    public int field1372;

    @ObfuscatedName("ce.h")
    public boolean field1374;

    public class101(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1373 = arg0;
        this.field1371 = arg1;
        this.field1370 = arg2;
        this.field1372 = arg3;
    }

    public class101(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1373 = arg0;
        this.field1371 = arg1;
        this.field1370 = arg2;
        this.field1372 = arg3;
        this.field1374 = arg4;
    }

    @ObfuscatedName("ce.a(Ldn;)Lce;")
    public class101 method2223(class110 arg0) {
        this.field1371 = arg0.method2336(this.field1371);
        this.field1373 = arg0.method2326(this.field1373);
        if (this.field1372 == this.field1370) {
            this.field1370 = this.field1372 = arg0.method2327(this.field1370);
        } else {
            this.field1370 = arg0.method2327(this.field1370);
            this.field1372 = arg0.method2327(this.field1372);
            if (this.field1372 == this.field1370) {
                this.field1370--;
            }
        }
        return this;
    }
}
