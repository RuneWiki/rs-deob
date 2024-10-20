package deob;

import java.util.Iterator;

@ObfuscatedName("di")
public class class124 implements Iterator {

    @ObfuscatedName("di.q")
    public class127 field1868;

    @ObfuscatedName("di.d")
    public class128 field1867;

    @ObfuscatedName("di.h")
    public class128 field1866 = null;

    public class124(class127 arg0) {
        this.field1868 = arg0;
        this.field1867 = this.field1868.field1879.field1881;
        this.field1866 = null;
    }

    public Object next() {
        class128 var1 = this.field1867;
        if (this.field1868.field1879 == var1) {
            var1 = null;
            this.field1867 = null;
        } else {
            this.field1867 = var1.field1881;
        }
        this.field1866 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1868.field1879 != this.field1867;
    }

    public void remove() {
        if (this.field1866 == null) {
            throw new IllegalStateException();
        }
        this.field1866.method2310();
        this.field1866 = null;
    }
}
