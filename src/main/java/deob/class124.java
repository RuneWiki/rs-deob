package deob;

import java.util.Iterator;

@ObfuscatedName("dv")
public class class124 implements Iterator {

    @ObfuscatedName("dv.n")
    public class127 field1863;

    @ObfuscatedName("dv.d")
    public class128 field1864;

    @ObfuscatedName("dv.m")
    public class128 field1865 = null;

    public class124(class127 arg0) {
        this.field1863 = arg0;
        this.field1864 = this.field1863.field1876.field1878;
        this.field1865 = null;
    }

    public Object next() {
        class128 var1 = this.field1864;
        if (this.field1863.field1876 == var1) {
            var1 = null;
            this.field1864 = null;
        } else {
            this.field1864 = var1.field1878;
        }
        this.field1865 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1863.field1876 != this.field1864;
    }

    public void remove() {
        if (this.field1865 == null) {
            throw new IllegalStateException();
        }
        this.field1865.method2273();
        this.field1865 = null;
    }
}
