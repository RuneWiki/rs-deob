package deob;

import java.util.Iterator;

@ObfuscatedName("do")
public class class124 implements Iterator {

    @ObfuscatedName("do.s")
    public class127 field1872;

    @ObfuscatedName("do.c")
    public class128 field1873;

    @ObfuscatedName("do.f")
    public class128 field1874 = null;

    public class124(class127 arg0) {
        this.field1872 = arg0;
        this.field1873 = this.field1872.field1886.field1888;
        this.field1874 = null;
    }

    public Object next() {
        class128 var1 = this.field1873;
        if (this.field1872.field1886 == var1) {
            var1 = null;
            this.field1873 = null;
        } else {
            this.field1873 = var1.field1888;
        }
        this.field1874 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1872.field1886 != this.field1873;
    }

    public void remove() {
        if (this.field1874 == null) {
            throw new IllegalStateException();
        }
        this.field1874.method2179();
        this.field1874 = null;
    }
}
