package deob;

import java.util.Iterator;

@ObfuscatedName("df")
public class class124 implements Iterator {

    @ObfuscatedName("df.k")
    public class127 field1859;

    @ObfuscatedName("df.y")
    public class128 field1858;

    @ObfuscatedName("df.o")
    public class128 field1860 = null;

    public class124(class127 arg0) {
        this.field1859 = arg0;
        this.field1858 = this.field1859.field1872.field1875;
        this.field1860 = null;
    }

    public Object next() {
        class128 var1 = this.field1858;
        if (this.field1859.field1872 == var1) {
            var1 = null;
            this.field1858 = null;
        } else {
            this.field1858 = var1.field1875;
        }
        this.field1860 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1859.field1872 != this.field1858;
    }

    public void remove() {
        if (this.field1860 == null) {
            throw new IllegalStateException();
        }
        this.field1860.method2214();
        this.field1860 = null;
    }
}
