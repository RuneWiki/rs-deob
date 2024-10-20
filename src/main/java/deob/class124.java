package deob;

import java.util.Iterator;

@ObfuscatedName("du")
public class class124 implements Iterator {

    @ObfuscatedName("du.i")
    public class127 field1862;

    @ObfuscatedName("du.e")
    public class128 field1863;

    @ObfuscatedName("du.f")
    public class128 field1864 = null;

    public class124(class127 arg0) {
        this.field1862 = arg0;
        this.field1863 = this.field1862.field1875.field1877;
        this.field1864 = null;
    }

    public Object next() {
        class128 var1 = this.field1863;
        if (this.field1862.field1875 == var1) {
            var1 = null;
            this.field1863 = null;
        } else {
            this.field1863 = var1.field1877;
        }
        this.field1864 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1862.field1875 != this.field1863;
    }

    public void remove() {
        if (this.field1864 == null) {
            throw new IllegalStateException();
        }
        this.field1864.method2200();
        this.field1864 = null;
    }
}
