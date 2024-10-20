package deob;

import java.util.Iterator;

@ObfuscatedName("do")
public class class124 implements Iterator {

    @ObfuscatedName("do.f")
    public class127 field1889;

    @ObfuscatedName("do.i")
    public class128 field1890;

    @ObfuscatedName("do.u")
    public class128 field1891 = null;

    public class124(class127 arg0) {
        this.field1889 = arg0;
        this.field1890 = this.field1889.field1903.field1906;
        this.field1891 = null;
    }

    public Object next() {
        class128 var1 = this.field1890;
        if (this.field1889.field1903 == var1) {
            var1 = null;
            this.field1890 = null;
        } else {
            this.field1890 = var1.field1906;
        }
        this.field1891 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1889.field1903 != this.field1890;
    }

    public void remove() {
        if (this.field1891 == null) {
            throw new IllegalStateException();
        }
        this.field1891.method2289();
        this.field1891 = null;
    }
}
