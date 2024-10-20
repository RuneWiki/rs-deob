package deob;

@ObfuscatedName("bn")
public class class117 extends class183 {

    @ObfuscatedName("bn.b")
    public byte[] field1828;

    @ObfuscatedName("bn.c")
    public int field1829;

    @ObfuscatedName("bn.m")
    public int field1825;

    @ObfuscatedName("bn.i")
    public int field1827;

    @ObfuscatedName("bn.z")
    public boolean field1826;

    @ObfuscatedName("bn.v(Lby;)Lbn;")
    public class117 method2109(class111 arg0) {
        this.field1828 = arg0.method1942(this.field1828);
        this.field1829 = arg0.method1952(this.field1829);
        if (this.field1827 == this.field1825) {
            this.field1827 = this.field1825 = arg0.method1944(this.field1827);
        } else {
            this.field1827 = arg0.method1944(this.field1827);
            this.field1825 = arg0.method1944(this.field1825);
            if (this.field1827 == this.field1825) {
                this.field1827--;
            }
        }
        return this;
    }

    public class117(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1829 = arg0;
        this.field1828 = arg1;
        this.field1827 = arg2;
        this.field1825 = arg3;
        this.field1826 = arg4;
    }

    public class117(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1829 = arg0;
        this.field1828 = arg1;
        this.field1827 = arg2;
        this.field1825 = arg3;
    }
}
