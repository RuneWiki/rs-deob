package deob;

import java.util.Iterator;

@ObfuscatedName("da")
public class class124 implements Iterator {

    @ObfuscatedName("da.u")
    public class127 field1852;

    @ObfuscatedName("da.x")
    public class128 field1853;

    @ObfuscatedName("da.i")
    public class128 field1854 = null;

    public class124(class127 arg0) {
        this.field1852 = arg0;
        this.field1853 = this.field1852.field1865.field1868;
        this.field1854 = null;
    }

    public Object next() {
        class128 var1 = this.field1853;
        if (this.field1852.field1865 == var1) {
            var1 = null;
            this.field1853 = null;
        } else {
            this.field1853 = var1.field1868;
        }
        this.field1854 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1852.field1865 != this.field1853;
    }

    public void remove() {
        if (this.field1854 == null) {
            throw new IllegalStateException();
        }
        this.field1854.method2228();
        this.field1854 = null;
    }
}
