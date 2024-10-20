package deob;

@ObfuscatedName("de")
public class class109 extends class124 {

    @ObfuscatedName("de.j")
    public int field1616;

    @ObfuscatedName("de.h")
    public byte[] field1619;

    @ObfuscatedName("de.f")
    public int field1617;

    @ObfuscatedName("de.p")
    public int field1615;

    @ObfuscatedName("de.x")
    public boolean field1618;

    public class109(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1616 = arg0;
        this.field1619 = arg1;
        this.field1617 = arg2;
        this.field1615 = arg3;
    }

    public class109(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1616 = arg0;
        this.field1619 = arg1;
        this.field1617 = arg2;
        this.field1615 = arg3;
        this.field1618 = arg4;
    }

    @ObfuscatedName("de.j(Ldj;)Lde;")
    public class109 method1845(class118 arg0) {
        this.field1619 = arg0.method1957(this.field1619);
        this.field1616 = arg0.method1949(this.field1616);
        if (this.field1617 == this.field1615) {
            this.field1617 = this.field1615 = arg0.method1950(this.field1617);
        } else {
            this.field1617 = arg0.method1950(this.field1617);
            this.field1615 = arg0.method1950(this.field1615);
            if (this.field1617 == this.field1615) {
                this.field1617--;
            }
        }
        return this;
    }
}
