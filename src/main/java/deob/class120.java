package deob;

@ObfuscatedName("bq")
public class class120 extends class161 {

    @ObfuscatedName("bq.d")
    public boolean field1943;

    @ObfuscatedName("bq.k")
    public byte[] field1942;

    @ObfuscatedName("bq.h")
    public int field1939;

    @ObfuscatedName("bq.w")
    public int field1941;

    @ObfuscatedName("bq.t")
    public int field1940;

    public class120(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1939 = arg0;
        this.field1942 = arg1;
        this.field1941 = arg2;
        this.field1940 = arg3;
        this.field1943 = arg4;
    }

    public class120(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1939 = arg0;
        this.field1942 = arg1;
        this.field1941 = arg2;
        this.field1940 = arg3;
    }

    @ObfuscatedName("bq.b(Lbi;)Lbq;")
    public class120 method2128(class128 arg0) {
        this.field1942 = arg0.method2278(this.field1942);
        this.field1939 = arg0.method2285(this.field1939);
        if (this.field1941 == this.field1940) {
            this.field1941 = this.field1940 = arg0.method2280(this.field1941);
        } else {
            this.field1941 = arg0.method2280(this.field1941);
            this.field1940 = arg0.method2280(this.field1940);
            if (this.field1941 == this.field1940) {
                this.field1941--;
            }
        }
        return this;
    }
}
