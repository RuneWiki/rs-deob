package deob;

import java.util.Iterator;

@ObfuscatedName("df")
public class class124 implements Iterator {

    @ObfuscatedName("df.b")
    public class127 field1849;

    @ObfuscatedName("df.e")
    public class128 field1850;

    @ObfuscatedName("df.c")
    public class128 field1851 = null;

    public class124(class127 arg0) {
        this.field1849 = arg0;
        this.field1850 = this.field1849.field1863.field1865;
        this.field1851 = null;
    }

    public Object next() {
        class128 var1 = this.field1850;
        if (this.field1849.field1863 == var1) {
            var1 = null;
            this.field1850 = null;
        } else {
            this.field1850 = var1.field1865;
        }
        this.field1851 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1849.field1863 != this.field1850;
    }

    public void remove() {
        if (this.field1851 == null) {
            throw new IllegalStateException();
        }
        this.field1851.method2298();
        this.field1851 = null;
    }
}
