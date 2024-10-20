package deob;

import java.util.Iterator;

@ObfuscatedName("dt")
public class class124 implements Iterator {

    @ObfuscatedName("dt.b")
    public class127 field1863;

    @ObfuscatedName("dt.l")
    public class128 field1862;

    @ObfuscatedName("dt.i")
    public class128 field1864 = null;

    public class124(class127 arg0) {
        this.field1863 = arg0;
        this.field1862 = this.field1863.field1876.field1877;
        this.field1864 = null;
    }

    public Object next() {
        class128 var1 = this.field1862;
        if (this.field1863.field1876 == var1) {
            var1 = null;
            this.field1862 = null;
        } else {
            this.field1862 = var1.field1877;
        }
        this.field1864 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1863.field1876 != this.field1862;
    }

    public void remove() {
        if (this.field1864 == null) {
            throw new IllegalStateException();
        }
        this.field1864.method2313();
        this.field1864 = null;
    }
}
