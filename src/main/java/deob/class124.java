package deob;

import java.util.Iterator;

@ObfuscatedName("dt")
public class class124 implements Iterator {

    @ObfuscatedName("dt.o")
    public class127 field1880;

    @ObfuscatedName("dt.m")
    public class128 field1881;

    @ObfuscatedName("dt.b")
    public class128 field1879 = null;

    public class124(class127 arg0) {
        this.field1880 = arg0;
        this.field1881 = this.field1880.field1892.field1895;
        this.field1879 = null;
    }

    public Object next() {
        class128 var1 = this.field1881;
        if (this.field1880.field1892 == var1) {
            var1 = null;
            this.field1881 = null;
        } else {
            this.field1881 = var1.field1895;
        }
        this.field1879 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1880.field1892 != this.field1881;
    }

    public void remove() {
        if (this.field1879 == null) {
            throw new IllegalStateException();
        }
        this.field1879.method2189();
        this.field1879 = null;
    }
}
