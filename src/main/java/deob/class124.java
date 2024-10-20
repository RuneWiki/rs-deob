package deob;

import java.util.Iterator;

@ObfuscatedName("du")
public class class124 implements Iterator {

    @ObfuscatedName("du.x")
    public class127 field1871;

    @ObfuscatedName("du.n")
    public class128 field1869;

    @ObfuscatedName("du.g")
    public class128 field1870 = null;

    public class124(class127 arg0) {
        this.field1871 = arg0;
        this.field1869 = this.field1871.field1883.field1885;
        this.field1870 = null;
    }

    public Object next() {
        class128 var1 = this.field1869;
        if (this.field1871.field1883 == var1) {
            var1 = null;
            this.field1869 = null;
        } else {
            this.field1869 = var1.field1885;
        }
        this.field1870 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1871.field1883 != this.field1869;
    }

    public void remove() {
        if (this.field1870 == null) {
            throw new IllegalStateException();
        }
        this.field1870.method2327();
        this.field1870 = null;
    }
}
