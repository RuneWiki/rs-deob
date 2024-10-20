package deob;

import java.util.Iterator;

@ObfuscatedName("df")
public class class124 implements Iterator {

    @ObfuscatedName("df.p")
    public class127 field1869;

    @ObfuscatedName("df.g")
    public class128 field1868;

    @ObfuscatedName("df.x")
    public class128 field1870 = null;

    public class124(class127 arg0) {
        this.field1869 = arg0;
        this.field1868 = this.field1869.field1881.field1883;
        this.field1870 = null;
    }

    public Object next() {
        class128 var1 = this.field1868;
        if (this.field1869.field1881 == var1) {
            var1 = null;
            this.field1868 = null;
        } else {
            this.field1868 = var1.field1883;
        }
        this.field1870 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1869.field1881 != this.field1868;
    }

    public void remove() {
        if (this.field1870 == null) {
            throw new IllegalStateException();
        }
        this.field1870.method2225();
        this.field1870 = null;
    }
}
