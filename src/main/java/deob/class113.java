package deob;

@ObfuscatedName("de")
public class class113 extends class128 {

    @ObfuscatedName("de.z")
    public int field1414;

    @ObfuscatedName("de.k")
    public byte[] field1417;

    @ObfuscatedName("de.s")
    public int field1416;

    @ObfuscatedName("de.t")
    public int field1415;

    @ObfuscatedName("de.i")
    public boolean field1418;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1414 = arg0;
        this.field1417 = arg1;
        this.field1416 = arg2;
        this.field1415 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1414 = arg0;
        this.field1417 = arg1;
        this.field1416 = arg2;
        this.field1415 = arg3;
        this.field1418 = arg4;
    }

    @ObfuscatedName("de.z(Ldf;)Lde;")
    public class113 method2300(class122 arg0) {
        this.field1417 = arg0.method2417(this.field1417);
        this.field1414 = arg0.method2410(this.field1414);
        if (this.field1416 == this.field1415) {
            this.field1416 = this.field1415 = arg0.method2408(this.field1416);
        } else {
            this.field1416 = arg0.method2408(this.field1416);
            this.field1415 = arg0.method2408(this.field1415);
            if (this.field1416 == this.field1415) {
                this.field1416--;
            }
        }
        return this;
    }
}
